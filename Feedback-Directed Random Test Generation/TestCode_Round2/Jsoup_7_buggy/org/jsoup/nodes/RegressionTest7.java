package org.jsoup.nodes;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest7 {

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
    public void test3501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3501");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.select.Elements elements6 = document3.getElementsByIndexLessThan((int) (short) 10);
        org.jsoup.nodes.Element element8 = document3.val("");
        java.lang.String str9 = document3.outerHtml();
        org.jsoup.select.Elements elements11 = document3.getElementsByClass("#root");
        org.jsoup.select.Elements elements13 = document3.getElementsByIndexGreaterThan(10);
        java.lang.String str14 = document3.nodeName();
        org.jsoup.nodes.Element element16 = document3.prependElement("&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt;&lt;/body&gt; &lt;/html&gt;&amp;lt;html&amp;gt; &amp;lt;head&amp;gt;&amp;lt;/head&amp;gt; &amp;lt;body&amp;gt; &amp;lt;/body&amp;gt; &amp;lt;/html&amp;gt;<#root>\n <html>\n  <head></head>\n  <body></body>\n </html>\n</#root>\n<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str9, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "#document" + "'", str14, "#document");
        org.junit.Assert.assertNotNull(element16);
    }

    @Test
    public void test3502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3502");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        java.lang.String str5 = document3.className();
        org.jsoup.nodes.Element element6 = document3.lastElementSibling();
        org.jsoup.nodes.Document document7 = document3.normalise();
        org.jsoup.select.Elements elements9 = document7.getElementsByClass("\n<body></body>");
        org.jsoup.nodes.Element element10 = document7.parent();
        org.jsoup.nodes.Document document11 = document7.normalise();
        org.jsoup.select.Elements elements13 = document11.getElementsByAttribute(" <html>\n <head></head>\n <body>\n </body>\n</html>\n<html> \n <head></head> \n <body>  \n </body>\n</html>");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(document7);
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(document11);
        org.junit.Assert.assertNotNull(elements13);
    }

    @Test
    public void test3503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3503");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.select.Elements elements6 = document3.getElementsByIndexLessThan((int) (short) 10);
        org.jsoup.nodes.Element element8 = document3.val("");
        java.lang.String str9 = document3.outerHtml();
        org.jsoup.select.Elements elements11 = document3.getElementsByClass("#root");
        java.lang.String str12 = document3.tagName();
        java.lang.Integer int13 = document3.elementSiblingIndex();
        java.util.regex.Pattern pattern15 = null;
        org.jsoup.select.Elements elements16 = document3.getElementsByAttributeValueMatching("<html> <head></head> <body> </body> </html>", pattern15);
        org.jsoup.select.Elements elements19 = document3.getElementsByAttributeValue("<html> <head></head> <body> </body> </html>", "#document");
        org.jsoup.select.Elements elements21 = document3.getElementsByTag("#document");
        java.lang.String str22 = document3.nodeName();
        org.jsoup.nodes.Document.OutputSettings outputSettings23 = document3.new OutputSettings();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str9, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "#root" + "'", str12, "#root");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(elements16);
        org.junit.Assert.assertNotNull(elements19);
        org.junit.Assert.assertNotNull(elements21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "#document" + "'", str22, "#document");
    }

    @Test
    public void test3504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3504");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        java.lang.String str5 = document3.html();
        java.lang.String str6 = document3.html();
        java.util.Map<java.lang.String, java.lang.String> strMap7 = document3.dataset();
        org.jsoup.nodes.Element element9 = document3.appendText("<html>\n <head></head>\n <body>\n </body>\n</html>");
        org.jsoup.select.Elements elements12 = document3.getElementsByAttributeValueStarting("<html>\n <head></head>\n <body>\n </body>\n</html>", "<html> <head></head> <body> </body> </html>");
        org.jsoup.select.Elements elements15 = document3.getElementsByAttributeValueMatching("<html> <head></head> <body> </body> </html>", "hi!");
        org.jsoup.select.Elements elements17 = document3.getElementsByTag("hi!");
        org.jsoup.select.Elements elements19 = document3.getElementsByIndexEquals((int) (byte) 100);
        org.jsoup.nodes.Document.OutputSettings outputSettings20 = document3.new OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings22 = outputSettings20.indentAmount((int) (short) 10);
        org.jsoup.nodes.Document.OutputSettings outputSettings24 = outputSettings22.indentAmount(10);
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str5, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str6, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertNotNull(elements17);
        org.junit.Assert.assertNotNull(elements19);
        org.junit.Assert.assertNotNull(outputSettings22);
        org.junit.Assert.assertNotNull(outputSettings24);
    }

    @Test
    public void test3505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3505");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        java.lang.String str5 = document3.html();
        java.lang.String str6 = document3.html();
        document3.title("<html>\n <head></head>\n <body></body>\n</html>");
        java.util.regex.Pattern pattern10 = null;
        org.jsoup.select.Elements elements11 = document3.getElementsByAttributeValueMatching("hi!", pattern10);
        org.jsoup.nodes.Element element13 = document3.after("");
        java.lang.String str14 = document3.val();
        org.jsoup.select.Elements elements16 = document3.getElementsByIndexGreaterThan((-1));
        org.jsoup.select.Elements elements18 = document3.getElementsByAttribute("<html>\n <head></head>\n <body></body>\n</html>&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str5, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str6, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(elements16);
        org.junit.Assert.assertNotNull(elements18);
    }

    @Test
    public void test3506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3506");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.parser.Tag tag5 = document3.tag();
        org.jsoup.select.Elements elements6 = document3.children();
        org.jsoup.nodes.Attributes attributes7 = document3.attributes();
        boolean boolean9 = document3.hasAttr("<#root>\n <html>\n  <head></head>\n  <body></body>\n </html>\n</#root>\n<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.nodes.Element element11 = document3.wrap("<html>\n <head></head>\n <body>\n  &lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt;&lt;/body&gt; &lt;/html&gt;\n </body>\n</html>");
        org.jsoup.nodes.Element element13 = document3.prependElement("<html> <head></head> <body></body> </html>&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;");
        java.util.Map<java.lang.String, java.lang.String> strMap14 = document3.dataset();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(tag5);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(strMap14);
    }

    @Test
    public void test3507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3507");
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
        org.jsoup.nodes.Element element34 = document22.appendElement("<html>\n <head>\n  <title>&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;</title>\n </head>\n <body></body>\n</html>");
        org.jsoup.nodes.Element element36 = element34.addClass("<html>\n <head></head>\n <body></body>\n</html><<html>\n <head></head>\n <body></body>\n</html>&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;<<html> <head></head> <body> </body> </html>></<html> <head></head> <body> </body> </html>>></<html>\n <head></head>\n <body></body>\n</html>&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;<<html> <head></head> <body> </body> </html>></<html> <head></head> <body> </body> </html>>>");
        java.lang.String str37 = element34.baseUri();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(document11);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNotNull(document20);
        org.junit.Assert.assertNotNull(document22);
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertNotNull(elements25);
        org.junit.Assert.assertNotNull(element27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str28, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertNotNull(elements31);
        org.junit.Assert.assertNotNull(element32);
        org.junit.Assert.assertNotNull(element34);
        org.junit.Assert.assertNotNull(element36);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
    }

    @Test
    public void test3508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3508");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.select.Elements elements6 = document3.getElementsByIndexLessThan((int) (short) 10);
        java.util.Set<java.lang.String> strSet7 = document3.classNames();
        org.jsoup.select.Elements elements10 = document3.getElementsByAttributeValueNot("<html> <head></head> <body> </body> </html>", "#root");
        org.jsoup.nodes.Element element12 = document3.wrap(" html");
        org.jsoup.select.Elements elements14 = document3.getElementsByIndexEquals(2);
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertNull(element12);
        org.junit.Assert.assertNotNull(elements14);
    }

    @Test
    public void test3509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3509");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        java.lang.String str5 = document3.html();
        java.lang.String str6 = document3.html();
        java.util.Map<java.lang.String, java.lang.String> strMap7 = document3.dataset();
        org.jsoup.nodes.Element element8 = document3.head();
        org.jsoup.select.Elements elements10 = document3.getElementsByAttribute("html");
        org.jsoup.nodes.Element element12 = document3.text("<html>\n <head></head>\n <body>\n </body>\n</html>\n<html> \n <head></head> \n <body>  \n </body>\n</html>");
        org.jsoup.nodes.Element element14 = document3.toggleClass("&lt;#root value=&quot;&quot; class=&quot;&quot;&gt; &lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt;&lt;/body&gt; &lt;/html&gt; &lt;/#root&gt;\n<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str5, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str6, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(element14);
    }

    @Test
    public void test3510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3510");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.select.Elements elements6 = document3.getElementsByIndexLessThan((int) (short) 10);
        org.jsoup.nodes.Element element8 = document3.val("");
        java.lang.String str9 = document3.outerHtml();
        org.jsoup.select.Elements elements11 = document3.getElementsByClass("#root");
        org.jsoup.select.Elements elements13 = document3.getElementsByIndexGreaterThan(10);
        org.jsoup.nodes.Element element15 = document3.text("<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.select.Elements elements17 = element15.getElementsByAttribute("hi!");
        boolean boolean18 = element15.isBlock();
        org.jsoup.nodes.Element element20 = element15.wrap("<html>\n <head></head>\n <body>\n </body>\n</html>");
        element20.setBaseUri("<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.nodes.Element element24 = element20.prepend(" hi!");
        org.jsoup.nodes.Document document26 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document28 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element29 = document26.prependChild((org.jsoup.nodes.Node) document28);
        org.jsoup.select.Elements elements31 = document28.getElementsByIndexLessThan((int) (short) 10);
        org.jsoup.nodes.Element element33 = document28.val("");
        java.lang.String str34 = document28.outerHtml();
        org.jsoup.select.Elements elements36 = document28.getElementsByClass("#root");
        org.jsoup.select.Elements elements38 = document28.getElementsByIndexGreaterThan(10);
        java.lang.Integer int39 = document28.elementSiblingIndex();
        org.jsoup.select.Elements elements40 = document28.getAllElements();
        org.jsoup.parser.Tag tag41 = document28.tag();
        org.jsoup.nodes.Element element42 = element20.prependChild((org.jsoup.nodes.Node) document28);
        org.jsoup.select.Elements elements43 = element42.children();
        java.lang.String str45 = element42.attr("<html>\n <head></head>\n <body></body>\n</html><hi!></hi!>");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str9, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(elements17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertNotNull(element24);
        org.junit.Assert.assertNotNull(document26);
        org.junit.Assert.assertNotNull(document28);
        org.junit.Assert.assertNotNull(element29);
        org.junit.Assert.assertNotNull(elements31);
        org.junit.Assert.assertNotNull(element33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str34, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertNotNull(elements36);
        org.junit.Assert.assertNotNull(elements38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNotNull(elements40);
        org.junit.Assert.assertNotNull(tag41);
        org.junit.Assert.assertNotNull(element42);
        org.junit.Assert.assertNotNull(elements43);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
    }

    @Test
    public void test3511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3511");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.select.Elements elements6 = document3.getElementsByIndexLessThan((int) (short) 10);
        org.jsoup.nodes.Element element8 = document3.val("");
        org.jsoup.nodes.Element element10 = document3.after("#root");
        org.jsoup.nodes.Document document11 = document3.ownerDocument();
        org.jsoup.nodes.Element element14 = document3.attr("#root", "<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.select.Elements elements16 = document3.getElementsContainingOwnText("#document");
        org.jsoup.nodes.Attributes attributes17 = document3.attributes();
        org.jsoup.select.Elements elements19 = document3.getElementsByIndexGreaterThan((int) (byte) 100);
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(document11);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(elements16);
        org.junit.Assert.assertNotNull(attributes17);
        org.junit.Assert.assertNotNull(elements19);
    }

    @Test
    public void test3512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3512");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        java.lang.String str5 = document3.className();
        org.jsoup.nodes.Element element7 = document3.toggleClass("#root");
        org.jsoup.nodes.Element element9 = document3.val("<head></head>\n<body></body>");
        boolean boolean11 = document3.hasClass("<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.nodes.Node node13 = document3.removeAttr("#document <html> <head></head> <body></body> </html>");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(node13);
    }

    @Test
    public void test3513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3513");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.nodes.Element element5 = document3.head();
        java.lang.String str6 = document3.baseUri();
        org.jsoup.nodes.Element element8 = document3.before("<#root class=\" html\" value=\"&lt;html&gt;\n &lt;head&gt;&lt;/head&gt;\n &lt;body&gt;&lt;/body&gt;\n&lt;/html&gt;&amp;lt;html&amp;gt; &amp;lt;head&amp;gt;&amp;lt;/head&amp;gt; &amp;lt;body&amp;gt; &amp;lt;/body&amp;gt; &amp;lt;/html&amp;gt;\">\n <html>\n  <head></head>\n  <body></body>\n </html>&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;\n</#root>\n<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.nodes.Element element10 = element8.html("html");
        org.jsoup.select.Elements elements13 = element8.getElementsByAttributeValueStarting("\n<head>\n #document \n <html> \n  <head></head> \n  <body> &lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;\n  </body>\n </html>\n</head>", "<html>\n <head>\n  <title>#document</title>\n </head>\n <body>\n  &lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt;&lt;/body&gt; &lt;/html&gt;&amp;lt;html&amp;gt; &amp;lt;head&amp;gt;&amp;lt;/head&amp;gt; &amp;lt;body&amp;gt; &amp;lt;/body&amp;gt; &amp;lt;/html&amp;gt;\n </body>\n</html><hi!></hi!>");
        org.jsoup.select.Elements elements15 = element8.getElementsMatchingOwnText("hi!");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertNotNull(elements15);
    }

    @Test
    public void test3514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3514");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("<hi! <html>\n <head></head>\n <body></body>\n</html>=\"&lt;html&gt;\n &lt;head&gt;&lt;/head&gt;\n &lt;body&gt;\n &lt;/body&gt;\n&lt;/html&gt;\"></hi!>&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt;&lt;/body&gt; &lt;/html&gt;");
        boolean boolean3 = document1.hasClass("&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt; &lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;#document\n<html>\n <head></head>\n <body></body>\n</html><hi!></hi!>");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test3515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3515");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.select.Elements elements6 = document3.getElementsByIndexLessThan((int) (short) 10);
        org.jsoup.nodes.Element element8 = document3.val("");
        java.lang.String str9 = document3.outerHtml();
        org.jsoup.select.Elements elements12 = document3.getElementsByAttributeValueStarting("#root", "<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.select.Elements elements13 = document3.parents();
        boolean boolean14 = document3.hasText();
        org.jsoup.nodes.Document document16 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document18 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element19 = document16.prependChild((org.jsoup.nodes.Node) document18);
        org.jsoup.nodes.Element element20 = document3.appendChild((org.jsoup.nodes.Node) document16);
        org.jsoup.nodes.Element element22 = document16.text("<html>\n <head>\n  <title>&lt;html&gt;\n &lt;head&gt;&lt;/head&gt;\n &lt;body&gt;&lt;/body&gt;\n&lt;/html&gt;</title>\n </head>\n <body></body>\n</html>");
        org.jsoup.select.Elements elements24 = document16.getElementsByIndexLessThan((int) '#');
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str9, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(document16);
        org.junit.Assert.assertNotNull(document18);
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertNotNull(elements24);
    }

    @Test
    public void test3516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3516");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.select.Elements elements6 = document3.getElementsByIndexLessThan((int) (short) 10);
        org.jsoup.nodes.Element element8 = document3.val("");
        org.jsoup.nodes.Element element10 = document3.after("#root");
        org.jsoup.nodes.Document document11 = document3.ownerDocument();
        boolean boolean13 = document11.hasAttr("#root");
        boolean boolean14 = document11.hasText();
        org.jsoup.nodes.Node node15 = document11.nextSibling();
        org.jsoup.nodes.Attributes attributes16 = node15.attributes();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(document11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNotNull(attributes16);
    }

    @Test
    public void test3517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3517");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.nodes.Element element5 = document3.head();
        org.jsoup.nodes.Document.OutputSettings outputSettings6 = document3.outputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = outputSettings6.indentAmount((int) ' ');
        java.nio.charset.Charset charset9 = outputSettings8.charset();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(outputSettings6);
        org.junit.Assert.assertNotNull(outputSettings8);
        org.junit.Assert.assertNotNull(charset9);
    }

    @Test
    public void test3518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3518");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        java.lang.String str5 = document3.nodeName();
        org.jsoup.nodes.Element element7 = document3.before("<html> <head></head> <body></body> </html>");
        org.jsoup.nodes.Document document8 = document3.normalise();
        org.jsoup.select.Elements elements10 = document8.getElementsByTag("<<html>\n <head></head>\n <body></body>\n</html>&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;<<html> <head></head> <body> </body> </html>></<html> <head></head> <body> </body> </html>>></<html>\n <head></head>\n <body></body>\n</html>&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;<<html> <head></head> <body> </body> </html>></<html> <head></head> <body> </body> </html>>>");
        org.jsoup.nodes.Document document12 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document14 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element15 = document12.prependChild((org.jsoup.nodes.Node) document14);
        org.jsoup.select.Elements elements17 = document14.getElementsByIndexLessThan((int) (short) 10);
        org.jsoup.nodes.Element element19 = document14.val("");
        org.jsoup.nodes.Element element21 = document14.after("#root");
        org.jsoup.select.Elements elements24 = document14.getElementsByAttributeValueMatching("<html>\n <head></head>\n <body></body>\n</html>&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;", "<html>\n <head></head>\n <body></body>\n</html>&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;");
        org.jsoup.nodes.Document.OutputSettings outputSettings25 = document14.outputSettings();
        java.lang.String str27 = document14.attr("&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt;&lt;/body&gt; &lt;/html&gt;&amp;lt;html&amp;gt; &amp;lt;head&amp;gt;&amp;lt;/head&amp;gt; &amp;lt;body&amp;gt; &amp;lt;/body&amp;gt; &amp;lt;/html&amp;gt;<#root>\n <html>\n  <head></head>\n  <body></body>\n </html>\n</#root>\n<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.nodes.Element element28 = document8.prependChild((org.jsoup.nodes.Node) document14);
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#document" + "'", str5, "#document");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(document8);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertNotNull(document12);
        org.junit.Assert.assertNotNull(document14);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(elements17);
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertNotNull(elements24);
        org.junit.Assert.assertNotNull(outputSettings25);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(element28);
    }

    @Test
    public void test3519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3519");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        java.lang.String str5 = document3.className();
        org.jsoup.nodes.Element element7 = document3.toggleClass("#root");
        org.jsoup.select.Elements elements9 = document3.getElementsByClass("<html>\n <head></head>\n <body>\n </body>\n</html>\n<html> \n <head></head> \n <body>  \n </body>\n</html>");
        java.util.regex.Pattern pattern10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements11 = document3.getElementsMatchingText(pattern10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(elements9);
    }

    @Test
    public void test3520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3520");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.select.Elements elements6 = document3.getElementsByIndexLessThan((int) (short) 10);
        org.jsoup.nodes.Element element8 = document3.val("");
        java.lang.String str9 = document3.outerHtml();
        org.jsoup.select.Elements elements11 = document3.getElementsByClass("#root");
        org.jsoup.select.Elements elements13 = document3.getElementsByIndexGreaterThan(10);
        org.jsoup.nodes.Element element15 = document3.text("<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.select.Elements elements18 = element15.getElementsByAttributeValueStarting("<html>\n <head></head>\n <body></body>\n</html>", "<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.select.Elements elements19 = element15.siblingElements();
        org.jsoup.nodes.Element element21 = element15.appendText("<html>\n <head></head>\n <body></body>\n</html>\n<html> \n <head></head> \n <body>   \n  <html> \n   <head></head> \n   <body>  \n   </body>\n  </html>\n </body>\n</html>");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str9, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(elements18);
        org.junit.Assert.assertNotNull(elements19);
        org.junit.Assert.assertNotNull(element21);
    }

    @Test
    public void test3521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3521");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.select.Elements elements6 = document3.getElementsByIndexLessThan((int) (short) 10);
        org.jsoup.nodes.Element element8 = document3.val("");
        org.jsoup.nodes.Element element10 = document3.after("#root");
        org.jsoup.nodes.Document document11 = document3.ownerDocument();
        org.jsoup.nodes.Element element14 = document3.attr("#root", "<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.select.Elements elements15 = element14.siblingElements();
        org.jsoup.nodes.Element element17 = element14.before("<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.nodes.Element element19 = element17.addClass("\n<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.select.Elements elements20 = element19.siblingElements();
        org.jsoup.nodes.Element element21 = element19.nextElementSibling();
        element21.setBaseUri(" hi!  hi!");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(document11);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertNotNull(elements20);
        org.junit.Assert.assertNotNull(element21);
    }

    @Test
    public void test3522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3522");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        java.lang.String str5 = document3.html();
        java.lang.String str6 = document3.html();
        document3.title("<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.nodes.Element element10 = document3.prependText("<html> <head></head> <body></body> </html>");
        org.jsoup.nodes.Element element12 = document3.text("hi!");
        org.jsoup.select.Elements elements15 = document3.getElementsByAttributeValueNot(" <html>\n <head></head>\n <body>\n </body>\n</html>\n<html> \n <head></head> \n <body>  \n </body>\n</html>", " hi!  hi!");
        org.jsoup.nodes.Element element17 = document3.toggleClass("<<html>\n <head></head>\n <body>\n </body>\n</html>\n<html> \n <head></head> \n <body>  \n </body>\n</html>></<html>\n <head></head>\n <body>\n </body>\n</html>\n<html> \n <head></head> \n <body>  \n </body>\n</html>>");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str5, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str6, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertNotNull(element17);
    }

    @Test
    public void test3523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3523");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.nodes.Element element5 = document3.head();
        org.jsoup.nodes.Document.OutputSettings outputSettings6 = document3.outputSettings();
        org.jsoup.nodes.Document document8 = org.jsoup.nodes.Document.createShell("#root");
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = document8.outputSettings();
        java.nio.charset.Charset charset10 = outputSettings9.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings12 = outputSettings9.prettyPrint(false);
        org.jsoup.nodes.Entities.EscapeMode escapeMode13 = outputSettings12.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings14 = outputSettings6.escapeMode(escapeMode13);
        boolean boolean15 = outputSettings6.prettyPrint();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document.OutputSettings outputSettings17 = outputSettings6.charset("<#root></#root>\n<html>\n <head></head>\n <body></body>\n</html>");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: <#root></#root>?<html>? <head></head>? <body></body>?</html>");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(outputSettings6);
        org.junit.Assert.assertNotNull(document8);
        org.junit.Assert.assertNotNull(outputSettings9);
        org.junit.Assert.assertNotNull(charset10);
        org.junit.Assert.assertNotNull(outputSettings12);
        org.junit.Assert.assertTrue("'" + escapeMode13 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode13.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test3524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3524");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("#root");
        org.jsoup.nodes.Document.OutputSettings outputSettings2 = document1.outputSettings();
        org.jsoup.nodes.Node node3 = document1.nextSibling();
        org.jsoup.nodes.Element element4 = document1.head();
        org.jsoup.nodes.Element element6 = document1.prepend("html");
        document1.title("<html>\n <head></head>\n <body></body>\n</html>&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(outputSettings2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element6);
    }

    @Test
    public void test3525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3525");
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
        boolean boolean18 = document3.isBlock();
        org.jsoup.select.Elements elements20 = document3.getElementsMatchingText("<html>\n <head></head>\n <body></body>\n</html>&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;");
        document3.title("<html>\n <head></head>\n <body></body>\n</html><<html>\n <head></head>\n <body></body>\n</html>&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;<<html> <head></head> <body> </body> </html>></<html> <head></head> <body> </body> </html>>></<html>\n <head></head>\n <body></body>\n</html>&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;<<html> <head></head> <body> </body> </html>></<html> <head></head> <body> </body> </html>>>");
        org.jsoup.nodes.Document document24 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document26 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element27 = document24.prependChild((org.jsoup.nodes.Node) document26);
        java.lang.String str28 = document26.html();
        java.lang.String str29 = document26.html();
        org.jsoup.nodes.Document document31 = org.jsoup.nodes.Document.createShell("");
        java.util.Set<java.lang.String> strSet32 = document31.classNames();
        org.jsoup.nodes.Element element33 = document26.classNames(strSet32);
        org.jsoup.nodes.Element element35 = document26.removeClass("<html>\n <head></head>\n <body>\n </body>\n</html>");
        org.jsoup.nodes.Element element36 = document26.previousElementSibling();
        org.jsoup.nodes.Element element37 = document26.body();
        java.util.Set<java.lang.String> strSet38 = document26.classNames();
        org.jsoup.nodes.Element element39 = document3.classNames(strSet38);
        org.jsoup.select.Elements elements42 = element39.getElementsByAttributeValueContaining("<html>\n <head></head>\n <body></body>\n</html><#root value=\"\">\n <#document></#document>\n <html>\n  <head></head>\n  <body></body>\n </html>\n</#root>", "head");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str5, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str6, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(elements17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(elements20);
        org.junit.Assert.assertNotNull(document24);
        org.junit.Assert.assertNotNull(document26);
        org.junit.Assert.assertNotNull(element27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str28, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str29, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertNotNull(document31);
        org.junit.Assert.assertNotNull(strSet32);
        org.junit.Assert.assertNotNull(element33);
        org.junit.Assert.assertNotNull(element35);
        org.junit.Assert.assertNull(element36);
        org.junit.Assert.assertNotNull(element37);
        org.junit.Assert.assertNotNull(strSet38);
        org.junit.Assert.assertNotNull(element39);
        org.junit.Assert.assertNotNull(elements42);
    }

    @Test
    public void test3526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3526");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        java.lang.String str5 = document3.html();
        java.lang.String str6 = document3.html();
        java.util.Map<java.lang.String, java.lang.String> strMap7 = document3.dataset();
        org.jsoup.nodes.Element element9 = document3.appendElement("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList10 = element9.childNodes();
        org.jsoup.nodes.Element element13 = element9.attr("<html>\n <head></head>\n <body></body>\n</html>", "<html>\n <head></head>\n <body>\n </body>\n</html>");
        org.jsoup.nodes.Element element15 = element13.prependText("hi!");
        java.lang.String str16 = element13.className();
        org.jsoup.nodes.Node node18 = element13.removeAttr("<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.nodes.Element element20 = element13.before("hi!");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str5, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str6, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertNotNull(element20);
    }

    @Test
    public void test3527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3527");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.parser.Tag tag5 = document3.tag();
        org.jsoup.select.Elements elements6 = document3.children();
        org.jsoup.nodes.Attributes attributes7 = document3.attributes();
        org.jsoup.select.Elements elements9 = document3.getElementsByClass("\n<body></body>");
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = document3.outputSettings();
        java.lang.String str11 = document3.className();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(tag5);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertNotNull(outputSettings10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test3528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3528");
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
        org.jsoup.nodes.Element element17 = document3.text("<html>\n <head></head>\n <body></body>\n</html>");
        document3.title("<html>\n <head></head>\n <body></body>\n</html>&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;");
        document3.remove();
        org.jsoup.nodes.Element element22 = document3.removeClass("hi!");
        org.jsoup.nodes.Document document23 = element22.ownerDocument();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str5, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str6, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;" + "'", str13, "<html>\n <head></head>\n <body></body>\n</html>&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;");
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertNotNull(document23);
    }

    @Test
    public void test3529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3529");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        java.lang.String str5 = document3.html();
        java.lang.String str6 = document3.html();
        java.util.Map<java.lang.String, java.lang.String> strMap7 = document3.dataset();
        org.jsoup.nodes.Element element9 = document3.appendElement("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList10 = element9.childNodes();
        org.jsoup.nodes.Element element13 = element9.attr("<html>\n <head></head>\n <body></body>\n</html>", "<html>\n <head></head>\n <body>\n </body>\n</html>");
        org.jsoup.nodes.Element element15 = element13.prependText("hi!");
        java.lang.String str16 = element13.className();
        org.jsoup.select.Elements elements19 = element13.getElementsByAttributeValueContaining("<html> <head></head> <body></body> </html>", "<html>\n <head></head>\n <body>\n </body>\n</html>");
        boolean boolean21 = element13.hasAttr("<html> <head></head> <body></body> </html>");
        org.jsoup.select.Elements elements23 = element13.getElementsByIndexLessThan(1);
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str5, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str6, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(elements19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(elements23);
    }

    @Test
    public void test3530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3530");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        java.lang.String str5 = document3.html();
        java.lang.String str6 = document3.html();
        document3.title("<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.select.Elements elements9 = document3.getAllElements();
        org.jsoup.nodes.Element element11 = document3.html("");
        org.jsoup.nodes.Element element13 = document3.appendElement("<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.select.Elements elements15 = document3.getElementsByAttributeStarting("#root");
        org.jsoup.select.Elements elements17 = document3.getElementsByIndexGreaterThan(3);
        org.jsoup.select.Elements elements19 = document3.getElementsMatchingOwnText("<html>\n <head></head>\n <body></body>\n</html>\n<html> \n <head> \n  <title>&lt;html&gt;\n &lt;head&gt;&lt;/head&gt;\n &lt;body&gt;&lt;/body&gt;\n&lt;/html&gt;</title> \n </head> \n <body> \n </body>\n</html>");
        org.jsoup.nodes.Element element21 = document3.val("<html>\n <head></head>\n <body>\n  &lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt; &lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;\n </body>\n</html>\n<html> \n <head></head> \n <body>  \n </body>\n</html>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements23 = document3.select("<html>\n <head></head>\n <body></body>\n</html>");
            org.junit.Assert.fail("Expected exception of type org.jsoup.select.Selector.SelectorParseException; message: Could not parse query '<html>? <head></head>? <body></body>?</html>': unexpected token at '<html>? <head></head>? <body></body>?</html>'");
        } catch (org.jsoup.select.Selector.SelectorParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str5, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str6, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertNotNull(elements17);
        org.junit.Assert.assertNotNull(elements19);
        org.junit.Assert.assertNotNull(element21);
    }

    @Test
    public void test3531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3531");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.nodes.Element element5 = document1.body();
        org.jsoup.select.Elements elements7 = document1.select("#root");
        org.jsoup.nodes.Element element8 = document1.empty();
        org.jsoup.select.Elements elements10 = element8.getElementsByIndexLessThan((int) (byte) 1);
        boolean boolean11 = element8.hasText();
        org.jsoup.nodes.Element element13 = element8.html("&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt; &lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;#document\n<html>\n <head></head>\n <body></body>\n</html><hi!></hi!>");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(element13);
    }

    @Test
    public void test3532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3532");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.select.Elements elements6 = document3.getElementsByIndexLessThan((int) (short) 10);
        org.jsoup.nodes.Element element8 = document3.val("");
        org.jsoup.nodes.Element element10 = element8.val("hi!");
        org.jsoup.select.Elements elements11 = element8.siblingElements();
        org.jsoup.nodes.Element element13 = element8.prepend("");
        java.lang.String str14 = element13.baseUri();
        org.jsoup.nodes.Element element15 = element13.lastElementSibling();
        org.jsoup.select.Elements elements17 = element13.getElementsByIndexGreaterThan(0);
        java.util.regex.Pattern pattern18 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements19 = element13.getElementsMatchingText(pattern18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(elements17);
    }

    @Test
    public void test3533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3533");
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
        org.jsoup.nodes.Element element21 = document3.prepend("");
        org.jsoup.nodes.Attributes attributes22 = document3.attributes();
        java.util.List<org.jsoup.nodes.Node> nodeList23 = document3.childNodes();
        org.jsoup.nodes.Element element25 = document3.removeClass("");
        java.lang.Class<?> wildcardClass26 = document3.getClass();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str9, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "#document" + "'", str17, "#document");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertNotNull(attributes22);
        org.junit.Assert.assertNotNull(nodeList23);
        org.junit.Assert.assertNotNull(element25);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test3534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3534");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        java.lang.String str5 = document3.html();
        java.lang.String str6 = document3.html();
        java.util.Map<java.lang.String, java.lang.String> strMap7 = document3.dataset();
        org.jsoup.nodes.Element element9 = document3.appendText("<html>\n <head></head>\n <body>\n </body>\n</html>");
        org.jsoup.select.Elements elements12 = document3.getElementsByAttributeValueStarting("<html>\n <head></head>\n <body>\n </body>\n</html>", "<html> <head></head> <body> </body> </html>");
        org.jsoup.nodes.Element element14 = document3.appendElement("<html> <head></head> <body> </body> </html>");
        java.lang.String str15 = document3.toString();
        java.util.Map<java.lang.String, java.lang.String> strMap16 = document3.dataset();
        java.lang.String str17 = document3.tagName();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str5, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str6, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;<<html> <head></head> <body> </body> </html>></<html> <head></head> <body> </body> </html>>" + "'", str15, "<html>\n <head></head>\n <body></body>\n</html>&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;<<html> <head></head> <body> </body> </html>></<html> <head></head> <body> </body> </html>>");
        org.junit.Assert.assertNotNull(strMap16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "#root" + "'", str17, "#root");
    }

    @Test
    public void test3535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3535");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        java.lang.String str5 = document3.html();
        java.lang.String str6 = document3.html();
        java.util.Map<java.lang.String, java.lang.String> strMap7 = document3.dataset();
        org.jsoup.nodes.Element element9 = document3.appendElement("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList10 = element9.childNodes();
        org.jsoup.nodes.Element element13 = element9.attr("<html>\n <head></head>\n <body></body>\n</html>", "<html>\n <head></head>\n <body>\n </body>\n</html>");
        org.jsoup.nodes.Element element15 = element13.prependText("hi!");
        org.jsoup.nodes.Document document17 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document19 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element20 = document17.prependChild((org.jsoup.nodes.Node) document19);
        org.jsoup.parser.Tag tag21 = document19.tag();
        org.jsoup.nodes.Element element23 = document19.createElement("<html>\n <head></head>\n <body></body>\n</html>");
        document19.setBaseUri("");
        java.lang.String[] strArray27 = new java.lang.String[] { "#root" };
        java.util.LinkedHashSet<java.lang.String> strSet28 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet28, strArray27);
        org.jsoup.nodes.Element element30 = document19.classNames((java.util.Set<java.lang.String>) strSet28);
        org.jsoup.nodes.Element element31 = element15.classNames((java.util.Set<java.lang.String>) strSet28);
        org.jsoup.select.Elements elements32 = element15.parents();
        org.jsoup.nodes.Element element34 = element15.prepend("");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str5, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str6, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(document17);
        org.junit.Assert.assertNotNull(document19);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertNotNull(tag21);
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertArrayEquals(strArray27, new java.lang.String[] { "#root" });
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(element30);
        org.junit.Assert.assertNotNull(element31);
        org.junit.Assert.assertNotNull(elements32);
        org.junit.Assert.assertNotNull(element34);
    }

    @Test
    public void test3536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3536");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.select.Elements elements6 = document3.getElementsByIndexLessThan((int) (short) 10);
        org.jsoup.nodes.Element element8 = document3.val("");
        java.lang.String str9 = document3.text();
        org.jsoup.nodes.Element element11 = document3.addClass("<html> <head> <title>&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt;&lt;/body&gt; &lt;/html&gt;</title> </head> <body></body> </html>");
        org.jsoup.select.Elements elements14 = element11.getElementsByAttributeValueNot(" hi!", "<html>\n <head></head>\n <body>\n </body>\n</html>");
        boolean boolean15 = element11.hasText();
        org.jsoup.nodes.Element element17 = element11.addClass("<html>\n <head>\n  <title>&lt;html&gt;\n &lt;head&gt;&lt;/head&gt;\n &lt;body&gt;&lt;/body&gt;\n&lt;/html&gt;</title>\n </head>\n <body></body>\n</html>");
        org.jsoup.nodes.Element element19 = element17.wrap("<#root class=\" html\" value=\"&lt;html&gt;\n &lt;head&gt;&lt;/head&gt;\n &lt;body&gt;&lt;/body&gt;\n&lt;/html&gt;&amp;lt;html&amp;gt; &amp;lt;head&amp;gt;&amp;lt;/head&amp;gt; &amp;lt;body&amp;gt; &amp;lt;/body&amp;gt; &amp;lt;/html&amp;gt;\">\n <html>\n  <head></head>\n  <body></body>\n </html>&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;\n</#root>\n<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(elements14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(element19);
    }

    @Test
    public void test3537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3537");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.select.Elements elements6 = document3.getElementsByIndexLessThan((int) (short) 10);
        org.jsoup.nodes.Element element8 = document3.val("");
        org.jsoup.nodes.Element element10 = document3.after("#root");
        org.jsoup.nodes.Document document11 = document3.ownerDocument();
        org.jsoup.nodes.Element element14 = document3.attr("#root", "<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.nodes.Document document15 = element14.ownerDocument();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(document11);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(document15);
    }

    @Test
    public void test3538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3538");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element2 = document1.body();
        org.jsoup.nodes.Element element3 = document1.head();
        org.jsoup.nodes.Document document5 = new org.jsoup.nodes.Document("hi!");
        java.lang.String str6 = document5.tagName();
        org.jsoup.nodes.Element element8 = document5.prependElement("<html>\n <head></head>\n <body></body>\n</html>&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;<<html> <head></head> <body> </body> </html>></<html> <head></head> <body> </body> </html>>");
        org.jsoup.select.Elements elements11 = document5.getElementsByAttributeValueEnding("\n<body></body>", " html");
        org.jsoup.nodes.Element element12 = document1.prependChild((org.jsoup.nodes.Node) document5);
        org.jsoup.nodes.Document document14 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document16 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element17 = document14.prependChild((org.jsoup.nodes.Node) document16);
        org.jsoup.nodes.Element element19 = document14.removeClass("<#root value=\"&lt;html&gt;\n &lt;head&gt;&lt;/head&gt;\n &lt;body&gt;&lt;/body&gt;\n&lt;/html&gt;\">\n <html>\n  <head></head>\n  <body></body>\n </html>\n</#root>#root\n<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.nodes.Element element20 = element12.appendChild((org.jsoup.nodes.Node) element19);
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(element2);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "#root" + "'", str6, "#root");
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(document14);
        org.junit.Assert.assertNotNull(document16);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertNotNull(element20);
    }

    @Test
    public void test3539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3539");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.select.Elements elements6 = document3.getElementsByIndexLessThan((int) (short) 10);
        org.jsoup.nodes.Element element8 = document3.val("");
        org.jsoup.nodes.Element element10 = document3.after("#root");
        org.jsoup.nodes.Document document11 = document3.ownerDocument();
        org.jsoup.nodes.Element element14 = document3.attr("#root", "<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.select.Elements elements15 = element14.siblingElements();
        org.jsoup.nodes.Element element17 = element14.before("");
        boolean boolean18 = element14.isBlock();
        org.jsoup.nodes.Document document19 = element14.ownerDocument();
        org.jsoup.nodes.Element element20 = document19.empty();
        org.jsoup.nodes.Element element21 = element20.lastElementSibling();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(document11);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(document19);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertNotNull(element21);
    }

    @Test
    public void test3540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3540");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.nodes.Element element5 = document1.body();
        org.jsoup.select.Elements elements7 = element5.getElementsByIndexGreaterThan((int) (byte) -1);
        java.lang.String str8 = element5.data();
        org.jsoup.select.Elements elements10 = element5.getElementsByIndexLessThan((int) (short) 0);
        org.jsoup.nodes.Document document12 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document14 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element15 = document12.prependChild((org.jsoup.nodes.Node) document14);
        org.jsoup.select.Elements elements17 = document14.getElementsByIndexLessThan((int) (short) 10);
        org.jsoup.nodes.Element element19 = document14.val("");
        org.jsoup.nodes.Element element21 = document14.after("#root");
        org.jsoup.nodes.Document document22 = document14.ownerDocument();
        org.jsoup.nodes.Element element25 = document14.attr("#root", "<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.select.Elements elements27 = document14.getElementsContainingOwnText("#document");
        org.jsoup.nodes.Element element28 = document14.lastElementSibling();
        org.jsoup.nodes.Element element30 = element28.removeClass("#document");
        org.jsoup.nodes.Document document32 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document34 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element35 = document32.prependChild((org.jsoup.nodes.Node) document34);
        org.jsoup.nodes.Element element36 = document32.body();
        org.jsoup.select.Elements elements39 = element36.getElementsByAttributeValueStarting("hi!", "hi!");
        org.jsoup.select.Elements elements41 = element36.getElementsByAttributeStarting("#root");
        java.util.Set<java.lang.String> strSet42 = element36.classNames();
        org.jsoup.nodes.Element element43 = element28.classNames(strSet42);
        org.jsoup.nodes.Node node45 = element28.removeAttr("<html>\n <head></head>\n <body>\n  &lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt; &lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;\n </body>\n</html>\n<html> \n <head></head> \n <body>  \n </body>\n</html>");
        org.jsoup.nodes.Element element46 = element5.appendChild((org.jsoup.nodes.Node) element28);
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertNotNull(document12);
        org.junit.Assert.assertNotNull(document14);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(elements17);
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertNotNull(document22);
        org.junit.Assert.assertNotNull(element25);
        org.junit.Assert.assertNotNull(elements27);
        org.junit.Assert.assertNotNull(element28);
        org.junit.Assert.assertNotNull(element30);
        org.junit.Assert.assertNotNull(document32);
        org.junit.Assert.assertNotNull(document34);
        org.junit.Assert.assertNotNull(element35);
        org.junit.Assert.assertNotNull(element36);
        org.junit.Assert.assertNotNull(elements39);
        org.junit.Assert.assertNotNull(elements41);
        org.junit.Assert.assertNotNull(strSet42);
        org.junit.Assert.assertNotNull(element43);
        org.junit.Assert.assertNotNull(node45);
        org.junit.Assert.assertNotNull(element46);
    }

    @Test
    public void test3541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3541");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.select.Elements elements6 = document3.getElementsByIndexLessThan((int) (short) 10);
        org.jsoup.nodes.Element element8 = document3.val("");
        java.lang.String str9 = document3.outerHtml();
        org.jsoup.select.Elements elements11 = document3.getElementsByClass("#root");
        java.lang.String str12 = document3.tagName();
        org.jsoup.select.Elements elements13 = document3.getAllElements();
        org.jsoup.nodes.Document document15 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document17 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element18 = document15.prependChild((org.jsoup.nodes.Node) document17);
        java.lang.String str19 = document17.html();
        java.lang.String str20 = document17.html();
        document17.title("<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.select.Elements elements23 = document17.getAllElements();
        boolean boolean24 = document3.equals((java.lang.Object) elements23);
        boolean boolean26 = document3.hasAttr("<html>\n <head></head>\n <body>\n </body>\n</html>");
        org.jsoup.nodes.Element element28 = document3.prependElement("#document");
        org.jsoup.nodes.Element element30 = element28.before("#document <html> <head></head> <body></body> </html>&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;");
        org.jsoup.nodes.Element element31 = element30.parent();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str9, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "#root" + "'", str12, "#root");
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertNotNull(document15);
        org.junit.Assert.assertNotNull(document17);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str19, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str20, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertNotNull(elements23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(element28);
        org.junit.Assert.assertNotNull(element30);
        org.junit.Assert.assertNotNull(element31);
    }

    @Test
    public void test3542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3542");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        java.lang.String str5 = document3.html();
        java.lang.String str6 = document3.html();
        org.jsoup.nodes.Document document8 = org.jsoup.nodes.Document.createShell("");
        java.util.Set<java.lang.String> strSet9 = document8.classNames();
        org.jsoup.nodes.Element element10 = document3.classNames(strSet9);
        org.jsoup.nodes.Document document11 = document3.normalise();
        org.jsoup.nodes.Element element12 = document11.head();
        java.lang.String str13 = element12.val();
        boolean boolean15 = element12.hasAttr("<html> <head></head> <body> </body> </html>");
        org.jsoup.select.Elements elements17 = element12.getElementsByAttribute("<html>\n <head></head>\n <body>\n  &lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt; &lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;\n </body>\n</html>\n<html> \n <head></head> \n <body>  \n </body>\n</html>");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str5, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str6, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertNotNull(document8);
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(document11);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(elements17);
    }

    @Test
    public void test3543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3543");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.parser.Tag tag5 = document3.tag();
        org.jsoup.nodes.Element element7 = document3.addClass("");
        org.jsoup.nodes.Element element9 = document3.before("<html>\n <head></head>\n <body>\n  &lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt; \n </body>\n</html><<html> <head></head> <body> </body> </html>></<html> <head></head> <body> </body> </html>>");
        org.jsoup.select.Elements elements11 = element9.getElementsByAttribute("<html>\n <head>\n  <title>&lt;html&gt;\n &lt;head&gt;&lt;/head&gt;\n &lt;body&gt;&lt;/body&gt;\n&lt;/html&gt;</title>\n </head>\n <body></body>\n</html>");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(tag5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(elements11);
    }

    @Test
    public void test3544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3544");
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
        org.jsoup.nodes.Element element27 = element24.attr("<html>\n <head></head>\n <body></body>\n</html>", "<html>\n <head></head>\n <body></body>\n</html>&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;<<html> <head></head> <body> </body> </html>></<html> <head></head> <body> </body> </html>>");
        org.jsoup.select.Elements elements30 = element27.getElementsByAttributeValue("<#document></#document>\n<html>\n <head>\n  <title>#document</title>\n </head>\n <body>\n  &lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt;&lt;/body&gt; &lt;/html&gt;\n </body>\n</html><hi!></hi!>", " hi!  hi!");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(document13);
        org.junit.Assert.assertNotNull(document15);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(elements20);
        org.junit.Assert.assertNotNull(elements22);
        org.junit.Assert.assertNotNull(strSet23);
        org.junit.Assert.assertNotNull(element24);
        org.junit.Assert.assertNotNull(element27);
        org.junit.Assert.assertNotNull(elements30);
    }

    @Test
    public void test3545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3545");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("#root");
        org.jsoup.nodes.Document.OutputSettings outputSettings2 = document1.outputSettings();
        org.jsoup.nodes.Element element4 = document1.text("<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.nodes.Document.OutputSettings outputSettings5 = document1.new OutputSettings();
        org.jsoup.select.Elements elements7 = document1.getElementsByIndexLessThan((int) (short) 100);
        java.lang.String str8 = document1.title();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(outputSettings2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test3546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3546");
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
        org.jsoup.nodes.Element element21 = document3.prepend("");
        org.jsoup.nodes.Attributes attributes22 = document3.attributes();
        java.util.List<org.jsoup.nodes.Node> nodeList23 = document3.childNodes();
        org.jsoup.nodes.Element element25 = document3.removeClass("");
        org.jsoup.nodes.Attributes attributes26 = document3.attributes();
        org.jsoup.nodes.Node node28 = document3.removeAttr(" hi!  hi!");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str9, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "#document" + "'", str17, "#document");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertNotNull(attributes22);
        org.junit.Assert.assertNotNull(nodeList23);
        org.junit.Assert.assertNotNull(element25);
        org.junit.Assert.assertNotNull(attributes26);
        org.junit.Assert.assertNotNull(node28);
    }

    @Test
    public void test3547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3547");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        java.lang.String str5 = document3.html();
        java.lang.String str6 = document3.html();
        document3.title("<html>\n <head></head>\n <body></body>\n</html>");
        java.util.regex.Pattern pattern10 = null;
        org.jsoup.select.Elements elements11 = document3.getElementsByAttributeValueMatching("hi!", pattern10);
        org.jsoup.nodes.Element element13 = document3.after("");
        java.lang.String str14 = document3.val();
        org.jsoup.select.Elements elements16 = document3.getElementsByIndexGreaterThan((-1));
        java.lang.String str17 = document3.toString();
        org.jsoup.nodes.Element element19 = document3.removeClass("");
        org.jsoup.nodes.Element element21 = document3.val("<html> <head> <title>&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt;&lt;/body&gt; &lt;/html&gt;</title> </head> <body></body> </html>");
        org.jsoup.select.Elements elements24 = document3.getElementsByAttributeValueMatching("<html>\n <head></head>\n <body>\n  &lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt; \n </body>\n</html><<html> <head></head> <body> </body> </html>></<html> <head></head> <body> </body> </html>>", "\n<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str5, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str6, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(elements16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "<html>\n <head>\n  <title>&lt;html&gt;\n &lt;head&gt;&lt;/head&gt;\n &lt;body&gt;&lt;/body&gt;\n&lt;/html&gt;</title>\n </head>\n <body></body>\n</html>" + "'", str17, "<html>\n <head>\n  <title>&lt;html&gt;\n &lt;head&gt;&lt;/head&gt;\n &lt;body&gt;&lt;/body&gt;\n&lt;/html&gt;</title>\n </head>\n <body></body>\n</html>");
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertNotNull(elements24);
    }

    @Test
    public void test3548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3548");
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
        org.jsoup.nodes.Element element17 = element13.removeClass("hi!");
        boolean boolean18 = element13.isBlock();
        boolean boolean19 = element13.isBlock();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str5, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str6, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test3549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3549");
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
        org.jsoup.nodes.Element element19 = document3.createElement("<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.select.Elements elements22 = document3.getElementsByAttributeValue("<html>\n <head></head>\n <body></body>\n</html>&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;<<html> <head></head> <body> </body> </html>></<html> <head></head> <body> </body> </html>>", "#document");
        org.jsoup.nodes.Document document24 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document26 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element27 = document24.prependChild((org.jsoup.nodes.Node) document26);
        java.lang.String str28 = document26.html();
        java.lang.String str29 = document26.html();
        java.util.Map<java.lang.String, java.lang.String> strMap30 = document26.dataset();
        org.jsoup.nodes.Element element32 = document26.appendElement("hi!");
        org.jsoup.select.Elements elements34 = document26.getElementsByClass("<html> <head></head> <body> </body> </html>");
        document26.title("#document");
        org.jsoup.nodes.Element element38 = document26.text("<html>\n <head></head>\n <body></body>\n</html>&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;");
        org.jsoup.select.Elements elements40 = document26.getElementsMatchingOwnText("");
        org.jsoup.select.Elements elements41 = document26.siblingElements();
        org.jsoup.nodes.Element element42 = document26.body();
        java.lang.String str43 = document26.tagName();
        java.util.Set<java.lang.String> strSet44 = document26.classNames();
        org.jsoup.nodes.Element element45 = document3.classNames(strSet44);
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(document11);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(elements16);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertNotNull(elements22);
        org.junit.Assert.assertNotNull(document24);
        org.junit.Assert.assertNotNull(document26);
        org.junit.Assert.assertNotNull(element27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str28, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str29, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertNotNull(strMap30);
        org.junit.Assert.assertNotNull(element32);
        org.junit.Assert.assertNotNull(elements34);
        org.junit.Assert.assertNotNull(element38);
        org.junit.Assert.assertNotNull(elements40);
        org.junit.Assert.assertNotNull(elements41);
        org.junit.Assert.assertNotNull(element42);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "#root" + "'", str43, "#root");
        org.junit.Assert.assertNotNull(strSet44);
        org.junit.Assert.assertNotNull(element45);
    }

    @Test
    public void test3550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3550");
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
        org.jsoup.nodes.Element element18 = document3.appendElement("html");
        document3.title("");
        document3.setBaseUri("<html>\n <head></head>\n <body></body>\n</html><#root value=\"\">\n <#document></#document>\n <html>\n  <head></head>\n  <body></body>\n </html>\n</#root><#root>\n <html>\n  <head></head>\n  <body></body>\n </html>\n <html> \n  <head></head> \n  <body> \n  </body>\n </html>\n</#root>");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str5, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str6, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;<<html> <head></head> <body> </body> </html>></<html> <head></head> <body> </body> </html>>" + "'", str15, "<html>\n <head></head>\n <body></body>\n</html>&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;<<html> <head></head> <body> </body> </html>></<html> <head></head> <body> </body> </html>>");
        org.junit.Assert.assertNotNull(document16);
        org.junit.Assert.assertNotNull(element18);
    }

    @Test
    public void test3551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3551");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.select.Elements elements6 = document3.getElementsByIndexLessThan((int) (short) 10);
        org.jsoup.nodes.Document document8 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document10 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element11 = document8.prependChild((org.jsoup.nodes.Node) document10);
        org.jsoup.select.Elements elements13 = document10.getElementsByIndexLessThan((int) (short) 10);
        boolean boolean14 = document3.equals((java.lang.Object) (short) 10);
        org.jsoup.nodes.Node node15 = document3.nextSibling();
        org.jsoup.nodes.Document document17 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document19 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element20 = document17.prependChild((org.jsoup.nodes.Node) document19);
        boolean boolean21 = document3.equals((java.lang.Object) element20);
        java.lang.String str22 = document3.tagName();
        java.lang.String str23 = document3.nodeName();
        org.jsoup.nodes.Element element25 = document3.prependText("<#root value=\"\" class=\"\">\n <html>\n  <head></head>\n  <body></body>\n </html>\n</#root>");
        java.lang.String str26 = document3.className();
        org.jsoup.select.Elements elements29 = document3.getElementsByAttributeValue("<html>\n <head></head>\n <body></body>\n</html>&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;<<html> <head></head> <body> </body> </html>></<html> <head></head> <body> </body> </html>>", "<<html>\n <head></head>\n <body></body>\n</html>&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;<<html> <head></head> <body> </body> </html>></<html> <head></head> <body> </body> </html>>></<html>\n <head></head>\n <body></body>\n</html>&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;<<html> <head></head> <body> </body> </html>></<html> <head></head> <body> </body> </html>>>");
        document3.title("#document <html> <head></head> <body></body> </html>");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(document8);
        org.junit.Assert.assertNotNull(document10);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNotNull(document17);
        org.junit.Assert.assertNotNull(document19);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "#root" + "'", str22, "#root");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "#document" + "'", str23, "#document");
        org.junit.Assert.assertNotNull(element25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(elements29);
    }

    @Test
    public void test3552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3552");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        java.lang.String str5 = document3.html();
        java.lang.String str6 = document3.html();
        java.util.Map<java.lang.String, java.lang.String> strMap7 = document3.dataset();
        org.jsoup.nodes.Element element9 = document3.appendElement("hi!");
        org.jsoup.nodes.Element element10 = document3.body();
        java.lang.String str11 = element10.toString();
        org.jsoup.nodes.Element element12 = element10.firstElementSibling();
        java.util.Map<java.lang.String, java.lang.String> strMap13 = element10.dataset();
        java.lang.String str14 = element10.data();
        org.jsoup.nodes.Element element17 = element10.attr("#root", "<html>\n <head></head>\n <body>\n  &lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt;&lt;/body&gt; &lt;/html&gt;\n </body>\n</html>");
        java.util.List<org.jsoup.nodes.Node> nodeList18 = element10.childNodes();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str5, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str6, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\n<body></body>" + "'", str11, "\n<body></body>");
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(strMap13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(nodeList18);
    }

    @Test
    public void test3553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3553");
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
        org.jsoup.nodes.Element element18 = document3.appendElement("<html>\n <head></head>\n <body></body>\n</html>&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;<<html> <head></head> <body> </body> </html>></<html> <head></head> <body> </body> </html>>");
        org.jsoup.nodes.Element element19 = document3.firstElementSibling();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str9, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertNotNull(tag16);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNotNull(element19);
    }

    @Test
    public void test3554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3554");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt;&lt;/body&gt; &lt;/html&gt;&amp;lt;html&amp;gt; &amp;lt;head&amp;gt;&amp;lt;/head&amp;gt; &amp;lt;body&amp;gt; &amp;lt;/body&amp;gt; &amp;lt;/html&amp;gt;<#root>\n <html>\n  <head></head>\n  <body></body>\n </html>\n</#root>\n<html>\n <head></head>\n <body></body>\n</html>");
        java.util.regex.Pattern pattern2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements3 = document1.getElementsMatchingOwnText(pattern2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3555");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("<html>\n <head>\n  <title>&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;</title>\n </head>\n <body></body>\n</html>");
        org.jsoup.nodes.Element element3 = document1.addClass("<html>\n <head></head>\n <body></body>\n</html><#root #document=\"&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;\">\n <html>\n  <head></head>\n  <body></body>\n </html>&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;\n</#root>");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(element3);
    }

    @Test
    public void test3556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3556");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        java.lang.String str5 = document3.html();
        java.lang.String str6 = document3.html();
        java.lang.String str7 = document3.html();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node9 = document3.childNode(2);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 2 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str5, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str6, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str7, "<html>\n <head></head>\n <body></body>\n</html>");
    }

    @Test
    public void test3557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3557");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element3 = document1.text("");
        boolean boolean5 = element3.hasClass("");
        org.jsoup.nodes.Element element7 = element3.val("&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt;&lt;/body&gt; &lt;/html&gt;&amp;lt;html&amp;gt; &amp;lt;head&amp;gt;&amp;lt;/head&amp;gt; &amp;lt;body&amp;gt; &amp;lt;/body&amp;gt; &amp;lt;/html&amp;gt;<#root>\n <html>\n  <head></head>\n  <body></body>\n </html>\n</#root>\n<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(element7);
    }

    @Test
    public void test3558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3558");
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
        document13.setBaseUri("<html> <head></head> <body></body> </html>");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#root" + "'", str2, "#root");
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(outputSettings9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "<<html>\n <head></head>\n <body></body>\n</html>&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;<<html> <head></head> <body> </body> </html>></<html> <head></head> <body> </body> </html>>></<html>\n <head></head>\n <body></body>\n</html>&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;<<html> <head></head> <body> </body> </html>></<html> <head></head> <body> </body> </html>>>" + "'", str10, "<<html>\n <head></head>\n <body></body>\n</html>&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;<<html> <head></head> <body> </body> </html>></<html> <head></head> <body> </body> </html>>></<html>\n <head></head>\n <body></body>\n</html>&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;<<html> <head></head> <body> </body> </html>></<html> <head></head> <body> </body> </html>>>");
        org.junit.Assert.assertNotNull(document13);
        org.junit.Assert.assertNotNull(outputSettings14);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(strSet17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test3559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3559");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.select.Elements elements6 = document3.getElementsByIndexLessThan((int) (short) 10);
        org.jsoup.nodes.Element element8 = document3.val("");
        org.jsoup.nodes.Element element10 = document3.after("#root");
        org.jsoup.nodes.Element element12 = element10.prependElement("<html> <head></head> <body> </body> </html>");
        java.util.regex.Pattern pattern14 = null;
        org.jsoup.select.Elements elements15 = element10.getElementsByAttributeValueMatching("<body></body>&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt;&lt;/body&gt; &lt;/html&gt;\n<html> \n <head></head> \n <body>  \n </body>\n</html>", pattern14);
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(elements15);
    }

    @Test
    public void test3560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3560");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.select.Elements elements6 = document3.getElementsByIndexLessThan((int) (short) 10);
        java.util.Set<java.lang.String> strSet7 = document3.classNames();
        org.jsoup.nodes.Element element10 = document3.attr("<html>\n <head></head>\n <body></body>\n</html>", "#root");
        org.jsoup.nodes.Document document11 = document3.normalise();
        java.util.Map<java.lang.String, java.lang.String> strMap12 = document11.dataset();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(document11);
        org.junit.Assert.assertNotNull(strMap12);
    }

    @Test
    public void test3561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3561");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.nodes.Element element5 = document3.head();
        org.jsoup.nodes.Element element6 = document3.lastElementSibling();
        org.jsoup.nodes.Node node8 = document3.childNode((int) (byte) 0);
        org.jsoup.select.Elements elements11 = document3.getElementsByAttributeValueMatching("<html>\n <head>\n  <title>&lt;html&gt;\n &lt;head&gt;&lt;/head&gt;\n &lt;body&gt;&lt;/body&gt;\n&lt;/html&gt;</title>\n </head>\n <body></body>\n</html>", "");
        document3.remove();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(elements11);
    }

    @Test
    public void test3562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3562");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.select.Elements elements6 = document3.getElementsByIndexLessThan((int) (short) 10);
        org.jsoup.nodes.Element element8 = document3.val("");
        org.jsoup.nodes.Element element10 = element8.val("hi!");
        org.jsoup.nodes.Element element12 = element10.prependText("");
        org.jsoup.select.Elements elements13 = element12.siblingElements();
        boolean boolean15 = element12.hasAttr("<html>\n <head></head>\n <body>\n </body>\n</html>");
        org.jsoup.select.Elements elements17 = element12.getElementsByIndexLessThan((int) (short) 1);
        java.lang.String str18 = element12.html();
        org.jsoup.nodes.Document document20 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document22 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element23 = document20.prependChild((org.jsoup.nodes.Node) document22);
        java.lang.String str24 = document22.html();
        java.lang.String str25 = document22.html();
        java.util.Map<java.lang.String, java.lang.String> strMap26 = document22.dataset();
        org.jsoup.nodes.Element element28 = document22.appendText("<html>\n <head></head>\n <body>\n </body>\n</html>");
        org.jsoup.nodes.Element element31 = document22.attr("#document", "<html> <head></head> <body> </body> </html>");
        boolean boolean33 = element31.hasClass("#root");
        org.jsoup.nodes.Element element34 = element12.appendChild((org.jsoup.nodes.Node) element31);
        java.lang.String str35 = element34.text();
        org.jsoup.select.Elements elements38 = element34.getElementsByAttributeValueStarting("<#root>\n <#root>\n  <html>\n   <head></head>\n   <body></body>\n  </html>\n </#root>\n <html>\n  <head></head>\n  <body></body>\n </html>\n</#root>\n<html>\n <head></head>\n <body></body>\n</html>", "<html>\n <head>\n  <title>#document</title>\n </head>\n <body>\n  &lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt;&lt;/body&gt; &lt;/html&gt;&amp;lt;html&amp;gt; &amp;lt;head&amp;gt;&amp;lt;/head&amp;gt; &amp;lt;body&amp;gt; &amp;lt;/body&amp;gt; &amp;lt;/html&amp;gt;\n </body>\n</html><hi!></hi!>");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(elements17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str18, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertNotNull(document20);
        org.junit.Assert.assertNotNull(document22);
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str24, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str25, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertNotNull(strMap26);
        org.junit.Assert.assertNotNull(element28);
        org.junit.Assert.assertNotNull(element31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(element34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "<html> <head></head> <body> </body> </html>" + "'", str35, "<html> <head></head> <body> </body> </html>");
        org.junit.Assert.assertNotNull(elements38);
    }

    @Test
    public void test3563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3563");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.select.Elements elements6 = document3.getElementsByIndexLessThan((int) (short) 10);
        org.jsoup.nodes.Element element8 = document3.val("");
        org.jsoup.nodes.Element element10 = document3.after("#root");
        org.jsoup.nodes.Element element11 = document3.nextElementSibling();
        org.jsoup.nodes.Element element13 = document3.append("#root");
        org.jsoup.nodes.Element element14 = element13.nextElementSibling();
        org.jsoup.nodes.Element element16 = element13.val("<html> <head></head> <body> </body> </html> <html> <head></head> <body> </body> </html> #document");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(element16);
    }

    @Test
    public void test3564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3564");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("#root");
        org.jsoup.nodes.Document.OutputSettings outputSettings2 = document1.outputSettings();
        org.jsoup.nodes.Element element4 = document1.child(0);
        java.lang.String str5 = document1.nodeName();
        org.jsoup.nodes.Element element7 = document1.addClass("\n<body></body>");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(outputSettings2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#document" + "'", str5, "#document");
        org.junit.Assert.assertNotNull(element7);
    }

    @Test
    public void test3565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3565");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.select.Elements elements6 = document3.getElementsByIndexLessThan((int) (short) 10);
        java.util.Set<java.lang.String> strSet7 = document3.classNames();
        org.jsoup.nodes.Element element10 = document3.attr("<html>\n <head></head>\n <body></body>\n</html>", "#root");
        boolean boolean12 = document3.hasAttr("<html> <head></head> <body> </body> </html>");
        org.jsoup.nodes.Element element13 = document3.nextElementSibling();
        org.jsoup.nodes.Element element15 = element13.removeClass("<#root value=\"\" #root=\"&lt;html&gt;\n &lt;head&gt;&lt;/head&gt;\n &lt;body&gt;&lt;/body&gt;\n&lt;/html&gt;\" class=\"\">\n <html>\n  <head></head>\n  <body></body>\n </html><<html>\n <head></head>\n <body>\n </body>\n</html>></<html>\n <head></head>\n <body>\n </body>\n</html>>\n</#root>");
        org.jsoup.nodes.Element element17 = element15.appendText("<html>\n <head></head>\n <body></body>\n</html>&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;<<html> <head></head> <body> </body> </html>></<html> <head></head> <body> </body> </html>>");
        java.lang.String str18 = element17.className();
        org.jsoup.nodes.Document document20 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document22 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element23 = document20.prependChild((org.jsoup.nodes.Node) document22);
        org.jsoup.select.Elements elements25 = document22.getElementsByIndexLessThan((int) (short) 10);
        org.jsoup.nodes.Document document27 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document29 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element30 = document27.prependChild((org.jsoup.nodes.Node) document29);
        org.jsoup.select.Elements elements32 = document29.getElementsByIndexLessThan((int) (short) 10);
        boolean boolean33 = document22.equals((java.lang.Object) (short) 10);
        org.jsoup.nodes.Node node34 = document22.nextSibling();
        org.jsoup.nodes.Document document36 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document38 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element39 = document36.prependChild((org.jsoup.nodes.Node) document38);
        boolean boolean40 = document22.equals((java.lang.Object) element39);
        java.lang.String str41 = document22.tagName();
        org.jsoup.nodes.Document document42 = document22.normalise();
        org.jsoup.select.Elements elements45 = document42.getElementsByAttributeValueNot("#root", "<html>\n <head>\n  <title>&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;</title>\n </head>\n <body></body>\n</html>");
        org.jsoup.select.Elements elements48 = document42.getElementsByAttributeValueNot("<#root value=\"&lt;html&gt;\n &lt;head&gt;&lt;/head&gt;\n &lt;body&gt;&lt;/body&gt;\n&lt;/html&gt;\">\n <html>\n  <head></head>\n  <body></body>\n </html>\n</#root>#root\n<html>\n <head></head>\n <body></body>\n</html>", "#document");
        org.jsoup.select.Elements elements50 = document42.getElementsContainingOwnText("&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt;&lt;/body&gt; &lt;/html&gt;&amp;lt;html&amp;gt; &amp;lt;head&amp;gt;&amp;lt;/head&amp;gt; &amp;lt;body&amp;gt; &amp;lt;/body&amp;gt; &amp;lt;/html&amp;gt;<#root>\n <html>\n  <head></head>\n  <body></body>\n </html>\n</#root>\n<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.nodes.Element element51 = element17.prependChild((org.jsoup.nodes.Node) document42);
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(document20);
        org.junit.Assert.assertNotNull(document22);
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertNotNull(elements25);
        org.junit.Assert.assertNotNull(document27);
        org.junit.Assert.assertNotNull(document29);
        org.junit.Assert.assertNotNull(element30);
        org.junit.Assert.assertNotNull(elements32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertNotNull(document36);
        org.junit.Assert.assertNotNull(document38);
        org.junit.Assert.assertNotNull(element39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "#root" + "'", str41, "#root");
        org.junit.Assert.assertNotNull(document42);
        org.junit.Assert.assertNotNull(elements45);
        org.junit.Assert.assertNotNull(elements48);
        org.junit.Assert.assertNotNull(elements50);
        org.junit.Assert.assertNotNull(element51);
    }

    @Test
    public void test3566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3566");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.nodes.Element element5 = document1.body();
        boolean boolean6 = element5.hasText();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test3567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3567");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.parser.Tag tag5 = document3.tag();
        org.jsoup.nodes.Element element7 = document3.prependText("hi!");
        org.jsoup.nodes.Element element8 = element7.firstElementSibling();
        org.jsoup.nodes.Element element10 = element7.html("<html>\n <head>\n  <title>&lt;html&gt;\n &lt;head&gt;&lt;/head&gt;\n &lt;body&gt;&lt;/body&gt;\n&lt;/html&gt;</title>\n </head>\n <body></body>\n</html>");
        org.jsoup.select.Elements elements12 = element10.getElementsByClass("<html>\n <head></head>\n <body></body>\n</html>");
        java.lang.String str13 = element10.html();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(tag5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "<html> \n <head> \n  <title>&lt;html&gt;\n &lt;head&gt;&lt;/head&gt;\n &lt;body&gt;&lt;/body&gt;\n&lt;/html&gt;</title> \n </head> \n <body> \n </body>\n</html>" + "'", str13, "<html> \n <head> \n  <title>&lt;html&gt;\n &lt;head&gt;&lt;/head&gt;\n &lt;body&gt;&lt;/body&gt;\n&lt;/html&gt;</title> \n </head> \n <body> \n </body>\n</html>");
    }

    @Test
    public void test3568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3568");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element3 = document1.text("");
        java.lang.String str4 = element3.html();
        org.jsoup.select.Elements elements7 = element3.getElementsByAttributeValueNot("hi!", "#root");
        boolean boolean8 = element3.isBlock();
        org.jsoup.nodes.Element element10 = element3.addClass("<html>\n <head>\n  <title>&lt;html&gt;\n &lt;head&gt;&lt;/head&gt;\n &lt;body&gt;&lt;/body&gt;\n&lt;/html&gt;</title>\n </head>\n <body></body>\n</html>");
        org.jsoup.nodes.Element element12 = element3.toggleClass("<#root></#root>\n<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<html>\n <head></head>\n <body>\n </body>\n</html>" + "'", str4, "<html>\n <head></head>\n <body>\n </body>\n</html>");
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element12);
    }

    @Test
    public void test3569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3569");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        java.lang.String str5 = document3.className();
        org.jsoup.nodes.Element element6 = document3.lastElementSibling();
        org.jsoup.nodes.Document document7 = document3.normalise();
        org.jsoup.select.Elements elements8 = document7.siblingElements();
        java.lang.Integer int9 = document7.siblingIndex();
        org.jsoup.nodes.Document document10 = document7.normalise();
        org.jsoup.nodes.Document document12 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document14 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element15 = document12.prependChild((org.jsoup.nodes.Node) document14);
        org.jsoup.nodes.Element element17 = element15.child((int) (short) 0);
        org.jsoup.nodes.Element element18 = document7.prependChild((org.jsoup.nodes.Node) element15);
        java.lang.String str19 = document7.html();
        java.lang.String str20 = document7.html();
        org.jsoup.select.Elements elements21 = document7.children();
        org.jsoup.nodes.Element element24 = document7.attr("<head></head>\n<body></body>", "");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(document7);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(document10);
        org.junit.Assert.assertNotNull(document12);
        org.junit.Assert.assertNotNull(document14);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "<#root>\n <#root>\n  <html>\n   <head></head>\n   <body></body>\n  </html>\n </#root>\n <html>\n  <head></head>\n  <body></body>\n </html>\n</#root>\n<html>\n <head></head>\n <body></body>\n</html>" + "'", str19, "<#root>\n <#root>\n  <html>\n   <head></head>\n   <body></body>\n  </html>\n </#root>\n <html>\n  <head></head>\n  <body></body>\n </html>\n</#root>\n<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "<#root>\n <#root>\n  <html>\n   <head></head>\n   <body></body>\n  </html>\n </#root>\n <html>\n  <head></head>\n  <body></body>\n </html>\n</#root>\n<html>\n <head></head>\n <body></body>\n</html>" + "'", str20, "<#root>\n <#root>\n  <html>\n   <head></head>\n   <body></body>\n  </html>\n </#root>\n <html>\n  <head></head>\n  <body></body>\n </html>\n</#root>\n<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertNotNull(elements21);
        org.junit.Assert.assertNotNull(element24);
    }

    @Test
    public void test3570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3570");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.select.Elements elements6 = document3.getElementsByIndexLessThan((int) (short) 10);
        org.jsoup.nodes.Document document8 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document10 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element11 = document8.prependChild((org.jsoup.nodes.Node) document10);
        org.jsoup.select.Elements elements13 = document10.getElementsByIndexLessThan((int) (short) 10);
        boolean boolean14 = document3.equals((java.lang.Object) (short) 10);
        org.jsoup.nodes.Element element16 = document3.text("\n<body>\n <#root>\n  <html>\n   <head></head>\n   <body></body>\n  </html>\n </#root>&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt;&lt;/body&gt; &lt;/html&gt;\n <html> \n  <head></head> \n  <body>  \n  </body>\n </html>\n</body>");
        java.lang.String str17 = element16.tagName();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(document8);
        org.junit.Assert.assertNotNull(document10);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "#root" + "'", str17, "#root");
    }

    @Test
    public void test3571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3571");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        java.lang.String str5 = document3.html();
        java.lang.String str6 = document3.html();
        java.util.Map<java.lang.String, java.lang.String> strMap7 = document3.dataset();
        org.jsoup.nodes.Element element9 = document3.appendText("<html>\n <head></head>\n <body>\n </body>\n</html>");
        org.jsoup.select.Elements elements12 = document3.getElementsByAttributeValueStarting("<html>\n <head></head>\n <body>\n </body>\n</html>", "<html> <head></head> <body> </body> </html>");
        org.jsoup.select.Elements elements15 = document3.getElementsByAttributeValueMatching("<html> <head></head> <body> </body> </html>", "hi!");
        org.jsoup.nodes.Element element17 = document3.addClass("html");
        org.jsoup.nodes.Element element19 = element17.val("<html>\n <head></head>\n <body></body>\n</html>&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;");
        org.jsoup.nodes.Element element21 = element19.prepend("#root");
        org.jsoup.select.Elements elements24 = element21.getElementsByAttributeValueContaining("<html>\n <head>\n  <title>&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;</title>\n </head>\n <body></body>\n</html>", "<html>\n <head></head>\n <body>\n </body>\n</html>");
        org.jsoup.nodes.Node node26 = element21.removeAttr("<html> <head></head> <body></body> </html>");
        org.jsoup.nodes.Element element28 = element21.prependText(" html");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str5, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str6, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertNotNull(elements24);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertNotNull(element28);
    }

    @Test
    public void test3572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3572");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.nodes.Element element5 = document1.body();
        org.jsoup.select.Elements elements8 = element5.getElementsByAttributeValueStarting("hi!", "hi!");
        org.jsoup.nodes.Element element10 = element5.append("#document\n<html>\n <head></head>\n <body></body>\n</html>#document \n<html> \n <head></head> \n <body> \n </body>\n</html>");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(element10);
    }

    @Test
    public void test3573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3573");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        java.lang.String str5 = document3.html();
        java.lang.String str6 = document3.html();
        document3.title("<html>\n <head></head>\n <body></body>\n</html>");
        java.util.regex.Pattern pattern10 = null;
        org.jsoup.select.Elements elements11 = document3.getElementsByAttributeValueMatching("hi!", pattern10);
        org.jsoup.nodes.Element element13 = document3.after("");
        org.jsoup.select.Elements elements16 = element13.getElementsByAttributeValueContaining("hi!", "hi!");
        org.jsoup.select.Elements elements18 = element13.getElementsByIndexEquals((int) (short) 100);
        org.jsoup.nodes.Document document19 = element13.ownerDocument();
        java.lang.String str20 = document19.nodeName();
        org.jsoup.select.Elements elements22 = document19.getElementsByClass("#document <html> <head></head> <body></body> </html>&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;");
        org.jsoup.nodes.Document.OutputSettings outputSettings23 = document19.outputSettings();
        org.jsoup.nodes.Document document25 = org.jsoup.nodes.Document.createShell("#root");
        org.jsoup.nodes.Document.OutputSettings outputSettings26 = document25.outputSettings();
        java.nio.charset.Charset charset27 = outputSettings26.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings28 = outputSettings23.charset(charset27);
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str5, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str6, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(elements16);
        org.junit.Assert.assertNotNull(elements18);
        org.junit.Assert.assertNotNull(document19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "#document" + "'", str20, "#document");
        org.junit.Assert.assertNotNull(elements22);
        org.junit.Assert.assertNotNull(outputSettings23);
        org.junit.Assert.assertNotNull(document25);
        org.junit.Assert.assertNotNull(outputSettings26);
        org.junit.Assert.assertNotNull(charset27);
        org.junit.Assert.assertNotNull(outputSettings28);
    }

    @Test
    public void test3574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3574");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.nodes.Element element5 = document1.body();
        org.jsoup.select.Elements elements7 = document1.select("#root");
        org.jsoup.nodes.Element element8 = document1.empty();
        org.jsoup.select.Elements elements10 = element8.getElementsByIndexLessThan((int) (byte) 1);
        boolean boolean11 = element8.hasText();
        java.lang.String str12 = element8.className();
        org.jsoup.nodes.Element element14 = element8.prependText("html");
        java.util.regex.Pattern pattern16 = null;
        org.jsoup.select.Elements elements17 = element8.getElementsByAttributeValueMatching("<html> \n <head></head> \n <body>  \n </body>\n</html>", pattern16);
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(elements17);
    }

    @Test
    public void test3575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3575");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("<html> \n <head></head> \n <body>  \n </body>\n</html>");
        org.junit.Assert.assertNotNull(document1);
    }

    @Test
    public void test3576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3576");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        java.lang.String str5 = document3.className();
        org.jsoup.nodes.Element element6 = document3.lastElementSibling();
        org.jsoup.nodes.Document document7 = document3.normalise();
        org.jsoup.select.Elements elements9 = document7.getElementsByClass("\n<body></body>");
        org.jsoup.nodes.Element element10 = document7.parent();
        org.jsoup.nodes.Element element12 = document7.text("<html> <head></head> <body></body> </html>&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;");
        org.jsoup.nodes.Element element13 = document7.lastElementSibling();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(document7);
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(element13);
    }

    @Test
    public void test3577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3577");
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
        org.jsoup.nodes.Element element17 = document3.toggleClass("<html>\n <head></head>\n <body>\n </body>\n</html>");
        java.lang.String str18 = document3.nodeName();
        document3.setBaseUri("<html>\n <head></head>\n <body>\n  &lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt;&lt;/body&gt; &lt;/html&gt;&amp;lt;html&amp;gt; &amp;lt;head&amp;gt;&amp;lt;/head&amp;gt; &amp;lt;body&amp;gt; &amp;lt;/body&amp;gt; &amp;lt;/html&amp;gt;&lt;&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;&gt;&lt;/&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;&gt;\n </body>\n</html>");
        org.jsoup.select.Elements elements23 = document3.getElementsByAttributeValue("<html>\n <head>\n  <title>&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;</title>\n </head>\n <body></body>\n</html>", "head");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str5, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str6, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;" + "'", str13, "<html>\n <head></head>\n <body></body>\n</html>&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;");
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "#document" + "'", str18, "#document");
        org.junit.Assert.assertNotNull(elements23);
    }

    @Test
    public void test3578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3578");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        java.lang.String str5 = document3.html();
        java.lang.String str6 = document3.html();
        java.util.Map<java.lang.String, java.lang.String> strMap7 = document3.dataset();
        org.jsoup.nodes.Element element9 = document3.appendElement("hi!");
        org.jsoup.nodes.Element element11 = document3.append("<html>\n <head></head>\n <body>\n  &lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt; &lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;\n </body>\n</html>\n<html> \n <head></head> \n <body>  \n </body>\n</html>");
        org.jsoup.nodes.Element element13 = document3.prependText("&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt;&lt;/body&gt; &lt;/html&gt;&amp;lt;html&amp;gt; &amp;lt;head&amp;gt;&amp;lt;/head&amp;gt; &amp;lt;body&amp;gt; &amp;lt;/body&amp;gt; &amp;lt;/html&amp;gt;<#root>\n <html>\n  <head></head>\n  <body></body>\n </html>\n</#root>\n<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.nodes.Document document14 = document3.normalise();
        org.jsoup.select.Elements elements16 = document14.getElementsByTag("<<html>\n <head></head>\n <body></body>\n</html>&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;<<html> <head></head> <body> </body> </html>></<html> <head></head> <body> </body> </html>>></<html>\n <head></head>\n <body></body>\n</html>&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;<<html> <head></head> <body> </body> </html>></<html> <head></head> <body> </body> </html>>>");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str5, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str6, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(document14);
        org.junit.Assert.assertNotNull(elements16);
    }

    @Test
    public void test3579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3579");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.select.Elements elements6 = document3.getElementsByIndexLessThan((int) (short) 10);
        org.jsoup.nodes.Document document8 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document10 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element11 = document8.prependChild((org.jsoup.nodes.Node) document10);
        org.jsoup.select.Elements elements13 = document10.getElementsByIndexLessThan((int) (short) 10);
        boolean boolean14 = document3.equals((java.lang.Object) (short) 10);
        org.jsoup.nodes.Node node15 = document3.nextSibling();
        org.jsoup.select.Elements elements17 = document3.getElementsContainingText("<html>\n <head></head>\n <body></body>\n</html>&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;");
        org.jsoup.nodes.Element element19 = document3.prependElement("<html> <head></head> <body> </body> </html>");
        org.jsoup.nodes.Document document20 = document3.normalise();
        org.jsoup.select.Elements elements22 = document20.getElementsByIndexLessThan((int) (byte) 100);
        java.util.Map<java.lang.String, java.lang.String> strMap23 = document20.dataset();
        org.jsoup.nodes.Element element24 = document20.firstElementSibling();
        org.jsoup.nodes.Element element25 = document20.firstElementSibling();
        org.jsoup.nodes.Element element27 = document20.before("<hi! <html>\n <head></head>\n <body></body>\n</html>=\"&lt;html&gt;\n &lt;head&gt;&lt;/head&gt;\n &lt;body&gt;\n &lt;/body&gt;\n&lt;/html&gt;\"></hi!>&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt;&lt;/body&gt; &lt;/html&gt;");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(document8);
        org.junit.Assert.assertNotNull(document10);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNotNull(elements17);
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertNotNull(document20);
        org.junit.Assert.assertNotNull(elements22);
        org.junit.Assert.assertNotNull(strMap23);
        org.junit.Assert.assertNotNull(element24);
        org.junit.Assert.assertNotNull(element25);
        org.junit.Assert.assertNotNull(element27);
    }

    @Test
    public void test3580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3580");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.select.Elements elements6 = document3.getElementsByIndexLessThan((int) (short) 10);
        org.jsoup.nodes.Element element8 = document3.val("");
        org.jsoup.nodes.Element element10 = document3.after("#root");
        org.jsoup.nodes.Document document11 = document3.ownerDocument();
        org.jsoup.nodes.Node node12 = document11.previousSibling();
        org.jsoup.select.Elements elements13 = document11.siblingElements();
        org.jsoup.select.Elements elements15 = document11.getElementsByAttribute("#document");
        org.jsoup.nodes.Element element17 = document11.addClass("<#document></#document>\n<html>\n <head></head>\n <body></body>\n</html>");
        java.util.List<org.jsoup.nodes.Node> nodeList18 = document11.siblingNodes();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(document11);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(nodeList18);
    }

    @Test
    public void test3581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3581");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.select.Elements elements6 = document3.getElementsByIndexLessThan((int) (short) 10);
        org.jsoup.nodes.Document document8 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document10 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element11 = document8.prependChild((org.jsoup.nodes.Node) document10);
        org.jsoup.select.Elements elements13 = document10.getElementsByIndexLessThan((int) (short) 10);
        boolean boolean14 = document3.equals((java.lang.Object) (short) 10);
        org.jsoup.nodes.Node node15 = document3.nextSibling();
        org.jsoup.nodes.Document document17 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document19 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element20 = document17.prependChild((org.jsoup.nodes.Node) document19);
        boolean boolean21 = document3.equals((java.lang.Object) element20);
        java.lang.String str22 = document3.tagName();
        java.lang.String str23 = document3.nodeName();
        org.jsoup.nodes.Element element25 = document3.prependText("<#root value=\"\" class=\"\">\n <html>\n  <head></head>\n  <body></body>\n </html>\n</#root>");
        java.lang.String str26 = document3.className();
        org.jsoup.select.Elements elements29 = document3.getElementsByAttributeValue("<html>\n <head></head>\n <body></body>\n</html>&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;<<html> <head></head> <body> </body> </html>></<html> <head></head> <body> </body> </html>>", "<<html>\n <head></head>\n <body></body>\n</html>&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;<<html> <head></head> <body> </body> </html>></<html> <head></head> <body> </body> </html>>></<html>\n <head></head>\n <body></body>\n</html>&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;<<html> <head></head> <body> </body> </html>></<html> <head></head> <body> </body> </html>>>");
        java.lang.String str30 = document3.html();
        org.jsoup.nodes.Element element32 = document3.removeClass("#document\n<html>\n <head></head>\n <body></body>\n</html>#document \n<html> \n <head></head> \n <body> \n </body>\n</html>");
        org.jsoup.nodes.Element element33 = element32.nextElementSibling();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(document8);
        org.junit.Assert.assertNotNull(document10);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNotNull(document17);
        org.junit.Assert.assertNotNull(document19);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "#root" + "'", str22, "#root");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "#document" + "'", str23, "#document");
        org.junit.Assert.assertNotNull(element25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(elements29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "&lt;#root value=&quot;&quot; class=&quot;&quot;&gt; &lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt;&lt;/body&gt; &lt;/html&gt; &lt;/#root&gt;\n<html>\n <head></head>\n <body></body>\n</html>" + "'", str30, "&lt;#root value=&quot;&quot; class=&quot;&quot;&gt; &lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt;&lt;/body&gt; &lt;/html&gt; &lt;/#root&gt;\n<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertNotNull(element32);
        org.junit.Assert.assertNotNull(element33);
    }

    @Test
    public void test3582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3582");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("<#document></#document>\n<html>\n <head>\n  <title>#document</title>\n </head>\n <body>\n  &lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt;&lt;/body&gt; &lt;/html&gt;\n </body>\n</html><hi!></hi!>");
        org.junit.Assert.assertNotNull(document1);
    }

    @Test
    public void test3583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3583");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        java.lang.String str5 = document3.className();
        org.jsoup.nodes.Element element6 = document3.lastElementSibling();
        org.jsoup.nodes.Document document7 = document3.normalise();
        org.jsoup.select.Elements elements8 = document7.siblingElements();
        org.jsoup.nodes.Element element10 = document7.text("<html>\n <head></head>\n <body></body>\n</html>&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;");
        org.jsoup.nodes.Element element12 = document7.prependText("body");
        org.jsoup.nodes.Element element14 = document7.text("<html>\n <head></head>\n <body></body>\n</html><#root class=\"\">\n <html>\n  <head></head>\n  <body></body>\n </html>\n</#root>");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(document7);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(element14);
    }

    @Test
    public void test3584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3584");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.select.Elements elements6 = document3.getElementsByIndexLessThan((int) (short) 10);
        org.jsoup.nodes.Element element8 = document3.val("");
        org.jsoup.nodes.Element element10 = element8.val("hi!");
        org.jsoup.nodes.Element element12 = element10.prependText("");
        org.jsoup.nodes.Element element14 = element10.prependElement("#root");
        org.jsoup.nodes.Element element16 = element10.removeClass("<html> <head></head> <body> </body> </html>");
        org.jsoup.nodes.Element element17 = element10.parent();
        java.lang.String str18 = element10.toString();
        java.lang.Integer int19 = element10.siblingIndex();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "<#root></#root>\n<html>\n <head></head>\n <body></body>\n</html>" + "'", str18, "<#root></#root>\n<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test3585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3585");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("#root");
        org.jsoup.nodes.Document.OutputSettings outputSettings2 = document1.outputSettings();
        org.jsoup.nodes.Element element4 = document1.child(0);
        org.jsoup.nodes.Node node5 = document1.nextSibling();
        java.util.Set<java.lang.String> strSet6 = document1.classNames();
        org.jsoup.nodes.Document document7 = document1.normalise();
        org.jsoup.nodes.Document document8 = document1.normalise();
        java.lang.String str9 = document1.data();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(outputSettings2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertNotNull(document7);
        org.junit.Assert.assertNotNull(document8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test3586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3586");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        java.lang.String str5 = document3.className();
        org.jsoup.nodes.Element element6 = document3.lastElementSibling();
        org.jsoup.nodes.Document document7 = document3.normalise();
        org.jsoup.select.Elements elements8 = document7.siblingElements();
        java.lang.Integer int9 = document7.siblingIndex();
        org.jsoup.nodes.Document document10 = document7.normalise();
        org.jsoup.nodes.Document document12 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document14 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element15 = document12.prependChild((org.jsoup.nodes.Node) document14);
        org.jsoup.nodes.Element element17 = element15.child((int) (short) 0);
        org.jsoup.nodes.Element element18 = document7.prependChild((org.jsoup.nodes.Node) element15);
        org.jsoup.nodes.Element element20 = element18.after("body");
        org.jsoup.select.Elements elements22 = element18.getElementsContainingOwnText("<html>\n <head></head>\n <body>\n  &lt;html&gt; &lt;head&gt; &lt;title&gt;&amp;lt;html&amp;gt; &amp;lt;head&amp;gt;&amp;lt;/head&amp;gt; &amp;lt;body&amp;gt; &amp;lt;/body&amp;gt; &amp;lt;/html&amp;gt;&lt;/title&gt; &lt;/head&gt; &lt;body&gt;&lt;/body&gt; &lt;/html&gt;\n </body>\n</html>");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(document7);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(document10);
        org.junit.Assert.assertNotNull(document12);
        org.junit.Assert.assertNotNull(document14);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertNotNull(elements22);
    }

    @Test
    public void test3587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3587");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        java.lang.String str5 = document3.html();
        java.lang.String str6 = document3.html();
        java.util.Map<java.lang.String, java.lang.String> strMap7 = document3.dataset();
        org.jsoup.nodes.Element element9 = document3.appendText("<html>\n <head></head>\n <body>\n </body>\n</html>");
        org.jsoup.select.Elements elements12 = document3.getElementsByAttributeValueStarting("<html>\n <head></head>\n <body>\n </body>\n</html>", "<html> <head></head> <body> </body> </html>");
        org.jsoup.select.Elements elements15 = document3.getElementsByAttributeValueMatching("<html> <head></head> <body> </body> </html>", "hi!");
        org.jsoup.select.Elements elements17 = document3.getElementsByTag("hi!");
        org.jsoup.select.Elements elements18 = document3.getAllElements();
        org.jsoup.nodes.Document.OutputSettings outputSettings19 = document3.outputSettings();
        org.jsoup.nodes.Element element22 = document3.attr("<#root>\n <html>\n  <head></head>\n  <body></body>\n </html>\n</#root>\n<html>\n <head></head>\n <body></body>\n</html>", "<html>\n <head>\n  <title>&lt;html&gt;\n &lt;head&gt;&lt;/head&gt;\n &lt;body&gt;&lt;/body&gt;\n&lt;/html&gt;</title>\n </head>\n <body></body>\n</html>");
        java.util.List<org.jsoup.nodes.Node> nodeList23 = element22.siblingNodes();
        org.jsoup.nodes.Document document25 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document27 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element28 = document25.prependChild((org.jsoup.nodes.Node) document27);
        org.jsoup.select.Elements elements30 = document27.getElementsByIndexLessThan((int) (short) 10);
        org.jsoup.nodes.Document document32 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document34 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element35 = document32.prependChild((org.jsoup.nodes.Node) document34);
        org.jsoup.select.Elements elements37 = document34.getElementsByIndexLessThan((int) (short) 10);
        boolean boolean38 = document27.equals((java.lang.Object) (short) 10);
        org.jsoup.nodes.Node node39 = document27.nextSibling();
        org.jsoup.nodes.Document document41 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document43 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element44 = document41.prependChild((org.jsoup.nodes.Node) document43);
        boolean boolean45 = document27.equals((java.lang.Object) element44);
        org.jsoup.nodes.Document document47 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document49 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element50 = document47.prependChild((org.jsoup.nodes.Node) document49);
        java.lang.String str51 = document49.html();
        java.lang.String str52 = document49.html();
        java.util.Map<java.lang.String, java.lang.String> strMap53 = document49.dataset();
        org.jsoup.nodes.Element element55 = document49.appendText("<html>\n <head></head>\n <body>\n </body>\n</html>");
        org.jsoup.select.Elements elements58 = document49.getElementsByAttributeValueStarting("<html>\n <head></head>\n <body>\n </body>\n</html>", "<html> <head></head> <body> </body> </html>");
        org.jsoup.select.Elements elements61 = document49.getElementsByAttributeValueMatching("<html> <head></head> <body> </body> </html>", "hi!");
        org.jsoup.nodes.Element element63 = document49.addClass("html");
        org.jsoup.nodes.Document document65 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document67 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element68 = document65.prependChild((org.jsoup.nodes.Node) document67);
        org.jsoup.select.Elements elements70 = document67.getElementsByIndexLessThan((int) (short) 10);
        org.jsoup.nodes.Element element72 = document67.val("");
        org.jsoup.nodes.Element element74 = element72.val("hi!");
        org.jsoup.nodes.Element element76 = element74.prependText("");
        org.jsoup.nodes.Element element78 = element74.prepend("<html>\n <head></head>\n <body></body>\n</html>&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;<<html> <head></head> <body> </body> </html>></<html> <head></head> <body> </body> </html>>");
        org.jsoup.select.Elements elements79 = element78.siblingElements();
        org.jsoup.nodes.Element element80 = element63.appendChild((org.jsoup.nodes.Node) element78);
        java.lang.String str81 = element78.tagName();
        org.jsoup.nodes.Element element83 = element78.prependElement("<html>\n <head></head>\n <body>\n  &lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt; &lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;\n </body>\n</html>\n<html> \n <head></head> \n <body>  \n </body>\n</html>");
        java.util.regex.Pattern pattern85 = null;
        org.jsoup.select.Elements elements86 = element83.getElementsByAttributeValueMatching("\n<body></body>", pattern85);
        org.jsoup.nodes.Element element87 = document27.appendChild((org.jsoup.nodes.Node) element83);
        boolean boolean88 = element22.equals((java.lang.Object) document27);
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str5, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str6, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertNotNull(elements17);
        org.junit.Assert.assertNotNull(elements18);
        org.junit.Assert.assertNotNull(outputSettings19);
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertNotNull(nodeList23);
        org.junit.Assert.assertNotNull(document25);
        org.junit.Assert.assertNotNull(document27);
        org.junit.Assert.assertNotNull(element28);
        org.junit.Assert.assertNotNull(elements30);
        org.junit.Assert.assertNotNull(document32);
        org.junit.Assert.assertNotNull(document34);
        org.junit.Assert.assertNotNull(element35);
        org.junit.Assert.assertNotNull(elements37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(node39);
        org.junit.Assert.assertNotNull(document41);
        org.junit.Assert.assertNotNull(document43);
        org.junit.Assert.assertNotNull(element44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(document47);
        org.junit.Assert.assertNotNull(document49);
        org.junit.Assert.assertNotNull(element50);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str51, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str52, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertNotNull(strMap53);
        org.junit.Assert.assertNotNull(element55);
        org.junit.Assert.assertNotNull(elements58);
        org.junit.Assert.assertNotNull(elements61);
        org.junit.Assert.assertNotNull(element63);
        org.junit.Assert.assertNotNull(document65);
        org.junit.Assert.assertNotNull(document67);
        org.junit.Assert.assertNotNull(element68);
        org.junit.Assert.assertNotNull(elements70);
        org.junit.Assert.assertNotNull(element72);
        org.junit.Assert.assertNotNull(element74);
        org.junit.Assert.assertNotNull(element76);
        org.junit.Assert.assertNotNull(element78);
        org.junit.Assert.assertNotNull(elements79);
        org.junit.Assert.assertNotNull(element80);
        org.junit.Assert.assertEquals("'" + str81 + "' != '" + "#root" + "'", str81, "#root");
        org.junit.Assert.assertNotNull(element83);
        org.junit.Assert.assertNotNull(elements86);
        org.junit.Assert.assertNotNull(element87);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
    }

    @Test
    public void test3588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3588");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.select.Elements elements6 = document3.getElementsByIndexLessThan((int) (short) 10);
        org.jsoup.nodes.Element element8 = document3.val("");
        org.jsoup.nodes.Element element10 = document3.after("#root");
        org.jsoup.nodes.Element element11 = document3.nextElementSibling();
        org.jsoup.nodes.Element element13 = document3.append("#root");
        org.jsoup.select.Elements elements15 = element13.getElementsByAttributeStarting("<#root>\n <#root>\n  <html>\n   <head></head>\n   <body></body>\n  </html>\n </#root>\n <html>\n  <head></head>\n  <body></body>\n </html>\n</#root>\n<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.select.Elements elements18 = element13.getElementsByAttributeValueMatching("body", "");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertNotNull(elements18);
    }

    @Test
    public void test3589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3589");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        java.lang.String str5 = document3.html();
        java.lang.String str6 = document3.html();
        document3.title("<html>\n <head></head>\n <body></body>\n</html>");
        java.util.regex.Pattern pattern10 = null;
        org.jsoup.select.Elements elements11 = document3.getElementsByAttributeValueMatching("hi!", pattern10);
        org.jsoup.nodes.Element element13 = document3.after("");
        java.lang.String str14 = document3.val();
        java.lang.String str15 = document3.nodeName();
        document3.remove();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str5, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str6, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "#document" + "'", str15, "#document");
    }

    @Test
    public void test3590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3590");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.select.Elements elements6 = document3.getElementsByIndexLessThan((int) (short) 10);
        org.jsoup.nodes.Element element8 = document3.val("");
        org.jsoup.nodes.Element element10 = element8.val("hi!");
        org.jsoup.nodes.Element element12 = element10.prependText("");
        org.jsoup.nodes.Element element14 = element10.prependElement("#root");
        java.util.List<org.jsoup.nodes.Node> nodeList15 = element14.siblingNodes();
        boolean boolean16 = element14.isBlock();
        org.jsoup.select.Elements elements18 = element14.getElementsContainingText("<html>\n <head></head>\n <body>\n  &lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt; \n </body>\n</html><<html> <head></head> <body> </body> </html>></<html> <head></head> <body> </body> </html>>");
        java.lang.String str19 = element14.toString();
        org.jsoup.select.Elements elements21 = element14.getElementsContainingOwnText("<html>\n <head></head>\n <body>\n  &lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt; &lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;\n </body>\n</html>");
        org.jsoup.nodes.Element element23 = element14.appendElement("<html>\n <head></head>\n <body></body>\n</html><#root #document=\"&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;\">\n <html>\n  <head></head>\n  <body></body>\n </html>&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;\n</#root>");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(nodeList15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(elements18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\n<#root></#root>" + "'", str19, "\n<#root></#root>");
        org.junit.Assert.assertNotNull(elements21);
        org.junit.Assert.assertNotNull(element23);
    }

    @Test
    public void test3591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3591");
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
        org.jsoup.nodes.Element element18 = document3.appendElement("html");
        org.jsoup.nodes.Element element19 = document3.empty();
        org.jsoup.nodes.Element element20 = document3.firstElementSibling();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str5, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str6, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;<<html> <head></head> <body> </body> </html>></<html> <head></head> <body> </body> </html>>" + "'", str15, "<html>\n <head></head>\n <body></body>\n</html>&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;<<html> <head></head> <body> </body> </html>></<html> <head></head> <body> </body> </html>>");
        org.junit.Assert.assertNotNull(document16);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertNotNull(element20);
    }

    @Test
    public void test3592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3592");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        java.lang.String str5 = document3.html();
        java.lang.String str6 = document3.html();
        document3.title("<html>\n <head></head>\n <body></body>\n</html>");
        java.util.regex.Pattern pattern10 = null;
        org.jsoup.select.Elements elements11 = document3.getElementsByAttributeValueMatching("hi!", pattern10);
        org.jsoup.nodes.Element element13 = document3.after("");
        java.lang.String str14 = document3.val();
        java.lang.String str15 = document3.nodeName();
        org.jsoup.nodes.Document document16 = document3.ownerDocument();
        org.jsoup.nodes.Element element18 = document16.removeClass("hi!");
        org.jsoup.nodes.Element element20 = document16.after("\n<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.nodes.Element element22 = element20.append("<#root value=\"\" class=\"\"> <html> <head></head> <body></body> </html> </#root>");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str5, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str6, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "#document" + "'", str15, "#document");
        org.junit.Assert.assertNotNull(document16);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertNotNull(element22);
    }

    @Test
    public void test3593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3593");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.select.Elements elements6 = document3.getElementsByIndexLessThan((int) (short) 10);
        org.jsoup.nodes.Element element8 = document3.val("");
        org.jsoup.nodes.Element element10 = document3.after("#root");
        org.jsoup.nodes.Document document11 = document3.ownerDocument();
        org.jsoup.nodes.Element element14 = document3.attr("#root", "<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.nodes.Element element16 = element14.removeClass("");
        org.jsoup.select.Elements elements18 = element14.getElementsByAttribute("#document");
        java.lang.String str20 = element14.attr("");
        org.jsoup.nodes.Element element22 = element14.prependElement("<html>\n <head></head>\n <body></body>\n</html>&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;");
        org.jsoup.nodes.Element element24 = element14.prependElement("&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt;&lt;/body&gt; &lt;/html&gt;&amp;lt;html&amp;gt; &amp;lt;head&amp;gt;&amp;lt;/head&amp;gt; &amp;lt;body&amp;gt; &amp;lt;/body&amp;gt; &amp;lt;/html&amp;gt;<#root>\n <html>\n  <head></head>\n  <body></body>\n </html>\n</#root>\n<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.nodes.Element element25 = element14.nextElementSibling();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(document11);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(elements18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertNotNull(element24);
        org.junit.Assert.assertNotNull(element25);
    }

    @Test
    public void test3594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3594");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.select.Elements elements6 = document3.getElementsByIndexLessThan((int) (short) 10);
        org.jsoup.nodes.Element element8 = document3.val("");
        org.jsoup.nodes.Element element10 = document3.after("#root");
        java.lang.String str12 = document3.attr("<html>\n <head></head>\n <body>\n </body>\n</html>");
        java.util.regex.Pattern pattern14 = null;
        org.jsoup.select.Elements elements15 = document3.getElementsByAttributeValueMatching("<<html>\n <head></head>\n <body>\n </body>\n</html>\n<html> \n <head></head> \n <body>  \n </body>\n</html>></<html>\n <head></head>\n <body>\n </body>\n</html>\n<html> \n <head></head> \n <body>  \n </body>\n</html>>", pattern14);
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(elements15);
    }

    @Test
    public void test3595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3595");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.select.Elements elements6 = document3.getElementsByIndexLessThan((int) (short) 10);
        org.jsoup.nodes.Element element8 = document3.val("");
        org.jsoup.nodes.Element element10 = document3.after("#root");
        org.jsoup.nodes.Document document11 = document3.ownerDocument();
        org.jsoup.nodes.Element element14 = document3.attr("#root", "<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.select.Elements elements15 = element14.siblingElements();
        org.jsoup.nodes.Element element17 = element14.before("");
        boolean boolean18 = element14.isBlock();
        org.jsoup.nodes.Document document19 = element14.ownerDocument();
        org.jsoup.nodes.Node node20 = element14.previousSibling();
        org.jsoup.nodes.Element element21 = element14.lastElementSibling();
        org.jsoup.nodes.Element element23 = element21.val("<hi! <html>\n <head></head>\n <body></body>\n</html>=\"&lt;html&gt;\n &lt;head&gt;&lt;/head&gt;\n &lt;body&gt;\n &lt;/body&gt;\n&lt;/html&gt;\"></hi!>&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt;&lt;/body&gt; &lt;/html&gt;");
        java.util.List<org.jsoup.nodes.Node> nodeList24 = element21.siblingNodes();
        org.jsoup.nodes.Node node25 = element21.previousSibling();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(document11);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(document19);
        org.junit.Assert.assertNull(node20);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertNotNull(nodeList24);
        org.junit.Assert.assertNotNull(node25);
    }

    @Test
    public void test3596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3596");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.select.Elements elements6 = document3.getElementsByIndexLessThan((int) (short) 10);
        org.jsoup.nodes.Element element8 = document3.val("");
        java.lang.String str9 = document3.outerHtml();
        org.jsoup.select.Elements elements11 = document3.getElementsByClass("#root");
        java.lang.String str12 = document3.data();
        org.jsoup.nodes.Document document13 = document3.normalise();
        java.util.List<org.jsoup.nodes.Node> nodeList14 = document3.siblingNodes();
        org.jsoup.select.Elements elements16 = document3.getElementsMatchingText("<html>\n <head></head>\n <body></body>\n</html>&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;\n<html> \n <head></head> \n <body> &lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt; \n  <html> \n   <head></head> \n   <body>  \n    <html> \n     <head></head> \n     <body>  \n     </body>\n    </html>\n   </body>\n  </html>\n </body>\n</html>");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str9, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(document13);
        org.junit.Assert.assertNotNull(nodeList14);
        org.junit.Assert.assertNotNull(elements16);
    }

    @Test
    public void test3597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3597");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        java.lang.String str5 = document3.html();
        java.lang.String str6 = document3.html();
        java.util.Map<java.lang.String, java.lang.String> strMap7 = document3.dataset();
        org.jsoup.nodes.Element element9 = document3.appendText("<html>\n <head></head>\n <body>\n </body>\n</html>");
        org.jsoup.select.Elements elements12 = document3.getElementsByAttributeValueStarting("<html>\n <head></head>\n <body>\n </body>\n</html>", "<html> <head></head> <body> </body> </html>");
        org.jsoup.nodes.Element element13 = document3.nextElementSibling();
        org.jsoup.select.Elements elements15 = element13.getElementsByIndexLessThan((-1));
        org.jsoup.nodes.Element element18 = element13.attr("hi!", "hi!");
        org.jsoup.nodes.Node node19 = element18.previousSibling();
        org.jsoup.select.Elements elements22 = element18.getElementsByAttributeValueMatching("<#root>\n <html>\n  <head></head>\n  <body></body>\n </html>\n</#root>\n<html>\n <head></head>\n <body></body>\n</html>", "&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt;&lt;/body&gt; &lt;/html&gt;&amp;lt;html&amp;gt; &amp;lt;head&amp;gt;&amp;lt;/head&amp;gt; &amp;lt;body&amp;gt; &amp;lt;/body&amp;gt; &amp;lt;/html&amp;gt;<#root>\n <html>\n  <head></head>\n  <body></body>\n </html>\n</#root>\n<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str5, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str6, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNotNull(elements22);
    }

    @Test
    public void test3598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3598");
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
        org.jsoup.nodes.Element element29 = element27.prepend("<html>\n <head></head>\n <body></body>\n</html>&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;<<html> <head></head> <body> </body> </html>></<html> <head></head> <body> </body> </html>>");
        org.jsoup.nodes.Attributes attributes30 = element29.attributes();
        org.jsoup.nodes.Document document32 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document34 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element35 = document32.prependChild((org.jsoup.nodes.Node) document34);
        org.jsoup.select.Elements elements37 = document34.getElementsByIndexLessThan((int) (short) 10);
        org.jsoup.nodes.Element element39 = document34.val("");
        org.jsoup.nodes.Element element41 = document34.after("#root");
        org.jsoup.nodes.Document document42 = document34.ownerDocument();
        org.jsoup.nodes.Element element45 = document34.attr("#root", "<html>\n <head></head>\n <body></body>\n</html>");
        java.util.List<org.jsoup.nodes.Node> nodeList46 = document34.childNodes();
        java.lang.String str47 = document34.html();
        org.jsoup.nodes.Element element49 = document34.before("<html> <head></head> <body> </body> </html>");
        org.jsoup.nodes.Element element51 = document34.prependElement("<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.nodes.Element element52 = document34.body();
        org.jsoup.nodes.Element element53 = document34.nextElementSibling();
        java.lang.String str54 = element53.tagName();
        boolean boolean55 = element29.equals((java.lang.Object) element53);
        org.jsoup.nodes.Element element57 = element29.appendText("<head></head>\n<body></body>");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(document13);
        org.junit.Assert.assertNotNull(document15);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(elements20);
        org.junit.Assert.assertNotNull(elements22);
        org.junit.Assert.assertNotNull(strSet23);
        org.junit.Assert.assertNotNull(element24);
        org.junit.Assert.assertNotNull(elements26);
        org.junit.Assert.assertNotNull(element27);
        org.junit.Assert.assertNotNull(element29);
        org.junit.Assert.assertNotNull(attributes30);
        org.junit.Assert.assertNotNull(document32);
        org.junit.Assert.assertNotNull(document34);
        org.junit.Assert.assertNotNull(element35);
        org.junit.Assert.assertNotNull(elements37);
        org.junit.Assert.assertNotNull(element39);
        org.junit.Assert.assertNotNull(element41);
        org.junit.Assert.assertNotNull(document42);
        org.junit.Assert.assertNotNull(element45);
        org.junit.Assert.assertNotNull(nodeList46);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str47, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertNotNull(element49);
        org.junit.Assert.assertNotNull(element51);
        org.junit.Assert.assertNotNull(element52);
        org.junit.Assert.assertNotNull(element53);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "html" + "'", str54, "html");
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(element57);
    }

    @Test
    public void test3599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3599");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.select.Elements elements6 = document3.getElementsByIndexLessThan((int) (short) 10);
        org.jsoup.nodes.Element element8 = document3.val("");
        org.jsoup.nodes.Element element10 = document3.after("#root");
        org.jsoup.nodes.Document document11 = document3.ownerDocument();
        org.jsoup.nodes.Element element14 = document3.attr("#root", "<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.select.Elements elements15 = element14.siblingElements();
        org.jsoup.nodes.Element element17 = element14.before("");
        boolean boolean18 = element14.isBlock();
        org.jsoup.nodes.Document document19 = element14.ownerDocument();
        java.lang.String str20 = element14.ownText();
        org.jsoup.nodes.Document document22 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document24 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element25 = document22.prependChild((org.jsoup.nodes.Node) document24);
        org.jsoup.select.Elements elements27 = document24.getElementsByIndexLessThan((int) (short) 10);
        org.jsoup.nodes.Element element29 = document24.val("");
        org.jsoup.nodes.Element element31 = document24.after("#root");
        org.jsoup.select.Elements elements34 = document24.getElementsByAttributeValueMatching("<html>\n <head></head>\n <body></body>\n</html>&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;", "<html>\n <head></head>\n <body></body>\n</html>&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;");
        org.jsoup.parser.Tag tag35 = document24.tag();
        org.jsoup.nodes.Element element36 = document24.firstElementSibling();
        org.jsoup.nodes.Element element37 = element14.appendChild((org.jsoup.nodes.Node) document24);
        org.jsoup.parser.Tag tag38 = element37.tag();
        org.jsoup.select.Elements elements39 = element37.siblingElements();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(document11);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(document19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(document22);
        org.junit.Assert.assertNotNull(document24);
        org.junit.Assert.assertNotNull(element25);
        org.junit.Assert.assertNotNull(elements27);
        org.junit.Assert.assertNotNull(element29);
        org.junit.Assert.assertNotNull(element31);
        org.junit.Assert.assertNotNull(elements34);
        org.junit.Assert.assertNotNull(tag35);
        org.junit.Assert.assertNotNull(element36);
        org.junit.Assert.assertNotNull(element37);
        org.junit.Assert.assertNotNull(tag38);
        org.junit.Assert.assertNotNull(elements39);
    }

    @Test
    public void test3600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3600");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Document.OutputSettings outputSettings2 = document1.outputSettings();
        java.lang.String str3 = document1.className();
        org.junit.Assert.assertNotNull(outputSettings2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test3601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3601");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        java.lang.String str5 = document3.html();
        java.lang.String str6 = document3.html();
        java.util.Map<java.lang.String, java.lang.String> strMap7 = document3.dataset();
        org.jsoup.nodes.Element element9 = document3.appendText("<html>\n <head></head>\n <body>\n </body>\n</html>");
        org.jsoup.select.Elements elements12 = document3.getElementsByAttributeValueStarting("<html>\n <head></head>\n <body>\n </body>\n</html>", "<html> <head></head> <body> </body> </html>");
        org.jsoup.nodes.Element element13 = document3.body();
        org.jsoup.nodes.Element element14 = document3.nextElementSibling();
        org.jsoup.nodes.Element element16 = document3.removeClass("<html>\n <head></head>\n <body>\n  &lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt; &lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;\n </body>\n</html>\n<html> \n <head></head> \n <body>  \n </body>\n</html>");
        org.jsoup.select.Elements elements18 = element16.getElementsMatchingOwnText("<html> <head></head> <body> </body> </html>");
        org.jsoup.parser.Tag tag19 = element16.tag();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str5, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str6, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(elements18);
        org.junit.Assert.assertNotNull(tag19);
    }

    @Test
    public void test3602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3602");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.select.Elements elements6 = document3.getElementsByIndexLessThan((int) (short) 10);
        org.jsoup.select.Elements elements7 = document3.siblingElements();
        org.jsoup.nodes.Element element9 = document3.removeClass("<html>\n <head></head>\n <body>\n </body>\n</html>\n<html> \n <head></head> \n <body>  \n </body>\n</html>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements12 = document3.getElementsByAttributeValueEnding("#root", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(element9);
    }

    @Test
    public void test3603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3603");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.select.Elements elements6 = document3.getElementsByIndexLessThan((int) (short) 10);
        java.util.Set<java.lang.String> strSet7 = document3.classNames();
        org.jsoup.nodes.Element element10 = document3.attr("<html>\n <head></head>\n <body></body>\n</html>", "#root");
        org.jsoup.nodes.Document document12 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document14 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element15 = document12.prependChild((org.jsoup.nodes.Node) document14);
        org.jsoup.select.Elements elements17 = document14.getElementsByIndexLessThan((int) (short) 10);
        java.util.Set<java.lang.String> strSet18 = document14.classNames();
        java.lang.Integer int19 = document14.siblingIndex();
        org.jsoup.nodes.Element element20 = element10.appendChild((org.jsoup.nodes.Node) document14);
        org.jsoup.select.Elements elements22 = element10.getElementsByTag("hi!");
        org.jsoup.nodes.Element element24 = element10.prependText("<html> <head></head> <body> </body> </html>");
        org.jsoup.nodes.Document document26 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document28 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element29 = document26.prependChild((org.jsoup.nodes.Node) document28);
        org.jsoup.nodes.Element element30 = document26.body();
        org.jsoup.select.Elements elements32 = document26.select("#root");
        org.jsoup.nodes.Element element33 = document26.empty();
        java.lang.String str34 = document26.className();
        org.jsoup.nodes.Element element35 = element10.appendChild((org.jsoup.nodes.Node) document26);
        org.jsoup.nodes.Element element37 = document26.appendText("<html> <head></head> <body></body> </html>");
        org.jsoup.nodes.Element element39 = document26.prependElement("<html>\n <head></head>\n <body>\n </body>\n</html>");
        java.util.Set<java.lang.String> strSet40 = document26.classNames();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(document12);
        org.junit.Assert.assertNotNull(document14);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(elements17);
        org.junit.Assert.assertNotNull(strSet18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertNotNull(elements22);
        org.junit.Assert.assertNotNull(element24);
        org.junit.Assert.assertNotNull(document26);
        org.junit.Assert.assertNotNull(document28);
        org.junit.Assert.assertNotNull(element29);
        org.junit.Assert.assertNotNull(element30);
        org.junit.Assert.assertNotNull(elements32);
        org.junit.Assert.assertNotNull(element33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertNotNull(element35);
        org.junit.Assert.assertNotNull(element37);
        org.junit.Assert.assertNotNull(element39);
        org.junit.Assert.assertNotNull(strSet40);
    }

    @Test
    public void test3604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3604");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        java.lang.String str5 = document1.tagName();
        org.jsoup.nodes.Element element6 = document1.head();
        java.lang.Integer int7 = element6.siblingIndex();
        org.jsoup.nodes.Element element10 = element6.attr("<html> <head></head> <body></body> </html>", "<html>\n <head>\n  <title>&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;</title>\n </head>\n <body></body>\n</html>");
        org.jsoup.nodes.Document document12 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document14 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element15 = document12.prependChild((org.jsoup.nodes.Node) document14);
        java.lang.String str16 = document12.tagName();
        org.jsoup.nodes.Document.OutputSettings outputSettings17 = document12.new OutputSettings();
        org.jsoup.nodes.Document document18 = document12.normalise();
        org.jsoup.nodes.Element element20 = document12.appendElement("<html>\n <head>\n  <title>&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;</title>\n </head>\n <body></body>\n</html>");
        org.jsoup.nodes.Element element22 = document12.prepend("<html>\n <head>\n  <title>&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;</title>\n </head>\n <body></body>\n</html>");
        org.jsoup.nodes.Element element23 = element10.appendChild((org.jsoup.nodes.Node) document12);
        java.lang.String str24 = document12.toString();
        boolean boolean25 = document12.hasText();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#root" + "'", str5, "#root");
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(document12);
        org.junit.Assert.assertNotNull(document14);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "#root" + "'", str16, "#root");
        org.junit.Assert.assertNotNull(document18);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "<html> \n <head> \n  <title>&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;</title> \n </head> \n <body> \n </body>\n</html><#root>\n <html>\n  <head></head>\n  <body></body>\n </html>\n</#root>\n<html>\n <head></head>\n <body></body>\n</html><<html>\n <head>\n  <title>&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;</title>\n </head>\n <body></body>\n</html>></<html>\n <head>\n  <title>&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;</title>\n </head>\n <body></body>\n</html>>" + "'", str24, "<html> \n <head> \n  <title>&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;</title> \n </head> \n <body> \n </body>\n</html><#root>\n <html>\n  <head></head>\n  <body></body>\n </html>\n</#root>\n<html>\n <head></head>\n <body></body>\n</html><<html>\n <head>\n  <title>&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;</title>\n </head>\n <body></body>\n</html>></<html>\n <head>\n  <title>&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;</title>\n </head>\n <body></body>\n</html>>");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test3605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3605");
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
        org.jsoup.nodes.Element element17 = document3.val("<html>\n <head></head>\n <body>\n </body>\n</html>");
        org.jsoup.nodes.Document document19 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document21 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element22 = document19.prependChild((org.jsoup.nodes.Node) document21);
        java.lang.String str23 = document21.html();
        java.lang.String str24 = document21.html();
        java.util.Map<java.lang.String, java.lang.String> strMap25 = document21.dataset();
        org.jsoup.nodes.Element element27 = document21.appendText("<html>\n <head></head>\n <body>\n </body>\n</html>");
        org.jsoup.select.Elements elements30 = document21.getElementsByAttributeValueStarting("<html>\n <head></head>\n <body>\n </body>\n</html>", "<html> <head></head> <body> </body> </html>");
        java.lang.String str31 = document21.outerHtml();
        org.jsoup.nodes.Element element33 = document21.prepend("<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.nodes.Element element35 = document21.toggleClass("<html>\n <head></head>\n <body>\n </body>\n</html>");
        document3.replaceWith((org.jsoup.nodes.Node) document21);
        org.jsoup.nodes.Document document38 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document40 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element41 = document38.prependChild((org.jsoup.nodes.Node) document40);
        org.jsoup.select.Elements elements43 = document40.getElementsByIndexLessThan((int) (short) 10);
        org.jsoup.nodes.Element element45 = document40.val("");
        java.lang.String str46 = document40.outerHtml();
        org.jsoup.select.Elements elements48 = document40.getElementsByClass("#root");
        org.jsoup.select.Elements elements50 = document40.getElementsByIndexGreaterThan(10);
        java.lang.Integer int51 = document40.elementSiblingIndex();
        org.jsoup.nodes.Element element52 = document40.body();
        org.jsoup.nodes.Element element54 = element52.val("\n<body></body>");
        org.jsoup.select.Elements elements55 = element52.getAllElements();
        org.jsoup.nodes.Element element57 = element52.appendText("");
        org.jsoup.select.Elements elements58 = element57.children();
        org.jsoup.nodes.Attributes attributes59 = element57.attributes();
        org.jsoup.nodes.Element element60 = document21.prependChild((org.jsoup.nodes.Node) element57);
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str5, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str6, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;" + "'", str13, "<html>\n <head></head>\n <body></body>\n</html>&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;");
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(document19);
        org.junit.Assert.assertNotNull(document21);
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str23, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str24, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertNotNull(strMap25);
        org.junit.Assert.assertNotNull(element27);
        org.junit.Assert.assertNotNull(elements30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;" + "'", str31, "<html>\n <head></head>\n <body></body>\n</html>&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;");
        org.junit.Assert.assertNotNull(element33);
        org.junit.Assert.assertNotNull(element35);
        org.junit.Assert.assertNotNull(document38);
        org.junit.Assert.assertNotNull(document40);
        org.junit.Assert.assertNotNull(element41);
        org.junit.Assert.assertNotNull(elements43);
        org.junit.Assert.assertNotNull(element45);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str46, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertNotNull(elements48);
        org.junit.Assert.assertNotNull(elements50);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertNotNull(element52);
        org.junit.Assert.assertNotNull(element54);
        org.junit.Assert.assertNotNull(elements55);
        org.junit.Assert.assertNotNull(element57);
        org.junit.Assert.assertNotNull(elements58);
        org.junit.Assert.assertNotNull(attributes59);
        org.junit.Assert.assertNotNull(element60);
    }

    @Test
    public void test3606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3606");
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
        org.jsoup.nodes.Document.OutputSettings outputSettings17 = document3.outputSettings();
        org.jsoup.nodes.Element element19 = document3.html("<#root value=\"\" #root=\"&lt;html&gt;\n &lt;head&gt;&lt;/head&gt;\n &lt;body&gt;&lt;/body&gt;\n&lt;/html&gt;\" class=\"\">\n <html>\n  <head></head>\n  <body></body>\n </html>\n</#root>#root\n<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.nodes.Element element21 = element19.removeClass("<#root>\n <html>\n  <head></head>\n  <body></body>\n </html>\n</#root>\n<html>\n <head></head>\n <body></body>\n</html>");
        java.lang.Integer int22 = element21.elementSiblingIndex();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(tag5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(outputSettings10);
        org.junit.Assert.assertNotNull(document12);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(outputSettings17);
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test3607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3607");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.select.Elements elements6 = document3.getElementsByIndexLessThan((int) (short) 10);
        java.util.Set<java.lang.String> strSet7 = document3.classNames();
        org.jsoup.nodes.Element element10 = document3.attr("<html>\n <head></head>\n <body></body>\n</html>", "#root");
        org.jsoup.nodes.Document document12 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document14 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element15 = document12.prependChild((org.jsoup.nodes.Node) document14);
        org.jsoup.select.Elements elements17 = document14.getElementsByIndexLessThan((int) (short) 10);
        java.util.Set<java.lang.String> strSet18 = document14.classNames();
        java.lang.Integer int19 = document14.siblingIndex();
        org.jsoup.nodes.Element element20 = element10.appendChild((org.jsoup.nodes.Node) document14);
        org.jsoup.select.Elements elements22 = element10.getElementsByTag("hi!");
        org.jsoup.nodes.Element element24 = element10.prependText("<html> <head></head> <body> </body> </html>");
        org.jsoup.nodes.Document document26 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document28 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element29 = document26.prependChild((org.jsoup.nodes.Node) document28);
        org.jsoup.nodes.Element element30 = document26.body();
        org.jsoup.select.Elements elements32 = document26.select("#root");
        org.jsoup.nodes.Element element33 = document26.empty();
        java.lang.String str34 = document26.className();
        org.jsoup.nodes.Element element35 = element10.appendChild((org.jsoup.nodes.Node) document26);
        org.jsoup.nodes.Element element37 = document26.appendText("<html> <head></head> <body></body> </html>");
        java.lang.String str38 = document26.id();
        org.jsoup.nodes.Document document39 = document26.normalise();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(document12);
        org.junit.Assert.assertNotNull(document14);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(elements17);
        org.junit.Assert.assertNotNull(strSet18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertNotNull(elements22);
        org.junit.Assert.assertNotNull(element24);
        org.junit.Assert.assertNotNull(document26);
        org.junit.Assert.assertNotNull(document28);
        org.junit.Assert.assertNotNull(element29);
        org.junit.Assert.assertNotNull(element30);
        org.junit.Assert.assertNotNull(elements32);
        org.junit.Assert.assertNotNull(element33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertNotNull(element35);
        org.junit.Assert.assertNotNull(element37);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertNotNull(document39);
    }

    @Test
    public void test3608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3608");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.select.Elements elements6 = document3.getElementsByIndexLessThan((int) (short) 10);
        org.jsoup.nodes.Element element8 = document3.val("");
        java.lang.String str9 = document3.outerHtml();
        org.jsoup.select.Elements elements11 = document3.getElementsByClass("#root");
        java.lang.String str12 = document3.tagName();
        boolean boolean13 = document3.isBlock();
        org.jsoup.select.Elements elements15 = document3.getElementsByAttributeStarting("hi!");
        org.jsoup.nodes.Document document17 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document19 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element20 = document17.prependChild((org.jsoup.nodes.Node) document19);
        java.lang.String str21 = document19.html();
        java.lang.String str22 = document19.html();
        java.util.Map<java.lang.String, java.lang.String> strMap23 = document19.dataset();
        org.jsoup.nodes.Element element25 = document19.appendElement("hi!");
        org.jsoup.select.Elements elements27 = document19.getElementsByClass("<html> <head></head> <body> </body> </html>");
        document19.title("#document");
        org.jsoup.nodes.Element element31 = document19.text("<html>\n <head></head>\n <body></body>\n</html>&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;");
        java.util.regex.Pattern pattern33 = null;
        org.jsoup.select.Elements elements34 = document19.getElementsByAttributeValueMatching("", pattern33);
        document19.title("<#root value=\"&lt;html&gt;\n &lt;head&gt;&lt;/head&gt;\n &lt;body&gt;&lt;/body&gt;\n&lt;/html&gt;\">\n <html>\n  <head></head>\n  <body></body>\n </html>\n</#root>#root\n<html>\n <head></head>\n <body></body>\n</html>");
        boolean boolean37 = document3.equals((java.lang.Object) "<#root value=\"&lt;html&gt;\n &lt;head&gt;&lt;/head&gt;\n &lt;body&gt;&lt;/body&gt;\n&lt;/html&gt;\">\n <html>\n  <head></head>\n  <body></body>\n </html>\n</#root>#root\n<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.nodes.Document document38 = document3.normalise();
        org.jsoup.select.Elements elements39 = document3.getAllElements();
        java.lang.String str40 = document3.val();
        java.lang.String str41 = document3.className();
        org.jsoup.nodes.Document document43 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document45 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element46 = document43.prependChild((org.jsoup.nodes.Node) document45);
        org.jsoup.select.Elements elements48 = document45.getElementsByIndexLessThan((int) (short) 10);
        org.jsoup.nodes.Element element50 = document45.val("");
        org.jsoup.nodes.Element element52 = document45.after("#root");
        org.jsoup.nodes.Document document53 = document45.ownerDocument();
        org.jsoup.nodes.Element element56 = document45.attr("#root", "<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.select.Elements elements57 = element56.siblingElements();
        org.jsoup.nodes.Element element59 = element56.before("");
        boolean boolean60 = element56.isBlock();
        org.jsoup.nodes.Document document61 = element56.ownerDocument();
        java.util.Set<java.lang.String> strSet62 = document61.classNames();
        org.jsoup.nodes.Element element63 = document3.classNames(strSet62);
        org.jsoup.select.Elements elements65 = document3.getElementsMatchingText("<html> \n <head> \n  <title>&lt;html&gt;\n &lt;head&gt;&lt;/head&gt;\n &lt;body&gt;&lt;/body&gt;\n&lt;/html&gt;</title> \n </head> \n <body> \n </body>\n</html>");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str9, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "#root" + "'", str12, "#root");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertNotNull(document17);
        org.junit.Assert.assertNotNull(document19);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str21, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str22, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertNotNull(strMap23);
        org.junit.Assert.assertNotNull(element25);
        org.junit.Assert.assertNotNull(elements27);
        org.junit.Assert.assertNotNull(element31);
        org.junit.Assert.assertNotNull(elements34);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(document38);
        org.junit.Assert.assertNotNull(elements39);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertNotNull(document43);
        org.junit.Assert.assertNotNull(document45);
        org.junit.Assert.assertNotNull(element46);
        org.junit.Assert.assertNotNull(elements48);
        org.junit.Assert.assertNotNull(element50);
        org.junit.Assert.assertNotNull(element52);
        org.junit.Assert.assertNotNull(document53);
        org.junit.Assert.assertNotNull(element56);
        org.junit.Assert.assertNotNull(elements57);
        org.junit.Assert.assertNotNull(element59);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(document61);
        org.junit.Assert.assertNotNull(strSet62);
        org.junit.Assert.assertNotNull(element63);
        org.junit.Assert.assertNotNull(elements65);
    }

    @Test
    public void test3609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3609");
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
        org.jsoup.nodes.Element element17 = document3.text("<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.nodes.Element element19 = document3.wrap("<html>\n <head></head>\n <body></body>\n</html>&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;<<html> <head></head> <body> </body> </html>></<html> <head></head> <body> </body> </html>>");
        org.jsoup.select.Elements elements21 = element19.getElementsByAttribute("&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt;&lt;/body&gt; &lt;/html&gt;&amp;lt;html&amp;gt; &amp;lt;head&amp;gt;&amp;lt;/head&amp;gt; &amp;lt;body&amp;gt; &amp;lt;/body&amp;gt; &amp;lt;/html&amp;gt;<#root>\n <html>\n  <head></head>\n  <body></body>\n </html>\n</#root>\n<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.nodes.Element element23 = element19.removeClass("<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.nodes.Element element24 = element23.empty();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node26 = element24.childNode((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str5, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str6, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;" + "'", str13, "<html>\n <head></head>\n <body></body>\n</html>&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;");
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertNotNull(elements21);
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertNotNull(element24);
    }

    @Test
    public void test3610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3610");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        java.lang.String str5 = document3.html();
        java.lang.String str6 = document3.html();
        java.util.Map<java.lang.String, java.lang.String> strMap7 = document3.dataset();
        org.jsoup.nodes.Element element9 = document3.appendText("<html>\n <head></head>\n <body>\n </body>\n</html>");
        org.jsoup.select.Elements elements12 = document3.getElementsByAttributeValueStarting("<html>\n <head></head>\n <body>\n </body>\n</html>", "<html> <head></head> <body> </body> </html>");
        org.jsoup.select.Elements elements15 = document3.getElementsByAttributeValueMatching("<html> <head></head> <body> </body> </html>", "hi!");
        org.jsoup.nodes.Element element17 = document3.val("<html>\n <head></head>\n <body>\n </body>\n</html>");
        org.jsoup.nodes.Document document18 = document3.ownerDocument();
        org.jsoup.nodes.Element element19 = document18.empty();
        org.jsoup.nodes.Element element21 = document18.val("<html>\n <head></head>\n <body>\n </body>\n</html>\n<html> \n <head></head> \n <body>  \n </body>\n</html>");
        org.jsoup.select.Elements elements23 = element21.getElementsByIndexGreaterThan((int) (byte) -1);
        org.jsoup.nodes.Document document25 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document27 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element28 = document25.prependChild((org.jsoup.nodes.Node) document27);
        java.lang.String str29 = document27.html();
        java.lang.String str30 = document27.html();
        java.util.Map<java.lang.String, java.lang.String> strMap31 = document27.dataset();
        org.jsoup.nodes.Element element33 = document27.appendText("<html>\n <head></head>\n <body>\n </body>\n</html>");
        org.jsoup.select.Elements elements36 = document27.getElementsByAttributeValueStarting("<html>\n <head></head>\n <body>\n </body>\n</html>", "<html> <head></head> <body> </body> </html>");
        java.lang.String str37 = document27.outerHtml();
        org.jsoup.nodes.Element element39 = document27.prepend("<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.nodes.Document document41 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document43 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element44 = document41.prependChild((org.jsoup.nodes.Node) document43);
        org.jsoup.nodes.Element element45 = document41.body();
        org.jsoup.select.Elements elements47 = document41.select("#root");
        org.jsoup.nodes.Element element48 = document41.empty();
        java.lang.String str49 = document41.html();
        org.jsoup.nodes.Element element50 = document27.prependChild((org.jsoup.nodes.Node) document41);
        org.jsoup.nodes.Element element52 = document41.appendText("<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.nodes.Element element54 = element52.removeClass("<head></head>\n<body></body>");
        org.jsoup.nodes.Element element56 = element52.html("<html>\n <head></head>\n <body></body>\n</html>&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt; <html> <head></head> <body></body> </html> <html> <head></head> <body> </body> </html>");
        org.jsoup.nodes.Element element57 = element56.previousElementSibling();
        org.jsoup.nodes.Element element58 = element21.prependChild((org.jsoup.nodes.Node) element56);
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str5, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str6, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(document18);
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertNotNull(elements23);
        org.junit.Assert.assertNotNull(document25);
        org.junit.Assert.assertNotNull(document27);
        org.junit.Assert.assertNotNull(element28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str29, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str30, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertNotNull(strMap31);
        org.junit.Assert.assertNotNull(element33);
        org.junit.Assert.assertNotNull(elements36);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;" + "'", str37, "<html>\n <head></head>\n <body></body>\n</html>&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;");
        org.junit.Assert.assertNotNull(element39);
        org.junit.Assert.assertNotNull(document41);
        org.junit.Assert.assertNotNull(document43);
        org.junit.Assert.assertNotNull(element44);
        org.junit.Assert.assertNotNull(element45);
        org.junit.Assert.assertNotNull(elements47);
        org.junit.Assert.assertNotNull(element48);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertNotNull(element50);
        org.junit.Assert.assertNotNull(element52);
        org.junit.Assert.assertNotNull(element54);
        org.junit.Assert.assertNotNull(element56);
        org.junit.Assert.assertNull(element57);
        org.junit.Assert.assertNotNull(element58);
    }

    @Test
    public void test3611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3611");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("#root");
        org.jsoup.nodes.Document.OutputSettings outputSettings2 = document1.outputSettings();
        java.nio.charset.Charset charset3 = outputSettings2.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings5 = outputSettings2.prettyPrint(false);
        java.nio.charset.CharsetEncoder charsetEncoder6 = outputSettings5.encoder();
        org.jsoup.nodes.Entities.EscapeMode escapeMode7 = outputSettings5.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = outputSettings5.indentAmount((int) ' ');
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(outputSettings2);
        org.junit.Assert.assertNotNull(charset3);
        org.junit.Assert.assertNotNull(outputSettings5);
        org.junit.Assert.assertNotNull(charsetEncoder6);
        org.junit.Assert.assertTrue("'" + escapeMode7 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode7.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings9);
    }

    @Test
    public void test3612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3612");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        java.lang.String str5 = document3.html();
        java.lang.String str6 = document3.html();
        document3.title("<html>\n <head></head>\n <body></body>\n</html>");
        java.util.regex.Pattern pattern10 = null;
        org.jsoup.select.Elements elements11 = document3.getElementsByAttributeValueMatching("hi!", pattern10);
        org.jsoup.nodes.Element element13 = document3.after("");
        org.jsoup.nodes.Document.OutputSettings outputSettings14 = document3.outputSettings();
        org.jsoup.nodes.Element element16 = document3.createElement("<html> <head></head> <body> </body> </html>");
        java.util.regex.Pattern pattern18 = null;
        org.jsoup.select.Elements elements19 = document3.getElementsByAttributeValueMatching("<html>\n <head></head>\n <body></body>\n</html>&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt; <html> <head></head> <body></body> </html> <html> <head></head> <body> </body> </html>", pattern18);
        org.jsoup.nodes.Element element20 = document3.empty();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str5, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str6, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(outputSettings14);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(elements19);
        org.junit.Assert.assertNotNull(element20);
    }

    @Test
    public void test3613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3613");
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
        document3.title("<html> <head></head> <body> </body> </html>");
        org.jsoup.nodes.Element element18 = document3.head();
        java.lang.String str19 = document3.html();
        org.jsoup.nodes.Document document21 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document23 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element24 = document21.prependChild((org.jsoup.nodes.Node) document23);
        org.jsoup.select.Elements elements26 = document23.getElementsByIndexLessThan((int) (short) 10);
        org.jsoup.nodes.Element element28 = document23.val("");
        org.jsoup.nodes.Element element30 = element28.val("hi!");
        org.jsoup.select.Elements elements31 = element28.siblingElements();
        org.jsoup.nodes.Element element33 = element28.prepend("");
        boolean boolean35 = element33.hasClass("<html>\n <head></head>\n <body>\n </body>\n</html>");
        org.jsoup.nodes.Element element37 = element33.before("<html> <head></head> <body> </body> </html>");
        org.jsoup.nodes.Document document39 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document41 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element42 = document39.prependChild((org.jsoup.nodes.Node) document41);
        java.util.Set<java.lang.String> strSet43 = element42.classNames();
        org.jsoup.nodes.Element element44 = element37.classNames(strSet43);
        org.jsoup.nodes.Element element45 = document3.classNames(strSet43);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node47 = element45.childNode((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 52 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str9, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "<html>\n <head>\n  <title>&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;</title>\n </head>\n <body></body>\n</html>" + "'", str19, "<html>\n <head>\n  <title>&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;</title>\n </head>\n <body></body>\n</html>");
        org.junit.Assert.assertNotNull(document21);
        org.junit.Assert.assertNotNull(document23);
        org.junit.Assert.assertNotNull(element24);
        org.junit.Assert.assertNotNull(elements26);
        org.junit.Assert.assertNotNull(element28);
        org.junit.Assert.assertNotNull(element30);
        org.junit.Assert.assertNotNull(elements31);
        org.junit.Assert.assertNotNull(element33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(element37);
        org.junit.Assert.assertNotNull(document39);
        org.junit.Assert.assertNotNull(document41);
        org.junit.Assert.assertNotNull(element42);
        org.junit.Assert.assertNotNull(strSet43);
        org.junit.Assert.assertNotNull(element44);
        org.junit.Assert.assertNotNull(element45);
    }

    @Test
    public void test3614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3614");
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
        java.lang.String str21 = document3.absUrl("#root");
        org.jsoup.nodes.Element element24 = document3.attr(" hi!", "<html>\n <head></head>\n <body></body>\n</html>&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;");
        org.jsoup.nodes.Element element26 = document3.createElement("<html>\n <head></head>\n <body></body>\n</html>html");
        document3.remove();
        java.util.regex.Pattern pattern28 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements29 = document3.getElementsMatchingOwnText(pattern28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str5, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str6, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(elements17);
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(element24);
        org.junit.Assert.assertNotNull(element26);
    }

    @Test
    public void test3615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3615");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.select.Elements elements6 = document3.getElementsByIndexLessThan((int) (short) 10);
        org.jsoup.nodes.Element element8 = document3.val("");
        org.jsoup.nodes.Element element10 = element8.val("hi!");
        org.jsoup.select.Elements elements11 = element8.siblingElements();
        org.jsoup.nodes.Element element13 = element8.prepend("");
        boolean boolean15 = element13.hasClass("<html>\n <head></head>\n <body>\n </body>\n</html>");
        org.jsoup.nodes.Element element17 = element13.before("<html> <head></head> <body> </body> </html>");
        org.jsoup.nodes.Document document19 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document21 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element22 = document19.prependChild((org.jsoup.nodes.Node) document21);
        java.util.Set<java.lang.String> strSet23 = element22.classNames();
        org.jsoup.nodes.Element element24 = element17.classNames(strSet23);
        org.jsoup.nodes.Element element26 = element24.prepend("\n<head>\n #document \n <html> \n  <head></head> \n  <body> &lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;\n  </body>\n </html>\n</head>");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(document19);
        org.junit.Assert.assertNotNull(document21);
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertNotNull(strSet23);
        org.junit.Assert.assertNotNull(element24);
        org.junit.Assert.assertNotNull(element26);
    }

    @Test
    public void test3616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3616");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.select.Elements elements6 = document3.getElementsByIndexLessThan((int) (short) 10);
        org.jsoup.nodes.Element element8 = document3.val("");
        java.lang.String str9 = document3.outerHtml();
        org.jsoup.select.Elements elements11 = document3.getElementsByClass("#root");
        java.lang.String str12 = document3.tagName();
        java.lang.Integer int13 = document3.elementSiblingIndex();
        org.jsoup.select.Elements elements15 = document3.getElementsMatchingText("hi!");
        org.jsoup.select.Elements elements17 = document3.getElementsByIndexEquals((int) '#');
        org.jsoup.select.Elements elements19 = document3.getElementsContainingOwnText("<html>\n <head></head>\n <body></body>\n</html>&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;<<html> <head></head> <body> </body> </html>></<html> <head></head> <body> </body> </html>>");
        java.util.regex.Pattern pattern21 = null;
        org.jsoup.select.Elements elements22 = document3.getElementsByAttributeValueMatching("<html>\n <head></head>\n <body></body>\n</html>&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;<<html> <head></head> <body> </body> </html>></<html> <head></head> <body> </body> </html>>", pattern21);
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str9, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "#root" + "'", str12, "#root");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertNotNull(elements17);
        org.junit.Assert.assertNotNull(elements19);
        org.junit.Assert.assertNotNull(elements22);
    }

    @Test
    public void test3617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3617");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("<html>\n <head></head>\n <body></body>\n</html>&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;");
        org.jsoup.nodes.Document.OutputSettings outputSettings2 = document1.outputSettings();
        org.jsoup.nodes.Document document3 = document1.normalise();
        java.lang.String str4 = document3.text();
        org.jsoup.select.Elements elements6 = document3.getElementsByIndexLessThan(32);
        org.jsoup.select.Elements elements8 = document3.getElementsContainingOwnText("#document\n<html>\n <head></head>\n <body></body>\n</html>#document \n<html> \n <head></head> \n <body> \n </body>\n</html>");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(outputSettings2);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(elements8);
    }

    @Test
    public void test3618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3618");
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
        org.jsoup.nodes.Element element17 = document3.text("<html>\n <head>\n  <title>&lt;html&gt;\n &lt;head&gt;&lt;/head&gt;\n &lt;body&gt;&lt;/body&gt;\n&lt;/html&gt;</title>\n </head>\n <body></body>\n</html>");
        org.jsoup.nodes.Element element18 = document3.previousElementSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element19 = element18.parent();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str9, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "#root" + "'", str14, "#root");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNull(element18);
    }

    @Test
    public void test3619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3619");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.select.Elements elements6 = document3.getElementsByIndexLessThan((int) (short) 10);
        org.jsoup.nodes.Document document8 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document10 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element11 = document8.prependChild((org.jsoup.nodes.Node) document10);
        org.jsoup.select.Elements elements13 = document10.getElementsByIndexLessThan((int) (short) 10);
        boolean boolean14 = document3.equals((java.lang.Object) (short) 10);
        org.jsoup.nodes.Node node15 = document3.nextSibling();
        org.jsoup.nodes.Element element16 = document3.firstElementSibling();
        org.jsoup.nodes.Element element18 = document3.text("<html>\n <head>\n  <title>&lt;html&gt;\n &lt;head&gt;&lt;/head&gt;\n &lt;body&gt;&lt;/body&gt;\n&lt;/html&gt;</title>\n </head>\n <body></body>\n</html>");
        org.jsoup.nodes.Element element20 = element18.before("#root");
        org.jsoup.nodes.Node node21 = element18.previousSibling();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(document8);
        org.junit.Assert.assertNotNull(document10);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertNotNull(node21);
    }

    @Test
    public void test3620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3620");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.select.Elements elements6 = document3.getElementsByIndexLessThan((int) (short) 10);
        org.jsoup.nodes.Element element8 = document3.val("");
        org.jsoup.nodes.Element element11 = element8.attr("<html>\n <head></head>\n <body></body>\n</html>", "<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.nodes.Node node12 = element8.previousSibling();
        org.jsoup.nodes.Document document14 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document16 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element17 = document14.prependChild((org.jsoup.nodes.Node) document16);
        java.lang.String str18 = document16.html();
        java.lang.String str19 = document16.html();
        java.util.Map<java.lang.String, java.lang.String> strMap20 = document16.dataset();
        org.jsoup.nodes.Element element22 = document16.appendElement("hi!");
        org.jsoup.select.Elements elements24 = document16.getElementsByClass("<html> <head></head> <body> </body> </html>");
        org.jsoup.nodes.Element element26 = document16.prepend("#document");
        org.jsoup.nodes.Element element28 = document16.prependText("<html>\n <head></head>\n <body>\n </body>\n</html>\n<html> \n <head></head> \n <body>  \n </body>\n</html>");
        org.jsoup.nodes.Document document29 = document16.normalise();
        org.jsoup.nodes.Element element30 = element8.appendChild((org.jsoup.nodes.Node) document29);
        java.lang.String str31 = element8.text();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertNotNull(document14);
        org.junit.Assert.assertNotNull(document16);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str18, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str19, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertNotNull(strMap20);
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertNotNull(elements24);
        org.junit.Assert.assertNotNull(element26);
        org.junit.Assert.assertNotNull(element28);
        org.junit.Assert.assertNotNull(document29);
        org.junit.Assert.assertNotNull(element30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "<html> <head></head> <body> </body> </html> <html> <head></head> <body> </body> </html> #document" + "'", str31, "<html> <head></head> <body> </body> </html> <html> <head></head> <body> </body> </html> #document");
    }

    @Test
    public void test3621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3621");
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
        org.jsoup.select.Elements elements21 = element14.getElementsByAttributeValueContaining("<html>\n <head></head>\n <body></body>\n</html>&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;<<html> <head></head> <body> </body> </html>></<html> <head></head> <body> </body> </html>>", "#root");
        org.jsoup.nodes.Element element23 = element14.prepend("<#root class=\" html\" value=\"&lt;html&gt;\n &lt;head&gt;&lt;/head&gt;\n &lt;body&gt;&lt;/body&gt;\n&lt;/html&gt;&amp;lt;html&amp;gt; &amp;lt;head&amp;gt;&amp;lt;/head&amp;gt; &amp;lt;body&amp;gt; &amp;lt;/body&amp;gt; &amp;lt;/html&amp;gt;\">\n <html>\n  <head></head>\n  <body></body>\n </html>&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;\n</#root>\n<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(document11);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNotNull(elements21);
        org.junit.Assert.assertNotNull(element23);
    }

    @Test
    public void test3622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3622");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.select.Elements elements6 = document3.getElementsByIndexLessThan((int) (short) 10);
        org.jsoup.nodes.Element element8 = document3.val("");
        org.jsoup.nodes.Element element10 = document3.after("#root");
        org.jsoup.nodes.Document document11 = document3.ownerDocument();
        org.jsoup.nodes.Element element14 = document3.attr("#root", "<html>\n <head></head>\n <body></body>\n</html>");
        java.util.List<org.jsoup.nodes.Node> nodeList15 = document3.childNodes();
        java.lang.String str16 = document3.html();
        org.jsoup.nodes.Element element18 = document3.before("<html> <head></head> <body> </body> </html>");
        org.jsoup.nodes.Element element20 = document3.before("<html>\n <head>\n  <title>&lt;html&gt;\n &lt;head&gt;&lt;/head&gt;\n &lt;body&gt;&lt;/body&gt;\n&lt;/html&gt;</title>\n </head>\n <body></body>\n</html><#root>\n <#root>\n  <html>\n   <head></head>\n   <body></body>\n  </html>\n </#root>\n <html>\n  <head></head>\n  <body></body>\n </html>\n</#root>");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(document11);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(nodeList15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str16, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNotNull(element20);
    }

    @Test
    public void test3623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3623");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        java.lang.String str3 = document1.absUrl("<html> <head></head> <body> </body> </html>");
        org.jsoup.select.Elements elements6 = document1.getElementsByAttributeValue("html", "<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.nodes.Element element7 = document1.body();
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = document1.new OutputSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = document1.childNodes();
        org.jsoup.nodes.Element element10 = document1.body();
        java.lang.String str11 = document1.baseUri();
        org.jsoup.nodes.Element element13 = document1.toggleClass("<html>\n <head></head>\n <body></body>\n</html>#root");
        org.jsoup.select.Elements elements14 = document1.getAllElements();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(elements14);
    }

    @Test
    public void test3624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3624");
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
        document3.title("\n<body></body>");
        org.jsoup.nodes.Element element19 = document3.getElementById("<#root value=\"&lt;html&gt;\n &lt;head&gt;&lt;/head&gt;\n &lt;body&gt;&lt;/body&gt;\n&lt;/html&gt;\">\n <html>\n  <head></head>\n  <body></body>\n </html>\n</#root>#root\n<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.nodes.Element element21 = document3.createElement("<#root>\n <#root>\n  <html>\n   <head></head>\n   <body></body>\n  </html>\n </#root>\n <html>\n  <head></head>\n  <body></body>\n </html>\n</#root>\n<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.nodes.Element element22 = document3.firstElementSibling();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str5, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str6, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;<<html> <head></head> <body> </body> </html>></<html> <head></head> <body> </body> </html>>" + "'", str15, "<html>\n <head></head>\n <body></body>\n</html>&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;<<html> <head></head> <body> </body> </html>></<html> <head></head> <body> </body> </html>>");
        org.junit.Assert.assertNull(element19);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertNotNull(element22);
    }

    @Test
    public void test3625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3625");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.select.Elements elements6 = document3.getElementsByIndexLessThan((int) (short) 10);
        java.util.Set<java.lang.String> strSet7 = document3.classNames();
        org.jsoup.nodes.Element element9 = document3.getElementById("hi!");
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = document3.new OutputSettings();
        org.jsoup.nodes.Element element12 = document3.appendElement("hi!");
        org.jsoup.nodes.Element element13 = document3.body();
        org.jsoup.select.Elements elements15 = document3.getElementsByIndexLessThan((int) (short) -1);
        org.jsoup.select.Elements elements17 = document3.getElementsContainingText("&lt;#root value=&quot;&quot; class=&quot;&quot;&gt; &lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt;&lt;/body&gt; &lt;/html&gt; &lt;/#root&gt;\n<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.select.Elements elements20 = document3.getElementsByAttributeValueStarting("<html> <head></head> <body> </body> </html> <html> <head></head> <body> </body> </html> #document", "<#document></#document>\n<html>\n <head>\n  <title>#document</title>\n </head>\n <body>\n  &lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt;&lt;/body&gt; &lt;/html&gt;\n </body>\n</html><hi!></hi!>");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertNull(element9);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertNotNull(elements17);
        org.junit.Assert.assertNotNull(elements20);
    }

    @Test
    public void test3626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3626");
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
        boolean boolean18 = document3.hasText();
        org.jsoup.select.Elements elements21 = document3.getElementsByAttributeValueStarting("<html> \n <head> \n  <title>&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;</title> \n </head> \n <body> \n </body>\n</html><#root>\n <html>\n  <head></head>\n  <body></body>\n </html>\n</#root>\n<html>\n <head></head>\n <body></body>\n</html><<html>\n <head>\n  <title>&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;</title>\n </head>\n <body></body>\n</html>></<html>\n <head>\n  <title>&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;</title>\n </head>\n <body></body>\n</html>>", "<html>\n <head></head>\n <body></body>\n</html><<html>\n <head></head>\n <body></body>\n</html>&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;<<html> <head></head> <body> </body> </html>></<html> <head></head> <body> </body> </html>>></<html>\n <head></head>\n <body></body>\n</html>&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;<<html> <head></head> <body> </body> </html>></<html> <head></head> <body> </body> </html>>>");
        java.util.List<org.jsoup.nodes.Node> nodeList22 = document3.childNodes();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str9, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "#document" + "'", str17, "#document");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(elements21);
        org.junit.Assert.assertNotNull(nodeList22);
    }

    @Test
    public void test3627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3627");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.select.Elements elements6 = document3.getElementsByIndexLessThan((int) (short) 10);
        org.jsoup.nodes.Element element8 = document3.val("");
        java.lang.String str9 = document3.outerHtml();
        org.jsoup.select.Elements elements11 = document3.getElementsByClass("#root");
        org.jsoup.select.Elements elements13 = document3.getElementsByIndexGreaterThan(10);
        org.jsoup.nodes.Element element15 = document3.text("<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.select.Elements elements17 = element15.getElementsByAttribute("hi!");
        boolean boolean18 = element15.isBlock();
        org.jsoup.nodes.Element element20 = element15.wrap("<html>\n <head></head>\n <body>\n </body>\n</html>");
        element20.setBaseUri("<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.nodes.Node node23 = element20.previousSibling();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str9, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(elements17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertNull(node23);
    }

    @Test
    public void test3628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3628");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.nodes.Element element5 = document3.head();
        java.lang.Integer int6 = document3.elementSiblingIndex();
        org.jsoup.nodes.Node node7 = document3.previousSibling();
        org.jsoup.nodes.Element element9 = document3.createElement("<html>\n <head>\n  <title>&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;</title>\n </head>\n <body></body>\n</html>");
        org.jsoup.nodes.Element element11 = document3.before("<html>\n <head></head>\n <body>\n </body>\n</html>");
        org.jsoup.nodes.Element element12 = document3.parent();
        org.jsoup.parser.Tag tag13 = document3.tag();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(tag13);
    }

    @Test
    public void test3629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3629");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element3 = document1.text("");
        org.jsoup.nodes.Element element5 = document1.append("<html>\n <head></head>\n <body>\n </body>\n</html>");
        org.jsoup.nodes.Element element6 = document1.empty();
        org.jsoup.nodes.Element element8 = element6.append("<html> <head></head> <body></body> </html>");
        org.jsoup.nodes.Element element10 = element8.append("\n<body></body>");
        org.jsoup.nodes.Element element12 = element10.appendElement("<html>\n <head>\n  <title>#document</title>\n </head>\n <body>\n  &lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt;&lt;/body&gt; &lt;/html&gt;&amp;lt;html&amp;gt; &amp;lt;head&amp;gt;&amp;lt;/head&amp;gt; &amp;lt;body&amp;gt; &amp;lt;/body&amp;gt; &amp;lt;/html&amp;gt;\n </body>\n</html><hi!></hi!>");
        org.jsoup.nodes.Element element14 = element10.append("#root");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(element14);
    }

    @Test
    public void test3630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3630");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        boolean boolean3 = document1.hasClass("");
        java.lang.String str4 = document1.tagName();
        org.jsoup.nodes.Element element6 = document1.append("<html>\n <head></head>\n <body>\n </body>\n</html>\n<html> \n <head></head> \n <body>  \n </body>\n</html>");
        org.jsoup.select.Elements elements9 = element6.getElementsByAttributeValueMatching("\n<body></body>", "<hi! <html>\n <head></head>\n <body></body>\n</html>=\"&lt;html&gt;\n &lt;head&gt;&lt;/head&gt;\n &lt;body&gt;\n &lt;/body&gt;\n&lt;/html&gt;\"></hi!>&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt;&lt;/body&gt; &lt;/html&gt;");
        java.lang.Integer int10 = element6.siblingIndex();
        java.lang.Class<?> wildcardClass11 = element6.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "#root" + "'", str4, "#root");
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test3631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3631");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        java.lang.String str5 = document3.html();
        java.lang.String str6 = document3.html();
        java.util.Map<java.lang.String, java.lang.String> strMap7 = document3.dataset();
        org.jsoup.nodes.Element element9 = document3.appendElement("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList10 = element9.childNodes();
        org.jsoup.nodes.Element element13 = element9.attr("<html>\n <head></head>\n <body></body>\n</html>", "<html>\n <head></head>\n <body>\n </body>\n</html>");
        org.jsoup.nodes.Document document15 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document17 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element18 = document15.prependChild((org.jsoup.nodes.Node) document17);
        org.jsoup.parser.Tag tag19 = document17.tag();
        org.jsoup.nodes.Element element21 = document17.prependText("hi!");
        org.jsoup.nodes.Element element22 = element9.appendChild((org.jsoup.nodes.Node) document17);
        org.jsoup.nodes.Element element24 = document17.after("<#root value=\"\" #root=\"&lt;html&gt;\n &lt;head&gt;&lt;/head&gt;\n &lt;body&gt;&lt;/body&gt;\n&lt;/html&gt;\" class=\"\">\n <html>\n  <head></head>\n  <body></body>\n </html><<html>\n <head></head>\n <body>\n </body>\n</html>></<html>\n <head></head>\n <body>\n </body>\n</html>>\n</#root>");
        org.jsoup.nodes.Node node25 = element24.previousSibling();
        org.jsoup.nodes.Element element27 = element24.val("<html>\n <head>\n  <title>#document</title>\n </head>\n <body>\n  &lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt;&lt;/body&gt; &lt;/html&gt;\n </body>\n</html><hi!></hi!>");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str5, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str6, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(document15);
        org.junit.Assert.assertNotNull(document17);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNotNull(tag19);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertNotNull(element24);
        org.junit.Assert.assertNull(node25);
        org.junit.Assert.assertNotNull(element27);
    }

    @Test
    public void test3632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3632");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        java.lang.String str5 = document1.tagName();
        org.jsoup.nodes.Element element6 = document1.head();
        java.lang.Integer int7 = element6.siblingIndex();
        org.jsoup.nodes.Element element10 = element6.attr("<html> <head></head> <body></body> </html>", "<html>\n <head>\n  <title>&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;</title>\n </head>\n <body></body>\n</html>");
        org.jsoup.nodes.Element element11 = element10.empty();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#root" + "'", str5, "#root");
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element11);
    }

    @Test
    public void test3633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3633");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.select.Elements elements6 = document3.getElementsByIndexLessThan((int) (short) 10);
        java.util.Set<java.lang.String> strSet7 = document3.classNames();
        org.jsoup.nodes.Element element10 = document3.attr("<html>\n <head></head>\n <body></body>\n</html>", "#root");
        org.jsoup.nodes.Document document12 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document14 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element15 = document12.prependChild((org.jsoup.nodes.Node) document14);
        org.jsoup.select.Elements elements17 = document14.getElementsByIndexLessThan((int) (short) 10);
        java.util.Set<java.lang.String> strSet18 = document14.classNames();
        java.lang.Integer int19 = document14.siblingIndex();
        org.jsoup.nodes.Element element20 = element10.appendChild((org.jsoup.nodes.Node) document14);
        org.jsoup.select.Elements elements22 = element10.getElementsByTag("hi!");
        org.jsoup.nodes.Element element24 = element10.prependText("<html> <head></head> <body> </body> </html>");
        org.jsoup.nodes.Document document26 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document28 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element29 = document26.prependChild((org.jsoup.nodes.Node) document28);
        org.jsoup.nodes.Element element30 = document26.body();
        org.jsoup.select.Elements elements32 = document26.select("#root");
        org.jsoup.nodes.Element element33 = document26.empty();
        java.lang.String str34 = document26.className();
        org.jsoup.nodes.Element element35 = element10.appendChild((org.jsoup.nodes.Node) document26);
        org.jsoup.nodes.Element element37 = document26.appendText("<html> <head></head> <body></body> </html>");
        org.jsoup.nodes.Element element38 = document26.parent();
        org.jsoup.nodes.Element element39 = element38.empty();
        org.jsoup.nodes.Element element41 = element38.before("<<head></head>\n<body></body>></<head></head>\n<body></body>>\n<html>\n <head></head>\n <body></body>\n</html><hi!></hi!>");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(document12);
        org.junit.Assert.assertNotNull(document14);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(elements17);
        org.junit.Assert.assertNotNull(strSet18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertNotNull(elements22);
        org.junit.Assert.assertNotNull(element24);
        org.junit.Assert.assertNotNull(document26);
        org.junit.Assert.assertNotNull(document28);
        org.junit.Assert.assertNotNull(element29);
        org.junit.Assert.assertNotNull(element30);
        org.junit.Assert.assertNotNull(elements32);
        org.junit.Assert.assertNotNull(element33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertNotNull(element35);
        org.junit.Assert.assertNotNull(element37);
        org.junit.Assert.assertNotNull(element38);
        org.junit.Assert.assertNotNull(element39);
        org.junit.Assert.assertNotNull(element41);
    }

    @Test
    public void test3634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3634");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.select.Elements elements6 = document3.getElementsByIndexLessThan((int) (short) 10);
        org.jsoup.nodes.Document document8 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document10 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element11 = document8.prependChild((org.jsoup.nodes.Node) document10);
        org.jsoup.select.Elements elements13 = document10.getElementsByIndexLessThan((int) (short) 10);
        boolean boolean14 = document3.equals((java.lang.Object) (short) 10);
        org.jsoup.nodes.Node node15 = document3.nextSibling();
        org.jsoup.nodes.Document document17 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document19 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element20 = document17.prependChild((org.jsoup.nodes.Node) document19);
        boolean boolean21 = document3.equals((java.lang.Object) element20);
        java.lang.String str22 = document3.tagName();
        org.jsoup.nodes.Document document23 = document3.normalise();
        org.jsoup.nodes.Element element24 = document23.lastElementSibling();
        org.jsoup.nodes.Element element26 = document23.text("<html>\n <head></head>\n <body></body>\n</html>");
        java.lang.String str27 = document23.data();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(document8);
        org.junit.Assert.assertNotNull(document10);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNotNull(document17);
        org.junit.Assert.assertNotNull(document19);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "#root" + "'", str22, "#root");
        org.junit.Assert.assertNotNull(document23);
        org.junit.Assert.assertNotNull(element24);
        org.junit.Assert.assertNotNull(element26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
    }

    @Test
    public void test3635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3635");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        java.lang.String str5 = document3.html();
        java.lang.String str6 = document3.html();
        org.jsoup.nodes.Document document8 = org.jsoup.nodes.Document.createShell("");
        java.util.Set<java.lang.String> strSet9 = document8.classNames();
        org.jsoup.nodes.Element element10 = document3.classNames(strSet9);
        org.jsoup.select.Elements elements12 = document3.getElementsContainingOwnText("");
        org.jsoup.select.Elements elements14 = document3.getElementsByIndexLessThan((int) (short) -1);
        java.lang.String str15 = document3.toString();
        org.jsoup.nodes.Node node17 = document3.removeAttr("body");
        org.jsoup.nodes.Document.OutputSettings outputSettings18 = document3.outputSettings();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str5, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str6, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertNotNull(document8);
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertNotNull(elements14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str15, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNotNull(outputSettings18);
    }

    @Test
    public void test3636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3636");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        java.lang.String str5 = document3.html();
        java.lang.String str6 = document3.html();
        java.util.Map<java.lang.String, java.lang.String> strMap7 = document3.dataset();
        org.jsoup.nodes.Element element9 = document3.appendText("<html>\n <head></head>\n <body>\n </body>\n</html>");
        org.jsoup.nodes.Document document11 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document13 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element14 = document11.prependChild((org.jsoup.nodes.Node) document13);
        org.jsoup.select.Elements elements16 = document13.getElementsByIndexLessThan((int) (short) 10);
        org.jsoup.nodes.Element element18 = document13.val("");
        org.jsoup.nodes.Element element20 = element18.val("hi!");
        org.jsoup.select.Elements elements21 = element18.siblingElements();
        org.jsoup.nodes.Element element22 = element9.appendChild((org.jsoup.nodes.Node) element18);
        org.jsoup.select.Elements elements24 = element18.getElementsByAttribute("<html>\n <head></head>\n <body>\n </body>\n</html>\n<html> \n <head></head> \n <body>  \n </body>\n</html>");
        org.jsoup.nodes.Document document25 = element18.ownerDocument();
        java.lang.String str26 = document25.toString();
        java.lang.String str27 = document25.title();
        org.jsoup.nodes.Element element29 = document25.before("");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str5, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str6, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(document11);
        org.junit.Assert.assertNotNull(document13);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(elements16);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertNotNull(elements21);
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertNotNull(elements24);
        org.junit.Assert.assertNotNull(document25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str26, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(element29);
    }

    @Test
    public void test3637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3637");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        boolean boolean3 = document1.hasClass("");
        org.jsoup.nodes.Document document4 = document1.normalise();
        org.jsoup.nodes.Document document6 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document8 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element9 = document6.prependChild((org.jsoup.nodes.Node) document8);
        java.lang.String str10 = document8.html();
        java.lang.String str11 = document8.html();
        java.util.Map<java.lang.String, java.lang.String> strMap12 = document8.dataset();
        org.jsoup.nodes.Element element14 = document8.appendElement("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList15 = element14.childNodes();
        org.jsoup.nodes.Element element18 = element14.attr("<html>\n <head></head>\n <body></body>\n</html>", "<html>\n <head></head>\n <body>\n </body>\n</html>");
        org.jsoup.nodes.Document document20 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document22 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element23 = document20.prependChild((org.jsoup.nodes.Node) document22);
        org.jsoup.parser.Tag tag24 = document22.tag();
        org.jsoup.nodes.Element element26 = document22.prependText("hi!");
        org.jsoup.nodes.Element element27 = element14.appendChild((org.jsoup.nodes.Node) document22);
        org.jsoup.nodes.Element element29 = document22.createElement("<#root>\n <#root>\n  <html>\n   <head></head>\n   <body></body>\n  </html>\n </#root>\n <html>\n  <head></head>\n  <body></body>\n </html>\n</#root>\n<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.nodes.Element element30 = document22.body();
        boolean boolean31 = document1.equals((java.lang.Object) element30);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(document4);
        org.junit.Assert.assertNotNull(document6);
        org.junit.Assert.assertNotNull(document8);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str10, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str11, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(nodeList15);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNotNull(document20);
        org.junit.Assert.assertNotNull(document22);
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertNotNull(tag24);
        org.junit.Assert.assertNotNull(element26);
        org.junit.Assert.assertNotNull(element27);
        org.junit.Assert.assertNotNull(element29);
        org.junit.Assert.assertNotNull(element30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test3638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3638");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.select.Elements elements6 = document3.getElementsByIndexLessThan((int) (short) 10);
        org.jsoup.nodes.Element element8 = document3.val("");
        org.jsoup.nodes.Element element10 = document3.after("#root");
        org.jsoup.nodes.Document document11 = document3.ownerDocument();
        org.jsoup.nodes.Element element14 = document3.attr("#root", "<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.select.Elements elements15 = element14.siblingElements();
        org.jsoup.nodes.Element element17 = element14.before("");
        boolean boolean18 = element14.isBlock();
        org.jsoup.nodes.Document document19 = element14.ownerDocument();
        org.jsoup.nodes.Element element20 = document19.empty();
        java.util.Map<java.lang.String, java.lang.String> strMap21 = element20.dataset();
        boolean boolean22 = element20.isBlock();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(document11);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(document19);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertNotNull(strMap21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test3639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3639");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        java.lang.String str5 = document3.html();
        java.lang.String str6 = document3.html();
        java.util.Map<java.lang.String, java.lang.String> strMap7 = document3.dataset();
        org.jsoup.nodes.Element element9 = document3.appendText("<html>\n <head></head>\n <body>\n </body>\n</html>");
        org.jsoup.select.Elements elements12 = document3.getElementsByAttributeValueStarting("<html>\n <head></head>\n <body>\n </body>\n</html>", "<html> <head></head> <body> </body> </html>");
        org.jsoup.select.Elements elements15 = document3.getElementsByAttributeValueMatching("<html> <head></head> <body> </body> </html>", "hi!");
        org.jsoup.select.Elements elements17 = document3.getElementsByTag("hi!");
        org.jsoup.select.Elements elements20 = document3.getElementsByAttributeValueNot("#document", "<html>\n <head></head>\n <body></body>\n</html>");
        boolean boolean21 = document3.hasText();
        document3.title(" html");
        org.jsoup.nodes.Element element25 = document3.prepend("#root");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str5, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str6, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertNotNull(elements17);
        org.junit.Assert.assertNotNull(elements20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(element25);
    }

    @Test
    public void test3640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3640");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        java.lang.String str5 = document3.html();
        java.lang.String str6 = document3.html();
        org.jsoup.nodes.Document document8 = org.jsoup.nodes.Document.createShell("");
        java.util.Set<java.lang.String> strSet9 = document8.classNames();
        org.jsoup.nodes.Element element10 = document3.classNames(strSet9);
        org.jsoup.nodes.Element element12 = document3.removeClass("<html>\n <head></head>\n <body>\n </body>\n</html>");
        org.jsoup.nodes.Element element13 = document3.body();
        org.jsoup.nodes.Element element15 = document3.wrap("&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt;&lt;/body&gt; &lt;/html&gt;\n<html>\n <head>\n  <title>&lt;html&gt;\n &lt;head&gt;&lt;/head&gt;\n &lt;body&gt;&lt;/body&gt;\n&lt;/html&gt;</title>\n </head>\n <body>\n  hi!\n </body>\n</html>");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str5, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str6, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertNotNull(document8);
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(element15);
    }

    @Test
    public void test3641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3641");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.select.Elements elements6 = document3.getElementsByIndexLessThan((int) (short) 10);
        org.jsoup.nodes.Element element8 = document3.val("");
        java.lang.String str9 = document3.outerHtml();
        org.jsoup.select.Elements elements11 = document3.getElementsByClass("#root");
        java.lang.String str12 = document3.tagName();
        org.jsoup.nodes.Node node14 = document3.childNode(0);
        org.jsoup.nodes.Document document15 = document3.ownerDocument();
        java.lang.String str16 = document3.tagName();
        java.lang.String str17 = document3.outerHtml();
        org.jsoup.nodes.Document.OutputSettings outputSettings18 = document3.outputSettings();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str9, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "#root" + "'", str12, "#root");
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(document15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "#root" + "'", str16, "#root");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str17, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertNotNull(outputSettings18);
    }

    @Test
    public void test3642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3642");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.parser.Tag tag5 = document3.tag();
        org.jsoup.select.Elements elements6 = document3.children();
        org.jsoup.nodes.Attributes attributes7 = document3.attributes();
        org.jsoup.nodes.Document document9 = new org.jsoup.nodes.Document("hi!");
        java.lang.String str10 = document9.tagName();
        org.jsoup.nodes.Element element11 = document3.appendChild((org.jsoup.nodes.Node) document9);
        org.jsoup.select.Elements elements13 = document9.getElementsByTag("hi!");
        org.jsoup.nodes.Element element15 = document9.html("html");
        org.jsoup.nodes.Document document17 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document19 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element20 = document17.prependChild((org.jsoup.nodes.Node) document19);
        org.jsoup.select.Elements elements22 = document19.getElementsByIndexLessThan((int) (short) 10);
        org.jsoup.nodes.Element element24 = document19.val("");
        java.lang.String str25 = document19.outerHtml();
        org.jsoup.select.Elements elements27 = document19.getElementsByClass("#root");
        java.lang.String str28 = document19.tagName();
        boolean boolean29 = document19.isBlock();
        org.jsoup.select.Elements elements31 = document19.getElementsByAttributeStarting("hi!");
        org.jsoup.nodes.Document.OutputSettings outputSettings32 = document19.outputSettings();
        document9.replaceWith((org.jsoup.nodes.Node) document19);
        org.jsoup.nodes.Element element34 = document19.lastElementSibling();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(tag5);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "#root" + "'", str10, "#root");
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(document17);
        org.junit.Assert.assertNotNull(document19);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertNotNull(elements22);
        org.junit.Assert.assertNotNull(element24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str25, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertNotNull(elements27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "#root" + "'", str28, "#root");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(elements31);
        org.junit.Assert.assertNotNull(outputSettings32);
        org.junit.Assert.assertNotNull(element34);
    }

    @Test
    public void test3643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3643");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.select.Elements elements6 = document3.getElementsByIndexLessThan((int) (short) 10);
        org.jsoup.nodes.Element element8 = document3.val("");
        java.lang.String str9 = document3.outerHtml();
        org.jsoup.select.Elements elements11 = document3.getElementsByClass("#root");
        org.jsoup.select.Elements elements13 = document3.getElementsByIndexGreaterThan(10);
        org.jsoup.nodes.Document document14 = document3.ownerDocument();
        org.jsoup.nodes.Element element16 = document3.appendText("<html>\n <head></head>\n <body></body>\n</html><<html>\n <head></head>\n <body></body>\n</html>&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;<<html> <head></head> <body> </body> </html>></<html> <head></head> <body> </body> </html>>></<html>\n <head></head>\n <body></body>\n</html>&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;<<html> <head></head> <body> </body> </html>></<html> <head></head> <body> </body> </html>>>");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str9, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertNotNull(document14);
        org.junit.Assert.assertNotNull(element16);
    }

    @Test
    public void test3644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3644");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element2 = document1.body();
        org.jsoup.select.Elements elements3 = document1.getAllElements();
        org.jsoup.nodes.Element element5 = document1.appendElement("head");
        org.jsoup.nodes.Node node6 = document1.nextSibling();
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNull(node6);
    }

    @Test
    public void test3645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3645");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.select.Elements elements6 = document3.getElementsByIndexLessThan((int) (short) 10);
        org.jsoup.nodes.Element element8 = document3.val("");
        java.lang.String str9 = document3.outerHtml();
        org.jsoup.select.Elements elements11 = document3.getElementsByClass("#root");
        org.jsoup.select.Elements elements13 = document3.getElementsByIndexGreaterThan(10);
        java.lang.String str14 = document3.nodeName();
        org.jsoup.nodes.Element element16 = document3.before("<#root value=\"&lt;html&gt;\n &lt;head&gt;&lt;/head&gt;\n &lt;body&gt;&lt;/body&gt;\n&lt;/html&gt;\">\n <html>\n  <head></head>\n  <body></body>\n </html>\n</#root>#root\n<html>\n <head></head>\n <body></body>\n</html>");
        java.util.regex.Pattern pattern18 = null;
        org.jsoup.select.Elements elements19 = document3.getElementsByAttributeValueMatching("#root", pattern18);
        boolean boolean21 = document3.hasAttr("<#document></#document>\n<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str9, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "#document" + "'", str14, "#document");
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(elements19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test3646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3646");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.select.Elements elements6 = document3.getElementsByIndexLessThan((int) (short) 10);
        org.jsoup.nodes.Element element8 = document3.val("");
        org.jsoup.nodes.Element element10 = element8.val("hi!");
        org.jsoup.nodes.Element element12 = element10.prependText("");
        org.jsoup.select.Elements elements13 = element12.siblingElements();
        boolean boolean15 = element12.hasAttr("<html>\n <head></head>\n <body>\n </body>\n</html>");
        org.jsoup.select.Elements elements17 = element12.getElementsByIndexLessThan((int) (short) 1);
        java.lang.String str18 = element12.html();
        boolean boolean19 = element12.hasText();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(elements17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str18, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test3647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3647");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        java.lang.String str5 = document3.html();
        java.lang.String str6 = document3.html();
        java.util.Map<java.lang.String, java.lang.String> strMap7 = document3.dataset();
        org.jsoup.nodes.Element element9 = document3.appendText("<html>\n <head></head>\n <body>\n </body>\n</html>");
        org.jsoup.select.Elements elements12 = document3.getElementsByAttributeValueStarting("<html>\n <head></head>\n <body>\n </body>\n</html>", "<html> <head></head> <body> </body> </html>");
        org.jsoup.select.Elements elements15 = document3.getElementsByAttributeValueMatching("<html> <head></head> <body> </body> </html>", "hi!");
        org.jsoup.select.Elements elements17 = document3.getElementsByTag("hi!");
        org.jsoup.select.Elements elements18 = document3.getAllElements();
        org.jsoup.nodes.Document.OutputSettings outputSettings19 = document3.outputSettings();
        org.jsoup.nodes.Document document21 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document23 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element24 = document21.prependChild((org.jsoup.nodes.Node) document23);
        java.lang.String str25 = document23.html();
        java.lang.String str26 = document23.html();
        org.jsoup.nodes.Document.OutputSettings outputSettings27 = document23.new OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings29 = outputSettings27.indentAmount(0);
        boolean boolean30 = outputSettings29.prettyPrint();
        org.jsoup.nodes.Document document32 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document34 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element35 = document32.prependChild((org.jsoup.nodes.Node) document34);
        java.lang.String str36 = document34.html();
        java.lang.String str37 = document34.html();
        org.jsoup.nodes.Document document39 = org.jsoup.nodes.Document.createShell("");
        java.util.Set<java.lang.String> strSet40 = document39.classNames();
        org.jsoup.nodes.Element element41 = document34.classNames(strSet40);
        org.jsoup.nodes.Document document42 = document34.normalise();
        org.jsoup.nodes.Element element43 = document42.head();
        java.lang.String str44 = document42.title();
        java.lang.Integer int45 = document42.siblingIndex();
        org.jsoup.nodes.Document.OutputSettings outputSettings46 = document42.new OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode47 = outputSettings46.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings48 = outputSettings29.escapeMode(escapeMode47);
        java.nio.charset.Charset charset49 = outputSettings48.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings50 = outputSettings19.charset(charset49);
        org.jsoup.nodes.Entities.EscapeMode escapeMode51 = outputSettings50.escapeMode();
        java.nio.charset.CharsetEncoder charsetEncoder52 = outputSettings50.encoder();
        java.nio.charset.CharsetEncoder charsetEncoder53 = outputSettings50.encoder();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str5, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str6, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertNotNull(elements17);
        org.junit.Assert.assertNotNull(elements18);
        org.junit.Assert.assertNotNull(outputSettings19);
        org.junit.Assert.assertNotNull(document21);
        org.junit.Assert.assertNotNull(document23);
        org.junit.Assert.assertNotNull(element24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str25, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str26, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertNotNull(outputSettings29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(document32);
        org.junit.Assert.assertNotNull(document34);
        org.junit.Assert.assertNotNull(element35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str36, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str37, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertNotNull(document39);
        org.junit.Assert.assertNotNull(strSet40);
        org.junit.Assert.assertNotNull(element41);
        org.junit.Assert.assertNotNull(document42);
        org.junit.Assert.assertNotNull(element43);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + escapeMode47 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode47.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings48);
        org.junit.Assert.assertNotNull(charset49);
        org.junit.Assert.assertNotNull(outputSettings50);
        org.junit.Assert.assertTrue("'" + escapeMode51 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode51.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charsetEncoder52);
        org.junit.Assert.assertNotNull(charsetEncoder53);
    }

    @Test
    public void test3648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3648");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        boolean boolean3 = document1.hasClass("");
        org.jsoup.nodes.Document document4 = document1.normalise();
        org.jsoup.select.Elements elements6 = document4.getElementsByIndexLessThan((int) '4');
        org.jsoup.nodes.Element element8 = document4.text("hi!\n<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(document4);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(element8);
    }

    @Test
    public void test3649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3649");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        java.lang.String str5 = document1.tagName();
        org.jsoup.nodes.Document.OutputSettings outputSettings6 = document1.new OutputSettings();
        java.lang.Integer int7 = document1.siblingIndex();
        org.jsoup.select.Elements elements9 = document1.getElementsByIndexLessThan((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element11 = document1.child(52);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 52 out of bounds for length 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#root" + "'", str5, "#root");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(elements9);
    }

    @Test
    public void test3650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3650");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        java.lang.String str5 = document3.html();
        java.lang.String str6 = document3.html();
        document3.title("<html>\n <head></head>\n <body></body>\n</html>");
        java.util.regex.Pattern pattern10 = null;
        org.jsoup.select.Elements elements11 = document3.getElementsByAttributeValueMatching("hi!", pattern10);
        org.jsoup.nodes.Element element13 = document3.after("");
        org.jsoup.nodes.Document.OutputSettings outputSettings14 = document3.outputSettings();
        org.jsoup.nodes.Element element16 = document3.wrap("<html> <head></head> <body> </body> </html>");
        org.jsoup.nodes.Node node17 = element16.previousSibling();
        org.jsoup.nodes.Element element19 = element16.append("\n<body></body>");
        org.jsoup.nodes.Document document20 = element16.ownerDocument();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str5, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str6, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(outputSettings14);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertNotNull(document20);
    }

    @Test
    public void test3651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3651");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element3 = document1.text("");
        org.jsoup.nodes.Element element5 = document1.append("<html>\n <head></head>\n <body>\n </body>\n</html>");
        org.jsoup.nodes.Element element7 = document1.text("<html>\n <head></head>\n <body>\n </body>\n</html>\n<html> \n <head></head> \n <body>  \n </body>\n</html>");
        java.util.Set<java.lang.String> strSet8 = element7.classNames();
        java.lang.String str9 = element7.tagName();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "#root" + "'", str9, "#root");
    }

    @Test
    public void test3652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3652");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.select.Elements elements6 = document3.getElementsByIndexLessThan((int) (short) 10);
        java.util.Set<java.lang.String> strSet7 = document3.classNames();
        org.jsoup.nodes.Element element10 = document3.attr("<html>\n <head></head>\n <body></body>\n</html>", "#root");
        boolean boolean12 = document3.hasAttr("<html> <head></head> <body> </body> </html>");
        org.jsoup.nodes.Element element13 = document3.nextElementSibling();
        boolean boolean15 = document3.hasClass("<html>\n <head>\n  <title>#document</title>\n </head>\n <body>\n  &lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt;&lt;/body&gt; &lt;/html&gt;\n </body>\n</html><hi!></hi!>");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test3653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3653");
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
        org.jsoup.select.Elements elements17 = element16.parents();
        boolean boolean18 = element16.hasText();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(tag5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(outputSettings10);
        org.junit.Assert.assertNotNull(document12);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(elements17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test3654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3654");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        java.lang.String str5 = document3.html();
        java.lang.String str6 = document3.html();
        document3.title("<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.select.Elements elements9 = document3.getAllElements();
        org.jsoup.nodes.Element element11 = document3.html("");
        org.jsoup.nodes.Element element14 = document3.attr("<html>\n <head></head>\n <body></body>\n</html>", " html");
        org.jsoup.select.Elements elements15 = element14.parents();
        org.jsoup.nodes.Node node16 = element14.nextSibling();
        org.jsoup.select.Elements elements19 = element14.getElementsByAttributeValueStarting("<#root value=\"\" #root=\"&lt;html&gt;\n &lt;head&gt;&lt;/head&gt;\n &lt;body&gt;&lt;/body&gt;\n&lt;/html&gt;\" class=\"\">\n <html>\n  <head></head>\n  <body></body>\n </html>\n</#root>#root\n<html>\n <head></head>\n <body></body>\n</html>", "<#root class=\" html\" value=\"&lt;html&gt;\n &lt;head&gt;&lt;/head&gt;\n &lt;body&gt;&lt;/body&gt;\n&lt;/html&gt;&amp;lt;html&amp;gt; &amp;lt;head&amp;gt;&amp;lt;/head&amp;gt; &amp;lt;body&amp;gt; &amp;lt;/body&amp;gt; &amp;lt;/html&amp;gt;\">\n <html>\n  <head></head>\n  <body></body>\n </html>&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;\n</#root>\n<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str5, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str6, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertNotNull(elements19);
    }

    @Test
    public void test3655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3655");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        java.lang.String str5 = document3.html();
        java.lang.String str6 = document3.html();
        java.util.Map<java.lang.String, java.lang.String> strMap7 = document3.dataset();
        org.jsoup.nodes.Element element9 = document3.appendElement("hi!");
        org.jsoup.select.Elements elements11 = document3.getElementsByClass("<html> <head></head> <body> </body> </html>");
        org.jsoup.nodes.Element element13 = document3.prepend("#document");
        org.jsoup.nodes.Document document15 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document17 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element18 = document15.prependChild((org.jsoup.nodes.Node) document17);
        org.jsoup.select.Elements elements20 = document17.getElementsByIndexLessThan((int) (short) 10);
        java.util.Set<java.lang.String> strSet21 = document17.classNames();
        org.jsoup.nodes.Element element24 = document17.attr("<html>\n <head></head>\n <body></body>\n</html>", "#root");
        org.jsoup.nodes.Element element25 = document3.appendChild((org.jsoup.nodes.Node) element24);
        org.jsoup.nodes.Document.OutputSettings outputSettings26 = document3.outputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode27 = outputSettings26.escapeMode();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str5, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str6, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(document15);
        org.junit.Assert.assertNotNull(document17);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNotNull(elements20);
        org.junit.Assert.assertNotNull(strSet21);
        org.junit.Assert.assertNotNull(element24);
        org.junit.Assert.assertNotNull(element25);
        org.junit.Assert.assertNotNull(outputSettings26);
        org.junit.Assert.assertTrue("'" + escapeMode27 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode27.equals(org.jsoup.nodes.Entities.EscapeMode.base));
    }

    @Test
    public void test3656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3656");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.select.Elements elements6 = document3.getElementsByIndexLessThan((int) (short) 10);
        org.jsoup.nodes.Element element8 = document3.val("");
        org.jsoup.nodes.Element element10 = element8.val("hi!");
        java.lang.String str11 = element10.className();
        org.jsoup.select.Elements elements12 = element10.getAllElements();
        org.jsoup.nodes.Element element14 = element10.prepend("<html>\n <head></head>\n <body></body>\n</html>&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;");
        org.jsoup.nodes.Document document16 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document18 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element19 = document16.prependChild((org.jsoup.nodes.Node) document18);
        org.jsoup.select.Elements elements21 = document18.getElementsByIndexLessThan((int) (short) 10);
        java.util.Set<java.lang.String> strSet22 = document18.classNames();
        org.jsoup.select.Elements elements25 = document18.getElementsByAttributeValueNot("<html> <head></head> <body> </body> </html>", "#root");
        org.jsoup.nodes.Document document26 = document18.normalise();
        org.jsoup.nodes.Element element27 = document18.body();
        java.lang.String str29 = element27.attr("<#root value=\"&lt;html&gt;\n &lt;head&gt;&lt;/head&gt;\n &lt;body&gt;&lt;/body&gt;\n&lt;/html&gt;\">\n <html>\n  <head></head>\n  <body></body>\n </html>\n</#root>#root\n<html>\n <head></head>\n <body></body>\n</html>");
        java.util.Set<java.lang.String> strSet30 = element27.classNames();
        org.jsoup.nodes.Element element31 = element10.classNames(strSet30);
        org.jsoup.nodes.Element element33 = element10.removeClass("<html>\n <head></head>\n <body></body>\n</html><#root value=\"\">\n <#document></#document>\n <html>\n  <head></head>\n  <body></body>\n </html>\n</#root>");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(document16);
        org.junit.Assert.assertNotNull(document18);
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertNotNull(elements21);
        org.junit.Assert.assertNotNull(strSet22);
        org.junit.Assert.assertNotNull(elements25);
        org.junit.Assert.assertNotNull(document26);
        org.junit.Assert.assertNotNull(element27);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNotNull(strSet30);
        org.junit.Assert.assertNotNull(element31);
        org.junit.Assert.assertNotNull(element33);
    }

    @Test
    public void test3657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3657");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("<html>\n <head></head>\n <body></body>\n</html>&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;<<html> <head></head> <body> </body> </html>></<html> <head></head> <body> </body> </html>>");
        org.jsoup.nodes.Node node2 = document1.nextSibling();
        org.jsoup.nodes.Element element4 = document1.removeClass("<html>\n <head></head>\n <body>\n </body>\n</html>");
        org.jsoup.select.Elements elements6 = element4.getElementsContainingOwnText("<html> \n <head></head> \n <body>\n  &lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;  \n </body>\n</html>\n<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(elements6);
    }

    @Test
    public void test3658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3658");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.parser.Tag tag5 = document3.tag();
        org.jsoup.select.Elements elements6 = document3.children();
        org.jsoup.nodes.Attributes attributes7 = document3.attributes();
        org.jsoup.nodes.Element element8 = document3.lastElementSibling();
        org.jsoup.nodes.Element element10 = document3.prependElement("<#root>\n <html>\n  <head></head>\n  <body></body>\n </html>\n</#root>\n<html>\n <head></head>\n <body></body>\n</html>");
        java.lang.String str11 = document3.title();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(tag5);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test3659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3659");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        java.lang.String str5 = document3.html();
        java.lang.String str6 = document3.html();
        document3.title("<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.select.Elements elements9 = document3.getAllElements();
        org.jsoup.nodes.Element element11 = document3.html("");
        org.jsoup.nodes.Element element13 = document3.createElement("<hi! <html>\n <head></head>\n <body></body>\n</html>=\"&lt;html&gt;\n &lt;head&gt;&lt;/head&gt;\n &lt;body&gt;\n &lt;/body&gt;\n&lt;/html&gt;\"></hi!>&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt;&lt;/body&gt; &lt;/html&gt;");
        org.jsoup.select.Elements elements16 = element13.getElementsByAttributeValueStarting("<html> \n <head> \n  <title>&lt;html&gt;\n &lt;head&gt;&lt;/head&gt;\n &lt;body&gt;&lt;/body&gt;\n&lt;/html&gt;</title> \n </head> \n <body> \n </body>\n</html>", "#document\n<html>\n <head></head>\n <body></body>\n</html>#document \n<html> \n <head></head> \n <body> \n </body>\n</html>");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str5, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str6, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(elements16);
    }

    @Test
    public void test3660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3660");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.select.Elements elements6 = document3.getElementsByIndexLessThan((int) (short) 10);
        org.jsoup.nodes.Element element8 = document3.val("");
        java.lang.String str9 = document3.outerHtml();
        org.jsoup.select.Elements elements11 = document3.getElementsByClass("#root");
        org.jsoup.select.Elements elements13 = document3.getElementsByIndexGreaterThan(10);
        java.lang.Integer int14 = document3.elementSiblingIndex();
        org.jsoup.nodes.Element element15 = document3.body();
        org.jsoup.nodes.Element element17 = element15.val("\n<body></body>");
        java.util.List<org.jsoup.nodes.Node> nodeList18 = element15.childNodes();
        java.lang.String str19 = element15.val();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str9, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(nodeList18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\n<body></body>" + "'", str19, "\n<body></body>");
    }

    @Test
    public void test3661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3661");
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
        java.util.Set<java.lang.String> strSet21 = element20.classNames();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertNotNull(document15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertNotNull(strSet21);
    }

    @Test
    public void test3662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3662");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.select.Elements elements6 = document3.getElementsByIndexLessThan((int) (short) 10);
        org.jsoup.nodes.Element element8 = document3.val("");
        org.jsoup.nodes.Element element10 = document3.after("#root");
        org.jsoup.nodes.Element element11 = document3.body();
        java.lang.String str12 = document3.baseUri();
        org.jsoup.nodes.Element element15 = document3.attr("<#root>\n <#root>\n  <html>\n   <head></head>\n   <body></body>\n  </html>\n </#root>\n <html>\n  <head></head>\n  <body></body>\n </html>\n</#root>\n<html>\n <head></head>\n <body></body>\n</html>", "<html>\n <head></head>\n <body></body>\n</html>&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt; <html> <head></head> <body></body> </html> <html> <head></head> <body> </body> </html>");
        org.jsoup.nodes.Document document17 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document19 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element20 = document17.prependChild((org.jsoup.nodes.Node) document19);
        org.jsoup.select.Elements elements22 = document19.getElementsByIndexLessThan((int) (short) 10);
        org.jsoup.nodes.Element element24 = document19.val("");
        java.lang.String str25 = document19.outerHtml();
        org.jsoup.nodes.Element element26 = element15.appendChild((org.jsoup.nodes.Node) document19);
        java.lang.Integer int27 = document19.elementSiblingIndex();
        org.jsoup.select.Elements elements28 = document19.parents();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(document17);
        org.junit.Assert.assertNotNull(document19);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertNotNull(elements22);
        org.junit.Assert.assertNotNull(element24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str25, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertNotNull(element26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertNotNull(elements28);
    }

    @Test
    public void test3663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3663");
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
        org.jsoup.select.Elements elements21 = document18.getElementsContainingOwnText("<#root>\n <#root>\n  <html>\n   <head></head>\n   <body></body>\n  </html>\n </#root>\n <html>\n  <head></head>\n  <body></body>\n </html>\n</#root>\n<html>\n <head></head>\n <body></body>\n</html>");
        java.lang.String str22 = document18.outerHtml();
        document18.remove();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str5, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str6, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;<<html> <head></head> <body> </body> </html>></<html> <head></head> <body> </body> </html>>" + "'", str15, "<html>\n <head></head>\n <body></body>\n</html>&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;<<html> <head></head> <body> </body> </html>></<html> <head></head> <body> </body> </html>>");
        org.junit.Assert.assertNotNull(document16);
        org.junit.Assert.assertNotNull(elements21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test3664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3664");
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
        org.jsoup.nodes.Element element17 = document3.val("<html>\n <head></head>\n <body>\n </body>\n</html>");
        org.jsoup.nodes.Document document18 = document3.normalise();
        org.jsoup.select.Elements elements20 = document18.getElementsContainingOwnText("body");
        org.jsoup.nodes.Element element21 = document18.nextElementSibling();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str5, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str6, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;" + "'", str13, "<html>\n <head></head>\n <body></body>\n</html>&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;");
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(document18);
        org.junit.Assert.assertNotNull(elements20);
        org.junit.Assert.assertNotNull(element21);
    }

    @Test
    public void test3665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3665");
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
        org.jsoup.nodes.Element element17 = document3.text("<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.nodes.Element element19 = document3.wrap("<html>\n <head></head>\n <body></body>\n</html>&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;<<html> <head></head> <body> </body> </html>></<html> <head></head> <body> </body> </html>>");
        org.jsoup.nodes.Node node21 = document3.childNode((int) (short) 0);
        org.jsoup.nodes.Document document22 = document3.normalise();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str5, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str6, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;" + "'", str13, "<html>\n <head></head>\n <body></body>\n</html>&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;");
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertNotNull(document22);
    }

    @Test
    public void test3666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3666");
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
        org.jsoup.select.Elements elements17 = element15.getElementsByAttribute("<html>\n <head></head>\n <body></body>\n</html>&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;<<html> <head></head> <body> </body> </html>></<html> <head></head> <body> </body> </html>>");
        java.lang.String str18 = element15.text();
        org.jsoup.select.Elements elements21 = element15.getElementsByAttributeValueNot("body", "head");
        org.jsoup.select.Elements elements24 = element15.getElementsByAttributeValue("<html>\n <head></head>\n <body></body>\n</html>&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;<<html> <head></head> <body> </body> </html>></<html> <head></head> <body> </body> </html>>", "<html> <head></head> <body> </body> </html>");
        org.jsoup.nodes.Element element27 = element15.attr("<html>\n <head></head>\n <body></body>\n</html><<html>\n <head></head>\n <body></body>\n</html>&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;<<html> <head></head> <body> </body> </html>></<html> <head></head> <body> </body> </html>>></<html>\n <head></head>\n <body></body>\n</html>&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;<<html> <head></head> <body> </body> </html>></<html> <head></head> <body> </body> </html>>>", "<html>\n <head></head>\n <body></body>\n</html>#root");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str5, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str6, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(elements17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "#document <html> <head></head> <body></body> </html>&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;" + "'", str18, "#document <html> <head></head> <body></body> </html>&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;");
        org.junit.Assert.assertNotNull(elements21);
        org.junit.Assert.assertNotNull(elements24);
        org.junit.Assert.assertNotNull(element27);
    }

    @Test
    public void test3667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3667");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.select.Elements elements6 = document3.getElementsByIndexLessThan((int) (short) 10);
        org.jsoup.nodes.Element element8 = document3.val("");
        org.jsoup.nodes.Element element10 = document3.after("#root");
        org.jsoup.nodes.Document document11 = document3.ownerDocument();
        org.jsoup.nodes.Element element14 = document3.attr("#root", "<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.select.Elements elements15 = element14.siblingElements();
        org.jsoup.nodes.Element element17 = element14.before("");
        boolean boolean18 = element14.isBlock();
        org.jsoup.nodes.Document document19 = element14.ownerDocument();
        java.lang.String str20 = element14.ownText();
        org.jsoup.nodes.Document document22 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document24 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element25 = document22.prependChild((org.jsoup.nodes.Node) document24);
        org.jsoup.select.Elements elements27 = document24.getElementsByIndexLessThan((int) (short) 10);
        org.jsoup.nodes.Element element29 = document24.val("");
        org.jsoup.nodes.Element element31 = document24.after("#root");
        org.jsoup.select.Elements elements34 = document24.getElementsByAttributeValueMatching("<html>\n <head></head>\n <body></body>\n</html>&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;", "<html>\n <head></head>\n <body></body>\n</html>&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;");
        org.jsoup.parser.Tag tag35 = document24.tag();
        org.jsoup.nodes.Element element36 = document24.firstElementSibling();
        org.jsoup.nodes.Element element37 = element14.appendChild((org.jsoup.nodes.Node) document24);
        org.jsoup.select.Elements elements39 = element14.getElementsByAttributeStarting("<#root>\n <html>\n  <head></head>\n  <body></body>\n </html>\n</#root>\n<html>\n <head></head>\n <body></body>\n</html>");
        java.util.regex.Pattern pattern41 = null;
        org.jsoup.select.Elements elements42 = element14.getElementsByAttributeValueMatching("<html> \n <head> \n  <title>&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;</title> \n </head> \n <body> \n </body>\n</html><#root>\n <html>\n  <head></head>\n  <body></body>\n </html>\n</#root>\n<html>\n <head></head>\n <body></body>\n</html><<html>\n <head>\n  <title>&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;</title>\n </head>\n <body></body>\n</html>></<html>\n <head>\n  <title>&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;</title>\n </head>\n <body></body>\n</html>>", pattern41);
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(document11);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(document19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(document22);
        org.junit.Assert.assertNotNull(document24);
        org.junit.Assert.assertNotNull(element25);
        org.junit.Assert.assertNotNull(elements27);
        org.junit.Assert.assertNotNull(element29);
        org.junit.Assert.assertNotNull(element31);
        org.junit.Assert.assertNotNull(elements34);
        org.junit.Assert.assertNotNull(tag35);
        org.junit.Assert.assertNotNull(element36);
        org.junit.Assert.assertNotNull(element37);
        org.junit.Assert.assertNotNull(elements39);
        org.junit.Assert.assertNotNull(elements42);
    }

    @Test
    public void test3668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3668");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.select.Elements elements6 = document3.getElementsByIndexLessThan((int) (short) 10);
        org.jsoup.nodes.Element element8 = document3.val("");
        java.lang.String str9 = document3.outerHtml();
        org.jsoup.select.Elements elements11 = document3.getElementsByClass("#root");
        java.lang.String str12 = document3.tagName();
        java.lang.Integer int13 = document3.elementSiblingIndex();
        java.util.regex.Pattern pattern15 = null;
        org.jsoup.select.Elements elements16 = document3.getElementsByAttributeValueMatching("<html> <head></head> <body> </body> </html>", pattern15);
        org.jsoup.select.Elements elements19 = document3.getElementsByAttributeValue("<html> <head></head> <body> </body> </html>", "#document");
        org.jsoup.nodes.Element element21 = document3.after("&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt;&lt;/body&gt; &lt;/html&gt;&amp;lt;html&amp;gt; &amp;lt;head&amp;gt;&amp;lt;/head&amp;gt; &amp;lt;body&amp;gt; &amp;lt;/body&amp;gt; &amp;lt;/html&amp;gt;<#root>\n <html>\n  <head></head>\n  <body></body>\n </html>\n</#root>\n<html>\n <head></head>\n <body></body>\n</html>");
        java.lang.String str22 = element21.baseUri();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node24 = element21.childNode((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str9, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "#root" + "'", str12, "#root");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(elements16);
        org.junit.Assert.assertNotNull(elements19);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test3669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3669");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("#root");
        org.jsoup.nodes.Document.OutputSettings outputSettings2 = document1.outputSettings();
        java.nio.charset.Charset charset3 = outputSettings2.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings5 = outputSettings2.prettyPrint(false);
        java.nio.charset.CharsetEncoder charsetEncoder6 = outputSettings5.encoder();
        int int7 = outputSettings5.indentAmount();
        java.nio.charset.CharsetEncoder charsetEncoder8 = outputSettings5.encoder();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(outputSettings2);
        org.junit.Assert.assertNotNull(charset3);
        org.junit.Assert.assertNotNull(outputSettings5);
        org.junit.Assert.assertNotNull(charsetEncoder6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(charsetEncoder8);
    }

    @Test
    public void test3670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3670");
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
        org.jsoup.nodes.Element element17 = document3.text("<html>\n <head></head>\n <body></body>\n</html>");
        document3.title("<html>\n <head></head>\n <body></body>\n</html>&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;");
        document3.remove();
        org.jsoup.nodes.Element element22 = document3.removeClass("hi!");
        org.jsoup.select.Elements elements25 = element22.getElementsByAttributeValueStarting("\n<body></body>", "<html>\n <head></head>\n <body></body>\n</html>&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt; <html> <head></head> <body></body> </html> <html> <head></head> <body> </body> </html>");
        org.jsoup.select.Elements elements27 = element22.getElementsContainingText("<<html>\n <head></head>\n <body></body>\n</html>&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;<<html> <head></head> <body> </body> </html>></<html> <head></head> <body> </body> </html>>></<html>\n <head></head>\n <body></body>\n</html>&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;<<html> <head></head> <body> </body> </html>></<html> <head></head> <body> </body> </html>>>");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str5, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str6, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;" + "'", str13, "<html>\n <head></head>\n <body></body>\n</html>&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;");
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertNotNull(elements25);
        org.junit.Assert.assertNotNull(elements27);
    }

    @Test
    public void test3671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3671");
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
        document3.title("<html> <head></head> <body> </body> </html>");
        org.jsoup.nodes.Element element19 = document3.before("\n<body></body>");
        org.jsoup.nodes.Element element21 = document3.wrap("<<head></head>\n<body></body>></<head></head>\n<body></body>>\n<html>\n <head></head>\n <body></body>\n</html><hi!></hi!>");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str9, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertNotNull(element21);
    }

    @Test
    public void test3672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3672");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.select.Elements elements6 = document3.getElementsByIndexLessThan((int) (short) 10);
        org.jsoup.nodes.Element element8 = document3.val("");
        org.jsoup.nodes.Element element10 = document3.after("#root");
        org.jsoup.nodes.Document document11 = document3.ownerDocument();
        org.jsoup.nodes.Element element14 = document3.attr("#root", "<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.nodes.Element element16 = element14.removeClass("");
        org.jsoup.select.Elements elements18 = element14.getElementsByAttribute("#document");
        boolean boolean20 = element14.hasAttr("#document");
        org.jsoup.nodes.Element element22 = element14.prependElement("<hi! <html>\n <head></head>\n <body></body>\n</html>=\"&lt;html&gt;\n &lt;head&gt;&lt;/head&gt;\n &lt;body&gt;\n &lt;/body&gt;\n&lt;/html&gt;\"></hi!>&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt;&lt;/body&gt; &lt;/html&gt;");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(document11);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(elements18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(element22);
    }

    @Test
    public void test3673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3673");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        java.lang.String str5 = document3.html();
        java.lang.String str6 = document3.html();
        java.util.Map<java.lang.String, java.lang.String> strMap7 = document3.dataset();
        org.jsoup.nodes.Element element9 = document3.appendElement("hi!");
        org.jsoup.nodes.Element element10 = document3.body();
        org.jsoup.select.Elements elements12 = document3.getElementsByIndexGreaterThan((int) (byte) 10);
        java.lang.String str13 = document3.title();
        org.jsoup.select.Elements elements15 = document3.getElementsContainingText("<#root value=\"&lt;html&gt;\n &lt;head&gt;&lt;/head&gt;\n &lt;body&gt;&lt;/body&gt;\n&lt;/html&gt;\">\n <html>\n  <head></head>\n  <body></body>\n </html>\n</#root>#root\n<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.nodes.Element element17 = document3.prependElement("<head></head>\n<body></body>");
        org.jsoup.nodes.Element element18 = document3.nextElementSibling();
        org.jsoup.nodes.Element element20 = document3.prepend("\n<body></body>");
        java.lang.String str21 = element20.html();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str5, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str6, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "<body></body><<head></head>\n<body></body>></<head></head>\n<body></body>>\n<html>\n <head></head>\n <body></body>\n</html><hi!></hi!>" + "'", str21, "<body></body><<head></head>\n<body></body>></<head></head>\n<body></body>>\n<html>\n <head></head>\n <body></body>\n</html><hi!></hi!>");
    }

    @Test
    public void test3674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3674");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        java.lang.String str5 = document1.tagName();
        org.jsoup.nodes.Element element6 = document1.head();
        java.lang.Integer int7 = element6.siblingIndex();
        org.jsoup.nodes.Element element10 = element6.attr("<html> <head></head> <body></body> </html>", "<html>\n <head>\n  <title>&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;</title>\n </head>\n <body></body>\n</html>");
        org.jsoup.nodes.Document document12 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document14 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element15 = document12.prependChild((org.jsoup.nodes.Node) document14);
        org.jsoup.select.Elements elements17 = document14.getElementsByIndexLessThan((int) (short) 10);
        org.jsoup.nodes.Element element19 = document14.val("");
        org.jsoup.nodes.Element element21 = document14.after("#root");
        org.jsoup.nodes.Document document22 = document14.ownerDocument();
        org.jsoup.nodes.Element element25 = document14.attr("#root", "<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.nodes.Element element27 = element25.removeClass("");
        org.jsoup.select.Elements elements28 = element27.parents();
        org.jsoup.nodes.Element element30 = element27.appendElement("<html>\n <head></head>\n <body>\n </body>\n</html>");
        org.jsoup.nodes.Element element31 = element6.prependChild((org.jsoup.nodes.Node) element27);
        java.lang.String str32 = element6.text();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#root" + "'", str5, "#root");
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(document12);
        org.junit.Assert.assertNotNull(document14);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(elements17);
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertNotNull(document22);
        org.junit.Assert.assertNotNull(element25);
        org.junit.Assert.assertNotNull(element27);
        org.junit.Assert.assertNotNull(elements28);
        org.junit.Assert.assertNotNull(element30);
        org.junit.Assert.assertNotNull(element31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
    }

    @Test
    public void test3675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3675");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        java.lang.String str3 = document1.absUrl("<html> <head></head> <body> </body> </html>");
        org.jsoup.select.Elements elements6 = document1.getElementsByAttributeValue("html", "<html>\n <head></head>\n <body></body>\n</html>");
        java.util.Map<java.lang.String, java.lang.String> strMap7 = document1.dataset();
        java.lang.String str8 = document1.ownText();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test3676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3676");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        java.lang.String str3 = document1.absUrl("<html> <head></head> <body> </body> </html>");
        org.jsoup.select.Elements elements6 = document1.getElementsByAttributeValue("html", "<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.nodes.Element element7 = document1.body();
        org.jsoup.nodes.Element element9 = element7.addClass("<#root>\n <#root>\n  <html>\n   <head></head>\n   <body></body>\n  </html>\n </#root>\n <html>\n  <head></head>\n  <body></body>\n </html>\n</#root>\n<html>\n <head></head>\n <body></body>\n</html>");
        java.lang.Integer int10 = element7.siblingIndex();
        org.jsoup.nodes.Element element12 = element7.appendElement("<html>\n <head></head>\n <body>\n  &lt;html&gt; &lt;head&gt; &lt;title&gt;&amp;lt;html&amp;gt; &amp;lt;head&amp;gt;&amp;lt;/head&amp;gt; &amp;lt;body&amp;gt; &amp;lt;/body&amp;gt; &amp;lt;/html&amp;gt;&lt;/title&gt; &lt;/head&gt; &lt;body&gt;&lt;/body&gt; &lt;/html&gt;\n </body>\n</html>");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(element12);
    }

    @Test
    public void test3677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3677");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.select.Elements elements6 = document3.getElementsByIndexLessThan((int) (short) 10);
        org.jsoup.nodes.Element element8 = document3.val("");
        java.lang.String str9 = document3.outerHtml();
        org.jsoup.select.Elements elements12 = document3.getElementsByAttributeValueStarting("#root", "<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.select.Elements elements13 = document3.parents();
        org.jsoup.nodes.Element element14 = document3.body();
        org.jsoup.nodes.Element element15 = element14.empty();
        java.lang.String str16 = element15.text();
        org.jsoup.select.Elements elements19 = element15.getElementsByAttributeValueEnding("<html>\n <head></head>\n <body></body>\n</html>#root", "<html> <head></head> <body> </body> </html> <html> <head></head> <body> </body> </html> #document");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str9, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(elements19);
    }

    @Test
    public void test3678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3678");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.select.Elements elements6 = document3.getElementsByIndexLessThan((int) (short) 10);
        org.jsoup.nodes.Document document8 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document10 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element11 = document8.prependChild((org.jsoup.nodes.Node) document10);
        org.jsoup.select.Elements elements13 = document10.getElementsByIndexLessThan((int) (short) 10);
        boolean boolean14 = document3.equals((java.lang.Object) (short) 10);
        org.jsoup.nodes.Node node15 = document3.nextSibling();
        org.jsoup.nodes.Element element16 = document3.firstElementSibling();
        org.jsoup.nodes.Element element18 = document3.text("<html>\n <head>\n  <title>&lt;html&gt;\n &lt;head&gt;&lt;/head&gt;\n &lt;body&gt;&lt;/body&gt;\n&lt;/html&gt;</title>\n </head>\n <body></body>\n</html>");
        org.jsoup.nodes.Element element21 = element18.attr("<#root value=\"&lt;html&gt;\n &lt;head&gt;&lt;/head&gt;\n &lt;body&gt;&lt;/body&gt;\n&lt;/html&gt;\">\n <html>\n  <head></head>\n  <body></body>\n </html>\n</#root>#root\n<html>\n <head></head>\n <body></body>\n</html>", "<html>\n <head></head>\n <body>\n  &lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt; &lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;\n </body>\n</html>\n<html> \n <head></head> \n <body>  \n </body>\n</html>");
        boolean boolean23 = element18.hasClass("<#root value=\"\" #root=\"&lt;html&gt;\n &lt;head&gt;&lt;/head&gt;\n &lt;body&gt;&lt;/body&gt;\n&lt;/html&gt;\" class=\"\">\n <html>\n  <head></head>\n  <body></body>\n </html>\n</#root>#root\n<html>\n <head></head>\n <body></body>\n</html>");
        java.lang.String str24 = element18.html();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(document8);
        org.junit.Assert.assertNotNull(document10);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "<html>\n <head></head>\n <body>\n  &lt;html&gt; &lt;head&gt; &lt;title&gt;&amp;lt;html&amp;gt; &amp;lt;head&amp;gt;&amp;lt;/head&amp;gt; &amp;lt;body&amp;gt;&amp;lt;/body&amp;gt; &amp;lt;/html&amp;gt;&lt;/title&gt; &lt;/head&gt; &lt;body&gt;&lt;/body&gt; &lt;/html&gt;\n </body>\n</html>" + "'", str24, "<html>\n <head></head>\n <body>\n  &lt;html&gt; &lt;head&gt; &lt;title&gt;&amp;lt;html&amp;gt; &amp;lt;head&amp;gt;&amp;lt;/head&amp;gt; &amp;lt;body&amp;gt;&amp;lt;/body&amp;gt; &amp;lt;/html&amp;gt;&lt;/title&gt; &lt;/head&gt; &lt;body&gt;&lt;/body&gt; &lt;/html&gt;\n </body>\n</html>");
    }

    @Test
    public void test3679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3679");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        java.lang.String str5 = document3.html();
        java.lang.String str6 = document3.html();
        java.util.Map<java.lang.String, java.lang.String> strMap7 = document3.dataset();
        org.jsoup.nodes.Element element9 = document3.appendText("<html>\n <head></head>\n <body>\n </body>\n</html>");
        org.jsoup.select.Elements elements11 = element9.getElementsContainingOwnText("#root");
        org.jsoup.select.Elements elements13 = element9.getElementsContainingOwnText("");
        org.jsoup.nodes.Document document15 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document17 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element18 = document15.prependChild((org.jsoup.nodes.Node) document17);
        java.lang.String str19 = document17.html();
        java.lang.String str20 = document17.html();
        java.util.Map<java.lang.String, java.lang.String> strMap21 = document17.dataset();
        org.jsoup.nodes.Element element23 = document17.appendText("<html>\n <head></head>\n <body>\n </body>\n</html>");
        org.jsoup.select.Elements elements25 = element23.getElementsContainingOwnText("#root");
        java.util.regex.Pattern pattern27 = null;
        org.jsoup.select.Elements elements28 = element23.getElementsByAttributeValueMatching("", pattern27);
        element9.replaceWith((org.jsoup.nodes.Node) element23);
        org.jsoup.nodes.Document document31 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document33 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element34 = document31.prependChild((org.jsoup.nodes.Node) document33);
        org.jsoup.nodes.Element element35 = document31.body();
        org.jsoup.select.Elements elements38 = element35.getElementsByAttributeValueStarting("hi!", "hi!");
        org.jsoup.nodes.Element element40 = element35.prependText("<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.nodes.Element element42 = element35.append("<html> <head></head> <body> </body> </html>");
        org.jsoup.select.Elements elements45 = element42.getElementsByAttributeValueEnding("html", "<html>\n <head></head>\n <body>\n </body>\n</html>");
        java.lang.String str46 = element42.val();
        org.jsoup.nodes.Element element47 = element23.appendChild((org.jsoup.nodes.Node) element42);
        java.lang.String str49 = element42.absUrl("<html> <head></head> <body> </body> </html>");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str5, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str6, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertNotNull(document15);
        org.junit.Assert.assertNotNull(document17);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str19, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str20, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertNotNull(strMap21);
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertNotNull(elements25);
        org.junit.Assert.assertNotNull(elements28);
        org.junit.Assert.assertNotNull(document31);
        org.junit.Assert.assertNotNull(document33);
        org.junit.Assert.assertNotNull(element34);
        org.junit.Assert.assertNotNull(element35);
        org.junit.Assert.assertNotNull(elements38);
        org.junit.Assert.assertNotNull(element40);
        org.junit.Assert.assertNotNull(element42);
        org.junit.Assert.assertNotNull(elements45);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertNotNull(element47);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
    }

    @Test
    public void test3680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3680");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.select.Elements elements6 = document3.getElementsByIndexLessThan((int) (short) 10);
        org.jsoup.nodes.Element element8 = document3.val("");
        org.jsoup.nodes.Element element10 = document3.after("#root");
        org.jsoup.nodes.Element element11 = document3.body();
        java.lang.String str12 = document3.baseUri();
        org.jsoup.nodes.Element element15 = document3.attr("<#root>\n <#root>\n  <html>\n   <head></head>\n   <body></body>\n  </html>\n </#root>\n <html>\n  <head></head>\n  <body></body>\n </html>\n</#root>\n<html>\n <head></head>\n <body></body>\n</html>", "<html>\n <head></head>\n <body></body>\n</html>&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt; <html> <head></head> <body></body> </html> <html> <head></head> <body> </body> </html>");
        org.jsoup.nodes.Document document17 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document19 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element20 = document17.prependChild((org.jsoup.nodes.Node) document19);
        org.jsoup.select.Elements elements22 = document19.getElementsByIndexLessThan((int) (short) 10);
        org.jsoup.nodes.Element element24 = document19.val("");
        java.lang.String str25 = document19.outerHtml();
        org.jsoup.nodes.Element element26 = element15.appendChild((org.jsoup.nodes.Node) document19);
        org.jsoup.nodes.Document document27 = document19.normalise();
        org.jsoup.nodes.Element element29 = document19.createElement("<html>\n <head></head>\n <body>\n </body>\n</html>\n<html> \n <head></head> \n <body>  \n </body>\n</html>");
        org.jsoup.select.Elements elements30 = element29.children();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(document17);
        org.junit.Assert.assertNotNull(document19);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertNotNull(elements22);
        org.junit.Assert.assertNotNull(element24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str25, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertNotNull(element26);
        org.junit.Assert.assertNotNull(document27);
        org.junit.Assert.assertNotNull(element29);
        org.junit.Assert.assertNotNull(elements30);
    }

    @Test
    public void test3681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3681");
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
        document3.title("<html> <head></head> <body> </body> </html>");
        org.jsoup.nodes.Element element18 = document3.head();
        java.lang.String str19 = document3.html();
        java.lang.String str20 = document3.title();
        java.util.Map<java.lang.String, java.lang.String> strMap21 = document3.dataset();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str9, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "<html>\n <head>\n  <title>&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;</title>\n </head>\n <body></body>\n</html>" + "'", str19, "<html>\n <head>\n  <title>&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;</title>\n </head>\n <body></body>\n</html>");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "<html> <head></head> <body> </body> </html>" + "'", str20, "<html> <head></head> <body> </body> </html>");
        org.junit.Assert.assertNotNull(strMap21);
    }

    @Test
    public void test3682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3682");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        java.lang.String str5 = document3.html();
        java.lang.String str6 = document3.html();
        document3.title("<html>\n <head></head>\n <body></body>\n</html>");
        java.util.regex.Pattern pattern10 = null;
        org.jsoup.select.Elements elements11 = document3.getElementsByAttributeValueMatching("hi!", pattern10);
        org.jsoup.nodes.Element element13 = document3.after("");
        java.lang.String str14 = document3.val();
        java.lang.String str15 = document3.nodeName();
        org.jsoup.nodes.Document document16 = document3.ownerDocument();
        java.lang.String str17 = document16.baseUri();
        document16.title("\n<body></body>");
        java.lang.String str20 = document16.nodeName();
        org.jsoup.nodes.Element element21 = document16.body();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str5, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str6, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "#document" + "'", str15, "#document");
        org.junit.Assert.assertNotNull(document16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "#document" + "'", str20, "#document");
        org.junit.Assert.assertNotNull(element21);
    }

    @Test
    public void test3683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3683");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        java.lang.String str5 = document3.html();
        java.lang.String str6 = document3.html();
        document3.title("<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.select.Elements elements9 = document3.getAllElements();
        org.jsoup.nodes.Element element11 = document3.html("");
        org.jsoup.nodes.Element element13 = document3.createElement("<hi! <html>\n <head></head>\n <body></body>\n</html>=\"&lt;html&gt;\n &lt;head&gt;&lt;/head&gt;\n &lt;body&gt;\n &lt;/body&gt;\n&lt;/html&gt;\"></hi!>&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt;&lt;/body&gt; &lt;/html&gt;");
        org.jsoup.nodes.Element element15 = document3.wrap("<html>\n <head></head>\n <body></body>\n</html>\n<html> \n <head></head> \n <body>   \n  <html> \n   <head></head> \n   <body>  \n   </body>\n  </html>\n </body>\n</html>");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str5, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str6, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(element15);
    }

    @Test
    public void test3684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3684");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        java.lang.String str5 = document3.html();
        java.lang.String str6 = document3.html();
        org.jsoup.nodes.Document.OutputSettings outputSettings7 = document3.new OutputSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList8 = document3.siblingNodes();
        boolean boolean10 = document3.hasClass("<html>\n <head>\n  <title>&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;</title>\n </head>\n <body></body>\n</html>");
        org.jsoup.nodes.Element element12 = document3.createElement("html");
        org.jsoup.nodes.Element element14 = document3.removeClass("");
        org.jsoup.nodes.Document document16 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document18 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element19 = document16.prependChild((org.jsoup.nodes.Node) document18);
        java.lang.String str20 = document18.html();
        java.lang.String str21 = document18.html();
        java.util.Map<java.lang.String, java.lang.String> strMap22 = document18.dataset();
        org.jsoup.nodes.Element element24 = document18.appendText("<html>\n <head></head>\n <body>\n </body>\n</html>");
        org.jsoup.select.Elements elements27 = document18.getElementsByAttributeValueStarting("<html>\n <head></head>\n <body>\n </body>\n</html>", "<html> <head></head> <body> </body> </html>");
        org.jsoup.nodes.Element element28 = document18.body();
        org.jsoup.nodes.Element element29 = document18.nextElementSibling();
        java.lang.String str30 = document18.toString();
        org.jsoup.nodes.Element element32 = document18.prependText("<html>\n <head></head>\n <body></body>\n</html>html");
        element32.remove();
        element14.replaceWith((org.jsoup.nodes.Node) element32);
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str5, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str6, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertNotNull(nodeList8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(document16);
        org.junit.Assert.assertNotNull(document18);
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str20, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str21, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertNotNull(strMap22);
        org.junit.Assert.assertNotNull(element24);
        org.junit.Assert.assertNotNull(elements27);
        org.junit.Assert.assertNotNull(element28);
        org.junit.Assert.assertNotNull(element29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;" + "'", str30, "<html>\n <head></head>\n <body></body>\n</html>&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;");
        org.junit.Assert.assertNotNull(element32);
    }

    @Test
    public void test3685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3685");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        java.lang.String str5 = document3.html();
        java.lang.String str6 = document3.html();
        java.util.Map<java.lang.String, java.lang.String> strMap7 = document3.dataset();
        org.jsoup.nodes.Element element9 = document3.appendElement("hi!");
        element9.remove();
        org.jsoup.nodes.Node node12 = element9.removeAttr("#document");
        org.jsoup.select.Elements elements15 = element9.getElementsByAttributeValueContaining("&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt; &lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;#document\n<html>\n <head></head>\n <body></body>\n</html><hi!></hi!>", "<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.nodes.Element element17 = element9.getElementById("<html>\n <head>\n  <title>#document</title>\n </head>\n <body>\n  &lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt;&lt;/body&gt; &lt;/html&gt;\n </body>\n</html><hi!></hi!>");
        org.jsoup.select.Elements elements18 = element9.children();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str5, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str6, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertNull(element17);
        org.junit.Assert.assertNotNull(elements18);
    }

    @Test
    public void test3686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3686");
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
        org.jsoup.nodes.Element element18 = document16.prependElement("&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt;&lt;/body&gt; &lt;/html&gt;&amp;lt;html&amp;gt; &amp;lt;head&amp;gt;&amp;lt;/head&amp;gt; &amp;lt;body&amp;gt; &amp;lt;/body&amp;gt; &amp;lt;/html&amp;gt;<#root>\n <html>\n  <head></head>\n  <body></body>\n </html>\n</#root>\n<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.select.Elements elements20 = document16.getElementsMatchingOwnText("html");
        java.lang.String str22 = document16.attr("");
        org.jsoup.nodes.Element element23 = document16.head();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str5, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str6, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;<<html> <head></head> <body> </body> </html>></<html> <head></head> <body> </body> </html>>" + "'", str15, "<html>\n <head></head>\n <body></body>\n</html>&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;<<html> <head></head> <body> </body> </html>></<html> <head></head> <body> </body> </html>>");
        org.junit.Assert.assertNotNull(document16);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNotNull(elements20);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(element23);
    }

    @Test
    public void test3687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3687");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        java.lang.String str5 = document3.html();
        java.lang.String str6 = document3.html();
        java.util.Map<java.lang.String, java.lang.String> strMap7 = document3.dataset();
        org.jsoup.nodes.Element element9 = document3.appendText("<html>\n <head></head>\n <body>\n </body>\n</html>");
        org.jsoup.select.Elements elements12 = document3.getElementsByAttributeValueStarting("<html>\n <head></head>\n <body>\n </body>\n</html>", "<html> <head></head> <body> </body> </html>");
        org.jsoup.nodes.Element element14 = document3.appendElement("<html> <head></head> <body> </body> </html>");
        org.jsoup.nodes.Element element16 = document3.before("<html>\n <head></head>\n <body></body>\n</html>&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;<<html> <head></head> <body> </body> </html>></<html> <head></head> <body> </body> </html>>");
        org.jsoup.select.Elements elements19 = element16.getElementsByAttributeValueStarting("html", "<#root value=\"&lt;html&gt;\n &lt;head&gt;&lt;/head&gt;\n &lt;body&gt;&lt;/body&gt;\n&lt;/html&gt;\">\n <html>\n  <head></head>\n  <body></body>\n </html>\n</#root>#root\n<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.nodes.Document document21 = org.jsoup.nodes.Document.createShell("");
        java.util.Set<java.lang.String> strSet22 = document21.classNames();
        org.jsoup.nodes.Element element23 = element16.classNames(strSet22);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element25 = element23.child((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 35 out of bounds for length 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str5, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str6, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(elements19);
        org.junit.Assert.assertNotNull(document21);
        org.junit.Assert.assertNotNull(strSet22);
        org.junit.Assert.assertNotNull(element23);
    }

    @Test
    public void test3688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3688");
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
        org.jsoup.select.Elements elements17 = document3.getElementsContainingText("<html> <head> <title>&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt;&lt;/body&gt; &lt;/html&gt;</title> </head> <body></body> </html>");
        org.jsoup.nodes.Element element18 = document3.body();
        java.lang.String str19 = document3.data();
        java.lang.String str20 = document3.toString();
        org.jsoup.nodes.Element element22 = document3.append("");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str9, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertNotNull(elements17);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str20, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertNotNull(element22);
    }

    @Test
    public void test3689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3689");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.select.Elements elements6 = document3.getElementsByIndexLessThan((int) (short) 10);
        org.jsoup.nodes.Element element8 = document3.val("");
        org.jsoup.nodes.Element element10 = element8.val("hi!");
        org.jsoup.nodes.Element element12 = element10.prependText("");
        java.util.Map<java.lang.String, java.lang.String> strMap13 = element10.dataset();
        org.jsoup.parser.Tag tag14 = element10.tag();
        org.jsoup.select.Elements elements16 = element10.getElementsContainingOwnText("\n<head>\n #document \n <html> \n  <head></head> \n  <body> &lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;\n  </body>\n </html>\n</head>");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(strMap13);
        org.junit.Assert.assertNotNull(tag14);
        org.junit.Assert.assertNotNull(elements16);
    }

    @Test
    public void test3690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3690");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        boolean boolean6 = document3.hasClass("<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.nodes.Element element7 = document3.body();
        org.jsoup.nodes.Element element9 = element7.prependText("<#root value=\"&lt;html&gt;\n &lt;head&gt;&lt;/head&gt;\n &lt;body&gt;&lt;/body&gt;\n&lt;/html&gt;\">\n <html>\n  <head></head>\n  <body></body>\n </html>\n</#root>#root\n<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.nodes.Document document11 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document13 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element14 = document11.prependChild((org.jsoup.nodes.Node) document13);
        org.jsoup.nodes.Element element15 = document11.body();
        java.lang.String str16 = element15.html();
        org.jsoup.nodes.Element element18 = element15.appendText("<html>\n <head></head>\n <body></body>\n</html>&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;<<html> <head></head> <body> </body> </html>></<html> <head></head> <body> </body> </html>>");
        org.jsoup.nodes.Element element20 = element18.append(" html");
        org.jsoup.select.Elements elements22 = element20.getElementsContainingText("<html> <head></head> <body></body> </html>&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;");
        org.jsoup.nodes.Node node23 = element20.previousSibling();
        org.jsoup.nodes.Node node25 = element20.removeAttr("<html>\n <head></head>\n <body></body>\n</html><#root value=\"\">\n <#document></#document>\n <html>\n  <head></head>\n  <body></body>\n </html>\n</#root>");
        element7.replaceWith(node25);
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(document11);
        org.junit.Assert.assertNotNull(document13);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertNotNull(elements22);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertNotNull(node25);
    }

    @Test
    public void test3691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3691");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element3 = document1.text("");
        org.jsoup.nodes.Element element5 = element3.getElementById("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node6 = element5.nextSibling();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNull(element5);
    }

    @Test
    public void test3692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3692");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.select.Elements elements6 = document3.getElementsByIndexLessThan((int) (short) 10);
        org.jsoup.nodes.Element element8 = document3.val("");
        org.jsoup.nodes.Element element10 = document3.after("#root");
        org.jsoup.select.Elements elements13 = document3.getElementsByAttributeValue("<html>\n <head></head>\n <body>\n </body>\n</html>\n<html> \n <head></head> \n <body>  \n </body>\n</html>", " html");
        org.jsoup.nodes.Element element14 = document3.body();
        org.jsoup.select.Elements elements16 = document3.getElementsContainingOwnText("\n<body></body>");
        org.jsoup.select.Elements elements19 = document3.getElementsByAttributeValueMatching(" hi!", "\n<body></body>");
        org.jsoup.nodes.Document document20 = document3.normalise();
        java.lang.String str21 = document3.title();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(elements16);
        org.junit.Assert.assertNotNull(elements19);
        org.junit.Assert.assertNotNull(document20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test3693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3693");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.select.Elements elements6 = document3.getElementsByIndexLessThan((int) (short) 10);
        org.jsoup.nodes.Element element8 = document3.val("");
        org.jsoup.nodes.Element element10 = document3.after("#root");
        org.jsoup.nodes.Document document11 = document3.ownerDocument();
        org.jsoup.nodes.Element element14 = document3.attr("#root", "<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.select.Elements elements15 = element14.siblingElements();
        java.lang.String str16 = element14.className();
        org.jsoup.select.Elements elements18 = element14.getElementsByIndexEquals((int) (byte) 10);
        org.jsoup.select.Elements elements19 = element14.siblingElements();
        org.jsoup.nodes.Element element21 = element14.val("<#root value=\"\" class=\"\">\n <html>\n  <head></head>\n  <body></body>\n </html>\n</#root>");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(document11);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(elements18);
        org.junit.Assert.assertNotNull(elements19);
        org.junit.Assert.assertNotNull(element21);
    }

    @Test
    public void test3694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3694");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        java.lang.String str5 = document3.html();
        java.lang.String str6 = document3.html();
        org.jsoup.nodes.Document document8 = org.jsoup.nodes.Document.createShell("");
        java.util.Set<java.lang.String> strSet9 = document8.classNames();
        org.jsoup.nodes.Element element10 = document3.classNames(strSet9);
        org.jsoup.select.Elements elements12 = document3.getElementsContainingOwnText("");
        org.jsoup.select.Elements elements14 = document3.getElementsByIndexLessThan((int) (short) -1);
        java.lang.String str15 = document3.toString();
        org.jsoup.nodes.Node node17 = document3.removeAttr("body");
        org.jsoup.nodes.Element element19 = document3.prependText("");
        org.jsoup.nodes.Element element21 = document3.html("<#root value=\"&lt;html&gt;\n &lt;head&gt;&lt;/head&gt;\n &lt;body&gt;&lt;/body&gt;\n&lt;/html&gt;\">\n <html>\n  <head></head>\n  <body></body>\n </html>\n</#root>#root\n<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str5, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str6, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertNotNull(document8);
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertNotNull(elements14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str15, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertNotNull(element21);
    }

    @Test
    public void test3695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3695");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.select.Elements elements6 = document3.getElementsByIndexLessThan((int) (short) 10);
        java.util.Set<java.lang.String> strSet7 = document3.classNames();
        org.jsoup.nodes.Element element10 = document3.attr("<html>\n <head></head>\n <body></body>\n</html>", "#root");
        org.jsoup.nodes.Document document11 = element10.ownerDocument();
        boolean boolean12 = document11.isBlock();
        java.lang.String str14 = document11.absUrl("<#root value=\"\" #root=\"&lt;html&gt;\n &lt;head&gt;&lt;/head&gt;\n &lt;body&gt;&lt;/body&gt;\n&lt;/html&gt;\" class=\"\">\n <html>\n  <head></head>\n  <body></body>\n </html><<html>\n <head></head>\n <body>\n </body>\n</html>></<html>\n <head></head>\n <body>\n </body>\n</html>>\n</#root>");
        org.jsoup.select.Elements elements17 = document11.getElementsByAttributeValue("<#root value=\"\" #root=\"&lt;html&gt;\n &lt;head&gt;&lt;/head&gt;\n &lt;body&gt;&lt;/body&gt;\n&lt;/html&gt;\" class=\"\">\n <html>\n  <head></head>\n  <body></body>\n </html><<html>\n <head></head>\n <body>\n </body>\n</html>></<html>\n <head></head>\n <body>\n </body>\n</html>>\n</#root>", "<html> \n <head></head> \n <body>\n  &lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;  \n </body>\n</html>\n<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(document11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(elements17);
    }

    @Test
    public void test3696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3696");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.select.Elements elements6 = document3.getElementsByIndexLessThan((int) (short) 10);
        org.jsoup.nodes.Element element8 = document3.val("");
        java.lang.String str9 = document3.outerHtml();
        org.jsoup.select.Elements elements11 = document3.getElementsByClass("#root");
        java.lang.String str12 = document3.tagName();
        org.jsoup.nodes.Node node14 = document3.childNode(0);
        org.jsoup.nodes.Document document15 = document3.ownerDocument();
        org.jsoup.select.Elements elements16 = document3.parents();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str9, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "#root" + "'", str12, "#root");
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(document15);
        org.junit.Assert.assertNotNull(elements16);
    }

    @Test
    public void test3697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3697");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        java.lang.String str2 = document1.tagName();
        org.jsoup.nodes.Element element4 = document1.addClass("#document");
        java.lang.String str5 = document1.outerHtml();
        java.lang.String str6 = document1.baseUri();
        java.lang.String str7 = document1.baseUri();
        org.jsoup.nodes.Element element8 = document1.body();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#root" + "'", str2, "#root");
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(element8);
    }

    @Test
    public void test3698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3698");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.select.Elements elements6 = document3.getElementsByIndexLessThan((int) (short) 10);
        org.jsoup.nodes.Element element8 = document3.val("");
        java.lang.String str9 = document3.outerHtml();
        org.jsoup.nodes.Node node11 = document3.removeAttr("<html>\n <head></head>\n <body></body>\n</html>&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;");
        java.lang.Integer int12 = document3.elementSiblingIndex();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str9, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test3699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3699");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.select.Elements elements6 = document3.getElementsByIndexLessThan((int) (short) 10);
        org.jsoup.nodes.Element element8 = document3.val("");
        java.lang.String str9 = document3.outerHtml();
        org.jsoup.select.Elements elements12 = document3.getElementsByAttributeValueStarting("#root", "<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.select.Elements elements13 = document3.parents();
        boolean boolean14 = document3.hasText();
        org.jsoup.nodes.Document document15 = document3.normalise();
        org.jsoup.nodes.Element element17 = document3.before("");
        org.jsoup.nodes.Element element18 = element17.nextElementSibling();
        org.jsoup.nodes.Element element20 = element18.toggleClass("&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt;&lt;/body&gt; &lt;/html&gt;");
        org.jsoup.nodes.Element element22 = element20.after("<#document></#document>\n<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.select.Elements elements25 = element22.getElementsByAttributeValueMatching("<<html>\n <head></head>\n <body></body>\n</html>&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;<<html> <head></head> <body> </body> </html>></<html> <head></head> <body> </body> </html>>></<html>\n <head></head>\n <body></body>\n</html>&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;<<html> <head></head> <body> </body> </html>></<html> <head></head> <body> </body> </html>>>", "\n<body>\n &lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt;&lt;/body&gt; &lt;/html&gt;\n</body>");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str9, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(document15);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertNotNull(elements25);
    }

    @Test
    public void test3700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3700");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.select.Elements elements6 = document3.getElementsByIndexLessThan((int) (short) 10);
        java.util.Set<java.lang.String> strSet7 = document3.classNames();
        org.jsoup.select.Elements elements10 = document3.getElementsByAttributeValueNot("<html> <head></head> <body> </body> </html>", "#root");
        java.lang.String str11 = document3.html();
        org.jsoup.nodes.Element element13 = document3.html("#document <html> <head></head> <body></body> </html>&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str11, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertNotNull(element13);
    }

    @Test
    public void test3701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3701");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.select.Elements elements6 = document3.getElementsByIndexLessThan((int) (short) 10);
        org.jsoup.nodes.Element element8 = document3.val("");
        java.lang.String str9 = document3.outerHtml();
        org.jsoup.select.Elements elements11 = document3.getElementsByClass("#root");
        org.jsoup.select.Elements elements13 = document3.getElementsByIndexGreaterThan(10);
        org.jsoup.nodes.Element element15 = document3.text("<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.select.Elements elements17 = element15.getElementsByAttribute("hi!");
        org.jsoup.nodes.Node node19 = element15.removeAttr("<head></head>\n<body></body>");
        org.jsoup.select.Elements elements22 = element15.getElementsByAttributeValueContaining("<html>\n <head>\n  <title>hi!</title>\n </head>\n <body></body>\n</html>", "<html>\n <head>\n  <title>&lt;html&gt;\n &lt;head&gt;&lt;/head&gt;\n &lt;body&gt;&lt;/body&gt;\n&lt;/html&gt;</title>\n </head>\n <body></body>\n</html><#root>\n <#root>\n  <html>\n   <head></head>\n   <body></body>\n  </html>\n </#root>\n <html>\n  <head></head>\n  <body></body>\n </html>\n</#root>");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str9, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(elements17);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNotNull(elements22);
    }

    @Test
    public void test3702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3702");
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
        org.jsoup.nodes.Element element18 = document3.addClass("html");
        java.lang.String str19 = document3.html();
        java.lang.String str21 = document3.attr("\n<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str9, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str19, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test3703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3703");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.select.Elements elements6 = document3.getElementsByIndexLessThan((int) (short) 10);
        org.jsoup.nodes.Element element8 = document3.val("");
        org.jsoup.nodes.Element element10 = document3.after("#root");
        org.jsoup.nodes.Element element11 = document3.body();
        org.jsoup.nodes.Element element13 = element11.toggleClass("<#root value=\"\" #root=\"&lt;html&gt;\n &lt;head&gt;&lt;/head&gt;\n &lt;body&gt;&lt;/body&gt;\n&lt;/html&gt;\" class=\"\">\n <html>\n  <head></head>\n  <body></body>\n </html><<html>\n <head></head>\n <body>\n </body>\n</html>></<html>\n <head></head>\n <body>\n </body>\n</html>>\n</#root>");
        org.jsoup.nodes.Element element14 = element11.firstElementSibling();
        org.jsoup.nodes.Element element16 = element14.toggleClass("<html>\n <head></head>\n <body>\n </body>\n</html>");
        org.jsoup.select.Elements elements18 = element14.getElementsMatchingOwnText("hi!\n<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.nodes.Document document19 = element14.ownerDocument();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(elements18);
        org.junit.Assert.assertNotNull(document19);
    }

    @Test
    public void test3704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3704");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.parser.Tag tag5 = document3.tag();
        org.jsoup.select.Elements elements6 = document3.children();
        org.jsoup.nodes.Document.OutputSettings outputSettings7 = document3.outputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = outputSettings7.indentAmount((int) 'a');
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(tag5);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(outputSettings7);
        org.junit.Assert.assertNotNull(outputSettings9);
    }

    @Test
    public void test3705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3705");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("<html>\n <head></head>\n <body>\n  &lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt; \n </body>\n</html><<html> <head></head> <body> </body> </html>></<html> <head></head> <body> </body> </html>>");
        org.jsoup.select.Elements elements4 = document1.getElementsByAttributeValueContaining("#document <html> <head></head> <body></body> </html>&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;", "<html>\n <head></head>\n <body></body>\n</html>&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt; <html> <head></head> <body></body> </html> <html> <head></head> <body> </body> </html>");
        java.lang.String str5 = document1.outerHtml();
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test3706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3706");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.select.Elements elements6 = document3.getElementsByIndexLessThan((int) (short) 10);
        org.jsoup.nodes.Element element8 = document3.val("");
        java.lang.String str9 = document3.outerHtml();
        org.jsoup.select.Elements elements12 = document3.getElementsByAttributeValueStarting("#root", "<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.select.Elements elements13 = document3.parents();
        boolean boolean14 = document3.hasText();
        org.jsoup.nodes.Document document15 = document3.normalise();
        org.jsoup.nodes.Element element17 = document3.before("");
        org.jsoup.nodes.Element element18 = element17.nextElementSibling();
        org.jsoup.nodes.Element element20 = element18.toggleClass("&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt;&lt;/body&gt; &lt;/html&gt;");
        org.jsoup.nodes.Element element22 = element20.after("<#document></#document>\n<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.nodes.Element element24 = element22.addClass("\n<body>\n &lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt;&lt;/body&gt; &lt;/html&gt;\n</body>");
        org.jsoup.select.Elements elements26 = element24.getElementsByClass("&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt;&lt;/body&gt; &lt;/html&gt;html\n<html>\n <head></head>\n <body></body>\n</html>&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str9, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(document15);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertNotNull(element24);
        org.junit.Assert.assertNotNull(elements26);
    }

    @Test
    public void test3707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3707");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element3 = document1.text("");
        java.lang.String str4 = document1.ownText();
        org.jsoup.select.Elements elements7 = document1.getElementsByAttributeValueStarting("#root", "<html>\n <head></head>\n <body>\n </body>\n</html>");
        java.lang.String str8 = document1.nodeName();
        java.lang.String str9 = document1.nodeName();
        org.jsoup.nodes.Element element10 = document1.body();
        org.jsoup.nodes.Element element12 = element10.wrap("body");
        org.jsoup.nodes.Element element14 = element10.appendText("<html>\n <head></head>\n <body>\n  &lt;html&gt; &lt;head&gt; &lt;title&gt;&amp;lt;html&amp;gt; &amp;lt;head&amp;gt;&amp;lt;/head&amp;gt; &amp;lt;body&amp;gt;&amp;lt;/body&amp;gt; &amp;lt;/html&amp;gt;&lt;/title&gt; &lt;/head&gt; &lt;body&gt;&lt;/body&gt; &lt;/html&gt;\n </body>\n</html>");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "#document" + "'", str8, "#document");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "#document" + "'", str9, "#document");
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNull(element12);
        org.junit.Assert.assertNotNull(element14);
    }

    @Test
    public void test3708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3708");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt; &lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;#document\n<html>\n <head></head>\n <body></body>\n</html><hi!></hi!>");
        org.jsoup.nodes.Element element2 = document1.empty();
        org.junit.Assert.assertNotNull(element2);
    }

    @Test
    public void test3709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3709");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        java.lang.String str5 = document3.html();
        java.lang.String str6 = document3.html();
        document3.title("<html>\n <head></head>\n <body></body>\n</html>");
        java.util.regex.Pattern pattern10 = null;
        org.jsoup.select.Elements elements11 = document3.getElementsByAttributeValueMatching("hi!", pattern10);
        org.jsoup.nodes.Element element13 = document3.after("");
        java.lang.String str14 = document3.val();
        org.jsoup.select.Elements elements16 = document3.getElementsByIndexGreaterThan((-1));
        java.lang.String str17 = document3.html();
        org.jsoup.select.Elements elements19 = document3.getElementsByClass("<head></head>\n<body></body>");
        java.lang.String str20 = document3.title();
        org.jsoup.select.Elements elements22 = document3.getElementsByClass("<#root>\n <html>\n  <head></head>\n  <body></body>\n </html>\n</#root>\n<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str5, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str6, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(elements16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "<html>\n <head>\n  <title>&lt;html&gt;\n &lt;head&gt;&lt;/head&gt;\n &lt;body&gt;&lt;/body&gt;\n&lt;/html&gt;</title>\n </head>\n <body></body>\n</html>" + "'", str17, "<html>\n <head>\n  <title>&lt;html&gt;\n &lt;head&gt;&lt;/head&gt;\n &lt;body&gt;&lt;/body&gt;\n&lt;/html&gt;</title>\n </head>\n <body></body>\n</html>");
        org.junit.Assert.assertNotNull(elements19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str20, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertNotNull(elements22);
    }

    @Test
    public void test3710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3710");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("#root");
        org.jsoup.nodes.Document.OutputSettings outputSettings2 = document1.outputSettings();
        org.jsoup.nodes.Element element4 = document1.text("<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.nodes.Document.OutputSettings outputSettings5 = document1.new OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings7 = outputSettings5.prettyPrint(false);
        boolean boolean8 = outputSettings7.prettyPrint();
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = outputSettings7.prettyPrint(false);
        org.jsoup.nodes.Document document12 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Document.OutputSettings outputSettings13 = document12.outputSettings();
        boolean boolean14 = outputSettings13.prettyPrint();
        org.jsoup.nodes.Entities.EscapeMode escapeMode15 = outputSettings13.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings16 = outputSettings7.escapeMode(escapeMode15);
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(outputSettings2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(outputSettings7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(outputSettings10);
        org.junit.Assert.assertNotNull(outputSettings13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + escapeMode15 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode15.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings16);
    }

    @Test
    public void test3711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3711");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        java.lang.String str5 = document1.tagName();
        org.jsoup.nodes.Document.OutputSettings outputSettings6 = document1.new OutputSettings();
        java.lang.Integer int7 = document1.siblingIndex();
        org.jsoup.select.Elements elements9 = document1.getElementsByIndexLessThan((int) (short) 0);
        boolean boolean10 = document1.isBlock();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#root" + "'", str5, "#root");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test3712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3712");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.select.Elements elements6 = document3.getElementsByIndexLessThan((int) (short) 10);
        org.jsoup.nodes.Element element8 = document3.val("");
        org.jsoup.nodes.Element element10 = document3.after("#root");
        org.jsoup.nodes.Element element11 = document3.body();
        org.jsoup.nodes.Document document13 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document15 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element16 = document13.prependChild((org.jsoup.nodes.Node) document15);
        org.jsoup.nodes.Element element18 = document15.append("<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.nodes.Element element19 = element11.prependChild((org.jsoup.nodes.Node) document15);
        org.jsoup.nodes.Element element21 = document15.appendText("\n<body></body>");
        document15.remove();
        org.jsoup.nodes.Element element24 = document15.append("");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(document13);
        org.junit.Assert.assertNotNull(document15);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertNotNull(element24);
    }

    @Test
    public void test3713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3713");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("<html>\n <head></head>\n <body></body>\n</html>&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;<<html> <head></head> <body> </body> </html>></<html> <head></head> <body> </body> </html>>");
        org.jsoup.nodes.Element element2 = document1.head();
        org.jsoup.select.Elements elements4 = element2.getElementsByIndexGreaterThan(1);
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(element2);
        org.junit.Assert.assertNotNull(elements4);
    }

    @Test
    public void test3714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3714");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        java.lang.String str5 = document3.className();
        org.jsoup.nodes.Element element6 = document3.lastElementSibling();
        org.jsoup.nodes.Element element8 = element6.prependElement("<html> <head></head> <body> </body> </html>");
        org.jsoup.nodes.Attributes attributes9 = element6.attributes();
        java.lang.String str10 = element6.data();
        java.util.Set<java.lang.String> strSet11 = element6.classNames();
        org.jsoup.nodes.Document document13 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document15 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element16 = document13.prependChild((org.jsoup.nodes.Node) document15);
        org.jsoup.parser.Tag tag17 = document15.tag();
        org.jsoup.select.Elements elements18 = document15.children();
        org.jsoup.nodes.Attributes attributes19 = document15.attributes();
        org.jsoup.nodes.Document document21 = new org.jsoup.nodes.Document("hi!");
        java.lang.String str22 = document21.tagName();
        org.jsoup.nodes.Element element23 = document15.appendChild((org.jsoup.nodes.Node) document21);
        org.jsoup.nodes.Element element25 = element23.val("&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt;&lt;/body&gt; &lt;/html&gt;&amp;lt;html&amp;gt; &amp;lt;head&amp;gt;&amp;lt;/head&amp;gt; &amp;lt;body&amp;gt; &amp;lt;/body&amp;gt; &amp;lt;/html&amp;gt;<#root>\n <html>\n  <head></head>\n  <body></body>\n </html>\n</#root>\n<html>\n <head></head>\n <body></body>\n</html>");
        java.util.Set<java.lang.String> strSet26 = element23.classNames();
        org.jsoup.nodes.Element element27 = element6.classNames(strSet26);
        org.jsoup.nodes.Element element29 = element27.wrap("<html> <head></head> <body> </body> </html> <html> <head></head> <body> </body> </html> #document");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(attributes9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertNotNull(document13);
        org.junit.Assert.assertNotNull(document15);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(tag17);
        org.junit.Assert.assertNotNull(elements18);
        org.junit.Assert.assertNotNull(attributes19);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "#root" + "'", str22, "#root");
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertNotNull(element25);
        org.junit.Assert.assertNotNull(strSet26);
        org.junit.Assert.assertNotNull(element27);
        org.junit.Assert.assertNotNull(element29);
    }

    @Test
    public void test3715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3715");
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
        org.jsoup.nodes.Element element34 = document22.text("<html> <head></head> <body> </body> </html>");
        org.jsoup.select.Elements elements36 = element34.getElementsContainingText("body");
        org.jsoup.select.Elements elements39 = element34.getElementsByAttributeValueContaining("body", "<html>\n <head>\n  <title>#document</title>\n </head>\n <body>\n  &lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt;&lt;/body&gt; &lt;/html&gt;&amp;lt;html&amp;gt; &amp;lt;head&amp;gt;&amp;lt;/head&amp;gt; &amp;lt;body&amp;gt; &amp;lt;/body&amp;gt; &amp;lt;/html&amp;gt;\n </body>\n</html><hi!></hi!>");
        java.util.Map<java.lang.String, java.lang.String> strMap40 = element34.dataset();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(document11);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNotNull(document20);
        org.junit.Assert.assertNotNull(document22);
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertNotNull(elements25);
        org.junit.Assert.assertNotNull(element27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str28, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertNotNull(elements31);
        org.junit.Assert.assertNotNull(element32);
        org.junit.Assert.assertNotNull(element34);
        org.junit.Assert.assertNotNull(elements36);
        org.junit.Assert.assertNotNull(elements39);
        org.junit.Assert.assertNotNull(strMap40);
    }

    @Test
    public void test3716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3716");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        java.lang.String str5 = document1.tagName();
        org.jsoup.nodes.Document.OutputSettings outputSettings6 = document1.new OutputSettings();
        org.jsoup.nodes.Document document7 = document1.normalise();
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = document1.new OutputSettings();
        org.jsoup.nodes.Document document9 = document1.ownerDocument();
        java.lang.String str10 = document9.outerHtml();
        java.util.regex.Pattern pattern12 = null;
        org.jsoup.select.Elements elements13 = document9.getElementsByAttributeValueMatching("<#root value=\"\" class=\"\">\n <html>\n  <head></head>\n  <body></body>\n </html>\n</#root>", pattern12);
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#root" + "'", str5, "#root");
        org.junit.Assert.assertNotNull(document7);
        org.junit.Assert.assertNotNull(document9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "<#root>\n <html>\n  <head></head>\n  <body></body>\n </html>\n</#root>\n<html>\n <head></head>\n <body></body>\n</html>" + "'", str10, "<#root>\n <html>\n  <head></head>\n  <body></body>\n </html>\n</#root>\n<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertNotNull(elements13);
    }

    @Test
    public void test3717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3717");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.select.Elements elements6 = document3.getElementsByIndexLessThan((int) (short) 10);
        org.jsoup.nodes.Element element8 = document3.val("");
        java.lang.String str9 = document3.outerHtml();
        org.jsoup.select.Elements elements11 = document3.getElementsByClass("#root");
        org.jsoup.select.Elements elements13 = document3.getElementsByIndexGreaterThan(10);
        org.jsoup.nodes.Element element15 = document3.text("<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.nodes.Element element17 = element15.val("<html>\n <head></head>\n <body></body>\n</html>&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;");
        org.jsoup.nodes.Element element19 = element15.addClass("");
        org.jsoup.nodes.Element element21 = element15.toggleClass("<#root value=\"&lt;html&gt;\n &lt;head&gt;&lt;/head&gt;\n &lt;body&gt;&lt;/body&gt;\n&lt;/html&gt;\">\n <html>\n  <head></head>\n  <body></body>\n </html>\n</#root>#root\n<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.nodes.Element element23 = element21.after("&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt;&lt;/body&gt; &lt;/html&gt;");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str9, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertNotNull(element23);
    }

    @Test
    public void test3718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3718");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.select.Elements elements6 = document3.getElementsByIndexLessThan((int) (short) 10);
        org.jsoup.nodes.Element element8 = document3.val("");
        org.jsoup.nodes.Element element10 = document3.after("#root");
        org.jsoup.nodes.Document document11 = document3.ownerDocument();
        org.jsoup.nodes.Element element14 = document3.attr("#root", "<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.nodes.Element element16 = element14.removeClass("");
        org.jsoup.select.Elements elements17 = element16.parents();
        org.jsoup.nodes.Element element19 = element16.appendElement("<html>\n <head></head>\n <body>\n </body>\n</html>");
        org.jsoup.nodes.Element element21 = element19.getElementById("html");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(document11);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(elements17);
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertNull(element21);
    }

    @Test
    public void test3719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3719");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        java.lang.String str5 = document3.className();
        org.jsoup.nodes.Element element7 = document3.toggleClass("#root");
        org.jsoup.select.Elements elements9 = document3.getElementsByClass("<html>\n <head></head>\n <body>\n </body>\n</html>\n<html> \n <head></head> \n <body>  \n </body>\n</html>");
        java.lang.String str10 = document3.title();
        org.jsoup.nodes.Document document11 = document3.normalise();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(document11);
    }

    @Test
    public void test3720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3720");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("<html>\n <head></head>\n <body></body>\n</html><<html>\n <head></head>\n <body></body>\n</html>&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;<<html> <head></head> <body> </body> </html>></<html> <head></head> <body> </body> </html>>></<html>\n <head></head>\n <body></body>\n</html>&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;<<html> <head></head> <body> </body> </html>></<html> <head></head> <body> </body> </html>>>");
    }

    @Test
    public void test3721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3721");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        java.lang.String str5 = document3.html();
        java.lang.String str6 = document3.html();
        document3.title("<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.select.Elements elements9 = document3.getAllElements();
        org.jsoup.nodes.Element element11 = document3.html("");
        java.lang.String str12 = document3.outerHtml();
        org.jsoup.nodes.Document.OutputSettings outputSettings13 = document3.outputSettings();
        java.lang.String str14 = document3.tagName();
        org.jsoup.select.Elements elements16 = document3.getElementsByClass("<<html>\n <head></head>\n <body></body>\n</html>&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;<<html> <head></head> <body> </body> </html>></<html> <head></head> <body> </body> </html>>></<html>\n <head></head>\n <body></body>\n</html>&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;<<html> <head></head> <body> </body> </html>></<html> <head></head> <body> </body> </html>>>");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str5, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str6, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(outputSettings13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "#root" + "'", str14, "#root");
        org.junit.Assert.assertNotNull(elements16);
    }

    @Test
    public void test3722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3722");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.select.Elements elements6 = document3.getElementsByIndexLessThan((int) (short) 10);
        org.jsoup.nodes.Element element8 = document3.val("");
        org.jsoup.nodes.Element element10 = document3.after("#root");
        org.jsoup.nodes.Document document11 = document3.ownerDocument();
        org.jsoup.nodes.Element element14 = document3.attr("#root", "<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.nodes.Element element16 = element14.removeClass("");
        org.jsoup.select.Elements elements18 = element14.getElementsByAttribute("#document");
        org.jsoup.select.Elements elements20 = element14.getElementsByAttributeStarting("<html>\n <head></head>\n <body>\n </body>\n</html>");
        java.lang.String str21 = element14.baseUri();
        org.jsoup.select.Elements elements23 = element14.getElementsContainingOwnText("<html>\n <head></head>\n <body>\n </body>\n</html>");
        java.util.List<org.jsoup.nodes.Node> nodeList24 = element14.childNodes();
        element14.remove();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(document11);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(elements18);
        org.junit.Assert.assertNotNull(elements20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(elements23);
        org.junit.Assert.assertNotNull(nodeList24);
    }

    @Test
    public void test3723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3723");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.select.Elements elements6 = document3.getElementsByIndexLessThan((int) (short) 10);
        org.jsoup.nodes.Element element8 = document3.val("");
        org.jsoup.nodes.Element element10 = document3.after("#root");
        org.jsoup.nodes.Document document11 = document3.ownerDocument();
        org.jsoup.nodes.Element element14 = document3.attr("#root", "<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.select.Elements elements16 = document3.select("#root");
        org.jsoup.nodes.Element element18 = document3.text("");
        org.jsoup.select.Elements elements21 = document3.getElementsByAttributeValueMatching("#document", "head");
        org.jsoup.nodes.Element element23 = document3.html("#document <html> <head></head> <body></body> </html>&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;");
        org.jsoup.nodes.Element element26 = document3.attr("<#root>\n <#root>\n  <html>\n   <head></head>\n   <body></body>\n  </html>\n </#root>\n <html>\n  <head></head>\n  <body></body>\n </html>\n</#root>\n<html>\n <head></head>\n <body></body>\n</html>", "<#root value=\"\" class=\"\">\n <html>\n  <head></head>\n  <body></body>\n </html>\n</#root>");
        java.lang.String str28 = element26.absUrl(" html");
        org.jsoup.select.Elements elements30 = element26.getElementsContainingOwnText("<html>\n <head></head>\n <body></body>\n</html><#root value=\"\">\n <#document></#document>\n <html>\n  <head></head>\n  <body></body>\n </html>\n</#root>");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(document11);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(elements16);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNotNull(elements21);
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertNotNull(element26);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNotNull(elements30);
    }

    @Test
    public void test3724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3724");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.parser.Tag tag5 = document3.tag();
        org.jsoup.nodes.Element element7 = document3.createElement("<html>\n <head></head>\n <body></body>\n</html>");
        document3.setBaseUri("");
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = document3.outputSettings();
        boolean boolean12 = document3.hasAttr("<html>\n <head>\n  <title>&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;</title>\n </head>\n <body></body>\n</html>");
        java.lang.String str13 = document3.tagName();
        org.jsoup.nodes.Element element15 = document3.prependText("&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt; &lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;#document\n<html>\n <head></head>\n <body></body>\n</html><hi!></hi!>");
        java.util.regex.Pattern pattern17 = null;
        org.jsoup.select.Elements elements18 = element15.getElementsByAttributeValueMatching("&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt;&lt;/body&gt; &lt;/html&gt;&amp;lt;html&amp;gt; &amp;lt;head&amp;gt;&amp;lt;/head&amp;gt; &amp;lt;body&amp;gt; &amp;lt;/body&amp;gt; &amp;lt;/html&amp;gt;<#root>\n <html>\n  <head></head>\n  <body></body>\n </html>\n</#root>\n<html>\n <head></head>\n <body></body>\n</html>", pattern17);
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(tag5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(outputSettings10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "#root" + "'", str13, "#root");
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(elements18);
    }

    @Test
    public void test3725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3725");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.select.Elements elements6 = document3.getElementsByIndexLessThan((int) (short) 10);
        org.jsoup.nodes.Document document8 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document10 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element11 = document8.prependChild((org.jsoup.nodes.Node) document10);
        org.jsoup.select.Elements elements13 = document10.getElementsByIndexLessThan((int) (short) 10);
        boolean boolean14 = document3.equals((java.lang.Object) (short) 10);
        java.util.regex.Pattern pattern16 = null;
        org.jsoup.select.Elements elements17 = document3.getElementsByAttributeValueMatching("<html>\n <head></head>\n <body></body>\n</html>", pattern16);
        boolean boolean18 = document3.isBlock();
        org.jsoup.select.Elements elements20 = document3.getElementsByClass("<body></body><<head></head>\n<body></body>></<head></head>\n<body></body>>\n<html>\n <head></head>\n <body></body>\n</html><hi!></hi!>");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(document8);
        org.junit.Assert.assertNotNull(document10);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(elements17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(elements20);
    }

    @Test
    public void test3726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3726");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.select.Elements elements6 = document3.getElementsByIndexLessThan((int) (short) 10);
        org.jsoup.nodes.Document document8 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document10 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element11 = document8.prependChild((org.jsoup.nodes.Node) document10);
        org.jsoup.select.Elements elements13 = document10.getElementsByIndexLessThan((int) (short) 10);
        boolean boolean14 = document3.equals((java.lang.Object) (short) 10);
        org.jsoup.nodes.Node node15 = document3.nextSibling();
        org.jsoup.nodes.Document document17 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document19 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element20 = document17.prependChild((org.jsoup.nodes.Node) document19);
        boolean boolean21 = document3.equals((java.lang.Object) element20);
        java.lang.String str22 = document3.tagName();
        org.jsoup.nodes.Element element24 = document3.removeClass("<html>\n <head></head>\n <body>\n </body>\n</html>");
        java.lang.String str25 = element24.val();
        org.jsoup.select.Elements elements27 = element24.getElementsMatchingText("&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt;&lt;/body&gt; &lt;/html&gt;&amp;lt;html&amp;gt; &amp;lt;head&amp;gt;&amp;lt;/head&amp;gt; &amp;lt;body&amp;gt; &amp;lt;/body&amp;gt; &amp;lt;/html&amp;gt;<#root>\n <html>\n  <head></head>\n  <body></body>\n </html>\n</#root>\n<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(document8);
        org.junit.Assert.assertNotNull(document10);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNotNull(document17);
        org.junit.Assert.assertNotNull(document19);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "#root" + "'", str22, "#root");
        org.junit.Assert.assertNotNull(element24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(elements27);
    }

    @Test
    public void test3727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3727");
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
        org.jsoup.select.Elements elements18 = document3.getElementsByIndexLessThan((int) '#');
        org.jsoup.nodes.Document.OutputSettings outputSettings19 = document3.new OutputSettings();
        org.jsoup.nodes.Element element21 = document3.val("<html>\n <head>\n  <title>&lt;html&gt;\n &lt;head&gt;&lt;/head&gt;\n &lt;body&gt;&lt;/body&gt;\n&lt;/html&gt;</title>\n </head>\n <body></body>\n</html>");
        org.jsoup.nodes.Document document22 = element21.ownerDocument();
        java.lang.String str23 = document22.nodeName();
        org.jsoup.select.Elements elements25 = document22.getElementsByIndexEquals(1);
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str9, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertNotNull(tag16);
        org.junit.Assert.assertNotNull(elements18);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertNotNull(document22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "#document" + "'", str23, "#document");
        org.junit.Assert.assertNotNull(elements25);
    }

    @Test
    public void test3728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3728");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        java.lang.String str5 = document3.html();
        java.lang.String str6 = document3.html();
        document3.title("<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.select.Elements elements9 = document3.getAllElements();
        org.jsoup.nodes.Element element11 = document3.html("");
        java.lang.String str12 = document3.val();
        org.jsoup.nodes.Attributes attributes13 = document3.attributes();
        java.lang.String str14 = document3.title();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str5, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str6, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(attributes13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test3729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3729");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.select.Elements elements6 = document3.getElementsByIndexLessThan((int) (short) 10);
        org.jsoup.nodes.Element element8 = document3.val("");
        java.lang.String str9 = document3.outerHtml();
        org.jsoup.select.Elements elements11 = document3.getElementsByClass("#root");
        java.lang.String str12 = document3.tagName();
        boolean boolean13 = document3.isBlock();
        org.jsoup.select.Elements elements15 = document3.getElementsByAttributeStarting("hi!");
        org.jsoup.nodes.Document.OutputSettings outputSettings16 = document3.outputSettings();
        org.jsoup.nodes.Element element18 = document3.html("<#document></#document>\n<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.nodes.Element element20 = document3.prependText("<html>\n <head></head>\n <body>\n  &lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt; \n </body>\n</html><<html> <head></head> <body> </body> </html>></<html> <head></head> <body> </body> </html>>");
        org.jsoup.nodes.Element element22 = document3.prependText("head");
        org.jsoup.nodes.Node node23 = document3.nextSibling();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str9, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "#root" + "'", str12, "#root");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertNotNull(outputSettings16);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertNotNull(node23);
    }

    @Test
    public void test3730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3730");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.select.Elements elements6 = document3.getElementsByIndexLessThan((int) (short) 10);
        org.jsoup.nodes.Document document8 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document10 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element11 = document8.prependChild((org.jsoup.nodes.Node) document10);
        org.jsoup.select.Elements elements13 = document10.getElementsByIndexLessThan((int) (short) 10);
        boolean boolean14 = document3.equals((java.lang.Object) (short) 10);
        org.jsoup.nodes.Node node15 = document3.nextSibling();
        org.jsoup.nodes.Document document17 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document19 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element20 = document17.prependChild((org.jsoup.nodes.Node) document19);
        boolean boolean21 = document3.equals((java.lang.Object) element20);
        java.lang.String str22 = document3.tagName();
        org.jsoup.nodes.Document document23 = document3.normalise();
        org.jsoup.nodes.Element element24 = document23.lastElementSibling();
        org.jsoup.nodes.Element element26 = document23.text("<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.nodes.Element element28 = document23.appendText("<html> <head> <title>&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt;&lt;/body&gt; &lt;/html&gt;</title> </head> <body></body> </html>");
        java.lang.String str30 = element28.absUrl(" html");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(document8);
        org.junit.Assert.assertNotNull(document10);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNotNull(document17);
        org.junit.Assert.assertNotNull(document19);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "#root" + "'", str22, "#root");
        org.junit.Assert.assertNotNull(document23);
        org.junit.Assert.assertNotNull(element24);
        org.junit.Assert.assertNotNull(element26);
        org.junit.Assert.assertNotNull(element28);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
    }

    @Test
    public void test3731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3731");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.nodes.Element element5 = document1.body();
        org.jsoup.select.Elements elements7 = document1.select("#root");
        org.jsoup.nodes.Element element8 = document1.empty();
        org.jsoup.select.Elements elements10 = element8.getElementsByIndexLessThan((int) (byte) 1);
        boolean boolean11 = element8.hasText();
        java.lang.Integer int12 = element8.elementSiblingIndex();
        org.jsoup.select.Elements elements14 = element8.getElementsContainingText("<html>\n <head></head>\n <body></body>\n</html>html");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(elements14);
    }

    @Test
    public void test3732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3732");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.select.Elements elements6 = document3.getElementsByIndexLessThan((int) (short) 10);
        org.jsoup.nodes.Document document8 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document10 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element11 = document8.prependChild((org.jsoup.nodes.Node) document10);
        org.jsoup.select.Elements elements13 = document10.getElementsByIndexLessThan((int) (short) 10);
        boolean boolean14 = document3.equals((java.lang.Object) (short) 10);
        java.util.regex.Pattern pattern16 = null;
        org.jsoup.select.Elements elements17 = document3.getElementsByAttributeValueMatching("<html>\n <head></head>\n <body></body>\n</html>", pattern16);
        org.jsoup.nodes.Element element19 = document3.append("<html>\n <head></head>\n <body></body>\n</html>&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;<<html> <head></head> <body> </body> </html>></<html> <head></head> <body> </body> </html>>");
        org.jsoup.nodes.Element element21 = document3.addClass("<head></head>\n<body></body>");
        java.lang.String str23 = element21.absUrl("&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt;&lt;/body&gt; &lt;/html&gt;&amp;lt;html&amp;gt; &amp;lt;head&amp;gt;&amp;lt;/head&amp;gt; &amp;lt;body&amp;gt; &amp;lt;/body&amp;gt; &amp;lt;/html&amp;gt;<#root>\n <html>\n  <head></head>\n  <body></body>\n </html>\n</#root>\n<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.nodes.Element element25 = element21.appendElement("<#document></#document>\n<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.select.Elements elements27 = element21.getElementsByIndexGreaterThan((int) (byte) 100);
        org.jsoup.nodes.Element element30 = element21.attr("&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt; &lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;#document\n<html>\n <head></head>\n <body></body>\n</html><hi!></hi!>", "<html>\n <head></head>\n <body>\n  &lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt; \n </body>\n</html><<html> <head></head> <body> </body> </html>></<html> <head></head> <body> </body> </html>>");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(document8);
        org.junit.Assert.assertNotNull(document10);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(elements17);
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(element25);
        org.junit.Assert.assertNotNull(elements27);
        org.junit.Assert.assertNotNull(element30);
    }

    @Test
    public void test3733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3733");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.select.Elements elements6 = document3.getElementsByIndexLessThan((int) (short) 10);
        java.util.Set<java.lang.String> strSet7 = document3.classNames();
        org.jsoup.select.Elements elements10 = document3.getElementsByAttributeValueNot("<html> <head></head> <body> </body> </html>", "#root");
        org.jsoup.nodes.Document document11 = document3.normalise();
        org.jsoup.select.Elements elements12 = document3.getAllElements();
        java.lang.String str13 = document3.ownText();
        org.jsoup.nodes.Element element15 = document3.val("");
        org.jsoup.select.Elements elements16 = document3.getAllElements();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertNotNull(document11);
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(elements16);
    }

    @Test
    public void test3734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3734");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.select.Elements elements6 = document3.getElementsByIndexLessThan((int) (short) 10);
        org.jsoup.nodes.Element element8 = document3.val("");
        org.jsoup.nodes.Element element10 = element8.val("hi!");
        org.jsoup.nodes.Element element12 = element10.prependText("");
        java.lang.String str14 = element10.absUrl("<html>\n <head></head>\n <body>\n </body>\n</html>\n<html> \n <head></head> \n <body>  \n </body>\n</html>");
        org.jsoup.nodes.Document document16 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document18 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element19 = document16.prependChild((org.jsoup.nodes.Node) document18);
        org.jsoup.select.Elements elements21 = document18.getElementsByIndexLessThan((int) (short) 10);
        org.jsoup.nodes.Element element23 = document18.val("");
        org.jsoup.nodes.Element element25 = element23.val("hi!");
        org.jsoup.select.Elements elements27 = element23.getElementsByIndexEquals((int) (short) 100);
        java.lang.String str28 = element23.tagName();
        element10.replaceWith((org.jsoup.nodes.Node) element23);
        java.lang.Integer int30 = element23.elementSiblingIndex();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(document16);
        org.junit.Assert.assertNotNull(document18);
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertNotNull(elements21);
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertNotNull(element25);
        org.junit.Assert.assertNotNull(elements27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "#root" + "'", str28, "#root");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
    }

    @Test
    public void test3735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3735");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        java.lang.String str5 = document3.html();
        java.lang.String str6 = document3.html();
        document3.title("<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.select.Elements elements9 = document3.getAllElements();
        org.jsoup.nodes.Element element11 = document3.html("");
        org.jsoup.nodes.Element element13 = document3.appendElement("<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.select.Elements elements15 = document3.getElementsByAttributeStarting("#root");
        org.jsoup.select.Elements elements17 = document3.getElementsByIndexGreaterThan(3);
        org.jsoup.select.Elements elements19 = document3.getElementsMatchingOwnText("<html>\n <head></head>\n <body></body>\n</html>\n<html> \n <head> \n  <title>&lt;html&gt;\n &lt;head&gt;&lt;/head&gt;\n &lt;body&gt;&lt;/body&gt;\n&lt;/html&gt;</title> \n </head> \n <body> \n </body>\n</html>");
        org.jsoup.nodes.Element element21 = document3.val("<html>\n <head></head>\n <body>\n  &lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt; &lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;\n </body>\n</html>\n<html> \n <head></head> \n <body>  \n </body>\n</html>");
        java.lang.String str22 = document3.toString();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str5, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str6, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertNotNull(elements17);
        org.junit.Assert.assertNotNull(elements19);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "<<html>\n <head></head>\n <body></body>\n</html>></<html>\n <head></head>\n <body></body>\n</html>>" + "'", str22, "<<html>\n <head></head>\n <body></body>\n</html>></<html>\n <head></head>\n <body></body>\n</html>>");
    }

    @Test
    public void test3736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3736");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.select.Elements elements6 = document3.getElementsByIndexLessThan((int) (short) 10);
        org.jsoup.nodes.Element element8 = document3.val("");
        org.jsoup.nodes.Element element10 = document3.after("#root");
        org.jsoup.nodes.Document document11 = document3.ownerDocument();
        org.jsoup.nodes.Document document13 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document15 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element16 = document13.prependChild((org.jsoup.nodes.Node) document15);
        org.jsoup.select.Elements elements18 = document15.getElementsByIndexLessThan((int) (short) 10);
        java.util.Set<java.lang.String> strSet19 = document15.classNames();
        org.jsoup.nodes.Element element22 = document15.attr("<html>\n <head></head>\n <body></body>\n</html>", "#root");
        org.jsoup.nodes.Element element23 = document3.appendChild((org.jsoup.nodes.Node) document15);
        java.util.Set<java.lang.String> strSet24 = document15.classNames();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(document11);
        org.junit.Assert.assertNotNull(document13);
        org.junit.Assert.assertNotNull(document15);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(elements18);
        org.junit.Assert.assertNotNull(strSet19);
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertNotNull(strSet24);
    }

    @Test
    public void test3737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3737");
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
        org.jsoup.nodes.Element element30 = element28.removeClass("<head></head>\n<body></body>");
        org.jsoup.nodes.Element element32 = element28.html("<html>\n <head></head>\n <body></body>\n</html>&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt; <html> <head></head> <body></body> </html> <html> <head></head> <body> </body> </html>");
        org.jsoup.nodes.Element element34 = element28.prependText("<html>\n <head>\n  <title>&lt;html&gt;\n &lt;head&gt;&lt;/head&gt;\n &lt;body&gt;&lt;/body&gt;\n&lt;/html&gt;</title>\n </head>\n <body></body>\n</html>");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str5, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str6, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;" + "'", str13, "<html>\n <head></head>\n <body></body>\n</html>&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;");
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(document17);
        org.junit.Assert.assertNotNull(document19);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertNotNull(elements23);
        org.junit.Assert.assertNotNull(element24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(element26);
        org.junit.Assert.assertNotNull(element28);
        org.junit.Assert.assertNotNull(element30);
        org.junit.Assert.assertNotNull(element32);
        org.junit.Assert.assertNotNull(element34);
    }

    @Test
    public void test3738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3738");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        java.lang.String str5 = document3.html();
        java.lang.String str6 = document3.html();
        org.jsoup.nodes.Document.OutputSettings outputSettings7 = document3.new OutputSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList8 = document3.siblingNodes();
        boolean boolean10 = document3.hasClass("<html>\n <head>\n  <title>&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;</title>\n </head>\n <body></body>\n</html>");
        org.jsoup.nodes.Element element12 = document3.createElement("html");
        org.jsoup.nodes.Element element14 = document3.removeClass("");
        org.jsoup.select.Elements elements15 = document3.siblingElements();
        org.jsoup.nodes.Document document16 = document3.normalise();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str5, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str6, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertNotNull(nodeList8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertNotNull(document16);
    }

    @Test
    public void test3739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3739");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.nodes.Element element5 = document1.body();
        org.jsoup.select.Elements elements8 = element5.getElementsByAttributeValueStarting("hi!", "hi!");
        org.jsoup.nodes.Element element10 = element5.prependText("<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.nodes.Element element12 = element5.append("<html> <head></head> <body> </body> </html>");
        org.jsoup.select.Elements elements15 = element12.getElementsByAttributeValueEnding("html", "<html>\n <head></head>\n <body>\n </body>\n</html>");
        org.jsoup.select.Elements elements16 = element12.children();
        org.jsoup.nodes.Element element17 = element12.empty();
        java.lang.String str18 = element12.toString();
        org.jsoup.nodes.Element element19 = element12.lastElementSibling();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertNotNull(elements16);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "\n<body></body>" + "'", str18, "\n<body></body>");
        org.junit.Assert.assertNotNull(element19);
    }

    @Test
    public void test3740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3740");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("#root");
        org.jsoup.nodes.Document.OutputSettings outputSettings2 = document1.outputSettings();
        org.jsoup.nodes.Element element4 = document1.removeClass("hi!");
        org.jsoup.nodes.Element element6 = document1.toggleClass("<html>\n <head></head>\n <body>\n </body>\n</html>");
        org.jsoup.nodes.Attributes attributes7 = element6.attributes();
        boolean boolean9 = element6.hasClass("<<head></head>\n<body></body>></<head></head>\n<body></body>>\n<html>\n <head></head>\n <body></body>\n</html><hi!></hi!>");
        org.jsoup.select.Elements elements12 = element6.getElementsByAttributeValueNot("<html> <head> <title>&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt;&lt;/body&gt; &lt;/html&gt;</title> </head> <body></body> </html>", "<html>\n <head></head>\n <body>\n  &lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt;&lt;/body&gt; &lt;/html&gt;&amp;lt;html&amp;gt; &amp;lt;head&amp;gt;&amp;lt;/head&amp;gt; &amp;lt;body&amp;gt; &amp;lt;/body&amp;gt; &amp;lt;/html&amp;gt;&lt;&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;&gt;&lt;/&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;&gt;\n </body>\n</html>");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(outputSettings2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(elements12);
    }

    @Test
    public void test3741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3741");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.nodes.Element element6 = document3.append("<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.select.Elements elements8 = document3.getElementsMatchingOwnText("<#root>\n <html>\n  <head></head>\n  <body></body>\n </html>\n</#root>\n<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.select.Elements elements10 = document3.getElementsByIndexEquals(0);
        java.util.regex.Pattern pattern12 = null;
        org.jsoup.select.Elements elements13 = document3.getElementsByAttributeValueMatching("<html>\n <head></head>\n <body></body>\n</html><<html>\n <head></head>\n <body></body>\n</html>&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;<<html> <head></head> <body> </body> </html>></<html> <head></head> <body> </body> </html>>></<html>\n <head></head>\n <body></body>\n</html>&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;<<html> <head></head> <body> </body> </html>></<html> <head></head> <body> </body> </html>>>", pattern12);
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertNotNull(elements13);
    }

    @Test
    public void test3742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3742");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        java.lang.String str5 = document3.html();
        java.lang.String str6 = document3.html();
        document3.title("<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.select.Elements elements9 = document3.getAllElements();
        org.jsoup.nodes.Element element11 = document3.html("");
        org.jsoup.nodes.Element element14 = document3.attr("<html>\n <head></head>\n <body></body>\n</html>", " html");
        org.jsoup.select.Elements elements15 = document3.siblingElements();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str5, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str6, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(elements15);
    }

    @Test
    public void test3743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3743");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.select.Elements elements6 = document3.getElementsByIndexLessThan((int) (short) 10);
        org.jsoup.select.Elements elements7 = document3.siblingElements();
        org.jsoup.nodes.Element element9 = document3.removeClass("<html>\n <head></head>\n <body>\n </body>\n</html>\n<html> \n <head></head> \n <body>  \n </body>\n</html>");
        boolean boolean11 = document3.hasAttr("&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt;&lt;/body&gt; &lt;/html&gt;&amp;lt;html&amp;gt; &amp;lt;head&amp;gt;&amp;lt;/head&amp;gt; &amp;lt;body&amp;gt; &amp;lt;/body&amp;gt; &amp;lt;/html&amp;gt;<#root>\n <html>\n  <head></head>\n  <body></body>\n </html>\n</#root>\n<html>\n <head></head>\n <body></body>\n</html>");
        java.util.List<org.jsoup.nodes.Node> nodeList12 = document3.childNodes();
        java.lang.String str13 = document3.val();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(nodeList12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test3744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3744");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        java.lang.String str5 = document3.html();
        java.lang.String str6 = document3.html();
        java.util.Map<java.lang.String, java.lang.String> strMap7 = document3.dataset();
        org.jsoup.nodes.Element element9 = document3.appendText("<html>\n <head></head>\n <body>\n </body>\n</html>");
        org.jsoup.select.Elements elements12 = document3.getElementsByAttributeValueStarting("<html>\n <head></head>\n <body>\n </body>\n</html>", "<html> <head></head> <body> </body> </html>");
        org.jsoup.select.Elements elements15 = document3.getElementsByAttributeValueMatching("<html> <head></head> <body> </body> </html>", "hi!");
        org.jsoup.select.Elements elements17 = document3.getElementsByTag("hi!");
        org.jsoup.nodes.Element element19 = document3.toggleClass("");
        boolean boolean20 = document3.hasText();
        java.lang.String str21 = document3.className();
        org.jsoup.nodes.Element element22 = document3.head();
        org.jsoup.nodes.Element element24 = element22.wrap("&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt;&lt;/body&gt; &lt;/html&gt;");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str5, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str6, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertNotNull(elements17);
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertNull(element24);
    }

    @Test
    public void test3745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3745");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        java.lang.String str5 = document3.html();
        java.lang.String str6 = document3.html();
        java.util.Map<java.lang.String, java.lang.String> strMap7 = document3.dataset();
        org.jsoup.nodes.Element element9 = document3.appendText("<html>\n <head></head>\n <body>\n </body>\n</html>");
        org.jsoup.select.Elements elements12 = document3.getElementsByAttributeValueStarting("<html>\n <head></head>\n <body>\n </body>\n</html>", "<html> <head></head> <body> </body> </html>");
        org.jsoup.nodes.Element element13 = document3.body();
        org.jsoup.nodes.Element element15 = document3.wrap("<#root class=\" html\" value=\"&lt;html&gt;\n &lt;head&gt;&lt;/head&gt;\n &lt;body&gt;&lt;/body&gt;\n&lt;/html&gt;&amp;lt;html&amp;gt; &amp;lt;head&amp;gt;&amp;lt;/head&amp;gt; &amp;lt;body&amp;gt; &amp;lt;/body&amp;gt; &amp;lt;/html&amp;gt;\">\n <html>\n  <head></head>\n  <body></body>\n </html>&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;\n</#root>\n<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.select.Elements elements18 = document3.getElementsByAttributeValueMatching("<html>\n <head></head>\n <body></body>\n</html>\n<html> \n <head> \n  <title>&lt;html&gt;\n &lt;head&gt;&lt;/head&gt;\n &lt;body&gt;&lt;/body&gt;\n&lt;/html&gt;</title> \n </head> \n <body> \n </body>\n</html>", "<html> <head> <title>&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt;&lt;/body&gt; &lt;/html&gt;</title> </head> <body></body> </html>");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str5, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str6, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(elements18);
    }

    @Test
    public void test3746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3746");
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
        org.jsoup.nodes.Document.OutputSettings outputSettings17 = document3.outputSettings();
        org.jsoup.nodes.Element element19 = document3.html("<#root value=\"\" #root=\"&lt;html&gt;\n &lt;head&gt;&lt;/head&gt;\n &lt;body&gt;&lt;/body&gt;\n&lt;/html&gt;\" class=\"\">\n <html>\n  <head></head>\n  <body></body>\n </html>\n</#root>#root\n<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.nodes.Element element21 = element19.removeClass("<#root>\n <html>\n  <head></head>\n  <body></body>\n </html>\n</#root>\n<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.nodes.Element element23 = element21.after("\n<head>\n #document \n <html> \n  <head></head> \n  <body> &lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;\n  </body>\n </html>\n</head>");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(tag5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(outputSettings10);
        org.junit.Assert.assertNotNull(document12);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(outputSettings17);
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertNotNull(element23);
    }

    @Test
    public void test3747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3747");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.parser.Tag tag5 = document3.tag();
        org.jsoup.select.Elements elements6 = document3.children();
        org.jsoup.select.Elements elements7 = document3.siblingElements();
        org.jsoup.nodes.Element element9 = document3.html("<html>\n <head></head>\n <body></body>\n</html>&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;<<html> <head></head> <body> </body> </html>></<html> <head></head> <body> </body> </html>>");
        org.jsoup.nodes.Document document11 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document13 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element14 = document11.prependChild((org.jsoup.nodes.Node) document13);
        org.jsoup.nodes.Element element16 = document11.removeClass("<#root value=\"&lt;html&gt;\n &lt;head&gt;&lt;/head&gt;\n &lt;body&gt;&lt;/body&gt;\n&lt;/html&gt;\">\n <html>\n  <head></head>\n  <body></body>\n </html>\n</#root>#root\n<html>\n <head></head>\n <body></body>\n</html>");
        java.util.Set<java.lang.String> strSet17 = document11.classNames();
        org.jsoup.nodes.Element element18 = document3.classNames(strSet17);
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(tag5);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(document11);
        org.junit.Assert.assertNotNull(document13);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(strSet17);
        org.junit.Assert.assertNotNull(element18);
    }

    @Test
    public void test3748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3748");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.select.Elements elements6 = document3.getElementsByIndexLessThan((int) (short) 10);
        org.jsoup.nodes.Element element8 = document3.val("");
        org.jsoup.nodes.Element element10 = document3.after("#root");
        org.jsoup.nodes.Document document11 = document3.ownerDocument();
        org.jsoup.nodes.Element element14 = document3.attr("#root", "<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.select.Elements elements16 = document3.getElementsContainingOwnText("#document");
        org.jsoup.select.Elements elements17 = document3.getAllElements();
        org.jsoup.select.Elements elements20 = document3.getElementsByAttributeValueStarting("body", "\n<body></body>");
        org.jsoup.nodes.Element element22 = document3.text("<#root value=\"\" #root=\"&lt;html&gt;\n &lt;head&gt;&lt;/head&gt;\n &lt;body&gt;&lt;/body&gt;\n&lt;/html&gt;\" class=\"\">\n <html>\n  <head></head>\n  <body></body>\n </html>\n</#root>#root\n<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.nodes.Document document24 = org.jsoup.nodes.Document.createShell("");
        java.lang.String str26 = document24.absUrl("<html> <head></head> <body> </body> </html>");
        java.lang.String str27 = document24.nodeName();
        org.jsoup.nodes.Element element28 = element22.appendChild((org.jsoup.nodes.Node) document24);
        org.jsoup.nodes.Element element30 = document24.text("<html>\n <head></head>\n <body>\n  &lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt;&lt;/body&gt; &lt;/html&gt;&amp;lt;html&amp;gt; &amp;lt;head&amp;gt;&amp;lt;/head&amp;gt; &amp;lt;body&amp;gt; &amp;lt;/body&amp;gt; &amp;lt;/html&amp;gt;&lt;&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;&gt;&lt;/&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;&gt;\n </body>\n</html>");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(document11);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(elements16);
        org.junit.Assert.assertNotNull(elements17);
        org.junit.Assert.assertNotNull(elements20);
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertNotNull(document24);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "#document" + "'", str27, "#document");
        org.junit.Assert.assertNotNull(element28);
        org.junit.Assert.assertNotNull(element30);
    }

    @Test
    public void test3749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3749");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.select.Elements elements6 = document3.getElementsByIndexLessThan((int) (short) 10);
        org.jsoup.nodes.Element element8 = document3.val("");
        org.jsoup.nodes.Element element10 = element8.val("hi!");
        java.lang.String str11 = element10.className();
        org.jsoup.nodes.Element element13 = element10.after("<#root>\n <html>\n  <head></head>\n  <body></body>\n </html>\n</#root>\n<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.nodes.Element element15 = element13.html("<html>\n <head></head>\n <body>\n  &lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt; &lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;\n </body>\n</html>\n<html> \n <head></head> \n <body>  \n </body>\n</html>");
        org.jsoup.nodes.Element element17 = element15.prependElement("#document <html> <head></head> <body></body> </html>&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(element17);
    }

    @Test
    public void test3750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3750");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        java.lang.String str5 = document3.html();
        java.lang.String str6 = document3.html();
        java.util.Map<java.lang.String, java.lang.String> strMap7 = document3.dataset();
        org.jsoup.nodes.Element element8 = document3.lastElementSibling();
        java.lang.String str9 = element8.tagName();
        boolean boolean10 = element8.hasText();
        boolean boolean12 = element8.hasAttr("<head></head>\n<body></body>");
        org.jsoup.nodes.Element element14 = element8.child(0);
        java.lang.String str15 = element8.html();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str5, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str6, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "html" + "'", str9, "html");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "<head></head>\n<body></body>" + "'", str15, "<head></head>\n<body></body>");
    }

    @Test
    public void test3751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3751");
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
        org.jsoup.nodes.Element element34 = document22.wrap("<html>\n <head>\n  <title>&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;</title>\n </head>\n <body></body>\n</html>");
        java.lang.String str35 = element34.ownText();
        org.jsoup.nodes.Element element37 = element34.before("<html> \n <head> \n  <title>&lt;html&gt;\n &lt;head&gt;&lt;/head&gt;\n &lt;body&gt;&lt;/body&gt;\n&lt;/html&gt;</title> \n </head> \n <body> \n </body>\n</html>");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(document11);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNotNull(document20);
        org.junit.Assert.assertNotNull(document22);
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertNotNull(elements25);
        org.junit.Assert.assertNotNull(element27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str28, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertNotNull(elements31);
        org.junit.Assert.assertNotNull(element32);
        org.junit.Assert.assertNotNull(element34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertNotNull(element37);
    }

    @Test
    public void test3752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3752");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.select.Elements elements6 = document3.getElementsByIndexLessThan((int) (short) 10);
        java.util.Set<java.lang.String> strSet7 = document3.classNames();
        org.jsoup.nodes.Element element10 = document3.attr("<html>\n <head></head>\n <body></body>\n</html>", "#root");
        java.lang.String str11 = element10.id();
        org.jsoup.nodes.Element element13 = element10.addClass("<html>\n <head></head>\n <body></body>\n</html>&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;");
        org.jsoup.select.Elements elements14 = element13.getAllElements();
        java.util.List<org.jsoup.nodes.Node> nodeList15 = element13.siblingNodes();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(elements14);
        org.junit.Assert.assertNotNull(nodeList15);
    }

    @Test
    public void test3753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3753");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        boolean boolean3 = document1.hasClass("");
        org.jsoup.nodes.Document document4 = document1.normalise();
        document1.title("<html>\n <head></head>\n <body>\n </body>\n</html>\n<html> \n <head></head> \n <body>  \n </body>\n</html>");
        org.jsoup.nodes.Document.OutputSettings outputSettings7 = document1.outputSettings();
        java.nio.charset.Charset charset8 = outputSettings7.charset();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(document4);
        org.junit.Assert.assertNotNull(outputSettings7);
        org.junit.Assert.assertNotNull(charset8);
    }

    @Test
    public void test3754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3754");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.select.Elements elements6 = document3.getElementsByIndexLessThan((int) (short) 10);
        org.jsoup.nodes.Element element8 = document3.val("");
        org.jsoup.nodes.Element element10 = element8.val("hi!");
        org.jsoup.nodes.Element element12 = element10.prependText("");
        org.jsoup.nodes.Element element14 = element10.prepend("<html>\n <head></head>\n <body></body>\n</html>&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;<<html> <head></head> <body> </body> </html>></<html> <head></head> <body> </body> </html>>");
        org.jsoup.nodes.Document document15 = element14.ownerDocument();
        org.jsoup.nodes.Document document17 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document19 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element20 = document17.prependChild((org.jsoup.nodes.Node) document19);
        org.jsoup.select.Elements elements22 = document19.getElementsByIndexLessThan((int) (short) 10);
        org.jsoup.nodes.Element element24 = document19.val("");
        org.jsoup.nodes.Element element26 = document19.after("#root");
        org.jsoup.nodes.Document document27 = document19.ownerDocument();
        org.jsoup.nodes.Element element30 = document19.attr("#root", "<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.nodes.Element element32 = element30.removeClass("");
        org.jsoup.select.Elements elements34 = element30.getElementsByAttribute("#document");
        boolean boolean35 = document15.equals((java.lang.Object) element30);
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(document15);
        org.junit.Assert.assertNotNull(document17);
        org.junit.Assert.assertNotNull(document19);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertNotNull(elements22);
        org.junit.Assert.assertNotNull(element24);
        org.junit.Assert.assertNotNull(element26);
        org.junit.Assert.assertNotNull(document27);
        org.junit.Assert.assertNotNull(element30);
        org.junit.Assert.assertNotNull(element32);
        org.junit.Assert.assertNotNull(elements34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test3755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3755");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        java.lang.String str5 = document3.nodeName();
        org.jsoup.nodes.Element element7 = document3.before("<html> <head></head> <body></body> </html>");
        org.jsoup.nodes.Document document8 = document3.normalise();
        org.jsoup.select.Elements elements11 = document8.getElementsByAttributeValueContaining("<html>\n <head></head>\n <body></body>\n</html>#root", "<html> \n <head></head> \n <body>  \n </body>\n</html>");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#document" + "'", str5, "#document");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(document8);
        org.junit.Assert.assertNotNull(elements11);
    }

    @Test
    public void test3756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3756");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.select.Elements elements6 = document3.getElementsByIndexLessThan((int) (short) 10);
        org.jsoup.nodes.Element element8 = document3.val("");
        org.jsoup.nodes.Element element10 = document3.after("#root");
        org.jsoup.nodes.Document document11 = document3.ownerDocument();
        org.jsoup.nodes.Element element14 = document3.attr("#root", "<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.select.Elements elements16 = document3.select("#root");
        document3.title("");
        org.jsoup.nodes.Element element19 = document3.lastElementSibling();
        org.jsoup.select.Elements elements20 = element19.children();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements22 = element19.select("<html>\n <head></head>\n <body></body>\n</html><<html>\n <head></head>\n <body></body>\n</html>&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;<<html> <head></head> <body> </body> </html>></<html> <head></head> <body> </body> </html>>></<html>\n <head></head>\n <body></body>\n</html>&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;<<html> <head></head> <body> </body> </html>></<html> <head></head> <body> </body> </html>>>");
            org.junit.Assert.fail("Expected exception of type org.jsoup.select.Selector.SelectorParseException; message: Could not parse query '<html>? <head></head>? <body></body>?</html><<html>? <head></head>? <body></body>?</html>&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;<<html> <head></head> <body> </body> </html>></<html> <head></head> <body> </body> </html>>></<html>? <head></head>? <body></body>?</html>&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;<<html> <head></head> <body> </body> </html>></<html> <head></head> <body> </body> </html>>>': unexpected token at '<html>? <head></head>? <body></body>?</html><<html>? <head></head>? <body></body>?</html>&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;<<html> <head></head> <body> </body> </html>></<html> <head></head> <body> </body> </html>>></<html>? <head></head>? <body></body>?</html>&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;<<html> <head></head> <body> </body> </html>></<html> <head></head> <body> </body> </html>>>'");
        } catch (org.jsoup.select.Selector.SelectorParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(document11);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(elements16);
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertNotNull(elements20);
    }

    @Test
    public void test3757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3757");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        java.lang.String str5 = document3.html();
        java.lang.String str6 = document3.html();
        document3.title("<html>\n <head></head>\n <body></body>\n</html>");
        java.util.regex.Pattern pattern10 = null;
        org.jsoup.select.Elements elements11 = document3.getElementsByAttributeValueMatching("hi!", pattern10);
        java.util.List<org.jsoup.nodes.Node> nodeList12 = document3.siblingNodes();
        org.jsoup.select.Elements elements13 = document3.parents();
        org.jsoup.nodes.Element element15 = document3.before("<html> \n <head></head> \n <body>  \n </body>\n</html>");
        org.jsoup.nodes.Node node16 = document3.previousSibling();
        java.util.Set<java.lang.String> strSet17 = document3.classNames();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str5, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str6, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(nodeList12);
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertNotNull(strSet17);
    }

    @Test
    public void test3758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3758");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        java.lang.String str5 = document3.html();
        java.lang.String str6 = document3.html();
        java.util.Map<java.lang.String, java.lang.String> strMap7 = document3.dataset();
        org.jsoup.nodes.Element element8 = document3.head();
        org.jsoup.select.Elements elements10 = document3.getElementsByAttribute("html");
        org.jsoup.nodes.Element element11 = document3.previousElementSibling();
        org.jsoup.nodes.Element element13 = document3.html("");
        java.lang.String str15 = document3.attr("<html> <head></head> <body> </body> </html> <html> <head></head> <body> </body> </html> #document");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str5, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str6, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertNull(element11);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test3759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3759");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        java.lang.String str5 = document3.html();
        java.lang.String str6 = document3.html();
        java.util.Map<java.lang.String, java.lang.String> strMap7 = document3.dataset();
        org.jsoup.nodes.Element element9 = document3.appendText("<html>\n <head></head>\n <body>\n </body>\n</html>");
        org.jsoup.select.Elements elements12 = document3.getElementsByAttributeValueStarting("<html>\n <head></head>\n <body>\n </body>\n</html>", "<html> <head></head> <body> </body> </html>");
        org.jsoup.select.Elements elements15 = document3.getElementsByAttributeValueMatching("<html> <head></head> <body> </body> </html>", "hi!");
        org.jsoup.nodes.Element element17 = document3.addClass("html");
        org.jsoup.nodes.Element element19 = element17.val("<html>\n <head></head>\n <body></body>\n</html>&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;");
        org.jsoup.nodes.Element element21 = element19.prepend("#root");
        org.jsoup.select.Elements elements24 = element21.getElementsByAttributeValueContaining("<html>\n <head>\n  <title>&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;</title>\n </head>\n <body></body>\n</html>", "<html>\n <head></head>\n <body>\n </body>\n</html>");
        org.jsoup.select.Elements elements26 = element21.getElementsMatchingOwnText("<html> \n <head></head> \n <body>  \n </body>\n</html>");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str5, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str6, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertNotNull(elements24);
        org.junit.Assert.assertNotNull(elements26);
    }

    @Test
    public void test3760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3760");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        java.lang.String str5 = document3.html();
        java.lang.String str6 = document3.html();
        java.util.Map<java.lang.String, java.lang.String> strMap7 = document3.dataset();
        org.jsoup.nodes.Element element9 = document3.appendElement("hi!");
        boolean boolean10 = document3.isBlock();
        org.jsoup.nodes.Element element11 = document3.empty();
        org.jsoup.nodes.Document document13 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document15 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element16 = document13.prependChild((org.jsoup.nodes.Node) document15);
        java.lang.String str17 = document13.tagName();
        org.jsoup.nodes.Document.OutputSettings outputSettings18 = document13.new OutputSettings();
        org.jsoup.nodes.Document document19 = document13.normalise();
        org.jsoup.select.Elements elements21 = document19.getElementsByIndexEquals((int) (byte) 1);
        java.util.Set<java.lang.String> strSet22 = document19.classNames();
        org.jsoup.select.Elements elements24 = document19.getElementsByIndexEquals(3);
        org.jsoup.nodes.Element element25 = element11.prependChild((org.jsoup.nodes.Node) document19);
        org.jsoup.nodes.Element element27 = element11.removeClass("<body></body>&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt;&lt;/body&gt; &lt;/html&gt;\n<html> \n <head></head> \n <body>  \n </body>\n</html>");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str5, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str6, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(document13);
        org.junit.Assert.assertNotNull(document15);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "#root" + "'", str17, "#root");
        org.junit.Assert.assertNotNull(document19);
        org.junit.Assert.assertNotNull(elements21);
        org.junit.Assert.assertNotNull(strSet22);
        org.junit.Assert.assertNotNull(elements24);
        org.junit.Assert.assertNotNull(element25);
        org.junit.Assert.assertNotNull(element27);
    }

    @Test
    public void test3761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3761");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.select.Elements elements6 = document3.getElementsByIndexLessThan((int) (short) 10);
        org.jsoup.nodes.Element element8 = document3.val("");
        java.lang.String str9 = document3.outerHtml();
        org.jsoup.select.Elements elements11 = document3.getElementsByClass("#root");
        org.jsoup.select.Elements elements13 = document3.getElementsByIndexGreaterThan(10);
        java.lang.Integer int14 = document3.elementSiblingIndex();
        org.jsoup.nodes.Element element15 = document3.body();
        org.jsoup.nodes.Element element17 = element15.val("\n<body></body>");
        org.jsoup.select.Elements elements18 = element15.getAllElements();
        org.jsoup.nodes.Element element20 = element15.appendText("");
        org.jsoup.select.Elements elements21 = element20.children();
        org.jsoup.nodes.Attributes attributes22 = element20.attributes();
        org.jsoup.select.Elements elements24 = element20.getElementsMatchingOwnText("<html> <head> <title>&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt;&lt;/body&gt; &lt;/html&gt;</title> </head> <body></body> </html>");
        java.lang.String str25 = element20.val();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str9, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(elements18);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertNotNull(elements21);
        org.junit.Assert.assertNotNull(attributes22);
        org.junit.Assert.assertNotNull(elements24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "\n<body></body>" + "'", str25, "\n<body></body>");
    }

    @Test
    public void test3762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3762");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt;&lt;/body&gt; &lt;/html&gt;\n<html>\n <head>\n  <title>&lt;html&gt;\n &lt;head&gt;&lt;/head&gt;\n &lt;body&gt;&lt;/body&gt;\n&lt;/html&gt;</title>\n </head>\n <body>\n  hi!\n </body>\n</html>");
    }

    @Test
    public void test3763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3763");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("<html>\n <head></head>\n <body></body>\n</html><<html>\n <head></head>\n <body></body>\n</html>&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;<<html> <head></head> <body> </body> </html>></<html> <head></head> <body> </body> </html>>></<html>\n <head></head>\n <body></body>\n</html>&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;<<html> <head></head> <body> </body> </html>></<html> <head></head> <body> </body> </html>>>");
        org.jsoup.select.Elements elements3 = document1.getElementsMatchingOwnText("hi!\n<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.nodes.Element element5 = document1.prependText("<#document></#document>\n<html>\n <head>\n  <title>#document</title>\n </head>\n <body>\n  &lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt;&lt;/body&gt; &lt;/html&gt;\n </body>\n</html><hi!></hi!>");
        java.lang.String str6 = element5.html();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "&lt;#document&gt;&lt;/#document&gt; &lt;html&gt; &lt;head&gt; &lt;title&gt;#document&lt;/title&gt; &lt;/head&gt; &lt;body&gt; &amp;lt;html&amp;gt; &amp;lt;head&amp;gt;&amp;lt;/head&amp;gt; &amp;lt;body&amp;gt;&amp;lt;/body&amp;gt; &amp;lt;/html&amp;gt; &lt;/body&gt; &lt;/html&gt;&lt;hi!&gt;&lt;/hi!&gt;\n<html>\n <head></head>\n <body></body>\n</html>" + "'", str6, "&lt;#document&gt;&lt;/#document&gt; &lt;html&gt; &lt;head&gt; &lt;title&gt;#document&lt;/title&gt; &lt;/head&gt; &lt;body&gt; &amp;lt;html&amp;gt; &amp;lt;head&amp;gt;&amp;lt;/head&amp;gt; &amp;lt;body&amp;gt;&amp;lt;/body&amp;gt; &amp;lt;/html&amp;gt; &lt;/body&gt; &lt;/html&gt;&lt;hi!&gt;&lt;/hi!&gt;\n<html>\n <head></head>\n <body></body>\n</html>");
    }

    @Test
    public void test3764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3764");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        java.lang.String str5 = document3.className();
        org.jsoup.nodes.Element element7 = document3.toggleClass("#root");
        org.jsoup.select.Elements elements9 = document3.getElementsByClass("<html>\n <head></head>\n <body>\n </body>\n</html>\n<html> \n <head></head> \n <body>  \n </body>\n</html>");
        org.jsoup.nodes.Element element11 = document3.after("<html>\n <head></head>\n <body></body>\n</html>&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;<<html> <head></head> <body> </body> </html>></<html> <head></head> <body> </body> </html>>");
        org.jsoup.nodes.Element element13 = document3.val("<html>\n <head></head>\n <body>\n </body>\n</html>\n<html> \n <head></head> \n <body>  \n </body>\n</html>");
        java.lang.String str14 = document3.val();
        java.lang.String str15 = document3.outerHtml();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "<html>\n <head></head>\n <body>\n </body>\n</html>\n<html> \n <head></head> \n <body>  \n </body>\n</html>" + "'", str14, "<html>\n <head></head>\n <body>\n </body>\n</html>\n<html> \n <head></head> \n <body>  \n </body>\n</html>");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str15, "<html>\n <head></head>\n <body></body>\n</html>");
    }

    @Test
    public void test3765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3765");
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
        org.jsoup.select.Elements elements18 = document3.getElementsByIndexLessThan((int) '#');
        org.jsoup.nodes.Document.OutputSettings outputSettings19 = document3.new OutputSettings();
        org.jsoup.nodes.Element element21 = document3.val("<html>\n <head>\n  <title>&lt;html&gt;\n &lt;head&gt;&lt;/head&gt;\n &lt;body&gt;&lt;/body&gt;\n&lt;/html&gt;</title>\n </head>\n <body></body>\n</html>");
        java.lang.String str22 = element21.toString();
        org.jsoup.nodes.Element element24 = element21.val("<html>\n <head></head>\n <body>\n </body>\n</html>\n<html> \n <head></head> \n <body>  \n </body>\n</html>");
        boolean boolean25 = element21.hasText();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str9, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertNotNull(tag16);
        org.junit.Assert.assertNotNull(elements18);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str22, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertNotNull(element24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test3766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3766");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        java.lang.String str5 = document3.html();
        java.lang.String str6 = document3.html();
        document3.title("<html>\n <head></head>\n <body></body>\n</html>");
        java.util.regex.Pattern pattern10 = null;
        org.jsoup.select.Elements elements11 = document3.getElementsByAttributeValueMatching("hi!", pattern10);
        org.jsoup.nodes.Element element13 = document3.after("");
        java.lang.String str14 = document3.val();
        java.lang.String str15 = document3.nodeName();
        org.jsoup.nodes.Document document16 = document3.ownerDocument();
        document3.remove();
        org.jsoup.select.Elements elements19 = document3.getElementsContainingText("");
        org.jsoup.nodes.Element element20 = document3.empty();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str5, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str6, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "#document" + "'", str15, "#document");
        org.junit.Assert.assertNotNull(document16);
        org.junit.Assert.assertNotNull(elements19);
        org.junit.Assert.assertNotNull(element20);
    }

    @Test
    public void test3767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3767");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        java.lang.String str5 = document3.html();
        java.lang.String str6 = document3.html();
        document3.title("<html>\n <head></head>\n <body></body>\n</html>");
        java.util.regex.Pattern pattern10 = null;
        org.jsoup.select.Elements elements11 = document3.getElementsByAttributeValueMatching("hi!", pattern10);
        java.util.List<org.jsoup.nodes.Node> nodeList12 = document3.siblingNodes();
        org.jsoup.select.Elements elements13 = document3.parents();
        org.jsoup.select.Elements elements16 = document3.getElementsByAttributeValueEnding("<#root value=\"\" #root=\"&lt;html&gt;\n &lt;head&gt;&lt;/head&gt;\n &lt;body&gt;&lt;/body&gt;\n&lt;/html&gt;\" class=\"\">\n <html>\n  <head></head>\n  <body></body>\n </html><<html>\n <head></head>\n <body>\n </body>\n</html>></<html>\n <head></head>\n <body>\n </body>\n</html>>\n</#root>", "<html>\n <head></head>\n <body>\n </body>\n</html>\n<html> \n <head></head> \n <body>  \n </body>\n</html>");
        org.jsoup.nodes.Document document18 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document20 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element21 = document18.prependChild((org.jsoup.nodes.Node) document20);
        java.lang.String str22 = document20.html();
        java.lang.String str23 = document20.html();
        java.util.Map<java.lang.String, java.lang.String> strMap24 = document20.dataset();
        org.jsoup.nodes.Element element26 = document20.appendText("<html>\n <head></head>\n <body>\n </body>\n</html>");
        org.jsoup.select.Elements elements29 = document20.getElementsByAttributeValueStarting("<html>\n <head></head>\n <body>\n </body>\n</html>", "<html> <head></head> <body> </body> </html>");
        java.lang.String str30 = document20.outerHtml();
        org.jsoup.nodes.Element element32 = document20.prepend("<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.nodes.Document document34 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document36 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element37 = document34.prependChild((org.jsoup.nodes.Node) document36);
        org.jsoup.nodes.Element element38 = document34.body();
        org.jsoup.select.Elements elements40 = document34.select("#root");
        org.jsoup.nodes.Element element41 = document34.empty();
        java.lang.String str42 = document34.html();
        org.jsoup.nodes.Element element43 = document20.prependChild((org.jsoup.nodes.Node) document34);
        org.jsoup.nodes.Element element45 = document34.appendText("<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.nodes.Element element47 = element45.removeClass("<head></head>\n<body></body>");
        org.jsoup.nodes.Element element49 = element45.html("<html>\n <head></head>\n <body></body>\n</html>&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt; <html> <head></head> <body></body> </html> <html> <head></head> <body> </body> </html>");
        java.lang.String str50 = element45.ownText();
        org.jsoup.nodes.Element element51 = element45.parent();
        org.jsoup.nodes.Element element52 = document3.appendChild((org.jsoup.nodes.Node) element51);
        org.jsoup.nodes.Element element54 = element52.appendElement("<<html>\n <head></head>\n <body></body>\n</html>></<html>\n <head></head>\n <body></body>\n</html>>");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str5, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str6, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(nodeList12);
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertNotNull(elements16);
        org.junit.Assert.assertNotNull(document18);
        org.junit.Assert.assertNotNull(document20);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str22, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str23, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertNotNull(strMap24);
        org.junit.Assert.assertNotNull(element26);
        org.junit.Assert.assertNotNull(elements29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;" + "'", str30, "<html>\n <head></head>\n <body></body>\n</html>&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;");
        org.junit.Assert.assertNotNull(element32);
        org.junit.Assert.assertNotNull(document34);
        org.junit.Assert.assertNotNull(document36);
        org.junit.Assert.assertNotNull(element37);
        org.junit.Assert.assertNotNull(element38);
        org.junit.Assert.assertNotNull(elements40);
        org.junit.Assert.assertNotNull(element41);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertNotNull(element43);
        org.junit.Assert.assertNotNull(element45);
        org.junit.Assert.assertNotNull(element47);
        org.junit.Assert.assertNotNull(element49);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertNotNull(element51);
        org.junit.Assert.assertNotNull(element52);
        org.junit.Assert.assertNotNull(element54);
    }

    @Test
    public void test3768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3768");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        java.lang.String str2 = document1.tagName();
        org.jsoup.nodes.Element element4 = document1.prepend("hi!");
        java.lang.String str5 = element4.id();
        org.jsoup.select.Elements elements7 = element4.getElementsByClass("<#document></#document>\n<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#root" + "'", str2, "#root");
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(elements7);
    }

    @Test
    public void test3769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3769");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        java.lang.String str5 = document3.html();
        java.lang.String str6 = document3.html();
        java.util.Map<java.lang.String, java.lang.String> strMap7 = document3.dataset();
        org.jsoup.nodes.Element element9 = document3.appendElement("hi!");
        boolean boolean10 = document3.isBlock();
        org.jsoup.select.Elements elements11 = document3.parents();
        org.jsoup.nodes.Document document13 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document15 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element16 = document13.prependChild((org.jsoup.nodes.Node) document15);
        java.lang.String str17 = document13.tagName();
        org.jsoup.nodes.Element element18 = document13.head();
        java.lang.Integer int19 = element18.siblingIndex();
        org.jsoup.nodes.Document document21 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document23 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element24 = document21.prependChild((org.jsoup.nodes.Node) document23);
        org.jsoup.select.Elements elements26 = document23.getElementsByIndexLessThan((int) (short) 10);
        org.jsoup.nodes.Element element28 = document23.val("");
        java.lang.String str29 = document23.outerHtml();
        org.jsoup.select.Elements elements31 = document23.getElementsByClass("#root");
        java.lang.String str32 = document23.data();
        org.jsoup.nodes.Element element34 = document23.text("<html>\n <head>\n  <title>&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;</title>\n </head>\n <body></body>\n</html>");
        org.jsoup.nodes.Element element35 = document23.body();
        element18.replaceWith((org.jsoup.nodes.Node) document23);
        org.jsoup.nodes.Element element37 = document3.appendChild((org.jsoup.nodes.Node) document23);
        document3.title("<#root value=\"\" #root=\"&lt;html&gt;\n &lt;head&gt;&lt;/head&gt;\n &lt;body&gt;&lt;/body&gt;\n&lt;/html&gt;\" class=\"\">\n <html>\n  <head></head>\n  <body></body>\n </html><<html>\n <head></head>\n <body>\n </body>\n</html>></<html>\n <head></head>\n <body>\n </body>\n</html>>\n</#root>");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str5, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str6, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(document13);
        org.junit.Assert.assertNotNull(document15);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "#root" + "'", str17, "#root");
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(document21);
        org.junit.Assert.assertNotNull(document23);
        org.junit.Assert.assertNotNull(element24);
        org.junit.Assert.assertNotNull(elements26);
        org.junit.Assert.assertNotNull(element28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str29, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertNotNull(elements31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertNotNull(element34);
        org.junit.Assert.assertNotNull(element35);
        org.junit.Assert.assertNotNull(element37);
    }

    @Test
    public void test3770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3770");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.select.Elements elements6 = document3.getElementsByIndexLessThan((int) (short) 10);
        org.jsoup.nodes.Element element8 = document3.val("");
        org.jsoup.nodes.Element element10 = document3.after("#root");
        org.jsoup.nodes.Document document11 = document3.ownerDocument();
        document11.title("\n<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.select.Elements elements15 = document11.getElementsContainingOwnText("<html> <head> <title>&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt;&lt;/body&gt; &lt;/html&gt;</title> </head> <body></body> </html>");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(document11);
        org.junit.Assert.assertNotNull(elements15);
    }

    @Test
    public void test3771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3771");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.select.Elements elements6 = document3.getElementsByIndexLessThan((int) (short) 10);
        org.jsoup.nodes.Element element8 = document3.val("");
        java.lang.String str9 = document3.outerHtml();
        org.jsoup.select.Elements elements11 = document3.getElementsByClass("#root");
        org.jsoup.select.Elements elements13 = document3.getElementsByIndexGreaterThan(10);
        org.jsoup.nodes.Element element15 = document3.text("<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.select.Elements elements17 = element15.getElementsByAttribute("hi!");
        boolean boolean18 = element15.isBlock();
        org.jsoup.nodes.Element element20 = element15.wrap("<html>\n <head></head>\n <body>\n </body>\n</html>");
        element20.setBaseUri("<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.nodes.Element element23 = element20.empty();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str9, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(elements17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertNotNull(element23);
    }

    @Test
    public void test3772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3772");
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
        org.jsoup.nodes.Document.OutputSettings outputSettings16 = document15.outputSettings();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(document11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertNotNull(document15);
        org.junit.Assert.assertNotNull(outputSettings16);
    }

    @Test
    public void test3773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3773");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.select.Elements elements6 = document3.getElementsByIndexLessThan((int) (short) 10);
        org.jsoup.nodes.Element element8 = document3.val("");
        org.jsoup.nodes.Element element10 = element8.val("hi!");
        java.lang.String str11 = element10.className();
        org.jsoup.select.Elements elements12 = element10.getAllElements();
        org.jsoup.select.Elements elements14 = element10.getElementsMatchingOwnText("<html>\n <head></head>\n <body></body>\n</html>&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;<<html> <head></head> <body> </body> </html>></<html> <head></head> <body> </body> </html>>");
        java.util.Map<java.lang.String, java.lang.String> strMap15 = element10.dataset();
        org.jsoup.select.Elements elements17 = element10.getElementsByAttributeStarting("<#document></#document>\n<html>\n <head>\n  <title>#document</title>\n </head>\n <body>\n  &lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt;&lt;/body&gt; &lt;/html&gt;\n </body>\n</html><hi!></hi!>");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertNotNull(elements14);
        org.junit.Assert.assertNotNull(strMap15);
        org.junit.Assert.assertNotNull(elements17);
    }

    @Test
    public void test3774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3774");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        java.lang.String str3 = document1.absUrl("<html> <head></head> <body> </body> </html>");
        org.jsoup.select.Elements elements5 = document1.getElementsContainingOwnText("<html>\n <head></head>\n <body></body>\n</html>&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;");
        org.jsoup.nodes.Element element6 = document1.head();
        org.jsoup.nodes.Element element8 = document1.addClass("<html>\n <head>\n  <title>&lt;html&gt;\n &lt;head&gt;&lt;/head&gt;\n &lt;body&gt;&lt;/body&gt;\n&lt;/html&gt;</title>\n </head>\n <body></body>\n</html>");
        org.jsoup.nodes.Element element10 = document1.html("<html>\n <head></head>\n <body></body>\n</html><<html>\n <head></head>\n <body></body>\n</html>&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;<<html> <head></head> <body> </body> </html>></<html> <head></head> <body> </body> </html>>></<html>\n <head></head>\n <body></body>\n</html>&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;<<html> <head></head> <body> </body> </html>></<html> <head></head> <body> </body> </html>>>");
        java.lang.String str11 = element10.val();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test3775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3775");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        java.lang.String str5 = document1.tagName();
        org.jsoup.nodes.Document.OutputSettings outputSettings6 = document1.new OutputSettings();
        boolean boolean7 = outputSettings6.prettyPrint();
        java.nio.charset.CharsetEncoder charsetEncoder8 = outputSettings6.encoder();
        org.jsoup.nodes.Document document10 = org.jsoup.nodes.Document.createShell("#root");
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = document10.outputSettings();
        java.nio.charset.Charset charset12 = outputSettings11.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings13 = outputSettings6.charset(charset12);
        java.nio.charset.CharsetEncoder charsetEncoder14 = outputSettings13.encoder();
        org.jsoup.nodes.Document.OutputSettings outputSettings16 = outputSettings13.prettyPrint(true);
        org.jsoup.nodes.Document document18 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document20 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element21 = document18.prependChild((org.jsoup.nodes.Node) document20);
        java.lang.String str22 = document18.tagName();
        org.jsoup.nodes.Document.OutputSettings outputSettings23 = document18.new OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings25 = outputSettings23.indentAmount(0);
        org.jsoup.nodes.Entities.EscapeMode escapeMode26 = outputSettings25.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings27 = outputSettings16.escapeMode(escapeMode26);
        java.nio.charset.CharsetEncoder charsetEncoder28 = outputSettings27.encoder();
        boolean boolean29 = outputSettings27.prettyPrint();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#root" + "'", str5, "#root");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(charsetEncoder8);
        org.junit.Assert.assertNotNull(document10);
        org.junit.Assert.assertNotNull(outputSettings11);
        org.junit.Assert.assertNotNull(charset12);
        org.junit.Assert.assertNotNull(outputSettings13);
        org.junit.Assert.assertNotNull(charsetEncoder14);
        org.junit.Assert.assertNotNull(outputSettings16);
        org.junit.Assert.assertNotNull(document18);
        org.junit.Assert.assertNotNull(document20);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "#root" + "'", str22, "#root");
        org.junit.Assert.assertNotNull(outputSettings25);
        org.junit.Assert.assertTrue("'" + escapeMode26 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode26.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings27);
        org.junit.Assert.assertNotNull(charsetEncoder28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
    }

    @Test
    public void test3776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3776");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.select.Elements elements6 = document3.getElementsByIndexLessThan((int) (short) 10);
        org.jsoup.nodes.Element element8 = document3.val("");
        org.jsoup.nodes.Element element10 = document3.after("#root");
        java.lang.String str12 = document3.attr("<html>\n <head></head>\n <body>\n </body>\n</html>");
        org.jsoup.nodes.Element element14 = document3.appendText("#root");
        org.jsoup.nodes.Element element16 = document3.toggleClass("hi!");
        org.jsoup.nodes.Document document17 = element16.ownerDocument();
        org.jsoup.select.Elements elements19 = element16.getElementsContainingText("<#root class=\" html\" value=\"&lt;html&gt;\n &lt;head&gt;&lt;/head&gt;\n &lt;body&gt;&lt;/body&gt;\n&lt;/html&gt;&amp;lt;html&amp;gt; &amp;lt;head&amp;gt;&amp;lt;/head&amp;gt; &amp;lt;body&amp;gt; &amp;lt;/body&amp;gt; &amp;lt;/html&amp;gt;\">\n <html>\n  <head></head>\n  <body></body>\n </html>&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;\n</#root>\n<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.select.Elements elements22 = element16.getElementsByAttributeValueNot("&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt;&lt;/body&gt; &lt;/html&gt;", "<html>\n <head></head>\n <body></body>\n</html><<html>\n <head></head>\n <body></body>\n</html>&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;<<html> <head></head> <body> </body> </html>></<html> <head></head> <body> </body> </html>>></<html>\n <head></head>\n <body></body>\n</html>&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;<<html> <head></head> <body> </body> </html>></<html> <head></head> <body> </body> </html>>>");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(document17);
        org.junit.Assert.assertNotNull(elements19);
        org.junit.Assert.assertNotNull(elements22);
    }

    @Test
    public void test3777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3777");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.select.Elements elements6 = document3.getElementsByIndexLessThan((int) (short) 10);
        org.jsoup.nodes.Element element8 = document3.val("");
        org.jsoup.nodes.Element element11 = element8.attr("<html>\n <head></head>\n <body></body>\n</html>", "<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.select.Elements elements14 = element8.getElementsByAttributeValueStarting("html", "html");
        org.jsoup.nodes.Node node15 = element8.nextSibling();
        node15.remove();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(elements14);
        org.junit.Assert.assertNotNull(node15);
    }

    @Test
    public void test3778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3778");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        java.lang.String str3 = document1.absUrl("<html> <head></head> <body> </body> </html>");
        java.lang.String str4 = document1.data();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test3779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3779");
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
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertNotNull(document15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertNotNull(document22);
        org.junit.Assert.assertNotNull(document24);
        org.junit.Assert.assertNotNull(element25);
        org.junit.Assert.assertNotNull(elements27);
        org.junit.Assert.assertNotNull(element29);
        org.junit.Assert.assertNotNull(element31);
        org.junit.Assert.assertNotNull(document32);
        org.junit.Assert.assertNotNull(element35);
        org.junit.Assert.assertNotNull(elements36);
        org.junit.Assert.assertNotNull(element38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(document40);
        org.junit.Assert.assertNotNull(strSet41);
        org.junit.Assert.assertNotNull(element43);
        org.junit.Assert.assertNotNull(element44);
    }

    @Test
    public void test3780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3780");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.select.Elements elements6 = document3.getElementsByIndexLessThan((int) (short) 10);
        org.jsoup.nodes.Element element8 = document3.val("");
        org.jsoup.nodes.Element element10 = document3.after("#root");
        org.jsoup.nodes.Document document11 = document3.ownerDocument();
        org.jsoup.nodes.Element element14 = document3.attr("#root", "<html>\n <head></head>\n <body></body>\n</html>");
        java.util.List<org.jsoup.nodes.Node> nodeList15 = document3.childNodes();
        java.lang.String str16 = document3.html();
        org.jsoup.nodes.Element element18 = document3.before("<html> <head></head> <body> </body> </html>");
        org.jsoup.nodes.Element element20 = document3.prependElement("<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.nodes.Document.OutputSettings outputSettings21 = document3.new OutputSettings();
        java.nio.charset.CharsetEncoder charsetEncoder22 = outputSettings21.encoder();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(document11);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(nodeList15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str16, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertNotNull(charsetEncoder22);
    }

    @Test
    public void test3781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3781");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.select.Elements elements6 = document3.getElementsByIndexLessThan((int) (short) 10);
        org.jsoup.nodes.Element element8 = document3.val("");
        java.lang.String str9 = document3.outerHtml();
        org.jsoup.select.Elements elements11 = document3.getElementsByClass("#root");
        org.jsoup.select.Elements elements13 = document3.getElementsByIndexGreaterThan(10);
        org.jsoup.nodes.Element element15 = document3.text("<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.nodes.Element element17 = document3.text("#root");
        org.jsoup.nodes.Element element19 = element17.append("#root");
        org.jsoup.select.Elements elements21 = element19.getElementsMatchingText("<html>\n <head></head>\n <body>\n  &lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt;&lt;/body&gt; &lt;/html&gt;\n </body>\n</html>");
        org.jsoup.nodes.Document document23 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document25 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element26 = document23.prependChild((org.jsoup.nodes.Node) document25);
        java.lang.String str27 = document25.html();
        java.lang.String str28 = document25.html();
        document25.title("<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.select.Elements elements33 = document25.getElementsByAttributeValueContaining("#root", "#root");
        org.jsoup.nodes.Element element35 = document25.prepend("#root");
        org.jsoup.nodes.Element element36 = element19.appendChild((org.jsoup.nodes.Node) document25);
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str9, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertNotNull(elements21);
        org.junit.Assert.assertNotNull(document23);
        org.junit.Assert.assertNotNull(document25);
        org.junit.Assert.assertNotNull(element26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str27, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str28, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertNotNull(elements33);
        org.junit.Assert.assertNotNull(element35);
        org.junit.Assert.assertNotNull(element36);
    }

    @Test
    public void test3782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3782");
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
        org.jsoup.nodes.Element element17 = document3.text("<html>\n <head></head>\n <body></body>\n</html>");
        document3.title("<html>\n <head></head>\n <body></body>\n</html>&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;");
        document3.remove();
        org.jsoup.nodes.Element element22 = document3.removeClass("hi!");
        org.jsoup.select.Elements elements25 = element22.getElementsByAttributeValueStarting("\n<body></body>", "<html>\n <head></head>\n <body></body>\n</html>&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt; <html> <head></head> <body></body> </html> <html> <head></head> <body> </body> </html>");
        org.jsoup.nodes.Element element27 = element22.appendElement("<html> \n <head></head> \n <body>\n  &lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;  \n </body>\n</html>\n<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.select.Elements elements28 = element27.getAllElements();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str5, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str6, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;" + "'", str13, "<html>\n <head></head>\n <body></body>\n</html>&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;");
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertNotNull(elements25);
        org.junit.Assert.assertNotNull(element27);
        org.junit.Assert.assertNotNull(elements28);
    }

    @Test
    public void test3783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3783");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        java.lang.String str5 = document3.html();
        java.lang.String str6 = document3.html();
        java.util.Map<java.lang.String, java.lang.String> strMap7 = document3.dataset();
        org.jsoup.nodes.Element element9 = document3.appendElement("hi!");
        org.jsoup.select.Elements elements11 = document3.getElementsByClass("<html> <head></head> <body> </body> </html>");
        org.jsoup.select.Elements elements13 = document3.getElementsByIndexGreaterThan(10);
        java.lang.String str15 = document3.absUrl("<html>\n <head>\n  <title>&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;</title>\n </head>\n <body></body>\n</html>");
        boolean boolean16 = document3.isBlock();
        org.jsoup.nodes.Element element17 = document3.nextElementSibling();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str5, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str6, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(element17);
    }

    @Test
    public void test3784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3784");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.parser.Tag tag5 = document3.tag();
        org.jsoup.select.Elements elements6 = document3.children();
        org.jsoup.nodes.Attributes attributes7 = document3.attributes();
        org.jsoup.nodes.Document document9 = new org.jsoup.nodes.Document("hi!");
        java.lang.String str10 = document9.tagName();
        org.jsoup.nodes.Element element11 = document3.appendChild((org.jsoup.nodes.Node) document9);
        org.jsoup.select.Elements elements13 = document9.getElementsByTag("hi!");
        org.jsoup.nodes.Element element15 = document9.html("html");
        org.jsoup.select.Elements elements17 = document9.getElementsByIndexLessThan((int) (byte) 100);
        org.jsoup.nodes.Element element19 = document9.prependElement("<html>\n <head>\n  <title>&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt;&lt;/body&gt; &lt;/html&gt;&amp;lt;html&amp;gt; &amp;lt;head&amp;gt;&amp;lt;/head&amp;gt; &amp;lt;body&amp;gt; &amp;lt;/body&amp;gt; &amp;lt;/html&amp;gt;</title>\n </head>\n <body></body>\n</html>");
        org.jsoup.nodes.Element element20 = element19.lastElementSibling();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(tag5);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "#root" + "'", str10, "#root");
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(elements17);
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertNull(element20);
    }

    @Test
    public void test3785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3785");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        java.lang.String str5 = document3.nodeName();
        org.jsoup.nodes.Element element7 = document3.before("<html>\n <head></head>\n <body></body>\n</html>&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt; <html> <head></head> <body></body> </html> <html> <head></head> <body> </body> </html>");
        java.util.List<org.jsoup.nodes.Node> nodeList8 = document3.childNodes();
        org.jsoup.nodes.Document document9 = document3.normalise();
        java.lang.String str10 = document9.title();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#document" + "'", str5, "#document");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(nodeList8);
        org.junit.Assert.assertNotNull(document9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test3786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3786");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.select.Elements elements6 = document3.getElementsByIndexLessThan((int) (short) 10);
        org.jsoup.nodes.Element element8 = document3.val("");
        java.lang.String str9 = document3.outerHtml();
        org.jsoup.select.Elements elements11 = document3.getElementsByClass("#root");
        java.lang.String str12 = document3.tagName();
        java.lang.Integer int13 = document3.elementSiblingIndex();
        org.jsoup.nodes.Element element14 = document3.body();
        java.lang.String str15 = document3.ownText();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str9, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "#root" + "'", str12, "#root");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test3787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3787");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        java.lang.String str5 = document3.html();
        java.lang.String str6 = document3.html();
        java.util.Map<java.lang.String, java.lang.String> strMap7 = document3.dataset();
        org.jsoup.nodes.Element element9 = document3.appendElement("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList10 = element9.childNodes();
        org.jsoup.nodes.Element element13 = element9.attr("<html>\n <head></head>\n <body></body>\n</html>", "<html>\n <head></head>\n <body>\n </body>\n</html>");
        org.jsoup.nodes.Document document15 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document17 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element18 = document15.prependChild((org.jsoup.nodes.Node) document17);
        org.jsoup.parser.Tag tag19 = document17.tag();
        org.jsoup.nodes.Element element21 = document17.prependText("hi!");
        org.jsoup.nodes.Element element22 = element9.appendChild((org.jsoup.nodes.Node) document17);
        org.jsoup.nodes.Element element24 = document17.after("<#root value=\"\" #root=\"&lt;html&gt;\n &lt;head&gt;&lt;/head&gt;\n &lt;body&gt;&lt;/body&gt;\n&lt;/html&gt;\" class=\"\">\n <html>\n  <head></head>\n  <body></body>\n </html><<html>\n <head></head>\n <body>\n </body>\n</html>></<html>\n <head></head>\n <body>\n </body>\n</html>>\n</#root>");
        document17.remove();
        java.util.Map<java.lang.String, java.lang.String> strMap26 = document17.dataset();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str5, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str6, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(document15);
        org.junit.Assert.assertNotNull(document17);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNotNull(tag19);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertNotNull(element24);
        org.junit.Assert.assertNotNull(strMap26);
    }

    @Test
    public void test3788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3788");
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
        org.jsoup.nodes.Element element16 = element15.parent();
        org.jsoup.nodes.Element element18 = element16.prependElement("<body></body><<head></head>\n<body></body>></<head></head>\n<body></body>>\n<html>\n <head></head>\n <body></body>\n</html><hi!></hi!>");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str5, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str6, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;" + "'", str13, "<html>\n <head></head>\n <body></body>\n</html>&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;");
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(element18);
    }

    @Test
    public void test3789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3789");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.select.Elements elements6 = document3.getElementsByIndexLessThan((int) (short) 10);
        org.jsoup.nodes.Element element8 = document3.val("");
        org.jsoup.nodes.Element element10 = document3.after("#root");
        org.jsoup.nodes.Document document11 = document3.ownerDocument();
        org.jsoup.nodes.Element element14 = document3.attr("#root", "<html>\n <head></head>\n <body></body>\n</html>");
        java.util.List<org.jsoup.nodes.Node> nodeList15 = document3.childNodes();
        java.lang.String str16 = document3.html();
        org.jsoup.nodes.Element element18 = document3.before("<html> <head></head> <body> </body> </html>");
        org.jsoup.select.Elements elements19 = element18.parents();
        java.lang.Integer int20 = element18.elementSiblingIndex();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(document11);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(nodeList15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str16, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNotNull(elements19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
    }

    @Test
    public void test3790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3790");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.nodes.Element element5 = document1.body();
        java.lang.String str6 = element5.html();
        org.jsoup.nodes.Element element8 = element5.appendText("<html>\n <head></head>\n <body></body>\n</html>&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;<<html> <head></head> <body> </body> </html>></<html> <head></head> <body> </body> </html>>");
        boolean boolean9 = element8.hasText();
        boolean boolean10 = element8.hasText();
        org.jsoup.nodes.Element element12 = element8.appendText("");
        boolean boolean13 = element8.isBlock();
        java.lang.String str14 = element8.className();
        java.lang.String str15 = element8.data();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test3791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3791");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.select.Elements elements3 = document1.getElementsByAttribute("<html>\n <head>\n  <title>&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;</title>\n </head>\n <body></body>\n</html>");
        org.jsoup.nodes.Element element5 = document1.appendText("<html> \n <head></head> \n <body>  \n </body>\n</html>");
        java.util.regex.Pattern pattern7 = null;
        org.jsoup.select.Elements elements8 = document1.getElementsByAttributeValueMatching("body", pattern7);
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements8);
    }

    @Test
    public void test3792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3792");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("#root");
        java.lang.String str2 = document1.outerHtml();
        org.jsoup.select.Elements elements3 = document1.parents();
        org.jsoup.select.Elements elements5 = document1.getElementsByClass("<html>\n <head></head>\n <body>\n  &lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt; \n </body>\n</html><<html> <head></head> <body> </body> </html>></<html> <head></head> <body> </body> </html>>");
        org.jsoup.nodes.Document document6 = document1.normalise();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str2, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(document6);
    }

    @Test
    public void test3793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3793");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.select.Elements elements6 = document3.getElementsByIndexLessThan((int) (short) 10);
        java.util.Set<java.lang.String> strSet7 = document3.classNames();
        org.jsoup.nodes.Element element9 = document3.getElementById("hi!");
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = document3.new OutputSettings();
        org.jsoup.nodes.Element element12 = document3.appendElement("hi!");
        org.jsoup.nodes.Element element13 = document3.body();
        org.jsoup.nodes.Element element15 = element13.getElementById("<html>\n <head></head>\n <body>\n </body>\n</html>");
        org.jsoup.nodes.Document document17 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document19 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element20 = document17.prependChild((org.jsoup.nodes.Node) document19);
        org.jsoup.select.Elements elements22 = document19.getElementsByIndexLessThan((int) (short) 10);
        org.jsoup.nodes.Element element24 = document19.val("");
        java.lang.String str25 = document19.outerHtml();
        org.jsoup.select.Elements elements27 = document19.getElementsByClass("#root");
        java.lang.String str28 = document19.tagName();
        org.jsoup.nodes.Node node30 = document19.childNode(0);
        org.jsoup.nodes.Document document31 = document19.ownerDocument();
        java.lang.String str32 = document19.nodeName();
        org.jsoup.select.Elements elements34 = document19.getElementsByIndexEquals(10);
        org.jsoup.select.Elements elements37 = document19.getElementsByAttributeValue("<html> <head></head> <body> </body> </html>", "<html>\n <head></head>\n <body></body>\n</html>&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;<<html> <head></head> <body> </body> </html>></<html> <head></head> <body> </body> </html>>");
        org.jsoup.nodes.Document document39 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document41 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element42 = document39.prependChild((org.jsoup.nodes.Node) document41);
        java.lang.String str43 = document41.html();
        java.lang.String str44 = document41.html();
        java.util.Map<java.lang.String, java.lang.String> strMap45 = document41.dataset();
        org.jsoup.nodes.Element element46 = document41.lastElementSibling();
        org.jsoup.select.Elements elements49 = element46.getElementsByAttributeValueStarting(" html", "<#root>\n <html>\n  <head></head>\n  <body></body>\n </html>\n</#root>\n<html>\n <head></head>\n <body></body>\n</html>");
        document19.replaceWith((org.jsoup.nodes.Node) element46);
        org.jsoup.select.Elements elements51 = element46.getAllElements();
        org.jsoup.nodes.Document document53 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document55 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element56 = document53.prependChild((org.jsoup.nodes.Node) document55);
        org.jsoup.select.Elements elements58 = document55.getElementsByIndexLessThan((int) (short) 10);
        java.util.Set<java.lang.String> strSet59 = document55.classNames();
        org.jsoup.nodes.Element element60 = element46.classNames(strSet59);
        org.jsoup.nodes.Element element61 = element13.classNames(strSet59);
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertNull(element9);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNull(element15);
        org.junit.Assert.assertNotNull(document17);
        org.junit.Assert.assertNotNull(document19);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertNotNull(elements22);
        org.junit.Assert.assertNotNull(element24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str25, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertNotNull(elements27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "#root" + "'", str28, "#root");
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertNotNull(document31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "#document" + "'", str32, "#document");
        org.junit.Assert.assertNotNull(elements34);
        org.junit.Assert.assertNotNull(elements37);
        org.junit.Assert.assertNotNull(document39);
        org.junit.Assert.assertNotNull(document41);
        org.junit.Assert.assertNotNull(element42);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str43, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str44, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertNotNull(strMap45);
        org.junit.Assert.assertNotNull(element46);
        org.junit.Assert.assertNotNull(elements49);
        org.junit.Assert.assertNotNull(elements51);
        org.junit.Assert.assertNotNull(document53);
        org.junit.Assert.assertNotNull(document55);
        org.junit.Assert.assertNotNull(element56);
        org.junit.Assert.assertNotNull(elements58);
        org.junit.Assert.assertNotNull(strSet59);
        org.junit.Assert.assertNotNull(element60);
        org.junit.Assert.assertNotNull(element61);
    }

    @Test
    public void test3794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3794");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.select.Elements elements6 = document3.getElementsByIndexLessThan((int) (short) 10);
        org.jsoup.nodes.Element element8 = document3.val("");
        java.lang.String str9 = document3.outerHtml();
        org.jsoup.select.Elements elements11 = document3.getElementsByClass("#root");
        java.lang.String str12 = document3.tagName();
        org.jsoup.select.Elements elements13 = document3.getAllElements();
        org.jsoup.nodes.Document document15 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document17 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element18 = document15.prependChild((org.jsoup.nodes.Node) document17);
        java.lang.String str19 = document17.html();
        java.lang.String str20 = document17.html();
        document17.title("<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.select.Elements elements23 = document17.getAllElements();
        boolean boolean24 = document3.equals((java.lang.Object) elements23);
        boolean boolean26 = document3.hasAttr("<html>\n <head></head>\n <body>\n </body>\n</html>");
        org.jsoup.nodes.Element element28 = document3.prependElement("#document");
        java.lang.String str29 = element28.tagName();
        org.jsoup.nodes.Document document31 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document33 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element34 = document31.prependChild((org.jsoup.nodes.Node) document33);
        java.lang.String str35 = document33.html();
        java.lang.String str36 = document33.html();
        java.util.Map<java.lang.String, java.lang.String> strMap37 = document33.dataset();
        org.jsoup.nodes.Element element39 = document33.appendElement("hi!");
        org.jsoup.nodes.Element element40 = document33.body();
        java.lang.String str41 = element40.toString();
        org.jsoup.nodes.Element element42 = element40.firstElementSibling();
        java.util.Map<java.lang.String, java.lang.String> strMap43 = element40.dataset();
        org.jsoup.nodes.Document document45 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document47 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element48 = document45.prependChild((org.jsoup.nodes.Node) document47);
        java.util.Set<java.lang.String> strSet49 = element48.classNames();
        org.jsoup.nodes.Element element50 = element40.classNames(strSet49);
        org.jsoup.nodes.Element element51 = element28.classNames(strSet49);
        org.jsoup.select.Elements elements53 = element28.getElementsContainingOwnText("<#root>\n <#root>\n  <html>\n   <head></head>\n   <body></body>\n  </html>\n </#root>\n <html>\n  <head></head>\n  <body></body>\n </html>\n</#root>\n<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str9, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "#root" + "'", str12, "#root");
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertNotNull(document15);
        org.junit.Assert.assertNotNull(document17);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str19, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str20, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertNotNull(elements23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(element28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "#document" + "'", str29, "#document");
        org.junit.Assert.assertNotNull(document31);
        org.junit.Assert.assertNotNull(document33);
        org.junit.Assert.assertNotNull(element34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str35, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str36, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertNotNull(strMap37);
        org.junit.Assert.assertNotNull(element39);
        org.junit.Assert.assertNotNull(element40);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "\n<body></body>" + "'", str41, "\n<body></body>");
        org.junit.Assert.assertNotNull(element42);
        org.junit.Assert.assertNotNull(strMap43);
        org.junit.Assert.assertNotNull(document45);
        org.junit.Assert.assertNotNull(document47);
        org.junit.Assert.assertNotNull(element48);
        org.junit.Assert.assertNotNull(strSet49);
        org.junit.Assert.assertNotNull(element50);
        org.junit.Assert.assertNotNull(element51);
        org.junit.Assert.assertNotNull(elements53);
    }

    @Test
    public void test3795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3795");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.select.Elements elements6 = document3.getElementsByIndexLessThan((int) (short) 10);
        org.jsoup.nodes.Element element8 = document3.val("");
        java.lang.String str9 = document3.outerHtml();
        org.jsoup.select.Elements elements12 = document3.getElementsByAttributeValueStarting("#root", "<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.select.Elements elements13 = document3.parents();
        boolean boolean14 = document3.hasText();
        org.jsoup.nodes.Document document15 = document3.normalise();
        org.jsoup.nodes.Element element17 = document3.before("");
        org.jsoup.nodes.Element element18 = element17.nextElementSibling();
        org.jsoup.nodes.Element element20 = element18.toggleClass("&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt;&lt;/body&gt; &lt;/html&gt;");
        java.util.Set<java.lang.String> strSet21 = element18.classNames();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str9, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(document15);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertNotNull(strSet21);
    }

    @Test
    public void test3796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3796");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.select.Elements elements6 = document3.getElementsByIndexLessThan((int) (short) 10);
        org.jsoup.nodes.Element element8 = document3.val("");
        java.lang.String str9 = document3.outerHtml();
        org.jsoup.select.Elements elements11 = document3.getElementsByClass("#root");
        java.lang.String str12 = document3.tagName();
        java.lang.Integer int13 = document3.elementSiblingIndex();
        org.jsoup.nodes.Element element14 = document3.body();
        document3.title("<html>\n <head></head>\n <body></body>\n</html><#root value=\"\">\n <#document></#document>\n <html>\n  <head></head>\n  <body></body>\n </html>\n</#root><#root>\n <html>\n  <head></head>\n  <body></body>\n </html>\n <html> \n  <head></head> \n  <body> \n  </body>\n </html>\n</#root>");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str9, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "#root" + "'", str12, "#root");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(element14);
    }

    @Test
    public void test3797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3797");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.select.Elements elements6 = document3.getElementsByIndexLessThan((int) (short) 10);
        org.jsoup.nodes.Element element8 = document3.val("");
        org.jsoup.nodes.Element element10 = document3.after("#root");
        org.jsoup.nodes.Document document11 = document3.ownerDocument();
        org.jsoup.nodes.Element element14 = document3.attr("#root", "<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.select.Elements elements15 = element14.siblingElements();
        org.jsoup.nodes.Element element17 = element14.before("");
        boolean boolean18 = element14.isBlock();
        org.jsoup.nodes.Document document19 = element14.ownerDocument();
        org.jsoup.nodes.Node node20 = element14.previousSibling();
        org.jsoup.nodes.Element element21 = element14.lastElementSibling();
        org.jsoup.nodes.Element element23 = element21.html("<html>\n <head>\n  <title>#document</title>\n </head>\n <body>\n  &lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt;&lt;/body&gt; &lt;/html&gt;\n </body>\n</html><hi!></hi!>");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(document11);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(document19);
        org.junit.Assert.assertNull(node20);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertNotNull(element23);
    }

    @Test
    public void test3798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3798");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.nodes.Element element5 = document3.head();
        org.jsoup.nodes.Document.OutputSettings outputSettings6 = document3.outputSettings();
        org.jsoup.nodes.Document document8 = org.jsoup.nodes.Document.createShell("#root");
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = document8.outputSettings();
        java.nio.charset.Charset charset10 = outputSettings9.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings12 = outputSettings9.prettyPrint(false);
        org.jsoup.nodes.Entities.EscapeMode escapeMode13 = outputSettings12.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings14 = outputSettings6.escapeMode(escapeMode13);
        org.jsoup.nodes.Document document16 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document18 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element19 = document16.prependChild((org.jsoup.nodes.Node) document18);
        java.lang.String str20 = document16.tagName();
        org.jsoup.nodes.Document.OutputSettings outputSettings21 = document16.new OutputSettings();
        boolean boolean22 = outputSettings21.prettyPrint();
        java.nio.charset.CharsetEncoder charsetEncoder23 = outputSettings21.encoder();
        org.jsoup.nodes.Document document25 = org.jsoup.nodes.Document.createShell("#root");
        org.jsoup.nodes.Document.OutputSettings outputSettings26 = document25.outputSettings();
        java.nio.charset.Charset charset27 = outputSettings26.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings28 = outputSettings21.charset(charset27);
        java.nio.charset.CharsetEncoder charsetEncoder29 = outputSettings28.encoder();
        org.jsoup.nodes.Document document31 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document33 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element34 = document31.prependChild((org.jsoup.nodes.Node) document33);
        java.lang.String str35 = document31.tagName();
        org.jsoup.nodes.Document.OutputSettings outputSettings36 = document31.new OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings38 = outputSettings36.indentAmount((int) (byte) 10);
        java.nio.charset.Charset charset39 = outputSettings38.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings40 = outputSettings28.charset(charset39);
        org.jsoup.nodes.Document.OutputSettings outputSettings41 = outputSettings6.charset(charset39);
        boolean boolean42 = outputSettings41.prettyPrint();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(outputSettings6);
        org.junit.Assert.assertNotNull(document8);
        org.junit.Assert.assertNotNull(outputSettings9);
        org.junit.Assert.assertNotNull(charset10);
        org.junit.Assert.assertNotNull(outputSettings12);
        org.junit.Assert.assertTrue("'" + escapeMode13 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode13.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings14);
        org.junit.Assert.assertNotNull(document16);
        org.junit.Assert.assertNotNull(document18);
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "#root" + "'", str20, "#root");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(charsetEncoder23);
        org.junit.Assert.assertNotNull(document25);
        org.junit.Assert.assertNotNull(outputSettings26);
        org.junit.Assert.assertNotNull(charset27);
        org.junit.Assert.assertNotNull(outputSettings28);
        org.junit.Assert.assertNotNull(charsetEncoder29);
        org.junit.Assert.assertNotNull(document31);
        org.junit.Assert.assertNotNull(document33);
        org.junit.Assert.assertNotNull(element34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "#root" + "'", str35, "#root");
        org.junit.Assert.assertNotNull(outputSettings38);
        org.junit.Assert.assertNotNull(charset39);
        org.junit.Assert.assertNotNull(outputSettings40);
        org.junit.Assert.assertNotNull(outputSettings41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
    }

    @Test
    public void test3799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3799");
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
        org.jsoup.nodes.Document document31 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document33 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element34 = document31.prependChild((org.jsoup.nodes.Node) document33);
        java.lang.String str35 = document33.html();
        java.lang.String str36 = document33.html();
        java.util.Map<java.lang.String, java.lang.String> strMap37 = document33.dataset();
        org.jsoup.nodes.Element element39 = document33.appendElement("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList40 = element39.childNodes();
        org.jsoup.nodes.Element element43 = element39.attr("<html>\n <head></head>\n <body></body>\n</html>", "<html>\n <head></head>\n <body>\n </body>\n</html>");
        org.jsoup.nodes.Element element44 = document17.prependChild((org.jsoup.nodes.Node) element39);
        org.jsoup.parser.Tag tag45 = element44.tag();
        org.jsoup.select.Elements elements48 = element44.getElementsByAttributeValueNot("<html>\n <head></head>\n <body></body>\n</html>\n<html> \n <head></head> \n <body>   \n  <html> \n   <head></head> \n   <body>  \n   </body>\n  </html>\n </body>\n</html>", "\n<head>\n #document \n <html> \n  <head></head> \n  <body> &lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;\n  </body>\n </html>\n</head>");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str5, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str6, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;" + "'", str13, "<html>\n <head></head>\n <body></body>\n</html>&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;");
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(document17);
        org.junit.Assert.assertNotNull(document19);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertNotNull(elements23);
        org.junit.Assert.assertNotNull(element24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(element26);
        org.junit.Assert.assertNotNull(element28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "#root" + "'", str29, "#root");
        org.junit.Assert.assertNotNull(document31);
        org.junit.Assert.assertNotNull(document33);
        org.junit.Assert.assertNotNull(element34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str35, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str36, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertNotNull(strMap37);
        org.junit.Assert.assertNotNull(element39);
        org.junit.Assert.assertNotNull(nodeList40);
        org.junit.Assert.assertNotNull(element43);
        org.junit.Assert.assertNotNull(element44);
        org.junit.Assert.assertNotNull(tag45);
        org.junit.Assert.assertNotNull(elements48);
    }

    @Test
    public void test3800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3800");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.select.Elements elements6 = document3.getElementsByIndexLessThan((int) (short) 10);
        org.jsoup.nodes.Document document8 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document10 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element11 = document8.prependChild((org.jsoup.nodes.Node) document10);
        org.jsoup.select.Elements elements13 = document10.getElementsByIndexLessThan((int) (short) 10);
        boolean boolean14 = document3.equals((java.lang.Object) (short) 10);
        java.util.regex.Pattern pattern16 = null;
        org.jsoup.select.Elements elements17 = document3.getElementsByAttributeValueMatching("<html>\n <head></head>\n <body></body>\n</html>", pattern16);
        org.jsoup.nodes.Element element19 = document3.append("<html>\n <head></head>\n <body></body>\n</html>&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;<<html> <head></head> <body> </body> </html>></<html> <head></head> <body> </body> </html>>");
        org.jsoup.nodes.Element element21 = document3.prepend(" html");
        element21.remove();
        org.jsoup.select.Elements elements23 = element21.children();
        boolean boolean24 = element21.isBlock();
        java.lang.String str25 = element21.id();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(document8);
        org.junit.Assert.assertNotNull(document10);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(elements17);
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertNotNull(elements23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
    }

    @Test
    public void test3801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3801");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        java.lang.String str5 = document3.html();
        java.lang.String str6 = document3.html();
        java.util.Map<java.lang.String, java.lang.String> strMap7 = document3.dataset();
        org.jsoup.nodes.Element element9 = document3.appendText("<html>\n <head></head>\n <body>\n </body>\n</html>");
        org.jsoup.select.Elements elements11 = element9.getElementsContainingOwnText("#root");
        java.util.regex.Pattern pattern13 = null;
        org.jsoup.select.Elements elements14 = element9.getElementsByAttributeValueMatching("", pattern13);
        org.jsoup.nodes.Element element16 = element9.wrap("<html> <head></head> <body></body> </html>");
        org.jsoup.nodes.Element element18 = element9.prependElement("<html> <head> <title>&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt;&lt;/body&gt; &lt;/html&gt;</title> </head> <body></body> </html>");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str5, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str6, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(elements14);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(element18);
    }

    @Test
    public void test3802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3802");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("<html>\n <head></head>\n <body>\n </body>\n</html>");
        org.jsoup.select.Elements elements4 = document1.getElementsByAttributeValue("&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt;&lt;/body&gt; &lt;/html&gt;&amp;lt;html&amp;gt; &amp;lt;head&amp;gt;&amp;lt;/head&amp;gt; &amp;lt;body&amp;gt; &amp;lt;/body&amp;gt; &amp;lt;/html&amp;gt;<#root>\n <html>\n  <head></head>\n  <body></body>\n </html>\n</#root>\n<html>\n <head></head>\n <body></body>\n</html>", " html");
        org.jsoup.nodes.Element element6 = document1.prependText("<html>\n <head>\n  <title>&lt;html&gt;\n &lt;head&gt;&lt;/head&gt;\n &lt;body&gt;&lt;/body&gt;\n&lt;/html&gt;</title>\n </head>\n <body></body>\n</html>");
        org.jsoup.nodes.Document document7 = element6.ownerDocument();
        java.lang.String str8 = document7.title();
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(document7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test3803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3803");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.select.Elements elements6 = document3.getElementsByIndexLessThan((int) (short) 10);
        org.jsoup.nodes.Element element8 = document3.val("");
        java.lang.String str9 = document3.outerHtml();
        org.jsoup.select.Elements elements12 = document3.getElementsByAttributeValueStarting("#root", "<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.select.Elements elements13 = document3.parents();
        boolean boolean14 = document3.hasText();
        org.jsoup.nodes.Document document15 = document3.normalise();
        org.jsoup.nodes.Element element17 = document3.before("");
        org.jsoup.nodes.Element element18 = element17.nextElementSibling();
        org.jsoup.nodes.Element element20 = element18.toggleClass("&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt;&lt;/body&gt; &lt;/html&gt;");
        org.jsoup.nodes.Element element22 = element20.after("<#document></#document>\n<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.nodes.Element element24 = element22.addClass("\n<body>\n &lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt;&lt;/body&gt; &lt;/html&gt;\n</body>");
        org.jsoup.nodes.Element element26 = element24.appendElement("<#root>\n <#root>\n  <html>\n   <head></head>\n   <body></body>\n  </html>\n </#root>\n <html>\n  <head></head>\n  <body></body>\n </html>\n</#root>\n<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.nodes.Document document27 = element26.ownerDocument();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str9, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(document15);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertNotNull(element24);
        org.junit.Assert.assertNotNull(element26);
        org.junit.Assert.assertNotNull(document27);
    }

    @Test
    public void test3804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3804");
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
        java.lang.String str16 = document11.id();
        document11.title("&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt;&lt;/body&gt; &lt;/html&gt;&amp;lt;html&amp;gt; &amp;lt;head&amp;gt;&amp;lt;/head&amp;gt; &amp;lt;body&amp;gt; &amp;lt;/body&amp;gt; &amp;lt;/html&amp;gt;<#root>\n <html>\n  <head></head>\n  <body></body>\n </html>\n</#root>\n<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(document11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertNotNull(document15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test3805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3805");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element3 = document1.text("");
        java.lang.String str4 = document1.ownText();
        org.jsoup.select.Elements elements7 = document1.getElementsByAttributeValueStarting("#root", "<html>\n <head></head>\n <body>\n </body>\n</html>");
        java.lang.String str8 = document1.nodeName();
        java.lang.String str9 = document1.nodeName();
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = document1.outputSettings();
        java.nio.charset.CharsetEncoder charsetEncoder11 = outputSettings10.encoder();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "#document" + "'", str8, "#document");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "#document" + "'", str9, "#document");
        org.junit.Assert.assertNotNull(outputSettings10);
        org.junit.Assert.assertNotNull(charsetEncoder11);
    }

    @Test
    public void test3806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3806");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        java.lang.String str5 = document3.className();
        org.jsoup.nodes.Element element6 = document3.lastElementSibling();
        org.jsoup.nodes.Document document7 = document3.normalise();
        org.jsoup.select.Elements elements8 = document7.siblingElements();
        java.lang.Integer int9 = document7.siblingIndex();
        org.jsoup.nodes.Document document10 = document7.normalise();
        java.lang.String str11 = document7.data();
        org.jsoup.nodes.Document.OutputSettings outputSettings12 = document7.new OutputSettings();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(document7);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(document10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test3807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3807");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.nodes.Element element5 = document1.body();
        java.lang.String str6 = element5.html();
        org.jsoup.nodes.Element element8 = element5.appendText("<html>\n <head></head>\n <body></body>\n</html>&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;<<html> <head></head> <body> </body> </html>></<html> <head></head> <body> </body> </html>>");
        org.jsoup.select.Elements elements11 = element5.getElementsByAttributeValueStarting("<html>\n <head>\n  <title>&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt;&lt;/body&gt; &lt;/html&gt;&amp;lt;html&amp;gt; &amp;lt;head&amp;gt;&amp;lt;/head&amp;gt; &amp;lt;body&amp;gt; &amp;lt;/body&amp;gt; &amp;lt;/html&amp;gt;</title>\n </head>\n <body></body>\n</html>", "<html>\n <head>\n  <title>#document</title>\n </head>\n <body>\n  &lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt;&lt;/body&gt; &lt;/html&gt;\n </body>\n</html><hi!></hi!>");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(elements11);
    }

    @Test
    public void test3808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3808");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        java.lang.String str5 = document3.html();
        java.lang.String str6 = document3.html();
        java.util.Map<java.lang.String, java.lang.String> strMap7 = document3.dataset();
        org.jsoup.nodes.Element element9 = document3.appendText("<html>\n <head></head>\n <body>\n </body>\n</html>");
        org.jsoup.select.Elements elements12 = document3.getElementsByAttributeValueStarting("<html>\n <head></head>\n <body>\n </body>\n</html>", "<html> <head></head> <body> </body> </html>");
        org.jsoup.nodes.Element element13 = document3.body();
        org.jsoup.nodes.Element element15 = document3.wrap("<#root class=\" html\" value=\"&lt;html&gt;\n &lt;head&gt;&lt;/head&gt;\n &lt;body&gt;&lt;/body&gt;\n&lt;/html&gt;&amp;lt;html&amp;gt; &amp;lt;head&amp;gt;&amp;lt;/head&amp;gt; &amp;lt;body&amp;gt; &amp;lt;/body&amp;gt; &amp;lt;/html&amp;gt;\">\n <html>\n  <head></head>\n  <body></body>\n </html>&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;\n</#root>\n<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.nodes.Document document16 = document3.normalise();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str5, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str6, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(document16);
    }

    @Test
    public void test3809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3809");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        java.lang.String str5 = document3.html();
        boolean boolean6 = document3.hasText();
        org.jsoup.nodes.Element element8 = document3.html("<html>\n <head></head>\n <body></body>\n</html>&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt; <html> <head></head> <body></body> </html> <html> <head></head> <body> </body> </html>");
        org.jsoup.nodes.Element element9 = document3.nextElementSibling();
        java.lang.String str10 = document3.title();
        java.util.List<org.jsoup.nodes.Node> nodeList11 = document3.siblingNodes();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str5, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(nodeList11);
    }

    @Test
    public void test3810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3810");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.select.Elements elements6 = document3.getElementsByIndexLessThan((int) (short) 10);
        java.util.Set<java.lang.String> strSet7 = document3.classNames();
        org.jsoup.select.Elements elements10 = document3.getElementsByAttributeValueNot("<html> <head></head> <body> </body> </html>", "#root");
        org.jsoup.nodes.Document document11 = document3.normalise();
        org.jsoup.select.Elements elements13 = document3.getElementsByIndexLessThan(0);
        org.jsoup.select.Elements elements16 = document3.getElementsByAttributeValueMatching("<html>\n <head></head>\n <body></body>\n</html>&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;<<html> <head></head> <body> </body> </html>></<html> <head></head> <body> </body> </html>>", "<html> <head></head> <body> </body> </html>");
        org.jsoup.nodes.Element element17 = document3.empty();
        org.jsoup.nodes.Document document19 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document21 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element22 = document19.prependChild((org.jsoup.nodes.Node) document21);
        java.lang.String str23 = document21.html();
        java.lang.String str24 = document21.html();
        java.util.Map<java.lang.String, java.lang.String> strMap25 = document21.dataset();
        org.jsoup.nodes.Element element27 = document21.appendText("<html>\n <head></head>\n <body>\n </body>\n</html>");
        org.jsoup.select.Elements elements30 = document21.getElementsByAttributeValueStarting("<html>\n <head></head>\n <body>\n </body>\n</html>", "<html> <head></head> <body> </body> </html>");
        org.jsoup.select.Elements elements33 = document21.getElementsByAttributeValueMatching("<html> <head></head> <body> </body> </html>", "hi!");
        org.jsoup.select.Elements elements35 = document21.getElementsByTag("hi!");
        org.jsoup.select.Elements elements37 = document21.getElementsByIndexEquals((int) (byte) 100);
        org.jsoup.nodes.Document.OutputSettings outputSettings38 = document21.new OutputSettings();
        org.jsoup.select.Elements elements40 = document21.getElementsByIndexEquals((int) (short) 0);
        boolean boolean41 = document3.equals((java.lang.Object) document21);
        org.jsoup.nodes.Element element43 = document21.removeClass("head");
        org.jsoup.select.Elements elements46 = element43.getElementsByAttributeValueEnding("<#root>\n <html>\n  <head></head>\n  <body></body>\n </html>\n</#root>\n<html>\n <head></head>\n <body></body>\n</html>", "<html>\n <head></head>\n <body></body>\n</html>&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;");
        org.jsoup.nodes.Element element48 = element43.prepend("<html>\n <head></head>\n <body></body>\n</html>#root");
        java.util.Set<java.lang.String> strSet49 = element43.classNames();
        org.jsoup.nodes.Element element51 = element43.child((int) (byte) 0);
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertNotNull(document11);
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertNotNull(elements16);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(document19);
        org.junit.Assert.assertNotNull(document21);
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str23, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str24, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertNotNull(strMap25);
        org.junit.Assert.assertNotNull(element27);
        org.junit.Assert.assertNotNull(elements30);
        org.junit.Assert.assertNotNull(elements33);
        org.junit.Assert.assertNotNull(elements35);
        org.junit.Assert.assertNotNull(elements37);
        org.junit.Assert.assertNotNull(elements40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(element43);
        org.junit.Assert.assertNotNull(elements46);
        org.junit.Assert.assertNotNull(element48);
        org.junit.Assert.assertNotNull(strSet49);
        org.junit.Assert.assertNotNull(element51);
    }

    @Test
    public void test3811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3811");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.select.Elements elements6 = document3.getElementsByIndexLessThan((int) (short) 10);
        org.jsoup.nodes.Element element8 = document3.val("");
        org.jsoup.nodes.Element element10 = document3.after("#root");
        org.jsoup.nodes.Document document11 = document3.ownerDocument();
        org.jsoup.nodes.Element element14 = document3.attr("#root", "<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.select.Elements elements16 = document3.select("#root");
        document3.title("");
        org.jsoup.nodes.Element element19 = document3.lastElementSibling();
        org.jsoup.select.Elements elements20 = element19.children();
        org.jsoup.nodes.Element element22 = element19.html("\n<html>\n <head></head>\n <body></body>\n</html>");
        java.util.Map<java.lang.String, java.lang.String> strMap23 = element19.dataset();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(document11);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(elements16);
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertNotNull(elements20);
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertNotNull(strMap23);
    }

    @Test
    public void test3812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3812");
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
        org.jsoup.select.Elements elements17 = element16.parents();
        java.lang.String str19 = element16.attr("");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(tag5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(outputSettings10);
        org.junit.Assert.assertNotNull(document12);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(elements17);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test3813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3813");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        java.lang.String str5 = document3.html();
        java.lang.String str6 = document3.html();
        java.util.Map<java.lang.String, java.lang.String> strMap7 = document3.dataset();
        org.jsoup.nodes.Element element9 = document3.appendText("<html>\n <head></head>\n <body>\n </body>\n</html>");
        org.jsoup.select.Elements elements12 = document3.getElementsByAttributeValueStarting("<html>\n <head></head>\n <body>\n </body>\n</html>", "<html> <head></head> <body> </body> </html>");
        org.jsoup.select.Elements elements15 = document3.getElementsByAttributeValueMatching("<html> <head></head> <body> </body> </html>", "hi!");
        org.jsoup.select.Elements elements17 = document3.getElementsByTag("hi!");
        org.jsoup.select.Elements elements20 = document3.getElementsByAttributeValueNot("#document", "<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.nodes.Element element22 = document3.append("<html>\n <head></head>\n <body></body>\n</html>&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt; <html> <head></head> <body></body> </html> <html> <head></head> <body> </body> </html>");
        org.jsoup.nodes.Element element24 = document3.createElement("\n<body></body>");
        org.jsoup.select.Elements elements26 = document3.getElementsByIndexEquals((int) '4');
        org.jsoup.nodes.Element element28 = document3.addClass("<hi! <html>\n <head></head>\n <body></body>\n</html>=\"&lt;html&gt;\n &lt;head&gt;&lt;/head&gt;\n &lt;body&gt;\n &lt;/body&gt;\n&lt;/html&gt;\"></hi!>&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt;&lt;/body&gt; &lt;/html&gt;");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements31 = document3.getElementsByAttributeValueStarting("", "<html>\n <head>\n  <title>&lt;html&gt;\n &lt;head&gt;&lt;/head&gt;\n &lt;body&gt;&lt;/body&gt;\n&lt;/html&gt;</title>\n </head>\n <body></body>\n</html>");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str5, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str6, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertNotNull(elements17);
        org.junit.Assert.assertNotNull(elements20);
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertNotNull(element24);
        org.junit.Assert.assertNotNull(elements26);
        org.junit.Assert.assertNotNull(element28);
    }

    @Test
    public void test3814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3814");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        java.lang.String str5 = document3.html();
        java.lang.String str6 = document3.html();
        document3.title("<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.select.Elements elements9 = document3.getAllElements();
        org.jsoup.nodes.Element element11 = document3.html("");
        java.lang.String str12 = document3.val();
        org.jsoup.nodes.Element element14 = document3.toggleClass("<html> <head></head> <body> </body> </html>");
        org.jsoup.nodes.Element element16 = element14.appendText("&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt; &lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;#document\n<html>\n <head></head>\n <body></body>\n</html><hi!></hi!>");
        boolean boolean18 = element16.hasAttr("#document <html> <head></head> <body></body> </html>");
        org.jsoup.select.Elements elements21 = element16.getElementsByAttributeValueContaining("<#root value=\"\" class=\"\">\n <html>\n  <head></head>\n  <body></body>\n </html>\n</#root>", "<<html>\n <head></head>\n <body></body>\n</html>&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;<<html> <head></head> <body> </body> </html>></<html> <head></head> <body> </body> </html>>></<html>\n <head></head>\n <body></body>\n</html>&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;<<html> <head></head> <body> </body> </html>></<html> <head></head> <body> </body> </html>>>");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str5, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str6, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(elements21);
    }

    @Test
    public void test3815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3815");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.select.Elements elements6 = document3.getElementsByIndexLessThan((int) (short) 10);
        org.jsoup.nodes.Element element8 = document3.val("");
        java.lang.String str9 = document3.outerHtml();
        org.jsoup.select.Elements elements11 = document3.getElementsByClass("#root");
        java.lang.String str12 = document3.tagName();
        org.jsoup.nodes.Node node14 = document3.childNode(0);
        org.jsoup.nodes.Document document15 = document3.ownerDocument();
        java.lang.String str16 = document3.nodeName();
        org.jsoup.select.Elements elements18 = document3.getElementsByIndexEquals(10);
        org.jsoup.select.Elements elements21 = document3.getElementsByAttributeValue("<html> <head></head> <body> </body> </html>", "<html>\n <head></head>\n <body></body>\n</html>&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;<<html> <head></head> <body> </body> </html>></<html> <head></head> <body> </body> </html>>");
        org.jsoup.nodes.Document document23 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document25 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element26 = document23.prependChild((org.jsoup.nodes.Node) document25);
        java.lang.String str27 = document25.html();
        java.lang.String str28 = document25.html();
        java.util.Map<java.lang.String, java.lang.String> strMap29 = document25.dataset();
        org.jsoup.nodes.Element element30 = document25.lastElementSibling();
        org.jsoup.select.Elements elements33 = element30.getElementsByAttributeValueStarting(" html", "<#root>\n <html>\n  <head></head>\n  <body></body>\n </html>\n</#root>\n<html>\n <head></head>\n <body></body>\n</html>");
        document3.replaceWith((org.jsoup.nodes.Node) element30);
        org.jsoup.select.Elements elements37 = document3.getElementsByAttributeValue(" hi!", "<head></head>\n<body></body>");
        org.jsoup.nodes.Document document39 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document41 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element42 = document39.prependChild((org.jsoup.nodes.Node) document41);
        org.jsoup.select.Elements elements44 = document41.getElementsByIndexLessThan((int) (short) 10);
        org.jsoup.nodes.Element element46 = document41.val("");
        org.jsoup.nodes.Element element48 = document41.after("#root");
        org.jsoup.nodes.Element element49 = document41.nextElementSibling();
        org.jsoup.nodes.Element element51 = document41.val("<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.nodes.Element element52 = document41.parent();
        element52.setBaseUri("<html>\n <head></head>\n <body></body>\n</html>&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt; <html> <head></head> <body></body> </html> <html> <head></head> <body> </body> </html>");
        // The following exception was thrown during execution in test generation
        try {
            document3.replaceWith((org.jsoup.nodes.Node) element52);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str9, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "#root" + "'", str12, "#root");
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(document15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "#document" + "'", str16, "#document");
        org.junit.Assert.assertNotNull(elements18);
        org.junit.Assert.assertNotNull(elements21);
        org.junit.Assert.assertNotNull(document23);
        org.junit.Assert.assertNotNull(document25);
        org.junit.Assert.assertNotNull(element26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str27, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str28, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertNotNull(strMap29);
        org.junit.Assert.assertNotNull(element30);
        org.junit.Assert.assertNotNull(elements33);
        org.junit.Assert.assertNotNull(elements37);
        org.junit.Assert.assertNotNull(document39);
        org.junit.Assert.assertNotNull(document41);
        org.junit.Assert.assertNotNull(element42);
        org.junit.Assert.assertNotNull(elements44);
        org.junit.Assert.assertNotNull(element46);
        org.junit.Assert.assertNotNull(element48);
        org.junit.Assert.assertNotNull(element49);
        org.junit.Assert.assertNotNull(element51);
        org.junit.Assert.assertNotNull(element52);
    }

    @Test
    public void test3816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3816");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.parser.Tag tag5 = document3.tag();
        org.jsoup.select.Elements elements6 = document3.children();
        org.jsoup.nodes.Document.OutputSettings outputSettings7 = document3.outputSettings();
        java.lang.String str8 = document3.toString();
        boolean boolean9 = document3.isBlock();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(tag5);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(outputSettings7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str8, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test3817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3817");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.select.Elements elements6 = document3.getElementsByIndexLessThan((int) (short) 10);
        org.jsoup.nodes.Element element8 = document3.val("");
        org.jsoup.nodes.Element element10 = document3.after("#root");
        org.jsoup.nodes.Document document11 = document3.ownerDocument();
        org.jsoup.nodes.Element element14 = document3.attr("#root", "<html>\n <head></head>\n <body></body>\n</html>");
        java.util.List<org.jsoup.nodes.Node> nodeList15 = document3.childNodes();
        java.lang.String str16 = document3.html();
        org.jsoup.nodes.Element element18 = document3.before("<html> <head></head> <body> </body> </html>");
        org.jsoup.nodes.Element element20 = document3.prependElement("<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.nodes.Element element21 = document3.body();
        org.jsoup.nodes.Element element22 = document3.nextElementSibling();
        java.lang.String str23 = element22.tagName();
        org.jsoup.nodes.Element element25 = element22.wrap("<html>\n <head></head>\n <body></body>\n</html>&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;\n<html> \n <head></head> \n <body> &lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt; \n  <html> \n   <head></head> \n   <body>  \n    <html> \n     <head></head> \n     <body>  \n     </body>\n    </html>\n   </body>\n  </html>\n </body>\n</html>");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(document11);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(nodeList15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str16, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "html" + "'", str23, "html");
        org.junit.Assert.assertNotNull(element25);
    }

    @Test
    public void test3818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3818");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        java.lang.String str5 = document3.html();
        java.lang.String str6 = document3.html();
        java.util.Map<java.lang.String, java.lang.String> strMap7 = document3.dataset();
        org.jsoup.nodes.Element element9 = document3.appendElement("hi!");
        org.jsoup.nodes.Element element10 = document3.body();
        org.jsoup.select.Elements elements12 = document3.getElementsByIndexGreaterThan((int) (byte) 10);
        java.lang.String str13 = document3.title();
        org.jsoup.select.Elements elements15 = document3.getElementsContainingText("<#root value=\"&lt;html&gt;\n &lt;head&gt;&lt;/head&gt;\n &lt;body&gt;&lt;/body&gt;\n&lt;/html&gt;\">\n <html>\n  <head></head>\n  <body></body>\n </html>\n</#root>#root\n<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.nodes.Element element17 = document3.prependElement("<head></head>\n<body></body>");
        org.jsoup.nodes.Element element18 = document3.nextElementSibling();
        org.jsoup.nodes.Element element20 = document3.prepend("\n<body></body>");
        org.jsoup.nodes.Document document21 = document3.ownerDocument();
        org.jsoup.select.Elements elements23 = document21.getElementsContainingOwnText("<html>\n <head></head>\n <body></body>\n</html>");
        java.lang.String str24 = document21.val();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str5, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str6, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertNotNull(document21);
        org.junit.Assert.assertNotNull(elements23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
    }

    @Test
    public void test3819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3819");
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
        org.jsoup.select.Elements elements17 = element15.getElementsByAttribute("<html>\n <head></head>\n <body></body>\n</html>&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;<<html> <head></head> <body> </body> </html>></<html> <head></head> <body> </body> </html>>");
        java.lang.String str18 = element15.text();
        org.jsoup.select.Elements elements21 = element15.getElementsByAttributeValueNot("body", "head");
        boolean boolean23 = element15.hasClass("<head></head>\n<body></body>");
        org.jsoup.nodes.Element element26 = element15.attr("&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt; &lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;#document\n<html>\n <head></head>\n <body></body>\n</html><hi!></hi!>", "<body></body>&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt;&lt;/body&gt; &lt;/html&gt;\n<html> \n <head></head> \n <body>  \n </body>\n</html>");
        java.lang.String str27 = element15.baseUri();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str5, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str6, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(elements17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "#document <html> <head></head> <body></body> </html>&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;" + "'", str18, "#document <html> <head></head> <body></body> </html>&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;");
        org.junit.Assert.assertNotNull(elements21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(element26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
    }

    @Test
    public void test3820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3820");
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
        org.jsoup.nodes.Element element17 = document3.appendText("#document");
        org.jsoup.nodes.Attributes attributes18 = element17.attributes();
        org.jsoup.nodes.Document document19 = element17.ownerDocument();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str9, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(attributes18);
        org.junit.Assert.assertNotNull(document19);
    }

    @Test
    public void test3821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3821");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("#root");
        org.jsoup.nodes.Document.OutputSettings outputSettings2 = document1.outputSettings();
        org.jsoup.nodes.Element element4 = document1.child(0);
        java.lang.String str5 = element4.html();
        org.jsoup.nodes.Element element7 = element4.before("<html>\n <head>\n  <title>#document</title>\n </head>\n <body>\n  &lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt;&lt;/body&gt; &lt;/html&gt;\n </body>\n</html><hi!></hi!>");
        element4.remove();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(outputSettings2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<head></head>\n<body></body>" + "'", str5, "<head></head>\n<body></body>");
        org.junit.Assert.assertNotNull(element7);
    }

    @Test
    public void test3822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3822");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        java.lang.String str5 = document3.html();
        java.lang.String str6 = document3.html();
        java.util.Map<java.lang.String, java.lang.String> strMap7 = document3.dataset();
        org.jsoup.nodes.Element element9 = document3.appendText("<html>\n <head></head>\n <body>\n </body>\n</html>");
        org.jsoup.select.Elements elements12 = document3.getElementsByAttributeValueStarting("<html>\n <head></head>\n <body>\n </body>\n</html>", "<html> <head></head> <body> </body> </html>");
        org.jsoup.select.Elements elements15 = document3.getElementsByAttributeValueMatching("<html> <head></head> <body> </body> </html>", "hi!");
        org.jsoup.select.Elements elements17 = document3.getElementsByTag("hi!");
        org.jsoup.select.Elements elements18 = document3.getAllElements();
        org.jsoup.nodes.Element element20 = document3.html("<html>\n <head></head>\n <body>\n </body>\n</html>\n<html> \n <head></head> \n <body>  \n </body>\n</html>");
        org.jsoup.nodes.Element element22 = element20.toggleClass("<html>\n <head></head>\n <body></body>\n</html>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node24 = element22.childNode((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 35 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str5, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str6, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertNotNull(elements17);
        org.junit.Assert.assertNotNull(elements18);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertNotNull(element22);
    }

    @Test
    public void test3823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3823");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        java.lang.String str5 = document3.nodeName();
        org.jsoup.nodes.Element element7 = document3.before("<html>\n <head></head>\n <body></body>\n</html>&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt; <html> <head></head> <body></body> </html> <html> <head></head> <body> </body> </html>");
        org.jsoup.nodes.Element element9 = element7.addClass("");
        element9.setBaseUri("\n<body>\n &lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt;&lt;/body&gt; &lt;/html&gt;\n</body>");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#document" + "'", str5, "#document");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(element9);
    }

    @Test
    public void test3824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3824");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        java.lang.String str5 = document3.html();
        java.lang.String str6 = document3.html();
        org.jsoup.nodes.Document document8 = org.jsoup.nodes.Document.createShell("");
        java.util.Set<java.lang.String> strSet9 = document8.classNames();
        org.jsoup.nodes.Element element10 = document3.classNames(strSet9);
        org.jsoup.select.Elements elements12 = document3.getElementsByClass("\n<html>\n <head></head>\n <body></body>\n</html>");
        java.util.List<org.jsoup.nodes.Node> nodeList13 = document3.siblingNodes();
        org.jsoup.nodes.Element element15 = document3.wrap("<html>\n <head></head>\n <body></body>\n</html>html");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str5, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str6, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertNotNull(document8);
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertNotNull(nodeList13);
        org.junit.Assert.assertNotNull(element15);
    }

    @Test
    public void test3825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3825");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("<html> <head></head> <body></body> </html>&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;");
    }

    @Test
    public void test3826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3826");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        java.lang.String str5 = document3.html();
        java.lang.String str6 = document3.html();
        org.jsoup.nodes.Document.OutputSettings outputSettings7 = document3.new OutputSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList8 = document3.siblingNodes();
        boolean boolean10 = document3.hasClass("<html>\n <head>\n  <title>&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;</title>\n </head>\n <body></body>\n</html>");
        org.jsoup.nodes.Element element12 = document3.createElement("html");
        org.jsoup.nodes.Element element13 = document3.body();
        java.lang.String str14 = element13.ownText();
        org.jsoup.nodes.Element element16 = element13.wrap("#document");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str5, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str6, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertNotNull(nodeList8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNull(element16);
    }

    @Test
    public void test3827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3827");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        java.lang.String str5 = document1.tagName();
        org.jsoup.nodes.Element element6 = document1.head();
        java.lang.Integer int7 = element6.siblingIndex();
        org.jsoup.nodes.Element element10 = element6.attr("<html> <head></head> <body></body> </html>", "<html>\n <head>\n  <title>&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;</title>\n </head>\n <body></body>\n</html>");
        org.jsoup.nodes.Document document12 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document14 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element15 = document12.prependChild((org.jsoup.nodes.Node) document14);
        java.lang.String str16 = document12.tagName();
        org.jsoup.nodes.Document.OutputSettings outputSettings17 = document12.new OutputSettings();
        org.jsoup.nodes.Document document18 = document12.normalise();
        org.jsoup.nodes.Element element20 = document12.appendElement("<html>\n <head>\n  <title>&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;</title>\n </head>\n <body></body>\n</html>");
        org.jsoup.nodes.Element element22 = document12.prepend("<html>\n <head>\n  <title>&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;</title>\n </head>\n <body></body>\n</html>");
        org.jsoup.nodes.Element element23 = element10.appendChild((org.jsoup.nodes.Node) document12);
        org.jsoup.nodes.Document document25 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document27 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element28 = document25.prependChild((org.jsoup.nodes.Node) document27);
        org.jsoup.nodes.Element element29 = document25.body();
        org.jsoup.select.Elements elements31 = document25.select("#root");
        org.jsoup.nodes.Element element32 = document25.empty();
        java.lang.String str33 = document25.className();
        java.lang.String str34 = document25.ownText();
        element10.replaceWith((org.jsoup.nodes.Node) document25);
        org.jsoup.select.Elements elements37 = document25.getElementsContainingText("body");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#root" + "'", str5, "#root");
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(document12);
        org.junit.Assert.assertNotNull(document14);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "#root" + "'", str16, "#root");
        org.junit.Assert.assertNotNull(document18);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertNotNull(document25);
        org.junit.Assert.assertNotNull(document27);
        org.junit.Assert.assertNotNull(element28);
        org.junit.Assert.assertNotNull(element29);
        org.junit.Assert.assertNotNull(elements31);
        org.junit.Assert.assertNotNull(element32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertNotNull(elements37);
    }

    @Test
    public void test3828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3828");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.select.Elements elements6 = document3.getElementsByIndexLessThan((int) (short) 10);
        org.jsoup.nodes.Element element8 = document3.val("");
        org.jsoup.nodes.Element element10 = element8.val("hi!");
        org.jsoup.nodes.Element element12 = element8.prepend("&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt;&lt;/body&gt; &lt;/html&gt;&amp;lt;html&amp;gt; &amp;lt;head&amp;gt;&amp;lt;/head&amp;gt; &amp;lt;body&amp;gt; &amp;lt;/body&amp;gt; &amp;lt;/html&amp;gt;<#root>\n <html>\n  <head></head>\n  <body></body>\n </html>\n</#root>\n<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.nodes.Element element13 = element8.parent();
        java.lang.String str14 = element8.data();
        org.jsoup.nodes.Node node15 = element8.previousSibling();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNull(node15);
    }

    @Test
    public void test3829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3829");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        java.lang.String str5 = document3.html();
        java.lang.String str6 = document3.html();
        java.util.Map<java.lang.String, java.lang.String> strMap7 = document3.dataset();
        org.jsoup.nodes.Element element9 = document3.appendText("<html>\n <head></head>\n <body>\n </body>\n</html>");
        org.jsoup.select.Elements elements12 = document3.getElementsByAttributeValueStarting("<html>\n <head></head>\n <body>\n </body>\n</html>", "<html> <head></head> <body> </body> </html>");
        org.jsoup.select.Elements elements15 = document3.getElementsByAttributeValueMatching("<html> <head></head> <body> </body> </html>", "hi!");
        org.jsoup.nodes.Element element17 = document3.addClass("html");
        org.jsoup.nodes.Element element19 = element17.val("<html>\n <head></head>\n <body></body>\n</html>&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;");
        org.jsoup.nodes.Element element20 = element19.parent();
        org.jsoup.nodes.Element element22 = element19.prependText("<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.nodes.Document document24 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document26 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element27 = document24.prependChild((org.jsoup.nodes.Node) document26);
        org.jsoup.select.Elements elements29 = document26.getElementsByIndexLessThan((int) (short) 10);
        java.util.Set<java.lang.String> strSet30 = document26.classNames();
        org.jsoup.select.Elements elements33 = document26.getElementsByAttributeValueNot("<html> <head></head> <body> </body> </html>", "#root");
        org.jsoup.select.Elements elements35 = document26.getElementsByIndexGreaterThan((int) (byte) -1);
        java.lang.String str36 = document26.className();
        org.jsoup.nodes.Document document38 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document40 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element41 = document38.prependChild((org.jsoup.nodes.Node) document40);
        org.jsoup.select.Elements elements43 = document40.getElementsByIndexLessThan((int) (short) 10);
        java.util.Set<java.lang.String> strSet44 = document40.classNames();
        org.jsoup.nodes.Element element45 = document26.appendChild((org.jsoup.nodes.Node) document40);
        org.jsoup.nodes.Element element46 = element22.appendChild((org.jsoup.nodes.Node) document40);
        java.lang.String str47 = element46.data();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str5, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str6, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertNotNull(document24);
        org.junit.Assert.assertNotNull(document26);
        org.junit.Assert.assertNotNull(element27);
        org.junit.Assert.assertNotNull(elements29);
        org.junit.Assert.assertNotNull(strSet30);
        org.junit.Assert.assertNotNull(elements33);
        org.junit.Assert.assertNotNull(elements35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertNotNull(document38);
        org.junit.Assert.assertNotNull(document40);
        org.junit.Assert.assertNotNull(element41);
        org.junit.Assert.assertNotNull(elements43);
        org.junit.Assert.assertNotNull(strSet44);
        org.junit.Assert.assertNotNull(element45);
        org.junit.Assert.assertNotNull(element46);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
    }

    @Test
    public void test3830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3830");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.parser.Tag tag5 = document3.tag();
        org.jsoup.nodes.Element element7 = document3.createElement("<html>\n <head></head>\n <body></body>\n</html>");
        document3.setBaseUri("");
        java.lang.String[] strArray11 = new java.lang.String[] { "#root" };
        java.util.LinkedHashSet<java.lang.String> strSet12 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet12, strArray11);
        org.jsoup.nodes.Element element14 = document3.classNames((java.util.Set<java.lang.String>) strSet12);
        org.jsoup.nodes.Element element16 = document3.prepend("");
        java.lang.String str17 = document3.nodeName();
        org.jsoup.select.Elements elements19 = document3.getElementsByTag("<html>\n <head></head>\n <body>\n </body>\n</html>\n<html> \n <head></head> \n <body>  \n </body>\n</html>");
        org.jsoup.select.Elements elements20 = document3.siblingElements();
        org.jsoup.select.Elements elements21 = document3.getAllElements();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(tag5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "#root" });
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "#document" + "'", str17, "#document");
        org.junit.Assert.assertNotNull(elements19);
        org.junit.Assert.assertNotNull(elements20);
        org.junit.Assert.assertNotNull(elements21);
    }

    @Test
    public void test3831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3831");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell(" html");
        java.lang.String str2 = document1.title();
        org.jsoup.nodes.Element element4 = document1.append("\n<body>\n &lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt;&lt;/body&gt; &lt;/html&gt;\n</body>");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(element4);
    }

    @Test
    public void test3832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3832");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        java.lang.String str5 = document3.html();
        java.lang.String str6 = document3.html();
        org.jsoup.nodes.Document.OutputSettings outputSettings7 = document3.new OutputSettings();
        int int8 = outputSettings7.indentAmount();
        java.nio.charset.Charset charset9 = outputSettings7.charset();
        org.jsoup.nodes.Document document11 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document13 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element14 = document11.prependChild((org.jsoup.nodes.Node) document13);
        java.lang.String str15 = document11.tagName();
        org.jsoup.nodes.Document.OutputSettings outputSettings16 = document11.new OutputSettings();
        boolean boolean17 = outputSettings16.prettyPrint();
        java.nio.charset.CharsetEncoder charsetEncoder18 = outputSettings16.encoder();
        java.nio.charset.Charset charset19 = outputSettings16.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings20 = outputSettings7.charset(charset19);
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str5, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str6, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(charset9);
        org.junit.Assert.assertNotNull(document11);
        org.junit.Assert.assertNotNull(document13);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "#root" + "'", str15, "#root");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(charsetEncoder18);
        org.junit.Assert.assertNotNull(charset19);
        org.junit.Assert.assertNotNull(outputSettings20);
    }

    @Test
    public void test3833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3833");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell(" hi!");
        org.jsoup.nodes.Document.OutputSettings outputSettings2 = document1.outputSettings();
        boolean boolean3 = outputSettings2.prettyPrint();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(outputSettings2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test3834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3834");
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
        org.jsoup.select.Elements elements17 = document3.getAllElements();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str9, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertNotNull(tag16);
        org.junit.Assert.assertNotNull(elements17);
    }

    @Test
    public void test3835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3835");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.select.Elements elements6 = document3.getElementsByIndexLessThan((int) (short) 10);
        org.jsoup.nodes.Document document8 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document10 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element11 = document8.prependChild((org.jsoup.nodes.Node) document10);
        org.jsoup.select.Elements elements13 = document10.getElementsByIndexLessThan((int) (short) 10);
        boolean boolean14 = document3.equals((java.lang.Object) (short) 10);
        org.jsoup.nodes.Node node15 = document3.nextSibling();
        org.jsoup.nodes.Document document17 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document19 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element20 = document17.prependChild((org.jsoup.nodes.Node) document19);
        boolean boolean21 = document3.equals((java.lang.Object) element20);
        java.lang.String str22 = document3.tagName();
        org.jsoup.nodes.Document document23 = document3.normalise();
        boolean boolean24 = document3.isBlock();
        org.jsoup.nodes.Document document26 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document28 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element29 = document26.prependChild((org.jsoup.nodes.Node) document28);
        java.lang.String str30 = document26.tagName();
        org.jsoup.nodes.Document.OutputSettings outputSettings31 = document26.new OutputSettings();
        org.jsoup.nodes.Document document32 = document26.normalise();
        org.jsoup.select.Elements elements34 = document32.getElementsByIndexEquals((int) (byte) 1);
        java.util.Set<java.lang.String> strSet35 = document32.classNames();
        org.jsoup.nodes.Element element36 = document3.classNames(strSet35);
        java.lang.String str37 = document3.nodeName();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(document8);
        org.junit.Assert.assertNotNull(document10);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNotNull(document17);
        org.junit.Assert.assertNotNull(document19);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "#root" + "'", str22, "#root");
        org.junit.Assert.assertNotNull(document23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(document26);
        org.junit.Assert.assertNotNull(document28);
        org.junit.Assert.assertNotNull(element29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "#root" + "'", str30, "#root");
        org.junit.Assert.assertNotNull(document32);
        org.junit.Assert.assertNotNull(elements34);
        org.junit.Assert.assertNotNull(strSet35);
        org.junit.Assert.assertNotNull(element36);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "#document" + "'", str37, "#document");
    }

    @Test
    public void test3836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3836");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.select.Elements elements6 = document3.getElementsByIndexLessThan((int) (short) 10);
        org.jsoup.nodes.Element element8 = document3.val("");
        org.jsoup.nodes.Element element10 = element8.val("hi!");
        org.jsoup.select.Elements elements11 = element8.siblingElements();
        org.jsoup.nodes.Element element13 = element8.prepend("");
        org.jsoup.select.Elements elements15 = element8.getElementsByIndexEquals((-1));
        org.jsoup.nodes.Element element17 = element8.appendText("html");
        org.jsoup.nodes.Document document19 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document21 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element22 = document19.prependChild((org.jsoup.nodes.Node) document21);
        java.lang.String str23 = document21.html();
        java.lang.String str24 = document21.html();
        java.util.Map<java.lang.String, java.lang.String> strMap25 = document21.dataset();
        org.jsoup.nodes.Element element27 = document21.appendText("<html>\n <head></head>\n <body>\n </body>\n</html>");
        org.jsoup.select.Elements elements30 = document21.getElementsByAttributeValueStarting("<html>\n <head></head>\n <body>\n </body>\n</html>", "<html> <head></head> <body> </body> </html>");
        org.jsoup.nodes.Element element32 = document21.appendElement("<html> <head></head> <body> </body> </html>");
        org.jsoup.nodes.Element element34 = document21.before("<html>\n <head></head>\n <body></body>\n</html>&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;<<html> <head></head> <body> </body> </html>></<html> <head></head> <body> </body> </html>>");
        org.jsoup.select.Elements elements35 = document21.getAllElements();
        boolean boolean36 = element8.equals((java.lang.Object) document21);
        org.jsoup.nodes.Element element38 = document21.val("<#root>\n <#root>\n  <html>\n   <head></head>\n   <body></body>\n  </html>\n </#root>\n <html>\n  <head></head>\n  <body></body>\n </html>\n</#root>\n<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(document19);
        org.junit.Assert.assertNotNull(document21);
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str23, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str24, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertNotNull(strMap25);
        org.junit.Assert.assertNotNull(element27);
        org.junit.Assert.assertNotNull(elements30);
        org.junit.Assert.assertNotNull(element32);
        org.junit.Assert.assertNotNull(element34);
        org.junit.Assert.assertNotNull(elements35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(element38);
    }

    @Test
    public void test3837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3837");
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
        org.jsoup.nodes.Element element21 = element20.lastElementSibling();
        org.jsoup.nodes.Document document23 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document25 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element26 = document23.prependChild((org.jsoup.nodes.Node) document25);
        java.lang.String str27 = document25.html();
        java.lang.String str28 = document25.html();
        document25.title("<html>\n <head></head>\n <body></body>\n</html>");
        java.util.regex.Pattern pattern32 = null;
        org.jsoup.select.Elements elements33 = document25.getElementsByAttributeValueMatching("hi!", pattern32);
        org.jsoup.nodes.Document document35 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document37 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element38 = document35.prependChild((org.jsoup.nodes.Node) document37);
        org.jsoup.select.Elements elements40 = document37.getElementsByIndexLessThan((int) (short) 10);
        org.jsoup.nodes.Element element42 = document37.val("");
        java.lang.String str43 = document37.outerHtml();
        org.jsoup.select.Elements elements45 = document37.getElementsByClass("#root");
        java.lang.String str46 = document37.tagName();
        java.lang.Integer int47 = document37.elementSiblingIndex();
        java.util.regex.Pattern pattern49 = null;
        org.jsoup.select.Elements elements50 = document37.getElementsByAttributeValueMatching("<html> <head></head> <body> </body> </html>", pattern49);
        org.jsoup.nodes.Element element51 = document37.lastElementSibling();
        org.jsoup.select.Elements elements53 = document37.getElementsByIndexEquals((int) (short) 100);
        org.jsoup.nodes.Document.OutputSettings outputSettings54 = document37.outputSettings();
        org.jsoup.nodes.Element element55 = document25.appendChild((org.jsoup.nodes.Node) document37);
        java.util.Set<java.lang.String> strSet56 = element55.classNames();
        org.jsoup.nodes.Element element57 = element20.classNames(strSet56);
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertNotNull(document15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertNull(element21);
        org.junit.Assert.assertNotNull(document23);
        org.junit.Assert.assertNotNull(document25);
        org.junit.Assert.assertNotNull(element26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str27, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str28, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertNotNull(elements33);
        org.junit.Assert.assertNotNull(document35);
        org.junit.Assert.assertNotNull(document37);
        org.junit.Assert.assertNotNull(element38);
        org.junit.Assert.assertNotNull(elements40);
        org.junit.Assert.assertNotNull(element42);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str43, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertNotNull(elements45);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "#root" + "'", str46, "#root");
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertNotNull(elements50);
        org.junit.Assert.assertNotNull(element51);
        org.junit.Assert.assertNotNull(elements53);
        org.junit.Assert.assertNotNull(outputSettings54);
        org.junit.Assert.assertNotNull(element55);
        org.junit.Assert.assertNotNull(strSet56);
        org.junit.Assert.assertNotNull(element57);
    }

    @Test
    public void test3838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3838");
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
        org.jsoup.nodes.Element element16 = document3.head();
        java.util.List<org.jsoup.nodes.Node> nodeList17 = document3.childNodes();
        org.jsoup.nodes.Element element18 = document3.body();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str5, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str6, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;<<html> <head></head> <body> </body> </html>></<html> <head></head> <body> </body> </html>>" + "'", str15, "<html>\n <head></head>\n <body></body>\n</html>&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;<<html> <head></head> <body> </body> </html>></<html> <head></head> <body> </body> </html>>");
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(nodeList17);
        org.junit.Assert.assertNotNull(element18);
    }

    @Test
    public void test3839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3839");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element3 = document1.text("");
        java.lang.String str4 = element3.html();
        org.jsoup.nodes.Document document6 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document8 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element9 = document6.prependChild((org.jsoup.nodes.Node) document8);
        java.lang.String str10 = document8.html();
        java.lang.String str11 = document8.html();
        document8.title("<html>\n <head></head>\n <body></body>\n</html>");
        java.util.regex.Pattern pattern15 = null;
        org.jsoup.select.Elements elements16 = document8.getElementsByAttributeValueMatching("hi!", pattern15);
        org.jsoup.nodes.Element element18 = document8.after("");
        org.jsoup.nodes.Document.OutputSettings outputSettings19 = document8.outputSettings();
        org.jsoup.nodes.Element element21 = document8.wrap("<html> <head></head> <body> </body> </html>");
        org.jsoup.nodes.Element element22 = element3.prependChild((org.jsoup.nodes.Node) document8);
        org.jsoup.select.Elements elements24 = element3.getElementsContainingOwnText("body");
        org.jsoup.nodes.Element element26 = element3.addClass("<#root value=\"\" #root=\"&lt;html&gt;\n &lt;head&gt;&lt;/head&gt;\n &lt;body&gt;&lt;/body&gt;\n&lt;/html&gt;\" class=\"\">\n <html>\n  <head></head>\n  <body></body>\n </html><<html>\n <head></head>\n <body>\n </body>\n</html>></<html>\n <head></head>\n <body>\n </body>\n</html>>\n</#root>");
        org.jsoup.nodes.Document document28 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document30 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element31 = document28.prependChild((org.jsoup.nodes.Node) document30);
        org.jsoup.select.Elements elements33 = document30.getElementsByIndexLessThan((int) (short) 10);
        org.jsoup.nodes.Element element35 = document30.val("");
        org.jsoup.nodes.Element element37 = element35.val("hi!");
        org.jsoup.select.Elements elements38 = element35.siblingElements();
        org.jsoup.nodes.Element element40 = element35.prepend("");
        boolean boolean42 = element40.hasClass("<html>\n <head></head>\n <body>\n </body>\n</html>");
        org.jsoup.nodes.Element element44 = element40.before("<html> <head></head> <body> </body> </html>");
        java.util.Set<java.lang.String> strSet45 = element40.classNames();
        org.jsoup.nodes.Element element46 = element3.classNames(strSet45);
        org.jsoup.nodes.Element element48 = element3.prependText("<html> <head> <title>&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt;&lt;/body&gt; &lt;/html&gt;</title> </head> <body></body> </html>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element50 = element48.child(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<html>\n <head></head>\n <body>\n </body>\n</html>" + "'", str4, "<html>\n <head></head>\n <body>\n </body>\n</html>");
        org.junit.Assert.assertNotNull(document6);
        org.junit.Assert.assertNotNull(document8);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str10, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str11, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertNotNull(elements16);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNotNull(outputSettings19);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertNotNull(elements24);
        org.junit.Assert.assertNotNull(element26);
        org.junit.Assert.assertNotNull(document28);
        org.junit.Assert.assertNotNull(document30);
        org.junit.Assert.assertNotNull(element31);
        org.junit.Assert.assertNotNull(elements33);
        org.junit.Assert.assertNotNull(element35);
        org.junit.Assert.assertNotNull(element37);
        org.junit.Assert.assertNotNull(elements38);
        org.junit.Assert.assertNotNull(element40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(element44);
        org.junit.Assert.assertNotNull(strSet45);
        org.junit.Assert.assertNotNull(element46);
        org.junit.Assert.assertNotNull(element48);
    }

    @Test
    public void test3840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3840");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        java.lang.String str5 = document3.html();
        java.lang.String str6 = document3.html();
        org.jsoup.nodes.Document.OutputSettings outputSettings7 = document3.new OutputSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList8 = document3.siblingNodes();
        org.jsoup.nodes.Document document10 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document12 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element13 = document10.prependChild((org.jsoup.nodes.Node) document12);
        org.jsoup.select.Elements elements15 = document12.getElementsByIndexLessThan((int) (short) 10);
        org.jsoup.nodes.Element element17 = document12.val("");
        org.jsoup.nodes.Element element19 = element17.val("hi!");
        java.lang.String str20 = element19.className();
        org.jsoup.select.Elements elements21 = element19.getAllElements();
        org.jsoup.nodes.Element element23 = element19.removeClass("<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.nodes.Element element25 = element19.removeClass("<html>\n <head>\n  <title>&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;</title>\n </head>\n <body></body>\n</html>");
        org.jsoup.nodes.Element element26 = document3.prependChild((org.jsoup.nodes.Node) element19);
        org.jsoup.select.Elements elements27 = document3.children();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str5, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str6, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertNotNull(nodeList8);
        org.junit.Assert.assertNotNull(document10);
        org.junit.Assert.assertNotNull(document12);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(elements21);
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertNotNull(element25);
        org.junit.Assert.assertNotNull(element26);
        org.junit.Assert.assertNotNull(elements27);
    }

    @Test
    public void test3841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3841");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt;&lt;/body&gt; &lt;/html&gt;&amp;lt;html&amp;gt; &amp;lt;head&amp;gt;&amp;lt;/head&amp;gt; &amp;lt;body&amp;gt; &amp;lt;/body&amp;gt; &amp;lt;/html&amp;gt;<#root>\n <html>\n  <head></head>\n  <body></body>\n </html>\n</#root>\n<html>\n <head></head>\n <body></body>\n</html>");
        boolean boolean3 = document1.hasClass("<#root>\n <html>\n  <head></head>\n  <body></body>\n </html>\n</#root>\n<html>\n <head></head>\n <body></body>\n</html>");
        java.lang.String str4 = document1.title();
        org.jsoup.select.Elements elements6 = document1.getElementsByIndexEquals(100);
        org.jsoup.nodes.Document document8 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document10 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element11 = document8.prependChild((org.jsoup.nodes.Node) document10);
        org.jsoup.select.Elements elements13 = document10.getElementsByIndexLessThan((int) (short) 10);
        org.jsoup.nodes.Element element15 = document10.val("");
        java.lang.String str16 = document10.outerHtml();
        org.jsoup.select.Elements elements18 = document10.getElementsByClass("#root");
        org.jsoup.select.Elements elements20 = document10.getElementsByIndexGreaterThan(10);
        org.jsoup.nodes.Element element22 = document10.text("<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.select.Elements elements24 = element22.getElementsByAttribute("hi!");
        java.lang.String str25 = element22.tagName();
        java.lang.Integer int26 = element22.siblingIndex();
        org.jsoup.nodes.Element element28 = element22.html(" hi!");
        org.jsoup.nodes.Element element29 = document1.prependChild((org.jsoup.nodes.Node) element28);
        org.jsoup.nodes.Element element31 = document1.addClass("<#root value=\"\" #root=\"&lt;html&gt;\n &lt;head&gt;&lt;/head&gt;\n &lt;body&gt;&lt;/body&gt;\n&lt;/html&gt;\" class=\"\">\n <html>\n  <head></head>\n  <body></body>\n </html>\n</#root>#root\n<html>\n <head></head>\n <body></body>\n</html>");
        java.lang.Integer int32 = document1.siblingIndex();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(document8);
        org.junit.Assert.assertNotNull(document10);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str16, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertNotNull(elements18);
        org.junit.Assert.assertNotNull(elements20);
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertNotNull(elements24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "#root" + "'", str25, "#root");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(element28);
        org.junit.Assert.assertNotNull(element29);
        org.junit.Assert.assertNotNull(element31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
    }

    @Test
    public void test3842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3842");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.select.Elements elements6 = document3.getElementsByIndexLessThan((int) (short) 10);
        org.jsoup.nodes.Element element8 = document3.before("<html>\n <head></head>\n <body>\n  &lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt; \n </body>\n</html><<html> <head></head> <body> </body> </html>></<html> <head></head> <body> </body> </html>>");
        org.jsoup.select.Elements elements9 = document3.getAllElements();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(elements9);
    }

    @Test
    public void test3843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3843");
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
        document3.title("<html> <head></head> <body> </body> </html>");
        java.lang.String str18 = document3.text();
        java.lang.String str19 = document3.className();
        org.jsoup.nodes.Document document21 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document23 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element24 = document21.prependChild((org.jsoup.nodes.Node) document23);
        java.lang.String str25 = document21.tagName();
        org.jsoup.nodes.Document.OutputSettings outputSettings26 = document21.new OutputSettings();
        java.lang.Integer int27 = document21.siblingIndex();
        org.jsoup.select.Elements elements28 = document21.children();
        org.jsoup.select.Elements elements30 = document21.getElementsByIndexGreaterThan((int) (byte) 100);
        document3.replaceWith((org.jsoup.nodes.Node) document21);
        org.jsoup.nodes.Element element33 = document21.createElement("html");
        java.lang.String str34 = document21.tagName();
        org.jsoup.nodes.Document document35 = document21.normalise();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str9, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "<html> <head></head> <body> </body> </html>" + "'", str18, "<html> <head></head> <body> </body> </html>");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(document21);
        org.junit.Assert.assertNotNull(document23);
        org.junit.Assert.assertNotNull(element24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "#root" + "'", str25, "#root");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(elements28);
        org.junit.Assert.assertNotNull(elements30);
        org.junit.Assert.assertNotNull(element33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "#root" + "'", str34, "#root");
        org.junit.Assert.assertNotNull(document35);
    }

    @Test
    public void test3844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3844");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.select.Elements elements6 = document3.getElementsByIndexLessThan((int) (short) 10);
        org.jsoup.nodes.Document document8 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document10 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element11 = document8.prependChild((org.jsoup.nodes.Node) document10);
        org.jsoup.select.Elements elements13 = document10.getElementsByIndexLessThan((int) (short) 10);
        boolean boolean14 = document3.equals((java.lang.Object) (short) 10);
        org.jsoup.nodes.Node node15 = document3.nextSibling();
        org.jsoup.nodes.Element element16 = document3.firstElementSibling();
        org.jsoup.nodes.Element element18 = document3.text("<html>\n <head>\n  <title>&lt;html&gt;\n &lt;head&gt;&lt;/head&gt;\n &lt;body&gt;&lt;/body&gt;\n&lt;/html&gt;</title>\n </head>\n <body></body>\n</html>");
        org.jsoup.nodes.Element element21 = element18.attr("<#root value=\"&lt;html&gt;\n &lt;head&gt;&lt;/head&gt;\n &lt;body&gt;&lt;/body&gt;\n&lt;/html&gt;\">\n <html>\n  <head></head>\n  <body></body>\n </html>\n</#root>#root\n<html>\n <head></head>\n <body></body>\n</html>", "<html>\n <head></head>\n <body>\n  &lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt; &lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;\n </body>\n</html>\n<html> \n <head></head> \n <body>  \n </body>\n</html>");
        boolean boolean23 = element18.hasClass("<#root value=\"\" #root=\"&lt;html&gt;\n &lt;head&gt;&lt;/head&gt;\n &lt;body&gt;&lt;/body&gt;\n&lt;/html&gt;\" class=\"\">\n <html>\n  <head></head>\n  <body></body>\n </html>\n</#root>#root\n<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.nodes.Element element25 = element18.appendElement("<html>\n <head></head>\n <body></body>\n</html>&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt; <html> <head></head> <body></body> </html> <html> <head></head> <body> </body> </html>");
        org.jsoup.select.Elements elements27 = element18.getElementsByIndexGreaterThan(100);
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(document8);
        org.junit.Assert.assertNotNull(document10);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(element25);
        org.junit.Assert.assertNotNull(elements27);
    }

    @Test
    public void test3845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3845");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.nodes.Element element5 = document1.body();
        java.lang.String str6 = element5.html();
        org.jsoup.nodes.Element element8 = element5.appendText("<html>\n <head></head>\n <body></body>\n</html>&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;<<html> <head></head> <body> </body> </html>></<html> <head></head> <body> </body> </html>>");
        boolean boolean9 = element8.hasText();
        java.lang.String str10 = element8.data();
        org.jsoup.nodes.Element element12 = element8.removeClass("<html>\n <head>\n  <title>#document</title>\n </head>\n <body>\n  &lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt;&lt;/body&gt; &lt;/html&gt;&amp;lt;html&amp;gt; &amp;lt;head&amp;gt;&amp;lt;/head&amp;gt; &amp;lt;body&amp;gt; &amp;lt;/body&amp;gt; &amp;lt;/html&amp;gt;\n </body>\n</html><hi!></hi!>");
        element12.remove();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element15 = element12.after("html");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(element12);
    }

    @Test
    public void test3846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3846");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.select.Elements elements6 = document3.getElementsByIndexLessThan((int) (short) 10);
        org.jsoup.nodes.Element element8 = document3.val("");
        org.jsoup.nodes.Element element11 = element8.attr("<html>\n <head></head>\n <body></body>\n</html>", "<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.parser.Tag tag12 = element11.tag();
        boolean boolean13 = element11.hasText();
        org.jsoup.select.Elements elements16 = element11.getElementsByAttributeValueMatching("&lt;#root value=&quot;&quot; class=&quot;&quot;&gt; &lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt;&lt;/body&gt; &lt;/html&gt; &lt;/#root&gt;\n<html>\n <head></head>\n <body></body>\n</html>", "<html>\n <head></head>\n <body>\n </body>\n</html>\n<html> \n <head></head> \n <body>  \n </body>\n</html>");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(tag12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(elements16);
    }

    @Test
    public void test3847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3847");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        java.lang.String str3 = document1.absUrl("<html> <head></head> <body> </body> </html>");
        org.jsoup.select.Elements elements5 = document1.getElementsContainingOwnText("<html>\n <head></head>\n <body></body>\n</html>&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;");
        org.jsoup.nodes.Element element7 = document1.html("<html>\n <head></head>\n <body>\n </body>\n</html>");
        org.jsoup.nodes.Element element9 = element7.appendText("<html> <head></head> <body></body> </html>");
        org.jsoup.select.Elements elements11 = element9.getElementsByClass("<html>\n <head></head>\n <body></body>\n</html><<html>\n <head></head>\n <body></body>\n</html>&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;<<html> <head></head> <body> </body> </html>></<html> <head></head> <body> </body> </html>>></<html>\n <head></head>\n <body></body>\n</html>&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;<<html> <head></head> <body> </body> </html>></<html> <head></head> <body> </body> </html>>>");
        org.jsoup.select.Elements elements14 = element9.getElementsByAttributeValueNot("<html> <head></head> <body></body> </html>", "<body></body>&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt;&lt;/body&gt; &lt;/html&gt;\n<html> \n <head></head> \n <body>  \n </body>\n</html>");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(elements14);
    }

    @Test
    public void test3848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3848");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        java.lang.String str5 = document3.html();
        java.lang.String str6 = document3.html();
        java.util.Map<java.lang.String, java.lang.String> strMap7 = document3.dataset();
        org.jsoup.nodes.Element element9 = document3.appendElement("hi!");
        org.jsoup.select.Elements elements12 = document3.getElementsByAttributeValueMatching("#document", "head");
        org.jsoup.nodes.Document.OutputSettings outputSettings13 = document3.outputSettings();
        org.jsoup.select.Elements elements16 = document3.getElementsByAttributeValueContaining("#document\n<html>\n <head></head>\n <body></body>\n</html>", "#document");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str5, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str6, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertNotNull(outputSettings13);
        org.junit.Assert.assertNotNull(elements16);
    }

    @Test
    public void test3849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3849");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        java.lang.String str5 = document3.html();
        java.lang.String str6 = document3.html();
        java.util.Map<java.lang.String, java.lang.String> strMap7 = document3.dataset();
        org.jsoup.nodes.Element element9 = document3.appendText("<html>\n <head></head>\n <body>\n </body>\n</html>");
        org.jsoup.select.Elements elements12 = document3.getElementsByAttributeValueStarting("<html>\n <head></head>\n <body>\n </body>\n</html>", "<html> <head></head> <body> </body> </html>");
        org.jsoup.select.Elements elements15 = document3.getElementsByAttributeValueMatching("<html> <head></head> <body> </body> </html>", "hi!");
        org.jsoup.nodes.Element element17 = document3.addClass("html");
        org.jsoup.nodes.Element element19 = element17.val("<html>\n <head></head>\n <body></body>\n</html>&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;");
        org.jsoup.nodes.Element element20 = element19.parent();
        org.jsoup.nodes.Element element22 = element19.prependText("<html>\n <head></head>\n <body></body>\n</html>");
        java.util.regex.Pattern pattern24 = null;
        org.jsoup.select.Elements elements25 = element22.getElementsByAttributeValueMatching("<head></head>\n<body></body>", pattern24);
        org.jsoup.nodes.Element element27 = element22.appendText("<html>\n <head>\n  <title>&lt;html&gt;\n &lt;head&gt;&lt;/head&gt;\n &lt;body&gt;&lt;/body&gt;\n&lt;/html&gt;</title>\n </head>\n <body></body>\n</html>");
        org.jsoup.nodes.Element element29 = element22.prepend("head");
        org.jsoup.nodes.Element element30 = element22.firstElementSibling();
        org.jsoup.nodes.Node node31 = element22.nextSibling();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str5, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str6, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertNotNull(elements25);
        org.junit.Assert.assertNotNull(element27);
        org.junit.Assert.assertNotNull(element29);
        org.junit.Assert.assertNotNull(element30);
        org.junit.Assert.assertNotNull(node31);
    }

    @Test
    public void test3850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3850");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.nodes.Element element5 = document1.body();
        java.lang.String str6 = element5.html();
        org.jsoup.nodes.Element element8 = element5.appendText("<html>\n <head></head>\n <body></body>\n</html>&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;<<html> <head></head> <body> </body> </html>></<html> <head></head> <body> </body> </html>>");
        org.jsoup.nodes.Element element10 = element8.append(" html");
        java.lang.String str12 = element10.absUrl("<#root value=\"\" #root=\"&lt;html&gt;\n &lt;head&gt;&lt;/head&gt;\n &lt;body&gt;&lt;/body&gt;\n&lt;/html&gt;\" class=\"\">\n <html>\n  <head></head>\n  <body></body>\n </html><<html>\n <head></head>\n <body>\n </body>\n</html>></<html>\n <head></head>\n <body>\n </body>\n</html>>\n</#root>");
        element10.setBaseUri("<html>\n <head></head>\n <body>\n  &lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt;&lt;/body&gt; &lt;/html&gt;&amp;lt;html&amp;gt; &amp;lt;head&amp;gt;&amp;lt;/head&amp;gt; &amp;lt;body&amp;gt; &amp;lt;/body&amp;gt; &amp;lt;/html&amp;gt;&lt;&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;&gt;&lt;/&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;&gt;\n </body>\n</html>");
        org.jsoup.nodes.Document document16 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element18 = document16.text("");
        org.jsoup.nodes.Element element20 = document16.append("<html>\n <head></head>\n <body>\n </body>\n</html>");
        org.jsoup.nodes.Element element21 = document16.empty();
        org.jsoup.nodes.Element element23 = element21.append("<html> <head></head> <body></body> </html>");
        org.jsoup.select.Elements elements25 = element23.getElementsByIndexLessThan(2);
        boolean boolean26 = element10.equals((java.lang.Object) 2);
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(document16);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertNotNull(elements25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test3851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3851");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        java.lang.String str3 = document1.absUrl("<html> <head></head> <body> </body> </html>");
        org.jsoup.select.Elements elements5 = document1.getElementsContainingOwnText("<html>\n <head></head>\n <body></body>\n</html>&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;");
        org.jsoup.nodes.Element element6 = document1.head();
        org.jsoup.nodes.Element element8 = document1.addClass("<html>\n <head>\n  <title>&lt;html&gt;\n &lt;head&gt;&lt;/head&gt;\n &lt;body&gt;&lt;/body&gt;\n&lt;/html&gt;</title>\n </head>\n <body></body>\n</html>");
        java.lang.String str9 = document1.html();
        java.lang.Class<?> wildcardClass10 = document1.getClass();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str9, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test3852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3852");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.select.Elements elements6 = document3.getElementsByIndexLessThan((int) (short) 10);
        org.jsoup.nodes.Element element8 = document3.val("");
        org.jsoup.nodes.Element element10 = element8.val("hi!");
        org.jsoup.nodes.Element element12 = element10.prependText("");
        org.jsoup.nodes.Element element14 = element10.prepend("<html>\n <head></head>\n <body></body>\n</html>&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;<<html> <head></head> <body> </body> </html>></<html> <head></head> <body> </body> </html>>");
        org.jsoup.select.Elements elements15 = element14.siblingElements();
        boolean boolean17 = element14.hasClass("<#root value=\"&lt;html&gt;\n &lt;head&gt;&lt;/head&gt;\n &lt;body&gt;&lt;/body&gt;\n&lt;/html&gt;\">\n <html>\n  <head></head>\n  <body></body>\n </html>\n</#root>#root\n<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.nodes.Element element18 = element14.firstElementSibling();
        org.jsoup.select.Elements elements21 = element18.getElementsByAttributeValueContaining("<html>\n <head></head>\n <body></body>\n</html>#root", "<html> \n <head> \n  <title>&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;</title> \n </head> \n <body> \n </body>\n</html><#root>\n <html>\n  <head></head>\n  <body></body>\n </html>\n</#root>\n<html>\n <head></head>\n <body></body>\n</html><<html>\n <head>\n  <title>&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;</title>\n </head>\n <body></body>\n</html>></<html>\n <head>\n  <title>&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;</title>\n </head>\n <body></body>\n</html>>");
        org.jsoup.select.Elements elements23 = element18.getElementsMatchingOwnText("<html>\n <head>\n  <title>&lt;html&gt;\n &lt;head&gt;&lt;/head&gt;\n &lt;body&gt;&lt;/body&gt;\n&lt;/html&gt;</title>\n </head>\n <body></body>\n</html><#root>\n <#root>\n  <html>\n   <head></head>\n   <body></body>\n  </html>\n </#root>\n <html>\n  <head></head>\n  <body></body>\n </html>\n</#root>");
        org.jsoup.nodes.Document document25 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document27 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element28 = document25.prependChild((org.jsoup.nodes.Node) document27);
        org.jsoup.select.Elements elements30 = document27.getElementsByIndexLessThan((int) (short) 10);
        org.jsoup.nodes.Element element32 = document27.val("");
        java.lang.String str33 = document27.outerHtml();
        org.jsoup.select.Elements elements35 = document27.getElementsByClass("#root");
        org.jsoup.select.Elements elements37 = document27.getElementsByIndexGreaterThan(10);
        java.lang.Integer int38 = document27.elementSiblingIndex();
        org.jsoup.select.Elements elements39 = document27.getAllElements();
        org.jsoup.parser.Tag tag40 = document27.tag();
        org.jsoup.nodes.Element element42 = document27.appendElement("<html>\n <head></head>\n <body></body>\n</html>&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;<<html> <head></head> <body> </body> </html>></<html> <head></head> <body> </body> </html>>");
        java.util.List<org.jsoup.nodes.Node> nodeList43 = document27.siblingNodes();
        org.jsoup.nodes.Element element44 = element18.appendChild((org.jsoup.nodes.Node) document27);
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNotNull(elements21);
        org.junit.Assert.assertNotNull(elements23);
        org.junit.Assert.assertNotNull(document25);
        org.junit.Assert.assertNotNull(document27);
        org.junit.Assert.assertNotNull(element28);
        org.junit.Assert.assertNotNull(elements30);
        org.junit.Assert.assertNotNull(element32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str33, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertNotNull(elements35);
        org.junit.Assert.assertNotNull(elements37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNotNull(elements39);
        org.junit.Assert.assertNotNull(tag40);
        org.junit.Assert.assertNotNull(element42);
        org.junit.Assert.assertNotNull(nodeList43);
        org.junit.Assert.assertNotNull(element44);
    }

    @Test
    public void test3853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3853");
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
        document3.title("<html> <head></head> <body> </body> </html>");
        org.jsoup.nodes.Element element18 = document3.head();
        org.jsoup.nodes.Node node19 = element18.previousSibling();
        java.util.Set<java.lang.String> strSet20 = element18.classNames();
        org.jsoup.nodes.Element element22 = element18.appendElement("<html> \n <head></head> \n <body>\n  &lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;  \n </body>\n</html>\n<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.nodes.Element element23 = element18.nextElementSibling();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str9, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertNotNull(strSet20);
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertNotNull(element23);
    }

    @Test
    public void test3854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3854");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        java.lang.String str5 = document3.nodeName();
        java.lang.String str6 = document3.val();
        org.jsoup.nodes.Element element8 = document3.after("<html>\n <head>\n  <title>&lt;html&gt;\n &lt;head&gt;&lt;/head&gt;\n &lt;body&gt;&lt;/body&gt;\n&lt;/html&gt;</title>\n </head>\n <body></body>\n</html><#root>\n <#root>\n  <html>\n   <head></head>\n   <body></body>\n  </html>\n </#root>\n <html>\n  <head></head>\n  <body></body>\n </html>\n</#root>");
        org.jsoup.nodes.Element element10 = document3.after("head");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#document" + "'", str5, "#document");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
    }

    @Test
    public void test3855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3855");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.select.Elements elements6 = document3.getElementsByIndexLessThan((int) (short) 10);
        java.util.Set<java.lang.String> strSet7 = document3.classNames();
        org.jsoup.nodes.Element element9 = document3.getElementById("hi!");
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = document3.new OutputSettings();
        org.jsoup.select.Elements elements12 = document3.getElementsMatchingText("<html>\n <head></head>\n <body></body>\n</html>&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;<<html> <head></head> <body> </body> </html>></<html> <head></head> <body> </body> </html>>");
        org.jsoup.nodes.Element element13 = document3.lastElementSibling();
        org.jsoup.nodes.Element element15 = element13.prependElement("<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertNull(element9);
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(element15);
    }

    @Test
    public void test3856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3856");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        java.lang.String str5 = document3.html();
        java.lang.String str6 = document3.html();
        document3.title("<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.select.Elements elements9 = document3.getAllElements();
        org.jsoup.nodes.Element element11 = document3.html("");
        org.jsoup.nodes.Element element14 = document3.attr("<html>\n <head></head>\n <body></body>\n</html>", " html");
        org.jsoup.select.Elements elements16 = document3.getElementsByIndexGreaterThan((int) (byte) 1);
        org.jsoup.nodes.Attributes attributes17 = document3.attributes();
        java.lang.String str18 = document3.nodeName();
        org.jsoup.nodes.Document.OutputSettings outputSettings19 = document3.outputSettings();
        org.jsoup.select.Elements elements20 = document3.children();
        java.lang.Class<?> wildcardClass21 = elements20.getClass();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str5, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str6, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(elements16);
        org.junit.Assert.assertNotNull(attributes17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "#document" + "'", str18, "#document");
        org.junit.Assert.assertNotNull(outputSettings19);
        org.junit.Assert.assertNotNull(elements20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test3857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3857");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        java.lang.String str5 = document3.html();
        java.lang.String str6 = document3.html();
        java.util.Map<java.lang.String, java.lang.String> strMap7 = document3.dataset();
        org.jsoup.nodes.Element element9 = document3.appendText("<html>\n <head></head>\n <body>\n </body>\n</html>");
        org.jsoup.nodes.Element element10 = document3.head();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str5, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str6, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(element10);
    }

    @Test
    public void test3858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3858");
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
        org.jsoup.nodes.Element element17 = document3.text("<html>\n <head>\n  <title>&lt;html&gt;\n &lt;head&gt;&lt;/head&gt;\n &lt;body&gt;&lt;/body&gt;\n&lt;/html&gt;</title>\n </head>\n <body></body>\n</html>");
        org.jsoup.nodes.Element element19 = document3.prepend("<html>\n <head>\n  <title>&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;</title>\n </head>\n <body></body>\n</html>");
        org.jsoup.nodes.Element element21 = element19.appendElement("<hi! <html>\n <head></head>\n <body></body>\n</html>=\"&lt;html&gt;\n &lt;head&gt;&lt;/head&gt;\n &lt;body&gt;\n &lt;/body&gt;\n&lt;/html&gt;\"></hi!>&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt;&lt;/body&gt; &lt;/html&gt;");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str9, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "#root" + "'", str14, "#root");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertNotNull(element21);
    }

    @Test
    public void test3859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3859");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element3 = document1.text("");
        org.jsoup.nodes.Element element5 = document1.append("<html>\n <head></head>\n <body>\n </body>\n</html>");
        org.jsoup.nodes.Element element7 = document1.text("<html>\n <head></head>\n <body>\n </body>\n</html>\n<html> \n <head></head> \n <body>  \n </body>\n</html>");
        org.jsoup.select.Elements elements10 = element7.getElementsByAttributeValue("\n<html>\n <head></head>\n <body></body>\n</html>", "<#root value=\"\" #root=\"&lt;html&gt;\n &lt;head&gt;&lt;/head&gt;\n &lt;body&gt;&lt;/body&gt;\n&lt;/html&gt;\" class=\"\">\n <html>\n  <head></head>\n  <body></body>\n </html><<html>\n <head></head>\n <body>\n </body>\n</html>></<html>\n <head></head>\n <body>\n </body>\n</html>>\n</#root>");
        org.jsoup.nodes.Node node12 = element7.removeAttr("<html>\n <head>\n  <title>#document</title>\n </head>\n <body>\n  &lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt;&lt;/body&gt; &lt;/html&gt;&amp;lt;html&amp;gt; &amp;lt;head&amp;gt;&amp;lt;/head&amp;gt; &amp;lt;body&amp;gt; &amp;lt;/body&amp;gt; &amp;lt;/html&amp;gt;\n </body>\n</html><hi!></hi!>");
        org.jsoup.nodes.Element element13 = element7.empty();
        org.jsoup.select.Elements elements16 = element13.getElementsByAttributeValueEnding("<html> <head> <title>&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt;&lt;/body&gt; &lt;/html&gt;</title> </head> <body></body> </html>", "<html> <head></head> <body> </body> </html>");
        java.lang.Integer int17 = element13.elementSiblingIndex();
        org.jsoup.nodes.Element element20 = element13.attr("<html>\n <head></head>\n <body></body>\n</html>\n<html> \n <head></head> \n <body>   \n  <html> \n   <head></head> \n   <body>  \n   </body>\n  </html>\n </body>\n</html>", "<html> <head></head> <body> </body> </html>");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(elements16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(element20);
    }

    @Test
    public void test3860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3860");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.nodes.Element element6 = element4.child((int) (short) 0);
        org.jsoup.select.Elements elements8 = element4.getElementsByAttribute(" hi!");
        org.jsoup.nodes.Element element11 = element4.attr("<html> \n <head></head> \n <body>  \n </body>\n</html>", "<html> <head></head> <body> </body> </html>");
        org.jsoup.nodes.Attributes attributes12 = element11.attributes();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(attributes12);
    }

    @Test
    public void test3861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3861");
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
        org.jsoup.select.Elements elements21 = element14.getElementsByAttributeValueContaining("<html>\n <head></head>\n <body></body>\n</html>&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;<<html> <head></head> <body> </body> </html>></<html> <head></head> <body> </body> </html>>", "#root");
        org.jsoup.select.Elements elements22 = element14.parents();
        org.jsoup.nodes.Element element24 = element14.wrap("<html>\n <head></head>\n <body></body>\n</html>&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt; <html> <head></head> <body></body> </html> <html> <head></head> <body> </body> </html>");
        java.util.List<org.jsoup.nodes.Node> nodeList25 = element14.childNodes();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(document11);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNotNull(elements21);
        org.junit.Assert.assertNotNull(elements22);
        org.junit.Assert.assertNotNull(element24);
        org.junit.Assert.assertNotNull(nodeList25);
    }

    @Test
    public void test3862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3862");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.select.Elements elements6 = document3.getElementsByIndexLessThan((int) (short) 10);
        org.jsoup.nodes.Element element8 = document3.val("");
        java.lang.String str9 = document3.outerHtml();
        org.jsoup.select.Elements elements11 = document3.getElementsByClass("#root");
        java.lang.String str12 = document3.tagName();
        java.lang.Integer int13 = document3.elementSiblingIndex();
        java.util.regex.Pattern pattern15 = null;
        org.jsoup.select.Elements elements16 = document3.getElementsByAttributeValueMatching("<html> <head></head> <body> </body> </html>", pattern15);
        org.jsoup.select.Elements elements17 = document3.siblingElements();
        org.jsoup.select.Elements elements20 = document3.getElementsByAttributeValue("hi!", "<hi! <html>\n <head></head>\n <body></body>\n</html>=\"&lt;html&gt;\n &lt;head&gt;&lt;/head&gt;\n &lt;body&gt;\n &lt;/body&gt;\n&lt;/html&gt;\"></hi!>&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt;&lt;/body&gt; &lt;/html&gt;");
        org.jsoup.nodes.Element element22 = document3.addClass("<html>\n <head></head>\n <body>\n  &lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt; &lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;\n </body>\n</html>\n<html> \n <head></head> \n <body>  \n </body>\n</html>");
        org.jsoup.select.Elements elements24 = document3.getElementsByClass("<html> \n <head> \n  <title>&lt;html&gt;\n &lt;head&gt;&lt;/head&gt;\n &lt;body&gt;&lt;/body&gt;\n&lt;/html&gt;</title> \n </head> \n <body> \n </body>\n</html>\n<html>\n <head></head>\n <body></body>\n</html>&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str9, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "#root" + "'", str12, "#root");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(elements16);
        org.junit.Assert.assertNotNull(elements17);
        org.junit.Assert.assertNotNull(elements20);
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertNotNull(elements24);
    }

    @Test
    public void test3863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3863");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.nodes.Element element5 = document1.body();
        java.lang.String str6 = element5.html();
        org.jsoup.nodes.Element element8 = element5.appendText("<html>\n <head></head>\n <body></body>\n</html>&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;<<html> <head></head> <body> </body> </html>></<html> <head></head> <body> </body> </html>>");
        org.jsoup.nodes.Element element10 = element8.append(" html");
        org.jsoup.select.Elements elements12 = element10.getElementsContainingText("<html> <head></head> <body></body> </html>&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;");
        org.jsoup.nodes.Node node13 = element10.previousSibling();
        org.jsoup.select.Elements elements14 = element10.getAllElements();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(elements14);
    }

    @Test
    public void test3864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3864");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        java.lang.String str3 = document1.absUrl("<html> <head></head> <body> </body> </html>");
        org.jsoup.select.Elements elements5 = document1.getElementsContainingOwnText("<html>\n <head></head>\n <body></body>\n</html>&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;");
        org.jsoup.nodes.Element element7 = document1.html("<html>\n <head></head>\n <body>\n </body>\n</html>");
        org.jsoup.nodes.Element element9 = element7.val("#document");
        java.util.List<org.jsoup.nodes.Node> nodeList10 = element9.childNodes();
        org.jsoup.select.Elements elements12 = element9.getElementsContainingOwnText("<#document></#document>\n<html>\n <head>\n  <title>#document</title>\n </head>\n <body>\n  &lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt;&lt;/body&gt; &lt;/html&gt;\n </body>\n</html><hi!></hi!>");
        org.jsoup.nodes.Element element14 = element9.prependElement("&lt;#root value=&quot;&quot; class=&quot;&quot;&gt; &lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt;&lt;/body&gt; &lt;/html&gt; &lt;/#root&gt;\n<html>\n <head></head>\n <body></body>\n</html>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements16 = element14.select("<html>\n <head>\n  <title>#document</title>\n </head>\n <body>\n  &lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt;&lt;/body&gt; &lt;/html&gt;\n </body>\n</html><hi!></hi!>");
            org.junit.Assert.fail("Expected exception of type org.jsoup.select.Selector.SelectorParseException; message: Could not parse query '<html>? <head>?  <title>#document</title>? </head>? <body>?  &lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt;&lt;/body&gt; &lt;/html&gt;? </body>?</html><hi!></hi!>': unexpected token at '<html>? <head>?  <title>#document</title>? </head>? <body>?  &lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt;&lt;/body&gt; &lt;/html&gt;? </body>?</html><hi!></hi!>'");
        } catch (org.jsoup.select.Selector.SelectorParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertNotNull(element14);
    }

    @Test
    public void test3865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3865");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        java.lang.String str5 = document3.html();
        java.lang.String str6 = document3.html();
        document3.title("<html>\n <head></head>\n <body></body>\n</html>");
        java.util.regex.Pattern pattern10 = null;
        org.jsoup.select.Elements elements11 = document3.getElementsByAttributeValueMatching("hi!", pattern10);
        org.jsoup.nodes.Element element13 = document3.after("");
        java.lang.String str14 = document3.val();
        java.lang.String str15 = document3.nodeName();
        org.jsoup.nodes.Element element16 = document3.body();
        org.jsoup.nodes.Element element17 = document3.parent();
        java.lang.String str19 = document3.attr("body");
        java.lang.String str20 = document3.nodeName();
        org.jsoup.select.Elements elements23 = document3.getElementsByAttributeValueEnding("&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt;&lt;/body&gt; &lt;/html&gt;&amp;lt;html&amp;gt; &amp;lt;head&amp;gt;&amp;lt;/head&amp;gt; &amp;lt;body&amp;gt; &amp;lt;/body&amp;gt; &amp;lt;/html&amp;gt;<#root>\n <html>\n  <head></head>\n  <body></body>\n </html>\n</#root>\n<html>\n <head></head>\n <body></body>\n</html>", "#root");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str5, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str6, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "#document" + "'", str15, "#document");
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "#document" + "'", str20, "#document");
        org.junit.Assert.assertNotNull(elements23);
    }

    @Test
    public void test3866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3866");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.select.Elements elements6 = document3.getElementsByIndexLessThan((int) (short) 10);
        org.jsoup.nodes.Element element8 = document3.val("");
        org.jsoup.nodes.Element element10 = document3.after("#root");
        org.jsoup.nodes.Document document11 = document3.ownerDocument();
        org.jsoup.nodes.Element element14 = document3.attr("#root", "<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.select.Elements elements16 = element14.getElementsByAttribute("<html>\n <head></head>\n <body></body>\n</html>");
        java.lang.String str18 = element14.attr("<html>\n <head></head>\n <body></body>\n</html>html");
        java.lang.String str19 = element14.data();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(document11);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(elements16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test3867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3867");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        java.lang.String str5 = document1.tagName();
        org.jsoup.nodes.Document.OutputSettings outputSettings6 = document1.new OutputSettings();
        boolean boolean7 = outputSettings6.prettyPrint();
        java.nio.charset.CharsetEncoder charsetEncoder8 = outputSettings6.encoder();
        org.jsoup.nodes.Document document10 = org.jsoup.nodes.Document.createShell("#root");
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = document10.outputSettings();
        java.nio.charset.Charset charset12 = outputSettings11.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings13 = outputSettings6.charset(charset12);
        java.nio.charset.CharsetEncoder charsetEncoder14 = outputSettings13.encoder();
        org.jsoup.nodes.Document.OutputSettings outputSettings16 = outputSettings13.prettyPrint(true);
        org.jsoup.nodes.Document document18 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document20 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element21 = document18.prependChild((org.jsoup.nodes.Node) document20);
        java.lang.String str22 = document18.tagName();
        org.jsoup.nodes.Document.OutputSettings outputSettings23 = document18.new OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings25 = outputSettings23.indentAmount(0);
        org.jsoup.nodes.Entities.EscapeMode escapeMode26 = outputSettings25.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings27 = outputSettings16.escapeMode(escapeMode26);
        java.nio.charset.Charset charset28 = outputSettings16.charset();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#root" + "'", str5, "#root");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(charsetEncoder8);
        org.junit.Assert.assertNotNull(document10);
        org.junit.Assert.assertNotNull(outputSettings11);
        org.junit.Assert.assertNotNull(charset12);
        org.junit.Assert.assertNotNull(outputSettings13);
        org.junit.Assert.assertNotNull(charsetEncoder14);
        org.junit.Assert.assertNotNull(outputSettings16);
        org.junit.Assert.assertNotNull(document18);
        org.junit.Assert.assertNotNull(document20);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "#root" + "'", str22, "#root");
        org.junit.Assert.assertNotNull(outputSettings25);
        org.junit.Assert.assertTrue("'" + escapeMode26 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode26.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings27);
        org.junit.Assert.assertNotNull(charset28);
    }

    @Test
    public void test3868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3868");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        java.lang.String str5 = document3.html();
        java.lang.String str6 = document3.html();
        document3.title("<html>\n <head></head>\n <body></body>\n</html>");
        java.util.regex.Pattern pattern10 = null;
        org.jsoup.select.Elements elements11 = document3.getElementsByAttributeValueMatching("hi!", pattern10);
        org.jsoup.nodes.Element element13 = document3.after("");
        org.jsoup.nodes.Document.OutputSettings outputSettings14 = document3.outputSettings();
        java.lang.String str15 = document3.className();
        java.lang.String str16 = document3.title();
        java.lang.String str17 = document3.nodeName();
        java.lang.String str18 = document3.tagName();
        org.jsoup.nodes.Element element20 = document3.toggleClass("<#root>\n <html>\n  <head></head>\n  <body></body>\n </html>\n</#root>\n<html>\n <head></head>\n <body></body>\n</html>");
        java.lang.String str21 = element20.baseUri();
        org.jsoup.select.Elements elements23 = element20.getElementsByClass("#document");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str5, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str6, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(outputSettings14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str16, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "#document" + "'", str17, "#document");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "#root" + "'", str18, "#root");
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(elements23);
    }

    @Test
    public void test3869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3869");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.select.Elements elements6 = document3.getElementsByIndexLessThan((int) (short) 10);
        org.jsoup.nodes.Element element8 = document3.val("");
        org.jsoup.nodes.Element element10 = document3.after("#root");
        org.jsoup.nodes.Document document11 = document3.ownerDocument();
        org.jsoup.nodes.Element element14 = document3.attr("#root", "<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.select.Elements elements16 = document3.getElementsContainingOwnText("#document");
        org.jsoup.nodes.Element element18 = document3.after("<html>\n <head></head>\n <body></body>\n</html><<html>\n <head></head>\n <body></body>\n</html>&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;<<html> <head></head> <body> </body> </html>></<html> <head></head> <body> </body> </html>>></<html>\n <head></head>\n <body></body>\n</html>&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;<<html> <head></head> <body> </body> </html>></<html> <head></head> <body> </body> </html>>>");
        org.jsoup.nodes.Element element20 = element18.html("<#root value=\"\" #root=\"&lt;html&gt;\n &lt;head&gt;&lt;/head&gt;\n &lt;body&gt;&lt;/body&gt;\n&lt;/html&gt;\" class=\"\">\n <html>\n  <head></head>\n  <body></body>\n </html>\n</#root>#root\n<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.nodes.Element element22 = element18.addClass("#document");
        java.lang.String str24 = element18.absUrl("<html>\n <head></head>\n <body>\n </body>\n</html>");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(document11);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(elements16);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
    }

    @Test
    public void test3870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3870");
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
        org.jsoup.nodes.Node node16 = document3.nextSibling();
        org.jsoup.nodes.Element element18 = document3.getElementById("<html> <head></head> <body> </body> </html>");
        org.jsoup.nodes.Document.OutputSettings outputSettings19 = document3.outputSettings();
        boolean boolean20 = outputSettings19.prettyPrint();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str5, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str6, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;<<html> <head></head> <body> </body> </html>></<html> <head></head> <body> </body> </html>>" + "'", str15, "<html>\n <head></head>\n <body></body>\n</html>&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;<<html> <head></head> <body> </body> </html>></<html> <head></head> <body> </body> </html>>");
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertNull(element18);
        org.junit.Assert.assertNotNull(outputSettings19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test3871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3871");
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
        org.jsoup.nodes.Element element17 = document3.text("<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.nodes.Document document19 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document21 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element22 = document19.prependChild((org.jsoup.nodes.Node) document21);
        java.lang.String str23 = document21.html();
        java.lang.String str24 = document21.html();
        java.util.Map<java.lang.String, java.lang.String> strMap25 = document21.dataset();
        org.jsoup.nodes.Element element27 = document21.appendElement("hi!");
        org.jsoup.nodes.Element element28 = document21.body();
        org.jsoup.nodes.Element element30 = element28.addClass("");
        org.jsoup.select.Elements elements32 = element28.getElementsByIndexEquals((int) (short) -1);
        org.jsoup.nodes.Element element33 = element17.appendChild((org.jsoup.nodes.Node) element28);
        java.lang.String str34 = element17.baseUri();
        org.jsoup.select.Elements elements36 = element17.getElementsByIndexLessThan((int) (short) 100);
        org.jsoup.nodes.Node node37 = element17.nextSibling();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str5, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str6, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;" + "'", str13, "<html>\n <head></head>\n <body></body>\n</html>&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;");
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(document19);
        org.junit.Assert.assertNotNull(document21);
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str23, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str24, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertNotNull(strMap25);
        org.junit.Assert.assertNotNull(element27);
        org.junit.Assert.assertNotNull(element28);
        org.junit.Assert.assertNotNull(element30);
        org.junit.Assert.assertNotNull(elements32);
        org.junit.Assert.assertNotNull(element33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertNotNull(elements36);
        org.junit.Assert.assertNotNull(node37);
    }

    @Test
    public void test3872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3872");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.parser.Tag tag5 = document3.tag();
        org.jsoup.nodes.Element element7 = document3.prependText("hi!");
        org.jsoup.select.Elements elements8 = element7.parents();
        org.jsoup.nodes.Element element10 = element7.toggleClass("<html> <head></head> <body></body> </html>");
        org.jsoup.select.Elements elements12 = element7.getElementsByIndexLessThan((int) (short) 100);
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(tag5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(elements12);
    }

    @Test
    public void test3873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3873");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.select.Elements elements6 = document3.getElementsByIndexLessThan((int) (short) 10);
        org.jsoup.nodes.Element element8 = document3.val("");
        org.jsoup.nodes.Element element10 = document3.after("#root");
        org.jsoup.nodes.Document document11 = document3.ownerDocument();
        org.jsoup.nodes.Element element14 = document3.attr("#root", "<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.select.Elements elements16 = document3.select("#root");
        org.jsoup.nodes.Element element18 = document3.text("");
        org.jsoup.select.Elements elements21 = document3.getElementsByAttributeValueMatching("#document", "head");
        org.jsoup.nodes.Element element23 = document3.html("#document <html> <head></head> <body></body> </html>&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;");
        org.jsoup.nodes.Element element26 = document3.attr("<#root>\n <#root>\n  <html>\n   <head></head>\n   <body></body>\n  </html>\n </#root>\n <html>\n  <head></head>\n  <body></body>\n </html>\n</#root>\n<html>\n <head></head>\n <body></body>\n</html>", "<#root value=\"\" class=\"\">\n <html>\n  <head></head>\n  <body></body>\n </html>\n</#root>");
        org.jsoup.nodes.Element element28 = document3.createElement("<html> <head></head> <body> </body> </html>");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(document11);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(elements16);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNotNull(elements21);
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertNotNull(element26);
        org.junit.Assert.assertNotNull(element28);
    }

    @Test
    public void test3874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3874");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        java.lang.String str5 = document3.html();
        java.lang.String str6 = document3.html();
        java.util.Map<java.lang.String, java.lang.String> strMap7 = document3.dataset();
        org.jsoup.nodes.Element element9 = document3.appendElement("hi!");
        org.jsoup.nodes.Element element10 = document3.body();
        org.jsoup.select.Elements elements12 = document3.getElementsByIndexGreaterThan((int) (byte) 10);
        java.lang.String str13 = document3.title();
        org.jsoup.select.Elements elements15 = document3.getElementsContainingText("<#root value=\"&lt;html&gt;\n &lt;head&gt;&lt;/head&gt;\n &lt;body&gt;&lt;/body&gt;\n&lt;/html&gt;\">\n <html>\n  <head></head>\n  <body></body>\n </html>\n</#root>#root\n<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.nodes.Element element17 = document3.prependElement("<head></head>\n<body></body>");
        org.jsoup.nodes.Element element18 = document3.nextElementSibling();
        org.jsoup.nodes.Element element20 = document3.prepend("\n<body></body>");
        org.jsoup.nodes.Document document21 = document3.ownerDocument();
        org.jsoup.select.Elements elements23 = document21.getElementsContainingOwnText("<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.nodes.Document.OutputSettings outputSettings24 = document21.outputSettings();
        org.jsoup.nodes.Document document26 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document28 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element29 = document26.prependChild((org.jsoup.nodes.Node) document28);
        org.jsoup.select.Elements elements31 = document28.getElementsByIndexLessThan((int) (short) 10);
        org.jsoup.nodes.Document document33 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document35 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element36 = document33.prependChild((org.jsoup.nodes.Node) document35);
        org.jsoup.select.Elements elements38 = document35.getElementsByIndexLessThan((int) (short) 10);
        boolean boolean39 = document28.equals((java.lang.Object) (short) 10);
        org.jsoup.nodes.Node node41 = document28.removeAttr("#root");
        org.jsoup.nodes.Element element43 = document28.createElement("#root");
        org.jsoup.select.Elements elements45 = element43.getElementsContainingOwnText("<#root>\n <#root>\n  <html>\n   <head></head>\n   <body></body>\n  </html>\n </#root>\n <html>\n  <head></head>\n  <body></body>\n </html>\n</#root>\n<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.nodes.Document document47 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document49 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element50 = document47.prependChild((org.jsoup.nodes.Node) document49);
        org.jsoup.select.Elements elements52 = document49.getElementsByIndexLessThan((int) (short) 10);
        org.jsoup.nodes.Element element54 = document49.val("");
        java.lang.String str55 = document49.outerHtml();
        org.jsoup.select.Elements elements57 = document49.getElementsByClass("#root");
        org.jsoup.select.Elements elements59 = document49.getElementsByIndexGreaterThan(10);
        java.lang.Integer int60 = document49.elementSiblingIndex();
        org.jsoup.nodes.Element element62 = document49.removeClass(" html");
        org.jsoup.nodes.Element element63 = element43.appendChild((org.jsoup.nodes.Node) element62);
        org.jsoup.select.Elements elements65 = element43.getElementsByIndexLessThan((int) (byte) 10);
        org.jsoup.nodes.Element element66 = document21.prependChild((org.jsoup.nodes.Node) element43);
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str5, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str6, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertNotNull(document21);
        org.junit.Assert.assertNotNull(elements23);
        org.junit.Assert.assertNotNull(outputSettings24);
        org.junit.Assert.assertNotNull(document26);
        org.junit.Assert.assertNotNull(document28);
        org.junit.Assert.assertNotNull(element29);
        org.junit.Assert.assertNotNull(elements31);
        org.junit.Assert.assertNotNull(document33);
        org.junit.Assert.assertNotNull(document35);
        org.junit.Assert.assertNotNull(element36);
        org.junit.Assert.assertNotNull(elements38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(node41);
        org.junit.Assert.assertNotNull(element43);
        org.junit.Assert.assertNotNull(elements45);
        org.junit.Assert.assertNotNull(document47);
        org.junit.Assert.assertNotNull(document49);
        org.junit.Assert.assertNotNull(element50);
        org.junit.Assert.assertNotNull(elements52);
        org.junit.Assert.assertNotNull(element54);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str55, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertNotNull(elements57);
        org.junit.Assert.assertNotNull(elements59);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
        org.junit.Assert.assertNotNull(element62);
        org.junit.Assert.assertNotNull(element63);
        org.junit.Assert.assertNotNull(elements65);
        org.junit.Assert.assertNotNull(element66);
    }

    @Test
    public void test3875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3875");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        java.lang.String str5 = document3.html();
        java.lang.String str6 = document3.html();
        java.util.Map<java.lang.String, java.lang.String> strMap7 = document3.dataset();
        org.jsoup.nodes.Element element9 = document3.appendElement("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList10 = element9.childNodes();
        org.jsoup.nodes.Element element13 = element9.attr("<html>\n <head></head>\n <body></body>\n</html>", "<html>\n <head></head>\n <body>\n </body>\n</html>");
        org.jsoup.nodes.Element element15 = element13.prependText("hi!");
        java.lang.String str16 = element13.className();
        org.jsoup.nodes.Node node18 = element13.removeAttr("<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.nodes.Element element20 = element13.appendText(" html");
        java.lang.String str21 = element13.tagName();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str5, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str6, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
    }

    @Test
    public void test3876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3876");
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
        boolean boolean18 = document3.isBlock();
        org.jsoup.nodes.Element element20 = document3.removeClass("<html>\n <head></head>\n <body></body>\n</html><<html>\n <head></head>\n <body></body>\n</html>&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;<<html> <head></head> <body> </body> </html>></<html> <head></head> <body> </body> </html>>></<html>\n <head></head>\n <body></body>\n</html>&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;<<html> <head></head> <body> </body> </html>></<html> <head></head> <body> </body> </html>>>");
        java.lang.String str21 = document3.title();
        org.jsoup.nodes.Element element22 = document3.head();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str5, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str6, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(elements17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "#document" + "'", str21, "#document");
        org.junit.Assert.assertNotNull(element22);
    }

    @Test
    public void test3877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3877");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        java.lang.String str5 = document3.className();
        org.jsoup.nodes.Element element6 = document3.lastElementSibling();
        org.jsoup.nodes.Document document7 = document3.normalise();
        org.jsoup.select.Elements elements8 = document7.siblingElements();
        java.lang.Integer int9 = document7.siblingIndex();
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = document7.outputSettings();
        org.jsoup.select.Elements elements13 = document7.getElementsByAttributeValue("<html> <head></head> <body></body> </html>", "<html>\n <head>\n  <title>#document</title>\n </head>\n <body>\n  &lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt;&lt;/body&gt; &lt;/html&gt;&amp;lt;html&amp;gt; &amp;lt;head&amp;gt;&amp;lt;/head&amp;gt; &amp;lt;body&amp;gt; &amp;lt;/body&amp;gt; &amp;lt;/html&amp;gt;\n </body>\n</html><hi!></hi!>");
        org.jsoup.select.Elements elements15 = document7.getElementsByIndexGreaterThan((int) (short) 1);
        org.jsoup.nodes.Element element17 = document7.addClass("#document");
        org.jsoup.nodes.Element element19 = document7.text("hi!");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(document7);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(outputSettings10);
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(element19);
    }

    @Test
    public void test3878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3878");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.select.Elements elements6 = document3.getElementsByIndexLessThan((int) (short) 10);
        org.jsoup.nodes.Element element8 = document3.val("");
        org.jsoup.nodes.Element element10 = document3.after("#root");
        org.jsoup.select.Elements elements13 = document3.getElementsByAttributeValue("<html>\n <head></head>\n <body>\n </body>\n</html>\n<html> \n <head></head> \n <body>  \n </body>\n</html>", " html");
        org.jsoup.nodes.Element element14 = document3.body();
        org.jsoup.nodes.Element element16 = document3.appendText("\n<#root></#root>");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(element16);
    }

    @Test
    public void test3879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3879");
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
        org.jsoup.nodes.Document document17 = document16.normalise();
        org.jsoup.nodes.Element element18 = document17.empty();
        org.jsoup.nodes.Element element19 = element18.empty();
        org.jsoup.select.Elements elements21 = element19.getElementsByIndexGreaterThan(32);
        java.lang.String str22 = element19.toString();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str5, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str6, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;<<html> <head></head> <body> </body> </html>></<html> <head></head> <body> </body> </html>>" + "'", str15, "<html>\n <head></head>\n <body></body>\n</html>&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;<<html> <head></head> <body> </body> </html>></<html> <head></head> <body> </body> </html>>");
        org.junit.Assert.assertNotNull(document16);
        org.junit.Assert.assertNotNull(document17);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertNotNull(elements21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test3880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3880");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        java.lang.String str5 = document3.html();
        java.lang.String str6 = document3.html();
        document3.title("<html>\n <head></head>\n <body></body>\n</html>");
        java.util.regex.Pattern pattern10 = null;
        org.jsoup.select.Elements elements11 = document3.getElementsByAttributeValueMatching("hi!", pattern10);
        org.jsoup.nodes.Element element13 = document3.after("");
        java.lang.String str14 = document3.id();
        java.lang.String str15 = document3.ownText();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str5, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str6, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test3881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3881");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        java.lang.String str5 = document3.html();
        java.lang.String str6 = document3.html();
        java.util.Map<java.lang.String, java.lang.String> strMap7 = document3.dataset();
        org.jsoup.nodes.Element element9 = document3.appendText("<html>\n <head></head>\n <body>\n </body>\n</html>");
        org.jsoup.nodes.Document document11 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document13 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element14 = document11.prependChild((org.jsoup.nodes.Node) document13);
        org.jsoup.select.Elements elements16 = document13.getElementsByIndexLessThan((int) (short) 10);
        org.jsoup.nodes.Element element18 = document13.val("");
        org.jsoup.nodes.Element element20 = element18.val("hi!");
        org.jsoup.select.Elements elements21 = element18.siblingElements();
        org.jsoup.nodes.Element element22 = element9.appendChild((org.jsoup.nodes.Node) element18);
        org.jsoup.nodes.Element element24 = element18.val("<html>\n <head></head>\n <body></body>\n</html>&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;<<html> <head></head> <body> </body> </html>></<html> <head></head> <body> </body> </html>>");
        org.jsoup.nodes.Document document26 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document28 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element29 = document26.prependChild((org.jsoup.nodes.Node) document28);
        org.jsoup.select.Elements elements31 = document28.getElementsByIndexLessThan((int) (short) 10);
        org.jsoup.nodes.Element element33 = document28.val("");
        java.lang.String str34 = document28.outerHtml();
        org.jsoup.select.Elements elements36 = document28.getElementsByClass("#root");
        java.lang.String str37 = document28.tagName();
        java.lang.Integer int38 = document28.elementSiblingIndex();
        java.util.regex.Pattern pattern40 = null;
        org.jsoup.select.Elements elements41 = document28.getElementsByAttributeValueMatching("<html> <head></head> <body> </body> </html>", pattern40);
        org.jsoup.nodes.Element element42 = document28.lastElementSibling();
        org.jsoup.select.Elements elements43 = element42.siblingElements();
        org.jsoup.nodes.Element element45 = element42.toggleClass("<html> <head></head> <body> </body> </html>");
        org.jsoup.select.Elements elements47 = element42.getElementsByTag("<hi! <html>\n <head></head>\n <body></body>\n</html>=\"&lt;html&gt;\n &lt;head&gt;&lt;/head&gt;\n &lt;body&gt;\n &lt;/body&gt;\n&lt;/html&gt;\"></hi!>&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt;&lt;/body&gt; &lt;/html&gt;");
        org.jsoup.select.Elements elements49 = element42.getElementsByClass("<html>\n <head></head>\n <body>\n </body>\n</html>");
        element24.replaceWith((org.jsoup.nodes.Node) element42);
        org.jsoup.nodes.Element element52 = element42.toggleClass("#document <html> <head></head> <body></body> </html>");
        org.jsoup.select.Elements elements54 = element52.getElementsByAttribute("<#root value=\"\" #root=\"&lt;html&gt;\n &lt;head&gt;&lt;/head&gt;\n &lt;body&gt;&lt;/body&gt;\n&lt;/html&gt;\" class=\"\">\n <html>\n  <head></head>\n  <body></body>\n </html><<html>\n <head></head>\n <body>\n </body>\n</html>></<html>\n <head></head>\n <body>\n </body>\n</html>>\n</#root>");
        org.jsoup.nodes.Element element55 = element52.nextElementSibling();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str5, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str6, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(document11);
        org.junit.Assert.assertNotNull(document13);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(elements16);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertNotNull(elements21);
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertNotNull(element24);
        org.junit.Assert.assertNotNull(document26);
        org.junit.Assert.assertNotNull(document28);
        org.junit.Assert.assertNotNull(element29);
        org.junit.Assert.assertNotNull(elements31);
        org.junit.Assert.assertNotNull(element33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str34, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertNotNull(elements36);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "#root" + "'", str37, "#root");
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNotNull(elements41);
        org.junit.Assert.assertNotNull(element42);
        org.junit.Assert.assertNotNull(elements43);
        org.junit.Assert.assertNotNull(element45);
        org.junit.Assert.assertNotNull(elements47);
        org.junit.Assert.assertNotNull(elements49);
        org.junit.Assert.assertNotNull(element52);
        org.junit.Assert.assertNotNull(elements54);
        org.junit.Assert.assertNull(element55);
    }

    @Test
    public void test3882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3882");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        java.lang.String str5 = document3.html();
        java.lang.String str6 = document3.html();
        java.util.Map<java.lang.String, java.lang.String> strMap7 = document3.dataset();
        org.jsoup.nodes.Element element9 = document3.appendText("<html>\n <head></head>\n <body>\n </body>\n</html>");
        org.jsoup.select.Elements elements12 = document3.getElementsByAttributeValueStarting("<html>\n <head></head>\n <body>\n </body>\n</html>", "<html> <head></head> <body> </body> </html>");
        org.jsoup.select.Elements elements15 = document3.getElementsByAttributeValueMatching("<html> <head></head> <body> </body> </html>", "hi!");
        org.jsoup.select.Elements elements17 = document3.getElementsByTag("hi!");
        org.jsoup.select.Elements elements18 = document3.getAllElements();
        org.jsoup.nodes.Element element20 = document3.createElement("<html>\n <head>\n  <title>&lt;html&gt;\n &lt;head&gt;&lt;/head&gt;\n &lt;body&gt;&lt;/body&gt;\n&lt;/html&gt;</title>\n </head>\n <body></body>\n</html>");
        org.jsoup.nodes.Document.OutputSettings outputSettings21 = document3.new OutputSettings();
        java.lang.String str22 = document3.tagName();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str5, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str6, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertNotNull(elements17);
        org.junit.Assert.assertNotNull(elements18);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "#root" + "'", str22, "#root");
    }

    @Test
    public void test3883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3883");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.select.Elements elements6 = document3.getElementsByIndexLessThan((int) (short) 10);
        org.jsoup.nodes.Element element8 = document3.val("");
        org.jsoup.nodes.Element element10 = element8.val("hi!");
        org.jsoup.select.Elements elements12 = element10.getElementsByTag("<#root value=\"\" #root=\"&lt;html&gt;\n &lt;head&gt;&lt;/head&gt;\n &lt;body&gt;&lt;/body&gt;\n&lt;/html&gt;\" class=\"\">\n <html>\n  <head></head>\n  <body></body>\n </html><<html>\n <head></head>\n <body>\n </body>\n</html>></<html>\n <head></head>\n <body>\n </body>\n</html>>\n</#root>");
        org.jsoup.nodes.Element element13 = element10.nextElementSibling();
        org.jsoup.select.Elements elements15 = element10.getElementsContainingOwnText("&lt;#root value=&quot;&quot; class=&quot;&quot;&gt; &lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt;&lt;/body&gt; &lt;/html&gt; &lt;/#root&gt;\n<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(elements15);
    }

    @Test
    public void test3884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3884");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.select.Elements elements6 = document3.getElementsByIndexLessThan((int) (short) 10);
        org.jsoup.nodes.Document document8 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document10 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element11 = document8.prependChild((org.jsoup.nodes.Node) document10);
        org.jsoup.select.Elements elements13 = document10.getElementsByIndexLessThan((int) (short) 10);
        boolean boolean14 = document3.equals((java.lang.Object) (short) 10);
        org.jsoup.nodes.Node node15 = document3.nextSibling();
        org.jsoup.select.Elements elements17 = document3.getElementsContainingText("<html>\n <head></head>\n <body></body>\n</html>&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;");
        org.jsoup.nodes.Element element19 = document3.prependElement("<html> <head></head> <body> </body> </html>");
        org.jsoup.nodes.Document document20 = document3.normalise();
        org.jsoup.select.Elements elements22 = document20.getElementsByIndexLessThan((int) (byte) 100);
        org.jsoup.nodes.Element element24 = document20.appendText(" hi!");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(document8);
        org.junit.Assert.assertNotNull(document10);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNotNull(elements17);
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertNotNull(document20);
        org.junit.Assert.assertNotNull(elements22);
        org.junit.Assert.assertNotNull(element24);
    }

    @Test
    public void test3885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3885");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        java.lang.String str5 = document3.html();
        boolean boolean6 = document3.hasText();
        org.jsoup.nodes.Element element8 = document3.prependText("<html>\n <head></head>\n <body>\n </body>\n</html>");
        org.jsoup.nodes.Element element10 = element8.getElementById("<html> <head></head> <body> </body> </html>");
        org.jsoup.select.Elements elements13 = element8.getElementsByAttributeValue("\n<body>\n <#root>\n  <html>\n   <head></head>\n   <body></body>\n  </html>\n </#root>&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt;&lt;/body&gt; &lt;/html&gt;\n <html> \n  <head></head> \n  <body>  \n  </body>\n </html>\n</body>", "\n<body>\n &lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt;&lt;/body&gt; &lt;/html&gt;\n</body>");
        java.util.regex.Pattern pattern15 = null;
        org.jsoup.select.Elements elements16 = element8.getElementsByAttributeValueMatching("\n<body></body>", pattern15);
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str5, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNull(element10);
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertNotNull(elements16);
    }

    @Test
    public void test3886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3886");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element2 = document1.body();
        org.jsoup.nodes.Element element3 = document1.head();
        org.jsoup.nodes.Document document5 = new org.jsoup.nodes.Document("hi!");
        java.lang.String str6 = document5.tagName();
        org.jsoup.nodes.Element element8 = document5.prependElement("<html>\n <head></head>\n <body></body>\n</html>&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;<<html> <head></head> <body> </body> </html>></<html> <head></head> <body> </body> </html>>");
        org.jsoup.select.Elements elements11 = document5.getElementsByAttributeValueEnding("\n<body></body>", " html");
        org.jsoup.nodes.Element element12 = document1.prependChild((org.jsoup.nodes.Node) document5);
        org.jsoup.nodes.Document document13 = document5.normalise();
        org.jsoup.nodes.Element element15 = document13.html("#document");
        org.jsoup.nodes.Attributes attributes16 = document13.attributes();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(element2);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "#root" + "'", str6, "#root");
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(document13);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(attributes16);
    }

    @Test
    public void test3887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3887");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("#root");
        org.jsoup.nodes.Document.OutputSettings outputSettings2 = document1.outputSettings();
        org.jsoup.nodes.Element element4 = document1.removeClass("hi!");
        java.lang.String str5 = document1.nodeName();
        org.jsoup.nodes.Element element7 = document1.prependText("&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt;&lt;/body&gt; &lt;/html&gt;&amp;lt;html&amp;gt; &amp;lt;head&amp;gt;&amp;lt;/head&amp;gt; &amp;lt;body&amp;gt; &amp;lt;/body&amp;gt; &amp;lt;/html&amp;gt;<#root>\n <html>\n  <head></head>\n  <body></body>\n </html>\n</#root>\n<html>\n <head></head>\n <body></body>\n</html>");
        java.lang.Integer int8 = document1.elementSiblingIndex();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(outputSettings2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#document" + "'", str5, "#document");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test3888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3888");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.select.Elements elements6 = document3.getElementsByIndexLessThan((int) (short) 10);
        org.jsoup.nodes.Element element8 = document3.val("");
        org.jsoup.nodes.Element element10 = element8.val("hi!");
        org.jsoup.select.Elements elements11 = element8.siblingElements();
        org.jsoup.nodes.Element element13 = element8.prepend("");
        boolean boolean15 = element13.hasClass("<html>\n <head></head>\n <body>\n </body>\n</html>");
        java.util.List<org.jsoup.nodes.Node> nodeList16 = element13.childNodes();
        org.jsoup.nodes.Element element18 = element13.append("<#root value=\"\" #root=\"&lt;html&gt;\n &lt;head&gt;&lt;/head&gt;\n &lt;body&gt;&lt;/body&gt;\n&lt;/html&gt;\" class=\"\">\n <html>\n  <head></head>\n  <body></body>\n </html><<html>\n <head></head>\n <body>\n </body>\n</html>></<html>\n <head></head>\n <body>\n </body>\n</html>>\n</#root>");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(nodeList16);
        org.junit.Assert.assertNotNull(element18);
    }

    @Test
    public void test3889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3889");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        java.lang.String str5 = document1.tagName();
        org.jsoup.nodes.Document.OutputSettings outputSettings6 = document1.new OutputSettings();
        boolean boolean7 = outputSettings6.prettyPrint();
        java.nio.charset.CharsetEncoder charsetEncoder8 = outputSettings6.encoder();
        org.jsoup.nodes.Document document10 = org.jsoup.nodes.Document.createShell("#root");
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = document10.outputSettings();
        java.nio.charset.Charset charset12 = outputSettings11.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings13 = outputSettings6.charset(charset12);
        java.nio.charset.CharsetEncoder charsetEncoder14 = outputSettings13.encoder();
        org.jsoup.nodes.Document.OutputSettings outputSettings16 = outputSettings13.prettyPrint(true);
        org.jsoup.nodes.Document document18 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document20 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element21 = document18.prependChild((org.jsoup.nodes.Node) document20);
        java.lang.String str22 = document18.tagName();
        org.jsoup.nodes.Document.OutputSettings outputSettings23 = document18.new OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings25 = outputSettings23.indentAmount(0);
        org.jsoup.nodes.Entities.EscapeMode escapeMode26 = outputSettings25.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings27 = outputSettings16.escapeMode(escapeMode26);
        java.nio.charset.Charset charset28 = outputSettings27.charset();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#root" + "'", str5, "#root");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(charsetEncoder8);
        org.junit.Assert.assertNotNull(document10);
        org.junit.Assert.assertNotNull(outputSettings11);
        org.junit.Assert.assertNotNull(charset12);
        org.junit.Assert.assertNotNull(outputSettings13);
        org.junit.Assert.assertNotNull(charsetEncoder14);
        org.junit.Assert.assertNotNull(outputSettings16);
        org.junit.Assert.assertNotNull(document18);
        org.junit.Assert.assertNotNull(document20);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "#root" + "'", str22, "#root");
        org.junit.Assert.assertNotNull(outputSettings25);
        org.junit.Assert.assertTrue("'" + escapeMode26 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode26.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings27);
        org.junit.Assert.assertNotNull(charset28);
    }

    @Test
    public void test3890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3890");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.select.Elements elements6 = document3.getElementsByIndexLessThan((int) (short) 10);
        org.jsoup.nodes.Element element8 = document3.val("");
        org.jsoup.nodes.Element element10 = document3.after("#root");
        org.jsoup.nodes.Document document11 = document3.ownerDocument();
        org.jsoup.nodes.Element element14 = document3.attr("#root", "<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.select.Elements elements16 = document3.select("#root");
        org.jsoup.nodes.Element element18 = document3.text("");
        org.jsoup.select.Elements elements21 = document3.getElementsByAttributeValueMatching("#document", "head");
        java.lang.String str22 = document3.id();
        org.jsoup.nodes.Element element24 = document3.removeClass("\n<body>\n <#root>\n  <html>\n   <head></head>\n   <body></body>\n  </html>\n </#root>&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt;&lt;/body&gt; &lt;/html&gt;\n <html> \n  <head></head> \n  <body>  \n  </body>\n </html>\n</body>");
        document3.title("<html>\n <head></head>\n <body></body>\n</html>&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;\n<html> \n <head></head> \n <body> &lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt; \n  <html> \n   <head></head> \n   <body>  \n    <html> \n     <head></head> \n     <body>  \n     </body>\n    </html>\n   </body>\n  </html>\n </body>\n</html>");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(document11);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(elements16);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNotNull(elements21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(element24);
    }

    @Test
    public void test3891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3891");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.select.Elements elements6 = document3.getElementsByIndexLessThan((int) (short) 10);
        org.jsoup.nodes.Element element8 = document3.val("");
        org.jsoup.nodes.Element element10 = element8.val("hi!");
        org.jsoup.nodes.Attributes attributes11 = element8.attributes();
        org.jsoup.nodes.Element element12 = element8.previousElementSibling();
        org.jsoup.nodes.Document document13 = element8.ownerDocument();
        org.jsoup.select.Elements elements16 = document13.getElementsByAttributeValueMatching("<html>\n <head></head>\n <body></body>\n</html>&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;", "hi!");
        java.lang.String str17 = document13.outerHtml();
        org.jsoup.nodes.Node node19 = document13.removeAttr("body");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(attributes11);
        org.junit.Assert.assertNull(element12);
        org.junit.Assert.assertNotNull(document13);
        org.junit.Assert.assertNotNull(elements16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str17, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertNotNull(node19);
    }

    @Test
    public void test3892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3892");
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
        org.jsoup.nodes.Element element17 = document3.text("<html>\n <head>\n  <title>&lt;html&gt;\n &lt;head&gt;&lt;/head&gt;\n &lt;body&gt;&lt;/body&gt;\n&lt;/html&gt;</title>\n </head>\n <body></body>\n</html>");
        org.jsoup.nodes.Element element19 = document3.prependElement("<head></head>\n<body></body>");
        org.jsoup.nodes.Node node21 = element19.removeAttr("<html> <head></head> <body> </body> </html>");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str9, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "#root" + "'", str14, "#root");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertNotNull(node21);
    }

    @Test
    public void test3893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3893");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.select.Elements elements6 = document3.getElementsByIndexLessThan((int) (short) 10);
        org.jsoup.nodes.Element element8 = document3.val("");
        java.lang.String str9 = document3.outerHtml();
        org.jsoup.select.Elements elements12 = document3.getElementsByAttributeValueStarting("#root", "<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.select.Elements elements13 = document3.parents();
        boolean boolean14 = document3.hasText();
        org.jsoup.nodes.Document document16 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document18 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element19 = document16.prependChild((org.jsoup.nodes.Node) document18);
        org.jsoup.nodes.Element element20 = document3.appendChild((org.jsoup.nodes.Node) document16);
        org.jsoup.nodes.Element element21 = document16.nextElementSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements23 = element21.getElementsByAttributeStarting("<html>\n <head></head>\n <body></body>\n</html>&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;\n<html> \n <head></head> \n <body> &lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt; \n  <html> \n   <head></head> \n   <body>  \n    <html> \n     <head></head> \n     <body>  \n     </body>\n    </html>\n   </body>\n  </html>\n </body>\n</html>");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str9, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(document16);
        org.junit.Assert.assertNotNull(document18);
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertNull(element21);
    }

    @Test
    public void test3894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3894");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        java.lang.String str5 = document3.html();
        java.lang.String str6 = document3.html();
        document3.title("<html>\n <head></head>\n <body></body>\n</html>");
        java.util.regex.Pattern pattern10 = null;
        org.jsoup.select.Elements elements11 = document3.getElementsByAttributeValueMatching("hi!", pattern10);
        org.jsoup.nodes.Element element13 = document3.after("");
        org.jsoup.nodes.Document.OutputSettings outputSettings14 = document3.outputSettings();
        java.lang.String str15 = document3.className();
        java.lang.String str16 = document3.title();
        java.lang.String str17 = document3.nodeName();
        java.lang.String str18 = document3.tagName();
        org.jsoup.nodes.Element element20 = document3.toggleClass("<#root>\n <html>\n  <head></head>\n  <body></body>\n </html>\n</#root>\n<html>\n <head></head>\n <body></body>\n</html>");
        java.lang.String str22 = document3.absUrl("<#root>\n <#root>\n  <html>\n   <head></head>\n   <body></body>\n  </html>\n </#root>\n <html>\n  <head></head>\n  <body></body>\n </html>\n</#root>\n<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str5, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str6, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(outputSettings14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str16, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "#document" + "'", str17, "#document");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "#root" + "'", str18, "#root");
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test3895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3895");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.select.Elements elements6 = document3.getElementsByIndexLessThan((int) (short) 10);
        java.util.Set<java.lang.String> strSet7 = document3.classNames();
        org.jsoup.select.Elements elements10 = document3.getElementsByAttributeValueNot("<html> <head></head> <body> </body> </html>", "#root");
        org.jsoup.nodes.Document document11 = document3.normalise();
        org.jsoup.nodes.Element element12 = document3.body();
        java.lang.String str13 = document3.className();
        org.jsoup.nodes.Element element14 = document3.empty();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertNotNull(document11);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(element14);
    }

    @Test
    public void test3896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3896");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.nodes.Element element5 = document1.body();
        java.lang.String str6 = element5.html();
        org.jsoup.nodes.Element element8 = element5.appendText("<html>\n <head></head>\n <body></body>\n</html>&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;<<html> <head></head> <body> </body> </html>></<html> <head></head> <body> </body> </html>>");
        org.jsoup.nodes.Element element10 = element8.append(" html");
        java.util.Map<java.lang.String, java.lang.String> strMap11 = element8.dataset();
        org.jsoup.nodes.Element element14 = element8.attr("head", "<<html>\n <head></head>\n <body></body>\n</html>&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;<<html> <head></head> <body> </body> </html>></<html> <head></head> <body> </body> </html>>></<html>\n <head></head>\n <body></body>\n</html>&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;<<html> <head></head> <body> </body> </html>></<html> <head></head> <body> </body> </html>>>");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertNotNull(element14);
    }

    @Test
    public void test3897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3897");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.select.Elements elements6 = document3.getElementsByIndexLessThan((int) (short) 10);
        org.jsoup.nodes.Element element8 = document3.val("");
        org.jsoup.nodes.Element element10 = element8.val("hi!");
        org.jsoup.nodes.Element element12 = element10.prependText("");
        org.jsoup.nodes.Element element14 = element10.prepend("<html>\n <head></head>\n <body></body>\n</html>&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;<<html> <head></head> <body> </body> </html>></<html> <head></head> <body> </body> </html>>");
        org.jsoup.nodes.Element element16 = element14.addClass("hi!");
        org.jsoup.select.Elements elements19 = element14.getElementsByAttributeValueStarting("<html>\n <head>\n  <title>&lt;html&gt;\n &lt;head&gt;&lt;/head&gt;\n &lt;body&gt;&lt;/body&gt;\n&lt;/html&gt;</title>\n </head>\n <body></body>\n</html><#root>\n <#root>\n  <html>\n   <head></head>\n   <body></body>\n  </html>\n </#root>\n <html>\n  <head></head>\n  <body></body>\n </html>\n</#root>", "<#root value=\"\" class=\"\"> <html> <head></head> <body></body> </html> </#root>");
        org.jsoup.select.Elements elements21 = element14.getElementsMatchingOwnText("<<head></head>\n<body></body>></<head></head>\n<body></body>>\n<html>\n <head></head>\n <body></body>\n</html><hi!></hi!>");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(elements19);
        org.junit.Assert.assertNotNull(elements21);
    }
}

