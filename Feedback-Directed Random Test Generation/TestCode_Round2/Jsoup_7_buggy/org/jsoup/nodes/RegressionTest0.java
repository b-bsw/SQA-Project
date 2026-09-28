package org.jsoup.nodes;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

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
    public void test0001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0001");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        java.lang.Class<?> wildcardClass2 = document1.getClass();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0002");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.nodes.Element element5 = document1.body();
        java.util.regex.Pattern pattern6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements7 = document1.getElementsMatchingOwnText(pattern6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element5);
    }

    @Test
    public void test0003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0003");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        java.util.regex.Pattern pattern2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements3 = document1.getElementsMatchingText(pattern2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0004");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.select.Elements elements6 = document3.getElementsByIndexLessThan((int) (short) 10);
        org.jsoup.nodes.Element element8 = document3.val("");
        org.jsoup.nodes.Element element10 = element8.val("hi!");
        java.util.regex.Pattern pattern11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements12 = element10.getElementsMatchingText(pattern11);
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
    }

    @Test
    public void test0005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0005");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element3 = document1.text("");
        org.jsoup.nodes.Element element4 = element3.parent();
        java.util.regex.Pattern pattern5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements6 = element4.getElementsMatchingOwnText(pattern5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNull(element4);
    }

    @Test
    public void test0006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0006");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.nodes.Element element5 = document1.body();
        org.jsoup.select.Elements elements7 = document1.select("#root");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements9 = document1.getElementsByAttributeStarting("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements7);
    }

    @Test
    public void test0007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0007");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        java.lang.String str5 = document3.html();
        java.lang.String str6 = document3.html();
        java.util.Map<java.lang.String, java.lang.String> strMap7 = document3.dataset();
        org.jsoup.nodes.Element element9 = document3.appendElement("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node11 = element9.childNode((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 0");
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
    }

    @Test
    public void test0008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0008");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.select.Elements elements6 = document3.getElementsByIndexLessThan((int) (short) 10);
        org.jsoup.nodes.Element element8 = document3.val("");
        java.lang.String str9 = document3.outerHtml();
        org.jsoup.select.Elements elements11 = document3.getElementsByClass("#root");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements13 = document3.getElementsByTag("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
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
    }

    @Test
    public void test0009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0009");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.nodes.Element element5 = document1.body();
        org.jsoup.select.Elements elements7 = document1.select("#root");
        org.jsoup.nodes.Element element8 = document1.empty();
        java.util.regex.Pattern pattern9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements10 = document1.getElementsMatchingOwnText(pattern9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(element8);
    }

    @Test
    public void test0010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0010");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        java.lang.String str5 = document1.tagName();
        org.jsoup.nodes.Document.OutputSettings outputSettings6 = document1.new OutputSettings();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document.OutputSettings outputSettings8 = outputSettings6.charset("hi!");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: hi!");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#root" + "'", str5, "#root");
    }

    @Test
    public void test0011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0011");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        java.lang.String str2 = document1.tagName();
        org.jsoup.nodes.Element element4 = document1.prepend("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element7 = document1.attr("", "#root");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#root" + "'", str2, "#root");
        org.junit.Assert.assertNotNull(element4);
    }

    @Test
    public void test0012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0012");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element3 = document1.text("");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element6 = element3.attr("", "#root");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(element3);
    }

    @Test
    public void test0013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0013");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.select.Elements elements6 = document3.getElementsByIndexLessThan((int) (short) 10);
        org.jsoup.nodes.Element element8 = document3.val("");
        org.jsoup.nodes.Element element10 = element8.val("hi!");
        org.jsoup.nodes.Element element12 = element10.prependText("");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element14 = element10.child((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element12);
    }

    @Test
    public void test0014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0014");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        java.util.Set<java.lang.String> strSet5 = element4.classNames();
        java.lang.Integer int6 = element4.siblingIndex();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements8 = element4.select("<html>\n <head></head>\n <body>\n </body>\n</html>");
            org.junit.Assert.fail("Expected exception of type org.jsoup.select.Selector.SelectorParseException; message: Could not parse query '<html>? <head></head>? <body>? </body>?</html>': unexpected token at '<html>? <head></head>? <body>? </body>?</html>'");
        } catch (org.jsoup.select.Selector.SelectorParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0015");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.select.Elements elements6 = document3.getElementsByIndexLessThan((int) (short) 10);
        org.jsoup.nodes.Element element8 = document3.val("");
        org.jsoup.nodes.Element element11 = element8.attr("<html>\n <head></head>\n <body></body>\n</html>", "<html>\n <head></head>\n <body></body>\n</html>");
        java.lang.String str12 = element11.className();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test0016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0016");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        java.util.Set<java.lang.String> strSet5 = element4.classNames();
        java.lang.Integer int6 = element4.siblingIndex();
        boolean boolean8 = element4.hasAttr("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element10 = element4.child((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0017");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.select.Elements elements6 = document3.getElementsByIndexLessThan((int) (short) 10);
        java.util.Set<java.lang.String> strSet7 = document3.classNames();
        org.jsoup.nodes.Element element9 = document3.getElementById("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements11 = element9.getElementsByIndexLessThan((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertNull(element9);
    }

    @Test
    public void test0018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0018");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        java.lang.String str5 = document3.html();
        java.lang.String str6 = document3.html();
        document3.title("<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.select.Elements elements9 = document3.getAllElements();
        java.lang.Class<?> wildcardClass10 = elements9.getClass();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str5, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str6, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0019");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.select.Elements elements6 = document3.getElementsByIndexLessThan((int) (short) 10);
        org.jsoup.nodes.Document document8 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document10 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element11 = document8.prependChild((org.jsoup.nodes.Node) document10);
        org.jsoup.select.Elements elements13 = document10.getElementsByIndexLessThan((int) (short) 10);
        boolean boolean14 = document3.equals((java.lang.Object) (short) 10);
        java.lang.String str15 = document3.className();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(document8);
        org.junit.Assert.assertNotNull(document10);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test0020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0020");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.select.Elements elements6 = document3.getElementsByIndexLessThan((int) (short) 10);
        java.util.Set<java.lang.String> strSet7 = document3.classNames();
        org.jsoup.nodes.Element element10 = document3.attr("<html>\n <head></head>\n <body></body>\n</html>", "#root");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements12 = document3.select("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertNotNull(element10);
    }

    @Test
    public void test0021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0021");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        java.lang.String str5 = document3.html();
        java.lang.String str6 = document3.html();
        java.util.Map<java.lang.String, java.lang.String> strMap7 = document3.dataset();
        org.jsoup.nodes.Element element9 = document3.appendElement("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList10 = element9.childNodes();
        java.lang.String str12 = element9.attr("hi!");
        org.jsoup.select.Elements elements14 = element9.getElementsByTag("<html>\n <head></head>\n <body>\n </body>\n</html>");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str5, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str6, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(elements14);
    }

    @Test
    public void test0022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0022");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("#root");
        org.jsoup.nodes.Document.OutputSettings outputSettings2 = document1.outputSettings();
        org.jsoup.nodes.Element element4 = document1.removeClass("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements6 = element4.getElementsByAttributeStarting("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(outputSettings2);
        org.junit.Assert.assertNotNull(element4);
    }

    @Test
    public void test0023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0023");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        java.util.Set<java.lang.String> strSet5 = element4.classNames();
        // The following exception was thrown during execution in test generation
        try {
            element4.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(strSet5);
    }

    @Test
    public void test0024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0024");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("#root");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document5 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element6 = document3.prependChild((org.jsoup.nodes.Node) document5);
        org.jsoup.nodes.Element element8 = element6.child((int) (short) 0);
        java.util.Set<java.lang.String> strSet9 = element8.classNames();
        // The following exception was thrown during execution in test generation
        try {
            document1.replaceWith((org.jsoup.nodes.Node) element8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(document5);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(strSet9);
    }

    @Test
    public void test0025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0025");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.nodes.Element element5 = document1.body();
        org.jsoup.select.Elements elements7 = document1.select("#root");
        org.jsoup.nodes.Element element8 = document1.empty();
        java.lang.String str9 = document1.html();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element11 = document1.before("<html>\n <head></head>\n <body></body>\n</html>");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0026");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.nodes.Element element5 = document3.head();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element7 = document3.getElementById("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element5);
    }

    @Test
    public void test0027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0027");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.select.Elements elements6 = document3.getElementsByIndexLessThan((int) (short) 10);
        org.jsoup.nodes.Element element8 = document3.val("");
        org.jsoup.nodes.Element element10 = document3.after("#root");
        org.jsoup.nodes.Element element11 = document3.nextElementSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements14 = document3.getElementsByAttributeValueContaining("", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element11);
    }

    @Test
    public void test0028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0028");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        java.lang.String str5 = document3.html();
        java.lang.String str6 = document3.html();
        java.util.Map<java.lang.String, java.lang.String> strMap7 = document3.dataset();
        org.jsoup.nodes.Element element9 = document3.appendText("<html>\n <head></head>\n <body>\n </body>\n</html>");
        java.lang.String str10 = element9.ownText();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str5, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str6, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "<html> <head></head> <body> </body> </html>" + "'", str10, "<html> <head></head> <body> </body> </html>");
    }

    @Test
    public void test0029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0029");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element3 = document1.text("");
        java.lang.String str4 = element3.html();
        org.jsoup.select.Elements elements7 = element3.getElementsByAttributeValueNot("hi!", "#root");
        java.lang.Class<?> wildcardClass8 = element3.getClass();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<html>\n <head></head>\n <body>\n </body>\n</html>" + "'", str4, "<html>\n <head></head>\n <body>\n </body>\n</html>");
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0030");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        java.lang.String str5 = document3.html();
        java.lang.String str6 = document3.html();
        document3.title("<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.select.Elements elements9 = document3.getAllElements();
        org.jsoup.nodes.Element element11 = document3.html("");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node13 = document3.childNode((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str5, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str6, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertNotNull(element11);
    }

    @Test
    public void test0031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0031");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("#root");
        org.jsoup.nodes.Document.OutputSettings outputSettings2 = document1.outputSettings();
        org.jsoup.nodes.Element element4 = document1.removeClass("hi!");
        java.lang.String str5 = document1.nodeName();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element7 = document1.child((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(outputSettings2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#document" + "'", str5, "#document");
    }

    @Test
    public void test0032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0032");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.select.Elements elements6 = document3.getElementsByIndexLessThan((int) (short) 10);
        java.util.regex.Pattern pattern7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements8 = document3.getElementsMatchingOwnText(pattern7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(elements6);
    }

    @Test
    public void test0033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0033");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("#root");
        org.jsoup.nodes.Document.OutputSettings outputSettings2 = document1.outputSettings();
        org.jsoup.nodes.Element element4 = document1.removeClass("hi!");
        java.lang.String str5 = document1.nodeName();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements8 = document1.getElementsByAttributeValueNot("", "<html>\n <head></head>\n <body>\n </body>\n</html>");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(outputSettings2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#document" + "'", str5, "#document");
    }

    @Test
    public void test0034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0034");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.nodes.Element element5 = document1.body();
        org.jsoup.select.Elements elements7 = document1.select("#root");
        org.jsoup.nodes.Element element8 = document1.empty();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element10 = document1.after("<html> <head></head> <body> </body> </html>");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(element8);
    }

    @Test
    public void test0035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0035");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.select.Elements elements6 = document3.getElementsByIndexLessThan((int) (short) 10);
        org.jsoup.nodes.Element element8 = document3.val("");
        org.jsoup.nodes.Element element10 = document3.after("#root");
        org.jsoup.nodes.Document document11 = document3.ownerDocument();
        org.jsoup.nodes.Element element14 = document3.attr("#root", "<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.nodes.Element element16 = element14.removeClass("");
        java.lang.String str17 = element14.data();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(document11);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test0036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0036");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.select.Elements elements6 = document3.getElementsByIndexLessThan((int) (short) 10);
        org.jsoup.nodes.Element element8 = document3.val("");
        org.jsoup.nodes.Element element10 = document3.after("#root");
        org.jsoup.nodes.Document document11 = document3.ownerDocument();
        org.jsoup.nodes.Element element14 = document3.attr("#root", "<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.nodes.Element element16 = element14.removeClass("");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements18 = element16.getElementsByAttributeStarting("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
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
        org.junit.Assert.assertNotNull(element16);
    }

    @Test
    public void test0037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0037");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.select.Elements elements6 = document3.getElementsByIndexLessThan((int) (short) 10);
        org.jsoup.nodes.Element element8 = document3.val("");
        org.jsoup.nodes.Element element10 = document3.after("#root");
        java.lang.String str12 = document3.attr("<html>\n <head></head>\n <body>\n </body>\n</html>");
        org.jsoup.nodes.Element element14 = document3.appendText("#root");
        java.util.regex.Pattern pattern15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements16 = document3.getElementsMatchingText(pattern15);
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
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(element14);
    }

    @Test
    public void test0038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0038");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        java.lang.String str5 = document3.html();
        java.lang.String str6 = document3.html();
        document3.title("<html>\n <head></head>\n <body></body>\n</html>");
        java.util.regex.Pattern pattern10 = null;
        org.jsoup.select.Elements elements11 = document3.getElementsByAttributeValueMatching("hi!", pattern10);
        org.jsoup.nodes.Element element13 = document3.after("");
        org.jsoup.nodes.Attributes attributes14 = element13.attributes();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str5, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str6, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(attributes14);
    }

    @Test
    public void test0039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0039");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        java.lang.String str5 = document3.html();
        java.lang.String str6 = document3.html();
        java.util.Map<java.lang.String, java.lang.String> strMap7 = document3.dataset();
        org.jsoup.nodes.Element element9 = document3.appendElement("hi!");
        java.lang.Integer int10 = document3.siblingIndex();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str5, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str6, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0040");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.nodes.Element element5 = document1.body();
        org.jsoup.select.Elements elements7 = document1.select("#root");
        org.jsoup.nodes.Element element8 = document1.empty();
        java.util.regex.Pattern pattern9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements10 = element8.getElementsMatchingText(pattern9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(element8);
    }

    @Test
    public void test0041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0041");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element34 = element18.prependElement("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
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
    }

    @Test
    public void test0042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0042");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.select.Elements elements6 = document3.getElementsByIndexLessThan((int) (short) 10);
        org.jsoup.nodes.Element element8 = document3.val("");
        java.lang.String str9 = document3.outerHtml();
        org.jsoup.select.Elements elements11 = document3.getElementsByClass("#root");
        java.lang.String str12 = document3.tagName();
        java.lang.Integer int13 = document3.elementSiblingIndex();
        java.util.regex.Pattern pattern14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements15 = document3.getElementsMatchingText(pattern14);
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
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "#root" + "'", str12, "#root");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test0043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0043");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.nodes.Element element6 = element4.child((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element8 = element4.before("#document");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element6);
    }

    @Test
    public void test0044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0044");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.select.Elements elements6 = document3.getElementsByIndexLessThan((int) (short) 10);
        org.jsoup.nodes.Element element8 = document3.val("");
        org.jsoup.nodes.Element element10 = document3.after("#root");
        org.jsoup.nodes.Document document11 = document3.ownerDocument();
        org.jsoup.nodes.Node node12 = document11.previousSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node13 = node12.nextSibling();
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
        org.junit.Assert.assertNotNull(document11);
        org.junit.Assert.assertNull(node12);
    }

    @Test
    public void test0045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0045");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.parser.Tag tag5 = document3.tag();
        org.jsoup.nodes.Element element7 = document3.createElement("<html>\n <head></head>\n <body></body>\n</html>");
        document3.setBaseUri("");
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = document3.outputSettings();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element12 = document3.child((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(tag5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(outputSettings10);
    }

    @Test
    public void test0046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0046");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        java.lang.String str5 = document1.tagName();
        org.jsoup.nodes.Document.OutputSettings outputSettings6 = document1.new OutputSettings();
        org.jsoup.nodes.Document document7 = document1.normalise();
        java.lang.String str9 = document1.attr("<html>\n <head></head>\n <body>\n </body>\n</html>");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#root" + "'", str5, "#root");
        org.junit.Assert.assertNotNull(document7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0047");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.parser.Tag tag5 = document3.tag();
        org.jsoup.nodes.Element element7 = document3.val("");
        org.jsoup.select.Elements elements8 = element7.parents();
        org.jsoup.select.Elements elements10 = element7.getElementsMatchingText("<html>\n <head></head>\n <body>\n </body>\n</html>");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(tag5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(elements10);
    }

    @Test
    public void test0048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0048");
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
        org.jsoup.select.Elements elements25 = document3.getElementsByIndexLessThan((int) (byte) 1);
        java.util.regex.Pattern pattern26 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements27 = document3.getElementsMatchingOwnText(pattern26);
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
        org.junit.Assert.assertNotNull(document11);
        org.junit.Assert.assertNotNull(document13);
        org.junit.Assert.assertNotNull(document15);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(elements18);
        org.junit.Assert.assertNotNull(strSet19);
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertNotNull(elements25);
    }

    @Test
    public void test0049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0049");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.select.Elements elements6 = document3.getElementsByIndexLessThan((int) (short) 10);
        org.jsoup.nodes.Element element8 = document3.val("");
        org.jsoup.nodes.Element element11 = element8.attr("<html>\n <head></head>\n <body></body>\n</html>", "<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.nodes.Node node12 = element8.previousSibling();
        java.lang.String str13 = element8.baseUri();
        java.lang.Integer int14 = element8.siblingIndex();
        org.jsoup.nodes.Document document16 = org.jsoup.nodes.Document.createShell("#root");
        org.jsoup.nodes.Element element17 = document16.body();
        org.jsoup.nodes.Element element18 = element8.prependChild((org.jsoup.nodes.Node) element17);
        java.util.regex.Pattern pattern19 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements20 = element8.getElementsMatchingText(pattern19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(document16);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(element18);
    }

    @Test
    public void test0050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0050");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("#root");
        org.jsoup.nodes.Document.OutputSettings outputSettings2 = document1.outputSettings();
        org.jsoup.nodes.Element element4 = document1.removeClass("hi!");
        org.jsoup.nodes.Element element6 = document1.appendText("<html>\n <head></head>\n <body>\n </body>\n</html>");
        boolean boolean7 = document1.hasText();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(outputSettings2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0051");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        java.lang.String str5 = document3.html();
        java.lang.String str6 = document3.html();
        java.util.Map<java.lang.String, java.lang.String> strMap7 = document3.dataset();
        org.jsoup.nodes.Element element9 = document3.appendElement("hi!");
        element9.remove();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element12 = element9.appendElement("");
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
    }

    @Test
    public void test0052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0052");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.select.Elements elements6 = document3.getElementsByIndexLessThan((int) (short) 10);
        java.util.Set<java.lang.String> strSet7 = document3.classNames();
        org.jsoup.nodes.Element element9 = document3.getElementById("hi!");
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = document3.new OutputSettings();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document.OutputSettings outputSettings12 = outputSettings10.indentAmount((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must be true");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertNull(element9);
    }

    @Test
    public void test0053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0053");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("<html> <head></head> <body> </body> </html>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements3 = document1.getElementsByAttributeStarting("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0054");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.select.Elements elements6 = document3.getElementsByIndexLessThan((int) (short) 10);
        org.jsoup.nodes.Element element8 = document3.val("");
        org.jsoup.nodes.Element element10 = element8.val("hi!");
        java.lang.String str11 = element10.className();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements13 = element10.select("<html> <head></head> <body> </body> </html>");
            org.junit.Assert.fail("Expected exception of type org.jsoup.select.Selector.SelectorParseException; message: Could not parse query '<html> <head></head> <body> </body> </html>': unexpected token at '<html> <head></head> <body> </body> </html>'");
        } catch (org.jsoup.select.Selector.SelectorParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test0055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0055");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.select.Elements elements6 = document3.getElementsByIndexLessThan((int) (short) 10);
        org.jsoup.nodes.Element element8 = document3.val("");
        org.jsoup.nodes.Element element10 = element8.val("hi!");
        org.jsoup.nodes.Attributes attributes11 = element8.attributes();
        org.jsoup.nodes.Element element12 = element8.previousElementSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements13 = element12.parents();
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
        org.junit.Assert.assertNotNull(attributes11);
        org.junit.Assert.assertNull(element12);
    }

    @Test
    public void test0056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0056");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        java.lang.String str5 = document3.html();
        boolean boolean6 = document3.hasText();
        document3.setBaseUri("hi!");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str5, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0057");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("#root");
        org.jsoup.nodes.Document.OutputSettings outputSettings2 = document1.outputSettings();
        org.jsoup.nodes.Element element4 = document1.removeClass("hi!");
        java.lang.String str5 = document1.title();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(outputSettings2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test0058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0058");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element3 = document1.text("");
        org.jsoup.nodes.Element element4 = element3.parent();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element6 = element4.html("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNull(element4);
    }

    @Test
    public void test0059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0059");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        java.lang.String str5 = document3.html();
        java.lang.String str6 = document3.html();
        java.util.Map<java.lang.String, java.lang.String> strMap7 = document3.dataset();
        org.jsoup.nodes.Element element9 = document3.appendElement("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList10 = element9.childNodes();
        org.jsoup.nodes.Element element13 = element9.attr("<html>\n <head></head>\n <body></body>\n</html>", "<html>\n <head></head>\n <body>\n </body>\n</html>");
        java.lang.Integer int14 = element9.siblingIndex();
        boolean boolean15 = element9.isBlock();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str5, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str6, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0060");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        java.lang.String str5 = document1.tagName();
        org.jsoup.nodes.Document.OutputSettings outputSettings6 = document1.new OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode7 = outputSettings6.escapeMode();
        java.lang.Class<?> wildcardClass8 = escapeMode7.getClass();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#root" + "'", str5, "#root");
        org.junit.Assert.assertTrue("'" + escapeMode7 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode7.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0061");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.nodes.Element element5 = document1.body();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements7 = document1.select("<html>\n <head></head>\n <body>\n </body>\n</html>");
            org.junit.Assert.fail("Expected exception of type org.jsoup.select.Selector.SelectorParseException; message: Could not parse query '<html>? <head></head>? <body>? </body>?</html>': unexpected token at '<html>? <head></head>? <body>? </body>?</html>'");
        } catch (org.jsoup.select.Selector.SelectorParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element5);
    }

    @Test
    public void test0062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0062");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        java.lang.String str5 = document3.html();
        java.lang.String str6 = document3.html();
        java.util.Map<java.lang.String, java.lang.String> strMap7 = document3.dataset();
        org.jsoup.nodes.Element element9 = document3.appendElement("hi!");
        org.jsoup.nodes.Element element10 = document3.body();
        java.util.regex.Pattern pattern11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements12 = document3.getElementsMatchingText(pattern11);
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
        org.junit.Assert.assertNotNull(element10);
    }

    @Test
    public void test0063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0063");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element3 = document1.text("");
        org.jsoup.nodes.Element element5 = element3.getElementById("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element8 = element5.attr("<html> <head></head> <body> </body> </html>", "<html>\n <head></head>\n <body></body>\n</html>&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;<<html> <head></head> <body> </body> </html>></<html> <head></head> <body> </body> </html>>");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNull(element5);
    }

    @Test
    public void test0064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0064");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.select.Elements elements6 = document3.getElementsByIndexLessThan((int) (short) 10);
        org.jsoup.nodes.Element element8 = document3.val("");
        java.lang.String str9 = document3.outerHtml();
        org.jsoup.select.Elements elements11 = document3.getElementsByClass("#root");
        org.jsoup.select.Elements elements13 = document3.getElementsByIndexGreaterThan(10);
        org.jsoup.nodes.Element element15 = document3.text("<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.nodes.Node node16 = element15.nextSibling();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str9, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(node16);
    }

    @Test
    public void test0065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0065");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        java.util.Set<java.lang.String> strSet5 = element4.classNames();
        element4.setBaseUri("<html>\n <head></head>\n <body>\n </body>\n</html>");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(strSet5);
    }

    @Test
    public void test0066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0066");
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
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str18, "<html>\n <head></head>\n <body></body>\n</html>");
    }

    @Test
    public void test0067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0067");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        java.lang.String str5 = document3.className();
        org.jsoup.nodes.Element element6 = document3.lastElementSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements8 = document3.getElementsByTag("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(element6);
    }

    @Test
    public void test0068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0068");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        java.util.Set<java.lang.String> strSet2 = document1.classNames();
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document1.childNodes();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = document1.absUrl("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNotNull(nodeList3);
    }

    @Test
    public void test0069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0069");
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
        java.lang.String str19 = document3.data();
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
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test0070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0070");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("#root");
        org.jsoup.nodes.Document.OutputSettings outputSettings2 = document1.outputSettings();
        java.nio.charset.Charset charset3 = outputSettings2.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings5 = outputSettings2.prettyPrint(false);
        java.nio.charset.CharsetEncoder charsetEncoder6 = outputSettings5.encoder();
        boolean boolean7 = outputSettings5.prettyPrint();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(outputSettings2);
        org.junit.Assert.assertNotNull(charset3);
        org.junit.Assert.assertNotNull(outputSettings5);
        org.junit.Assert.assertNotNull(charsetEncoder6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0071");
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
        java.lang.String str16 = element15.baseUri();
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
    }

    @Test
    public void test0072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0072");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.select.Elements elements6 = document3.getElementsByIndexLessThan((int) (short) 10);
        org.jsoup.nodes.Element element8 = document3.val("");
        org.jsoup.nodes.Element element10 = document3.after("#root");
        org.jsoup.nodes.Element element11 = document3.nextElementSibling();
        org.jsoup.nodes.Element element13 = document3.val("<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.select.Elements elements14 = element13.getAllElements();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(elements14);
    }

    @Test
    public void test0073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0073");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        java.lang.String str5 = document1.tagName();
        java.util.regex.Pattern pattern6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements7 = document1.getElementsMatchingText(pattern6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#root" + "'", str5, "#root");
    }

    @Test
    public void test0074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0074");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.select.Elements elements6 = document3.getElementsByIndexLessThan((int) (short) 10);
        org.jsoup.nodes.Element element8 = document3.val("");
        org.jsoup.nodes.Element element10 = document3.after("#root");
        java.lang.String str12 = document3.attr("<html>\n <head></head>\n <body>\n </body>\n</html>");
        org.jsoup.nodes.Element element14 = document3.appendText("#root");
        java.util.regex.Pattern pattern15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements16 = document3.getElementsMatchingOwnText(pattern15);
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
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(element14);
    }

    @Test
    public void test0075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0075");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.nodes.Element element5 = document1.body();
        java.lang.String str6 = element5.html();
        org.jsoup.select.Elements elements7 = element5.parents();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(elements7);
    }

    @Test
    public void test0076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0076");
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
        org.jsoup.nodes.Node node25 = element14.removeAttr("\n<body></body>");
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
        org.junit.Assert.assertNotNull(node25);
    }

    @Test
    public void test0077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0077");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.parser.Tag tag5 = document3.tag();
        org.jsoup.nodes.Element element7 = document3.createElement("<html>\n <head></head>\n <body></body>\n</html>");
        document3.setBaseUri("");
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = document3.outputSettings();
        document3.title("<html>\n <head></head>\n <body></body>\n</html>&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(tag5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(outputSettings10);
    }

    @Test
    public void test0078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0078");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.nodes.Element element6 = element4.child((int) (short) 0);
        java.util.Set<java.lang.String> strSet7 = element6.classNames();
        org.jsoup.nodes.Document document8 = element6.ownerDocument();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node10 = element6.childNode((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertNotNull(document8);
    }

    @Test
    public void test0079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0079");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.nodes.Element element5 = document3.head();
        java.lang.Integer int6 = document3.elementSiblingIndex();
        org.jsoup.nodes.Node node7 = document3.previousSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element9 = document3.wrap("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(node7);
    }

    @Test
    public void test0080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0080");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        java.lang.String str5 = document1.tagName();
        org.jsoup.nodes.Element element6 = document1.head();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element8 = element6.child(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#root" + "'", str5, "#root");
        org.junit.Assert.assertNotNull(element6);
    }

    @Test
    public void test0081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0081");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.select.Elements elements6 = document3.getElementsByIndexLessThan((int) (short) 10);
        java.util.Set<java.lang.String> strSet7 = document3.classNames();
        org.jsoup.nodes.Element element9 = document3.getElementById("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = element9.attr("<html>\n <head></head>\n <body></body>\n</html>");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertNull(element9);
    }

    @Test
    public void test0082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0082");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        java.lang.String str5 = document3.html();
        java.lang.String str6 = document3.html();
        java.util.Map<java.lang.String, java.lang.String> strMap7 = document3.dataset();
        org.jsoup.nodes.Element element9 = document3.appendText("<html>\n <head></head>\n <body>\n </body>\n</html>");
        org.jsoup.select.Elements elements12 = document3.getElementsByAttributeValueStarting("<html>\n <head></head>\n <body>\n </body>\n</html>", "<html> <head></head> <body> </body> </html>");
        org.jsoup.nodes.Element element13 = document3.nextElementSibling();
        java.lang.String str14 = document3.ownText();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str5, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str6, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "<html> <head></head> <body> </body> </html>" + "'", str14, "<html> <head></head> <body> </body> </html>");
    }

    @Test
    public void test0083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0083");
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
        java.util.regex.Pattern pattern34 = null;
        org.jsoup.select.Elements elements35 = element32.getElementsByAttributeValueMatching("<html>\n <head></head>\n <body></body>\n</html>", pattern34);
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
        org.junit.Assert.assertNotNull(elements35);
    }

    @Test
    public void test0084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0084");
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
        java.lang.String str17 = document3.attr("#document");
        org.jsoup.nodes.Element element19 = document3.createElement(" html");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str5, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str6, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(outputSettings14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(element19);
    }

    @Test
    public void test0085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0085");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.select.Elements elements6 = document3.getElementsByIndexLessThan((int) (short) 10);
        org.jsoup.nodes.Element element8 = document3.val("");
        org.jsoup.nodes.Element element10 = document3.after("#root");
        org.jsoup.nodes.Document document11 = document3.ownerDocument();
        org.jsoup.nodes.Element element14 = document3.attr("#root", "<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.select.Elements elements15 = element14.siblingElements();
        org.jsoup.nodes.Element element17 = element14.prepend("#document");
        org.jsoup.select.Elements elements19 = element14.getElementsContainingText("<html>\n <head></head>\n <body></body>\n</html>");
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
        org.junit.Assert.assertNotNull(elements19);
    }

    @Test
    public void test0086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0086");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("#root");
        org.jsoup.nodes.Element element4 = document1.attr("hi!", "#root");
        boolean boolean6 = element4.hasAttr("hi!");
        boolean boolean8 = element4.hasAttr("<html>\n <head></head>\n <body></body>\n</html>&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;");
        org.jsoup.nodes.Document document10 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document12 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element13 = document10.prependChild((org.jsoup.nodes.Node) document12);
        java.lang.String str14 = document12.html();
        java.lang.String str15 = document12.html();
        org.jsoup.nodes.Document document17 = org.jsoup.nodes.Document.createShell("");
        java.util.Set<java.lang.String> strSet18 = document17.classNames();
        org.jsoup.nodes.Element element19 = document12.classNames(strSet18);
        org.jsoup.nodes.Element element21 = document12.removeClass("<html>\n <head></head>\n <body>\n </body>\n</html>");
        document12.setBaseUri("<html>\n <head></head>\n <body></body>\n</html>");
        java.lang.String str24 = document12.tagName();
        // The following exception was thrown during execution in test generation
        try {
            element4.replaceWith((org.jsoup.nodes.Node) document12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(document10);
        org.junit.Assert.assertNotNull(document12);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str14, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str15, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertNotNull(document17);
        org.junit.Assert.assertNotNull(strSet18);
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "#root" + "'", str24, "#root");
    }

    @Test
    public void test0087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0087");
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
        java.util.Set<java.lang.String> strSet33 = element18.classNames();
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
        org.junit.Assert.assertNotNull(strSet33);
    }

    @Test
    public void test0088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0088");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.select.Elements elements6 = document3.getElementsByIndexLessThan((int) (short) 10);
        org.jsoup.nodes.Element element8 = document3.val("");
        org.jsoup.nodes.Element element11 = element8.attr("<html>\n <head></head>\n <body></body>\n</html>", "<html>\n <head></head>\n <body></body>\n</html>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements13 = element11.getElementsByTag("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element11);
    }

    @Test
    public void test0089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0089");
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
        java.util.regex.Pattern pattern16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements17 = document3.getElementsMatchingOwnText(pattern16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
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
    }

    @Test
    public void test0090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0090");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.nodes.Element element5 = document1.body();
        org.jsoup.select.Elements elements8 = element5.getElementsByAttributeValueStarting("hi!", "hi!");
        org.jsoup.nodes.Document document10 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document12 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element13 = document10.prependChild((org.jsoup.nodes.Node) document12);
        org.jsoup.select.Elements elements15 = document12.getElementsByIndexLessThan((int) (short) 10);
        java.util.Set<java.lang.String> strSet16 = document12.classNames();
        org.jsoup.nodes.Element element18 = document12.getElementById("hi!");
        // The following exception was thrown during execution in test generation
        try {
            element5.replaceWith((org.jsoup.nodes.Node) element18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(document10);
        org.junit.Assert.assertNotNull(document12);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertNotNull(strSet16);
        org.junit.Assert.assertNull(element18);
    }

    @Test
    public void test0091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0091");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.select.Elements elements6 = document3.getElementsByIndexLessThan((int) (short) 10);
        org.jsoup.nodes.Element element7 = document3.firstElementSibling();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(element7);
    }

    @Test
    public void test0092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0092");
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
        org.jsoup.select.Elements elements16 = element9.getElementsMatchingText("<html>\n <head></head>\n <body></body>\n</html>&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str5, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str6, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(elements14);
        org.junit.Assert.assertNotNull(elements16);
    }

    @Test
    public void test0093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0093");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("#root");
        org.jsoup.nodes.Document.OutputSettings outputSettings2 = document1.outputSettings();
        org.jsoup.nodes.Element element4 = document1.removeClass("hi!");
        org.jsoup.select.Elements elements5 = document1.children();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(outputSettings2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(elements5);
    }

    @Test
    public void test0094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0094");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("#root");
        org.jsoup.nodes.Element element4 = document1.attr("hi!", "#root");
        boolean boolean6 = element4.hasAttr("hi!");
        org.jsoup.select.Elements elements9 = element4.getElementsByAttributeValueStarting("\n<body></body>", "html");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(elements9);
    }

    @Test
    public void test0095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0095");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        java.lang.String str5 = document1.tagName();
        org.jsoup.nodes.Element element6 = document1.head();
        java.util.regex.Pattern pattern7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements8 = document1.getElementsMatchingOwnText(pattern7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#root" + "'", str5, "#root");
        org.junit.Assert.assertNotNull(element6);
    }

    @Test
    public void test0096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0096");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.select.Elements elements6 = document3.getElementsByIndexLessThan((int) (short) 10);
        org.jsoup.nodes.Element element8 = document3.val("");
        org.jsoup.nodes.Element element10 = document3.after("#root");
        org.jsoup.nodes.Document document11 = document3.ownerDocument();
        org.jsoup.nodes.Node node12 = document11.previousSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element14 = document11.child(1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(document11);
        org.junit.Assert.assertNull(node12);
    }

    @Test
    public void test0097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0097");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.nodes.Element element5 = document1.body();
        org.jsoup.select.Elements elements7 = document1.select("#root");
        org.jsoup.nodes.Element element8 = document1.empty();
        java.lang.String str9 = document1.className();
        java.lang.String str10 = document1.outerHtml();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test0098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0098");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element3 = document1.text("");
        java.lang.String str4 = element3.html();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element6 = element3.after("#document");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<html>\n <head></head>\n <body>\n </body>\n</html>" + "'", str4, "<html>\n <head></head>\n <body>\n </body>\n</html>");
    }

    @Test
    public void test0099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0099");
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
        org.jsoup.select.Elements elements18 = document3.getElementsMatchingOwnText("<html> <head></head> <body> </body> </html>");
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
        org.junit.Assert.assertNotNull(elements18);
    }

    @Test
    public void test0100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0100");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.select.Elements elements6 = document3.getElementsByIndexLessThan((int) (short) 10);
        org.jsoup.nodes.Element element8 = document3.val("");
        org.jsoup.nodes.Element element10 = element8.val("hi!");
        org.jsoup.nodes.Element element12 = element10.prependText("");
        boolean boolean14 = element10.hasClass("<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0101");
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
        java.util.Map<java.lang.String, java.lang.String> strMap19 = element14.dataset();
        java.lang.String str21 = element14.absUrl("<html>\n <head></head>\n <body></body>\n</html>&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;");
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
        org.junit.Assert.assertNotNull(strMap19);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test0102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0102");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        java.lang.String str5 = document1.tagName();
        org.jsoup.nodes.Document.OutputSettings outputSettings6 = document1.new OutputSettings();
        boolean boolean7 = outputSettings6.prettyPrint();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document.OutputSettings outputSettings9 = outputSettings6.charset("&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt;&lt;/body&gt; &lt;/html&gt;&amp;lt;html&amp;gt; &amp;lt;head&amp;gt;&amp;lt;/head&amp;gt; &amp;lt;body&amp;gt; &amp;lt;/body&amp;gt; &amp;lt;/html&amp;gt;<#root>\n <html>\n  <head></head>\n  <body></body>\n </html>\n</#root>\n<html>\n <head></head>\n <body></body>\n</html>");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: &lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt;&lt;/body&gt; &lt;/html&gt;&amp;lt;html&amp;gt; &amp;lt;head&amp;gt;&amp;lt;/head&amp;gt; &amp;lt;body&amp;gt; &amp;lt;/body&amp;gt; &amp;lt;/html&amp;gt;<#root>? <html>?  <head></head>?  <body></body>? </html>?</#root>?<html>? <head></head>? <body></body>?</html>");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#root" + "'", str5, "#root");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0103");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("#root");
        org.jsoup.nodes.Document.OutputSettings outputSettings2 = document1.outputSettings();
        org.jsoup.nodes.Element element4 = document1.removeClass("hi!");
        org.jsoup.nodes.Element element6 = document1.appendText("<html>\n <head></head>\n <body>\n </body>\n</html>");
        org.jsoup.select.Elements elements8 = document1.getElementsByAttribute("<html>\n <head></head>\n <body></body>\n</html>&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;<<html> <head></head> <body> </body> </html>></<html> <head></head> <body> </body> </html>>");
        org.jsoup.nodes.Document document10 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document12 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element13 = document10.prependChild((org.jsoup.nodes.Node) document12);
        java.lang.String str14 = document12.html();
        java.lang.String str15 = document12.html();
        java.util.Map<java.lang.String, java.lang.String> strMap16 = document12.dataset();
        org.jsoup.nodes.Element element18 = document12.appendElement("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList19 = element18.childNodes();
        org.jsoup.nodes.Element element22 = element18.attr("<html>\n <head></head>\n <body></body>\n</html>", "<html>\n <head></head>\n <body>\n </body>\n</html>");
        // The following exception was thrown during execution in test generation
        try {
            document1.replaceWith((org.jsoup.nodes.Node) element18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(outputSettings2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(document10);
        org.junit.Assert.assertNotNull(document12);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str14, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str15, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertNotNull(strMap16);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNotNull(nodeList19);
        org.junit.Assert.assertNotNull(element22);
    }

    @Test
    public void test0104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0104");
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
        org.jsoup.nodes.Node node19 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element20 = element13.prependChild(node19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
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
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(node18);
    }

    @Test
    public void test0105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0105");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node19 = document15.childNode((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 3");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(document15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test0106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0106");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.select.Elements elements6 = document3.getElementsByIndexLessThan((int) (short) 10);
        org.jsoup.nodes.Element element8 = document3.val("");
        java.lang.String str9 = document3.outerHtml();
        org.jsoup.select.Elements elements12 = document3.getElementsByAttributeValueStarting("#root", "<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.select.Elements elements13 = document3.parents();
        org.jsoup.select.Elements elements15 = document3.getElementsByIndexGreaterThan((int) '4');
        java.lang.Integer int16 = document3.elementSiblingIndex();
        org.jsoup.select.Elements elements18 = document3.getElementsMatchingText("<html>\n <head>\n  <title>&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;</title>\n </head>\n <body></body>\n</html>");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str9, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(elements18);
    }

    @Test
    public void test0107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0107");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("<html> <head></head> <body> </body> </html>");
        document1.title("<html>\n <head></head>\n <body>\n </body>\n</html>\n<html> \n <head></head> \n <body>  \n </body>\n</html>");
        org.junit.Assert.assertNotNull(document1);
    }

    @Test
    public void test0108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0108");
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
        org.jsoup.nodes.Node node19 = element17.removeAttr("hi!");
        org.jsoup.nodes.Node node20 = node19.previousSibling();
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
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNull(node20);
    }

    @Test
    public void test0109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0109");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.select.Elements elements6 = document3.getElementsByIndexLessThan((int) (short) 10);
        org.jsoup.nodes.Element element8 = document3.val("");
        java.lang.String str9 = document3.outerHtml();
        org.jsoup.select.Elements elements11 = document3.getElementsByClass("#root");
        org.jsoup.select.Elements elements13 = document3.getElementsByIndexGreaterThan(10);
        java.lang.Integer int14 = document3.elementSiblingIndex();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = document3.absUrl("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
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
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test0110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0110");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.select.Elements elements6 = document3.getElementsByIndexLessThan((int) (short) 10);
        org.jsoup.nodes.Element element8 = document3.val("");
        java.lang.String str9 = document3.outerHtml();
        org.jsoup.select.Elements elements11 = document3.getElementsByClass("#root");
        java.lang.String str12 = document3.tagName();
        org.jsoup.nodes.Node node14 = document3.childNode(0);
        java.lang.Integer int15 = document3.siblingIndex();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str9, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "#root" + "'", str12, "#root");
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test0111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0111");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        java.lang.String str5 = document1.tagName();
        org.jsoup.nodes.Document.OutputSettings outputSettings6 = document1.new OutputSettings();
        java.lang.Integer int7 = document1.siblingIndex();
        org.jsoup.select.Elements elements9 = document1.getElementsByIndexLessThan((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element11 = document1.after("<html>\n <head></head>\n <body>\n </body>\n</html>\n<html> \n <head></head> \n <body>  \n </body>\n</html>");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
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
    public void test0112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0112");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.nodes.Element element5 = document1.body();
        org.jsoup.select.Elements elements8 = element5.getElementsByAttributeValueStarting("hi!", "hi!");
        org.jsoup.nodes.Element element10 = element5.prependText("<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.nodes.Element element12 = element5.appendElement("<html> <head></head> <body></body> </html>");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element12);
    }

    @Test
    public void test0113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0113");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.select.Elements elements6 = document3.getElementsByIndexLessThan((int) (short) 10);
        java.util.Set<java.lang.String> strSet7 = document3.classNames();
        org.jsoup.nodes.Element element9 = document3.getElementById("hi!");
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = document3.new OutputSettings();
        org.jsoup.nodes.Element element12 = document3.appendElement("hi!");
        org.jsoup.nodes.Element element13 = document3.body();
        java.util.regex.Pattern pattern14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements15 = document3.getElementsMatchingText(pattern14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertNull(element9);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(element13);
    }

    @Test
    public void test0114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0114");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        java.lang.String str5 = document3.html();
        java.lang.String str6 = document3.html();
        org.jsoup.nodes.Document document8 = org.jsoup.nodes.Document.createShell("");
        java.util.Set<java.lang.String> strSet9 = document8.classNames();
        org.jsoup.nodes.Element element10 = document3.classNames(strSet9);
        org.jsoup.nodes.Element element12 = document3.removeClass("<html>\n <head></head>\n <body>\n </body>\n</html>");
        org.jsoup.nodes.Node node13 = element12.nextSibling();
        java.util.List<org.jsoup.nodes.Node> nodeList14 = node13.childNodes();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str5, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str6, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertNotNull(document8);
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(nodeList14);
    }

    @Test
    public void test0115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0115");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        java.lang.String str5 = document3.html();
        java.lang.String str6 = document3.html();
        document3.title("<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.select.Elements elements11 = document3.getElementsByAttributeValueContaining("#root", "#root");
        java.lang.String str12 = document3.title();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str5, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str6, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str12, "<html>\n <head></head>\n <body></body>\n</html>");
    }

    @Test
    public void test0116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0116");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element23 = document3.child((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
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
    }

    @Test
    public void test0117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0117");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        java.util.regex.Pattern pattern5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements6 = element4.getElementsMatchingOwnText(pattern5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
    }

    @Test
    public void test0118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0118");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element18 = document16.child(2);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 2 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
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
    }

    @Test
    public void test0119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0119");
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
        java.lang.String str15 = element9.tagName();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str5, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str6, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(elements14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "#root" + "'", str15, "#root");
    }

    @Test
    public void test0120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0120");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        java.lang.String str5 = document3.html();
        java.lang.String str6 = document3.html();
        org.jsoup.nodes.Document document8 = org.jsoup.nodes.Document.createShell("");
        java.util.Set<java.lang.String> strSet9 = document8.classNames();
        org.jsoup.nodes.Element element10 = document3.classNames(strSet9);
        org.jsoup.nodes.Element element12 = document3.removeClass("<html>\n <head></head>\n <body>\n </body>\n</html>");
        org.jsoup.nodes.Node node13 = element12.nextSibling();
        java.lang.Integer int14 = node13.siblingIndex();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str5, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str6, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertNotNull(document8);
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test0121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0121");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.select.Elements elements6 = document3.getElementsByIndexLessThan((int) (short) 10);
        java.util.Set<java.lang.String> strSet7 = document3.classNames();
        org.jsoup.nodes.Element element9 = document3.getElementById("hi!");
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = document3.new OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings12 = outputSettings10.prettyPrint(true);
        int int13 = outputSettings12.indentAmount();
        java.nio.charset.CharsetEncoder charsetEncoder14 = outputSettings12.encoder();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertNull(element9);
        org.junit.Assert.assertNotNull(outputSettings12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(charsetEncoder14);
    }

    @Test
    public void test0122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0122");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("#root");
        org.jsoup.nodes.Document.OutputSettings outputSettings2 = document1.outputSettings();
        org.jsoup.nodes.Element element4 = document1.removeClass("hi!");
        org.jsoup.nodes.Element element6 = document1.appendText("<html>\n <head></head>\n <body>\n </body>\n</html>");
        org.jsoup.select.Elements elements8 = document1.getElementsByAttribute("<html>\n <head></head>\n <body></body>\n</html>&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;<<html> <head></head> <body> </body> </html>></<html> <head></head> <body> </body> </html>>");
        // The following exception was thrown during execution in test generation
        try {
            document1.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(outputSettings2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(elements8);
    }

    @Test
    public void test0123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0123");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.nodes.Element element5 = document3.head();
        org.jsoup.nodes.Document.OutputSettings outputSettings6 = document3.outputSettings();
        java.util.regex.Pattern pattern7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements8 = document3.getElementsMatchingText(pattern7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(outputSettings6);
    }

    @Test
    public void test0124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0124");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.parser.Tag tag5 = document3.tag();
        org.jsoup.nodes.Element element7 = document3.createElement("<html>\n <head></head>\n <body></body>\n</html>");
        document3.setBaseUri("");
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = document3.outputSettings();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document.OutputSettings outputSettings12 = outputSettings10.charset("");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: ");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(tag5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(outputSettings10);
    }

    @Test
    public void test0125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0125");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.parser.Tag tag5 = document3.tag();
        java.lang.String str6 = document3.data();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(tag5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test0126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0126");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.select.Elements elements6 = document3.getElementsByIndexLessThan((int) (short) 10);
        java.util.Set<java.lang.String> strSet7 = document3.classNames();
        org.jsoup.nodes.Element element10 = document3.attr("<html>\n <head></head>\n <body></body>\n</html>", "#root");
        boolean boolean12 = document3.hasAttr("<html> <head></head> <body> </body> </html>");
        java.util.List<org.jsoup.nodes.Node> nodeList13 = document3.siblingNodes();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(nodeList13);
    }

    @Test
    public void test0127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0127");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements19 = element16.getElementsByAttributeValue("", "#root");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str5, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str6, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(outputSettings14);
        org.junit.Assert.assertNotNull(element16);
    }

    @Test
    public void test0128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0128");
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
        java.lang.Class<?> wildcardClass15 = elements14.getClass();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str5, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str6, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(elements14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0129");
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
        java.lang.String str37 = element10.attr("#root");
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
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
    }

    @Test
    public void test0130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0130");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.select.Elements elements6 = document3.getElementsByIndexLessThan((int) (short) 10);
        java.util.Set<java.lang.String> strSet7 = document3.classNames();
        org.jsoup.nodes.Element element9 = document3.getElementById("hi!");
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = document3.new OutputSettings();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document.OutputSettings outputSettings12 = outputSettings10.charset("<html> <head></head> <body> </body> </html>");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: <html> <head></head> <body> </body> </html>");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertNull(element9);
    }

    @Test
    public void test0131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0131");
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
        java.util.regex.Pattern pattern22 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements23 = element21.getElementsMatchingText(pattern22);
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
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertNotNull(element21);
    }

    @Test
    public void test0132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0132");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.nodes.Element element6 = element4.child((int) (short) 0);
        java.util.Set<java.lang.String> strSet7 = element6.classNames();
        org.jsoup.nodes.Document document8 = element6.ownerDocument();
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = document8.new OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = outputSettings9.indentAmount((int) 'a');
        boolean boolean12 = outputSettings9.prettyPrint();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertNotNull(document8);
        org.junit.Assert.assertNotNull(outputSettings11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test0133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0133");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        java.lang.String str5 = document3.html();
        java.lang.String str6 = document3.html();
        java.lang.String str7 = document3.className();
        java.lang.Integer int8 = document3.siblingIndex();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str5, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str6, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0134");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element19 = element15.child((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 1");
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
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(elements17);
    }

    @Test
    public void test0135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0135");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        java.lang.String str2 = document1.tagName();
        org.jsoup.nodes.Element element4 = document1.prepend("hi!");
        org.jsoup.nodes.Attributes attributes5 = document1.attributes();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#root" + "'", str2, "#root");
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(attributes5);
    }

    @Test
    public void test0136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0136");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.select.Elements elements6 = document3.getElementsByIndexLessThan((int) (short) 10);
        org.jsoup.nodes.Element element8 = document3.addClass("<html> <head></head> <body> </body> </html>");
        java.lang.String str9 = document3.baseUri();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0137");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("#root");
        org.jsoup.nodes.Element element4 = document1.attr("hi!", "#root");
        org.jsoup.select.Elements elements5 = document1.getAllElements();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(elements5);
    }

    @Test
    public void test0138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0138");
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
        org.jsoup.nodes.Element element20 = element19.lastElementSibling();
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
        org.junit.Assert.assertNotNull(element20);
    }

    @Test
    public void test0139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0139");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        java.lang.String str5 = document1.tagName();
        org.jsoup.nodes.Document.OutputSettings outputSettings6 = document1.new OutputSettings();
        boolean boolean7 = outputSettings6.prettyPrint();
        java.nio.charset.CharsetEncoder charsetEncoder8 = outputSettings6.encoder();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document.OutputSettings outputSettings10 = outputSettings6.charset("html");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.UnsupportedCharsetException; message: html");
        } catch (java.nio.charset.UnsupportedCharsetException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#root" + "'", str5, "#root");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(charsetEncoder8);
    }

    @Test
    public void test0140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0140");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element3 = document1.text("");
        org.jsoup.nodes.Element element4 = element3.parent();
        boolean boolean5 = element3.isBlock();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNull(element4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0141");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.select.Elements elements6 = document3.getElementsByIndexLessThan((int) (short) 10);
        java.util.Set<java.lang.String> strSet7 = document3.classNames();
        org.jsoup.nodes.Element element10 = document3.attr("<html>\n <head></head>\n <body></body>\n</html>", "#root");
        java.lang.String str11 = element10.id();
        org.jsoup.nodes.Element element13 = element10.addClass("<html>\n <head></head>\n <body></body>\n</html>&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;");
        java.util.List<org.jsoup.nodes.Node> nodeList14 = element13.childNodes();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(nodeList14);
    }

    @Test
    public void test0142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0142");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        java.lang.String str5 = document3.html();
        java.lang.String str6 = document3.html();
        java.util.Map<java.lang.String, java.lang.String> strMap7 = document3.dataset();
        org.jsoup.nodes.Element element9 = document3.appendElement("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList10 = element9.childNodes();
        org.jsoup.nodes.Element element13 = element9.attr("<html>\n <head></head>\n <body></body>\n</html>", "<html>\n <head></head>\n <body>\n </body>\n</html>");
        org.jsoup.select.Elements elements15 = element13.getElementsByIndexLessThan((int) (byte) -1);
        org.jsoup.nodes.Element element17 = element13.prependText("#document");
        java.lang.String str19 = element13.absUrl("<html>\n <head>\n  <title>&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;</title>\n </head>\n <body></body>\n</html>");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str5, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str6, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test0143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0143");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.select.Elements elements6 = document3.getElementsByIndexLessThan((int) (short) 10);
        org.jsoup.nodes.Element element8 = document3.val("");
        org.jsoup.nodes.Element element10 = element8.val("hi!");
        org.jsoup.nodes.Attributes attributes11 = element8.attributes();
        org.jsoup.nodes.Element element12 = element8.previousElementSibling();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = element12.id();
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
        org.junit.Assert.assertNotNull(attributes11);
        org.junit.Assert.assertNull(element12);
    }

    @Test
    public void test0144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0144");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements27 = element18.getElementsByAttributeValueNot("", "<html>\n <head>\n  <title>&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;</title>\n </head>\n <body></body>\n</html>");
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
        org.junit.Assert.assertNotNull(document11);
        org.junit.Assert.assertNotNull(document13);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(elements16);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertNotNull(elements21);
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertNotNull(elements24);
    }

    @Test
    public void test0145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0145");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        java.lang.String str5 = document3.html();
        java.lang.String str6 = document3.html();
        org.jsoup.nodes.Document document8 = org.jsoup.nodes.Document.createShell("");
        java.util.Set<java.lang.String> strSet9 = document8.classNames();
        org.jsoup.nodes.Element element10 = document3.classNames(strSet9);
        org.jsoup.nodes.Node node12 = document3.childNode((int) (short) 0);
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str5, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str6, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertNotNull(document8);
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(node12);
    }

    @Test
    public void test0146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0146");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.nodes.Element element6 = element4.child((int) (short) 0);
        java.util.Set<java.lang.String> strSet7 = element6.classNames();
        org.jsoup.nodes.Document document8 = element6.ownerDocument();
        org.jsoup.select.Elements elements10 = element6.getElementsContainingOwnText("<html>\n <head>\n  <title>&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;</title>\n </head>\n <body></body>\n</html>");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertNotNull(document8);
        org.junit.Assert.assertNotNull(elements10);
    }

    @Test
    public void test0147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0147");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element19 = element15.child((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 1");
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
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(element17);
    }

    @Test
    public void test0148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0148");
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
        java.lang.Class<?> wildcardClass23 = outputSettings22.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0149");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.nodes.Element element6 = element4.child((int) (short) 0);
        java.util.Set<java.lang.String> strSet7 = element6.classNames();
        org.jsoup.nodes.Document document8 = element6.ownerDocument();
        org.jsoup.nodes.Element element10 = document8.append("hi!");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertNotNull(document8);
        org.junit.Assert.assertNotNull(element10);
    }

    @Test
    public void test0150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0150");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements17 = element14.getElementsByClass("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(document15);
    }

    @Test
    public void test0151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0151");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        java.lang.String str5 = document3.html();
        java.lang.String str6 = document3.html();
        java.util.Map<java.lang.String, java.lang.String> strMap7 = document3.dataset();
        org.jsoup.nodes.Element element9 = document3.appendText("<html>\n <head></head>\n <body>\n </body>\n</html>");
        org.jsoup.select.Elements elements12 = document3.getElementsByAttributeValueStarting("<html>\n <head></head>\n <body>\n </body>\n</html>", "<html> <head></head> <body> </body> </html>");
        org.jsoup.select.Elements elements15 = document3.getElementsByAttributeValueMatching("<html> <head></head> <body> </body> </html>", "hi!");
        java.lang.Class<?> wildcardClass16 = elements15.getClass();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str5, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str6, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0152");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        java.lang.String str5 = document3.html();
        java.lang.String str6 = document3.html();
        java.util.Map<java.lang.String, java.lang.String> strMap7 = document3.dataset();
        org.jsoup.nodes.Element element9 = document3.appendText("<html>\n <head></head>\n <body>\n </body>\n</html>");
        org.jsoup.select.Elements elements12 = document3.getElementsByAttributeValueStarting("<html>\n <head></head>\n <body>\n </body>\n</html>", "<html> <head></head> <body> </body> </html>");
        org.jsoup.nodes.Element element13 = document3.body();
        org.jsoup.select.Elements elements16 = element13.getElementsByAttributeValueEnding("html", "<html> <head></head> <body> </body> </html>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements19 = element13.getElementsByAttributeValueNot("#root", "");
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
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(elements16);
    }

    @Test
    public void test0153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0153");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        java.util.Set<java.lang.String> strSet5 = element4.classNames();
        java.lang.Integer int6 = element4.siblingIndex();
        boolean boolean8 = element4.hasAttr("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element10 = element4.after("<html> <head></head> <body></body> </html>");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0154");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        java.lang.String str3 = document1.absUrl("<html> <head></head> <body> </body> </html>");
        org.jsoup.select.Elements elements5 = document1.getElementsContainingOwnText("<html>\n <head></head>\n <body></body>\n</html>&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;");
        org.jsoup.nodes.Element element6 = document1.head();
        org.jsoup.nodes.Document document8 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document10 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element11 = document8.prependChild((org.jsoup.nodes.Node) document10);
        org.jsoup.select.Elements elements13 = document10.getElementsByIndexLessThan((int) (short) 10);
        org.jsoup.nodes.Element element15 = document10.val("");
        java.lang.String str16 = document10.outerHtml();
        org.jsoup.select.Elements elements18 = document10.getElementsByClass("#root");
        org.jsoup.select.Elements elements20 = document10.getElementsByIndexGreaterThan(10);
        java.lang.Integer int21 = document10.elementSiblingIndex();
        org.jsoup.select.Elements elements22 = document10.getAllElements();
        document10.remove();
        org.jsoup.nodes.Element element25 = document10.addClass("html");
        // The following exception was thrown during execution in test generation
        try {
            document1.replaceWith((org.jsoup.nodes.Node) document10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(document8);
        org.junit.Assert.assertNotNull(document10);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str16, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertNotNull(elements18);
        org.junit.Assert.assertNotNull(elements20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(elements22);
        org.junit.Assert.assertNotNull(element25);
    }

    @Test
    public void test0155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0155");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("#root");
        org.jsoup.nodes.Element element4 = document1.attr("hi!", "#root");
        boolean boolean6 = element4.hasAttr("hi!");
        boolean boolean7 = element4.hasText();
        org.jsoup.select.Elements elements8 = element4.parents();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element10 = element4.before("#document");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(elements8);
    }

    @Test
    public void test0156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0156");
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
        org.jsoup.select.Elements elements19 = document3.getElementsMatchingText("hi!");
        org.jsoup.nodes.Element element21 = document3.getElementById("hi!");
        // The following exception was thrown during execution in test generation
        try {
            element21.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertNotNull(elements19);
        org.junit.Assert.assertNull(element21);
    }

    @Test
    public void test0157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0157");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element3 = document1.text("");
        org.jsoup.nodes.Element element4 = element3.parent();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element5 = element4.lastElementSibling();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNull(element4);
    }

    @Test
    public void test0158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0158");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        java.lang.String str5 = document3.html();
        java.lang.String str6 = document3.html();
        document3.title("<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.select.Elements elements9 = document3.getAllElements();
        org.jsoup.nodes.Element element11 = document3.html("");
        org.jsoup.nodes.Element element13 = document3.appendElement("<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.nodes.Element element14 = document3.body();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node16 = document3.childNode((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
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
        org.junit.Assert.assertNull(element14);
    }

    @Test
    public void test0159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0159");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element3 = document1.text("");
        java.lang.String str4 = document1.ownText();
        document1.setBaseUri(" html");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test0160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0160");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("<html> <head></head> <body> </body> </html>");
        org.jsoup.nodes.Element element3 = document1.getElementById("<html>\n <head></head>\n <body>\n </body>\n</html>\n<html> \n <head></head> \n <body>  \n </body>\n</html>");
        org.junit.Assert.assertNull(element3);
    }

    @Test
    public void test0161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0161");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        java.lang.String str5 = document3.html();
        boolean boolean6 = document3.hasText();
        org.jsoup.nodes.Element element8 = document3.prependText("<html>\n <head></head>\n <body>\n </body>\n</html>");
        org.jsoup.select.Elements elements9 = document3.getAllElements();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str5, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(elements9);
    }

    @Test
    public void test0162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0162");
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
        java.util.regex.Pattern pattern21 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements22 = element14.getElementsMatchingOwnText(pattern21);
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
        org.junit.Assert.assertNotNull(document11);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(elements18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test0163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0163");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements21 = element19.select("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
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
    }

    @Test
    public void test0164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0164");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.select.Elements elements6 = document3.getElementsByIndexLessThan((int) (short) 10);
        org.jsoup.nodes.Element element8 = document3.val("");
        java.lang.String str9 = document3.outerHtml();
        org.jsoup.select.Elements elements11 = document3.getElementsByClass("#root");
        org.jsoup.select.Elements elements13 = document3.getElementsByIndexGreaterThan(10);
        java.lang.String str14 = document3.tagName();
        java.lang.Class<?> wildcardClass15 = document3.getClass();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str9, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "#root" + "'", str14, "#root");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0165");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("#root");
        org.jsoup.nodes.Element element4 = document1.attr("hi!", "#root");
        java.lang.String str5 = element4.tagName();
        java.lang.String str7 = element4.attr("#root");
        // The following exception was thrown during execution in test generation
        try {
            element4.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#root" + "'", str5, "#root");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0166");
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
        java.lang.Integer int24 = document3.elementSiblingIndex();
        java.lang.String str25 = document3.title();
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
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
    }

    @Test
    public void test0167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0167");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.select.Elements elements6 = document3.getElementsByIndexLessThan((int) (short) 10);
        org.jsoup.nodes.Element element8 = document3.val("");
        org.jsoup.nodes.Element element10 = document3.after("#root");
        org.jsoup.nodes.Element element11 = document3.body();
        java.lang.Integer int12 = element11.siblingIndex();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test0168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0168");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element17 = element15.prependElement("");
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
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;" + "'", str13, "<html>\n <head></head>\n <body></body>\n</html>&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;");
        org.junit.Assert.assertNotNull(element15);
    }

    @Test
    public void test0169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0169");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        java.lang.String str5 = document3.html();
        java.lang.String str6 = document3.html();
        java.util.Map<java.lang.String, java.lang.String> strMap7 = document3.dataset();
        org.jsoup.nodes.Document document9 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document11 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element12 = document9.prependChild((org.jsoup.nodes.Node) document11);
        java.lang.String str13 = document11.html();
        java.lang.String str14 = document11.html();
        java.util.Map<java.lang.String, java.lang.String> strMap15 = document11.dataset();
        org.jsoup.nodes.Element element17 = document11.appendText("<html>\n <head></head>\n <body>\n </body>\n</html>");
        org.jsoup.select.Elements elements20 = document11.getElementsByAttributeValueStarting("<html>\n <head></head>\n <body>\n </body>\n</html>", "<html> <head></head> <body> </body> </html>");
        org.jsoup.select.Elements elements23 = document11.getElementsByAttributeValueMatching("<html> <head></head> <body> </body> </html>", "hi!");
        org.jsoup.nodes.Element element25 = document11.addClass("html");
        org.jsoup.nodes.Element element27 = element25.val("<html>\n <head></head>\n <body></body>\n</html>&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;");
        org.jsoup.nodes.Element element28 = document3.prependChild((org.jsoup.nodes.Node) element27);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element30 = document3.child((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 32 out of bounds for length 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str5, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str6, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertNotNull(document9);
        org.junit.Assert.assertNotNull(document11);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str13, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str14, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertNotNull(strMap15);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(elements20);
        org.junit.Assert.assertNotNull(elements23);
        org.junit.Assert.assertNotNull(element25);
        org.junit.Assert.assertNotNull(element27);
        org.junit.Assert.assertNotNull(element28);
    }

    @Test
    public void test0170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0170");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        java.lang.String str5 = document1.tagName();
        org.jsoup.nodes.Document.OutputSettings outputSettings6 = document1.new OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode7 = outputSettings6.escapeMode();
        java.nio.charset.CharsetEncoder charsetEncoder8 = outputSettings6.encoder();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#root" + "'", str5, "#root");
        org.junit.Assert.assertTrue("'" + escapeMode7 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode7.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charsetEncoder8);
    }

    @Test
    public void test0171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0171");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element3 = document1.text("");
        java.lang.String str4 = element3.html();
        org.jsoup.select.Elements elements7 = element3.getElementsByAttributeValueNot("hi!", "#root");
        org.jsoup.select.Elements elements8 = element3.getAllElements();
        java.lang.Class<?> wildcardClass9 = element3.getClass();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<html>\n <head></head>\n <body>\n </body>\n</html>" + "'", str4, "<html>\n <head></head>\n <body>\n </body>\n</html>");
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0172");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.select.Elements elements6 = document3.getElementsByIndexLessThan((int) (short) 10);
        org.jsoup.nodes.Element element8 = document3.val("");
        org.jsoup.nodes.Element element10 = document3.after("#root");
        org.jsoup.nodes.Document document11 = document3.ownerDocument();
        org.jsoup.nodes.Node node12 = document11.previousSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Attributes attributes13 = node12.attributes();
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
        org.junit.Assert.assertNotNull(document11);
        org.junit.Assert.assertNull(node12);
    }

    @Test
    public void test0173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0173");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.nodes.Element element6 = element4.child((int) (short) 0);
        org.jsoup.nodes.Node node7 = element6.previousSibling();
        java.util.List<org.jsoup.nodes.Node> nodeList8 = element6.childNodes();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNotNull(nodeList8);
    }

    @Test
    public void test0174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0174");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        java.lang.String str5 = document1.tagName();
        org.jsoup.nodes.Document.OutputSettings outputSettings6 = document1.new OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = outputSettings6.indentAmount(0);
        org.jsoup.nodes.Entities.EscapeMode escapeMode9 = outputSettings8.escapeMode();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document.OutputSettings outputSettings11 = outputSettings8.charset("#document");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: #document");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#root" + "'", str5, "#root");
        org.junit.Assert.assertNotNull(outputSettings8);
        org.junit.Assert.assertTrue("'" + escapeMode9 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode9.equals(org.jsoup.nodes.Entities.EscapeMode.base));
    }

    @Test
    public void test0175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0175");
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
        org.jsoup.nodes.Element element21 = element19.append("#document");
        java.util.regex.Pattern pattern22 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements23 = element21.getElementsMatchingOwnText(pattern22);
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
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertNotNull(element21);
    }

    @Test
    public void test0176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0176");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.select.Elements elements6 = document3.getElementsByIndexLessThan((int) (short) 10);
        org.jsoup.nodes.Element element8 = document3.val("");
        java.lang.String str9 = document3.outerHtml();
        org.jsoup.select.Elements elements12 = document3.getElementsByAttributeValueStarting("#root", "<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.select.Elements elements13 = document3.parents();
        boolean boolean14 = document3.hasText();
        org.jsoup.select.Elements elements16 = document3.getElementsContainingText("<html>\n <head></head>\n <body>\n </body>\n</html>");
        org.jsoup.nodes.Element element18 = document3.wrap("<#root value=\"&lt;html&gt;\n &lt;head&gt;&lt;/head&gt;\n &lt;body&gt;&lt;/body&gt;\n&lt;/html&gt;\">\n <html>\n  <head></head>\n  <body></body>\n </html>\n</#root>#root\n<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.nodes.Element element19 = document3.head();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str9, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(elements16);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNotNull(element19);
    }

    @Test
    public void test0177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0177");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("#root");
        org.jsoup.nodes.Element element4 = document1.attr("hi!", "#root");
        java.lang.String str5 = element4.tagName();
        org.jsoup.parser.Tag tag6 = element4.tag();
        org.jsoup.nodes.Element element8 = element4.append("");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#root" + "'", str5, "#root");
        org.junit.Assert.assertNotNull(tag6);
        org.junit.Assert.assertNotNull(element8);
    }

    @Test
    public void test0178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0178");
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
        java.lang.Class<?> wildcardClass19 = elements18.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0179");
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
        org.jsoup.nodes.Element element20 = element14.getElementById("html");
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
        org.junit.Assert.assertNull(element20);
    }

    @Test
    public void test0180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0180");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("<html>\n <head></head>\n <body></body>\n</html>&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;<<html> <head></head> <body> </body> </html>></<html> <head></head> <body> </body> </html>>");
        org.jsoup.nodes.Element element3 = document1.html(" html");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element5 = element3.getElementById("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(element3);
    }

    @Test
    public void test0181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0181");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element3 = document1.text("");
        boolean boolean5 = element3.hasClass("");
        java.lang.String str6 = element3.text();
        java.lang.Class<?> wildcardClass7 = element3.getClass();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0182");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        java.lang.String str5 = document3.html();
        java.lang.String str6 = document3.html();
        java.util.Map<java.lang.String, java.lang.String> strMap7 = document3.dataset();
        org.jsoup.nodes.Element element9 = document3.appendElement("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList10 = element9.childNodes();
        org.jsoup.nodes.Element element13 = element9.attr("<html>\n <head></head>\n <body></body>\n</html>", "<html>\n <head></head>\n <body>\n </body>\n</html>");
        element9.setBaseUri("<html>\n <head></head>\n <body>\n </body>\n</html>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node17 = element9.childNode((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 32 out of bounds for length 0");
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
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertNotNull(element13);
    }

    @Test
    public void test0183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0183");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.nodes.Element element5 = document1.body();
        org.jsoup.select.Elements elements7 = element5.getElementsByIndexGreaterThan((int) (byte) -1);
        java.lang.String str8 = element5.data();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements11 = element5.getElementsByAttributeValueEnding("", "<html>\n <head></head>\n <body></body>\n</html>&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;<<html> <head></head> <body> </body> </html>></<html> <head></head> <body> </body> </html>>");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0184");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.nodes.Element element5 = document1.body();
        org.jsoup.select.Elements elements7 = document1.select("#root");
        org.jsoup.nodes.Element element8 = document1.empty();
        java.lang.String str9 = document1.html();
        org.jsoup.select.Elements elements11 = document1.getElementsByTag("#root");
        // The following exception was thrown during execution in test generation
        try {
            document1.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(elements11);
    }

    @Test
    public void test0185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0185");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        java.lang.String str5 = document3.html();
        java.lang.String str6 = document3.html();
        java.util.Map<java.lang.String, java.lang.String> strMap7 = document3.dataset();
        org.jsoup.nodes.Element element9 = document3.appendElement("hi!");
        org.jsoup.nodes.Element element10 = document3.body();
        org.jsoup.nodes.Element element12 = element10.addClass("");
        org.jsoup.select.Elements elements14 = element10.getElementsByIndexEquals((int) (short) -1);
        org.jsoup.select.Elements elements16 = element10.getElementsMatchingText("");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str5, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str6, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(elements14);
        org.junit.Assert.assertNotNull(elements16);
    }

    @Test
    public void test0186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0186");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        java.lang.String str5 = document3.html();
        java.lang.String str6 = document3.html();
        java.util.Map<java.lang.String, java.lang.String> strMap7 = document3.dataset();
        org.jsoup.nodes.Element element9 = document3.appendText("<html>\n <head></head>\n <body>\n </body>\n</html>");
        org.jsoup.select.Elements elements12 = document3.getElementsByAttributeValueStarting("<html>\n <head></head>\n <body>\n </body>\n</html>", "<html> <head></head> <body> </body> </html>");
        org.jsoup.nodes.Element element13 = document3.nextElementSibling();
        org.jsoup.select.Elements elements15 = element13.getElementsByIndexLessThan((int) '4');
        java.util.regex.Pattern pattern16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements17 = element13.getElementsMatchingOwnText(pattern16);
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
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(elements15);
    }

    @Test
    public void test0187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0187");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.nodes.Element element5 = document1.body();
        java.lang.String str6 = element5.html();
        org.jsoup.nodes.Element element8 = element5.appendText("<html>\n <head></head>\n <body></body>\n</html>&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;<<html> <head></head> <body> </body> </html>></<html> <head></head> <body> </body> </html>>");
        boolean boolean9 = element8.hasText();
        java.util.regex.Pattern pattern10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements11 = element8.getElementsMatchingText(pattern10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0188");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.nodes.Element element5 = document1.body();
        org.jsoup.select.Elements elements8 = element5.getElementsByAttributeValueStarting("hi!", "hi!");
        org.jsoup.nodes.Element element10 = element5.prependText("<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.nodes.Element element12 = element5.append("<html> <head></head> <body> </body> </html>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements15 = element5.getElementsByAttributeValueStarting("", "<html>\n <head></head>\n <body></body>\n</html>");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element12);
    }

    @Test
    public void test0189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0189");
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
        org.jsoup.select.Elements elements19 = element14.getElementsByIndexLessThan(2);
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
        org.junit.Assert.assertNotNull(elements19);
    }

    @Test
    public void test0190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0190");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        java.lang.String str5 = document1.tagName();
        org.jsoup.nodes.Document.OutputSettings outputSettings6 = document1.new OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = outputSettings6.indentAmount((int) (byte) 10);
        boolean boolean9 = outputSettings6.prettyPrint();
        int int10 = outputSettings6.indentAmount();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document.OutputSettings outputSettings12 = outputSettings6.charset("<html>\n <head></head>\n <body></body>\n</html>");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: <html>? <head></head>? <body></body>?</html>");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#root" + "'", str5, "#root");
        org.junit.Assert.assertNotNull(outputSettings8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
    }

    @Test
    public void test0191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0191");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.select.Elements elements6 = document3.getElementsByIndexLessThan((int) (short) 10);
        org.jsoup.nodes.Element element8 = document3.val("");
        java.lang.String str9 = document3.outerHtml();
        org.jsoup.select.Elements elements11 = document3.getElementsByClass("#root");
        org.jsoup.select.Elements elements13 = document3.getElementsByIndexGreaterThan(10);
        java.lang.Integer int14 = document3.elementSiblingIndex();
        java.util.regex.Pattern pattern16 = null;
        org.jsoup.select.Elements elements17 = document3.getElementsByAttributeValueMatching("<html> <head></head> <body></body> </html>", pattern16);
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str9, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(elements17);
    }

    @Test
    public void test0192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0192");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("\n<body></body>");
    }

    @Test
    public void test0193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0193");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.select.Elements elements6 = document3.getElementsByIndexLessThan((int) (short) 10);
        org.jsoup.nodes.Element element8 = document3.val("");
        org.jsoup.nodes.Element element10 = element8.val("hi!");
        java.lang.String str11 = element10.className();
        org.jsoup.select.Elements elements12 = element10.getAllElements();
        org.jsoup.nodes.Element element14 = element10.removeClass("<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.select.Elements elements16 = element14.getElementsContainingText("<html>\n <head></head>\n <body></body>\n</html>&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(elements16);
    }

    @Test
    public void test0194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0194");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element3 = document1.text("");
        org.jsoup.select.Elements elements6 = element3.getElementsByAttributeValueStarting("<html>\n <head></head>\n <body>\n </body>\n</html>", "hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements9 = element3.getElementsByAttributeValueEnding("<html>\n <head>\n  <title>&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;</title>\n </head>\n <body></body>\n</html>", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(elements6);
    }

    @Test
    public void test0195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0195");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        java.lang.String str5 = document1.tagName();
        org.jsoup.nodes.Element element6 = document1.head();
        java.lang.Integer int7 = element6.siblingIndex();
        org.jsoup.nodes.Element element10 = element6.attr("<html> <head></head> <body></body> </html>", "<html>\n <head>\n  <title>&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;</title>\n </head>\n <body></body>\n</html>");
        java.util.regex.Pattern pattern11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements12 = element6.getElementsMatchingText(pattern11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#root" + "'", str5, "#root");
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(element10);
    }

    @Test
    public void test0196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0196");
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
        org.jsoup.nodes.Element element23 = element20.removeClass(" html");
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
        org.junit.Assert.assertNotNull(element23);
    }

    @Test
    public void test0197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0197");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("#root");
        org.jsoup.nodes.Document.OutputSettings outputSettings2 = document1.outputSettings();
        java.nio.charset.Charset charset3 = outputSettings2.charset();
        java.nio.charset.CharsetEncoder charsetEncoder4 = outputSettings2.encoder();
        java.nio.charset.Charset charset5 = outputSettings2.charset();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(outputSettings2);
        org.junit.Assert.assertNotNull(charset3);
        org.junit.Assert.assertNotNull(charsetEncoder4);
        org.junit.Assert.assertNotNull(charset5);
    }

    @Test
    public void test0198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0198");
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
        java.util.regex.Pattern pattern25 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements26 = element17.getElementsMatchingText(pattern25);
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
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(document19);
        org.junit.Assert.assertNotNull(document21);
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertNotNull(strSet23);
        org.junit.Assert.assertNotNull(element24);
    }

    @Test
    public void test0199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0199");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.nodes.Attributes attributes5 = element4.attributes();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(attributes5);
    }

    @Test
    public void test0200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0200");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.select.Elements elements6 = document3.getElementsByIndexLessThan((int) (short) 10);
        org.jsoup.nodes.Element element8 = document3.val("");
        java.lang.String str9 = document3.outerHtml();
        org.jsoup.select.Elements elements11 = document3.getElementsByClass("#root");
        java.lang.String str12 = document3.data();
        org.jsoup.select.Elements elements14 = document3.getElementsByIndexGreaterThan((int) (short) 0);
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str9, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(elements14);
    }

    @Test
    public void test0201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0201");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        java.lang.String str5 = document1.tagName();
        org.jsoup.nodes.Document.OutputSettings outputSettings6 = document1.new OutputSettings();
        org.jsoup.nodes.Document document7 = document1.normalise();
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = document1.new OutputSettings();
        org.jsoup.nodes.Element element10 = document1.appendText("");
        java.util.regex.Pattern pattern11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements12 = document1.getElementsMatchingText(pattern11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#root" + "'", str5, "#root");
        org.junit.Assert.assertNotNull(document7);
        org.junit.Assert.assertNotNull(element10);
    }

    @Test
    public void test0202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0202");
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
        org.jsoup.select.Elements elements33 = element31.getElementsByAttribute("<#root value=\"&lt;html&gt;\n &lt;head&gt;&lt;/head&gt;\n &lt;body&gt;&lt;/body&gt;\n&lt;/html&gt;\">\n <html>\n  <head></head>\n  <body></body>\n </html>\n</#root>#root\n<html>\n <head></head>\n <body></body>\n</html>");
        java.lang.String str34 = element31.html();
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
        org.junit.Assert.assertNotNull(elements33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "<#root value=\"\" #root=\"&lt;html&gt;\n &lt;head&gt;&lt;/head&gt;\n &lt;body&gt;&lt;/body&gt;\n&lt;/html&gt;\" class=\"\">\n <html>\n  <head></head>\n  <body></body>\n </html><<html>\n <head></head>\n <body>\n </body>\n</html>></<html>\n <head></head>\n <body>\n </body>\n</html>>\n</#root>" + "'", str34, "<#root value=\"\" #root=\"&lt;html&gt;\n &lt;head&gt;&lt;/head&gt;\n &lt;body&gt;&lt;/body&gt;\n&lt;/html&gt;\" class=\"\">\n <html>\n  <head></head>\n  <body></body>\n </html><<html>\n <head></head>\n <body>\n </body>\n</html>></<html>\n <head></head>\n <body>\n </body>\n</html>>\n</#root>");
    }

    @Test
    public void test0203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0203");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element37 = document22.attr("", "#document");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
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
        org.junit.Assert.assertNotNull(elements34);
    }

    @Test
    public void test0204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0204");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element25 = document15.createElement("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
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
    }

    @Test
    public void test0205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0205");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.nodes.Element element5 = document1.body();
        java.lang.String str6 = element5.html();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node8 = element5.childNode((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 97 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test0206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0206");
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
        java.lang.String str16 = document15.toString();
        document15.title("<#root value=\"&lt;html&gt;\n &lt;head&gt;&lt;/head&gt;\n &lt;body&gt;&lt;/body&gt;\n&lt;/html&gt;\">\n <html>\n  <head></head>\n  <body></body>\n </html>\n</#root>#root\n<html>\n <head></head>\n <body></body>\n</html>");
        java.lang.String str19 = document15.data();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(document15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "<#root value=\"&lt;html&gt;\n &lt;head&gt;&lt;/head&gt;\n &lt;body&gt;&lt;/body&gt;\n&lt;/html&gt;\">\n <html>\n  <head></head>\n  <body></body>\n </html>\n</#root>#root\n<html>\n <head></head>\n <body></body>\n</html>" + "'", str16, "<#root value=\"&lt;html&gt;\n &lt;head&gt;&lt;/head&gt;\n &lt;body&gt;&lt;/body&gt;\n&lt;/html&gt;\">\n <html>\n  <head></head>\n  <body></body>\n </html>\n</#root>#root\n<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test0207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0207");
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
        org.jsoup.nodes.Node node19 = element17.removeAttr("<html>\n <head></head>\n <body></body>\n</html>&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;<<html> <head></head> <body> </body> </html>></<html> <head></head> <body> </body> </html>>");
        java.lang.String str20 = element17.data();
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
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test0208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0208");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        java.lang.String str5 = document3.html();
        java.lang.String str6 = document3.html();
        java.util.Map<java.lang.String, java.lang.String> strMap7 = document3.dataset();
        org.jsoup.nodes.Element element9 = document3.appendText("<html>\n <head></head>\n <body>\n </body>\n</html>");
        org.jsoup.select.Elements elements12 = document3.getElementsByAttributeValueStarting("<html>\n <head></head>\n <body>\n </body>\n</html>", "<html> <head></head> <body> </body> </html>");
        java.lang.String str13 = document3.outerHtml();
        org.jsoup.select.Elements elements15 = document3.getElementsContainingOwnText("<html>\n <head></head>\n <body></body>\n</html>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element17 = document3.child((int) '#');
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
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;" + "'", str13, "<html>\n <head></head>\n <body></body>\n</html>&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;");
        org.junit.Assert.assertNotNull(elements15);
    }

    @Test
    public void test0209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0209");
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
        java.lang.Class<?> wildcardClass16 = element14.getClass();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str5, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str6, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0210");
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
        org.jsoup.nodes.Element element17 = document3.lastElementSibling();
        org.jsoup.select.Elements elements19 = document3.getElementsByIndexEquals((int) (short) 100);
        org.jsoup.nodes.Document.OutputSettings outputSettings20 = document3.outputSettings();
        java.nio.charset.CharsetEncoder charsetEncoder21 = outputSettings20.encoder();
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
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(elements19);
        org.junit.Assert.assertNotNull(outputSettings20);
        org.junit.Assert.assertNotNull(charsetEncoder21);
    }

    @Test
    public void test0211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0211");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("#root");
        org.jsoup.nodes.Document.OutputSettings outputSettings2 = document1.outputSettings();
        org.jsoup.nodes.Element element4 = document1.removeClass("hi!");
        org.jsoup.nodes.Element element6 = document1.appendText("<html>\n <head></head>\n <body>\n </body>\n</html>");
        org.jsoup.select.Elements elements7 = element6.children();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(outputSettings2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(elements7);
    }

    @Test
    public void test0212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0212");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element24 = element3.child(2);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 2 out of bounds for length 2");
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
    }

    @Test
    public void test0213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0213");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node18 = element13.childNode((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str5, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str6, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(elements16);
    }

    @Test
    public void test0214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0214");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        java.lang.String str5 = document3.html();
        java.lang.String str6 = document3.html();
        java.util.Map<java.lang.String, java.lang.String> strMap7 = document3.dataset();
        org.jsoup.nodes.Element element9 = document3.appendElement("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList10 = element9.childNodes();
        org.jsoup.select.Elements elements13 = element9.getElementsByAttributeValue("#document", "html");
        element9.setBaseUri("<html>\n <head></head>\n <body>\n </body>\n</html>");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str5, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str6, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertNotNull(elements13);
    }

    @Test
    public void test0215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0215");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.parser.Tag tag5 = document3.tag();
        org.jsoup.select.Elements elements6 = document3.children();
        org.jsoup.nodes.Document.OutputSettings outputSettings7 = document3.outputSettings();
        boolean boolean8 = outputSettings7.prettyPrint();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(tag5);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(outputSettings7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0216");
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
        org.jsoup.select.Elements elements18 = element13.getElementsByAttributeValueNot("\n<body></body>", "<html> <head></head> <body></body> </html>");
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
        org.junit.Assert.assertNotNull(elements18);
    }

    @Test
    public void test0217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0217");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        java.lang.String str5 = document3.className();
        org.jsoup.nodes.Element element6 = document3.lastElementSibling();
        org.jsoup.nodes.Document document7 = document3.normalise();
        org.jsoup.select.Elements elements9 = document7.getElementsByClass("\n<body></body>");
        org.jsoup.nodes.Element element10 = document7.parent();
        java.lang.String str11 = document7.outerHtml();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(document7);
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str11, "<html>\n <head></head>\n <body></body>\n</html>");
    }

    @Test
    public void test0218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0218");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        java.lang.String str5 = document3.html();
        java.lang.String str6 = document3.html();
        org.jsoup.nodes.Document document8 = org.jsoup.nodes.Document.createShell("");
        java.util.Set<java.lang.String> strSet9 = document8.classNames();
        org.jsoup.nodes.Element element10 = document3.classNames(strSet9);
        org.jsoup.nodes.Element element12 = document3.removeClass("<html>\n <head></head>\n <body>\n </body>\n</html>");
        org.jsoup.nodes.Node node13 = element12.nextSibling();
        org.jsoup.nodes.Element element14 = element12.firstElementSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node16 = element14.childNode(1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str5, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str6, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertNotNull(document8);
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(element14);
    }

    @Test
    public void test0219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0219");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("<html> <head></head> <body> </body> </html>");
        java.lang.String str2 = document1.baseUri();
        java.lang.Class<?> wildcardClass3 = document1.getClass();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "<html> <head></head> <body> </body> </html>" + "'", str2, "<html> <head></head> <body> </body> </html>");
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0220");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.nodes.Element element5 = document1.body();
        org.jsoup.select.Elements elements8 = element5.getElementsByAttributeValueStarting("hi!", "hi!");
        org.jsoup.select.Elements elements10 = element5.getElementsByAttributeStarting("#root");
        org.jsoup.select.Elements elements11 = element5.children();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element13 = element5.appendElement("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertNotNull(elements11);
    }

    @Test
    public void test0221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0221");
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
        org.jsoup.select.Elements elements21 = element19.getElementsMatchingText("#document");
        java.lang.Integer int22 = element19.siblingIndex();
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
        org.junit.Assert.assertNotNull(elements21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
    }

    @Test
    public void test0222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0222");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.select.Elements elements6 = document3.getElementsByIndexLessThan((int) (short) 10);
        org.jsoup.nodes.Element element8 = document3.val("");
        org.jsoup.nodes.Element element10 = document3.after("#root");
        java.lang.String str12 = document3.attr("<html>\n <head></head>\n <body>\n </body>\n</html>");
        org.jsoup.nodes.Element element14 = document3.appendText("#root");
        org.jsoup.nodes.Document document16 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document18 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element19 = document16.prependChild((org.jsoup.nodes.Node) document18);
        org.jsoup.select.Elements elements21 = document18.getElementsByIndexLessThan((int) (short) 10);
        org.jsoup.nodes.Element element23 = document18.val("");
        java.lang.String str24 = document18.outerHtml();
        org.jsoup.select.Elements elements26 = document18.getElementsByClass("#root");
        org.jsoup.select.Elements elements28 = document18.getElementsByIndexGreaterThan(10);
        java.lang.Integer int29 = document18.elementSiblingIndex();
        org.jsoup.select.Elements elements30 = document18.getAllElements();
        document18.title("<html> <head></head> <body> </body> </html>");
        org.jsoup.nodes.Element element33 = document18.head();
        element14.replaceWith((org.jsoup.nodes.Node) document18);
        boolean boolean35 = element14.isBlock();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(document16);
        org.junit.Assert.assertNotNull(document18);
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertNotNull(elements21);
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str24, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertNotNull(elements26);
        org.junit.Assert.assertNotNull(elements28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(elements30);
        org.junit.Assert.assertNotNull(element33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test0223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0223");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.select.Elements elements6 = document3.getElementsByIndexLessThan((int) (short) 10);
        java.util.Set<java.lang.String> strSet7 = document3.classNames();
        org.jsoup.nodes.Element element9 = document3.getElementById("hi!");
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = document3.new OutputSettings();
        org.jsoup.nodes.Element element12 = document3.appendElement("hi!");
        org.jsoup.nodes.Element element13 = document3.body();
        org.jsoup.select.Elements elements16 = document3.getElementsByAttributeValueEnding("hi!", "&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt;&lt;/body&gt; &lt;/html&gt;&amp;lt;html&amp;gt; &amp;lt;head&amp;gt;&amp;lt;/head&amp;gt; &amp;lt;body&amp;gt; &amp;lt;/body&amp;gt; &amp;lt;/html&amp;gt;<#root>\n <html>\n  <head></head>\n  <body></body>\n </html>\n</#root>\n<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertNull(element9);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(elements16);
    }

    @Test
    public void test0224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0224");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element19 = document3.attr("", "<html> <head></head> <body></body> </html>");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
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
    }

    @Test
    public void test0225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0225");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element3 = document1.text("");
        org.jsoup.nodes.Element element5 = document1.append("<html>\n <head></head>\n <body>\n </body>\n</html>");
        org.jsoup.nodes.Element element6 = document1.empty();
        org.jsoup.nodes.Element element8 = element6.addClass("<html>\n <head></head>\n <body></body>\n</html>&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements11 = element8.getElementsByAttributeValueContaining("", "<html> <head></head> <body> </body> </html>");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(element8);
    }

    @Test
    public void test0226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0226");
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
        org.jsoup.select.Elements elements20 = document7.getElementsMatchingOwnText("<html>\n <head></head>\n <body></body>\n</html>&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;");
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
        org.junit.Assert.assertNotNull(elements20);
    }

    @Test
    public void test0227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0227");
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
        org.jsoup.select.Elements elements17 = document3.select("html");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements19 = document3.getElementsByAttributeStarting("");
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
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(elements17);
    }

    @Test
    public void test0228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0228");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("#document");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node3 = document1.childNode(1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0229");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.select.Elements elements6 = document3.getElementsByIndexLessThan((int) (short) 10);
        org.jsoup.nodes.Element element8 = document3.val("");
        org.jsoup.nodes.Element element10 = element8.val("hi!");
        java.lang.String str11 = element10.className();
        org.jsoup.select.Elements elements12 = element10.getAllElements();
        org.jsoup.nodes.Element element14 = element10.removeClass("<html>\n <head></head>\n <body></body>\n</html>");
        java.lang.String str15 = element14.className();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test0230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0230");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.select.Elements elements6 = document3.getElementsByIndexLessThan((int) (short) 10);
        org.jsoup.nodes.Element element8 = document3.val("");
        org.jsoup.nodes.Element element10 = document3.after("#root");
        org.jsoup.nodes.Document document11 = document3.ownerDocument();
        org.jsoup.nodes.Element element14 = document3.attr("#root", "<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.nodes.Element element16 = document3.after("<html>\n <head></head>\n <body>\n </body>\n</html>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements18 = document3.select("<html>\n <head>\n  <title>&lt;html&gt;\n &lt;head&gt;&lt;/head&gt;\n &lt;body&gt;&lt;/body&gt;\n&lt;/html&gt;</title>\n </head>\n <body></body>\n</html>");
            org.junit.Assert.fail("Expected exception of type org.jsoup.select.Selector.SelectorParseException; message: Could not parse query '<html>? <head>?  <title>&lt;html&gt;? &lt;head&gt;&lt;/head&gt;? &lt;body&gt;&lt;/body&gt;?&lt;/html&gt;</title>? </head>? <body></body>?</html>': unexpected token at '<html>? <head>?  <title>&lt;html&gt;? &lt;head&gt;&lt;/head&gt;? &lt;body&gt;&lt;/body&gt;?&lt;/html&gt;</title>? </head>? <body></body>?</html>'");
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
        org.junit.Assert.assertNotNull(element16);
    }

    @Test
    public void test0231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0231");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements24 = element21.getElementsByAttributeValueNot("<#root value=\"&lt;html&gt;\n &lt;head&gt;&lt;/head&gt;\n &lt;body&gt;&lt;/body&gt;\n&lt;/html&gt;\">\n <html>\n  <head></head>\n  <body></body>\n </html>\n</#root>#root\n<html>\n <head></head>\n <body></body>\n</html>", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
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
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "#document" + "'", str17, "#document");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(element21);
    }

    @Test
    public void test0232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0232");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        java.lang.String str5 = document3.html();
        java.lang.String str6 = document3.html();
        document3.title("<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.nodes.Element element10 = document3.prependText("<html> <head></head> <body></body> </html>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element12 = document3.child((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str5, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str6, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertNotNull(element10);
    }

    @Test
    public void test0233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0233");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.select.Elements elements6 = document3.getElementsByIndexLessThan((int) (short) 10);
        org.jsoup.nodes.Element element8 = document3.val("");
        java.lang.String str9 = document3.outerHtml();
        org.jsoup.select.Elements elements11 = document3.getElementsByClass("#root");
        java.lang.String str12 = document3.tagName();
        org.jsoup.nodes.Node node14 = document3.childNode(0);
        org.jsoup.nodes.Element element16 = document3.appendElement("<html>\n <head></head>\n <body></body>\n</html>&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;");
        element16.remove();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str9, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "#root" + "'", str12, "#root");
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(element16);
    }

    @Test
    public void test0234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0234");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        java.lang.String str5 = document3.html();
        java.lang.String str6 = document3.html();
        java.util.Map<java.lang.String, java.lang.String> strMap7 = document3.dataset();
        org.jsoup.nodes.Document document9 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document11 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element12 = document9.prependChild((org.jsoup.nodes.Node) document11);
        java.lang.String str13 = document11.html();
        java.lang.String str14 = document11.html();
        java.util.Map<java.lang.String, java.lang.String> strMap15 = document11.dataset();
        org.jsoup.nodes.Element element17 = document11.appendText("<html>\n <head></head>\n <body>\n </body>\n</html>");
        org.jsoup.select.Elements elements20 = document11.getElementsByAttributeValueStarting("<html>\n <head></head>\n <body>\n </body>\n</html>", "<html> <head></head> <body> </body> </html>");
        org.jsoup.select.Elements elements23 = document11.getElementsByAttributeValueMatching("<html> <head></head> <body> </body> </html>", "hi!");
        org.jsoup.nodes.Element element25 = document11.addClass("html");
        org.jsoup.nodes.Element element27 = element25.val("<html>\n <head></head>\n <body></body>\n</html>&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;");
        org.jsoup.nodes.Element element28 = document3.prependChild((org.jsoup.nodes.Node) element27);
        org.jsoup.nodes.Element element30 = document3.getElementById("#root");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements32 = element30.getElementsMatchingOwnText("\n<body></body>");
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
        org.junit.Assert.assertNotNull(document9);
        org.junit.Assert.assertNotNull(document11);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str13, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str14, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertNotNull(strMap15);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(elements20);
        org.junit.Assert.assertNotNull(elements23);
        org.junit.Assert.assertNotNull(element25);
        org.junit.Assert.assertNotNull(element27);
        org.junit.Assert.assertNotNull(element28);
        org.junit.Assert.assertNull(element30);
    }

    @Test
    public void test0235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0235");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        java.lang.String str5 = document3.html();
        boolean boolean6 = document3.hasText();
        org.jsoup.nodes.Element element8 = document3.prependText("<html>\n <head></head>\n <body>\n </body>\n</html>");
        org.jsoup.nodes.Element element10 = element8.getElementById("<html> <head></head> <body> </body> </html>");
        org.jsoup.nodes.Document document12 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document14 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element15 = document12.prependChild((org.jsoup.nodes.Node) document14);
        java.lang.String str16 = document14.className();
        org.jsoup.nodes.Element element17 = document14.lastElementSibling();
        org.jsoup.nodes.Document document18 = document14.normalise();
        org.jsoup.select.Elements elements19 = document18.siblingElements();
        org.jsoup.nodes.Element element21 = document18.createElement("\n<body></body>");
        org.jsoup.nodes.Node node23 = document18.removeAttr("<html>\n <head></head>\n <body></body>\n</html>&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean24 = element10.equals((java.lang.Object) "<html>\n <head></head>\n <body></body>\n</html>&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str5, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNull(element10);
        org.junit.Assert.assertNotNull(document12);
        org.junit.Assert.assertNotNull(document14);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(document18);
        org.junit.Assert.assertNotNull(elements19);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertNotNull(node23);
    }

    @Test
    public void test0236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0236");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("#root");
        org.jsoup.nodes.Document.OutputSettings outputSettings2 = document1.outputSettings();
        org.jsoup.nodes.Element element4 = document1.removeClass("hi!");
        org.jsoup.nodes.Element element6 = document1.toggleClass("<html>\n <head></head>\n <body>\n </body>\n</html>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element8 = element6.before("#document");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(outputSettings2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element6);
    }

    @Test
    public void test0237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0237");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        java.lang.String str5 = document1.tagName();
        org.jsoup.nodes.Document.OutputSettings outputSettings6 = document1.new OutputSettings();
        org.jsoup.nodes.Element element8 = document1.createElement("<#root value=\"&lt;html&gt;\n &lt;head&gt;&lt;/head&gt;\n &lt;body&gt;&lt;/body&gt;\n&lt;/html&gt;\">\n <html>\n  <head></head>\n  <body></body>\n </html>\n</#root>#root\n<html>\n <head></head>\n <body></body>\n</html>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements10 = document1.select("<html> <head></head> <body></body> </html>");
            org.junit.Assert.fail("Expected exception of type org.jsoup.select.Selector.SelectorParseException; message: Could not parse query '<html> <head></head> <body></body> </html>': unexpected token at '<html> <head></head> <body></body> </html>'");
        } catch (org.jsoup.select.Selector.SelectorParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#root" + "'", str5, "#root");
        org.junit.Assert.assertNotNull(element8);
    }

    @Test
    public void test0238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0238");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        java.lang.String str5 = document3.className();
        org.jsoup.nodes.Element element6 = document3.lastElementSibling();
        org.jsoup.nodes.Document document7 = document3.normalise();
        org.jsoup.select.Elements elements8 = document7.siblingElements();
        org.jsoup.nodes.Element element10 = document7.createElement("\n<body></body>");
        org.jsoup.nodes.Node node12 = document7.removeAttr("<html>\n <head></head>\n <body></body>\n</html>&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;");
        boolean boolean14 = node12.hasAttr("html");
        org.jsoup.nodes.Node node16 = node12.removeAttr("<html>\n <head></head>\n <body></body>\n</html>&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;<<html> <head></head> <body> </body> </html>></<html> <head></head> <body> </body> </html>>");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(document7);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(node16);
    }

    @Test
    public void test0239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0239");
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
        java.lang.String str17 = document3.ownText();
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
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test0240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0240");
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
        org.jsoup.nodes.Document document15 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document17 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element18 = document15.prependChild((org.jsoup.nodes.Node) document17);
        java.lang.String str19 = document15.tagName();
        org.jsoup.nodes.Document.OutputSettings outputSettings20 = document15.new OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings22 = outputSettings20.indentAmount(0);
        org.jsoup.nodes.Entities.EscapeMode escapeMode23 = outputSettings22.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings24 = outputSettings6.escapeMode(escapeMode23);
        boolean boolean25 = outputSettings6.prettyPrint();
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
        org.junit.Assert.assertNotNull(document15);
        org.junit.Assert.assertNotNull(document17);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "#root" + "'", str19, "#root");
        org.junit.Assert.assertNotNull(outputSettings22);
        org.junit.Assert.assertTrue("'" + escapeMode23 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode23.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test0241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0241");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        java.lang.String str5 = document3.html();
        java.lang.String str6 = document3.html();
        java.util.Map<java.lang.String, java.lang.String> strMap7 = document3.dataset();
        org.jsoup.nodes.Element element9 = document3.appendElement("hi!");
        org.jsoup.nodes.Element element10 = document3.body();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements12 = document3.getElementsByClass("");
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
        org.junit.Assert.assertNotNull(element10);
    }

    @Test
    public void test0242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0242");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.nodes.Element element5 = document1.body();
        org.jsoup.select.Elements elements8 = element5.getElementsByAttributeValueStarting("hi!", "hi!");
        org.jsoup.nodes.Element element10 = element5.prependText("<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.nodes.Element element12 = element5.append("<html> <head></head> <body> </body> </html>");
        org.jsoup.select.Elements elements14 = element12.getElementsByIndexGreaterThan((int) (byte) 10);
        boolean boolean15 = element12.hasText();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(elements14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test0243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0243");
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
        org.jsoup.select.Elements elements17 = document3.select("html");
        org.jsoup.select.Elements elements19 = document3.getElementsByIndexEquals(100);
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
        org.junit.Assert.assertNotNull(elements19);
    }

    @Test
    public void test0244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0244");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.parser.Tag tag5 = document3.tag();
        org.jsoup.nodes.Element element7 = document3.val("");
        boolean boolean9 = element7.hasAttr("<html> <head></head> <body> </body> </html>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element11 = element7.child((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(tag5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0245");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.nodes.Element element5 = document1.body();
        org.jsoup.select.Elements elements7 = document1.select("#root");
        org.jsoup.nodes.Element element8 = document1.empty();
        org.jsoup.nodes.Node node9 = document1.nextSibling();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNull(node9);
    }

    @Test
    public void test0246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0246");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.select.Elements elements6 = document3.getElementsByIndexLessThan((int) (short) 10);
        org.jsoup.nodes.Element element8 = document3.val("");
        org.jsoup.nodes.Element element10 = document3.after("#root");
        org.jsoup.nodes.Document document11 = document3.ownerDocument();
        boolean boolean13 = document11.hasAttr("#root");
        java.lang.String str14 = document11.outerHtml();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(document11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str14, "<html>\n <head></head>\n <body></body>\n</html>");
    }

    @Test
    public void test0247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0247");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        java.util.Set<java.lang.String> strSet2 = document1.classNames();
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document1.childNodes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element5 = document1.child((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 97 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNotNull(nodeList3);
    }

    @Test
    public void test0248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0248");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        java.lang.String str2 = document1.tagName();
        org.jsoup.nodes.Element element4 = document1.prepend("hi!");
        org.jsoup.nodes.Element element6 = document1.prependElement("<html>\n <head></head>\n <body>\n </body>\n</html>\n<html> \n <head></head> \n <body>  \n </body>\n</html>");
        java.lang.Class<?> wildcardClass7 = element6.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#root" + "'", str2, "#root");
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0249");
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
        java.lang.String str20 = document3.text();
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
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt; <html> <head></head> <body></body> </html> <html> <head></head> <body> </body> </html>" + "'", str20, "<html>\n <head></head>\n <body></body>\n</html>&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt; <html> <head></head> <body></body> </html> <html> <head></head> <body> </body> </html>");
    }

    @Test
    public void test0250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0250");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.select.Elements elements6 = document3.getElementsByIndexLessThan((int) (short) 10);
        org.jsoup.nodes.Element element8 = document3.val("");
        org.jsoup.nodes.Element element10 = document3.after("#root");
        org.jsoup.nodes.Element element11 = document3.nextElementSibling();
        org.jsoup.nodes.Element element13 = document3.val("<html>\n <head></head>\n <body></body>\n</html>");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = element13.absUrl("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(element13);
    }

    @Test
    public void test0251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0251");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        boolean boolean3 = document1.hasClass("");
        java.util.Set<java.lang.String> strSet4 = document1.classNames();
        org.jsoup.nodes.Element element5 = document1.body();
        org.jsoup.nodes.Document.OutputSettings outputSettings6 = document1.outputSettings();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNull(element5);
        org.junit.Assert.assertNotNull(outputSettings6);
    }

    @Test
    public void test0252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0252");
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
        boolean boolean18 = document3.hasAttr("\n<body></body>");
        java.lang.String str19 = document3.nodeName();
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
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "#document" + "'", str19, "#document");
    }

    @Test
    public void test0253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0253");
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
        org.jsoup.nodes.Document document18 = element14.ownerDocument();
        org.jsoup.nodes.Element element20 = document18.appendText("<html>\n <head></head>\n <body></body>\n</html>&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;");
        java.lang.String str21 = document18.data();
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
        org.junit.Assert.assertNotNull(document18);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test0254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0254");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.select.Elements elements6 = document3.getElementsByIndexLessThan((int) (short) 10);
        org.jsoup.nodes.Element element8 = document3.val("");
        org.jsoup.nodes.Element element11 = element8.attr("<html>\n <head></head>\n <body></body>\n</html>", "<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.nodes.Node node12 = element8.previousSibling();
        java.lang.String str13 = element8.baseUri();
        java.lang.Integer int14 = element8.siblingIndex();
        org.jsoup.nodes.Document document16 = org.jsoup.nodes.Document.createShell("#root");
        org.jsoup.nodes.Element element17 = document16.body();
        org.jsoup.nodes.Element element18 = element8.prependChild((org.jsoup.nodes.Node) element17);
        org.jsoup.select.Elements elements19 = element8.children();
        java.lang.String str20 = element8.data();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(document16);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNotNull(elements19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test0255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0255");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element2 = document1.body();
        org.jsoup.select.Elements elements4 = document1.getElementsContainingOwnText("<html>\n <head>\n  <title>&lt;html&gt;\n &lt;head&gt;&lt;/head&gt;\n &lt;body&gt;&lt;/body&gt;\n&lt;/html&gt;</title>\n </head>\n <body></body>\n</html>");
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertNotNull(elements4);
    }

    @Test
    public void test0256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0256");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.select.Elements elements6 = document3.getElementsByIndexLessThan((int) (short) 10);
        org.jsoup.nodes.Element element8 = document3.val("");
        org.jsoup.nodes.Element element10 = element8.val("hi!");
        org.jsoup.select.Elements elements12 = element8.getElementsByIndexEquals((int) (short) 100);
        java.util.regex.Pattern pattern13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements14 = element8.getElementsMatchingOwnText(pattern13);
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
        org.junit.Assert.assertNotNull(elements12);
    }

    @Test
    public void test0257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0257");
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
        org.jsoup.nodes.Element element17 = element13.getElementById("<html>\n <head>\n  <title>&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;</title>\n </head>\n <body></body>\n</html>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements19 = element17.getElementsByClass("#document <html> <head></head> <body></body> </html>&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;");
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
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertNull(element17);
    }

    @Test
    public void test0258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0258");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.nodes.Element element5 = document3.head();
        java.lang.Integer int6 = document3.elementSiblingIndex();
        org.jsoup.nodes.Node node7 = document3.previousSibling();
        org.jsoup.nodes.Element element9 = document3.createElement("<html>\n <head>\n  <title>&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;</title>\n </head>\n <body></body>\n</html>");
        org.jsoup.nodes.Document document11 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document13 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element14 = document11.prependChild((org.jsoup.nodes.Node) document13);
        org.jsoup.select.Elements elements16 = document13.getElementsByIndexLessThan((int) (short) 10);
        org.jsoup.nodes.Element element18 = document13.val("");
        org.jsoup.nodes.Element element20 = document13.after("#root");
        org.jsoup.nodes.Element element21 = document13.body();
        org.jsoup.select.Elements elements23 = element21.getElementsContainingOwnText("<html>\n <head></head>\n <body>\n </body>\n</html>");
        org.jsoup.nodes.Element element24 = element21.nextElementSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element25 = element9.appendChild((org.jsoup.nodes.Node) element24);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(document11);
        org.junit.Assert.assertNotNull(document13);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(elements16);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertNotNull(elements23);
        org.junit.Assert.assertNull(element24);
    }

    @Test
    public void test0259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0259");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements23 = element19.getElementsByTag("");
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
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertNotNull(element21);
    }

    @Test
    public void test0260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0260");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("#root");
        org.jsoup.nodes.Document.OutputSettings outputSettings2 = document1.outputSettings();
        org.jsoup.nodes.Element element4 = document1.removeClass("hi!");
        org.jsoup.nodes.Element element6 = document1.toggleClass("<html>\n <head></head>\n <body>\n </body>\n</html>");
        java.util.List<org.jsoup.nodes.Node> nodeList7 = element6.childNodes();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(outputSettings2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(nodeList7);
    }

    @Test
    public void test0261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0261");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.select.Elements elements6 = document3.getElementsByIndexLessThan((int) (short) 10);
        org.jsoup.nodes.Element element8 = document3.val("");
        org.jsoup.nodes.Element element10 = document3.after("#root");
        org.jsoup.nodes.Document document11 = document3.ownerDocument();
        org.jsoup.nodes.Element element14 = document3.attr("#root", "<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.select.Elements elements16 = document3.select("#root");
        java.lang.String str17 = document3.tagName();
        org.jsoup.select.Elements elements19 = document3.getElementsByTag("<html>\n <head></head>\n <body></body>\n</html>&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;");
        org.jsoup.select.Elements elements21 = document3.getElementsContainingOwnText("");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(document11);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(elements16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "#root" + "'", str17, "#root");
        org.junit.Assert.assertNotNull(elements19);
        org.junit.Assert.assertNotNull(elements21);
    }

    @Test
    public void test0262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0262");
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
        org.jsoup.select.Elements elements21 = element11.getElementsByIndexEquals((int) ' ');
        java.util.regex.Pattern pattern22 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements23 = element11.getElementsMatchingOwnText(pattern22);
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
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(document13);
        org.junit.Assert.assertNotNull(document15);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertNotNull(elements21);
    }

    @Test
    public void test0263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0263");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        java.lang.String str5 = document1.tagName();
        org.jsoup.nodes.Document.OutputSettings outputSettings6 = document1.new OutputSettings();
        java.lang.Integer int7 = document1.siblingIndex();
        org.jsoup.select.Elements elements8 = document1.children();
        org.jsoup.select.Elements elements10 = document1.getElementsByAttribute("<html>\n <head>\n  <title>&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;</title>\n </head>\n <body></body>\n</html>");
        org.jsoup.nodes.Attributes attributes11 = document1.attributes();
        java.util.regex.Pattern pattern12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements13 = document1.getElementsMatchingText(pattern12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#root" + "'", str5, "#root");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertNotNull(attributes11);
    }

    @Test
    public void test0264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0264");
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
        java.lang.String str18 = document3.html();
        org.jsoup.nodes.Document.OutputSettings outputSettings19 = document3.new OutputSettings();
        boolean boolean20 = outputSettings19.prettyPrint();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document.OutputSettings outputSettings22 = outputSettings19.charset("hi!");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: hi!");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
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
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "<html>\n <head>\n  <title>&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;</title>\n </head>\n <body></body>\n</html>" + "'", str18, "<html>\n <head>\n  <title>&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;</title>\n </head>\n <body></body>\n</html>");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test0265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0265");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document.OutputSettings outputSettings16 = outputSettings14.charset("<html>\n <head></head>\n <body></body>\n</html>&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt; <html> <head></head> <body></body> </html> <html> <head></head> <body> </body> </html>");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: <html>? <head></head>? <body></body>?</html>&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt; <html> <head></head> <body></body> </html> <html> <head></head> <body> </body> </html>");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str5, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str6, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(outputSettings14);
    }

    @Test
    public void test0266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0266");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node28 = element10.removeAttr("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
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
    }

    @Test
    public void test0267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0267");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements25 = element22.getElementsByAttributeValueContaining("<html> <head></head> <body></body> </html>", "");
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
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertNotNull(element22);
    }

    @Test
    public void test0268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0268");
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
        org.jsoup.select.Elements elements18 = document3.getElementsContainingOwnText("<html>\n <head></head>\n <body></body>\n</html>&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;<<html> <head></head> <body> </body> </html>></<html> <head></head> <body> </body> </html>>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements21 = document3.getElementsByAttributeValueStarting("", "body");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
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
        org.junit.Assert.assertNotNull(nodeList15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str16, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertNotNull(elements18);
    }

    @Test
    public void test0269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0269");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("html");
    }

    @Test
    public void test0270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0270");
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
        org.jsoup.select.Elements elements26 = element24.parents();
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
        org.junit.Assert.assertNotNull(elements26);
    }

    @Test
    public void test0271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0271");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements19 = document3.select("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
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
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertNotNull(strMap17);
    }

    @Test
    public void test0272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0272");
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
        java.lang.Class<?> wildcardClass24 = document3.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test0273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0273");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.nodes.Element element5 = document1.body();
        org.jsoup.select.Elements elements8 = element5.getElementsByAttributeValueStarting("hi!", "hi!");
        org.jsoup.select.Elements elements10 = element5.getElementsByAttributeStarting("#root");
        java.util.Set<java.lang.String> strSet11 = element5.classNames();
        boolean boolean12 = element5.hasText();
        org.jsoup.parser.Tag tag13 = element5.tag();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(tag13);
    }

    @Test
    public void test0274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0274");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("#root");
        org.jsoup.nodes.Element element4 = document1.attr("hi!", "#root");
        boolean boolean6 = element4.hasAttr("hi!");
        boolean boolean8 = element4.hasAttr("<html>\n <head></head>\n <body></body>\n</html>&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;");
        org.jsoup.nodes.Attributes attributes9 = element4.attributes();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(attributes9);
    }

    @Test
    public void test0275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0275");
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
        java.util.List<org.jsoup.nodes.Node> nodeList18 = element17.siblingNodes();
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
        org.junit.Assert.assertNotNull(nodeList18);
    }

    @Test
    public void test0276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0276");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        java.lang.String str5 = document1.tagName();
        org.jsoup.nodes.Document.OutputSettings outputSettings6 = document1.new OutputSettings();
        java.lang.Integer int7 = document1.siblingIndex();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element9 = document1.after("#document");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#root" + "'", str5, "#root");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0277");
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
        org.jsoup.nodes.Element element21 = element19.append("#document");
        boolean boolean22 = element21.isBlock();
        org.jsoup.select.Elements elements24 = element21.getElementsContainingText("<#root value=\"\" #root=\"&lt;html&gt;\n &lt;head&gt;&lt;/head&gt;\n &lt;body&gt;&lt;/body&gt;\n&lt;/html&gt;\" class=\"\">\n <html>\n  <head></head>\n  <body></body>\n </html><<html>\n <head></head>\n <body>\n </body>\n</html>></<html>\n <head></head>\n <body>\n </body>\n</html>>\n</#root>");
        org.jsoup.select.Elements elements26 = element21.getElementsMatchingText("<#root>\n <html>\n  <head></head>\n  <body></body>\n </html>\n</#root>\n<html>\n <head></head>\n <body></body>\n</html>");
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
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(elements24);
        org.junit.Assert.assertNotNull(elements26);
    }

    @Test
    public void test0278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0278");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node19 = element18.nextSibling();
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
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;<<html> <head></head> <body> </body> </html>></<html> <head></head> <body> </body> </html>>" + "'", str15, "<html>\n <head></head>\n <body></body>\n</html>&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;<<html> <head></head> <body> </body> </html>></<html> <head></head> <body> </body> </html>>");
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertNull(element18);
    }

    @Test
    public void test0279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0279");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        java.lang.String str5 = document3.html();
        java.lang.String str6 = document3.html();
        org.jsoup.nodes.Document document8 = org.jsoup.nodes.Document.createShell("");
        java.util.Set<java.lang.String> strSet9 = document8.classNames();
        org.jsoup.nodes.Element element10 = document3.classNames(strSet9);
        org.jsoup.nodes.Element element12 = document3.removeClass("<html>\n <head></head>\n <body>\n </body>\n</html>");
        document3.remove();
        org.jsoup.nodes.Document document15 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document17 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element18 = document15.prependChild((org.jsoup.nodes.Node) document17);
        java.lang.String str19 = document17.html();
        java.lang.String str20 = document17.html();
        document17.title("<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.select.Elements elements23 = document17.getAllElements();
        org.jsoup.nodes.Element element25 = document17.html("");
        java.lang.String str26 = document17.outerHtml();
        org.jsoup.nodes.Element element28 = document17.appendText("<html>\n <head></head>\n <body>\n </body>\n</html>");
        org.jsoup.select.Elements elements30 = element28.getElementsByIndexLessThan(10);
        // The following exception was thrown during execution in test generation
        try {
            document3.replaceWith((org.jsoup.nodes.Node) element28);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str5, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str6, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertNotNull(document8);
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(document15);
        org.junit.Assert.assertNotNull(document17);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str19, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str20, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertNotNull(elements23);
        org.junit.Assert.assertNotNull(element25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(element28);
        org.junit.Assert.assertNotNull(elements30);
    }

    @Test
    public void test0280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0280");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.nodes.Element element5 = document1.body();
        org.jsoup.select.Elements elements7 = document1.select("#root");
        org.jsoup.nodes.Element element8 = document1.empty();
        java.lang.String str9 = element8.ownText();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0281");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("#document");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("#root");
        boolean boolean4 = document1.equals((java.lang.Object) "#root");
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0282");
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
        org.jsoup.select.Elements elements19 = document3.children();
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
        org.junit.Assert.assertNotNull(elements19);
    }

    @Test
    public void test0283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0283");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        java.lang.String str5 = document3.html();
        java.lang.String str6 = document3.html();
        java.util.Map<java.lang.String, java.lang.String> strMap7 = document3.dataset();
        org.jsoup.nodes.Element element9 = document3.appendText("<html>\n <head></head>\n <body>\n </body>\n</html>");
        org.jsoup.select.Elements elements12 = document3.getElementsByAttributeValueStarting("<html>\n <head></head>\n <body>\n </body>\n</html>", "<html> <head></head> <body> </body> </html>");
        org.jsoup.nodes.Element element13 = document3.body();
        org.jsoup.nodes.Element element15 = element13.html("<html> <head></head> <body> </body> </html>");
        org.jsoup.select.Elements elements16 = element13.getAllElements();
        java.lang.String str17 = element13.val();
        boolean boolean19 = element13.hasAttr("#document <html> <head></head> <body></body> </html>&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;");
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
        org.junit.Assert.assertNotNull(elements16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test0284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0284");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        java.lang.String str5 = document3.nodeName();
        org.jsoup.nodes.Element element6 = document3.previousElementSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element8 = element6.append(" hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#document" + "'", str5, "#document");
        org.junit.Assert.assertNull(element6);
    }

    @Test
    public void test0285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0285");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("#root");
        org.jsoup.nodes.Document.OutputSettings outputSettings2 = document1.outputSettings();
        java.lang.String str3 = document1.id();
        java.lang.String str4 = document1.title();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(outputSettings2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test0286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0286");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node20 = element15.childNode((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 35 out of bounds for length 0");
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
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(elements18);
    }

    @Test
    public void test0287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0287");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        java.lang.String str5 = document3.html();
        java.lang.String str6 = document3.html();
        java.util.Map<java.lang.String, java.lang.String> strMap7 = document3.dataset();
        org.jsoup.nodes.Element element9 = document3.appendElement("hi!");
        element9.remove();
        org.jsoup.nodes.Node node12 = element9.removeAttr("#document");
        java.lang.String str13 = element9.className();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str5, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str6, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test0288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0288");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.nodes.Element element6 = element4.child((int) (short) 0);
        java.util.Set<java.lang.String> strSet7 = element6.classNames();
        org.jsoup.select.Elements elements9 = element6.getElementsByIndexLessThan((-1));
        java.lang.String str10 = element6.ownText();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test0289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0289");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements23 = document19.getElementsByAttributeValueEnding("<#root value=\"&lt;html&gt;\n &lt;head&gt;&lt;/head&gt;\n &lt;body&gt;&lt;/body&gt;\n&lt;/html&gt;\">\n <html>\n  <head></head>\n  <body></body>\n </html>\n</#root>#root\n<html>\n <head></head>\n <body></body>\n</html>", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
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
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(document19);
        org.junit.Assert.assertNotNull(element20);
    }

    @Test
    public void test0290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0290");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element3 = document1.text("");
        java.lang.String str4 = element3.html();
        org.jsoup.select.Elements elements7 = element3.getElementsByAttributeValueNot("hi!", "#root");
        java.util.regex.Pattern pattern8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements9 = element3.getElementsMatchingOwnText(pattern8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<html>\n <head></head>\n <body>\n </body>\n</html>" + "'", str4, "<html>\n <head></head>\n <body>\n </body>\n</html>");
        org.junit.Assert.assertNotNull(elements7);
    }

    @Test
    public void test0291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0291");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.select.Elements elements6 = document3.getElementsByIndexLessThan((int) (short) 10);
        java.util.Set<java.lang.String> strSet7 = document3.classNames();
        org.jsoup.select.Elements elements10 = document3.getElementsByAttributeValueNot("<html> <head></head> <body> </body> </html>", "#root");
        org.jsoup.nodes.Document document11 = document3.normalise();
        org.jsoup.select.Elements elements13 = document3.getElementsByIndexLessThan(0);
        org.jsoup.nodes.Element element14 = document3.previousElementSibling();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertNotNull(document11);
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertNull(element14);
    }

    @Test
    public void test0292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0292");
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
        java.lang.String str16 = document15.toString();
        document15.title("<#root value=\"&lt;html&gt;\n &lt;head&gt;&lt;/head&gt;\n &lt;body&gt;&lt;/body&gt;\n&lt;/html&gt;\">\n <html>\n  <head></head>\n  <body></body>\n </html>\n</#root>#root\n<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.nodes.Document document20 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document22 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element23 = document20.prependChild((org.jsoup.nodes.Node) document22);
        java.lang.String str24 = document22.html();
        java.lang.String str25 = document22.html();
        java.util.Map<java.lang.String, java.lang.String> strMap26 = document22.dataset();
        org.jsoup.nodes.Element element28 = document22.appendText("<html>\n <head></head>\n <body>\n </body>\n</html>");
        org.jsoup.select.Elements elements31 = document22.getElementsByAttributeValueStarting("<html>\n <head></head>\n <body>\n </body>\n</html>", "<html> <head></head> <body> </body> </html>");
        org.jsoup.nodes.Element element33 = document22.appendElement("<html> <head></head> <body> </body> </html>");
        java.lang.String str34 = document22.outerHtml();
        org.jsoup.nodes.Element element35 = document15.appendChild((org.jsoup.nodes.Node) document22);
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(document15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "<#root value=\"&lt;html&gt;\n &lt;head&gt;&lt;/head&gt;\n &lt;body&gt;&lt;/body&gt;\n&lt;/html&gt;\">\n <html>\n  <head></head>\n  <body></body>\n </html>\n</#root>#root\n<html>\n <head></head>\n <body></body>\n</html>" + "'", str16, "<#root value=\"&lt;html&gt;\n &lt;head&gt;&lt;/head&gt;\n &lt;body&gt;&lt;/body&gt;\n&lt;/html&gt;\">\n <html>\n  <head></head>\n  <body></body>\n </html>\n</#root>#root\n<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertNotNull(document20);
        org.junit.Assert.assertNotNull(document22);
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str24, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str25, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertNotNull(strMap26);
        org.junit.Assert.assertNotNull(element28);
        org.junit.Assert.assertNotNull(elements31);
        org.junit.Assert.assertNotNull(element33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;<<html> <head></head> <body> </body> </html>></<html> <head></head> <body> </body> </html>>" + "'", str34, "<html>\n <head></head>\n <body></body>\n</html>&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;<<html> <head></head> <body> </body> </html>></<html> <head></head> <body> </body> </html>>");
        org.junit.Assert.assertNotNull(element35);
    }

    @Test
    public void test0293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0293");
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
        org.jsoup.parser.Tag tag16 = element13.tag();
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
        org.junit.Assert.assertNotNull(tag16);
    }

    @Test
    public void test0294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0294");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.select.Elements elements6 = document3.getElementsByIndexLessThan((int) (short) 10);
        org.jsoup.nodes.Element element8 = document3.val("");
        org.jsoup.nodes.Element element10 = document3.after("#root");
        org.jsoup.nodes.Document document11 = document3.ownerDocument();
        org.jsoup.nodes.Element element14 = document3.attr("#root", "<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.select.Elements elements15 = element14.siblingElements();
        org.jsoup.nodes.Attributes attributes16 = element14.attributes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node18 = element14.childNode((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
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
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertNotNull(attributes16);
    }

    @Test
    public void test0295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0295");
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
        org.jsoup.nodes.Element element25 = document3.lastElementSibling();
        java.lang.Class<?> wildcardClass26 = document3.getClass();
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
        org.junit.Assert.assertNotNull(element25);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test0296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0296");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.select.Elements elements6 = document3.getElementsByIndexLessThan((int) (short) 10);
        org.jsoup.nodes.Element element8 = document3.val("");
        org.jsoup.nodes.Element element10 = document3.after("#root");
        org.jsoup.nodes.Element element11 = document3.body();
        org.jsoup.nodes.Document.OutputSettings outputSettings12 = document3.new OutputSettings();
        java.lang.Class<?> wildcardClass13 = outputSettings12.getClass();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0297");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        java.lang.String str5 = document3.html();
        java.lang.String str6 = document3.html();
        java.util.Map<java.lang.String, java.lang.String> strMap7 = document3.dataset();
        org.jsoup.nodes.Element element8 = document3.lastElementSibling();
        org.jsoup.nodes.Element element9 = element8.parent();
        boolean boolean10 = element9.isBlock();
        java.lang.String str11 = element9.ownText();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str5, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str6, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test0298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0298");
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
        java.lang.String str20 = document3.ownText();
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
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test0299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0299");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.nodes.Element element5 = document1.body();
        org.jsoup.select.Elements elements8 = element5.getElementsByAttributeValueStarting("hi!", "hi!");
        org.jsoup.nodes.Element element10 = element5.prependText("<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.nodes.Element element12 = element5.append("<html> <head></head> <body> </body> </html>");
        org.jsoup.select.Elements elements15 = element12.getElementsByAttributeValueEnding("html", "<html>\n <head></head>\n <body>\n </body>\n</html>");
        java.lang.String str16 = element12.val();
        java.util.Map<java.lang.String, java.lang.String> strMap17 = element12.dataset();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(strMap17);
    }

    @Test
    public void test0300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0300");
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
        java.util.regex.Pattern pattern18 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements19 = document3.getElementsMatchingOwnText(pattern18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
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
    }

    @Test
    public void test0301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0301");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element19 = document3.child((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 1");
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
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(element17);
    }

    @Test
    public void test0302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0302");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.select.Elements elements6 = document3.getElementsByIndexLessThan((int) (short) 10);
        org.jsoup.nodes.Element element8 = document3.val("");
        java.lang.String str9 = document3.outerHtml();
        org.jsoup.select.Elements elements11 = document3.getElementsByClass("#root");
        java.lang.String str12 = document3.tagName();
        java.lang.Integer int13 = document3.elementSiblingIndex();
        org.jsoup.nodes.Document document15 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document17 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element18 = document15.prependChild((org.jsoup.nodes.Node) document17);
        java.lang.String str19 = document15.tagName();
        org.jsoup.nodes.Document.OutputSettings outputSettings20 = document15.new OutputSettings();
        org.jsoup.nodes.Element element22 = document15.createElement("<#root value=\"&lt;html&gt;\n &lt;head&gt;&lt;/head&gt;\n &lt;body&gt;&lt;/body&gt;\n&lt;/html&gt;\">\n <html>\n  <head></head>\n  <body></body>\n </html>\n</#root>#root\n<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.nodes.Element element23 = document3.prependChild((org.jsoup.nodes.Node) document15);
        java.util.regex.Pattern pattern24 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements25 = document15.getElementsMatchingOwnText(pattern24);
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
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "#root" + "'", str12, "#root");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(document15);
        org.junit.Assert.assertNotNull(document17);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "#root" + "'", str19, "#root");
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertNotNull(element23);
    }

    @Test
    public void test0303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0303");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.select.Elements elements6 = document3.getElementsByIndexLessThan((int) (short) 10);
        org.jsoup.nodes.Element element8 = document3.val("");
        org.jsoup.nodes.Element element10 = document3.after("#root");
        org.jsoup.nodes.Element element11 = document3.nextElementSibling();
        org.jsoup.nodes.Element element13 = document3.val("<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.nodes.Element element15 = document3.html("body");
        org.jsoup.parser.Tag tag16 = document3.tag();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(tag16);
    }

    @Test
    public void test0304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0304");
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
        org.jsoup.nodes.Element element21 = element15.nextElementSibling();
        java.util.List<org.jsoup.nodes.Node> nodeList22 = element15.siblingNodes();
        java.util.regex.Pattern pattern23 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements24 = element15.getElementsMatchingOwnText(pattern23);
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
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(elements17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertNull(element21);
        org.junit.Assert.assertNotNull(nodeList22);
    }

    @Test
    public void test0305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0305");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.nodes.Element element5 = document3.head();
        org.jsoup.nodes.Document.OutputSettings outputSettings6 = document3.outputSettings();
        org.jsoup.nodes.Element element7 = document3.nextElementSibling();
        java.lang.String str8 = element7.toString();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(outputSettings6);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\n<html>\n <head></head>\n <body></body>\n</html>" + "'", str8, "\n<html>\n <head></head>\n <body></body>\n</html>");
    }

    @Test
    public void test0306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0306");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.select.Elements elements6 = document3.getElementsByIndexLessThan((int) (short) 10);
        org.jsoup.nodes.Element element8 = document3.val("");
        java.lang.String str9 = document3.outerHtml();
        org.jsoup.select.Elements elements11 = document3.getElementsByClass("#root");
        java.lang.String str12 = document3.tagName();
        java.lang.Integer int13 = document3.elementSiblingIndex();
        org.jsoup.nodes.Document document15 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document17 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element18 = document15.prependChild((org.jsoup.nodes.Node) document17);
        java.lang.String str19 = document15.tagName();
        org.jsoup.nodes.Document.OutputSettings outputSettings20 = document15.new OutputSettings();
        org.jsoup.nodes.Element element22 = document15.createElement("<#root value=\"&lt;html&gt;\n &lt;head&gt;&lt;/head&gt;\n &lt;body&gt;&lt;/body&gt;\n&lt;/html&gt;\">\n <html>\n  <head></head>\n  <body></body>\n </html>\n</#root>#root\n<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.nodes.Element element23 = document3.prependChild((org.jsoup.nodes.Node) document15);
        org.jsoup.nodes.Element element25 = document15.getElementById("body");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str9, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "#root" + "'", str12, "#root");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(document15);
        org.junit.Assert.assertNotNull(document17);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "#root" + "'", str19, "#root");
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertNull(element25);
    }

    @Test
    public void test0307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0307");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = document3.absUrl("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
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
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(elements15);
    }

    @Test
    public void test0308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0308");
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
        org.jsoup.nodes.Element element18 = document3.removeClass("hi!");
        org.jsoup.select.Elements elements20 = document3.getElementsMatchingText("");
        org.jsoup.select.Elements elements23 = document3.getElementsByAttributeValueContaining("<head></head>\n<body></body>", "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str5, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str6, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(elements16);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNotNull(elements20);
        org.junit.Assert.assertNotNull(elements23);
    }

    @Test
    public void test0309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0309");
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
        org.jsoup.nodes.Document document18 = element14.ownerDocument();
        org.jsoup.nodes.Element element19 = document18.body();
        java.lang.String str21 = element19.absUrl("<head></head>\n<body></body>");
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
        org.junit.Assert.assertNotNull(document18);
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test0310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0310");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.select.Elements elements6 = document3.getElementsByIndexLessThan((int) (short) 10);
        org.jsoup.nodes.Element element8 = document3.val("");
        org.jsoup.nodes.Element element10 = element8.val("hi!");
        org.jsoup.select.Elements elements11 = element8.siblingElements();
        org.jsoup.select.Elements elements13 = element8.getElementsByAttributeStarting("\n<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(elements13);
    }

    @Test
    public void test0311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0311");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements30 = element10.getElementsByAttributeValueNot("<html>\n <head></head>\n <body></body>\n</html>&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;<<html> <head></head> <body> </body> </html>></<html> <head></head> <body> </body> </html>>", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
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
    }

    @Test
    public void test0312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0312");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.select.Elements elements6 = document3.getElementsByIndexLessThan((int) (short) 10);
        org.jsoup.nodes.Element element8 = document3.val("");
        org.jsoup.nodes.Element element10 = element8.val("hi!");
        org.jsoup.nodes.Element element12 = element10.prependText("");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements14 = element10.select("&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt;&lt;/body&gt; &lt;/html&gt;&amp;lt;html&amp;gt; &amp;lt;head&amp;gt;&amp;lt;/head&amp;gt; &amp;lt;body&amp;gt; &amp;lt;/body&amp;gt; &amp;lt;/html&amp;gt;<#root>\n <html>\n  <head></head>\n  <body></body>\n </html>\n</#root>\n<html>\n <head></head>\n <body></body>\n</html>");
            org.junit.Assert.fail("Expected exception of type org.jsoup.select.Selector.SelectorParseException; message: Could not parse query '&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt;&lt;/body&gt; &lt;/html&gt;&amp;lt;html&amp;gt; &amp;lt;head&amp;gt;&amp;lt;/head&amp;gt; &amp;lt;body&amp;gt; &amp;lt;/body&amp;gt; &amp;lt;/html&amp;gt;<#root>? <html>?  <head></head>?  <body></body>? </html>?</#root>?<html>? <head></head>? <body></body>?</html>': unexpected token at '&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt;&lt;/body&gt; &lt;/html&gt;&amp;lt;html&amp;gt; &amp;lt;head&amp;gt;&amp;lt;/head&amp;gt; &amp;lt;body&amp;gt; &amp;lt;/body&amp;gt; &amp;lt;/html&amp;gt;<#root>? <html>?  <head></head>?  <body></body>? </html>?</#root>?<html>? <head></head>? <body></body>?</html>'");
        } catch (org.jsoup.select.Selector.SelectorParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element12);
    }

    @Test
    public void test0313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0313");
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
        org.jsoup.select.Elements elements18 = document3.getElementsMatchingText("");
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
        org.junit.Assert.assertNotNull(elements18);
    }

    @Test
    public void test0314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0314");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        java.lang.String str3 = document1.absUrl("<html> <head></head> <body> </body> </html>");
        org.jsoup.select.Elements elements5 = document1.getElementsContainingOwnText("<html>\n <head></head>\n <body></body>\n</html>&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;");
        org.jsoup.nodes.Element element7 = document1.html("<html>\n <head></head>\n <body>\n </body>\n</html>");
        org.jsoup.nodes.Element element9 = element7.val("#document");
        org.jsoup.select.Elements elements11 = element9.getElementsByClass("#document <html> <head></head> <body></body> </html>&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(elements11);
    }

    @Test
    public void test0315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0315");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.select.Elements elements6 = document3.getElementsByIndexLessThan((int) (short) 10);
        org.jsoup.nodes.Element element8 = document3.val("");
        org.jsoup.nodes.Element element10 = document3.after("#root");
        org.jsoup.nodes.Document document11 = document3.ownerDocument();
        org.jsoup.nodes.Element element14 = document3.attr("#root", "<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.nodes.Element element16 = element14.removeClass("");
        boolean boolean18 = element16.hasAttr("<head></head>\n<body></body>");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(document11);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test0316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0316");
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
        org.jsoup.nodes.Element element14 = document11.before(" html");
        org.jsoup.nodes.Element element16 = element14.prependText(" html");
        org.jsoup.select.Elements elements18 = element14.getElementsMatchingOwnText("<html>\n <head></head>\n <body>\n </body>\n</html>");
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
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(elements18);
    }

    @Test
    public void test0317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0317");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node25 = document3.childNode((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 35 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
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
    }

    @Test
    public void test0318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0318");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.select.Elements elements6 = document3.getElementsByIndexLessThan((int) (short) 10);
        org.jsoup.nodes.Element element8 = document3.val("");
        java.lang.String str9 = document3.outerHtml();
        org.jsoup.select.Elements elements11 = document3.getElementsByClass("#root");
        java.lang.String str12 = document3.tagName();
        org.jsoup.nodes.Node node14 = document3.childNode(0);
        org.jsoup.nodes.Element element16 = document3.appendElement("<html>\n <head></head>\n <body></body>\n</html>&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;");
        org.jsoup.nodes.Element element18 = document3.prependText("<html> <head></head> <body></body> </html>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element20 = element18.child((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 2");
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
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(element18);
    }

    @Test
    public void test0319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0319");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        java.lang.String str5 = document3.html();
        java.lang.String str6 = document3.html();
        java.util.Map<java.lang.String, java.lang.String> strMap7 = document3.dataset();
        org.jsoup.nodes.Element element9 = document3.appendText("<html>\n <head></head>\n <body>\n </body>\n</html>");
        boolean boolean10 = document3.isBlock();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str5, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str6, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0320");
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
        boolean boolean19 = document3.hasClass("<html>\n <head></head>\n <body></body>\n</html>&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;<<html> <head></head> <body> </body> </html>></<html> <head></head> <body> </body> </html>>");
        org.jsoup.nodes.Document.OutputSettings outputSettings20 = document3.outputSettings();
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
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(outputSettings20);
    }

    @Test
    public void test0321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0321");
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
        java.lang.String str27 = document3.baseUri();
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
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
    }

    @Test
    public void test0322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0322");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.select.Elements elements6 = document3.getElementsByIndexLessThan((int) (short) 10);
        org.jsoup.nodes.Element element8 = document3.val("");
        java.lang.String str9 = document3.outerHtml();
        org.jsoup.select.Elements elements12 = document3.getElementsByAttributeValueStarting("#root", "<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.select.Elements elements13 = document3.parents();
        boolean boolean14 = document3.hasText();
        org.jsoup.select.Elements elements16 = document3.getElementsContainingOwnText("html");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str9, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(elements16);
    }

    @Test
    public void test0323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0323");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.select.Elements elements6 = document3.getElementsByIndexLessThan((int) (short) 10);
        java.util.Set<java.lang.String> strSet7 = document3.classNames();
        org.jsoup.nodes.Element element9 = document3.getElementById("hi!");
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = document3.new OutputSettings();
        org.jsoup.nodes.Element element12 = document3.appendElement("hi!");
        org.jsoup.select.Elements elements13 = element12.parents();
        org.jsoup.nodes.Document document15 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document17 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element18 = document15.prependChild((org.jsoup.nodes.Node) document17);
        org.jsoup.select.Elements elements20 = document17.getElementsByIndexLessThan((int) (short) 10);
        org.jsoup.nodes.Document document22 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document24 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element25 = document22.prependChild((org.jsoup.nodes.Node) document24);
        org.jsoup.select.Elements elements27 = document24.getElementsByIndexLessThan((int) (short) 10);
        boolean boolean28 = document17.equals((java.lang.Object) (short) 10);
        org.jsoup.nodes.Node node29 = document17.nextSibling();
        org.jsoup.nodes.Element element30 = element12.appendChild(node29);
        java.lang.String str31 = element12.baseUri();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertNull(element9);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertNotNull(document15);
        org.junit.Assert.assertNotNull(document17);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNotNull(elements20);
        org.junit.Assert.assertNotNull(document22);
        org.junit.Assert.assertNotNull(document24);
        org.junit.Assert.assertNotNull(element25);
        org.junit.Assert.assertNotNull(elements27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertNotNull(element30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
    }

    @Test
    public void test0324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0324");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.select.Elements elements6 = document3.getElementsByIndexLessThan((int) (short) 10);
        org.jsoup.nodes.Element element8 = document3.val("");
        org.jsoup.nodes.Element element10 = element8.val("hi!");
        org.jsoup.select.Elements elements12 = element8.getElementsByIndexEquals((int) (short) 100);
        java.lang.String str13 = element8.tagName();
        org.jsoup.select.Elements elements14 = element8.parents();
        org.jsoup.select.Elements elements16 = element8.getElementsByIndexGreaterThan((int) (short) 100);
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "#root" + "'", str13, "#root");
        org.junit.Assert.assertNotNull(elements14);
        org.junit.Assert.assertNotNull(elements16);
    }

    @Test
    public void test0325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0325");
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
        java.lang.String str25 = element24.ownText();
        org.jsoup.nodes.Element element27 = element24.val("<html>\n <head></head>\n <body></body>\n</html>&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;");
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
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(element27);
    }

    @Test
    public void test0326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0326");
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
        org.jsoup.select.Elements elements19 = element16.getElementsByAttributeValueMatching("#document <html> <head></head> <body></body> </html>&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;", "<html> <head> <title>&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt;&lt;/body&gt; &lt;/html&gt;</title> </head> <body></body> </html>");
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
    }

    @Test
    public void test0327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0327");
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
        org.jsoup.nodes.Element element20 = element19.previousElementSibling();
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
        org.junit.Assert.assertNull(element20);
    }

    @Test
    public void test0328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0328");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        java.lang.String str5 = document3.nodeName();
        boolean boolean7 = document3.hasClass(" html");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements9 = document3.select("<html> <head> <title>&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt;&lt;/body&gt; &lt;/html&gt;</title> </head> <body></body> </html>");
            org.junit.Assert.fail("Expected exception of type org.jsoup.select.Selector.SelectorParseException; message: Could not parse query '<html> <head> <title>&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt;&lt;/body&gt; &lt;/html&gt;</title> </head> <body></body> </html>': unexpected token at '<html> <head> <title>&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt;&lt;/body&gt; &lt;/html&gt;</title> </head> <body></body> </html>'");
        } catch (org.jsoup.select.Selector.SelectorParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#document" + "'", str5, "#document");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0329");
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
        java.util.Map<java.lang.String, java.lang.String> strMap18 = element17.dataset();
        java.lang.String str20 = element17.absUrl("#root");
        org.jsoup.select.Elements elements22 = element17.getElementsByTag(" hi!");
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
        org.junit.Assert.assertNotNull(strMap18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(elements22);
    }

    @Test
    public void test0330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0330");
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
        java.lang.String str16 = document15.toString();
        document15.title("<#root value=\"&lt;html&gt;\n &lt;head&gt;&lt;/head&gt;\n &lt;body&gt;&lt;/body&gt;\n&lt;/html&gt;\">\n <html>\n  <head></head>\n  <body></body>\n </html>\n</#root>#root\n<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.select.Elements elements21 = document15.getElementsByAttributeValueContaining("<html>\n <head></head>\n <body></body>\n</html>&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt; <html> <head></head> <body></body> </html> <html> <head></head> <body> </body> </html>", "<#root>\n <html>\n  <head></head>\n  <body></body>\n </html>\n</#root>\n<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(document15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "<#root value=\"&lt;html&gt;\n &lt;head&gt;&lt;/head&gt;\n &lt;body&gt;&lt;/body&gt;\n&lt;/html&gt;\">\n <html>\n  <head></head>\n  <body></body>\n </html>\n</#root>#root\n<html>\n <head></head>\n <body></body>\n</html>" + "'", str16, "<#root value=\"&lt;html&gt;\n &lt;head&gt;&lt;/head&gt;\n &lt;body&gt;&lt;/body&gt;\n&lt;/html&gt;\">\n <html>\n  <head></head>\n  <body></body>\n </html>\n</#root>#root\n<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertNotNull(elements21);
    }

    @Test
    public void test0331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0331");
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
        org.jsoup.select.Elements elements23 = element20.getElementsByAttributeValueNot("\n<body></body>", "<#root value=\"\" #root=\"&lt;html&gt;\n &lt;head&gt;&lt;/head&gt;\n &lt;body&gt;&lt;/body&gt;\n&lt;/html&gt;\" class=\"\">\n <html>\n  <head></head>\n  <body></body>\n </html><<html>\n <head></head>\n <body>\n </body>\n</html>></<html>\n <head></head>\n <body>\n </body>\n</html>>\n</#root>");
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
        org.junit.Assert.assertNotNull(elements23);
    }

    @Test
    public void test0332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0332");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.select.Elements elements6 = document3.getElementsByIndexLessThan((int) (short) 10);
        org.jsoup.nodes.Element element8 = document3.val("");
        org.jsoup.nodes.Element element10 = document3.after("#root");
        org.jsoup.nodes.Document document11 = document3.ownerDocument();
        org.jsoup.nodes.Element element14 = document3.attr("#root", "<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.select.Elements elements16 = element14.getElementsByAttribute("<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.nodes.Element element18 = element14.appendElement("&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt;&lt;/body&gt; &lt;/html&gt;&amp;lt;html&amp;gt; &amp;lt;head&amp;gt;&amp;lt;/head&amp;gt; &amp;lt;body&amp;gt; &amp;lt;/body&amp;gt; &amp;lt;/html&amp;gt;<#root>\n <html>\n  <head></head>\n  <body></body>\n </html>\n</#root>\n<html>\n <head></head>\n <body></body>\n</html>");
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
    }

    @Test
    public void test0333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0333");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.nodes.Element element5 = document1.body();
        java.lang.String str6 = element5.html();
        org.jsoup.nodes.Element element8 = element5.appendText("<html>\n <head></head>\n <body></body>\n</html>&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;<<html> <head></head> <body> </body> </html>></<html> <head></head> <body> </body> </html>>");
        org.jsoup.nodes.Element element10 = element8.append(" html");
        java.util.regex.Pattern pattern11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements12 = element8.getElementsMatchingOwnText(pattern11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
    }

    @Test
    public void test0334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0334");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.select.Elements elements6 = document3.getElementsByIndexLessThan((int) (short) 10);
        org.jsoup.nodes.Element element8 = document3.val("");
        org.jsoup.nodes.Element element10 = element8.val("hi!");
        org.jsoup.nodes.Element element12 = element10.prependText("");
        java.util.Set<java.lang.String> strSet13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element14 = element10.classNames(strSet13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element12);
    }

    @Test
    public void test0335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0335");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.select.Elements elements6 = document3.getElementsByIndexLessThan((int) (short) 10);
        java.util.Set<java.lang.String> strSet7 = document3.classNames();
        org.jsoup.nodes.Element element10 = document3.attr("<html>\n <head></head>\n <body></body>\n</html>", "#root");
        org.jsoup.nodes.Document document11 = element10.ownerDocument();
        org.jsoup.select.Elements elements13 = element10.getElementsByIndexGreaterThan(10);
        org.jsoup.nodes.Element element15 = element10.toggleClass("#document <html> <head></head> <body></body> </html>&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;");
        org.jsoup.select.Elements elements17 = element15.getElementsByIndexLessThan(2);
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(document11);
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(elements17);
    }

    @Test
    public void test0336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0336");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        java.lang.String str5 = document3.html();
        java.lang.String str6 = document3.html();
        java.util.Map<java.lang.String, java.lang.String> strMap7 = document3.dataset();
        org.jsoup.nodes.Element element9 = document3.appendElement("hi!");
        org.jsoup.nodes.Element element10 = document3.body();
        org.jsoup.select.Elements elements11 = element10.getAllElements();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str5, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str6, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(elements11);
    }

    @Test
    public void test0337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0337");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        java.lang.String str3 = document1.absUrl("<html> <head></head> <body> </body> </html>");
        org.jsoup.select.Elements elements5 = document1.getElementsContainingOwnText("<html>\n <head></head>\n <body></body>\n</html>&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;");
        org.jsoup.nodes.Element element6 = document1.head();
        org.jsoup.select.Elements elements8 = element6.getElementsByIndexEquals((int) '#');
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(elements8);
    }

    @Test
    public void test0338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0338");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements23 = element19.select("<#root>\n <html>\n  <head></head>\n  <body></body>\n </html>\n</#root>\n<html>\n <head></head>\n <body></body>\n</html>");
            org.junit.Assert.fail("Expected exception of type org.jsoup.select.Selector.SelectorParseException; message: Could not parse query '<#root>? <html>?  <head></head>?  <body></body>? </html>?</#root>?<html>? <head></head>? <body></body>?</html>': unexpected token at '<#root>? <html>?  <head></head>?  <body></body>? </html>?</#root>?<html>? <head></head>? <body></body>?</html>'");
        } catch (org.jsoup.select.Selector.SelectorParseException e) {
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
    }

    @Test
    public void test0339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0339");
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
        org.jsoup.nodes.Element element25 = element9.attr("html", "<html>\n <head></head>\n <body></body>\n</html>&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;<<html> <head></head> <body> </body> </html>></<html> <head></head> <body> </body> </html>>");
        org.jsoup.nodes.Document document26 = element9.ownerDocument();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element28 = element9.appendElement("");
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
        org.junit.Assert.assertNotNull(document11);
        org.junit.Assert.assertNotNull(document13);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(elements16);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertNotNull(elements21);
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertNotNull(element25);
        org.junit.Assert.assertNotNull(document26);
    }

    @Test
    public void test0340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0340");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.nodes.Element element6 = element4.child((int) (short) 0);
        java.util.Set<java.lang.String> strSet7 = element6.classNames();
        org.jsoup.select.Elements elements10 = element6.getElementsByAttributeValueEnding(" html", "<html> <head></head> <body> </body> </html>");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertNotNull(elements10);
    }

    @Test
    public void test0341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0341");
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
        org.jsoup.nodes.Element element20 = document19.head();
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
    }

    @Test
    public void test0342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0342");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("#document");
        org.jsoup.select.Elements elements3 = document1.getElementsContainingOwnText("<html>\n <head>\n  <title>&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;</title>\n </head>\n <body></body>\n</html>");
        org.jsoup.nodes.Document.OutputSettings outputSettings4 = document1.new OutputSettings();
        org.jsoup.nodes.Node node5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element6 = document1.prependChild(node5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(elements3);
    }

    @Test
    public void test0343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0343");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.nodes.Element element5 = document3.head();
        java.lang.Integer int6 = document3.elementSiblingIndex();
        org.jsoup.nodes.Node node7 = document3.previousSibling();
        org.jsoup.select.Elements elements9 = document3.getElementsByIndexEquals((int) ' ');
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNotNull(elements9);
    }

    @Test
    public void test0344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0344");
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
        org.jsoup.nodes.Document document18 = element14.ownerDocument();
        java.lang.String str19 = document18.nodeName();
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
        org.junit.Assert.assertNotNull(document18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "#document" + "'", str19, "#document");
    }

    @Test
    public void test0345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0345");
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
        java.lang.Integer int21 = element20.siblingIndex();
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
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test0346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0346");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element3 = document1.text("");
        org.jsoup.nodes.Element element5 = document1.append("<html>\n <head></head>\n <body>\n </body>\n</html>");
        org.jsoup.nodes.Element element6 = document1.empty();
        java.lang.Integer int7 = element6.siblingIndex();
        boolean boolean8 = element6.isBlock();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0347");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.select.Elements elements6 = document3.getElementsByIndexLessThan((int) (short) 10);
        org.jsoup.nodes.Element element8 = document3.val("");
        org.jsoup.nodes.Element element10 = document3.after("#root");
        org.jsoup.select.Elements elements13 = document3.getElementsByAttributeValue("<html>\n <head></head>\n <body>\n </body>\n</html>\n<html> \n <head></head> \n <body>  \n </body>\n</html>", " html");
        org.jsoup.nodes.Element element14 = document3.body();
        org.jsoup.select.Elements elements15 = document3.parents();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(elements15);
    }

    @Test
    public void test0348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0348");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.select.Elements elements6 = document3.getElementsByIndexLessThan((int) (short) 10);
        org.jsoup.nodes.Element element8 = document3.val("");
        org.jsoup.nodes.Element element10 = element8.val("hi!");
        java.lang.String str11 = element10.className();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements14 = element10.getElementsByAttributeValueContaining("<html>\n <head></head>\n <body>\n </body>\n</html>\n<html> \n <head></head> \n <body>  \n </body>\n</html>", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test0349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0349");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.select.Elements elements6 = document3.getElementsByIndexLessThan((int) (short) 10);
        org.jsoup.nodes.Element element8 = document3.val("");
        org.jsoup.nodes.Element element10 = element8.val("hi!");
        org.jsoup.nodes.Element element12 = element10.prependText("");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node14 = element12.childNode((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element12);
    }

    @Test
    public void test0350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0350");
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
        // The following exception was thrown during execution in test generation
        try {
            element9.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
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
    }

    @Test
    public void test0351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0351");
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
        java.lang.String str18 = document3.html();
        org.jsoup.nodes.Document.OutputSettings outputSettings19 = document3.new OutputSettings();
        org.jsoup.nodes.Document document21 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document23 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element24 = document21.prependChild((org.jsoup.nodes.Node) document23);
        java.lang.String str25 = document23.html();
        java.lang.String str26 = document23.html();
        document23.title("<html>\n <head></head>\n <body></body>\n</html>");
        java.util.regex.Pattern pattern30 = null;
        org.jsoup.select.Elements elements31 = document23.getElementsByAttributeValueMatching("hi!", pattern30);
        java.util.List<org.jsoup.nodes.Node> nodeList32 = document23.siblingNodes();
        org.jsoup.select.Elements elements33 = document23.parents();
        org.jsoup.select.Elements elements36 = document23.getElementsByAttributeValueEnding("<#root value=\"\" #root=\"&lt;html&gt;\n &lt;head&gt;&lt;/head&gt;\n &lt;body&gt;&lt;/body&gt;\n&lt;/html&gt;\" class=\"\">\n <html>\n  <head></head>\n  <body></body>\n </html><<html>\n <head></head>\n <body>\n </body>\n</html>></<html>\n <head></head>\n <body>\n </body>\n</html>>\n</#root>", "<html>\n <head></head>\n <body>\n </body>\n</html>\n<html> \n <head></head> \n <body>  \n </body>\n</html>");
        boolean boolean37 = document3.equals((java.lang.Object) "<html>\n <head></head>\n <body>\n </body>\n</html>\n<html> \n <head></head> \n <body>  \n </body>\n</html>");
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
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "<html>\n <head>\n  <title>&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;</title>\n </head>\n <body></body>\n</html>" + "'", str18, "<html>\n <head>\n  <title>&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;</title>\n </head>\n <body></body>\n</html>");
        org.junit.Assert.assertNotNull(document21);
        org.junit.Assert.assertNotNull(document23);
        org.junit.Assert.assertNotNull(element24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str25, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str26, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertNotNull(elements31);
        org.junit.Assert.assertNotNull(nodeList32);
        org.junit.Assert.assertNotNull(elements33);
        org.junit.Assert.assertNotNull(elements36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
    }

    @Test
    public void test0352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0352");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.parser.Tag tag5 = document3.tag();
        org.jsoup.nodes.Element element7 = document3.val("");
        element7.setBaseUri("");
        java.util.regex.Pattern pattern10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements11 = element7.getElementsMatchingOwnText(pattern10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(tag5);
        org.junit.Assert.assertNotNull(element7);
    }

    @Test
    public void test0353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0353");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        java.lang.String str5 = document3.html();
        boolean boolean6 = document3.hasText();
        org.jsoup.nodes.Element element8 = document3.html("<html>\n <head></head>\n <body></body>\n</html>&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt; <html> <head></head> <body></body> </html> <html> <head></head> <body> </body> </html>");
        org.jsoup.parser.Tag tag9 = document3.tag();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str5, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(tag9);
    }

    @Test
    public void test0354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0354");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.select.Elements elements6 = document3.getElementsByIndexLessThan((int) (short) 10);
        java.util.Set<java.lang.String> strSet7 = document3.classNames();
        org.jsoup.nodes.Element element9 = document3.getElementById("hi!");
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = document3.new OutputSettings();
        org.jsoup.nodes.Element element12 = document3.appendElement("hi!");
        org.jsoup.nodes.Element element13 = document3.body();
        org.jsoup.select.Elements elements15 = document3.getElementsByIndexLessThan((int) (short) 1);
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertNull(element9);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(elements15);
    }

    @Test
    public void test0355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0355");
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
        org.jsoup.nodes.Element element25 = element9.attr("html", "<html>\n <head></head>\n <body></body>\n</html>&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;<<html> <head></head> <body> </body> </html>></<html> <head></head> <body> </body> </html>>");
        org.jsoup.nodes.Document document26 = element9.ownerDocument();
        org.jsoup.nodes.Document document27 = document26.normalise();
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
        org.junit.Assert.assertNotNull(element25);
        org.junit.Assert.assertNotNull(document26);
        org.junit.Assert.assertNotNull(document27);
    }

    @Test
    public void test0356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0356");
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
        java.util.Set<java.lang.String> strSet18 = element13.classNames();
        boolean boolean19 = element13.hasText();
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
        org.junit.Assert.assertNotNull(strSet18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test0357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0357");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.select.Elements elements6 = document3.getElementsByIndexLessThan((int) (short) 10);
        org.jsoup.nodes.Element element8 = document3.val("");
        java.lang.String str9 = document3.outerHtml();
        org.jsoup.select.Elements elements12 = document3.getElementsByAttributeValueStarting("#root", "<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.select.Elements elements13 = document3.parents();
        boolean boolean14 = document3.hasText();
        org.jsoup.nodes.Element element16 = document3.addClass("");
        org.jsoup.nodes.Document document18 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document20 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element21 = document18.prependChild((org.jsoup.nodes.Node) document20);
        org.jsoup.select.Elements elements23 = document20.getElementsByIndexLessThan((int) (short) 10);
        org.jsoup.nodes.Element element25 = document20.val("");
        java.lang.String str26 = document20.outerHtml();
        org.jsoup.select.Elements elements28 = document20.getElementsByClass("#root");
        java.lang.String str29 = document20.tagName();
        org.jsoup.select.Elements elements30 = document20.getAllElements();
        org.jsoup.nodes.Document document32 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document34 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element35 = document32.prependChild((org.jsoup.nodes.Node) document34);
        java.lang.String str36 = document34.html();
        java.lang.String str37 = document34.html();
        document34.title("<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.select.Elements elements40 = document34.getAllElements();
        boolean boolean41 = document20.equals((java.lang.Object) elements40);
        boolean boolean43 = document20.hasAttr("<html>\n <head></head>\n <body>\n </body>\n</html>");
        org.jsoup.nodes.Element element45 = document20.prependElement("#document");
        org.jsoup.nodes.Element element46 = document3.appendChild((org.jsoup.nodes.Node) document20);
        org.jsoup.select.Elements elements48 = document3.getElementsByClass("<html>\n <head></head>\n <body>\n  &lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt; \n </body>\n</html><<html> <head></head> <body> </body> </html>></<html> <head></head> <body> </body> </html>>");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str9, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(document18);
        org.junit.Assert.assertNotNull(document20);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertNotNull(elements23);
        org.junit.Assert.assertNotNull(element25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str26, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertNotNull(elements28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "#root" + "'", str29, "#root");
        org.junit.Assert.assertNotNull(elements30);
        org.junit.Assert.assertNotNull(document32);
        org.junit.Assert.assertNotNull(document34);
        org.junit.Assert.assertNotNull(element35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str36, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str37, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertNotNull(elements40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(element45);
        org.junit.Assert.assertNotNull(element46);
        org.junit.Assert.assertNotNull(elements48);
    }

    @Test
    public void test0358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0358");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        java.lang.String str5 = document3.html();
        java.lang.String str6 = document3.html();
        org.jsoup.nodes.Document.OutputSettings outputSettings7 = document3.new OutputSettings();
        boolean boolean8 = outputSettings7.prettyPrint();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str5, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str6, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0359");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element2 = document1.body();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element3 = element2.firstElementSibling();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(element2);
    }

    @Test
    public void test0360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0360");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.select.Elements elements6 = document3.getElementsByIndexLessThan((int) (short) 10);
        org.jsoup.nodes.Element element8 = document3.val("");
        java.lang.String str9 = document3.outerHtml();
        org.jsoup.select.Elements elements11 = document3.getElementsByClass("#root");
        org.jsoup.select.Elements elements13 = document3.getElementsByIndexGreaterThan(10);
        org.jsoup.select.Elements elements15 = document3.getElementsByAttributeStarting("<html> <head></head> <body> </body> </html>");
        org.jsoup.select.Elements elements17 = document3.getElementsByIndexLessThan((int) (short) 100);
        org.jsoup.select.Elements elements20 = document3.getElementsByAttributeValueContaining("<html> <head></head> <body></body> </html>", "<html>\n <head></head>\n <body></body>\n</html>&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str9, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertNotNull(elements17);
        org.junit.Assert.assertNotNull(elements20);
    }

    @Test
    public void test0361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0361");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        java.lang.String str5 = document3.html();
        java.lang.String str6 = document3.html();
        java.util.Map<java.lang.String, java.lang.String> strMap7 = document3.dataset();
        org.jsoup.nodes.Element element8 = document3.head();
        org.jsoup.select.Elements elements10 = document3.getElementsByAttribute("html");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node12 = document3.childNode((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str5, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str6, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(elements10);
    }

    @Test
    public void test0362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0362");
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
        node15.setBaseUri("");
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
    }

    @Test
    public void test0363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0363");
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
        org.jsoup.nodes.Element element17 = document3.lastElementSibling();
        org.jsoup.select.Elements elements18 = element17.siblingElements();
        org.jsoup.nodes.Element element20 = element17.removeClass("#document <html> <head></head> <body></body> </html>&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;");
        java.lang.String str21 = element17.html();
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
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(elements18);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "<head></head>\n<body></body>" + "'", str21, "<head></head>\n<body></body>");
    }

    @Test
    public void test0364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0364");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.select.Elements elements6 = document3.getElementsByIndexLessThan((int) (short) 10);
        org.jsoup.nodes.Element element8 = document3.val("");
        org.jsoup.nodes.Element element10 = element8.val("hi!");
        org.jsoup.select.Elements elements11 = element8.siblingElements();
        java.util.List<org.jsoup.nodes.Node> nodeList12 = element8.siblingNodes();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(nodeList12);
    }

    @Test
    public void test0365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0365");
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
        java.util.Set<java.lang.String> strSet17 = element13.classNames();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node19 = element13.removeAttr("");
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
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(strSet17);
    }

    @Test
    public void test0366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0366");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("<html>\n <head></head>\n <body>\n  &lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt; &lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;\n </body>\n</html>\n<html> \n <head></head> \n <body>  \n </body>\n</html>");
    }

    @Test
    public void test0367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0367");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element24 = element3.before("<html> <head></head> <body></body> </html>");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
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
    }

    @Test
    public void test0368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0368");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        java.lang.String str5 = document3.html();
        boolean boolean6 = document3.hasText();
        org.jsoup.nodes.Element element8 = document3.prependText("<html>\n <head></head>\n <body>\n </body>\n</html>");
        java.lang.Class<?> wildcardClass9 = document3.getClass();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str5, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0369");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.select.Elements elements6 = document3.getElementsByIndexLessThan((int) (short) 10);
        org.jsoup.nodes.Element element8 = document3.val("");
        org.jsoup.nodes.Element element10 = element8.val("hi!");
        org.jsoup.nodes.Attributes attributes11 = element8.attributes();
        org.jsoup.nodes.Element element12 = element8.previousElementSibling();
        org.jsoup.nodes.Document document13 = element8.ownerDocument();
        element8.remove();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(attributes11);
        org.junit.Assert.assertNull(element12);
        org.junit.Assert.assertNotNull(document13);
    }

    @Test
    public void test0370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0370");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        java.lang.String str5 = document3.className();
        org.jsoup.nodes.Element element6 = document3.lastElementSibling();
        org.jsoup.nodes.Document document7 = document3.normalise();
        java.util.List<org.jsoup.nodes.Node> nodeList8 = document3.siblingNodes();
        org.jsoup.nodes.Element element10 = document3.prepend("<#root value=\"&lt;html&gt;\n &lt;head&gt;&lt;/head&gt;\n &lt;body&gt;&lt;/body&gt;\n&lt;/html&gt;\">\n <html>\n  <head></head>\n  <body></body>\n </html>\n</#root>#root\n<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.select.Elements elements11 = element10.siblingElements();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(document7);
        org.junit.Assert.assertNotNull(nodeList8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(elements11);
    }

    @Test
    public void test0371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0371");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        java.lang.String str5 = document3.html();
        java.lang.String str6 = document3.html();
        java.util.Map<java.lang.String, java.lang.String> strMap7 = document3.dataset();
        org.jsoup.nodes.Element element9 = document3.appendElement("hi!");
        org.jsoup.nodes.Element element10 = document3.body();
        org.jsoup.nodes.Element element12 = element10.prependText("<html>\n <head></head>\n <body>\n </body>\n</html>\n<html> \n <head></head> \n <body>  \n </body>\n</html>");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str5, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str6, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element12);
    }

    @Test
    public void test0372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0372");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        java.lang.String str5 = document3.html();
        java.lang.String str6 = document3.html();
        java.util.Map<java.lang.String, java.lang.String> strMap7 = document3.dataset();
        org.jsoup.nodes.Element element8 = document3.head();
        java.lang.String str10 = element8.absUrl("\n<body></body>");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str5, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str6, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test0373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0373");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.select.Elements elements6 = document3.getElementsByIndexLessThan((int) (short) 10);
        org.jsoup.nodes.Element element8 = document3.val("");
        java.lang.String str9 = document3.outerHtml();
        org.jsoup.select.Elements elements12 = document3.getElementsByAttributeValueStarting("#root", "<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.select.Elements elements13 = document3.parents();
        org.jsoup.nodes.Document.OutputSettings outputSettings14 = document3.new OutputSettings();
        org.jsoup.nodes.Element element15 = document3.head();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str9, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertNotNull(element15);
    }

    @Test
    public void test0374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0374");
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
        org.jsoup.select.Elements elements19 = element17.getElementsByIndexEquals((int) 'a');
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
        org.junit.Assert.assertNotNull(elements19);
    }

    @Test
    public void test0375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0375");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.select.Elements elements6 = document3.getElementsByIndexLessThan((int) (short) 10);
        org.jsoup.nodes.Element element8 = document3.val("");
        org.jsoup.nodes.Element element10 = document3.after("#root");
        org.jsoup.nodes.Document document11 = document3.ownerDocument();
        org.jsoup.nodes.Element element14 = document3.attr("#root", "<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.nodes.Element element16 = element14.removeClass("");
        org.jsoup.nodes.Element element17 = element14.parent();
        org.jsoup.select.Elements elements19 = element14.getElementsByClass("#document");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(document11);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(elements19);
    }

    @Test
    public void test0376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0376");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("body");
        org.junit.Assert.assertNotNull(document1);
    }

    @Test
    public void test0377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0377");
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
        org.jsoup.select.Elements elements17 = element14.getAllElements();
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
        org.junit.Assert.assertNotNull(elements17);
    }

    @Test
    public void test0378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0378");
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
        org.jsoup.nodes.Element element18 = element16.appendElement("<html> <head></head> <body></body> </html>");
        java.lang.String str20 = element16.attr("<head></head>\n<body></body>");
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
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test0379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0379");
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
        java.util.Set<java.lang.String> strSet18 = element13.classNames();
        java.util.Set<java.lang.String> strSet19 = element13.classNames();
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
        org.junit.Assert.assertNotNull(strSet18);
        org.junit.Assert.assertNotNull(strSet19);
    }

    @Test
    public void test0380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0380");
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
        org.jsoup.parser.Tag tag21 = document14.tag();
        java.lang.Class<?> wildcardClass22 = document14.getClass();
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
        org.junit.Assert.assertNotNull(tag21);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0381");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("#root");
        org.jsoup.nodes.Document.OutputSettings outputSettings2 = document1.outputSettings();
        org.jsoup.nodes.Element element4 = document1.removeClass("hi!");
        org.jsoup.nodes.Element element6 = document1.appendText("<html>\n <head></head>\n <body>\n </body>\n</html>");
        org.jsoup.select.Elements elements9 = document1.getElementsByAttributeValueContaining("<html> <head></head> <body></body> </html>", "&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt;&lt;/body&gt; &lt;/html&gt;&amp;lt;html&amp;gt; &amp;lt;head&amp;gt;&amp;lt;/head&amp;gt; &amp;lt;body&amp;gt; &amp;lt;/body&amp;gt; &amp;lt;/html&amp;gt;<#root>\n <html>\n  <head></head>\n  <body></body>\n </html>\n</#root>\n<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.nodes.Attributes attributes10 = document1.attributes();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(outputSettings2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertNotNull(attributes10);
    }

    @Test
    public void test0382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0382");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.select.Elements elements6 = document3.getElementsByIndexLessThan((int) (short) 10);
        java.util.Set<java.lang.String> strSet7 = document3.classNames();
        org.jsoup.select.Elements elements10 = document3.getElementsByAttributeValueNot("<html> <head></head> <body> </body> </html>", "#root");
        org.jsoup.select.Elements elements12 = document3.getElementsByIndexGreaterThan((int) (byte) -1);
        java.lang.String str13 = document3.className();
        java.lang.String str14 = document3.ownText();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test0383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0383");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element3 = document1.text("");
        java.lang.String str4 = element3.html();
        org.jsoup.select.Elements elements7 = element3.getElementsByAttributeValueNot("hi!", "#root");
        org.jsoup.nodes.Element element8 = element3.empty();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements11 = element8.getElementsByAttributeValueNot("#document", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<html>\n <head></head>\n <body>\n </body>\n</html>" + "'", str4, "<html>\n <head></head>\n <body>\n </body>\n</html>");
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(element8);
    }

    @Test
    public void test0384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0384");
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
        java.lang.String str29 = document3.outerHtml();
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
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "<#document></#document>\n<html>\n <head></head>\n <body></body>\n</html>" + "'", str29, "<#document></#document>\n<html>\n <head></head>\n <body></body>\n</html>");
    }

    @Test
    public void test0385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0385");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.select.Elements elements6 = document3.getElementsByIndexLessThan((int) (short) 10);
        org.jsoup.nodes.Element element8 = document3.val("");
        org.jsoup.nodes.Element element10 = document3.after("#root");
        org.jsoup.nodes.Document document11 = document3.ownerDocument();
        org.jsoup.nodes.Element element14 = document3.attr("#root", "<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.nodes.Element element15 = document3.head();
        java.util.regex.Pattern pattern17 = null;
        org.jsoup.select.Elements elements18 = element15.getElementsByAttributeValueMatching("<html>\n <head>\n  <title>&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;</title>\n </head>\n <body></body>\n</html>", pattern17);
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(document11);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(elements18);
    }

    @Test
    public void test0386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0386");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.select.Elements elements6 = document3.getElementsByIndexLessThan((int) (short) 10);
        org.jsoup.nodes.Element element8 = document3.val("");
        java.lang.String str9 = document3.outerHtml();
        org.jsoup.select.Elements elements11 = document3.getElementsByClass("#root");
        org.jsoup.select.Elements elements13 = document3.getElementsByIndexGreaterThan(10);
        java.lang.String str14 = document3.tagName();
        java.lang.String str15 = document3.outerHtml();
        org.jsoup.nodes.Document document16 = document3.ownerDocument();
        org.jsoup.nodes.Document document18 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document20 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element21 = document18.prependChild((org.jsoup.nodes.Node) document20);
        org.jsoup.select.Elements elements23 = document20.getElementsByIndexLessThan((int) (short) 10);
        org.jsoup.nodes.Element element25 = document20.val("");
        java.lang.String str26 = document20.outerHtml();
        org.jsoup.select.Elements elements28 = document20.getElementsByClass("#root");
        java.lang.String str29 = document20.tagName();
        org.jsoup.select.Elements elements30 = document20.getAllElements();
        org.jsoup.nodes.Document document32 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document34 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element35 = document32.prependChild((org.jsoup.nodes.Node) document34);
        java.lang.String str36 = document34.html();
        java.lang.String str37 = document34.html();
        document34.title("<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.select.Elements elements40 = document34.getAllElements();
        boolean boolean41 = document20.equals((java.lang.Object) elements40);
        boolean boolean43 = document20.hasAttr("<html>\n <head></head>\n <body>\n </body>\n</html>");
        org.jsoup.nodes.Element element45 = document20.prependElement("#document");
        org.jsoup.nodes.Element element46 = document16.appendChild((org.jsoup.nodes.Node) document20);
        org.jsoup.select.Elements elements48 = element46.getElementsByIndexLessThan((int) (short) 1);
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str9, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "#root" + "'", str14, "#root");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str15, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertNotNull(document16);
        org.junit.Assert.assertNotNull(document18);
        org.junit.Assert.assertNotNull(document20);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertNotNull(elements23);
        org.junit.Assert.assertNotNull(element25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str26, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertNotNull(elements28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "#root" + "'", str29, "#root");
        org.junit.Assert.assertNotNull(elements30);
        org.junit.Assert.assertNotNull(document32);
        org.junit.Assert.assertNotNull(document34);
        org.junit.Assert.assertNotNull(element35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str36, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str37, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertNotNull(elements40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(element45);
        org.junit.Assert.assertNotNull(element46);
        org.junit.Assert.assertNotNull(elements48);
    }

    @Test
    public void test0387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0387");
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
        org.jsoup.nodes.Element element14 = document11.before(" html");
        java.lang.String str15 = document11.val();
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
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test0388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0388");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.select.Elements elements6 = document3.getElementsByIndexLessThan((int) (short) 10);
        org.jsoup.nodes.Element element8 = document3.val("");
        java.lang.String str9 = document3.outerHtml();
        org.jsoup.select.Elements elements11 = document3.getElementsByClass("#root");
        java.lang.String str12 = document3.tagName();
        java.lang.Integer int13 = document3.elementSiblingIndex();
        org.jsoup.nodes.Document document15 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document17 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element18 = document15.prependChild((org.jsoup.nodes.Node) document17);
        java.lang.String str19 = document15.tagName();
        org.jsoup.nodes.Document.OutputSettings outputSettings20 = document15.new OutputSettings();
        org.jsoup.nodes.Element element22 = document15.createElement("<#root value=\"&lt;html&gt;\n &lt;head&gt;&lt;/head&gt;\n &lt;body&gt;&lt;/body&gt;\n&lt;/html&gt;\">\n <html>\n  <head></head>\n  <body></body>\n </html>\n</#root>#root\n<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.nodes.Element element23 = document3.prependChild((org.jsoup.nodes.Node) document15);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements25 = document3.getElementsByAttribute("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
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
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(document15);
        org.junit.Assert.assertNotNull(document17);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "#root" + "'", str19, "#root");
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertNotNull(element23);
    }

    @Test
    public void test0389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0389");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.nodes.Element element6 = element4.child((int) (short) 0);
        java.util.Set<java.lang.String> strSet7 = element6.classNames();
        org.jsoup.select.Elements elements9 = element6.getElementsByIndexLessThan((-1));
        org.jsoup.select.Elements elements12 = element6.getElementsByAttributeValueMatching("", "hi!");
        element6.setBaseUri("");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertNotNull(elements12);
    }

    @Test
    public void test0390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0390");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        java.lang.String str3 = document1.absUrl("<html> <head></head> <body> </body> </html>");
        org.jsoup.select.Elements elements5 = document1.getElementsContainingOwnText("<html>\n <head></head>\n <body></body>\n</html>&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;");
        org.jsoup.select.Elements elements7 = document1.getElementsByTag(" html");
        org.jsoup.nodes.Element element9 = document1.getElementById("<html>\n <head></head>\n <body>\n </body>\n</html>");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNull(element9);
    }

    @Test
    public void test0391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0391");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.select.Elements elements6 = document3.getElementsByIndexLessThan((int) (short) 10);
        java.util.Set<java.lang.String> strSet7 = document3.classNames();
        org.jsoup.nodes.Element element9 = document3.getElementById("hi!");
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = document3.new OutputSettings();
        org.jsoup.nodes.Element element12 = document3.appendElement("hi!");
        org.jsoup.nodes.Document document14 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document16 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element17 = document14.prependChild((org.jsoup.nodes.Node) document16);
        org.jsoup.select.Elements elements19 = document16.getElementsByIndexLessThan((int) (short) 10);
        org.jsoup.nodes.Element element21 = document16.val("");
        org.jsoup.nodes.Element element23 = element21.val("hi!");
        org.jsoup.select.Elements elements24 = element21.siblingElements();
        org.jsoup.nodes.Element element26 = element21.prepend("");
        boolean boolean28 = element26.hasClass("<html>\n <head></head>\n <body>\n </body>\n</html>");
        org.jsoup.nodes.Element element30 = element26.before("<html> <head></head> <body> </body> </html>");
        java.util.Set<java.lang.String> strSet31 = element26.classNames();
        org.jsoup.nodes.Element element32 = document3.classNames(strSet31);
        java.util.regex.Pattern pattern33 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements34 = element32.getElementsMatchingText(pattern33);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertNull(element9);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(document14);
        org.junit.Assert.assertNotNull(document16);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(elements19);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertNotNull(elements24);
        org.junit.Assert.assertNotNull(element26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(element30);
        org.junit.Assert.assertNotNull(strSet31);
        org.junit.Assert.assertNotNull(element32);
    }

    @Test
    public void test0392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0392");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        java.lang.String str5 = document3.html();
        java.lang.String str6 = document3.html();
        org.jsoup.nodes.Document.OutputSettings outputSettings7 = document3.new OutputSettings();
        java.util.regex.Pattern pattern9 = null;
        org.jsoup.select.Elements elements10 = document3.getElementsByAttributeValueMatching("<html> <head></head> <body> </body> </html>", pattern9);
        java.util.regex.Pattern pattern11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements12 = document3.getElementsMatchingText(pattern11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str5, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str6, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertNotNull(elements10);
    }

    @Test
    public void test0393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0393");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        java.lang.String str5 = document3.html();
        java.lang.String str6 = document3.html();
        org.jsoup.nodes.Document document8 = org.jsoup.nodes.Document.createShell("");
        java.util.Set<java.lang.String> strSet9 = document8.classNames();
        org.jsoup.nodes.Element element10 = document3.classNames(strSet9);
        org.jsoup.nodes.Element element13 = document3.attr("hi!", "hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element15 = element13.child((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str5, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str6, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertNotNull(document8);
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element13);
    }

    @Test
    public void test0394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0394");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.select.Elements elements6 = document3.getElementsByIndexLessThan((int) (short) 10);
        org.jsoup.nodes.Element element8 = document3.val("");
        org.jsoup.nodes.Element element10 = document3.after("#root");
        java.lang.String str12 = document3.attr("<html>\n <head></head>\n <body>\n </body>\n</html>");
        org.jsoup.nodes.Element element14 = document3.appendText("#root");
        org.jsoup.select.Elements elements16 = element14.getElementsByIndexEquals((int) (short) 100);
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(elements16);
    }

    @Test
    public void test0395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0395");
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
        java.lang.String str18 = document3.outerHtml();
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
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "<html>\n <head>\n  <title>#document</title>\n </head>\n <body>\n  &lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt;&lt;/body&gt; &lt;/html&gt;&amp;lt;html&amp;gt; &amp;lt;head&amp;gt;&amp;lt;/head&amp;gt; &amp;lt;body&amp;gt; &amp;lt;/body&amp;gt; &amp;lt;/html&amp;gt;\n </body>\n</html><hi!></hi!>" + "'", str18, "<html>\n <head>\n  <title>#document</title>\n </head>\n <body>\n  &lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt;&lt;/body&gt; &lt;/html&gt;&amp;lt;html&amp;gt; &amp;lt;head&amp;gt;&amp;lt;/head&amp;gt; &amp;lt;body&amp;gt; &amp;lt;/body&amp;gt; &amp;lt;/html&amp;gt;\n </body>\n</html><hi!></hi!>");
    }

    @Test
    public void test0396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0396");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node31 = element23.childNode((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 2");
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
    }

    @Test
    public void test0397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0397");
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
        java.lang.String str34 = document22.attr("body");
        java.lang.String str35 = document22.data();
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
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
    }

    @Test
    public void test0398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0398");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        java.lang.String str5 = document3.html();
        java.lang.String str6 = document3.html();
        org.jsoup.nodes.Document document8 = org.jsoup.nodes.Document.createShell("");
        java.util.Set<java.lang.String> strSet9 = document8.classNames();
        org.jsoup.nodes.Element element10 = document3.classNames(strSet9);
        org.jsoup.nodes.Document document11 = document3.normalise();
        org.jsoup.nodes.Element element13 = document3.html("<html> <head></head> <body> </body> </html>");
        document3.remove();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str5, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str6, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertNotNull(document8);
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(document11);
        org.junit.Assert.assertNotNull(element13);
    }

    @Test
    public void test0399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0399");
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
        java.util.regex.Pattern pattern17 = null;
        org.jsoup.select.Elements elements18 = document3.getElementsByAttributeValueMatching("", pattern17);
        document3.title("<#root value=\"&lt;html&gt;\n &lt;head&gt;&lt;/head&gt;\n &lt;body&gt;&lt;/body&gt;\n&lt;/html&gt;\">\n <html>\n  <head></head>\n  <body></body>\n </html>\n</#root>#root\n<html>\n <head></head>\n <body></body>\n</html>");
        boolean boolean22 = document3.hasAttr(" html");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str5, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str6, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(elements18);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test0400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0400");
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
        org.jsoup.nodes.Element element31 = element23.prependElement("&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt; &lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;#document\n<html>\n <head></head>\n <body></body>\n</html><hi!></hi!>");
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
        org.junit.Assert.assertNotNull(element31);
    }

    @Test
    public void test0401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0401");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.nodes.Element element5 = document1.body();
        org.jsoup.select.Elements elements7 = document1.select("#root");
        org.jsoup.nodes.Element element8 = document1.empty();
        java.lang.String str9 = document1.html();
        org.jsoup.nodes.Document document10 = document1.normalise();
        org.jsoup.select.Elements elements12 = document10.getElementsContainingText("<html>\n <head></head>\n <body>\n </body>\n</html>\n<html> \n <head></head> \n <body>  \n </body>\n</html>");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(document10);
        org.junit.Assert.assertNotNull(elements12);
    }

    @Test
    public void test0402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0402");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("#root");
        org.jsoup.nodes.Document.OutputSettings outputSettings2 = document1.outputSettings();
        org.jsoup.nodes.Element element4 = document1.child(0);
        org.jsoup.nodes.Node node5 = document1.nextSibling();
        org.jsoup.nodes.Element element7 = document1.text("#document <html> <head></head> <body></body> </html>&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(outputSettings2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNotNull(element7);
    }

    @Test
    public void test0403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0403");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("<html>\n <head></head>\n <body>\n  &lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt; \n </body>\n</html><<html> <head></head> <body> </body> </html>></<html> <head></head> <body> </body> </html>>");
        java.util.List<org.jsoup.nodes.Node> nodeList2 = document1.childNodes();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(nodeList2);
    }

    @Test
    public void test0404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0404");
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
        org.jsoup.nodes.Element element18 = element16.toggleClass("#root");
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
        org.junit.Assert.assertNotNull(element18);
    }

    @Test
    public void test0405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0405");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.select.Elements elements6 = document3.getElementsByIndexLessThan((int) (short) 10);
        org.jsoup.nodes.Element element8 = document3.val("");
        org.jsoup.nodes.Element element10 = document3.after("#root");
        org.jsoup.nodes.Element element11 = document3.body();
        org.jsoup.select.Elements elements13 = element11.getElementsContainingOwnText("<html>\n <head></head>\n <body>\n </body>\n</html>");
        org.jsoup.select.Elements elements15 = element11.getElementsByAttribute("#root");
        org.jsoup.select.Elements elements17 = element11.getElementsContainingOwnText("\n<body></body>");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertNotNull(elements17);
    }

    @Test
    public void test0406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0406");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.select.Elements elements6 = document3.getElementsByIndexLessThan((int) (short) 10);
        org.jsoup.nodes.Element element8 = document3.val("");
        java.lang.String str9 = document3.outerHtml();
        org.jsoup.select.Elements elements11 = document3.getElementsByClass("#root");
        java.lang.String str12 = document3.tagName();
        org.jsoup.nodes.Node node14 = document3.childNode(0);
        org.jsoup.nodes.Element element16 = document3.appendElement("<html>\n <head></head>\n <body></body>\n</html>&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;");
        org.jsoup.nodes.Element element18 = document3.prependText("<html> <head></head> <body></body> </html>");
        org.jsoup.select.Elements elements20 = document3.getElementsMatchingOwnText("<html>\n <head>\n  <title>&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;</title>\n </head>\n <body></body>\n</html>");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str9, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "#root" + "'", str12, "#root");
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNotNull(elements20);
    }

    @Test
    public void test0407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0407");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.nodes.Element element5 = document1.body();
        org.jsoup.select.Elements elements7 = element5.getElementsByIndexGreaterThan((int) (byte) -1);
        java.lang.String str8 = element5.data();
        org.jsoup.select.Elements elements9 = element5.getAllElements();
        java.lang.String str11 = element5.absUrl("<html> <head></head> <body></body> </html>");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test0408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0408");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        java.lang.String str5 = document3.tagName();
        org.jsoup.nodes.Element element7 = document3.val("#document <html> <head></head> <body></body> </html>&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;");
        org.jsoup.select.Elements elements8 = document3.children();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#root" + "'", str5, "#root");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(elements8);
    }

    @Test
    public void test0409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0409");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.select.Elements elements6 = document3.getElementsByIndexLessThan((int) (short) 10);
        org.jsoup.nodes.Element element8 = document3.val("");
        org.jsoup.nodes.Element element11 = element8.attr("<html>\n <head></head>\n <body></body>\n</html>", "<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.nodes.Node node12 = element8.previousSibling();
        java.lang.String str13 = element8.baseUri();
        java.lang.Integer int14 = element8.siblingIndex();
        org.jsoup.nodes.Document document16 = org.jsoup.nodes.Document.createShell("#root");
        org.jsoup.nodes.Element element17 = document16.body();
        org.jsoup.nodes.Element element18 = element8.prependChild((org.jsoup.nodes.Node) element17);
        element17.setBaseUri("html");
        org.jsoup.select.Elements elements21 = element17.children();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(document16);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNotNull(elements21);
    }

    @Test
    public void test0410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0410");
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
        java.util.regex.Pattern pattern19 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements20 = element15.getElementsMatchingText(pattern19);
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
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(elements18);
    }

    @Test
    public void test0411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0411");
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
        java.lang.String str19 = element15.val();
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
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test0412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0412");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        boolean boolean3 = document1.hasClass("");
        java.lang.String str4 = document1.tagName();
        org.jsoup.nodes.Element element6 = document1.appendElement("<html>\n <head></head>\n <body>\n </body>\n</html>\n<html> \n <head></head> \n <body>  \n </body>\n</html>");
        org.jsoup.select.Elements elements8 = document1.getElementsByIndexEquals((int) '#');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "#root" + "'", str4, "#root");
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(elements8);
    }

    @Test
    public void test0413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0413");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element3 = document1.text("");
        // The following exception was thrown during execution in test generation
        try {
            document1.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(element3);
    }

    @Test
    public void test0414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0414");
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
        org.jsoup.select.Elements elements19 = element17.getElementsByIndexEquals((int) (byte) 10);
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
        org.junit.Assert.assertNotNull(elements19);
    }

    @Test
    public void test0415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0415");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.parser.Tag tag5 = document3.tag();
        org.jsoup.nodes.Element element7 = document3.prependText("hi!");
        org.jsoup.nodes.Element element10 = document3.attr(" html", "<html>\n <head>\n  <title>&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;</title>\n </head>\n <body></body>\n</html>");
        java.lang.String str11 = document3.outerHtml();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(tag5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!\n<html>\n <head></head>\n <body></body>\n</html>" + "'", str11, "hi!\n<html>\n <head></head>\n <body></body>\n</html>");
    }

    @Test
    public void test0416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0416");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        java.lang.String str5 = document3.html();
        java.lang.String str6 = document3.html();
        java.util.Map<java.lang.String, java.lang.String> strMap7 = document3.dataset();
        org.jsoup.nodes.Element element8 = document3.head();
        org.jsoup.select.Elements elements10 = document3.getElementsByAttribute("html");
        org.jsoup.nodes.Element element12 = document3.text("<html>\n <head></head>\n <body>\n </body>\n</html>\n<html> \n <head></head> \n <body>  \n </body>\n</html>");
        org.jsoup.select.Elements elements14 = document3.getElementsMatchingOwnText(" html");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str5, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str6, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(elements14);
    }

    @Test
    public void test0417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0417");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.nodes.Element element5 = document1.body();
        org.jsoup.select.Elements elements8 = element5.getElementsByAttributeValueStarting("hi!", "hi!");
        org.jsoup.nodes.Element element10 = element5.prependText("<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.nodes.Element element12 = element5.append("<html> <head></head> <body> </body> </html>");
        org.jsoup.select.Elements elements15 = element12.getElementsByAttributeValueEnding("html", "<html>\n <head></head>\n <body>\n </body>\n</html>");
        java.lang.String str16 = element12.val();
        java.util.regex.Pattern pattern18 = null;
        org.jsoup.select.Elements elements19 = element12.getElementsByAttributeValueMatching("<#root value=\"&lt;html&gt;\n &lt;head&gt;&lt;/head&gt;\n &lt;body&gt;&lt;/body&gt;\n&lt;/html&gt;\">\n <html>\n  <head></head>\n  <body></body>\n </html>\n</#root>#root\n<html>\n <head></head>\n <body></body>\n</html>", pattern18);
        org.jsoup.select.Elements elements21 = element12.select(" html");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(elements19);
        org.junit.Assert.assertNotNull(elements21);
    }

    @Test
    public void test0418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0418");
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
        org.jsoup.select.Elements elements19 = document3.getElementsByIndexLessThan((int) (byte) -1);
        org.jsoup.select.Elements elements22 = document3.getElementsByAttributeValueMatching("", "<html>\n <head></head>\n <body></body>\n</html>&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;");
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
        org.junit.Assert.assertNotNull(elements19);
        org.junit.Assert.assertNotNull(elements22);
    }

    @Test
    public void test0419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0419");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.parser.Tag tag5 = document3.tag();
        org.jsoup.nodes.Element element7 = document3.createElement("<html>\n <head></head>\n <body></body>\n</html>");
        document3.setBaseUri("");
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = document3.outputSettings();
        java.nio.charset.Charset charset11 = outputSettings10.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings13 = outputSettings10.prettyPrint(false);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document.OutputSettings outputSettings15 = outputSettings10.charset("&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt; &lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;#document\n<html>\n <head></head>\n <body></body>\n</html><hi!></hi!>");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: &lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt; &lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;#document?<html>? <head></head>? <body></body>?</html><hi!></hi!>");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(tag5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(outputSettings10);
        org.junit.Assert.assertNotNull(charset11);
        org.junit.Assert.assertNotNull(outputSettings13);
    }

    @Test
    public void test0420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0420");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        java.lang.String str5 = document3.html();
        java.lang.String str6 = document3.html();
        org.jsoup.nodes.Document document8 = org.jsoup.nodes.Document.createShell("");
        java.util.Set<java.lang.String> strSet9 = document8.classNames();
        org.jsoup.nodes.Element element10 = document3.classNames(strSet9);
        org.jsoup.nodes.Document document11 = document3.normalise();
        org.jsoup.nodes.Element element13 = document3.addClass("&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt;&lt;/body&gt; &lt;/html&gt;&amp;lt;html&amp;gt; &amp;lt;head&amp;gt;&amp;lt;/head&amp;gt; &amp;lt;body&amp;gt; &amp;lt;/body&amp;gt; &amp;lt;/html&amp;gt;<#root>\n <html>\n  <head></head>\n  <body></body>\n </html>\n</#root>\n<html>\n <head></head>\n <body></body>\n</html>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element15 = document3.createElement("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str5, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str6, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertNotNull(document8);
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(document11);
        org.junit.Assert.assertNotNull(element13);
    }

    @Test
    public void test0421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0421");
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
        org.jsoup.nodes.Element element25 = document11.firstElementSibling();
        org.jsoup.select.Elements elements26 = document11.siblingElements();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#root" + "'", str5, "#root");
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(document9);
        org.junit.Assert.assertNotNull(document11);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(elements14);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str17, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertNotNull(elements19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertNotNull(element25);
        org.junit.Assert.assertNotNull(elements26);
    }

    @Test
    public void test0422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0422");
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
        java.lang.String str23 = element22.val();
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
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test0423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0423");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.nodes.Element element5 = document1.body();
        org.jsoup.select.Elements elements8 = element5.getElementsByAttributeValueStarting("hi!", "hi!");
        org.jsoup.nodes.Element element10 = element5.prependText("<html>\n <head></head>\n <body></body>\n</html>");
        java.util.List<org.jsoup.nodes.Node> nodeList11 = element5.siblingNodes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements13 = element5.select("<#document></#document>\n<html>\n <head></head>\n <body></body>\n</html>");
            org.junit.Assert.fail("Expected exception of type org.jsoup.select.Selector.SelectorParseException; message: Could not parse query '<#document></#document>?<html>? <head></head>? <body></body>?</html>': unexpected token at '<#document></#document>?<html>? <head></head>? <body></body>?</html>'");
        } catch (org.jsoup.select.Selector.SelectorParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(nodeList11);
    }

    @Test
    public void test0424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0424");
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
        java.lang.Integer int18 = element16.elementSiblingIndex();
        java.lang.Integer int19 = element16.elementSiblingIndex();
        org.jsoup.nodes.Element element20 = element16.nextElementSibling();
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
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNull(element20);
    }

    @Test
    public void test0425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0425");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element17 = document15.child((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 1");
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
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(document15);
    }

    @Test
    public void test0426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0426");
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
        org.jsoup.nodes.Attributes attributes18 = element17.attributes();
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
        org.junit.Assert.assertNotNull(attributes18);
    }

    @Test
    public void test0427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0427");
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
        org.jsoup.select.Elements elements18 = element17.getAllElements();
        org.jsoup.nodes.Element element19 = element17.parent();
        org.jsoup.parser.Tag tag20 = element19.tag();
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
        org.junit.Assert.assertNotNull(elements18);
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertNotNull(tag20);
    }

    @Test
    public void test0428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0428");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        java.lang.String str5 = document1.tagName();
        org.jsoup.nodes.Document.OutputSettings outputSettings6 = document1.new OutputSettings();
        org.jsoup.nodes.Document document7 = document1.normalise();
        org.jsoup.nodes.Element element9 = document1.prependText("<html>\n <head></head>\n <body></body>\n</html>&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;");
        java.lang.String str10 = element9.tagName();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#root" + "'", str5, "#root");
        org.junit.Assert.assertNotNull(document7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "#root" + "'", str10, "#root");
    }

    @Test
    public void test0429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0429");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        java.lang.String str5 = document3.html();
        java.lang.String str6 = document3.html();
        java.util.Map<java.lang.String, java.lang.String> strMap7 = document3.dataset();
        org.jsoup.nodes.Element element9 = document3.appendElement("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList10 = element9.childNodes();
        org.jsoup.nodes.Node node12 = element9.removeAttr("#document");
        org.jsoup.nodes.Node node14 = element9.removeAttr("<html>\n <head></head>\n <body></body>\n</html>&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;<<html> <head></head> <body> </body> </html>></<html> <head></head> <body> </body> </html>>");
        java.lang.String str15 = element9.id();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str5, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str6, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test0430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0430");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        java.lang.String str5 = document3.className();
        org.jsoup.nodes.Element element6 = document3.lastElementSibling();
        org.jsoup.nodes.Document document7 = document3.normalise();
        java.util.List<org.jsoup.nodes.Node> nodeList8 = document3.siblingNodes();
        org.jsoup.nodes.Element element10 = document3.prepend("<#root value=\"&lt;html&gt;\n &lt;head&gt;&lt;/head&gt;\n &lt;body&gt;&lt;/body&gt;\n&lt;/html&gt;\">\n <html>\n  <head></head>\n  <body></body>\n </html>\n</#root>#root\n<html>\n <head></head>\n <body></body>\n</html>");
        java.lang.String str11 = document3.nodeName();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(document7);
        org.junit.Assert.assertNotNull(nodeList8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "#document" + "'", str11, "#document");
    }

    @Test
    public void test0431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0431");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        java.lang.String str5 = document3.html();
        java.lang.String str6 = document3.html();
        java.util.Map<java.lang.String, java.lang.String> strMap7 = document3.dataset();
        org.jsoup.nodes.Element element9 = document3.appendText("<html>\n <head></head>\n <body>\n </body>\n</html>");
        org.jsoup.select.Elements elements12 = document3.getElementsByAttributeValueStarting("<html>\n <head></head>\n <body>\n </body>\n</html>", "<html> <head></head> <body> </body> </html>");
        org.jsoup.nodes.Element element14 = document3.after("<html>\n <head></head>\n <body>\n </body>\n</html>");
        java.lang.String str15 = document3.outerHtml();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str5, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str6, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;" + "'", str15, "<html>\n <head></head>\n <body></body>\n</html>&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;");
    }

    @Test
    public void test0432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0432");
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
        org.jsoup.nodes.Document document18 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document20 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element21 = document18.prependChild((org.jsoup.nodes.Node) document20);
        java.lang.String str22 = document20.html();
        java.lang.String str23 = document20.html();
        java.util.Map<java.lang.String, java.lang.String> strMap24 = document20.dataset();
        org.jsoup.nodes.Element element26 = document20.appendText("<html>\n <head></head>\n <body>\n </body>\n</html>");
        org.jsoup.select.Elements elements29 = document20.getElementsByAttributeValueStarting("<html>\n <head></head>\n <body>\n </body>\n</html>", "<html> <head></head> <body> </body> </html>");
        org.jsoup.nodes.Element element30 = document20.body();
        org.jsoup.nodes.Element element32 = element30.html("<html> <head></head> <body> </body> </html>");
        // The following exception was thrown during execution in test generation
        try {
            element16.replaceWith((org.jsoup.nodes.Node) element30);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
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
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;" + "'", str13, "<html>\n <head></head>\n <body></body>\n</html>&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;");
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(document18);
        org.junit.Assert.assertNotNull(document20);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str22, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str23, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertNotNull(strMap24);
        org.junit.Assert.assertNotNull(element26);
        org.junit.Assert.assertNotNull(elements29);
        org.junit.Assert.assertNotNull(element30);
        org.junit.Assert.assertNotNull(element32);
    }

    @Test
    public void test0433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0433");
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
        java.lang.String str17 = document3.attr("#document");
        java.lang.String str19 = document3.absUrl("<html>\n <head>\n  <title>&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;</title>\n </head>\n <body></body>\n</html>");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str5, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str6, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(outputSettings14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test0434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0434");
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
        org.jsoup.nodes.Element element21 = element19.before("#document");
        org.jsoup.nodes.Document document23 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document25 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element26 = document23.prependChild((org.jsoup.nodes.Node) document25);
        org.jsoup.select.Elements elements28 = document25.getElementsByIndexLessThan((int) (short) 10);
        org.jsoup.nodes.Element element30 = document25.val("");
        java.lang.String str31 = document25.outerHtml();
        org.jsoup.select.Elements elements33 = document25.getElementsByClass("#root");
        org.jsoup.select.Elements elements35 = document25.getElementsByIndexGreaterThan(10);
        java.lang.Integer int36 = document25.elementSiblingIndex();
        org.jsoup.select.Elements elements37 = document25.getAllElements();
        document25.title("<html> <head></head> <body> </body> </html>");
        org.jsoup.nodes.Element element40 = document25.head();
        java.lang.String str41 = document25.html();
        org.jsoup.nodes.Document document43 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document45 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element46 = document43.prependChild((org.jsoup.nodes.Node) document45);
        org.jsoup.select.Elements elements48 = document45.getElementsByIndexLessThan((int) (short) 10);
        org.jsoup.nodes.Element element50 = document45.val("");
        org.jsoup.nodes.Element element52 = element50.val("hi!");
        org.jsoup.select.Elements elements53 = element50.siblingElements();
        org.jsoup.nodes.Element element55 = element50.prepend("");
        boolean boolean57 = element55.hasClass("<html>\n <head></head>\n <body>\n </body>\n</html>");
        org.jsoup.nodes.Element element59 = element55.before("<html> <head></head> <body> </body> </html>");
        org.jsoup.nodes.Document document61 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document63 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element64 = document61.prependChild((org.jsoup.nodes.Node) document63);
        java.util.Set<java.lang.String> strSet65 = element64.classNames();
        org.jsoup.nodes.Element element66 = element59.classNames(strSet65);
        org.jsoup.nodes.Element element67 = document25.classNames(strSet65);
        org.jsoup.nodes.Element element68 = element21.classNames(strSet65);
        boolean boolean70 = element21.hasAttr("#root");
        org.jsoup.nodes.Node node72 = element21.removeAttr("<html> <head></head> <body> </body> </html>");
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
        org.junit.Assert.assertNotNull(document23);
        org.junit.Assert.assertNotNull(document25);
        org.junit.Assert.assertNotNull(element26);
        org.junit.Assert.assertNotNull(elements28);
        org.junit.Assert.assertNotNull(element30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str31, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertNotNull(elements33);
        org.junit.Assert.assertNotNull(elements35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(elements37);
        org.junit.Assert.assertNotNull(element40);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "<html>\n <head>\n  <title>&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;</title>\n </head>\n <body></body>\n</html>" + "'", str41, "<html>\n <head>\n  <title>&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;</title>\n </head>\n <body></body>\n</html>");
        org.junit.Assert.assertNotNull(document43);
        org.junit.Assert.assertNotNull(document45);
        org.junit.Assert.assertNotNull(element46);
        org.junit.Assert.assertNotNull(elements48);
        org.junit.Assert.assertNotNull(element50);
        org.junit.Assert.assertNotNull(element52);
        org.junit.Assert.assertNotNull(elements53);
        org.junit.Assert.assertNotNull(element55);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(element59);
        org.junit.Assert.assertNotNull(document61);
        org.junit.Assert.assertNotNull(document63);
        org.junit.Assert.assertNotNull(element64);
        org.junit.Assert.assertNotNull(strSet65);
        org.junit.Assert.assertNotNull(element66);
        org.junit.Assert.assertNotNull(element67);
        org.junit.Assert.assertNotNull(element68);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertNotNull(node72);
    }

    @Test
    public void test0435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0435");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        boolean boolean3 = document1.hasClass("");
        org.jsoup.nodes.Node node5 = document1.removeAttr("hi!\n<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(node5);
    }

    @Test
    public void test0436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0436");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        java.lang.String str5 = document3.html();
        java.lang.String str6 = document3.html();
        java.util.Map<java.lang.String, java.lang.String> strMap7 = document3.dataset();
        org.jsoup.nodes.Element element9 = document3.appendElement("hi!");
        org.jsoup.nodes.Element element10 = document3.body();
        java.util.regex.Pattern pattern11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements12 = element10.getElementsMatchingOwnText(pattern11);
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
        org.junit.Assert.assertNotNull(element10);
    }

    @Test
    public void test0437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0437");
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
    }

    @Test
    public void test0438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0438");
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
        org.jsoup.select.Elements elements19 = element13.children();
        boolean boolean20 = element13.hasText();
        org.jsoup.nodes.Element element21 = element13.nextElementSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element22 = element21.nextElementSibling();
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
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertNotNull(elements19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNull(element21);
    }

    @Test
    public void test0439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0439");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        java.lang.String str5 = document1.tagName();
        org.jsoup.nodes.Document.OutputSettings outputSettings6 = document1.new OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = outputSettings6.indentAmount((int) (byte) 10);
        boolean boolean9 = outputSettings6.prettyPrint();
        org.jsoup.nodes.Entities.EscapeMode escapeMode10 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = outputSettings6.escapeMode(escapeMode10);
        int int12 = outputSettings6.indentAmount();
        boolean boolean13 = outputSettings6.prettyPrint();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#root" + "'", str5, "#root");
        org.junit.Assert.assertNotNull(outputSettings8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(outputSettings11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test0440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0440");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.select.Elements elements6 = document3.getElementsByIndexLessThan((int) (short) 10);
        org.jsoup.nodes.Element element8 = document3.val("");
        org.jsoup.nodes.Element element10 = element8.val("hi!");
        org.jsoup.nodes.Element element12 = element10.prependText("");
        java.util.regex.Pattern pattern13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements14 = element10.getElementsMatchingOwnText(pattern13);
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
        org.junit.Assert.assertNotNull(element12);
    }

    @Test
    public void test0441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0441");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.select.Elements elements6 = document3.getElementsByIndexLessThan((int) (short) 10);
        org.jsoup.nodes.Element element8 = document3.val("");
        java.lang.String str9 = document3.outerHtml();
        org.jsoup.select.Elements elements11 = document3.getElementsByClass("#root");
        java.lang.String str13 = document3.absUrl("<html>\n <head></head>\n <body>\n </body>\n</html>");
        org.jsoup.nodes.Document.OutputSettings outputSettings14 = document3.new OutputSettings();
        org.jsoup.nodes.Element element15 = document3.head();
        org.jsoup.nodes.Element element16 = document3.lastElementSibling();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str9, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(element16);
    }

    @Test
    public void test0442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0442");
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
        boolean boolean20 = element19.isBlock();
        boolean boolean22 = element19.hasClass("#document <html> <head></head> <body></body> </html>&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;");
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
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test0443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0443");
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
        java.lang.Integer int39 = document38.elementSiblingIndex();
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
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
    }

    @Test
    public void test0444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0444");
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
        org.jsoup.nodes.Element element38 = document26.body();
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
        org.junit.Assert.assertNull(element38);
    }

    @Test
    public void test0445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0445");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        java.lang.String str5 = document3.html();
        java.lang.String str6 = document3.html();
        document3.title("<html>\n <head></head>\n <body></body>\n</html>");
        java.util.regex.Pattern pattern10 = null;
        org.jsoup.select.Elements elements11 = document3.getElementsByAttributeValueMatching("hi!", pattern10);
        org.jsoup.nodes.Element element13 = document3.after("");
        java.lang.String str14 = document3.text();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str5, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str6, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str14, "<html>\n <head></head>\n <body></body>\n</html>");
    }

    @Test
    public void test0446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0446");
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
        java.lang.String str18 = document3.outerHtml();
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
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;" + "'", str18, "<html>\n <head></head>\n <body></body>\n</html>&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;");
    }

    @Test
    public void test0447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0447");
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
        java.util.Map<java.lang.String, java.lang.String> strMap19 = element14.dataset();
        element14.setBaseUri("<html>\n <head>\n  <title>&lt;html&gt;\n &lt;head&gt;&lt;/head&gt;\n &lt;body&gt;&lt;/body&gt;\n&lt;/html&gt;</title>\n </head>\n <body></body>\n</html>");
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
        org.junit.Assert.assertNotNull(strMap19);
    }

    @Test
    public void test0448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0448");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.select.Elements elements6 = document3.getElementsByIndexLessThan((int) (short) 10);
        org.jsoup.nodes.Document document8 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document10 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element11 = document8.prependChild((org.jsoup.nodes.Node) document10);
        org.jsoup.select.Elements elements13 = document10.getElementsByIndexLessThan((int) (short) 10);
        boolean boolean14 = document3.equals((java.lang.Object) (short) 10);
        org.jsoup.select.Elements elements16 = document3.getElementsByIndexEquals(0);
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(document8);
        org.junit.Assert.assertNotNull(document10);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(elements16);
    }

    @Test
    public void test0449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0449");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        java.lang.String str5 = document3.className();
        org.jsoup.nodes.Element element6 = document3.lastElementSibling();
        org.jsoup.nodes.Document document7 = document3.normalise();
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = document3.new OutputSettings();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(document7);
    }

    @Test
    public void test0450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0450");
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
        java.lang.String str19 = document3.outerHtml();
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
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html><<html>\n <head></head>\n <body></body>\n</html>&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;<<html> <head></head> <body> </body> </html>></<html> <head></head> <body> </body> </html>>></<html>\n <head></head>\n <body></body>\n</html>&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;<<html> <head></head> <body> </body> </html>></<html> <head></head> <body> </body> </html>>>" + "'", str19, "<html>\n <head></head>\n <body></body>\n</html><<html>\n <head></head>\n <body></body>\n</html>&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;<<html> <head></head> <body> </body> </html>></<html> <head></head> <body> </body> </html>>></<html>\n <head></head>\n <body></body>\n</html>&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;<<html> <head></head> <body> </body> </html>></<html> <head></head> <body> </body> </html>>>");
    }

    @Test
    public void test0451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0451");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document(" html");
    }

    @Test
    public void test0452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0452");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = document3.absUrl("");
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
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;<<html> <head></head> <body> </body> </html>></<html> <head></head> <body> </body> </html>>" + "'", str15, "<html>\n <head></head>\n <body></body>\n</html>&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;<<html> <head></head> <body> </body> </html>></<html> <head></head> <body> </body> </html>>");
        org.junit.Assert.assertNotNull(element16);
    }

    @Test
    public void test0453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0453");
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
        org.jsoup.nodes.Element element20 = document15.attr("<#root value=\"\" #root=\"&lt;html&gt;\n &lt;head&gt;&lt;/head&gt;\n &lt;body&gt;&lt;/body&gt;\n&lt;/html&gt;\" class=\"\">\n <html>\n  <head></head>\n  <body></body>\n </html><<html>\n <head></head>\n <body>\n </body>\n</html>></<html>\n <head></head>\n <body>\n </body>\n</html>>\n</#root>", "hi!\n<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(document15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(element20);
    }

    @Test
    public void test0454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0454");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        java.lang.String str5 = document3.html();
        java.lang.String str6 = document3.html();
        java.util.Map<java.lang.String, java.lang.String> strMap7 = document3.dataset();
        org.jsoup.nodes.Element element8 = document3.lastElementSibling();
        org.jsoup.nodes.Element element9 = element8.parent();
        java.lang.String str10 = element8.className();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str5, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str6, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test0455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0455");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        java.lang.String str5 = document1.tagName();
        org.jsoup.nodes.Document.OutputSettings outputSettings6 = document1.new OutputSettings();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document.OutputSettings outputSettings8 = outputSettings6.charset("<html>\n <head></head>\n <body>\n </body>\n</html>");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: <html>? <head></head>? <body>? </body>?</html>");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#root" + "'", str5, "#root");
    }

    @Test
    public void test0456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0456");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("#root");
        org.jsoup.nodes.Document.OutputSettings outputSettings2 = document1.outputSettings();
        org.jsoup.nodes.Element element4 = document1.child(0);
        org.jsoup.nodes.Element element6 = element4.getElementById("<html>\n <head></head>\n <body>\n  &lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt; &lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;\n </body>\n</html>\n<html> \n <head></head> \n <body>  \n </body>\n</html>");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(outputSettings2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNull(element6);
    }

    @Test
    public void test0457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0457");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("#root");
        org.jsoup.nodes.Element element2 = document1.body();
        org.jsoup.nodes.Element element4 = element2.prependElement("<html>\n <head></head>\n <body></body>\n</html><<html>\n <head></head>\n <body></body>\n</html>&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;<<html> <head></head> <body> </body> </html>></<html> <head></head> <body> </body> </html>>></<html>\n <head></head>\n <body></body>\n</html>&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;<<html> <head></head> <body> </body> </html>></<html> <head></head> <body> </body> </html>>>");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(element2);
        org.junit.Assert.assertNotNull(element4);
    }

    @Test
    public void test0458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0458");
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
        org.jsoup.select.Elements elements21 = document3.getElementsByTag("html");
        org.jsoup.nodes.Element element23 = document3.prependElement("#document");
        java.lang.Integer int24 = element23.siblingIndex();
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
        org.junit.Assert.assertNotNull(elements21);
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test0459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0459");
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
        java.util.List<org.jsoup.nodes.Node> nodeList22 = document3.childNodes();
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
        org.junit.Assert.assertNotNull(nodeList22);
    }

    @Test
    public void test0460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0460");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.nodes.Element element5 = document3.head();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node7 = document3.childNode((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element5);
    }

    @Test
    public void test0461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0461");
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
        org.jsoup.select.Elements elements24 = element22.getElementsByTag("<html>\n <head></head>\n <body>\n  &lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt; &lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;\n </body>\n</html>\n<html> \n <head></head> \n <body>  \n </body>\n</html>");
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
        org.junit.Assert.assertNotNull(elements24);
    }

    @Test
    public void test0462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0462");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.select.Elements elements6 = document3.getElementsByIndexLessThan((int) (short) 10);
        org.jsoup.nodes.Element element8 = document3.val("");
        org.jsoup.nodes.Element element11 = element8.attr("<html>\n <head></head>\n <body></body>\n</html>", "<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.parser.Tag tag12 = element11.tag();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements14 = element11.select("<#root>\n <#root>\n  <html>\n   <head></head>\n   <body></body>\n  </html>\n </#root>\n <html>\n  <head></head>\n  <body></body>\n </html>\n</#root>\n<html>\n <head></head>\n <body></body>\n</html>");
            org.junit.Assert.fail("Expected exception of type org.jsoup.select.Selector.SelectorParseException; message: Could not parse query '<#root>? <#root>?  <html>?   <head></head>?   <body></body>?  </html>? </#root>? <html>?  <head></head>?  <body></body>? </html>?</#root>?<html>? <head></head>? <body></body>?</html>': unexpected token at '<#root>? <#root>?  <html>?   <head></head>?   <body></body>?  </html>? </#root>? <html>?  <head></head>?  <body></body>? </html>?</#root>?<html>? <head></head>? <body></body>?</html>'");
        } catch (org.jsoup.select.Selector.SelectorParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(tag12);
    }

    @Test
    public void test0463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0463");
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
        org.jsoup.select.Elements elements29 = element27.getElementsByIndexEquals((-1));
        org.jsoup.select.Elements elements31 = element27.getElementsByIndexEquals(100);
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
        org.junit.Assert.assertNotNull(elements29);
        org.junit.Assert.assertNotNull(elements31);
    }

    @Test
    public void test0464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0464");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        java.lang.String str3 = document1.absUrl("<html> <head></head> <body> </body> </html>");
        org.jsoup.select.Elements elements6 = document1.getElementsByAttributeValue("html", "<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.nodes.Element element7 = document1.body();
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = document1.new OutputSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = document1.childNodes();
        org.jsoup.nodes.Element element10 = document1.body();
        document1.setBaseUri(" hi!");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNotNull(element10);
    }

    @Test
    public void test0465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0465");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.select.Elements elements6 = document3.getElementsByIndexLessThan((int) (short) 10);
        org.jsoup.nodes.Element element8 = document3.val("");
        org.jsoup.nodes.Element element11 = element8.attr("<html>\n <head></head>\n <body></body>\n</html>", "<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.nodes.Node node12 = element8.previousSibling();
        org.jsoup.select.Elements elements13 = element8.parents();
        element8.setBaseUri("");
        java.util.regex.Pattern pattern17 = null;
        org.jsoup.select.Elements elements18 = element8.getElementsByAttributeValueMatching("<#root value=\"&lt;html&gt;\n &lt;head&gt;&lt;/head&gt;\n &lt;body&gt;&lt;/body&gt;\n&lt;/html&gt;\">\n <html>\n  <head></head>\n  <body></body>\n </html>\n</#root>#root\n<html>\n <head></head>\n <body></body>\n</html>", pattern17);
        boolean boolean20 = element8.hasClass("<html> <head></head> <body> </body> </html>");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertNotNull(elements18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test0466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0466");
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
        org.jsoup.nodes.Element element18 = document3.prependText("<#root value=\"&lt;html&gt;\n &lt;head&gt;&lt;/head&gt;\n &lt;body&gt;&lt;/body&gt;\n&lt;/html&gt;\">\n <html>\n  <head></head>\n  <body></body>\n </html>\n</#root>#root\n<html>\n <head></head>\n <body></body>\n</html>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element21 = element18.attr("", "hi!\n<html>\n <head></head>\n <body></body>\n</html>");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str5, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str6, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(nodeList12);
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertNotNull(elements16);
        org.junit.Assert.assertNotNull(element18);
    }

    @Test
    public void test0467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0467");
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
        org.jsoup.select.Elements elements21 = element16.getElementsByAttribute("hi!");
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
        org.junit.Assert.assertNotNull(elements21);
    }

    @Test
    public void test0468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0468");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        java.lang.String str3 = document1.absUrl("<html> <head></head> <body> </body> </html>");
        org.jsoup.select.Elements elements6 = document1.getElementsByAttributeValue("html", "<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.nodes.Element element7 = document1.body();
        org.jsoup.nodes.Element element9 = element7.prependElement("<html>\n <head></head>\n <body>\n </body>\n</html>\n<html> \n <head></head> \n <body>  \n </body>\n</html>");
        java.lang.String str10 = element9.text();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node12 = element9.childNode((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test0469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0469");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.select.Elements elements6 = document3.getElementsByIndexLessThan((int) (short) 10);
        org.jsoup.nodes.Element element8 = document3.val("");
        org.jsoup.nodes.Element element10 = document3.after("#root");
        org.jsoup.nodes.Element element11 = document3.nextElementSibling();
        org.jsoup.nodes.Element element13 = document3.append("#root");
        org.jsoup.nodes.Element element15 = element13.addClass(" html");
        org.jsoup.nodes.Node node16 = element13.previousSibling();
        org.jsoup.select.Elements elements19 = element13.getElementsByAttributeValueNot("<head></head>\n<body></body>", " html");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertNotNull(elements19);
    }

    @Test
    public void test0470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0470");
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
        org.jsoup.select.Elements elements22 = document3.parents();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node24 = document3.childNode((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 52 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertNotNull(elements22);
    }

    @Test
    public void test0471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0471");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element3 = document1.text("");
        boolean boolean5 = element3.hasClass("");
        java.util.regex.Pattern pattern6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements7 = element3.getElementsMatchingText(pattern6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test0472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0472");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        java.lang.String str5 = document1.tagName();
        org.jsoup.nodes.Element element6 = document1.head();
        java.lang.Integer int7 = element6.siblingIndex();
        org.jsoup.nodes.Element element9 = element6.removeClass("<html>\n <head></head>\n <body></body>\n</html>&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;");
        java.util.Set<java.lang.String> strSet10 = element9.classNames();
        org.jsoup.select.Elements elements12 = element9.getElementsByAttribute("#root");
        org.jsoup.select.Elements elements15 = element9.getElementsByAttributeValueMatching("", "&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt;&lt;/body&gt; &lt;/html&gt;&amp;lt;html&amp;gt; &amp;lt;head&amp;gt;&amp;lt;/head&amp;gt; &amp;lt;body&amp;gt; &amp;lt;/body&amp;gt; &amp;lt;/html&amp;gt;<#root>\n <html>\n  <head></head>\n  <body></body>\n </html>\n</#root>\n<html>\n <head></head>\n <body></body>\n</html>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements17 = element9.getElementsByTag("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#root" + "'", str5, "#root");
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertNotNull(elements15);
    }

    @Test
    public void test0473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0473");
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
        org.jsoup.nodes.Element element16 = document3.text("<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.nodes.Element element17 = document3.head();
        element17.setBaseUri("");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str5, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str6, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(outputSettings14);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(element17);
    }

    @Test
    public void test0474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0474");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("#root");
        org.jsoup.nodes.Document.OutputSettings outputSettings2 = document1.outputSettings();
        java.nio.charset.Charset charset3 = outputSettings2.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings5 = outputSettings2.prettyPrint(false);
        org.jsoup.nodes.Document document7 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document9 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element10 = document7.prependChild((org.jsoup.nodes.Node) document9);
        java.lang.String str11 = document7.tagName();
        org.jsoup.nodes.Document.OutputSettings outputSettings12 = document7.new OutputSettings();
        boolean boolean13 = outputSettings12.prettyPrint();
        java.nio.charset.CharsetEncoder charsetEncoder14 = outputSettings12.encoder();
        org.jsoup.nodes.Document document16 = org.jsoup.nodes.Document.createShell("#root");
        org.jsoup.nodes.Document.OutputSettings outputSettings17 = document16.outputSettings();
        java.nio.charset.Charset charset18 = outputSettings17.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings19 = outputSettings12.charset(charset18);
        org.jsoup.nodes.Document document21 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document23 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element24 = document21.prependChild((org.jsoup.nodes.Node) document23);
        java.lang.String str25 = document21.tagName();
        org.jsoup.nodes.Document.OutputSettings outputSettings26 = document21.new OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings28 = outputSettings26.indentAmount(0);
        org.jsoup.nodes.Entities.EscapeMode escapeMode29 = outputSettings28.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings30 = outputSettings12.escapeMode(escapeMode29);
        java.nio.charset.Charset charset31 = outputSettings30.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings32 = outputSettings5.charset(charset31);
        org.jsoup.nodes.Document.OutputSettings outputSettings34 = outputSettings32.prettyPrint(false);
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(outputSettings2);
        org.junit.Assert.assertNotNull(charset3);
        org.junit.Assert.assertNotNull(outputSettings5);
        org.junit.Assert.assertNotNull(document7);
        org.junit.Assert.assertNotNull(document9);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "#root" + "'", str11, "#root");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(charsetEncoder14);
        org.junit.Assert.assertNotNull(document16);
        org.junit.Assert.assertNotNull(outputSettings17);
        org.junit.Assert.assertNotNull(charset18);
        org.junit.Assert.assertNotNull(outputSettings19);
        org.junit.Assert.assertNotNull(document21);
        org.junit.Assert.assertNotNull(document23);
        org.junit.Assert.assertNotNull(element24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "#root" + "'", str25, "#root");
        org.junit.Assert.assertNotNull(outputSettings28);
        org.junit.Assert.assertTrue("'" + escapeMode29 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode29.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings30);
        org.junit.Assert.assertNotNull(charset31);
        org.junit.Assert.assertNotNull(outputSettings32);
        org.junit.Assert.assertNotNull(outputSettings34);
    }

    @Test
    public void test0475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0475");
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
        org.jsoup.nodes.Element element15 = document3.prepend("head");
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
        org.junit.Assert.assertNotNull(element15);
    }

    @Test
    public void test0476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0476");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        java.lang.String str2 = document1.tagName();
        org.jsoup.nodes.Element element4 = document1.prependElement("<html>\n <head></head>\n <body></body>\n</html>&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;<<html> <head></head> <body> </body> </html>></<html> <head></head> <body> </body> </html>>");
        org.jsoup.select.Elements elements6 = document1.getElementsContainingText("<html> <head></head> <body></body> </html>");
        org.jsoup.nodes.Element element8 = document1.val(" hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element10 = document1.before(" html");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#root" + "'", str2, "#root");
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(element8);
    }

    @Test
    public void test0477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0477");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.select.Elements elements6 = document3.getElementsByIndexLessThan((int) (short) 10);
        org.jsoup.nodes.Element element8 = document3.val("");
        org.jsoup.nodes.Element element10 = document3.after("#root");
        org.jsoup.nodes.Element element11 = document3.body();
        org.jsoup.select.Elements elements13 = element11.getElementsContainingOwnText("<html>\n <head></head>\n <body>\n </body>\n</html>");
        org.jsoup.select.Elements elements15 = element11.getElementsByAttribute("#root");
        org.jsoup.parser.Tag tag16 = element11.tag();
        org.jsoup.nodes.Element element17 = element11.nextElementSibling();
        org.jsoup.nodes.Document document19 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document21 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element22 = document19.prependChild((org.jsoup.nodes.Node) document21);
        java.lang.String str23 = document21.html();
        java.lang.String str24 = document21.html();
        org.jsoup.nodes.Document document26 = org.jsoup.nodes.Document.createShell("");
        java.util.Set<java.lang.String> strSet27 = document26.classNames();
        org.jsoup.nodes.Element element28 = document21.classNames(strSet27);
        org.jsoup.nodes.Document document29 = document21.normalise();
        org.jsoup.nodes.Element element30 = document29.head();
        org.jsoup.nodes.Element element32 = document29.before(" html");
        org.jsoup.nodes.Element element34 = element32.prependText(" html");
        org.jsoup.select.Elements elements36 = element34.getElementsByIndexGreaterThan((int) 'a');
        org.jsoup.nodes.Element element37 = element11.appendChild((org.jsoup.nodes.Node) element34);
        java.util.regex.Pattern pattern38 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements39 = element37.getElementsMatchingText(pattern38);
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
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertNotNull(tag16);
        org.junit.Assert.assertNull(element17);
        org.junit.Assert.assertNotNull(document19);
        org.junit.Assert.assertNotNull(document21);
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str23, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str24, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertNotNull(document26);
        org.junit.Assert.assertNotNull(strSet27);
        org.junit.Assert.assertNotNull(element28);
        org.junit.Assert.assertNotNull(document29);
        org.junit.Assert.assertNotNull(element30);
        org.junit.Assert.assertNotNull(element32);
        org.junit.Assert.assertNotNull(element34);
        org.junit.Assert.assertNotNull(elements36);
        org.junit.Assert.assertNotNull(element37);
    }

    @Test
    public void test0478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0478");
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
        org.jsoup.nodes.Element element48 = element23.empty();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements50 = element48.getElementsByTag("");
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
        org.junit.Assert.assertNotNull(element48);
    }

    @Test
    public void test0479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0479");
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
        java.lang.String str20 = element19.id();
        org.jsoup.nodes.Node node21 = element19.previousSibling();
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
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNull(node21);
    }

    @Test
    public void test0480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0480");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        java.lang.String str5 = document3.html();
        java.lang.String str6 = document3.html();
        java.util.Map<java.lang.String, java.lang.String> strMap7 = document3.dataset();
        org.jsoup.nodes.Element element9 = document3.appendElement("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList10 = element9.childNodes();
        org.jsoup.nodes.Element element13 = element9.attr("<html>\n <head></head>\n <body></body>\n</html>", "<html>\n <head></head>\n <body>\n </body>\n</html>");
        org.jsoup.select.Elements elements15 = element13.getElementsByIndexLessThan((int) (byte) -1);
        org.jsoup.nodes.Element element17 = element13.prependText("#document");
        org.jsoup.nodes.Element element19 = element13.prepend("");
        org.jsoup.nodes.Element element21 = element19.html("<html> <head> <title>&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt;&lt;/body&gt; &lt;/html&gt;</title> </head> <body></body> </html>");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str5, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str6, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertNotNull(element21);
    }

    @Test
    public void test0481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0481");
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
        org.jsoup.nodes.Element element17 = element16.parent();
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
        org.junit.Assert.assertNotNull(element17);
    }

    @Test
    public void test0482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0482");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.select.Elements elements6 = document3.getElementsByIndexLessThan((int) (short) 10);
        java.util.Set<java.lang.String> strSet7 = document3.classNames();
        org.jsoup.nodes.Element element9 = document3.getElementById("hi!");
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = document3.new OutputSettings();
        org.jsoup.nodes.Element element12 = document3.appendElement("hi!");
        org.jsoup.select.Elements elements13 = element12.parents();
        org.jsoup.nodes.Document document15 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document17 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element18 = document15.prependChild((org.jsoup.nodes.Node) document17);
        org.jsoup.select.Elements elements20 = document17.getElementsByIndexLessThan((int) (short) 10);
        org.jsoup.nodes.Document document22 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document24 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element25 = document22.prependChild((org.jsoup.nodes.Node) document24);
        org.jsoup.select.Elements elements27 = document24.getElementsByIndexLessThan((int) (short) 10);
        boolean boolean28 = document17.equals((java.lang.Object) (short) 10);
        org.jsoup.nodes.Node node29 = document17.nextSibling();
        org.jsoup.nodes.Element element30 = element12.appendChild(node29);
        org.jsoup.select.Elements elements31 = element30.getAllElements();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertNull(element9);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertNotNull(document15);
        org.junit.Assert.assertNotNull(document17);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNotNull(elements20);
        org.junit.Assert.assertNotNull(document22);
        org.junit.Assert.assertNotNull(document24);
        org.junit.Assert.assertNotNull(element25);
        org.junit.Assert.assertNotNull(elements27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertNotNull(element30);
        org.junit.Assert.assertNotNull(elements31);
    }

    @Test
    public void test0483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0483");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.select.Elements elements6 = document3.getElementsByIndexLessThan((int) (short) 10);
        org.jsoup.nodes.Element element8 = document3.val("");
        org.jsoup.nodes.Document document10 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document12 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element13 = document10.prependChild((org.jsoup.nodes.Node) document12);
        java.lang.String str14 = document12.html();
        java.lang.String str15 = document12.html();
        document12.title("<html>\n <head></head>\n <body></body>\n</html>");
        java.util.regex.Pattern pattern19 = null;
        org.jsoup.select.Elements elements20 = document12.getElementsByAttributeValueMatching("hi!", pattern19);
        org.jsoup.nodes.Element element22 = document12.after("");
        org.jsoup.nodes.Document.OutputSettings outputSettings23 = document12.outputSettings();
        org.jsoup.nodes.Element element25 = document12.wrap("<html> <head></head> <body> </body> </html>");
        org.jsoup.nodes.Node node26 = element25.previousSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element27 = element8.prependChild(node26);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(document10);
        org.junit.Assert.assertNotNull(document12);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str14, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str15, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertNotNull(elements20);
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertNotNull(outputSettings23);
        org.junit.Assert.assertNotNull(element25);
        org.junit.Assert.assertNull(node26);
    }

    @Test
    public void test0484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0484");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element3 = document1.text("");
        org.jsoup.nodes.Element element5 = document1.append("<html>\n <head></head>\n <body>\n </body>\n</html>");
        org.jsoup.nodes.Element element6 = document1.empty();
        org.jsoup.nodes.Element element8 = element6.addClass("<html>\n <head></head>\n <body></body>\n</html>&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;");
        java.lang.String str9 = element6.tagName();
        org.jsoup.select.Elements elements10 = element6.parents();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "#root" + "'", str9, "#root");
        org.junit.Assert.assertNotNull(elements10);
    }

    @Test
    public void test0485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0485");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.select.Elements elements6 = document3.getElementsByIndexLessThan((int) (short) 10);
        org.jsoup.nodes.Element element8 = document3.val("");
        org.jsoup.nodes.Element element10 = document3.after("#root");
        org.jsoup.nodes.Document document11 = document3.ownerDocument();
        java.lang.String str12 = document11.outerHtml();
        org.jsoup.select.Elements elements14 = document11.getElementsMatchingOwnText("html");
        java.lang.String str15 = document11.id();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(document11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str12, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertNotNull(elements14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test0486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0486");
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
        java.lang.String str25 = document3.outerHtml();
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
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str25, "<html>\n <head></head>\n <body></body>\n</html>");
    }

    @Test
    public void test0487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0487");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("#document");
        org.jsoup.select.Elements elements3 = document1.getElementsByClass("<html> <head> <title>&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt;&lt;/body&gt; &lt;/html&gt;</title> </head> <body></body> </html>");
        org.junit.Assert.assertNotNull(elements3);
    }

    @Test
    public void test0488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0488");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.select.Elements elements6 = document3.getElementsByIndexLessThan((int) (short) 10);
        org.jsoup.nodes.Element element8 = document3.val("");
        org.jsoup.nodes.Element element10 = document3.after("#root");
        org.jsoup.nodes.Element element11 = document3.nextElementSibling();
        java.lang.Integer int12 = element11.siblingIndex();
        org.jsoup.nodes.Element element14 = element11.prependElement("<head></head>\n<body></body>");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertNotNull(element14);
    }

    @Test
    public void test0489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0489");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.select.Elements elements6 = document3.getElementsByIndexLessThan((int) (short) 10);
        org.jsoup.nodes.Element element8 = document3.val("");
        org.jsoup.nodes.Element element11 = element8.attr("<html>\n <head></head>\n <body></body>\n</html>", "<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.select.Elements elements14 = element8.getElementsByAttributeValueStarting("html", "html");
        org.jsoup.nodes.Node node15 = element8.nextSibling();
        org.jsoup.nodes.Element element16 = element8.lastElementSibling();
        org.jsoup.select.Elements elements17 = element8.children();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(elements14);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(elements17);
    }

    @Test
    public void test0490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0490");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        java.lang.String str5 = document3.html();
        java.lang.String str6 = document3.html();
        java.util.Map<java.lang.String, java.lang.String> strMap7 = document3.dataset();
        org.jsoup.nodes.Element element9 = document3.appendElement("hi!");
        org.jsoup.select.Elements elements11 = document3.getElementsByClass("<html> <head></head> <body> </body> </html>");
        org.jsoup.nodes.Element element13 = document3.prepend("#document");
        org.jsoup.nodes.Element element15 = document3.prependText("<html>\n <head></head>\n <body>\n </body>\n</html>\n<html> \n <head></head> \n <body>  \n </body>\n</html>");
        org.jsoup.nodes.Document document16 = document3.normalise();
        org.jsoup.nodes.Element element18 = document16.text("html");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str5, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str6, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(document16);
        org.junit.Assert.assertNotNull(element18);
    }

    @Test
    public void test0491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0491");
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
        org.jsoup.nodes.Element element19 = element17.appendText("<html>\n <head></head>\n <body>\n </body>\n</html>\n<html> \n <head></head> \n <body>  \n </body>\n</html>");
        java.lang.String str20 = element17.val();
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
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test0492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0492");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.parser.Tag tag5 = document3.tag();
        org.jsoup.nodes.Element element7 = document3.val("");
        java.lang.String str8 = element7.val();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(tag5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0493");
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
        java.util.regex.Pattern pattern17 = null;
        org.jsoup.select.Elements elements18 = document3.getElementsByAttributeValueMatching("", pattern17);
        document3.title("<#root value=\"&lt;html&gt;\n &lt;head&gt;&lt;/head&gt;\n &lt;body&gt;&lt;/body&gt;\n&lt;/html&gt;\">\n <html>\n  <head></head>\n  <body></body>\n </html>\n</#root>#root\n<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.nodes.Element element21 = document3.empty();
        org.jsoup.select.Elements elements23 = element21.getElementsContainingOwnText("&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt;&lt;/body&gt; &lt;/html&gt;&amp;lt;html&amp;gt; &amp;lt;head&amp;gt;&amp;lt;/head&amp;gt; &amp;lt;body&amp;gt; &amp;lt;/body&amp;gt; &amp;lt;/html&amp;gt;<#root>\n <html>\n  <head></head>\n  <body></body>\n </html>\n</#root>\n<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str5, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str6, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(elements18);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertNotNull(elements23);
    }

    @Test
    public void test0494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0494");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        java.lang.String str5 = document3.html();
        java.lang.String str6 = document3.html();
        java.util.Map<java.lang.String, java.lang.String> strMap7 = document3.dataset();
        org.jsoup.nodes.Element element8 = document3.lastElementSibling();
        java.lang.String str9 = element8.tagName();
        boolean boolean10 = element8.hasText();
        org.jsoup.select.Elements elements12 = element8.getElementsMatchingText("");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str5, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str6, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "html" + "'", str9, "html");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(elements12);
    }

    @Test
    public void test0495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0495");
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
        java.lang.Integer int21 = document3.siblingIndex();
        java.lang.String str22 = document3.ownText();
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
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "<html> <head></head> <body> </body> </html>" + "'", str22, "<html> <head></head> <body> </body> </html>");
    }

    @Test
    public void test0496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0496");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.select.Elements elements6 = document3.getElementsByIndexLessThan((int) (short) 10);
        org.jsoup.nodes.Element element8 = document3.val("");
        org.jsoup.nodes.Element element10 = document3.after("#root");
        org.jsoup.select.Elements elements13 = document3.getElementsByAttributeValueMatching("<html>\n <head></head>\n <body></body>\n</html>&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;", "<html>\n <head></head>\n <body></body>\n</html>&lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;");
        org.jsoup.parser.Tag tag14 = document3.tag();
        boolean boolean16 = document3.hasAttr("<html> <head></head> <body> </body> </html>");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertNotNull(tag14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0497");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        java.lang.String str5 = document3.html();
        java.lang.String str6 = document3.html();
        java.util.Map<java.lang.String, java.lang.String> strMap7 = document3.dataset();
        org.jsoup.nodes.Element element9 = document3.appendText("<html>\n <head></head>\n <body>\n </body>\n</html>");
        org.jsoup.select.Elements elements12 = document3.getElementsByAttributeValueStarting("<html>\n <head></head>\n <body>\n </body>\n</html>", "<html> <head></head> <body> </body> </html>");
        org.jsoup.nodes.Element element13 = document3.nextElementSibling();
        org.jsoup.select.Elements elements16 = element13.getElementsByAttributeValueNot(" html", "<#root value=\"&lt;html&gt;\n &lt;head&gt;&lt;/head&gt;\n &lt;body&gt;&lt;/body&gt;\n&lt;/html&gt;\">\n <html>\n  <head></head>\n  <body></body>\n </html>\n</#root>#root\n<html>\n <head></head>\n <body></body>\n</html>");
        java.lang.String str17 = element13.html();
        org.jsoup.select.Elements elements19 = element13.getElementsMatchingText("<#root value=\"\" #root=\"&lt;html&gt;\n &lt;head&gt;&lt;/head&gt;\n &lt;body&gt;&lt;/body&gt;\n&lt;/html&gt;\" class=\"\">\n <html>\n  <head></head>\n  <body></body>\n </html><<html>\n <head></head>\n <body>\n </body>\n</html>></<html>\n <head></head>\n <body>\n </body>\n</html>>\n</#root>");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str5, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str6, "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(elements16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "<head></head>\n<body></body>" + "'", str17, "<head></head>\n<body></body>");
        org.junit.Assert.assertNotNull(elements19);
    }

    @Test
    public void test0498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0498");
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
        document3.title("<html> <head></head> <body></body> </html>");
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
    }

    @Test
    public void test0499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0499");
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
        java.lang.String str14 = element12.text();
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
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test0500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0500");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element4 = document1.prependChild((org.jsoup.nodes.Node) document3);
        org.jsoup.select.Elements elements6 = document3.getElementsByIndexLessThan((int) (short) 10);
        org.jsoup.nodes.Element element8 = document3.val("");
        org.jsoup.nodes.Element element10 = document3.after("#root");
        org.jsoup.nodes.Document document11 = document3.ownerDocument();
        java.lang.Integer int12 = document11.siblingIndex();
        java.lang.String str13 = document11.outerHtml();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(document11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str13, "<html>\n <head></head>\n <body></body>\n</html>");
    }
}

