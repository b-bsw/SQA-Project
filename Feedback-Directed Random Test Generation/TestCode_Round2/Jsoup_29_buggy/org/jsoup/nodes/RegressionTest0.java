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
        org.jsoup.nodes.Document.OutputSettings outputSettings0 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode1 = outputSettings0.escapeMode();
        java.lang.Class<?> wildcardClass2 = outputSettings0.getClass();
        org.junit.Assert.assertTrue("'" + escapeMode1 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode1.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0002");
        org.jsoup.nodes.Document.OutputSettings outputSettings0 = new org.jsoup.nodes.Document.OutputSettings();
        java.lang.Class<?> wildcardClass1 = outputSettings0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test0003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0003");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.nodes.Element element3 = document1.append("");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element5 = document1.tagName("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Tag name must not be empty.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(element3);
    }

    @Test
    public void test0004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0004");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean2 = document1.isBlock();
        org.jsoup.nodes.Element element4 = document1.html("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements6 = element4.getElementsByAttribute("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(element4);
    }

    @Test
    public void test0005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0005");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean2 = document1.isBlock();
        org.jsoup.nodes.Element element4 = document1.html("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements7 = document1.getElementsByAttributeValueContaining("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(element4);
    }

    @Test
    public void test0006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0006");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean2 = document1.isBlock();
        java.util.List<org.jsoup.nodes.DataNode> dataNodeList3 = document1.dataNodes();
        java.lang.String str5 = document1.attr("");
        org.jsoup.nodes.Document.QuirksMode quirksMode6 = org.jsoup.nodes.Document.QuirksMode.noQuirks;
        org.jsoup.nodes.Document document7 = document1.quirksMode(quirksMode6);
        java.lang.Class<?> wildcardClass8 = document1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(dataNodeList3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + quirksMode6 + "' != '" + org.jsoup.nodes.Document.QuirksMode.noQuirks + "'", quirksMode6.equals(org.jsoup.nodes.Document.QuirksMode.noQuirks));
        org.junit.Assert.assertNotNull(document7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0007");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.nodes.Element element3 = document1.append("");
        org.jsoup.nodes.Element element5 = element3.html("hi!");
        java.util.regex.Pattern pattern6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements7 = element3.getElementsMatchingOwnText(pattern6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
    }

    @Test
    public void test0008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0008");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements4 = document1.getElementsByAttributeValueMatching("hi!", "hi!");
        boolean boolean5 = document1.hasText();
        org.jsoup.nodes.Element element7 = document1.append("");
        org.jsoup.select.Elements elements8 = document1.siblingElements();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node9 = document1.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(elements8);
    }

    @Test
    public void test0009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0009");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements4 = document1.getElementsByAttributeValueMatching("hi!", "hi!");
        boolean boolean5 = document1.hasText();
        org.jsoup.nodes.Element element7 = document1.append("");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element9 = element7.after("<#root>\n <html>\n  <head></head>\n  <body></body>\n </html>\n</#root>");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(element7);
    }

    @Test
    public void test0010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0010");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = document1.textNodes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element4 = document1.after("<#root>\n <html>\n  <head></head>\n  <body></body>\n </html>\n</#root>");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(textNodeList2);
    }

    @Test
    public void test0011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0011");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements4 = document1.getElementsByAttributeValueMatching("hi!", "hi!");
        org.jsoup.nodes.Document document5 = document1.clone();
        org.jsoup.nodes.Document document6 = document5.normalise();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements9 = document5.getElementsByAttributeValue("<#root>\n <html>\n  <head></head>\n  <body></body>\n </html>\n</#root>", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNotNull(document5);
        org.junit.Assert.assertNotNull(document6);
    }

    @Test
    public void test0012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0012");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.nodes.Element element3 = document1.append("");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element5 = document1.createElement("");
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
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements4 = document1.getElementsByAttributeValueMatching("hi!", "hi!");
        org.jsoup.nodes.Document document5 = document1.clone();
        org.jsoup.nodes.Document document6 = document5.normalise();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element8 = document6.prependElement("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNotNull(document5);
        org.junit.Assert.assertNotNull(document6);
    }

    @Test
    public void test0014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0014");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = document1.textNodes();
        org.jsoup.nodes.Element element4 = document1.prependElement("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element7 = element4.attr("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertNotNull(element4);
    }

    @Test
    public void test0015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0015");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = document1.textNodes();
        org.jsoup.nodes.Element element4 = document1.prependElement("hi!");
        java.lang.String str5 = element4.id();
        org.jsoup.nodes.Element element6 = element4.firstElementSibling();
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(element6);
    }

    @Test
    public void test0016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0016");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean2 = document1.isBlock();
        java.util.Map<java.lang.String, java.lang.String> strMap3 = document1.dataset();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strMap3);
    }

    @Test
    public void test0017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0017");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements4 = document1.getElementsByAttributeValueMatching("hi!", "hi!");
        org.jsoup.nodes.Document document5 = document1.clone();
        org.jsoup.nodes.Document document6 = document5.normalise();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements8 = document5.select("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNotNull(document5);
        org.junit.Assert.assertNotNull(document6);
    }

    @Test
    public void test0018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0018");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements4 = document1.getElementsByAttributeValueMatching("hi!", "hi!");
        boolean boolean5 = document1.hasText();
        org.jsoup.select.Elements elements8 = document1.getElementsByAttributeValueContaining("hi!", "hi!");
        org.jsoup.nodes.Element element10 = document1.append("<#root>\n <html>\n  <head></head>\n  <body></body>\n </html>\n</#root>");
        java.lang.Integer int11 = document1.elementSiblingIndex();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element13 = document1.child(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test0019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0019");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean2 = document1.isBlock();
        org.jsoup.nodes.Element element4 = document1.toggleClass("hi!");
        org.jsoup.select.Elements elements6 = element4.getElementsByIndexGreaterThan(0);
        java.lang.String str7 = element4.val();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0020");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean2 = document1.isBlock();
        org.jsoup.nodes.Element element4 = document1.toggleClass("hi!");
        java.lang.String str5 = element4.data();
        org.jsoup.select.Elements elements7 = element4.getElementsMatchingOwnText("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(elements7);
    }

    @Test
    public void test0021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0021");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = document1.textNodes();
        org.jsoup.nodes.Element element4 = document1.prependElement("hi!");
        org.jsoup.nodes.Element element6 = document1.html("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element8 = element6.after("#document");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element6);
    }

    @Test
    public void test0022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0022");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean2 = document1.isBlock();
        java.util.List<org.jsoup.nodes.DataNode> dataNodeList3 = document1.dataNodes();
        java.lang.String str5 = document1.attr("");
        java.lang.String str6 = document1.text();
        java.util.regex.Pattern pattern8 = null;
        org.jsoup.select.Elements elements9 = document1.getElementsByAttributeValueMatching("#document", pattern8);
        // The following exception was thrown during execution in test generation
        try {
            document1.title("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(dataNodeList3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(elements9);
    }

    @Test
    public void test0023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0023");
        org.jsoup.nodes.Document.OutputSettings outputSettings0 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings1 = outputSettings0.clone();
        org.jsoup.nodes.Document.OutputSettings outputSettings3 = outputSettings0.indentAmount((int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document.OutputSettings outputSettings5 = outputSettings0.charset("<#root></#root>");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: <#root></#root>");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(outputSettings1);
        org.junit.Assert.assertNotNull(outputSettings3);
    }

    @Test
    public void test0024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0024");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean2 = document1.isBlock();
        org.jsoup.nodes.Element element4 = document1.html("hi!");
        java.lang.Class<?> wildcardClass5 = document1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0025");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean2 = document1.isBlock();
        org.jsoup.nodes.Element element4 = document1.toggleClass("hi!");
        java.lang.String str5 = document1.nodeName();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements8 = document1.getElementsByAttributeValueStarting("<#root></#root>", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#document" + "'", str5, "#document");
    }

    @Test
    public void test0026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0026");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements4 = document1.getElementsByAttributeValueMatching("hi!", "hi!");
        boolean boolean5 = document1.hasText();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node6 = document1.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0027");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements4 = document1.getElementsByAttributeValueMatching("hi!", "hi!");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet7 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet7, strArray6);
        org.jsoup.nodes.Element element9 = document1.classNames((java.util.Set<java.lang.String>) strSet7);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements11 = document1.select("<hi!></hi!>");
            org.junit.Assert.fail("Expected exception of type org.jsoup.select.Selector.SelectorParseException; message: Could not parse query '<hi!></hi!>': unexpected token at '<hi!></hi!>'");
        } catch (org.jsoup.select.Selector.SelectorParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(element9);
    }

    @Test
    public void test0028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0028");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.nodes.Element element3 = document1.append("");
        org.jsoup.nodes.Element element5 = document1.toggleClass("");
        org.jsoup.nodes.Node node6 = document1.nextSibling();
        org.jsoup.nodes.Element element8 = document1.prependElement("<#root>\n <html>\n  <head></head>\n  <body></body>\n </html>\n</#root>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements10 = element8.getElementsByAttribute("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNotNull(element8);
    }

    @Test
    public void test0029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0029");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = document1.textNodes();
        java.util.List<org.jsoup.nodes.TextNode> textNodeList3 = document1.textNodes();
        org.jsoup.nodes.Document.OutputSettings outputSettings4 = document1.outputSettings();
        java.util.regex.Pattern pattern5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements6 = document1.getElementsMatchingOwnText(pattern5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertNotNull(textNodeList3);
        org.junit.Assert.assertNotNull(outputSettings4);
    }

    @Test
    public void test0030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0030");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.nodes.Element element3 = document1.append("");
        org.jsoup.nodes.Element element5 = element3.html("hi!");
        org.jsoup.select.NodeVisitor nodeVisitor6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node7 = element3.traverse(nodeVisitor6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
    }

    @Test
    public void test0031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0031");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements4 = document1.getElementsByAttributeValueMatching("hi!", "hi!");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet7 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet7, strArray6);
        org.jsoup.nodes.Element element9 = document1.classNames((java.util.Set<java.lang.String>) strSet7);
        java.lang.Class<?> wildcardClass10 = document1.getClass();
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0032");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean2 = document1.isBlock();
        java.util.List<org.jsoup.nodes.DataNode> dataNodeList3 = document1.dataNodes();
        java.lang.String str5 = document1.attr("");
        org.jsoup.nodes.Document.QuirksMode quirksMode6 = org.jsoup.nodes.Document.QuirksMode.noQuirks;
        org.jsoup.nodes.Document document7 = document1.quirksMode(quirksMode6);
        org.jsoup.nodes.Document document8 = document1.ownerDocument();
        org.jsoup.select.Elements elements10 = document8.getElementsByIndexLessThan((int) ' ');
        org.jsoup.nodes.Document document12 = new org.jsoup.nodes.Document("");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList13 = document12.textNodes();
        org.jsoup.nodes.Element element15 = document12.prependElement("hi!");
        java.lang.String str16 = element15.baseUri();
        org.jsoup.nodes.Element element18 = element15.toggleClass("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element19 = document8.after((org.jsoup.nodes.Node) element15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(dataNodeList3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + quirksMode6 + "' != '" + org.jsoup.nodes.Document.QuirksMode.noQuirks + "'", quirksMode6.equals(org.jsoup.nodes.Document.QuirksMode.noQuirks));
        org.junit.Assert.assertNotNull(document7);
        org.junit.Assert.assertNotNull(document8);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertNotNull(textNodeList13);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(element18);
    }

    @Test
    public void test0033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0033");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.nodes.Element element3 = document1.append("");
        org.jsoup.nodes.Element element5 = element3.html("hi!");
        java.lang.String str6 = element3.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element8 = element3.child(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test0034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0034");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean2 = document1.isBlock();
        org.jsoup.nodes.Element element4 = document1.toggleClass("hi!");
        org.jsoup.select.Elements elements6 = element4.getElementsByIndexGreaterThan(0);
        java.util.regex.Pattern pattern7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements8 = element4.getElementsMatchingOwnText(pattern7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(elements6);
    }

    @Test
    public void test0035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0035");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean2 = document1.isBlock();
        java.lang.String str3 = document1.nodeName();
        boolean boolean5 = document1.hasClass("<#root></#root>");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#document" + "'", str3, "#document");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0036");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements4 = document1.getElementsByAttributeValueMatching("hi!", "hi!");
        boolean boolean5 = document1.hasText();
        org.jsoup.select.Elements elements8 = document1.getElementsByAttributeValueContaining("hi!", "hi!");
        org.jsoup.nodes.Element element10 = document1.append("<#root>\n <html>\n  <head></head>\n  <body></body>\n </html>\n</#root>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element12 = element10.child((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(element10);
    }

    @Test
    public void test0037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0037");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = document1.textNodes();
        org.jsoup.select.Elements elements3 = document1.getAllElements();
        org.jsoup.nodes.Document document5 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements8 = document5.getElementsByAttributeValueMatching("hi!", "hi!");
        boolean boolean9 = document5.hasText();
        org.jsoup.nodes.Element element11 = document5.append("");
        org.jsoup.nodes.Element element12 = document1.appendChild((org.jsoup.nodes.Node) document5);
        org.jsoup.nodes.Element element14 = document1.prependElement("<#root></#root>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element16 = document1.child((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(element14);
    }

    @Test
    public void test0038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0038");
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
        java.util.regex.Pattern pattern20 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements21 = document1.getElementsMatchingOwnText(pattern20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "<#root></#root>" + "'", str13, "<#root></#root>");
        org.junit.Assert.assertNotNull(document14);
        org.junit.Assert.assertNotNull(outputSettings16);
        org.junit.Assert.assertNotNull(outputSettings18);
        org.junit.Assert.assertNotNull(document19);
    }

    @Test
    public void test0039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0039");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = document1.textNodes();
        org.jsoup.nodes.Element element4 = document1.prependElement("hi!");
        org.jsoup.nodes.Element element6 = document1.html("hi!");
        org.jsoup.select.Elements elements8 = document1.getElementsByClass("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node9 = document1.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(elements8);
    }

    @Test
    public void test0040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0040");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements4 = document1.getElementsByAttributeValueMatching("hi!", "hi!");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet7 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet7, strArray6);
        org.jsoup.nodes.Element element9 = document1.classNames((java.util.Set<java.lang.String>) strSet7);
        org.jsoup.nodes.Element element11 = document1.getElementById("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements13 = element11.getElementsByTag("#root");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNull(element11);
    }

    @Test
    public void test0041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0041");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements4 = document1.getElementsByAttributeValueMatching("hi!", "hi!");
        org.jsoup.nodes.Document document5 = document1.clone();
        org.jsoup.nodes.Document document6 = document5.normalise();
        java.util.regex.Pattern pattern7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements8 = document5.getElementsMatchingOwnText(pattern7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNotNull(document5);
        org.junit.Assert.assertNotNull(document6);
    }

    @Test
    public void test0042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0042");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements4 = document1.getElementsByAttributeValueMatching("hi!", "hi!");
        boolean boolean5 = document1.hasText();
        org.jsoup.nodes.Element element7 = document1.append("");
        org.jsoup.select.Elements elements8 = document1.siblingElements();
        org.jsoup.nodes.Document document9 = document1.clone();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element11 = document9.child((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 52 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(document9);
    }

    @Test
    public void test0043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0043");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements4 = document1.getElementsByAttributeValueMatching("hi!", "hi!");
        org.jsoup.nodes.Document document5 = document1.clone();
        org.jsoup.nodes.Document document6 = document5.normalise();
        org.jsoup.nodes.Element element7 = document6.parent();
        java.lang.Object obj8 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = element7.equals(obj8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNotNull(document5);
        org.junit.Assert.assertNotNull(document6);
        org.junit.Assert.assertNull(element7);
    }

    @Test
    public void test0044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0044");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements4 = document1.getElementsByAttributeValueMatching("hi!", "hi!");
        boolean boolean5 = document1.hasText();
        org.jsoup.select.Elements elements8 = document1.getElementsByAttributeValueContaining("hi!", "hi!");
        org.jsoup.nodes.Element element10 = document1.append("<#root>\n <html>\n  <head></head>\n  <body></body>\n </html>\n</#root>");
        org.jsoup.select.Elements elements12 = element10.select("#root");
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(elements12);
    }

    @Test
    public void test0045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0045");
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
        // The following exception was thrown during execution in test generation
        try {
            element14.setBaseUri("<#root>\n <html>\n  <head></head>\n  <body></body>\n </html>\n</#root>");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertNull(element14);
    }

    @Test
    public void test0046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0046");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements4 = document1.getElementsByAttributeValueMatching("hi!", "hi!");
        org.jsoup.nodes.Element element5 = document1.head();
        org.jsoup.nodes.Document.OutputSettings outputSettings6 = document1.outputSettings();
        java.util.regex.Pattern pattern7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements8 = document1.getElementsMatchingOwnText(pattern7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNull(element5);
        org.junit.Assert.assertNotNull(outputSettings6);
    }

    @Test
    public void test0047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0047");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.nodes.Element element3 = document1.append("");
        org.jsoup.nodes.Element element5 = document1.html("<#root></#root>");
        org.jsoup.nodes.Document document6 = document1.ownerDocument();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element8 = document1.child(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(document6);
    }

    @Test
    public void test0048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0048");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean2 = document1.isBlock();
        java.util.List<org.jsoup.nodes.DataNode> dataNodeList3 = document1.dataNodes();
        java.lang.String str5 = document1.attr("");
        org.jsoup.nodes.Node node6 = document1.nextSibling();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass7 = node6.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(dataNodeList3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(node6);
    }

    @Test
    public void test0049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0049");
        org.jsoup.nodes.Document.OutputSettings outputSettings0 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings1 = outputSettings0.clone();
        org.jsoup.nodes.Document.OutputSettings outputSettings2 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode3 = outputSettings2.escapeMode();
        java.nio.charset.Charset charset4 = outputSettings2.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings5 = outputSettings1.charset(charset4);
        org.jsoup.nodes.Document.OutputSettings outputSettings6 = outputSettings1.clone();
        java.nio.charset.CharsetEncoder charsetEncoder7 = outputSettings1.encoder();
        org.junit.Assert.assertNotNull(outputSettings1);
        org.junit.Assert.assertTrue("'" + escapeMode3 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode3.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset4);
        org.junit.Assert.assertNotNull(outputSettings5);
        org.junit.Assert.assertNotNull(outputSettings6);
        org.junit.Assert.assertNotNull(charsetEncoder7);
    }

    @Test
    public void test0050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0050");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = document1.textNodes();
        org.jsoup.select.Elements elements3 = document1.getAllElements();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element5 = document1.before("<hi!></hi!>");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertNotNull(elements3);
    }

    @Test
    public void test0051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0051");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements4 = document1.getElementsByAttributeValueMatching("hi!", "hi!");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet7 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet7, strArray6);
        org.jsoup.nodes.Element element9 = document1.classNames((java.util.Set<java.lang.String>) strSet7);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node10 = element9.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(element9);
    }

    @Test
    public void test0052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0052");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean2 = document1.isBlock();
        org.jsoup.nodes.Element element4 = document1.toggleClass("hi!");
        org.jsoup.nodes.Element element5 = document1.previousElementSibling();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = element5.isBlock();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNull(element5);
    }

    @Test
    public void test0053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0053");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean2 = document1.isBlock();
        org.jsoup.nodes.Element element4 = document1.toggleClass("hi!");
        org.jsoup.select.Elements elements6 = element4.getElementsByIndexGreaterThan(0);
        java.util.List<org.jsoup.nodes.TextNode> textNodeList7 = element4.textNodes();
        java.util.regex.Pattern pattern8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements9 = element4.getElementsMatchingOwnText(pattern8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(textNodeList7);
    }

    @Test
    public void test0054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0054");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.nodes.Element element3 = document1.append("");
        org.jsoup.select.NodeVisitor nodeVisitor4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node5 = document1.traverse(nodeVisitor4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(element3);
    }

    @Test
    public void test0055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0055");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements4 = document1.getElementsByAttributeValueMatching("hi!", "hi!");
        boolean boolean5 = document1.hasText();
        org.jsoup.nodes.Element element7 = document1.appendElement("<#root>\n <html>\n  <head></head>\n  <body></body>\n </html>\n</#root>");
        java.util.regex.Pattern pattern8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements9 = document1.getElementsMatchingText(pattern8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(element7);
    }

    @Test
    public void test0056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0056");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements4 = document1.getElementsByAttributeValueMatching("hi!", "hi!");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet7 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet7, strArray6);
        org.jsoup.nodes.Element element9 = document1.classNames((java.util.Set<java.lang.String>) strSet7);
        org.jsoup.nodes.Document document10 = document1.clone();
        org.jsoup.nodes.Document document12 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements15 = document12.getElementsByAttributeValueMatching("hi!", "hi!");
        org.jsoup.nodes.Element element16 = document12.head();
        org.jsoup.nodes.Document.OutputSettings outputSettings17 = document12.outputSettings();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element18 = document1.before((org.jsoup.nodes.Node) document12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(document10);
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertNull(element16);
        org.junit.Assert.assertNotNull(outputSettings17);
    }

    @Test
    public void test0057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0057");
        org.jsoup.nodes.Document.OutputSettings outputSettings0 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings1 = outputSettings0.clone();
        org.jsoup.nodes.Document.OutputSettings outputSettings2 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode3 = outputSettings2.escapeMode();
        java.nio.charset.Charset charset4 = outputSettings2.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings5 = outputSettings1.charset(charset4);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document.OutputSettings outputSettings7 = outputSettings5.charset("");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: ");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(outputSettings1);
        org.junit.Assert.assertTrue("'" + escapeMode3 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode3.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset4);
        org.junit.Assert.assertNotNull(outputSettings5);
    }

    @Test
    public void test0058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0058");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.nodes.Element element3 = document1.append("");
        org.jsoup.nodes.Element element5 = document1.toggleClass("");
        org.jsoup.nodes.Element element6 = document1.previousElementSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element8 = element6.prepend("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNull(element6);
    }

    @Test
    public void test0059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0059");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements4 = document1.getElementsByAttributeValueMatching("hi!", "hi!");
        org.jsoup.nodes.Document document5 = document1.clone();
        java.lang.String str6 = document1.tagName();
        org.jsoup.select.Elements elements8 = document1.getElementsMatchingText("");
        org.jsoup.select.Elements elements10 = document1.getElementsContainingText("hi!");
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNotNull(document5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "#root" + "'", str6, "#root");
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(elements10);
    }

    @Test
    public void test0060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0060");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean2 = document1.isBlock();
        java.util.List<org.jsoup.nodes.DataNode> dataNodeList3 = document1.dataNodes();
        java.lang.String str5 = document1.attr("");
        org.jsoup.nodes.Document.QuirksMode quirksMode6 = org.jsoup.nodes.Document.QuirksMode.noQuirks;
        org.jsoup.nodes.Document document7 = document1.quirksMode(quirksMode6);
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = document1.outputSettings();
        org.jsoup.nodes.Element element9 = document1.parent();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element11 = element9.after("<#root></#root>");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(dataNodeList3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + quirksMode6 + "' != '" + org.jsoup.nodes.Document.QuirksMode.noQuirks + "'", quirksMode6.equals(org.jsoup.nodes.Document.QuirksMode.noQuirks));
        org.junit.Assert.assertNotNull(document7);
        org.junit.Assert.assertNotNull(outputSettings8);
        org.junit.Assert.assertNull(element9);
    }

    @Test
    public void test0061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0061");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.nodes.Element element3 = document1.append("");
        org.jsoup.nodes.Element element5 = document1.toggleClass("");
        java.lang.String str6 = document1.nodeName();
        // The following exception was thrown during execution in test generation
        try {
            document1.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "#document" + "'", str6, "#document");
    }

    @Test
    public void test0062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0062");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.nodes.Element element3 = document1.append("");
        org.jsoup.nodes.Element element5 = element3.html("hi!");
        java.lang.String str6 = element5.val();
        java.lang.String str7 = element5.toString();
        org.jsoup.nodes.Element element9 = element5.append("#document");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements11 = element9.getElementsByTag("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(element9);
    }

    @Test
    public void test0063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0063");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements4 = document1.getElementsByAttributeValueMatching("hi!", "hi!");
        org.jsoup.nodes.Document document5 = document1.clone();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element7 = document1.before("<hi!></hi!>");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNotNull(document5);
    }

    @Test
    public void test0064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0064");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Element element3 = document1.removeClass("<#root></#root>");
        org.jsoup.nodes.Document document5 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements8 = document5.getElementsByAttributeValueMatching("hi!", "hi!");
        boolean boolean9 = document5.hasText();
        org.jsoup.select.Elements elements12 = document5.getElementsByAttributeValueContaining("hi!", "hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap13 = document5.dataset();
        // The following exception was thrown during execution in test generation
        try {
            element3.replaceWith((org.jsoup.nodes.Node) document5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertNotNull(strMap13);
    }

    @Test
    public void test0065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0065");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = document1.textNodes();
        org.jsoup.nodes.Element element4 = document1.prependElement("hi!");
        org.jsoup.nodes.Document.OutputSettings outputSettings5 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings6 = outputSettings5.clone();
        org.jsoup.nodes.Document.OutputSettings outputSettings7 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode8 = outputSettings7.escapeMode();
        java.nio.charset.Charset charset9 = outputSettings7.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = outputSettings6.charset(charset9);
        java.lang.Class<?> wildcardClass11 = outputSettings10.getClass();
        boolean boolean12 = element4.equals((java.lang.Object) outputSettings10);
        org.jsoup.nodes.Element element13 = element4.lastElementSibling();
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(outputSettings6);
        org.junit.Assert.assertTrue("'" + escapeMode8 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode8.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset9);
        org.junit.Assert.assertNotNull(outputSettings10);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(element13);
    }

    @Test
    public void test0066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0066");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.nodes.Element element3 = document1.append("");
        org.jsoup.nodes.Element element5 = document1.toggleClass("");
        org.jsoup.nodes.Node node6 = document1.nextSibling();
        org.jsoup.nodes.Element element8 = document1.prependElement("<#root>\n <html>\n  <head></head>\n  <body></body>\n </html>\n</#root>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements10 = element8.select("<hi!></hi!>");
            org.junit.Assert.fail("Expected exception of type org.jsoup.select.Selector.SelectorParseException; message: Could not parse query '<hi!></hi!>': unexpected token at '<hi!></hi!>'");
        } catch (org.jsoup.select.Selector.SelectorParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNotNull(element8);
    }

    @Test
    public void test0067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0067");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = document1.textNodes();
        org.jsoup.nodes.Element element4 = document1.prependElement("hi!");
        java.lang.String str5 = document1.val();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element7 = document1.before("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test0068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0068");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements4 = document1.getElementsByAttributeValueMatching("hi!", "hi!");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet7 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet7, strArray6);
        org.jsoup.nodes.Element element9 = document1.classNames((java.util.Set<java.lang.String>) strSet7);
        org.jsoup.nodes.Document document10 = document1.clone();
        java.lang.String str11 = document1.ownText();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements13 = document1.select("<#root>\n <html>\n  <head></head>\n  <body></body>\n </html>\n</#root>");
            org.junit.Assert.fail("Expected exception of type org.jsoup.select.Selector.SelectorParseException; message: Could not parse query '<#root>? <html>?  <head></head>?  <body></body>? </html>?</#root>': unexpected token at '<#root>? <html>?  <head></head>?  <body></body>? </html>?</#root>'");
        } catch (org.jsoup.select.Selector.SelectorParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(document10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test0069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0069");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.nodes.Element element3 = document1.append("");
        org.jsoup.nodes.Element element5 = element3.html("hi!");
        java.lang.String str6 = element3.tagName();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element8 = element3.wrap("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "#root" + "'", str6, "#root");
    }

    @Test
    public void test0070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0070");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements4 = document1.getElementsByAttributeValueMatching("hi!", "hi!");
        boolean boolean6 = document1.hasClass("");
        org.jsoup.nodes.Element element7 = document1.body();
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(element7);
    }

    @Test
    public void test0071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0071");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.nodes.Element element3 = document1.append("");
        org.jsoup.nodes.Element element5 = element3.html("hi!");
        java.lang.String str6 = element5.val();
        java.lang.String str7 = element5.toString();
        org.jsoup.nodes.Element element9 = element5.append("#document");
        java.lang.String str10 = element5.data();
        java.lang.String str11 = element5.baseUri();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test0072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0072");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean2 = document1.isBlock();
        java.util.List<org.jsoup.nodes.DataNode> dataNodeList3 = document1.dataNodes();
        java.lang.String str5 = document1.attr("");
        org.jsoup.nodes.Document.QuirksMode quirksMode6 = org.jsoup.nodes.Document.QuirksMode.noQuirks;
        org.jsoup.nodes.Document document7 = document1.quirksMode(quirksMode6);
        org.jsoup.nodes.Document document8 = document1.ownerDocument();
        org.jsoup.nodes.Document document10 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements13 = document10.getElementsByAttributeValueMatching("hi!", "hi!");
        java.lang.String[] strArray15 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet16 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet16, strArray15);
        org.jsoup.nodes.Element element18 = document10.classNames((java.util.Set<java.lang.String>) strSet16);
        org.jsoup.nodes.Element element19 = document8.classNames((java.util.Set<java.lang.String>) strSet16);
        org.jsoup.nodes.Document document21 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements24 = document21.getElementsByAttributeValueMatching("hi!", "hi!");
        java.lang.String[] strArray26 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet27 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet27, strArray26);
        org.jsoup.nodes.Element element29 = document21.classNames((java.util.Set<java.lang.String>) strSet27);
        boolean boolean30 = element19.equals((java.lang.Object) document21);
        java.util.regex.Pattern pattern31 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements32 = element19.getElementsMatchingOwnText(pattern31);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(dataNodeList3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + quirksMode6 + "' != '" + org.jsoup.nodes.Document.QuirksMode.noQuirks + "'", quirksMode6.equals(org.jsoup.nodes.Document.QuirksMode.noQuirks));
        org.junit.Assert.assertNotNull(document7);
        org.junit.Assert.assertNotNull(document8);
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertNotNull(elements24);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertArrayEquals(strArray26, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(element29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test0073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0073");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.nodes.Element element3 = document1.append("");
        org.jsoup.nodes.Element element5 = element3.html("hi!");
        java.lang.String str6 = element5.val();
        java.lang.String str7 = element5.toString();
        org.jsoup.nodes.Element element9 = element5.append("#document");
        java.util.regex.Pattern pattern10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements11 = element9.getElementsMatchingText(pattern10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(element9);
    }

    @Test
    public void test0074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0074");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements4 = document1.getElementsByAttributeValueMatching("hi!", "hi!");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet7 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet7, strArray6);
        org.jsoup.nodes.Element element9 = document1.classNames((java.util.Set<java.lang.String>) strSet7);
        org.jsoup.nodes.Document document10 = document1.clone();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node11 = document1.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(document10);
    }

    @Test
    public void test0075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0075");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean2 = document1.isBlock();
        org.jsoup.nodes.Element element4 = document1.toggleClass("hi!");
        org.jsoup.nodes.Attributes attributes5 = element4.attributes();
        org.jsoup.nodes.Element element7 = element4.appendElement("<hi!></hi!>");
        java.lang.String str8 = element4.data();
        org.jsoup.select.Elements elements10 = element4.getElementsMatchingText("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(attributes5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(elements10);
    }

    @Test
    public void test0076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0076");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.nodes.Element element3 = document1.append("");
        org.jsoup.nodes.Element element5 = document1.html("<#root></#root>");
        org.jsoup.select.Elements elements8 = document1.getElementsByAttributeValueStarting("<#root></#root>", "<#root></#root>");
        java.util.regex.Pattern pattern9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements10 = document1.getElementsMatchingText(pattern9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements8);
    }

    @Test
    public void test0077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0077");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements4 = document1.getElementsByAttributeValueMatching("hi!", "hi!");
        boolean boolean5 = document1.hasText();
        org.jsoup.select.Elements elements8 = document1.getElementsByAttributeValueContaining("hi!", "hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element10 = document1.tagName("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Tag name must not be empty.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(elements8);
    }

    @Test
    public void test0078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0078");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean2 = document1.isBlock();
        org.jsoup.nodes.Element element4 = document1.toggleClass("hi!");
        org.jsoup.nodes.Attributes attributes5 = element4.attributes();
        org.jsoup.nodes.Element element7 = element4.appendElement("<hi!></hi!>");
        java.lang.String[] strArray13 = new java.lang.String[] { "", "<#root>\n <html>\n  <head></head>\n  <body></body>\n </html>\n</#root>", "<#root></#root>", "<#root></#root>", "#document" };
        java.util.LinkedHashSet<java.lang.String> strSet14 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet14, strArray13);
        org.jsoup.nodes.Element element16 = element7.classNames((java.util.Set<java.lang.String>) strSet14);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node18 = element7.childNode((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 35 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(attributes5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[] { "", "<#root>\n <html>\n  <head></head>\n  <body></body>\n </html>\n</#root>", "<#root></#root>", "<#root></#root>", "#document" });
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(element16);
    }

    @Test
    public void test0079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0079");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = document1.textNodes();
        org.jsoup.nodes.Element element4 = document1.prependElement("hi!");
        org.jsoup.nodes.Element element6 = document1.html("hi!");
        java.util.regex.Pattern pattern7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements8 = element6.getElementsMatchingOwnText(pattern7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element6);
    }

    @Test
    public void test0080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0080");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.nodes.Element element3 = document1.append("");
        org.jsoup.nodes.Element element5 = element3.html("hi!");
        int int6 = element3.siblingIndex();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements9 = element3.getElementsByAttributeValueContaining("hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0081");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements4 = document1.getElementsByAttributeValueMatching("hi!", "hi!");
        boolean boolean5 = document1.hasText();
        org.jsoup.select.Elements elements8 = document1.getElementsByAttributeValueContaining("hi!", "hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap9 = document1.dataset();
        java.util.regex.Pattern pattern10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements11 = document1.getElementsMatchingOwnText(pattern10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(strMap9);
    }

    @Test
    public void test0082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0082");
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
        org.jsoup.select.Elements elements18 = document14.getElementsByIndexGreaterThan((int) (byte) 0);
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "<#root></#root>" + "'", str13, "<#root></#root>");
        org.junit.Assert.assertNotNull(document14);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(elements18);
    }

    @Test
    public void test0083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0083");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.nodes.Element element3 = document1.append("");
        org.jsoup.nodes.Element element5 = document1.toggleClass("");
        boolean boolean7 = element5.hasClass("");
        org.jsoup.nodes.Element element9 = element5.prependElement("<#root></#root>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element11 = element5.after("<hi!></hi!>");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(element9);
    }

    @Test
    public void test0084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0084");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements4 = document1.getElementsByAttributeValueMatching("hi!", "hi!");
        boolean boolean5 = document1.hasText();
        org.jsoup.nodes.Element element7 = document1.append("");
        org.jsoup.select.Elements elements8 = document1.siblingElements();
        org.jsoup.nodes.Document document9 = document1.clone();
        java.util.Map<java.lang.String, java.lang.String> strMap10 = document1.dataset();
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(document9);
        org.junit.Assert.assertNotNull(strMap10);
    }

    @Test
    public void test0085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0085");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean2 = document1.isBlock();
        org.jsoup.nodes.Element element4 = document1.toggleClass("hi!");
        org.jsoup.nodes.Attributes attributes5 = element4.attributes();
        org.jsoup.nodes.Element element7 = element4.appendElement("<hi!></hi!>");
        java.lang.String[] strArray13 = new java.lang.String[] { "", "<#root>\n <html>\n  <head></head>\n  <body></body>\n </html>\n</#root>", "<#root></#root>", "<#root></#root>", "#document" };
        java.util.LinkedHashSet<java.lang.String> strSet14 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet14, strArray13);
        org.jsoup.nodes.Element element16 = element7.classNames((java.util.Set<java.lang.String>) strSet14);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements18 = element7.getElementsByTag("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(attributes5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[] { "", "<#root>\n <html>\n  <head></head>\n  <body></body>\n </html>\n</#root>", "<#root></#root>", "<#root></#root>", "#document" });
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(element16);
    }

    @Test
    public void test0086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0086");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.nodes.Element element3 = document1.append("");
        org.jsoup.nodes.Element element5 = element3.html("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap6 = element5.dataset();
        org.jsoup.nodes.Document document8 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.nodes.Element element10 = document8.append("");
        org.jsoup.nodes.Element element12 = element10.html("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element13 = element5.after((org.jsoup.nodes.Node) element12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNotNull(document8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element12);
    }

    @Test
    public void test0087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0087");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.nodes.Element element3 = document1.append("");
        org.jsoup.nodes.Element element5 = document1.toggleClass("");
        org.jsoup.nodes.Node node6 = document1.nextSibling();
        org.jsoup.nodes.Element element8 = document1.prependElement("<#root>\n <html>\n  <head></head>\n  <body></body>\n </html>\n</#root>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node10 = element8.childNode((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 52 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNotNull(element8);
    }

    @Test
    public void test0088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0088");
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
        java.lang.String str15 = document1.val();
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(document10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(elements14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test0089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0089");
        org.jsoup.nodes.Document.OutputSettings outputSettings0 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode1 = outputSettings0.escapeMode();
        java.nio.charset.Charset charset2 = outputSettings0.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings3 = outputSettings0.clone();
        org.jsoup.nodes.Document.OutputSettings outputSettings4 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode5 = outputSettings4.escapeMode();
        int int6 = outputSettings4.indentAmount();
        org.jsoup.nodes.Entities.EscapeMode escapeMode7 = outputSettings4.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = outputSettings0.escapeMode(escapeMode7);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document.OutputSettings outputSettings10 = outputSettings8.charset("#root");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: #root");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + escapeMode1 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode1.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset2);
        org.junit.Assert.assertNotNull(outputSettings3);
        org.junit.Assert.assertTrue("'" + escapeMode5 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode5.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + escapeMode7 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode7.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings8);
    }

    @Test
    public void test0090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0090");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements4 = document1.getElementsByAttributeValueMatching("hi!", "hi!");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet7 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet7, strArray6);
        org.jsoup.nodes.Element element9 = document1.classNames((java.util.Set<java.lang.String>) strSet7);
        org.jsoup.nodes.Element element11 = document1.getElementById("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Tag tag12 = element11.tag();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNull(element11);
    }

    @Test
    public void test0091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0091");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements4 = document1.getElementsByAttributeValueMatching("hi!", "hi!");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet7 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet7, strArray6);
        org.jsoup.nodes.Element element9 = document1.classNames((java.util.Set<java.lang.String>) strSet7);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element11 = document1.child(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(element9);
    }

    @Test
    public void test0092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0092");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements4 = document1.getElementsByAttributeValueMatching("hi!", "hi!");
        org.jsoup.nodes.Document document5 = document1.clone();
        org.jsoup.nodes.Node node7 = document1.removeAttr("hi!");
        org.jsoup.select.Elements elements8 = document1.getAllElements();
        org.jsoup.nodes.Element element9 = document1.previousElementSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements11 = element9.getElementsContainingOwnText("<html>\n <head></head>\n <body></body>\n</html>");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNotNull(document5);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNull(element9);
    }

    @Test
    public void test0093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0093");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements4 = document1.getElementsByAttributeValueMatching("hi!", "hi!");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet7 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet7, strArray6);
        org.jsoup.nodes.Element element9 = document1.classNames((java.util.Set<java.lang.String>) strSet7);
        org.jsoup.nodes.Document document10 = document1.clone();
        java.lang.String str11 = document1.outerHtml();
        java.lang.String str13 = document1.attr("");
        org.jsoup.select.NodeVisitor nodeVisitor14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node15 = document1.traverse(nodeVisitor14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(document10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test0094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0094");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.nodes.Element element3 = document1.append("");
        org.jsoup.nodes.Element element5 = document1.html("<#root></#root>");
        org.jsoup.select.Elements elements8 = document1.getElementsByAttributeValueStarting("<#root></#root>", "<#root></#root>");
        org.jsoup.nodes.Element element10 = document1.append("<#root></#root>");
        java.lang.String str11 = document1.val();
        org.jsoup.nodes.Element element13 = document1.addClass("<#root>");
        java.util.regex.Pattern pattern14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements15 = document1.getElementsMatchingText(pattern14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(element13);
    }

    @Test
    public void test0095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0095");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean2 = document1.isBlock();
        org.jsoup.nodes.Element element4 = document1.html("hi!");
        org.jsoup.select.Elements elements6 = element4.getElementsByIndexEquals((int) (byte) -1);
        org.jsoup.nodes.Node node7 = element4.nextSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document8 = node7.ownerDocument();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNull(node7);
    }

    @Test
    public void test0096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0096");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements4 = document1.getElementsByAttributeValueMatching("hi!", "hi!");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet7 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet7, strArray6);
        org.jsoup.nodes.Element element9 = document1.classNames((java.util.Set<java.lang.String>) strSet7);
        org.jsoup.nodes.Document document10 = document1.clone();
        org.jsoup.nodes.Document document11 = document10.normalise();
        org.jsoup.nodes.Document document13 = new org.jsoup.nodes.Document("");
        boolean boolean14 = document13.isBlock();
        java.util.List<org.jsoup.nodes.DataNode> dataNodeList15 = document13.dataNodes();
        java.lang.String str17 = document13.attr("");
        org.jsoup.nodes.Document.QuirksMode quirksMode18 = org.jsoup.nodes.Document.QuirksMode.noQuirks;
        org.jsoup.nodes.Document document19 = document13.quirksMode(quirksMode18);
        org.jsoup.nodes.Document document20 = document13.ownerDocument();
        org.jsoup.nodes.Element element21 = document20.nextElementSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element22 = document11.before((org.jsoup.nodes.Node) element21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(document10);
        org.junit.Assert.assertNotNull(document11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(dataNodeList15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + quirksMode18 + "' != '" + org.jsoup.nodes.Document.QuirksMode.noQuirks + "'", quirksMode18.equals(org.jsoup.nodes.Document.QuirksMode.noQuirks));
        org.junit.Assert.assertNotNull(document19);
        org.junit.Assert.assertNotNull(document20);
        org.junit.Assert.assertNull(element21);
    }

    @Test
    public void test0097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0097");
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
        org.jsoup.nodes.Element element15 = document5.empty();
        org.jsoup.nodes.Document document17 = new org.jsoup.nodes.Document("");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList18 = document17.textNodes();
        org.jsoup.select.Elements elements19 = document17.getAllElements();
        org.jsoup.nodes.Document document21 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements24 = document21.getElementsByAttributeValueMatching("hi!", "hi!");
        boolean boolean25 = document21.hasText();
        org.jsoup.nodes.Element element27 = document21.append("");
        org.jsoup.nodes.Element element28 = document17.appendChild((org.jsoup.nodes.Node) document21);
        java.lang.String str29 = document17.outerHtml();
        org.jsoup.nodes.Document document30 = document17.normalise();
        org.jsoup.nodes.Document.OutputSettings outputSettings31 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings32 = outputSettings31.clone();
        org.jsoup.nodes.Document.OutputSettings outputSettings34 = outputSettings31.indentAmount((int) (byte) 100);
        org.jsoup.nodes.Document document35 = document17.outputSettings(outputSettings34);
        org.jsoup.nodes.Element element36 = document35.parent();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element37 = element15.appendChild((org.jsoup.nodes.Node) element36);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertTrue("'" + quirksMode13 + "' != '" + org.jsoup.nodes.Document.QuirksMode.noQuirks + "'", quirksMode13.equals(org.jsoup.nodes.Document.QuirksMode.noQuirks));
        org.junit.Assert.assertNotNull(document14);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(textNodeList18);
        org.junit.Assert.assertNotNull(elements19);
        org.junit.Assert.assertNotNull(elements24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(element27);
        org.junit.Assert.assertNotNull(element28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "<#root></#root>" + "'", str29, "<#root></#root>");
        org.junit.Assert.assertNotNull(document30);
        org.junit.Assert.assertNotNull(outputSettings32);
        org.junit.Assert.assertNotNull(outputSettings34);
        org.junit.Assert.assertNotNull(document35);
        org.junit.Assert.assertNull(element36);
    }

    @Test
    public void test0098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0098");
        org.jsoup.nodes.Document.OutputSettings outputSettings0 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings1 = outputSettings0.clone();
        org.jsoup.nodes.Document.OutputSettings outputSettings2 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode3 = outputSettings2.escapeMode();
        java.nio.charset.Charset charset4 = outputSettings2.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings5 = outputSettings1.charset(charset4);
        org.jsoup.nodes.Document.OutputSettings outputSettings6 = outputSettings5.clone();
        org.jsoup.nodes.Document.OutputSettings outputSettings7 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode8 = outputSettings7.escapeMode();
        java.nio.charset.Charset charset9 = outputSettings7.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = outputSettings7.clone();
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode12 = outputSettings11.escapeMode();
        int int13 = outputSettings11.indentAmount();
        org.jsoup.nodes.Entities.EscapeMode escapeMode14 = outputSettings11.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings15 = outputSettings7.escapeMode(escapeMode14);
        org.jsoup.nodes.Document.OutputSettings outputSettings16 = outputSettings6.escapeMode(escapeMode14);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document.OutputSettings outputSettings18 = outputSettings16.charset("");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: ");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(outputSettings1);
        org.junit.Assert.assertTrue("'" + escapeMode3 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode3.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset4);
        org.junit.Assert.assertNotNull(outputSettings5);
        org.junit.Assert.assertNotNull(outputSettings6);
        org.junit.Assert.assertTrue("'" + escapeMode8 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode8.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset9);
        org.junit.Assert.assertNotNull(outputSettings10);
        org.junit.Assert.assertTrue("'" + escapeMode12 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode12.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + escapeMode14 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode14.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings15);
        org.junit.Assert.assertNotNull(outputSettings16);
    }

    @Test
    public void test0099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0099");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = document1.textNodes();
        org.jsoup.select.Elements elements3 = document1.getAllElements();
        org.jsoup.nodes.Document document5 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements8 = document5.getElementsByAttributeValueMatching("hi!", "hi!");
        boolean boolean9 = document5.hasText();
        org.jsoup.nodes.Element element11 = document5.append("");
        org.jsoup.nodes.Element element12 = document1.appendChild((org.jsoup.nodes.Node) document5);
        org.jsoup.nodes.Element element13 = document1.nextElementSibling();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.jsoup.nodes.Node> nodeList14 = element13.siblingNodes();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNull(element13);
    }

    @Test
    public void test0100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0100");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = document1.textNodes();
        java.util.List<org.jsoup.nodes.TextNode> textNodeList3 = document1.textNodes();
        org.jsoup.nodes.Document.OutputSettings outputSettings4 = document1.outputSettings();
        org.jsoup.nodes.Document document6 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements9 = document6.getElementsByAttributeValueMatching("hi!", "hi!");
        org.jsoup.nodes.Document document10 = document6.clone();
        org.jsoup.nodes.Document document11 = document10.normalise();
        org.jsoup.nodes.Element element12 = document11.parent();
        boolean boolean13 = document1.equals((java.lang.Object) document11);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node15 = document11.childNode((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 35 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertNotNull(textNodeList3);
        org.junit.Assert.assertNotNull(outputSettings4);
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertNotNull(document10);
        org.junit.Assert.assertNotNull(document11);
        org.junit.Assert.assertNull(element12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0101");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = document1.textNodes();
        org.jsoup.nodes.Element element4 = document1.prependElement("hi!");
        java.lang.String str5 = element4.baseUri();
        org.jsoup.nodes.Element element7 = element4.toggleClass("hi!");
        org.jsoup.nodes.Element element9 = element7.prependText("");
        java.lang.Integer int10 = element9.elementSiblingIndex();
        org.jsoup.nodes.Element element12 = element9.prepend("<#root>\n <html>\n  <head></head>\n  <body></body>\n </html>\n</#root>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element15 = element9.attr("", "<#root>\n <html>\n  <head></head>\n  <body></body>\n </html>\n</#root>");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(element12);
    }

    @Test
    public void test0102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0102");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements4 = document1.getElementsByAttributeValueMatching("hi!", "hi!");
        boolean boolean5 = document1.hasText();
        org.jsoup.nodes.Element element7 = document1.append("");
        org.jsoup.select.Elements elements8 = document1.siblingElements();
        org.jsoup.nodes.Document document9 = document1.clone();
        org.jsoup.select.Elements elements11 = document1.getElementsMatchingText("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node13 = document1.childNode((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(document9);
        org.junit.Assert.assertNotNull(elements11);
    }

    @Test
    public void test0103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0103");
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
        org.jsoup.select.Elements elements16 = element4.getAllElements();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertNotNull(document14);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(elements16);
    }

    @Test
    public void test0104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0104");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.nodes.Element element3 = document1.append("");
        org.jsoup.nodes.Element element5 = document1.html("<#root></#root>");
        org.jsoup.select.Elements elements8 = document1.getElementsByAttributeValueStarting("<#root></#root>", "<#root></#root>");
        java.lang.String str9 = document1.data();
        org.jsoup.nodes.Node node10 = document1.previousSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements13 = document1.getElementsByAttributeValueEnding("<html>\n <head></head>\n <body></body>\n</html>", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(node10);
    }

    @Test
    public void test0105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0105");
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
        java.util.List<org.jsoup.nodes.DataNode> dataNodeList15 = document14.dataNodes();
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "<#root></#root>" + "'", str13, "<#root></#root>");
        org.junit.Assert.assertNotNull(document14);
        org.junit.Assert.assertNotNull(dataNodeList15);
    }

    @Test
    public void test0106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0106");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements4 = document1.getElementsByAttributeValueMatching("hi!", "hi!");
        boolean boolean5 = document1.hasText();
        org.jsoup.select.Elements elements8 = document1.getElementsByAttributeValueContaining("hi!", "hi!");
        int int9 = document1.siblingIndex();
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0107");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean2 = document1.isBlock();
        org.jsoup.nodes.Element element4 = document1.html("hi!");
        org.jsoup.select.Elements elements6 = element4.getElementsByIndexEquals((int) (byte) -1);
        org.jsoup.nodes.Node node7 = element4.previousSibling();
        org.jsoup.select.Elements elements9 = element4.getElementsContainingText("<hi!></hi!>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements11 = element4.select("<#root>\n <html>\n  <head></head>\n  <body></body>\n </html>\n</#root>");
            org.junit.Assert.fail("Expected exception of type org.jsoup.select.Selector.SelectorParseException; message: Could not parse query '<#root>? <html>?  <head></head>?  <body></body>? </html>?</#root>': unexpected token at '<#root>? <html>?  <head></head>?  <body></body>? </html>?</#root>'");
        } catch (org.jsoup.select.Selector.SelectorParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNotNull(elements9);
    }

    @Test
    public void test0108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0108");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean2 = document1.isBlock();
        org.jsoup.nodes.Element element4 = document1.toggleClass("hi!");
        org.jsoup.nodes.Document document6 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element7 = document1.appendChild((org.jsoup.nodes.Node) document6);
        org.jsoup.nodes.Element element9 = element7.removeClass("<hi!></hi!>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements12 = element9.getElementsByAttributeValueEnding("", "<html>\n <head></head>\n <body></body>\n</html>");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(element9);
    }

    @Test
    public void test0109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0109");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean2 = document1.isBlock();
        java.util.List<org.jsoup.nodes.DataNode> dataNodeList3 = document1.dataNodes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements6 = document1.getElementsByAttributeValueStarting("<#root>\n <html>\n  <head></head>\n  <body></body>\n </html>\n</#root>", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(dataNodeList3);
    }

    @Test
    public void test0110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0110");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.nodes.Element element3 = document1.append("");
        org.jsoup.nodes.Element element5 = document1.html("<#root></#root>");
        org.jsoup.select.Elements elements8 = document1.getElementsByAttributeValueStarting("<#root></#root>", "<#root></#root>");
        org.jsoup.nodes.Element element10 = document1.append("<#root></#root>");
        boolean boolean11 = element10.hasText();
        java.lang.String str12 = element10.toString();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "&lt;#root&gt;\n<!--#root-->&lt;#root&gt;\n<!--#root-->" + "'", str12, "&lt;#root&gt;\n<!--#root-->&lt;#root&gt;\n<!--#root-->");
    }

    @Test
    public void test0111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0111");
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
        org.jsoup.select.Elements elements23 = document14.getElementsByAttributeStarting("<hi!></hi!>");
        java.lang.Class<?> wildcardClass24 = elements23.getClass();
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "<#root></#root>" + "'", str13, "<#root></#root>");
        org.junit.Assert.assertNotNull(document14);
        org.junit.Assert.assertNotNull(textNodeList17);
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(elements23);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test0112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0112");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements4 = document1.getElementsByAttributeValueMatching("hi!", "hi!");
        boolean boolean5 = document1.hasText();
        org.jsoup.select.Elements elements8 = document1.getElementsByAttributeValueContaining("hi!", "hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap9 = document1.dataset();
        org.jsoup.select.Elements elements12 = document1.getElementsByAttributeValueEnding("<hi!></hi!>", "#document");
        org.jsoup.nodes.Document.QuirksMode quirksMode13 = org.jsoup.nodes.Document.QuirksMode.noQuirks;
        org.jsoup.nodes.Document document14 = document1.quirksMode(quirksMode13);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element16 = document14.after("hi!#document");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertTrue("'" + quirksMode13 + "' != '" + org.jsoup.nodes.Document.QuirksMode.noQuirks + "'", quirksMode13.equals(org.jsoup.nodes.Document.QuirksMode.noQuirks));
        org.junit.Assert.assertNotNull(document14);
    }

    @Test
    public void test0113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0113");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements4 = document1.getElementsByAttributeValueMatching("hi!", "hi!");
        org.jsoup.nodes.Document document5 = document1.clone();
        org.jsoup.nodes.Document document6 = document5.normalise();
        java.lang.String str7 = document5.data();
        org.jsoup.select.Elements elements10 = document5.getElementsByAttributeValueMatching("#document", "<#root></#root>");
        java.lang.Class<?> wildcardClass11 = document5.getClass();
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNotNull(document5);
        org.junit.Assert.assertNotNull(document6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0114");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.nodes.Element element3 = document1.append("");
        org.jsoup.nodes.Element element5 = document1.html("<#root></#root>");
        org.jsoup.select.Elements elements8 = document1.getElementsByAttributeValueStarting("<#root></#root>", "<#root></#root>");
        org.jsoup.nodes.Element element10 = document1.append("<#root></#root>");
        org.jsoup.parser.Tag tag11 = document1.tag();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node12 = document1.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(tag11);
    }

    @Test
    public void test0115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0115");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean2 = document1.isBlock();
        org.jsoup.nodes.Element element4 = document1.toggleClass("hi!");
        java.lang.String str5 = document1.nodeName();
        org.jsoup.nodes.Document document7 = new org.jsoup.nodes.Document("");
        boolean boolean8 = document7.isBlock();
        org.jsoup.nodes.Element element10 = document7.toggleClass("hi!");
        org.jsoup.select.Elements elements12 = element10.getElementsByIndexGreaterThan(0);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element13 = document1.after((org.jsoup.nodes.Node) element10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#document" + "'", str5, "#document");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(elements12);
    }

    @Test
    public void test0116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0116");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element16 = document14.createElement("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "<#root></#root>" + "'", str13, "<#root></#root>");
        org.junit.Assert.assertNotNull(document14);
    }

    @Test
    public void test0117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0117");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements4 = document1.getElementsByAttributeValueMatching("hi!", "hi!");
        org.jsoup.nodes.Document document5 = document1.clone();
        org.jsoup.nodes.Node node7 = document1.removeAttr("hi!");
        org.jsoup.select.Elements elements8 = document1.getAllElements();
        java.util.regex.Pattern pattern9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements10 = document1.getElementsMatchingText(pattern9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNotNull(document5);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(elements8);
    }

    @Test
    public void test0118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0118");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements4 = document1.getElementsByAttributeValueMatching("hi!", "hi!");
        boolean boolean5 = document1.hasText();
        org.jsoup.nodes.Document document7 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element8 = document1.prependChild((org.jsoup.nodes.Node) document7);
        org.jsoup.select.Elements elements11 = document7.getElementsByAttributeValueStarting("<#root>\n <html>\n  <head></head>\n  <body></body>\n </html>\n</#root>", "<#root></#root>");
        org.jsoup.nodes.Element element13 = document7.before("#root");
        java.lang.Class<?> wildcardClass14 = element13.getClass();
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(document7);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0119");
        org.jsoup.nodes.Document.OutputSettings outputSettings0 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode1 = outputSettings0.escapeMode();
        java.nio.charset.Charset charset2 = outputSettings0.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings3 = outputSettings0.clone();
        int int4 = outputSettings0.indentAmount();
        boolean boolean5 = outputSettings0.prettyPrint();
        org.jsoup.nodes.Document.OutputSettings outputSettings6 = outputSettings0.clone();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document.OutputSettings outputSettings8 = outputSettings6.charset("");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: ");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + escapeMode1 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode1.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset2);
        org.junit.Assert.assertNotNull(outputSettings3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(outputSettings6);
    }

    @Test
    public void test0120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0120");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.nodes.Element element3 = document1.append("");
        org.jsoup.nodes.Element element5 = element3.html("hi!");
        java.lang.String str6 = element5.val();
        java.lang.String str7 = element5.baseUri();
        java.util.Map<java.lang.String, java.lang.String> strMap8 = element5.dataset();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(strMap8);
    }

    @Test
    public void test0121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0121");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements4 = document1.getElementsByAttributeValueMatching("hi!", "hi!");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet7 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet7, strArray6);
        org.jsoup.nodes.Element element9 = document1.classNames((java.util.Set<java.lang.String>) strSet7);
        org.jsoup.nodes.Document document10 = document1.clone();
        org.jsoup.nodes.Document document12 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements15 = document12.getElementsByAttributeValueMatching("hi!", "hi!");
        boolean boolean16 = document12.hasText();
        org.jsoup.nodes.Document document18 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element19 = document12.prependChild((org.jsoup.nodes.Node) document18);
        org.jsoup.nodes.Document.OutputSettings outputSettings20 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings21 = outputSettings20.clone();
        org.jsoup.nodes.Entities.EscapeMode escapeMode22 = outputSettings21.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings23 = outputSettings21.clone();
        org.jsoup.nodes.Document document24 = document12.outputSettings(outputSettings23);
        org.jsoup.parser.Tag tag25 = document12.tag();
        org.jsoup.nodes.Element element26 = document1.appendChild((org.jsoup.nodes.Node) document12);
        java.lang.String str27 = document1.nodeName();
        org.jsoup.select.NodeVisitor nodeVisitor28 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node29 = document1.traverse(nodeVisitor28);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(document10);
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(document18);
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertNotNull(outputSettings21);
        org.junit.Assert.assertTrue("'" + escapeMode22 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode22.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings23);
        org.junit.Assert.assertNotNull(document24);
        org.junit.Assert.assertNotNull(tag25);
        org.junit.Assert.assertNotNull(element26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "#document" + "'", str27, "#document");
    }

    @Test
    public void test0122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0122");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.util.regex.Pattern pattern3 = null;
        org.jsoup.select.Elements elements4 = document1.getElementsByAttributeValueMatching("<#root>\n <html>\n  <head></head>\n  <body></body>\n </html>\n</#root>", pattern3);
        org.jsoup.nodes.Document document6 = new org.jsoup.nodes.Document("");
        boolean boolean7 = document6.isBlock();
        java.util.List<org.jsoup.nodes.DataNode> dataNodeList8 = document6.dataNodes();
        java.lang.String str10 = document6.attr("");
        org.jsoup.nodes.Node node11 = document6.nextSibling();
        org.jsoup.select.Elements elements12 = document6.children();
        org.jsoup.nodes.Element element14 = document6.appendText("<#root>\n <html>\n  <head></head>\n  <body></body>\n </html>\n</#root>");
        org.jsoup.nodes.Document document16 = new org.jsoup.nodes.Document("");
        boolean boolean17 = document16.isBlock();
        java.util.List<org.jsoup.nodes.DataNode> dataNodeList18 = document16.dataNodes();
        java.lang.String str20 = document16.attr("");
        org.jsoup.nodes.Document.QuirksMode quirksMode21 = org.jsoup.nodes.Document.QuirksMode.noQuirks;
        org.jsoup.nodes.Document document22 = document16.quirksMode(quirksMode21);
        org.jsoup.nodes.Document document23 = document16.ownerDocument();
        org.jsoup.nodes.Document document25 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements28 = document25.getElementsByAttributeValueMatching("hi!", "hi!");
        java.lang.String[] strArray30 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet31 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet31, strArray30);
        org.jsoup.nodes.Element element33 = document25.classNames((java.util.Set<java.lang.String>) strSet31);
        org.jsoup.nodes.Element element34 = document23.classNames((java.util.Set<java.lang.String>) strSet31);
        org.jsoup.nodes.Element element35 = element14.classNames((java.util.Set<java.lang.String>) strSet31);
        // The following exception was thrown during execution in test generation
        try {
            document1.replaceWith((org.jsoup.nodes.Node) element14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(dataNodeList8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(dataNodeList18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + quirksMode21 + "' != '" + org.jsoup.nodes.Document.QuirksMode.noQuirks + "'", quirksMode21.equals(org.jsoup.nodes.Document.QuirksMode.noQuirks));
        org.junit.Assert.assertNotNull(document22);
        org.junit.Assert.assertNotNull(document23);
        org.junit.Assert.assertNotNull(elements28);
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertArrayEquals(strArray30, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(element33);
        org.junit.Assert.assertNotNull(element34);
        org.junit.Assert.assertNotNull(element35);
    }

    @Test
    public void test0123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0123");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element15 = document1.after("<#root></#root>");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(dataNodeList3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + quirksMode6 + "' != '" + org.jsoup.nodes.Document.QuirksMode.noQuirks + "'", quirksMode6.equals(org.jsoup.nodes.Document.QuirksMode.noQuirks));
        org.junit.Assert.assertNotNull(document7);
        org.junit.Assert.assertNotNull(document8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(outputSettings11);
        org.junit.Assert.assertTrue("'" + escapeMode12 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode12.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(document13);
    }

    @Test
    public void test0124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0124");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = document1.textNodes();
        org.jsoup.nodes.Element element4 = document1.prependElement("hi!");
        org.jsoup.nodes.Document.OutputSettings outputSettings5 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings6 = outputSettings5.clone();
        org.jsoup.nodes.Document.OutputSettings outputSettings7 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode8 = outputSettings7.escapeMode();
        java.nio.charset.Charset charset9 = outputSettings7.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = outputSettings6.charset(charset9);
        java.lang.Class<?> wildcardClass11 = outputSettings10.getClass();
        boolean boolean12 = element4.equals((java.lang.Object) outputSettings10);
        org.jsoup.nodes.Element element14 = element4.prependText("#root");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node16 = element14.removeAttr("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(outputSettings6);
        org.junit.Assert.assertTrue("'" + escapeMode8 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode8.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset9);
        org.junit.Assert.assertNotNull(outputSettings10);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(element14);
    }

    @Test
    public void test0125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0125");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements4 = document1.getElementsByAttributeValueMatching("hi!", "hi!");
        org.jsoup.nodes.Document document5 = document1.clone();
        java.lang.String str6 = document1.tagName();
        java.lang.String str7 = document1.val();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element9 = document1.before("&lt;#root&gt;\n<!--#root-->&lt;#root&gt;\n<!--#root-->");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNotNull(document5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "#root" + "'", str6, "#root");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0126");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements17 = element14.getElementsByAttributeValueNot("&lt;#root&gt;\n<!--#root-->&lt;#root&gt;\n<!--#root-->", " hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNull(element13);
        org.junit.Assert.assertNull(element14);
    }

    @Test
    public void test0127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0127");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element17 = document14.attr("", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "<#root></#root>" + "'", str13, "<#root></#root>");
        org.junit.Assert.assertNotNull(document14);
    }

    @Test
    public void test0128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0128");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements4 = document1.getElementsByAttributeValueMatching("hi!", "hi!");
        boolean boolean5 = document1.hasText();
        org.jsoup.select.Elements elements8 = document1.getElementsByAttributeValueContaining("hi!", "hi!");
        org.jsoup.nodes.Element element10 = document1.append("<#root>\n <html>\n  <head></head>\n  <body></body>\n </html>\n</#root>");
        java.lang.Integer int11 = document1.elementSiblingIndex();
        org.jsoup.nodes.Document document12 = document1.clone();
        org.jsoup.nodes.Element element14 = document12.createElement("#root");
        org.jsoup.nodes.Document document16 = new org.jsoup.nodes.Document("");
        boolean boolean17 = document16.isBlock();
        org.jsoup.nodes.Element element19 = document16.html("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element20 = element14.after((org.jsoup.nodes.Node) element19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(document12);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(element19);
    }

    @Test
    public void test0129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0129");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements4 = document1.getElementsByAttributeValueMatching("hi!", "hi!");
        boolean boolean5 = document1.hasText();
        org.jsoup.select.Elements elements8 = document1.getElementsByAttributeValueContaining("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList9 = document1.childNodes();
        org.jsoup.nodes.Element element10 = document1.previousElementSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element12 = document1.after("#root");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNull(element10);
    }

    @Test
    public void test0130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0130");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements4 = document1.getElementsByAttributeValueMatching("hi!", "hi!");
        boolean boolean5 = document1.hasText();
        org.jsoup.select.Elements elements8 = document1.getElementsByAttributeValueContaining("hi!", "hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap9 = document1.dataset();
        org.jsoup.select.Elements elements12 = document1.getElementsByAttributeValueEnding("<hi!></hi!>", "#document");
        org.jsoup.nodes.Element element14 = document1.append("hi!");
        org.jsoup.nodes.Document document16 = new org.jsoup.nodes.Document("");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList17 = document16.textNodes();
        org.jsoup.nodes.Element element19 = document16.prependElement("hi!");
        org.jsoup.nodes.Element element21 = document16.html("hi!");
        org.jsoup.select.Elements elements23 = document16.getElementsByClass("hi!");
        boolean boolean24 = element14.equals((java.lang.Object) "hi!");
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(textNodeList17);
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertNotNull(elements23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test0131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0131");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = document1.textNodes();
        org.jsoup.nodes.Document document4 = new org.jsoup.nodes.Document("");
        boolean boolean5 = document4.isBlock();
        java.util.List<org.jsoup.nodes.DataNode> dataNodeList6 = document4.dataNodes();
        java.lang.String str8 = document4.attr("");
        org.jsoup.nodes.Document.QuirksMode quirksMode9 = org.jsoup.nodes.Document.QuirksMode.noQuirks;
        org.jsoup.nodes.Document document10 = document4.quirksMode(quirksMode9);
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = document4.outputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings12 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings13 = outputSettings12.clone();
        org.jsoup.nodes.Document.OutputSettings outputSettings14 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode15 = outputSettings14.escapeMode();
        java.nio.charset.Charset charset16 = outputSettings14.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings17 = outputSettings13.charset(charset16);
        org.jsoup.nodes.Document.OutputSettings outputSettings18 = outputSettings11.charset(charset16);
        org.jsoup.nodes.Document.OutputSettings outputSettings19 = outputSettings18.clone();
        org.jsoup.nodes.Entities.EscapeMode escapeMode20 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings21 = outputSettings18.escapeMode(escapeMode20);
        org.jsoup.nodes.Document document22 = document1.outputSettings(outputSettings21);
        org.jsoup.nodes.Document document24 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.nodes.Element element26 = document24.append("");
        org.jsoup.nodes.Element element28 = document24.toggleClass("");
        org.jsoup.nodes.Node node29 = document24.nextSibling();
        org.jsoup.nodes.Element element31 = document24.prependElement("<#root>\n <html>\n  <head></head>\n  <body></body>\n </html>\n</#root>");
        java.lang.String str32 = element31.text();
        org.jsoup.nodes.Document document34 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements37 = document34.getElementsByAttributeValueMatching("hi!", "hi!");
        boolean boolean38 = document34.hasText();
        org.jsoup.nodes.Document document40 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element41 = document34.prependChild((org.jsoup.nodes.Node) document40);
        org.jsoup.nodes.Document.OutputSettings outputSettings42 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings43 = outputSettings42.clone();
        org.jsoup.nodes.Entities.EscapeMode escapeMode44 = outputSettings43.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings45 = outputSettings43.clone();
        org.jsoup.nodes.Document document46 = document34.outputSettings(outputSettings45);
        element31.replaceWith((org.jsoup.nodes.Node) document34);
        // The following exception was thrown during execution in test generation
        try {
            document1.replaceWith((org.jsoup.nodes.Node) document34);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(dataNodeList6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + quirksMode9 + "' != '" + org.jsoup.nodes.Document.QuirksMode.noQuirks + "'", quirksMode9.equals(org.jsoup.nodes.Document.QuirksMode.noQuirks));
        org.junit.Assert.assertNotNull(document10);
        org.junit.Assert.assertNotNull(outputSettings11);
        org.junit.Assert.assertNotNull(outputSettings13);
        org.junit.Assert.assertTrue("'" + escapeMode15 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode15.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset16);
        org.junit.Assert.assertNotNull(outputSettings17);
        org.junit.Assert.assertNotNull(outputSettings18);
        org.junit.Assert.assertNotNull(outputSettings19);
        org.junit.Assert.assertNotNull(outputSettings21);
        org.junit.Assert.assertNotNull(document22);
        org.junit.Assert.assertNotNull(document24);
        org.junit.Assert.assertNotNull(element26);
        org.junit.Assert.assertNotNull(element28);
        org.junit.Assert.assertNull(node29);
        org.junit.Assert.assertNotNull(element31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertNotNull(elements37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(document40);
        org.junit.Assert.assertNotNull(element41);
        org.junit.Assert.assertNotNull(outputSettings43);
        org.junit.Assert.assertTrue("'" + escapeMode44 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode44.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings45);
        org.junit.Assert.assertNotNull(document46);
    }

    @Test
    public void test0132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0132");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("<hi!></hi!>");
        org.jsoup.select.NodeVisitor nodeVisitor2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node3 = document1.traverse(nodeVisitor2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document1);
    }

    @Test
    public void test0133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0133");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements4 = document1.getElementsByAttributeValueMatching("hi!", "hi!");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet7 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet7, strArray6);
        org.jsoup.nodes.Element element9 = document1.classNames((java.util.Set<java.lang.String>) strSet7);
        org.jsoup.nodes.Document document10 = document1.clone();
        java.lang.String str11 = document1.outerHtml();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node13 = document1.childNode((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(document10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test0134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0134");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = document1.textNodes();
        org.jsoup.select.Elements elements3 = document1.getAllElements();
        org.jsoup.nodes.Document document5 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements8 = document5.getElementsByAttributeValueMatching("hi!", "hi!");
        boolean boolean9 = document5.hasText();
        org.jsoup.nodes.Element element11 = document5.append("");
        org.jsoup.nodes.Element element12 = document1.appendChild((org.jsoup.nodes.Node) document5);
        org.jsoup.nodes.Node node14 = document1.removeAttr("hi!");
        org.jsoup.nodes.Document.OutputSettings outputSettings15 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode16 = outputSettings15.escapeMode();
        java.nio.charset.Charset charset17 = outputSettings15.charset();
        org.jsoup.nodes.Document document18 = document1.outputSettings(outputSettings15);
        org.jsoup.nodes.Document document20 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.nodes.Element element22 = document20.append("");
        org.jsoup.nodes.Element element24 = document20.toggleClass("");
        java.lang.String str25 = document20.nodeName();
        java.lang.String str26 = document20.id();
        org.jsoup.nodes.Document.QuirksMode quirksMode27 = document20.quirksMode();
        org.jsoup.nodes.Document document28 = document18.quirksMode(quirksMode27);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element30 = document18.after("<#root>");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertTrue("'" + escapeMode16 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode16.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset17);
        org.junit.Assert.assertNotNull(document18);
        org.junit.Assert.assertNotNull(document20);
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertNotNull(element24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "#document" + "'", str25, "#document");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertTrue("'" + quirksMode27 + "' != '" + org.jsoup.nodes.Document.QuirksMode.noQuirks + "'", quirksMode27.equals(org.jsoup.nodes.Document.QuirksMode.noQuirks));
        org.junit.Assert.assertNotNull(document28);
    }

    @Test
    public void test0135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0135");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.nodes.Element element3 = document1.append("");
        org.jsoup.nodes.Element element5 = element3.html("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap6 = element5.dataset();
        java.lang.String str7 = element5.data();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element9 = element5.after("<#root>\n <html>\n  <head></head>\n  <body></body>\n </html>\n</#root>");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0136");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.nodes.Element element3 = document1.append("");
        org.jsoup.nodes.Element element5 = element3.html("hi!");
        java.lang.String str6 = element5.val();
        java.lang.String str7 = element5.toString();
        org.jsoup.nodes.Element element9 = element5.append("#document");
        org.jsoup.nodes.Element element11 = element5.prependText("<#root>");
        // The following exception was thrown during execution in test generation
        try {
            element11.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(element11);
    }

    @Test
    public void test0137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0137");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.nodes.Element element3 = document1.append("");
        org.jsoup.nodes.Element element5 = document1.toggleClass("");
        org.jsoup.nodes.Node node6 = document1.nextSibling();
        org.jsoup.nodes.Element element8 = document1.prependElement("<#root>\n <html>\n  <head></head>\n  <body></body>\n </html>\n</#root>");
        java.lang.String str9 = element8.text();
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
        element8.replaceWith((org.jsoup.nodes.Node) document11);
        org.jsoup.nodes.Element element26 = element8.toggleClass("<#root></#root>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element28 = element8.child((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(elements14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(document17);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNotNull(outputSettings20);
        org.junit.Assert.assertTrue("'" + escapeMode21 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode21.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings22);
        org.junit.Assert.assertNotNull(document23);
        org.junit.Assert.assertNotNull(element26);
    }

    @Test
    public void test0138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0138");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean2 = document1.isBlock();
        org.jsoup.select.Elements elements4 = document1.getElementsByIndexLessThan(0);
        org.jsoup.select.Elements elements6 = document1.getElementsMatchingOwnText("<#root>");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNotNull(elements6);
    }

    @Test
    public void test0139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0139");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!#document");
    }

    @Test
    public void test0140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0140");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements4 = document1.getElementsByAttributeValueMatching("hi!", "hi!");
        org.jsoup.nodes.Document document5 = document1.clone();
        org.jsoup.nodes.Document document6 = document5.normalise();
        org.jsoup.nodes.Element element7 = document6.parent();
        org.jsoup.nodes.Document document8 = document6.normalise();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element10 = document8.child((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNotNull(document5);
        org.junit.Assert.assertNotNull(document6);
        org.junit.Assert.assertNull(element7);
        org.junit.Assert.assertNotNull(document8);
    }

    @Test
    public void test0141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0141");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements4 = document1.getElementsByAttributeValueMatching("hi!", "hi!");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet7 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet7, strArray6);
        org.jsoup.nodes.Element element9 = document1.classNames((java.util.Set<java.lang.String>) strSet7);
        org.jsoup.nodes.Element element11 = document1.getElementById("hi!");
        org.jsoup.nodes.Element element14 = document1.attr("<#root>\n <html>\n  <head></head>\n  <body></body>\n </html>\n</#root>", "<#root>\n <html>\n  <head></head>\n  <body></body>\n </html>\n</#root>");
        org.jsoup.select.Elements elements16 = element14.getElementsContainingOwnText("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element18 = element14.after("&lt;#root&gt;\n<!--#root-->&lt;#root&gt;\n<!--#root-->");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNull(element11);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(elements16);
    }

    @Test
    public void test0142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0142");
        org.jsoup.nodes.Document.OutputSettings outputSettings0 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode1 = outputSettings0.escapeMode();
        java.nio.charset.Charset charset2 = outputSettings0.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings3 = outputSettings0.clone();
        int int4 = outputSettings0.indentAmount();
        java.nio.charset.CharsetEncoder charsetEncoder5 = outputSettings0.encoder();
        org.jsoup.nodes.Document.OutputSettings outputSettings7 = outputSettings0.indentAmount((int) '#');
        org.junit.Assert.assertTrue("'" + escapeMode1 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode1.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset2);
        org.junit.Assert.assertNotNull(outputSettings3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(charsetEncoder5);
        org.junit.Assert.assertNotNull(outputSettings7);
    }

    @Test
    public void test0143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0143");
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
        org.jsoup.nodes.Element element22 = element20.addClass("<#root>\n <html>\n  <head></head>\n  <body></body>\n </html>\n</#root>");
        org.jsoup.nodes.Node node23 = element20.nextSibling();
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "<#root></#root>" + "'", str13, "<#root></#root>");
        org.junit.Assert.assertNotNull(document14);
        org.junit.Assert.assertNotNull(textNodeList17);
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertNull(node23);
    }

    @Test
    public void test0144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0144");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = document1.textNodes();
        org.jsoup.nodes.Document document4 = new org.jsoup.nodes.Document("");
        boolean boolean5 = document4.isBlock();
        java.util.List<org.jsoup.nodes.DataNode> dataNodeList6 = document4.dataNodes();
        java.lang.String str8 = document4.attr("");
        org.jsoup.nodes.Document.QuirksMode quirksMode9 = org.jsoup.nodes.Document.QuirksMode.noQuirks;
        org.jsoup.nodes.Document document10 = document4.quirksMode(quirksMode9);
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = document4.outputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings12 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings13 = outputSettings12.clone();
        org.jsoup.nodes.Document.OutputSettings outputSettings14 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode15 = outputSettings14.escapeMode();
        java.nio.charset.Charset charset16 = outputSettings14.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings17 = outputSettings13.charset(charset16);
        org.jsoup.nodes.Document.OutputSettings outputSettings18 = outputSettings11.charset(charset16);
        org.jsoup.nodes.Document.OutputSettings outputSettings19 = outputSettings18.clone();
        org.jsoup.nodes.Entities.EscapeMode escapeMode20 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings21 = outputSettings18.escapeMode(escapeMode20);
        org.jsoup.nodes.Document document22 = document1.outputSettings(outputSettings21);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element24 = document1.wrap("hi!#document");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(dataNodeList6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + quirksMode9 + "' != '" + org.jsoup.nodes.Document.QuirksMode.noQuirks + "'", quirksMode9.equals(org.jsoup.nodes.Document.QuirksMode.noQuirks));
        org.junit.Assert.assertNotNull(document10);
        org.junit.Assert.assertNotNull(outputSettings11);
        org.junit.Assert.assertNotNull(outputSettings13);
        org.junit.Assert.assertTrue("'" + escapeMode15 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode15.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset16);
        org.junit.Assert.assertNotNull(outputSettings17);
        org.junit.Assert.assertNotNull(outputSettings18);
        org.junit.Assert.assertNotNull(outputSettings19);
        org.junit.Assert.assertNotNull(outputSettings21);
        org.junit.Assert.assertNotNull(document22);
    }

    @Test
    public void test0145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0145");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.nodes.Element element3 = document1.append("");
        org.jsoup.nodes.Element element5 = document1.toggleClass("");
        org.jsoup.nodes.Document document7 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements10 = document7.getElementsByAttributeValueMatching("hi!", "hi!");
        boolean boolean11 = document7.hasText();
        org.jsoup.nodes.Document document13 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element14 = document7.prependChild((org.jsoup.nodes.Node) document13);
        org.jsoup.select.Elements elements17 = document13.getElementsByAttributeValueStarting("<#root>\n <html>\n  <head></head>\n  <body></body>\n </html>\n</#root>", "<#root></#root>");
        org.jsoup.nodes.Element element19 = document13.before("#root");
        org.jsoup.nodes.Document document21 = new org.jsoup.nodes.Document("");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList22 = document21.textNodes();
        org.jsoup.select.Elements elements23 = document21.getAllElements();
        org.jsoup.nodes.Document document25 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements28 = document25.getElementsByAttributeValueMatching("hi!", "hi!");
        boolean boolean29 = document25.hasText();
        org.jsoup.nodes.Element element31 = document25.append("");
        org.jsoup.nodes.Element element32 = document21.appendChild((org.jsoup.nodes.Node) document25);
        org.jsoup.nodes.Node node34 = document21.removeAttr("hi!");
        org.jsoup.nodes.Document.OutputSettings outputSettings35 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode36 = outputSettings35.escapeMode();
        java.nio.charset.Charset charset37 = outputSettings35.charset();
        org.jsoup.nodes.Document document38 = document21.outputSettings(outputSettings35);
        boolean boolean39 = element19.equals((java.lang.Object) outputSettings35);
        org.jsoup.nodes.Document document41 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements44 = document41.getElementsByAttributeValueMatching("hi!", "hi!");
        org.jsoup.nodes.Document document45 = document41.clone();
        org.jsoup.nodes.Document document47 = new org.jsoup.nodes.Document("");
        boolean boolean48 = document47.isBlock();
        java.util.List<org.jsoup.nodes.DataNode> dataNodeList49 = document47.dataNodes();
        java.lang.String str51 = document47.attr("");
        org.jsoup.nodes.Document.QuirksMode quirksMode52 = org.jsoup.nodes.Document.QuirksMode.noQuirks;
        org.jsoup.nodes.Document document53 = document47.quirksMode(quirksMode52);
        org.jsoup.nodes.Document document54 = document45.quirksMode(quirksMode52);
        org.jsoup.nodes.Element element55 = element19.after((org.jsoup.nodes.Node) document54);
        // The following exception was thrown during execution in test generation
        try {
            document1.replaceWith((org.jsoup.nodes.Node) element19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(document13);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(elements17);
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertNotNull(textNodeList22);
        org.junit.Assert.assertNotNull(elements23);
        org.junit.Assert.assertNotNull(elements28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(element31);
        org.junit.Assert.assertNotNull(element32);
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertTrue("'" + escapeMode36 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode36.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset37);
        org.junit.Assert.assertNotNull(document38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(elements44);
        org.junit.Assert.assertNotNull(document45);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(dataNodeList49);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
        org.junit.Assert.assertTrue("'" + quirksMode52 + "' != '" + org.jsoup.nodes.Document.QuirksMode.noQuirks + "'", quirksMode52.equals(org.jsoup.nodes.Document.QuirksMode.noQuirks));
        org.junit.Assert.assertNotNull(document53);
        org.junit.Assert.assertNotNull(document54);
        org.junit.Assert.assertNotNull(element55);
    }

    @Test
    public void test0146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0146");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean2 = document1.isBlock();
        java.util.List<org.jsoup.nodes.DataNode> dataNodeList3 = document1.dataNodes();
        java.lang.String str5 = document1.attr("");
        java.lang.String str6 = document1.text();
        java.util.Set<java.lang.String> strSet7 = document1.classNames();
        org.jsoup.select.Elements elements9 = document1.getElementsMatchingText("<#root></#root>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element11 = document1.after("<#root>");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(dataNodeList3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertNotNull(elements9);
    }

    @Test
    public void test0147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0147");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean2 = document1.isBlock();
        java.util.List<org.jsoup.nodes.DataNode> dataNodeList3 = document1.dataNodes();
        java.lang.String str5 = document1.attr("");
        org.jsoup.nodes.Document.QuirksMode quirksMode6 = org.jsoup.nodes.Document.QuirksMode.noQuirks;
        org.jsoup.nodes.Document document7 = document1.quirksMode(quirksMode6);
        org.jsoup.nodes.Document document8 = document1.ownerDocument();
        org.jsoup.parser.Tag tag9 = document8.tag();
        java.lang.String str10 = document8.ownText();
        org.jsoup.select.Elements elements12 = document8.select("#root");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(dataNodeList3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + quirksMode6 + "' != '" + org.jsoup.nodes.Document.QuirksMode.noQuirks + "'", quirksMode6.equals(org.jsoup.nodes.Document.QuirksMode.noQuirks));
        org.junit.Assert.assertNotNull(document7);
        org.junit.Assert.assertNotNull(document8);
        org.junit.Assert.assertNotNull(tag9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(elements12);
    }

    @Test
    public void test0148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0148");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Element element2 = document1.head();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = element2.hasClass("#document");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(element2);
    }

    @Test
    public void test0149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0149");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements4 = document1.getElementsByAttributeValueMatching("hi!", "hi!");
        org.jsoup.nodes.Document document5 = document1.clone();
        org.jsoup.nodes.Node node7 = document1.removeAttr("hi!");
        java.lang.String str8 = document1.ownText();
        org.jsoup.nodes.Element element9 = document1.nextElementSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node10 = element9.nextSibling();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNotNull(document5);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(element9);
    }

    @Test
    public void test0150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0150");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.nodes.Element element3 = document1.append("");
        org.jsoup.nodes.Element element5 = element3.html("hi!");
        java.lang.String str6 = element5.val();
        java.lang.String str7 = element5.toString();
        org.jsoup.select.Elements elements9 = element5.getElementsByAttribute("#document");
        org.jsoup.nodes.Element element10 = element5.nextElementSibling();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = element10.hasClass("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertNull(element10);
    }

    @Test
    public void test0151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0151");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements4 = document1.getElementsByAttributeValueMatching("hi!", "hi!");
        boolean boolean5 = document1.hasText();
        org.jsoup.select.Elements elements8 = document1.getElementsByAttributeValueContaining("hi!", "hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap9 = document1.dataset();
        org.jsoup.select.Elements elements12 = document1.getElementsByAttributeValueEnding("<hi!></hi!>", "#document");
        org.jsoup.nodes.Element element14 = document1.createElement("#document");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements16 = element14.getElementsByAttributeStarting("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertNotNull(element14);
    }

    @Test
    public void test0152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0152");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements4 = document1.getElementsByAttributeValueMatching("hi!", "hi!");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet7 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet7, strArray6);
        org.jsoup.nodes.Element element9 = document1.classNames((java.util.Set<java.lang.String>) strSet7);
        org.jsoup.nodes.Document document10 = document1.clone();
        org.jsoup.nodes.Document document12 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements15 = document12.getElementsByAttributeValueMatching("hi!", "hi!");
        boolean boolean16 = document12.hasText();
        org.jsoup.nodes.Document document18 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element19 = document12.prependChild((org.jsoup.nodes.Node) document18);
        org.jsoup.nodes.Document.OutputSettings outputSettings20 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings21 = outputSettings20.clone();
        org.jsoup.nodes.Entities.EscapeMode escapeMode22 = outputSettings21.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings23 = outputSettings21.clone();
        org.jsoup.nodes.Document document24 = document12.outputSettings(outputSettings23);
        org.jsoup.parser.Tag tag25 = document12.tag();
        org.jsoup.nodes.Element element26 = document1.appendChild((org.jsoup.nodes.Node) document12);
        org.jsoup.select.Elements elements29 = element26.getElementsByAttributeValue("<html>\n <head></head>\n <body></body>\n</html>", "&lt;#root&gt;\n<!--#root-->&lt;#root&gt;\n<!--#root-->");
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(document10);
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(document18);
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertNotNull(outputSettings21);
        org.junit.Assert.assertTrue("'" + escapeMode22 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode22.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings23);
        org.junit.Assert.assertNotNull(document24);
        org.junit.Assert.assertNotNull(tag25);
        org.junit.Assert.assertNotNull(element26);
        org.junit.Assert.assertNotNull(elements29);
    }

    @Test
    public void test0153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0153");
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
        boolean boolean16 = document1.hasAttr("#document");
        org.jsoup.nodes.Document document18 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Element element20 = document18.removeClass("<#root></#root>");
        java.util.regex.Pattern pattern22 = null;
        org.jsoup.select.Elements elements23 = element20.getElementsByAttributeValueMatching("#document", pattern22);
        org.jsoup.nodes.Element element25 = element20.append("<#root>\n <html>\n  <head></head>\n  <body></body>\n </html>\n</#root>");
        // The following exception was thrown during execution in test generation
        try {
            document1.replaceWith((org.jsoup.nodes.Node) element25);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "<#root></#root>" + "'", str13, "<#root></#root>");
        org.junit.Assert.assertNotNull(document14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertNotNull(elements23);
        org.junit.Assert.assertNotNull(element25);
    }

    @Test
    public void test0154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0154");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements4 = document1.getElementsByAttributeValueMatching("hi!", "hi!");
        org.jsoup.nodes.Document document5 = document1.clone();
        org.jsoup.nodes.Document.QuirksMode quirksMode6 = null;
        org.jsoup.nodes.Document document7 = document1.quirksMode(quirksMode6);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element9 = document7.child((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNotNull(document5);
        org.junit.Assert.assertNotNull(document7);
    }

    @Test
    public void test0155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0155");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean2 = document1.isBlock();
        java.util.List<org.jsoup.nodes.DataNode> dataNodeList3 = document1.dataNodes();
        java.lang.String str5 = document1.attr("");
        org.jsoup.nodes.Document.QuirksMode quirksMode6 = org.jsoup.nodes.Document.QuirksMode.noQuirks;
        org.jsoup.nodes.Document document7 = document1.quirksMode(quirksMode6);
        org.jsoup.nodes.Document document8 = document1.ownerDocument();
        java.lang.String str9 = document1.toString();
        org.jsoup.select.Elements elements11 = document1.getElementsContainingOwnText("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(dataNodeList3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + quirksMode6 + "' != '" + org.jsoup.nodes.Document.QuirksMode.noQuirks + "'", quirksMode6.equals(org.jsoup.nodes.Document.QuirksMode.noQuirks));
        org.junit.Assert.assertNotNull(document7);
        org.junit.Assert.assertNotNull(document8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(elements11);
    }

    @Test
    public void test0156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0156");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document.OutputSettings outputSettings39 = outputSettings13.charset(" hi!");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message:  hi!");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(document6);
        org.junit.Assert.assertNotNull(outputSettings8);
        org.junit.Assert.assertTrue("'" + escapeMode10 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode10.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + escapeMode12 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode12.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings13);
        org.junit.Assert.assertNotNull(elements18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(document21);
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertNotNull(outputSettings24);
        org.junit.Assert.assertTrue("'" + escapeMode25 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode25.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings26);
        org.junit.Assert.assertNotNull(document27);
        org.junit.Assert.assertNotNull(outputSettings29);
        org.junit.Assert.assertTrue("'" + escapeMode31 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode31.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
        org.junit.Assert.assertTrue("'" + escapeMode33 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode33.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings34);
        org.junit.Assert.assertNotNull(outputSettings35);
        org.junit.Assert.assertNotNull(outputSettings36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
    }

    @Test
    public void test0157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0157");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.nodes.Element element3 = document1.append("");
        org.jsoup.nodes.Element element5 = document1.toggleClass("");
        org.jsoup.nodes.Node node6 = document1.nextSibling();
        java.lang.String str7 = document1.ownText();
        org.jsoup.nodes.Element element9 = document1.appendText("<#root>");
        java.lang.Integer int10 = document1.elementSiblingIndex();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements13 = document1.getElementsByAttributeValue("<#root></#root>\n<html>\n <head></head>\n <body></body>\n</html>", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0158");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = document1.textNodes();
        org.jsoup.nodes.Element element4 = document1.prependElement("hi!");
        java.lang.String str5 = element4.id();
        org.jsoup.select.Elements elements8 = element4.getElementsByAttributeValueMatching("", "<#root>\n <html>\n  <head></head>\n  <body></body>\n </html>\n</#root>");
        org.jsoup.nodes.Element element9 = element4.previousElementSibling();
        org.jsoup.nodes.Document document11 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.nodes.Element element13 = document11.append("");
        org.jsoup.nodes.Element element15 = element13.html("hi!");
        java.lang.String str16 = element15.val();
        java.lang.String str17 = element15.baseUri();
        boolean boolean19 = element15.hasAttr("#document");
        // The following exception was thrown during execution in test generation
        try {
            element9.replaceWith((org.jsoup.nodes.Node) element15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNull(element9);
        org.junit.Assert.assertNotNull(document11);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test0159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0159");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements4 = document1.getElementsByAttributeValueMatching("hi!", "hi!");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet7 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet7, strArray6);
        org.jsoup.nodes.Element element9 = document1.classNames((java.util.Set<java.lang.String>) strSet7);
        org.jsoup.nodes.Document document10 = document1.clone();
        org.jsoup.nodes.Document document12 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements15 = document12.getElementsByAttributeValueMatching("hi!", "hi!");
        boolean boolean16 = document12.hasText();
        org.jsoup.nodes.Document document18 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element19 = document12.prependChild((org.jsoup.nodes.Node) document18);
        org.jsoup.nodes.Document.OutputSettings outputSettings20 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings21 = outputSettings20.clone();
        org.jsoup.nodes.Entities.EscapeMode escapeMode22 = outputSettings21.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings23 = outputSettings21.clone();
        org.jsoup.nodes.Document document24 = document12.outputSettings(outputSettings23);
        org.jsoup.parser.Tag tag25 = document12.tag();
        org.jsoup.nodes.Element element26 = document1.appendChild((org.jsoup.nodes.Node) document12);
        org.jsoup.select.Elements elements28 = document1.getElementsByIndexLessThan((int) (short) -1);
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(document10);
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(document18);
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertNotNull(outputSettings21);
        org.junit.Assert.assertTrue("'" + escapeMode22 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode22.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings23);
        org.junit.Assert.assertNotNull(document24);
        org.junit.Assert.assertNotNull(tag25);
        org.junit.Assert.assertNotNull(element26);
        org.junit.Assert.assertNotNull(elements28);
    }

    @Test
    public void test0160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0160");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean2 = document1.isBlock();
        java.util.List<org.jsoup.nodes.DataNode> dataNodeList3 = document1.dataNodes();
        java.lang.String str5 = document1.attr("");
        org.jsoup.nodes.Node node6 = document1.nextSibling();
        org.jsoup.select.Elements elements7 = document1.parents();
        boolean boolean8 = document1.isBlock();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(dataNodeList3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0161");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements4 = document1.getElementsByAttributeValueMatching("hi!", "hi!");
        boolean boolean5 = document1.hasText();
        org.jsoup.select.Elements elements8 = document1.getElementsByAttributeValueContaining("hi!", "hi!");
        org.jsoup.nodes.Element element10 = document1.append("<#root>\n <html>\n  <head></head>\n  <body></body>\n </html>\n</#root>");
        java.lang.Integer int11 = document1.elementSiblingIndex();
        org.jsoup.nodes.Document document12 = document1.clone();
        java.lang.String str13 = document1.nodeName();
        org.jsoup.nodes.Element element14 = document1.previousElementSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element16 = element14.prependElement("<#root></#root>\n<html>\n <head></head>\n <body></body>\n</html>");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(document12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "#document" + "'", str13, "#document");
        org.junit.Assert.assertNull(element14);
    }

    @Test
    public void test0162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0162");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements4 = document1.getElementsByAttributeValueMatching("hi!", "hi!");
        boolean boolean5 = document1.hasText();
        org.jsoup.select.Elements elements8 = document1.getElementsByAttributeValueContaining("hi!", "hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap9 = document1.dataset();
        org.jsoup.select.Elements elements12 = document1.getElementsByAttributeValueEnding("<hi!></hi!>", "#document");
        org.jsoup.nodes.Document.QuirksMode quirksMode13 = org.jsoup.nodes.Document.QuirksMode.noQuirks;
        org.jsoup.nodes.Document document14 = document1.quirksMode(quirksMode13);
        org.jsoup.select.Elements elements16 = document1.getElementsByIndexGreaterThan((int) 'a');
        org.jsoup.nodes.Document document18 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements21 = document18.getElementsByAttributeValueMatching("hi!", "hi!");
        java.lang.String[] strArray23 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet24 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet24, strArray23);
        org.jsoup.nodes.Element element26 = document18.classNames((java.util.Set<java.lang.String>) strSet24);
        org.jsoup.nodes.Document document27 = document18.clone();
        java.lang.String str28 = document18.ownText();
        org.jsoup.nodes.Element element30 = document18.val("");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element31 = document1.before((org.jsoup.nodes.Node) element30);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertTrue("'" + quirksMode13 + "' != '" + org.jsoup.nodes.Document.QuirksMode.noQuirks + "'", quirksMode13.equals(org.jsoup.nodes.Document.QuirksMode.noQuirks));
        org.junit.Assert.assertNotNull(document14);
        org.junit.Assert.assertNotNull(elements16);
        org.junit.Assert.assertNotNull(elements21);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertArrayEquals(strArray23, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(element26);
        org.junit.Assert.assertNotNull(document27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNotNull(element30);
    }

    @Test
    public void test0163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0163");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = document1.textNodes();
        org.jsoup.nodes.Element element4 = document1.prependElement("hi!");
        org.jsoup.nodes.Element element6 = document1.toggleClass("<hi!></hi!>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements8 = element6.getElementsByAttribute("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element6);
    }

    @Test
    public void test0164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0164");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = document1.textNodes();
        org.jsoup.select.Elements elements3 = document1.getAllElements();
        org.jsoup.nodes.Document document5 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements8 = document5.getElementsByAttributeValueMatching("hi!", "hi!");
        boolean boolean9 = document5.hasText();
        org.jsoup.nodes.Element element11 = document5.append("");
        org.jsoup.nodes.Element element12 = document1.appendChild((org.jsoup.nodes.Node) document5);
        org.jsoup.nodes.Element element13 = document1.nextElementSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element15 = element13.tagName("<#root>");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNull(element13);
    }

    @Test
    public void test0165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0165");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean2 = document1.isBlock();
        java.util.List<org.jsoup.nodes.DataNode> dataNodeList3 = document1.dataNodes();
        java.lang.String str5 = document1.attr("");
        java.lang.String str6 = document1.text();
        java.util.Set<java.lang.String> strSet7 = document1.classNames();
        org.jsoup.nodes.Document.QuirksMode quirksMode8 = document1.quirksMode();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element10 = document1.child((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(dataNodeList3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertTrue("'" + quirksMode8 + "' != '" + org.jsoup.nodes.Document.QuirksMode.noQuirks + "'", quirksMode8.equals(org.jsoup.nodes.Document.QuirksMode.noQuirks));
    }

    @Test
    public void test0166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0166");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = document1.textNodes();
        org.jsoup.nodes.Element element4 = document1.prependElement("hi!");
        java.lang.String str5 = element4.baseUri();
        org.jsoup.nodes.Element element7 = element4.toggleClass("hi!");
        org.jsoup.nodes.Element element9 = element7.prependText("");
        org.jsoup.nodes.Element element11 = element9.val("<html>\n <head></head>\n <body></body>\n</html>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements13 = element9.getElementsByAttribute("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(element11);
    }

    @Test
    public void test0167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0167");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements23 = document14.getElementsByAttributeValueContaining("", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "<#root></#root>" + "'", str13, "<#root></#root>");
        org.junit.Assert.assertNotNull(document14);
        org.junit.Assert.assertNotNull(textNodeList17);
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertNotNull(element20);
    }

    @Test
    public void test0168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0168");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements4 = document1.getElementsByAttributeValueMatching("hi!", "hi!");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet7 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet7, strArray6);
        org.jsoup.nodes.Element element9 = document1.classNames((java.util.Set<java.lang.String>) strSet7);
        org.jsoup.nodes.Document document10 = document1.clone();
        org.jsoup.nodes.Document document12 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements15 = document12.getElementsByAttributeValueMatching("hi!", "hi!");
        boolean boolean16 = document12.hasText();
        org.jsoup.nodes.Document document18 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element19 = document12.prependChild((org.jsoup.nodes.Node) document18);
        org.jsoup.nodes.Document.OutputSettings outputSettings20 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings21 = outputSettings20.clone();
        org.jsoup.nodes.Entities.EscapeMode escapeMode22 = outputSettings21.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings23 = outputSettings21.clone();
        org.jsoup.nodes.Document document24 = document12.outputSettings(outputSettings23);
        org.jsoup.parser.Tag tag25 = document12.tag();
        org.jsoup.nodes.Element element26 = document1.appendChild((org.jsoup.nodes.Node) document12);
        java.lang.String str27 = document1.nodeName();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node29 = document1.childNode(1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(document10);
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(document18);
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertNotNull(outputSettings21);
        org.junit.Assert.assertTrue("'" + escapeMode22 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode22.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings23);
        org.junit.Assert.assertNotNull(document24);
        org.junit.Assert.assertNotNull(tag25);
        org.junit.Assert.assertNotNull(element26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "#document" + "'", str27, "#document");
    }

    @Test
    public void test0169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0169");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements26 = document14.getElementsByAttributeValueEnding("", "<#root></#root>");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "<#root></#root>" + "'", str13, "<#root></#root>");
        org.junit.Assert.assertNotNull(document14);
        org.junit.Assert.assertNotNull(textNodeList17);
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(element23);
    }

    @Test
    public void test0170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0170");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = document1.textNodes();
        java.util.List<org.jsoup.nodes.TextNode> textNodeList3 = document1.textNodes();
        org.jsoup.nodes.Document document4 = document1.clone();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements6 = document4.select("hi!");
            org.junit.Assert.fail("Expected exception of type org.jsoup.select.Selector.SelectorParseException; message: Could not parse query 'hi!': unexpected token at '!'");
        } catch (org.jsoup.select.Selector.SelectorParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertNotNull(textNodeList3);
        org.junit.Assert.assertNotNull(document4);
    }

    @Test
    public void test0171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0171");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements4 = document1.getElementsByAttributeValueMatching("hi!", "hi!");
        org.jsoup.nodes.Document document5 = document1.clone();
        org.jsoup.nodes.Document.QuirksMode quirksMode6 = null;
        org.jsoup.nodes.Document document7 = document1.quirksMode(quirksMode6);
        java.util.Set<java.lang.String> strSet8 = document1.classNames();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element10 = document1.text("<#root>\n <html>\n  <head></head>\n  <body></body>\n </html>\n</#root>");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNotNull(document5);
        org.junit.Assert.assertNotNull(document7);
        org.junit.Assert.assertNotNull(strSet8);
    }

    @Test
    public void test0172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0172");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.nodes.Element element3 = document1.append("");
        org.jsoup.nodes.Element element5 = document1.toggleClass("");
        org.jsoup.nodes.Node node6 = document1.nextSibling();
        org.jsoup.nodes.Element element8 = document1.prependElement("<#root>\n <html>\n  <head></head>\n  <body></body>\n </html>\n</#root>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element10 = document1.createElement("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNotNull(element8);
    }

    @Test
    public void test0173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0173");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean2 = document1.isBlock();
        org.jsoup.nodes.Element element4 = document1.toggleClass("hi!");
        org.jsoup.nodes.Attributes attributes5 = element4.attributes();
        org.jsoup.nodes.Element element7 = element4.appendElement("<hi!></hi!>");
        java.lang.String str8 = element4.data();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node9 = element4.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(attributes5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0174");
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
        org.jsoup.nodes.Document.OutputSettings outputSettings14 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings15 = outputSettings14.clone();
        org.jsoup.nodes.Document.OutputSettings outputSettings16 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode17 = outputSettings16.escapeMode();
        int int18 = outputSettings16.indentAmount();
        org.jsoup.nodes.Entities.EscapeMode escapeMode19 = outputSettings16.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings20 = outputSettings15.escapeMode(escapeMode19);
        org.jsoup.nodes.Document.OutputSettings outputSettings21 = outputSettings12.escapeMode(escapeMode19);
        org.jsoup.nodes.Entities.EscapeMode escapeMode22 = outputSettings12.escapeMode();
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(document7);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(outputSettings10);
        org.junit.Assert.assertTrue("'" + escapeMode11 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode11.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings12);
        org.junit.Assert.assertNotNull(document13);
        org.junit.Assert.assertNotNull(outputSettings15);
        org.junit.Assert.assertTrue("'" + escapeMode17 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode17.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + escapeMode19 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode19.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings20);
        org.junit.Assert.assertNotNull(outputSettings21);
        org.junit.Assert.assertTrue("'" + escapeMode22 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode22.equals(org.jsoup.nodes.Entities.EscapeMode.base));
    }

    @Test
    public void test0175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0175");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements4 = document1.getElementsByAttributeValueMatching("hi!", "hi!");
        boolean boolean5 = document1.hasText();
        org.jsoup.nodes.Element element7 = document1.append("");
        java.lang.String str9 = element7.attr("<#root>\n <html>\n  <head></head>\n  <body></body>\n </html>\n</#root>");
        org.jsoup.select.Elements elements11 = element7.getElementsContainingOwnText("<#root>");
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(elements11);
    }

    @Test
    public void test0176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0176");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements4 = document1.getElementsByAttributeValueMatching("hi!", "hi!");
        org.jsoup.nodes.Document document5 = document1.clone();
        org.jsoup.nodes.Document.QuirksMode quirksMode6 = null;
        org.jsoup.nodes.Document document7 = document1.quirksMode(quirksMode6);
        org.jsoup.nodes.Element element9 = document7.getElementById("<#root></#root>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element11 = element9.prependText("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNotNull(document5);
        org.junit.Assert.assertNotNull(document7);
        org.junit.Assert.assertNull(element9);
    }

    @Test
    public void test0177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0177");
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
        org.jsoup.nodes.Element element32 = element30.removeClass("");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements34 = element32.select(" hi!");
            org.junit.Assert.fail("Expected exception of type org.jsoup.select.Selector.SelectorParseException; message: Could not parse query 'hi!': unexpected token at '!'");
        } catch (org.jsoup.select.Selector.SelectorParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(dataNodeList3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(dataNodeList13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + quirksMode16 + "' != '" + org.jsoup.nodes.Document.QuirksMode.noQuirks + "'", quirksMode16.equals(org.jsoup.nodes.Document.QuirksMode.noQuirks));
        org.junit.Assert.assertNotNull(document17);
        org.junit.Assert.assertNotNull(document18);
        org.junit.Assert.assertNotNull(elements23);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertArrayEquals(strArray25, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(element28);
        org.junit.Assert.assertNotNull(element29);
        org.junit.Assert.assertNotNull(element30);
        org.junit.Assert.assertNotNull(element32);
    }

    @Test
    public void test0178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0178");
        org.jsoup.nodes.Document.OutputSettings outputSettings0 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings1 = outputSettings0.clone();
        org.jsoup.nodes.Document.OutputSettings outputSettings2 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode3 = outputSettings2.escapeMode();
        int int4 = outputSettings2.indentAmount();
        org.jsoup.nodes.Entities.EscapeMode escapeMode5 = outputSettings2.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings6 = outputSettings1.escapeMode(escapeMode5);
        org.jsoup.nodes.Document document8 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements11 = document8.getElementsByAttributeValueMatching("hi!", "hi!");
        boolean boolean12 = document8.hasText();
        org.jsoup.nodes.Document document14 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element15 = document8.prependChild((org.jsoup.nodes.Node) document14);
        org.jsoup.nodes.Document.OutputSettings outputSettings16 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings17 = outputSettings16.clone();
        org.jsoup.nodes.Entities.EscapeMode escapeMode18 = outputSettings17.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings19 = outputSettings17.clone();
        org.jsoup.nodes.Document document20 = document8.outputSettings(outputSettings19);
        org.jsoup.nodes.Document.OutputSettings outputSettings21 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings22 = outputSettings21.clone();
        org.jsoup.nodes.Document.OutputSettings outputSettings23 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode24 = outputSettings23.escapeMode();
        int int25 = outputSettings23.indentAmount();
        org.jsoup.nodes.Entities.EscapeMode escapeMode26 = outputSettings23.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings27 = outputSettings22.escapeMode(escapeMode26);
        org.jsoup.nodes.Document.OutputSettings outputSettings28 = outputSettings19.escapeMode(escapeMode26);
        org.jsoup.nodes.Document.OutputSettings outputSettings29 = outputSettings6.escapeMode(escapeMode26);
        org.jsoup.nodes.Document.OutputSettings outputSettings31 = outputSettings6.prettyPrint(true);
        org.jsoup.nodes.Document.OutputSettings outputSettings32 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode33 = outputSettings32.escapeMode();
        java.nio.charset.Charset charset34 = outputSettings32.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings35 = outputSettings32.clone();
        org.jsoup.nodes.Document.OutputSettings outputSettings36 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode37 = outputSettings36.escapeMode();
        java.nio.charset.Charset charset38 = outputSettings36.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings39 = outputSettings36.clone();
        org.jsoup.nodes.Document.OutputSettings outputSettings40 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode41 = outputSettings40.escapeMode();
        int int42 = outputSettings40.indentAmount();
        org.jsoup.nodes.Entities.EscapeMode escapeMode43 = outputSettings40.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings44 = outputSettings36.escapeMode(escapeMode43);
        org.jsoup.nodes.Document.OutputSettings outputSettings45 = outputSettings32.escapeMode(escapeMode43);
        org.jsoup.nodes.Document.OutputSettings outputSettings46 = outputSettings6.escapeMode(escapeMode43);
        org.jsoup.nodes.Document.OutputSettings outputSettings47 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings48 = outputSettings47.clone();
        org.jsoup.nodes.Entities.EscapeMode escapeMode49 = outputSettings48.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings50 = outputSettings46.escapeMode(escapeMode49);
        boolean boolean51 = outputSettings50.prettyPrint();
        org.junit.Assert.assertNotNull(outputSettings1);
        org.junit.Assert.assertTrue("'" + escapeMode3 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode3.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + escapeMode5 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode5.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings6);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(document14);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(outputSettings17);
        org.junit.Assert.assertTrue("'" + escapeMode18 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode18.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings19);
        org.junit.Assert.assertNotNull(document20);
        org.junit.Assert.assertNotNull(outputSettings22);
        org.junit.Assert.assertTrue("'" + escapeMode24 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode24.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertTrue("'" + escapeMode26 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode26.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings27);
        org.junit.Assert.assertNotNull(outputSettings28);
        org.junit.Assert.assertNotNull(outputSettings29);
        org.junit.Assert.assertNotNull(outputSettings31);
        org.junit.Assert.assertTrue("'" + escapeMode33 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode33.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset34);
        org.junit.Assert.assertNotNull(outputSettings35);
        org.junit.Assert.assertTrue("'" + escapeMode37 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode37.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset38);
        org.junit.Assert.assertNotNull(outputSettings39);
        org.junit.Assert.assertTrue("'" + escapeMode41 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode41.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 1 + "'", int42 == 1);
        org.junit.Assert.assertTrue("'" + escapeMode43 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode43.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings44);
        org.junit.Assert.assertNotNull(outputSettings45);
        org.junit.Assert.assertNotNull(outputSettings46);
        org.junit.Assert.assertNotNull(outputSettings48);
        org.junit.Assert.assertTrue("'" + escapeMode49 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode49.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
    }

    @Test
    public void test0179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0179");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean2 = document1.isBlock();
        java.util.List<org.jsoup.nodes.DataNode> dataNodeList3 = document1.dataNodes();
        java.lang.String str5 = document1.attr("");
        org.jsoup.nodes.Document.QuirksMode quirksMode6 = org.jsoup.nodes.Document.QuirksMode.noQuirks;
        org.jsoup.nodes.Document document7 = document1.quirksMode(quirksMode6);
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = document1.outputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = outputSettings9.clone();
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode12 = outputSettings11.escapeMode();
        java.nio.charset.Charset charset13 = outputSettings11.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings14 = outputSettings10.charset(charset13);
        org.jsoup.nodes.Document.OutputSettings outputSettings15 = outputSettings8.charset(charset13);
        org.jsoup.nodes.Document.OutputSettings outputSettings17 = outputSettings15.indentAmount((int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document.OutputSettings outputSettings19 = outputSettings15.charset("<#root class=\"hi!\"></#root>\n<#root></#root>");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: <#root class=\"hi!\"></#root>?<#root></#root>");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(dataNodeList3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + quirksMode6 + "' != '" + org.jsoup.nodes.Document.QuirksMode.noQuirks + "'", quirksMode6.equals(org.jsoup.nodes.Document.QuirksMode.noQuirks));
        org.junit.Assert.assertNotNull(document7);
        org.junit.Assert.assertNotNull(outputSettings8);
        org.junit.Assert.assertNotNull(outputSettings10);
        org.junit.Assert.assertTrue("'" + escapeMode12 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode12.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset13);
        org.junit.Assert.assertNotNull(outputSettings14);
        org.junit.Assert.assertNotNull(outputSettings15);
        org.junit.Assert.assertNotNull(outputSettings17);
    }

    @Test
    public void test0180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0180");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean2 = document1.isBlock();
        java.util.List<org.jsoup.nodes.DataNode> dataNodeList3 = document1.dataNodes();
        java.lang.String str5 = document1.attr("");
        org.jsoup.nodes.Document.QuirksMode quirksMode6 = org.jsoup.nodes.Document.QuirksMode.noQuirks;
        org.jsoup.nodes.Document document7 = document1.quirksMode(quirksMode6);
        org.jsoup.nodes.Document document8 = document1.ownerDocument();
        org.jsoup.nodes.Document document10 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements13 = document10.getElementsByAttributeValueMatching("hi!", "hi!");
        java.lang.String[] strArray15 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet16 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet16, strArray15);
        org.jsoup.nodes.Element element18 = document10.classNames((java.util.Set<java.lang.String>) strSet16);
        org.jsoup.nodes.Element element19 = document8.classNames((java.util.Set<java.lang.String>) strSet16);
        org.jsoup.nodes.Document document21 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements24 = document21.getElementsByAttributeValueMatching("hi!", "hi!");
        java.lang.String[] strArray26 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet27 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet27, strArray26);
        org.jsoup.nodes.Element element29 = document21.classNames((java.util.Set<java.lang.String>) strSet27);
        boolean boolean30 = element19.equals((java.lang.Object) document21);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node32 = document21.removeAttr("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(dataNodeList3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + quirksMode6 + "' != '" + org.jsoup.nodes.Document.QuirksMode.noQuirks + "'", quirksMode6.equals(org.jsoup.nodes.Document.QuirksMode.noQuirks));
        org.junit.Assert.assertNotNull(document7);
        org.junit.Assert.assertNotNull(document8);
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertNotNull(elements24);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertArrayEquals(strArray26, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(element29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test0181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0181");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean2 = document1.isBlock();
        org.jsoup.nodes.Element element4 = document1.toggleClass("hi!");
        org.jsoup.nodes.Attributes attributes5 = element4.attributes();
        org.jsoup.nodes.Element element7 = element4.appendElement("<hi!></hi!>");
        org.jsoup.nodes.Element element9 = element4.tagName(" hi!");
        int int10 = element4.siblingIndex();
        org.jsoup.select.Elements elements11 = element4.parents();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(attributes5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(elements11);
    }

    @Test
    public void test0182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0182");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = document1.textNodes();
        org.jsoup.nodes.Element element4 = document1.prependElement("hi!");
        java.lang.String str5 = element4.baseUri();
        org.jsoup.nodes.Element element7 = element4.toggleClass("hi!");
        org.jsoup.nodes.Element element9 = element7.prependText("");
        org.jsoup.nodes.Element element11 = element9.val("<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.select.NodeVisitor nodeVisitor12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node13 = element11.traverse(nodeVisitor12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(element11);
    }

    @Test
    public void test0183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0183");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements4 = document1.getElementsByAttributeValueMatching("hi!", "hi!");
        boolean boolean5 = document1.hasText();
        org.jsoup.select.Elements elements8 = document1.getElementsByAttributeValueContaining("hi!", "hi!");
        org.jsoup.nodes.Element element10 = document1.append("<#root>\n <html>\n  <head></head>\n  <body></body>\n </html>\n</#root>");
        org.jsoup.nodes.Element element11 = element10.parent();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.jsoup.nodes.DataNode> dataNodeList12 = element11.dataNodes();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNull(element11);
    }

    @Test
    public void test0184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0184");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean2 = document1.isBlock();
        org.jsoup.nodes.Element element4 = document1.toggleClass("hi!");
        org.jsoup.nodes.Attributes attributes5 = element4.attributes();
        org.jsoup.nodes.Element element7 = element4.appendElement("<hi!></hi!>");
        org.jsoup.nodes.Element element9 = element4.tagName(" hi!");
        org.jsoup.select.Elements elements11 = element4.getElementsContainingText("<#root>");
        boolean boolean13 = element4.hasAttr("&lt;#root&gt;\n<!--#root-->&lt;#root&gt;\n<!--#root-->");
        org.jsoup.nodes.Element element15 = element4.toggleClass("<#root></#root>\n<html>\n <head></head>\n <body></body>\n</html>");
        java.util.regex.Pattern pattern16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements17 = element15.getElementsMatchingText(pattern16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(attributes5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(element15);
    }

    @Test
    public void test0185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0185");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements4 = document1.getElementsByAttributeValueMatching("hi!", "hi!");
        boolean boolean5 = document1.hasText();
        org.jsoup.nodes.Element element7 = document1.append("");
        org.jsoup.select.Elements elements8 = document1.siblingElements();
        org.jsoup.nodes.Document document9 = document1.clone();
        org.jsoup.select.Elements elements11 = document1.getElementsMatchingText("hi!");
        org.jsoup.nodes.Element element13 = document1.tagName("<#root>");
        org.jsoup.nodes.Element element14 = document1.head();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements17 = document1.getElementsByAttributeValueContaining("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(document9);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNull(element14);
    }

    @Test
    public void test0186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0186");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = document1.textNodes();
        org.jsoup.select.Elements elements3 = document1.getAllElements();
        org.jsoup.nodes.Document document5 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements8 = document5.getElementsByAttributeValueMatching("hi!", "hi!");
        boolean boolean9 = document5.hasText();
        org.jsoup.nodes.Element element11 = document5.append("");
        org.jsoup.nodes.Element element12 = document1.appendChild((org.jsoup.nodes.Node) document5);
        java.util.List<org.jsoup.nodes.Node> nodeList13 = element12.siblingNodes();
        org.jsoup.select.Elements elements16 = element12.getElementsByAttributeValueNot("<#root></#root>\n<html>\n <head></head>\n <body></body>\n</html>", "<#root>\n <html>\n  <head></head>\n  <body></body>\n </html>\n</#root>");
        org.jsoup.select.Elements elements17 = element12.children();
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(nodeList13);
        org.junit.Assert.assertNotNull(elements16);
        org.junit.Assert.assertNotNull(elements17);
    }

    @Test
    public void test0187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0187");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean2 = document1.isBlock();
        java.util.List<org.jsoup.nodes.DataNode> dataNodeList3 = document1.dataNodes();
        java.lang.String str5 = document1.attr("");
        org.jsoup.nodes.Document.QuirksMode quirksMode6 = org.jsoup.nodes.Document.QuirksMode.noQuirks;
        org.jsoup.nodes.Document document7 = document1.quirksMode(quirksMode6);
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = document1.outputSettings();
        org.jsoup.nodes.Element element9 = document1.parent();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element11 = document1.before("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(dataNodeList3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + quirksMode6 + "' != '" + org.jsoup.nodes.Document.QuirksMode.noQuirks + "'", quirksMode6.equals(org.jsoup.nodes.Document.QuirksMode.noQuirks));
        org.junit.Assert.assertNotNull(document7);
        org.junit.Assert.assertNotNull(outputSettings8);
        org.junit.Assert.assertNull(element9);
    }

    @Test
    public void test0188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0188");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements4 = document1.getElementsByAttributeValueMatching("hi!", "hi!");
        org.jsoup.nodes.Document document5 = document1.clone();
        java.util.regex.Pattern pattern7 = null;
        org.jsoup.select.Elements elements8 = document5.getElementsByAttributeValueMatching("<#root>\n <html>\n  <head></head>\n  <body></body>\n </html>\n</#root>", pattern7);
        org.jsoup.nodes.Document document10 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements13 = document10.getElementsByAttributeValueMatching("hi!", "hi!");
        org.jsoup.nodes.Document document14 = document10.clone();
        org.jsoup.nodes.Document document15 = document14.normalise();
        java.lang.String str16 = document14.data();
        org.jsoup.nodes.Document document18 = org.jsoup.nodes.Document.createShell("hi!");
        boolean boolean19 = document14.equals((java.lang.Object) "hi!");
        org.jsoup.nodes.Document.QuirksMode quirksMode20 = org.jsoup.nodes.Document.QuirksMode.limitedQuirks;
        org.jsoup.nodes.Document document21 = document14.quirksMode(quirksMode20);
        org.jsoup.nodes.Element element22 = document21.empty();
        java.lang.String str23 = element22.html();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element24 = document5.after((org.jsoup.nodes.Node) element22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNotNull(document5);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertNotNull(document14);
        org.junit.Assert.assertNotNull(document15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(document18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + quirksMode20 + "' != '" + org.jsoup.nodes.Document.QuirksMode.limitedQuirks + "'", quirksMode20.equals(org.jsoup.nodes.Document.QuirksMode.limitedQuirks));
        org.junit.Assert.assertNotNull(document21);
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test0189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0189");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements4 = document1.getElementsByAttributeValueMatching("hi!", "hi!");
        boolean boolean5 = document1.hasText();
        org.jsoup.nodes.Element element7 = document1.appendElement("<#root>\n <html>\n  <head></head>\n  <body></body>\n </html>\n</#root>");
        org.jsoup.nodes.Document document8 = document1.ownerDocument();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element10 = document8.before("<#root class=\"hi!\"></#root>\n<#root></#root>");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(document8);
    }

    @Test
    public void test0190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0190");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements4 = document1.getElementsByAttributeValueMatching("hi!", "hi!");
        boolean boolean5 = document1.hasText();
        org.jsoup.select.Elements elements8 = document1.getElementsByAttributeValueContaining("hi!", "hi!");
        org.jsoup.nodes.Element element10 = document1.append("<#root>\n <html>\n  <head></head>\n  <body></body>\n </html>\n</#root>");
        java.util.regex.Pattern pattern11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements12 = document1.getElementsMatchingOwnText(pattern11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(element10);
    }

    @Test
    public void test0191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0191");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Element element2 = document1.head();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass3 = element2.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(element2);
    }

    @Test
    public void test0192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0192");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.nodes.Element element3 = document1.append("");
        org.jsoup.nodes.Element element5 = document1.html("<#root></#root>");
        org.jsoup.nodes.Element element6 = document1.body();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, java.lang.String> strMap7 = element6.dataset();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNull(element6);
    }

    @Test
    public void test0193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0193");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.nodes.Element element3 = document1.append("");
        org.jsoup.nodes.Element element5 = document1.toggleClass("");
        java.lang.String str6 = document1.nodeName();
        java.lang.String str7 = document1.id();
        org.jsoup.nodes.Element element9 = document1.prependText("<#root></#root>");
        org.jsoup.nodes.Document document11 = new org.jsoup.nodes.Document("");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList12 = document11.textNodes();
        org.jsoup.nodes.Element element14 = document11.prependElement("hi!");
        org.jsoup.nodes.Element element15 = element14.previousElementSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element16 = document1.after((org.jsoup.nodes.Node) element15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "#document" + "'", str6, "#document");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(textNodeList12);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNull(element15);
    }

    @Test
    public void test0194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0194");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements4 = document1.getElementsByAttributeValueMatching("hi!", "hi!");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet7 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet7, strArray6);
        org.jsoup.nodes.Element element9 = document1.classNames((java.util.Set<java.lang.String>) strSet7);
        org.jsoup.nodes.Element element11 = document1.getElementById("hi!");
        org.jsoup.nodes.Element element14 = document1.attr("<#root>\n <html>\n  <head></head>\n  <body></body>\n </html>\n</#root>", "<#root>\n <html>\n  <head></head>\n  <body></body>\n </html>\n</#root>");
        org.jsoup.select.Elements elements16 = document1.getElementsContainingOwnText("<hi!></hi!>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements18 = document1.select("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNull(element11);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(elements16);
    }

    @Test
    public void test0195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0195");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean2 = document1.isBlock();
        java.util.List<org.jsoup.nodes.DataNode> dataNodeList3 = document1.dataNodes();
        java.lang.String str5 = document1.attr("");
        org.jsoup.nodes.Document.QuirksMode quirksMode6 = org.jsoup.nodes.Document.QuirksMode.noQuirks;
        org.jsoup.nodes.Document document7 = document1.quirksMode(quirksMode6);
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = document1.outputSettings();
        org.jsoup.nodes.Element element9 = document1.parent();
        java.lang.String str10 = document1.text();
        org.jsoup.nodes.Document document12 = new org.jsoup.nodes.Document("");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList13 = document12.textNodes();
        org.jsoup.nodes.Document document15 = new org.jsoup.nodes.Document("");
        boolean boolean16 = document15.isBlock();
        java.util.List<org.jsoup.nodes.DataNode> dataNodeList17 = document15.dataNodes();
        java.lang.String str19 = document15.attr("");
        org.jsoup.nodes.Document.QuirksMode quirksMode20 = org.jsoup.nodes.Document.QuirksMode.noQuirks;
        org.jsoup.nodes.Document document21 = document15.quirksMode(quirksMode20);
        org.jsoup.nodes.Document.OutputSettings outputSettings22 = document15.outputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings23 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings24 = outputSettings23.clone();
        org.jsoup.nodes.Document.OutputSettings outputSettings25 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode26 = outputSettings25.escapeMode();
        java.nio.charset.Charset charset27 = outputSettings25.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings28 = outputSettings24.charset(charset27);
        org.jsoup.nodes.Document.OutputSettings outputSettings29 = outputSettings22.charset(charset27);
        org.jsoup.nodes.Document.OutputSettings outputSettings30 = outputSettings29.clone();
        org.jsoup.nodes.Entities.EscapeMode escapeMode31 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings32 = outputSettings29.escapeMode(escapeMode31);
        org.jsoup.nodes.Document document33 = document12.outputSettings(outputSettings32);
        org.jsoup.nodes.Element element34 = document33.parent();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element35 = document1.before((org.jsoup.nodes.Node) document33);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(dataNodeList3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + quirksMode6 + "' != '" + org.jsoup.nodes.Document.QuirksMode.noQuirks + "'", quirksMode6.equals(org.jsoup.nodes.Document.QuirksMode.noQuirks));
        org.junit.Assert.assertNotNull(document7);
        org.junit.Assert.assertNotNull(outputSettings8);
        org.junit.Assert.assertNull(element9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(textNodeList13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(dataNodeList17);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + quirksMode20 + "' != '" + org.jsoup.nodes.Document.QuirksMode.noQuirks + "'", quirksMode20.equals(org.jsoup.nodes.Document.QuirksMode.noQuirks));
        org.junit.Assert.assertNotNull(document21);
        org.junit.Assert.assertNotNull(outputSettings22);
        org.junit.Assert.assertNotNull(outputSettings24);
        org.junit.Assert.assertTrue("'" + escapeMode26 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode26.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset27);
        org.junit.Assert.assertNotNull(outputSettings28);
        org.junit.Assert.assertNotNull(outputSettings29);
        org.junit.Assert.assertNotNull(outputSettings30);
        org.junit.Assert.assertNotNull(outputSettings32);
        org.junit.Assert.assertNotNull(document33);
        org.junit.Assert.assertNull(element34);
    }

    @Test
    public void test0196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0196");
        org.jsoup.nodes.Document.OutputSettings outputSettings0 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode1 = outputSettings0.escapeMode();
        java.nio.charset.Charset charset2 = outputSettings0.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings3 = outputSettings0.clone();
        org.jsoup.nodes.Document.OutputSettings outputSettings4 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode5 = outputSettings4.escapeMode();
        java.nio.charset.Charset charset6 = outputSettings4.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings7 = outputSettings4.clone();
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode9 = outputSettings8.escapeMode();
        int int10 = outputSettings8.indentAmount();
        org.jsoup.nodes.Entities.EscapeMode escapeMode11 = outputSettings8.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings12 = outputSettings4.escapeMode(escapeMode11);
        org.jsoup.nodes.Document.OutputSettings outputSettings13 = outputSettings0.escapeMode(escapeMode11);
        org.jsoup.nodes.Document.OutputSettings outputSettings15 = outputSettings13.indentAmount((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document.OutputSettings outputSettings17 = outputSettings13.charset("");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: ");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + escapeMode1 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode1.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset2);
        org.junit.Assert.assertNotNull(outputSettings3);
        org.junit.Assert.assertTrue("'" + escapeMode5 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode5.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset6);
        org.junit.Assert.assertNotNull(outputSettings7);
        org.junit.Assert.assertTrue("'" + escapeMode9 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode9.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + escapeMode11 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode11.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings12);
        org.junit.Assert.assertNotNull(outputSettings13);
        org.junit.Assert.assertNotNull(outputSettings15);
    }

    @Test
    public void test0197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0197");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.nodes.Element element3 = document1.append("");
        org.jsoup.nodes.Element element5 = document1.html("<#root></#root>");
        org.jsoup.nodes.Document document6 = document1.ownerDocument();
        org.jsoup.select.Elements elements8 = document6.getElementsByIndexLessThan(0);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element10 = document6.after("&lt;#root&gt;\n<!--#root-->&lt;#root&gt;\n<!--#root-->");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(document6);
        org.junit.Assert.assertNotNull(elements8);
    }

    @Test
    public void test0198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0198");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element19 = document1.wrap("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(dataNodeList12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(strSet16);
        org.junit.Assert.assertNotNull(element17);
    }

    @Test
    public void test0199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0199");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = document1.textNodes();
        org.jsoup.nodes.Document document4 = new org.jsoup.nodes.Document("");
        boolean boolean5 = document4.isBlock();
        java.util.List<org.jsoup.nodes.DataNode> dataNodeList6 = document4.dataNodes();
        java.lang.String str8 = document4.attr("");
        org.jsoup.nodes.Document.QuirksMode quirksMode9 = org.jsoup.nodes.Document.QuirksMode.noQuirks;
        org.jsoup.nodes.Document document10 = document4.quirksMode(quirksMode9);
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = document4.outputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings12 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings13 = outputSettings12.clone();
        org.jsoup.nodes.Document.OutputSettings outputSettings14 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode15 = outputSettings14.escapeMode();
        java.nio.charset.Charset charset16 = outputSettings14.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings17 = outputSettings13.charset(charset16);
        org.jsoup.nodes.Document.OutputSettings outputSettings18 = outputSettings11.charset(charset16);
        org.jsoup.nodes.Document.OutputSettings outputSettings19 = outputSettings18.clone();
        org.jsoup.nodes.Entities.EscapeMode escapeMode20 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings21 = outputSettings18.escapeMode(escapeMode20);
        org.jsoup.nodes.Document document22 = document1.outputSettings(outputSettings21);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document23 = document1.clone();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(dataNodeList6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + quirksMode9 + "' != '" + org.jsoup.nodes.Document.QuirksMode.noQuirks + "'", quirksMode9.equals(org.jsoup.nodes.Document.QuirksMode.noQuirks));
        org.junit.Assert.assertNotNull(document10);
        org.junit.Assert.assertNotNull(outputSettings11);
        org.junit.Assert.assertNotNull(outputSettings13);
        org.junit.Assert.assertTrue("'" + escapeMode15 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode15.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset16);
        org.junit.Assert.assertNotNull(outputSettings17);
        org.junit.Assert.assertNotNull(outputSettings18);
        org.junit.Assert.assertNotNull(outputSettings19);
        org.junit.Assert.assertNotNull(outputSettings21);
        org.junit.Assert.assertNotNull(document22);
    }

    @Test
    public void test0200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0200");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean2 = document1.isBlock();
        org.jsoup.nodes.Element element4 = document1.html("hi!");
        org.jsoup.nodes.Element element6 = element4.getElementById("<hi!></hi!>");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = element6.ownText();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNull(element6);
    }

    @Test
    public void test0201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0201");
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
        org.jsoup.nodes.Document.OutputSettings outputSettings14 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings15 = outputSettings14.clone();
        org.jsoup.nodes.Document.OutputSettings outputSettings16 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode17 = outputSettings16.escapeMode();
        int int18 = outputSettings16.indentAmount();
        org.jsoup.nodes.Entities.EscapeMode escapeMode19 = outputSettings16.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings20 = outputSettings15.escapeMode(escapeMode19);
        org.jsoup.nodes.Document.OutputSettings outputSettings21 = outputSettings12.escapeMode(escapeMode19);
        org.jsoup.nodes.Document.OutputSettings outputSettings22 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings23 = outputSettings22.clone();
        org.jsoup.nodes.Document.OutputSettings outputSettings24 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode25 = outputSettings24.escapeMode();
        java.nio.charset.Charset charset26 = outputSettings24.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings27 = outputSettings23.charset(charset26);
        org.jsoup.nodes.Document.OutputSettings outputSettings28 = outputSettings27.clone();
        org.jsoup.nodes.Document.OutputSettings outputSettings29 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode30 = outputSettings29.escapeMode();
        java.nio.charset.Charset charset31 = outputSettings29.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings32 = outputSettings29.clone();
        org.jsoup.nodes.Document.OutputSettings outputSettings33 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode34 = outputSettings33.escapeMode();
        int int35 = outputSettings33.indentAmount();
        org.jsoup.nodes.Entities.EscapeMode escapeMode36 = outputSettings33.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings37 = outputSettings29.escapeMode(escapeMode36);
        org.jsoup.nodes.Document.OutputSettings outputSettings38 = outputSettings28.escapeMode(escapeMode36);
        org.jsoup.nodes.Document.OutputSettings outputSettings39 = outputSettings21.escapeMode(escapeMode36);
        org.jsoup.nodes.Document.OutputSettings outputSettings41 = outputSettings21.indentAmount(0);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document.OutputSettings outputSettings43 = outputSettings41.charset("");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: ");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(document7);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(outputSettings10);
        org.junit.Assert.assertTrue("'" + escapeMode11 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode11.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings12);
        org.junit.Assert.assertNotNull(document13);
        org.junit.Assert.assertNotNull(outputSettings15);
        org.junit.Assert.assertTrue("'" + escapeMode17 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode17.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + escapeMode19 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode19.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings20);
        org.junit.Assert.assertNotNull(outputSettings21);
        org.junit.Assert.assertNotNull(outputSettings23);
        org.junit.Assert.assertTrue("'" + escapeMode25 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode25.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset26);
        org.junit.Assert.assertNotNull(outputSettings27);
        org.junit.Assert.assertNotNull(outputSettings28);
        org.junit.Assert.assertTrue("'" + escapeMode30 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode30.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset31);
        org.junit.Assert.assertNotNull(outputSettings32);
        org.junit.Assert.assertTrue("'" + escapeMode34 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode34.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 1 + "'", int35 == 1);
        org.junit.Assert.assertTrue("'" + escapeMode36 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode36.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings37);
        org.junit.Assert.assertNotNull(outputSettings38);
        org.junit.Assert.assertNotNull(outputSettings39);
        org.junit.Assert.assertNotNull(outputSettings41);
    }

    @Test
    public void test0202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0202");
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
        org.jsoup.nodes.Document.OutputSettings outputSettings14 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings15 = outputSettings14.clone();
        org.jsoup.nodes.Document.OutputSettings outputSettings16 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode17 = outputSettings16.escapeMode();
        int int18 = outputSettings16.indentAmount();
        org.jsoup.nodes.Entities.EscapeMode escapeMode19 = outputSettings16.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings20 = outputSettings15.escapeMode(escapeMode19);
        org.jsoup.nodes.Document.OutputSettings outputSettings21 = outputSettings12.escapeMode(escapeMode19);
        org.jsoup.nodes.Document.OutputSettings outputSettings22 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings23 = outputSettings22.clone();
        org.jsoup.nodes.Document.OutputSettings outputSettings24 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode25 = outputSettings24.escapeMode();
        java.nio.charset.Charset charset26 = outputSettings24.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings27 = outputSettings23.charset(charset26);
        org.jsoup.nodes.Document.OutputSettings outputSettings28 = outputSettings27.clone();
        org.jsoup.nodes.Document.OutputSettings outputSettings29 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode30 = outputSettings29.escapeMode();
        java.nio.charset.Charset charset31 = outputSettings29.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings32 = outputSettings29.clone();
        org.jsoup.nodes.Document.OutputSettings outputSettings33 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode34 = outputSettings33.escapeMode();
        int int35 = outputSettings33.indentAmount();
        org.jsoup.nodes.Entities.EscapeMode escapeMode36 = outputSettings33.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings37 = outputSettings29.escapeMode(escapeMode36);
        org.jsoup.nodes.Document.OutputSettings outputSettings38 = outputSettings28.escapeMode(escapeMode36);
        org.jsoup.nodes.Document.OutputSettings outputSettings39 = outputSettings21.escapeMode(escapeMode36);
        org.jsoup.nodes.Document.OutputSettings outputSettings41 = outputSettings21.indentAmount(0);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document.OutputSettings outputSettings43 = outputSettings21.charset("#root");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: #root");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(document7);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(outputSettings10);
        org.junit.Assert.assertTrue("'" + escapeMode11 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode11.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings12);
        org.junit.Assert.assertNotNull(document13);
        org.junit.Assert.assertNotNull(outputSettings15);
        org.junit.Assert.assertTrue("'" + escapeMode17 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode17.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + escapeMode19 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode19.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings20);
        org.junit.Assert.assertNotNull(outputSettings21);
        org.junit.Assert.assertNotNull(outputSettings23);
        org.junit.Assert.assertTrue("'" + escapeMode25 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode25.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset26);
        org.junit.Assert.assertNotNull(outputSettings27);
        org.junit.Assert.assertNotNull(outputSettings28);
        org.junit.Assert.assertTrue("'" + escapeMode30 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode30.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset31);
        org.junit.Assert.assertNotNull(outputSettings32);
        org.junit.Assert.assertTrue("'" + escapeMode34 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode34.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 1 + "'", int35 == 1);
        org.junit.Assert.assertTrue("'" + escapeMode36 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode36.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings37);
        org.junit.Assert.assertNotNull(outputSettings38);
        org.junit.Assert.assertNotNull(outputSettings39);
        org.junit.Assert.assertNotNull(outputSettings41);
    }

    @Test
    public void test0203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0203");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Element element3 = document1.removeClass("<#root></#root>");
        java.util.regex.Pattern pattern5 = null;
        org.jsoup.select.Elements elements6 = element3.getElementsByAttributeValueMatching("#document", pattern5);
        java.lang.Class<?> wildcardClass7 = elements6.getClass();
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0204");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.nodes.Element element3 = document1.append("");
        org.jsoup.nodes.Element element5 = element3.html("hi!");
        java.lang.String str6 = element5.val();
        org.jsoup.nodes.Element element7 = element5.previousElementSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element8 = element7.empty();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(element7);
    }

    @Test
    public void test0205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0205");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.nodes.Element element3 = document1.append("");
        org.jsoup.nodes.Element element5 = document1.toggleClass("");
        boolean boolean7 = element5.hasClass("");
        org.jsoup.nodes.Element element9 = element5.prependElement("<#root></#root>");
        org.jsoup.nodes.Node node10 = element9.previousSibling();
        org.jsoup.select.Elements elements12 = element9.getElementsByTag("hi!");
        org.jsoup.select.Elements elements14 = element9.getElementsContainingOwnText("hi!");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertNotNull(elements14);
    }

    @Test
    public void test0206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0206");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element49 = element7.wrap("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(elements14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(document17);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNotNull(elements21);
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertNotNull(textNodeList26);
        org.junit.Assert.assertNotNull(elements27);
        org.junit.Assert.assertNotNull(elements32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(element35);
        org.junit.Assert.assertNotNull(element36);
        org.junit.Assert.assertNotNull(node38);
        org.junit.Assert.assertTrue("'" + escapeMode40 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode40.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset41);
        org.junit.Assert.assertNotNull(document42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNull(element44);
        org.junit.Assert.assertNotNull(element46);
        org.junit.Assert.assertNotNull(element47);
    }

    @Test
    public void test0207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0207");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements4 = document1.getElementsByAttributeValueMatching("hi!", "hi!");
        boolean boolean5 = document1.hasText();
        org.jsoup.nodes.Document document7 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element8 = document1.prependChild((org.jsoup.nodes.Node) document7);
        org.jsoup.nodes.Document document10 = new org.jsoup.nodes.Document("");
        boolean boolean11 = document10.isBlock();
        java.util.List<org.jsoup.nodes.DataNode> dataNodeList12 = document10.dataNodes();
        java.lang.String str14 = document10.attr("");
        org.jsoup.nodes.Document.QuirksMode quirksMode15 = org.jsoup.nodes.Document.QuirksMode.noQuirks;
        org.jsoup.nodes.Document document16 = document10.quirksMode(quirksMode15);
        org.jsoup.nodes.Document.OutputSettings outputSettings17 = document10.outputSettings();
        org.jsoup.nodes.Element element18 = document10.parent();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element19 = document1.prependChild((org.jsoup.nodes.Node) element18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(document7);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(dataNodeList12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + quirksMode15 + "' != '" + org.jsoup.nodes.Document.QuirksMode.noQuirks + "'", quirksMode15.equals(org.jsoup.nodes.Document.QuirksMode.noQuirks));
        org.junit.Assert.assertNotNull(document16);
        org.junit.Assert.assertNotNull(outputSettings17);
        org.junit.Assert.assertNull(element18);
    }

    @Test
    public void test0208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0208");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements4 = document1.getElementsByAttributeValueMatching("hi!", "hi!");
        boolean boolean5 = document1.hasText();
        org.jsoup.select.Elements elements8 = document1.getElementsByAttributeValueContaining("hi!", "hi!");
        org.jsoup.nodes.Element element10 = document1.append("<#root>\n <html>\n  <head></head>\n  <body></body>\n </html>\n</#root>");
        java.lang.Integer int11 = document1.elementSiblingIndex();
        org.jsoup.nodes.Document document12 = document1.clone();
        java.lang.String str13 = document1.nodeName();
        org.jsoup.nodes.Element element14 = document1.previousElementSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element16 = element14.toggleClass("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(document12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "#document" + "'", str13, "#document");
        org.junit.Assert.assertNull(element14);
    }

    @Test
    public void test0209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0209");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.nodes.Element element3 = document1.append("");
        org.jsoup.nodes.Element element5 = document1.toggleClass("");
        boolean boolean7 = element5.hasClass("");
        org.jsoup.nodes.Element element9 = element5.prependElement("<#root></#root>");
        org.jsoup.nodes.Node node10 = element9.previousSibling();
        org.jsoup.select.Elements elements12 = element9.getElementsByTag("hi!");
        java.lang.Integer int13 = element9.elementSiblingIndex();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test0210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0210");
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
        java.util.regex.Pattern pattern31 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements32 = element30.getElementsMatchingOwnText(pattern31);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(dataNodeList3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(dataNodeList13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + quirksMode16 + "' != '" + org.jsoup.nodes.Document.QuirksMode.noQuirks + "'", quirksMode16.equals(org.jsoup.nodes.Document.QuirksMode.noQuirks));
        org.junit.Assert.assertNotNull(document17);
        org.junit.Assert.assertNotNull(document18);
        org.junit.Assert.assertNotNull(elements23);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertArrayEquals(strArray25, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(element28);
        org.junit.Assert.assertNotNull(element29);
        org.junit.Assert.assertNotNull(element30);
    }

    @Test
    public void test0211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0211");
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
        org.jsoup.nodes.Document document14 = document13.clone();
        java.lang.Class<?> wildcardClass15 = document13.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(dataNodeList3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + quirksMode6 + "' != '" + org.jsoup.nodes.Document.QuirksMode.noQuirks + "'", quirksMode6.equals(org.jsoup.nodes.Document.QuirksMode.noQuirks));
        org.junit.Assert.assertNotNull(document7);
        org.junit.Assert.assertNotNull(document8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(outputSettings11);
        org.junit.Assert.assertTrue("'" + escapeMode12 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode12.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(document13);
        org.junit.Assert.assertNotNull(document14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0212");
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
        org.jsoup.nodes.Document document17 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements20 = document17.getElementsByAttributeValueMatching("hi!", "hi!");
        org.jsoup.nodes.Element element21 = document17.head();
        org.jsoup.nodes.Document.OutputSettings outputSettings22 = document17.outputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings23 = outputSettings22.clone();
        org.jsoup.nodes.Document document25 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements28 = document25.getElementsByAttributeValueMatching("hi!", "hi!");
        boolean boolean29 = document25.hasText();
        org.jsoup.nodes.Document document31 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element32 = document25.prependChild((org.jsoup.nodes.Node) document31);
        org.jsoup.nodes.Document.OutputSettings outputSettings33 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings34 = outputSettings33.clone();
        org.jsoup.nodes.Entities.EscapeMode escapeMode35 = outputSettings34.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings36 = outputSettings34.clone();
        org.jsoup.nodes.Document document37 = document25.outputSettings(outputSettings36);
        org.jsoup.nodes.Document.OutputSettings outputSettings38 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings39 = outputSettings38.clone();
        org.jsoup.nodes.Document.OutputSettings outputSettings40 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode41 = outputSettings40.escapeMode();
        int int42 = outputSettings40.indentAmount();
        org.jsoup.nodes.Entities.EscapeMode escapeMode43 = outputSettings40.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings44 = outputSettings39.escapeMode(escapeMode43);
        org.jsoup.nodes.Document.OutputSettings outputSettings45 = outputSettings36.escapeMode(escapeMode43);
        java.nio.charset.CharsetEncoder charsetEncoder46 = outputSettings36.encoder();
        org.jsoup.nodes.Entities.EscapeMode escapeMode47 = outputSettings36.escapeMode();
        java.nio.charset.Charset charset48 = outputSettings36.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings49 = outputSettings23.charset(charset48);
        org.jsoup.nodes.Document document50 = document13.outputSettings(outputSettings23);
        org.jsoup.nodes.Document.OutputSettings outputSettings52 = outputSettings23.prettyPrint(true);
        org.jsoup.nodes.Document.OutputSettings outputSettings54 = outputSettings52.prettyPrint(true);
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(document7);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(outputSettings10);
        org.junit.Assert.assertTrue("'" + escapeMode11 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode11.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings12);
        org.junit.Assert.assertNotNull(document13);
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertNotNull(elements20);
        org.junit.Assert.assertNull(element21);
        org.junit.Assert.assertNotNull(outputSettings22);
        org.junit.Assert.assertNotNull(outputSettings23);
        org.junit.Assert.assertNotNull(elements28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(document31);
        org.junit.Assert.assertNotNull(element32);
        org.junit.Assert.assertNotNull(outputSettings34);
        org.junit.Assert.assertTrue("'" + escapeMode35 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode35.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings36);
        org.junit.Assert.assertNotNull(document37);
        org.junit.Assert.assertNotNull(outputSettings39);
        org.junit.Assert.assertTrue("'" + escapeMode41 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode41.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 1 + "'", int42 == 1);
        org.junit.Assert.assertTrue("'" + escapeMode43 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode43.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings44);
        org.junit.Assert.assertNotNull(outputSettings45);
        org.junit.Assert.assertNotNull(charsetEncoder46);
        org.junit.Assert.assertTrue("'" + escapeMode47 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode47.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset48);
        org.junit.Assert.assertNotNull(outputSettings49);
        org.junit.Assert.assertNotNull(document50);
        org.junit.Assert.assertNotNull(outputSettings52);
        org.junit.Assert.assertNotNull(outputSettings54);
    }

    @Test
    public void test0213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0213");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = document1.textNodes();
        java.util.List<org.jsoup.nodes.TextNode> textNodeList3 = document1.textNodes();
        org.jsoup.nodes.Document.OutputSettings outputSettings4 = document1.outputSettings();
        org.jsoup.nodes.Document document5 = document1.clone();
        org.jsoup.nodes.Document.OutputSettings outputSettings6 = document1.outputSettings();
        java.lang.Integer int7 = document1.elementSiblingIndex();
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertNotNull(textNodeList3);
        org.junit.Assert.assertNotNull(outputSettings4);
        org.junit.Assert.assertNotNull(document5);
        org.junit.Assert.assertNotNull(outputSettings6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0214");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements4 = document1.getElementsByAttributeValueMatching("hi!", "hi!");
        org.jsoup.nodes.Document document5 = document1.clone();
        org.jsoup.nodes.Document document6 = document5.normalise();
        org.jsoup.nodes.Element element7 = document6.parent();
        org.jsoup.nodes.Document document9 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements12 = document9.getElementsByAttributeValueMatching("hi!", "hi!");
        java.lang.String[] strArray14 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet15 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet15, strArray14);
        org.jsoup.nodes.Element element17 = document9.classNames((java.util.Set<java.lang.String>) strSet15);
        org.jsoup.nodes.Document document18 = document9.clone();
        org.jsoup.nodes.Document document19 = document18.normalise();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element20 = document6.after((org.jsoup.nodes.Node) document19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNotNull(document5);
        org.junit.Assert.assertNotNull(document6);
        org.junit.Assert.assertNull(element7);
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(document18);
        org.junit.Assert.assertNotNull(document19);
    }

    @Test
    public void test0215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0215");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean2 = document1.isBlock();
        java.util.List<org.jsoup.nodes.DataNode> dataNodeList3 = document1.dataNodes();
        java.lang.String str5 = document1.attr("");
        org.jsoup.nodes.Document.QuirksMode quirksMode6 = org.jsoup.nodes.Document.QuirksMode.noQuirks;
        org.jsoup.nodes.Document document7 = document1.quirksMode(quirksMode6);
        org.jsoup.nodes.Document document8 = document1.ownerDocument();
        org.jsoup.select.Elements elements10 = document8.getElementsByIndexLessThan((int) ' ');
        java.util.regex.Pattern pattern11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements12 = document8.getElementsMatchingText(pattern11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(dataNodeList3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + quirksMode6 + "' != '" + org.jsoup.nodes.Document.QuirksMode.noQuirks + "'", quirksMode6.equals(org.jsoup.nodes.Document.QuirksMode.noQuirks));
        org.junit.Assert.assertNotNull(document7);
        org.junit.Assert.assertNotNull(document8);
        org.junit.Assert.assertNotNull(elements10);
    }

    @Test
    public void test0216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0216");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements4 = document1.getElementsByAttributeValueMatching("hi!", "hi!");
        org.jsoup.nodes.Document document5 = document1.clone();
        org.jsoup.nodes.Document.QuirksMode quirksMode6 = null;
        org.jsoup.nodes.Document document7 = document1.quirksMode(quirksMode6);
        java.lang.Class<?> wildcardClass8 = document1.getClass();
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNotNull(document5);
        org.junit.Assert.assertNotNull(document7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0217");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements4 = document1.getElementsByAttributeValueMatching("hi!", "hi!");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet7 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet7, strArray6);
        org.jsoup.nodes.Element element9 = document1.classNames((java.util.Set<java.lang.String>) strSet7);
        org.jsoup.nodes.Element element11 = document1.getElementById("hi!");
        org.jsoup.nodes.Element element14 = document1.attr("<#root>\n <html>\n  <head></head>\n  <body></body>\n </html>\n</#root>", "<#root>\n <html>\n  <head></head>\n  <body></body>\n </html>\n</#root>");
        java.lang.String str15 = document1.baseUri();
        java.lang.String str16 = document1.val();
        org.jsoup.select.Elements elements18 = document1.getElementsByAttribute("<#root></#root>\n<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.nodes.Document document19 = document1.ownerDocument();
        document1.setBaseUri("<#root></#root>\n<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNull(element11);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(elements18);
        org.junit.Assert.assertNotNull(document19);
    }

    @Test
    public void test0218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0218");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = document1.textNodes();
        org.jsoup.nodes.Element element4 = document1.prependElement("hi!");
        java.lang.String str5 = element4.baseUri();
        org.jsoup.nodes.Element element7 = element4.toggleClass("hi!");
        org.jsoup.nodes.Element element9 = element7.prependText("");
        boolean boolean11 = element9.hasAttr("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements13 = element9.getElementsByClass("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0219");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements4 = document1.getElementsByAttributeValueMatching("hi!", "hi!");
        org.jsoup.nodes.Document document5 = document1.clone();
        org.jsoup.nodes.Node node7 = document1.removeAttr("hi!");
        java.lang.String str8 = document1.ownText();
        org.jsoup.nodes.Element element9 = document1.nextElementSibling();
        org.jsoup.nodes.Document document10 = document1.normalise();
        org.jsoup.nodes.Document document12 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements15 = document12.getElementsByAttributeValueMatching("hi!", "hi!");
        boolean boolean16 = document12.hasText();
        org.jsoup.select.Elements elements19 = document12.getElementsByAttributeValueContaining("hi!", "hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap20 = document12.dataset();
        org.jsoup.select.Elements elements23 = document12.getElementsByAttributeValueEnding("<hi!></hi!>", "#document");
        org.jsoup.nodes.Document.QuirksMode quirksMode24 = org.jsoup.nodes.Document.QuirksMode.noQuirks;
        org.jsoup.nodes.Document document25 = document12.quirksMode(quirksMode24);
        java.lang.String str26 = document25.html();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element27 = document10.before((org.jsoup.nodes.Node) document25);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNotNull(document5);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(element9);
        org.junit.Assert.assertNotNull(document10);
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(elements19);
        org.junit.Assert.assertNotNull(strMap20);
        org.junit.Assert.assertNotNull(elements23);
        org.junit.Assert.assertTrue("'" + quirksMode24 + "' != '" + org.jsoup.nodes.Document.QuirksMode.noQuirks + "'", quirksMode24.equals(org.jsoup.nodes.Document.QuirksMode.noQuirks));
        org.junit.Assert.assertNotNull(document25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
    }

    @Test
    public void test0220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0220");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean2 = document1.isBlock();
        org.jsoup.nodes.Element element4 = document1.toggleClass("hi!");
        org.jsoup.nodes.Document document6 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element7 = document1.appendChild((org.jsoup.nodes.Node) document6);
        org.jsoup.nodes.Element element9 = element7.removeClass("<hi!></hi!>");
        java.util.Map<java.lang.String, java.lang.String> strMap10 = element7.dataset();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(strMap10);
    }

    @Test
    public void test0221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0221");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean2 = document1.isBlock();
        org.jsoup.nodes.Element element4 = document1.html("hi!");
        org.jsoup.select.Elements elements6 = element4.getElementsByIndexEquals((int) (byte) -1);
        org.jsoup.select.Elements elements8 = element4.getElementsByAttributeStarting("hi!");
        boolean boolean10 = element4.hasAttr("#document");
        org.jsoup.select.Elements elements12 = element4.getElementsMatchingText("<#root>\n <html>\n  <head></head>\n  <body></body>\n </html>\n</#root>");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(elements12);
    }

    @Test
    public void test0222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0222");
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
        org.jsoup.nodes.Element element20 = element12.addClass("hi!");
        org.jsoup.nodes.Attributes attributes21 = element20.attributes();
        java.lang.Class<?> wildcardClass22 = attributes21.getClass();
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertNull(element14);
        org.junit.Assert.assertNotNull(elements16);
        org.junit.Assert.assertNotNull(elements18);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertNotNull(attributes21);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0223");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements4 = document1.getElementsByAttributeValueMatching("hi!", "hi!");
        org.jsoup.nodes.Document document5 = document1.clone();
        org.jsoup.nodes.Document document6 = document5.normalise();
        java.lang.String str7 = document5.data();
        org.jsoup.nodes.Document document9 = org.jsoup.nodes.Document.createShell("hi!");
        boolean boolean10 = document5.equals((java.lang.Object) "hi!");
        org.jsoup.nodes.Document.QuirksMode quirksMode11 = org.jsoup.nodes.Document.QuirksMode.limitedQuirks;
        org.jsoup.nodes.Document document12 = document5.quirksMode(quirksMode11);
        org.jsoup.select.Elements elements13 = document5.parents();
        org.jsoup.nodes.Document document15 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements18 = document15.getElementsByAttributeValueMatching("hi!", "hi!");
        org.jsoup.nodes.Document document19 = document15.clone();
        org.jsoup.nodes.Node node21 = document15.removeAttr("hi!");
        java.lang.String str22 = document15.ownText();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element23 = document5.before((org.jsoup.nodes.Node) document15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNotNull(document5);
        org.junit.Assert.assertNotNull(document6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(document9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + quirksMode11 + "' != '" + org.jsoup.nodes.Document.QuirksMode.limitedQuirks + "'", quirksMode11.equals(org.jsoup.nodes.Document.QuirksMode.limitedQuirks));
        org.junit.Assert.assertNotNull(document12);
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertNotNull(elements18);
        org.junit.Assert.assertNotNull(document19);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test0224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0224");
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
        org.jsoup.select.NodeVisitor nodeVisitor19 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node20 = element17.traverse(nodeVisitor19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNotNull(document5);
        org.junit.Assert.assertNotNull(document6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertNotNull(textNodeList13);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test0225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0225");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements22 = document19.getElementsByAttributeValueContaining("", "<hi!>\n #root\n</hi!>");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "<#root></#root>" + "'", str13, "<#root></#root>");
        org.junit.Assert.assertNotNull(document14);
        org.junit.Assert.assertNotNull(outputSettings16);
        org.junit.Assert.assertNotNull(outputSettings18);
        org.junit.Assert.assertNotNull(document19);
    }

    @Test
    public void test0226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0226");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements4 = document1.getElementsByAttributeValueMatching("hi!", "hi!");
        boolean boolean5 = document1.hasText();
        org.jsoup.nodes.Document document7 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element8 = document1.prependChild((org.jsoup.nodes.Node) document7);
        org.jsoup.nodes.Element element10 = document1.append("<#root>\n <html>\n  <head></head>\n  <body></body>\n </html>\n</#root>");
        org.jsoup.nodes.Element element13 = element10.attr("<#root>\n <html>\n  <head></head>\n  <body></body>\n </html>\n</#root>", "hi!");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList14 = element13.textNodes();
        org.jsoup.select.Elements elements17 = element13.getElementsByAttributeValueMatching("#root", "<#root>");
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(document7);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(textNodeList14);
        org.junit.Assert.assertNotNull(elements17);
    }

    @Test
    public void test0227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0227");
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
        // The following exception was thrown during execution in test generation
        try {
            element20.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "<#root></#root>" + "'", str13, "<#root></#root>");
        org.junit.Assert.assertNotNull(document14);
        org.junit.Assert.assertNotNull(textNodeList17);
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertNotNull(element20);
    }

    @Test
    public void test0228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0228");
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
        org.jsoup.nodes.Document document22 = new org.jsoup.nodes.Document("");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList23 = document22.textNodes();
        org.jsoup.nodes.Element element25 = document22.prependElement("hi!");
        java.lang.String str26 = document22.val();
        org.jsoup.nodes.Element element29 = document22.attr("<hi!></hi!>", "<#root></#root>\n<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.nodes.Element element30 = document1.prependChild((org.jsoup.nodes.Node) element29);
        org.jsoup.nodes.Document.OutputSettings outputSettings31 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings32 = outputSettings31.clone();
        org.jsoup.nodes.Document.OutputSettings outputSettings33 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode34 = outputSettings33.escapeMode();
        java.nio.charset.Charset charset35 = outputSettings33.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings36 = outputSettings32.charset(charset35);
        org.jsoup.nodes.Document.OutputSettings outputSettings37 = outputSettings36.clone();
        org.jsoup.nodes.Document.OutputSettings outputSettings38 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode39 = outputSettings38.escapeMode();
        java.nio.charset.Charset charset40 = outputSettings38.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings41 = outputSettings38.clone();
        org.jsoup.nodes.Document.OutputSettings outputSettings42 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode43 = outputSettings42.escapeMode();
        int int44 = outputSettings42.indentAmount();
        org.jsoup.nodes.Entities.EscapeMode escapeMode45 = outputSettings42.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings46 = outputSettings38.escapeMode(escapeMode45);
        org.jsoup.nodes.Document.OutputSettings outputSettings47 = outputSettings37.escapeMode(escapeMode45);
        org.jsoup.nodes.Document document48 = document1.outputSettings(outputSettings37);
        java.lang.String str50 = document48.absUrl("<#root>");
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(document7);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "<#root>\n <html>\n  <head></head>\n  <body></body>\n </html>\n</#root>" + "'", str20, "<#root>\n <html>\n  <head></head>\n  <body></body>\n </html>\n</#root>");
        org.junit.Assert.assertNotNull(textNodeList23);
        org.junit.Assert.assertNotNull(element25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(element29);
        org.junit.Assert.assertNotNull(element30);
        org.junit.Assert.assertNotNull(outputSettings32);
        org.junit.Assert.assertTrue("'" + escapeMode34 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode34.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset35);
        org.junit.Assert.assertNotNull(outputSettings36);
        org.junit.Assert.assertNotNull(outputSettings37);
        org.junit.Assert.assertTrue("'" + escapeMode39 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode39.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset40);
        org.junit.Assert.assertNotNull(outputSettings41);
        org.junit.Assert.assertTrue("'" + escapeMode43 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode43.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 1 + "'", int44 == 1);
        org.junit.Assert.assertTrue("'" + escapeMode45 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode45.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings46);
        org.junit.Assert.assertNotNull(outputSettings47);
        org.junit.Assert.assertNotNull(document48);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
    }

    @Test
    public void test0229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0229");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements4 = document1.getElementsByAttributeValueMatching("hi!", "hi!");
        boolean boolean5 = document1.hasText();
        org.jsoup.select.Elements elements8 = document1.getElementsByAttributeValueContaining("hi!", "hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap9 = document1.dataset();
        java.lang.String str10 = document1.outerHtml();
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test0230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0230");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.nodes.Element element3 = document1.append("");
        org.jsoup.nodes.Element element5 = document1.toggleClass("");
        org.jsoup.nodes.Element element6 = document1.previousElementSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element7 = element6.empty();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNull(element6);
    }

    @Test
    public void test0231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0231");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements4 = document1.getElementsByAttributeValueMatching("hi!", "hi!");
        boolean boolean5 = document1.hasText();
        org.jsoup.nodes.Element element7 = document1.append("");
        org.jsoup.select.Elements elements8 = document1.siblingElements();
        org.jsoup.nodes.Document document9 = document1.clone();
        org.jsoup.select.Elements elements11 = document1.getElementsMatchingText("hi!");
        org.jsoup.nodes.Element element13 = document1.tagName("<#root>");
        org.jsoup.nodes.Element element14 = document1.head();
        boolean boolean16 = document1.hasClass("<hi!>\n #root\n</hi!>");
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(document9);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNull(element14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0232");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements4 = document1.getElementsByAttributeValueMatching("hi!", "hi!");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet7 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet7, strArray6);
        org.jsoup.nodes.Element element9 = document1.classNames((java.util.Set<java.lang.String>) strSet7);
        org.jsoup.nodes.Element element11 = document1.getElementById("hi!");
        org.jsoup.nodes.Element element14 = document1.attr("<#root>\n <html>\n  <head></head>\n  <body></body>\n </html>\n</#root>", "<#root>\n <html>\n  <head></head>\n  <body></body>\n </html>\n</#root>");
        org.jsoup.select.Elements elements16 = document1.getElementsContainingOwnText("<hi!></hi!>");
        org.jsoup.nodes.Element element17 = document1.nextElementSibling();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = element17.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNull(element11);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(elements16);
        org.junit.Assert.assertNull(element17);
    }

    @Test
    public void test0233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0233");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = document1.textNodes();
        org.jsoup.nodes.Element element4 = document1.prependElement("hi!");
        java.lang.String str5 = element4.baseUri();
        org.jsoup.nodes.Element element7 = element4.toggleClass("hi!");
        org.jsoup.nodes.Element element9 = element7.prependText("");
        java.lang.Integer int10 = element9.elementSiblingIndex();
        boolean boolean12 = element9.hasAttr("");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node14 = element9.childNode((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 35 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0234");
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
        org.jsoup.select.Elements elements17 = document5.getElementsByAttributeValueMatching("<hi!></hi!>", "<#root>\n <html>\n  <head></head>\n  <body></body>\n </html>\n</#root>");
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNotNull(document5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(dataNodeList9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + quirksMode12 + "' != '" + org.jsoup.nodes.Document.QuirksMode.noQuirks + "'", quirksMode12.equals(org.jsoup.nodes.Document.QuirksMode.noQuirks));
        org.junit.Assert.assertNotNull(document13);
        org.junit.Assert.assertNotNull(document14);
        org.junit.Assert.assertNotNull(elements17);
    }

    @Test
    public void test0235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0235");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = document1.textNodes();
        java.util.List<org.jsoup.nodes.TextNode> textNodeList3 = document1.textNodes();
        org.jsoup.nodes.Document.OutputSettings outputSettings4 = document1.outputSettings();
        org.jsoup.nodes.Element element6 = document1.append("<#root>\n <html>\n  <head></head>\n  <body></body>\n </html>\n</#root>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements9 = element6.getElementsByAttributeValueEnding("#document", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertNotNull(textNodeList3);
        org.junit.Assert.assertNotNull(outputSettings4);
        org.junit.Assert.assertNotNull(element6);
    }

    @Test
    public void test0236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0236");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements4 = document1.getElementsByAttributeValueMatching("hi!", "hi!");
        org.jsoup.nodes.Document document5 = document1.clone();
        org.jsoup.nodes.Document.QuirksMode quirksMode6 = null;
        org.jsoup.nodes.Document document7 = document1.quirksMode(quirksMode6);
        org.jsoup.nodes.Element element9 = document7.getElementById("<#root></#root>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements11 = document7.select("<#root></#root>");
            org.junit.Assert.fail("Expected exception of type org.jsoup.select.Selector.SelectorParseException; message: Could not parse query '<#root></#root>': unexpected token at '<#root></#root>'");
        } catch (org.jsoup.select.Selector.SelectorParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNotNull(document5);
        org.junit.Assert.assertNotNull(document7);
        org.junit.Assert.assertNull(element9);
    }

    @Test
    public void test0237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0237");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = document1.textNodes();
        org.jsoup.select.Elements elements3 = document1.getAllElements();
        org.jsoup.nodes.Document document5 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements8 = document5.getElementsByAttributeValueMatching("hi!", "hi!");
        boolean boolean9 = document5.hasText();
        org.jsoup.nodes.Element element11 = document5.append("");
        org.jsoup.nodes.Element element12 = document1.appendChild((org.jsoup.nodes.Node) document5);
        org.jsoup.select.Elements elements13 = element12.parents();
        org.jsoup.select.Elements elements15 = element12.getElementsByAttributeStarting("<#root class=\"hi!\"></#root>\n<#root></#root>");
        org.jsoup.nodes.Node node16 = element12.previousSibling();
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertNull(node16);
    }

    @Test
    public void test0238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0238");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements4 = document1.getElementsByAttributeValueMatching("hi!", "hi!");
        boolean boolean5 = document1.hasText();
        org.jsoup.select.Elements elements8 = document1.getElementsByAttributeValueContaining("hi!", "hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap9 = document1.dataset();
        org.jsoup.select.Elements elements12 = document1.getElementsByAttributeValueEnding("<hi!></hi!>", "#document");
        org.jsoup.nodes.Element element14 = document1.createElement("#document");
        org.jsoup.select.Elements elements16 = element14.getElementsByIndexEquals((int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element18 = element14.child((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(elements16);
    }

    @Test
    public void test0239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0239");
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
        java.util.Map<java.lang.String, java.lang.String> strMap14 = document1.dataset();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(dataNodeList3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + quirksMode6 + "' != '" + org.jsoup.nodes.Document.QuirksMode.noQuirks + "'", quirksMode6.equals(org.jsoup.nodes.Document.QuirksMode.noQuirks));
        org.junit.Assert.assertNotNull(document7);
        org.junit.Assert.assertNotNull(document8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(outputSettings11);
        org.junit.Assert.assertTrue("'" + escapeMode12 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode12.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(document13);
        org.junit.Assert.assertNotNull(strMap14);
    }

    @Test
    public void test0240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0240");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = document1.textNodes();
        java.util.List<org.jsoup.nodes.TextNode> textNodeList3 = document1.textNodes();
        org.jsoup.nodes.Document document4 = document1.clone();
        org.jsoup.nodes.Document document6 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.nodes.Element element8 = document6.append("");
        org.jsoup.nodes.Element element10 = element8.html("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap11 = element10.dataset();
        org.jsoup.nodes.Element element13 = element10.prependElement("#document");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element14 = document1.after((org.jsoup.nodes.Node) element10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertNotNull(textNodeList3);
        org.junit.Assert.assertNotNull(document4);
        org.junit.Assert.assertNotNull(document6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertNotNull(element13);
    }

    @Test
    public void test0241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0241");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.nodes.Element element3 = document1.append("");
        org.jsoup.nodes.Element element5 = document1.html("<#root></#root>");
        org.jsoup.select.Elements elements8 = document1.getElementsByAttributeValueStarting("<#root></#root>", "<#root></#root>");
        org.jsoup.nodes.Element element10 = document1.append("<#root></#root>");
        org.jsoup.parser.Tag tag11 = document1.tag();
        document1.setBaseUri("");
        org.jsoup.nodes.Element element14 = document1.head();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(tag11);
        org.junit.Assert.assertNull(element14);
    }

    @Test
    public void test0242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0242");
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
        org.jsoup.nodes.Node node21 = document19.nextSibling();
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertNotNull(outputSettings12);
        org.junit.Assert.assertTrue("'" + escapeMode14 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode14.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset15);
        org.junit.Assert.assertNotNull(outputSettings16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(document18);
        org.junit.Assert.assertNotNull(document19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNull(node21);
    }

    @Test
    public void test0243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0243");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean2 = document1.isBlock();
        org.jsoup.nodes.Element element4 = document1.toggleClass("hi!");
        org.jsoup.nodes.Attributes attributes5 = element4.attributes();
        org.jsoup.nodes.Element element7 = element4.appendElement("<hi!></hi!>");
        java.lang.String[] strArray13 = new java.lang.String[] { "", "<#root>\n <html>\n  <head></head>\n  <body></body>\n </html>\n</#root>", "<#root></#root>", "<#root></#root>", "#document" };
        java.util.LinkedHashSet<java.lang.String> strSet14 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet14, strArray13);
        org.jsoup.nodes.Element element16 = element7.classNames((java.util.Set<java.lang.String>) strSet14);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node18 = element16.childNode((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 97 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(attributes5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[] { "", "<#root>\n <html>\n  <head></head>\n  <body></body>\n </html>\n</#root>", "<#root></#root>", "<#root></#root>", "#document" });
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(element16);
    }

    @Test
    public void test0244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0244");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = document1.textNodes();
        java.util.Set<java.lang.String> strSet3 = document1.classNames();
        java.lang.String str4 = document1.title();
        org.jsoup.nodes.Element element6 = document1.prependText("#document");
        org.jsoup.nodes.Document.OutputSettings outputSettings7 = document1.outputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = outputSettings7.clone();
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(outputSettings7);
        org.junit.Assert.assertNotNull(outputSettings8);
    }

    @Test
    public void test0245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0245");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.nodes.Element element3 = document1.append("");
        org.jsoup.nodes.Element element5 = document1.html("<#root></#root>");
        org.jsoup.select.Elements elements8 = document1.getElementsByAttributeValueStarting("<#root></#root>", "<#root></#root>");
        java.lang.String str9 = document1.data();
        org.jsoup.nodes.Node node10 = document1.previousSibling();
        java.lang.String str11 = document1.nodeName();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "#document" + "'", str11, "#document");
    }

    @Test
    public void test0246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0246");
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
        boolean boolean21 = document1.hasAttr("#root");
        java.util.regex.Pattern pattern22 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements23 = document1.getElementsMatchingText(pattern22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "<#root></#root>" + "'", str13, "<#root></#root>");
        org.junit.Assert.assertNotNull(document14);
        org.junit.Assert.assertNotNull(outputSettings16);
        org.junit.Assert.assertNotNull(outputSettings18);
        org.junit.Assert.assertNotNull(document19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test0247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0247");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = document1.textNodes();
        org.jsoup.nodes.Element element4 = document1.prependElement("hi!");
        org.jsoup.nodes.Document.OutputSettings outputSettings5 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings6 = outputSettings5.clone();
        org.jsoup.nodes.Document.OutputSettings outputSettings7 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode8 = outputSettings7.escapeMode();
        java.nio.charset.Charset charset9 = outputSettings7.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = outputSettings6.charset(charset9);
        java.lang.Class<?> wildcardClass11 = outputSettings10.getClass();
        boolean boolean12 = element4.equals((java.lang.Object) outputSettings10);
        org.jsoup.nodes.Element element14 = element4.prependText("#root");
        org.jsoup.nodes.Document document16 = new org.jsoup.nodes.Document("");
        boolean boolean17 = document16.isBlock();
        org.jsoup.nodes.Element element19 = document16.html("hi!");
        element14.replaceWith((org.jsoup.nodes.Node) element19);
        org.jsoup.select.Elements elements21 = element14.parents();
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(outputSettings6);
        org.junit.Assert.assertTrue("'" + escapeMode8 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode8.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset9);
        org.junit.Assert.assertNotNull(outputSettings10);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertNotNull(elements21);
    }

    @Test
    public void test0248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0248");
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
        org.jsoup.select.Elements elements21 = document1.getElementsByIndexLessThan((int) (byte) 10);
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "<#root></#root>" + "'", str13, "<#root></#root>");
        org.junit.Assert.assertNotNull(document14);
        org.junit.Assert.assertNotNull(outputSettings16);
        org.junit.Assert.assertNotNull(outputSettings18);
        org.junit.Assert.assertNotNull(document19);
        org.junit.Assert.assertNotNull(elements21);
    }

    @Test
    public void test0249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0249");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements4 = document1.getElementsByAttributeValueMatching("hi!", "hi!");
        org.jsoup.nodes.Document document5 = document1.clone();
        org.jsoup.nodes.Document.QuirksMode quirksMode6 = null;
        org.jsoup.nodes.Document document7 = document1.quirksMode(quirksMode6);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element8 = document1.lastElementSibling();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNotNull(document5);
        org.junit.Assert.assertNotNull(document7);
    }

    @Test
    public void test0250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0250");
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
        org.jsoup.nodes.Element element17 = document14.appendText("<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.select.NodeVisitor nodeVisitor18 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node19 = element17.traverse(nodeVisitor18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertNotNull(document14);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(element17);
    }

    @Test
    public void test0251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0251");
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
        java.lang.String str16 = document13.nodeName();
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(document7);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(outputSettings10);
        org.junit.Assert.assertTrue("'" + escapeMode11 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode11.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings12);
        org.junit.Assert.assertNotNull(document13);
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "#document" + "'", str16, "#document");
    }

    @Test
    public void test0252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0252");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = document1.textNodes();
        org.jsoup.select.Elements elements3 = document1.getAllElements();
        org.jsoup.nodes.Document document5 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements8 = document5.getElementsByAttributeValueMatching("hi!", "hi!");
        boolean boolean9 = document5.hasText();
        org.jsoup.nodes.Element element11 = document5.append("");
        org.jsoup.nodes.Element element12 = document1.appendChild((org.jsoup.nodes.Node) document5);
        java.util.List<org.jsoup.nodes.Node> nodeList13 = element12.siblingNodes();
        java.lang.String str14 = element12.id();
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(nodeList13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test0253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0253");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean2 = document1.isBlock();
        org.jsoup.select.Elements elements4 = document1.getElementsByIndexLessThan(0);
        java.util.regex.Pattern pattern5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements6 = document1.getElementsMatchingText(pattern5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(elements4);
    }

    @Test
    public void test0254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0254");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements4 = document1.getElementsByAttributeValueMatching("hi!", "hi!");
        boolean boolean5 = document1.hasText();
        org.jsoup.select.Elements elements8 = document1.getElementsByAttributeValueContaining("hi!", "hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap9 = document1.dataset();
        org.jsoup.select.Elements elements12 = document1.getElementsByAttributeValueEnding("<hi!></hi!>", "#document");
        org.jsoup.select.Elements elements14 = document1.select("#document");
        java.util.Map<java.lang.String, java.lang.String> strMap15 = document1.dataset();
        org.jsoup.nodes.Document document17 = new org.jsoup.nodes.Document("");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList18 = document17.textNodes();
        org.jsoup.select.Elements elements19 = document17.getAllElements();
        org.jsoup.nodes.Document document21 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements24 = document21.getElementsByAttributeValueMatching("hi!", "hi!");
        boolean boolean25 = document21.hasText();
        org.jsoup.nodes.Element element27 = document21.append("");
        org.jsoup.nodes.Element element28 = document17.appendChild((org.jsoup.nodes.Node) document21);
        org.jsoup.select.Elements elements29 = element28.parents();
        org.jsoup.nodes.Document document31 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements34 = document31.getElementsByAttributeValueMatching("hi!", "hi!");
        java.lang.String[] strArray36 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet37 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet37, strArray36);
        org.jsoup.nodes.Element element39 = document31.classNames((java.util.Set<java.lang.String>) strSet37);
        org.jsoup.nodes.Document document40 = document31.clone();
        java.lang.String str41 = document31.outerHtml();
        java.lang.String str43 = document31.attr("");
        org.jsoup.select.Elements elements44 = document31.getAllElements();
        org.jsoup.nodes.Element element45 = element28.prependChild((org.jsoup.nodes.Node) document31);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element46 = document1.after((org.jsoup.nodes.Node) document31);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertNotNull(elements14);
        org.junit.Assert.assertNotNull(strMap15);
        org.junit.Assert.assertNotNull(textNodeList18);
        org.junit.Assert.assertNotNull(elements19);
        org.junit.Assert.assertNotNull(elements24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(element27);
        org.junit.Assert.assertNotNull(element28);
        org.junit.Assert.assertNotNull(elements29);
        org.junit.Assert.assertNotNull(elements34);
        org.junit.Assert.assertNotNull(strArray36);
        org.junit.Assert.assertArrayEquals(strArray36, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(element39);
        org.junit.Assert.assertNotNull(document40);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertNotNull(elements44);
        org.junit.Assert.assertNotNull(element45);
    }

    @Test
    public void test0255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0255");
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
        java.lang.String str19 = element18.html();
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(document7);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(document13);
        org.junit.Assert.assertNotNull(textNodeList14);
        org.junit.Assert.assertNotNull(outputSettings15);
        org.junit.Assert.assertNotNull(document16);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test0256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0256");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements4 = document1.getElementsByAttributeValueMatching("hi!", "hi!");
        org.jsoup.nodes.Document document5 = document1.clone();
        org.jsoup.nodes.Document document6 = document5.normalise();
        java.lang.String str7 = document5.data();
        org.jsoup.select.Elements elements10 = document5.getElementsByAttributeValueMatching("#document", "<#root></#root>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements12 = document5.select("hi!");
            org.junit.Assert.fail("Expected exception of type org.jsoup.select.Selector.SelectorParseException; message: Could not parse query 'hi!': unexpected token at '!'");
        } catch (org.jsoup.select.Selector.SelectorParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNotNull(document5);
        org.junit.Assert.assertNotNull(document6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(elements10);
    }

    @Test
    public void test0257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0257");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements4 = document1.getElementsByAttributeValueMatching("hi!", "hi!");
        org.jsoup.nodes.Document document5 = document1.clone();
        org.jsoup.nodes.Document document6 = document5.normalise();
        java.lang.String str7 = document5.data();
        org.jsoup.nodes.Document document9 = org.jsoup.nodes.Document.createShell("hi!");
        boolean boolean10 = document5.equals((java.lang.Object) "hi!");
        java.lang.String str11 = document5.nodeName();
        java.util.regex.Pattern pattern12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements13 = document5.getElementsMatchingText(pattern12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNotNull(document5);
        org.junit.Assert.assertNotNull(document6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(document9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "#document" + "'", str11, "#document");
    }

    @Test
    public void test0258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0258");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.nodes.Element element3 = document1.append("");
        org.jsoup.nodes.Element element5 = document1.toggleClass("");
        java.lang.String str6 = document1.nodeName();
        java.lang.String str7 = document1.id();
        org.jsoup.select.Elements elements10 = document1.getElementsByAttributeValue("<hi!>\n #root\n</hi!>", "#root");
        java.util.regex.Pattern pattern11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements12 = document1.getElementsMatchingText(pattern11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "#document" + "'", str6, "#document");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(elements10);
    }

    @Test
    public void test0259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0259");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = document1.textNodes();
        org.jsoup.nodes.Element element4 = document1.prependElement("hi!");
        java.lang.String str5 = element4.baseUri();
        org.jsoup.nodes.Element element7 = element4.toggleClass("hi!");
        org.jsoup.nodes.Element element9 = element7.prependText("");
        java.lang.Integer int10 = element9.elementSiblingIndex();
        org.jsoup.nodes.Element element12 = element9.prepend("<#root>\n <html>\n  <head></head>\n  <body></body>\n </html>\n</#root>");
        org.jsoup.nodes.Element element14 = element9.appendText("<#root>");
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(element14);
    }

    @Test
    public void test0260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0260");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.nodes.Element element3 = document1.append("");
        org.jsoup.nodes.Element element5 = document1.toggleClass("");
        org.jsoup.nodes.Node node6 = document1.nextSibling();
        java.lang.String str7 = document1.ownText();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node9 = document1.childNode(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0261");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = document1.textNodes();
        org.jsoup.select.Elements elements3 = document1.getAllElements();
        org.jsoup.nodes.Document document5 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements8 = document5.getElementsByAttributeValueMatching("hi!", "hi!");
        boolean boolean9 = document5.hasText();
        org.jsoup.nodes.Element element11 = document5.append("");
        org.jsoup.nodes.Element element12 = document1.appendChild((org.jsoup.nodes.Node) document5);
        org.jsoup.nodes.Element element13 = document5.head();
        java.lang.String str14 = document5.outerHtml();
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNull(element13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test0262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0262");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = document1.textNodes();
        org.jsoup.select.Elements elements3 = document1.getAllElements();
        org.jsoup.nodes.Element element5 = document1.html("<#root></#root>");
        org.jsoup.nodes.Element element6 = document1.empty();
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element6);
    }

    @Test
    public void test0263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0263");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements3 = document1.getElementsByAttributeStarting("<#root></#root>");
        org.junit.Assert.assertNotNull(elements3);
    }

    @Test
    public void test0264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0264");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements4 = document1.getElementsByAttributeValueMatching("hi!", "hi!");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet7 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet7, strArray6);
        org.jsoup.nodes.Element element9 = document1.classNames((java.util.Set<java.lang.String>) strSet7);
        org.jsoup.nodes.Document document10 = document1.clone();
        java.lang.String str11 = document1.ownText();
        org.jsoup.nodes.Document document12 = document1.normalise();
        org.jsoup.nodes.Document document14 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements17 = document14.getElementsByAttributeValueMatching("hi!", "hi!");
        boolean boolean18 = document14.hasText();
        org.jsoup.nodes.Element element20 = document14.appendElement("<#root>\n <html>\n  <head></head>\n  <body></body>\n </html>\n</#root>");
        org.jsoup.select.Elements elements23 = document14.getElementsByAttributeValueNot("&lt;#root&gt;\n<!--#root-->&lt;#root&gt;\n<!--#root-->", "<#root></#root>\n<html>\n <head></head>\n <body></body>\n</html>");
        // The following exception was thrown during execution in test generation
        try {
            document12.replaceWith((org.jsoup.nodes.Node) document14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(document10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(document12);
        org.junit.Assert.assertNotNull(elements17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertNotNull(elements23);
    }

    @Test
    public void test0265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0265");
        org.jsoup.nodes.Document.OutputSettings outputSettings0 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode1 = outputSettings0.escapeMode();
        java.nio.charset.Charset charset2 = outputSettings0.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings3 = outputSettings0.clone();
        int int4 = outputSettings0.indentAmount();
        java.nio.charset.CharsetEncoder charsetEncoder5 = outputSettings0.encoder();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document.OutputSettings outputSettings7 = outputSettings0.charset("<#root class=\"hi!\"></#root>\n<#root></#root>");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: <#root class=\"hi!\"></#root>?<#root></#root>");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + escapeMode1 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode1.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset2);
        org.junit.Assert.assertNotNull(outputSettings3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(charsetEncoder5);
    }

    @Test
    public void test0266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0266");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements4 = document1.getElementsByAttributeValueMatching("hi!", "hi!");
        org.jsoup.nodes.Document document5 = document1.clone();
        java.lang.String str6 = document1.tagName();
        org.jsoup.nodes.Element element8 = document1.addClass("<#root></#root>");
        // The following exception was thrown during execution in test generation
        try {
            element8.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNotNull(document5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "#root" + "'", str6, "#root");
        org.junit.Assert.assertNotNull(element8);
    }

    @Test
    public void test0267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0267");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements4 = document1.getElementsByAttributeValueMatching("hi!", "hi!");
        boolean boolean5 = document1.hasText();
        org.jsoup.nodes.Element element7 = document1.append("");
        org.jsoup.select.NodeVisitor nodeVisitor8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node9 = element7.traverse(nodeVisitor8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(element7);
    }

    @Test
    public void test0268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0268");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = document1.textNodes();
        org.jsoup.nodes.Element element4 = document1.prependElement("hi!");
        org.jsoup.nodes.Document.OutputSettings outputSettings5 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings6 = outputSettings5.clone();
        org.jsoup.nodes.Document.OutputSettings outputSettings7 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode8 = outputSettings7.escapeMode();
        java.nio.charset.Charset charset9 = outputSettings7.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = outputSettings6.charset(charset9);
        java.lang.Class<?> wildcardClass11 = outputSettings10.getClass();
        boolean boolean12 = element4.equals((java.lang.Object) outputSettings10);
        org.jsoup.nodes.Element element14 = element4.prependText("#root");
        org.jsoup.nodes.Element element16 = element14.removeClass("&lt;#root&gt;\n<!--#root-->&lt;#root&gt;\n<!--#root-->");
        org.jsoup.select.Elements elements17 = element16.children();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element19 = element16.child((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(outputSettings6);
        org.junit.Assert.assertTrue("'" + escapeMode8 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode8.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset9);
        org.junit.Assert.assertNotNull(outputSettings10);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(elements17);
    }

    @Test
    public void test0269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0269");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements4 = document1.getElementsByAttributeValueMatching("hi!", "hi!");
        boolean boolean5 = document1.hasText();
        org.jsoup.select.Elements elements8 = document1.getElementsByAttributeValueContaining("hi!", "hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap9 = document1.dataset();
        org.jsoup.select.Elements elements12 = document1.getElementsByAttributeValueEnding("<hi!></hi!>", "#document");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element14 = document1.child((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 35 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertNotNull(elements12);
    }

    @Test
    public void test0270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0270");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = document1.textNodes();
        org.jsoup.nodes.Element element4 = document1.prependElement("hi!");
        org.jsoup.nodes.Document.OutputSettings outputSettings5 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings6 = outputSettings5.clone();
        org.jsoup.nodes.Document.OutputSettings outputSettings7 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode8 = outputSettings7.escapeMode();
        java.nio.charset.Charset charset9 = outputSettings7.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = outputSettings6.charset(charset9);
        java.lang.Class<?> wildcardClass11 = outputSettings10.getClass();
        boolean boolean12 = element4.equals((java.lang.Object) outputSettings10);
        org.jsoup.nodes.Element element14 = element4.prependText("#root");
        org.jsoup.nodes.Element element16 = element14.prepend("#root");
        org.jsoup.select.Elements elements19 = element16.getElementsByAttributeValueEnding("<#root>\n <html>\n  <head></head>\n  <body></body>\n </html>\n</#root>", " hi!");
        org.jsoup.select.Elements elements20 = element16.children();
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(outputSettings6);
        org.junit.Assert.assertTrue("'" + escapeMode8 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode8.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset9);
        org.junit.Assert.assertNotNull(outputSettings10);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(elements19);
        org.junit.Assert.assertNotNull(elements20);
    }

    @Test
    public void test0271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0271");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements26 = element23.getElementsByAttributeValue("", "<#root></#root>\n<html>\n <head></head>\n <body></body>\n</html>");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "<#root></#root>" + "'", str13, "<#root></#root>");
        org.junit.Assert.assertNotNull(document14);
        org.junit.Assert.assertNotNull(textNodeList17);
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(element23);
    }

    @Test
    public void test0272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0272");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = document1.textNodes();
        org.jsoup.select.Elements elements3 = document1.getAllElements();
        org.jsoup.nodes.Document document5 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements8 = document5.getElementsByAttributeValueMatching("hi!", "hi!");
        boolean boolean9 = document5.hasText();
        org.jsoup.nodes.Element element11 = document5.append("");
        org.jsoup.nodes.Element element12 = document1.appendChild((org.jsoup.nodes.Node) document5);
        org.jsoup.nodes.Node node14 = document1.removeAttr("hi!");
        org.jsoup.nodes.Element element15 = document1.nextElementSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element17 = element15.wrap("<html>\n <head></head>\n <body></body>\n</html>");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNull(element15);
    }

    @Test
    public void test0273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0273");
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
        org.jsoup.nodes.Document document16 = document14.clone();
        int int17 = document16.siblingIndex();
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNotNull(document5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(dataNodeList9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + quirksMode12 + "' != '" + org.jsoup.nodes.Document.QuirksMode.noQuirks + "'", quirksMode12.equals(org.jsoup.nodes.Document.QuirksMode.noQuirks));
        org.junit.Assert.assertNotNull(document13);
        org.junit.Assert.assertNotNull(document14);
        org.junit.Assert.assertNotNull(strSet15);
        org.junit.Assert.assertNotNull(document16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test0274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0274");
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
        org.jsoup.select.Elements elements23 = document14.getElementsByAttributeStarting("<hi!></hi!>");
        org.jsoup.nodes.Document document24 = document14.ownerDocument();
        java.lang.String str25 = document24.outerHtml();
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "<#root></#root>" + "'", str13, "<#root></#root>");
        org.junit.Assert.assertNotNull(document14);
        org.junit.Assert.assertNotNull(textNodeList17);
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(elements23);
        org.junit.Assert.assertNotNull(document24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "<hi!></hi!>\n<#root></#root>\n<html>\n <head></head>\n <body></body>\n</html>" + "'", str25, "<hi!></hi!>\n<#root></#root>\n<html>\n <head></head>\n <body></body>\n</html>");
    }

    @Test
    public void test0275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0275");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = document1.textNodes();
        org.jsoup.nodes.Element element4 = document1.prependElement("hi!");
        java.lang.String str5 = element4.baseUri();
        org.jsoup.nodes.Element element7 = element4.toggleClass("hi!");
        org.jsoup.select.Elements elements10 = element7.getElementsByAttributeValueStarting("hi!", "hi!");
        boolean boolean12 = element7.hasClass("<#root></#root>");
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0276");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements4 = document1.getElementsByAttributeValueMatching("hi!", "hi!");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet7 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet7, strArray6);
        org.jsoup.nodes.Element element9 = document1.classNames((java.util.Set<java.lang.String>) strSet7);
        org.jsoup.nodes.Document document10 = document1.clone();
        org.jsoup.nodes.Document document11 = document10.normalise();
        java.util.List<org.jsoup.nodes.Node> nodeList12 = document11.siblingNodes();
        org.jsoup.nodes.Node node13 = document11.nextSibling();
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(document10);
        org.junit.Assert.assertNotNull(document11);
        org.junit.Assert.assertNotNull(nodeList12);
        org.junit.Assert.assertNull(node13);
    }

    @Test
    public void test0277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0277");
        org.jsoup.nodes.Document.OutputSettings outputSettings0 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings1 = outputSettings0.clone();
        org.jsoup.nodes.Document.OutputSettings outputSettings2 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode3 = outputSettings2.escapeMode();
        int int4 = outputSettings2.indentAmount();
        org.jsoup.nodes.Entities.EscapeMode escapeMode5 = outputSettings2.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings6 = outputSettings1.escapeMode(escapeMode5);
        org.jsoup.nodes.Document document8 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements11 = document8.getElementsByAttributeValueMatching("hi!", "hi!");
        boolean boolean12 = document8.hasText();
        org.jsoup.nodes.Document document14 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element15 = document8.prependChild((org.jsoup.nodes.Node) document14);
        org.jsoup.nodes.Document.OutputSettings outputSettings16 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings17 = outputSettings16.clone();
        org.jsoup.nodes.Entities.EscapeMode escapeMode18 = outputSettings17.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings19 = outputSettings17.clone();
        org.jsoup.nodes.Document document20 = document8.outputSettings(outputSettings19);
        org.jsoup.nodes.Document.OutputSettings outputSettings21 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings22 = outputSettings21.clone();
        org.jsoup.nodes.Document.OutputSettings outputSettings23 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode24 = outputSettings23.escapeMode();
        int int25 = outputSettings23.indentAmount();
        org.jsoup.nodes.Entities.EscapeMode escapeMode26 = outputSettings23.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings27 = outputSettings22.escapeMode(escapeMode26);
        org.jsoup.nodes.Document.OutputSettings outputSettings28 = outputSettings19.escapeMode(escapeMode26);
        org.jsoup.nodes.Document.OutputSettings outputSettings29 = outputSettings6.escapeMode(escapeMode26);
        org.jsoup.nodes.Document.OutputSettings outputSettings31 = outputSettings6.prettyPrint(true);
        org.jsoup.nodes.Document.OutputSettings outputSettings32 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode33 = outputSettings32.escapeMode();
        java.nio.charset.Charset charset34 = outputSettings32.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings35 = outputSettings32.clone();
        org.jsoup.nodes.Document.OutputSettings outputSettings36 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode37 = outputSettings36.escapeMode();
        java.nio.charset.Charset charset38 = outputSettings36.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings39 = outputSettings36.clone();
        org.jsoup.nodes.Document.OutputSettings outputSettings40 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode41 = outputSettings40.escapeMode();
        int int42 = outputSettings40.indentAmount();
        org.jsoup.nodes.Entities.EscapeMode escapeMode43 = outputSettings40.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings44 = outputSettings36.escapeMode(escapeMode43);
        org.jsoup.nodes.Document.OutputSettings outputSettings45 = outputSettings32.escapeMode(escapeMode43);
        org.jsoup.nodes.Document.OutputSettings outputSettings46 = outputSettings6.escapeMode(escapeMode43);
        org.jsoup.nodes.Document.OutputSettings outputSettings47 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings48 = outputSettings47.clone();
        org.jsoup.nodes.Entities.EscapeMode escapeMode49 = outputSettings48.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings50 = outputSettings46.escapeMode(escapeMode49);
        org.jsoup.nodes.Entities.EscapeMode escapeMode51 = outputSettings46.escapeMode();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document.OutputSettings outputSettings53 = outputSettings46.charset("<#root><#root>");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: <#root><#root>");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(outputSettings1);
        org.junit.Assert.assertTrue("'" + escapeMode3 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode3.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + escapeMode5 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode5.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings6);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(document14);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(outputSettings17);
        org.junit.Assert.assertTrue("'" + escapeMode18 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode18.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings19);
        org.junit.Assert.assertNotNull(document20);
        org.junit.Assert.assertNotNull(outputSettings22);
        org.junit.Assert.assertTrue("'" + escapeMode24 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode24.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertTrue("'" + escapeMode26 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode26.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings27);
        org.junit.Assert.assertNotNull(outputSettings28);
        org.junit.Assert.assertNotNull(outputSettings29);
        org.junit.Assert.assertNotNull(outputSettings31);
        org.junit.Assert.assertTrue("'" + escapeMode33 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode33.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset34);
        org.junit.Assert.assertNotNull(outputSettings35);
        org.junit.Assert.assertTrue("'" + escapeMode37 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode37.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset38);
        org.junit.Assert.assertNotNull(outputSettings39);
        org.junit.Assert.assertTrue("'" + escapeMode41 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode41.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 1 + "'", int42 == 1);
        org.junit.Assert.assertTrue("'" + escapeMode43 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode43.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings44);
        org.junit.Assert.assertNotNull(outputSettings45);
        org.junit.Assert.assertNotNull(outputSettings46);
        org.junit.Assert.assertNotNull(outputSettings48);
        org.junit.Assert.assertTrue("'" + escapeMode49 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode49.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings50);
        org.junit.Assert.assertTrue("'" + escapeMode51 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode51.equals(org.jsoup.nodes.Entities.EscapeMode.base));
    }

    @Test
    public void test0278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0278");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements4 = document1.getElementsByAttributeValueMatching("hi!", "hi!");
        boolean boolean5 = document1.hasText();
        org.jsoup.nodes.Document document7 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element8 = document1.prependChild((org.jsoup.nodes.Node) document7);
        org.jsoup.nodes.Element element9 = document7.previousElementSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element11 = element9.val("<<#root>\n <html>\n  <head></head>\n  <body></body>\n </html>\n</#root>></<#root>\n <html>\n  <head></head>\n  <body></body>\n </html>\n</#root>>");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(document7);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNull(element9);
    }

    @Test
    public void test0279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0279");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements4 = document1.getElementsByAttributeValueMatching("hi!", "hi!");
        boolean boolean5 = document1.hasText();
        org.jsoup.nodes.Element element7 = document1.appendElement("<#root>\n <html>\n  <head></head>\n  <body></body>\n </html>\n</#root>");
        org.jsoup.select.Elements elements10 = document1.getElementsByAttributeValueNot("&lt;#root&gt;\n<!--#root-->&lt;#root&gt;\n<!--#root-->", "<#root></#root>\n<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.nodes.Node node11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element12 = document1.prependChild(node11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(elements10);
    }

    @Test
    public void test0280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0280");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.nodes.Element element3 = document1.append("");
        org.jsoup.nodes.Element element5 = document1.toggleClass("");
        org.jsoup.nodes.Node node6 = document1.nextSibling();
        org.jsoup.nodes.Element element8 = document1.prependElement("<#root>\n <html>\n  <head></head>\n  <body></body>\n </html>\n</#root>");
        org.jsoup.select.Elements elements10 = element8.getElementsByClass("&lt;#root&gt;\n<!--#root-->&lt;#root&gt;\n<!--#root-->");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(elements10);
    }

    @Test
    public void test0281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0281");
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
        java.util.List<org.jsoup.nodes.TextNode> textNodeList19 = document1.textNodes();
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(document7);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertNull(element16);
        org.junit.Assert.assertNotNull(outputSettings17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(textNodeList19);
    }

    @Test
    public void test0282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0282");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean2 = document1.isBlock();
        java.util.List<org.jsoup.nodes.DataNode> dataNodeList3 = document1.dataNodes();
        java.lang.String str5 = document1.attr("");
        org.jsoup.nodes.Document.QuirksMode quirksMode6 = org.jsoup.nodes.Document.QuirksMode.noQuirks;
        org.jsoup.nodes.Document document7 = document1.quirksMode(quirksMode6);
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = document1.outputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = outputSettings9.clone();
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode12 = outputSettings11.escapeMode();
        java.nio.charset.Charset charset13 = outputSettings11.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings14 = outputSettings10.charset(charset13);
        org.jsoup.nodes.Document.OutputSettings outputSettings15 = outputSettings8.charset(charset13);
        java.nio.charset.CharsetEncoder charsetEncoder16 = outputSettings8.encoder();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document.OutputSettings outputSettings18 = outputSettings8.indentAmount((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must be true");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(dataNodeList3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + quirksMode6 + "' != '" + org.jsoup.nodes.Document.QuirksMode.noQuirks + "'", quirksMode6.equals(org.jsoup.nodes.Document.QuirksMode.noQuirks));
        org.junit.Assert.assertNotNull(document7);
        org.junit.Assert.assertNotNull(outputSettings8);
        org.junit.Assert.assertNotNull(outputSettings10);
        org.junit.Assert.assertTrue("'" + escapeMode12 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode12.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset13);
        org.junit.Assert.assertNotNull(outputSettings14);
        org.junit.Assert.assertNotNull(outputSettings15);
        org.junit.Assert.assertNotNull(charsetEncoder16);
    }

    @Test
    public void test0283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0283");
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
        org.jsoup.select.Elements elements68 = document64.getElementsByAttributeValueContaining("hi!#document", "<hi!></hi!>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node69 = document64.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(document12);
        org.junit.Assert.assertNotNull(elements17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(document20);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertNotNull(outputSettings23);
        org.junit.Assert.assertTrue("'" + escapeMode24 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode24.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings25);
        org.junit.Assert.assertNotNull(document26);
        org.junit.Assert.assertNotNull(elements28);
        org.junit.Assert.assertNotNull(elements33);
        org.junit.Assert.assertNull(element34);
        org.junit.Assert.assertNotNull(outputSettings35);
        org.junit.Assert.assertNotNull(outputSettings36);
        org.junit.Assert.assertNotNull(elements41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(document44);
        org.junit.Assert.assertNotNull(element45);
        org.junit.Assert.assertNotNull(outputSettings47);
        org.junit.Assert.assertTrue("'" + escapeMode48 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode48.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings49);
        org.junit.Assert.assertNotNull(document50);
        org.junit.Assert.assertNotNull(outputSettings52);
        org.junit.Assert.assertTrue("'" + escapeMode54 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode54.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 1 + "'", int55 == 1);
        org.junit.Assert.assertTrue("'" + escapeMode56 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode56.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings57);
        org.junit.Assert.assertNotNull(outputSettings58);
        org.junit.Assert.assertNotNull(charsetEncoder59);
        org.junit.Assert.assertTrue("'" + escapeMode60 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode60.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset61);
        org.junit.Assert.assertNotNull(outputSettings62);
        org.junit.Assert.assertNotNull(document63);
        org.junit.Assert.assertNotNull(document64);
        org.junit.Assert.assertNotNull(nodeList65);
        org.junit.Assert.assertNotNull(elements68);
    }

    @Test
    public void test0284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0284");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.nodes.Element element3 = document1.append("");
        org.jsoup.nodes.Element element5 = element3.html("hi!");
        java.lang.String str6 = element5.val();
        java.lang.String str7 = element5.baseUri();
        org.jsoup.select.Elements elements8 = element5.parents();
        org.jsoup.select.Elements elements11 = element5.getElementsByAttributeValueContaining("<#root>", "<#root>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element13 = element5.after("<<#root>\n <html>\n  <head></head>\n  <body></body>\n </html>\n</#root>></<#root>\n <html>\n  <head></head>\n  <body></body>\n </html>\n</#root>>");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(elements11);
    }

    @Test
    public void test0285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0285");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.nodes.Element element3 = document1.append("");
        org.jsoup.nodes.Element element5 = element3.html("hi!");
        java.lang.String str6 = element3.toString();
        java.lang.String str7 = element3.baseUri();
        org.jsoup.select.Elements elements10 = element3.getElementsByAttributeValue("#root", "<#root></#root>");
        boolean boolean11 = element3.hasText();
        org.jsoup.select.Elements elements14 = element3.getElementsByAttributeValueMatching("<hi!></hi!>", "<<#root>\n <html>\n  <head></head>\n  <body></body>\n </html>\n</#root>></<#root>\n <html>\n  <head></head>\n  <body></body>\n </html>\n</#root>>");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(elements14);
    }

    @Test
    public void test0286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0286");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = document1.textNodes();
        org.jsoup.nodes.Element element4 = document1.prependElement("hi!");
        java.lang.String str5 = document1.nodeName();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element7 = document1.child((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#document" + "'", str5, "#document");
    }

    @Test
    public void test0287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0287");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.nodes.Element element3 = document1.append("");
        org.jsoup.nodes.Element element5 = document1.html("<#root></#root>");
        org.jsoup.select.Elements elements8 = document1.getElementsByAttributeValueStarting("<#root></#root>", "<#root></#root>");
        org.jsoup.nodes.Element element10 = document1.append("<#root></#root>");
        org.jsoup.nodes.Document document12 = new org.jsoup.nodes.Document("");
        boolean boolean13 = document12.isBlock();
        java.util.List<org.jsoup.nodes.DataNode> dataNodeList14 = document12.dataNodes();
        java.lang.String str16 = document12.attr("");
        java.lang.String str17 = document12.text();
        java.util.Set<java.lang.String> strSet18 = document12.classNames();
        org.jsoup.nodes.Document.QuirksMode quirksMode19 = document12.quirksMode();
        org.jsoup.nodes.Document document20 = document1.quirksMode(quirksMode19);
        java.lang.String str21 = document20.baseUri();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(dataNodeList14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(strSet18);
        org.junit.Assert.assertTrue("'" + quirksMode19 + "' != '" + org.jsoup.nodes.Document.QuirksMode.noQuirks + "'", quirksMode19.equals(org.jsoup.nodes.Document.QuirksMode.noQuirks));
        org.junit.Assert.assertNotNull(document20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
    }

    @Test
    public void test0288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0288");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean2 = document1.isBlock();
        java.util.List<org.jsoup.nodes.DataNode> dataNodeList3 = document1.dataNodes();
        org.jsoup.nodes.Document document5 = new org.jsoup.nodes.Document("");
        boolean boolean6 = document5.isBlock();
        java.util.List<org.jsoup.nodes.DataNode> dataNodeList7 = document5.dataNodes();
        java.lang.String str9 = document5.attr("");
        org.jsoup.nodes.Element element10 = document1.appendChild((org.jsoup.nodes.Node) document5);
        java.util.List<org.jsoup.nodes.Node> nodeList11 = document5.childNodes();
        org.jsoup.select.Elements elements13 = document5.getElementsMatchingText("<#root></#root>\n<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(dataNodeList3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(dataNodeList7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(nodeList11);
        org.junit.Assert.assertNotNull(elements13);
    }

    @Test
    public void test0289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0289");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements4 = document1.getElementsByAttributeValueMatching("hi!", "hi!");
        boolean boolean5 = document1.hasText();
        org.jsoup.select.Elements elements8 = document1.getElementsByAttributeValueContaining("hi!", "hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap9 = document1.dataset();
        org.jsoup.select.Elements elements12 = document1.getElementsByAttributeValueEnding("<hi!></hi!>", "#document");
        java.lang.String str13 = document1.title();
        org.jsoup.nodes.Document document14 = document1.clone();
        java.lang.String str16 = document1.attr("<#root>");
        org.jsoup.nodes.Document document18 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements21 = document18.getElementsByAttributeValueMatching("hi!", "hi!");
        boolean boolean22 = document18.hasText();
        org.jsoup.nodes.Element element24 = document18.appendElement("<#root>\n <html>\n  <head></head>\n  <body></body>\n </html>\n</#root>");
        org.jsoup.nodes.Document document25 = document18.ownerDocument();
        // The following exception was thrown during execution in test generation
        try {
            document1.replaceWith((org.jsoup.nodes.Node) document18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(document14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(elements21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(element24);
        org.junit.Assert.assertNotNull(document25);
    }

    @Test
    public void test0290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0290");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean2 = document1.isBlock();
        java.util.List<org.jsoup.nodes.DataNode> dataNodeList3 = document1.dataNodes();
        java.lang.String str5 = document1.attr("");
        org.jsoup.nodes.Document.QuirksMode quirksMode6 = org.jsoup.nodes.Document.QuirksMode.noQuirks;
        org.jsoup.nodes.Document document7 = document1.quirksMode(quirksMode6);
        org.jsoup.nodes.Document document8 = document1.ownerDocument();
        java.lang.String str9 = document1.toString();
        java.lang.String str10 = document1.html();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(dataNodeList3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + quirksMode6 + "' != '" + org.jsoup.nodes.Document.QuirksMode.noQuirks + "'", quirksMode6.equals(org.jsoup.nodes.Document.QuirksMode.noQuirks));
        org.junit.Assert.assertNotNull(document7);
        org.junit.Assert.assertNotNull(document8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test0291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0291");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.nodes.Element element3 = document1.append("");
        org.jsoup.nodes.Element element5 = document1.toggleClass("");
        java.lang.String str6 = document1.nodeName();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element8 = document1.before("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "#document" + "'", str6, "#document");
    }

    @Test
    public void test0292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0292");
        org.jsoup.nodes.Document.OutputSettings outputSettings0 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings1 = outputSettings0.clone();
        org.jsoup.nodes.Document.OutputSettings outputSettings2 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode3 = outputSettings2.escapeMode();
        java.nio.charset.Charset charset4 = outputSettings2.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings5 = outputSettings1.charset(charset4);
        org.jsoup.nodes.Document.OutputSettings outputSettings6 = outputSettings5.clone();
        java.nio.charset.Charset charset7 = outputSettings6.charset();
        java.nio.charset.CharsetEncoder charsetEncoder8 = outputSettings6.encoder();
        java.nio.charset.CharsetEncoder charsetEncoder9 = outputSettings6.encoder();
        org.junit.Assert.assertNotNull(outputSettings1);
        org.junit.Assert.assertTrue("'" + escapeMode3 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode3.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset4);
        org.junit.Assert.assertNotNull(outputSettings5);
        org.junit.Assert.assertNotNull(outputSettings6);
        org.junit.Assert.assertNotNull(charset7);
        org.junit.Assert.assertNotNull(charsetEncoder8);
        org.junit.Assert.assertNotNull(charsetEncoder9);
    }

    @Test
    public void test0293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0293");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = document1.textNodes();
        org.jsoup.nodes.Element element4 = document1.prependElement("hi!");
        org.jsoup.nodes.Document.OutputSettings outputSettings5 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings6 = outputSettings5.clone();
        org.jsoup.nodes.Document.OutputSettings outputSettings7 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode8 = outputSettings7.escapeMode();
        java.nio.charset.Charset charset9 = outputSettings7.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = outputSettings6.charset(charset9);
        java.lang.Class<?> wildcardClass11 = outputSettings10.getClass();
        boolean boolean12 = element4.equals((java.lang.Object) outputSettings10);
        org.jsoup.nodes.Element element14 = element4.prependText("#root");
        org.jsoup.nodes.Element element16 = element14.removeClass("&lt;#root&gt;\n<!--#root-->&lt;#root&gt;\n<!--#root-->");
        org.jsoup.select.Elements elements17 = element16.children();
        java.lang.String str18 = element16.val();
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(outputSettings6);
        org.junit.Assert.assertTrue("'" + escapeMode8 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode8.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset9);
        org.junit.Assert.assertNotNull(outputSettings10);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(elements17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test0294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0294");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element25 = element23.child((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 3");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "<#root></#root>" + "'", str13, "<#root></#root>");
        org.junit.Assert.assertNotNull(document14);
        org.junit.Assert.assertNotNull(textNodeList17);
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(element23);
    }

    @Test
    public void test0295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0295");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements4 = document1.getElementsByAttributeValueMatching("hi!", "hi!");
        boolean boolean5 = document1.hasText();
        org.jsoup.nodes.Document document7 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element8 = document1.prependChild((org.jsoup.nodes.Node) document7);
        org.jsoup.select.Elements elements11 = document7.getElementsByAttributeValueStarting("<#root>\n <html>\n  <head></head>\n  <body></body>\n </html>\n</#root>", "<#root></#root>");
        org.jsoup.nodes.Element element13 = document7.getElementById("<hi!></hi!>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element14 = element13.lastElementSibling();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(document7);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNull(element13);
    }

    @Test
    public void test0296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0296");
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
        org.jsoup.nodes.Element element17 = document14.appendText("<html>\n <head></head>\n <body></body>\n</html>");
        java.util.regex.Pattern pattern18 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements19 = document14.getElementsMatchingText(pattern18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertNotNull(document14);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(element17);
    }

    @Test
    public void test0297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0297");
        org.jsoup.nodes.Document.OutputSettings outputSettings0 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode1 = outputSettings0.escapeMode();
        java.nio.charset.Charset charset2 = outputSettings0.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings3 = outputSettings0.clone();
        org.jsoup.nodes.Document.OutputSettings outputSettings4 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode5 = outputSettings4.escapeMode();
        java.nio.charset.Charset charset6 = outputSettings4.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings7 = outputSettings4.clone();
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode9 = outputSettings8.escapeMode();
        int int10 = outputSettings8.indentAmount();
        org.jsoup.nodes.Entities.EscapeMode escapeMode11 = outputSettings8.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings12 = outputSettings4.escapeMode(escapeMode11);
        org.jsoup.nodes.Document.OutputSettings outputSettings13 = outputSettings0.escapeMode(escapeMode11);
        org.jsoup.nodes.Document.OutputSettings outputSettings15 = outputSettings13.indentAmount((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document.OutputSettings outputSettings17 = outputSettings13.charset("<#root></#root>");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: <#root></#root>");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + escapeMode1 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode1.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset2);
        org.junit.Assert.assertNotNull(outputSettings3);
        org.junit.Assert.assertTrue("'" + escapeMode5 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode5.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset6);
        org.junit.Assert.assertNotNull(outputSettings7);
        org.junit.Assert.assertTrue("'" + escapeMode9 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode9.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + escapeMode11 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode11.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings12);
        org.junit.Assert.assertNotNull(outputSettings13);
        org.junit.Assert.assertNotNull(outputSettings15);
    }

    @Test
    public void test0298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0298");
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
        org.jsoup.nodes.Document document19 = document1.clone();
        org.jsoup.select.Elements elements21 = document19.getElementsByAttribute("#root");
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(document7);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(document16);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNotNull(document19);
        org.junit.Assert.assertNotNull(elements21);
    }

    @Test
    public void test0299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0299");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements4 = document1.getElementsByAttributeValueMatching("hi!", "hi!");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet7 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet7, strArray6);
        org.jsoup.nodes.Element element9 = document1.classNames((java.util.Set<java.lang.String>) strSet7);
        org.jsoup.nodes.Document document10 = document1.clone();
        org.jsoup.nodes.Document document11 = document10.normalise();
        java.lang.String str12 = document11.id();
        java.lang.String str13 = document11.data();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements16 = document11.getElementsByAttributeValueNot("<#root></#root>", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(document10);
        org.junit.Assert.assertNotNull(document11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test0300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0300");
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
        org.jsoup.nodes.Element element24 = element23.previousElementSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element25 = element24.previousElementSibling();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "<#root></#root>" + "'", str13, "<#root></#root>");
        org.junit.Assert.assertNotNull(document14);
        org.junit.Assert.assertNotNull(textNodeList17);
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertNull(element24);
    }

    @Test
    public void test0301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0301");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean2 = document1.isBlock();
        org.jsoup.nodes.Element element4 = document1.toggleClass("hi!");
        org.jsoup.nodes.Attributes attributes5 = element4.attributes();
        org.jsoup.nodes.Element element7 = element4.appendElement("<hi!></hi!>");
        org.jsoup.nodes.Element element9 = element4.tagName(" hi!");
        org.jsoup.select.Elements elements11 = element4.getElementsContainingText("<#root>");
        org.jsoup.nodes.Element element13 = element4.child(0);
        java.lang.String str14 = element13.ownText();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(attributes5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test0302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0302");
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
        org.jsoup.nodes.Element element17 = document14.addClass("");
        org.jsoup.select.Elements elements19 = element17.getElementsByAttribute("<hi!>\n #root\n</hi!>");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertNotNull(document14);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(elements19);
    }

    @Test
    public void test0303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0303");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements4 = document1.getElementsByAttributeValueMatching("hi!", "hi!");
        boolean boolean5 = document1.hasText();
        org.jsoup.nodes.Element element7 = document1.append("");
        org.jsoup.select.Elements elements8 = document1.siblingElements();
        org.jsoup.nodes.Document document9 = document1.clone();
        java.lang.String str10 = document9.outerHtml();
        org.jsoup.nodes.Document document12 = new org.jsoup.nodes.Document("");
        boolean boolean13 = document12.isBlock();
        java.util.List<org.jsoup.nodes.DataNode> dataNodeList14 = document12.dataNodes();
        java.lang.String str16 = document12.attr("");
        org.jsoup.nodes.Document.QuirksMode quirksMode17 = org.jsoup.nodes.Document.QuirksMode.noQuirks;
        org.jsoup.nodes.Document document18 = document12.quirksMode(quirksMode17);
        org.jsoup.nodes.Document.OutputSettings outputSettings19 = document12.outputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings20 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings21 = outputSettings20.clone();
        org.jsoup.nodes.Document.OutputSettings outputSettings22 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode23 = outputSettings22.escapeMode();
        java.nio.charset.Charset charset24 = outputSettings22.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings25 = outputSettings21.charset(charset24);
        org.jsoup.nodes.Document.OutputSettings outputSettings26 = outputSettings19.charset(charset24);
        org.jsoup.nodes.Document.OutputSettings outputSettings27 = outputSettings26.clone();
        org.jsoup.nodes.Entities.EscapeMode escapeMode28 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings29 = outputSettings26.escapeMode(escapeMode28);
        org.jsoup.nodes.Document document30 = document9.outputSettings(outputSettings26);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document.OutputSettings outputSettings31 = outputSettings26.clone();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(document9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(dataNodeList14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + quirksMode17 + "' != '" + org.jsoup.nodes.Document.QuirksMode.noQuirks + "'", quirksMode17.equals(org.jsoup.nodes.Document.QuirksMode.noQuirks));
        org.junit.Assert.assertNotNull(document18);
        org.junit.Assert.assertNotNull(outputSettings19);
        org.junit.Assert.assertNotNull(outputSettings21);
        org.junit.Assert.assertTrue("'" + escapeMode23 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode23.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset24);
        org.junit.Assert.assertNotNull(outputSettings25);
        org.junit.Assert.assertNotNull(outputSettings26);
        org.junit.Assert.assertNotNull(outputSettings27);
        org.junit.Assert.assertNotNull(outputSettings29);
        org.junit.Assert.assertNotNull(document30);
    }

    @Test
    public void test0304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0304");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = document1.textNodes();
        org.jsoup.nodes.Element element4 = document1.prependElement("hi!");
        org.jsoup.nodes.Document.OutputSettings outputSettings5 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings6 = outputSettings5.clone();
        org.jsoup.nodes.Document.OutputSettings outputSettings7 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode8 = outputSettings7.escapeMode();
        java.nio.charset.Charset charset9 = outputSettings7.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = outputSettings6.charset(charset9);
        java.lang.Class<?> wildcardClass11 = outputSettings10.getClass();
        boolean boolean12 = element4.equals((java.lang.Object) outputSettings10);
        org.jsoup.nodes.Element element14 = element4.prependText("#root");
        org.jsoup.nodes.Element element16 = element4.prependElement("<hi!></hi!>");
        org.jsoup.nodes.Element element18 = element4.wrap("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.jsoup.nodes.Node> nodeList19 = element18.siblingNodes();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(outputSettings6);
        org.junit.Assert.assertTrue("'" + escapeMode8 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode8.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset9);
        org.junit.Assert.assertNotNull(outputSettings10);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNull(element18);
    }

    @Test
    public void test0305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0305");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = document1.textNodes();
        org.jsoup.select.Elements elements3 = document1.getAllElements();
        java.util.regex.Pattern pattern4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements5 = document1.getElementsMatchingText(pattern4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertNotNull(elements3);
    }

    @Test
    public void test0306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0306");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.nodes.Element element3 = document1.append("");
        org.jsoup.nodes.Element element5 = document1.html("<#root></#root>");
        org.jsoup.select.Elements elements8 = document1.getElementsByAttributeValueStarting("<#root></#root>", "<#root></#root>");
        org.jsoup.nodes.Element element10 = document1.createElement("<hi!>\n #root\n</hi!>");
        // The following exception was thrown during execution in test generation
        try {
            document1.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(element10);
    }

    @Test
    public void test0307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0307");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean2 = document1.isBlock();
        org.jsoup.nodes.Element element4 = document1.toggleClass("hi!");
        org.jsoup.nodes.Document document6 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element7 = document1.appendChild((org.jsoup.nodes.Node) document6);
        org.jsoup.nodes.Document document9 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements12 = document9.getElementsByAttributeValueMatching("hi!", "hi!");
        boolean boolean13 = document9.hasText();
        org.jsoup.nodes.Document document15 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element16 = document9.prependChild((org.jsoup.nodes.Node) document15);
        org.jsoup.nodes.Document.OutputSettings outputSettings17 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings18 = outputSettings17.clone();
        org.jsoup.nodes.Entities.EscapeMode escapeMode19 = outputSettings18.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings20 = outputSettings18.clone();
        org.jsoup.nodes.Document document21 = document9.outputSettings(outputSettings20);
        org.jsoup.parser.Tag tag22 = document9.tag();
        org.jsoup.select.Elements elements25 = document9.getElementsByAttributeValue("hi!", "#root");
        org.jsoup.nodes.Element element26 = document9.head();
        org.jsoup.nodes.Document document27 = document9.clone();
        // The following exception was thrown during execution in test generation
        try {
            element7.replaceWith((org.jsoup.nodes.Node) document9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(document15);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(outputSettings18);
        org.junit.Assert.assertTrue("'" + escapeMode19 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode19.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings20);
        org.junit.Assert.assertNotNull(document21);
        org.junit.Assert.assertNotNull(tag22);
        org.junit.Assert.assertNotNull(elements25);
        org.junit.Assert.assertNotNull(element26);
        org.junit.Assert.assertNotNull(document27);
    }

    @Test
    public void test0308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0308");
        org.jsoup.nodes.Document.OutputSettings outputSettings0 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings1 = outputSettings0.clone();
        org.jsoup.nodes.Document.OutputSettings outputSettings3 = outputSettings0.indentAmount((int) (byte) 100);
        int int4 = outputSettings0.indentAmount();
        int int5 = outputSettings0.indentAmount();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document.OutputSettings outputSettings7 = outputSettings0.charset("hi!#document");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: hi!#document");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(outputSettings1);
        org.junit.Assert.assertNotNull(outputSettings3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
    }

    @Test
    public void test0309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0309");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements4 = document1.getElementsByAttributeValueMatching("hi!", "hi!");
        boolean boolean5 = document1.hasText();
        org.jsoup.nodes.Element element7 = document1.append("");
        org.jsoup.select.Elements elements8 = document1.siblingElements();
        org.jsoup.select.Elements elements11 = document1.getElementsByAttributeValueEnding("<hi!></hi!>", "<#root></#root>");
        org.jsoup.select.Elements elements13 = document1.getElementsByIndexGreaterThan((int) (short) 0);
        org.jsoup.nodes.Document document15 = new org.jsoup.nodes.Document("");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList16 = document15.textNodes();
        org.jsoup.nodes.Element element18 = document15.prependElement("hi!");
        java.lang.String str19 = element18.baseUri();
        org.jsoup.nodes.Element element21 = element18.toggleClass("hi!");
        org.jsoup.nodes.Element element23 = element21.prependText("");
        boolean boolean25 = element23.hasAttr("hi!");
        org.jsoup.nodes.Document document27 = new org.jsoup.nodes.Document("");
        boolean boolean28 = document27.isBlock();
        org.jsoup.nodes.Element element30 = document27.toggleClass("hi!");
        org.jsoup.nodes.Document document32 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element33 = document27.appendChild((org.jsoup.nodes.Node) document32);
        int int34 = element33.siblingIndex();
        boolean boolean35 = element33.isBlock();
        org.jsoup.nodes.Document document37 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements40 = document37.getElementsByAttributeValueMatching("hi!", "hi!");
        boolean boolean41 = document37.hasText();
        org.jsoup.nodes.Document document43 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element44 = document37.prependChild((org.jsoup.nodes.Node) document43);
        org.jsoup.select.Elements elements47 = document43.getElementsByAttributeValueStarting("<#root>\n <html>\n  <head></head>\n  <body></body>\n </html>\n</#root>", "<#root></#root>");
        org.jsoup.nodes.Element element49 = document43.before("#root");
        org.jsoup.nodes.Document document51 = new org.jsoup.nodes.Document("");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList52 = document51.textNodes();
        org.jsoup.select.Elements elements53 = document51.getAllElements();
        org.jsoup.nodes.Document document55 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements58 = document55.getElementsByAttributeValueMatching("hi!", "hi!");
        boolean boolean59 = document55.hasText();
        org.jsoup.nodes.Element element61 = document55.append("");
        org.jsoup.nodes.Element element62 = document51.appendChild((org.jsoup.nodes.Node) document55);
        org.jsoup.nodes.Node node64 = document51.removeAttr("hi!");
        org.jsoup.nodes.Document.OutputSettings outputSettings65 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode66 = outputSettings65.escapeMode();
        java.nio.charset.Charset charset67 = outputSettings65.charset();
        org.jsoup.nodes.Document document68 = document51.outputSettings(outputSettings65);
        boolean boolean69 = element49.equals((java.lang.Object) outputSettings65);
        org.jsoup.nodes.Element element70 = element49.lastElementSibling();
        org.jsoup.nodes.Element element72 = element49.before("#document");
        org.jsoup.nodes.Element element73 = element33.appendChild((org.jsoup.nodes.Node) element49);
        element23.replaceWith((org.jsoup.nodes.Node) element33);
        // The following exception was thrown during execution in test generation
        try {
            document1.replaceWith((org.jsoup.nodes.Node) element23);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertNotNull(textNodeList16);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(element30);
        org.junit.Assert.assertNotNull(element33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(elements40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(document43);
        org.junit.Assert.assertNotNull(element44);
        org.junit.Assert.assertNotNull(elements47);
        org.junit.Assert.assertNotNull(element49);
        org.junit.Assert.assertNotNull(textNodeList52);
        org.junit.Assert.assertNotNull(elements53);
        org.junit.Assert.assertNotNull(elements58);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(element61);
        org.junit.Assert.assertNotNull(element62);
        org.junit.Assert.assertNotNull(node64);
        org.junit.Assert.assertTrue("'" + escapeMode66 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode66.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset67);
        org.junit.Assert.assertNotNull(document68);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNull(element70);
        org.junit.Assert.assertNotNull(element72);
        org.junit.Assert.assertNotNull(element73);
    }

    @Test
    public void test0310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0310");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements4 = document1.getElementsByAttributeValueMatching("hi!", "hi!");
        boolean boolean5 = document1.hasText();
        org.jsoup.select.Elements elements8 = document1.getElementsByAttributeValueContaining("hi!", "hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap9 = document1.dataset();
        org.jsoup.select.Elements elements12 = document1.getElementsByAttributeValueEnding("<hi!></hi!>", "#document");
        org.jsoup.nodes.Element element14 = document1.createElement("#document");
        org.jsoup.select.Elements elements16 = element14.getElementsByIndexEquals((int) (short) -1);
        boolean boolean18 = element14.hasClass("#document");
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(elements16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test0311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0311");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements4 = document1.getElementsByAttributeValueMatching("hi!", "hi!");
        org.jsoup.nodes.Document document5 = document1.clone();
        org.jsoup.nodes.Document.QuirksMode quirksMode6 = null;
        org.jsoup.nodes.Document document7 = document1.quirksMode(quirksMode6);
        org.jsoup.nodes.Element element9 = document7.append("<#root class=\"hi!\"></#root>\n<#root></#root>");
        boolean boolean11 = document7.hasAttr("<#root>\n <html>\n  <head></head>\n  <body></body>\n </html>\n</#root>");
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNotNull(document5);
        org.junit.Assert.assertNotNull(document7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0312");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.nodes.Element element3 = document1.append("");
        org.jsoup.nodes.Element element5 = element3.html("hi!");
        java.lang.String str6 = element5.val();
        java.lang.String str7 = element5.toString();
        org.jsoup.nodes.Element element9 = element5.append("#document");
        java.lang.String str10 = element5.data();
        java.lang.String str11 = element5.toString();
        java.util.regex.Pattern pattern12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements13 = element5.getElementsMatchingOwnText(pattern12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!#document" + "'", str11, "hi!#document");
    }

    @Test
    public void test0313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0313");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements4 = document1.getElementsByAttributeValueMatching("hi!", "hi!");
        boolean boolean5 = document1.hasText();
        org.jsoup.nodes.Element element7 = document1.appendElement("<#root>\n <html>\n  <head></head>\n  <body></body>\n </html>\n</#root>");
        org.jsoup.nodes.Document document8 = document1.ownerDocument();
        java.util.Map<java.lang.String, java.lang.String> strMap9 = document8.dataset();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node11 = document8.childNode((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(document8);
        org.junit.Assert.assertNotNull(strMap9);
    }

    @Test
    public void test0314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0314");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean2 = document1.isBlock();
        java.util.List<org.jsoup.nodes.DataNode> dataNodeList3 = document1.dataNodes();
        java.lang.String str5 = document1.attr("");
        org.jsoup.nodes.Document.QuirksMode quirksMode6 = org.jsoup.nodes.Document.QuirksMode.noQuirks;
        org.jsoup.nodes.Document document7 = document1.quirksMode(quirksMode6);
        org.jsoup.nodes.Document.QuirksMode quirksMode8 = document1.quirksMode();
        org.jsoup.nodes.Element element9 = document1.previousElementSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element11 = element9.prependText("#root");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(dataNodeList3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + quirksMode6 + "' != '" + org.jsoup.nodes.Document.QuirksMode.noQuirks + "'", quirksMode6.equals(org.jsoup.nodes.Document.QuirksMode.noQuirks));
        org.junit.Assert.assertNotNull(document7);
        org.junit.Assert.assertTrue("'" + quirksMode8 + "' != '" + org.jsoup.nodes.Document.QuirksMode.noQuirks + "'", quirksMode8.equals(org.jsoup.nodes.Document.QuirksMode.noQuirks));
        org.junit.Assert.assertNull(element9);
    }

    @Test
    public void test0315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0315");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.nodes.Element element3 = document1.append("");
        org.jsoup.nodes.Element element5 = document1.toggleClass("");
        org.jsoup.nodes.Node node6 = document1.nextSibling();
        java.lang.String str7 = document1.ownText();
        org.jsoup.nodes.Element element9 = document1.appendText("<#root>");
        org.jsoup.nodes.Node node10 = element9.previousSibling();
        java.lang.Integer int11 = element9.elementSiblingIndex();
        org.jsoup.nodes.Element element13 = element9.addClass("#document");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element15 = element13.after(" hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(element13);
    }

    @Test
    public void test0316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0316");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = document1.textNodes();
        org.jsoup.select.Elements elements3 = document1.getAllElements();
        org.jsoup.nodes.Document document5 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements8 = document5.getElementsByAttributeValueMatching("hi!", "hi!");
        boolean boolean9 = document5.hasText();
        org.jsoup.nodes.Element element11 = document5.append("");
        org.jsoup.nodes.Element element12 = document1.appendChild((org.jsoup.nodes.Node) document5);
        org.jsoup.nodes.Document document14 = new org.jsoup.nodes.Document("");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList15 = document14.textNodes();
        org.jsoup.select.Elements elements16 = document14.getAllElements();
        org.jsoup.nodes.Document document18 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements21 = document18.getElementsByAttributeValueMatching("hi!", "hi!");
        boolean boolean22 = document18.hasText();
        org.jsoup.nodes.Element element24 = document18.append("");
        org.jsoup.nodes.Element element25 = document14.appendChild((org.jsoup.nodes.Node) document18);
        org.jsoup.nodes.Node node27 = document14.removeAttr("hi!");
        org.jsoup.nodes.Document.OutputSettings outputSettings28 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode29 = outputSettings28.escapeMode();
        java.nio.charset.Charset charset30 = outputSettings28.charset();
        org.jsoup.nodes.Document document31 = document14.outputSettings(outputSettings28);
        org.jsoup.nodes.Document document33 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.nodes.Element element35 = document33.append("");
        org.jsoup.nodes.Element element37 = document33.toggleClass("");
        java.lang.String str38 = document33.nodeName();
        java.lang.String str39 = document33.id();
        org.jsoup.nodes.Document.QuirksMode quirksMode40 = document33.quirksMode();
        org.jsoup.nodes.Document document41 = document31.quirksMode(quirksMode40);
        java.util.List<org.jsoup.nodes.TextNode> textNodeList42 = document41.textNodes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element43 = element12.before((org.jsoup.nodes.Node) document41);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(textNodeList15);
        org.junit.Assert.assertNotNull(elements16);
        org.junit.Assert.assertNotNull(elements21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(element24);
        org.junit.Assert.assertNotNull(element25);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertTrue("'" + escapeMode29 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode29.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset30);
        org.junit.Assert.assertNotNull(document31);
        org.junit.Assert.assertNotNull(document33);
        org.junit.Assert.assertNotNull(element35);
        org.junit.Assert.assertNotNull(element37);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "#document" + "'", str38, "#document");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertTrue("'" + quirksMode40 + "' != '" + org.jsoup.nodes.Document.QuirksMode.noQuirks + "'", quirksMode40.equals(org.jsoup.nodes.Document.QuirksMode.noQuirks));
        org.junit.Assert.assertNotNull(document41);
        org.junit.Assert.assertNotNull(textNodeList42);
    }

    @Test
    public void test0317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0317");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.nodes.Element element3 = document1.append("");
        org.jsoup.nodes.Element element5 = document1.html("<#root></#root>");
        org.jsoup.select.Elements elements8 = document1.getElementsByAttributeValueStarting("<#root></#root>", "<#root></#root>");
        org.jsoup.nodes.Element element10 = document1.append("<#root></#root>");
        org.jsoup.nodes.Node node11 = element10.previousSibling();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNull(node11);
    }

    @Test
    public void test0318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0318");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements4 = document1.getElementsByAttributeValueMatching("hi!", "hi!");
        boolean boolean5 = document1.hasText();
        org.jsoup.nodes.Element element7 = document1.append("");
        org.jsoup.select.Elements elements8 = document1.siblingElements();
        org.jsoup.nodes.Document document9 = document1.clone();
        java.lang.String str10 = document9.outerHtml();
        org.jsoup.nodes.Document document12 = new org.jsoup.nodes.Document("");
        boolean boolean13 = document12.isBlock();
        java.util.List<org.jsoup.nodes.DataNode> dataNodeList14 = document12.dataNodes();
        java.lang.String str16 = document12.attr("");
        org.jsoup.nodes.Document.QuirksMode quirksMode17 = org.jsoup.nodes.Document.QuirksMode.noQuirks;
        org.jsoup.nodes.Document document18 = document12.quirksMode(quirksMode17);
        org.jsoup.nodes.Document.OutputSettings outputSettings19 = document12.outputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings20 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings21 = outputSettings20.clone();
        org.jsoup.nodes.Document.OutputSettings outputSettings22 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode23 = outputSettings22.escapeMode();
        java.nio.charset.Charset charset24 = outputSettings22.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings25 = outputSettings21.charset(charset24);
        org.jsoup.nodes.Document.OutputSettings outputSettings26 = outputSettings19.charset(charset24);
        org.jsoup.nodes.Document.OutputSettings outputSettings27 = outputSettings26.clone();
        org.jsoup.nodes.Entities.EscapeMode escapeMode28 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings29 = outputSettings26.escapeMode(escapeMode28);
        org.jsoup.nodes.Document document30 = document9.outputSettings(outputSettings26);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element32 = document30.child((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(document9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(dataNodeList14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + quirksMode17 + "' != '" + org.jsoup.nodes.Document.QuirksMode.noQuirks + "'", quirksMode17.equals(org.jsoup.nodes.Document.QuirksMode.noQuirks));
        org.junit.Assert.assertNotNull(document18);
        org.junit.Assert.assertNotNull(outputSettings19);
        org.junit.Assert.assertNotNull(outputSettings21);
        org.junit.Assert.assertTrue("'" + escapeMode23 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode23.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset24);
        org.junit.Assert.assertNotNull(outputSettings25);
        org.junit.Assert.assertNotNull(outputSettings26);
        org.junit.Assert.assertNotNull(outputSettings27);
        org.junit.Assert.assertNotNull(outputSettings29);
        org.junit.Assert.assertNotNull(document30);
    }

    @Test
    public void test0319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0319");
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
        org.jsoup.nodes.Element element17 = document14.appendText("<html>\n <head></head>\n <body></body>\n</html>");
        java.lang.String str18 = document14.nodeName();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertNotNull(document14);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "#document" + "'", str18, "#document");
    }

    @Test
    public void test0320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0320");
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
        org.jsoup.nodes.Document document16 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements19 = document16.getElementsByAttributeValueMatching("hi!", "hi!");
        boolean boolean20 = document16.hasText();
        org.jsoup.nodes.Document document22 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element23 = document16.prependChild((org.jsoup.nodes.Node) document22);
        org.jsoup.select.Elements elements26 = document22.getElementsByAttributeValueStarting("<#root>\n <html>\n  <head></head>\n  <body></body>\n </html>\n</#root>", "<#root></#root>");
        org.jsoup.nodes.Element element28 = document22.before("#root");
        org.jsoup.nodes.Element element29 = document14.before((org.jsoup.nodes.Node) element28);
        java.lang.String str30 = element29.tagName();
        org.jsoup.select.Elements elements33 = element29.getElementsByAttributeValueContaining("<#root class=\"hi!\"></#root>\n<#root></#root>", "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertTrue("'" + quirksMode13 + "' != '" + org.jsoup.nodes.Document.QuirksMode.noQuirks + "'", quirksMode13.equals(org.jsoup.nodes.Document.QuirksMode.noQuirks));
        org.junit.Assert.assertNotNull(document14);
        org.junit.Assert.assertNotNull(elements19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(document22);
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertNotNull(elements26);
        org.junit.Assert.assertNotNull(element28);
        org.junit.Assert.assertNotNull(element29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "#root" + "'", str30, "#root");
        org.junit.Assert.assertNotNull(elements33);
    }

    @Test
    public void test0321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0321");
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
        org.jsoup.nodes.Document.OutputSettings outputSettings14 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings15 = outputSettings14.clone();
        org.jsoup.nodes.Document.OutputSettings outputSettings16 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode17 = outputSettings16.escapeMode();
        int int18 = outputSettings16.indentAmount();
        org.jsoup.nodes.Entities.EscapeMode escapeMode19 = outputSettings16.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings20 = outputSettings15.escapeMode(escapeMode19);
        org.jsoup.nodes.Document.OutputSettings outputSettings21 = outputSettings12.escapeMode(escapeMode19);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document.OutputSettings outputSettings23 = outputSettings12.charset("<<#root>\n <html>\n  <head></head>\n  <body></body>\n </html>\n</#root>></<#root>\n <html>\n  <head></head>\n  <body></body>\n </html>\n</#root>>");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: <<#root>? <html>?  <head></head>?  <body></body>? </html>?</#root>></<#root>? <html>?  <head></head>?  <body></body>? </html>?</#root>>");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(document7);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(outputSettings10);
        org.junit.Assert.assertTrue("'" + escapeMode11 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode11.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings12);
        org.junit.Assert.assertNotNull(document13);
        org.junit.Assert.assertNotNull(outputSettings15);
        org.junit.Assert.assertTrue("'" + escapeMode17 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode17.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + escapeMode19 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode19.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings20);
        org.junit.Assert.assertNotNull(outputSettings21);
    }

    @Test
    public void test0322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0322");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements4 = document1.getElementsByAttributeValueMatching("hi!", "hi!");
        org.jsoup.nodes.Document document5 = document1.clone();
        org.jsoup.nodes.Document.QuirksMode quirksMode6 = null;
        org.jsoup.nodes.Document document7 = document1.quirksMode(quirksMode6);
        org.jsoup.nodes.Element element9 = document7.append("<#root class=\"hi!\"></#root>\n<#root></#root>");
        java.util.List<org.jsoup.nodes.Node> nodeList10 = element9.siblingNodes();
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNotNull(document5);
        org.junit.Assert.assertNotNull(document7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(nodeList10);
    }

    @Test
    public void test0323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0323");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.nodes.Element element3 = document1.append("");
        org.jsoup.nodes.Element element5 = document1.html("<#root></#root>");
        org.jsoup.select.Elements elements8 = document1.getElementsByAttributeValue("<hi!></hi!>", "#document");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList9 = document1.textNodes();
        org.jsoup.nodes.Document document11 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements14 = document11.getElementsByAttributeValueMatching("hi!", "hi!");
        boolean boolean15 = document11.hasText();
        org.jsoup.nodes.Document document17 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element18 = document11.prependChild((org.jsoup.nodes.Node) document17);
        org.jsoup.nodes.Element element20 = document11.append("<#root>\n <html>\n  <head></head>\n  <body></body>\n </html>\n</#root>");
        java.lang.String str21 = element20.ownText();
        // The following exception was thrown during execution in test generation
        try {
            document1.replaceWith((org.jsoup.nodes.Node) element20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(textNodeList9);
        org.junit.Assert.assertNotNull(elements14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(document17);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "<#root>" + "'", str21, "<#root>");
    }

    @Test
    public void test0324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0324");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean2 = document1.isBlock();
        java.util.List<org.jsoup.nodes.DataNode> dataNodeList3 = document1.dataNodes();
        java.lang.String str5 = document1.attr("");
        org.jsoup.nodes.Document.QuirksMode quirksMode6 = org.jsoup.nodes.Document.QuirksMode.noQuirks;
        org.jsoup.nodes.Document document7 = document1.quirksMode(quirksMode6);
        org.jsoup.nodes.Document.QuirksMode quirksMode8 = document1.quirksMode();
        org.jsoup.nodes.Element element9 = document1.previousElementSibling();
        org.jsoup.select.Elements elements10 = document1.siblingElements();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(dataNodeList3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + quirksMode6 + "' != '" + org.jsoup.nodes.Document.QuirksMode.noQuirks + "'", quirksMode6.equals(org.jsoup.nodes.Document.QuirksMode.noQuirks));
        org.junit.Assert.assertNotNull(document7);
        org.junit.Assert.assertTrue("'" + quirksMode8 + "' != '" + org.jsoup.nodes.Document.QuirksMode.noQuirks + "'", quirksMode8.equals(org.jsoup.nodes.Document.QuirksMode.noQuirks));
        org.junit.Assert.assertNull(element9);
        org.junit.Assert.assertNotNull(elements10);
    }

    @Test
    public void test0325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0325");
        org.jsoup.nodes.Document.OutputSettings outputSettings0 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings1 = outputSettings0.clone();
        org.jsoup.nodes.Document.OutputSettings outputSettings2 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode3 = outputSettings2.escapeMode();
        int int4 = outputSettings2.indentAmount();
        org.jsoup.nodes.Entities.EscapeMode escapeMode5 = outputSettings2.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings6 = outputSettings1.escapeMode(escapeMode5);
        org.jsoup.nodes.Document document8 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements11 = document8.getElementsByAttributeValueMatching("hi!", "hi!");
        boolean boolean12 = document8.hasText();
        org.jsoup.nodes.Document document14 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element15 = document8.prependChild((org.jsoup.nodes.Node) document14);
        org.jsoup.nodes.Document.OutputSettings outputSettings16 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings17 = outputSettings16.clone();
        org.jsoup.nodes.Entities.EscapeMode escapeMode18 = outputSettings17.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings19 = outputSettings17.clone();
        org.jsoup.nodes.Document document20 = document8.outputSettings(outputSettings19);
        org.jsoup.nodes.Document.OutputSettings outputSettings21 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings22 = outputSettings21.clone();
        org.jsoup.nodes.Document.OutputSettings outputSettings23 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode24 = outputSettings23.escapeMode();
        int int25 = outputSettings23.indentAmount();
        org.jsoup.nodes.Entities.EscapeMode escapeMode26 = outputSettings23.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings27 = outputSettings22.escapeMode(escapeMode26);
        org.jsoup.nodes.Document.OutputSettings outputSettings28 = outputSettings19.escapeMode(escapeMode26);
        org.jsoup.nodes.Document.OutputSettings outputSettings29 = outputSettings6.escapeMode(escapeMode26);
        int int30 = outputSettings29.indentAmount();
        org.junit.Assert.assertNotNull(outputSettings1);
        org.junit.Assert.assertTrue("'" + escapeMode3 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode3.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + escapeMode5 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode5.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings6);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(document14);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(outputSettings17);
        org.junit.Assert.assertTrue("'" + escapeMode18 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode18.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings19);
        org.junit.Assert.assertNotNull(document20);
        org.junit.Assert.assertNotNull(outputSettings22);
        org.junit.Assert.assertTrue("'" + escapeMode24 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode24.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertTrue("'" + escapeMode26 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode26.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings27);
        org.junit.Assert.assertNotNull(outputSettings28);
        org.junit.Assert.assertNotNull(outputSettings29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
    }

    @Test
    public void test0326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0326");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements2 = document1.parents();
        org.jsoup.nodes.Document document3 = document1.clone();
        org.jsoup.nodes.Element element4 = document3.body();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node6 = element4.removeAttr("<hi!></hi!>");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements2);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNull(element4);
    }

    @Test
    public void test0327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0327");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.nodes.Element element3 = document1.append("");
        org.jsoup.nodes.Element element5 = document1.html("<#root></#root>");
        org.jsoup.select.Elements elements8 = document1.getElementsByAttributeValueStarting("<#root></#root>", "<#root></#root>");
        org.jsoup.nodes.Element element10 = document1.append("<#root></#root>");
        java.lang.String str11 = document1.val();
        org.jsoup.nodes.Element element13 = document1.addClass("<#root>");
        java.util.regex.Pattern pattern14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements15 = document1.getElementsMatchingOwnText(pattern14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(element13);
    }

    @Test
    public void test0328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0328");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.nodes.Element element3 = document1.append("");
        org.jsoup.nodes.Element element5 = document1.toggleClass("");
        org.jsoup.nodes.Node node6 = document1.nextSibling();
        java.lang.String str7 = document1.ownText();
        org.jsoup.nodes.Element element9 = document1.appendText("<#root>");
        org.jsoup.nodes.Element element11 = element9.appendElement("<hi!></hi!>");
        java.lang.String str12 = element11.baseUri();
        org.jsoup.select.Elements elements14 = element11.getElementsMatchingText("#document");
        org.jsoup.select.Elements elements17 = element11.getElementsByAttributeValueMatching("<#root><#root>", "<hi!></hi!>\n<#root></#root>\n<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(elements14);
        org.junit.Assert.assertNotNull(elements17);
    }

    @Test
    public void test0329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0329");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements4 = document1.getElementsByAttributeValueMatching("hi!", "hi!");
        boolean boolean5 = document1.hasText();
        org.jsoup.nodes.Document document7 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element8 = document1.prependChild((org.jsoup.nodes.Node) document7);
        org.jsoup.select.Elements elements11 = document7.getElementsByAttributeValueStarting("<#root>\n <html>\n  <head></head>\n  <body></body>\n </html>\n</#root>", "<#root></#root>");
        org.jsoup.nodes.Element element13 = document7.before("#root");
        org.jsoup.nodes.Document document15 = new org.jsoup.nodes.Document("");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList16 = document15.textNodes();
        org.jsoup.select.Elements elements17 = document15.getAllElements();
        org.jsoup.nodes.Document document19 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements22 = document19.getElementsByAttributeValueMatching("hi!", "hi!");
        boolean boolean23 = document19.hasText();
        org.jsoup.nodes.Element element25 = document19.append("");
        org.jsoup.nodes.Element element26 = document15.appendChild((org.jsoup.nodes.Node) document19);
        org.jsoup.nodes.Node node28 = document15.removeAttr("hi!");
        org.jsoup.nodes.Document.OutputSettings outputSettings29 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode30 = outputSettings29.escapeMode();
        java.nio.charset.Charset charset31 = outputSettings29.charset();
        org.jsoup.nodes.Document document32 = document15.outputSettings(outputSettings29);
        boolean boolean33 = element13.equals((java.lang.Object) outputSettings29);
        org.jsoup.nodes.Element element34 = element13.lastElementSibling();
        org.jsoup.nodes.Document document36 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements39 = document36.getElementsByAttributeValueMatching("hi!", "hi!");
        boolean boolean40 = document36.hasText();
        org.jsoup.nodes.Element element42 = document36.append("");
        java.lang.String str44 = element42.attr("<#root>\n <html>\n  <head></head>\n  <body></body>\n </html>\n</#root>");
        org.jsoup.nodes.Element element45 = element13.before((org.jsoup.nodes.Node) element42);
        org.jsoup.nodes.Element element46 = element42.nextElementSibling();
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(document7);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(textNodeList16);
        org.junit.Assert.assertNotNull(elements17);
        org.junit.Assert.assertNotNull(elements22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(element25);
        org.junit.Assert.assertNotNull(element26);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertTrue("'" + escapeMode30 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode30.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset31);
        org.junit.Assert.assertNotNull(document32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNull(element34);
        org.junit.Assert.assertNotNull(elements39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(element42);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertNotNull(element45);
        org.junit.Assert.assertNotNull(element46);
    }

    @Test
    public void test0330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0330");
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
        boolean boolean18 = document5.hasAttr(" hi!");
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertTrue("'" + quirksMode13 + "' != '" + org.jsoup.nodes.Document.QuirksMode.noQuirks + "'", quirksMode13.equals(org.jsoup.nodes.Document.QuirksMode.noQuirks));
        org.junit.Assert.assertNotNull(document14);
        org.junit.Assert.assertNotNull(strSet15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test0331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0331");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements4 = document1.getElementsByAttributeValueMatching("hi!", "hi!");
        boolean boolean5 = document1.hasText();
        org.jsoup.nodes.Document document7 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element8 = document1.prependChild((org.jsoup.nodes.Node) document7);
        org.jsoup.nodes.Element element10 = document1.append("<#root>\n <html>\n  <head></head>\n  <body></body>\n </html>\n</#root>");
        org.jsoup.nodes.Element element13 = element10.attr("<#root>\n <html>\n  <head></head>\n  <body></body>\n </html>\n</#root>", "hi!");
        org.jsoup.select.Elements elements16 = element10.getElementsByAttributeValueStarting("<#root>\n <html>\n  <head></head>\n  <body></body>\n </html>\n</#root>", "hi!#document");
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(document7);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(elements16);
    }

    @Test
    public void test0332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0332");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean2 = document1.isBlock();
        java.util.List<org.jsoup.nodes.DataNode> dataNodeList3 = document1.dataNodes();
        java.lang.String str5 = document1.attr("");
        org.jsoup.nodes.Document.QuirksMode quirksMode6 = org.jsoup.nodes.Document.QuirksMode.noQuirks;
        org.jsoup.nodes.Document document7 = document1.quirksMode(quirksMode6);
        org.jsoup.nodes.Document document8 = document1.ownerDocument();
        org.jsoup.nodes.Document document10 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements13 = document10.getElementsByAttributeValueMatching("hi!", "hi!");
        java.lang.String[] strArray15 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet16 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet16, strArray15);
        org.jsoup.nodes.Element element18 = document10.classNames((java.util.Set<java.lang.String>) strSet16);
        org.jsoup.nodes.Element element19 = document8.classNames((java.util.Set<java.lang.String>) strSet16);
        org.jsoup.nodes.Document document21 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements24 = document21.getElementsByAttributeValueMatching("hi!", "hi!");
        java.lang.String[] strArray26 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet27 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet27, strArray26);
        org.jsoup.nodes.Element element29 = document21.classNames((java.util.Set<java.lang.String>) strSet27);
        boolean boolean30 = element19.equals((java.lang.Object) document21);
        java.lang.String str31 = document21.text();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element33 = document21.getElementById("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(dataNodeList3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + quirksMode6 + "' != '" + org.jsoup.nodes.Document.QuirksMode.noQuirks + "'", quirksMode6.equals(org.jsoup.nodes.Document.QuirksMode.noQuirks));
        org.junit.Assert.assertNotNull(document7);
        org.junit.Assert.assertNotNull(document8);
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertNotNull(elements24);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertArrayEquals(strArray26, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(element29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
    }

    @Test
    public void test0333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0333");
        org.jsoup.nodes.Document.OutputSettings outputSettings0 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode1 = outputSettings0.escapeMode();
        java.nio.charset.Charset charset2 = outputSettings0.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings3 = outputSettings0.clone();
        int int4 = outputSettings0.indentAmount();
        java.nio.charset.CharsetEncoder charsetEncoder5 = outputSettings0.encoder();
        org.jsoup.nodes.Document.OutputSettings outputSettings6 = outputSettings0.clone();
        org.junit.Assert.assertTrue("'" + escapeMode1 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode1.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset2);
        org.junit.Assert.assertNotNull(outputSettings3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(charsetEncoder5);
        org.junit.Assert.assertNotNull(outputSettings6);
    }

    @Test
    public void test0334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0334");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean2 = document1.isBlock();
        java.util.List<org.jsoup.nodes.DataNode> dataNodeList3 = document1.dataNodes();
        java.lang.String str5 = document1.attr("");
        org.jsoup.nodes.Document.QuirksMode quirksMode6 = org.jsoup.nodes.Document.QuirksMode.noQuirks;
        org.jsoup.nodes.Document document7 = document1.quirksMode(quirksMode6);
        org.jsoup.nodes.Document document8 = document1.ownerDocument();
        java.lang.String str9 = document1.toString();
        boolean boolean10 = document1.hasText();
        // The following exception was thrown during execution in test generation
        try {
            document1.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(dataNodeList3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + quirksMode6 + "' != '" + org.jsoup.nodes.Document.QuirksMode.noQuirks + "'", quirksMode6.equals(org.jsoup.nodes.Document.QuirksMode.noQuirks));
        org.junit.Assert.assertNotNull(document7);
        org.junit.Assert.assertNotNull(document8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0335");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.nodes.Element element3 = document1.append("");
        org.jsoup.nodes.Element element5 = document1.toggleClass("");
        java.lang.String str6 = document1.nodeName();
        java.lang.String str7 = document1.id();
        org.jsoup.nodes.Document.QuirksMode quirksMode8 = document1.quirksMode();
        org.jsoup.nodes.Document document10 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements13 = document10.getElementsByAttributeValueMatching("hi!", "hi!");
        org.jsoup.nodes.Element element14 = document10.head();
        org.jsoup.nodes.Document.OutputSettings outputSettings15 = document10.outputSettings();
        org.jsoup.nodes.Document document16 = document1.outputSettings(outputSettings15);
        org.jsoup.select.Elements elements18 = document16.getElementsByClass("<hi!>\n #root\n</hi!>");
        java.lang.String str19 = document16.ownText();
        java.lang.String str20 = document16.outerHtml();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "#document" + "'", str6, "#document");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + quirksMode8 + "' != '" + org.jsoup.nodes.Document.QuirksMode.noQuirks + "'", quirksMode8.equals(org.jsoup.nodes.Document.QuirksMode.noQuirks));
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertNull(element14);
        org.junit.Assert.assertNotNull(outputSettings15);
        org.junit.Assert.assertNotNull(document16);
        org.junit.Assert.assertNotNull(elements18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>" + "'", str20, "<html>\n <head></head>\n <body></body>\n</html>");
    }

    @Test
    public void test0336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0336");
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
        java.util.Set<java.lang.String> strSet21 = element20.classNames();
        org.jsoup.nodes.Document document23 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.nodes.Element element25 = document23.append("");
        org.jsoup.nodes.Element element27 = document23.toggleClass("");
        java.lang.String str28 = document23.nodeName();
        java.lang.String str29 = document23.id();
        org.jsoup.nodes.Document.QuirksMode quirksMode30 = document23.quirksMode();
        org.jsoup.nodes.Document document32 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements35 = document32.getElementsByAttributeValueMatching("hi!", "hi!");
        org.jsoup.nodes.Element element36 = document32.head();
        org.jsoup.nodes.Document.OutputSettings outputSettings37 = document32.outputSettings();
        org.jsoup.nodes.Document document38 = document23.outputSettings(outputSettings37);
        // The following exception was thrown during execution in test generation
        try {
            element20.replaceWith((org.jsoup.nodes.Node) document23);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "<#root></#root>" + "'", str13, "<#root></#root>");
        org.junit.Assert.assertNotNull(document14);
        org.junit.Assert.assertNotNull(textNodeList17);
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertNotNull(strSet21);
        org.junit.Assert.assertNotNull(document23);
        org.junit.Assert.assertNotNull(element25);
        org.junit.Assert.assertNotNull(element27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "#document" + "'", str28, "#document");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertTrue("'" + quirksMode30 + "' != '" + org.jsoup.nodes.Document.QuirksMode.noQuirks + "'", quirksMode30.equals(org.jsoup.nodes.Document.QuirksMode.noQuirks));
        org.junit.Assert.assertNotNull(elements35);
        org.junit.Assert.assertNull(element36);
        org.junit.Assert.assertNotNull(outputSettings37);
        org.junit.Assert.assertNotNull(document38);
    }

    @Test
    public void test0337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0337");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean2 = document1.isBlock();
        org.jsoup.nodes.Element element4 = document1.toggleClass("hi!");
        org.jsoup.nodes.Attributes attributes5 = element4.attributes();
        org.jsoup.nodes.Element element7 = element4.appendElement("<hi!></hi!>");
        java.lang.String[] strArray13 = new java.lang.String[] { "", "<#root>\n <html>\n  <head></head>\n  <body></body>\n </html>\n</#root>", "<#root></#root>", "<#root></#root>", "#document" };
        java.util.LinkedHashSet<java.lang.String> strSet14 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet14, strArray13);
        org.jsoup.nodes.Element element16 = element7.classNames((java.util.Set<java.lang.String>) strSet14);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node18 = element7.childNode((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(attributes5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[] { "", "<#root>\n <html>\n  <head></head>\n  <body></body>\n </html>\n</#root>", "<#root></#root>", "<#root></#root>", "#document" });
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(element16);
    }

    @Test
    public void test0338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0338");
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
        org.jsoup.nodes.Element element25 = document14.nextElementSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element27 = element25.tagName("<#root>");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "<#root></#root>" + "'", str13, "<#root></#root>");
        org.junit.Assert.assertNotNull(document14);
        org.junit.Assert.assertNotNull(textNodeList17);
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertNotNull(strSet24);
        org.junit.Assert.assertNull(element25);
    }

    @Test
    public void test0339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0339");
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
        org.jsoup.nodes.Element element16 = element14.appendText("<#root>\n <html>\n  <head></head>\n  <body></body>\n </html>\n</#root>");
        org.jsoup.nodes.Element element18 = element14.removeClass("&lt;#root&gt;\n<!--#root-->&lt;#root&gt;\n<!--#root-->");
        org.junit.Assert.assertNull(element2);
        org.junit.Assert.assertNotNull(textNodeList5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(element18);
    }

    @Test
    public void test0340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0340");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements4 = document1.getElementsByAttributeValueMatching("hi!", "hi!");
        org.jsoup.nodes.Document document5 = document1.clone();
        java.lang.String str6 = document1.tagName();
        org.jsoup.nodes.Node node7 = document1.nextSibling();
        java.util.Map<java.lang.String, java.lang.String> strMap8 = document1.dataset();
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNotNull(document5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "#root" + "'", str6, "#root");
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNotNull(strMap8);
    }

    @Test
    public void test0341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0341");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element18 = document14.after("hi!#document");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "<#root></#root>" + "'", str13, "<#root></#root>");
        org.junit.Assert.assertNotNull(document14);
        org.junit.Assert.assertNotNull(element16);
    }

    @Test
    public void test0342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0342");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = document1.textNodes();
        org.jsoup.nodes.Element element4 = document1.prependElement("hi!");
        java.lang.String str5 = element4.baseUri();
        org.jsoup.nodes.Element element7 = element4.toggleClass("hi!");
        org.jsoup.nodes.Document document9 = new org.jsoup.nodes.Document("");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList10 = document9.textNodes();
        org.jsoup.nodes.Element element12 = document9.prependElement("hi!");
        java.lang.String str13 = element12.baseUri();
        org.jsoup.nodes.Element element15 = element12.toggleClass("hi!");
        org.jsoup.nodes.Element element17 = element15.prependText("");
        java.lang.Integer int18 = element17.elementSiblingIndex();
        org.jsoup.nodes.Element element19 = element4.before((org.jsoup.nodes.Node) element17);
        java.util.regex.Pattern pattern21 = null;
        org.jsoup.select.Elements elements22 = element17.getElementsByAttributeValueMatching("#document", pattern21);
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(textNodeList10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertNotNull(elements22);
    }

    @Test
    public void test0343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0343");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Element element3 = document1.removeClass("<#root></#root>");
        java.util.regex.Pattern pattern5 = null;
        org.jsoup.select.Elements elements6 = element3.getElementsByAttributeValueMatching("#document", pattern5);
        org.jsoup.select.Elements elements7 = element3.getAllElements();
        java.lang.Class<?> wildcardClass8 = elements7.getClass();
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0344");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = document1.textNodes();
        org.jsoup.select.Elements elements3 = document1.getAllElements();
        org.jsoup.nodes.Document document5 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements8 = document5.getElementsByAttributeValueMatching("hi!", "hi!");
        boolean boolean9 = document5.hasText();
        org.jsoup.nodes.Element element11 = document5.append("");
        org.jsoup.nodes.Element element12 = document1.appendChild((org.jsoup.nodes.Node) document5);
        org.jsoup.select.Elements elements13 = element12.parents();
        java.util.regex.Pattern pattern15 = null;
        org.jsoup.select.Elements elements16 = element12.getElementsByAttributeValueMatching(" hi!", pattern15);
        java.util.regex.Pattern pattern17 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements18 = element12.getElementsMatchingOwnText(pattern17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertNotNull(elements16);
    }

    @Test
    public void test0345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0345");
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
        org.jsoup.select.Elements elements22 = document19.getElementsMatchingText("<<#root>\n <html>\n  <head></head>\n  <body></body>\n </html>\n</#root>></<#root>\n <html>\n  <head></head>\n  <body></body>\n </html>\n</#root>>");
        java.lang.String str23 = document19.tagName();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node24 = document19.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertNotNull(outputSettings12);
        org.junit.Assert.assertTrue("'" + escapeMode14 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode14.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset15);
        org.junit.Assert.assertNotNull(outputSettings16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(document18);
        org.junit.Assert.assertNotNull(document19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(elements22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "#root" + "'", str23, "#root");
    }

    @Test
    public void test0346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0346");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements42 = element30.select("<#root></#root>\n<html>\n <head></head>\n <body></body>\n</html>");
            org.junit.Assert.fail("Expected exception of type org.jsoup.select.Selector.SelectorParseException; message: Could not parse query '<#root></#root>?<html>? <head></head>? <body></body>?</html>': unexpected token at '<#root></#root>?<html>? <head></head>? <body></body>?</html>'");
        } catch (org.jsoup.select.Selector.SelectorParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(dataNodeList3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(dataNodeList13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + quirksMode16 + "' != '" + org.jsoup.nodes.Document.QuirksMode.noQuirks + "'", quirksMode16.equals(org.jsoup.nodes.Document.QuirksMode.noQuirks));
        org.junit.Assert.assertNotNull(document17);
        org.junit.Assert.assertNotNull(document18);
        org.junit.Assert.assertNotNull(elements23);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertArrayEquals(strArray25, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(element28);
        org.junit.Assert.assertNotNull(element29);
        org.junit.Assert.assertNotNull(element30);
        org.junit.Assert.assertNotNull(elements35);
        org.junit.Assert.assertNotNull(document36);
        org.junit.Assert.assertNotNull(node38);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertNotNull(element40);
    }

    @Test
    public void test0347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0347");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.nodes.Element element3 = document1.append("");
        org.jsoup.nodes.Element element5 = document1.html("<#root></#root>");
        org.jsoup.nodes.Document document6 = document1.ownerDocument();
        org.jsoup.select.Elements elements7 = document1.getAllElements();
        org.jsoup.nodes.Element element9 = document1.val("<html>\n <head></head>\n <body></body>\n</html>");
        java.lang.String str10 = document1.toString();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(document6);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "&lt;#root&gt;\n<!--#root-->" + "'", str10, "&lt;#root&gt;\n<!--#root-->");
    }

    @Test
    public void test0348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0348");
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
        org.jsoup.nodes.Document document16 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements19 = document16.getElementsByAttributeValueMatching("hi!", "hi!");
        boolean boolean20 = document16.hasText();
        org.jsoup.nodes.Document document22 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element23 = document16.prependChild((org.jsoup.nodes.Node) document22);
        org.jsoup.select.Elements elements26 = document22.getElementsByAttributeValueStarting("<#root>\n <html>\n  <head></head>\n  <body></body>\n </html>\n</#root>", "<#root></#root>");
        org.jsoup.nodes.Element element28 = document22.before("#root");
        org.jsoup.nodes.Element element29 = document14.before((org.jsoup.nodes.Node) element28);
        java.lang.String str30 = element28.className();
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertTrue("'" + quirksMode13 + "' != '" + org.jsoup.nodes.Document.QuirksMode.noQuirks + "'", quirksMode13.equals(org.jsoup.nodes.Document.QuirksMode.noQuirks));
        org.junit.Assert.assertNotNull(document14);
        org.junit.Assert.assertNotNull(elements19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(document22);
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertNotNull(elements26);
        org.junit.Assert.assertNotNull(element28);
        org.junit.Assert.assertNotNull(element29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
    }

    @Test
    public void test0349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0349");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.nodes.Element element3 = document1.append("");
        org.jsoup.nodes.Element element5 = element3.html("hi!");
        java.lang.String str6 = element5.val();
        java.lang.String str7 = element5.baseUri();
        boolean boolean9 = element5.hasAttr("#document");
        java.lang.String str10 = element5.val();
        org.jsoup.nodes.Document document12 = org.jsoup.nodes.Document.createShell("#root");
        org.jsoup.nodes.Element element14 = document12.append("<<hi!></hi!>></<hi!></hi!>>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element15 = element5.before((org.jsoup.nodes.Node) document12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(document12);
        org.junit.Assert.assertNotNull(element14);
    }

    @Test
    public void test0350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0350");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements22 = document1.getElementsByAttributeValueContaining("<#root>\n <html>\n  <head></head>\n  <body></body>\n </html>\n</#root>", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "<#root></#root>" + "'", str13, "<#root></#root>");
        org.junit.Assert.assertNotNull(document14);
        org.junit.Assert.assertNotNull(elements16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(element19);
    }

    @Test
    public void test0351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0351");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean2 = document1.isBlock();
        org.jsoup.nodes.Element element4 = document1.toggleClass("hi!");
        org.jsoup.nodes.Document document6 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element7 = document1.appendChild((org.jsoup.nodes.Node) document6);
        java.util.regex.Pattern pattern9 = null;
        org.jsoup.select.Elements elements10 = document1.getElementsByAttributeValueMatching("<html>\n <head></head>\n <body></body>\n</html>", pattern9);
        org.jsoup.nodes.Element element12 = document1.prependElement("<hi!></hi!>");
        org.jsoup.select.Elements elements14 = document1.getElementsByAttributeStarting("&lt;#root&gt;\n<!--#root-->");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(elements14);
    }

    @Test
    public void test0352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0352");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements4 = document1.getElementsByAttributeValueMatching("hi!", "hi!");
        boolean boolean5 = document1.hasText();
        org.jsoup.nodes.Node node6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element7 = document1.before(node6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0353");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean2 = document1.isBlock();
        org.jsoup.nodes.Element element4 = document1.toggleClass("hi!");
        java.util.regex.Pattern pattern6 = null;
        org.jsoup.select.Elements elements7 = document1.getElementsByAttributeValueMatching("#document", pattern6);
        java.lang.String str8 = document1.text();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0354");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean2 = document1.isBlock();
        java.util.List<org.jsoup.nodes.DataNode> dataNodeList3 = document1.dataNodes();
        java.lang.String str5 = document1.attr("");
        org.jsoup.nodes.Document.QuirksMode quirksMode6 = org.jsoup.nodes.Document.QuirksMode.noQuirks;
        org.jsoup.nodes.Document document7 = document1.quirksMode(quirksMode6);
        org.jsoup.nodes.Document document8 = document1.ownerDocument();
        org.jsoup.select.Elements elements10 = document8.getElementsByIndexLessThan((int) ' ');
        org.jsoup.select.Elements elements13 = document8.getElementsByAttributeValueMatching("hi!", "<#root>\n <html>\n  <head></head>\n  <body></body>\n </html>\n</#root>");
        org.jsoup.nodes.Element element15 = document8.createElement("<#root>\n <html>\n  <head></head>\n  <body></body>\n </html>\n</#root>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node16 = element15.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(dataNodeList3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + quirksMode6 + "' != '" + org.jsoup.nodes.Document.QuirksMode.noQuirks + "'", quirksMode6.equals(org.jsoup.nodes.Document.QuirksMode.noQuirks));
        org.junit.Assert.assertNotNull(document7);
        org.junit.Assert.assertNotNull(document8);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertNotNull(element15);
    }

    @Test
    public void test0355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0355");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.nodes.Element element3 = document1.append("");
        org.jsoup.nodes.Element element5 = document1.toggleClass("");
        java.lang.String str6 = document1.nodeName();
        java.lang.String str7 = document1.id();
        org.jsoup.nodes.Document.QuirksMode quirksMode8 = document1.quirksMode();
        org.jsoup.nodes.Document document10 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements13 = document10.getElementsByAttributeValueMatching("hi!", "hi!");
        org.jsoup.nodes.Element element14 = document10.head();
        org.jsoup.nodes.Document.OutputSettings outputSettings15 = document10.outputSettings();
        org.jsoup.nodes.Document document16 = document1.outputSettings(outputSettings15);
        java.lang.String str18 = document1.absUrl("<#root></#root>\n<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "#document" + "'", str6, "#document");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + quirksMode8 + "' != '" + org.jsoup.nodes.Document.QuirksMode.noQuirks + "'", quirksMode8.equals(org.jsoup.nodes.Document.QuirksMode.noQuirks));
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertNull(element14);
        org.junit.Assert.assertNotNull(outputSettings15);
        org.junit.Assert.assertNotNull(document16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test0356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0356");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.nodes.Element element3 = document1.append("");
        org.jsoup.nodes.Element element5 = document1.toggleClass("");
        org.jsoup.select.Elements elements7 = element5.getElementsByIndexGreaterThan((int) ' ');
        boolean boolean8 = element5.hasText();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0357");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements4 = document1.getElementsByAttributeValueMatching("hi!", "hi!");
        org.jsoup.nodes.Document document5 = document1.clone();
        java.lang.String str6 = document1.tagName();
        org.jsoup.nodes.Element element8 = document1.addClass("<#root></#root>");
        org.jsoup.nodes.Element element10 = document1.addClass("<#root>");
        org.jsoup.nodes.Attributes attributes11 = document1.attributes();
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNotNull(document5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "#root" + "'", str6, "#root");
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(attributes11);
    }

    @Test
    public void test0358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0358");
        org.jsoup.nodes.Document.OutputSettings outputSettings0 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings1 = outputSettings0.clone();
        org.jsoup.nodes.Document.OutputSettings outputSettings2 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode3 = outputSettings2.escapeMode();
        java.nio.charset.Charset charset4 = outputSettings2.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings5 = outputSettings1.charset(charset4);
        boolean boolean6 = outputSettings5.prettyPrint();
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = outputSettings5.indentAmount((int) (byte) 0);
        int int9 = outputSettings8.indentAmount();
        java.nio.charset.CharsetEncoder charsetEncoder10 = outputSettings8.encoder();
        org.junit.Assert.assertNotNull(outputSettings1);
        org.junit.Assert.assertTrue("'" + escapeMode3 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode3.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset4);
        org.junit.Assert.assertNotNull(outputSettings5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(outputSettings8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(charsetEncoder10);
    }

    @Test
    public void test0359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0359");
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
        boolean boolean16 = document1.hasAttr("#document");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element18 = document1.before("<#root>\n <html>\n  <head></head>\n  <body></body>\n </html>\n</#root>");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "<#root></#root>" + "'", str13, "<#root></#root>");
        org.junit.Assert.assertNotNull(document14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0360");
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
        org.jsoup.select.Elements elements18 = document1.getElementsByAttributeStarting("<#root></#root>\n<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "<#root></#root>" + "'", str13, "<#root></#root>");
        org.junit.Assert.assertNotNull(document14);
        org.junit.Assert.assertNotNull(elements16);
        org.junit.Assert.assertNotNull(elements18);
    }

    @Test
    public void test0361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0361");
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
        org.jsoup.nodes.Document document17 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements20 = document17.getElementsByAttributeValueMatching("hi!", "hi!");
        org.jsoup.nodes.Element element21 = document17.head();
        org.jsoup.nodes.Document.OutputSettings outputSettings22 = document17.outputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings23 = outputSettings22.clone();
        org.jsoup.nodes.Document document25 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements28 = document25.getElementsByAttributeValueMatching("hi!", "hi!");
        boolean boolean29 = document25.hasText();
        org.jsoup.nodes.Document document31 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element32 = document25.prependChild((org.jsoup.nodes.Node) document31);
        org.jsoup.nodes.Document.OutputSettings outputSettings33 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings34 = outputSettings33.clone();
        org.jsoup.nodes.Entities.EscapeMode escapeMode35 = outputSettings34.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings36 = outputSettings34.clone();
        org.jsoup.nodes.Document document37 = document25.outputSettings(outputSettings36);
        org.jsoup.nodes.Document.OutputSettings outputSettings38 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings39 = outputSettings38.clone();
        org.jsoup.nodes.Document.OutputSettings outputSettings40 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode41 = outputSettings40.escapeMode();
        int int42 = outputSettings40.indentAmount();
        org.jsoup.nodes.Entities.EscapeMode escapeMode43 = outputSettings40.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings44 = outputSettings39.escapeMode(escapeMode43);
        org.jsoup.nodes.Document.OutputSettings outputSettings45 = outputSettings36.escapeMode(escapeMode43);
        java.nio.charset.CharsetEncoder charsetEncoder46 = outputSettings36.encoder();
        org.jsoup.nodes.Entities.EscapeMode escapeMode47 = outputSettings36.escapeMode();
        java.nio.charset.Charset charset48 = outputSettings36.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings49 = outputSettings23.charset(charset48);
        org.jsoup.nodes.Document document50 = document13.outputSettings(outputSettings23);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document.OutputSettings outputSettings52 = outputSettings23.charset("<hi!></hi!>\n<#root></#root>\n<html>\n <head></head>\n <body></body>\n</html>");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: <hi!></hi!>?<#root></#root>?<html>? <head></head>? <body></body>?</html>");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(document7);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(outputSettings10);
        org.junit.Assert.assertTrue("'" + escapeMode11 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode11.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings12);
        org.junit.Assert.assertNotNull(document13);
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertNotNull(elements20);
        org.junit.Assert.assertNull(element21);
        org.junit.Assert.assertNotNull(outputSettings22);
        org.junit.Assert.assertNotNull(outputSettings23);
        org.junit.Assert.assertNotNull(elements28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(document31);
        org.junit.Assert.assertNotNull(element32);
        org.junit.Assert.assertNotNull(outputSettings34);
        org.junit.Assert.assertTrue("'" + escapeMode35 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode35.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings36);
        org.junit.Assert.assertNotNull(document37);
        org.junit.Assert.assertNotNull(outputSettings39);
        org.junit.Assert.assertTrue("'" + escapeMode41 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode41.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 1 + "'", int42 == 1);
        org.junit.Assert.assertTrue("'" + escapeMode43 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode43.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings44);
        org.junit.Assert.assertNotNull(outputSettings45);
        org.junit.Assert.assertNotNull(charsetEncoder46);
        org.junit.Assert.assertTrue("'" + escapeMode47 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode47.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset48);
        org.junit.Assert.assertNotNull(outputSettings49);
        org.junit.Assert.assertNotNull(document50);
    }

    @Test
    public void test0362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0362");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements4 = document1.getElementsByAttributeValueMatching("hi!", "hi!");
        boolean boolean5 = document1.hasText();
        org.jsoup.nodes.Element element7 = document1.append("");
        org.jsoup.select.Elements elements8 = document1.siblingElements();
        org.jsoup.nodes.Document document9 = document1.clone();
        java.lang.String str10 = document9.outerHtml();
        org.jsoup.nodes.Document document12 = new org.jsoup.nodes.Document("");
        boolean boolean13 = document12.isBlock();
        java.util.List<org.jsoup.nodes.DataNode> dataNodeList14 = document12.dataNodes();
        java.lang.String str16 = document12.attr("");
        org.jsoup.nodes.Document.QuirksMode quirksMode17 = org.jsoup.nodes.Document.QuirksMode.noQuirks;
        org.jsoup.nodes.Document document18 = document12.quirksMode(quirksMode17);
        org.jsoup.nodes.Document.OutputSettings outputSettings19 = document12.outputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings20 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings21 = outputSettings20.clone();
        org.jsoup.nodes.Document.OutputSettings outputSettings22 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode23 = outputSettings22.escapeMode();
        java.nio.charset.Charset charset24 = outputSettings22.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings25 = outputSettings21.charset(charset24);
        org.jsoup.nodes.Document.OutputSettings outputSettings26 = outputSettings19.charset(charset24);
        org.jsoup.nodes.Document.OutputSettings outputSettings27 = outputSettings26.clone();
        org.jsoup.nodes.Entities.EscapeMode escapeMode28 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings29 = outputSettings26.escapeMode(escapeMode28);
        org.jsoup.nodes.Document document30 = document9.outputSettings(outputSettings26);
        org.jsoup.select.Elements elements31 = document30.parents();
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(document9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(dataNodeList14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + quirksMode17 + "' != '" + org.jsoup.nodes.Document.QuirksMode.noQuirks + "'", quirksMode17.equals(org.jsoup.nodes.Document.QuirksMode.noQuirks));
        org.junit.Assert.assertNotNull(document18);
        org.junit.Assert.assertNotNull(outputSettings19);
        org.junit.Assert.assertNotNull(outputSettings21);
        org.junit.Assert.assertTrue("'" + escapeMode23 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode23.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset24);
        org.junit.Assert.assertNotNull(outputSettings25);
        org.junit.Assert.assertNotNull(outputSettings26);
        org.junit.Assert.assertNotNull(outputSettings27);
        org.junit.Assert.assertNotNull(outputSettings29);
        org.junit.Assert.assertNotNull(document30);
        org.junit.Assert.assertNotNull(elements31);
    }

    @Test
    public void test0363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0363");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = document1.textNodes();
        java.util.List<org.jsoup.nodes.TextNode> textNodeList3 = document1.textNodes();
        org.jsoup.nodes.Document.OutputSettings outputSettings4 = document1.outputSettings();
        org.jsoup.nodes.Document document5 = document1.clone();
        org.jsoup.nodes.Element element7 = document5.addClass("");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element9 = document5.getElementById("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertNotNull(textNodeList3);
        org.junit.Assert.assertNotNull(outputSettings4);
        org.junit.Assert.assertNotNull(document5);
        org.junit.Assert.assertNotNull(element7);
    }

    @Test
    public void test0364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0364");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean2 = document1.isBlock();
        java.util.List<org.jsoup.nodes.DataNode> dataNodeList3 = document1.dataNodes();
        java.lang.String str5 = document1.attr("");
        org.jsoup.nodes.Document.QuirksMode quirksMode6 = org.jsoup.nodes.Document.QuirksMode.noQuirks;
        org.jsoup.nodes.Document document7 = document1.quirksMode(quirksMode6);
        org.jsoup.nodes.Document document8 = document1.ownerDocument();
        org.jsoup.nodes.Document document10 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements13 = document10.getElementsByAttributeValueMatching("hi!", "hi!");
        java.lang.String[] strArray15 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet16 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet16, strArray15);
        org.jsoup.nodes.Element element18 = document10.classNames((java.util.Set<java.lang.String>) strSet16);
        org.jsoup.nodes.Element element19 = document8.classNames((java.util.Set<java.lang.String>) strSet16);
        org.jsoup.nodes.Document document21 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements24 = document21.getElementsByAttributeValueMatching("hi!", "hi!");
        java.lang.String[] strArray26 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet27 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet27, strArray26);
        org.jsoup.nodes.Element element29 = document21.classNames((java.util.Set<java.lang.String>) strSet27);
        boolean boolean30 = element19.equals((java.lang.Object) document21);
        org.jsoup.nodes.Element element31 = document21.head();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(dataNodeList3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + quirksMode6 + "' != '" + org.jsoup.nodes.Document.QuirksMode.noQuirks + "'", quirksMode6.equals(org.jsoup.nodes.Document.QuirksMode.noQuirks));
        org.junit.Assert.assertNotNull(document7);
        org.junit.Assert.assertNotNull(document8);
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertNotNull(elements24);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertArrayEquals(strArray26, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(element29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNull(element31);
    }

    @Test
    public void test0365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0365");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements4 = document1.getElementsByAttributeValueMatching("hi!", "hi!");
        org.jsoup.nodes.Document document5 = document1.clone();
        org.jsoup.select.Elements elements6 = document5.getAllElements();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node8 = document5.removeAttr("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNotNull(document5);
        org.junit.Assert.assertNotNull(elements6);
    }

    @Test
    public void test0366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0366");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean2 = document1.isBlock();
        java.util.List<org.jsoup.nodes.DataNode> dataNodeList3 = document1.dataNodes();
        java.lang.String str5 = document1.attr("");
        org.jsoup.nodes.Document.QuirksMode quirksMode6 = org.jsoup.nodes.Document.QuirksMode.noQuirks;
        org.jsoup.nodes.Document document7 = document1.quirksMode(quirksMode6);
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = document1.outputSettings();
        org.jsoup.nodes.Element element9 = document1.parent();
        org.jsoup.nodes.Element element11 = document1.html("hi!#document");
        java.lang.String str13 = element11.attr("<<hi!></hi!>></<hi!></hi!>>");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(dataNodeList3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + quirksMode6 + "' != '" + org.jsoup.nodes.Document.QuirksMode.noQuirks + "'", quirksMode6.equals(org.jsoup.nodes.Document.QuirksMode.noQuirks));
        org.junit.Assert.assertNotNull(document7);
        org.junit.Assert.assertNotNull(outputSettings8);
        org.junit.Assert.assertNull(element9);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test0367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0367");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = document1.textNodes();
        java.lang.String str3 = document1.toString();
        org.jsoup.nodes.Element element4 = document1.head();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = element4.hasClass("<hi!></hi!>");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(element4);
    }

    @Test
    public void test0368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0368");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean2 = document1.isBlock();
        java.util.List<org.jsoup.nodes.DataNode> dataNodeList3 = document1.dataNodes();
        java.lang.String str5 = document1.attr("");
        org.jsoup.nodes.Document.QuirksMode quirksMode6 = org.jsoup.nodes.Document.QuirksMode.noQuirks;
        org.jsoup.nodes.Document document7 = document1.quirksMode(quirksMode6);
        org.jsoup.nodes.Document.QuirksMode quirksMode8 = document1.quirksMode();
        org.jsoup.nodes.Element element9 = document1.previousElementSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element11 = element9.val("<hi!></hi!>\n<#root></#root>\n<html>\n <head></head>\n <body></body>\n</html>&lt;#root&gt;&lt;/#root&gt;");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(dataNodeList3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + quirksMode6 + "' != '" + org.jsoup.nodes.Document.QuirksMode.noQuirks + "'", quirksMode6.equals(org.jsoup.nodes.Document.QuirksMode.noQuirks));
        org.junit.Assert.assertNotNull(document7);
        org.junit.Assert.assertTrue("'" + quirksMode8 + "' != '" + org.jsoup.nodes.Document.QuirksMode.noQuirks + "'", quirksMode8.equals(org.jsoup.nodes.Document.QuirksMode.noQuirks));
        org.junit.Assert.assertNull(element9);
    }

    @Test
    public void test0369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0369");
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
        java.util.regex.Pattern pattern20 = null;
        org.jsoup.select.Elements elements21 = document1.getElementsByAttributeValueMatching("hi!", pattern20);
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(document7);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertNull(element16);
        org.junit.Assert.assertNotNull(outputSettings17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(elements21);
    }

    @Test
    public void test0370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0370");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements4 = document1.getElementsByAttributeValueMatching("hi!", "hi!");
        boolean boolean5 = document1.hasText();
        org.jsoup.nodes.Document document7 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element8 = document1.prependChild((org.jsoup.nodes.Node) document7);
        org.jsoup.nodes.Element element10 = document1.append("<#root>\n <html>\n  <head></head>\n  <body></body>\n </html>\n</#root>");
        org.jsoup.nodes.Element element13 = element10.attr("<#root>\n <html>\n  <head></head>\n  <body></body>\n </html>\n</#root>", "hi!");
        org.jsoup.select.Elements elements16 = element13.getElementsByAttributeValueNot("&lt;#root&gt;\n<!--#root-->", "<#root class=\"hi!\"></#root>\n<#root></#root>");
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(document7);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(elements16);
    }

    @Test
    public void test0371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0371");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean2 = document1.isBlock();
        org.jsoup.nodes.Element element4 = document1.html("hi!");
        java.util.Set<java.lang.String> strSet5 = element4.classNames();
        org.jsoup.nodes.Element element6 = element4.empty();
        org.jsoup.nodes.Element element7 = element6.previousElementSibling();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNull(element7);
    }

    @Test
    public void test0372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0372");
        org.jsoup.nodes.Document.OutputSettings outputSettings0 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings1 = outputSettings0.clone();
        org.jsoup.nodes.Document.OutputSettings outputSettings2 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode3 = outputSettings2.escapeMode();
        int int4 = outputSettings2.indentAmount();
        org.jsoup.nodes.Entities.EscapeMode escapeMode5 = outputSettings2.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings6 = outputSettings1.escapeMode(escapeMode5);
        org.jsoup.nodes.Document document8 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements11 = document8.getElementsByAttributeValueMatching("hi!", "hi!");
        boolean boolean12 = document8.hasText();
        org.jsoup.nodes.Document document14 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element15 = document8.prependChild((org.jsoup.nodes.Node) document14);
        org.jsoup.nodes.Document.OutputSettings outputSettings16 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings17 = outputSettings16.clone();
        org.jsoup.nodes.Entities.EscapeMode escapeMode18 = outputSettings17.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings19 = outputSettings17.clone();
        org.jsoup.nodes.Document document20 = document8.outputSettings(outputSettings19);
        org.jsoup.nodes.Document.OutputSettings outputSettings21 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings22 = outputSettings21.clone();
        org.jsoup.nodes.Document.OutputSettings outputSettings23 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode24 = outputSettings23.escapeMode();
        int int25 = outputSettings23.indentAmount();
        org.jsoup.nodes.Entities.EscapeMode escapeMode26 = outputSettings23.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings27 = outputSettings22.escapeMode(escapeMode26);
        org.jsoup.nodes.Document.OutputSettings outputSettings28 = outputSettings19.escapeMode(escapeMode26);
        org.jsoup.nodes.Document.OutputSettings outputSettings29 = outputSettings6.escapeMode(escapeMode26);
        org.jsoup.nodes.Document.OutputSettings outputSettings31 = outputSettings6.prettyPrint(true);
        org.jsoup.nodes.Document.OutputSettings outputSettings32 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode33 = outputSettings32.escapeMode();
        java.nio.charset.Charset charset34 = outputSettings32.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings35 = outputSettings32.clone();
        org.jsoup.nodes.Document.OutputSettings outputSettings36 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode37 = outputSettings36.escapeMode();
        java.nio.charset.Charset charset38 = outputSettings36.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings39 = outputSettings36.clone();
        org.jsoup.nodes.Document.OutputSettings outputSettings40 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode41 = outputSettings40.escapeMode();
        int int42 = outputSettings40.indentAmount();
        org.jsoup.nodes.Entities.EscapeMode escapeMode43 = outputSettings40.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings44 = outputSettings36.escapeMode(escapeMode43);
        org.jsoup.nodes.Document.OutputSettings outputSettings45 = outputSettings32.escapeMode(escapeMode43);
        org.jsoup.nodes.Document.OutputSettings outputSettings46 = outputSettings6.escapeMode(escapeMode43);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document.OutputSettings outputSettings48 = outputSettings6.indentAmount((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must be true");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(outputSettings1);
        org.junit.Assert.assertTrue("'" + escapeMode3 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode3.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + escapeMode5 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode5.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings6);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(document14);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(outputSettings17);
        org.junit.Assert.assertTrue("'" + escapeMode18 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode18.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings19);
        org.junit.Assert.assertNotNull(document20);
        org.junit.Assert.assertNotNull(outputSettings22);
        org.junit.Assert.assertTrue("'" + escapeMode24 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode24.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertTrue("'" + escapeMode26 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode26.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings27);
        org.junit.Assert.assertNotNull(outputSettings28);
        org.junit.Assert.assertNotNull(outputSettings29);
        org.junit.Assert.assertNotNull(outputSettings31);
        org.junit.Assert.assertTrue("'" + escapeMode33 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode33.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset34);
        org.junit.Assert.assertNotNull(outputSettings35);
        org.junit.Assert.assertTrue("'" + escapeMode37 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode37.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset38);
        org.junit.Assert.assertNotNull(outputSettings39);
        org.junit.Assert.assertTrue("'" + escapeMode41 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode41.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 1 + "'", int42 == 1);
        org.junit.Assert.assertTrue("'" + escapeMode43 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode43.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings44);
        org.junit.Assert.assertNotNull(outputSettings45);
        org.junit.Assert.assertNotNull(outputSettings46);
    }

    @Test
    public void test0373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0373");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean2 = document1.isBlock();
        org.jsoup.nodes.Element element4 = document1.toggleClass("hi!");
        org.jsoup.nodes.Attributes attributes5 = element4.attributes();
        org.jsoup.nodes.Element element7 = element4.appendElement("<hi!></hi!>");
        org.jsoup.nodes.Element element9 = element4.tagName(" hi!");
        int int10 = element4.siblingIndex();
        org.jsoup.nodes.Element element12 = element4.html("<hi!></hi!>");
        org.jsoup.nodes.Element element14 = element4.addClass("");
        org.jsoup.nodes.Node node16 = element14.removeAttr("<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(attributes5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(node16);
    }

    @Test
    public void test0374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0374");
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
        org.jsoup.parser.Tag tag19 = document1.tag();
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(document7);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(document13);
        org.junit.Assert.assertNotNull(textNodeList14);
        org.junit.Assert.assertNotNull(outputSettings15);
        org.junit.Assert.assertNotNull(document16);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNotNull(tag19);
    }

    @Test
    public void test0375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0375");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements2 = document1.parents();
        org.jsoup.nodes.Document document3 = document1.clone();
        java.lang.String str4 = document3.text();
        org.jsoup.nodes.Element element6 = document3.prependElement("<#root></#root>\n<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.nodes.Document document8 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.nodes.Element element10 = document8.append("");
        org.jsoup.nodes.Element element12 = document8.toggleClass("");
        org.jsoup.nodes.Node node13 = document8.nextSibling();
        org.jsoup.nodes.Element element15 = document8.prependElement("<#root>\n <html>\n  <head></head>\n  <body></body>\n </html>\n</#root>");
        java.lang.String str16 = element15.text();
        org.jsoup.nodes.Document document18 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements21 = document18.getElementsByAttributeValueMatching("hi!", "hi!");
        boolean boolean22 = document18.hasText();
        org.jsoup.nodes.Document document24 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element25 = document18.prependChild((org.jsoup.nodes.Node) document24);
        org.jsoup.nodes.Document.OutputSettings outputSettings26 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings27 = outputSettings26.clone();
        org.jsoup.nodes.Entities.EscapeMode escapeMode28 = outputSettings27.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings29 = outputSettings27.clone();
        org.jsoup.nodes.Document document30 = document18.outputSettings(outputSettings29);
        element15.replaceWith((org.jsoup.nodes.Node) document18);
        // The following exception was thrown during execution in test generation
        try {
            document3.replaceWith((org.jsoup.nodes.Node) element15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements2);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(document8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(elements21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(document24);
        org.junit.Assert.assertNotNull(element25);
        org.junit.Assert.assertNotNull(outputSettings27);
        org.junit.Assert.assertTrue("'" + escapeMode28 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode28.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings29);
        org.junit.Assert.assertNotNull(document30);
    }

    @Test
    public void test0376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0376");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean2 = document1.isBlock();
        java.util.List<org.jsoup.nodes.DataNode> dataNodeList3 = document1.dataNodes();
        java.lang.String str5 = document1.attr("");
        org.jsoup.nodes.Document.QuirksMode quirksMode6 = org.jsoup.nodes.Document.QuirksMode.noQuirks;
        org.jsoup.nodes.Document document7 = document1.quirksMode(quirksMode6);
        org.jsoup.nodes.Document document8 = document1.ownerDocument();
        org.jsoup.nodes.Document document10 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements13 = document10.getElementsByAttributeValueMatching("hi!", "hi!");
        java.lang.String[] strArray15 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet16 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet16, strArray15);
        org.jsoup.nodes.Element element18 = document10.classNames((java.util.Set<java.lang.String>) strSet16);
        org.jsoup.nodes.Element element19 = document8.classNames((java.util.Set<java.lang.String>) strSet16);
        java.lang.String str20 = element19.className();
        org.jsoup.select.Elements elements23 = element19.getElementsByAttributeValueEnding("<<#root>\n <html>\n  <head></head>\n  <body></body>\n </html>\n</#root>></<#root>\n <html>\n  <head></head>\n  <body></body>\n </html>\n</#root>>", " hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(dataNodeList3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + quirksMode6 + "' != '" + org.jsoup.nodes.Document.QuirksMode.noQuirks + "'", quirksMode6.equals(org.jsoup.nodes.Document.QuirksMode.noQuirks));
        org.junit.Assert.assertNotNull(document7);
        org.junit.Assert.assertNotNull(document8);
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertNotNull(elements23);
    }

    @Test
    public void test0377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0377");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str2 = document1.nodeName();
        org.jsoup.nodes.Element element4 = document1.prependElement("<#root></#root>");
        org.jsoup.nodes.Element element6 = element4.prepend("#root");
        org.jsoup.select.Elements elements8 = element4.getElementsByClass("<#root>");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#document" + "'", str2, "#document");
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(elements8);
    }

    @Test
    public void test0378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0378");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = document1.textNodes();
        org.jsoup.nodes.Element element4 = document1.prependElement("hi!");
        org.jsoup.nodes.Document.OutputSettings outputSettings5 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings6 = outputSettings5.clone();
        org.jsoup.nodes.Document.OutputSettings outputSettings7 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode8 = outputSettings7.escapeMode();
        java.nio.charset.Charset charset9 = outputSettings7.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = outputSettings6.charset(charset9);
        java.lang.Class<?> wildcardClass11 = outputSettings10.getClass();
        boolean boolean12 = element4.equals((java.lang.Object) outputSettings10);
        org.jsoup.nodes.Element element14 = element4.prependText("#root");
        org.jsoup.nodes.Element element16 = element14.prepend("#root");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements18 = element16.select("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(outputSettings6);
        org.junit.Assert.assertTrue("'" + escapeMode8 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode8.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset9);
        org.junit.Assert.assertNotNull(outputSettings10);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(element16);
    }

    @Test
    public void test0379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0379");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements4 = document1.getElementsByAttributeValueMatching("hi!", "hi!");
        boolean boolean5 = document1.hasText();
        org.jsoup.nodes.Document document7 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element8 = document1.prependChild((org.jsoup.nodes.Node) document7);
        org.jsoup.nodes.Node node9 = element8.nextSibling();
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(document7);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNull(node9);
    }

    @Test
    public void test0380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0380");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.nodes.Element element3 = document1.append("");
        org.jsoup.nodes.Element element5 = document1.html("<#root></#root>");
        org.jsoup.nodes.Element element6 = document1.body();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements8 = element6.getElementsMatchingOwnText("<hi!></hi!>");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNull(element6);
    }

    @Test
    public void test0381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0381");
        org.jsoup.nodes.Document.OutputSettings outputSettings0 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings1 = outputSettings0.clone();
        org.jsoup.nodes.Document.OutputSettings outputSettings3 = outputSettings0.indentAmount((int) (byte) 100);
        org.jsoup.nodes.Entities.EscapeMode escapeMode4 = outputSettings3.escapeMode();
        java.nio.charset.CharsetEncoder charsetEncoder5 = outputSettings3.encoder();
        org.jsoup.nodes.Document document7 = new org.jsoup.nodes.Document("");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList8 = document7.textNodes();
        java.util.Set<java.lang.String> strSet9 = document7.classNames();
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = outputSettings10.clone();
        org.jsoup.nodes.Document.OutputSettings outputSettings13 = outputSettings10.indentAmount((int) (byte) 100);
        org.jsoup.nodes.Document document14 = document7.outputSettings(outputSettings13);
        java.nio.charset.Charset charset15 = outputSettings13.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings16 = outputSettings3.charset(charset15);
        org.jsoup.nodes.Document.OutputSettings outputSettings18 = outputSettings3.prettyPrint(false);
        org.junit.Assert.assertNotNull(outputSettings1);
        org.junit.Assert.assertNotNull(outputSettings3);
        org.junit.Assert.assertTrue("'" + escapeMode4 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode4.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charsetEncoder5);
        org.junit.Assert.assertNotNull(textNodeList8);
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertNotNull(outputSettings11);
        org.junit.Assert.assertNotNull(outputSettings13);
        org.junit.Assert.assertNotNull(document14);
        org.junit.Assert.assertNotNull(charset15);
        org.junit.Assert.assertNotNull(outputSettings16);
        org.junit.Assert.assertNotNull(outputSettings18);
    }

    @Test
    public void test0382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0382");
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
        org.jsoup.nodes.Element element23 = document1.html("<#root>");
        org.jsoup.select.Elements elements26 = document1.getElementsByAttributeValueNot("<hi!>\n #root\n</hi!>", "<#root></#root>\n<hi!></hi!>");
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(document7);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "<#root>\n <html>\n  <head></head>\n  <body></body>\n </html>\n</#root>" + "'", str20, "<#root>\n <html>\n  <head></head>\n  <body></body>\n </html>\n</#root>");
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertNotNull(elements26);
    }

    @Test
    public void test0383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0383");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.nodes.Element element3 = document1.append("");
        org.jsoup.nodes.Element element5 = element3.html("hi!");
        java.lang.String str6 = element5.val();
        java.lang.String str7 = element5.toString();
        org.jsoup.nodes.Element element9 = element5.append("#document");
        java.lang.String str10 = element5.data();
        java.util.List<org.jsoup.nodes.TextNode> textNodeList11 = element5.textNodes();
        java.lang.Object obj12 = null;
        boolean boolean13 = element5.equals(obj12);
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(textNodeList11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0384");
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
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(elements26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(document29);
        org.junit.Assert.assertNotNull(element30);
        org.junit.Assert.assertNotNull(elements33);
        org.junit.Assert.assertNotNull(element35);
        org.junit.Assert.assertNotNull(textNodeList38);
        org.junit.Assert.assertNotNull(elements39);
        org.junit.Assert.assertNotNull(elements44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(element47);
        org.junit.Assert.assertNotNull(element48);
        org.junit.Assert.assertNotNull(node50);
        org.junit.Assert.assertTrue("'" + escapeMode52 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode52.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset53);
        org.junit.Assert.assertNotNull(document54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNull(element56);
        org.junit.Assert.assertNotNull(element58);
        org.junit.Assert.assertNotNull(element59);
        org.junit.Assert.assertNull(element62);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(element64);
    }

    @Test
    public void test0385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0385");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = document1.textNodes();
        org.jsoup.nodes.Element element4 = document1.prependElement("hi!");
        org.jsoup.nodes.Element element6 = document1.html("hi!");
        java.lang.String str7 = element6.data();
        org.jsoup.nodes.Element element9 = element6.prependText("<hi!></hi!>");
        java.lang.String str11 = element9.attr("<<#root>\n <html>\n  <head></head>\n  <body></body>\n </html>\n</#root>></<#root>\n <html>\n  <head></head>\n  <body></body>\n </html>\n</#root>>");
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test0386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0386");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements4 = document1.getElementsByAttributeValueMatching("hi!", "hi!");
        boolean boolean5 = document1.hasText();
        org.jsoup.nodes.Document document7 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element8 = document1.prependChild((org.jsoup.nodes.Node) document7);
        org.jsoup.select.Elements elements11 = document7.getElementsByAttributeValueStarting("<#root>\n <html>\n  <head></head>\n  <body></body>\n </html>\n</#root>", "<#root></#root>");
        org.jsoup.nodes.Element element13 = document7.before("#root");
        org.jsoup.nodes.Document document15 = new org.jsoup.nodes.Document("");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList16 = document15.textNodes();
        org.jsoup.select.Elements elements17 = document15.getAllElements();
        org.jsoup.nodes.Document document19 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements22 = document19.getElementsByAttributeValueMatching("hi!", "hi!");
        boolean boolean23 = document19.hasText();
        org.jsoup.nodes.Element element25 = document19.append("");
        org.jsoup.nodes.Element element26 = document15.appendChild((org.jsoup.nodes.Node) document19);
        org.jsoup.nodes.Node node28 = document15.removeAttr("hi!");
        org.jsoup.nodes.Document.OutputSettings outputSettings29 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode30 = outputSettings29.escapeMode();
        java.nio.charset.Charset charset31 = outputSettings29.charset();
        org.jsoup.nodes.Document document32 = document15.outputSettings(outputSettings29);
        boolean boolean33 = element13.equals((java.lang.Object) outputSettings29);
        java.nio.charset.Charset charset34 = outputSettings29.charset();
        org.jsoup.nodes.Document document36 = new org.jsoup.nodes.Document("");
        boolean boolean37 = document36.isBlock();
        java.util.List<org.jsoup.nodes.DataNode> dataNodeList38 = document36.dataNodes();
        java.lang.String str40 = document36.attr("");
        org.jsoup.nodes.Document.QuirksMode quirksMode41 = org.jsoup.nodes.Document.QuirksMode.noQuirks;
        org.jsoup.nodes.Document document42 = document36.quirksMode(quirksMode41);
        org.jsoup.nodes.Document.OutputSettings outputSettings43 = document36.outputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings44 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings45 = outputSettings44.clone();
        org.jsoup.nodes.Document.OutputSettings outputSettings46 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode47 = outputSettings46.escapeMode();
        java.nio.charset.Charset charset48 = outputSettings46.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings49 = outputSettings45.charset(charset48);
        org.jsoup.nodes.Document.OutputSettings outputSettings50 = outputSettings43.charset(charset48);
        org.jsoup.nodes.Document.OutputSettings outputSettings51 = outputSettings50.clone();
        org.jsoup.nodes.Document document53 = new org.jsoup.nodes.Document("");
        boolean boolean54 = document53.isBlock();
        java.util.List<org.jsoup.nodes.DataNode> dataNodeList55 = document53.dataNodes();
        java.lang.String str57 = document53.attr("");
        org.jsoup.nodes.Document.QuirksMode quirksMode58 = org.jsoup.nodes.Document.QuirksMode.noQuirks;
        org.jsoup.nodes.Document document59 = document53.quirksMode(quirksMode58);
        org.jsoup.nodes.Document.OutputSettings outputSettings60 = document53.outputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings61 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings62 = outputSettings61.clone();
        org.jsoup.nodes.Document.OutputSettings outputSettings63 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode64 = outputSettings63.escapeMode();
        java.nio.charset.Charset charset65 = outputSettings63.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings66 = outputSettings62.charset(charset65);
        org.jsoup.nodes.Document.OutputSettings outputSettings67 = outputSettings60.charset(charset65);
        org.jsoup.nodes.Document.OutputSettings outputSettings68 = outputSettings50.charset(charset65);
        org.jsoup.nodes.Document.OutputSettings outputSettings69 = outputSettings29.charset(charset65);
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(document7);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(textNodeList16);
        org.junit.Assert.assertNotNull(elements17);
        org.junit.Assert.assertNotNull(elements22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(element25);
        org.junit.Assert.assertNotNull(element26);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertTrue("'" + escapeMode30 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode30.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset31);
        org.junit.Assert.assertNotNull(document32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(charset34);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(dataNodeList38);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertTrue("'" + quirksMode41 + "' != '" + org.jsoup.nodes.Document.QuirksMode.noQuirks + "'", quirksMode41.equals(org.jsoup.nodes.Document.QuirksMode.noQuirks));
        org.junit.Assert.assertNotNull(document42);
        org.junit.Assert.assertNotNull(outputSettings43);
        org.junit.Assert.assertNotNull(outputSettings45);
        org.junit.Assert.assertTrue("'" + escapeMode47 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode47.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset48);
        org.junit.Assert.assertNotNull(outputSettings49);
        org.junit.Assert.assertNotNull(outputSettings50);
        org.junit.Assert.assertNotNull(outputSettings51);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(dataNodeList55);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "" + "'", str57, "");
        org.junit.Assert.assertTrue("'" + quirksMode58 + "' != '" + org.jsoup.nodes.Document.QuirksMode.noQuirks + "'", quirksMode58.equals(org.jsoup.nodes.Document.QuirksMode.noQuirks));
        org.junit.Assert.assertNotNull(document59);
        org.junit.Assert.assertNotNull(outputSettings60);
        org.junit.Assert.assertNotNull(outputSettings62);
        org.junit.Assert.assertTrue("'" + escapeMode64 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode64.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset65);
        org.junit.Assert.assertNotNull(outputSettings66);
        org.junit.Assert.assertNotNull(outputSettings67);
        org.junit.Assert.assertNotNull(outputSettings68);
        org.junit.Assert.assertNotNull(outputSettings69);
    }

    @Test
    public void test0387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0387");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements4 = document1.getElementsByAttributeValueMatching("hi!", "hi!");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet7 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet7, strArray6);
        org.jsoup.nodes.Element element9 = document1.classNames((java.util.Set<java.lang.String>) strSet7);
        org.jsoup.nodes.Document document10 = document1.clone();
        java.lang.String str11 = document1.ownText();
        org.jsoup.nodes.Element element13 = document1.val("");
        org.jsoup.nodes.Element element14 = document1.parent();
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(document10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNull(element14);
    }

    @Test
    public void test0388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0388");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean2 = document1.isBlock();
        org.jsoup.nodes.Element element4 = document1.toggleClass("hi!");
        org.jsoup.nodes.Attributes attributes5 = element4.attributes();
        org.jsoup.nodes.Element element7 = element4.appendElement("<hi!></hi!>");
        org.jsoup.nodes.Element element9 = element4.tagName(" hi!");
        org.jsoup.select.NodeVisitor nodeVisitor10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node11 = element4.traverse(nodeVisitor10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(attributes5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(element9);
    }

    @Test
    public void test0389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0389");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = document1.textNodes();
        org.jsoup.nodes.Element element4 = document1.prependElement("hi!");
        java.lang.String str5 = element4.id();
        java.util.List<org.jsoup.nodes.DataNode> dataNodeList6 = element4.dataNodes();
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(dataNodeList6);
    }

    @Test
    public void test0390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0390");
        org.jsoup.nodes.Document.OutputSettings outputSettings0 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode1 = outputSettings0.escapeMode();
        java.nio.charset.Charset charset2 = outputSettings0.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings3 = outputSettings0.clone();
        int int4 = outputSettings0.indentAmount();
        boolean boolean5 = outputSettings0.prettyPrint();
        org.jsoup.nodes.Document.OutputSettings outputSettings6 = outputSettings0.clone();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document.OutputSettings outputSettings8 = outputSettings6.charset("hi!");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: hi!");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + escapeMode1 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode1.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset2);
        org.junit.Assert.assertNotNull(outputSettings3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(outputSettings6);
    }

    @Test
    public void test0391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0391");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements4 = document1.getElementsByAttributeValueMatching("hi!", "hi!");
        boolean boolean5 = document1.hasText();
        org.jsoup.nodes.Document document7 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element8 = document1.prependChild((org.jsoup.nodes.Node) document7);
        org.jsoup.select.Elements elements11 = document7.getElementsByAttributeValueStarting("<#root>\n <html>\n  <head></head>\n  <body></body>\n </html>\n</#root>", "<#root></#root>");
        org.jsoup.nodes.Element element13 = document7.getElementById("<hi!></hi!>");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = element13.className();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(document7);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNull(element13);
    }

    @Test
    public void test0392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0392");
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
        java.lang.String str36 = element35.baseUri();
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(document7);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertNotNull(elements17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertNotNull(elements23);
        org.junit.Assert.assertNotNull(outputSettings25);
        org.junit.Assert.assertTrue("'" + escapeMode27 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode27.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset28);
        org.junit.Assert.assertNotNull(outputSettings29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(document31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertNotNull(element34);
        org.junit.Assert.assertNotNull(element35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
    }

    @Test
    public void test0393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0393");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("<<#root>\n <html>\n  <head></head>\n  <body></body>\n </html>\n</#root>></<#root>\n <html>\n  <head></head>\n  <body></body>\n </html>\n</#root>>");
        java.lang.String str2 = document1.ownText();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test0394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0394");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.nodes.Element element3 = document1.append("");
        org.jsoup.nodes.Element element5 = element3.html("hi!");
        org.jsoup.nodes.Element element7 = element5.val("<#root>");
        int int8 = element5.siblingIndex();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0395");
        org.jsoup.nodes.Document.OutputSettings outputSettings0 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode1 = outputSettings0.escapeMode();
        java.nio.charset.Charset charset2 = outputSettings0.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings3 = outputSettings0.clone();
        org.jsoup.nodes.Document.OutputSettings outputSettings4 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode5 = outputSettings4.escapeMode();
        java.nio.charset.Charset charset6 = outputSettings4.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings7 = outputSettings4.clone();
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode9 = outputSettings8.escapeMode();
        int int10 = outputSettings8.indentAmount();
        org.jsoup.nodes.Entities.EscapeMode escapeMode11 = outputSettings8.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings12 = outputSettings4.escapeMode(escapeMode11);
        org.jsoup.nodes.Document.OutputSettings outputSettings13 = outputSettings0.escapeMode(escapeMode11);
        java.nio.charset.CharsetEncoder charsetEncoder14 = outputSettings0.encoder();
        org.junit.Assert.assertTrue("'" + escapeMode1 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode1.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset2);
        org.junit.Assert.assertNotNull(outputSettings3);
        org.junit.Assert.assertTrue("'" + escapeMode5 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode5.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset6);
        org.junit.Assert.assertNotNull(outputSettings7);
        org.junit.Assert.assertTrue("'" + escapeMode9 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode9.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + escapeMode11 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode11.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings12);
        org.junit.Assert.assertNotNull(outputSettings13);
        org.junit.Assert.assertNotNull(charsetEncoder14);
    }

    @Test
    public void test0396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0396");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = document1.textNodes();
        org.jsoup.select.Elements elements3 = document1.getAllElements();
        org.jsoup.nodes.Document document5 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements8 = document5.getElementsByAttributeValueMatching("hi!", "hi!");
        boolean boolean9 = document5.hasText();
        org.jsoup.nodes.Element element11 = document5.append("");
        org.jsoup.nodes.Element element12 = document1.appendChild((org.jsoup.nodes.Node) document5);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements14 = element12.select("<#root></#root>\n<html>\n <head></head>\n <body></body>\n</html>");
            org.junit.Assert.fail("Expected exception of type org.jsoup.select.Selector.SelectorParseException; message: Could not parse query '<#root></#root>?<html>? <head></head>? <body></body>?</html>': unexpected token at '<#root></#root>?<html>? <head></head>? <body></body>?</html>'");
        } catch (org.jsoup.select.Selector.SelectorParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(element12);
    }

    @Test
    public void test0397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0397");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements4 = document1.getElementsByAttributeValueMatching("hi!", "hi!");
        boolean boolean5 = document1.hasText();
        org.jsoup.nodes.Document document7 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element8 = document1.prependChild((org.jsoup.nodes.Node) document7);
        org.jsoup.nodes.Element element10 = document1.append("<#root>\n <html>\n  <head></head>\n  <body></body>\n </html>\n</#root>");
        int int11 = document1.siblingIndex();
        java.util.regex.Pattern pattern12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements13 = document1.getElementsMatchingOwnText(pattern12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(document7);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test0398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0398");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node63 = element62.previousSibling();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(elements26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(document29);
        org.junit.Assert.assertNotNull(element30);
        org.junit.Assert.assertNotNull(elements33);
        org.junit.Assert.assertNotNull(element35);
        org.junit.Assert.assertNotNull(textNodeList38);
        org.junit.Assert.assertNotNull(elements39);
        org.junit.Assert.assertNotNull(elements44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(element47);
        org.junit.Assert.assertNotNull(element48);
        org.junit.Assert.assertNotNull(node50);
        org.junit.Assert.assertTrue("'" + escapeMode52 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode52.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset53);
        org.junit.Assert.assertNotNull(document54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNull(element56);
        org.junit.Assert.assertNotNull(element58);
        org.junit.Assert.assertNotNull(element59);
        org.junit.Assert.assertNull(element62);
    }

    @Test
    public void test0399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0399");
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
        org.jsoup.select.NodeVisitor nodeVisitor15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node16 = document12.traverse(nodeVisitor15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNotNull(document5);
        org.junit.Assert.assertNotNull(document6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(document9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + quirksMode11 + "' != '" + org.jsoup.nodes.Document.QuirksMode.limitedQuirks + "'", quirksMode11.equals(org.jsoup.nodes.Document.QuirksMode.limitedQuirks));
        org.junit.Assert.assertNotNull(document12);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(nodeList14);
    }

    @Test
    public void test0400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0400");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.nodes.Element element3 = document1.append("");
        org.jsoup.nodes.Element element5 = document1.toggleClass("");
        org.jsoup.nodes.Node node6 = document1.nextSibling();
        java.lang.String str7 = document1.ownText();
        org.jsoup.nodes.Element element9 = document1.appendText("<#root>");
        org.jsoup.nodes.Node node10 = element9.previousSibling();
        java.lang.String str11 = element9.val();
        org.jsoup.nodes.Node node13 = element9.childNode((int) (short) 0);
        org.jsoup.nodes.Node node14 = node13.previousSibling();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNull(node14);
    }

    @Test
    public void test0401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0401");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean2 = document1.isBlock();
        java.util.List<org.jsoup.nodes.DataNode> dataNodeList3 = document1.dataNodes();
        java.lang.String str5 = document1.attr("");
        java.lang.String str6 = document1.text();
        java.util.Set<java.lang.String> strSet7 = document1.classNames();
        org.jsoup.select.Elements elements9 = document1.getElementsMatchingText("<#root></#root>");
        java.util.List<org.jsoup.nodes.DataNode> dataNodeList10 = document1.dataNodes();
        org.jsoup.nodes.Node node11 = document1.nextSibling();
        java.lang.String str12 = document1.className();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(dataNodeList3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertNotNull(dataNodeList10);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test0402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0402");
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
        org.jsoup.select.Elements elements22 = document14.getElementsByAttributeValueEnding("<<#root>\n <html>\n  <head></head>\n  <body></body>\n </html>\n</#root>></<#root>\n <html>\n  <head></head>\n  <body></body>\n </html>\n</#root>>", "&lt;#root&gt;\n<!--#root-->&lt;#root&gt;\n<!--#root-->");
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "<#root></#root>" + "'", str13, "<#root></#root>");
        org.junit.Assert.assertNotNull(document14);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "<#root></#root>\n<hi!></hi!>" + "'", str19, "<#root></#root>\n<hi!></hi!>");
        org.junit.Assert.assertNotNull(elements22);
    }

    @Test
    public void test0403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0403");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements4 = document1.getElementsByAttributeValueMatching("hi!", "hi!");
        boolean boolean5 = document1.hasText();
        org.jsoup.nodes.Document document7 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element8 = document1.prependChild((org.jsoup.nodes.Node) document7);
        org.jsoup.nodes.Element element10 = document1.append("<#root>\n <html>\n  <head></head>\n  <body></body>\n </html>\n</#root>");
        org.jsoup.nodes.Element element13 = element10.attr("<#root>\n <html>\n  <head></head>\n  <body></body>\n </html>\n</#root>", "hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element15 = element13.after("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(document7);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element13);
    }

    @Test
    public void test0404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0404");
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
        org.jsoup.nodes.Element element15 = document13.tagName("#document");
        org.jsoup.select.Elements elements18 = element15.getElementsByAttributeValue("#document", "<hi!></hi!>\n<#root></#root>\n<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(dataNodeList3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + quirksMode6 + "' != '" + org.jsoup.nodes.Document.QuirksMode.noQuirks + "'", quirksMode6.equals(org.jsoup.nodes.Document.QuirksMode.noQuirks));
        org.junit.Assert.assertNotNull(document7);
        org.junit.Assert.assertNotNull(document8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(outputSettings11);
        org.junit.Assert.assertTrue("'" + escapeMode12 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode12.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(document13);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(elements18);
    }

    @Test
    public void test0405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0405");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = document1.textNodes();
        org.jsoup.nodes.Element element4 = document1.prependElement("hi!");
        org.jsoup.nodes.Document.OutputSettings outputSettings5 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings6 = outputSettings5.clone();
        org.jsoup.nodes.Document.OutputSettings outputSettings7 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode8 = outputSettings7.escapeMode();
        java.nio.charset.Charset charset9 = outputSettings7.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = outputSettings6.charset(charset9);
        java.lang.Class<?> wildcardClass11 = outputSettings10.getClass();
        boolean boolean12 = element4.equals((java.lang.Object) outputSettings10);
        org.jsoup.nodes.Element element14 = element4.prependText("#root");
        java.lang.String str15 = element4.tagName();
        org.jsoup.select.Elements elements17 = element4.getElementsByTag("<#root class=\"hi!\"></#root>\n<#root></#root>");
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(outputSettings6);
        org.junit.Assert.assertTrue("'" + escapeMode8 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode8.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset9);
        org.junit.Assert.assertNotNull(outputSettings10);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(elements17);
    }

    @Test
    public void test0406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0406");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements4 = document1.getElementsByAttributeValueMatching("hi!", "hi!");
        boolean boolean5 = document1.hasText();
        org.jsoup.nodes.Document document7 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element8 = document1.prependChild((org.jsoup.nodes.Node) document7);
        org.jsoup.nodes.Element element10 = document1.append("<#root>\n <html>\n  <head></head>\n  <body></body>\n </html>\n</#root>");
        org.jsoup.nodes.Element element13 = element10.attr("<#root>\n <html>\n  <head></head>\n  <body></body>\n </html>\n</#root>", "hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element15 = element13.child((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(document7);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element13);
    }

    @Test
    public void test0407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0407");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str2 = document1.nodeName();
        org.jsoup.nodes.Element element4 = document1.prependElement("<#root></#root>");
        org.jsoup.nodes.Element element6 = element4.prepend("#root");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element8 = element6.getElementById("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#document" + "'", str2, "#document");
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element6);
    }

    @Test
    public void test0408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0408");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element31 = element29.after("<<hi!></hi!>></<hi!></hi!>>");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertNotNull(elements18);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertArrayEquals(strArray20, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertNotNull(document24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(elements28);
        org.junit.Assert.assertNotNull(element29);
    }

    @Test
    public void test0409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0409");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements4 = document1.getElementsByAttributeValueMatching("hi!", "hi!");
        boolean boolean5 = document1.hasText();
        org.jsoup.select.Elements elements8 = document1.getElementsByAttributeValueContaining("hi!", "hi!");
        org.jsoup.nodes.Element element10 = document1.append("<#root>\n <html>\n  <head></head>\n  <body></body>\n </html>\n</#root>");
        java.lang.Integer int11 = document1.elementSiblingIndex();
        org.jsoup.nodes.Document document12 = document1.clone();
        org.jsoup.nodes.Element element14 = document12.createElement("#root");
        org.jsoup.nodes.Document.OutputSettings outputSettings15 = document12.outputSettings();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document.OutputSettings outputSettings17 = outputSettings15.charset("<hi!></hi!>\n<#root></#root>\n<html>\n <head></head>\n <body></body>\n</html>");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: <hi!></hi!>?<#root></#root>?<html>? <head></head>? <body></body>?</html>");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(document12);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(outputSettings15);
    }

    @Test
    public void test0410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0410");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements4 = document1.getElementsByAttributeValueMatching("hi!", "hi!");
        org.jsoup.nodes.Element element5 = document1.head();
        int int6 = document1.siblingIndex();
        java.lang.String str7 = document1.text();
        org.jsoup.select.Elements elements10 = document1.getElementsByAttributeValueNot("<hi!></hi!>", "hi!");
        org.jsoup.select.NodeVisitor nodeVisitor11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node12 = document1.traverse(nodeVisitor11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNull(element5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(elements10);
    }

    @Test
    public void test0411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0411");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = document1.textNodes();
        org.jsoup.nodes.Element element4 = document1.prependElement("hi!");
        java.lang.String str5 = element4.baseUri();
        org.jsoup.nodes.Element element7 = element4.toggleClass("hi!");
        org.jsoup.nodes.Element element9 = element7.prependText("");
        java.lang.Integer int10 = element9.elementSiblingIndex();
        org.jsoup.nodes.Element element12 = element9.prepend("<#root>\n <html>\n  <head></head>\n  <body></body>\n </html>\n</#root>");
        element9.remove();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements15 = element9.getElementsByAttribute("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(element12);
    }

    @Test
    public void test0412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0412");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements4 = document1.getElementsByAttributeValueMatching("hi!", "hi!");
        org.jsoup.nodes.Document document5 = document1.clone();
        org.jsoup.nodes.Node node7 = document1.removeAttr("hi!");
        org.jsoup.select.Elements elements8 = document1.getAllElements();
        org.jsoup.nodes.Element element9 = document1.previousElementSibling();
        document1.setBaseUri("<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.nodes.Document document12 = document1.clone();
        java.lang.String str13 = document12.id();
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNotNull(document5);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNull(element9);
        org.junit.Assert.assertNotNull(document12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test0413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0413");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.nodes.Element element3 = document1.append("");
        org.jsoup.nodes.Element element5 = document1.html("<#root></#root>");
        org.jsoup.nodes.Document document6 = document1.ownerDocument();
        org.jsoup.nodes.Node node8 = document6.removeAttr("<#root>");
        int int9 = node8.siblingIndex();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(document6);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0414");
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
        org.jsoup.nodes.Document.OutputSettings outputSettings14 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings15 = outputSettings14.clone();
        org.jsoup.nodes.Document.OutputSettings outputSettings16 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode17 = outputSettings16.escapeMode();
        int int18 = outputSettings16.indentAmount();
        org.jsoup.nodes.Entities.EscapeMode escapeMode19 = outputSettings16.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings20 = outputSettings15.escapeMode(escapeMode19);
        org.jsoup.nodes.Document.OutputSettings outputSettings21 = outputSettings12.escapeMode(escapeMode19);
        java.nio.charset.CharsetEncoder charsetEncoder22 = outputSettings12.encoder();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document.OutputSettings outputSettings24 = outputSettings12.charset("<#root></#root>\n<html>\n <head></head>\n <body></body>\n</html>");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: <#root></#root>?<html>? <head></head>? <body></body>?</html>");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(document7);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(outputSettings10);
        org.junit.Assert.assertTrue("'" + escapeMode11 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode11.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings12);
        org.junit.Assert.assertNotNull(document13);
        org.junit.Assert.assertNotNull(outputSettings15);
        org.junit.Assert.assertTrue("'" + escapeMode17 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode17.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + escapeMode19 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode19.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings20);
        org.junit.Assert.assertNotNull(outputSettings21);
        org.junit.Assert.assertNotNull(charsetEncoder22);
    }

    @Test
    public void test0415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0415");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element65 = element9.after("<#root><#root>");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(elements26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(document29);
        org.junit.Assert.assertNotNull(element30);
        org.junit.Assert.assertNotNull(elements33);
        org.junit.Assert.assertNotNull(element35);
        org.junit.Assert.assertNotNull(textNodeList38);
        org.junit.Assert.assertNotNull(elements39);
        org.junit.Assert.assertNotNull(elements44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(element47);
        org.junit.Assert.assertNotNull(element48);
        org.junit.Assert.assertNotNull(node50);
        org.junit.Assert.assertTrue("'" + escapeMode52 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode52.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset53);
        org.junit.Assert.assertNotNull(document54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNull(element56);
        org.junit.Assert.assertNotNull(element58);
        org.junit.Assert.assertNotNull(element59);
        org.junit.Assert.assertNull(element62);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
    }

    @Test
    public void test0416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0416");
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
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "<#root></#root>" + "'", str13, "<#root></#root>");
        org.junit.Assert.assertNotNull(document14);
        org.junit.Assert.assertNotNull(elements16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test0417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0417");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.select.Elements elements2 = document1.siblingElements();
        org.junit.Assert.assertNotNull(elements2);
    }

    @Test
    public void test0418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0418");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.nodes.Element element3 = document1.append("");
        org.jsoup.nodes.Element element5 = document1.html("<#root></#root>");
        org.jsoup.select.Elements elements8 = document1.getElementsByAttributeValue("<hi!></hi!>", "#document");
        boolean boolean10 = document1.hasClass(" hi!");
        org.jsoup.nodes.Element element11 = document1.parent();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(element11);
    }

    @Test
    public void test0419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0419");
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
        org.jsoup.nodes.Document document22 = new org.jsoup.nodes.Document("");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList23 = document22.textNodes();
        org.jsoup.nodes.Element element25 = document22.prependElement("hi!");
        java.lang.String str26 = document22.val();
        org.jsoup.nodes.Element element29 = document22.attr("<hi!></hi!>", "<#root></#root>\n<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.nodes.Element element30 = document1.prependChild((org.jsoup.nodes.Node) element29);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element32 = document1.wrap("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(document7);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "<#root>\n <html>\n  <head></head>\n  <body></body>\n </html>\n</#root>" + "'", str20, "<#root>\n <html>\n  <head></head>\n  <body></body>\n </html>\n</#root>");
        org.junit.Assert.assertNotNull(textNodeList23);
        org.junit.Assert.assertNotNull(element25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(element29);
        org.junit.Assert.assertNotNull(element30);
    }

    @Test
    public void test0420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0420");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements4 = document1.getElementsByAttributeValueMatching("hi!", "hi!");
        boolean boolean5 = document1.hasText();
        org.jsoup.select.Elements elements8 = document1.getElementsByAttributeValueContaining("hi!", "hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap9 = document1.dataset();
        org.jsoup.select.Elements elements12 = document1.getElementsByAttributeValueEnding("<hi!></hi!>", "#document");
        java.lang.String str13 = document1.title();
        org.jsoup.nodes.Document document14 = document1.clone();
        org.jsoup.select.Elements elements16 = document14.getElementsContainingText("<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(document14);
        org.junit.Assert.assertNotNull(elements16);
    }

    @Test
    public void test0421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0421");
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
        java.lang.String str21 = document14.id();
        org.jsoup.nodes.Element element23 = document14.getElementById("#document");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements25 = document14.select("<#root>");
            org.junit.Assert.fail("Expected exception of type org.jsoup.select.Selector.SelectorParseException; message: Could not parse query '<#root>': unexpected token at '<#root>'");
        } catch (org.jsoup.select.Selector.SelectorParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "<#root></#root>" + "'", str13, "<#root></#root>");
        org.junit.Assert.assertNotNull(document14);
        org.junit.Assert.assertNotNull(textNodeList17);
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNull(element23);
    }

    @Test
    public void test0422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0422");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements4 = document1.getElementsByAttributeValueMatching("hi!", "hi!");
        org.jsoup.nodes.Document document5 = document1.clone();
        java.lang.String str6 = document1.tagName();
        java.lang.String str7 = document1.val();
        java.util.List<org.jsoup.nodes.TextNode> textNodeList8 = document1.textNodes();
        org.jsoup.select.Elements elements10 = document1.getElementsMatchingOwnText("#document");
        java.lang.String str11 = document1.outerHtml();
        org.jsoup.select.Elements elements13 = document1.getElementsByIndexEquals((int) '#');
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNotNull(document5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "#root" + "'", str6, "#root");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(textNodeList8);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(elements13);
    }

    @Test
    public void test0423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0423");
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
        org.jsoup.nodes.Element element20 = element12.addClass("hi!");
        java.util.regex.Pattern pattern22 = null;
        org.jsoup.select.Elements elements23 = element20.getElementsByAttributeValueMatching(" hi!", pattern22);
        java.util.regex.Pattern pattern25 = null;
        org.jsoup.select.Elements elements26 = element20.getElementsByAttributeValueMatching("<hi!></hi!>\n<#root></#root>\n<html>\n <head></head>\n <body></body>\n</html>", pattern25);
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertNull(element14);
        org.junit.Assert.assertNotNull(elements16);
        org.junit.Assert.assertNotNull(elements18);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertNotNull(elements23);
        org.junit.Assert.assertNotNull(elements26);
    }

    @Test
    public void test0424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0424");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements4 = document1.getElementsByAttributeValueMatching("hi!", "hi!");
        boolean boolean5 = document1.hasText();
        org.jsoup.select.Elements elements8 = document1.getElementsByAttributeValueContaining("hi!", "hi!");
        org.jsoup.nodes.Element element10 = document1.append("<#root>\n <html>\n  <head></head>\n  <body></body>\n </html>\n</#root>");
        org.jsoup.nodes.Element element11 = element10.parent();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int12 = element11.elementSiblingIndex();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNull(element11);
    }

    @Test
    public void test0425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0425");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = document1.textNodes();
        org.jsoup.nodes.Element element4 = document1.prependElement("hi!");
        java.lang.String str5 = element4.baseUri();
        org.jsoup.nodes.Element element7 = element4.toggleClass("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element9 = element4.child((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(element7);
    }

    @Test
    public void test0426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0426");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements4 = document1.getElementsByAttributeValueMatching("hi!", "hi!");
        org.jsoup.nodes.Document document5 = document1.clone();
        org.jsoup.nodes.Document document6 = document5.normalise();
        boolean boolean7 = document5.hasText();
        org.jsoup.nodes.Document document9 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements12 = document9.getElementsByAttributeValueMatching("hi!", "hi!");
        boolean boolean13 = document9.hasText();
        org.jsoup.nodes.Element element15 = document9.appendElement("<#root>\n <html>\n  <head></head>\n  <body></body>\n </html>\n</#root>");
        org.jsoup.select.Elements elements18 = document9.getElementsByAttributeValueNot("<#root>\n <html>\n  <head></head>\n  <body></body>\n </html>\n</#root>", "hi!");
        org.jsoup.nodes.Document.OutputSettings outputSettings19 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings20 = outputSettings19.clone();
        org.jsoup.nodes.Document.OutputSettings outputSettings21 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode22 = outputSettings21.escapeMode();
        java.nio.charset.Charset charset23 = outputSettings21.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings24 = outputSettings20.charset(charset23);
        boolean boolean25 = outputSettings24.prettyPrint();
        org.jsoup.nodes.Document document26 = document9.outputSettings(outputSettings24);
        org.jsoup.nodes.Document document27 = document26.ownerDocument();
        org.jsoup.nodes.Element element28 = document5.prependChild((org.jsoup.nodes.Node) document26);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element30 = document5.createElement("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNotNull(document5);
        org.junit.Assert.assertNotNull(document6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(elements18);
        org.junit.Assert.assertNotNull(outputSettings20);
        org.junit.Assert.assertTrue("'" + escapeMode22 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode22.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset23);
        org.junit.Assert.assertNotNull(outputSettings24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(document26);
        org.junit.Assert.assertNotNull(document27);
        org.junit.Assert.assertNotNull(element28);
    }

    @Test
    public void test0427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0427");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean2 = document1.isBlock();
        org.jsoup.nodes.Element element4 = document1.toggleClass("hi!");
        org.jsoup.nodes.Attributes attributes5 = element4.attributes();
        org.jsoup.nodes.Element element7 = element4.appendElement("<hi!></hi!>");
        org.jsoup.nodes.Element element9 = element4.tagName(" hi!");
        int int10 = element4.siblingIndex();
        org.jsoup.nodes.Element element12 = element4.html("<hi!></hi!>");
        org.jsoup.nodes.Element element14 = element4.prependElement("hi!#document");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = element4.absUrl("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(attributes5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(element14);
    }

    @Test
    public void test0428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0428");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.nodes.Element element3 = document1.append("");
        org.jsoup.nodes.Element element5 = element3.html("hi!");
        java.lang.String str6 = element5.val();
        java.lang.String str7 = element5.toString();
        org.jsoup.select.Elements elements9 = element5.getElementsByAttribute("#document");
        java.lang.String str10 = element5.className();
        org.jsoup.nodes.Element element12 = element5.val("<html>\n <head></head>\n <body></body>\n</html>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements14 = element12.select("<<hi!></hi!>></<hi!></hi!>>");
            org.junit.Assert.fail("Expected exception of type org.jsoup.select.Selector.SelectorParseException; message: Could not parse query '<<hi!></hi!>></<hi!></hi!>>': unexpected token at '<<hi!></hi!>></<hi!></hi!>>'");
        } catch (org.jsoup.select.Selector.SelectorParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(element12);
    }

    @Test
    public void test0429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0429");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean2 = document1.isBlock();
        java.util.List<org.jsoup.nodes.DataNode> dataNodeList3 = document1.dataNodes();
        java.lang.String str5 = document1.attr("");
        org.jsoup.nodes.Node node6 = document1.nextSibling();
        org.jsoup.select.Elements elements7 = document1.children();
        org.jsoup.nodes.Element element9 = document1.appendText("<#root>\n <html>\n  <head></head>\n  <body></body>\n </html>\n</#root>");
        org.jsoup.nodes.Document document11 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements14 = document11.getElementsByAttributeValueMatching("hi!", "hi!");
        org.jsoup.nodes.Document document15 = document11.clone();
        java.util.regex.Pattern pattern17 = null;
        org.jsoup.select.Elements elements18 = document15.getElementsByAttributeValueMatching("<#root>\n <html>\n  <head></head>\n  <body></body>\n </html>\n</#root>", pattern17);
        org.jsoup.nodes.Element element20 = document15.html("<#root>\n <html>\n  <head></head>\n  <body></body>\n </html>\n</#root>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element21 = document1.after((org.jsoup.nodes.Node) document15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(dataNodeList3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(elements14);
        org.junit.Assert.assertNotNull(document15);
        org.junit.Assert.assertNotNull(elements18);
        org.junit.Assert.assertNotNull(element20);
    }

    @Test
    public void test0430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0430");
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
        org.jsoup.select.Elements elements31 = document15.getElementsMatchingText("<html>\n <head></head>\n <body></body>\n</html>&lt;#root&gt;");
        org.jsoup.select.Elements elements33 = document15.getElementsByIndexLessThan((int) (byte) -1);
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertNotNull(elements18);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertArrayEquals(strArray20, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertNotNull(document24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(elements28);
        org.junit.Assert.assertNotNull(element29);
        org.junit.Assert.assertNotNull(elements31);
        org.junit.Assert.assertNotNull(elements33);
    }

    @Test
    public void test0431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0431");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements4 = document1.getElementsByAttributeValueMatching("hi!", "hi!");
        boolean boolean5 = document1.hasText();
        org.jsoup.nodes.Element element7 = document1.append("");
        org.jsoup.select.Elements elements9 = document1.getElementsByTag("hi!");
        java.lang.String str10 = document1.outerHtml();
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test0432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0432");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = document1.textNodes();
        org.jsoup.nodes.Element element4 = document1.prependElement("hi!");
        java.lang.String str5 = element4.baseUri();
        org.jsoup.nodes.Element element7 = element4.toggleClass("hi!");
        org.jsoup.nodes.Element element9 = element7.prependText("");
        java.lang.String str10 = element7.ownText();
        java.lang.String str11 = element7.baseUri();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements13 = element7.select("<#root></#root>\n<html>\n <head></head>\n <body></body>\n</html>");
            org.junit.Assert.fail("Expected exception of type org.jsoup.select.Selector.SelectorParseException; message: Could not parse query '<#root></#root>?<html>? <head></head>? <body></body>?</html>': unexpected token at '<#root></#root>?<html>? <head></head>? <body></body>?</html>'");
        } catch (org.jsoup.select.Selector.SelectorParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test0433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0433");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean2 = document1.isBlock();
        java.util.List<org.jsoup.nodes.DataNode> dataNodeList3 = document1.dataNodes();
        java.lang.String str5 = document1.attr("");
        org.jsoup.nodes.Document.QuirksMode quirksMode6 = org.jsoup.nodes.Document.QuirksMode.noQuirks;
        org.jsoup.nodes.Document document7 = document1.quirksMode(quirksMode6);
        org.jsoup.nodes.Document document8 = document1.ownerDocument();
        org.jsoup.nodes.Document document10 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements13 = document10.getElementsByAttributeValueMatching("hi!", "hi!");
        java.lang.String[] strArray15 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet16 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet16, strArray15);
        org.jsoup.nodes.Element element18 = document10.classNames((java.util.Set<java.lang.String>) strSet16);
        org.jsoup.nodes.Element element19 = document8.classNames((java.util.Set<java.lang.String>) strSet16);
        java.lang.String str20 = element19.className();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element22 = element19.child(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(dataNodeList3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + quirksMode6 + "' != '" + org.jsoup.nodes.Document.QuirksMode.noQuirks + "'", quirksMode6.equals(org.jsoup.nodes.Document.QuirksMode.noQuirks));
        org.junit.Assert.assertNotNull(document7);
        org.junit.Assert.assertNotNull(document8);
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test0434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0434");
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
        java.lang.String str18 = document16.title();
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(document10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(elements14);
        org.junit.Assert.assertNotNull(outputSettings15);
        org.junit.Assert.assertNotNull(document16);
        org.junit.Assert.assertNotNull(document17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test0435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0435");
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
        org.jsoup.nodes.Element element23 = document1.html("<#root>");
        org.jsoup.select.Elements elements26 = element23.getElementsByAttributeValueContaining("<#root></#root>\n<html>\n <head></head>\n <body></body>\n</html>", "<#root></#root>");
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(document7);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "<#root>\n <html>\n  <head></head>\n  <body></body>\n </html>\n</#root>" + "'", str20, "<#root>\n <html>\n  <head></head>\n  <body></body>\n </html>\n</#root>");
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertNotNull(elements26);
    }

    @Test
    public void test0436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0436");
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
        org.jsoup.nodes.Document document22 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements25 = document22.getElementsByAttributeValueMatching("hi!", "hi!");
        boolean boolean26 = document22.hasText();
        org.jsoup.select.Elements elements29 = document22.getElementsByAttributeValueContaining("hi!", "hi!");
        org.jsoup.nodes.Element element31 = document22.append("<#root>\n <html>\n  <head></head>\n  <body></body>\n </html>\n</#root>");
        java.lang.Integer int32 = document22.elementSiblingIndex();
        org.jsoup.nodes.Document document33 = document22.clone();
        java.lang.String str34 = document22.nodeName();
        org.jsoup.nodes.Element element35 = document20.appendChild((org.jsoup.nodes.Node) document22);
        int int36 = document20.siblingIndex();
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "<#root></#root>" + "'", str13, "<#root></#root>");
        org.junit.Assert.assertNotNull(document14);
        org.junit.Assert.assertNotNull(outputSettings16);
        org.junit.Assert.assertNotNull(outputSettings18);
        org.junit.Assert.assertNotNull(document19);
        org.junit.Assert.assertNotNull(document20);
        org.junit.Assert.assertNotNull(elements25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(elements29);
        org.junit.Assert.assertNotNull(element31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(document33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "#document" + "'", str34, "#document");
        org.junit.Assert.assertNotNull(element35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
    }

    @Test
    public void test0437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0437");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.nodes.Element element3 = document1.append("");
        org.jsoup.nodes.Element element5 = element3.html("hi!");
        java.lang.String str6 = element5.val();
        java.lang.String str7 = element5.toString();
        org.jsoup.nodes.Element element9 = element5.append("#document");
        java.lang.String str10 = element5.data();
        org.jsoup.select.Elements elements12 = element5.getElementsMatchingText("<#root class=\"hi!\"></#root>\n<#root></#root>");
        org.jsoup.nodes.Element element14 = element5.removeClass("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element16 = element14.before("&lt;#root&gt;\n<!--#root-->&lt;#root&gt;\n<!--#root-->");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertNotNull(element14);
    }

    @Test
    public void test0438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0438");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = document1.textNodes();
        org.jsoup.select.Elements elements3 = document1.getAllElements();
        org.jsoup.nodes.Document document5 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements8 = document5.getElementsByAttributeValueMatching("hi!", "hi!");
        boolean boolean9 = document5.hasText();
        org.jsoup.nodes.Element element11 = document5.append("");
        org.jsoup.nodes.Element element12 = document1.appendChild((org.jsoup.nodes.Node) document5);
        org.jsoup.nodes.Element element13 = document1.previousElementSibling();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = element13.className();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNull(element13);
    }

    @Test
    public void test0439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0439");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean2 = document1.isBlock();
        org.jsoup.nodes.Element element4 = document1.toggleClass("hi!");
        org.jsoup.nodes.Attributes attributes5 = element4.attributes();
        org.jsoup.nodes.Element element7 = element4.appendElement("<hi!></hi!>");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList8 = element7.textNodes();
        java.lang.String str9 = element7.toString();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(attributes5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(textNodeList8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<<hi!></hi!>></<hi!></hi!>>" + "'", str9, "<<hi!></hi!>></<hi!></hi!>>");
    }

    @Test
    public void test0440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0440");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.nodes.Element element3 = document1.append("");
        org.jsoup.nodes.Element element5 = element3.html("hi!");
        org.jsoup.nodes.Element element7 = element5.val("<#root>");
        java.util.Set<java.lang.String> strSet8 = element5.classNames();
        org.jsoup.nodes.Element element10 = element5.val("<#root></#root>\n<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertNotNull(element10);
    }

    @Test
    public void test0441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0441");
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
        org.jsoup.select.Elements elements26 = element22.getElementsByIndexGreaterThan((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element28 = element22.tagName("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Tag name must not be empty.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(nodeList13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(dataNodeList17);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(strSet21);
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertNotNull(elements24);
        org.junit.Assert.assertNotNull(elements26);
    }

    @Test
    public void test0442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0442");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements4 = document1.getElementsByAttributeValueMatching("hi!", "hi!");
        boolean boolean5 = document1.hasText();
        org.jsoup.select.Elements elements8 = document1.getElementsByAttributeValueContaining("hi!", "hi!");
        org.jsoup.nodes.Element element10 = document1.append("<#root>\n <html>\n  <head></head>\n  <body></body>\n </html>\n</#root>");
        org.jsoup.nodes.Element element11 = element10.parent();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements14 = element11.getElementsByAttributeValueNot("<hi!></hi!>", "<<hi!></hi!>></<hi!></hi!>>");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNull(element11);
    }

    @Test
    public void test0443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0443");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = document1.textNodes();
        java.util.Set<java.lang.String> strSet3 = document1.classNames();
        java.lang.String str4 = document1.title();
        org.jsoup.nodes.Element element6 = document1.prependText("#document");
        org.jsoup.nodes.Document.OutputSettings outputSettings7 = document1.outputSettings();
        int int8 = outputSettings7.indentAmount();
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(outputSettings7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test0444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0444");
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
        java.util.List<org.jsoup.nodes.TextNode> textNodeList14 = document11.textNodes();
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(document10);
        org.junit.Assert.assertNotNull(document11);
        org.junit.Assert.assertNotNull(nodeList12);
        org.junit.Assert.assertNotNull(document13);
        org.junit.Assert.assertNotNull(textNodeList14);
    }

    @Test
    public void test0445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0445");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = document1.textNodes();
        java.util.List<org.jsoup.nodes.TextNode> textNodeList3 = document1.textNodes();
        org.jsoup.nodes.Document document4 = document1.clone();
        org.jsoup.select.Elements elements5 = document4.getAllElements();
        org.jsoup.nodes.Attributes attributes6 = document4.attributes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element8 = document4.after("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertNotNull(textNodeList3);
        org.junit.Assert.assertNotNull(document4);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(attributes6);
    }

    @Test
    public void test0446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0446");
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
        org.jsoup.nodes.Document document19 = document1.clone();
        org.jsoup.nodes.Document document21 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements24 = document21.getElementsByAttributeValueMatching("hi!", "hi!");
        org.jsoup.nodes.Document document25 = document21.clone();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element26 = document1.after((org.jsoup.nodes.Node) document25);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(document7);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(document16);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNotNull(document19);
        org.junit.Assert.assertNotNull(elements24);
        org.junit.Assert.assertNotNull(document25);
    }

    @Test
    public void test0447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0447");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements4 = document1.getElementsByAttributeValueMatching("hi!", "hi!");
        org.jsoup.nodes.Document document5 = document1.clone();
        org.jsoup.nodes.Document document6 = document5.normalise();
        org.jsoup.nodes.Element element7 = document6.parent();
        org.jsoup.select.Elements elements9 = document6.getElementsMatchingText("<<#root>\n <html>\n  <head></head>\n  <body></body>\n </html>\n</#root>></<#root>\n <html>\n  <head></head>\n  <body></body>\n </html>\n</#root>>");
        java.util.regex.Pattern pattern10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements11 = document6.getElementsMatchingText(pattern10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNotNull(document5);
        org.junit.Assert.assertNotNull(document6);
        org.junit.Assert.assertNull(element7);
        org.junit.Assert.assertNotNull(elements9);
    }

    @Test
    public void test0448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0448");
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
        org.jsoup.nodes.Element element24 = element23.previousElementSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element26 = element24.appendElement("<hi!></hi!>\n<#root></#root>\n<html>\n <head></head>\n <body></body>\n</html>&lt;#root&gt;&lt;/#root&gt;");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "<#root></#root>" + "'", str13, "<#root></#root>");
        org.junit.Assert.assertNotNull(document14);
        org.junit.Assert.assertNotNull(textNodeList17);
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertNull(element24);
    }

    @Test
    public void test0449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0449");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements4 = document1.getElementsByAttributeValueMatching("hi!", "hi!");
        boolean boolean5 = document1.hasText();
        org.jsoup.select.Elements elements8 = document1.getElementsByAttributeValueContaining("hi!", "hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap9 = document1.dataset();
        org.jsoup.select.Elements elements12 = document1.getElementsByAttributeValueEnding("<hi!></hi!>", "#document");
        org.jsoup.select.Elements elements14 = document1.select("#document");
        java.util.Map<java.lang.String, java.lang.String> strMap15 = document1.dataset();
        java.lang.String str17 = document1.absUrl("#document");
        java.util.List<org.jsoup.nodes.Node> nodeList18 = document1.siblingNodes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node19 = document1.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertNotNull(elements14);
        org.junit.Assert.assertNotNull(strMap15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(nodeList18);
    }

    @Test
    public void test0450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0450");
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
        java.lang.String str15 = document1.outerHtml();
        java.util.List<org.jsoup.nodes.TextNode> textNodeList16 = document1.textNodes();
        org.jsoup.nodes.Document document18 = new org.jsoup.nodes.Document("");
        boolean boolean19 = document18.isBlock();
        java.util.List<org.jsoup.nodes.DataNode> dataNodeList20 = document18.dataNodes();
        java.lang.String str22 = document18.attr("");
        org.jsoup.nodes.Document.QuirksMode quirksMode23 = org.jsoup.nodes.Document.QuirksMode.noQuirks;
        org.jsoup.nodes.Document document24 = document18.quirksMode(quirksMode23);
        org.jsoup.nodes.Document.QuirksMode quirksMode25 = document18.quirksMode();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element26 = document1.after((org.jsoup.nodes.Node) document18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "<#root></#root>" + "'", str13, "<#root></#root>");
        org.junit.Assert.assertNotNull(document14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "<#root></#root>\n<html>\n <head></head>\n <body></body>\n</html>" + "'", str15, "<#root></#root>\n<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertNotNull(textNodeList16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(dataNodeList20);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + quirksMode23 + "' != '" + org.jsoup.nodes.Document.QuirksMode.noQuirks + "'", quirksMode23.equals(org.jsoup.nodes.Document.QuirksMode.noQuirks));
        org.junit.Assert.assertNotNull(document24);
        org.junit.Assert.assertTrue("'" + quirksMode25 + "' != '" + org.jsoup.nodes.Document.QuirksMode.noQuirks + "'", quirksMode25.equals(org.jsoup.nodes.Document.QuirksMode.noQuirks));
    }

    @Test
    public void test0451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0451");
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
        org.jsoup.nodes.Element element22 = element20.addClass("<#root>\n <html>\n  <head></head>\n  <body></body>\n </html>\n</#root>");
        org.jsoup.select.Elements elements24 = element22.getElementsByIndexGreaterThan((int) ' ');
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "<#root></#root>" + "'", str13, "<#root></#root>");
        org.junit.Assert.assertNotNull(document14);
        org.junit.Assert.assertNotNull(textNodeList17);
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertNotNull(elements24);
    }

    @Test
    public void test0452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0452");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements4 = document1.getElementsByAttributeValueMatching("hi!", "hi!");
        org.jsoup.nodes.Document document5 = document1.clone();
        java.lang.String str6 = document1.tagName();
        org.jsoup.nodes.Element element8 = document1.addClass("<#root></#root>");
        org.jsoup.nodes.Element element10 = document1.html("<hi!></hi!>");
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNotNull(document5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "#root" + "'", str6, "#root");
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
    }

    @Test
    public void test0453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0453");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.nodes.Element element3 = document1.append("");
        org.jsoup.nodes.Element element5 = document1.toggleClass("");
        org.jsoup.nodes.Node node6 = document1.nextSibling();
        org.jsoup.nodes.Element element8 = document1.prependElement("<#root>\n <html>\n  <head></head>\n  <body></body>\n </html>\n</#root>");
        java.lang.String str9 = element8.text();
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
        element8.replaceWith((org.jsoup.nodes.Node) document11);
        org.jsoup.select.Elements elements26 = element8.getElementsByIndexEquals((int) 'a');
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(elements14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(document17);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNotNull(outputSettings20);
        org.junit.Assert.assertTrue("'" + escapeMode21 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode21.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings22);
        org.junit.Assert.assertNotNull(document23);
        org.junit.Assert.assertNotNull(elements26);
    }

    @Test
    public void test0454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0454");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements4 = document1.getElementsByAttributeValueMatching("hi!", "hi!");
        boolean boolean5 = document1.hasText();
        org.jsoup.select.Elements elements8 = document1.getElementsByAttributeValueContaining("hi!", "hi!");
        org.jsoup.nodes.Element element10 = document1.append("<#root>\n <html>\n  <head></head>\n  <body></body>\n </html>\n</#root>");
        java.lang.Integer int11 = document1.elementSiblingIndex();
        org.jsoup.nodes.Document document12 = document1.clone();
        org.jsoup.nodes.Document document13 = document12.ownerDocument();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element15 = document12.before("<hi!></hi!>");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(document12);
        org.junit.Assert.assertNotNull(document13);
    }

    @Test
    public void test0455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0455");
        org.jsoup.nodes.Document.OutputSettings outputSettings0 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings1 = outputSettings0.clone();
        org.jsoup.nodes.Document.OutputSettings outputSettings2 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode3 = outputSettings2.escapeMode();
        java.nio.charset.Charset charset4 = outputSettings2.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings5 = outputSettings1.charset(charset4);
        org.jsoup.nodes.Document.OutputSettings outputSettings6 = outputSettings1.clone();
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = outputSettings6.prettyPrint(false);
        boolean boolean9 = outputSettings6.prettyPrint();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document.OutputSettings outputSettings11 = outputSettings6.charset("hi!");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: hi!");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(outputSettings1);
        org.junit.Assert.assertTrue("'" + escapeMode3 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode3.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset4);
        org.junit.Assert.assertNotNull(outputSettings5);
        org.junit.Assert.assertNotNull(outputSettings6);
        org.junit.Assert.assertNotNull(outputSettings8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0456");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.nodes.Element element3 = document1.append("");
        org.jsoup.nodes.Element element5 = document1.toggleClass("");
        org.jsoup.nodes.Node node6 = document1.nextSibling();
        java.lang.String str7 = document1.ownText();
        org.jsoup.nodes.Element element9 = document1.appendText("<#root>");
        org.jsoup.nodes.Element element11 = element9.appendElement("<hi!></hi!>");
        org.jsoup.nodes.Document document13 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements16 = document13.getElementsByAttributeValueMatching("hi!", "hi!");
        org.jsoup.nodes.Document document17 = document13.clone();
        org.jsoup.nodes.Document.QuirksMode quirksMode18 = null;
        org.jsoup.nodes.Document document19 = document13.quirksMode(quirksMode18);
        org.jsoup.nodes.Element element21 = document19.append("<#root class=\"hi!\"></#root>\n<#root></#root>");
        org.jsoup.nodes.Document document23 = new org.jsoup.nodes.Document("");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList24 = document23.textNodes();
        org.jsoup.nodes.Element element26 = document23.prependElement("hi!");
        java.lang.String str27 = document23.val();
        org.jsoup.nodes.Element element30 = document23.attr("<hi!></hi!>", "<#root></#root>\n<html>\n <head></head>\n <body></body>\n</html>");
        java.lang.String[] strArray33 = new java.lang.String[] { "<#root>", "<#root></#root>" };
        java.util.LinkedHashSet<java.lang.String> strSet34 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet34, strArray33);
        org.jsoup.nodes.Element element36 = element30.classNames((java.util.Set<java.lang.String>) strSet34);
        org.jsoup.nodes.Element element37 = element21.classNames((java.util.Set<java.lang.String>) strSet34);
        org.jsoup.nodes.Element element38 = element11.classNames((java.util.Set<java.lang.String>) strSet34);
        org.jsoup.nodes.Document document40 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements43 = document40.getElementsByAttributeValueMatching("hi!", "hi!");
        boolean boolean44 = document40.hasText();
        org.jsoup.nodes.Document document46 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element47 = document40.prependChild((org.jsoup.nodes.Node) document46);
        org.jsoup.nodes.Document document49 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements52 = document49.getElementsByAttributeValueMatching("hi!", "hi!");
        java.lang.String[] strArray54 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet55 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet55, strArray54);
        org.jsoup.nodes.Element element57 = document49.classNames((java.util.Set<java.lang.String>) strSet55);
        org.jsoup.nodes.Element element58 = document40.classNames((java.util.Set<java.lang.String>) strSet55);
        org.jsoup.nodes.Element element59 = element38.classNames((java.util.Set<java.lang.String>) strSet55);
        boolean boolean61 = element59.hasAttr("<#root class=\"hi!\"></#root>\n<#root></#root>");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(elements16);
        org.junit.Assert.assertNotNull(document17);
        org.junit.Assert.assertNotNull(document19);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertNotNull(textNodeList24);
        org.junit.Assert.assertNotNull(element26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(element30);
        org.junit.Assert.assertNotNull(strArray33);
        org.junit.Assert.assertArrayEquals(strArray33, new java.lang.String[] { "<#root>", "<#root></#root>" });
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(element36);
        org.junit.Assert.assertNotNull(element37);
        org.junit.Assert.assertNotNull(element38);
        org.junit.Assert.assertNotNull(elements43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(document46);
        org.junit.Assert.assertNotNull(element47);
        org.junit.Assert.assertNotNull(elements52);
        org.junit.Assert.assertNotNull(strArray54);
        org.junit.Assert.assertArrayEquals(strArray54, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertNotNull(element57);
        org.junit.Assert.assertNotNull(element58);
        org.junit.Assert.assertNotNull(element59);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
    }

    @Test
    public void test0457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0457");
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
        org.jsoup.select.Elements elements14 = element13.children();
        element13.setBaseUri("&lt;#root&gt; &lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt;&lt;/body&gt; &lt;/html&gt; &lt;/#root&gt;");
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNotNull(document5);
        org.junit.Assert.assertNotNull(document6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(document9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + quirksMode11 + "' != '" + org.jsoup.nodes.Document.QuirksMode.limitedQuirks + "'", quirksMode11.equals(org.jsoup.nodes.Document.QuirksMode.limitedQuirks));
        org.junit.Assert.assertNotNull(document12);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(elements14);
    }

    @Test
    public void test0458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0458");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = document1.textNodes();
        org.jsoup.select.Elements elements3 = document1.getAllElements();
        org.jsoup.nodes.Document document5 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements8 = document5.getElementsByAttributeValueMatching("hi!", "hi!");
        boolean boolean9 = document5.hasText();
        org.jsoup.nodes.Element element11 = document5.append("");
        org.jsoup.nodes.Element element12 = document1.appendChild((org.jsoup.nodes.Node) document5);
        java.util.List<org.jsoup.nodes.Node> nodeList13 = element12.siblingNodes();
        org.jsoup.select.Elements elements16 = element12.getElementsByAttributeValueNot("<#root></#root>\n<html>\n <head></head>\n <body></body>\n</html>", "<#root>\n <html>\n  <head></head>\n  <body></body>\n </html>\n</#root>");
        org.jsoup.nodes.Document document18 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements21 = document18.getElementsByAttributeValueMatching("hi!", "hi!");
        boolean boolean22 = document18.hasText();
        org.jsoup.nodes.Element element24 = document18.append("");
        org.jsoup.nodes.Element element25 = element24.previousElementSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element26 = element12.after((org.jsoup.nodes.Node) element24);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(nodeList13);
        org.junit.Assert.assertNotNull(elements16);
        org.junit.Assert.assertNotNull(elements21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(element24);
        org.junit.Assert.assertNull(element25);
    }

    @Test
    public void test0459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0459");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements4 = document1.getElementsByAttributeValueMatching("hi!", "hi!");
        boolean boolean5 = document1.hasText();
        org.jsoup.nodes.Document document7 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element8 = document1.prependChild((org.jsoup.nodes.Node) document7);
        org.jsoup.nodes.Element element10 = document1.append("<#root>\n <html>\n  <head></head>\n  <body></body>\n </html>\n</#root>");
        org.jsoup.nodes.Element element12 = element10.addClass("<#root>");
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(document7);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element12);
    }

    @Test
    public void test0460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0460");
        org.jsoup.nodes.Document.OutputSettings outputSettings0 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings1 = outputSettings0.clone();
        org.jsoup.nodes.Document.OutputSettings outputSettings2 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode3 = outputSettings2.escapeMode();
        java.nio.charset.Charset charset4 = outputSettings2.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings5 = outputSettings1.charset(charset4);
        org.jsoup.nodes.Document.OutputSettings outputSettings6 = outputSettings5.clone();
        java.nio.charset.Charset charset7 = outputSettings6.charset();
        java.nio.charset.CharsetEncoder charsetEncoder8 = outputSettings6.encoder();
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = outputSettings6.prettyPrint(false);
        org.junit.Assert.assertNotNull(outputSettings1);
        org.junit.Assert.assertTrue("'" + escapeMode3 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode3.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset4);
        org.junit.Assert.assertNotNull(outputSettings5);
        org.junit.Assert.assertNotNull(outputSettings6);
        org.junit.Assert.assertNotNull(charset7);
        org.junit.Assert.assertNotNull(charsetEncoder8);
        org.junit.Assert.assertNotNull(outputSettings10);
    }

    @Test
    public void test0461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0461");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements4 = document1.getElementsByAttributeValueMatching("hi!", "hi!");
        boolean boolean5 = document1.hasText();
        org.jsoup.select.Elements elements8 = document1.getElementsByAttributeValueContaining("hi!", "hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap9 = document1.dataset();
        org.jsoup.select.Elements elements12 = document1.getElementsByAttributeValueEnding("<hi!></hi!>", "#document");
        org.jsoup.nodes.Document.OutputSettings outputSettings13 = document1.outputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings14 = outputSettings13.clone();
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertNotNull(outputSettings13);
        org.junit.Assert.assertNotNull(outputSettings14);
    }

    @Test
    public void test0462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0462");
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
        org.jsoup.select.Elements elements37 = document14.getElementsByIndexLessThan((int) (short) 10);
        org.jsoup.nodes.Node node38 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element39 = document14.appendChild(node38);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(document14);
        org.junit.Assert.assertNotNull(attributes15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertNotNull(attributes21);
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertArrayEquals(strArray29, new java.lang.String[] { "", "<#root>\n <html>\n  <head></head>\n  <body></body>\n </html>\n</#root>", "<#root></#root>", "<#root></#root>", "#document" });
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(element32);
        org.junit.Assert.assertNotNull(element34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(elements37);
    }

    @Test
    public void test0463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0463");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean2 = document1.isBlock();
        java.util.List<org.jsoup.nodes.DataNode> dataNodeList3 = document1.dataNodes();
        java.lang.String str5 = document1.attr("");
        java.lang.String str6 = document1.outerHtml();
        org.jsoup.nodes.Element element7 = document1.head();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(dataNodeList3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(element7);
    }

    @Test
    public void test0464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0464");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = document1.textNodes();
        org.jsoup.nodes.Element element4 = document1.prependElement("hi!");
        org.jsoup.nodes.Document.OutputSettings outputSettings5 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings6 = outputSettings5.clone();
        org.jsoup.nodes.Document.OutputSettings outputSettings7 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode8 = outputSettings7.escapeMode();
        java.nio.charset.Charset charset9 = outputSettings7.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = outputSettings6.charset(charset9);
        java.lang.Class<?> wildcardClass11 = outputSettings10.getClass();
        boolean boolean12 = element4.equals((java.lang.Object) outputSettings10);
        org.jsoup.nodes.Element element14 = element4.prependText("#root");
        java.lang.String str15 = element4.tagName();
        java.util.regex.Pattern pattern17 = null;
        org.jsoup.select.Elements elements18 = element4.getElementsByAttributeValueMatching("", pattern17);
        org.jsoup.nodes.Attributes attributes19 = element4.attributes();
        org.jsoup.nodes.Element element21 = element4.addClass("hi!#document");
        java.lang.String str22 = element4.className();
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(outputSettings6);
        org.junit.Assert.assertTrue("'" + escapeMode8 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode8.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset9);
        org.junit.Assert.assertNotNull(outputSettings10);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(elements18);
        org.junit.Assert.assertNotNull(attributes19);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + " hi!#document" + "'", str22, " hi!#document");
    }

    @Test
    public void test0465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0465");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.nodes.Element element3 = document1.append("");
        org.jsoup.nodes.Element element5 = document1.toggleClass("");
        org.jsoup.nodes.Node node6 = document1.nextSibling();
        java.lang.String str7 = document1.ownText();
        org.jsoup.nodes.Element element9 = document1.appendText("<#root>");
        org.jsoup.nodes.Element element11 = element9.appendElement("<hi!></hi!>");
        java.lang.String str12 = element11.baseUri();
        org.jsoup.select.Elements elements14 = element11.getElementsMatchingText("#document");
        java.lang.String str15 = element11.tagName();
        java.util.regex.Pattern pattern16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements17 = element11.getElementsMatchingOwnText(pattern16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(elements14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "<hi!></hi!>" + "'", str15, "<hi!></hi!>");
    }

    @Test
    public void test0466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0466");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean2 = document1.isBlock();
        java.util.List<org.jsoup.nodes.DataNode> dataNodeList3 = document1.dataNodes();
        java.lang.String str5 = document1.attr("");
        org.jsoup.nodes.Node node6 = document1.nextSibling();
        org.jsoup.select.Elements elements7 = document1.children();
        org.jsoup.nodes.Element element9 = document1.appendText("<#root>\n <html>\n  <head></head>\n  <body></body>\n </html>\n</#root>");
        org.jsoup.nodes.Node node10 = element9.previousSibling();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(dataNodeList3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNull(node10);
    }

    @Test
    public void test0467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0467");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = document1.textNodes();
        org.jsoup.select.Elements elements3 = document1.getAllElements();
        org.jsoup.nodes.Document document5 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements8 = document5.getElementsByAttributeValueMatching("hi!", "hi!");
        boolean boolean9 = document5.hasText();
        org.jsoup.nodes.Element element11 = document5.append("");
        org.jsoup.nodes.Element element12 = document1.appendChild((org.jsoup.nodes.Node) document5);
        org.jsoup.nodes.Node node14 = document1.removeAttr("hi!");
        org.jsoup.nodes.Element element15 = document1.nextElementSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements17 = element15.getElementsByIndexLessThan(100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNull(element15);
    }

    @Test
    public void test0468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0468");
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
        java.lang.String str19 = document16.nodeName();
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(document7);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(document16);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "#document" + "'", str19, "#document");
    }

    @Test
    public void test0469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0469");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.nodes.Element element3 = document1.append("");
        org.jsoup.nodes.Element element5 = document1.toggleClass("");
        org.jsoup.nodes.Node node6 = document1.nextSibling();
        java.lang.String str7 = document1.ownText();
        org.jsoup.nodes.Element element9 = document1.appendText("<#root>");
        org.jsoup.nodes.Element element11 = element9.appendElement("<hi!></hi!>");
        java.lang.String str12 = element9.baseUri();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test0470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0470");
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
        org.jsoup.nodes.Document document58 = new org.jsoup.nodes.Document("");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList59 = document58.textNodes();
        org.jsoup.select.Elements elements60 = document58.getAllElements();
        org.jsoup.nodes.Document document62 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements65 = document62.getElementsByAttributeValueMatching("hi!", "hi!");
        boolean boolean66 = document62.hasText();
        org.jsoup.nodes.Element element68 = document62.append("");
        org.jsoup.nodes.Element element69 = document58.appendChild((org.jsoup.nodes.Node) document62);
        java.lang.String str70 = document58.outerHtml();
        org.jsoup.nodes.Document document71 = document58.normalise();
        org.jsoup.nodes.Document document73 = new org.jsoup.nodes.Document("");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList74 = document73.textNodes();
        org.jsoup.nodes.Element element76 = document73.prependElement("hi!");
        org.jsoup.nodes.Element element77 = document71.prependChild((org.jsoup.nodes.Node) element76);
        boolean boolean78 = document71.hasText();
        org.jsoup.nodes.Element element80 = document71.appendText("<#root></#root>");
        java.util.Set<java.lang.String> strSet81 = document71.classNames();
        org.jsoup.nodes.Element element82 = document49.classNames(strSet81);
        org.jsoup.nodes.Element element84 = element82.getElementById("<hi!></hi!>\n<#root></#root>\n<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(elements14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(document17);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNotNull(elements21);
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertNotNull(textNodeList26);
        org.junit.Assert.assertNotNull(elements27);
        org.junit.Assert.assertNotNull(elements32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(element35);
        org.junit.Assert.assertNotNull(element36);
        org.junit.Assert.assertNotNull(node38);
        org.junit.Assert.assertTrue("'" + escapeMode40 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode40.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset41);
        org.junit.Assert.assertNotNull(document42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNull(element44);
        org.junit.Assert.assertNotNull(element46);
        org.junit.Assert.assertNotNull(element47);
        org.junit.Assert.assertNotNull(elements52);
        org.junit.Assert.assertNull(element53);
        org.junit.Assert.assertNotNull(outputSettings54);
        org.junit.Assert.assertNotNull(element55);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "" + "'", str56, "");
        org.junit.Assert.assertNotNull(textNodeList59);
        org.junit.Assert.assertNotNull(elements60);
        org.junit.Assert.assertNotNull(elements65);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(element68);
        org.junit.Assert.assertNotNull(element69);
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "<#root></#root>" + "'", str70, "<#root></#root>");
        org.junit.Assert.assertNotNull(document71);
        org.junit.Assert.assertNotNull(textNodeList74);
        org.junit.Assert.assertNotNull(element76);
        org.junit.Assert.assertNotNull(element77);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertNotNull(element80);
        org.junit.Assert.assertNotNull(strSet81);
        org.junit.Assert.assertNotNull(element82);
        org.junit.Assert.assertNull(element84);
    }

    @Test
    public void test0471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0471");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.nodes.Element element3 = document1.append("");
        org.jsoup.nodes.Element element5 = element3.html("hi!");
        java.lang.String str6 = element5.val();
        java.lang.String str7 = element5.toString();
        org.jsoup.select.Elements elements9 = element5.getElementsByAttribute("#document");
        org.jsoup.nodes.Element element11 = element5.append("<#root></#root>");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertNotNull(element11);
    }

    @Test
    public void test0472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0472");
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
        org.jsoup.select.Elements elements17 = document14.getElementsContainingText("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertNotNull(document14);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(elements17);
    }

    @Test
    public void test0473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0473");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean2 = document1.isBlock();
        java.util.List<org.jsoup.nodes.DataNode> dataNodeList3 = document1.dataNodes();
        java.lang.String str5 = document1.attr("");
        org.jsoup.nodes.Node node6 = document1.nextSibling();
        org.jsoup.select.Elements elements7 = document1.parents();
        java.util.regex.Pattern pattern8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements9 = document1.getElementsMatchingOwnText(pattern8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(dataNodeList3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNotNull(elements7);
    }

    @Test
    public void test0474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0474");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = document1.textNodes();
        org.jsoup.nodes.Element element4 = document1.prependElement("hi!");
        java.lang.String str5 = element4.baseUri();
        org.jsoup.nodes.Element element7 = element4.toggleClass("hi!");
        org.jsoup.nodes.Element element9 = element7.prependText("");
        java.lang.String str10 = element7.ownText();
        java.lang.String str11 = element7.baseUri();
        org.jsoup.select.NodeVisitor nodeVisitor12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node13 = element7.traverse(nodeVisitor12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test0475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0475");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.nodes.Element element3 = document1.append("");
        org.jsoup.nodes.Element element5 = document1.toggleClass("");
        org.jsoup.nodes.Node node6 = document1.nextSibling();
        org.jsoup.nodes.Element element8 = document1.prependElement("<#root>\n <html>\n  <head></head>\n  <body></body>\n </html>\n</#root>");
        org.jsoup.nodes.Document document10 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.nodes.Element element12 = document10.append("");
        org.jsoup.nodes.Element element14 = element12.html("hi!");
        java.lang.String str15 = element14.ownText();
        java.lang.String str16 = element14.data();
        org.jsoup.nodes.Element element17 = element8.prependChild((org.jsoup.nodes.Node) element14);
        org.jsoup.nodes.Element element19 = element8.appendText("hi!");
        org.jsoup.nodes.Element element21 = element19.child(0);
        org.jsoup.nodes.Element element22 = element21.previousElementSibling();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str23 = element22.baseUri();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(document10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertNull(element22);
    }

    @Test
    public void test0476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0476");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean2 = document1.isBlock();
        org.jsoup.nodes.Element element4 = document1.toggleClass("hi!");
        org.jsoup.nodes.Document document6 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element7 = document1.appendChild((org.jsoup.nodes.Node) document6);
        org.jsoup.select.Elements elements9 = document6.getElementsByIndexEquals(0);
        org.jsoup.nodes.Attributes attributes10 = document6.attributes();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertNotNull(attributes10);
    }

    @Test
    public void test0477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0477");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.nodes.Element element3 = document1.append("");
        org.jsoup.nodes.Element element5 = element3.html("hi!");
        java.lang.String str6 = element5.val();
        java.lang.String str7 = element5.toString();
        org.jsoup.nodes.Element element9 = element5.append("#document");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element11 = element9.child(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(element9);
    }

    @Test
    public void test0478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0478");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean2 = document1.isBlock();
        java.util.List<org.jsoup.nodes.DataNode> dataNodeList3 = document1.dataNodes();
        java.lang.String str5 = document1.attr("");
        org.jsoup.nodes.Document.QuirksMode quirksMode6 = org.jsoup.nodes.Document.QuirksMode.noQuirks;
        org.jsoup.nodes.Document document7 = document1.quirksMode(quirksMode6);
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = document1.outputSettings();
        org.jsoup.nodes.Element element9 = document1.parent();
        org.jsoup.nodes.Element element11 = document1.html("hi!#document");
        java.lang.String str12 = element11.val();
        org.jsoup.select.Elements elements14 = element11.getElementsContainingOwnText("#document");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(dataNodeList3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + quirksMode6 + "' != '" + org.jsoup.nodes.Document.QuirksMode.noQuirks + "'", quirksMode6.equals(org.jsoup.nodes.Document.QuirksMode.noQuirks));
        org.junit.Assert.assertNotNull(document7);
        org.junit.Assert.assertNotNull(outputSettings8);
        org.junit.Assert.assertNull(element9);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(elements14);
    }

    @Test
    public void test0479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0479");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements4 = document1.getElementsByAttributeValueMatching("hi!", "hi!");
        boolean boolean5 = document1.hasText();
        org.jsoup.select.Elements elements8 = document1.getElementsByAttributeValueContaining("hi!", "hi!");
        org.jsoup.nodes.Element element10 = document1.append("<#root>\n <html>\n  <head></head>\n  <body></body>\n </html>\n</#root>");
        java.lang.Integer int11 = document1.elementSiblingIndex();
        org.jsoup.nodes.Document document12 = document1.clone();
        org.jsoup.nodes.Element element14 = document12.createElement("<#root></#root>");
        org.jsoup.nodes.Element element15 = element14.previousElementSibling();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = element15.attr("<#root></#root>\n<hi!></hi!>");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(document12);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNull(element15);
    }

    @Test
    public void test0480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0480");
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
        org.jsoup.select.Elements elements22 = element21.siblingElements();
        org.jsoup.nodes.Node node23 = element21.unwrap();
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertNotNull(outputSettings12);
        org.junit.Assert.assertTrue("'" + escapeMode14 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode14.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset15);
        org.junit.Assert.assertNotNull(outputSettings16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(document18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertNotNull(elements22);
        org.junit.Assert.assertNull(node23);
    }

    @Test
    public void test0481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0481");
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
        org.jsoup.nodes.Document document16 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements19 = document16.getElementsByAttributeValueMatching("hi!", "hi!");
        boolean boolean20 = document16.hasText();
        org.jsoup.nodes.Document document22 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element23 = document16.prependChild((org.jsoup.nodes.Node) document22);
        org.jsoup.nodes.Document.OutputSettings outputSettings24 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings25 = outputSettings24.clone();
        org.jsoup.nodes.Entities.EscapeMode escapeMode26 = outputSettings25.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings27 = outputSettings25.clone();
        org.jsoup.nodes.Document document28 = document16.outputSettings(outputSettings27);
        org.jsoup.select.Elements elements30 = document28.getElementsByIndexLessThan((int) (byte) -1);
        org.jsoup.nodes.Document document31 = document28.ownerDocument();
        org.jsoup.nodes.Node node32 = document31.previousSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element33 = document13.after(node32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(document7);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(outputSettings10);
        org.junit.Assert.assertTrue("'" + escapeMode11 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode11.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings12);
        org.junit.Assert.assertNotNull(document13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "#document" + "'", str14, "#document");
        org.junit.Assert.assertNotNull(elements19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(document22);
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertNotNull(outputSettings25);
        org.junit.Assert.assertTrue("'" + escapeMode26 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode26.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings27);
        org.junit.Assert.assertNotNull(document28);
        org.junit.Assert.assertNotNull(elements30);
        org.junit.Assert.assertNotNull(document31);
        org.junit.Assert.assertNull(node32);
    }

    @Test
    public void test0482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0482");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements4 = document1.getElementsByAttributeValueMatching("hi!", "hi!");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet7 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet7, strArray6);
        org.jsoup.nodes.Element element9 = document1.classNames((java.util.Set<java.lang.String>) strSet7);
        org.jsoup.nodes.Element element11 = document1.getElementById("hi!");
        org.jsoup.nodes.Element element14 = document1.attr("<#root>\n <html>\n  <head></head>\n  <body></body>\n </html>\n</#root>", "<#root>\n <html>\n  <head></head>\n  <body></body>\n </html>\n</#root>");
        java.lang.String str15 = element14.id();
        java.util.Map<java.lang.String, java.lang.String> strMap16 = element14.dataset();
        org.jsoup.nodes.Document document18 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements21 = document18.getElementsByAttributeValueMatching("hi!", "hi!");
        boolean boolean22 = document18.hasText();
        org.jsoup.nodes.Element element24 = document18.append("");
        org.jsoup.select.Elements elements25 = document18.siblingElements();
        org.jsoup.nodes.Document document26 = document18.clone();
        java.lang.String str27 = document26.outerHtml();
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
        org.jsoup.nodes.Document.OutputSettings outputSettings44 = outputSettings43.clone();
        org.jsoup.nodes.Entities.EscapeMode escapeMode45 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings46 = outputSettings43.escapeMode(escapeMode45);
        org.jsoup.nodes.Document document47 = document26.outputSettings(outputSettings43);
        org.jsoup.select.Elements elements49 = document26.getElementsByAttribute("<html>\n <head></head>\n <body></body>\n</html>");
        // The following exception was thrown during execution in test generation
        try {
            element14.replaceWith((org.jsoup.nodes.Node) document26);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNull(element11);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(strMap16);
        org.junit.Assert.assertNotNull(elements21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(element24);
        org.junit.Assert.assertNotNull(elements25);
        org.junit.Assert.assertNotNull(document26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(dataNodeList31);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertTrue("'" + quirksMode34 + "' != '" + org.jsoup.nodes.Document.QuirksMode.noQuirks + "'", quirksMode34.equals(org.jsoup.nodes.Document.QuirksMode.noQuirks));
        org.junit.Assert.assertNotNull(document35);
        org.junit.Assert.assertNotNull(outputSettings36);
        org.junit.Assert.assertNotNull(outputSettings38);
        org.junit.Assert.assertTrue("'" + escapeMode40 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode40.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset41);
        org.junit.Assert.assertNotNull(outputSettings42);
        org.junit.Assert.assertNotNull(outputSettings43);
        org.junit.Assert.assertNotNull(outputSettings44);
        org.junit.Assert.assertNotNull(outputSettings46);
        org.junit.Assert.assertNotNull(document47);
        org.junit.Assert.assertNotNull(elements49);
    }

    @Test
    public void test0483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0483");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements4 = document1.getElementsByAttributeValueMatching("hi!", "hi!");
        org.jsoup.nodes.Document document5 = document1.clone();
        org.jsoup.select.Elements elements6 = document5.getAllElements();
        org.jsoup.select.Elements elements7 = document5.siblingElements();
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNotNull(document5);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(elements7);
    }

    @Test
    public void test0484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0484");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements4 = document1.getElementsByAttributeValueMatching("hi!", "hi!");
        org.jsoup.nodes.Element element5 = document1.head();
        org.jsoup.nodes.Document.OutputSettings outputSettings6 = document1.outputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings7 = outputSettings6.clone();
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = outputSettings6.prettyPrint(false);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document.OutputSettings outputSettings11 = outputSettings6.charset("&lt;#root&gt; &lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt;&lt;/body&gt; &lt;/html&gt; &lt;/#root&gt;");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: &lt;#root&gt; &lt;html&gt; &lt;head&gt;&lt;/head&gt; &lt;body&gt;&lt;/body&gt; &lt;/html&gt; &lt;/#root&gt;");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNull(element5);
        org.junit.Assert.assertNotNull(outputSettings6);
        org.junit.Assert.assertNotNull(outputSettings7);
        org.junit.Assert.assertNotNull(outputSettings9);
    }

    @Test
    public void test0485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0485");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = document1.textNodes();
        org.jsoup.nodes.Element element4 = document1.prependElement("hi!");
        org.jsoup.nodes.Attributes attributes5 = document1.attributes();
        java.lang.String str6 = document1.tagName();
        org.jsoup.select.Elements elements7 = document1.getAllElements();
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(attributes5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "#root" + "'", str6, "#root");
        org.junit.Assert.assertNotNull(elements7);
    }

    @Test
    public void test0486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0486");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean2 = document1.isBlock();
        java.util.List<org.jsoup.nodes.DataNode> dataNodeList3 = document1.dataNodes();
        java.lang.String str5 = document1.attr("");
        org.jsoup.nodes.Document.QuirksMode quirksMode6 = org.jsoup.nodes.Document.QuirksMode.noQuirks;
        org.jsoup.nodes.Document document7 = document1.quirksMode(quirksMode6);
        org.jsoup.nodes.Document document8 = document1.ownerDocument();
        org.jsoup.nodes.Document document10 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements13 = document10.getElementsByAttributeValueMatching("hi!", "hi!");
        java.lang.String[] strArray15 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet16 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet16, strArray15);
        org.jsoup.nodes.Element element18 = document10.classNames((java.util.Set<java.lang.String>) strSet16);
        org.jsoup.nodes.Element element19 = document8.classNames((java.util.Set<java.lang.String>) strSet16);
        org.jsoup.nodes.Document document21 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements24 = document21.getElementsByAttributeValueMatching("hi!", "hi!");
        java.lang.String[] strArray26 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet27 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet27, strArray26);
        org.jsoup.nodes.Element element29 = document21.classNames((java.util.Set<java.lang.String>) strSet27);
        boolean boolean30 = element19.equals((java.lang.Object) document21);
        java.util.List<org.jsoup.nodes.Node> nodeList31 = element19.childNodes();
        org.jsoup.nodes.Node node32 = element19.nextSibling();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(dataNodeList3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + quirksMode6 + "' != '" + org.jsoup.nodes.Document.QuirksMode.noQuirks + "'", quirksMode6.equals(org.jsoup.nodes.Document.QuirksMode.noQuirks));
        org.junit.Assert.assertNotNull(document7);
        org.junit.Assert.assertNotNull(document8);
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertNotNull(elements24);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertArrayEquals(strArray26, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(element29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(nodeList31);
        org.junit.Assert.assertNull(node32);
    }

    @Test
    public void test0487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0487");
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
        org.jsoup.nodes.Element element58 = document1.nextElementSibling();
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(document7);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertNotNull(elements20);
        org.junit.Assert.assertNotNull(elements25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(document28);
        org.junit.Assert.assertNotNull(element29);
        org.junit.Assert.assertNotNull(elements32);
        org.junit.Assert.assertNotNull(element34);
        org.junit.Assert.assertNotNull(textNodeList37);
        org.junit.Assert.assertNotNull(elements38);
        org.junit.Assert.assertNotNull(elements43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(element46);
        org.junit.Assert.assertNotNull(element47);
        org.junit.Assert.assertNotNull(node49);
        org.junit.Assert.assertTrue("'" + escapeMode51 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode51.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset52);
        org.junit.Assert.assertNotNull(document53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNull(element55);
        org.junit.Assert.assertNotNull(elements56);
        org.junit.Assert.assertNotNull(element57);
        org.junit.Assert.assertNull(element58);
    }

    @Test
    public void test0488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0488");
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
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNotNull(document5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(dataNodeList9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + quirksMode12 + "' != '" + org.jsoup.nodes.Document.QuirksMode.noQuirks + "'", quirksMode12.equals(org.jsoup.nodes.Document.QuirksMode.noQuirks));
        org.junit.Assert.assertNotNull(document13);
        org.junit.Assert.assertNotNull(document14);
        org.junit.Assert.assertNotNull(strSet15);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(document18);
    }

    @Test
    public void test0489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0489");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements4 = document1.getElementsByAttributeValueMatching("hi!", "hi!");
        boolean boolean5 = document1.hasText();
        org.jsoup.nodes.Document document7 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.nodes.Element element8 = document1.prependChild((org.jsoup.nodes.Node) document7);
        int int9 = document7.siblingIndex();
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(document7);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0490");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.nodes.Element element3 = document1.append("");
        org.jsoup.nodes.Element element5 = element3.html("hi!");
        java.lang.String str6 = element5.ownText();
        org.jsoup.nodes.Document document8 = new org.jsoup.nodes.Document("");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList9 = document8.textNodes();
        org.jsoup.nodes.Element element11 = document8.prependElement("hi!");
        java.lang.String str12 = element11.baseUri();
        org.jsoup.nodes.Element element14 = element11.toggleClass("hi!");
        org.jsoup.nodes.Element element16 = element14.prependText("");
        org.jsoup.nodes.Element element18 = element16.val("<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.nodes.Element element19 = element5.appendChild((org.jsoup.nodes.Node) element16);
        java.util.regex.Pattern pattern21 = null;
        org.jsoup.select.Elements elements22 = element16.getElementsByAttributeValueMatching("#document", pattern21);
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(textNodeList9);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertNotNull(elements22);
    }

    @Test
    public void test0491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0491");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = document1.textNodes();
        org.jsoup.nodes.Element element4 = document1.prependElement("hi!");
        org.jsoup.nodes.Element element6 = document1.html("hi!");
        org.jsoup.nodes.Document document8 = new org.jsoup.nodes.Document("");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList9 = document8.textNodes();
        org.jsoup.select.Elements elements10 = document8.getAllElements();
        org.jsoup.nodes.Document document12 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements15 = document12.getElementsByAttributeValueMatching("hi!", "hi!");
        boolean boolean16 = document12.hasText();
        org.jsoup.nodes.Element element18 = document12.append("");
        org.jsoup.nodes.Element element19 = document8.appendChild((org.jsoup.nodes.Node) document12);
        org.jsoup.nodes.Element element20 = document8.previousElementSibling();
        org.jsoup.nodes.Element element21 = document8.head();
        // The following exception was thrown during execution in test generation
        try {
            document1.replaceWith((org.jsoup.nodes.Node) document8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(textNodeList9);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertNull(element20);
        org.junit.Assert.assertNull(element21);
    }

    @Test
    public void test0492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0492");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.nodes.Element element3 = document1.append("");
        org.jsoup.nodes.Element element5 = document1.toggleClass("");
        org.jsoup.nodes.Node node6 = document1.nextSibling();
        org.jsoup.nodes.Element element8 = document1.prependElement("<#root>\n <html>\n  <head></head>\n  <body></body>\n </html>\n</#root>");
        org.jsoup.nodes.Document document10 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.nodes.Element element12 = document10.append("");
        org.jsoup.nodes.Element element14 = element12.html("hi!");
        java.lang.String str15 = element14.ownText();
        java.lang.String str16 = element14.data();
        org.jsoup.nodes.Element element17 = element8.prependChild((org.jsoup.nodes.Node) element14);
        java.lang.String str18 = element17.ownText();
        org.jsoup.select.Elements elements19 = element17.parents();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(document10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(elements19);
    }

    @Test
    public void test0493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0493");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements4 = document1.getElementsByAttributeValueMatching("hi!", "hi!");
        org.jsoup.nodes.Document document5 = document1.clone();
        org.jsoup.nodes.Node node7 = document1.removeAttr("hi!");
        org.jsoup.nodes.Element element8 = document1.head();
        java.util.List<org.jsoup.nodes.DataNode> dataNodeList9 = document1.dataNodes();
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNotNull(document5);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNull(element8);
        org.junit.Assert.assertNotNull(dataNodeList9);
    }

    @Test
    public void test0494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0494");
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
        java.lang.String str16 = element12.attr("");
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test0495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0495");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements4 = document1.getElementsByAttributeValueMatching("hi!", "hi!");
        boolean boolean5 = document1.hasText();
        org.jsoup.nodes.Element element7 = document1.append("");
        org.jsoup.select.Elements elements8 = document1.siblingElements();
        org.jsoup.nodes.Document document9 = document1.clone();
        java.lang.String str10 = document9.outerHtml();
        org.jsoup.nodes.Document document12 = new org.jsoup.nodes.Document("");
        boolean boolean13 = document12.isBlock();
        java.util.List<org.jsoup.nodes.DataNode> dataNodeList14 = document12.dataNodes();
        java.lang.String str16 = document12.attr("");
        org.jsoup.nodes.Document.QuirksMode quirksMode17 = org.jsoup.nodes.Document.QuirksMode.noQuirks;
        org.jsoup.nodes.Document document18 = document12.quirksMode(quirksMode17);
        org.jsoup.nodes.Document.OutputSettings outputSettings19 = document12.outputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings20 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Document.OutputSettings outputSettings21 = outputSettings20.clone();
        org.jsoup.nodes.Document.OutputSettings outputSettings22 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode23 = outputSettings22.escapeMode();
        java.nio.charset.Charset charset24 = outputSettings22.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings25 = outputSettings21.charset(charset24);
        org.jsoup.nodes.Document.OutputSettings outputSettings26 = outputSettings19.charset(charset24);
        org.jsoup.nodes.Document.OutputSettings outputSettings27 = outputSettings26.clone();
        org.jsoup.nodes.Entities.EscapeMode escapeMode28 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings29 = outputSettings26.escapeMode(escapeMode28);
        org.jsoup.nodes.Document document30 = document9.outputSettings(outputSettings26);
        org.jsoup.select.Elements elements32 = document9.getElementsByAttribute("<html>\n <head></head>\n <body></body>\n</html>");
        org.jsoup.nodes.Node node33 = document9.previousSibling();
        java.lang.String str34 = document9.outerHtml();
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(document9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(dataNodeList14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + quirksMode17 + "' != '" + org.jsoup.nodes.Document.QuirksMode.noQuirks + "'", quirksMode17.equals(org.jsoup.nodes.Document.QuirksMode.noQuirks));
        org.junit.Assert.assertNotNull(document18);
        org.junit.Assert.assertNotNull(outputSettings19);
        org.junit.Assert.assertNotNull(outputSettings21);
        org.junit.Assert.assertTrue("'" + escapeMode23 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode23.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset24);
        org.junit.Assert.assertNotNull(outputSettings25);
        org.junit.Assert.assertNotNull(outputSettings26);
        org.junit.Assert.assertNotNull(outputSettings27);
        org.junit.Assert.assertNotNull(outputSettings29);
        org.junit.Assert.assertNotNull(document30);
        org.junit.Assert.assertNotNull(elements32);
        org.junit.Assert.assertNull(node33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
    }

    @Test
    public void test0496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0496");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements4 = document1.getElementsByAttributeValueMatching("hi!", "hi!");
        org.jsoup.nodes.Document document5 = document1.clone();
        org.jsoup.nodes.Document.QuirksMode quirksMode6 = null;
        org.jsoup.nodes.Document document7 = document1.quirksMode(quirksMode6);
        org.jsoup.nodes.Element element9 = document7.append("<#root class=\"hi!\"></#root>\n<#root></#root>");
        org.jsoup.select.Elements elements12 = document7.getElementsByAttributeValueNot("<#root><#root>", "<html>\n <head></head>\n <body></body>\n</html>");
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNotNull(document5);
        org.junit.Assert.assertNotNull(document7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(elements12);
    }

    @Test
    public void test0497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0497");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.util.List<org.jsoup.nodes.TextNode> textNodeList2 = document1.textNodes();
        org.jsoup.nodes.Element element4 = document1.prependElement("hi!");
        java.lang.String str5 = document1.html();
        java.util.Set<java.lang.String> strSet6 = document1.classNames();
        java.lang.String str7 = document1.tagName();
        org.junit.Assert.assertNotNull(textNodeList2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<hi!></hi!>" + "'", str5, "<hi!></hi!>");
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#root" + "'", str7, "#root");
    }

    @Test
    public void test0498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0498");
        org.jsoup.nodes.Document.OutputSettings outputSettings0 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode1 = outputSettings0.escapeMode();
        java.nio.charset.Charset charset2 = outputSettings0.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings3 = outputSettings0.clone();
        int int4 = outputSettings0.indentAmount();
        boolean boolean5 = outputSettings0.prettyPrint();
        org.jsoup.nodes.Document.OutputSettings outputSettings6 = outputSettings0.clone();
        org.jsoup.nodes.Document.OutputSettings outputSettings7 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode8 = outputSettings7.escapeMode();
        java.nio.charset.Charset charset9 = outputSettings7.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = outputSettings7.clone();
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = new org.jsoup.nodes.Document.OutputSettings();
        org.jsoup.nodes.Entities.EscapeMode escapeMode12 = outputSettings11.escapeMode();
        int int13 = outputSettings11.indentAmount();
        org.jsoup.nodes.Entities.EscapeMode escapeMode14 = outputSettings11.escapeMode();
        org.jsoup.nodes.Document.OutputSettings outputSettings15 = outputSettings7.escapeMode(escapeMode14);
        java.nio.charset.Charset charset16 = outputSettings15.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings17 = outputSettings6.charset(charset16);
        boolean boolean18 = outputSettings6.prettyPrint();
        org.jsoup.nodes.Entities.EscapeMode escapeMode19 = outputSettings6.escapeMode();
        org.junit.Assert.assertTrue("'" + escapeMode1 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode1.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset2);
        org.junit.Assert.assertNotNull(outputSettings3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(outputSettings6);
        org.junit.Assert.assertTrue("'" + escapeMode8 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode8.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(charset9);
        org.junit.Assert.assertNotNull(outputSettings10);
        org.junit.Assert.assertTrue("'" + escapeMode12 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode12.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + escapeMode14 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode14.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertNotNull(outputSettings15);
        org.junit.Assert.assertNotNull(charset16);
        org.junit.Assert.assertNotNull(outputSettings17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + escapeMode19 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode19.equals(org.jsoup.nodes.Entities.EscapeMode.base));
    }

    @Test
    public void test0499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0499");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements4 = document1.getElementsByAttributeValueMatching("hi!", "hi!");
        org.jsoup.nodes.Document document5 = document1.clone();
        org.jsoup.nodes.Node node7 = document1.removeAttr("hi!");
        java.lang.String str8 = document1.ownText();
        org.jsoup.nodes.Element element9 = document1.nextElementSibling();
        org.jsoup.nodes.Document document10 = document1.normalise();
        org.jsoup.nodes.Document.QuirksMode quirksMode11 = org.jsoup.nodes.Document.QuirksMode.noQuirks;
        org.jsoup.nodes.Document document12 = document1.quirksMode(quirksMode11);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node13 = document12.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNotNull(document5);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(element9);
        org.junit.Assert.assertNotNull(document10);
        org.junit.Assert.assertTrue("'" + quirksMode11 + "' != '" + org.jsoup.nodes.Document.QuirksMode.noQuirks + "'", quirksMode11.equals(org.jsoup.nodes.Document.QuirksMode.noQuirks));
        org.junit.Assert.assertNotNull(document12);
    }

    @Test
    public void test0500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0500");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.nodes.Element element3 = document1.append("");
        org.jsoup.nodes.Element element5 = document1.toggleClass("");
        java.lang.String str6 = document1.nodeName();
        java.lang.String str7 = document1.id();
        org.jsoup.nodes.Document.QuirksMode quirksMode8 = document1.quirksMode();
        org.jsoup.nodes.Document document10 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements13 = document10.getElementsByAttributeValueMatching("hi!", "hi!");
        org.jsoup.nodes.Element element14 = document10.head();
        org.jsoup.nodes.Document.OutputSettings outputSettings15 = document10.outputSettings();
        org.jsoup.nodes.Document document16 = document1.outputSettings(outputSettings15);
        org.jsoup.nodes.Element element17 = document1.nextElementSibling();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "#document" + "'", str6, "#document");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + quirksMode8 + "' != '" + org.jsoup.nodes.Document.QuirksMode.noQuirks + "'", quirksMode8.equals(org.jsoup.nodes.Document.QuirksMode.noQuirks));
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertNull(element14);
        org.junit.Assert.assertNotNull(outputSettings15);
        org.junit.Assert.assertNotNull(document16);
        org.junit.Assert.assertNull(element17);
    }
}

