package org.jsoup.parser;

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
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.Token.Comment comment1 = null;
        // The following exception was thrown during execution in test generation
        try {
            xmlTreeBuilder0.insert(comment1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0002");
        org.jsoup.parser.ParseSettings parseSettings0 = org.jsoup.parser.ParseSettings.htmlDefault;
        org.jsoup.nodes.Attributes attributes1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Attributes attributes2 = parseSettings0.normalizeAttributes(attributes1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings0);
    }

    @Test
    public void test0003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0003");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Element element2 = null;
        org.jsoup.parser.Parser parser4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.jsoup.nodes.Node> nodeList5 = xmlTreeBuilder0.parseFragment("hi!", element2, "", parser4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0004");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        java.io.Reader reader1 = null;
        org.jsoup.parser.Parser parser3 = null;
        // The following exception was thrown during execution in test generation
        try {
            xmlTreeBuilder0.initialiseParse(reader1, "", parser3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String input must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0005");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.Token.StartTag startTag1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element2 = xmlTreeBuilder0.insert(startTag1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0006");
        java.lang.StringBuilder stringBuilder0 = null;
        org.jsoup.parser.Token.reset(stringBuilder0);
    }

    @Test
    public void test0007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0007");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor1 = attributes0.iterator();
        org.jsoup.nodes.Attribute attribute2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Attributes attributes3 = attributes0.put(attribute2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(attributeItor1);
    }

    @Test
    public void test0008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0008");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        boolean boolean1 = doctype0.isStartTag();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.StartTag startTag2 = doctype0.asStartTag();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$Doctype cannot be cast to class org.jsoup.parser.Token$StartTag (org.jsoup.parser.Token$Doctype and org.jsoup.parser.Token$StartTag are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0009");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Map<java.lang.String, java.lang.String> strMap1 = attributes0.dataset();
        org.jsoup.nodes.Attribute attribute2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Attributes attributes3 = attributes0.put(attribute2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap1);
    }

    @Test
    public void test0010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0010");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.Token.StartTag startTag2 = new org.jsoup.parser.Token.StartTag();
        startTag2.appendAttributeName(' ');
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element5 = xmlTreeBuilder0.insert(startTag2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must be false");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings1);
    }

    @Test
    public void test0011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0011");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str1 = startTag0.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must be false");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0012");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.Token.StartTag startTag2 = new org.jsoup.parser.Token.StartTag();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element3 = xmlTreeBuilder0.insert(startTag2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must be false");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings1);
    }

    @Test
    public void test0013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0013");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        java.io.Reader reader1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document3 = xmlTreeBuilder0.parse(reader1, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String input must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0014");
        int int0 = org.jsoup.parser.HtmlTreeBuilder.MaxScopeSearchDepth;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 100 + "'", int0 == 100);
    }

    @Test
    public void test0015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0015");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.finaliseTag();
        startTag0.normalName = "";
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = startTag0.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must be false");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0016");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Element element2 = null;
        org.jsoup.parser.Parser parser4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.jsoup.nodes.Node> nodeList5 = xmlTreeBuilder0.parseFragment("", element2, "hi!", parser4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0017");
        org.jsoup.parser.ParseSettings parseSettings0 = org.jsoup.parser.ParseSettings.htmlDefault;
        org.jsoup.nodes.Attributes attributes1 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor2 = attributes1.iterator();
        org.jsoup.nodes.Attributes attributes3 = parseSettings0.normalizeAttributes(attributes1);
        java.util.Map<java.lang.String, java.lang.String> strMap4 = attributes1.dataset();
        java.lang.Class<?> wildcardClass5 = attributes1.getClass();
        org.junit.Assert.assertNotNull(parseSettings0);
        org.junit.Assert.assertNotNull(attributeItor2);
        org.junit.Assert.assertNotNull(attributes3);
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0018");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.Token.StartTag startTag2 = new org.jsoup.parser.Token.StartTag();
        startTag2.finaliseTag();
        startTag2.appendAttributeName('#');
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element6 = xmlTreeBuilder0.insert(startTag2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must be false");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings1);
    }

    @Test
    public void test0019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0019");
        org.jsoup.parser.Token.TokenType tokenType0 = org.jsoup.parser.Token.TokenType.Comment;
        org.junit.Assert.assertTrue("'" + tokenType0 + "' != '" + org.jsoup.parser.Token.TokenType.Comment + "'", tokenType0.equals(org.jsoup.parser.Token.TokenType.Comment));
    }

    @Test
    public void test0020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0020");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.appendAttributeValue("");
        org.jsoup.parser.Token.TokenType tokenType3 = org.jsoup.parser.Token.TokenType.Doctype;
        startTag0.type = tokenType3;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = startTag0.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must be false");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + tokenType3 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType3.equals(org.jsoup.parser.Token.TokenType.Doctype));
    }

    @Test
    public void test0021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0021");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        boolean boolean1 = doctype0.isStartTag();
        java.lang.String str2 = doctype0.getPubSysKey();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.StartTag startTag3 = doctype0.asStartTag();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$Doctype cannot be cast to class org.jsoup.parser.Token$StartTag (org.jsoup.parser.Token$Doctype and org.jsoup.parser.Token$StartTag are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test0022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0022");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str1 = endTag0.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must be false");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0023");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        boolean boolean1 = doctype0.isForceQuirks();
        java.lang.String str2 = doctype0.getSystemIdentifier();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.StartTag startTag3 = doctype0.asStartTag();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$Doctype cannot be cast to class org.jsoup.parser.Token$StartTag (org.jsoup.parser.Token$Doctype and org.jsoup.parser.Token$StartTag are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test0024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0024");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.finaliseTag();
        startTag0.normalName = "";
        org.jsoup.parser.Token.TokenType tokenType4 = startTag0.type;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = startTag0.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must be false");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + tokenType4 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType4.equals(org.jsoup.parser.Token.TokenType.StartTag));
    }

    @Test
    public void test0025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0025");
        org.jsoup.parser.ParseSettings parseSettings0 = org.jsoup.parser.ParseSettings.htmlDefault;
        org.jsoup.nodes.Attributes attributes1 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor2 = attributes1.iterator();
        org.jsoup.nodes.Attributes attributes3 = parseSettings0.normalizeAttributes(attributes1);
        attributes1.remove("hi!");
        org.jsoup.nodes.Attribute attribute6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Attributes attributes7 = attributes1.put(attribute6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings0);
        org.junit.Assert.assertNotNull(attributeItor2);
        org.junit.Assert.assertNotNull(attributes3);
    }

    @Test
    public void test0026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0026");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = xmlTreeBuilder0.defaultSettings();
        java.lang.String str3 = parseSettings1.normalizeTag("hi!");
        java.lang.String str5 = parseSettings1.normalizeTag("hi!");
        org.junit.Assert.assertNotNull(parseSettings1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test0027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0027");
        org.jsoup.parser.Token.TokenType tokenType0 = org.jsoup.parser.Token.TokenType.EOF;
        org.junit.Assert.assertTrue("'" + tokenType0 + "' != '" + org.jsoup.parser.Token.TokenType.EOF + "'", tokenType0.equals(org.jsoup.parser.Token.TokenType.EOF));
    }

    @Test
    public void test0028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0028");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        boolean boolean1 = doctype0.isForceQuirks();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.StartTag startTag2 = doctype0.asStartTag();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$Doctype cannot be cast to class org.jsoup.parser.Token$StartTag (org.jsoup.parser.Token$Doctype and org.jsoup.parser.Token$StartTag are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0029");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.Parser parser4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.jsoup.nodes.Node> nodeList5 = xmlTreeBuilder0.parseFragment("", "hi!", parser4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings1);
    }

    @Test
    public void test0030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0030");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.StringBuilder stringBuilder1 = doctype0.publicIdentifier;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.EndTag endTag2 = doctype0.asEndTag();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$Doctype cannot be cast to class org.jsoup.parser.Token$EndTag (org.jsoup.parser.Token$Doctype and org.jsoup.parser.Token$EndTag are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stringBuilder1);
        org.junit.Assert.assertEquals(stringBuilder1.toString(), "");
    }

    @Test
    public void test0031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0031");
        org.jsoup.parser.Token.CData cData1 = new org.jsoup.parser.Token.CData("hi!");
        org.jsoup.parser.Token token2 = cData1.reset();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.StartTag startTag3 = cData1.asStartTag();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$CData cannot be cast to class org.jsoup.parser.Token$StartTag (org.jsoup.parser.Token$CData and org.jsoup.parser.Token$StartTag are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(token2);
    }

    @Test
    public void test0032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0032");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings2 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.Parser parser5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.jsoup.nodes.Node> nodeList6 = xmlTreeBuilder0.parseFragment("", "<![CDATA[hi!]]>", parser5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings1);
        org.junit.Assert.assertNotNull(parseSettings2);
    }

    @Test
    public void test0033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0033");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = xmlTreeBuilder0.defaultSettings();
        java.io.Reader reader2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document4 = xmlTreeBuilder0.parse(reader2, "</<![CDATA[null]]>>");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String input must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings1);
    }

    @Test
    public void test0034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0034");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        java.lang.String str1 = comment0.getData();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.EndTag endTag2 = comment0.asEndTag();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$Comment cannot be cast to class org.jsoup.parser.Token$EndTag (org.jsoup.parser.Token$Comment and org.jsoup.parser.Token$EndTag are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test0035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0035");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.StringBuilder stringBuilder1 = doctype0.publicIdentifier;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Character character2 = doctype0.asCharacter();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$Doctype cannot be cast to class org.jsoup.parser.Token$Character (org.jsoup.parser.Token$Doctype and org.jsoup.parser.Token$Character are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stringBuilder1);
        org.junit.Assert.assertEquals(stringBuilder1.toString(), "");
    }

    @Test
    public void test0036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0036");
        org.jsoup.parser.Token.TokenType tokenType0 = org.jsoup.parser.Token.TokenType.EndTag;
        org.junit.Assert.assertTrue("'" + tokenType0 + "' != '" + org.jsoup.parser.Token.TokenType.EndTag + "'", tokenType0.equals(org.jsoup.parser.Token.TokenType.EndTag));
    }

    @Test
    public void test0037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0037");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = xmlTreeBuilder0.defaultSettings();
        java.io.Reader reader2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document4 = xmlTreeBuilder0.parse(reader2, " ");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String input must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings1);
    }

    @Test
    public void test0038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0038");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.Attributes attributes2 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor3 = attributes2.iterator();
        org.jsoup.nodes.Attributes attributes6 = attributes2.put("", false);
        org.jsoup.nodes.Attributes attributes7 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor8 = attributes7.iterator();
        boolean boolean10 = attributes7.hasKey("hi!");
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator11 = attributes7.spliterator();
        attributes2.addAll(attributes7);
        org.jsoup.nodes.Attributes attributes13 = parseSettings1.normalizeAttributes(attributes2);
        org.jsoup.nodes.Attribute attribute14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Attributes attributes15 = attributes13.put(attribute14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings1);
        org.junit.Assert.assertNotNull(attributeItor3);
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertNotNull(attributeItor8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(attributeSpliterator11);
        org.junit.Assert.assertNotNull(attributes13);
    }

    @Test
    public void test0039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0039");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.finaliseTag();
        startTag0.appendAttributeValue(' ');
        startTag0.finaliseTag();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Comment comment5 = startTag0.asComment();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$Comment (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$Comment are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0040");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = xmlTreeBuilder0.defaultSettings();
        java.lang.String str3 = parseSettings1.normalizeTag("hi!");
        java.lang.String str5 = parseSettings1.normalizeTag(" ");
        org.junit.Assert.assertNotNull(parseSettings1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test0041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0041");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor1 = attributes0.iterator();
        boolean boolean3 = attributes0.hasKey("hi!");
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator4 = attributes0.spliterator();
        java.lang.String str6 = attributes0.get("</<![CDATA[null]]>>");
        org.junit.Assert.assertNotNull(attributeItor1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(attributeSpliterator4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test0042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0042");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document3 = xmlTreeBuilder0.parse("<![CDATA[hi!]]>", " ");
        org.jsoup.parser.Token.StartTag startTag4 = new org.jsoup.parser.Token.StartTag();
        startTag4.appendAttributeValue("");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element7 = xmlTreeBuilder0.insert(startTag4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must be false");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document3);
    }

    @Test
    public void test0043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0043");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = null;
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.error(htmlTreeBuilderState1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0044");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.state();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState2 = null;
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.error(htmlTreeBuilderState2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(htmlTreeBuilderState1);
    }

    @Test
    public void test0045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0045");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.state();
        org.jsoup.nodes.FormElement formElement2 = null;
        htmlTreeBuilder0.setFormElement(formElement2);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element5 = htmlTreeBuilder0.insertStartTag("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(htmlTreeBuilderState1);
    }

    @Test
    public void test0046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0046");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.appendAttributeValue('a');
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.StartTag startTag3 = endTag0.asStartTag();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$EndTag cannot be cast to class org.jsoup.parser.Token$StartTag (org.jsoup.parser.Token$EndTag and org.jsoup.parser.Token$StartTag are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0047");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.appendAttributeValue("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = startTag0.name();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must be false");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0048");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.finaliseTag();
        java.lang.String str2 = startTag0.normalName();
        org.jsoup.parser.ParseSettings parseSettings3 = org.jsoup.parser.ParseSettings.htmlDefault;
        org.jsoup.nodes.Attributes attributes4 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor5 = attributes4.iterator();
        org.jsoup.nodes.Attributes attributes6 = parseSettings3.normalizeAttributes(attributes4);
        attributes4.remove("hi!");
        boolean boolean10 = attributes4.hasKeyIgnoreCase("");
        startTag0.attributes = attributes4;
        java.util.List<org.jsoup.nodes.Attribute> attributeList12 = attributes4.asList();
        org.jsoup.nodes.Attribute attribute13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Attributes attributes14 = attributes4.put(attribute13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(parseSettings3);
        org.junit.Assert.assertNotNull(attributeItor5);
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(attributeList12);
    }

    @Test
    public void test0049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0049");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.state();
        org.jsoup.nodes.FormElement formElement2 = null;
        htmlTreeBuilder0.setFormElement(formElement2);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder4 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document7 = xmlTreeBuilder4.parse("<![CDATA[hi!]]>", " ");
        htmlTreeBuilder0.setHeadElement((org.jsoup.nodes.Element) document7);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element10 = htmlTreeBuilder0.getActiveFormattingElement(" ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(htmlTreeBuilderState1);
        org.junit.Assert.assertNotNull(document7);
    }

    @Test
    public void test0050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0050");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder1 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState2 = htmlTreeBuilder1.state();
        org.jsoup.nodes.FormElement formElement3 = null;
        htmlTreeBuilder1.setFormElement(formElement3);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder5 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document8 = xmlTreeBuilder5.parse("<![CDATA[hi!]]>", " ");
        htmlTreeBuilder1.setHeadElement((org.jsoup.nodes.Element) document8);
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.removeFromActiveFormattingElements((org.jsoup.nodes.Element) document8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(htmlTreeBuilderState2);
        org.junit.Assert.assertNotNull(document8);
    }

    @Test
    public void test0051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0051");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder1 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState2 = htmlTreeBuilder1.state();
        org.jsoup.nodes.FormElement formElement3 = null;
        htmlTreeBuilder1.setFormElement(formElement3);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder5 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document8 = xmlTreeBuilder5.parse("<![CDATA[hi!]]>", " ");
        htmlTreeBuilder1.setHeadElement((org.jsoup.nodes.Element) document8);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = htmlTreeBuilder0.removeFromStack((org.jsoup.nodes.Element) document8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(htmlTreeBuilderState2);
        org.junit.Assert.assertNotNull(document8);
    }

    @Test
    public void test0052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0052");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.state();
        org.jsoup.nodes.FormElement formElement2 = null;
        htmlTreeBuilder0.setFormElement(formElement2);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = htmlTreeBuilder0.inTableScope("starttag");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(htmlTreeBuilderState1);
    }

    @Test
    public void test0053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0053");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings2 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.Token.StartTag startTag3 = new org.jsoup.parser.Token.StartTag();
        startTag3.appendAttributeName(' ');
        startTag3.normalName = "<![CDATA[null]]>";
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element8 = xmlTreeBuilder0.insert(startTag3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must be false");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings1);
        org.junit.Assert.assertNotNull(parseSettings2);
    }

    @Test
    public void test0054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0054");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.state();
        org.jsoup.nodes.FormElement formElement2 = null;
        htmlTreeBuilder0.setFormElement(formElement2);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.state();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder5 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document8 = xmlTreeBuilder5.parse("<![CDATA[hi!]]>", " ");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element9 = htmlTreeBuilder0.aboveOnStack((org.jsoup.nodes.Element) document8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(htmlTreeBuilderState1);
        org.junit.Assert.assertNull(htmlTreeBuilderState4);
        org.junit.Assert.assertNotNull(document8);
    }

    @Test
    public void test0055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0055");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.state();
        org.jsoup.nodes.FormElement formElement2 = null;
        htmlTreeBuilder0.setFormElement(formElement2);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder4 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document7 = xmlTreeBuilder4.parse("<![CDATA[hi!]]>", " ");
        htmlTreeBuilder0.setHeadElement((org.jsoup.nodes.Element) document7);
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder9 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState10 = htmlTreeBuilder9.state();
        org.jsoup.nodes.FormElement formElement11 = null;
        htmlTreeBuilder9.setFormElement(formElement11);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder13 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document16 = xmlTreeBuilder13.parse("<![CDATA[hi!]]>", " ");
        htmlTreeBuilder9.setHeadElement((org.jsoup.nodes.Element) document16);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = htmlTreeBuilder0.isInActiveFormattingElements((org.jsoup.nodes.Element) document16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(htmlTreeBuilderState1);
        org.junit.Assert.assertNotNull(document7);
        org.junit.Assert.assertNull(htmlTreeBuilderState10);
        org.junit.Assert.assertNotNull(document16);
    }

    @Test
    public void test0056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0056");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.state();
        org.jsoup.nodes.FormElement formElement2 = null;
        htmlTreeBuilder0.setFormElement(formElement2);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder4 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document7 = xmlTreeBuilder4.parse("<![CDATA[hi!]]>", " ");
        htmlTreeBuilder0.setHeadElement((org.jsoup.nodes.Element) document7);
        org.jsoup.parser.Token.Comment comment9 = new org.jsoup.parser.Token.Comment();
        org.jsoup.parser.Token token10 = comment9.reset();
        java.lang.String str11 = comment9.toString();
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.insert(comment9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(htmlTreeBuilderState1);
        org.junit.Assert.assertNotNull(document7);
        org.junit.Assert.assertNotNull(token10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "<!---->" + "'", str11, "<!---->");
    }

    @Test
    public void test0057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0057");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.Parser parser3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.jsoup.nodes.Node> nodeList4 = xmlTreeBuilder0.parseFragment("<![CDATA[null]]>", "starttag", parser3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0058");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.state();
        org.jsoup.nodes.FormElement formElement2 = null;
        htmlTreeBuilder0.setFormElement(formElement2);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder4 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document7 = xmlTreeBuilder4.parse("<![CDATA[hi!]]>", " ");
        htmlTreeBuilder0.setHeadElement((org.jsoup.nodes.Element) document7);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder9 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document12 = xmlTreeBuilder9.parse("", "hi!");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = htmlTreeBuilder0.onStack((org.jsoup.nodes.Element) document12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(htmlTreeBuilderState1);
        org.junit.Assert.assertNotNull(document7);
        org.junit.Assert.assertNotNull(document12);
    }

    @Test
    public void test0059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0059");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.state();
        org.jsoup.nodes.FormElement formElement2 = null;
        htmlTreeBuilder0.setFormElement(formElement2);
        boolean boolean4 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder5 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document8 = xmlTreeBuilder5.parse("<![CDATA[hi!]]>", " ");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element9 = htmlTreeBuilder0.aboveOnStack((org.jsoup.nodes.Element) document8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(htmlTreeBuilderState1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(document8);
    }

    @Test
    public void test0060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0060");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.state();
        org.jsoup.nodes.FormElement formElement2 = null;
        htmlTreeBuilder0.setFormElement(formElement2);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = null;
        htmlTreeBuilder0.transition(htmlTreeBuilderState4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = htmlTreeBuilder0.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(htmlTreeBuilderState1);
    }

    @Test
    public void test0061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0061");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        java.lang.StringBuilder stringBuilder1 = comment0.data;
        comment0.bogus = false;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Character character4 = comment0.asCharacter();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$Comment cannot be cast to class org.jsoup.parser.Token$Character (org.jsoup.parser.Token$Comment and org.jsoup.parser.Token$Character are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stringBuilder1);
        org.junit.Assert.assertEquals(stringBuilder1.toString(), "");
    }

    @Test
    public void test0062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0062");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.appendAttributeName(' ');
        boolean boolean3 = startTag0.selfClosing;
        startTag0.newAttribute();
        org.jsoup.parser.Token.Tag tag6 = startTag0.name("<![CDATA[null]]>");
        org.jsoup.parser.Token.StartTag startTag7 = new org.jsoup.parser.Token.StartTag();
        startTag7.appendAttributeValue("");
        org.jsoup.parser.Token.TokenType tokenType10 = org.jsoup.parser.Token.TokenType.Doctype;
        startTag7.type = tokenType10;
        startTag0.type = tokenType10;
        startTag0.newAttribute();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Doctype doctype14 = startTag0.asDoctype();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$Doctype (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$Doctype are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(tag6);
        org.junit.Assert.assertTrue("'" + tokenType10 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType10.equals(org.jsoup.parser.Token.TokenType.Doctype));
    }

    @Test
    public void test0063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0063");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.finaliseTag();
        startTag0.appendAttributeValue(' ');
        java.lang.String str4 = startTag0.tokenType();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Character character5 = startTag0.asCharacter();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$Character (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$Character are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "StartTag" + "'", str4, "StartTag");
    }

    @Test
    public void test0064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0064");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.state();
        htmlTreeBuilder0.setFosterInserts(true);
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder4 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState5 = htmlTreeBuilder4.state();
        org.jsoup.nodes.FormElement formElement6 = null;
        htmlTreeBuilder4.setFormElement(formElement6);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder8 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document11 = xmlTreeBuilder8.parse("<![CDATA[hi!]]>", " ");
        htmlTreeBuilder4.setHeadElement((org.jsoup.nodes.Element) document11);
        htmlTreeBuilder0.setHeadElement((org.jsoup.nodes.Element) document11);
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder14 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState15 = htmlTreeBuilder14.state();
        htmlTreeBuilder14.setFosterInserts(true);
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder18 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState19 = htmlTreeBuilder18.state();
        org.jsoup.nodes.FormElement formElement20 = null;
        htmlTreeBuilder18.setFormElement(formElement20);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder22 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document25 = xmlTreeBuilder22.parse("<![CDATA[hi!]]>", " ");
        htmlTreeBuilder18.setHeadElement((org.jsoup.nodes.Element) document25);
        htmlTreeBuilder14.setHeadElement((org.jsoup.nodes.Element) document25);
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.removeFromActiveFormattingElements((org.jsoup.nodes.Element) document25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(htmlTreeBuilderState1);
        org.junit.Assert.assertNull(htmlTreeBuilderState5);
        org.junit.Assert.assertNotNull(document11);
        org.junit.Assert.assertNull(htmlTreeBuilderState15);
        org.junit.Assert.assertNull(htmlTreeBuilderState19);
        org.junit.Assert.assertNotNull(document25);
    }

    @Test
    public void test0065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0065");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.state();
        org.jsoup.nodes.FormElement formElement2 = null;
        htmlTreeBuilder0.setFormElement(formElement2);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder4 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document7 = xmlTreeBuilder4.parse("", "hi!");
        org.jsoup.nodes.Document document10 = xmlTreeBuilder4.parse("<![CDATA[hi!]]>", "<!---->");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder11 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document14 = xmlTreeBuilder11.parse("<![CDATA[hi!]]>", " ");
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.replaceOnStack((org.jsoup.nodes.Element) document10, (org.jsoup.nodes.Element) document14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(htmlTreeBuilderState1);
        org.junit.Assert.assertNotNull(document7);
        org.junit.Assert.assertNotNull(document10);
        org.junit.Assert.assertNotNull(document14);
    }

    @Test
    public void test0066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0066");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.state();
        org.jsoup.nodes.FormElement formElement2 = null;
        htmlTreeBuilder0.setFormElement(formElement2);
        boolean boolean4 = htmlTreeBuilder0.isFragmentParsing();
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.clearFormattingElementsToLastMarker();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(htmlTreeBuilderState1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0067");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor1 = attributes0.iterator();
        org.jsoup.nodes.Attributes attributes4 = attributes0.put("", false);
        org.jsoup.parser.ParseSettings parseSettings5 = org.jsoup.parser.ParseSettings.htmlDefault;
        org.jsoup.nodes.Attributes attributes6 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor7 = attributes6.iterator();
        org.jsoup.nodes.Attributes attributes8 = parseSettings5.normalizeAttributes(attributes6);
        attributes6.remove("hi!");
        org.jsoup.nodes.Attributes attributes13 = attributes6.put("hi!", false);
        attributes4.addAll(attributes13);
        java.lang.String str16 = attributes13.get("StartTag");
        org.junit.Assert.assertNotNull(attributeItor1);
        org.junit.Assert.assertNotNull(attributes4);
        org.junit.Assert.assertNotNull(parseSettings5);
        org.junit.Assert.assertNotNull(attributeItor7);
        org.junit.Assert.assertNotNull(attributes8);
        org.junit.Assert.assertNotNull(attributes13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test0068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0068");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.state();
        org.jsoup.nodes.FormElement formElement2 = null;
        htmlTreeBuilder0.setFormElement(formElement2);
        boolean boolean4 = htmlTreeBuilder0.isFragmentParsing();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element6 = htmlTreeBuilder0.insertStartTag("StartTag");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(htmlTreeBuilderState1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0069");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.state();
        htmlTreeBuilder0.setFosterInserts(true);
        boolean boolean4 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder5 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState6 = htmlTreeBuilder5.state();
        org.jsoup.nodes.FormElement formElement7 = null;
        htmlTreeBuilder5.setFormElement(formElement7);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder9 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document12 = xmlTreeBuilder9.parse("<![CDATA[hi!]]>", " ");
        htmlTreeBuilder5.setHeadElement((org.jsoup.nodes.Element) document12);
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.removeFromActiveFormattingElements((org.jsoup.nodes.Element) document12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(htmlTreeBuilderState1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(htmlTreeBuilderState6);
        org.junit.Assert.assertNotNull(document12);
    }

    @Test
    public void test0070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0070");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.state();
        org.jsoup.nodes.FormElement formElement2 = null;
        htmlTreeBuilder0.setFormElement(formElement2);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.state();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState5 = null;
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.error(htmlTreeBuilderState5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(htmlTreeBuilderState1);
        org.junit.Assert.assertNull(htmlTreeBuilderState4);
    }

    @Test
    public void test0071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0071");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.state();
        org.jsoup.nodes.FormElement formElement2 = null;
        htmlTreeBuilder0.setFormElement(formElement2);
        htmlTreeBuilder0.setFosterInserts(true);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = htmlTreeBuilder0.inScope("<![CDATA[null]]>");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(htmlTreeBuilderState1);
    }

    @Test
    public void test0072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0072");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.state();
        org.jsoup.nodes.FormElement formElement2 = null;
        htmlTreeBuilder0.setFormElement(formElement2);
        boolean boolean4 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.parser.Token.CData cData6 = new org.jsoup.parser.Token.CData("hi!");
        org.jsoup.parser.Token token7 = cData6.reset();
        boolean boolean8 = cData6.isComment();
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.insert((org.jsoup.parser.Token.Character) cData6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(htmlTreeBuilderState1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(token7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0073");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.state();
        org.jsoup.nodes.FormElement formElement2 = null;
        htmlTreeBuilder0.setFormElement(formElement2);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder4 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document7 = xmlTreeBuilder4.parse("<![CDATA[hi!]]>", " ");
        htmlTreeBuilder0.setHeadElement((org.jsoup.nodes.Element) document7);
        java.lang.String[] strArray9 = org.jsoup.parser.HtmlTreeBuilder.TagSearchSelectScope;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = htmlTreeBuilder0.inScope(strArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(htmlTreeBuilderState1);
        org.junit.Assert.assertNotNull(document7);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "optgroup", "option" });
    }

    @Test
    public void test0074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0074");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.state();
        htmlTreeBuilder0.setFosterInserts(true);
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder4 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState5 = htmlTreeBuilder4.state();
        org.jsoup.nodes.FormElement formElement6 = null;
        htmlTreeBuilder4.setFormElement(formElement6);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder8 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document11 = xmlTreeBuilder8.parse("<![CDATA[hi!]]>", " ");
        htmlTreeBuilder4.setHeadElement((org.jsoup.nodes.Element) document11);
        htmlTreeBuilder0.setHeadElement((org.jsoup.nodes.Element) document11);
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder14 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState15 = htmlTreeBuilder14.state();
        htmlTreeBuilder14.setFosterInserts(true);
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder18 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState19 = htmlTreeBuilder18.state();
        org.jsoup.nodes.FormElement formElement20 = null;
        htmlTreeBuilder18.setFormElement(formElement20);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder22 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document25 = xmlTreeBuilder22.parse("<![CDATA[hi!]]>", " ");
        htmlTreeBuilder18.setHeadElement((org.jsoup.nodes.Element) document25);
        htmlTreeBuilder14.setHeadElement((org.jsoup.nodes.Element) document25);
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder28 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState29 = htmlTreeBuilder28.state();
        org.jsoup.nodes.FormElement formElement30 = null;
        htmlTreeBuilder28.setFormElement(formElement30);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder32 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document35 = xmlTreeBuilder32.parse("<![CDATA[hi!]]>", " ");
        htmlTreeBuilder28.setHeadElement((org.jsoup.nodes.Element) document35);
        org.jsoup.nodes.Element element37 = htmlTreeBuilder28.getHeadElement();
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.insertOnStackAfter((org.jsoup.nodes.Element) document25, element37);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(htmlTreeBuilderState1);
        org.junit.Assert.assertNull(htmlTreeBuilderState5);
        org.junit.Assert.assertNotNull(document11);
        org.junit.Assert.assertNull(htmlTreeBuilderState15);
        org.junit.Assert.assertNull(htmlTreeBuilderState19);
        org.junit.Assert.assertNotNull(document25);
        org.junit.Assert.assertNull(htmlTreeBuilderState29);
        org.junit.Assert.assertNotNull(document35);
        org.junit.Assert.assertNotNull(element37);
    }

    @Test
    public void test0075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0075");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document3 = xmlTreeBuilder0.parse("<![CDATA[hi!]]>", " ");
        org.jsoup.parser.Token.Comment comment4 = new org.jsoup.parser.Token.Comment();
        org.jsoup.parser.Token token5 = comment4.reset();
        xmlTreeBuilder0.insert(comment4);
        org.jsoup.parser.Parser parser9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.jsoup.nodes.Node> nodeList10 = xmlTreeBuilder0.parseFragment(" ", "starttag", parser9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(token5);
    }

    @Test
    public void test0076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0076");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.finaliseTag();
        startTag0.tagName = "";
        int[] intArray8 = new int[] { 0, (byte) 10, (short) 10, (short) 1 };
        startTag0.appendAttributeValue(intArray8);
        startTag0.finaliseTag();
        startTag0.appendAttributeName('#');
        startTag0.appendAttributeName("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Comment comment15 = startTag0.asComment();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$Comment (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$Comment are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertArrayEquals(intArray8, new int[] { 0, 10, 10, 1 });
    }

    @Test
    public void test0077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0077");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.finaliseTag();
        startTag0.appendAttributeValue(' ');
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Comment comment4 = startTag0.asComment();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$Comment (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$Comment are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0078");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor1 = attributes0.iterator();
        org.jsoup.nodes.Attributes attributes4 = attributes0.put("", false);
        org.jsoup.parser.ParseSettings parseSettings5 = org.jsoup.parser.ParseSettings.htmlDefault;
        org.jsoup.nodes.Attributes attributes6 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor7 = attributes6.iterator();
        org.jsoup.nodes.Attributes attributes8 = parseSettings5.normalizeAttributes(attributes6);
        attributes6.remove("hi!");
        org.jsoup.nodes.Attributes attributes13 = attributes6.put("hi!", false);
        attributes4.addAll(attributes13);
        attributes13.remove("");
        org.junit.Assert.assertNotNull(attributeItor1);
        org.junit.Assert.assertNotNull(attributes4);
        org.junit.Assert.assertNotNull(parseSettings5);
        org.junit.Assert.assertNotNull(attributeItor7);
        org.junit.Assert.assertNotNull(attributes8);
        org.junit.Assert.assertNotNull(attributes13);
    }

    @Test
    public void test0079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0079");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document3 = xmlTreeBuilder0.parse("<![CDATA[hi!]]>", " ");
        org.jsoup.parser.Token.CData cData5 = new org.jsoup.parser.Token.CData("hi!");
        xmlTreeBuilder0.insert((org.jsoup.parser.Token.Character) cData5);
        org.jsoup.parser.Token.Doctype doctype7 = new org.jsoup.parser.Token.Doctype();
        boolean boolean8 = doctype7.isEOF();
        boolean boolean9 = doctype7.isCharacter();
        boolean boolean10 = doctype7.isComment();
        xmlTreeBuilder0.insert(doctype7);
        org.jsoup.parser.Parser parser14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.jsoup.nodes.Node> nodeList15 = xmlTreeBuilder0.parseFragment("<![cdata[null]]>", "<![cdata[null]]>", parser14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0080");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.state();
        org.jsoup.nodes.FormElement formElement2 = null;
        htmlTreeBuilder0.setFormElement(formElement2);
        htmlTreeBuilder0.setFosterInserts(true);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder6 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document9 = xmlTreeBuilder6.parse("", "hi!");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = htmlTreeBuilder0.onStack((org.jsoup.nodes.Element) document9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(htmlTreeBuilderState1);
        org.junit.Assert.assertNotNull(document9);
    }

    @Test
    public void test0081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0081");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.state();
        org.jsoup.nodes.FormElement formElement2 = null;
        htmlTreeBuilder0.setFormElement(formElement2);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = null;
        htmlTreeBuilder0.transition(htmlTreeBuilderState4);
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.popStackToClose("</<![CDATA[null]]>>");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(htmlTreeBuilderState1);
    }

    @Test
    public void test0082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0082");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.state();
        htmlTreeBuilder0.setFosterInserts(true);
        boolean boolean4 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder5 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState6 = htmlTreeBuilder5.state();
        org.jsoup.nodes.FormElement formElement7 = null;
        htmlTreeBuilder5.setFormElement(formElement7);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder9 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document12 = xmlTreeBuilder9.parse("<![CDATA[hi!]]>", " ");
        htmlTreeBuilder5.setHeadElement((org.jsoup.nodes.Element) document12);
        org.jsoup.nodes.Element element14 = htmlTreeBuilder5.getHeadElement();
        htmlTreeBuilder0.setHeadElement(element14);
        org.jsoup.parser.Token.StartTag startTag16 = new org.jsoup.parser.Token.StartTag();
        startTag16.finaliseTag();
        startTag16.tagName = "";
        int[] intArray24 = new int[] { 0, (byte) 10, (short) 10, (short) 1 };
        startTag16.appendAttributeValue(intArray24);
        startTag16.finaliseTag();
        startTag16.appendAttributeName('#');
        org.jsoup.nodes.Attributes attributes29 = startTag16.attributes;
        startTag16.newAttribute();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean31 = htmlTreeBuilder0.process((org.jsoup.parser.Token) startTag16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(htmlTreeBuilderState1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(htmlTreeBuilderState6);
        org.junit.Assert.assertNotNull(document12);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertArrayEquals(intArray24, new int[] { 0, 10, 10, 1 });
        org.junit.Assert.assertNotNull(attributes29);
    }

    @Test
    public void test0083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0083");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        org.jsoup.parser.Token.Tag tag2 = endTag0.name("<![CDATA[null]]>");
        java.lang.String str3 = endTag0.toString();
        boolean boolean4 = endTag0.isComment();
        int[] intArray11 = new int[] { 1, '#', 'a', '#', (-1), '#' };
        // The following exception was thrown during execution in test generation
        try {
            endTag0.appendAttributeValue(intArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Not a valid Unicode code point: 0xFFFFFFFF");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tag2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "</<![CDATA[null]]>>" + "'", str3, "</<![CDATA[null]]>>");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 1, 35, 97, 35, (-1), 35 });
    }

    @Test
    public void test0084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0084");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.state();
        htmlTreeBuilder0.setFosterInserts(true);
        boolean boolean4 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder5 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState6 = htmlTreeBuilder5.state();
        org.jsoup.nodes.FormElement formElement7 = null;
        htmlTreeBuilder5.setFormElement(formElement7);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder9 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document12 = xmlTreeBuilder9.parse("<![CDATA[hi!]]>", " ");
        htmlTreeBuilder5.setHeadElement((org.jsoup.nodes.Element) document12);
        org.jsoup.nodes.Element element14 = htmlTreeBuilder5.getHeadElement();
        htmlTreeBuilder0.setHeadElement(element14);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element17 = htmlTreeBuilder0.insertStartTag("StartTag");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(htmlTreeBuilderState1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(htmlTreeBuilderState6);
        org.junit.Assert.assertNotNull(document12);
        org.junit.Assert.assertNotNull(element14);
    }

    @Test
    public void test0085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0085");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.state();
        htmlTreeBuilder0.setFosterInserts(true);
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder4 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState5 = htmlTreeBuilder4.state();
        org.jsoup.nodes.FormElement formElement6 = null;
        htmlTreeBuilder4.setFormElement(formElement6);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder8 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document11 = xmlTreeBuilder8.parse("<![CDATA[hi!]]>", " ");
        htmlTreeBuilder4.setHeadElement((org.jsoup.nodes.Element) document11);
        htmlTreeBuilder0.setHeadElement((org.jsoup.nodes.Element) document11);
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.popStackToBefore("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(htmlTreeBuilderState1);
        org.junit.Assert.assertNull(htmlTreeBuilderState5);
        org.junit.Assert.assertNotNull(document11);
    }

    @Test
    public void test0086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0086");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.state();
        org.jsoup.nodes.FormElement formElement2 = null;
        htmlTreeBuilder0.setFormElement(formElement2);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder4 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document7 = xmlTreeBuilder4.parse("<![CDATA[hi!]]>", " ");
        htmlTreeBuilder0.setHeadElement((org.jsoup.nodes.Element) document7);
        org.jsoup.nodes.Element element9 = htmlTreeBuilder0.getHeadElement();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = htmlTreeBuilder0.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(htmlTreeBuilderState1);
        org.junit.Assert.assertNotNull(document7);
        org.junit.Assert.assertNotNull(element9);
    }

    @Test
    public void test0087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0087");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings2 = xmlTreeBuilder0.defaultSettings();
        java.io.Reader reader3 = null;
        org.jsoup.parser.Parser parser5 = null;
        // The following exception was thrown during execution in test generation
        try {
            xmlTreeBuilder0.initialiseParse(reader3, "", parser5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String input must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings1);
        org.junit.Assert.assertNotNull(parseSettings2);
    }

    @Test
    public void test0088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0088");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.state();
        org.jsoup.nodes.FormElement formElement2 = null;
        htmlTreeBuilder0.setFormElement(formElement2);
        boolean boolean4 = htmlTreeBuilder0.isFragmentParsing();
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.popStackToClose("starttag");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(htmlTreeBuilderState1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0089");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.state();
        org.jsoup.nodes.FormElement formElement2 = null;
        htmlTreeBuilder0.setFormElement(formElement2);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder4 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document7 = xmlTreeBuilder4.parse("<![CDATA[hi!]]>", " ");
        htmlTreeBuilder0.setHeadElement((org.jsoup.nodes.Element) document7);
        org.jsoup.nodes.Element element9 = htmlTreeBuilder0.getHeadElement();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder10 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState11 = htmlTreeBuilder10.state();
        htmlTreeBuilder10.setFosterInserts(true);
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder14 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState15 = htmlTreeBuilder14.state();
        org.jsoup.nodes.FormElement formElement16 = null;
        htmlTreeBuilder14.setFormElement(formElement16);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder18 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document21 = xmlTreeBuilder18.parse("<![CDATA[hi!]]>", " ");
        htmlTreeBuilder14.setHeadElement((org.jsoup.nodes.Element) document21);
        htmlTreeBuilder10.setHeadElement((org.jsoup.nodes.Element) document21);
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.push((org.jsoup.nodes.Element) document21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(htmlTreeBuilderState1);
        org.junit.Assert.assertNotNull(document7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNull(htmlTreeBuilderState11);
        org.junit.Assert.assertNull(htmlTreeBuilderState15);
        org.junit.Assert.assertNotNull(document21);
    }

    @Test
    public void test0090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0090");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.state();
        org.jsoup.nodes.FormElement formElement2 = null;
        htmlTreeBuilder0.setFormElement(formElement2);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder4 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document7 = xmlTreeBuilder4.parse("<![CDATA[hi!]]>", " ");
        htmlTreeBuilder0.setHeadElement((org.jsoup.nodes.Element) document7);
        boolean boolean9 = htmlTreeBuilder0.isFragmentParsing();
        htmlTreeBuilder0.setFosterInserts(false);
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.reconstructFormattingElements();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(htmlTreeBuilderState1);
        org.junit.Assert.assertNotNull(document7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0091");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.state();
        org.jsoup.nodes.FormElement formElement2 = null;
        htmlTreeBuilder0.setFormElement(formElement2);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder4 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document7 = xmlTreeBuilder4.parse("<![CDATA[hi!]]>", " ");
        htmlTreeBuilder0.setHeadElement((org.jsoup.nodes.Element) document7);
        boolean boolean9 = htmlTreeBuilder0.isFragmentParsing();
        htmlTreeBuilder0.setFosterInserts(false);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder12 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document15 = xmlTreeBuilder12.parse("", "hi!");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = htmlTreeBuilder0.onStack((org.jsoup.nodes.Element) document15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(htmlTreeBuilderState1);
        org.junit.Assert.assertNotNull(document7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(document15);
    }

    @Test
    public void test0092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0092");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.state();
        org.jsoup.nodes.FormElement formElement2 = null;
        htmlTreeBuilder0.setFormElement(formElement2);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder4 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document7 = xmlTreeBuilder4.parse("<![CDATA[hi!]]>", " ");
        htmlTreeBuilder0.setHeadElement((org.jsoup.nodes.Element) document7);
        boolean boolean9 = htmlTreeBuilder0.isFragmentParsing();
        htmlTreeBuilder0.setFosterInserts(false);
        org.jsoup.nodes.Attributes attributes13 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor14 = attributes13.iterator();
        org.jsoup.nodes.Attributes attributes17 = attributes13.put("", false);
        org.jsoup.nodes.Attributes attributes18 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor19 = attributes18.iterator();
        boolean boolean21 = attributes18.hasKey("hi!");
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator22 = attributes18.spliterator();
        attributes13.addAll(attributes18);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean24 = htmlTreeBuilder0.processStartTag("starttag", attributes18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(htmlTreeBuilderState1);
        org.junit.Assert.assertNotNull(document7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(attributeItor14);
        org.junit.Assert.assertNotNull(attributes17);
        org.junit.Assert.assertNotNull(attributeItor19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(attributeSpliterator22);
    }

    @Test
    public void test0093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0093");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.state();
        org.jsoup.nodes.FormElement formElement2 = null;
        htmlTreeBuilder0.setFormElement(formElement2);
        htmlTreeBuilder0.setFosterInserts(true);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = htmlTreeBuilder0.inScope("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(htmlTreeBuilderState1);
    }

    @Test
    public void test0094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0094");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document3 = xmlTreeBuilder0.parse("<![CDATA[hi!]]>", " ");
        org.jsoup.parser.Token.Comment comment4 = new org.jsoup.parser.Token.Comment();
        org.jsoup.parser.Token token5 = comment4.reset();
        xmlTreeBuilder0.insert(comment4);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder8 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document11 = xmlTreeBuilder8.parse("", "hi!");
        org.jsoup.parser.Parser parser13 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.jsoup.nodes.Node> nodeList14 = xmlTreeBuilder0.parseFragment("", (org.jsoup.nodes.Element) document11, "<![CDATA[hi!]]>", parser13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(token5);
        org.junit.Assert.assertNotNull(document11);
    }

    @Test
    public void test0095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0095");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document3 = xmlTreeBuilder0.parse("", "hi!");
        org.jsoup.nodes.Document document6 = xmlTreeBuilder0.parse("<![CDATA[hi!]]>", "<!---->");
        org.jsoup.parser.Token.StartTag startTag7 = new org.jsoup.parser.Token.StartTag();
        startTag7.finaliseTag();
        startTag7.tagName = "";
        org.jsoup.nodes.Attributes attributes11 = startTag7.attributes;
        org.jsoup.parser.Token.Doctype doctype12 = new org.jsoup.parser.Token.Doctype();
        boolean boolean13 = doctype12.isEOF();
        boolean boolean14 = doctype12.isCharacter();
        org.jsoup.parser.Token.TokenType tokenType15 = doctype12.type;
        startTag7.type = tokenType15;
        java.lang.String str17 = startTag7.normalName;
        org.jsoup.parser.Token.TokenType tokenType18 = startTag7.type;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element19 = xmlTreeBuilder0.insert(startTag7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must be false");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(document6);
        org.junit.Assert.assertNotNull(attributes11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + tokenType15 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType15.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + tokenType18 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType18.equals(org.jsoup.parser.Token.TokenType.Doctype));
    }

    @Test
    public void test0096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0096");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.finaliseTag();
        startTag0.appendAttributeName('#');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = startTag0.name();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must be false");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0097");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.state();
        org.jsoup.nodes.FormElement formElement2 = null;
        htmlTreeBuilder0.setFormElement(formElement2);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder4 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document7 = xmlTreeBuilder4.parse("<![CDATA[hi!]]>", " ");
        htmlTreeBuilder0.setHeadElement((org.jsoup.nodes.Element) document7);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element9 = htmlTreeBuilder0.pop();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(htmlTreeBuilderState1);
        org.junit.Assert.assertNotNull(document7);
    }

    @Test
    public void test0098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0098");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = null;
        htmlTreeBuilder0.transition(htmlTreeBuilderState1);
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.clearFormattingElementsToLastMarker();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0099");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.state();
        org.jsoup.nodes.FormElement formElement2 = null;
        htmlTreeBuilder0.setFormElement(formElement2);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = null;
        htmlTreeBuilder0.transition(htmlTreeBuilderState4);
        boolean boolean6 = htmlTreeBuilder0.isFosterInserts();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState7 = htmlTreeBuilder0.state();
        java.lang.String[] strArray13 = new java.lang.String[] { "hi!", "starttag", "starttag", "</<![CDATA[null]]>>", "</<![CDATA[null]]>>" };
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.popStackToClose(strArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(htmlTreeBuilderState1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(htmlTreeBuilderState7);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[] { "hi!", "starttag", "starttag", "</<![CDATA[null]]>>", "</<![CDATA[null]]>>" });
    }

    @Test
    public void test0100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0100");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document3 = xmlTreeBuilder0.parse("<![CDATA[hi!]]>", " ");
        org.jsoup.parser.Parser parser6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.jsoup.nodes.Node> nodeList7 = xmlTreeBuilder0.parseFragment("hi!", "<![CDATA[hi!]]>", parser6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document3);
    }

    @Test
    public void test0101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0101");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.state();
        org.jsoup.nodes.FormElement formElement2 = null;
        htmlTreeBuilder0.setFormElement(formElement2);
        boolean boolean4 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.parser.ParseSettings parseSettings5 = org.jsoup.parser.ParseSettings.htmlDefault;
        org.jsoup.nodes.Attributes attributes6 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor7 = attributes6.iterator();
        org.jsoup.nodes.Attributes attributes8 = parseSettings5.normalizeAttributes(attributes6);
        attributes6.remove("hi!");
        org.jsoup.parser.Token.StartTag startTag11 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.TokenType tokenType12 = org.jsoup.parser.Token.TokenType.StartTag;
        startTag11.type = tokenType12;
        boolean boolean14 = attributes6.equals((java.lang.Object) startTag11);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = htmlTreeBuilder0.process((org.jsoup.parser.Token) startTag11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(htmlTreeBuilderState1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(parseSettings5);
        org.junit.Assert.assertNotNull(attributeItor7);
        org.junit.Assert.assertNotNull(attributes8);
        org.junit.Assert.assertTrue("'" + tokenType12 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType12.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0102");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings2 = xmlTreeBuilder0.defaultSettings();
        java.io.Reader reader3 = null;
        org.jsoup.parser.Parser parser5 = null;
        // The following exception was thrown during execution in test generation
        try {
            xmlTreeBuilder0.initialiseParse(reader3, "starttag", parser5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String input must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings1);
        org.junit.Assert.assertNotNull(parseSettings2);
    }

    @Test
    public void test0103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0103");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.state();
        org.jsoup.nodes.FormElement formElement2 = null;
        htmlTreeBuilder0.setFormElement(formElement2);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder4 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document7 = xmlTreeBuilder4.parse("<![CDATA[hi!]]>", " ");
        htmlTreeBuilder0.setHeadElement((org.jsoup.nodes.Element) document7);
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder9 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState10 = htmlTreeBuilder9.state();
        org.jsoup.nodes.FormElement formElement11 = null;
        htmlTreeBuilder9.setFormElement(formElement11);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState13 = null;
        htmlTreeBuilder9.transition(htmlTreeBuilderState13);
        boolean boolean15 = htmlTreeBuilder9.isFosterInserts();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState16 = htmlTreeBuilder9.state();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder17 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document20 = xmlTreeBuilder17.parse("", "hi!");
        org.jsoup.nodes.Document document23 = xmlTreeBuilder17.parse("<![CDATA[hi!]]>", "<!---->");
        htmlTreeBuilder9.setHeadElement((org.jsoup.nodes.Element) document23);
        boolean boolean25 = htmlTreeBuilder0.isSpecial((org.jsoup.nodes.Element) document23);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder26 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document29 = xmlTreeBuilder26.parse("<![CDATA[hi!]]>", " ");
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.push((org.jsoup.nodes.Element) document29);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(htmlTreeBuilderState1);
        org.junit.Assert.assertNotNull(document7);
        org.junit.Assert.assertNull(htmlTreeBuilderState10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(htmlTreeBuilderState16);
        org.junit.Assert.assertNotNull(document20);
        org.junit.Assert.assertNotNull(document23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(document29);
    }

    @Test
    public void test0104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0104");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.state();
        org.jsoup.nodes.FormElement formElement2 = null;
        htmlTreeBuilder0.setFormElement(formElement2);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder4 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document7 = xmlTreeBuilder4.parse("<![CDATA[hi!]]>", " ");
        htmlTreeBuilder0.setHeadElement((org.jsoup.nodes.Element) document7);
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder9 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState10 = htmlTreeBuilder9.state();
        org.jsoup.nodes.FormElement formElement11 = null;
        htmlTreeBuilder9.setFormElement(formElement11);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState13 = null;
        htmlTreeBuilder9.transition(htmlTreeBuilderState13);
        boolean boolean15 = htmlTreeBuilder9.isFosterInserts();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState16 = htmlTreeBuilder9.state();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder17 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document20 = xmlTreeBuilder17.parse("", "hi!");
        org.jsoup.nodes.Document document23 = xmlTreeBuilder17.parse("<![CDATA[hi!]]>", "<!---->");
        htmlTreeBuilder9.setHeadElement((org.jsoup.nodes.Element) document23);
        boolean boolean25 = htmlTreeBuilder0.isSpecial((org.jsoup.nodes.Element) document23);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder26 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document29 = xmlTreeBuilder26.parse("<![CDATA[hi!]]>", " ");
        org.jsoup.parser.Token.Comment comment30 = new org.jsoup.parser.Token.Comment();
        org.jsoup.parser.Token token31 = comment30.reset();
        xmlTreeBuilder26.insert(comment30);
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.insert(comment30);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(htmlTreeBuilderState1);
        org.junit.Assert.assertNotNull(document7);
        org.junit.Assert.assertNull(htmlTreeBuilderState10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(htmlTreeBuilderState16);
        org.junit.Assert.assertNotNull(document20);
        org.junit.Assert.assertNotNull(document23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(document29);
        org.junit.Assert.assertNotNull(token31);
    }

    @Test
    public void test0105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0105");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.state();
        htmlTreeBuilder0.setFosterInserts(true);
        boolean boolean4 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder5 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState6 = htmlTreeBuilder5.state();
        org.jsoup.nodes.FormElement formElement7 = null;
        htmlTreeBuilder5.setFormElement(formElement7);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder9 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document12 = xmlTreeBuilder9.parse("<![CDATA[hi!]]>", " ");
        htmlTreeBuilder5.setHeadElement((org.jsoup.nodes.Element) document12);
        org.jsoup.nodes.Element element14 = htmlTreeBuilder5.getHeadElement();
        htmlTreeBuilder0.setHeadElement(element14);
        htmlTreeBuilder0.framesetOk(false);
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder18 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState19 = htmlTreeBuilder18.state();
        org.jsoup.nodes.FormElement formElement20 = null;
        htmlTreeBuilder18.setFormElement(formElement20);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState22 = null;
        htmlTreeBuilder18.transition(htmlTreeBuilderState22);
        boolean boolean24 = htmlTreeBuilder18.isFosterInserts();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState25 = htmlTreeBuilder18.state();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder26 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document29 = xmlTreeBuilder26.parse("", "hi!");
        org.jsoup.nodes.Document document32 = xmlTreeBuilder26.parse("<![CDATA[hi!]]>", "<!---->");
        htmlTreeBuilder18.setHeadElement((org.jsoup.nodes.Element) document32);
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder34 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState35 = htmlTreeBuilder34.state();
        org.jsoup.nodes.FormElement formElement36 = null;
        htmlTreeBuilder34.setFormElement(formElement36);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder38 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document41 = xmlTreeBuilder38.parse("<![CDATA[hi!]]>", " ");
        htmlTreeBuilder34.setHeadElement((org.jsoup.nodes.Element) document41);
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.replaceOnStack((org.jsoup.nodes.Element) document32, (org.jsoup.nodes.Element) document41);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(htmlTreeBuilderState1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(htmlTreeBuilderState6);
        org.junit.Assert.assertNotNull(document12);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNull(htmlTreeBuilderState19);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(htmlTreeBuilderState25);
        org.junit.Assert.assertNotNull(document29);
        org.junit.Assert.assertNotNull(document32);
        org.junit.Assert.assertNull(htmlTreeBuilderState35);
        org.junit.Assert.assertNotNull(document41);
    }

    @Test
    public void test0106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0106");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.appendAttributeName(' ');
        startTag0.normalName = "<![CDATA[null]]>";
        org.jsoup.parser.Token.StartTag startTag5 = new org.jsoup.parser.Token.StartTag();
        startTag5.appendAttributeName(' ');
        startTag5.appendTagName(' ');
        startTag5.newAttribute();
        boolean boolean11 = startTag5.selfClosing;
        startTag5.newAttribute();
        org.jsoup.nodes.Attributes attributes13 = startTag5.getAttributes();
        startTag0.attributes = attributes13;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Doctype doctype15 = startTag0.asDoctype();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$Doctype (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$Doctype are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(attributes13);
    }

    @Test
    public void test0107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0107");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.state();
        htmlTreeBuilder0.setFosterInserts(true);
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder4 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState5 = htmlTreeBuilder4.state();
        org.jsoup.nodes.FormElement formElement6 = null;
        htmlTreeBuilder4.setFormElement(formElement6);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder8 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document11 = xmlTreeBuilder8.parse("<![CDATA[hi!]]>", " ");
        htmlTreeBuilder4.setHeadElement((org.jsoup.nodes.Element) document11);
        htmlTreeBuilder0.setHeadElement((org.jsoup.nodes.Element) document11);
        org.jsoup.parser.Token.StartTag startTag14 = new org.jsoup.parser.Token.StartTag();
        startTag14.finaliseTag();
        startTag14.tagName = "";
        org.jsoup.nodes.Attributes attributes18 = startTag14.attributes;
        org.jsoup.parser.Token.Doctype doctype19 = new org.jsoup.parser.Token.Doctype();
        boolean boolean20 = doctype19.isEOF();
        boolean boolean21 = doctype19.isCharacter();
        org.jsoup.parser.Token.TokenType tokenType22 = doctype19.type;
        startTag14.type = tokenType22;
        boolean boolean24 = startTag14.isComment();
        startTag14.finaliseTag();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element26 = htmlTreeBuilder0.insertEmpty(startTag14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must be false");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(htmlTreeBuilderState1);
        org.junit.Assert.assertNull(htmlTreeBuilderState5);
        org.junit.Assert.assertNotNull(document11);
        org.junit.Assert.assertNotNull(attributes18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + tokenType22 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType22.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test0108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0108");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.state();
        org.jsoup.nodes.FormElement formElement2 = null;
        htmlTreeBuilder0.setFormElement(formElement2);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.state();
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.insertMarkerToFormattingElements();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(htmlTreeBuilderState1);
        org.junit.Assert.assertNull(htmlTreeBuilderState4);
    }

    @Test
    public void test0109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0109");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        boolean boolean1 = doctype0.isEOF();
        boolean boolean2 = doctype0.isCharacter();
        boolean boolean3 = doctype0.isComment();
        java.lang.String str4 = doctype0.getName();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.StartTag startTag5 = doctype0.asStartTag();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$Doctype cannot be cast to class org.jsoup.parser.Token$StartTag (org.jsoup.parser.Token$Doctype and org.jsoup.parser.Token$StartTag are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test0110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0110");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.state();
        org.jsoup.nodes.FormElement formElement2 = null;
        htmlTreeBuilder0.setFormElement(formElement2);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder4 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document7 = xmlTreeBuilder4.parse("<![CDATA[hi!]]>", " ");
        htmlTreeBuilder0.setHeadElement((org.jsoup.nodes.Element) document7);
        boolean boolean9 = htmlTreeBuilder0.isFragmentParsing();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element10 = htmlTreeBuilder0.removeLastFormattingElement();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(htmlTreeBuilderState1);
        org.junit.Assert.assertNotNull(document7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0111");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = null;
        htmlTreeBuilder0.transition(htmlTreeBuilderState1);
        boolean boolean3 = htmlTreeBuilder0.framesetOk();
        org.jsoup.parser.Token.CData cData5 = new org.jsoup.parser.Token.CData("hi!");
        org.jsoup.parser.Token token6 = cData5.reset();
        boolean boolean7 = cData5.isComment();
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.insert((org.jsoup.parser.Token.Character) cData5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(token6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0112");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        org.jsoup.parser.Token token1 = comment0.reset();
        boolean boolean2 = comment0.bogus;
        java.lang.String str3 = comment0.getData();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Doctype doctype4 = comment0.asDoctype();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$Comment cannot be cast to class org.jsoup.parser.Token$Doctype (org.jsoup.parser.Token$Comment and org.jsoup.parser.Token$Doctype are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(token1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test0113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0113");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.state();
        org.jsoup.nodes.FormElement formElement2 = null;
        htmlTreeBuilder0.setFormElement(formElement2);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = null;
        htmlTreeBuilder0.transition(htmlTreeBuilderState4);
        boolean boolean6 = htmlTreeBuilder0.isFosterInserts();
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.clearStackToTableBodyContext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(htmlTreeBuilderState1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0114");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document3 = xmlTreeBuilder0.parse("", "hi!");
        org.jsoup.nodes.Document document6 = xmlTreeBuilder0.parse("<![CDATA[hi!]]>", "<!---->");
        org.jsoup.parser.Parser parser9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.jsoup.nodes.Node> nodeList10 = xmlTreeBuilder0.parseFragment("<![cdata[null]]>", "<![cdata[null]]>", parser9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(document6);
    }

    @Test
    public void test0115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0115");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.state();
        org.jsoup.nodes.FormElement formElement2 = null;
        htmlTreeBuilder0.setFormElement(formElement2);
        htmlTreeBuilder0.setFosterInserts(true);
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder6 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState7 = htmlTreeBuilder6.state();
        htmlTreeBuilder6.setFosterInserts(true);
        boolean boolean10 = htmlTreeBuilder6.isFragmentParsing();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder11 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState12 = htmlTreeBuilder11.state();
        org.jsoup.nodes.FormElement formElement13 = null;
        htmlTreeBuilder11.setFormElement(formElement13);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder15 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document18 = xmlTreeBuilder15.parse("<![CDATA[hi!]]>", " ");
        htmlTreeBuilder11.setHeadElement((org.jsoup.nodes.Element) document18);
        org.jsoup.nodes.Element element20 = htmlTreeBuilder11.getHeadElement();
        htmlTreeBuilder6.setHeadElement(element20);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder22 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document25 = xmlTreeBuilder22.parse("", "hi!");
        org.jsoup.nodes.Document document28 = xmlTreeBuilder22.parse("<![CDATA[hi!]]>", "<!---->");
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.replaceOnStack(element20, (org.jsoup.nodes.Element) document28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(htmlTreeBuilderState1);
        org.junit.Assert.assertNull(htmlTreeBuilderState7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(htmlTreeBuilderState12);
        org.junit.Assert.assertNotNull(document18);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertNotNull(document25);
        org.junit.Assert.assertNotNull(document28);
    }

    @Test
    public void test0116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0116");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document3 = xmlTreeBuilder0.parse("<![CDATA[hi!]]>", " ");
        org.jsoup.parser.Token.CData cData5 = new org.jsoup.parser.Token.CData("hi!");
        xmlTreeBuilder0.insert((org.jsoup.parser.Token.Character) cData5);
        org.jsoup.parser.Token.Doctype doctype7 = new org.jsoup.parser.Token.Doctype();
        boolean boolean8 = doctype7.isEOF();
        boolean boolean9 = doctype7.isCharacter();
        boolean boolean10 = doctype7.isComment();
        xmlTreeBuilder0.insert(doctype7);
        org.jsoup.parser.Token.Comment comment12 = new org.jsoup.parser.Token.Comment();
        java.lang.String str13 = comment12.getData();
        xmlTreeBuilder0.insert(comment12);
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder16 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState17 = htmlTreeBuilder16.state();
        org.jsoup.nodes.FormElement formElement18 = null;
        htmlTreeBuilder16.setFormElement(formElement18);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder20 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document23 = xmlTreeBuilder20.parse("<![CDATA[hi!]]>", " ");
        htmlTreeBuilder16.setHeadElement((org.jsoup.nodes.Element) document23);
        org.jsoup.parser.Parser parser26 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.jsoup.nodes.Node> nodeList27 = xmlTreeBuilder0.parseFragment("</<![cdata[null]]>>", (org.jsoup.nodes.Element) document23, "<![CDATA[hi!]]>", parser26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(htmlTreeBuilderState17);
        org.junit.Assert.assertNotNull(document23);
    }

    @Test
    public void test0117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0117");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = null;
        htmlTreeBuilder0.transition(htmlTreeBuilderState1);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element3 = htmlTreeBuilder0.removeLastFormattingElement();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0118");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.state();
        org.jsoup.nodes.FormElement formElement2 = null;
        htmlTreeBuilder0.setFormElement(formElement2);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = null;
        htmlTreeBuilder0.transition(htmlTreeBuilderState4);
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.reconstructFormattingElements();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(htmlTreeBuilderState1);
    }

    @Test
    public void test0119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0119");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.state();
        org.jsoup.nodes.FormElement formElement2 = null;
        htmlTreeBuilder0.setFormElement(formElement2);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder4 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document7 = xmlTreeBuilder4.parse("<![CDATA[hi!]]>", " ");
        htmlTreeBuilder0.setHeadElement((org.jsoup.nodes.Element) document7);
        boolean boolean9 = htmlTreeBuilder0.isFragmentParsing();
        htmlTreeBuilder0.setFosterInserts(false);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = htmlTreeBuilder0.inTableScope("<!---->");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(htmlTreeBuilderState1);
        org.junit.Assert.assertNotNull(document7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0120");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document3 = xmlTreeBuilder0.parse("<![CDATA[hi!]]>", " ");
        org.jsoup.parser.Token.Comment comment4 = new org.jsoup.parser.Token.Comment();
        org.jsoup.parser.Token token5 = comment4.reset();
        xmlTreeBuilder0.insert(comment4);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.EndTag endTag7 = comment4.asEndTag();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$Comment cannot be cast to class org.jsoup.parser.Token$EndTag (org.jsoup.parser.Token$Comment and org.jsoup.parser.Token$EndTag are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(token5);
    }

    @Test
    public void test0121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0121");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.state();
        htmlTreeBuilder0.setFosterInserts(true);
        boolean boolean4 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder5 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState6 = htmlTreeBuilder5.state();
        org.jsoup.nodes.FormElement formElement7 = null;
        htmlTreeBuilder5.setFormElement(formElement7);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder9 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document12 = xmlTreeBuilder9.parse("<![CDATA[hi!]]>", " ");
        htmlTreeBuilder5.setHeadElement((org.jsoup.nodes.Element) document12);
        org.jsoup.nodes.Element element14 = htmlTreeBuilder5.getHeadElement();
        htmlTreeBuilder0.setHeadElement(element14);
        htmlTreeBuilder0.framesetOk(false);
        org.jsoup.parser.Token.StartTag startTag18 = new org.jsoup.parser.Token.StartTag();
        startTag18.finaliseTag();
        org.jsoup.parser.Token.TokenType tokenType20 = startTag18.type;
        boolean boolean21 = startTag18.isComment();
        boolean boolean22 = startTag18.isDoctype();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.FormElement formElement24 = htmlTreeBuilder0.insertForm(startTag18, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must be false");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(htmlTreeBuilderState1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(htmlTreeBuilderState6);
        org.junit.Assert.assertNotNull(document12);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertTrue("'" + tokenType20 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType20.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test0122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0122");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document3 = xmlTreeBuilder0.parse("", "hi!");
        org.jsoup.nodes.Document document6 = xmlTreeBuilder0.parse("<![CDATA[hi!]]>", "<!---->");
        org.jsoup.parser.Token.StartTag startTag7 = new org.jsoup.parser.Token.StartTag();
        startTag7.appendAttributeName(' ');
        boolean boolean10 = startTag7.selfClosing;
        startTag7.newAttribute();
        org.jsoup.parser.Token.Tag tag13 = startTag7.name("<![CDATA[null]]>");
        org.jsoup.parser.Token.StartTag startTag14 = new org.jsoup.parser.Token.StartTag();
        startTag14.appendAttributeValue("");
        org.jsoup.parser.Token.TokenType tokenType17 = org.jsoup.parser.Token.TokenType.Doctype;
        startTag14.type = tokenType17;
        startTag7.type = tokenType17;
        startTag7.newAttribute();
        startTag7.appendAttributeName("</<![CDATA[null]]>>");
        org.jsoup.nodes.Element element23 = xmlTreeBuilder0.insert(startTag7);
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder25 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState26 = htmlTreeBuilder25.state();
        org.jsoup.nodes.FormElement formElement27 = null;
        htmlTreeBuilder25.setFormElement(formElement27);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder29 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document32 = xmlTreeBuilder29.parse("<![CDATA[hi!]]>", " ");
        htmlTreeBuilder25.setHeadElement((org.jsoup.nodes.Element) document32);
        org.jsoup.parser.Parser parser35 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.jsoup.nodes.Node> nodeList36 = xmlTreeBuilder0.parseFragment("</<![cdata[null]]>>", (org.jsoup.nodes.Element) document32, "StartTag", parser35);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(document6);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(tag13);
        org.junit.Assert.assertTrue("'" + tokenType17 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType17.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertNull(htmlTreeBuilderState26);
        org.junit.Assert.assertNotNull(document32);
    }

    @Test
    public void test0123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0123");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.state();
        org.jsoup.nodes.FormElement formElement2 = null;
        htmlTreeBuilder0.setFormElement(formElement2);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder4 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document7 = xmlTreeBuilder4.parse("<![CDATA[hi!]]>", " ");
        htmlTreeBuilder0.setHeadElement((org.jsoup.nodes.Element) document7);
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.popStackToBefore("starttag");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(htmlTreeBuilderState1);
        org.junit.Assert.assertNotNull(document7);
    }

    @Test
    public void test0124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0124");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.state();
        org.jsoup.nodes.FormElement formElement2 = null;
        htmlTreeBuilder0.setFormElement(formElement2);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.state();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState5 = null;
        htmlTreeBuilder0.transition(htmlTreeBuilderState5);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState7 = null;
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.error(htmlTreeBuilderState7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(htmlTreeBuilderState1);
        org.junit.Assert.assertNull(htmlTreeBuilderState4);
    }

    @Test
    public void test0125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0125");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        java.lang.String str1 = startTag0.tokenType();
        startTag0.finaliseTag();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = startTag0.name();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must be false");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "StartTag" + "'", str1, "StartTag");
    }

    @Test
    public void test0126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0126");
        org.jsoup.parser.ParseSettings parseSettings0 = org.jsoup.parser.ParseSettings.htmlDefault;
        org.jsoup.nodes.Attributes attributes1 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor2 = attributes1.iterator();
        org.jsoup.nodes.Attributes attributes3 = parseSettings0.normalizeAttributes(attributes1);
        attributes1.remove("hi!");
        org.jsoup.nodes.Attributes attributes6 = attributes1.clone();
        org.jsoup.nodes.Attributes attributes7 = attributes1.clone();
        org.junit.Assert.assertNotNull(parseSettings0);
        org.junit.Assert.assertNotNull(attributeItor2);
        org.junit.Assert.assertNotNull(attributes3);
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertNotNull(attributes7);
    }

    @Test
    public void test0127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0127");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.state();
        org.jsoup.nodes.FormElement formElement2 = null;
        htmlTreeBuilder0.setFormElement(formElement2);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder4 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document7 = xmlTreeBuilder4.parse("<![CDATA[hi!]]>", " ");
        htmlTreeBuilder0.setHeadElement((org.jsoup.nodes.Element) document7);
        org.jsoup.nodes.Element element9 = htmlTreeBuilder0.getHeadElement();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder10 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState11 = htmlTreeBuilder10.state();
        org.jsoup.nodes.FormElement formElement12 = null;
        htmlTreeBuilder10.setFormElement(formElement12);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder14 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document17 = xmlTreeBuilder14.parse("<![CDATA[hi!]]>", " ");
        htmlTreeBuilder10.setHeadElement((org.jsoup.nodes.Element) document17);
        org.jsoup.nodes.Element element19 = htmlTreeBuilder10.getHeadElement();
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.removeFromActiveFormattingElements(element19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(htmlTreeBuilderState1);
        org.junit.Assert.assertNotNull(document7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNull(htmlTreeBuilderState11);
        org.junit.Assert.assertNotNull(document17);
        org.junit.Assert.assertNotNull(element19);
    }

    @Test
    public void test0128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0128");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.generateImpliedEndTags();
        htmlTreeBuilder0.setFosterInserts(true);
        java.io.Reader reader4 = null;
        org.jsoup.parser.Parser parser6 = null;
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.initialiseParse(reader4, "starttag", parser6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String input must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0129");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.finaliseTag();
        startTag0.tagName = "";
        org.jsoup.nodes.Attributes attributes4 = startTag0.attributes;
        org.jsoup.parser.Token.Doctype doctype5 = new org.jsoup.parser.Token.Doctype();
        boolean boolean6 = doctype5.isEOF();
        boolean boolean7 = doctype5.isCharacter();
        org.jsoup.parser.Token.TokenType tokenType8 = doctype5.type;
        startTag0.type = tokenType8;
        boolean boolean10 = startTag0.isComment();
        startTag0.finaliseTag();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Character character12 = startTag0.asCharacter();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$Character (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$Character are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(attributes4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + tokenType8 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType8.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0130");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.state();
        org.jsoup.nodes.FormElement formElement2 = null;
        htmlTreeBuilder0.setFormElement(formElement2);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = null;
        htmlTreeBuilder0.transition(htmlTreeBuilderState4);
        boolean boolean6 = htmlTreeBuilder0.isFosterInserts();
        java.lang.String[] strArray7 = org.jsoup.parser.HtmlTreeBuilder.TagSearchEndTags;
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.popStackToClose(strArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(htmlTreeBuilderState1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "dd", "dt", "li", "optgroup", "option", "p", "rp", "rt" });
    }

    @Test
    public void test0131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0131");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.state();
        org.jsoup.nodes.FormElement formElement2 = null;
        htmlTreeBuilder0.setFormElement(formElement2);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = null;
        htmlTreeBuilder0.transition(htmlTreeBuilderState4);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element7 = htmlTreeBuilder0.getActiveFormattingElement("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(htmlTreeBuilderState1);
    }

    @Test
    public void test0132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0132");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.state();
        htmlTreeBuilder0.setFosterInserts(true);
        boolean boolean4 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder5 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState6 = htmlTreeBuilder5.state();
        org.jsoup.nodes.FormElement formElement7 = null;
        htmlTreeBuilder5.setFormElement(formElement7);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder9 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document12 = xmlTreeBuilder9.parse("<![CDATA[hi!]]>", " ");
        htmlTreeBuilder5.setHeadElement((org.jsoup.nodes.Element) document12);
        org.jsoup.nodes.Element element14 = htmlTreeBuilder5.getHeadElement();
        htmlTreeBuilder0.setHeadElement(element14);
        org.jsoup.parser.Token.CData cData17 = new org.jsoup.parser.Token.CData("hi!");
        java.lang.String str18 = cData17.getData();
        java.lang.String str19 = cData17.toString();
        org.jsoup.parser.Token.Character character21 = cData17.data("StartTag");
        org.jsoup.parser.Token token22 = cData17.reset();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean23 = htmlTreeBuilder0.process(token22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(htmlTreeBuilderState1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(htmlTreeBuilderState6);
        org.junit.Assert.assertNotNull(document12);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "<![CDATA[hi!]]>" + "'", str19, "<![CDATA[hi!]]>");
        org.junit.Assert.assertNotNull(character21);
        org.junit.Assert.assertNotNull(token22);
    }

    @Test
    public void test0133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0133");
        org.jsoup.parser.ParseSettings parseSettings0 = org.jsoup.parser.ParseSettings.htmlDefault;
        org.jsoup.nodes.Attributes attributes1 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor2 = attributes1.iterator();
        org.jsoup.nodes.Attributes attributes3 = parseSettings0.normalizeAttributes(attributes1);
        attributes1.remove("hi!");
        java.lang.String str6 = attributes1.html();
        attributes1.normalize();
        attributes1.normalize();
        attributes1.normalize();
        org.junit.Assert.assertNotNull(parseSettings0);
        org.junit.Assert.assertNotNull(attributeItor2);
        org.junit.Assert.assertNotNull(attributes3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test0134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0134");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.state();
        org.jsoup.nodes.FormElement formElement2 = null;
        htmlTreeBuilder0.setFormElement(formElement2);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.state();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState5 = null;
        htmlTreeBuilder0.transition(htmlTreeBuilderState5);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder7 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document10 = xmlTreeBuilder7.parse("", "hi!");
        org.jsoup.nodes.Document document13 = xmlTreeBuilder7.parse("<![CDATA[hi!]]>", "<!---->");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder14 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState15 = htmlTreeBuilder14.state();
        org.jsoup.nodes.FormElement formElement16 = null;
        htmlTreeBuilder14.setFormElement(formElement16);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder18 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document21 = xmlTreeBuilder18.parse("", "hi!");
        org.jsoup.nodes.Document document24 = xmlTreeBuilder18.parse("<![CDATA[hi!]]>", "<!---->");
        boolean boolean25 = htmlTreeBuilder14.isSpecial((org.jsoup.nodes.Element) document24);
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.insertOnStackAfter((org.jsoup.nodes.Element) document13, (org.jsoup.nodes.Element) document24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(htmlTreeBuilderState1);
        org.junit.Assert.assertNull(htmlTreeBuilderState4);
        org.junit.Assert.assertNotNull(document10);
        org.junit.Assert.assertNotNull(document13);
        org.junit.Assert.assertNull(htmlTreeBuilderState15);
        org.junit.Assert.assertNotNull(document21);
        org.junit.Assert.assertNotNull(document24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test0135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0135");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.state();
        org.jsoup.nodes.FormElement formElement2 = null;
        htmlTreeBuilder0.setFormElement(formElement2);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.state();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder5 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document8 = xmlTreeBuilder5.parse("", "hi!");
        org.jsoup.nodes.Document document11 = xmlTreeBuilder5.parse("<![CDATA[hi!]]>", "<!---->");
        org.jsoup.parser.Token.StartTag startTag12 = new org.jsoup.parser.Token.StartTag();
        startTag12.appendAttributeName(' ');
        boolean boolean15 = startTag12.selfClosing;
        startTag12.newAttribute();
        org.jsoup.parser.Token.Tag tag18 = startTag12.name("<![CDATA[null]]>");
        org.jsoup.parser.Token.StartTag startTag19 = new org.jsoup.parser.Token.StartTag();
        startTag19.appendAttributeValue("");
        org.jsoup.parser.Token.TokenType tokenType22 = org.jsoup.parser.Token.TokenType.Doctype;
        startTag19.type = tokenType22;
        startTag12.type = tokenType22;
        startTag12.newAttribute();
        startTag12.appendAttributeName("</<![CDATA[null]]>>");
        org.jsoup.nodes.Element element28 = xmlTreeBuilder5.insert(startTag12);
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.insert(element28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(htmlTreeBuilderState1);
        org.junit.Assert.assertNull(htmlTreeBuilderState4);
        org.junit.Assert.assertNotNull(document8);
        org.junit.Assert.assertNotNull(document11);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(tag18);
        org.junit.Assert.assertTrue("'" + tokenType22 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType22.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertNotNull(element28);
    }

    @Test
    public void test0136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0136");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.state();
        org.jsoup.nodes.FormElement formElement2 = null;
        htmlTreeBuilder0.setFormElement(formElement2);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder4 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document7 = xmlTreeBuilder4.parse("<![CDATA[hi!]]>", " ");
        htmlTreeBuilder0.setHeadElement((org.jsoup.nodes.Element) document7);
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder9 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState10 = htmlTreeBuilder9.state();
        org.jsoup.nodes.FormElement formElement11 = null;
        htmlTreeBuilder9.setFormElement(formElement11);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState13 = null;
        htmlTreeBuilder9.transition(htmlTreeBuilderState13);
        boolean boolean15 = htmlTreeBuilder9.isFosterInserts();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState16 = htmlTreeBuilder9.state();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder17 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document20 = xmlTreeBuilder17.parse("", "hi!");
        org.jsoup.nodes.Document document23 = xmlTreeBuilder17.parse("<![CDATA[hi!]]>", "<!---->");
        htmlTreeBuilder9.setHeadElement((org.jsoup.nodes.Element) document23);
        boolean boolean25 = htmlTreeBuilder0.isSpecial((org.jsoup.nodes.Element) document23);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder26 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document29 = xmlTreeBuilder26.parse("", "hi!");
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.removeFromActiveFormattingElements((org.jsoup.nodes.Element) document29);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(htmlTreeBuilderState1);
        org.junit.Assert.assertNotNull(document7);
        org.junit.Assert.assertNull(htmlTreeBuilderState10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(htmlTreeBuilderState16);
        org.junit.Assert.assertNotNull(document20);
        org.junit.Assert.assertNotNull(document23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(document29);
    }

    @Test
    public void test0137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0137");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.state();
        org.jsoup.nodes.FormElement formElement2 = null;
        htmlTreeBuilder0.setFormElement(formElement2);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder4 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document7 = xmlTreeBuilder4.parse("<![CDATA[hi!]]>", " ");
        htmlTreeBuilder0.setHeadElement((org.jsoup.nodes.Element) document7);
        boolean boolean9 = htmlTreeBuilder0.isFragmentParsing();
        boolean boolean10 = htmlTreeBuilder0.framesetOk();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = htmlTreeBuilder0.inScope("<![CDATA[hi!]]>");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(htmlTreeBuilderState1);
        org.junit.Assert.assertNotNull(document7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0138");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.state();
        org.jsoup.nodes.FormElement formElement2 = null;
        htmlTreeBuilder0.setFormElement(formElement2);
        boolean boolean4 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.parser.Token.StartTag startTag5 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.TokenType tokenType6 = org.jsoup.parser.Token.TokenType.StartTag;
        startTag5.type = tokenType6;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element8 = htmlTreeBuilder0.insert(startTag5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must be false");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(htmlTreeBuilderState1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + tokenType6 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType6.equals(org.jsoup.parser.Token.TokenType.StartTag));
    }

    @Test
    public void test0139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0139");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document3 = xmlTreeBuilder0.parse("<![CDATA[hi!]]>", " ");
        org.jsoup.parser.Parser parser6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.jsoup.nodes.Node> nodeList7 = xmlTreeBuilder0.parseFragment("", "<![CDATA[hi!]]>", parser6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document3);
    }

    @Test
    public void test0140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0140");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor1 = attributes0.iterator();
        org.jsoup.nodes.Attributes attributes2 = attributes0.clone();
        org.jsoup.nodes.Attribute attribute3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Attributes attributes4 = attributes0.put(attribute3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(attributeItor1);
        org.junit.Assert.assertNotNull(attributes2);
    }

    @Test
    public void test0141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0141");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.state();
        org.jsoup.nodes.FormElement formElement2 = null;
        htmlTreeBuilder0.setFormElement(formElement2);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder4 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document7 = xmlTreeBuilder4.parse("<![CDATA[hi!]]>", " ");
        htmlTreeBuilder0.setHeadElement((org.jsoup.nodes.Element) document7);
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder9 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState10 = htmlTreeBuilder9.state();
        org.jsoup.nodes.FormElement formElement11 = null;
        htmlTreeBuilder9.setFormElement(formElement11);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState13 = null;
        htmlTreeBuilder9.transition(htmlTreeBuilderState13);
        boolean boolean15 = htmlTreeBuilder9.isFosterInserts();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState16 = htmlTreeBuilder9.state();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder17 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document20 = xmlTreeBuilder17.parse("", "hi!");
        org.jsoup.nodes.Document document23 = xmlTreeBuilder17.parse("<![CDATA[hi!]]>", "<!---->");
        htmlTreeBuilder9.setHeadElement((org.jsoup.nodes.Element) document23);
        boolean boolean25 = htmlTreeBuilder0.isSpecial((org.jsoup.nodes.Element) document23);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean27 = htmlTreeBuilder0.inListItemScope("<!---->");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(htmlTreeBuilderState1);
        org.junit.Assert.assertNotNull(document7);
        org.junit.Assert.assertNull(htmlTreeBuilderState10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(htmlTreeBuilderState16);
        org.junit.Assert.assertNotNull(document20);
        org.junit.Assert.assertNotNull(document23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test0142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0142");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.finaliseTag();
        startTag0.tagName = "";
        org.jsoup.nodes.Attributes attributes4 = startTag0.attributes;
        org.jsoup.parser.Token.Tag tag6 = startTag0.name("hi!");
        org.jsoup.parser.Token.StartTag startTag7 = new org.jsoup.parser.Token.StartTag();
        startTag7.finaliseTag();
        startTag7.tagName = "";
        int[] intArray15 = new int[] { 0, (byte) 10, (short) 10, (short) 1 };
        startTag7.appendAttributeValue(intArray15);
        tag6.appendAttributeValue(intArray15);
        java.lang.String str18 = tag6.normalName();
        org.junit.Assert.assertNotNull(attributes4);
        org.junit.Assert.assertNotNull(tag6);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertArrayEquals(intArray15, new int[] { 0, 10, 10, 1 });
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test0143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0143");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.state();
        org.jsoup.nodes.FormElement formElement2 = null;
        htmlTreeBuilder0.setFormElement(formElement2);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder4 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document7 = xmlTreeBuilder4.parse("", "hi!");
        org.jsoup.nodes.Document document10 = xmlTreeBuilder4.parse("<![CDATA[hi!]]>", "<!---->");
        boolean boolean11 = htmlTreeBuilder0.isSpecial((org.jsoup.nodes.Element) document10);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = htmlTreeBuilder0.inListItemScope("starttag");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(htmlTreeBuilderState1);
        org.junit.Assert.assertNotNull(document7);
        org.junit.Assert.assertNotNull(document10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0144");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.state();
        org.jsoup.nodes.FormElement formElement2 = null;
        htmlTreeBuilder0.setFormElement(formElement2);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder4 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document7 = xmlTreeBuilder4.parse("<![CDATA[hi!]]>", " ");
        htmlTreeBuilder0.setHeadElement((org.jsoup.nodes.Element) document7);
        boolean boolean9 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.nodes.FormElement formElement10 = htmlTreeBuilder0.getFormElement();
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.clearStackToTableContext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(htmlTreeBuilderState1);
        org.junit.Assert.assertNotNull(document7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(formElement10);
    }

    @Test
    public void test0145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0145");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.state();
        org.jsoup.nodes.FormElement formElement2 = null;
        htmlTreeBuilder0.setFormElement(formElement2);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder4 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document7 = xmlTreeBuilder4.parse("<![CDATA[hi!]]>", " ");
        htmlTreeBuilder0.setHeadElement((org.jsoup.nodes.Element) document7);
        boolean boolean9 = htmlTreeBuilder0.isFragmentParsing();
        htmlTreeBuilder0.setFosterInserts(false);
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder13 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState14 = htmlTreeBuilder13.state();
        org.jsoup.nodes.FormElement formElement15 = null;
        htmlTreeBuilder13.setFormElement(formElement15);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder17 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document20 = xmlTreeBuilder17.parse("<![CDATA[hi!]]>", " ");
        htmlTreeBuilder13.setHeadElement((org.jsoup.nodes.Element) document20);
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder22 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState23 = htmlTreeBuilder22.state();
        org.jsoup.nodes.FormElement formElement24 = null;
        htmlTreeBuilder22.setFormElement(formElement24);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState26 = null;
        htmlTreeBuilder22.transition(htmlTreeBuilderState26);
        boolean boolean28 = htmlTreeBuilder22.isFosterInserts();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState29 = htmlTreeBuilder22.state();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder30 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document33 = xmlTreeBuilder30.parse("", "hi!");
        org.jsoup.nodes.Document document36 = xmlTreeBuilder30.parse("<![CDATA[hi!]]>", "<!---->");
        htmlTreeBuilder22.setHeadElement((org.jsoup.nodes.Element) document36);
        boolean boolean38 = htmlTreeBuilder13.isSpecial((org.jsoup.nodes.Element) document36);
        org.jsoup.parser.Parser parser40 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.jsoup.nodes.Node> nodeList41 = htmlTreeBuilder0.parseFragment("</<![cdata[null]]>>", (org.jsoup.nodes.Element) document36, "<![CDATA[null]]>", parser40);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(htmlTreeBuilderState1);
        org.junit.Assert.assertNotNull(document7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(htmlTreeBuilderState14);
        org.junit.Assert.assertNotNull(document20);
        org.junit.Assert.assertNull(htmlTreeBuilderState23);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNull(htmlTreeBuilderState29);
        org.junit.Assert.assertNotNull(document33);
        org.junit.Assert.assertNotNull(document36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test0146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0146");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.state();
        org.jsoup.nodes.FormElement formElement2 = null;
        htmlTreeBuilder0.setFormElement(formElement2);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder4 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document7 = xmlTreeBuilder4.parse("<![CDATA[hi!]]>", " ");
        htmlTreeBuilder0.maybeSetBaseUri((org.jsoup.nodes.Element) document7);
        org.jsoup.parser.Token.Comment comment9 = new org.jsoup.parser.Token.Comment();
        java.lang.StringBuilder stringBuilder10 = comment9.data;
        comment9.bogus = false;
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.insert(comment9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(htmlTreeBuilderState1);
        org.junit.Assert.assertNotNull(document7);
        org.junit.Assert.assertNotNull(stringBuilder10);
        org.junit.Assert.assertEquals(stringBuilder10.toString(), "");
    }

    @Test
    public void test0147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0147");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.state();
        org.jsoup.nodes.FormElement formElement2 = null;
        htmlTreeBuilder0.setFormElement(formElement2);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = null;
        htmlTreeBuilder0.transition(htmlTreeBuilderState4);
        boolean boolean6 = htmlTreeBuilder0.isFosterInserts();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder7 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState8 = htmlTreeBuilder7.state();
        htmlTreeBuilder7.setFosterInserts(true);
        boolean boolean11 = htmlTreeBuilder7.isFragmentParsing();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder12 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState13 = htmlTreeBuilder12.state();
        org.jsoup.nodes.FormElement formElement14 = null;
        htmlTreeBuilder12.setFormElement(formElement14);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder16 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document19 = xmlTreeBuilder16.parse("<![CDATA[hi!]]>", " ");
        htmlTreeBuilder12.setHeadElement((org.jsoup.nodes.Element) document19);
        org.jsoup.nodes.Element element21 = htmlTreeBuilder12.getHeadElement();
        htmlTreeBuilder7.setHeadElement(element21);
        boolean boolean23 = htmlTreeBuilder0.isSpecial(element21);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean25 = htmlTreeBuilder0.inButtonScope("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(htmlTreeBuilderState1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(htmlTreeBuilderState8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(htmlTreeBuilderState13);
        org.junit.Assert.assertNotNull(document19);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test0148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0148");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.finaliseTag();
        startTag0.tagName = "";
        org.jsoup.nodes.Attributes attributes4 = startTag0.attributes;
        org.jsoup.parser.Token.Tag tag6 = startTag0.name("hi!");
        java.lang.String str7 = tag6.tagName;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Doctype doctype8 = tag6.asDoctype();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$Doctype (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$Doctype are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(attributes4);
        org.junit.Assert.assertNotNull(tag6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test0149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0149");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.appendAttributeName(' ');
        boolean boolean3 = startTag0.selfClosing;
        startTag0.newAttribute();
        java.lang.Class<?> wildcardClass5 = startTag0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0150");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.state();
        org.jsoup.nodes.FormElement formElement2 = null;
        htmlTreeBuilder0.setFormElement(formElement2);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.state();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState5 = htmlTreeBuilder0.state();
        org.jsoup.parser.Token.EndTag endTag6 = new org.jsoup.parser.Token.EndTag();
        org.jsoup.parser.Token.Tag tag8 = endTag6.name("<![CDATA[null]]>");
        boolean boolean9 = endTag6.isSelfClosing();
        java.lang.String str10 = endTag6.toString();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState11 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = htmlTreeBuilder0.process((org.jsoup.parser.Token) endTag6, htmlTreeBuilderState11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(htmlTreeBuilderState1);
        org.junit.Assert.assertNull(htmlTreeBuilderState4);
        org.junit.Assert.assertNull(htmlTreeBuilderState5);
        org.junit.Assert.assertNotNull(tag8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "</<![CDATA[null]]>>" + "'", str10, "</<![CDATA[null]]>>");
    }

    @Test
    public void test0151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0151");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.state();
        org.jsoup.nodes.FormElement formElement2 = null;
        htmlTreeBuilder0.setFormElement(formElement2);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder4 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document7 = xmlTreeBuilder4.parse("<![CDATA[hi!]]>", " ");
        htmlTreeBuilder0.setHeadElement((org.jsoup.nodes.Element) document7);
        boolean boolean9 = htmlTreeBuilder0.isFragmentParsing();
        htmlTreeBuilder0.setFosterInserts(false);
        org.jsoup.nodes.Element element12 = htmlTreeBuilder0.getHeadElement();
        java.lang.String[] strArray13 = org.jsoup.parser.HtmlTreeBuilder.TagSearchTableScope;
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.popStackToClose(strArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(htmlTreeBuilderState1);
        org.junit.Assert.assertNotNull(document7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[] { "html", "table" });
    }

    @Test
    public void test0152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0152");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.state();
        org.jsoup.nodes.FormElement formElement2 = null;
        htmlTreeBuilder0.setFormElement(formElement2);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder4 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document7 = xmlTreeBuilder4.parse("<![CDATA[hi!]]>", " ");
        htmlTreeBuilder0.setHeadElement((org.jsoup.nodes.Element) document7);
        boolean boolean9 = htmlTreeBuilder0.isFragmentParsing();
        htmlTreeBuilder0.setFosterInserts(false);
        org.jsoup.nodes.Element element12 = htmlTreeBuilder0.getHeadElement();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder13 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState14 = htmlTreeBuilder13.state();
        htmlTreeBuilder13.setFosterInserts(true);
        boolean boolean17 = htmlTreeBuilder13.isFragmentParsing();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder18 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState19 = htmlTreeBuilder18.state();
        org.jsoup.nodes.FormElement formElement20 = null;
        htmlTreeBuilder18.setFormElement(formElement20);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder22 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document25 = xmlTreeBuilder22.parse("<![CDATA[hi!]]>", " ");
        htmlTreeBuilder18.setHeadElement((org.jsoup.nodes.Element) document25);
        org.jsoup.nodes.Element element27 = htmlTreeBuilder18.getHeadElement();
        htmlTreeBuilder13.setHeadElement(element27);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean29 = htmlTreeBuilder0.removeFromStack(element27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(htmlTreeBuilderState1);
        org.junit.Assert.assertNotNull(document7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNull(htmlTreeBuilderState14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(htmlTreeBuilderState19);
        org.junit.Assert.assertNotNull(document25);
        org.junit.Assert.assertNotNull(element27);
    }

    @Test
    public void test0153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0153");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.state();
        htmlTreeBuilder0.setFosterInserts(true);
        boolean boolean4 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder5 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState6 = htmlTreeBuilder5.state();
        org.jsoup.nodes.FormElement formElement7 = null;
        htmlTreeBuilder5.setFormElement(formElement7);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder9 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document12 = xmlTreeBuilder9.parse("<![CDATA[hi!]]>", " ");
        htmlTreeBuilder5.setHeadElement((org.jsoup.nodes.Element) document12);
        org.jsoup.nodes.Element element14 = htmlTreeBuilder5.getHeadElement();
        htmlTreeBuilder0.setHeadElement(element14);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder17 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document20 = xmlTreeBuilder17.parse("", "hi!");
        org.jsoup.nodes.Document document23 = xmlTreeBuilder17.parse("<![CDATA[hi!]]>", "<!---->");
        org.jsoup.parser.Parser parser25 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.jsoup.nodes.Node> nodeList26 = htmlTreeBuilder0.parseFragment("<![CDATA[null]]>", (org.jsoup.nodes.Element) document23, " ", parser25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(htmlTreeBuilderState1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(htmlTreeBuilderState6);
        org.junit.Assert.assertNotNull(document12);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(document20);
        org.junit.Assert.assertNotNull(document23);
    }

    @Test
    public void test0154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0154");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.state();
        org.jsoup.nodes.FormElement formElement2 = null;
        htmlTreeBuilder0.setFormElement(formElement2);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.state();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState5 = null;
        htmlTreeBuilder0.transition(htmlTreeBuilderState5);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = htmlTreeBuilder0.inButtonScope("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(htmlTreeBuilderState1);
        org.junit.Assert.assertNull(htmlTreeBuilderState4);
    }

    @Test
    public void test0155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0155");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.state();
        htmlTreeBuilder0.setFosterInserts(true);
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder4 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState5 = htmlTreeBuilder4.state();
        org.jsoup.nodes.FormElement formElement6 = null;
        htmlTreeBuilder4.setFormElement(formElement6);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder8 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document11 = xmlTreeBuilder8.parse("<![CDATA[hi!]]>", " ");
        htmlTreeBuilder4.setHeadElement((org.jsoup.nodes.Element) document11);
        htmlTreeBuilder0.setHeadElement((org.jsoup.nodes.Element) document11);
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.clearStackToTableContext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(htmlTreeBuilderState1);
        org.junit.Assert.assertNull(htmlTreeBuilderState5);
        org.junit.Assert.assertNotNull(document11);
    }

    @Test
    public void test0156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0156");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.finaliseTag();
        startTag0.appendAttributeValue(' ');
        startTag0.selfClosing = true;
        startTag0.appendTagName('a');
        startTag0.finaliseTag();
    }

    @Test
    public void test0157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0157");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.state();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder2 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState3 = htmlTreeBuilder2.state();
        org.jsoup.nodes.FormElement formElement4 = null;
        htmlTreeBuilder2.setFormElement(formElement4);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder6 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document9 = xmlTreeBuilder6.parse("<![CDATA[hi!]]>", " ");
        htmlTreeBuilder2.setHeadElement((org.jsoup.nodes.Element) document9);
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder11 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState12 = htmlTreeBuilder11.state();
        org.jsoup.nodes.FormElement formElement13 = null;
        htmlTreeBuilder11.setFormElement(formElement13);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder15 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document18 = xmlTreeBuilder15.parse("<![CDATA[hi!]]>", " ");
        htmlTreeBuilder11.maybeSetBaseUri((org.jsoup.nodes.Element) document18);
        htmlTreeBuilder2.maybeSetBaseUri((org.jsoup.nodes.Element) document18);
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.removeFromActiveFormattingElements((org.jsoup.nodes.Element) document18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(htmlTreeBuilderState1);
        org.junit.Assert.assertNull(htmlTreeBuilderState3);
        org.junit.Assert.assertNotNull(document9);
        org.junit.Assert.assertNull(htmlTreeBuilderState12);
        org.junit.Assert.assertNotNull(document18);
    }

    @Test
    public void test0158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0158");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.state();
        org.jsoup.nodes.FormElement formElement2 = null;
        htmlTreeBuilder0.setFormElement(formElement2);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.state();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = htmlTreeBuilder0.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(htmlTreeBuilderState1);
        org.junit.Assert.assertNull(htmlTreeBuilderState4);
    }

    @Test
    public void test0159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0159");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.state();
        htmlTreeBuilder0.setFosterInserts(true);
        boolean boolean4 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder5 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState6 = htmlTreeBuilder5.state();
        org.jsoup.nodes.FormElement formElement7 = null;
        htmlTreeBuilder5.setFormElement(formElement7);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder9 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document12 = xmlTreeBuilder9.parse("<![CDATA[hi!]]>", " ");
        htmlTreeBuilder5.setHeadElement((org.jsoup.nodes.Element) document12);
        org.jsoup.nodes.Element element14 = htmlTreeBuilder5.getHeadElement();
        htmlTreeBuilder0.setHeadElement(element14);
        htmlTreeBuilder0.framesetOk(false);
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.insertMarkerToFormattingElements();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(htmlTreeBuilderState1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(htmlTreeBuilderState6);
        org.junit.Assert.assertNotNull(document12);
        org.junit.Assert.assertNotNull(element14);
    }

    @Test
    public void test0160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0160");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.state();
        org.jsoup.nodes.FormElement formElement2 = null;
        htmlTreeBuilder0.setFormElement(formElement2);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder4 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document7 = xmlTreeBuilder4.parse("<![CDATA[hi!]]>", " ");
        htmlTreeBuilder0.setHeadElement((org.jsoup.nodes.Element) document7);
        boolean boolean9 = htmlTreeBuilder0.isFragmentParsing();
        htmlTreeBuilder0.setFosterInserts(false);
        org.jsoup.nodes.Element element12 = htmlTreeBuilder0.getHeadElement();
        java.lang.String[] strArray13 = org.jsoup.parser.HtmlTreeBuilder.TagSearchSpecial;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = htmlTreeBuilder0.inScope(strArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(htmlTreeBuilderState1);
        org.junit.Assert.assertNotNull(document7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(strArray13);
    }

    @Test
    public void test0161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0161");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.finaliseTag();
        startTag0.tagName = "";
        org.jsoup.nodes.Attributes attributes4 = startTag0.attributes;
        org.jsoup.parser.Token.Doctype doctype5 = new org.jsoup.parser.Token.Doctype();
        boolean boolean6 = doctype5.isEOF();
        boolean boolean7 = doctype5.isCharacter();
        org.jsoup.parser.Token.TokenType tokenType8 = doctype5.type;
        startTag0.type = tokenType8;
        java.lang.String str10 = startTag0.normalName;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Doctype doctype11 = startTag0.asDoctype();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$Doctype (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$Doctype are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(attributes4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + tokenType8 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType8.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test0162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0162");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "hi!";
        doctype0.forceQuirks = false;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Comment comment5 = doctype0.asComment();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$Doctype cannot be cast to class org.jsoup.parser.Token$Comment (org.jsoup.parser.Token$Doctype and org.jsoup.parser.Token$Comment are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0163");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.state();
        org.jsoup.nodes.FormElement formElement2 = null;
        htmlTreeBuilder0.setFormElement(formElement2);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = null;
        htmlTreeBuilder0.transition(htmlTreeBuilderState4);
        boolean boolean6 = htmlTreeBuilder0.isFosterInserts();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState7 = htmlTreeBuilder0.state();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder8 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document11 = xmlTreeBuilder8.parse("", "hi!");
        org.jsoup.nodes.Document document14 = xmlTreeBuilder8.parse("<![CDATA[hi!]]>", "<!---->");
        htmlTreeBuilder0.setHeadElement((org.jsoup.nodes.Element) document14);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder16 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document19 = xmlTreeBuilder16.parse("", "hi!");
        org.jsoup.nodes.Document document22 = xmlTreeBuilder16.parse("<![CDATA[hi!]]>", "<!---->");
        org.jsoup.parser.Token.StartTag startTag23 = new org.jsoup.parser.Token.StartTag();
        startTag23.appendAttributeName(' ');
        boolean boolean26 = startTag23.selfClosing;
        startTag23.newAttribute();
        org.jsoup.parser.Token.Tag tag29 = startTag23.name("<![CDATA[null]]>");
        org.jsoup.parser.Token.StartTag startTag30 = new org.jsoup.parser.Token.StartTag();
        startTag30.appendAttributeValue("");
        org.jsoup.parser.Token.TokenType tokenType33 = org.jsoup.parser.Token.TokenType.Doctype;
        startTag30.type = tokenType33;
        startTag23.type = tokenType33;
        startTag23.newAttribute();
        startTag23.appendAttributeName("</<![CDATA[null]]>>");
        org.jsoup.nodes.Element element39 = xmlTreeBuilder16.insert(startTag23);
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder40 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState41 = htmlTreeBuilder40.state();
        htmlTreeBuilder40.setFosterInserts(true);
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder44 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState45 = htmlTreeBuilder44.state();
        org.jsoup.nodes.FormElement formElement46 = null;
        htmlTreeBuilder44.setFormElement(formElement46);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder48 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document51 = xmlTreeBuilder48.parse("<![CDATA[hi!]]>", " ");
        htmlTreeBuilder44.setHeadElement((org.jsoup.nodes.Element) document51);
        htmlTreeBuilder40.setHeadElement((org.jsoup.nodes.Element) document51);
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.insertOnStackAfter(element39, (org.jsoup.nodes.Element) document51);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(htmlTreeBuilderState1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(htmlTreeBuilderState7);
        org.junit.Assert.assertNotNull(document11);
        org.junit.Assert.assertNotNull(document14);
        org.junit.Assert.assertNotNull(document19);
        org.junit.Assert.assertNotNull(document22);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(tag29);
        org.junit.Assert.assertTrue("'" + tokenType33 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType33.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertNotNull(element39);
        org.junit.Assert.assertNull(htmlTreeBuilderState41);
        org.junit.Assert.assertNull(htmlTreeBuilderState45);
        org.junit.Assert.assertNotNull(document51);
    }

    @Test
    public void test0164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0164");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.state();
        org.jsoup.nodes.FormElement formElement2 = null;
        htmlTreeBuilder0.setFormElement(formElement2);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder4 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document7 = xmlTreeBuilder4.parse("<![CDATA[hi!]]>", " ");
        htmlTreeBuilder0.setHeadElement((org.jsoup.nodes.Element) document7);
        boolean boolean9 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState10 = htmlTreeBuilder0.originalState();
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.insertMarkerToFormattingElements();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(htmlTreeBuilderState1);
        org.junit.Assert.assertNotNull(document7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(htmlTreeBuilderState10);
    }

    @Test
    public void test0165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0165");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document3 = xmlTreeBuilder0.parse("<![CDATA[hi!]]>", " ");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder5 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState6 = htmlTreeBuilder5.state();
        htmlTreeBuilder5.setFosterInserts(true);
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder9 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState10 = htmlTreeBuilder9.state();
        org.jsoup.nodes.FormElement formElement11 = null;
        htmlTreeBuilder9.setFormElement(formElement11);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder13 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document16 = xmlTreeBuilder13.parse("<![CDATA[hi!]]>", " ");
        htmlTreeBuilder9.setHeadElement((org.jsoup.nodes.Element) document16);
        htmlTreeBuilder5.setHeadElement((org.jsoup.nodes.Element) document16);
        org.jsoup.parser.Parser parser20 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.jsoup.nodes.Node> nodeList21 = xmlTreeBuilder0.parseFragment("</<![cdata[null]]>>", (org.jsoup.nodes.Element) document16, "StartTag", parser20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNull(htmlTreeBuilderState6);
        org.junit.Assert.assertNull(htmlTreeBuilderState10);
        org.junit.Assert.assertNotNull(document16);
    }

    @Test
    public void test0166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0166");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.state();
        org.jsoup.nodes.FormElement formElement2 = null;
        htmlTreeBuilder0.setFormElement(formElement2);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = null;
        htmlTreeBuilder0.transition(htmlTreeBuilderState4);
        boolean boolean6 = htmlTreeBuilder0.isFosterInserts();
        org.jsoup.nodes.FormElement formElement7 = htmlTreeBuilder0.getFormElement();
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.clearStackToTableRowContext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(htmlTreeBuilderState1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(formElement7);
    }

    @Test
    public void test0167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0167");
        org.jsoup.parser.Token.Character character0 = new org.jsoup.parser.Token.Character();
        boolean boolean1 = character0.isCharacter();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.StartTag startTag2 = character0.asStartTag();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$Character cannot be cast to class org.jsoup.parser.Token$StartTag (org.jsoup.parser.Token$Character and org.jsoup.parser.Token$StartTag are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test0168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0168");
        org.jsoup.parser.ParseSettings parseSettings0 = org.jsoup.parser.ParseSettings.htmlDefault;
        org.jsoup.nodes.Attributes attributes1 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor2 = attributes1.iterator();
        org.jsoup.nodes.Attributes attributes3 = parseSettings0.normalizeAttributes(attributes1);
        attributes1.remove("hi!");
        boolean boolean7 = attributes1.hasKeyIgnoreCase("");
        org.jsoup.nodes.Attributes attributes8 = attributes1.clone();
        org.jsoup.nodes.Attribute attribute9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Attributes attributes10 = attributes1.put(attribute9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings0);
        org.junit.Assert.assertNotNull(attributeItor2);
        org.junit.Assert.assertNotNull(attributes3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(attributes8);
    }

    @Test
    public void test0169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0169");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        java.lang.String str1 = endTag0.normalName;
        org.jsoup.parser.ParseSettings parseSettings2 = org.jsoup.parser.ParseSettings.htmlDefault;
        org.jsoup.nodes.Attributes attributes3 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor4 = attributes3.iterator();
        org.jsoup.nodes.Attributes attributes5 = parseSettings2.normalizeAttributes(attributes3);
        java.lang.String str6 = attributes5.toString();
        endTag0.attributes = attributes5;
        org.jsoup.nodes.Attributes attributes8 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor9 = attributes8.iterator();
        attributes8.normalize();
        int int11 = attributes8.size();
        org.jsoup.nodes.Attributes attributes14 = attributes8.put("StartTag", true);
        attributes5.addAll(attributes8);
        org.jsoup.nodes.Attribute attribute16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Attributes attributes17 = attributes5.put(attribute16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(parseSettings2);
        org.junit.Assert.assertNotNull(attributeItor4);
        org.junit.Assert.assertNotNull(attributes5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributeItor9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(attributes14);
    }

    @Test
    public void test0170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0170");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.state();
        org.jsoup.nodes.FormElement formElement2 = null;
        htmlTreeBuilder0.setFormElement(formElement2);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder4 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document7 = xmlTreeBuilder4.parse("<![CDATA[hi!]]>", " ");
        htmlTreeBuilder0.setHeadElement((org.jsoup.nodes.Element) document7);
        boolean boolean9 = htmlTreeBuilder0.isFragmentParsing();
        htmlTreeBuilder0.setFosterInserts(false);
        org.jsoup.parser.Token.StartTag startTag12 = new org.jsoup.parser.Token.StartTag();
        startTag12.finaliseTag();
        startTag12.appendAttributeValue(' ');
        startTag12.selfClosing = true;
        startTag12.newAttribute();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element19 = htmlTreeBuilder0.insertEmpty(startTag12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must be false");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(htmlTreeBuilderState1);
        org.junit.Assert.assertNotNull(document7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0171");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.finaliseTag();
        java.lang.String str2 = startTag0.normalName();
        org.jsoup.nodes.Attributes attributes3 = startTag0.attributes;
        java.lang.Class<?> wildcardClass4 = startTag0.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(attributes3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0172");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document3 = xmlTreeBuilder0.parse("<![CDATA[hi!]]>", " ");
        org.jsoup.parser.Token.Comment comment4 = new org.jsoup.parser.Token.Comment();
        org.jsoup.parser.Token token5 = comment4.reset();
        xmlTreeBuilder0.insert(comment4);
        java.lang.Class<?> wildcardClass7 = xmlTreeBuilder0.getClass();
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(token5);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0173");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.state();
        org.jsoup.nodes.FormElement formElement2 = null;
        htmlTreeBuilder0.setFormElement(formElement2);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder4 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document7 = xmlTreeBuilder4.parse("", "hi!");
        org.jsoup.nodes.Document document10 = xmlTreeBuilder4.parse("<![CDATA[hi!]]>", "<!---->");
        boolean boolean11 = htmlTreeBuilder0.isSpecial((org.jsoup.nodes.Element) document10);
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.clearFormattingElementsToLastMarker();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(htmlTreeBuilderState1);
        org.junit.Assert.assertNotNull(document7);
        org.junit.Assert.assertNotNull(document10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0174");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.state();
        org.jsoup.nodes.FormElement formElement2 = null;
        htmlTreeBuilder0.setFormElement(formElement2);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = null;
        htmlTreeBuilder0.transition(htmlTreeBuilderState4);
        boolean boolean6 = htmlTreeBuilder0.isFosterInserts();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState7 = htmlTreeBuilder0.state();
        htmlTreeBuilder0.newPendingTableCharacters();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element9 = htmlTreeBuilder0.removeLastFormattingElement();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(htmlTreeBuilderState1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(htmlTreeBuilderState7);
    }

    @Test
    public void test0175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0175");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = null;
        htmlTreeBuilder0.transition(htmlTreeBuilderState1);
        boolean boolean3 = htmlTreeBuilder0.framesetOk();
        java.lang.String str4 = htmlTreeBuilder0.getBaseUri();
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.insertMarkerToFormattingElements();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test0176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0176");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        org.jsoup.parser.Token.Tag tag2 = endTag0.name("<![CDATA[null]]>");
        java.lang.String str3 = endTag0.toString();
        endTag0.appendTagName('a');
        org.jsoup.nodes.Attributes attributes6 = endTag0.getAttributes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Doctype doctype7 = endTag0.asDoctype();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$EndTag cannot be cast to class org.jsoup.parser.Token$Doctype (org.jsoup.parser.Token$EndTag and org.jsoup.parser.Token$Doctype are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tag2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "</<![CDATA[null]]>>" + "'", str3, "</<![CDATA[null]]>>");
        org.junit.Assert.assertNull(attributes6);
    }

    @Test
    public void test0177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0177");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.state();
        htmlTreeBuilder0.setFosterInserts(true);
        boolean boolean4 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder5 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState6 = htmlTreeBuilder5.state();
        org.jsoup.nodes.FormElement formElement7 = null;
        htmlTreeBuilder5.setFormElement(formElement7);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder9 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document12 = xmlTreeBuilder9.parse("<![CDATA[hi!]]>", " ");
        htmlTreeBuilder5.setHeadElement((org.jsoup.nodes.Element) document12);
        org.jsoup.nodes.Element element14 = htmlTreeBuilder5.getHeadElement();
        htmlTreeBuilder0.setHeadElement(element14);
        htmlTreeBuilder0.framesetOk(false);
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder18 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState19 = htmlTreeBuilder18.state();
        org.jsoup.nodes.FormElement formElement20 = null;
        htmlTreeBuilder18.setFormElement(formElement20);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder22 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document25 = xmlTreeBuilder22.parse("<![CDATA[hi!]]>", " ");
        htmlTreeBuilder18.maybeSetBaseUri((org.jsoup.nodes.Element) document25);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder27 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document30 = xmlTreeBuilder27.parse("", "hi!");
        org.jsoup.nodes.Document document33 = xmlTreeBuilder27.parse("<![CDATA[hi!]]>", "<!---->");
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.replaceActiveFormattingElement((org.jsoup.nodes.Element) document25, (org.jsoup.nodes.Element) document33);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(htmlTreeBuilderState1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(htmlTreeBuilderState6);
        org.junit.Assert.assertNotNull(document12);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNull(htmlTreeBuilderState19);
        org.junit.Assert.assertNotNull(document25);
        org.junit.Assert.assertNotNull(document30);
        org.junit.Assert.assertNotNull(document33);
    }

    @Test
    public void test0178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0178");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.state();
        org.jsoup.nodes.FormElement formElement2 = null;
        htmlTreeBuilder0.setFormElement(formElement2);
        boolean boolean4 = htmlTreeBuilder0.isFragmentParsing();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = htmlTreeBuilder0.inTableScope("<!---->");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(htmlTreeBuilderState1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0179");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.state();
        htmlTreeBuilder0.setFosterInserts(true);
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder4 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState5 = htmlTreeBuilder4.state();
        org.jsoup.nodes.FormElement formElement6 = null;
        htmlTreeBuilder4.setFormElement(formElement6);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder8 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document11 = xmlTreeBuilder8.parse("<![CDATA[hi!]]>", " ");
        htmlTreeBuilder4.setHeadElement((org.jsoup.nodes.Element) document11);
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.insert((org.jsoup.nodes.Element) document11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(htmlTreeBuilderState1);
        org.junit.Assert.assertNull(htmlTreeBuilderState5);
        org.junit.Assert.assertNotNull(document11);
    }

    @Test
    public void test0180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0180");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.finaliseTag();
        startTag0.tagName = "";
        org.jsoup.nodes.Attributes attributes4 = startTag0.attributes;
        org.jsoup.parser.Token.Doctype doctype5 = new org.jsoup.parser.Token.Doctype();
        boolean boolean6 = doctype5.isEOF();
        boolean boolean7 = doctype5.isCharacter();
        org.jsoup.parser.Token.TokenType tokenType8 = doctype5.type;
        startTag0.type = tokenType8;
        boolean boolean10 = startTag0.isComment();
        startTag0.finaliseTag();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Doctype doctype12 = startTag0.asDoctype();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$Doctype (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$Doctype are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(attributes4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + tokenType8 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType8.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0181");
        org.jsoup.parser.Token.CData cData1 = new org.jsoup.parser.Token.CData("hi!");
        org.jsoup.parser.Token token2 = cData1.reset();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Doctype doctype3 = token2.asDoctype();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$CData cannot be cast to class org.jsoup.parser.Token$Doctype (org.jsoup.parser.Token$CData and org.jsoup.parser.Token$Doctype are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(token2);
    }

    @Test
    public void test0182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0182");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor1 = attributes0.iterator();
        org.jsoup.nodes.Attributes attributes4 = attributes0.put("", false);
        attributes4.remove("<![CDATA[null]]>");
        org.jsoup.nodes.Attributes attributes7 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor8 = attributes7.iterator();
        org.jsoup.nodes.Attributes attributes11 = attributes7.put("", false);
        org.jsoup.parser.ParseSettings parseSettings12 = org.jsoup.parser.ParseSettings.htmlDefault;
        org.jsoup.nodes.Attributes attributes13 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor14 = attributes13.iterator();
        org.jsoup.nodes.Attributes attributes15 = parseSettings12.normalizeAttributes(attributes13);
        attributes13.remove("hi!");
        org.jsoup.nodes.Attributes attributes20 = attributes13.put("hi!", false);
        attributes11.addAll(attributes20);
        boolean boolean22 = attributes4.equals((java.lang.Object) attributes20);
        org.jsoup.nodes.Attributes attributes23 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor24 = attributes23.iterator();
        attributes23.normalize();
        org.jsoup.nodes.Attributes attributes28 = attributes23.put("", true);
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor29 = attributes23.iterator();
        int int30 = attributes23.size();
        // The following exception was thrown during execution in test generation
        try {
            attributes4.addAll(attributes23);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(attributeItor1);
        org.junit.Assert.assertNotNull(attributes4);
        org.junit.Assert.assertNotNull(attributeItor8);
        org.junit.Assert.assertNotNull(attributes11);
        org.junit.Assert.assertNotNull(parseSettings12);
        org.junit.Assert.assertNotNull(attributeItor14);
        org.junit.Assert.assertNotNull(attributes15);
        org.junit.Assert.assertNotNull(attributes20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(attributeItor24);
        org.junit.Assert.assertNotNull(attributes28);
        org.junit.Assert.assertNotNull(attributeItor29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
    }

    @Test
    public void test0183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0183");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.state();
        htmlTreeBuilder0.setFosterInserts(true);
        boolean boolean4 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder5 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState6 = htmlTreeBuilder5.state();
        org.jsoup.nodes.FormElement formElement7 = null;
        htmlTreeBuilder5.setFormElement(formElement7);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder9 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document12 = xmlTreeBuilder9.parse("<![CDATA[hi!]]>", " ");
        htmlTreeBuilder5.setHeadElement((org.jsoup.nodes.Element) document12);
        org.jsoup.nodes.Element element14 = htmlTreeBuilder5.getHeadElement();
        htmlTreeBuilder0.setHeadElement(element14);
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder17 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState18 = htmlTreeBuilder17.state();
        htmlTreeBuilder17.setFosterInserts(true);
        boolean boolean21 = htmlTreeBuilder17.isFragmentParsing();
        org.jsoup.nodes.Element element22 = htmlTreeBuilder17.getHeadElement();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder23 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState24 = htmlTreeBuilder23.state();
        org.jsoup.nodes.FormElement formElement25 = null;
        htmlTreeBuilder23.setFormElement(formElement25);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder27 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document30 = xmlTreeBuilder27.parse("<![CDATA[hi!]]>", " ");
        htmlTreeBuilder23.setHeadElement((org.jsoup.nodes.Element) document30);
        boolean boolean32 = htmlTreeBuilder23.isFragmentParsing();
        htmlTreeBuilder23.setFosterInserts(false);
        org.jsoup.nodes.Element element35 = htmlTreeBuilder23.getHeadElement();
        htmlTreeBuilder17.maybeSetBaseUri(element35);
        org.jsoup.parser.Parser parser38 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.jsoup.nodes.Node> nodeList39 = htmlTreeBuilder0.parseFragment("</<![CDATA[null]]>>", element35, "<![cdata[null]]>", parser38);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(htmlTreeBuilderState1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(htmlTreeBuilderState6);
        org.junit.Assert.assertNotNull(document12);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNull(htmlTreeBuilderState18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(element22);
        org.junit.Assert.assertNull(htmlTreeBuilderState24);
        org.junit.Assert.assertNotNull(document30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(element35);
    }

    @Test
    public void test0184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0184");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.Class<?> wildcardClass1 = doctype0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test0185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0185");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.state();
        org.jsoup.nodes.FormElement formElement2 = null;
        htmlTreeBuilder0.setFormElement(formElement2);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.state();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState5 = htmlTreeBuilder0.state();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = htmlTreeBuilder0.inSelectScope(" ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(htmlTreeBuilderState1);
        org.junit.Assert.assertNull(htmlTreeBuilderState4);
        org.junit.Assert.assertNull(htmlTreeBuilderState5);
    }

    @Test
    public void test0186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0186");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.state();
        org.jsoup.nodes.FormElement formElement2 = null;
        htmlTreeBuilder0.setFormElement(formElement2);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder4 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document7 = xmlTreeBuilder4.parse("<![CDATA[hi!]]>", " ");
        htmlTreeBuilder0.maybeSetBaseUri((org.jsoup.nodes.Element) document7);
        boolean boolean9 = htmlTreeBuilder0.isFosterInserts();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder10 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState11 = htmlTreeBuilder10.state();
        org.jsoup.nodes.FormElement formElement12 = null;
        htmlTreeBuilder10.setFormElement(formElement12);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder14 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document17 = xmlTreeBuilder14.parse("<![CDATA[hi!]]>", " ");
        htmlTreeBuilder10.setHeadElement((org.jsoup.nodes.Element) document17);
        org.jsoup.nodes.Element element19 = htmlTreeBuilder10.getHeadElement();
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.pushActiveFormattingElements(element19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(htmlTreeBuilderState1);
        org.junit.Assert.assertNotNull(document7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(htmlTreeBuilderState11);
        org.junit.Assert.assertNotNull(document17);
        org.junit.Assert.assertNotNull(element19);
    }

    @Test
    public void test0187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0187");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.state();
        org.jsoup.nodes.FormElement formElement2 = null;
        htmlTreeBuilder0.setFormElement(formElement2);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.state();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState5 = null;
        htmlTreeBuilder0.transition(htmlTreeBuilderState5);
        java.lang.String[] strArray12 = new java.lang.String[] { "<![CDATA[hi!]]>", " ", " ", " " };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = htmlTreeBuilder0.inScope("<![cdata[null]]>", strArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(htmlTreeBuilderState1);
        org.junit.Assert.assertNull(htmlTreeBuilderState4);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "<![CDATA[hi!]]>", " ", " ", " " });
    }

    @Test
    public void test0188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0188");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.state();
        org.jsoup.nodes.FormElement formElement2 = null;
        htmlTreeBuilder0.setFormElement(formElement2);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = null;
        htmlTreeBuilder0.transition(htmlTreeBuilderState4);
        boolean boolean6 = htmlTreeBuilder0.isFosterInserts();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState7 = htmlTreeBuilder0.state();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder8 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document11 = xmlTreeBuilder8.parse("", "hi!");
        org.jsoup.nodes.Document document14 = xmlTreeBuilder8.parse("<![CDATA[hi!]]>", "<!---->");
        htmlTreeBuilder0.setHeadElement((org.jsoup.nodes.Element) document14);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element16 = htmlTreeBuilder0.pop();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(htmlTreeBuilderState1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(htmlTreeBuilderState7);
        org.junit.Assert.assertNotNull(document11);
        org.junit.Assert.assertNotNull(document14);
    }

    @Test
    public void test0189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0189");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.StringBuilder stringBuilder1 = doctype0.publicIdentifier;
        org.jsoup.parser.Token.reset(stringBuilder1);
        org.jsoup.parser.Token.reset(stringBuilder1);
        org.junit.Assert.assertNotNull(stringBuilder1);
        org.junit.Assert.assertEquals(stringBuilder1.toString(), "");
    }

    @Test
    public void test0190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0190");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.state();
        org.jsoup.nodes.FormElement formElement2 = null;
        htmlTreeBuilder0.setFormElement(formElement2);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.state();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState5 = null;
        htmlTreeBuilder0.transition(htmlTreeBuilderState5);
        org.jsoup.parser.Token.StartTag startTag7 = new org.jsoup.parser.Token.StartTag();
        startTag7.appendAttributeName(' ');
        startTag7.normalName = "<![CDATA[null]]>";
        org.jsoup.parser.Token.Tag tag13 = startTag7.name("");
        startTag7.tagName = "</<![CDATA[null]]>>";
        java.lang.String str16 = startTag7.tokenType();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.FormElement formElement18 = htmlTreeBuilder0.insertForm(startTag7, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(htmlTreeBuilderState1);
        org.junit.Assert.assertNull(htmlTreeBuilderState4);
        org.junit.Assert.assertNotNull(tag13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "StartTag" + "'", str16, "StartTag");
    }

    @Test
    public void test0191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0191");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.finaliseTag();
        org.jsoup.parser.ParseSettings parseSettings3 = org.jsoup.parser.ParseSettings.htmlDefault;
        org.jsoup.nodes.Attributes attributes4 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor5 = attributes4.iterator();
        org.jsoup.nodes.Attributes attributes6 = parseSettings3.normalizeAttributes(attributes4);
        java.util.Map<java.lang.String, java.lang.String> strMap7 = attributes4.dataset();
        org.jsoup.parser.Token.StartTag startTag8 = startTag0.nameAttr("hi!", attributes4);
        startTag0.appendAttributeName(' ');
        org.jsoup.parser.Token token11 = startTag0.reset();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Comment comment12 = token11.asComment();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$Comment (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$Comment are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings3);
        org.junit.Assert.assertNotNull(attributeItor5);
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertNotNull(startTag8);
        org.junit.Assert.assertNotNull(token11);
    }

    @Test
    public void test0192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0192");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.state();
        org.jsoup.nodes.FormElement formElement2 = null;
        htmlTreeBuilder0.setFormElement(formElement2);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder4 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document7 = xmlTreeBuilder4.parse("", "hi!");
        org.jsoup.nodes.Document document10 = xmlTreeBuilder4.parse("<![CDATA[hi!]]>", "<!---->");
        boolean boolean11 = htmlTreeBuilder0.isSpecial((org.jsoup.nodes.Element) document10);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder12 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document15 = xmlTreeBuilder12.parse("", "hi!");
        org.jsoup.nodes.Document document18 = xmlTreeBuilder12.parse("<![CDATA[hi!]]>", "<!---->");
        org.jsoup.parser.Token.StartTag startTag19 = new org.jsoup.parser.Token.StartTag();
        startTag19.appendAttributeName(' ');
        boolean boolean22 = startTag19.selfClosing;
        startTag19.newAttribute();
        org.jsoup.parser.Token.Tag tag25 = startTag19.name("<![CDATA[null]]>");
        org.jsoup.parser.Token.StartTag startTag26 = new org.jsoup.parser.Token.StartTag();
        startTag26.appendAttributeValue("");
        org.jsoup.parser.Token.TokenType tokenType29 = org.jsoup.parser.Token.TokenType.Doctype;
        startTag26.type = tokenType29;
        startTag19.type = tokenType29;
        startTag19.newAttribute();
        startTag19.appendAttributeName("</<![CDATA[null]]>>");
        org.jsoup.nodes.Element element35 = xmlTreeBuilder12.insert(startTag19);
        startTag19.appendAttributeValue("</<![CDATA[null]]>>");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean38 = htmlTreeBuilder0.process((org.jsoup.parser.Token) startTag19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(htmlTreeBuilderState1);
        org.junit.Assert.assertNotNull(document7);
        org.junit.Assert.assertNotNull(document10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(document15);
        org.junit.Assert.assertNotNull(document18);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(tag25);
        org.junit.Assert.assertTrue("'" + tokenType29 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType29.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertNotNull(element35);
    }

    @Test
    public void test0193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0193");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings2 = xmlTreeBuilder0.defaultSettings();
        java.lang.String str4 = parseSettings2.normalizeTag("");
        boolean boolean5 = parseSettings2.preserveTagCase();
        org.junit.Assert.assertNotNull(parseSettings1);
        org.junit.Assert.assertNotNull(parseSettings2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test0194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0194");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.state();
        org.jsoup.nodes.FormElement formElement2 = null;
        htmlTreeBuilder0.setFormElement(formElement2);
        org.jsoup.parser.Token.StartTag startTag4 = new org.jsoup.parser.Token.StartTag();
        startTag4.finaliseTag();
        startTag4.tagName = "";
        int[] intArray12 = new int[] { 0, (byte) 10, (short) 10, (short) 1 };
        startTag4.appendAttributeValue(intArray12);
        startTag4.finaliseTag();
        boolean boolean15 = startTag4.isCData();
        org.jsoup.parser.Token.Tag tag16 = startTag4.reset();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = htmlTreeBuilder0.process((org.jsoup.parser.Token) startTag4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(htmlTreeBuilderState1);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertArrayEquals(intArray12, new int[] { 0, 10, 10, 1 });
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(tag16);
    }

    @Test
    public void test0195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0195");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document3 = xmlTreeBuilder0.parse("<![CDATA[hi!]]>", " ");
        org.jsoup.parser.Token.CData cData5 = new org.jsoup.parser.Token.CData("hi!");
        xmlTreeBuilder0.insert((org.jsoup.parser.Token.Character) cData5);
        org.jsoup.parser.Parser parser9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.jsoup.nodes.Node> nodeList10 = xmlTreeBuilder0.parseFragment("<![CDATA[null]]>", "< >", parser9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document3);
    }

    @Test
    public void test0196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0196");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.state();
        org.jsoup.nodes.FormElement formElement2 = null;
        htmlTreeBuilder0.setFormElement(formElement2);
        boolean boolean4 = htmlTreeBuilder0.isFragmentParsing();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = htmlTreeBuilder0.inButtonScope("< >");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(htmlTreeBuilderState1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0197");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.state();
        org.jsoup.nodes.FormElement formElement2 = null;
        htmlTreeBuilder0.setFormElement(formElement2);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder4 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document7 = xmlTreeBuilder4.parse("", "hi!");
        org.jsoup.nodes.Document document10 = xmlTreeBuilder4.parse("<![CDATA[hi!]]>", "<!---->");
        boolean boolean11 = htmlTreeBuilder0.isSpecial((org.jsoup.nodes.Element) document10);
        boolean boolean12 = htmlTreeBuilder0.framesetOk();
        org.jsoup.parser.Token.StartTag startTag13 = new org.jsoup.parser.Token.StartTag();
        startTag13.finaliseTag();
        startTag13.appendAttributeValue(' ');
        java.lang.String str17 = startTag13.tokenType();
        org.jsoup.nodes.Attributes attributes18 = startTag13.attributes;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.FormElement formElement20 = htmlTreeBuilder0.insertForm(startTag13, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must be false");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(htmlTreeBuilderState1);
        org.junit.Assert.assertNotNull(document7);
        org.junit.Assert.assertNotNull(document10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "StartTag" + "'", str17, "StartTag");
        org.junit.Assert.assertNotNull(attributes18);
    }

    @Test
    public void test0198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0198");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.state();
        org.jsoup.nodes.FormElement formElement2 = null;
        htmlTreeBuilder0.setFormElement(formElement2);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder4 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document7 = xmlTreeBuilder4.parse("<![CDATA[hi!]]>", " ");
        htmlTreeBuilder0.maybeSetBaseUri((org.jsoup.nodes.Element) document7);
        boolean boolean9 = htmlTreeBuilder0.isFosterInserts();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element10 = htmlTreeBuilder0.pop();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(htmlTreeBuilderState1);
        org.junit.Assert.assertNotNull(document7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0199");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.state();
        org.jsoup.nodes.FormElement formElement2 = null;
        htmlTreeBuilder0.setFormElement(formElement2);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = null;
        htmlTreeBuilder0.transition(htmlTreeBuilderState4);
        boolean boolean6 = htmlTreeBuilder0.isFosterInserts();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState7 = htmlTreeBuilder0.state();
        org.jsoup.parser.Token.Comment comment8 = new org.jsoup.parser.Token.Comment();
        org.jsoup.parser.Token token9 = comment8.reset();
        boolean boolean10 = comment8.bogus;
        comment8.bogus = false;
        java.lang.String str13 = comment8.toString();
        org.jsoup.parser.Token token14 = comment8.reset();
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.insert(comment8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(htmlTreeBuilderState1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(htmlTreeBuilderState7);
        org.junit.Assert.assertNotNull(token9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "<!---->" + "'", str13, "<!---->");
        org.junit.Assert.assertNotNull(token14);
    }

    @Test
    public void test0200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0200");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.state();
        org.jsoup.nodes.FormElement formElement2 = null;
        htmlTreeBuilder0.setFormElement(formElement2);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder4 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document7 = xmlTreeBuilder4.parse("<![CDATA[hi!]]>", " ");
        htmlTreeBuilder0.setHeadElement((org.jsoup.nodes.Element) document7);
        boolean boolean9 = htmlTreeBuilder0.isFragmentParsing();
        boolean boolean10 = htmlTreeBuilder0.framesetOk();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState11 = null;
        htmlTreeBuilder0.transition(htmlTreeBuilderState11);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element14 = htmlTreeBuilder0.getActiveFormattingElement("<!---->");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(htmlTreeBuilderState1);
        org.junit.Assert.assertNotNull(document7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0201");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.finaliseTag();
        java.lang.String str2 = startTag0.normalName();
        java.lang.String str3 = startTag0.tokenType();
        startTag0.appendAttributeValue("<![CDATA[hi!]]>");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "StartTag" + "'", str3, "StartTag");
    }

    @Test
    public void test0202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0202");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.state();
        org.jsoup.nodes.FormElement formElement2 = null;
        htmlTreeBuilder0.setFormElement(formElement2);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.state();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState5 = null;
        htmlTreeBuilder0.transition(htmlTreeBuilderState5);
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder7 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState8 = htmlTreeBuilder7.state();
        org.jsoup.nodes.FormElement formElement9 = null;
        htmlTreeBuilder7.setFormElement(formElement9);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder11 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document14 = xmlTreeBuilder11.parse("<![CDATA[hi!]]>", " ");
        htmlTreeBuilder7.setHeadElement((org.jsoup.nodes.Element) document14);
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder16 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState17 = htmlTreeBuilder16.state();
        org.jsoup.nodes.FormElement formElement18 = null;
        htmlTreeBuilder16.setFormElement(formElement18);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder20 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document23 = xmlTreeBuilder20.parse("<![CDATA[hi!]]>", " ");
        htmlTreeBuilder16.maybeSetBaseUri((org.jsoup.nodes.Element) document23);
        htmlTreeBuilder7.maybeSetBaseUri((org.jsoup.nodes.Element) document23);
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.pushActiveFormattingElements((org.jsoup.nodes.Element) document23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(htmlTreeBuilderState1);
        org.junit.Assert.assertNull(htmlTreeBuilderState4);
        org.junit.Assert.assertNull(htmlTreeBuilderState8);
        org.junit.Assert.assertNotNull(document14);
        org.junit.Assert.assertNull(htmlTreeBuilderState17);
        org.junit.Assert.assertNotNull(document23);
    }

    @Test
    public void test0203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0203");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = null;
        htmlTreeBuilder0.transition(htmlTreeBuilderState1);
        boolean boolean3 = htmlTreeBuilder0.framesetOk();
        org.jsoup.nodes.Attributes attributes5 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor6 = attributes5.iterator();
        org.jsoup.nodes.Attributes attributes9 = attributes5.put("", false);
        org.jsoup.parser.ParseSettings parseSettings10 = org.jsoup.parser.ParseSettings.htmlDefault;
        org.jsoup.nodes.Attributes attributes11 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor12 = attributes11.iterator();
        org.jsoup.nodes.Attributes attributes13 = parseSettings10.normalizeAttributes(attributes11);
        attributes11.remove("hi!");
        org.jsoup.nodes.Attributes attributes18 = attributes11.put("hi!", false);
        attributes9.addAll(attributes18);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean20 = htmlTreeBuilder0.processStartTag("<![cdata[null]]>", attributes9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(attributeItor6);
        org.junit.Assert.assertNotNull(attributes9);
        org.junit.Assert.assertNotNull(parseSettings10);
        org.junit.Assert.assertNotNull(attributeItor12);
        org.junit.Assert.assertNotNull(attributes13);
        org.junit.Assert.assertNotNull(attributes18);
    }

    @Test
    public void test0204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0204");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.state();
        org.jsoup.nodes.FormElement formElement2 = null;
        htmlTreeBuilder0.setFormElement(formElement2);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = null;
        htmlTreeBuilder0.transition(htmlTreeBuilderState4);
        boolean boolean6 = htmlTreeBuilder0.isFosterInserts();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState7 = htmlTreeBuilder0.state();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder8 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState9 = htmlTreeBuilder8.state();
        org.jsoup.nodes.FormElement formElement10 = null;
        htmlTreeBuilder8.setFormElement(formElement10);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder12 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document15 = xmlTreeBuilder12.parse("", "hi!");
        org.jsoup.nodes.Document document18 = xmlTreeBuilder12.parse("<![CDATA[hi!]]>", "<!---->");
        boolean boolean19 = htmlTreeBuilder8.isSpecial((org.jsoup.nodes.Element) document18);
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder20 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState21 = htmlTreeBuilder20.state();
        htmlTreeBuilder20.setFosterInserts(true);
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder24 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState25 = htmlTreeBuilder24.state();
        org.jsoup.nodes.FormElement formElement26 = null;
        htmlTreeBuilder24.setFormElement(formElement26);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder28 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document31 = xmlTreeBuilder28.parse("<![CDATA[hi!]]>", " ");
        htmlTreeBuilder24.setHeadElement((org.jsoup.nodes.Element) document31);
        htmlTreeBuilder20.setHeadElement((org.jsoup.nodes.Element) document31);
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.replaceActiveFormattingElement((org.jsoup.nodes.Element) document18, (org.jsoup.nodes.Element) document31);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(htmlTreeBuilderState1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(htmlTreeBuilderState7);
        org.junit.Assert.assertNull(htmlTreeBuilderState9);
        org.junit.Assert.assertNotNull(document15);
        org.junit.Assert.assertNotNull(document18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(htmlTreeBuilderState21);
        org.junit.Assert.assertNull(htmlTreeBuilderState25);
        org.junit.Assert.assertNotNull(document31);
    }

    @Test
    public void test0205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0205");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.state();
        org.jsoup.nodes.FormElement formElement2 = null;
        htmlTreeBuilder0.setFormElement(formElement2);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = null;
        htmlTreeBuilder0.transition(htmlTreeBuilderState4);
        boolean boolean6 = htmlTreeBuilder0.isFosterInserts();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState7 = htmlTreeBuilder0.state();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element9 = htmlTreeBuilder0.getFromStack(" ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(htmlTreeBuilderState1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(htmlTreeBuilderState7);
    }

    @Test
    public void test0206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0206");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.state();
        org.jsoup.nodes.FormElement formElement2 = null;
        htmlTreeBuilder0.setFormElement(formElement2);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder4 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document7 = xmlTreeBuilder4.parse("<![CDATA[hi!]]>", " ");
        htmlTreeBuilder0.setHeadElement((org.jsoup.nodes.Element) document7);
        org.jsoup.nodes.Element element9 = htmlTreeBuilder0.getHeadElement();
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.popStackToBefore(" ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(htmlTreeBuilderState1);
        org.junit.Assert.assertNotNull(document7);
        org.junit.Assert.assertNotNull(element9);
    }

    @Test
    public void test0207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0207");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.state();
        org.jsoup.nodes.FormElement formElement2 = null;
        htmlTreeBuilder0.setFormElement(formElement2);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder4 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document7 = xmlTreeBuilder4.parse("<![CDATA[hi!]]>", " ");
        htmlTreeBuilder0.setHeadElement((org.jsoup.nodes.Element) document7);
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder9 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState10 = htmlTreeBuilder9.state();
        org.jsoup.nodes.FormElement formElement11 = null;
        htmlTreeBuilder9.setFormElement(formElement11);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState13 = null;
        htmlTreeBuilder9.transition(htmlTreeBuilderState13);
        boolean boolean15 = htmlTreeBuilder9.isFosterInserts();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState16 = htmlTreeBuilder9.state();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder17 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document20 = xmlTreeBuilder17.parse("", "hi!");
        org.jsoup.nodes.Document document23 = xmlTreeBuilder17.parse("<![CDATA[hi!]]>", "<!---->");
        htmlTreeBuilder9.setHeadElement((org.jsoup.nodes.Element) document23);
        boolean boolean25 = htmlTreeBuilder0.isSpecial((org.jsoup.nodes.Element) document23);
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.clearStackToTableContext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(htmlTreeBuilderState1);
        org.junit.Assert.assertNotNull(document7);
        org.junit.Assert.assertNull(htmlTreeBuilderState10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(htmlTreeBuilderState16);
        org.junit.Assert.assertNotNull(document20);
        org.junit.Assert.assertNotNull(document23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test0208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0208");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.appendAttributeName(' ');
        startTag0.normalName = "<![CDATA[null]]>";
        org.jsoup.parser.Token.Tag tag6 = startTag0.name("");
        startTag0.tagName = "</<![CDATA[null]]>>";
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Comment comment9 = startTag0.asComment();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$Comment (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$Comment are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tag6);
    }

    @Test
    public void test0209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0209");
        org.jsoup.parser.Token.CData cData1 = new org.jsoup.parser.Token.CData("hi!");
        java.lang.String str2 = cData1.getData();
        java.lang.String str3 = cData1.toString();
        org.jsoup.parser.Token.Character character5 = cData1.data("StartTag");
        boolean boolean6 = character5.isComment();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<![CDATA[hi!]]>" + "'", str3, "<![CDATA[hi!]]>");
        org.junit.Assert.assertNotNull(character5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0210");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.state();
        org.jsoup.nodes.FormElement formElement2 = null;
        htmlTreeBuilder0.setFormElement(formElement2);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.state();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState5 = htmlTreeBuilder0.state();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element7 = htmlTreeBuilder0.getFromStack("<![CDATA[null]]>");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(htmlTreeBuilderState1);
        org.junit.Assert.assertNull(htmlTreeBuilderState4);
        org.junit.Assert.assertNull(htmlTreeBuilderState5);
    }

    @Test
    public void test0211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0211");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.state();
        org.jsoup.nodes.FormElement formElement2 = null;
        htmlTreeBuilder0.setFormElement(formElement2);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder4 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document7 = xmlTreeBuilder4.parse("<![CDATA[hi!]]>", " ");
        htmlTreeBuilder0.setHeadElement((org.jsoup.nodes.Element) document7);
        boolean boolean9 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.nodes.FormElement formElement10 = htmlTreeBuilder0.getFormElement();
        org.jsoup.parser.Token.Doctype doctype11 = new org.jsoup.parser.Token.Doctype();
        doctype11.pubSysKey = "hi!";
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = htmlTreeBuilder0.process((org.jsoup.parser.Token) doctype11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(htmlTreeBuilderState1);
        org.junit.Assert.assertNotNull(document7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(formElement10);
    }

    @Test
    public void test0212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0212");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.finaliseTag();
        startTag0.appendAttributeValue(' ');
        java.lang.String str4 = startTag0.tokenType();
        startTag0.setEmptyAttributeValue();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "StartTag" + "'", str4, "StartTag");
    }

    @Test
    public void test0213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0213");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        java.lang.StringBuilder stringBuilder1 = comment0.data;
        comment0.bogus = false;
        java.lang.String str4 = comment0.getData();
        org.junit.Assert.assertNotNull(stringBuilder1);
        org.junit.Assert.assertEquals(stringBuilder1.toString(), "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test0214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0214");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document3 = xmlTreeBuilder0.parse("", "hi!");
        org.jsoup.nodes.Document document6 = xmlTreeBuilder0.parse("<![CDATA[hi!]]>", "<!---->");
        org.jsoup.parser.Token.StartTag startTag7 = new org.jsoup.parser.Token.StartTag();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element8 = xmlTreeBuilder0.insert(startTag7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must be false");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(document6);
    }

    @Test
    public void test0215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0215");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.finaliseTag();
        org.jsoup.parser.ParseSettings parseSettings3 = org.jsoup.parser.ParseSettings.htmlDefault;
        org.jsoup.nodes.Attributes attributes4 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor5 = attributes4.iterator();
        org.jsoup.nodes.Attributes attributes6 = parseSettings3.normalizeAttributes(attributes4);
        java.util.Map<java.lang.String, java.lang.String> strMap7 = attributes4.dataset();
        org.jsoup.parser.Token.StartTag startTag8 = startTag0.nameAttr("hi!", attributes4);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Character character9 = startTag8.asCharacter();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$Character (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$Character are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings3);
        org.junit.Assert.assertNotNull(attributeItor5);
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertNotNull(startTag8);
    }

    @Test
    public void test0216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0216");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.state();
        org.jsoup.nodes.FormElement formElement2 = null;
        htmlTreeBuilder0.setFormElement(formElement2);
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.clearFormattingElementsToLastMarker();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(htmlTreeBuilderState1);
    }

    @Test
    public void test0217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0217");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.finaliseTag();
        startTag0.tagName = "";
        org.jsoup.nodes.Attributes attributes4 = startTag0.attributes;
        org.jsoup.parser.Token.Tag tag6 = startTag0.name("hi!");
        org.jsoup.parser.Token.StartTag startTag7 = new org.jsoup.parser.Token.StartTag();
        startTag7.finaliseTag();
        startTag7.tagName = "";
        int[] intArray15 = new int[] { 0, (byte) 10, (short) 10, (short) 1 };
        startTag7.appendAttributeValue(intArray15);
        tag6.appendAttributeValue(intArray15);
        java.lang.Class<?> wildcardClass18 = tag6.getClass();
        org.junit.Assert.assertNotNull(attributes4);
        org.junit.Assert.assertNotNull(tag6);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertArrayEquals(intArray15, new int[] { 0, 10, 10, 1 });
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0218");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = htmlTreeBuilder0.getHeadElement();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder2 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState3 = htmlTreeBuilder2.state();
        org.jsoup.nodes.FormElement formElement4 = null;
        htmlTreeBuilder2.setFormElement(formElement4);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder6 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document9 = xmlTreeBuilder6.parse("<![CDATA[hi!]]>", " ");
        htmlTreeBuilder2.setHeadElement((org.jsoup.nodes.Element) document9);
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder11 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState12 = htmlTreeBuilder11.state();
        org.jsoup.nodes.FormElement formElement13 = null;
        htmlTreeBuilder11.setFormElement(formElement13);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState15 = null;
        htmlTreeBuilder11.transition(htmlTreeBuilderState15);
        boolean boolean17 = htmlTreeBuilder11.isFosterInserts();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState18 = htmlTreeBuilder11.state();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder19 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document22 = xmlTreeBuilder19.parse("", "hi!");
        org.jsoup.nodes.Document document25 = xmlTreeBuilder19.parse("<![CDATA[hi!]]>", "<!---->");
        htmlTreeBuilder11.setHeadElement((org.jsoup.nodes.Element) document25);
        boolean boolean27 = htmlTreeBuilder2.isSpecial((org.jsoup.nodes.Element) document25);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean28 = htmlTreeBuilder0.onStack((org.jsoup.nodes.Element) document25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(element1);
        org.junit.Assert.assertNull(htmlTreeBuilderState3);
        org.junit.Assert.assertNotNull(document9);
        org.junit.Assert.assertNull(htmlTreeBuilderState12);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(htmlTreeBuilderState18);
        org.junit.Assert.assertNotNull(document22);
        org.junit.Assert.assertNotNull(document25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test0219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0219");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.state();
        htmlTreeBuilder0.setFosterInserts(true);
        boolean boolean4 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder5 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState6 = htmlTreeBuilder5.state();
        org.jsoup.nodes.FormElement formElement7 = null;
        htmlTreeBuilder5.setFormElement(formElement7);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder9 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document12 = xmlTreeBuilder9.parse("<![CDATA[hi!]]>", " ");
        htmlTreeBuilder5.setHeadElement((org.jsoup.nodes.Element) document12);
        org.jsoup.nodes.Element element14 = htmlTreeBuilder5.getHeadElement();
        htmlTreeBuilder0.setHeadElement(element14);
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.clearStackToTableContext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(htmlTreeBuilderState1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(htmlTreeBuilderState6);
        org.junit.Assert.assertNotNull(document12);
        org.junit.Assert.assertNotNull(element14);
    }

    @Test
    public void test0220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0220");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.state();
        org.jsoup.nodes.FormElement formElement2 = null;
        htmlTreeBuilder0.setFormElement(formElement2);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = null;
        htmlTreeBuilder0.transition(htmlTreeBuilderState4);
        boolean boolean6 = htmlTreeBuilder0.isFosterInserts();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState7 = htmlTreeBuilder0.state();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder8 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document11 = xmlTreeBuilder8.parse("<![CDATA[hi!]]>", " ");
        org.jsoup.parser.Token.Comment comment12 = new org.jsoup.parser.Token.Comment();
        org.jsoup.parser.Token token13 = comment12.reset();
        boolean boolean14 = comment12.bogus;
        xmlTreeBuilder8.insert(comment12);
        org.jsoup.nodes.Document document18 = xmlTreeBuilder8.parse("StartTag", "< >");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean19 = htmlTreeBuilder0.onStack((org.jsoup.nodes.Element) document18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(htmlTreeBuilderState1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(htmlTreeBuilderState7);
        org.junit.Assert.assertNotNull(document11);
        org.junit.Assert.assertNotNull(token13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(document18);
    }

    @Test
    public void test0221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0221");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.state();
        htmlTreeBuilder0.setFosterInserts(true);
        boolean boolean4 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.parser.Token.StartTag startTag5 = new org.jsoup.parser.Token.StartTag();
        java.lang.String str6 = startTag5.tokenType();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element7 = htmlTreeBuilder0.insertEmpty(startTag5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must be false");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(htmlTreeBuilderState1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "StartTag" + "'", str6, "StartTag");
    }

    @Test
    public void test0222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0222");
        org.jsoup.parser.ParseSettings parseSettings2 = new org.jsoup.parser.ParseSettings(false, true);
        boolean boolean3 = parseSettings2.preserveTagCase();
        java.lang.String str5 = parseSettings2.normalizeAttribute("");
        java.lang.String str7 = parseSettings2.normalizeAttribute("<![CDATA[null]]>");
        java.lang.String str9 = parseSettings2.normalizeTag("CData");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<![CDATA[null]]>" + "'", str7, "<![CDATA[null]]>");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "cdata" + "'", str9, "cdata");
    }

    @Test
    public void test0223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0223");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = null;
        htmlTreeBuilder0.transition(htmlTreeBuilderState1);
        boolean boolean3 = htmlTreeBuilder0.framesetOk();
        org.jsoup.parser.Token.StartTag startTag4 = new org.jsoup.parser.Token.StartTag();
        startTag4.finaliseTag();
        startTag4.appendAttributeValue(' ');
        startTag4.finaliseTag();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.FormElement formElement10 = htmlTreeBuilder0.insertForm(startTag4, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must be false");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0224");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.state();
        org.jsoup.nodes.FormElement formElement2 = null;
        htmlTreeBuilder0.setFormElement(formElement2);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder4 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document7 = xmlTreeBuilder4.parse("<![CDATA[hi!]]>", " ");
        htmlTreeBuilder0.setHeadElement((org.jsoup.nodes.Element) document7);
        org.jsoup.parser.Token.StartTag startTag9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element10 = htmlTreeBuilder0.insertEmpty(startTag9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(htmlTreeBuilderState1);
        org.junit.Assert.assertNotNull(document7);
    }

    @Test
    public void test0225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0225");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder1 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState2 = htmlTreeBuilder1.state();
        org.jsoup.nodes.FormElement formElement3 = null;
        htmlTreeBuilder1.setFormElement(formElement3);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder5 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document8 = xmlTreeBuilder5.parse("<![CDATA[hi!]]>", " ");
        htmlTreeBuilder1.setHeadElement((org.jsoup.nodes.Element) document8);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = htmlTreeBuilder0.onStack((org.jsoup.nodes.Element) document8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(htmlTreeBuilderState2);
        org.junit.Assert.assertNotNull(document8);
    }

    @Test
    public void test0226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0226");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.state();
        org.jsoup.nodes.FormElement formElement2 = null;
        htmlTreeBuilder0.setFormElement(formElement2);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder4 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document7 = xmlTreeBuilder4.parse("<![CDATA[hi!]]>", " ");
        htmlTreeBuilder0.setHeadElement((org.jsoup.nodes.Element) document7);
        boolean boolean9 = htmlTreeBuilder0.isFragmentParsing();
        htmlTreeBuilder0.setFosterInserts(false);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element12 = htmlTreeBuilder0.lastFormattingElement();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(htmlTreeBuilderState1);
        org.junit.Assert.assertNotNull(document7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0227");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.state();
        org.jsoup.nodes.FormElement formElement2 = null;
        htmlTreeBuilder0.setFormElement(formElement2);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = null;
        htmlTreeBuilder0.transition(htmlTreeBuilderState4);
        boolean boolean6 = htmlTreeBuilder0.isFosterInserts();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState7 = htmlTreeBuilder0.state();
        htmlTreeBuilder0.newPendingTableCharacters();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = htmlTreeBuilder0.inSelectScope("StartTag");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(htmlTreeBuilderState1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(htmlTreeBuilderState7);
    }

    @Test
    public void test0228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0228");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList1 = htmlTreeBuilder0.getStack();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList2 = htmlTreeBuilder0.getStack();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState3 = null;
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.error(htmlTreeBuilderState3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(elementList1);
        org.junit.Assert.assertNull(elementList2);
    }

    @Test
    public void test0229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0229");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.appendAttributeName(' ');
        startTag0.appendTagName(' ');
        startTag0.newAttribute();
        boolean boolean6 = startTag0.selfClosing;
        startTag0.newAttribute();
        org.jsoup.nodes.Attributes attributes8 = startTag0.getAttributes();
        org.jsoup.parser.Token.Doctype doctype9 = new org.jsoup.parser.Token.Doctype();
        boolean boolean10 = doctype9.forceQuirks;
        java.lang.String str11 = doctype9.getSystemIdentifier();
        boolean boolean12 = attributes8.equals((java.lang.Object) doctype9);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.EndTag endTag13 = doctype9.asEndTag();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$Doctype cannot be cast to class org.jsoup.parser.Token$EndTag (org.jsoup.parser.Token$Doctype and org.jsoup.parser.Token$EndTag are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(attributes8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0230");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document3 = xmlTreeBuilder0.parse("<![CDATA[hi!]]>", " ");
        org.jsoup.parser.Token.CData cData5 = new org.jsoup.parser.Token.CData("hi!");
        xmlTreeBuilder0.insert((org.jsoup.parser.Token.Character) cData5);
        org.jsoup.parser.Token.Doctype doctype7 = new org.jsoup.parser.Token.Doctype();
        boolean boolean8 = doctype7.isEOF();
        boolean boolean9 = doctype7.isCharacter();
        boolean boolean10 = doctype7.isComment();
        xmlTreeBuilder0.insert(doctype7);
        org.jsoup.parser.Token.Comment comment12 = new org.jsoup.parser.Token.Comment();
        java.lang.String str13 = comment12.getData();
        xmlTreeBuilder0.insert(comment12);
        org.jsoup.parser.Token token15 = comment12.reset();
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(token15);
    }

    @Test
    public void test0231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0231");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.state();
        org.jsoup.nodes.FormElement formElement2 = null;
        htmlTreeBuilder0.setFormElement(formElement2);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.state();
        java.lang.String str5 = htmlTreeBuilder0.getBaseUri();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder6 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState7 = htmlTreeBuilder6.state();
        org.jsoup.nodes.FormElement formElement8 = null;
        htmlTreeBuilder6.setFormElement(formElement8);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder10 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document13 = xmlTreeBuilder10.parse("<![CDATA[hi!]]>", " ");
        htmlTreeBuilder6.setHeadElement((org.jsoup.nodes.Element) document13);
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder15 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState16 = htmlTreeBuilder15.state();
        org.jsoup.nodes.FormElement formElement17 = null;
        htmlTreeBuilder15.setFormElement(formElement17);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder19 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document22 = xmlTreeBuilder19.parse("<![CDATA[hi!]]>", " ");
        htmlTreeBuilder15.maybeSetBaseUri((org.jsoup.nodes.Element) document22);
        htmlTreeBuilder6.maybeSetBaseUri((org.jsoup.nodes.Element) document22);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean25 = htmlTreeBuilder0.removeFromStack((org.jsoup.nodes.Element) document22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(htmlTreeBuilderState1);
        org.junit.Assert.assertNull(htmlTreeBuilderState4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(htmlTreeBuilderState7);
        org.junit.Assert.assertNotNull(document13);
        org.junit.Assert.assertNull(htmlTreeBuilderState16);
        org.junit.Assert.assertNotNull(document22);
    }

    @Test
    public void test0232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0232");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.finaliseTag();
        startTag0.appendAttributeValue(' ');
        startTag0.appendTagName("</<![cdata[null]]>>");
    }

    @Test
    public void test0233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0233");
        org.jsoup.parser.Token.CData cData1 = new org.jsoup.parser.Token.CData("hi!");
        java.lang.String str2 = cData1.getData();
        java.lang.String str3 = cData1.toString();
        org.jsoup.parser.Token.Character character5 = cData1.data("StartTag");
        org.jsoup.parser.Token.StartTag startTag6 = new org.jsoup.parser.Token.StartTag();
        startTag6.finaliseTag();
        startTag6.appendAttributeName('#');
        char[] charArray10 = new char[] {};
        startTag6.appendAttributeValue(charArray10);
        startTag6.appendTagName("starttag");
        boolean boolean14 = startTag6.isEOF();
        startTag6.selfClosing = false;
        org.jsoup.parser.Token.StartTag startTag17 = new org.jsoup.parser.Token.StartTag();
        startTag17.finaliseTag();
        startTag17.tagName = "";
        org.jsoup.nodes.Attributes attributes21 = startTag17.attributes;
        org.jsoup.parser.Token.Doctype doctype22 = new org.jsoup.parser.Token.Doctype();
        boolean boolean23 = doctype22.isEOF();
        boolean boolean24 = doctype22.isCharacter();
        org.jsoup.parser.Token.TokenType tokenType25 = doctype22.type;
        startTag17.type = tokenType25;
        java.lang.String str27 = startTag17.normalName;
        org.jsoup.parser.Token.TokenType tokenType28 = startTag17.type;
        startTag6.type = tokenType28;
        character5.type = tokenType28;
        java.lang.String str31 = character5.toString();
        org.jsoup.parser.Token.Character character33 = character5.data("</<![cdata[null]]>>");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<![CDATA[hi!]]>" + "'", str3, "<![CDATA[hi!]]>");
        org.junit.Assert.assertNotNull(character5);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(attributes21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + tokenType25 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType25.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertTrue("'" + tokenType28 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType28.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "<![CDATA[StartTag]]>" + "'", str31, "<![CDATA[StartTag]]>");
        org.junit.Assert.assertNotNull(character33);
    }

    @Test
    public void test0234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0234");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.state();
        org.jsoup.nodes.FormElement formElement2 = null;
        htmlTreeBuilder0.setFormElement(formElement2);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = null;
        htmlTreeBuilder0.transition(htmlTreeBuilderState4);
        org.jsoup.nodes.FormElement formElement6 = htmlTreeBuilder0.getFormElement();
        org.jsoup.parser.Token.StartTag startTag7 = new org.jsoup.parser.Token.StartTag();
        startTag7.finaliseTag();
        startTag7.tagName = "";
        org.jsoup.nodes.Attributes attributes11 = startTag7.attributes;
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState12 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = htmlTreeBuilder0.process((org.jsoup.parser.Token) startTag7, htmlTreeBuilderState12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(htmlTreeBuilderState1);
        org.junit.Assert.assertNull(formElement6);
        org.junit.Assert.assertNotNull(attributes11);
    }

    @Test
    public void test0235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0235");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.state();
        htmlTreeBuilder0.setFosterInserts(true);
        boolean boolean4 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder5 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState6 = htmlTreeBuilder5.state();
        org.jsoup.nodes.FormElement formElement7 = null;
        htmlTreeBuilder5.setFormElement(formElement7);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder9 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document12 = xmlTreeBuilder9.parse("<![CDATA[hi!]]>", " ");
        htmlTreeBuilder5.setHeadElement((org.jsoup.nodes.Element) document12);
        org.jsoup.nodes.Element element14 = htmlTreeBuilder5.getHeadElement();
        htmlTreeBuilder0.setHeadElement(element14);
        htmlTreeBuilder0.framesetOk(false);
        org.jsoup.nodes.FormElement formElement18 = null;
        htmlTreeBuilder0.setFormElement(formElement18);
        org.jsoup.parser.ParseSettings parseSettings20 = htmlTreeBuilder0.defaultSettings();
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.clearStackToTableRowContext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(htmlTreeBuilderState1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(htmlTreeBuilderState6);
        org.junit.Assert.assertNotNull(document12);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(parseSettings20);
    }

    @Test
    public void test0236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0236");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.state();
        htmlTreeBuilder0.setFosterInserts(true);
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder4 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState5 = htmlTreeBuilder4.state();
        org.jsoup.nodes.FormElement formElement6 = null;
        htmlTreeBuilder4.setFormElement(formElement6);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder8 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document11 = xmlTreeBuilder8.parse("<![CDATA[hi!]]>", " ");
        htmlTreeBuilder4.setHeadElement((org.jsoup.nodes.Element) document11);
        htmlTreeBuilder0.setHeadElement((org.jsoup.nodes.Element) document11);
        org.jsoup.nodes.FormElement formElement14 = null;
        htmlTreeBuilder0.setFormElement(formElement14);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = htmlTreeBuilder0.inListItemScope("CData");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(htmlTreeBuilderState1);
        org.junit.Assert.assertNull(htmlTreeBuilderState5);
        org.junit.Assert.assertNotNull(document11);
    }

    @Test
    public void test0237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0237");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.state();
        org.jsoup.nodes.FormElement formElement2 = null;
        htmlTreeBuilder0.setFormElement(formElement2);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder4 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document7 = xmlTreeBuilder4.parse("", "hi!");
        org.jsoup.nodes.Document document10 = xmlTreeBuilder4.parse("<![CDATA[hi!]]>", "<!---->");
        boolean boolean11 = htmlTreeBuilder0.isSpecial((org.jsoup.nodes.Element) document10);
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.insertMarkerToFormattingElements();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(htmlTreeBuilderState1);
        org.junit.Assert.assertNotNull(document7);
        org.junit.Assert.assertNotNull(document10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0238");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.state();
        org.jsoup.nodes.FormElement formElement2 = null;
        htmlTreeBuilder0.setFormElement(formElement2);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder4 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document7 = xmlTreeBuilder4.parse("<![CDATA[hi!]]>", " ");
        htmlTreeBuilder0.setHeadElement((org.jsoup.nodes.Element) document7);
        boolean boolean9 = htmlTreeBuilder0.isFragmentParsing();
        htmlTreeBuilder0.setFosterInserts(false);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder12 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document15 = xmlTreeBuilder12.parse("<![CDATA[hi!]]>", " ");
        org.jsoup.parser.Token.Comment comment16 = new org.jsoup.parser.Token.Comment();
        org.jsoup.parser.Token token17 = comment16.reset();
        boolean boolean18 = comment16.bogus;
        xmlTreeBuilder12.insert(comment16);
        org.jsoup.nodes.Document document22 = xmlTreeBuilder12.parse("StartTag", "< >");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean23 = htmlTreeBuilder0.onStack((org.jsoup.nodes.Element) document22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(htmlTreeBuilderState1);
        org.junit.Assert.assertNotNull(document7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(document15);
        org.junit.Assert.assertNotNull(token17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(document22);
    }

    @Test
    public void test0239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0239");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document3 = xmlTreeBuilder0.parse("<![CDATA[hi!]]>", " ");
        org.jsoup.parser.Token.Comment comment4 = new org.jsoup.parser.Token.Comment();
        org.jsoup.parser.Token token5 = comment4.reset();
        boolean boolean6 = comment4.bogus;
        xmlTreeBuilder0.insert(comment4);
        org.jsoup.nodes.Document document10 = xmlTreeBuilder0.parse("StartTag", "< >");
        org.jsoup.nodes.Attributes attributes12 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor13 = attributes12.iterator();
        attributes12.normalize();
        org.jsoup.nodes.Attributes attributes17 = attributes12.put("", true);
        boolean boolean18 = xmlTreeBuilder0.processStartTag("<starttag>", attributes12);
        org.jsoup.nodes.Attribute attribute19 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Attributes attributes20 = attributes12.put(attribute19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(token5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(document10);
        org.junit.Assert.assertNotNull(attributeItor13);
        org.junit.Assert.assertNotNull(attributes17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test0240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0240");
        org.jsoup.parser.ParseSettings parseSettings0 = org.jsoup.parser.ParseSettings.htmlDefault;
        org.jsoup.nodes.Attributes attributes1 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor2 = attributes1.iterator();
        org.jsoup.nodes.Attributes attributes3 = parseSettings0.normalizeAttributes(attributes1);
        attributes1.remove("hi!");
        java.lang.String str6 = attributes1.html();
        attributes1.normalize();
        org.jsoup.nodes.Attribute attribute8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Attributes attributes9 = attributes1.put(attribute8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings0);
        org.junit.Assert.assertNotNull(attributeItor2);
        org.junit.Assert.assertNotNull(attributes3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test0241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0241");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = null;
        htmlTreeBuilder0.transition(htmlTreeBuilderState1);
        boolean boolean3 = htmlTreeBuilder0.framesetOk();
        java.lang.String str4 = htmlTreeBuilder0.getBaseUri();
        org.jsoup.nodes.Document document5 = htmlTreeBuilder0.getDocument();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder6 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState7 = htmlTreeBuilder6.state();
        org.jsoup.nodes.FormElement formElement8 = null;
        htmlTreeBuilder6.setFormElement(formElement8);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder10 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document13 = xmlTreeBuilder10.parse("<![CDATA[hi!]]>", " ");
        htmlTreeBuilder6.setHeadElement((org.jsoup.nodes.Element) document13);
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.insertInFosterParent((org.jsoup.nodes.Node) document13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(document5);
        org.junit.Assert.assertNull(htmlTreeBuilderState7);
        org.junit.Assert.assertNotNull(document13);
    }

    @Test
    public void test0242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0242");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.state();
        org.jsoup.nodes.FormElement formElement2 = null;
        htmlTreeBuilder0.setFormElement(formElement2);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.state();
        java.lang.String str5 = htmlTreeBuilder0.getBaseUri();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder6 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document9 = xmlTreeBuilder6.parse("", "hi!");
        org.jsoup.nodes.Document document12 = xmlTreeBuilder6.parse("<![CDATA[hi!]]>", "<!---->");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder13 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState14 = htmlTreeBuilder13.state();
        htmlTreeBuilder13.setFosterInserts(true);
        boolean boolean17 = htmlTreeBuilder13.isFragmentParsing();
        org.jsoup.nodes.Element element18 = htmlTreeBuilder13.getHeadElement();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder19 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState20 = htmlTreeBuilder19.state();
        org.jsoup.nodes.FormElement formElement21 = null;
        htmlTreeBuilder19.setFormElement(formElement21);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder23 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document26 = xmlTreeBuilder23.parse("<![CDATA[hi!]]>", " ");
        htmlTreeBuilder19.setHeadElement((org.jsoup.nodes.Element) document26);
        boolean boolean28 = htmlTreeBuilder19.isFragmentParsing();
        htmlTreeBuilder19.setFosterInserts(false);
        org.jsoup.nodes.Element element31 = htmlTreeBuilder19.getHeadElement();
        htmlTreeBuilder13.maybeSetBaseUri(element31);
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.insertOnStackAfter((org.jsoup.nodes.Element) document12, element31);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(htmlTreeBuilderState1);
        org.junit.Assert.assertNull(htmlTreeBuilderState4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(document9);
        org.junit.Assert.assertNotNull(document12);
        org.junit.Assert.assertNull(htmlTreeBuilderState14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(element18);
        org.junit.Assert.assertNull(htmlTreeBuilderState20);
        org.junit.Assert.assertNotNull(document26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(element31);
    }

    @Test
    public void test0243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0243");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.finaliseTag();
        startTag0.appendAttributeValue(' ');
        startTag0.selfClosing = true;
        startTag0.newAttribute();
        startTag0.setEmptyAttributeValue();
        int[] intArray8 = null;
        // The following exception was thrown during execution in test generation
        try {
            startTag0.appendAttributeValue(intArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0244");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.state();
        org.jsoup.nodes.FormElement formElement2 = null;
        htmlTreeBuilder0.setFormElement(formElement2);
        htmlTreeBuilder0.setFosterInserts(true);
        java.io.Reader reader6 = null;
        org.jsoup.parser.Parser parser8 = null;
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.initialiseParse(reader6, "<!---->", parser8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String input must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(htmlTreeBuilderState1);
    }

    @Test
    public void test0245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0245");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = null;
        htmlTreeBuilder0.transition(htmlTreeBuilderState1);
        boolean boolean3 = htmlTreeBuilder0.framesetOk();
        java.lang.String str4 = htmlTreeBuilder0.getBaseUri();
        java.lang.String[] strArray5 = org.jsoup.parser.HtmlTreeBuilder.TagSearchList;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = htmlTreeBuilder0.inScope(strArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "ol", "ul" });
    }

    @Test
    public void test0246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0246");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document3 = xmlTreeBuilder0.parse("<![CDATA[hi!]]>", " ");
        org.jsoup.parser.Token.Comment comment4 = new org.jsoup.parser.Token.Comment();
        org.jsoup.parser.Token token5 = comment4.reset();
        xmlTreeBuilder0.insert(comment4);
        org.jsoup.parser.Token.Character character7 = new org.jsoup.parser.Token.Character();
        java.lang.String str8 = character7.getData();
        xmlTreeBuilder0.insert(character7);
        org.jsoup.parser.Token.StartTag startTag10 = new org.jsoup.parser.Token.StartTag();
        startTag10.finaliseTag();
        startTag10.tagName = "";
        org.jsoup.nodes.Attributes attributes14 = startTag10.attributes;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element15 = xmlTreeBuilder0.insert(startTag10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must be false");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(token5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(attributes14);
    }

    @Test
    public void test0247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0247");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.state();
        org.jsoup.nodes.FormElement formElement2 = null;
        htmlTreeBuilder0.setFormElement(formElement2);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder4 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document7 = xmlTreeBuilder4.parse("<![CDATA[hi!]]>", " ");
        htmlTreeBuilder0.setHeadElement((org.jsoup.nodes.Element) document7);
        boolean boolean9 = htmlTreeBuilder0.isFragmentParsing();
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.reconstructFormattingElements();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(htmlTreeBuilderState1);
        org.junit.Assert.assertNotNull(document7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0248");
        org.jsoup.parser.ParseSettings parseSettings0 = org.jsoup.parser.ParseSettings.htmlDefault;
        java.lang.String str2 = parseSettings0.normalizeTag("");
        java.lang.String str4 = parseSettings0.normalizeTag("");
        org.junit.Assert.assertNotNull(parseSettings0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test0249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0249");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.state();
        org.jsoup.nodes.FormElement formElement2 = null;
        htmlTreeBuilder0.setFormElement(formElement2);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = null;
        htmlTreeBuilder0.transition(htmlTreeBuilderState4);
        boolean boolean6 = htmlTreeBuilder0.isFosterInserts();
        org.jsoup.nodes.FormElement formElement7 = htmlTreeBuilder0.getFormElement();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder8 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState9 = htmlTreeBuilder8.state();
        org.jsoup.nodes.FormElement formElement10 = null;
        htmlTreeBuilder8.setFormElement(formElement10);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder12 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document15 = xmlTreeBuilder12.parse("<![CDATA[hi!]]>", " ");
        htmlTreeBuilder8.setHeadElement((org.jsoup.nodes.Element) document15);
        boolean boolean17 = htmlTreeBuilder8.isFragmentParsing();
        htmlTreeBuilder8.setFosterInserts(false);
        org.jsoup.nodes.Element element20 = htmlTreeBuilder8.getHeadElement();
        htmlTreeBuilder0.maybeSetBaseUri(element20);
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.popStackToBefore("StartTag");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(htmlTreeBuilderState1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(formElement7);
        org.junit.Assert.assertNull(htmlTreeBuilderState9);
        org.junit.Assert.assertNotNull(document15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(element20);
    }

    @Test
    public void test0250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0250");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.state();
        org.jsoup.nodes.FormElement formElement2 = null;
        htmlTreeBuilder0.setFormElement(formElement2);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.state();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState5 = htmlTreeBuilder0.state();
        org.jsoup.parser.Token.CData cData7 = new org.jsoup.parser.Token.CData("hi!");
        java.lang.String str8 = cData7.toString();
        java.lang.String str9 = cData7.toString();
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.insert((org.jsoup.parser.Token.Character) cData7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(htmlTreeBuilderState1);
        org.junit.Assert.assertNull(htmlTreeBuilderState4);
        org.junit.Assert.assertNull(htmlTreeBuilderState5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "<![CDATA[hi!]]>" + "'", str8, "<![CDATA[hi!]]>");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<![CDATA[hi!]]>" + "'", str9, "<![CDATA[hi!]]>");
    }

    @Test
    public void test0251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0251");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document3 = xmlTreeBuilder0.parse("<![CDATA[hi!]]>", " ");
        org.jsoup.parser.Token.Comment comment4 = new org.jsoup.parser.Token.Comment();
        org.jsoup.parser.Token token5 = comment4.reset();
        boolean boolean6 = comment4.bogus;
        xmlTreeBuilder0.insert(comment4);
        org.jsoup.nodes.Document document10 = xmlTreeBuilder0.parse("StartTag", "< >");
        org.jsoup.nodes.Attributes attributes12 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor13 = attributes12.iterator();
        attributes12.normalize();
        org.jsoup.nodes.Attributes attributes17 = attributes12.put("", true);
        boolean boolean18 = xmlTreeBuilder0.processStartTag("<starttag>", attributes12);
        org.jsoup.parser.Token.Comment comment19 = new org.jsoup.parser.Token.Comment();
        org.jsoup.parser.Token token20 = comment19.reset();
        boolean boolean21 = comment19.bogus;
        comment19.bogus = true;
        boolean boolean24 = comment19.bogus;
        xmlTreeBuilder0.insert(comment19);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.EndTag endTag26 = comment19.asEndTag();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$Comment cannot be cast to class org.jsoup.parser.Token$EndTag (org.jsoup.parser.Token$Comment and org.jsoup.parser.Token$EndTag are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(token5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(document10);
        org.junit.Assert.assertNotNull(attributeItor13);
        org.junit.Assert.assertNotNull(attributes17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(token20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test0252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0252");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.state();
        org.jsoup.nodes.FormElement formElement2 = null;
        htmlTreeBuilder0.setFormElement(formElement2);
        htmlTreeBuilder0.setFosterInserts(true);
        boolean boolean6 = htmlTreeBuilder0.isFosterInserts();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder7 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState8 = htmlTreeBuilder7.state();
        org.jsoup.nodes.FormElement formElement9 = null;
        htmlTreeBuilder7.setFormElement(formElement9);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder11 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document14 = xmlTreeBuilder11.parse("<![CDATA[hi!]]>", " ");
        htmlTreeBuilder7.setHeadElement((org.jsoup.nodes.Element) document14);
        org.jsoup.nodes.Element element16 = htmlTreeBuilder7.getHeadElement();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = htmlTreeBuilder0.onStack(element16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(htmlTreeBuilderState1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(htmlTreeBuilderState8);
        org.junit.Assert.assertNotNull(document14);
        org.junit.Assert.assertNotNull(element16);
    }

    @Test
    public void test0253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0253");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder1 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState2 = htmlTreeBuilder1.state();
        org.jsoup.nodes.FormElement formElement3 = null;
        htmlTreeBuilder1.setFormElement(formElement3);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder5 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document8 = xmlTreeBuilder5.parse("<![CDATA[hi!]]>", " ");
        htmlTreeBuilder1.setHeadElement((org.jsoup.nodes.Element) document8);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = htmlTreeBuilder0.isInActiveFormattingElements((org.jsoup.nodes.Element) document8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(htmlTreeBuilderState2);
        org.junit.Assert.assertNotNull(document8);
    }

    @Test
    public void test0254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0254");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = null;
        htmlTreeBuilder0.transition(htmlTreeBuilderState1);
        boolean boolean3 = htmlTreeBuilder0.framesetOk();
        java.lang.String str4 = htmlTreeBuilder0.getBaseUri();
        java.lang.String str5 = htmlTreeBuilder0.getBaseUri();
        org.jsoup.parser.Token.StartTag startTag6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.FormElement formElement8 = htmlTreeBuilder0.insertForm(startTag6, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test0255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0255");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.state();
        org.jsoup.nodes.FormElement formElement2 = null;
        htmlTreeBuilder0.setFormElement(formElement2);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder4 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document7 = xmlTreeBuilder4.parse("<![CDATA[hi!]]>", " ");
        htmlTreeBuilder0.setHeadElement((org.jsoup.nodes.Element) document7);
        boolean boolean9 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState10 = htmlTreeBuilder0.originalState();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element11 = htmlTreeBuilder0.removeLastFormattingElement();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(htmlTreeBuilderState1);
        org.junit.Assert.assertNotNull(document7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(htmlTreeBuilderState10);
    }

    @Test
    public void test0256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0256");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.state();
        htmlTreeBuilder0.setFosterInserts(true);
        boolean boolean4 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder5 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState6 = htmlTreeBuilder5.state();
        org.jsoup.nodes.FormElement formElement7 = null;
        htmlTreeBuilder5.setFormElement(formElement7);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder9 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document12 = xmlTreeBuilder9.parse("<![CDATA[hi!]]>", " ");
        htmlTreeBuilder5.setHeadElement((org.jsoup.nodes.Element) document12);
        org.jsoup.nodes.Element element14 = htmlTreeBuilder5.getHeadElement();
        htmlTreeBuilder0.setHeadElement(element14);
        htmlTreeBuilder0.framesetOk(false);
        org.jsoup.nodes.FormElement formElement18 = null;
        htmlTreeBuilder0.setFormElement(formElement18);
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder20 = new org.jsoup.parser.HtmlTreeBuilder();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList21 = htmlTreeBuilder20.getStack();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList22 = htmlTreeBuilder20.getStack();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder23 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState24 = htmlTreeBuilder23.state();
        org.jsoup.nodes.FormElement formElement25 = null;
        htmlTreeBuilder23.setFormElement(formElement25);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder27 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document30 = xmlTreeBuilder27.parse("", "hi!");
        org.jsoup.nodes.Document document33 = xmlTreeBuilder27.parse("<![CDATA[hi!]]>", "<!---->");
        boolean boolean34 = htmlTreeBuilder23.isSpecial((org.jsoup.nodes.Element) document33);
        boolean boolean35 = htmlTreeBuilder20.isSpecial((org.jsoup.nodes.Element) document33);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean36 = htmlTreeBuilder0.removeFromStack((org.jsoup.nodes.Element) document33);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(htmlTreeBuilderState1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(htmlTreeBuilderState6);
        org.junit.Assert.assertNotNull(document12);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNull(elementList21);
        org.junit.Assert.assertNull(elementList22);
        org.junit.Assert.assertNull(htmlTreeBuilderState24);
        org.junit.Assert.assertNotNull(document30);
        org.junit.Assert.assertNotNull(document33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test0257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0257");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.state();
        org.jsoup.nodes.FormElement formElement2 = null;
        htmlTreeBuilder0.setFormElement(formElement2);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder4 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document7 = xmlTreeBuilder4.parse("<![CDATA[hi!]]>", " ");
        htmlTreeBuilder0.setHeadElement((org.jsoup.nodes.Element) document7);
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.resetInsertionMode();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(htmlTreeBuilderState1);
        org.junit.Assert.assertNotNull(document7);
    }

    @Test
    public void test0258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0258");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = null;
        htmlTreeBuilder0.transition(htmlTreeBuilderState1);
        boolean boolean3 = htmlTreeBuilder0.framesetOk();
        java.lang.String str4 = htmlTreeBuilder0.getBaseUri();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder5 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document8 = xmlTreeBuilder5.parse("", "hi!");
        org.jsoup.nodes.Document document11 = xmlTreeBuilder5.parse("<![CDATA[hi!]]>", "<!---->");
        org.jsoup.parser.Token.StartTag startTag12 = new org.jsoup.parser.Token.StartTag();
        startTag12.appendAttributeName(' ');
        boolean boolean15 = startTag12.selfClosing;
        startTag12.newAttribute();
        org.jsoup.parser.Token.Tag tag18 = startTag12.name("<![CDATA[null]]>");
        org.jsoup.parser.Token.StartTag startTag19 = new org.jsoup.parser.Token.StartTag();
        startTag19.appendAttributeValue("");
        org.jsoup.parser.Token.TokenType tokenType22 = org.jsoup.parser.Token.TokenType.Doctype;
        startTag19.type = tokenType22;
        startTag12.type = tokenType22;
        startTag12.newAttribute();
        startTag12.appendAttributeName("</<![CDATA[null]]>>");
        org.jsoup.nodes.Element element28 = xmlTreeBuilder5.insert(startTag12);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder29 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document32 = xmlTreeBuilder29.parse("<![CDATA[hi!]]>", " ");
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.insertOnStackAfter(element28, (org.jsoup.nodes.Element) document32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(document8);
        org.junit.Assert.assertNotNull(document11);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(tag18);
        org.junit.Assert.assertTrue("'" + tokenType22 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType22.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertNotNull(element28);
        org.junit.Assert.assertNotNull(document32);
    }

    @Test
    public void test0259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0259");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.finaliseTag();
        startTag0.tagName = "";
        org.jsoup.nodes.Attributes attributes4 = startTag0.attributes;
        org.jsoup.parser.Token.Tag tag6 = startTag0.name("hi!");
        org.jsoup.parser.Token.StartTag startTag7 = new org.jsoup.parser.Token.StartTag();
        startTag7.finaliseTag();
        startTag7.tagName = "";
        int[] intArray15 = new int[] { 0, (byte) 10, (short) 10, (short) 1 };
        startTag7.appendAttributeValue(intArray15);
        tag6.appendAttributeValue(intArray15);
        tag6.newAttribute();
        boolean boolean19 = tag6.isCharacter();
        org.junit.Assert.assertNotNull(attributes4);
        org.junit.Assert.assertNotNull(tag6);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertArrayEquals(intArray15, new int[] { 0, 10, 10, 1 });
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test0260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0260");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.state();
        org.jsoup.nodes.FormElement formElement2 = null;
        htmlTreeBuilder0.setFormElement(formElement2);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder4 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document7 = xmlTreeBuilder4.parse("<![CDATA[hi!]]>", " ");
        htmlTreeBuilder0.maybeSetBaseUri((org.jsoup.nodes.Element) document7);
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder9 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState10 = htmlTreeBuilder9.state();
        org.jsoup.nodes.FormElement formElement11 = null;
        htmlTreeBuilder9.setFormElement(formElement11);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder13 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document16 = xmlTreeBuilder13.parse("<![CDATA[hi!]]>", " ");
        htmlTreeBuilder9.setHeadElement((org.jsoup.nodes.Element) document16);
        boolean boolean18 = htmlTreeBuilder9.isFragmentParsing();
        htmlTreeBuilder9.setFosterInserts(false);
        org.jsoup.nodes.Element element21 = htmlTreeBuilder9.getHeadElement();
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.insertInFosterParent((org.jsoup.nodes.Node) element21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(htmlTreeBuilderState1);
        org.junit.Assert.assertNotNull(document7);
        org.junit.Assert.assertNull(htmlTreeBuilderState10);
        org.junit.Assert.assertNotNull(document16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(element21);
    }

    @Test
    public void test0261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0261");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.state();
        org.jsoup.nodes.FormElement formElement2 = null;
        htmlTreeBuilder0.setFormElement(formElement2);
        org.jsoup.parser.Token.CData cData5 = new org.jsoup.parser.Token.CData("hi!");
        org.jsoup.parser.Token token6 = cData5.reset();
        org.jsoup.parser.Token token7 = cData5.reset();
        java.lang.String str8 = cData5.getData();
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.insert((org.jsoup.parser.Token.Character) cData5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(htmlTreeBuilderState1);
        org.junit.Assert.assertNotNull(token6);
        org.junit.Assert.assertNotNull(token7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test0262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0262");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.state();
        org.jsoup.nodes.FormElement formElement2 = null;
        htmlTreeBuilder0.setFormElement(formElement2);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder4 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document7 = xmlTreeBuilder4.parse("", "hi!");
        org.jsoup.nodes.Document document10 = xmlTreeBuilder4.parse("<![CDATA[hi!]]>", "<!---->");
        boolean boolean11 = htmlTreeBuilder0.isSpecial((org.jsoup.nodes.Element) document10);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder12 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document15 = xmlTreeBuilder12.parse("", "hi!");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = htmlTreeBuilder0.isInActiveFormattingElements((org.jsoup.nodes.Element) document15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(htmlTreeBuilderState1);
        org.junit.Assert.assertNotNull(document7);
        org.junit.Assert.assertNotNull(document10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(document15);
    }

    @Test
    public void test0263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0263");
        org.jsoup.parser.ParseSettings parseSettings0 = org.jsoup.parser.ParseSettings.htmlDefault;
        org.jsoup.nodes.Attributes attributes1 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor2 = attributes1.iterator();
        org.jsoup.nodes.Attributes attributes3 = parseSettings0.normalizeAttributes(attributes1);
        java.lang.String str4 = attributes1.toString();
        org.junit.Assert.assertNotNull(parseSettings0);
        org.junit.Assert.assertNotNull(attributeItor2);
        org.junit.Assert.assertNotNull(attributes3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test0264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0264");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList1 = htmlTreeBuilder0.getStack();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList2 = htmlTreeBuilder0.getStack();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder3 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder3.state();
        org.jsoup.nodes.FormElement formElement5 = null;
        htmlTreeBuilder3.setFormElement(formElement5);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder7 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document10 = xmlTreeBuilder7.parse("", "hi!");
        org.jsoup.nodes.Document document13 = xmlTreeBuilder7.parse("<![CDATA[hi!]]>", "<!---->");
        boolean boolean14 = htmlTreeBuilder3.isSpecial((org.jsoup.nodes.Element) document13);
        boolean boolean15 = htmlTreeBuilder0.isSpecial((org.jsoup.nodes.Element) document13);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = htmlTreeBuilder0.inSelectScope("Doctype");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(elementList1);
        org.junit.Assert.assertNull(elementList2);
        org.junit.Assert.assertNull(htmlTreeBuilderState4);
        org.junit.Assert.assertNotNull(document10);
        org.junit.Assert.assertNotNull(document13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0265");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.state();
        htmlTreeBuilder0.setFosterInserts(true);
        boolean boolean4 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder5 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState6 = htmlTreeBuilder5.state();
        org.jsoup.nodes.FormElement formElement7 = null;
        htmlTreeBuilder5.setFormElement(formElement7);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder9 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document12 = xmlTreeBuilder9.parse("<![CDATA[hi!]]>", " ");
        htmlTreeBuilder5.setHeadElement((org.jsoup.nodes.Element) document12);
        org.jsoup.nodes.Element element14 = htmlTreeBuilder5.getHeadElement();
        htmlTreeBuilder0.setHeadElement(element14);
        htmlTreeBuilder0.framesetOk(false);
        org.jsoup.nodes.FormElement formElement18 = null;
        htmlTreeBuilder0.setFormElement(formElement18);
        htmlTreeBuilder0.framesetOk(true);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder22 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document25 = xmlTreeBuilder22.parse("<![CDATA[hi!]]>", " ");
        org.jsoup.parser.Token.Comment comment26 = new org.jsoup.parser.Token.Comment();
        org.jsoup.parser.Token token27 = comment26.reset();
        xmlTreeBuilder22.insert(comment26);
        java.lang.StringBuilder stringBuilder29 = comment26.data;
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.insert(comment26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(htmlTreeBuilderState1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(htmlTreeBuilderState6);
        org.junit.Assert.assertNotNull(document12);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(document25);
        org.junit.Assert.assertNotNull(token27);
        org.junit.Assert.assertNotNull(stringBuilder29);
        org.junit.Assert.assertEquals(stringBuilder29.toString(), "");
    }

    @Test
    public void test0266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0266");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.appendAttributeName(' ');
        startTag0.normalName = "<![CDATA[null]]>";
        org.jsoup.parser.Token.Tag tag6 = startTag0.name("");
        org.jsoup.nodes.Attributes attributes7 = tag6.getAttributes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Comment comment8 = tag6.asComment();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$Comment (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$Comment are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tag6);
        org.junit.Assert.assertNotNull(attributes7);
    }

    @Test
    public void test0267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0267");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.finaliseTag();
        java.lang.String str2 = startTag0.normalName();
        org.jsoup.parser.ParseSettings parseSettings3 = org.jsoup.parser.ParseSettings.htmlDefault;
        org.jsoup.nodes.Attributes attributes4 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor5 = attributes4.iterator();
        org.jsoup.nodes.Attributes attributes6 = parseSettings3.normalizeAttributes(attributes4);
        attributes4.remove("hi!");
        boolean boolean10 = attributes4.hasKeyIgnoreCase("");
        startTag0.attributes = attributes4;
        java.lang.String str12 = attributes4.toString();
        boolean boolean14 = attributes4.hasKeyIgnoreCase("<![CDATA[StartTag]]>");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(parseSettings3);
        org.junit.Assert.assertNotNull(attributeItor5);
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0268");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.finaliseTag();
        startTag0.tagName = "";
        org.jsoup.nodes.Attributes attributes4 = startTag0.attributes;
        java.util.Map<java.lang.String, java.lang.String> strMap5 = attributes4.dataset();
        org.junit.Assert.assertNotNull(attributes4);
        org.junit.Assert.assertNotNull(strMap5);
    }

    @Test
    public void test0269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0269");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document3 = xmlTreeBuilder0.parse("<![CDATA[hi!]]>", " ");
        org.jsoup.parser.Token.Comment comment4 = new org.jsoup.parser.Token.Comment();
        org.jsoup.parser.Token token5 = comment4.reset();
        xmlTreeBuilder0.insert(comment4);
        org.jsoup.parser.Token.Character character7 = new org.jsoup.parser.Token.Character();
        java.lang.String str8 = character7.getData();
        xmlTreeBuilder0.insert(character7);
        org.jsoup.parser.Token.EndTag endTag11 = new org.jsoup.parser.Token.EndTag();
        java.lang.String str12 = endTag11.normalName;
        org.jsoup.parser.ParseSettings parseSettings13 = org.jsoup.parser.ParseSettings.htmlDefault;
        org.jsoup.nodes.Attributes attributes14 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor15 = attributes14.iterator();
        org.jsoup.nodes.Attributes attributes16 = parseSettings13.normalizeAttributes(attributes14);
        java.lang.String str17 = attributes16.toString();
        endTag11.attributes = attributes16;
        org.jsoup.nodes.Attributes attributes19 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor20 = attributes19.iterator();
        attributes19.normalize();
        int int22 = attributes19.size();
        org.jsoup.nodes.Attributes attributes25 = attributes19.put("StartTag", true);
        attributes16.addAll(attributes19);
        boolean boolean27 = xmlTreeBuilder0.processStartTag("cdata", attributes19);
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder29 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState30 = htmlTreeBuilder29.state();
        org.jsoup.nodes.FormElement formElement31 = null;
        htmlTreeBuilder29.setFormElement(formElement31);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState33 = null;
        htmlTreeBuilder29.transition(htmlTreeBuilderState33);
        boolean boolean35 = htmlTreeBuilder29.isFosterInserts();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder36 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState37 = htmlTreeBuilder36.state();
        htmlTreeBuilder36.setFosterInserts(true);
        boolean boolean40 = htmlTreeBuilder36.isFragmentParsing();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder41 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState42 = htmlTreeBuilder41.state();
        org.jsoup.nodes.FormElement formElement43 = null;
        htmlTreeBuilder41.setFormElement(formElement43);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder45 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document48 = xmlTreeBuilder45.parse("<![CDATA[hi!]]>", " ");
        htmlTreeBuilder41.setHeadElement((org.jsoup.nodes.Element) document48);
        org.jsoup.nodes.Element element50 = htmlTreeBuilder41.getHeadElement();
        htmlTreeBuilder36.setHeadElement(element50);
        boolean boolean52 = htmlTreeBuilder29.isSpecial(element50);
        org.jsoup.parser.Parser parser54 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.jsoup.nodes.Node> nodeList55 = xmlTreeBuilder0.parseFragment(" ", element50, "starttag", parser54);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(token5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(parseSettings13);
        org.junit.Assert.assertNotNull(attributeItor15);
        org.junit.Assert.assertNotNull(attributes16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(attributeItor20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(attributes25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNull(htmlTreeBuilderState30);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNull(htmlTreeBuilderState37);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNull(htmlTreeBuilderState42);
        org.junit.Assert.assertNotNull(document48);
        org.junit.Assert.assertNotNull(element50);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
    }

    @Test
    public void test0270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0270");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.state();
        org.jsoup.nodes.FormElement formElement2 = null;
        htmlTreeBuilder0.setFormElement(formElement2);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.state();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder5 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState6 = htmlTreeBuilder5.state();
        htmlTreeBuilder5.setFosterInserts(true);
        boolean boolean9 = htmlTreeBuilder5.isFragmentParsing();
        org.jsoup.nodes.Element element10 = htmlTreeBuilder5.getHeadElement();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder11 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState12 = htmlTreeBuilder11.state();
        org.jsoup.nodes.FormElement formElement13 = null;
        htmlTreeBuilder11.setFormElement(formElement13);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder15 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document18 = xmlTreeBuilder15.parse("<![CDATA[hi!]]>", " ");
        htmlTreeBuilder11.setHeadElement((org.jsoup.nodes.Element) document18);
        boolean boolean20 = htmlTreeBuilder11.isFragmentParsing();
        htmlTreeBuilder11.setFosterInserts(false);
        org.jsoup.nodes.Element element23 = htmlTreeBuilder11.getHeadElement();
        htmlTreeBuilder5.maybeSetBaseUri(element23);
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder25 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState26 = htmlTreeBuilder25.state();
        htmlTreeBuilder25.setFosterInserts(true);
        boolean boolean29 = htmlTreeBuilder25.isFragmentParsing();
        org.jsoup.nodes.Element element30 = htmlTreeBuilder25.getHeadElement();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder31 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState32 = htmlTreeBuilder31.state();
        org.jsoup.nodes.FormElement formElement33 = null;
        htmlTreeBuilder31.setFormElement(formElement33);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder35 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document38 = xmlTreeBuilder35.parse("<![CDATA[hi!]]>", " ");
        htmlTreeBuilder31.setHeadElement((org.jsoup.nodes.Element) document38);
        boolean boolean40 = htmlTreeBuilder31.isFragmentParsing();
        htmlTreeBuilder31.setFosterInserts(false);
        org.jsoup.nodes.Element element43 = htmlTreeBuilder31.getHeadElement();
        htmlTreeBuilder25.maybeSetBaseUri(element43);
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.insertOnStackAfter(element23, element43);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(htmlTreeBuilderState1);
        org.junit.Assert.assertNull(htmlTreeBuilderState4);
        org.junit.Assert.assertNull(htmlTreeBuilderState6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(element10);
        org.junit.Assert.assertNull(htmlTreeBuilderState12);
        org.junit.Assert.assertNotNull(document18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertNull(htmlTreeBuilderState26);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNull(element30);
        org.junit.Assert.assertNull(htmlTreeBuilderState32);
        org.junit.Assert.assertNotNull(document38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(element43);
    }

    @Test
    public void test0271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0271");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.state();
        org.jsoup.nodes.FormElement formElement2 = null;
        htmlTreeBuilder0.setFormElement(formElement2);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder4 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document7 = xmlTreeBuilder4.parse("<![CDATA[hi!]]>", " ");
        htmlTreeBuilder0.setHeadElement((org.jsoup.nodes.Element) document7);
        org.jsoup.nodes.Element element9 = htmlTreeBuilder0.getHeadElement();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState10 = htmlTreeBuilder0.state();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder11 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document14 = xmlTreeBuilder11.parse("<![CDATA[hi!]]>", " ");
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.insertInFosterParent((org.jsoup.nodes.Node) document14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(htmlTreeBuilderState1);
        org.junit.Assert.assertNotNull(document7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNull(htmlTreeBuilderState10);
        org.junit.Assert.assertNotNull(document14);
    }

    @Test
    public void test0272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0272");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.state();
        org.jsoup.nodes.FormElement formElement2 = null;
        htmlTreeBuilder0.setFormElement(formElement2);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder4 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document7 = xmlTreeBuilder4.parse("<![CDATA[hi!]]>", " ");
        htmlTreeBuilder0.setHeadElement((org.jsoup.nodes.Element) document7);
        boolean boolean9 = htmlTreeBuilder0.isFragmentParsing();
        htmlTreeBuilder0.setFosterInserts(false);
        org.jsoup.nodes.Document document12 = htmlTreeBuilder0.getDocument();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder13 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document16 = xmlTreeBuilder13.parse("", "hi!");
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.pushActiveFormattingElements((org.jsoup.nodes.Element) document16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(htmlTreeBuilderState1);
        org.junit.Assert.assertNotNull(document7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(document12);
        org.junit.Assert.assertNotNull(document16);
    }

    @Test
    public void test0273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0273");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.state();
        org.jsoup.nodes.FormElement formElement2 = null;
        htmlTreeBuilder0.setFormElement(formElement2);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder4 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document7 = xmlTreeBuilder4.parse("<![CDATA[hi!]]>", " ");
        htmlTreeBuilder0.setHeadElement((org.jsoup.nodes.Element) document7);
        boolean boolean9 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState10 = htmlTreeBuilder0.originalState();
        java.lang.String[] strArray11 = org.jsoup.parser.HtmlTreeBuilder.TagSearchSelectScope;
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.popStackToClose(strArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(htmlTreeBuilderState1);
        org.junit.Assert.assertNotNull(document7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(htmlTreeBuilderState10);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "optgroup", "option" });
    }

    @Test
    public void test0274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0274");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.state();
        htmlTreeBuilder0.setFosterInserts(true);
        boolean boolean4 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.nodes.Element element5 = htmlTreeBuilder0.getHeadElement();
        org.jsoup.nodes.Document document6 = htmlTreeBuilder0.getDocument();
        org.jsoup.nodes.Element element7 = htmlTreeBuilder0.getHeadElement();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder8 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState9 = htmlTreeBuilder8.state();
        htmlTreeBuilder8.setFosterInserts(true);
        boolean boolean12 = htmlTreeBuilder8.isFragmentParsing();
        org.jsoup.nodes.Element element13 = htmlTreeBuilder8.getHeadElement();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder14 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState15 = htmlTreeBuilder14.state();
        org.jsoup.nodes.FormElement formElement16 = null;
        htmlTreeBuilder14.setFormElement(formElement16);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder18 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document21 = xmlTreeBuilder18.parse("<![CDATA[hi!]]>", " ");
        htmlTreeBuilder14.setHeadElement((org.jsoup.nodes.Element) document21);
        boolean boolean23 = htmlTreeBuilder14.isFragmentParsing();
        htmlTreeBuilder14.setFosterInserts(false);
        org.jsoup.nodes.Element element26 = htmlTreeBuilder14.getHeadElement();
        htmlTreeBuilder8.maybeSetBaseUri(element26);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder28 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document31 = xmlTreeBuilder28.parse("", "hi!");
        org.jsoup.nodes.Document document34 = xmlTreeBuilder28.parse("<![CDATA[hi!]]>", "<!---->");
        org.jsoup.parser.Token.StartTag startTag35 = new org.jsoup.parser.Token.StartTag();
        startTag35.appendAttributeName(' ');
        boolean boolean38 = startTag35.selfClosing;
        startTag35.newAttribute();
        org.jsoup.parser.Token.Tag tag41 = startTag35.name("<![CDATA[null]]>");
        org.jsoup.parser.Token.StartTag startTag42 = new org.jsoup.parser.Token.StartTag();
        startTag42.appendAttributeValue("");
        org.jsoup.parser.Token.TokenType tokenType45 = org.jsoup.parser.Token.TokenType.Doctype;
        startTag42.type = tokenType45;
        startTag35.type = tokenType45;
        startTag35.newAttribute();
        startTag35.appendAttributeName("</<![CDATA[null]]>>");
        org.jsoup.nodes.Element element51 = xmlTreeBuilder28.insert(startTag35);
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.insertOnStackAfter(element26, element51);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(htmlTreeBuilderState1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(element5);
        org.junit.Assert.assertNull(document6);
        org.junit.Assert.assertNull(element7);
        org.junit.Assert.assertNull(htmlTreeBuilderState9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(element13);
        org.junit.Assert.assertNull(htmlTreeBuilderState15);
        org.junit.Assert.assertNotNull(document21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(element26);
        org.junit.Assert.assertNotNull(document31);
        org.junit.Assert.assertNotNull(document34);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(tag41);
        org.junit.Assert.assertTrue("'" + tokenType45 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType45.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertNotNull(element51);
    }

    @Test
    public void test0275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0275");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.state();
        org.jsoup.nodes.FormElement formElement2 = null;
        htmlTreeBuilder0.setFormElement(formElement2);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder4 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document7 = xmlTreeBuilder4.parse("", "hi!");
        org.jsoup.nodes.Document document10 = xmlTreeBuilder4.parse("<![CDATA[hi!]]>", "<!---->");
        boolean boolean11 = htmlTreeBuilder0.isSpecial((org.jsoup.nodes.Element) document10);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = htmlTreeBuilder0.inScope("StartTag");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(htmlTreeBuilderState1);
        org.junit.Assert.assertNotNull(document7);
        org.junit.Assert.assertNotNull(document10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0276");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.state();
        htmlTreeBuilder0.setFosterInserts(true);
        boolean boolean4 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.nodes.Element element5 = htmlTreeBuilder0.getHeadElement();
        org.jsoup.nodes.Document document6 = htmlTreeBuilder0.getDocument();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder7 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState8 = htmlTreeBuilder7.state();
        org.jsoup.nodes.FormElement formElement9 = null;
        htmlTreeBuilder7.setFormElement(formElement9);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder11 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document14 = xmlTreeBuilder11.parse("<![CDATA[hi!]]>", " ");
        htmlTreeBuilder7.setHeadElement((org.jsoup.nodes.Element) document14);
        org.jsoup.nodes.Element element16 = htmlTreeBuilder7.getHeadElement();
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.push(element16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(htmlTreeBuilderState1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(element5);
        org.junit.Assert.assertNull(document6);
        org.junit.Assert.assertNull(htmlTreeBuilderState8);
        org.junit.Assert.assertNotNull(document14);
        org.junit.Assert.assertNotNull(element16);
    }

    @Test
    public void test0277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0277");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.state();
        org.jsoup.nodes.FormElement formElement2 = null;
        htmlTreeBuilder0.setFormElement(formElement2);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.state();
        java.lang.String str5 = htmlTreeBuilder0.getBaseUri();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = htmlTreeBuilder0.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(htmlTreeBuilderState1);
        org.junit.Assert.assertNull(htmlTreeBuilderState4);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test0278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0278");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.StringBuilder stringBuilder1 = doctype0.publicIdentifier;
        org.jsoup.parser.Token token2 = doctype0.reset();
        boolean boolean3 = token2.isEOF();
        org.junit.Assert.assertNotNull(stringBuilder1);
        org.junit.Assert.assertEquals(stringBuilder1.toString(), "");
        org.junit.Assert.assertNotNull(token2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0279");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document3 = xmlTreeBuilder0.parse("", "hi!");
        org.jsoup.parser.Token.Comment comment4 = new org.jsoup.parser.Token.Comment();
        java.lang.StringBuilder stringBuilder5 = comment4.data;
        comment4.bogus = false;
        org.jsoup.parser.Token.Comment comment8 = comment4.asComment();
        boolean boolean9 = comment8.bogus;
        xmlTreeBuilder0.insert(comment8);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder11 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document14 = xmlTreeBuilder11.parse("<![CDATA[hi!]]>", " ");
        org.jsoup.parser.Token.CData cData16 = new org.jsoup.parser.Token.CData("hi!");
        xmlTreeBuilder11.insert((org.jsoup.parser.Token.Character) cData16);
        org.jsoup.parser.Token.Doctype doctype18 = new org.jsoup.parser.Token.Doctype();
        boolean boolean19 = doctype18.isEOF();
        boolean boolean20 = doctype18.isCharacter();
        boolean boolean21 = doctype18.isComment();
        xmlTreeBuilder11.insert(doctype18);
        org.jsoup.parser.Token.Comment comment23 = new org.jsoup.parser.Token.Comment();
        java.lang.String str24 = comment23.getData();
        xmlTreeBuilder11.insert(comment23);
        org.jsoup.parser.Token.Doctype doctype26 = new org.jsoup.parser.Token.Doctype();
        boolean boolean27 = doctype26.isStartTag();
        java.lang.StringBuilder stringBuilder28 = doctype26.name;
        java.lang.StringBuilder stringBuilder29 = doctype26.publicIdentifier;
        xmlTreeBuilder11.insert(doctype26);
        org.jsoup.parser.Token token31 = doctype26.reset();
        xmlTreeBuilder0.insert(doctype26);
        java.io.Reader reader33 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document35 = xmlTreeBuilder0.parse(reader33, " ");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String input must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "");
        org.junit.Assert.assertNotNull(comment8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(document14);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(stringBuilder28);
        org.junit.Assert.assertEquals(stringBuilder28.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder29);
        org.junit.Assert.assertEquals(stringBuilder29.toString(), "");
        org.junit.Assert.assertNotNull(token31);
    }

    @Test
    public void test0280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0280");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.state();
        org.jsoup.nodes.FormElement formElement2 = null;
        htmlTreeBuilder0.setFormElement(formElement2);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.state();
        org.jsoup.parser.Token.StartTag startTag6 = new org.jsoup.parser.Token.StartTag();
        startTag6.finaliseTag();
        org.jsoup.parser.ParseSettings parseSettings9 = org.jsoup.parser.ParseSettings.htmlDefault;
        org.jsoup.nodes.Attributes attributes10 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor11 = attributes10.iterator();
        org.jsoup.nodes.Attributes attributes12 = parseSettings9.normalizeAttributes(attributes10);
        java.util.Map<java.lang.String, java.lang.String> strMap13 = attributes10.dataset();
        org.jsoup.parser.Token.StartTag startTag14 = startTag6.nameAttr("hi!", attributes10);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = htmlTreeBuilder0.processStartTag("cdata", attributes10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(htmlTreeBuilderState1);
        org.junit.Assert.assertNull(htmlTreeBuilderState4);
        org.junit.Assert.assertNotNull(parseSettings9);
        org.junit.Assert.assertNotNull(attributeItor11);
        org.junit.Assert.assertNotNull(attributes12);
        org.junit.Assert.assertNotNull(strMap13);
        org.junit.Assert.assertNotNull(startTag14);
    }

    @Test
    public void test0281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0281");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document3 = xmlTreeBuilder0.parse("", "hi!");
        java.io.Reader reader4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document6 = xmlTreeBuilder0.parse(reader4, "<!---->");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String input must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document3);
    }

    @Test
    public void test0282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0282");
        org.jsoup.parser.ParseSettings parseSettings0 = org.jsoup.parser.ParseSettings.htmlDefault;
        org.jsoup.nodes.Attributes attributes1 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor2 = attributes1.iterator();
        org.jsoup.nodes.Attributes attributes3 = parseSettings0.normalizeAttributes(attributes1);
        boolean boolean5 = attributes1.hasKeyIgnoreCase("hi!");
        attributes1.normalize();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor7 = attributes1.iterator();
        org.junit.Assert.assertNotNull(parseSettings0);
        org.junit.Assert.assertNotNull(attributeItor2);
        org.junit.Assert.assertNotNull(attributes3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(attributeItor7);
    }

    @Test
    public void test0283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0283");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.state();
        htmlTreeBuilder0.setFosterInserts(true);
        boolean boolean4 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder5 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState6 = htmlTreeBuilder5.state();
        org.jsoup.nodes.FormElement formElement7 = null;
        htmlTreeBuilder5.setFormElement(formElement7);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder9 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document12 = xmlTreeBuilder9.parse("<![CDATA[hi!]]>", " ");
        htmlTreeBuilder5.setHeadElement((org.jsoup.nodes.Element) document12);
        org.jsoup.nodes.Element element14 = htmlTreeBuilder5.getHeadElement();
        htmlTreeBuilder0.setHeadElement(element14);
        htmlTreeBuilder0.framesetOk(false);
        org.jsoup.nodes.FormElement formElement18 = null;
        htmlTreeBuilder0.setFormElement(formElement18);
        org.jsoup.parser.ParseSettings parseSettings20 = htmlTreeBuilder0.defaultSettings();
        java.util.List<java.lang.String> strList21 = htmlTreeBuilder0.getPendingTableCharacters();
        org.jsoup.parser.Token.StartTag startTag22 = new org.jsoup.parser.Token.StartTag();
        startTag22.finaliseTag();
        startTag22.tagName = "";
        int[] intArray30 = new int[] { 0, (byte) 10, (short) 10, (short) 1 };
        startTag22.appendAttributeValue(intArray30);
        startTag22.finaliseTag();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element33 = htmlTreeBuilder0.insert(startTag22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must be false");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(htmlTreeBuilderState1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(htmlTreeBuilderState6);
        org.junit.Assert.assertNotNull(document12);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(parseSettings20);
        org.junit.Assert.assertNull(strList21);
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertArrayEquals(intArray30, new int[] { 0, 10, 10, 1 });
    }

    @Test
    public void test0284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0284");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList1 = htmlTreeBuilder0.getStack();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList2 = htmlTreeBuilder0.getStack();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder3 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder3.state();
        org.jsoup.nodes.FormElement formElement5 = null;
        htmlTreeBuilder3.setFormElement(formElement5);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder7 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document10 = xmlTreeBuilder7.parse("", "hi!");
        org.jsoup.nodes.Document document13 = xmlTreeBuilder7.parse("<![CDATA[hi!]]>", "<!---->");
        boolean boolean14 = htmlTreeBuilder3.isSpecial((org.jsoup.nodes.Element) document13);
        boolean boolean15 = htmlTreeBuilder0.isSpecial((org.jsoup.nodes.Element) document13);
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder16 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState17 = htmlTreeBuilder16.state();
        org.jsoup.nodes.FormElement formElement18 = null;
        htmlTreeBuilder16.setFormElement(formElement18);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder20 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document23 = xmlTreeBuilder20.parse("<![CDATA[hi!]]>", " ");
        htmlTreeBuilder16.setHeadElement((org.jsoup.nodes.Element) document23);
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder25 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState26 = htmlTreeBuilder25.state();
        org.jsoup.nodes.FormElement formElement27 = null;
        htmlTreeBuilder25.setFormElement(formElement27);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder29 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document32 = xmlTreeBuilder29.parse("<![CDATA[hi!]]>", " ");
        htmlTreeBuilder25.maybeSetBaseUri((org.jsoup.nodes.Element) document32);
        htmlTreeBuilder16.maybeSetBaseUri((org.jsoup.nodes.Element) document32);
        org.jsoup.nodes.Element element35 = htmlTreeBuilder16.getHeadElement();
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.push(element35);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(elementList1);
        org.junit.Assert.assertNull(elementList2);
        org.junit.Assert.assertNull(htmlTreeBuilderState4);
        org.junit.Assert.assertNotNull(document10);
        org.junit.Assert.assertNotNull(document13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(htmlTreeBuilderState17);
        org.junit.Assert.assertNotNull(document23);
        org.junit.Assert.assertNull(htmlTreeBuilderState26);
        org.junit.Assert.assertNotNull(document32);
        org.junit.Assert.assertNotNull(element35);
    }

    @Test
    public void test0285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0285");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.state();
        org.jsoup.nodes.FormElement formElement2 = null;
        htmlTreeBuilder0.setFormElement(formElement2);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder4 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document7 = xmlTreeBuilder4.parse("<![CDATA[hi!]]>", " ");
        htmlTreeBuilder0.setHeadElement((org.jsoup.nodes.Element) document7);
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder9 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState10 = htmlTreeBuilder9.state();
        org.jsoup.nodes.FormElement formElement11 = null;
        htmlTreeBuilder9.setFormElement(formElement11);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder13 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document16 = xmlTreeBuilder13.parse("<![CDATA[hi!]]>", " ");
        htmlTreeBuilder9.maybeSetBaseUri((org.jsoup.nodes.Element) document16);
        htmlTreeBuilder0.maybeSetBaseUri((org.jsoup.nodes.Element) document16);
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder19 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState20 = htmlTreeBuilder19.state();
        org.jsoup.nodes.FormElement formElement21 = null;
        htmlTreeBuilder19.setFormElement(formElement21);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder23 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document26 = xmlTreeBuilder23.parse("", "hi!");
        org.jsoup.nodes.Document document29 = xmlTreeBuilder23.parse("<![CDATA[hi!]]>", "<!---->");
        boolean boolean30 = htmlTreeBuilder19.isSpecial((org.jsoup.nodes.Element) document29);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean31 = htmlTreeBuilder0.onStack((org.jsoup.nodes.Element) document29);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(htmlTreeBuilderState1);
        org.junit.Assert.assertNotNull(document7);
        org.junit.Assert.assertNull(htmlTreeBuilderState10);
        org.junit.Assert.assertNotNull(document16);
        org.junit.Assert.assertNull(htmlTreeBuilderState20);
        org.junit.Assert.assertNotNull(document26);
        org.junit.Assert.assertNotNull(document29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test0286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0286");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = null;
        htmlTreeBuilder0.transition(htmlTreeBuilderState1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = htmlTreeBuilder0.inButtonScope("<![CDATA[hi!]]>");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0287");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.finaliseTag();
        startTag0.tagName = "";
        org.jsoup.nodes.Attributes attributes4 = startTag0.attributes;
        org.jsoup.parser.Token.Doctype doctype5 = new org.jsoup.parser.Token.Doctype();
        boolean boolean6 = doctype5.isEOF();
        boolean boolean7 = doctype5.isCharacter();
        org.jsoup.parser.Token.TokenType tokenType8 = doctype5.type;
        startTag0.type = tokenType8;
        java.lang.String str10 = startTag0.normalName;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder12 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings13 = xmlTreeBuilder12.defaultSettings();
        org.jsoup.nodes.Attributes attributes14 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor15 = attributes14.iterator();
        org.jsoup.nodes.Attributes attributes18 = attributes14.put("", false);
        org.jsoup.nodes.Attributes attributes19 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor20 = attributes19.iterator();
        boolean boolean22 = attributes19.hasKey("hi!");
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator23 = attributes19.spliterator();
        attributes14.addAll(attributes19);
        org.jsoup.nodes.Attributes attributes25 = parseSettings13.normalizeAttributes(attributes14);
        org.jsoup.parser.Token.StartTag startTag26 = startTag0.nameAttr("StartTag", attributes14);
        startTag0.selfClosing = false;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Character character29 = startTag0.asCharacter();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$Character (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$Character are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(attributes4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + tokenType8 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType8.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(parseSettings13);
        org.junit.Assert.assertNotNull(attributeItor15);
        org.junit.Assert.assertNotNull(attributes18);
        org.junit.Assert.assertNotNull(attributeItor20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(attributeSpliterator23);
        org.junit.Assert.assertNotNull(attributes25);
        org.junit.Assert.assertNotNull(startTag26);
    }

    @Test
    public void test0288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0288");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = htmlTreeBuilder0.getHeadElement();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState2 = null;
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.error(htmlTreeBuilderState2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(element1);
    }

    @Test
    public void test0289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0289");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.state();
        org.jsoup.nodes.FormElement formElement2 = null;
        htmlTreeBuilder0.setFormElement(formElement2);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder4 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document7 = xmlTreeBuilder4.parse("<![CDATA[hi!]]>", " ");
        htmlTreeBuilder0.setHeadElement((org.jsoup.nodes.Element) document7);
        boolean boolean9 = htmlTreeBuilder0.isFragmentParsing();
        htmlTreeBuilder0.setFosterInserts(false);
        org.jsoup.nodes.Document document12 = htmlTreeBuilder0.getDocument();
        org.jsoup.nodes.FormElement formElement13 = null;
        htmlTreeBuilder0.setFormElement(formElement13);
        org.jsoup.parser.Token.Doctype doctype15 = new org.jsoup.parser.Token.Doctype();
        doctype15.pubSysKey = "hi!";
        org.jsoup.parser.Token token18 = doctype15.reset();
        doctype15.forceQuirks = true;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean21 = htmlTreeBuilder0.process((org.jsoup.parser.Token) doctype15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(htmlTreeBuilderState1);
        org.junit.Assert.assertNotNull(document7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(document12);
        org.junit.Assert.assertNotNull(token18);
    }

    @Test
    public void test0290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0290");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document3 = xmlTreeBuilder0.parse("", "hi!");
        org.jsoup.parser.Token.Comment comment4 = new org.jsoup.parser.Token.Comment();
        java.lang.StringBuilder stringBuilder5 = comment4.data;
        comment4.bogus = false;
        org.jsoup.parser.Token.Comment comment8 = comment4.asComment();
        boolean boolean9 = comment8.bogus;
        xmlTreeBuilder0.insert(comment8);
        java.io.Reader reader11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document13 = xmlTreeBuilder0.parse(reader11, "CData");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String input must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "");
        org.junit.Assert.assertNotNull(comment8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0291");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.state();
        org.jsoup.nodes.FormElement formElement2 = null;
        htmlTreeBuilder0.setFormElement(formElement2);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.state();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState5 = null;
        htmlTreeBuilder0.transition(htmlTreeBuilderState5);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = htmlTreeBuilder0.inListItemScope("<!---->");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(htmlTreeBuilderState1);
        org.junit.Assert.assertNull(htmlTreeBuilderState4);
    }

    @Test
    public void test0292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0292");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.state();
        htmlTreeBuilder0.setFosterInserts(true);
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder4 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState5 = htmlTreeBuilder4.state();
        org.jsoup.nodes.FormElement formElement6 = null;
        htmlTreeBuilder4.setFormElement(formElement6);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder8 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document11 = xmlTreeBuilder8.parse("<![CDATA[hi!]]>", " ");
        htmlTreeBuilder4.setHeadElement((org.jsoup.nodes.Element) document11);
        htmlTreeBuilder0.setHeadElement((org.jsoup.nodes.Element) document11);
        htmlTreeBuilder0.newPendingTableCharacters();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element15 = htmlTreeBuilder0.pop();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(htmlTreeBuilderState1);
        org.junit.Assert.assertNull(htmlTreeBuilderState5);
        org.junit.Assert.assertNotNull(document11);
    }

    @Test
    public void test0293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0293");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        java.lang.String str1 = endTag0.normalName;
        org.jsoup.parser.ParseSettings parseSettings2 = org.jsoup.parser.ParseSettings.htmlDefault;
        org.jsoup.nodes.Attributes attributes3 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor4 = attributes3.iterator();
        org.jsoup.nodes.Attributes attributes5 = parseSettings2.normalizeAttributes(attributes3);
        java.lang.String str6 = attributes5.toString();
        endTag0.attributes = attributes5;
        org.jsoup.parser.Token.StartTag startTag8 = new org.jsoup.parser.Token.StartTag();
        startTag8.finaliseTag();
        startTag8.appendAttributeName('#');
        char[] charArray12 = new char[] {};
        startTag8.appendAttributeValue(charArray12);
        endTag0.appendAttributeValue(charArray12);
        endTag0.appendTagName('#');
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(parseSettings2);
        org.junit.Assert.assertNotNull(attributeItor4);
        org.junit.Assert.assertNotNull(attributes5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertArrayEquals(charArray12, new char[] {});
    }

    @Test
    public void test0294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0294");
        org.jsoup.parser.ParseSettings parseSettings0 = org.jsoup.parser.ParseSettings.htmlDefault;
        org.jsoup.nodes.Attributes attributes1 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor2 = attributes1.iterator();
        org.jsoup.nodes.Attributes attributes3 = parseSettings0.normalizeAttributes(attributes1);
        attributes3.removeIgnoreCase("</<![cdata[null]]>>");
        org.jsoup.nodes.Attribute attribute6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Attributes attributes7 = attributes3.put(attribute6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings0);
        org.junit.Assert.assertNotNull(attributeItor2);
        org.junit.Assert.assertNotNull(attributes3);
    }

    @Test
    public void test0295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0295");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.state();
        org.jsoup.nodes.FormElement formElement2 = null;
        htmlTreeBuilder0.setFormElement(formElement2);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = null;
        htmlTreeBuilder0.transition(htmlTreeBuilderState4);
        java.lang.String[] strArray6 = org.jsoup.parser.HtmlTreeBuilder.TagSearchList;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = htmlTreeBuilder0.inScope(strArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(htmlTreeBuilderState1);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "ol", "ul" });
    }

    @Test
    public void test0296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0296");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings2 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder4 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState5 = htmlTreeBuilder4.state();
        htmlTreeBuilder4.setFosterInserts(true);
        boolean boolean8 = htmlTreeBuilder4.isFragmentParsing();
        org.jsoup.nodes.Element element9 = htmlTreeBuilder4.getHeadElement();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder10 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState11 = htmlTreeBuilder10.state();
        org.jsoup.nodes.FormElement formElement12 = null;
        htmlTreeBuilder10.setFormElement(formElement12);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder14 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document17 = xmlTreeBuilder14.parse("<![CDATA[hi!]]>", " ");
        htmlTreeBuilder10.setHeadElement((org.jsoup.nodes.Element) document17);
        boolean boolean19 = htmlTreeBuilder10.isFragmentParsing();
        htmlTreeBuilder10.setFosterInserts(false);
        org.jsoup.nodes.Element element22 = htmlTreeBuilder10.getHeadElement();
        htmlTreeBuilder4.maybeSetBaseUri(element22);
        org.jsoup.parser.Parser parser25 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.jsoup.nodes.Node> nodeList26 = xmlTreeBuilder0.parseFragment("", element22, " ", parser25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings1);
        org.junit.Assert.assertNotNull(parseSettings2);
        org.junit.Assert.assertNull(htmlTreeBuilderState5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(element9);
        org.junit.Assert.assertNull(htmlTreeBuilderState11);
        org.junit.Assert.assertNotNull(document17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(element22);
    }

    @Test
    public void test0297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0297");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        java.io.Reader reader1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document3 = xmlTreeBuilder0.parse(reader1, "CData");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String input must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0298");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = null;
        htmlTreeBuilder0.transition(htmlTreeBuilderState1);
        boolean boolean3 = htmlTreeBuilder0.framesetOk();
        java.lang.String str4 = htmlTreeBuilder0.getBaseUri();
        org.jsoup.nodes.Document document5 = htmlTreeBuilder0.getDocument();
        org.jsoup.nodes.Document document6 = htmlTreeBuilder0.getDocument();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = htmlTreeBuilder0.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(document5);
        org.junit.Assert.assertNull(document6);
    }

    @Test
    public void test0299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0299");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.state();
        org.jsoup.nodes.FormElement formElement2 = null;
        htmlTreeBuilder0.setFormElement(formElement2);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder4 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document7 = xmlTreeBuilder4.parse("<![CDATA[hi!]]>", " ");
        htmlTreeBuilder0.maybeSetBaseUri((org.jsoup.nodes.Element) document7);
        boolean boolean9 = htmlTreeBuilder0.isFosterInserts();
        java.lang.String[] strArray10 = org.jsoup.parser.HtmlTreeBuilder.TagSearchTableScope;
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.popStackToClose(strArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(htmlTreeBuilderState1);
        org.junit.Assert.assertNotNull(document7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] { "html", "table" });
    }

    @Test
    public void test0300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0300");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.state();
        htmlTreeBuilder0.setFosterInserts(true);
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder4 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState5 = htmlTreeBuilder4.state();
        org.jsoup.nodes.FormElement formElement6 = null;
        htmlTreeBuilder4.setFormElement(formElement6);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder8 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document11 = xmlTreeBuilder8.parse("<![CDATA[hi!]]>", " ");
        htmlTreeBuilder4.setHeadElement((org.jsoup.nodes.Element) document11);
        htmlTreeBuilder0.setHeadElement((org.jsoup.nodes.Element) document11);
        org.jsoup.parser.Token.Character character14 = new org.jsoup.parser.Token.Character();
        boolean boolean15 = character14.isCharacter();
        org.jsoup.parser.Token token16 = character14.reset();
        org.jsoup.parser.Token.Character character18 = character14.data("</<![CDATA[null]]>>");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean19 = htmlTreeBuilder0.process((org.jsoup.parser.Token) character14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(htmlTreeBuilderState1);
        org.junit.Assert.assertNull(htmlTreeBuilderState5);
        org.junit.Assert.assertNotNull(document11);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(token16);
        org.junit.Assert.assertNotNull(character18);
    }

    @Test
    public void test0301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0301");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.state();
        org.jsoup.nodes.FormElement formElement2 = null;
        htmlTreeBuilder0.setFormElement(formElement2);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = null;
        htmlTreeBuilder0.transition(htmlTreeBuilderState4);
        org.jsoup.nodes.FormElement formElement6 = htmlTreeBuilder0.getFormElement();
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.popStackToClose("</<![cdata[null]]>>");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(htmlTreeBuilderState1);
        org.junit.Assert.assertNull(formElement6);
    }

    @Test
    public void test0302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0302");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.state();
        org.jsoup.nodes.FormElement formElement2 = null;
        htmlTreeBuilder0.setFormElement(formElement2);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.state();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState5 = null;
        htmlTreeBuilder0.transition(htmlTreeBuilderState5);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder7 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document10 = xmlTreeBuilder7.parse("", "hi!");
        org.jsoup.nodes.Document document13 = xmlTreeBuilder7.parse("<![CDATA[hi!]]>", "<!---->");
        org.jsoup.parser.Token.Doctype doctype14 = new org.jsoup.parser.Token.Doctype();
        java.lang.StringBuilder stringBuilder15 = doctype14.publicIdentifier;
        doctype14.forceQuirks = true;
        xmlTreeBuilder7.insert(doctype14);
        org.jsoup.nodes.Document document21 = xmlTreeBuilder7.parse("<![CDATA[null]]>", "hi!");
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.push((org.jsoup.nodes.Element) document21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(htmlTreeBuilderState1);
        org.junit.Assert.assertNull(htmlTreeBuilderState4);
        org.junit.Assert.assertNotNull(document10);
        org.junit.Assert.assertNotNull(document13);
        org.junit.Assert.assertNotNull(stringBuilder15);
        org.junit.Assert.assertEquals(stringBuilder15.toString(), "");
        org.junit.Assert.assertNotNull(document21);
    }

    @Test
    public void test0303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0303");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList1 = htmlTreeBuilder0.getStack();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList2 = htmlTreeBuilder0.getStack();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder3 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder3.state();
        org.jsoup.nodes.FormElement formElement5 = null;
        htmlTreeBuilder3.setFormElement(formElement5);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder7 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document10 = xmlTreeBuilder7.parse("", "hi!");
        org.jsoup.nodes.Document document13 = xmlTreeBuilder7.parse("<![CDATA[hi!]]>", "<!---->");
        boolean boolean14 = htmlTreeBuilder3.isSpecial((org.jsoup.nodes.Element) document13);
        boolean boolean15 = htmlTreeBuilder0.isSpecial((org.jsoup.nodes.Element) document13);
        htmlTreeBuilder0.newPendingTableCharacters();
        java.util.List<java.lang.String> strList17 = htmlTreeBuilder0.getPendingTableCharacters();
        org.jsoup.parser.Token.Comment comment18 = new org.jsoup.parser.Token.Comment();
        java.lang.StringBuilder stringBuilder19 = comment18.data;
        comment18.bogus = false;
        comment18.bogus = true;
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.insert(comment18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(elementList1);
        org.junit.Assert.assertNull(elementList2);
        org.junit.Assert.assertNull(htmlTreeBuilderState4);
        org.junit.Assert.assertNotNull(document10);
        org.junit.Assert.assertNotNull(document13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(strList17);
        org.junit.Assert.assertNotNull(stringBuilder19);
        org.junit.Assert.assertEquals(stringBuilder19.toString(), "");
    }

    @Test
    public void test0304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0304");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.appendAttributeValue("");
        org.jsoup.parser.Token.TokenType tokenType3 = org.jsoup.parser.Token.TokenType.Doctype;
        startTag0.type = tokenType3;
        boolean boolean5 = startTag0.isSelfClosing();
        boolean boolean6 = startTag0.isEndTag();
        org.jsoup.parser.Token.Tag tag7 = startTag0.reset();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Doctype doctype8 = startTag0.asDoctype();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$Doctype (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$Doctype are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + tokenType3 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType3.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(tag7);
    }

    @Test
    public void test0305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0305");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.state();
        org.jsoup.nodes.FormElement formElement2 = null;
        htmlTreeBuilder0.setFormElement(formElement2);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder4 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document7 = xmlTreeBuilder4.parse("<![CDATA[hi!]]>", " ");
        htmlTreeBuilder0.setHeadElement((org.jsoup.nodes.Element) document7);
        java.io.Reader reader9 = null;
        org.jsoup.parser.Parser parser11 = null;
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.initialiseParse(reader9, "<![CDATA[StartTag]]>", parser11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String input must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(htmlTreeBuilderState1);
        org.junit.Assert.assertNotNull(document7);
    }

    @Test
    public void test0306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0306");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = null;
        htmlTreeBuilder0.transition(htmlTreeBuilderState1);
        boolean boolean3 = htmlTreeBuilder0.framesetOk();
        java.lang.String str4 = htmlTreeBuilder0.getBaseUri();
        java.lang.String str5 = htmlTreeBuilder0.getBaseUri();
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.clearStackToTableBodyContext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test0307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0307");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.state();
        htmlTreeBuilder0.setFosterInserts(true);
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder4 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState5 = htmlTreeBuilder4.state();
        org.jsoup.nodes.FormElement formElement6 = null;
        htmlTreeBuilder4.setFormElement(formElement6);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder8 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document11 = xmlTreeBuilder8.parse("<![CDATA[hi!]]>", " ");
        htmlTreeBuilder4.setHeadElement((org.jsoup.nodes.Element) document11);
        htmlTreeBuilder0.setHeadElement((org.jsoup.nodes.Element) document11);
        org.jsoup.nodes.FormElement formElement14 = null;
        htmlTreeBuilder0.setFormElement(formElement14);
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.clearStackToTableRowContext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(htmlTreeBuilderState1);
        org.junit.Assert.assertNull(htmlTreeBuilderState5);
        org.junit.Assert.assertNotNull(document11);
    }

    @Test
    public void test0308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0308");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.state();
        org.jsoup.nodes.FormElement formElement2 = null;
        htmlTreeBuilder0.setFormElement(formElement2);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder4 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document7 = xmlTreeBuilder4.parse("<![CDATA[hi!]]>", " ");
        htmlTreeBuilder0.setHeadElement((org.jsoup.nodes.Element) document7);
        boolean boolean9 = htmlTreeBuilder0.isFragmentParsing();
        htmlTreeBuilder0.setFosterInserts(false);
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder12 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState13 = htmlTreeBuilder12.state();
        org.jsoup.nodes.FormElement formElement14 = null;
        htmlTreeBuilder12.setFormElement(formElement14);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder16 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document19 = xmlTreeBuilder16.parse("<![CDATA[hi!]]>", " ");
        htmlTreeBuilder12.setHeadElement((org.jsoup.nodes.Element) document19);
        org.jsoup.nodes.Element element21 = htmlTreeBuilder12.getHeadElement();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean22 = htmlTreeBuilder0.removeFromStack(element21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(htmlTreeBuilderState1);
        org.junit.Assert.assertNotNull(document7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(htmlTreeBuilderState13);
        org.junit.Assert.assertNotNull(document19);
        org.junit.Assert.assertNotNull(element21);
    }

    @Test
    public void test0309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0309");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.state();
        org.jsoup.nodes.FormElement formElement2 = null;
        htmlTreeBuilder0.setFormElement(formElement2);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = null;
        htmlTreeBuilder0.transition(htmlTreeBuilderState4);
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.generateImpliedEndTags(" ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(htmlTreeBuilderState1);
    }

    @Test
    public void test0310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0310");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.state();
        org.jsoup.nodes.FormElement formElement2 = null;
        htmlTreeBuilder0.setFormElement(formElement2);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder4 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document7 = xmlTreeBuilder4.parse("<![CDATA[hi!]]>", " ");
        htmlTreeBuilder0.setHeadElement((org.jsoup.nodes.Element) document7);
        boolean boolean9 = htmlTreeBuilder0.isFragmentParsing();
        htmlTreeBuilder0.setFosterInserts(false);
        org.jsoup.nodes.Document document12 = htmlTreeBuilder0.getDocument();
        org.jsoup.nodes.FormElement formElement13 = null;
        htmlTreeBuilder0.setFormElement(formElement13);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder15 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document18 = xmlTreeBuilder15.parse("", "hi!");
        org.jsoup.nodes.Document document21 = xmlTreeBuilder15.parse("<![CDATA[hi!]]>", "<!---->");
        org.jsoup.parser.Token.Doctype doctype22 = new org.jsoup.parser.Token.Doctype();
        java.lang.StringBuilder stringBuilder23 = doctype22.publicIdentifier;
        doctype22.forceQuirks = true;
        xmlTreeBuilder15.insert(doctype22);
        org.jsoup.nodes.Document document29 = xmlTreeBuilder15.parse("<![CDATA[null]]>", "hi!");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean30 = htmlTreeBuilder0.removeFromStack((org.jsoup.nodes.Element) document29);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(htmlTreeBuilderState1);
        org.junit.Assert.assertNotNull(document7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(document12);
        org.junit.Assert.assertNotNull(document18);
        org.junit.Assert.assertNotNull(document21);
        org.junit.Assert.assertNotNull(stringBuilder23);
        org.junit.Assert.assertEquals(stringBuilder23.toString(), "");
        org.junit.Assert.assertNotNull(document29);
    }

    @Test
    public void test0311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0311");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.finaliseTag();
        startTag0.appendAttributeValue(' ');
        java.lang.String str4 = startTag0.tokenType();
        org.jsoup.nodes.Attributes attributes5 = startTag0.attributes;
        org.jsoup.parser.ParseSettings parseSettings6 = org.jsoup.parser.ParseSettings.htmlDefault;
        org.jsoup.nodes.Attributes attributes7 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor8 = attributes7.iterator();
        org.jsoup.nodes.Attributes attributes9 = parseSettings6.normalizeAttributes(attributes7);
        org.jsoup.nodes.Attributes attributes10 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor11 = attributes10.iterator();
        org.jsoup.nodes.Attributes attributes14 = attributes10.put("", false);
        org.jsoup.nodes.Attributes attributes15 = parseSettings6.normalizeAttributes(attributes14);
        startTag0.attributes = attributes14;
        org.jsoup.nodes.Attributes attributes19 = attributes14.put("</<![CDATA[null]]>>", "hi!");
        boolean boolean21 = attributes14.hasKeyIgnoreCase("<!---->");
        org.jsoup.nodes.Attribute attribute22 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Attributes attributes23 = attributes14.put(attribute22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "StartTag" + "'", str4, "StartTag");
        org.junit.Assert.assertNotNull(attributes5);
        org.junit.Assert.assertNotNull(parseSettings6);
        org.junit.Assert.assertNotNull(attributeItor8);
        org.junit.Assert.assertNotNull(attributes9);
        org.junit.Assert.assertNotNull(attributeItor11);
        org.junit.Assert.assertNotNull(attributes14);
        org.junit.Assert.assertNotNull(attributes15);
        org.junit.Assert.assertNotNull(attributes19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test0312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0312");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = null;
        htmlTreeBuilder0.transition(htmlTreeBuilderState1);
        boolean boolean3 = htmlTreeBuilder0.framesetOk();
        java.lang.String str4 = htmlTreeBuilder0.getBaseUri();
        org.jsoup.nodes.Document document5 = htmlTreeBuilder0.getDocument();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder6 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState7 = htmlTreeBuilder6.state();
        org.jsoup.nodes.FormElement formElement8 = null;
        htmlTreeBuilder6.setFormElement(formElement8);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder10 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document13 = xmlTreeBuilder10.parse("", "hi!");
        org.jsoup.nodes.Document document16 = xmlTreeBuilder10.parse("<![CDATA[hi!]]>", "<!---->");
        boolean boolean17 = htmlTreeBuilder6.isSpecial((org.jsoup.nodes.Element) document16);
        boolean boolean18 = htmlTreeBuilder6.framesetOk();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder19 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState20 = htmlTreeBuilder19.state();
        org.jsoup.nodes.FormElement formElement21 = null;
        htmlTreeBuilder19.setFormElement(formElement21);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder23 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document26 = xmlTreeBuilder23.parse("<![CDATA[hi!]]>", " ");
        htmlTreeBuilder19.maybeSetBaseUri((org.jsoup.nodes.Element) document26);
        htmlTreeBuilder6.maybeSetBaseUri((org.jsoup.nodes.Element) document26);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean29 = htmlTreeBuilder0.removeFromStack((org.jsoup.nodes.Element) document26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(document5);
        org.junit.Assert.assertNull(htmlTreeBuilderState7);
        org.junit.Assert.assertNotNull(document13);
        org.junit.Assert.assertNotNull(document16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(htmlTreeBuilderState20);
        org.junit.Assert.assertNotNull(document26);
    }

    @Test
    public void test0313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0313");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.state();
        org.jsoup.nodes.FormElement formElement2 = null;
        htmlTreeBuilder0.setFormElement(formElement2);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder4 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document7 = xmlTreeBuilder4.parse("<![CDATA[hi!]]>", " ");
        htmlTreeBuilder0.maybeSetBaseUri((org.jsoup.nodes.Element) document7);
        boolean boolean9 = htmlTreeBuilder0.isFosterInserts();
        org.jsoup.parser.ParseSettings parseSettings10 = htmlTreeBuilder0.defaultSettings();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element12 = htmlTreeBuilder0.insertStartTag("StartTag");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(htmlTreeBuilderState1);
        org.junit.Assert.assertNotNull(document7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(parseSettings10);
    }

    @Test
    public void test0314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0314");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.state();
        org.jsoup.nodes.FormElement formElement2 = null;
        htmlTreeBuilder0.setFormElement(formElement2);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder4 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document7 = xmlTreeBuilder4.parse("", "hi!");
        org.jsoup.nodes.Document document10 = xmlTreeBuilder4.parse("<![CDATA[hi!]]>", "<!---->");
        boolean boolean11 = htmlTreeBuilder0.isSpecial((org.jsoup.nodes.Element) document10);
        boolean boolean12 = htmlTreeBuilder0.framesetOk();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder13 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState14 = htmlTreeBuilder13.state();
        org.jsoup.nodes.FormElement formElement15 = null;
        htmlTreeBuilder13.setFormElement(formElement15);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder17 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document20 = xmlTreeBuilder17.parse("<![CDATA[hi!]]>", " ");
        htmlTreeBuilder13.maybeSetBaseUri((org.jsoup.nodes.Element) document20);
        htmlTreeBuilder0.maybeSetBaseUri((org.jsoup.nodes.Element) document20);
        org.jsoup.nodes.Element element23 = null;
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder24 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings25 = htmlTreeBuilder24.defaultSettings();
        htmlTreeBuilder24.setFosterInserts(true);
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder28 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState29 = htmlTreeBuilder28.state();
        org.jsoup.nodes.FormElement formElement30 = null;
        htmlTreeBuilder28.setFormElement(formElement30);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder32 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document35 = xmlTreeBuilder32.parse("<![CDATA[hi!]]>", " ");
        htmlTreeBuilder28.setHeadElement((org.jsoup.nodes.Element) document35);
        htmlTreeBuilder24.setHeadElement((org.jsoup.nodes.Element) document35);
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.replaceActiveFormattingElement(element23, (org.jsoup.nodes.Element) document35);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(htmlTreeBuilderState1);
        org.junit.Assert.assertNotNull(document7);
        org.junit.Assert.assertNotNull(document10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(htmlTreeBuilderState14);
        org.junit.Assert.assertNotNull(document20);
        org.junit.Assert.assertNotNull(parseSettings25);
        org.junit.Assert.assertNull(htmlTreeBuilderState29);
        org.junit.Assert.assertNotNull(document35);
    }

    @Test
    public void test0315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0315");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.state();
        org.jsoup.nodes.FormElement formElement2 = null;
        htmlTreeBuilder0.setFormElement(formElement2);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder4 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document7 = xmlTreeBuilder4.parse("<![CDATA[hi!]]>", " ");
        htmlTreeBuilder0.setHeadElement((org.jsoup.nodes.Element) document7);
        boolean boolean9 = htmlTreeBuilder0.isFragmentParsing();
        boolean boolean10 = htmlTreeBuilder0.framesetOk();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState11 = null;
        htmlTreeBuilder0.transition(htmlTreeBuilderState11);
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.reconstructFormattingElements();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(htmlTreeBuilderState1);
        org.junit.Assert.assertNotNull(document7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0316");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.state();
        org.jsoup.nodes.FormElement formElement2 = null;
        htmlTreeBuilder0.setFormElement(formElement2);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder4 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document7 = xmlTreeBuilder4.parse("<![CDATA[hi!]]>", " ");
        htmlTreeBuilder0.setHeadElement((org.jsoup.nodes.Element) document7);
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder9 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState10 = htmlTreeBuilder9.state();
        org.jsoup.nodes.FormElement formElement11 = null;
        htmlTreeBuilder9.setFormElement(formElement11);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder13 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document16 = xmlTreeBuilder13.parse("<![CDATA[hi!]]>", " ");
        htmlTreeBuilder9.maybeSetBaseUri((org.jsoup.nodes.Element) document16);
        htmlTreeBuilder0.maybeSetBaseUri((org.jsoup.nodes.Element) document16);
        org.jsoup.parser.Token.StartTag startTag19 = new org.jsoup.parser.Token.StartTag();
        startTag19.finaliseTag();
        org.jsoup.parser.ParseSettings parseSettings22 = org.jsoup.parser.ParseSettings.htmlDefault;
        org.jsoup.nodes.Attributes attributes23 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor24 = attributes23.iterator();
        org.jsoup.nodes.Attributes attributes25 = parseSettings22.normalizeAttributes(attributes23);
        java.util.Map<java.lang.String, java.lang.String> strMap26 = attributes23.dataset();
        org.jsoup.parser.Token.StartTag startTag27 = startTag19.nameAttr("hi!", attributes23);
        boolean boolean28 = startTag27.isComment();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.FormElement formElement30 = htmlTreeBuilder0.insertForm(startTag27, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(htmlTreeBuilderState1);
        org.junit.Assert.assertNotNull(document7);
        org.junit.Assert.assertNull(htmlTreeBuilderState10);
        org.junit.Assert.assertNotNull(document16);
        org.junit.Assert.assertNotNull(parseSettings22);
        org.junit.Assert.assertNotNull(attributeItor24);
        org.junit.Assert.assertNotNull(attributes25);
        org.junit.Assert.assertNotNull(strMap26);
        org.junit.Assert.assertNotNull(startTag27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test0317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0317");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document3 = xmlTreeBuilder0.parse("<![CDATA[hi!]]>", " ");
        org.jsoup.parser.Token.Comment comment4 = new org.jsoup.parser.Token.Comment();
        org.jsoup.parser.Token token5 = comment4.reset();
        boolean boolean6 = comment4.bogus;
        xmlTreeBuilder0.insert(comment4);
        org.jsoup.parser.ParseSettings parseSettings8 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder10 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document13 = xmlTreeBuilder10.parse("<![CDATA[hi!]]>", " ");
        org.jsoup.parser.Parser parser15 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.jsoup.nodes.Node> nodeList16 = xmlTreeBuilder0.parseFragment("<<![CDATA[null]]>>", (org.jsoup.nodes.Element) document13, "<starttag>", parser15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(token5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(parseSettings8);
        org.junit.Assert.assertNotNull(document13);
    }

    @Test
    public void test0318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0318");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.state();
        org.jsoup.nodes.FormElement formElement2 = null;
        htmlTreeBuilder0.setFormElement(formElement2);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = null;
        htmlTreeBuilder0.transition(htmlTreeBuilderState4);
        boolean boolean6 = htmlTreeBuilder0.isFosterInserts();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder7 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState8 = htmlTreeBuilder7.state();
        org.jsoup.nodes.FormElement formElement9 = null;
        htmlTreeBuilder7.setFormElement(formElement9);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder11 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document14 = xmlTreeBuilder11.parse("<![CDATA[hi!]]>", " ");
        htmlTreeBuilder7.maybeSetBaseUri((org.jsoup.nodes.Element) document14);
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.insert((org.jsoup.nodes.Element) document14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(htmlTreeBuilderState1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(htmlTreeBuilderState8);
        org.junit.Assert.assertNotNull(document14);
    }

    @Test
    public void test0319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0319");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList1 = htmlTreeBuilder0.getStack();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList2 = htmlTreeBuilder0.getStack();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder3 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder3.state();
        org.jsoup.nodes.FormElement formElement5 = null;
        htmlTreeBuilder3.setFormElement(formElement5);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder7 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document10 = xmlTreeBuilder7.parse("", "hi!");
        org.jsoup.nodes.Document document13 = xmlTreeBuilder7.parse("<![CDATA[hi!]]>", "<!---->");
        boolean boolean14 = htmlTreeBuilder3.isSpecial((org.jsoup.nodes.Element) document13);
        boolean boolean15 = htmlTreeBuilder0.isSpecial((org.jsoup.nodes.Element) document13);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder16 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document19 = xmlTreeBuilder16.parse("", "hi!");
        org.jsoup.nodes.Document document22 = xmlTreeBuilder16.parse("<![CDATA[hi!]]>", "<!---->");
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.pushActiveFormattingElements((org.jsoup.nodes.Element) document22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(elementList1);
        org.junit.Assert.assertNull(elementList2);
        org.junit.Assert.assertNull(htmlTreeBuilderState4);
        org.junit.Assert.assertNotNull(document10);
        org.junit.Assert.assertNotNull(document13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(document19);
        org.junit.Assert.assertNotNull(document22);
    }

    @Test
    public void test0320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0320");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.state();
        org.jsoup.nodes.FormElement formElement2 = null;
        htmlTreeBuilder0.setFormElement(formElement2);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = null;
        htmlTreeBuilder0.transition(htmlTreeBuilderState4);
        boolean boolean6 = htmlTreeBuilder0.isFosterInserts();
        org.jsoup.nodes.FormElement formElement7 = htmlTreeBuilder0.getFormElement();
        htmlTreeBuilder0.generateImpliedEndTags();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder9 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState10 = htmlTreeBuilder9.state();
        org.jsoup.nodes.FormElement formElement11 = null;
        htmlTreeBuilder9.setFormElement(formElement11);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder13 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document16 = xmlTreeBuilder13.parse("<![CDATA[hi!]]>", " ");
        htmlTreeBuilder9.setHeadElement((org.jsoup.nodes.Element) document16);
        boolean boolean18 = htmlTreeBuilder9.isFragmentParsing();
        htmlTreeBuilder9.setFosterInserts(false);
        org.jsoup.nodes.Element element21 = htmlTreeBuilder9.getHeadElement();
        htmlTreeBuilder0.setHeadElement(element21);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element23 = htmlTreeBuilder0.pop();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(htmlTreeBuilderState1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(formElement7);
        org.junit.Assert.assertNull(htmlTreeBuilderState10);
        org.junit.Assert.assertNotNull(document16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(element21);
    }

    @Test
    public void test0321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0321");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "hi!";
        org.jsoup.parser.Token token3 = doctype0.reset();
        boolean boolean4 = doctype0.isForceQuirks();
        org.jsoup.parser.Token.Doctype doctype5 = doctype0.asDoctype();
        java.lang.StringBuilder stringBuilder6 = doctype0.name;
        org.junit.Assert.assertNotNull(token3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(doctype5);
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "");
    }

    @Test
    public void test0322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0322");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.state();
        java.io.Reader reader2 = null;
        org.jsoup.parser.Parser parser4 = null;
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.initialiseParse(reader2, "<!---->", parser4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String input must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(htmlTreeBuilderState1);
    }

    @Test
    public void test0323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0323");
        org.jsoup.parser.ParseSettings parseSettings0 = org.jsoup.parser.ParseSettings.htmlDefault;
        org.jsoup.nodes.Attributes attributes1 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor2 = attributes1.iterator();
        org.jsoup.nodes.Attributes attributes3 = parseSettings0.normalizeAttributes(attributes1);
        attributes1.remove("hi!");
        boolean boolean7 = attributes1.hasKeyIgnoreCase("");
        org.jsoup.nodes.Attributes attributes8 = attributes1.clone();
        java.lang.String str9 = attributes8.toString();
        java.lang.Class<?> wildcardClass10 = attributes8.getClass();
        org.junit.Assert.assertNotNull(parseSettings0);
        org.junit.Assert.assertNotNull(attributeItor2);
        org.junit.Assert.assertNotNull(attributes3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(attributes8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0324");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.state();
        org.jsoup.nodes.FormElement formElement2 = null;
        htmlTreeBuilder0.setFormElement(formElement2);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = null;
        htmlTreeBuilder0.transition(htmlTreeBuilderState4);
        boolean boolean6 = htmlTreeBuilder0.isFosterInserts();
        org.jsoup.nodes.FormElement formElement7 = htmlTreeBuilder0.getFormElement();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder9 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState10 = htmlTreeBuilder9.state();
        org.jsoup.nodes.FormElement formElement11 = null;
        htmlTreeBuilder9.setFormElement(formElement11);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder13 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document16 = xmlTreeBuilder13.parse("<![CDATA[hi!]]>", " ");
        htmlTreeBuilder9.setHeadElement((org.jsoup.nodes.Element) document16);
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder18 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState19 = htmlTreeBuilder18.state();
        org.jsoup.nodes.FormElement formElement20 = null;
        htmlTreeBuilder18.setFormElement(formElement20);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState22 = null;
        htmlTreeBuilder18.transition(htmlTreeBuilderState22);
        boolean boolean24 = htmlTreeBuilder18.isFosterInserts();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState25 = htmlTreeBuilder18.state();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder26 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document29 = xmlTreeBuilder26.parse("", "hi!");
        org.jsoup.nodes.Document document32 = xmlTreeBuilder26.parse("<![CDATA[hi!]]>", "<!---->");
        htmlTreeBuilder18.setHeadElement((org.jsoup.nodes.Element) document32);
        boolean boolean34 = htmlTreeBuilder9.isSpecial((org.jsoup.nodes.Element) document32);
        org.jsoup.parser.Parser parser36 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.jsoup.nodes.Node> nodeList37 = htmlTreeBuilder0.parseFragment("", (org.jsoup.nodes.Element) document32, "CData", parser36);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(htmlTreeBuilderState1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(formElement7);
        org.junit.Assert.assertNull(htmlTreeBuilderState10);
        org.junit.Assert.assertNotNull(document16);
        org.junit.Assert.assertNull(htmlTreeBuilderState19);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(htmlTreeBuilderState25);
        org.junit.Assert.assertNotNull(document29);
        org.junit.Assert.assertNotNull(document32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test0325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0325");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.finaliseTag();
        java.lang.String str2 = startTag0.normalName();
        java.lang.String str3 = startTag0.tokenType();
        startTag0.appendTagName("");
        org.jsoup.parser.Token.Tag tag7 = startTag0.name("<!---->");
        tag7.finaliseTag();
        boolean boolean9 = tag7.isComment();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "StartTag" + "'", str3, "StartTag");
        org.junit.Assert.assertNotNull(tag7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0326");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = null;
        htmlTreeBuilder0.transition(htmlTreeBuilderState1);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element3 = htmlTreeBuilder0.lastFormattingElement();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0327");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.state();
        org.jsoup.nodes.FormElement formElement2 = null;
        htmlTreeBuilder0.setFormElement(formElement2);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = null;
        htmlTreeBuilder0.transition(htmlTreeBuilderState4);
        boolean boolean6 = htmlTreeBuilder0.isFosterInserts();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder7 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState8 = htmlTreeBuilder7.state();
        org.jsoup.nodes.FormElement formElement9 = null;
        htmlTreeBuilder7.setFormElement(formElement9);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder11 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document14 = xmlTreeBuilder11.parse("<![CDATA[hi!]]>", " ");
        htmlTreeBuilder7.setHeadElement((org.jsoup.nodes.Element) document14);
        boolean boolean16 = htmlTreeBuilder7.isFragmentParsing();
        htmlTreeBuilder7.setFosterInserts(false);
        org.jsoup.nodes.Element element19 = htmlTreeBuilder7.getHeadElement();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean20 = htmlTreeBuilder0.removeFromStack(element19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(htmlTreeBuilderState1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(htmlTreeBuilderState8);
        org.junit.Assert.assertNotNull(document14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(element19);
    }

    @Test
    public void test0328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0328");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.state();
        org.jsoup.nodes.FormElement formElement2 = null;
        htmlTreeBuilder0.setFormElement(formElement2);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = null;
        htmlTreeBuilder0.transition(htmlTreeBuilderState4);
        boolean boolean6 = htmlTreeBuilder0.isFosterInserts();
        org.jsoup.nodes.FormElement formElement7 = htmlTreeBuilder0.getFormElement();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder8 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState9 = htmlTreeBuilder8.state();
        org.jsoup.nodes.FormElement formElement10 = null;
        htmlTreeBuilder8.setFormElement(formElement10);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder12 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document15 = xmlTreeBuilder12.parse("<![CDATA[hi!]]>", " ");
        htmlTreeBuilder8.setHeadElement((org.jsoup.nodes.Element) document15);
        boolean boolean17 = htmlTreeBuilder8.isFragmentParsing();
        htmlTreeBuilder8.setFosterInserts(false);
        org.jsoup.nodes.Element element20 = htmlTreeBuilder8.getHeadElement();
        htmlTreeBuilder0.maybeSetBaseUri(element20);
        org.jsoup.parser.Token.EndTag endTag22 = new org.jsoup.parser.Token.EndTag();
        org.jsoup.parser.Token.Tag tag24 = endTag22.name("<![CDATA[null]]>");
        java.lang.String str25 = endTag22.toString();
        boolean boolean26 = endTag22.isComment();
        java.lang.String str27 = endTag22.normalName;
        org.jsoup.parser.Token.Tag tag28 = endTag22.reset();
        org.jsoup.parser.Token.Tag tag29 = tag28.reset();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState30 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean31 = htmlTreeBuilder0.process((org.jsoup.parser.Token) tag28, htmlTreeBuilderState30);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(htmlTreeBuilderState1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(formElement7);
        org.junit.Assert.assertNull(htmlTreeBuilderState9);
        org.junit.Assert.assertNotNull(document15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertNotNull(tag24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "</<![CDATA[null]]>>" + "'", str25, "</<![CDATA[null]]>>");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "<![cdata[null]]>" + "'", str27, "<![cdata[null]]>");
        org.junit.Assert.assertNotNull(tag28);
        org.junit.Assert.assertNotNull(tag29);
    }

    @Test
    public void test0329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0329");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.state();
        org.jsoup.nodes.FormElement formElement2 = null;
        htmlTreeBuilder0.setFormElement(formElement2);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = null;
        htmlTreeBuilder0.transition(htmlTreeBuilderState4);
        boolean boolean6 = htmlTreeBuilder0.isFosterInserts();
        org.jsoup.nodes.FormElement formElement7 = htmlTreeBuilder0.getFormElement();
        htmlTreeBuilder0.generateImpliedEndTags();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder10 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState11 = htmlTreeBuilder10.state();
        org.jsoup.nodes.FormElement formElement12 = null;
        htmlTreeBuilder10.setFormElement(formElement12);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder14 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document17 = xmlTreeBuilder14.parse("<![CDATA[hi!]]>", " ");
        htmlTreeBuilder10.maybeSetBaseUri((org.jsoup.nodes.Element) document17);
        org.jsoup.parser.Parser parser20 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.jsoup.nodes.Node> nodeList21 = htmlTreeBuilder0.parseFragment(" ", (org.jsoup.nodes.Element) document17, "", parser20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(htmlTreeBuilderState1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(formElement7);
        org.junit.Assert.assertNull(htmlTreeBuilderState11);
        org.junit.Assert.assertNotNull(document17);
    }

    @Test
    public void test0330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0330");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.state();
        org.jsoup.nodes.FormElement formElement2 = null;
        htmlTreeBuilder0.setFormElement(formElement2);
        boolean boolean4 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.parser.Token.StartTag startTag5 = new org.jsoup.parser.Token.StartTag();
        startTag5.appendAttributeName(' ');
        startTag5.normalName = "<![CDATA[null]]>";
        org.jsoup.parser.Token.Tag tag11 = startTag5.name("");
        org.jsoup.nodes.Attributes attributes12 = tag11.getAttributes();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = htmlTreeBuilder0.process((org.jsoup.parser.Token) tag11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(htmlTreeBuilderState1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(tag11);
        org.junit.Assert.assertNotNull(attributes12);
    }

    @Test
    public void test0331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0331");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document3 = xmlTreeBuilder0.parse("", "hi!");
        org.jsoup.nodes.Document document6 = xmlTreeBuilder0.parse("<![CDATA[hi!]]>", "<!---->");
        org.jsoup.parser.Token.Doctype doctype7 = new org.jsoup.parser.Token.Doctype();
        java.lang.StringBuilder stringBuilder8 = doctype7.publicIdentifier;
        doctype7.forceQuirks = true;
        xmlTreeBuilder0.insert(doctype7);
        java.lang.StringBuilder stringBuilder12 = doctype7.name;
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(document6);
        org.junit.Assert.assertNotNull(stringBuilder8);
        org.junit.Assert.assertEquals(stringBuilder8.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder12);
        org.junit.Assert.assertEquals(stringBuilder12.toString(), "");
    }

    @Test
    public void test0332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0332");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.state();
        org.jsoup.nodes.FormElement formElement2 = null;
        htmlTreeBuilder0.setFormElement(formElement2);
        org.jsoup.parser.ParseSettings parseSettings4 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.Token.Comment comment5 = new org.jsoup.parser.Token.Comment();
        org.jsoup.parser.Token token6 = comment5.reset();
        boolean boolean7 = comment5.bogus;
        comment5.bogus = false;
        java.lang.String str10 = comment5.toString();
        org.jsoup.parser.Token token11 = comment5.reset();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = htmlTreeBuilder0.process((org.jsoup.parser.Token) comment5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(htmlTreeBuilderState1);
        org.junit.Assert.assertNotNull(parseSettings4);
        org.junit.Assert.assertNotNull(token6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "<!---->" + "'", str10, "<!---->");
        org.junit.Assert.assertNotNull(token11);
    }

    @Test
    public void test0333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0333");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.appendAttributeName("</<![cdata[null]]>>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.EndTag endTag3 = startTag0.asEndTag();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$EndTag (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$EndTag are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0334");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.state();
        org.jsoup.nodes.FormElement formElement2 = null;
        htmlTreeBuilder0.setFormElement(formElement2);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.state();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState5 = null;
        htmlTreeBuilder0.transition(htmlTreeBuilderState5);
        org.jsoup.parser.Token.StartTag startTag7 = new org.jsoup.parser.Token.StartTag();
        startTag7.finaliseTag();
        startTag7.appendAttributeValue(' ');
        org.jsoup.nodes.Attributes attributes12 = null;
        org.jsoup.parser.Token.StartTag startTag13 = startTag7.nameAttr("hi!", attributes12);
        java.lang.String str14 = startTag13.normalName();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.FormElement formElement16 = htmlTreeBuilder0.insertForm(startTag13, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(htmlTreeBuilderState1);
        org.junit.Assert.assertNull(htmlTreeBuilderState4);
        org.junit.Assert.assertNotNull(startTag13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test0335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0335");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        org.jsoup.parser.Token.Tag tag2 = endTag0.name("<![CDATA[null]]>");
        boolean boolean3 = endTag0.isSelfClosing();
        java.lang.String str4 = endTag0.toString();
        boolean boolean5 = endTag0.isComment();
        boolean boolean6 = endTag0.isStartTag();
        org.junit.Assert.assertNotNull(tag2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "</<![CDATA[null]]>>" + "'", str4, "</<![CDATA[null]]>>");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0336");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.state();
        org.jsoup.nodes.FormElement formElement2 = null;
        htmlTreeBuilder0.setFormElement(formElement2);
        boolean boolean4 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder6 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document9 = xmlTreeBuilder6.parse("", "hi!");
        org.jsoup.nodes.Document document12 = xmlTreeBuilder6.parse("<![CDATA[hi!]]>", "<!---->");
        org.jsoup.parser.Token.Doctype doctype13 = new org.jsoup.parser.Token.Doctype();
        java.lang.StringBuilder stringBuilder14 = doctype13.publicIdentifier;
        doctype13.forceQuirks = true;
        xmlTreeBuilder6.insert(doctype13);
        org.jsoup.nodes.Document document20 = xmlTreeBuilder6.parse("<![CDATA[null]]>", "hi!");
        org.jsoup.parser.Parser parser22 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.jsoup.nodes.Node> nodeList23 = htmlTreeBuilder0.parseFragment("CData", (org.jsoup.nodes.Element) document20, "<![cdata[null]]>", parser22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(htmlTreeBuilderState1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(document9);
        org.junit.Assert.assertNotNull(document12);
        org.junit.Assert.assertNotNull(stringBuilder14);
        org.junit.Assert.assertEquals(stringBuilder14.toString(), "");
        org.junit.Assert.assertNotNull(document20);
    }

    @Test
    public void test0337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0337");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.state();
        org.jsoup.nodes.FormElement formElement2 = null;
        htmlTreeBuilder0.setFormElement(formElement2);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder4 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document7 = xmlTreeBuilder4.parse("<![CDATA[hi!]]>", " ");
        htmlTreeBuilder0.setHeadElement((org.jsoup.nodes.Element) document7);
        boolean boolean9 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.nodes.FormElement formElement10 = htmlTreeBuilder0.getFormElement();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState11 = null;
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.error(htmlTreeBuilderState11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(htmlTreeBuilderState1);
        org.junit.Assert.assertNotNull(document7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(formElement10);
    }

    @Test
    public void test0338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0338");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        boolean boolean1 = doctype0.isForceQuirks();
        java.lang.String str2 = doctype0.pubSysKey;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test0339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0339");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = null;
        htmlTreeBuilder0.transition(htmlTreeBuilderState1);
        boolean boolean3 = htmlTreeBuilder0.framesetOk();
        java.lang.String str4 = htmlTreeBuilder0.getBaseUri();
        htmlTreeBuilder0.generateImpliedEndTags();
        org.jsoup.nodes.FormElement formElement6 = null;
        htmlTreeBuilder0.setFormElement(formElement6);
        org.jsoup.nodes.FormElement formElement8 = htmlTreeBuilder0.getFormElement();
        org.jsoup.parser.Token.Comment comment9 = new org.jsoup.parser.Token.Comment();
        org.jsoup.parser.Token token10 = comment9.reset();
        boolean boolean11 = comment9.bogus;
        comment9.bogus = false;
        java.lang.String str14 = comment9.toString();
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.insert(comment9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(formElement8);
        org.junit.Assert.assertNotNull(token10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "<!---->" + "'", str14, "<!---->");
    }

    @Test
    public void test0340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0340");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.state();
        org.jsoup.nodes.FormElement formElement2 = null;
        htmlTreeBuilder0.setFormElement(formElement2);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder4 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document7 = xmlTreeBuilder4.parse("", "hi!");
        org.jsoup.nodes.Document document10 = xmlTreeBuilder4.parse("<![CDATA[hi!]]>", "<!---->");
        boolean boolean11 = htmlTreeBuilder0.isSpecial((org.jsoup.nodes.Element) document10);
        org.jsoup.nodes.Element element12 = htmlTreeBuilder0.getHeadElement();
        java.lang.String[] strArray13 = org.jsoup.parser.HtmlTreeBuilder.TagSearchList;
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.popStackToClose(strArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(htmlTreeBuilderState1);
        org.junit.Assert.assertNotNull(document7);
        org.junit.Assert.assertNotNull(document10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(element12);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[] { "ol", "ul" });
    }

    @Test
    public void test0341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0341");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.FormElement formElement2 = null;
        htmlTreeBuilder0.setFormElement(formElement2);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element4 = htmlTreeBuilder0.removeLastFormattingElement();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings1);
    }

    @Test
    public void test0342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0342");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.state();
        htmlTreeBuilder0.setFosterInserts(true);
        boolean boolean4 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder5 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState6 = htmlTreeBuilder5.state();
        org.jsoup.nodes.FormElement formElement7 = null;
        htmlTreeBuilder5.setFormElement(formElement7);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder9 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document12 = xmlTreeBuilder9.parse("<![CDATA[hi!]]>", " ");
        htmlTreeBuilder5.setHeadElement((org.jsoup.nodes.Element) document12);
        org.jsoup.nodes.Element element14 = htmlTreeBuilder5.getHeadElement();
        htmlTreeBuilder0.setHeadElement(element14);
        htmlTreeBuilder0.framesetOk(false);
        org.jsoup.nodes.FormElement formElement18 = null;
        htmlTreeBuilder0.setFormElement(formElement18);
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder20 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState21 = htmlTreeBuilder20.state();
        org.jsoup.nodes.FormElement formElement22 = null;
        htmlTreeBuilder20.setFormElement(formElement22);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder24 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document27 = xmlTreeBuilder24.parse("<![CDATA[hi!]]>", " ");
        htmlTreeBuilder20.setHeadElement((org.jsoup.nodes.Element) document27);
        boolean boolean29 = htmlTreeBuilder20.isFragmentParsing();
        htmlTreeBuilder20.setFosterInserts(false);
        org.jsoup.nodes.Element element32 = htmlTreeBuilder20.getHeadElement();
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.push(element32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(htmlTreeBuilderState1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(htmlTreeBuilderState6);
        org.junit.Assert.assertNotNull(document12);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNull(htmlTreeBuilderState21);
        org.junit.Assert.assertNotNull(document27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(element32);
    }

    @Test
    public void test0343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0343");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.state();
        org.jsoup.nodes.FormElement formElement2 = null;
        htmlTreeBuilder0.setFormElement(formElement2);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder4 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document7 = xmlTreeBuilder4.parse("", "hi!");
        org.jsoup.nodes.Document document10 = xmlTreeBuilder4.parse("<![CDATA[hi!]]>", "<!---->");
        boolean boolean11 = htmlTreeBuilder0.isSpecial((org.jsoup.nodes.Element) document10);
        boolean boolean12 = htmlTreeBuilder0.framesetOk();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element13 = htmlTreeBuilder0.pop();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(htmlTreeBuilderState1);
        org.junit.Assert.assertNotNull(document7);
        org.junit.Assert.assertNotNull(document10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0344");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.state();
        org.jsoup.nodes.FormElement formElement2 = null;
        htmlTreeBuilder0.setFormElement(formElement2);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder4 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document7 = xmlTreeBuilder4.parse("<![CDATA[hi!]]>", " ");
        htmlTreeBuilder0.setHeadElement((org.jsoup.nodes.Element) document7);
        boolean boolean9 = htmlTreeBuilder0.isFragmentParsing();
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.clearStackToTableContext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(htmlTreeBuilderState1);
        org.junit.Assert.assertNotNull(document7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0345");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.state();
        org.jsoup.nodes.FormElement formElement2 = null;
        htmlTreeBuilder0.setFormElement(formElement2);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.state();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState5 = htmlTreeBuilder0.state();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element7 = htmlTreeBuilder0.insertStartTag(" ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(htmlTreeBuilderState1);
        org.junit.Assert.assertNull(htmlTreeBuilderState4);
        org.junit.Assert.assertNull(htmlTreeBuilderState5);
    }

    @Test
    public void test0346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0346");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList1 = htmlTreeBuilder0.getStack();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList2 = htmlTreeBuilder0.getStack();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder3 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder3.state();
        org.jsoup.nodes.FormElement formElement5 = null;
        htmlTreeBuilder3.setFormElement(formElement5);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder7 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document10 = xmlTreeBuilder7.parse("", "hi!");
        org.jsoup.nodes.Document document13 = xmlTreeBuilder7.parse("<![CDATA[hi!]]>", "<!---->");
        boolean boolean14 = htmlTreeBuilder3.isSpecial((org.jsoup.nodes.Element) document13);
        boolean boolean15 = htmlTreeBuilder0.isSpecial((org.jsoup.nodes.Element) document13);
        org.jsoup.parser.Token.StartTag startTag16 = new org.jsoup.parser.Token.StartTag();
        startTag16.finaliseTag();
        java.lang.String str18 = startTag16.normalName();
        boolean boolean19 = startTag16.isCData();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.FormElement formElement21 = htmlTreeBuilder0.insertForm(startTag16, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must be false");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(elementList1);
        org.junit.Assert.assertNull(elementList2);
        org.junit.Assert.assertNull(htmlTreeBuilderState4);
        org.junit.Assert.assertNotNull(document10);
        org.junit.Assert.assertNotNull(document13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test0347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0347");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.state();
        org.jsoup.nodes.FormElement formElement2 = null;
        htmlTreeBuilder0.setFormElement(formElement2);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder4 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document7 = xmlTreeBuilder4.parse("<![CDATA[hi!]]>", " ");
        htmlTreeBuilder0.setHeadElement((org.jsoup.nodes.Element) document7);
        boolean boolean9 = htmlTreeBuilder0.isFragmentParsing();
        boolean boolean10 = htmlTreeBuilder0.framesetOk();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState11 = null;
        htmlTreeBuilder0.transition(htmlTreeBuilderState11);
        org.jsoup.parser.Token.StartTag startTag13 = new org.jsoup.parser.Token.StartTag();
        startTag13.appendAttributeName(' ');
        boolean boolean16 = startTag13.selfClosing;
        startTag13.newAttribute();
        org.jsoup.parser.Token.Tag tag19 = startTag13.name("<![CDATA[null]]>");
        org.jsoup.parser.Token.StartTag startTag20 = new org.jsoup.parser.Token.StartTag();
        startTag20.appendAttributeValue("");
        org.jsoup.parser.Token.TokenType tokenType23 = org.jsoup.parser.Token.TokenType.Doctype;
        startTag20.type = tokenType23;
        startTag13.type = tokenType23;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.FormElement formElement27 = htmlTreeBuilder0.insertForm(startTag13, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(htmlTreeBuilderState1);
        org.junit.Assert.assertNotNull(document7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(tag19);
        org.junit.Assert.assertTrue("'" + tokenType23 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType23.equals(org.jsoup.parser.Token.TokenType.Doctype));
    }

    @Test
    public void test0348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0348");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.state();
        org.jsoup.nodes.FormElement formElement2 = null;
        htmlTreeBuilder0.setFormElement(formElement2);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder4 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document7 = xmlTreeBuilder4.parse("<![CDATA[hi!]]>", " ");
        htmlTreeBuilder0.setHeadElement((org.jsoup.nodes.Element) document7);
        boolean boolean9 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.nodes.FormElement formElement10 = htmlTreeBuilder0.getFormElement();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder11 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState12 = htmlTreeBuilder11.state();
        org.jsoup.nodes.FormElement formElement13 = null;
        htmlTreeBuilder11.setFormElement(formElement13);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder15 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document18 = xmlTreeBuilder15.parse("<![CDATA[hi!]]>", " ");
        htmlTreeBuilder11.setHeadElement((org.jsoup.nodes.Element) document18);
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.pushActiveFormattingElements((org.jsoup.nodes.Element) document18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(htmlTreeBuilderState1);
        org.junit.Assert.assertNotNull(document7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(formElement10);
        org.junit.Assert.assertNull(htmlTreeBuilderState12);
        org.junit.Assert.assertNotNull(document18);
    }

    @Test
    public void test0349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0349");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor1 = attributes0.iterator();
        attributes0.normalize();
        org.jsoup.nodes.Attributes attributes5 = attributes0.put("", true);
        org.jsoup.nodes.Attribute attribute6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Attributes attributes7 = attributes5.put(attribute6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(attributeItor1);
        org.junit.Assert.assertNotNull(attributes5);
    }

    @Test
    public void test0350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0350");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.finaliseTag();
        startTag0.tagName = "";
        org.jsoup.nodes.Attributes attributes4 = startTag0.attributes;
        org.jsoup.parser.Token.Tag tag6 = startTag0.name("hi!");
        java.lang.String str7 = tag6.tagName;
        org.jsoup.parser.Token.Tag tag9 = tag6.name("");
        org.jsoup.parser.Token.Tag tag11 = tag6.name(" ");
        org.junit.Assert.assertNotNull(attributes4);
        org.junit.Assert.assertNotNull(tag6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(tag9);
        org.junit.Assert.assertNotNull(tag11);
    }

    @Test
    public void test0351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0351");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList1 = htmlTreeBuilder0.getStack();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList2 = htmlTreeBuilder0.getStack();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder3 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder3.state();
        org.jsoup.nodes.FormElement formElement5 = null;
        htmlTreeBuilder3.setFormElement(formElement5);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder7 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document10 = xmlTreeBuilder7.parse("", "hi!");
        org.jsoup.nodes.Document document13 = xmlTreeBuilder7.parse("<![CDATA[hi!]]>", "<!---->");
        boolean boolean14 = htmlTreeBuilder3.isSpecial((org.jsoup.nodes.Element) document13);
        boolean boolean15 = htmlTreeBuilder0.isSpecial((org.jsoup.nodes.Element) document13);
        htmlTreeBuilder0.newPendingTableCharacters();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder17 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState18 = htmlTreeBuilder17.state();
        org.jsoup.nodes.FormElement formElement19 = null;
        htmlTreeBuilder17.setFormElement(formElement19);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState21 = htmlTreeBuilder17.state();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder22 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document25 = xmlTreeBuilder22.parse("", "hi!");
        org.jsoup.nodes.Document document28 = xmlTreeBuilder22.parse("<![CDATA[hi!]]>", "<!---->");
        boolean boolean29 = htmlTreeBuilder17.isSpecial((org.jsoup.nodes.Element) document28);
        boolean boolean30 = htmlTreeBuilder0.isSpecial((org.jsoup.nodes.Element) document28);
        java.io.Reader reader31 = null;
        org.jsoup.parser.Parser parser33 = null;
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.initialiseParse(reader31, "<![CDATA[null]]>", parser33);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String input must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(elementList1);
        org.junit.Assert.assertNull(elementList2);
        org.junit.Assert.assertNull(htmlTreeBuilderState4);
        org.junit.Assert.assertNotNull(document10);
        org.junit.Assert.assertNotNull(document13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(htmlTreeBuilderState18);
        org.junit.Assert.assertNull(htmlTreeBuilderState21);
        org.junit.Assert.assertNotNull(document25);
        org.junit.Assert.assertNotNull(document28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test0352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0352");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.state();
        org.jsoup.nodes.FormElement formElement2 = null;
        htmlTreeBuilder0.setFormElement(formElement2);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = null;
        htmlTreeBuilder0.transition(htmlTreeBuilderState4);
        boolean boolean6 = htmlTreeBuilder0.isFosterInserts();
        org.jsoup.nodes.FormElement formElement7 = htmlTreeBuilder0.getFormElement();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder8 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState9 = htmlTreeBuilder8.state();
        org.jsoup.nodes.FormElement formElement10 = null;
        htmlTreeBuilder8.setFormElement(formElement10);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder12 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document15 = xmlTreeBuilder12.parse("<![CDATA[hi!]]>", " ");
        htmlTreeBuilder8.setHeadElement((org.jsoup.nodes.Element) document15);
        boolean boolean17 = htmlTreeBuilder8.isFragmentParsing();
        htmlTreeBuilder8.setFosterInserts(false);
        org.jsoup.nodes.Element element20 = htmlTreeBuilder8.getHeadElement();
        htmlTreeBuilder0.maybeSetBaseUri(element20);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState22 = null;
        htmlTreeBuilder0.transition(htmlTreeBuilderState22);
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder24 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState25 = htmlTreeBuilder24.state();
        org.jsoup.nodes.FormElement formElement26 = null;
        htmlTreeBuilder24.setFormElement(formElement26);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState28 = htmlTreeBuilder24.state();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder29 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document32 = xmlTreeBuilder29.parse("", "hi!");
        org.jsoup.nodes.Document document35 = xmlTreeBuilder29.parse("<![CDATA[hi!]]>", "<!---->");
        boolean boolean36 = htmlTreeBuilder24.isSpecial((org.jsoup.nodes.Element) document35);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean37 = htmlTreeBuilder0.onStack((org.jsoup.nodes.Element) document35);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(htmlTreeBuilderState1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(formElement7);
        org.junit.Assert.assertNull(htmlTreeBuilderState9);
        org.junit.Assert.assertNotNull(document15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertNull(htmlTreeBuilderState25);
        org.junit.Assert.assertNull(htmlTreeBuilderState28);
        org.junit.Assert.assertNotNull(document32);
        org.junit.Assert.assertNotNull(document35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test0353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0353");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.state();
        org.jsoup.nodes.FormElement formElement2 = null;
        htmlTreeBuilder0.setFormElement(formElement2);
        org.jsoup.parser.ParseSettings parseSettings4 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder5 = new org.jsoup.parser.HtmlTreeBuilder();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList6 = htmlTreeBuilder5.getStack();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder7 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState8 = htmlTreeBuilder7.state();
        htmlTreeBuilder7.setFosterInserts(true);
        boolean boolean11 = htmlTreeBuilder7.isFragmentParsing();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder12 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState13 = htmlTreeBuilder12.state();
        org.jsoup.nodes.FormElement formElement14 = null;
        htmlTreeBuilder12.setFormElement(formElement14);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder16 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document19 = xmlTreeBuilder16.parse("<![CDATA[hi!]]>", " ");
        htmlTreeBuilder12.setHeadElement((org.jsoup.nodes.Element) document19);
        org.jsoup.nodes.Element element21 = htmlTreeBuilder12.getHeadElement();
        htmlTreeBuilder7.setHeadElement(element21);
        htmlTreeBuilder5.maybeSetBaseUri(element21);
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.pushActiveFormattingElements(element21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(htmlTreeBuilderState1);
        org.junit.Assert.assertNotNull(parseSettings4);
        org.junit.Assert.assertNull(elementList6);
        org.junit.Assert.assertNull(htmlTreeBuilderState8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(htmlTreeBuilderState13);
        org.junit.Assert.assertNotNull(document19);
        org.junit.Assert.assertNotNull(element21);
    }

    @Test
    public void test0354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0354");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document3 = xmlTreeBuilder0.parse("<![CDATA[hi!]]>", " ");
        org.jsoup.parser.Token.Comment comment4 = new org.jsoup.parser.Token.Comment();
        org.jsoup.parser.Token token5 = comment4.reset();
        boolean boolean6 = comment4.bogus;
        xmlTreeBuilder0.insert(comment4);
        org.jsoup.nodes.Document document10 = xmlTreeBuilder0.parse("StartTag", "< >");
        org.jsoup.nodes.Attributes attributes12 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor13 = attributes12.iterator();
        attributes12.normalize();
        org.jsoup.nodes.Attributes attributes17 = attributes12.put("", true);
        boolean boolean18 = xmlTreeBuilder0.processStartTag("<starttag>", attributes12);
        org.jsoup.parser.Token.Comment comment19 = new org.jsoup.parser.Token.Comment();
        org.jsoup.parser.Token token20 = comment19.reset();
        boolean boolean21 = comment19.bogus;
        comment19.bogus = true;
        boolean boolean24 = comment19.bogus;
        xmlTreeBuilder0.insert(comment19);
        org.jsoup.parser.Token.StartTag startTag26 = new org.jsoup.parser.Token.StartTag();
        startTag26.finaliseTag();
        java.lang.String str28 = startTag26.normalName();
        org.jsoup.nodes.Attributes attributes29 = startTag26.attributes;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean30 = xmlTreeBuilder0.process((org.jsoup.parser.Token) startTag26);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must be false");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(token5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(document10);
        org.junit.Assert.assertNotNull(attributeItor13);
        org.junit.Assert.assertNotNull(attributes17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(token20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNotNull(attributes29);
    }

    @Test
    public void test0355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0355");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList1 = htmlTreeBuilder0.getStack();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList2 = htmlTreeBuilder0.getStack();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder3 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder3.state();
        org.jsoup.nodes.FormElement formElement5 = null;
        htmlTreeBuilder3.setFormElement(formElement5);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder7 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document10 = xmlTreeBuilder7.parse("", "hi!");
        org.jsoup.nodes.Document document13 = xmlTreeBuilder7.parse("<![CDATA[hi!]]>", "<!---->");
        boolean boolean14 = htmlTreeBuilder3.isSpecial((org.jsoup.nodes.Element) document13);
        boolean boolean15 = htmlTreeBuilder0.isSpecial((org.jsoup.nodes.Element) document13);
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.popStackToClose("StartTag");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(elementList1);
        org.junit.Assert.assertNull(elementList2);
        org.junit.Assert.assertNull(htmlTreeBuilderState4);
        org.junit.Assert.assertNotNull(document10);
        org.junit.Assert.assertNotNull(document13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0356");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        java.lang.String str1 = startTag0.tokenType();
        startTag0.finaliseTag();
        startTag0.tagName = "";
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.EndTag endTag5 = startTag0.asEndTag();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$EndTag (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$EndTag are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "StartTag" + "'", str1, "StartTag");
    }

    @Test
    public void test0357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0357");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.finaliseTag();
        java.lang.String str2 = startTag0.normalName();
        java.lang.String str3 = startTag0.tokenType();
        startTag0.appendTagName("");
        startTag0.appendAttributeValue("<starttag>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Comment comment8 = startTag0.asComment();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$Comment (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$Comment are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "StartTag" + "'", str3, "StartTag");
    }

    @Test
    public void test0358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0358");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document3 = xmlTreeBuilder0.parse("<![CDATA[hi!]]>", " ");
        org.jsoup.parser.Token.Comment comment4 = null;
        // The following exception was thrown during execution in test generation
        try {
            xmlTreeBuilder0.insert(comment4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document3);
    }

    @Test
    public void test0359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0359");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.state();
        org.jsoup.nodes.FormElement formElement2 = null;
        htmlTreeBuilder0.setFormElement(formElement2);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder4 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document7 = xmlTreeBuilder4.parse("<![CDATA[hi!]]>", " ");
        htmlTreeBuilder0.setHeadElement((org.jsoup.nodes.Element) document7);
        boolean boolean9 = htmlTreeBuilder0.isFragmentParsing();
        boolean boolean10 = htmlTreeBuilder0.framesetOk();
        htmlTreeBuilder0.setFosterInserts(false);
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder13 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState14 = htmlTreeBuilder13.state();
        org.jsoup.nodes.FormElement formElement15 = null;
        htmlTreeBuilder13.setFormElement(formElement15);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState17 = null;
        htmlTreeBuilder13.transition(htmlTreeBuilderState17);
        boolean boolean19 = htmlTreeBuilder13.isFosterInserts();
        org.jsoup.nodes.FormElement formElement20 = htmlTreeBuilder13.getFormElement();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder21 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState22 = htmlTreeBuilder21.state();
        org.jsoup.nodes.FormElement formElement23 = null;
        htmlTreeBuilder21.setFormElement(formElement23);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder25 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document28 = xmlTreeBuilder25.parse("<![CDATA[hi!]]>", " ");
        htmlTreeBuilder21.setHeadElement((org.jsoup.nodes.Element) document28);
        boolean boolean30 = htmlTreeBuilder21.isFragmentParsing();
        htmlTreeBuilder21.setFosterInserts(false);
        org.jsoup.nodes.Element element33 = htmlTreeBuilder21.getHeadElement();
        htmlTreeBuilder13.maybeSetBaseUri(element33);
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.insert(element33);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(htmlTreeBuilderState1);
        org.junit.Assert.assertNotNull(document7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(htmlTreeBuilderState14);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(formElement20);
        org.junit.Assert.assertNull(htmlTreeBuilderState22);
        org.junit.Assert.assertNotNull(document28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(element33);
    }

    @Test
    public void test0360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0360");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.state();
        htmlTreeBuilder0.setFosterInserts(true);
        boolean boolean4 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.nodes.Element element5 = htmlTreeBuilder0.getHeadElement();
        org.jsoup.nodes.Document document6 = htmlTreeBuilder0.getDocument();
        org.jsoup.nodes.Element element7 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = htmlTreeBuilder0.onStack(element7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(htmlTreeBuilderState1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(element5);
        org.junit.Assert.assertNull(document6);
    }

    @Test
    public void test0361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0361");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.state();
        org.jsoup.nodes.FormElement formElement2 = null;
        htmlTreeBuilder0.setFormElement(formElement2);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.state();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState5 = null;
        htmlTreeBuilder0.transition(htmlTreeBuilderState5);
        org.jsoup.parser.Token.Comment comment7 = new org.jsoup.parser.Token.Comment();
        org.jsoup.parser.Token token8 = comment7.reset();
        boolean boolean9 = comment7.bogus;
        comment7.bogus = false;
        java.lang.String str12 = comment7.toString();
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.insert(comment7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(htmlTreeBuilderState1);
        org.junit.Assert.assertNull(htmlTreeBuilderState4);
        org.junit.Assert.assertNotNull(token8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "<!---->" + "'", str12, "<!---->");
    }

    @Test
    public void test0362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0362");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.state();
        htmlTreeBuilder0.setFosterInserts(true);
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder4 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState5 = htmlTreeBuilder4.state();
        org.jsoup.nodes.FormElement formElement6 = null;
        htmlTreeBuilder4.setFormElement(formElement6);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder8 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document11 = xmlTreeBuilder8.parse("<![CDATA[hi!]]>", " ");
        htmlTreeBuilder4.setHeadElement((org.jsoup.nodes.Element) document11);
        htmlTreeBuilder0.setHeadElement((org.jsoup.nodes.Element) document11);
        htmlTreeBuilder0.newPendingTableCharacters();
        org.jsoup.nodes.FormElement formElement15 = null;
        htmlTreeBuilder0.setFormElement(formElement15);
        java.lang.String[] strArray17 = org.jsoup.parser.HtmlTreeBuilder.TagSearchEndTags;
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.popStackToClose(strArray17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(htmlTreeBuilderState1);
        org.junit.Assert.assertNull(htmlTreeBuilderState5);
        org.junit.Assert.assertNotNull(document11);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertArrayEquals(strArray17, new java.lang.String[] { "dd", "dt", "li", "optgroup", "option", "p", "rp", "rt" });
    }

    @Test
    public void test0363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0363");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Character character1 = comment0.asCharacter();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$Comment cannot be cast to class org.jsoup.parser.Token$Character (org.jsoup.parser.Token$Comment and org.jsoup.parser.Token$Character are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0364");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document3 = xmlTreeBuilder0.parse("", "hi!");
        org.jsoup.nodes.Document document6 = xmlTreeBuilder0.parse("<![CDATA[hi!]]>", "<!---->");
        org.jsoup.parser.Token.StartTag startTag7 = new org.jsoup.parser.Token.StartTag();
        startTag7.appendAttributeName(' ');
        boolean boolean10 = startTag7.selfClosing;
        startTag7.newAttribute();
        org.jsoup.parser.Token.Tag tag13 = startTag7.name("<![CDATA[null]]>");
        org.jsoup.parser.Token.StartTag startTag14 = new org.jsoup.parser.Token.StartTag();
        startTag14.appendAttributeValue("");
        org.jsoup.parser.Token.TokenType tokenType17 = org.jsoup.parser.Token.TokenType.Doctype;
        startTag14.type = tokenType17;
        startTag7.type = tokenType17;
        startTag7.newAttribute();
        startTag7.appendAttributeName("</<![CDATA[null]]>>");
        org.jsoup.nodes.Element element23 = xmlTreeBuilder0.insert(startTag7);
        org.jsoup.parser.Token.StartTag startTag24 = new org.jsoup.parser.Token.StartTag();
        startTag24.finaliseTag();
        java.lang.String str26 = startTag24.normalName();
        boolean boolean27 = startTag24.isCData();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean28 = xmlTreeBuilder0.process((org.jsoup.parser.Token) startTag24);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must be false");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(document6);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(tag13);
        org.junit.Assert.assertTrue("'" + tokenType17 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType17.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test0365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0365");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.state();
        org.jsoup.nodes.FormElement formElement2 = null;
        htmlTreeBuilder0.setFormElement(formElement2);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder4 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document7 = xmlTreeBuilder4.parse("<![CDATA[hi!]]>", " ");
        htmlTreeBuilder0.setHeadElement((org.jsoup.nodes.Element) document7);
        boolean boolean9 = htmlTreeBuilder0.isFragmentParsing();
        htmlTreeBuilder0.setFosterInserts(false);
        org.jsoup.nodes.Document document12 = htmlTreeBuilder0.getDocument();
        org.jsoup.nodes.FormElement formElement13 = null;
        htmlTreeBuilder0.setFormElement(formElement13);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element15 = htmlTreeBuilder0.lastFormattingElement();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(htmlTreeBuilderState1);
        org.junit.Assert.assertNotNull(document7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(document12);
    }

    @Test
    public void test0366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0366");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.state();
        org.jsoup.nodes.FormElement formElement2 = null;
        htmlTreeBuilder0.setFormElement(formElement2);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder4 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document7 = xmlTreeBuilder4.parse("<![CDATA[hi!]]>", " ");
        htmlTreeBuilder0.setHeadElement((org.jsoup.nodes.Element) document7);
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder9 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState10 = htmlTreeBuilder9.state();
        org.jsoup.nodes.FormElement formElement11 = null;
        htmlTreeBuilder9.setFormElement(formElement11);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState13 = null;
        htmlTreeBuilder9.transition(htmlTreeBuilderState13);
        boolean boolean15 = htmlTreeBuilder9.isFosterInserts();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState16 = htmlTreeBuilder9.state();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder17 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document20 = xmlTreeBuilder17.parse("", "hi!");
        org.jsoup.nodes.Document document23 = xmlTreeBuilder17.parse("<![CDATA[hi!]]>", "<!---->");
        htmlTreeBuilder9.setHeadElement((org.jsoup.nodes.Element) document23);
        boolean boolean25 = htmlTreeBuilder0.isSpecial((org.jsoup.nodes.Element) document23);
        java.util.ArrayList<org.jsoup.nodes.Element> elementList26 = htmlTreeBuilder0.getStack();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder27 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState28 = htmlTreeBuilder27.state();
        org.jsoup.nodes.FormElement formElement29 = null;
        htmlTreeBuilder27.setFormElement(formElement29);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder31 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document34 = xmlTreeBuilder31.parse("<![CDATA[hi!]]>", " ");
        htmlTreeBuilder27.maybeSetBaseUri((org.jsoup.nodes.Element) document34);
        htmlTreeBuilder0.maybeSetBaseUri((org.jsoup.nodes.Element) document34);
        org.jsoup.parser.Token.CData cData38 = new org.jsoup.parser.Token.CData("hi!");
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.insert((org.jsoup.parser.Token.Character) cData38);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(htmlTreeBuilderState1);
        org.junit.Assert.assertNotNull(document7);
        org.junit.Assert.assertNull(htmlTreeBuilderState10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(htmlTreeBuilderState16);
        org.junit.Assert.assertNotNull(document20);
        org.junit.Assert.assertNotNull(document23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNull(elementList26);
        org.junit.Assert.assertNull(htmlTreeBuilderState28);
        org.junit.Assert.assertNotNull(document34);
    }

    @Test
    public void test0367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0367");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        java.lang.String str1 = endTag0.normalName;
        endTag0.tagName = "<![CDATA[null]]>";
        char[] charArray4 = null;
        // The following exception was thrown during execution in test generation
        try {
            endTag0.appendAttributeValue(charArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test0368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0368");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.state();
        org.jsoup.nodes.FormElement formElement2 = null;
        htmlTreeBuilder0.setFormElement(formElement2);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = null;
        htmlTreeBuilder0.transition(htmlTreeBuilderState4);
        boolean boolean6 = htmlTreeBuilder0.isFosterInserts();
        org.jsoup.nodes.FormElement formElement7 = htmlTreeBuilder0.getFormElement();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder8 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState9 = htmlTreeBuilder8.state();
        org.jsoup.nodes.FormElement formElement10 = null;
        htmlTreeBuilder8.setFormElement(formElement10);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder12 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document15 = xmlTreeBuilder12.parse("<![CDATA[hi!]]>", " ");
        htmlTreeBuilder8.setHeadElement((org.jsoup.nodes.Element) document15);
        boolean boolean17 = htmlTreeBuilder8.isFragmentParsing();
        htmlTreeBuilder8.setFosterInserts(false);
        org.jsoup.nodes.Element element20 = htmlTreeBuilder8.getHeadElement();
        htmlTreeBuilder0.maybeSetBaseUri(element20);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean23 = htmlTreeBuilder0.inButtonScope("<![CDATA[null]]>");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(htmlTreeBuilderState1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(formElement7);
        org.junit.Assert.assertNull(htmlTreeBuilderState9);
        org.junit.Assert.assertNotNull(document15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(element20);
    }

    @Test
    public void test0369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0369");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.state();
        org.jsoup.nodes.FormElement formElement2 = null;
        htmlTreeBuilder0.setFormElement(formElement2);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = null;
        htmlTreeBuilder0.transition(htmlTreeBuilderState4);
        boolean boolean6 = htmlTreeBuilder0.isFosterInserts();
        org.jsoup.nodes.FormElement formElement7 = htmlTreeBuilder0.getFormElement();
        htmlTreeBuilder0.generateImpliedEndTags();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder9 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState10 = htmlTreeBuilder9.state();
        org.jsoup.nodes.FormElement formElement11 = null;
        htmlTreeBuilder9.setFormElement(formElement11);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder13 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document16 = xmlTreeBuilder13.parse("<![CDATA[hi!]]>", " ");
        htmlTreeBuilder9.setHeadElement((org.jsoup.nodes.Element) document16);
        boolean boolean18 = htmlTreeBuilder9.isFragmentParsing();
        htmlTreeBuilder9.setFosterInserts(false);
        org.jsoup.nodes.Element element21 = htmlTreeBuilder9.getHeadElement();
        htmlTreeBuilder0.setHeadElement(element21);
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder23 = new org.jsoup.parser.HtmlTreeBuilder();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList24 = htmlTreeBuilder23.getStack();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList25 = htmlTreeBuilder23.getStack();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder26 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState27 = htmlTreeBuilder26.state();
        org.jsoup.nodes.FormElement formElement28 = null;
        htmlTreeBuilder26.setFormElement(formElement28);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder30 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document33 = xmlTreeBuilder30.parse("", "hi!");
        org.jsoup.nodes.Document document36 = xmlTreeBuilder30.parse("<![CDATA[hi!]]>", "<!---->");
        boolean boolean37 = htmlTreeBuilder26.isSpecial((org.jsoup.nodes.Element) document36);
        boolean boolean38 = htmlTreeBuilder23.isSpecial((org.jsoup.nodes.Element) document36);
        htmlTreeBuilder23.newPendingTableCharacters();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder40 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState41 = htmlTreeBuilder40.state();
        org.jsoup.nodes.FormElement formElement42 = null;
        htmlTreeBuilder40.setFormElement(formElement42);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState44 = htmlTreeBuilder40.state();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder45 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document48 = xmlTreeBuilder45.parse("", "hi!");
        org.jsoup.nodes.Document document51 = xmlTreeBuilder45.parse("<![CDATA[hi!]]>", "<!---->");
        boolean boolean52 = htmlTreeBuilder40.isSpecial((org.jsoup.nodes.Element) document51);
        boolean boolean53 = htmlTreeBuilder23.isSpecial((org.jsoup.nodes.Element) document51);
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.removeFromActiveFormattingElements((org.jsoup.nodes.Element) document51);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(htmlTreeBuilderState1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(formElement7);
        org.junit.Assert.assertNull(htmlTreeBuilderState10);
        org.junit.Assert.assertNotNull(document16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertNull(elementList24);
        org.junit.Assert.assertNull(elementList25);
        org.junit.Assert.assertNull(htmlTreeBuilderState27);
        org.junit.Assert.assertNotNull(document33);
        org.junit.Assert.assertNotNull(document36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNull(htmlTreeBuilderState41);
        org.junit.Assert.assertNull(htmlTreeBuilderState44);
        org.junit.Assert.assertNotNull(document48);
        org.junit.Assert.assertNotNull(document51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
    }

    @Test
    public void test0370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0370");
        org.jsoup.parser.Token.CData cData1 = new org.jsoup.parser.Token.CData("hi!");
        org.jsoup.parser.Token token2 = cData1.reset();
        org.jsoup.parser.Token.Character character3 = token2.asCharacter();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.EndTag endTag4 = character3.asEndTag();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$CData cannot be cast to class org.jsoup.parser.Token$EndTag (org.jsoup.parser.Token$CData and org.jsoup.parser.Token$EndTag are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(token2);
        org.junit.Assert.assertNotNull(character3);
    }

    @Test
    public void test0371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0371");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = null;
        htmlTreeBuilder0.transition(htmlTreeBuilderState1);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element4 = htmlTreeBuilder0.getFromStack("CData");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0372");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.finaliseTag();
        startTag0.tagName = "";
        org.jsoup.nodes.Attributes attributes4 = startTag0.attributes;
        org.jsoup.parser.Token.Tag tag6 = startTag0.name("hi!");
        java.lang.String str7 = tag6.tagName;
        org.jsoup.parser.Token.Tag tag9 = tag6.name("");
        java.lang.String str10 = tag9.normalName();
        tag9.newAttribute();
        org.junit.Assert.assertNotNull(attributes4);
        org.junit.Assert.assertNotNull(tag6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(tag9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test0373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0373");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.appendAttributeName(' ');
        boolean boolean3 = startTag0.selfClosing;
        startTag0.newAttribute();
        org.jsoup.parser.Token.Tag tag6 = startTag0.name("<![CDATA[null]]>");
        org.jsoup.parser.Token.StartTag startTag7 = new org.jsoup.parser.Token.StartTag();
        startTag7.appendAttributeValue("");
        org.jsoup.parser.Token.TokenType tokenType10 = org.jsoup.parser.Token.TokenType.Doctype;
        startTag7.type = tokenType10;
        startTag0.type = tokenType10;
        startTag0.newAttribute();
        startTag0.appendAttributeName("<!---->");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Doctype doctype16 = startTag0.asDoctype();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$Doctype (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$Doctype are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(tag6);
        org.junit.Assert.assertTrue("'" + tokenType10 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType10.equals(org.jsoup.parser.Token.TokenType.Doctype));
    }

    @Test
    public void test0374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0374");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.state();
        org.jsoup.nodes.FormElement formElement2 = null;
        htmlTreeBuilder0.setFormElement(formElement2);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder4 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document7 = xmlTreeBuilder4.parse("<![CDATA[hi!]]>", " ");
        htmlTreeBuilder0.setHeadElement((org.jsoup.nodes.Element) document7);
        boolean boolean9 = htmlTreeBuilder0.isFragmentParsing();
        boolean boolean10 = htmlTreeBuilder0.framesetOk();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState11 = null;
        htmlTreeBuilder0.transition(htmlTreeBuilderState11);
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.clearStackToTableBodyContext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(htmlTreeBuilderState1);
        org.junit.Assert.assertNotNull(document7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0375");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.state();
        org.jsoup.nodes.FormElement formElement2 = null;
        htmlTreeBuilder0.setFormElement(formElement2);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder4 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document7 = xmlTreeBuilder4.parse("<![CDATA[hi!]]>", " ");
        htmlTreeBuilder0.setHeadElement((org.jsoup.nodes.Element) document7);
        boolean boolean9 = htmlTreeBuilder0.isFragmentParsing();
        boolean boolean10 = htmlTreeBuilder0.framesetOk();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder11 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document14 = xmlTreeBuilder11.parse("<![CDATA[hi!]]>", " ");
        org.jsoup.parser.Token.Comment comment15 = new org.jsoup.parser.Token.Comment();
        org.jsoup.parser.Token token16 = comment15.reset();
        boolean boolean17 = comment15.bogus;
        xmlTreeBuilder11.insert(comment15);
        org.jsoup.nodes.Document document21 = xmlTreeBuilder11.parse("StartTag", "< >");
        org.jsoup.nodes.Attributes attributes23 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor24 = attributes23.iterator();
        attributes23.normalize();
        org.jsoup.nodes.Attributes attributes28 = attributes23.put("", true);
        boolean boolean29 = xmlTreeBuilder11.processStartTag("<starttag>", attributes23);
        org.jsoup.parser.Token.Comment comment30 = new org.jsoup.parser.Token.Comment();
        org.jsoup.parser.Token token31 = comment30.reset();
        boolean boolean32 = comment30.bogus;
        comment30.bogus = true;
        boolean boolean35 = comment30.bogus;
        xmlTreeBuilder11.insert(comment30);
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.insert(comment30);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(htmlTreeBuilderState1);
        org.junit.Assert.assertNotNull(document7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(document14);
        org.junit.Assert.assertNotNull(token16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(document21);
        org.junit.Assert.assertNotNull(attributeItor24);
        org.junit.Assert.assertNotNull(attributes28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(token31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
    }

    @Test
    public void test0376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0376");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = null;
        htmlTreeBuilder0.transition(htmlTreeBuilderState1);
        boolean boolean3 = htmlTreeBuilder0.framesetOk();
        java.lang.String str4 = htmlTreeBuilder0.getBaseUri();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element6 = htmlTreeBuilder0.getActiveFormattingElement("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test0377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0377");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.generateImpliedEndTags();
        htmlTreeBuilder0.setFosterInserts(true);
        boolean boolean4 = htmlTreeBuilder0.framesetOk();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder6 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document9 = xmlTreeBuilder6.parse("", "hi!");
        org.jsoup.nodes.Document document12 = xmlTreeBuilder6.parse("<![CDATA[hi!]]>", "<!---->");
        org.jsoup.parser.Token.StartTag startTag13 = new org.jsoup.parser.Token.StartTag();
        startTag13.appendAttributeName(' ');
        boolean boolean16 = startTag13.selfClosing;
        startTag13.newAttribute();
        org.jsoup.parser.Token.Tag tag19 = startTag13.name("<![CDATA[null]]>");
        org.jsoup.parser.Token.StartTag startTag20 = new org.jsoup.parser.Token.StartTag();
        startTag20.appendAttributeValue("");
        org.jsoup.parser.Token.TokenType tokenType23 = org.jsoup.parser.Token.TokenType.Doctype;
        startTag20.type = tokenType23;
        startTag13.type = tokenType23;
        startTag13.newAttribute();
        startTag13.appendAttributeName("</<![CDATA[null]]>>");
        org.jsoup.nodes.Element element29 = xmlTreeBuilder6.insert(startTag13);
        org.jsoup.parser.Parser parser31 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.jsoup.nodes.Node> nodeList32 = htmlTreeBuilder0.parseFragment(" ", element29, "", parser31);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(document9);
        org.junit.Assert.assertNotNull(document12);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(tag19);
        org.junit.Assert.assertTrue("'" + tokenType23 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType23.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertNotNull(element29);
    }

    @Test
    public void test0378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0378");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.state();
        org.jsoup.nodes.FormElement formElement2 = null;
        htmlTreeBuilder0.setFormElement(formElement2);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder4 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document7 = xmlTreeBuilder4.parse("<![CDATA[hi!]]>", " ");
        htmlTreeBuilder0.setHeadElement((org.jsoup.nodes.Element) document7);
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder9 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState10 = htmlTreeBuilder9.state();
        org.jsoup.nodes.FormElement formElement11 = null;
        htmlTreeBuilder9.setFormElement(formElement11);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder13 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document16 = xmlTreeBuilder13.parse("<![CDATA[hi!]]>", " ");
        htmlTreeBuilder9.maybeSetBaseUri((org.jsoup.nodes.Element) document16);
        htmlTreeBuilder0.maybeSetBaseUri((org.jsoup.nodes.Element) document16);
        org.jsoup.nodes.Element element19 = htmlTreeBuilder0.getHeadElement();
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.resetInsertionMode();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(htmlTreeBuilderState1);
        org.junit.Assert.assertNotNull(document7);
        org.junit.Assert.assertNull(htmlTreeBuilderState10);
        org.junit.Assert.assertNotNull(document16);
        org.junit.Assert.assertNotNull(element19);
    }

    @Test
    public void test0379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0379");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.state();
        org.jsoup.nodes.FormElement formElement2 = null;
        htmlTreeBuilder0.setFormElement(formElement2);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder4 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document7 = xmlTreeBuilder4.parse("<![CDATA[hi!]]>", " ");
        htmlTreeBuilder0.setHeadElement((org.jsoup.nodes.Element) document7);
        boolean boolean9 = htmlTreeBuilder0.isFragmentParsing();
        htmlTreeBuilder0.setFosterInserts(false);
        org.jsoup.nodes.Document document12 = htmlTreeBuilder0.getDocument();
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.popStackToClose("</<![cdata[null]]>>");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(htmlTreeBuilderState1);
        org.junit.Assert.assertNotNull(document7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(document12);
    }

    @Test
    public void test0380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0380");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        org.jsoup.parser.Token.Tag tag2 = endTag0.name("<![CDATA[null]]>");
        java.lang.String str3 = endTag0.toString();
        endTag0.tagName = "<![CDATA[null]]>";
        boolean boolean6 = endTag0.isEndTag();
        org.junit.Assert.assertNotNull(tag2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "</<![CDATA[null]]>>" + "'", str3, "</<![CDATA[null]]>>");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0381");
        org.jsoup.parser.Token.CData cData1 = new org.jsoup.parser.Token.CData("hi!");
        java.lang.String str2 = cData1.getData();
        java.lang.String str3 = cData1.toString();
        org.jsoup.parser.Token.Character character5 = cData1.data("StartTag");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Doctype doctype6 = character5.asDoctype();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$CData cannot be cast to class org.jsoup.parser.Token$Doctype (org.jsoup.parser.Token$CData and org.jsoup.parser.Token$Doctype are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<![CDATA[hi!]]>" + "'", str3, "<![CDATA[hi!]]>");
        org.junit.Assert.assertNotNull(character5);
    }

    @Test
    public void test0382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0382");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = null;
        htmlTreeBuilder0.transition(htmlTreeBuilderState1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = htmlTreeBuilder0.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0383");
        org.jsoup.parser.ParseSettings parseSettings0 = org.jsoup.parser.ParseSettings.htmlDefault;
        org.jsoup.nodes.Attributes attributes1 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor2 = attributes1.iterator();
        org.jsoup.nodes.Attributes attributes3 = parseSettings0.normalizeAttributes(attributes1);
        attributes1.remove("hi!");
        attributes1.normalize();
        org.junit.Assert.assertNotNull(parseSettings0);
        org.junit.Assert.assertNotNull(attributeItor2);
        org.junit.Assert.assertNotNull(attributes3);
    }

    @Test
    public void test0384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0384");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.state();
        htmlTreeBuilder0.setFosterInserts(true);
        boolean boolean4 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.nodes.Element element5 = htmlTreeBuilder0.getHeadElement();
        htmlTreeBuilder0.markInsertionMode();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder7 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document10 = xmlTreeBuilder7.parse("", "hi!");
        org.jsoup.nodes.Document document13 = xmlTreeBuilder7.parse("<![CDATA[hi!]]>", "<!---->");
        org.jsoup.parser.Token.StartTag startTag14 = new org.jsoup.parser.Token.StartTag();
        startTag14.appendAttributeName(' ');
        boolean boolean17 = startTag14.selfClosing;
        startTag14.newAttribute();
        org.jsoup.parser.Token.Tag tag20 = startTag14.name("<![CDATA[null]]>");
        org.jsoup.parser.Token.StartTag startTag21 = new org.jsoup.parser.Token.StartTag();
        startTag21.appendAttributeValue("");
        org.jsoup.parser.Token.TokenType tokenType24 = org.jsoup.parser.Token.TokenType.Doctype;
        startTag21.type = tokenType24;
        startTag14.type = tokenType24;
        startTag14.newAttribute();
        startTag14.appendAttributeName("</<![CDATA[null]]>>");
        org.jsoup.nodes.Element element30 = xmlTreeBuilder7.insert(startTag14);
        htmlTreeBuilder0.maybeSetBaseUri(element30);
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder32 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState33 = htmlTreeBuilder32.state();
        htmlTreeBuilder32.setFosterInserts(true);
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder36 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState37 = htmlTreeBuilder36.state();
        org.jsoup.nodes.FormElement formElement38 = null;
        htmlTreeBuilder36.setFormElement(formElement38);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder40 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document43 = xmlTreeBuilder40.parse("<![CDATA[hi!]]>", " ");
        htmlTreeBuilder36.setHeadElement((org.jsoup.nodes.Element) document43);
        htmlTreeBuilder32.setHeadElement((org.jsoup.nodes.Element) document43);
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.insertInFosterParent((org.jsoup.nodes.Node) document43);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(htmlTreeBuilderState1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(element5);
        org.junit.Assert.assertNotNull(document10);
        org.junit.Assert.assertNotNull(document13);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(tag20);
        org.junit.Assert.assertTrue("'" + tokenType24 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType24.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertNotNull(element30);
        org.junit.Assert.assertNull(htmlTreeBuilderState33);
        org.junit.Assert.assertNull(htmlTreeBuilderState37);
        org.junit.Assert.assertNotNull(document43);
    }

    @Test
    public void test0385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0385");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document3 = xmlTreeBuilder0.parse("", "hi!");
        java.io.Reader reader4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document6 = xmlTreeBuilder0.parse(reader4, "</<![cdata[null]]>>");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String input must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document3);
    }

    @Test
    public void test0386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0386");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.generateImpliedEndTags();
        htmlTreeBuilder0.newPendingTableCharacters();
        boolean boolean3 = htmlTreeBuilder0.isFosterInserts();
        org.jsoup.nodes.FormElement formElement4 = null;
        htmlTreeBuilder0.setFormElement(formElement4);
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.clearFormattingElementsToLastMarker();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0387");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = null;
        htmlTreeBuilder0.transition(htmlTreeBuilderState1);
        org.jsoup.nodes.Element element3 = htmlTreeBuilder0.getHeadElement();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.originalState();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder5 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document8 = xmlTreeBuilder5.parse("<![CDATA[hi!]]>", " ");
        org.jsoup.parser.Token.CData cData10 = new org.jsoup.parser.Token.CData("hi!");
        xmlTreeBuilder5.insert((org.jsoup.parser.Token.Character) cData10);
        org.jsoup.parser.Token token12 = cData10.reset();
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.insert((org.jsoup.parser.Token.Character) cData10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(element3);
        org.junit.Assert.assertNull(htmlTreeBuilderState4);
        org.junit.Assert.assertNotNull(document8);
        org.junit.Assert.assertNotNull(token12);
    }

    @Test
    public void test0388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0388");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document3 = xmlTreeBuilder0.parse("<![CDATA[hi!]]>", " ");
        org.jsoup.parser.Token.CData cData5 = new org.jsoup.parser.Token.CData("hi!");
        xmlTreeBuilder0.insert((org.jsoup.parser.Token.Character) cData5);
        org.jsoup.parser.Token.Doctype doctype7 = new org.jsoup.parser.Token.Doctype();
        boolean boolean8 = doctype7.isEOF();
        boolean boolean9 = doctype7.isCharacter();
        boolean boolean10 = doctype7.isComment();
        xmlTreeBuilder0.insert(doctype7);
        org.jsoup.parser.Token.Comment comment12 = new org.jsoup.parser.Token.Comment();
        java.lang.String str13 = comment12.getData();
        xmlTreeBuilder0.insert(comment12);
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder16 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState17 = htmlTreeBuilder16.state();
        org.jsoup.nodes.FormElement formElement18 = null;
        htmlTreeBuilder16.setFormElement(formElement18);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder20 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document23 = xmlTreeBuilder20.parse("<![CDATA[hi!]]>", " ");
        htmlTreeBuilder16.setHeadElement((org.jsoup.nodes.Element) document23);
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder25 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState26 = htmlTreeBuilder25.state();
        org.jsoup.nodes.FormElement formElement27 = null;
        htmlTreeBuilder25.setFormElement(formElement27);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder29 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document32 = xmlTreeBuilder29.parse("<![CDATA[hi!]]>", " ");
        htmlTreeBuilder25.maybeSetBaseUri((org.jsoup.nodes.Element) document32);
        htmlTreeBuilder16.maybeSetBaseUri((org.jsoup.nodes.Element) document32);
        org.jsoup.nodes.Element element35 = htmlTreeBuilder16.getHeadElement();
        org.jsoup.parser.Parser parser37 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.jsoup.nodes.Node> nodeList38 = xmlTreeBuilder0.parseFragment("<![CDATA[StartTag]]>", element35, "<starttag>", parser37);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(htmlTreeBuilderState17);
        org.junit.Assert.assertNotNull(document23);
        org.junit.Assert.assertNull(htmlTreeBuilderState26);
        org.junit.Assert.assertNotNull(document32);
        org.junit.Assert.assertNotNull(element35);
    }

    @Test
    public void test0389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0389");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.state();
        org.jsoup.nodes.FormElement formElement2 = null;
        htmlTreeBuilder0.setFormElement(formElement2);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder4 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document7 = xmlTreeBuilder4.parse("<![CDATA[hi!]]>", " ");
        htmlTreeBuilder0.setHeadElement((org.jsoup.nodes.Element) document7);
        boolean boolean9 = htmlTreeBuilder0.isFragmentParsing();
        boolean boolean10 = htmlTreeBuilder0.framesetOk();
        htmlTreeBuilder0.setFosterInserts(false);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = htmlTreeBuilder0.inTableScope("Doctype");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(htmlTreeBuilderState1);
        org.junit.Assert.assertNotNull(document7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0390");
        org.jsoup.parser.ParseSettings parseSettings2 = new org.jsoup.parser.ParseSettings(true, false);
        boolean boolean3 = parseSettings2.preserveTagCase();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test0391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0391");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.state();
        org.jsoup.nodes.FormElement formElement2 = null;
        htmlTreeBuilder0.setFormElement(formElement2);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder4 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document7 = xmlTreeBuilder4.parse("<![CDATA[hi!]]>", " ");
        htmlTreeBuilder0.setHeadElement((org.jsoup.nodes.Element) document7);
        boolean boolean9 = htmlTreeBuilder0.isFragmentParsing();
        boolean boolean10 = htmlTreeBuilder0.framesetOk();
        htmlTreeBuilder0.setFosterInserts(false);
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder13 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState14 = htmlTreeBuilder13.state();
        org.jsoup.nodes.FormElement formElement15 = null;
        htmlTreeBuilder13.setFormElement(formElement15);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder17 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document20 = xmlTreeBuilder17.parse("<![CDATA[hi!]]>", " ");
        htmlTreeBuilder13.setHeadElement((org.jsoup.nodes.Element) document20);
        boolean boolean22 = htmlTreeBuilder13.isFragmentParsing();
        htmlTreeBuilder13.setFosterInserts(false);
        org.jsoup.nodes.Element element25 = htmlTreeBuilder13.getHeadElement();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder26 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState27 = htmlTreeBuilder26.state();
        org.jsoup.nodes.FormElement formElement28 = null;
        htmlTreeBuilder26.setFormElement(formElement28);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState30 = null;
        htmlTreeBuilder26.transition(htmlTreeBuilderState30);
        boolean boolean32 = htmlTreeBuilder26.isFosterInserts();
        org.jsoup.nodes.FormElement formElement33 = htmlTreeBuilder26.getFormElement();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder34 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState35 = htmlTreeBuilder34.state();
        org.jsoup.nodes.FormElement formElement36 = null;
        htmlTreeBuilder34.setFormElement(formElement36);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder38 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document41 = xmlTreeBuilder38.parse("<![CDATA[hi!]]>", " ");
        htmlTreeBuilder34.setHeadElement((org.jsoup.nodes.Element) document41);
        boolean boolean43 = htmlTreeBuilder34.isFragmentParsing();
        htmlTreeBuilder34.setFosterInserts(false);
        org.jsoup.nodes.Element element46 = htmlTreeBuilder34.getHeadElement();
        htmlTreeBuilder26.maybeSetBaseUri(element46);
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.insertOnStackAfter(element25, element46);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(htmlTreeBuilderState1);
        org.junit.Assert.assertNotNull(document7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(htmlTreeBuilderState14);
        org.junit.Assert.assertNotNull(document20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(element25);
        org.junit.Assert.assertNull(htmlTreeBuilderState27);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNull(formElement33);
        org.junit.Assert.assertNull(htmlTreeBuilderState35);
        org.junit.Assert.assertNotNull(document41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(element46);
    }

    @Test
    public void test0392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0392");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.state();
        org.jsoup.nodes.FormElement formElement2 = null;
        htmlTreeBuilder0.setFormElement(formElement2);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = null;
        htmlTreeBuilder0.transition(htmlTreeBuilderState4);
        boolean boolean6 = htmlTreeBuilder0.isFosterInserts();
        org.jsoup.nodes.FormElement formElement7 = htmlTreeBuilder0.getFormElement();
        htmlTreeBuilder0.generateImpliedEndTags();
        org.jsoup.parser.Token.Comment comment9 = null;
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.insert(comment9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(htmlTreeBuilderState1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(formElement7);
    }

    @Test
    public void test0393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0393");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.StringBuilder stringBuilder1 = doctype0.publicIdentifier;
        java.lang.String str2 = doctype0.getSystemIdentifier();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Comment comment3 = doctype0.asComment();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$Doctype cannot be cast to class org.jsoup.parser.Token$Comment (org.jsoup.parser.Token$Doctype and org.jsoup.parser.Token$Comment are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stringBuilder1);
        org.junit.Assert.assertEquals(stringBuilder1.toString(), "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test0394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0394");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = htmlTreeBuilder0.defaultSettings();
        htmlTreeBuilder0.setFosterInserts(true);
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder4 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState5 = htmlTreeBuilder4.state();
        org.jsoup.nodes.FormElement formElement6 = null;
        htmlTreeBuilder4.setFormElement(formElement6);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder8 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document11 = xmlTreeBuilder8.parse("<![CDATA[hi!]]>", " ");
        htmlTreeBuilder4.setHeadElement((org.jsoup.nodes.Element) document11);
        htmlTreeBuilder0.setHeadElement((org.jsoup.nodes.Element) document11);
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.generateImpliedEndTags("cdata");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings1);
        org.junit.Assert.assertNull(htmlTreeBuilderState5);
        org.junit.Assert.assertNotNull(document11);
    }

    @Test
    public void test0395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0395");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.state();
        org.jsoup.nodes.FormElement formElement2 = null;
        htmlTreeBuilder0.setFormElement(formElement2);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = null;
        htmlTreeBuilder0.transition(htmlTreeBuilderState4);
        boolean boolean6 = htmlTreeBuilder0.isFosterInserts();
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.resetInsertionMode();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(htmlTreeBuilderState1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0396");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.state();
        org.jsoup.nodes.FormElement formElement2 = null;
        htmlTreeBuilder0.setFormElement(formElement2);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder4 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document7 = xmlTreeBuilder4.parse("<![CDATA[hi!]]>", " ");
        htmlTreeBuilder0.setHeadElement((org.jsoup.nodes.Element) document7);
        boolean boolean9 = htmlTreeBuilder0.isFragmentParsing();
        boolean boolean10 = htmlTreeBuilder0.framesetOk();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState11 = null;
        htmlTreeBuilder0.transition(htmlTreeBuilderState11);
        java.util.List<java.lang.String> strList13 = htmlTreeBuilder0.getPendingTableCharacters();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder14 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document17 = xmlTreeBuilder14.parse("<![CDATA[hi!]]>", " ");
        org.jsoup.parser.Token.Comment comment18 = new org.jsoup.parser.Token.Comment();
        org.jsoup.parser.Token token19 = comment18.reset();
        boolean boolean20 = comment18.bogus;
        xmlTreeBuilder14.insert(comment18);
        org.jsoup.nodes.Document document24 = xmlTreeBuilder14.parse("StartTag", "< >");
        org.jsoup.nodes.Attributes attributes26 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor27 = attributes26.iterator();
        attributes26.normalize();
        org.jsoup.nodes.Attributes attributes31 = attributes26.put("", true);
        boolean boolean32 = xmlTreeBuilder14.processStartTag("<starttag>", attributes26);
        org.jsoup.parser.Token.Comment comment33 = new org.jsoup.parser.Token.Comment();
        org.jsoup.parser.Token token34 = comment33.reset();
        boolean boolean35 = comment33.bogus;
        comment33.bogus = true;
        boolean boolean38 = comment33.bogus;
        xmlTreeBuilder14.insert(comment33);
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.insert(comment33);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(htmlTreeBuilderState1);
        org.junit.Assert.assertNotNull(document7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(strList13);
        org.junit.Assert.assertNotNull(document17);
        org.junit.Assert.assertNotNull(token19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(document24);
        org.junit.Assert.assertNotNull(attributeItor27);
        org.junit.Assert.assertNotNull(attributes31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(token34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
    }

    @Test
    public void test0397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0397");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = null;
        htmlTreeBuilder0.transition(htmlTreeBuilderState1);
        org.jsoup.nodes.Element element3 = htmlTreeBuilder0.getHeadElement();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder4 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document7 = xmlTreeBuilder4.parse("", "hi!");
        org.jsoup.nodes.Document document10 = xmlTreeBuilder4.parse("<![CDATA[hi!]]>", "<!---->");
        org.jsoup.parser.Token.CData cData12 = new org.jsoup.parser.Token.CData("hi!");
        java.lang.String str13 = cData12.getData();
        boolean boolean14 = cData12.isCharacter();
        xmlTreeBuilder4.insert((org.jsoup.parser.Token.Character) cData12);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder16 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document19 = xmlTreeBuilder16.parse("", "hi!");
        org.jsoup.nodes.Document document22 = xmlTreeBuilder16.parse("<![CDATA[hi!]]>", "<!---->");
        org.jsoup.parser.Token.StartTag startTag23 = new org.jsoup.parser.Token.StartTag();
        startTag23.appendAttributeName(' ');
        boolean boolean26 = startTag23.selfClosing;
        startTag23.newAttribute();
        org.jsoup.parser.Token.Tag tag29 = startTag23.name("<![CDATA[null]]>");
        org.jsoup.parser.Token.StartTag startTag30 = new org.jsoup.parser.Token.StartTag();
        startTag30.appendAttributeValue("");
        org.jsoup.parser.Token.TokenType tokenType33 = org.jsoup.parser.Token.TokenType.Doctype;
        startTag30.type = tokenType33;
        startTag23.type = tokenType33;
        startTag23.newAttribute();
        startTag23.appendAttributeName("</<![CDATA[null]]>>");
        org.jsoup.nodes.Element element39 = xmlTreeBuilder16.insert(startTag23);
        startTag23.appendAttributeValue("</<![CDATA[null]]>>");
        boolean boolean42 = startTag23.isEOF();
        boolean boolean43 = startTag23.isSelfClosing();
        org.jsoup.nodes.Element element44 = xmlTreeBuilder4.insert(startTag23);
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.insert(element44);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(element3);
        org.junit.Assert.assertNotNull(document7);
        org.junit.Assert.assertNotNull(document10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(document19);
        org.junit.Assert.assertNotNull(document22);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(tag29);
        org.junit.Assert.assertTrue("'" + tokenType33 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType33.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertNotNull(element39);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(element44);
    }

    @Test
    public void test0398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0398");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.state();
        org.jsoup.nodes.FormElement formElement2 = null;
        htmlTreeBuilder0.setFormElement(formElement2);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder4 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document7 = xmlTreeBuilder4.parse("<![CDATA[hi!]]>", " ");
        htmlTreeBuilder0.setHeadElement((org.jsoup.nodes.Element) document7);
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder9 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState10 = htmlTreeBuilder9.state();
        org.jsoup.nodes.FormElement formElement11 = null;
        htmlTreeBuilder9.setFormElement(formElement11);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder13 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document16 = xmlTreeBuilder13.parse("<![CDATA[hi!]]>", " ");
        htmlTreeBuilder9.maybeSetBaseUri((org.jsoup.nodes.Element) document16);
        htmlTreeBuilder0.maybeSetBaseUri((org.jsoup.nodes.Element) document16);
        org.jsoup.nodes.Element element19 = htmlTreeBuilder0.getHeadElement();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder20 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings21 = htmlTreeBuilder20.defaultSettings();
        htmlTreeBuilder20.setFosterInserts(true);
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder24 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState25 = htmlTreeBuilder24.state();
        org.jsoup.nodes.FormElement formElement26 = null;
        htmlTreeBuilder24.setFormElement(formElement26);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder28 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document31 = xmlTreeBuilder28.parse("<![CDATA[hi!]]>", " ");
        htmlTreeBuilder24.setHeadElement((org.jsoup.nodes.Element) document31);
        htmlTreeBuilder20.setHeadElement((org.jsoup.nodes.Element) document31);
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.push((org.jsoup.nodes.Element) document31);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(htmlTreeBuilderState1);
        org.junit.Assert.assertNotNull(document7);
        org.junit.Assert.assertNull(htmlTreeBuilderState10);
        org.junit.Assert.assertNotNull(document16);
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertNotNull(parseSettings21);
        org.junit.Assert.assertNull(htmlTreeBuilderState25);
        org.junit.Assert.assertNotNull(document31);
    }

    @Test
    public void test0399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0399");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList1 = htmlTreeBuilder0.getStack();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder2 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState3 = htmlTreeBuilder2.state();
        org.jsoup.nodes.FormElement formElement4 = null;
        htmlTreeBuilder2.setFormElement(formElement4);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState6 = null;
        htmlTreeBuilder2.transition(htmlTreeBuilderState6);
        boolean boolean8 = htmlTreeBuilder2.isFosterInserts();
        org.jsoup.nodes.FormElement formElement9 = htmlTreeBuilder2.getFormElement();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder10 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState11 = htmlTreeBuilder10.state();
        org.jsoup.nodes.FormElement formElement12 = null;
        htmlTreeBuilder10.setFormElement(formElement12);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder14 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document17 = xmlTreeBuilder14.parse("<![CDATA[hi!]]>", " ");
        htmlTreeBuilder10.setHeadElement((org.jsoup.nodes.Element) document17);
        boolean boolean19 = htmlTreeBuilder10.isFragmentParsing();
        htmlTreeBuilder10.setFosterInserts(false);
        org.jsoup.nodes.Element element22 = htmlTreeBuilder10.getHeadElement();
        htmlTreeBuilder2.maybeSetBaseUri(element22);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder24 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document27 = xmlTreeBuilder24.parse("<![CDATA[hi!]]>", " ");
        org.jsoup.parser.Token.CData cData29 = new org.jsoup.parser.Token.CData("hi!");
        xmlTreeBuilder24.insert((org.jsoup.parser.Token.Character) cData29);
        org.jsoup.parser.Token.Doctype doctype31 = new org.jsoup.parser.Token.Doctype();
        boolean boolean32 = doctype31.isEOF();
        boolean boolean33 = doctype31.isCharacter();
        boolean boolean34 = doctype31.isComment();
        xmlTreeBuilder24.insert(doctype31);
        org.jsoup.parser.Token.Comment comment36 = new org.jsoup.parser.Token.Comment();
        java.lang.String str37 = comment36.getData();
        xmlTreeBuilder24.insert(comment36);
        org.jsoup.parser.Token.Doctype doctype39 = new org.jsoup.parser.Token.Doctype();
        boolean boolean40 = doctype39.isStartTag();
        java.lang.StringBuilder stringBuilder41 = doctype39.name;
        java.lang.StringBuilder stringBuilder42 = doctype39.publicIdentifier;
        xmlTreeBuilder24.insert(doctype39);
        org.jsoup.parser.ParseSettings parseSettings44 = xmlTreeBuilder24.defaultSettings();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder45 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document48 = xmlTreeBuilder45.parse("<![CDATA[hi!]]>", " ");
        org.jsoup.parser.Token.CData cData50 = new org.jsoup.parser.Token.CData("hi!");
        xmlTreeBuilder45.insert((org.jsoup.parser.Token.Character) cData50);
        xmlTreeBuilder24.insert((org.jsoup.parser.Token.Character) cData50);
        org.jsoup.parser.Token.Doctype doctype53 = new org.jsoup.parser.Token.Doctype();
        boolean boolean54 = doctype53.isEOF();
        boolean boolean55 = doctype53.isCharacter();
        doctype53.forceQuirks = false;
        boolean boolean58 = doctype53.isComment();
        boolean boolean59 = doctype53.forceQuirks;
        xmlTreeBuilder24.insert(doctype53);
        org.jsoup.nodes.Document document63 = xmlTreeBuilder24.parse("Doctype", "<starttag>");
        boolean boolean64 = htmlTreeBuilder2.isSpecial((org.jsoup.nodes.Element) document63);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element65 = htmlTreeBuilder0.aboveOnStack((org.jsoup.nodes.Element) document63);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(elementList1);
        org.junit.Assert.assertNull(htmlTreeBuilderState3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(formElement9);
        org.junit.Assert.assertNull(htmlTreeBuilderState11);
        org.junit.Assert.assertNotNull(document17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertNotNull(document27);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(stringBuilder41);
        org.junit.Assert.assertEquals(stringBuilder41.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder42);
        org.junit.Assert.assertEquals(stringBuilder42.toString(), "");
        org.junit.Assert.assertNotNull(parseSettings44);
        org.junit.Assert.assertNotNull(document48);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(document63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
    }

    @Test
    public void test0400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0400");
        org.jsoup.parser.ParseSettings parseSettings0 = org.jsoup.parser.ParseSettings.htmlDefault;
        org.jsoup.nodes.Attributes attributes1 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor2 = attributes1.iterator();
        org.jsoup.nodes.Attributes attributes3 = parseSettings0.normalizeAttributes(attributes1);
        boolean boolean4 = parseSettings0.preserveTagCase();
        org.jsoup.nodes.Attributes attributes5 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor6 = attributes5.iterator();
        org.jsoup.nodes.Attributes attributes7 = attributes5.clone();
        org.jsoup.nodes.Attributes attributes8 = parseSettings0.normalizeAttributes(attributes7);
        java.lang.String str9 = attributes7.toString();
        org.junit.Assert.assertNotNull(parseSettings0);
        org.junit.Assert.assertNotNull(attributeItor2);
        org.junit.Assert.assertNotNull(attributes3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(attributeItor6);
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(attributes8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0401");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.appendAttributeValue('a');
        boolean boolean3 = endTag0.isEOF();
        endTag0.appendAttributeValue("</<![cdata[null]]>>");
        boolean boolean6 = endTag0.isComment();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = endTag0.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must be false");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0402");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.generateImpliedEndTags();
        boolean boolean2 = htmlTreeBuilder0.isFosterInserts();
        org.jsoup.nodes.Element element3 = null;
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.maybeSetBaseUri(element3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0403");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.state();
        htmlTreeBuilder0.setFosterInserts(true);
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder4 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState5 = htmlTreeBuilder4.state();
        org.jsoup.nodes.FormElement formElement6 = null;
        htmlTreeBuilder4.setFormElement(formElement6);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder8 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document11 = xmlTreeBuilder8.parse("<![CDATA[hi!]]>", " ");
        htmlTreeBuilder4.setHeadElement((org.jsoup.nodes.Element) document11);
        htmlTreeBuilder0.setHeadElement((org.jsoup.nodes.Element) document11);
        htmlTreeBuilder0.newPendingTableCharacters();
        boolean boolean15 = htmlTreeBuilder0.isFragmentParsing();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element16 = htmlTreeBuilder0.removeLastFormattingElement();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(htmlTreeBuilderState1);
        org.junit.Assert.assertNull(htmlTreeBuilderState5);
        org.junit.Assert.assertNotNull(document11);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0404");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.state();
        org.jsoup.nodes.FormElement formElement2 = null;
        htmlTreeBuilder0.setFormElement(formElement2);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder4 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document7 = xmlTreeBuilder4.parse("<![CDATA[hi!]]>", " ");
        htmlTreeBuilder0.setHeadElement((org.jsoup.nodes.Element) document7);
        boolean boolean9 = htmlTreeBuilder0.isFragmentParsing();
        boolean boolean10 = htmlTreeBuilder0.framesetOk();
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.clearStackToTableBodyContext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(htmlTreeBuilderState1);
        org.junit.Assert.assertNotNull(document7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0405");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document3 = xmlTreeBuilder0.parse("", "hi!");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder4 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document7 = xmlTreeBuilder4.parse("<![CDATA[hi!]]>", " ");
        org.jsoup.parser.Token.Comment comment8 = new org.jsoup.parser.Token.Comment();
        org.jsoup.parser.Token token9 = comment8.reset();
        boolean boolean10 = comment8.bogus;
        xmlTreeBuilder4.insert(comment8);
        org.jsoup.nodes.Document document14 = xmlTreeBuilder4.parse("StartTag", "< >");
        org.jsoup.nodes.Attributes attributes16 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor17 = attributes16.iterator();
        attributes16.normalize();
        org.jsoup.nodes.Attributes attributes21 = attributes16.put("", true);
        boolean boolean22 = xmlTreeBuilder4.processStartTag("<starttag>", attributes16);
        org.jsoup.parser.Token.Comment comment23 = new org.jsoup.parser.Token.Comment();
        org.jsoup.parser.Token token24 = comment23.reset();
        boolean boolean25 = comment23.bogus;
        comment23.bogus = true;
        boolean boolean28 = comment23.bogus;
        xmlTreeBuilder4.insert(comment23);
        xmlTreeBuilder0.insert(comment23);
        org.jsoup.parser.Parser parser33 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.jsoup.nodes.Node> nodeList34 = xmlTreeBuilder0.parseFragment("<![CDATA[StartTag]]>", "</<![cdata[null]]>>", parser33);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(document7);
        org.junit.Assert.assertNotNull(token9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(document14);
        org.junit.Assert.assertNotNull(attributeItor17);
        org.junit.Assert.assertNotNull(attributes21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(token24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }

    @Test
    public void test0406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0406");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.state();
        htmlTreeBuilder0.setFosterInserts(true);
        boolean boolean4 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder5 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState6 = htmlTreeBuilder5.state();
        org.jsoup.nodes.FormElement formElement7 = null;
        htmlTreeBuilder5.setFormElement(formElement7);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder9 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document12 = xmlTreeBuilder9.parse("<![CDATA[hi!]]>", " ");
        htmlTreeBuilder5.setHeadElement((org.jsoup.nodes.Element) document12);
        org.jsoup.nodes.Element element14 = htmlTreeBuilder5.getHeadElement();
        htmlTreeBuilder0.setHeadElement(element14);
        htmlTreeBuilder0.framesetOk(false);
        java.lang.String[] strArray18 = org.jsoup.parser.HtmlTreeBuilder.TagSearchList;
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.popStackToClose(strArray18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(htmlTreeBuilderState1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(htmlTreeBuilderState6);
        org.junit.Assert.assertNotNull(document12);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertArrayEquals(strArray18, new java.lang.String[] { "ol", "ul" });
    }

    @Test
    public void test0407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0407");
        org.jsoup.parser.ParseSettings parseSettings0 = org.jsoup.parser.ParseSettings.htmlDefault;
        org.jsoup.nodes.Attributes attributes1 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor2 = attributes1.iterator();
        org.jsoup.nodes.Attributes attributes3 = parseSettings0.normalizeAttributes(attributes1);
        org.jsoup.nodes.Attributes attributes4 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor5 = attributes4.iterator();
        org.jsoup.nodes.Attributes attributes8 = attributes4.put("", false);
        org.jsoup.nodes.Attributes attributes9 = parseSettings0.normalizeAttributes(attributes8);
        java.lang.String str10 = attributes9.html();
        int int11 = attributes9.size();
        org.junit.Assert.assertNotNull(parseSettings0);
        org.junit.Assert.assertNotNull(attributeItor2);
        org.junit.Assert.assertNotNull(attributes3);
        org.junit.Assert.assertNotNull(attributeItor5);
        org.junit.Assert.assertNotNull(attributes8);
        org.junit.Assert.assertNotNull(attributes9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test0408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0408");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.appendAttributeName(' ');
        startTag0.appendTagName(' ');
        startTag0.normalName = "<![CDATA[hi!]]>";
        boolean boolean7 = startTag0.isCData();
        startTag0.appendTagName('a');
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0409");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "hi!";
        org.jsoup.parser.Token token3 = doctype0.reset();
        boolean boolean4 = doctype0.forceQuirks;
        java.lang.Class<?> wildcardClass5 = doctype0.getClass();
        org.junit.Assert.assertNotNull(token3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0410");
        org.jsoup.parser.Token.CData cData1 = new org.jsoup.parser.Token.CData("</<![CDATA[null]]>>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Doctype doctype2 = cData1.asDoctype();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$CData cannot be cast to class org.jsoup.parser.Token$Doctype (org.jsoup.parser.Token$CData and org.jsoup.parser.Token$Doctype are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0411");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.state();
        org.jsoup.nodes.FormElement formElement2 = null;
        htmlTreeBuilder0.setFormElement(formElement2);
        htmlTreeBuilder0.setFosterInserts(true);
        org.jsoup.parser.Token.CData cData7 = new org.jsoup.parser.Token.CData("hi!");
        org.jsoup.parser.Token token8 = cData7.reset();
        java.lang.String str9 = cData7.toString();
        org.jsoup.parser.Token.StartTag startTag10 = new org.jsoup.parser.Token.StartTag();
        startTag10.appendAttributeValue("");
        org.jsoup.parser.Token.TokenType tokenType13 = org.jsoup.parser.Token.TokenType.Doctype;
        startTag10.type = tokenType13;
        cData7.type = tokenType13;
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.insert((org.jsoup.parser.Token.Character) cData7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(htmlTreeBuilderState1);
        org.junit.Assert.assertNotNull(token8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<![CDATA[null]]>" + "'", str9, "<![CDATA[null]]>");
        org.junit.Assert.assertTrue("'" + tokenType13 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType13.equals(org.jsoup.parser.Token.TokenType.Doctype));
    }

    @Test
    public void test0412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0412");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.state();
        org.jsoup.nodes.FormElement formElement2 = null;
        htmlTreeBuilder0.setFormElement(formElement2);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.state();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState5 = null;
        htmlTreeBuilder0.transition(htmlTreeBuilderState5);
        org.jsoup.parser.Token.StartTag startTag7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element8 = htmlTreeBuilder0.insertEmpty(startTag7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(htmlTreeBuilderState1);
        org.junit.Assert.assertNull(htmlTreeBuilderState4);
    }

    @Test
    public void test0413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0413");
        org.jsoup.parser.ParseSettings parseSettings0 = org.jsoup.parser.ParseSettings.htmlDefault;
        org.jsoup.nodes.Attributes attributes1 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor2 = attributes1.iterator();
        org.jsoup.nodes.Attributes attributes3 = parseSettings0.normalizeAttributes(attributes1);
        java.lang.String str4 = attributes3.toString();
        java.lang.String str5 = attributes3.html();
        attributes3.normalize();
        java.lang.String str8 = attributes3.getIgnoreCase(" ");
        org.junit.Assert.assertNotNull(parseSettings0);
        org.junit.Assert.assertNotNull(attributeItor2);
        org.junit.Assert.assertNotNull(attributes3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0414");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.state();
        org.jsoup.nodes.FormElement formElement2 = null;
        htmlTreeBuilder0.setFormElement(formElement2);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.state();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element6 = htmlTreeBuilder0.getActiveFormattingElement("</<![cdata[null]]>>");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(htmlTreeBuilderState1);
        org.junit.Assert.assertNull(htmlTreeBuilderState4);
    }

    @Test
    public void test0415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0415");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        org.jsoup.parser.Token.Tag tag2 = endTag0.name("<![CDATA[null]]>");
        boolean boolean3 = endTag0.isSelfClosing();
        java.lang.String str4 = endTag0.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Character character5 = endTag0.asCharacter();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$EndTag cannot be cast to class org.jsoup.parser.Token$Character (org.jsoup.parser.Token$EndTag and org.jsoup.parser.Token$Character are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tag2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "</<![CDATA[null]]>>" + "'", str4, "</<![CDATA[null]]>>");
    }

    @Test
    public void test0416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0416");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.finaliseTag();
        startTag0.normalName = "";
        boolean boolean4 = startTag0.isDoctype();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Character character5 = startTag0.asCharacter();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$Character (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$Character are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0417");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document3 = xmlTreeBuilder0.parse("<![CDATA[hi!]]>", " ");
        org.jsoup.parser.Token.CData cData5 = new org.jsoup.parser.Token.CData("hi!");
        xmlTreeBuilder0.insert((org.jsoup.parser.Token.Character) cData5);
        org.jsoup.parser.Token.Doctype doctype7 = new org.jsoup.parser.Token.Doctype();
        boolean boolean8 = doctype7.isEOF();
        boolean boolean9 = doctype7.isCharacter();
        boolean boolean10 = doctype7.isComment();
        xmlTreeBuilder0.insert(doctype7);
        org.jsoup.parser.Token.Comment comment12 = new org.jsoup.parser.Token.Comment();
        java.lang.String str13 = comment12.getData();
        xmlTreeBuilder0.insert(comment12);
        org.jsoup.parser.ParseSettings parseSettings16 = org.jsoup.parser.ParseSettings.htmlDefault;
        org.jsoup.nodes.Attributes attributes17 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor18 = attributes17.iterator();
        org.jsoup.nodes.Attributes attributes19 = parseSettings16.normalizeAttributes(attributes17);
        attributes17.remove("hi!");
        org.jsoup.nodes.Attributes attributes22 = attributes17.clone();
        java.lang.String str23 = attributes17.html();
        boolean boolean24 = xmlTreeBuilder0.processStartTag("hi!", attributes17);
        org.jsoup.parser.Token.StartTag startTag25 = new org.jsoup.parser.Token.StartTag();
        startTag25.appendTagName("<![CDATA[null]]>");
        boolean boolean28 = startTag25.selfClosing;
        org.jsoup.parser.Token.StartTag startTag29 = startTag25.asStartTag();
        org.jsoup.parser.Token.StartTag startTag30 = new org.jsoup.parser.Token.StartTag();
        startTag30.appendAttributeName(' ');
        startTag30.normalName = "<![CDATA[null]]>";
        org.jsoup.parser.Token.StartTag startTag35 = new org.jsoup.parser.Token.StartTag();
        startTag35.appendAttributeName(' ');
        startTag35.appendTagName(' ');
        startTag35.newAttribute();
        boolean boolean41 = startTag35.selfClosing;
        startTag35.newAttribute();
        org.jsoup.nodes.Attributes attributes43 = startTag35.getAttributes();
        startTag30.attributes = attributes43;
        attributes43.remove("<![CDATA[null]]>");
        java.util.Map<java.lang.String, java.lang.String> strMap47 = attributes43.dataset();
        java.util.List<org.jsoup.nodes.Attribute> attributeList48 = attributes43.asList();
        startTag25.attributes = attributes43;
        boolean boolean50 = xmlTreeBuilder0.process((org.jsoup.parser.Token) startTag25);
        org.jsoup.nodes.Element element52 = null;
        org.jsoup.parser.Parser parser54 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.jsoup.nodes.Node> nodeList55 = xmlTreeBuilder0.parseFragment("CData", element52, "<<![CDATA[null]]>>", parser54);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(parseSettings16);
        org.junit.Assert.assertNotNull(attributeItor18);
        org.junit.Assert.assertNotNull(attributes19);
        org.junit.Assert.assertNotNull(attributes22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(startTag29);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(attributes43);
        org.junit.Assert.assertNotNull(strMap47);
        org.junit.Assert.assertNotNull(attributeList48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
    }

    @Test
    public void test0418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0418");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.state();
        org.jsoup.nodes.FormElement formElement2 = null;
        htmlTreeBuilder0.setFormElement(formElement2);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder4 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document7 = xmlTreeBuilder4.parse("<![CDATA[hi!]]>", " ");
        htmlTreeBuilder0.setHeadElement((org.jsoup.nodes.Element) document7);
        boolean boolean9 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState10 = htmlTreeBuilder0.originalState();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = htmlTreeBuilder0.inScope(" ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(htmlTreeBuilderState1);
        org.junit.Assert.assertNotNull(document7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(htmlTreeBuilderState10);
    }

    @Test
    public void test0419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0419");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = null;
        htmlTreeBuilder0.transition(htmlTreeBuilderState1);
        boolean boolean3 = htmlTreeBuilder0.framesetOk();
        java.lang.String str4 = htmlTreeBuilder0.getBaseUri();
        htmlTreeBuilder0.generateImpliedEndTags();
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.clearFormattingElementsToLastMarker();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test0420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0420");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.state();
        org.jsoup.nodes.FormElement formElement2 = null;
        htmlTreeBuilder0.setFormElement(formElement2);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = null;
        htmlTreeBuilder0.transition(htmlTreeBuilderState4);
        boolean boolean6 = htmlTreeBuilder0.isFosterInserts();
        org.jsoup.nodes.FormElement formElement7 = htmlTreeBuilder0.getFormElement();
        htmlTreeBuilder0.generateImpliedEndTags();
        org.jsoup.parser.Token.StartTag startTag9 = new org.jsoup.parser.Token.StartTag();
        startTag9.appendAttributeName(' ');
        startTag9.normalName = "<![CDATA[null]]>";
        org.jsoup.parser.Token.Tag tag15 = startTag9.name("");
        startTag9.appendTagName("<![cdata[null]]>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element18 = htmlTreeBuilder0.insertEmpty(startTag9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(htmlTreeBuilderState1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(formElement7);
        org.junit.Assert.assertNotNull(tag15);
    }

    @Test
    public void test0421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0421");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.state();
        org.jsoup.nodes.FormElement formElement2 = null;
        htmlTreeBuilder0.setFormElement(formElement2);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = null;
        htmlTreeBuilder0.transition(htmlTreeBuilderState4);
        org.jsoup.nodes.FormElement formElement6 = htmlTreeBuilder0.getFormElement();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState7 = htmlTreeBuilder0.state();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder8 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState9 = null;
        htmlTreeBuilder8.transition(htmlTreeBuilderState9);
        boolean boolean11 = htmlTreeBuilder8.framesetOk();
        java.lang.String str12 = htmlTreeBuilder8.getBaseUri();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder13 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState14 = htmlTreeBuilder13.state();
        htmlTreeBuilder13.setFosterInserts(true);
        boolean boolean17 = htmlTreeBuilder13.isFragmentParsing();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder18 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState19 = htmlTreeBuilder18.state();
        org.jsoup.nodes.FormElement formElement20 = null;
        htmlTreeBuilder18.setFormElement(formElement20);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder22 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document25 = xmlTreeBuilder22.parse("<![CDATA[hi!]]>", " ");
        htmlTreeBuilder18.setHeadElement((org.jsoup.nodes.Element) document25);
        org.jsoup.nodes.Element element27 = htmlTreeBuilder18.getHeadElement();
        htmlTreeBuilder13.setHeadElement(element27);
        htmlTreeBuilder8.setHeadElement(element27);
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.pushActiveFormattingElements(element27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(htmlTreeBuilderState1);
        org.junit.Assert.assertNull(formElement6);
        org.junit.Assert.assertNull(htmlTreeBuilderState7);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(htmlTreeBuilderState14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(htmlTreeBuilderState19);
        org.junit.Assert.assertNotNull(document25);
        org.junit.Assert.assertNotNull(element27);
    }

    @Test
    public void test0422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0422");
        org.jsoup.parser.ParseSettings parseSettings0 = org.jsoup.parser.ParseSettings.htmlDefault;
        org.jsoup.nodes.Attributes attributes1 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor2 = attributes1.iterator();
        org.jsoup.nodes.Attributes attributes3 = parseSettings0.normalizeAttributes(attributes1);
        org.jsoup.nodes.Attributes attributes4 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor5 = attributes4.iterator();
        attributes4.normalize();
        org.jsoup.nodes.Attributes attributes9 = attributes4.put("", true);
        attributes4.removeIgnoreCase("StartTag");
        org.jsoup.nodes.Attributes attributes12 = parseSettings0.normalizeAttributes(attributes4);
        java.lang.String str14 = parseSettings0.normalizeAttribute("<![CDATA[hi!]]>");
        org.junit.Assert.assertNotNull(parseSettings0);
        org.junit.Assert.assertNotNull(attributeItor2);
        org.junit.Assert.assertNotNull(attributes3);
        org.junit.Assert.assertNotNull(attributeItor5);
        org.junit.Assert.assertNotNull(attributes9);
        org.junit.Assert.assertNotNull(attributes12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "<![cdata[hi!]]>" + "'", str14, "<![cdata[hi!]]>");
    }

    @Test
    public void test0423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0423");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document3 = xmlTreeBuilder0.parse("", "hi!");
        org.jsoup.nodes.Document document6 = xmlTreeBuilder0.parse("<![CDATA[hi!]]>", "<!---->");
        org.jsoup.parser.Token.Doctype doctype7 = new org.jsoup.parser.Token.Doctype();
        java.lang.StringBuilder stringBuilder8 = doctype7.publicIdentifier;
        doctype7.forceQuirks = true;
        xmlTreeBuilder0.insert(doctype7);
        org.jsoup.parser.Token.Doctype doctype12 = new org.jsoup.parser.Token.Doctype();
        doctype12.pubSysKey = "hi!";
        org.jsoup.parser.Token token15 = doctype12.reset();
        xmlTreeBuilder0.insert(doctype12);
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder18 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState19 = htmlTreeBuilder18.state();
        htmlTreeBuilder18.setFosterInserts(true);
        boolean boolean22 = htmlTreeBuilder18.isFragmentParsing();
        org.jsoup.nodes.Element element23 = htmlTreeBuilder18.getHeadElement();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder24 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState25 = htmlTreeBuilder24.state();
        org.jsoup.nodes.FormElement formElement26 = null;
        htmlTreeBuilder24.setFormElement(formElement26);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder28 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document31 = xmlTreeBuilder28.parse("<![CDATA[hi!]]>", " ");
        htmlTreeBuilder24.setHeadElement((org.jsoup.nodes.Element) document31);
        boolean boolean33 = htmlTreeBuilder24.isFragmentParsing();
        htmlTreeBuilder24.setFosterInserts(false);
        org.jsoup.nodes.Element element36 = htmlTreeBuilder24.getHeadElement();
        htmlTreeBuilder18.maybeSetBaseUri(element36);
        org.jsoup.parser.Parser parser39 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.jsoup.nodes.Node> nodeList40 = xmlTreeBuilder0.parseFragment("<!---->", element36, "</<![cdata[null]]>>", parser39);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(document6);
        org.junit.Assert.assertNotNull(stringBuilder8);
        org.junit.Assert.assertEquals(stringBuilder8.toString(), "");
        org.junit.Assert.assertNotNull(token15);
        org.junit.Assert.assertNull(htmlTreeBuilderState19);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(element23);
        org.junit.Assert.assertNull(htmlTreeBuilderState25);
        org.junit.Assert.assertNotNull(document31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(element36);
    }

    @Test
    public void test0424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0424");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.generateImpliedEndTags();
        htmlTreeBuilder0.newPendingTableCharacters();
        boolean boolean3 = htmlTreeBuilder0.isFosterInserts();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder4 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState5 = htmlTreeBuilder4.state();
        org.jsoup.nodes.FormElement formElement6 = null;
        htmlTreeBuilder4.setFormElement(formElement6);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder8 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document11 = xmlTreeBuilder8.parse("", "hi!");
        org.jsoup.nodes.Document document14 = xmlTreeBuilder8.parse("<![CDATA[hi!]]>", "<!---->");
        boolean boolean15 = htmlTreeBuilder4.isSpecial((org.jsoup.nodes.Element) document14);
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.push((org.jsoup.nodes.Element) document14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(htmlTreeBuilderState5);
        org.junit.Assert.assertNotNull(document11);
        org.junit.Assert.assertNotNull(document14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0425");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.finaliseTag();
        startTag0.appendAttributeValue(' ');
        startTag0.selfClosing = true;
        java.lang.String str6 = startTag0.tagName;
        org.jsoup.parser.Token.Tag tag8 = startTag0.name("</<![CDATA[null]]>>");
        boolean boolean9 = tag8.selfClosing;
        tag8.appendTagName("<<![CDATA[null]]>>");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(tag8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0426");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.state();
        htmlTreeBuilder0.setFosterInserts(true);
        boolean boolean4 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder5 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState6 = htmlTreeBuilder5.state();
        org.jsoup.nodes.FormElement formElement7 = null;
        htmlTreeBuilder5.setFormElement(formElement7);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder9 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document12 = xmlTreeBuilder9.parse("<![CDATA[hi!]]>", " ");
        htmlTreeBuilder5.setHeadElement((org.jsoup.nodes.Element) document12);
        org.jsoup.nodes.Element element14 = htmlTreeBuilder5.getHeadElement();
        htmlTreeBuilder0.setHeadElement(element14);
        htmlTreeBuilder0.framesetOk(false);
        org.jsoup.nodes.FormElement formElement18 = null;
        htmlTreeBuilder0.setFormElement(formElement18);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState20 = null;
        htmlTreeBuilder0.transition(htmlTreeBuilderState20);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean23 = htmlTreeBuilder0.inSelectScope("starttag");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(htmlTreeBuilderState1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(htmlTreeBuilderState6);
        org.junit.Assert.assertNotNull(document12);
        org.junit.Assert.assertNotNull(element14);
    }

    @Test
    public void test0427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0427");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.state();
        org.jsoup.nodes.FormElement formElement2 = null;
        htmlTreeBuilder0.setFormElement(formElement2);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.state();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState5 = htmlTreeBuilder0.state();
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.clearStackToTableRowContext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(htmlTreeBuilderState1);
        org.junit.Assert.assertNull(htmlTreeBuilderState4);
        org.junit.Assert.assertNull(htmlTreeBuilderState5);
    }

    @Test
    public void test0428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0428");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.finaliseTag();
        startTag0.tagName = "";
        int[] intArray8 = new int[] { 0, (byte) 10, (short) 10, (short) 1 };
        startTag0.appendAttributeValue(intArray8);
        startTag0.finaliseTag();
        boolean boolean11 = startTag0.isCData();
        org.jsoup.parser.Token.Tag tag12 = startTag0.reset();
        boolean boolean13 = startTag0.isCharacter();
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertArrayEquals(intArray8, new int[] { 0, 10, 10, 1 });
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(tag12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0429");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.finaliseTag();
        startTag0.appendAttributeValue(' ');
        java.lang.String str4 = startTag0.tokenType();
        org.jsoup.nodes.Attributes attributes5 = startTag0.attributes;
        org.jsoup.parser.ParseSettings parseSettings6 = org.jsoup.parser.ParseSettings.htmlDefault;
        org.jsoup.nodes.Attributes attributes7 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor8 = attributes7.iterator();
        org.jsoup.nodes.Attributes attributes9 = parseSettings6.normalizeAttributes(attributes7);
        org.jsoup.nodes.Attributes attributes10 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor11 = attributes10.iterator();
        org.jsoup.nodes.Attributes attributes14 = attributes10.put("", false);
        org.jsoup.nodes.Attributes attributes15 = parseSettings6.normalizeAttributes(attributes14);
        startTag0.attributes = attributes14;
        java.lang.String str18 = attributes14.get("<![CDATA[hi!]]>");
        int int19 = attributes14.size();
        org.jsoup.parser.Token.EndTag endTag20 = new org.jsoup.parser.Token.EndTag();
        org.jsoup.parser.Token.Tag tag22 = endTag20.name("<![CDATA[null]]>");
        tag22.setEmptyAttributeValue();
        tag22.tagName = "</<![CDATA[null]]>>";
        boolean boolean26 = attributes14.equals((java.lang.Object) tag22);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "StartTag" + "'", str4, "StartTag");
        org.junit.Assert.assertNotNull(attributes5);
        org.junit.Assert.assertNotNull(parseSettings6);
        org.junit.Assert.assertNotNull(attributeItor8);
        org.junit.Assert.assertNotNull(attributes9);
        org.junit.Assert.assertNotNull(attributeItor11);
        org.junit.Assert.assertNotNull(attributes14);
        org.junit.Assert.assertNotNull(attributes15);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(tag22);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test0430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0430");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        org.jsoup.parser.Token token1 = comment0.reset();
        java.lang.String str2 = comment0.tokenType();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.StartTag startTag3 = comment0.asStartTag();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$Comment cannot be cast to class org.jsoup.parser.Token$StartTag (org.jsoup.parser.Token$Comment and org.jsoup.parser.Token$StartTag are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(token1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Comment" + "'", str2, "Comment");
    }

    @Test
    public void test0431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0431");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = null;
        htmlTreeBuilder0.transition(htmlTreeBuilderState1);
        boolean boolean3 = htmlTreeBuilder0.framesetOk();
        java.lang.String str4 = htmlTreeBuilder0.getBaseUri();
        htmlTreeBuilder0.generateImpliedEndTags();
        org.jsoup.nodes.FormElement formElement6 = null;
        htmlTreeBuilder0.setFormElement(formElement6);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = htmlTreeBuilder0.inListItemScope("<<![CDATA[null]]>>");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test0432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0432");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.state();
        org.jsoup.nodes.FormElement formElement2 = null;
        htmlTreeBuilder0.setFormElement(formElement2);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = null;
        htmlTreeBuilder0.transition(htmlTreeBuilderState4);
        boolean boolean6 = htmlTreeBuilder0.isFosterInserts();
        org.jsoup.nodes.FormElement formElement7 = htmlTreeBuilder0.getFormElement();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder8 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState9 = htmlTreeBuilder8.state();
        org.jsoup.nodes.FormElement formElement10 = null;
        htmlTreeBuilder8.setFormElement(formElement10);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder12 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document15 = xmlTreeBuilder12.parse("<![CDATA[hi!]]>", " ");
        htmlTreeBuilder8.setHeadElement((org.jsoup.nodes.Element) document15);
        boolean boolean17 = htmlTreeBuilder8.isFragmentParsing();
        htmlTreeBuilder8.setFosterInserts(false);
        org.jsoup.nodes.Element element20 = htmlTreeBuilder8.getHeadElement();
        htmlTreeBuilder0.maybeSetBaseUri(element20);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState22 = null;
        htmlTreeBuilder0.transition(htmlTreeBuilderState22);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState24 = null;
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.error(htmlTreeBuilderState24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(htmlTreeBuilderState1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(formElement7);
        org.junit.Assert.assertNull(htmlTreeBuilderState9);
        org.junit.Assert.assertNotNull(document15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(element20);
    }

    @Test
    public void test0433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0433");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = null;
        htmlTreeBuilder0.transition(htmlTreeBuilderState1);
        boolean boolean3 = htmlTreeBuilder0.framesetOk();
        java.lang.String str4 = htmlTreeBuilder0.getBaseUri();
        org.jsoup.nodes.Document document5 = htmlTreeBuilder0.getDocument();
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.generateImpliedEndTags("CData");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(document5);
    }

    @Test
    public void test0434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0434");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.state();
        org.jsoup.nodes.FormElement formElement2 = null;
        htmlTreeBuilder0.setFormElement(formElement2);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = null;
        htmlTreeBuilder0.transition(htmlTreeBuilderState4);
        boolean boolean6 = htmlTreeBuilder0.isFosterInserts();
        org.jsoup.nodes.FormElement formElement7 = htmlTreeBuilder0.getFormElement();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder9 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState10 = htmlTreeBuilder9.state();
        org.jsoup.nodes.FormElement formElement11 = null;
        htmlTreeBuilder9.setFormElement(formElement11);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder13 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document16 = xmlTreeBuilder13.parse("<![CDATA[hi!]]>", " ");
        htmlTreeBuilder9.setHeadElement((org.jsoup.nodes.Element) document16);
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder18 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState19 = htmlTreeBuilder18.state();
        org.jsoup.nodes.FormElement formElement20 = null;
        htmlTreeBuilder18.setFormElement(formElement20);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState22 = null;
        htmlTreeBuilder18.transition(htmlTreeBuilderState22);
        boolean boolean24 = htmlTreeBuilder18.isFosterInserts();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState25 = htmlTreeBuilder18.state();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder26 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document29 = xmlTreeBuilder26.parse("", "hi!");
        org.jsoup.nodes.Document document32 = xmlTreeBuilder26.parse("<![CDATA[hi!]]>", "<!---->");
        htmlTreeBuilder18.setHeadElement((org.jsoup.nodes.Element) document32);
        boolean boolean34 = htmlTreeBuilder9.isSpecial((org.jsoup.nodes.Element) document32);
        java.util.ArrayList<org.jsoup.nodes.Element> elementList35 = htmlTreeBuilder9.getStack();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder36 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState37 = htmlTreeBuilder36.state();
        org.jsoup.nodes.FormElement formElement38 = null;
        htmlTreeBuilder36.setFormElement(formElement38);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState40 = null;
        htmlTreeBuilder36.transition(htmlTreeBuilderState40);
        boolean boolean42 = htmlTreeBuilder36.isFosterInserts();
        org.jsoup.nodes.FormElement formElement43 = htmlTreeBuilder36.getFormElement();
        htmlTreeBuilder36.generateImpliedEndTags();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder45 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState46 = htmlTreeBuilder45.state();
        org.jsoup.nodes.FormElement formElement47 = null;
        htmlTreeBuilder45.setFormElement(formElement47);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder49 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document52 = xmlTreeBuilder49.parse("<![CDATA[hi!]]>", " ");
        htmlTreeBuilder45.setHeadElement((org.jsoup.nodes.Element) document52);
        boolean boolean54 = htmlTreeBuilder45.isFragmentParsing();
        htmlTreeBuilder45.setFosterInserts(false);
        org.jsoup.nodes.Element element57 = htmlTreeBuilder45.getHeadElement();
        htmlTreeBuilder36.setHeadElement(element57);
        boolean boolean59 = htmlTreeBuilder9.isSpecial(element57);
        org.jsoup.parser.Parser parser61 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.jsoup.nodes.Node> nodeList62 = htmlTreeBuilder0.parseFragment(" ", element57, "<![CDATA[</<![CDATA[null]]>>]]>", parser61);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(htmlTreeBuilderState1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(formElement7);
        org.junit.Assert.assertNull(htmlTreeBuilderState10);
        org.junit.Assert.assertNotNull(document16);
        org.junit.Assert.assertNull(htmlTreeBuilderState19);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(htmlTreeBuilderState25);
        org.junit.Assert.assertNotNull(document29);
        org.junit.Assert.assertNotNull(document32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNull(elementList35);
        org.junit.Assert.assertNull(htmlTreeBuilderState37);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNull(formElement43);
        org.junit.Assert.assertNull(htmlTreeBuilderState46);
        org.junit.Assert.assertNotNull(document52);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(element57);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
    }

    @Test
    public void test0435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0435");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.state();
        htmlTreeBuilder0.setFosterInserts(true);
        boolean boolean4 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder5 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState6 = htmlTreeBuilder5.state();
        org.jsoup.nodes.FormElement formElement7 = null;
        htmlTreeBuilder5.setFormElement(formElement7);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder9 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document12 = xmlTreeBuilder9.parse("<![CDATA[hi!]]>", " ");
        htmlTreeBuilder5.setHeadElement((org.jsoup.nodes.Element) document12);
        org.jsoup.nodes.Element element14 = htmlTreeBuilder5.getHeadElement();
        htmlTreeBuilder0.setHeadElement(element14);
        htmlTreeBuilder0.framesetOk(false);
        org.jsoup.nodes.FormElement formElement18 = null;
        htmlTreeBuilder0.setFormElement(formElement18);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState20 = null;
        htmlTreeBuilder0.transition(htmlTreeBuilderState20);
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.clearStackToTableRowContext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(htmlTreeBuilderState1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(htmlTreeBuilderState6);
        org.junit.Assert.assertNotNull(document12);
        org.junit.Assert.assertNotNull(element14);
    }

    @Test
    public void test0436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0436");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.state();
        org.jsoup.nodes.FormElement formElement2 = null;
        htmlTreeBuilder0.setFormElement(formElement2);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder4 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document7 = xmlTreeBuilder4.parse("<![CDATA[hi!]]>", " ");
        htmlTreeBuilder0.setHeadElement((org.jsoup.nodes.Element) document7);
        boolean boolean9 = htmlTreeBuilder0.isFragmentParsing();
        boolean boolean10 = htmlTreeBuilder0.framesetOk();
        htmlTreeBuilder0.setFosterInserts(false);
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.reconstructFormattingElements();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(htmlTreeBuilderState1);
        org.junit.Assert.assertNotNull(document7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0437");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = htmlTreeBuilder0.defaultSettings();
        htmlTreeBuilder0.setFosterInserts(true);
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder4 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState5 = htmlTreeBuilder4.state();
        org.jsoup.nodes.FormElement formElement6 = null;
        htmlTreeBuilder4.setFormElement(formElement6);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder8 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document11 = xmlTreeBuilder8.parse("<![CDATA[hi!]]>", " ");
        htmlTreeBuilder4.setHeadElement((org.jsoup.nodes.Element) document11);
        htmlTreeBuilder0.setHeadElement((org.jsoup.nodes.Element) document11);
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder14 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState15 = htmlTreeBuilder14.state();
        org.jsoup.nodes.FormElement formElement16 = null;
        htmlTreeBuilder14.setFormElement(formElement16);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState18 = htmlTreeBuilder14.state();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder19 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document22 = xmlTreeBuilder19.parse("", "hi!");
        org.jsoup.nodes.Document document25 = xmlTreeBuilder19.parse("<![CDATA[hi!]]>", "<!---->");
        boolean boolean26 = htmlTreeBuilder14.isSpecial((org.jsoup.nodes.Element) document25);
        boolean boolean27 = htmlTreeBuilder0.isSpecial((org.jsoup.nodes.Element) document25);
        org.jsoup.parser.Token.StartTag startTag28 = new org.jsoup.parser.Token.StartTag();
        startTag28.appendAttributeName(' ');
        boolean boolean31 = startTag28.selfClosing;
        startTag28.newAttribute();
        org.jsoup.parser.Token.Tag tag34 = startTag28.name("<![CDATA[null]]>");
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState35 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean36 = htmlTreeBuilder0.process((org.jsoup.parser.Token) tag34, htmlTreeBuilderState35);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings1);
        org.junit.Assert.assertNull(htmlTreeBuilderState5);
        org.junit.Assert.assertNotNull(document11);
        org.junit.Assert.assertNull(htmlTreeBuilderState15);
        org.junit.Assert.assertNull(htmlTreeBuilderState18);
        org.junit.Assert.assertNotNull(document22);
        org.junit.Assert.assertNotNull(document25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(tag34);
    }

    @Test
    public void test0438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0438");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.finaliseTag();
        startTag0.appendAttributeName('#');
        char[] charArray4 = new char[] {};
        startTag0.appendAttributeValue(charArray4);
        startTag0.appendTagName("starttag");
        boolean boolean8 = startTag0.isEOF();
        java.lang.String str9 = startTag0.toString();
        startTag0.appendAttributeValue('4');
        startTag0.appendAttributeName("<<![CDATA[null]]>>");
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<starttag>" + "'", str9, "<starttag>");
    }

    @Test
    public void test0439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0439");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.state();
        org.jsoup.nodes.FormElement formElement2 = null;
        htmlTreeBuilder0.setFormElement(formElement2);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder4 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document7 = xmlTreeBuilder4.parse("<![CDATA[hi!]]>", " ");
        htmlTreeBuilder0.setHeadElement((org.jsoup.nodes.Element) document7);
        boolean boolean9 = htmlTreeBuilder0.isFragmentParsing();
        htmlTreeBuilder0.setFosterInserts(false);
        org.jsoup.nodes.Document document12 = htmlTreeBuilder0.getDocument();
        boolean boolean13 = htmlTreeBuilder0.isFragmentParsing();
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.clearStackToTableBodyContext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(htmlTreeBuilderState1);
        org.junit.Assert.assertNotNull(document7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(document12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0440");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.finaliseTag();
        startTag0.tagName = "";
        org.jsoup.nodes.Attributes attributes4 = startTag0.attributes;
        org.jsoup.parser.Token.Doctype doctype5 = new org.jsoup.parser.Token.Doctype();
        boolean boolean6 = doctype5.isEOF();
        boolean boolean7 = doctype5.isCharacter();
        org.jsoup.parser.Token.TokenType tokenType8 = doctype5.type;
        startTag0.type = tokenType8;
        java.lang.String str10 = startTag0.normalName;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder12 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings13 = xmlTreeBuilder12.defaultSettings();
        org.jsoup.nodes.Attributes attributes14 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor15 = attributes14.iterator();
        org.jsoup.nodes.Attributes attributes18 = attributes14.put("", false);
        org.jsoup.nodes.Attributes attributes19 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor20 = attributes19.iterator();
        boolean boolean22 = attributes19.hasKey("hi!");
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator23 = attributes19.spliterator();
        attributes14.addAll(attributes19);
        org.jsoup.nodes.Attributes attributes25 = parseSettings13.normalizeAttributes(attributes14);
        org.jsoup.parser.Token.StartTag startTag26 = startTag0.nameAttr("StartTag", attributes14);
        org.jsoup.parser.ParseSettings parseSettings27 = org.jsoup.parser.ParseSettings.htmlDefault;
        org.jsoup.nodes.Attributes attributes28 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor29 = attributes28.iterator();
        org.jsoup.nodes.Attributes attributes30 = parseSettings27.normalizeAttributes(attributes28);
        attributes28.remove("hi!");
        org.jsoup.parser.Token.StartTag startTag33 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.TokenType tokenType34 = org.jsoup.parser.Token.TokenType.StartTag;
        startTag33.type = tokenType34;
        boolean boolean36 = attributes28.equals((java.lang.Object) startTag33);
        startTag0.attributes = attributes28;
        org.junit.Assert.assertNotNull(attributes4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + tokenType8 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType8.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(parseSettings13);
        org.junit.Assert.assertNotNull(attributeItor15);
        org.junit.Assert.assertNotNull(attributes18);
        org.junit.Assert.assertNotNull(attributeItor20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(attributeSpliterator23);
        org.junit.Assert.assertNotNull(attributes25);
        org.junit.Assert.assertNotNull(startTag26);
        org.junit.Assert.assertNotNull(parseSettings27);
        org.junit.Assert.assertNotNull(attributeItor29);
        org.junit.Assert.assertNotNull(attributes30);
        org.junit.Assert.assertTrue("'" + tokenType34 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType34.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test0441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0441");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList1 = htmlTreeBuilder0.getStack();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList2 = htmlTreeBuilder0.getStack();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder3 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder3.state();
        org.jsoup.nodes.FormElement formElement5 = null;
        htmlTreeBuilder3.setFormElement(formElement5);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder7 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document10 = xmlTreeBuilder7.parse("", "hi!");
        org.jsoup.nodes.Document document13 = xmlTreeBuilder7.parse("<![CDATA[hi!]]>", "<!---->");
        boolean boolean14 = htmlTreeBuilder3.isSpecial((org.jsoup.nodes.Element) document13);
        boolean boolean15 = htmlTreeBuilder0.isSpecial((org.jsoup.nodes.Element) document13);
        htmlTreeBuilder0.newPendingTableCharacters();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder17 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState18 = htmlTreeBuilder17.state();
        org.jsoup.nodes.FormElement formElement19 = null;
        htmlTreeBuilder17.setFormElement(formElement19);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState21 = htmlTreeBuilder17.state();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder22 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document25 = xmlTreeBuilder22.parse("", "hi!");
        org.jsoup.nodes.Document document28 = xmlTreeBuilder22.parse("<![CDATA[hi!]]>", "<!---->");
        boolean boolean29 = htmlTreeBuilder17.isSpecial((org.jsoup.nodes.Element) document28);
        boolean boolean30 = htmlTreeBuilder0.isSpecial((org.jsoup.nodes.Element) document28);
        java.lang.String[] strArray36 = new java.lang.String[] { "Doctype", "StartTag", "Comment", " " };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean37 = htmlTreeBuilder0.inScope("StartTag", strArray36);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(elementList1);
        org.junit.Assert.assertNull(elementList2);
        org.junit.Assert.assertNull(htmlTreeBuilderState4);
        org.junit.Assert.assertNotNull(document10);
        org.junit.Assert.assertNotNull(document13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(htmlTreeBuilderState18);
        org.junit.Assert.assertNull(htmlTreeBuilderState21);
        org.junit.Assert.assertNotNull(document25);
        org.junit.Assert.assertNotNull(document28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(strArray36);
        org.junit.Assert.assertArrayEquals(strArray36, new java.lang.String[] { "Doctype", "StartTag", "Comment", " " });
    }

    @Test
    public void test0442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0442");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.state();
        org.jsoup.nodes.FormElement formElement2 = null;
        htmlTreeBuilder0.setFormElement(formElement2);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder4 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document7 = xmlTreeBuilder4.parse("<![CDATA[hi!]]>", " ");
        htmlTreeBuilder0.setHeadElement((org.jsoup.nodes.Element) document7);
        boolean boolean9 = htmlTreeBuilder0.isFragmentParsing();
        htmlTreeBuilder0.setFosterInserts(false);
        org.jsoup.nodes.Element element12 = htmlTreeBuilder0.getHeadElement();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder13 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState14 = htmlTreeBuilder13.state();
        org.jsoup.nodes.FormElement formElement15 = null;
        htmlTreeBuilder13.setFormElement(formElement15);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder17 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document20 = xmlTreeBuilder17.parse("<![CDATA[hi!]]>", " ");
        htmlTreeBuilder13.setHeadElement((org.jsoup.nodes.Element) document20);
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder22 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState23 = htmlTreeBuilder22.state();
        org.jsoup.nodes.FormElement formElement24 = null;
        htmlTreeBuilder22.setFormElement(formElement24);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState26 = null;
        htmlTreeBuilder22.transition(htmlTreeBuilderState26);
        boolean boolean28 = htmlTreeBuilder22.isFosterInserts();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState29 = htmlTreeBuilder22.state();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder30 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document33 = xmlTreeBuilder30.parse("", "hi!");
        org.jsoup.nodes.Document document36 = xmlTreeBuilder30.parse("<![CDATA[hi!]]>", "<!---->");
        htmlTreeBuilder22.setHeadElement((org.jsoup.nodes.Element) document36);
        boolean boolean38 = htmlTreeBuilder13.isSpecial((org.jsoup.nodes.Element) document36);
        java.util.ArrayList<org.jsoup.nodes.Element> elementList39 = htmlTreeBuilder13.getStack();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder40 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState41 = htmlTreeBuilder40.state();
        org.jsoup.nodes.FormElement formElement42 = null;
        htmlTreeBuilder40.setFormElement(formElement42);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder44 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document47 = xmlTreeBuilder44.parse("<![CDATA[hi!]]>", " ");
        htmlTreeBuilder40.maybeSetBaseUri((org.jsoup.nodes.Element) document47);
        htmlTreeBuilder13.maybeSetBaseUri((org.jsoup.nodes.Element) document47);
        boolean boolean50 = htmlTreeBuilder0.isSpecial((org.jsoup.nodes.Element) document47);
        java.lang.String[] strArray51 = org.jsoup.parser.HtmlTreeBuilder.TagSearchSelectScope;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean52 = htmlTreeBuilder0.inScope(strArray51);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(htmlTreeBuilderState1);
        org.junit.Assert.assertNotNull(document7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNull(htmlTreeBuilderState14);
        org.junit.Assert.assertNotNull(document20);
        org.junit.Assert.assertNull(htmlTreeBuilderState23);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNull(htmlTreeBuilderState29);
        org.junit.Assert.assertNotNull(document33);
        org.junit.Assert.assertNotNull(document36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNull(elementList39);
        org.junit.Assert.assertNull(htmlTreeBuilderState41);
        org.junit.Assert.assertNotNull(document47);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(strArray51);
        org.junit.Assert.assertArrayEquals(strArray51, new java.lang.String[] { "optgroup", "option" });
    }

    @Test
    public void test0443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0443");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.state();
        htmlTreeBuilder0.setFosterInserts(true);
        boolean boolean4 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder5 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState6 = htmlTreeBuilder5.state();
        org.jsoup.nodes.FormElement formElement7 = null;
        htmlTreeBuilder5.setFormElement(formElement7);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder9 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document12 = xmlTreeBuilder9.parse("<![CDATA[hi!]]>", " ");
        htmlTreeBuilder5.setHeadElement((org.jsoup.nodes.Element) document12);
        org.jsoup.nodes.Element element14 = htmlTreeBuilder5.getHeadElement();
        htmlTreeBuilder0.setHeadElement(element14);
        org.jsoup.parser.Token token16 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = htmlTreeBuilder0.process(token16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(htmlTreeBuilderState1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(htmlTreeBuilderState6);
        org.junit.Assert.assertNotNull(document12);
        org.junit.Assert.assertNotNull(element14);
    }

    @Test
    public void test0444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0444");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.state();
        htmlTreeBuilder0.setFosterInserts(true);
        boolean boolean4 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder5 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState6 = htmlTreeBuilder5.state();
        org.jsoup.nodes.FormElement formElement7 = null;
        htmlTreeBuilder5.setFormElement(formElement7);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder9 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document12 = xmlTreeBuilder9.parse("<![CDATA[hi!]]>", " ");
        htmlTreeBuilder5.setHeadElement((org.jsoup.nodes.Element) document12);
        org.jsoup.nodes.Element element14 = htmlTreeBuilder5.getHeadElement();
        htmlTreeBuilder0.setHeadElement(element14);
        htmlTreeBuilder0.framesetOk(false);
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder18 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState19 = htmlTreeBuilder18.state();
        org.jsoup.nodes.FormElement formElement20 = null;
        htmlTreeBuilder18.setFormElement(formElement20);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState22 = null;
        htmlTreeBuilder18.transition(htmlTreeBuilderState22);
        boolean boolean24 = htmlTreeBuilder18.isFosterInserts();
        org.jsoup.nodes.FormElement formElement25 = htmlTreeBuilder18.getFormElement();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder26 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState27 = htmlTreeBuilder26.state();
        org.jsoup.nodes.FormElement formElement28 = null;
        htmlTreeBuilder26.setFormElement(formElement28);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder30 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document33 = xmlTreeBuilder30.parse("<![CDATA[hi!]]>", " ");
        htmlTreeBuilder26.setHeadElement((org.jsoup.nodes.Element) document33);
        boolean boolean35 = htmlTreeBuilder26.isFragmentParsing();
        htmlTreeBuilder26.setFosterInserts(false);
        org.jsoup.nodes.Element element38 = htmlTreeBuilder26.getHeadElement();
        htmlTreeBuilder18.maybeSetBaseUri(element38);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element40 = htmlTreeBuilder0.aboveOnStack(element38);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(htmlTreeBuilderState1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(htmlTreeBuilderState6);
        org.junit.Assert.assertNotNull(document12);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNull(htmlTreeBuilderState19);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(formElement25);
        org.junit.Assert.assertNull(htmlTreeBuilderState27);
        org.junit.Assert.assertNotNull(document33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(element38);
    }

    @Test
    public void test0445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0445");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.state();
        org.jsoup.nodes.FormElement formElement2 = null;
        htmlTreeBuilder0.setFormElement(formElement2);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder4 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document7 = xmlTreeBuilder4.parse("", "hi!");
        org.jsoup.nodes.Document document10 = xmlTreeBuilder4.parse("<![CDATA[hi!]]>", "<!---->");
        boolean boolean11 = htmlTreeBuilder0.isSpecial((org.jsoup.nodes.Element) document10);
        boolean boolean12 = htmlTreeBuilder0.framesetOk();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder13 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document16 = xmlTreeBuilder13.parse("<![CDATA[hi!]]>", " ");
        org.jsoup.parser.Token.Comment comment17 = new org.jsoup.parser.Token.Comment();
        org.jsoup.parser.Token token18 = comment17.reset();
        boolean boolean19 = comment17.bogus;
        xmlTreeBuilder13.insert(comment17);
        org.jsoup.nodes.Document document23 = xmlTreeBuilder13.parse("StartTag", "< >");
        boolean boolean24 = htmlTreeBuilder0.isSpecial((org.jsoup.nodes.Element) document23);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean26 = htmlTreeBuilder0.inScope("Comment");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(htmlTreeBuilderState1);
        org.junit.Assert.assertNotNull(document7);
        org.junit.Assert.assertNotNull(document10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(document16);
        org.junit.Assert.assertNotNull(token18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(document23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test0446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0446");
        org.jsoup.parser.ParseSettings parseSettings0 = org.jsoup.parser.ParseSettings.htmlDefault;
        org.jsoup.nodes.Attributes attributes1 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor2 = attributes1.iterator();
        org.jsoup.nodes.Attributes attributes3 = parseSettings0.normalizeAttributes(attributes1);
        org.jsoup.nodes.Attributes attributes6 = attributes3.put("<![cdata[null]]>", "hi!");
        org.jsoup.nodes.Attributes attributes9 = attributes3.put("< >", "</<![CDATA[null]]>>");
        org.jsoup.nodes.Attributes attributes12 = attributes3.put("</<![CDATA[null]]>>", false);
        org.junit.Assert.assertNotNull(parseSettings0);
        org.junit.Assert.assertNotNull(attributeItor2);
        org.junit.Assert.assertNotNull(attributes3);
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertNotNull(attributes9);
        org.junit.Assert.assertNotNull(attributes12);
    }

    @Test
    public void test0447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0447");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.appendAttributeName(' ');
        startTag0.appendTagName(' ');
        startTag0.normalName = "<![CDATA[hi!]]>";
        org.jsoup.parser.Token token7 = startTag0.reset();
        java.lang.String str8 = startTag0.tagName;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = startTag0.name();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must be false");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(token7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test0448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0448");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.state();
        htmlTreeBuilder0.setFosterInserts(true);
        boolean boolean4 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.nodes.Element element5 = htmlTreeBuilder0.getHeadElement();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder6 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState7 = htmlTreeBuilder6.state();
        org.jsoup.nodes.FormElement formElement8 = null;
        htmlTreeBuilder6.setFormElement(formElement8);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder10 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document13 = xmlTreeBuilder10.parse("<![CDATA[hi!]]>", " ");
        htmlTreeBuilder6.setHeadElement((org.jsoup.nodes.Element) document13);
        boolean boolean15 = htmlTreeBuilder6.isFragmentParsing();
        htmlTreeBuilder6.setFosterInserts(false);
        org.jsoup.nodes.Element element18 = htmlTreeBuilder6.getHeadElement();
        htmlTreeBuilder0.maybeSetBaseUri(element18);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState20 = null;
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.error(htmlTreeBuilderState20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(htmlTreeBuilderState1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(element5);
        org.junit.Assert.assertNull(htmlTreeBuilderState7);
        org.junit.Assert.assertNotNull(document13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(element18);
    }

    @Test
    public void test0449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0449");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor1 = attributes0.iterator();
        org.jsoup.nodes.Attributes attributes4 = attributes0.put("", false);
        org.jsoup.nodes.Attributes attributes5 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor6 = attributes5.iterator();
        boolean boolean8 = attributes5.hasKey("hi!");
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator9 = attributes5.spliterator();
        attributes0.addAll(attributes5);
        java.lang.String str12 = attributes0.getIgnoreCase("<![cdata[null]]>");
        java.lang.String str14 = attributes0.get("<![CDATA[null]]>");
        org.jsoup.nodes.Attribute attribute15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Attributes attributes16 = attributes0.put(attribute15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(attributeItor1);
        org.junit.Assert.assertNotNull(attributes4);
        org.junit.Assert.assertNotNull(attributeItor6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(attributeSpliterator9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test0450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0450");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.state();
        org.jsoup.nodes.FormElement formElement2 = null;
        htmlTreeBuilder0.setFormElement(formElement2);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.state();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState5 = null;
        htmlTreeBuilder0.transition(htmlTreeBuilderState5);
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder7 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState8 = null;
        htmlTreeBuilder7.transition(htmlTreeBuilderState8);
        boolean boolean10 = htmlTreeBuilder7.framesetOk();
        java.lang.String str11 = htmlTreeBuilder7.getBaseUri();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder12 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState13 = htmlTreeBuilder12.state();
        htmlTreeBuilder12.setFosterInserts(true);
        boolean boolean16 = htmlTreeBuilder12.isFragmentParsing();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder17 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState18 = htmlTreeBuilder17.state();
        org.jsoup.nodes.FormElement formElement19 = null;
        htmlTreeBuilder17.setFormElement(formElement19);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder21 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document24 = xmlTreeBuilder21.parse("<![CDATA[hi!]]>", " ");
        htmlTreeBuilder17.setHeadElement((org.jsoup.nodes.Element) document24);
        org.jsoup.nodes.Element element26 = htmlTreeBuilder17.getHeadElement();
        htmlTreeBuilder12.setHeadElement(element26);
        htmlTreeBuilder7.setHeadElement(element26);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element29 = htmlTreeBuilder0.aboveOnStack(element26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(htmlTreeBuilderState1);
        org.junit.Assert.assertNull(htmlTreeBuilderState4);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(htmlTreeBuilderState13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(htmlTreeBuilderState18);
        org.junit.Assert.assertNotNull(document24);
        org.junit.Assert.assertNotNull(element26);
    }

    @Test
    public void test0451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0451");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = null;
        htmlTreeBuilder0.transition(htmlTreeBuilderState1);
        boolean boolean3 = htmlTreeBuilder0.framesetOk();
        java.lang.String str4 = htmlTreeBuilder0.getBaseUri();
        org.jsoup.nodes.Element element5 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = htmlTreeBuilder0.onStack(element5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test0452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0452");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.finaliseTag();
        startTag0.normalName = "";
        boolean boolean4 = startTag0.isDoctype();
        org.jsoup.parser.Token.StartTag startTag5 = new org.jsoup.parser.Token.StartTag();
        startTag5.appendAttributeValue("");
        org.jsoup.parser.Token.TokenType tokenType8 = org.jsoup.parser.Token.TokenType.Doctype;
        startTag5.type = tokenType8;
        startTag0.type = tokenType8;
        org.jsoup.parser.Token.StartTag startTag11 = new org.jsoup.parser.Token.StartTag();
        startTag11.finaliseTag();
        startTag11.tagName = "";
        int[] intArray19 = new int[] { 0, (byte) 10, (short) 10, (short) 1 };
        startTag11.appendAttributeValue(intArray19);
        startTag0.appendAttributeValue(intArray19);
        org.jsoup.nodes.Attributes attributes23 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor24 = attributes23.iterator();
        attributes23.normalize();
        org.jsoup.nodes.Attributes attributes28 = attributes23.put("", true);
        org.jsoup.parser.Token.StartTag startTag29 = startTag0.nameAttr("hi!", attributes28);
        attributes28.removeIgnoreCase("starttag");
        attributes28.removeIgnoreCase("StartTag");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + tokenType8 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType8.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertArrayEquals(intArray19, new int[] { 0, 10, 10, 1 });
        org.junit.Assert.assertNotNull(attributeItor24);
        org.junit.Assert.assertNotNull(attributes28);
        org.junit.Assert.assertNotNull(startTag29);
    }

    @Test
    public void test0453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0453");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        doctype0.pubSysKey = "hi!";
        org.jsoup.parser.Token token3 = doctype0.reset();
        boolean boolean4 = doctype0.forceQuirks;
        java.lang.String str5 = doctype0.getSystemIdentifier();
        java.lang.String str6 = doctype0.pubSysKey;
        org.junit.Assert.assertNotNull(token3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test0454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0454");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        boolean boolean1 = doctype0.isStartTag();
        java.lang.StringBuilder stringBuilder2 = doctype0.name;
        doctype0.pubSysKey = "hi!";
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
    }

    @Test
    public void test0455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0455");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.state();
        htmlTreeBuilder0.setFosterInserts(true);
        boolean boolean4 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.nodes.Element element5 = htmlTreeBuilder0.getHeadElement();
        htmlTreeBuilder0.markInsertionMode();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder7 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document10 = xmlTreeBuilder7.parse("", "hi!");
        org.jsoup.nodes.Document document13 = xmlTreeBuilder7.parse("<![CDATA[hi!]]>", "<!---->");
        org.jsoup.parser.Token.StartTag startTag14 = new org.jsoup.parser.Token.StartTag();
        startTag14.appendAttributeName(' ');
        boolean boolean17 = startTag14.selfClosing;
        startTag14.newAttribute();
        org.jsoup.parser.Token.Tag tag20 = startTag14.name("<![CDATA[null]]>");
        org.jsoup.parser.Token.StartTag startTag21 = new org.jsoup.parser.Token.StartTag();
        startTag21.appendAttributeValue("");
        org.jsoup.parser.Token.TokenType tokenType24 = org.jsoup.parser.Token.TokenType.Doctype;
        startTag21.type = tokenType24;
        startTag14.type = tokenType24;
        startTag14.newAttribute();
        startTag14.appendAttributeName("</<![CDATA[null]]>>");
        org.jsoup.nodes.Element element30 = xmlTreeBuilder7.insert(startTag14);
        htmlTreeBuilder0.maybeSetBaseUri(element30);
        java.util.List<java.lang.String> strList32 = htmlTreeBuilder0.getPendingTableCharacters();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder33 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState34 = htmlTreeBuilder33.state();
        org.jsoup.nodes.FormElement formElement35 = null;
        htmlTreeBuilder33.setFormElement(formElement35);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder37 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document40 = xmlTreeBuilder37.parse("", "hi!");
        org.jsoup.nodes.Document document43 = xmlTreeBuilder37.parse("<![CDATA[hi!]]>", "<!---->");
        boolean boolean44 = htmlTreeBuilder33.isSpecial((org.jsoup.nodes.Element) document43);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder45 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document48 = xmlTreeBuilder45.parse("<![CDATA[hi!]]>", " ");
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.replaceOnStack((org.jsoup.nodes.Element) document43, (org.jsoup.nodes.Element) document48);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(htmlTreeBuilderState1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(element5);
        org.junit.Assert.assertNotNull(document10);
        org.junit.Assert.assertNotNull(document13);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(tag20);
        org.junit.Assert.assertTrue("'" + tokenType24 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType24.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertNotNull(element30);
        org.junit.Assert.assertNull(strList32);
        org.junit.Assert.assertNull(htmlTreeBuilderState34);
        org.junit.Assert.assertNotNull(document40);
        org.junit.Assert.assertNotNull(document43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(document48);
    }

    @Test
    public void test0456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0456");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList1 = htmlTreeBuilder0.getStack();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState2 = null;
        htmlTreeBuilder0.transition(htmlTreeBuilderState2);
        org.jsoup.parser.ParseSettings parseSettings4 = htmlTreeBuilder0.defaultSettings();
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.clearStackToTableContext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(elementList1);
        org.junit.Assert.assertNotNull(parseSettings4);
    }

    @Test
    public void test0457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0457");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.state();
        org.jsoup.nodes.FormElement formElement2 = null;
        htmlTreeBuilder0.setFormElement(formElement2);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder4 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document7 = xmlTreeBuilder4.parse("<![CDATA[hi!]]>", " ");
        htmlTreeBuilder0.setHeadElement((org.jsoup.nodes.Element) document7);
        boolean boolean9 = htmlTreeBuilder0.isFragmentParsing();
        htmlTreeBuilder0.setFosterInserts(false);
        org.jsoup.nodes.Document document12 = htmlTreeBuilder0.getDocument();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder13 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState14 = htmlTreeBuilder13.state();
        org.jsoup.nodes.FormElement formElement15 = null;
        htmlTreeBuilder13.setFormElement(formElement15);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState17 = null;
        htmlTreeBuilder13.transition(htmlTreeBuilderState17);
        boolean boolean19 = htmlTreeBuilder13.isFosterInserts();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState20 = htmlTreeBuilder13.state();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder21 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState22 = htmlTreeBuilder21.state();
        org.jsoup.nodes.FormElement formElement23 = null;
        htmlTreeBuilder21.setFormElement(formElement23);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState25 = null;
        htmlTreeBuilder21.transition(htmlTreeBuilderState25);
        boolean boolean27 = htmlTreeBuilder21.isFosterInserts();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState28 = htmlTreeBuilder21.state();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder29 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document32 = xmlTreeBuilder29.parse("", "hi!");
        org.jsoup.nodes.Document document35 = xmlTreeBuilder29.parse("<![CDATA[hi!]]>", "<!---->");
        htmlTreeBuilder21.setHeadElement((org.jsoup.nodes.Element) document35);
        boolean boolean37 = htmlTreeBuilder13.isSpecial((org.jsoup.nodes.Element) document35);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean38 = htmlTreeBuilder0.isInActiveFormattingElements((org.jsoup.nodes.Element) document35);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(htmlTreeBuilderState1);
        org.junit.Assert.assertNotNull(document7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(document12);
        org.junit.Assert.assertNull(htmlTreeBuilderState14);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(htmlTreeBuilderState20);
        org.junit.Assert.assertNull(htmlTreeBuilderState22);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNull(htmlTreeBuilderState28);
        org.junit.Assert.assertNotNull(document32);
        org.junit.Assert.assertNotNull(document35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
    }

    @Test
    public void test0458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0458");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.state();
        org.jsoup.nodes.FormElement formElement2 = null;
        htmlTreeBuilder0.setFormElement(formElement2);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder4 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document7 = xmlTreeBuilder4.parse("<![CDATA[hi!]]>", " ");
        htmlTreeBuilder0.setHeadElement((org.jsoup.nodes.Element) document7);
        org.jsoup.nodes.Element element9 = htmlTreeBuilder0.getHeadElement();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = htmlTreeBuilder0.inTableScope("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(htmlTreeBuilderState1);
        org.junit.Assert.assertNotNull(document7);
        org.junit.Assert.assertNotNull(element9);
    }

    @Test
    public void test0459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0459");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.state();
        htmlTreeBuilder0.setFosterInserts(true);
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder4 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState5 = htmlTreeBuilder4.state();
        org.jsoup.nodes.FormElement formElement6 = null;
        htmlTreeBuilder4.setFormElement(formElement6);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder8 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document11 = xmlTreeBuilder8.parse("<![CDATA[hi!]]>", " ");
        htmlTreeBuilder4.setHeadElement((org.jsoup.nodes.Element) document11);
        htmlTreeBuilder0.setHeadElement((org.jsoup.nodes.Element) document11);
        org.jsoup.nodes.FormElement formElement14 = null;
        htmlTreeBuilder0.setFormElement(formElement14);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = htmlTreeBuilder0.inTableScope("<![CDATA[StartTag]]>");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(htmlTreeBuilderState1);
        org.junit.Assert.assertNull(htmlTreeBuilderState5);
        org.junit.Assert.assertNotNull(document11);
    }

    @Test
    public void test0460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0460");
        org.jsoup.parser.ParseSettings parseSettings0 = org.jsoup.parser.ParseSettings.htmlDefault;
        org.jsoup.nodes.Attributes attributes1 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor2 = attributes1.iterator();
        org.jsoup.nodes.Attributes attributes3 = parseSettings0.normalizeAttributes(attributes1);
        org.jsoup.nodes.Attribute attribute4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Attributes attributes5 = attributes3.put(attribute4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings0);
        org.junit.Assert.assertNotNull(attributeItor2);
        org.junit.Assert.assertNotNull(attributes3);
    }

    @Test
    public void test0461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0461");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.generateImpliedEndTags();
        htmlTreeBuilder0.newPendingTableCharacters();
        boolean boolean3 = htmlTreeBuilder0.isFosterInserts();
        org.jsoup.parser.Token.StartTag startTag4 = new org.jsoup.parser.Token.StartTag();
        startTag4.finaliseTag();
        startTag4.tagName = "";
        int[] intArray12 = new int[] { 0, (byte) 10, (short) 10, (short) 1 };
        startTag4.appendAttributeValue(intArray12);
        startTag4.finaliseTag();
        boolean boolean15 = startTag4.isEndTag();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element16 = htmlTreeBuilder0.insert(startTag4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must be false");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertArrayEquals(intArray12, new int[] { 0, 10, 10, 1 });
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0462");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.state();
        org.jsoup.nodes.FormElement formElement2 = null;
        htmlTreeBuilder0.setFormElement(formElement2);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder4 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document7 = xmlTreeBuilder4.parse("", "hi!");
        org.jsoup.nodes.Document document10 = xmlTreeBuilder4.parse("<![CDATA[hi!]]>", "<!---->");
        boolean boolean11 = htmlTreeBuilder0.isSpecial((org.jsoup.nodes.Element) document10);
        boolean boolean12 = htmlTreeBuilder0.framesetOk();
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.insertMarkerToFormattingElements();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(htmlTreeBuilderState1);
        org.junit.Assert.assertNotNull(document7);
        org.junit.Assert.assertNotNull(document10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0463");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        java.lang.StringBuilder stringBuilder1 = comment0.data;
        org.jsoup.parser.Token.reset(stringBuilder1);
        org.jsoup.parser.Token.reset(stringBuilder1);
        org.junit.Assert.assertNotNull(stringBuilder1);
        org.junit.Assert.assertEquals(stringBuilder1.toString(), "");
    }

    @Test
    public void test0464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0464");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.finaliseTag();
        java.lang.String str2 = startTag0.normalName();
        org.jsoup.nodes.Attributes attributes3 = startTag0.attributes;
        int int4 = attributes3.size();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(attributes3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test0465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0465");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.state();
        htmlTreeBuilder0.setFosterInserts(true);
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder4 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState5 = htmlTreeBuilder4.state();
        org.jsoup.nodes.FormElement formElement6 = null;
        htmlTreeBuilder4.setFormElement(formElement6);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder8 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document11 = xmlTreeBuilder8.parse("<![CDATA[hi!]]>", " ");
        htmlTreeBuilder4.setHeadElement((org.jsoup.nodes.Element) document11);
        htmlTreeBuilder0.setHeadElement((org.jsoup.nodes.Element) document11);
        htmlTreeBuilder0.newPendingTableCharacters();
        org.jsoup.nodes.FormElement formElement15 = null;
        htmlTreeBuilder0.setFormElement(formElement15);
        htmlTreeBuilder0.generateImpliedEndTags();
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.clearStackToTableRowContext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(htmlTreeBuilderState1);
        org.junit.Assert.assertNull(htmlTreeBuilderState5);
        org.junit.Assert.assertNotNull(document11);
    }

    @Test
    public void test0466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0466");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = null;
        htmlTreeBuilder0.transition(htmlTreeBuilderState1);
        org.jsoup.parser.Token.StartTag startTag3 = new org.jsoup.parser.Token.StartTag();
        startTag3.finaliseTag();
        org.jsoup.nodes.Attributes attributes5 = startTag3.attributes;
        boolean boolean6 = startTag3.isStartTag();
        org.jsoup.parser.Token.StartTag startTag7 = new org.jsoup.parser.Token.StartTag();
        startTag7.finaliseTag();
        org.jsoup.parser.Token.StartTag startTag9 = new org.jsoup.parser.Token.StartTag();
        startTag9.finaliseTag();
        startTag9.tagName = "";
        org.jsoup.nodes.Attributes attributes13 = startTag9.attributes;
        org.jsoup.parser.Token.Tag tag15 = startTag9.name("hi!");
        org.jsoup.parser.Token.StartTag startTag16 = new org.jsoup.parser.Token.StartTag();
        startTag16.finaliseTag();
        startTag16.tagName = "";
        int[] intArray24 = new int[] { 0, (byte) 10, (short) 10, (short) 1 };
        startTag16.appendAttributeValue(intArray24);
        tag15.appendAttributeValue(intArray24);
        startTag7.appendAttributeValue(intArray24);
        startTag3.appendAttributeValue(intArray24);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element29 = htmlTreeBuilder0.insert(startTag3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must be false");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(attributes5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(attributes13);
        org.junit.Assert.assertNotNull(tag15);
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertArrayEquals(intArray24, new int[] { 0, 10, 10, 1 });
    }

    @Test
    public void test0467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0467");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.state();
        htmlTreeBuilder0.setFosterInserts(true);
        boolean boolean4 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.nodes.Element element5 = htmlTreeBuilder0.getHeadElement();
        htmlTreeBuilder0.markInsertionMode();
        htmlTreeBuilder0.framesetOk(true);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder9 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document12 = xmlTreeBuilder9.parse("<![CDATA[hi!]]>", " ");
        org.jsoup.parser.Token.CData cData14 = new org.jsoup.parser.Token.CData("hi!");
        xmlTreeBuilder9.insert((org.jsoup.parser.Token.Character) cData14);
        org.jsoup.parser.Token.Doctype doctype16 = new org.jsoup.parser.Token.Doctype();
        boolean boolean17 = doctype16.isEOF();
        boolean boolean18 = doctype16.isCharacter();
        boolean boolean19 = doctype16.isComment();
        xmlTreeBuilder9.insert(doctype16);
        org.jsoup.parser.Token.Comment comment21 = new org.jsoup.parser.Token.Comment();
        java.lang.String str22 = comment21.getData();
        xmlTreeBuilder9.insert(comment21);
        org.jsoup.parser.Token.Doctype doctype24 = new org.jsoup.parser.Token.Doctype();
        boolean boolean25 = doctype24.isStartTag();
        java.lang.StringBuilder stringBuilder26 = doctype24.name;
        java.lang.StringBuilder stringBuilder27 = doctype24.publicIdentifier;
        xmlTreeBuilder9.insert(doctype24);
        org.jsoup.parser.ParseSettings parseSettings29 = xmlTreeBuilder9.defaultSettings();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder30 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document33 = xmlTreeBuilder30.parse("<![CDATA[hi!]]>", " ");
        org.jsoup.parser.Token.CData cData35 = new org.jsoup.parser.Token.CData("hi!");
        xmlTreeBuilder30.insert((org.jsoup.parser.Token.Character) cData35);
        xmlTreeBuilder9.insert((org.jsoup.parser.Token.Character) cData35);
        org.jsoup.parser.Token.Doctype doctype38 = new org.jsoup.parser.Token.Doctype();
        boolean boolean39 = doctype38.isEOF();
        boolean boolean40 = doctype38.isCharacter();
        doctype38.forceQuirks = false;
        boolean boolean43 = doctype38.isComment();
        boolean boolean44 = doctype38.forceQuirks;
        xmlTreeBuilder9.insert(doctype38);
        org.jsoup.nodes.Document document48 = xmlTreeBuilder9.parse("Doctype", "<starttag>");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder49 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState50 = htmlTreeBuilder49.state();
        org.jsoup.nodes.FormElement formElement51 = null;
        htmlTreeBuilder49.setFormElement(formElement51);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder53 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document56 = xmlTreeBuilder53.parse("<![CDATA[hi!]]>", " ");
        htmlTreeBuilder49.setHeadElement((org.jsoup.nodes.Element) document56);
        org.jsoup.nodes.Element element58 = htmlTreeBuilder49.getHeadElement();
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.replaceActiveFormattingElement((org.jsoup.nodes.Element) document48, element58);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(htmlTreeBuilderState1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(element5);
        org.junit.Assert.assertNotNull(document12);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(stringBuilder26);
        org.junit.Assert.assertEquals(stringBuilder26.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder27);
        org.junit.Assert.assertEquals(stringBuilder27.toString(), "");
        org.junit.Assert.assertNotNull(parseSettings29);
        org.junit.Assert.assertNotNull(document33);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(document48);
        org.junit.Assert.assertNull(htmlTreeBuilderState50);
        org.junit.Assert.assertNotNull(document56);
        org.junit.Assert.assertNotNull(element58);
    }

    @Test
    public void test0468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0468");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.state();
        htmlTreeBuilder0.setFosterInserts(true);
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder4 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState5 = htmlTreeBuilder4.state();
        org.jsoup.nodes.FormElement formElement6 = null;
        htmlTreeBuilder4.setFormElement(formElement6);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder8 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document11 = xmlTreeBuilder8.parse("<![CDATA[hi!]]>", " ");
        htmlTreeBuilder4.setHeadElement((org.jsoup.nodes.Element) document11);
        htmlTreeBuilder0.setHeadElement((org.jsoup.nodes.Element) document11);
        org.jsoup.nodes.FormElement formElement14 = null;
        htmlTreeBuilder0.setFormElement(formElement14);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = htmlTreeBuilder0.inTableScope(" ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(htmlTreeBuilderState1);
        org.junit.Assert.assertNull(htmlTreeBuilderState5);
        org.junit.Assert.assertNotNull(document11);
    }

    @Test
    public void test0469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0469");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.state();
        org.jsoup.nodes.FormElement formElement2 = null;
        htmlTreeBuilder0.setFormElement(formElement2);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder4 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document7 = xmlTreeBuilder4.parse("<![CDATA[hi!]]>", " ");
        htmlTreeBuilder0.setHeadElement((org.jsoup.nodes.Element) document7);
        boolean boolean9 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState10 = htmlTreeBuilder0.originalState();
        org.jsoup.nodes.Element element11 = null;
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.maybeSetBaseUri(element11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(htmlTreeBuilderState1);
        org.junit.Assert.assertNotNull(document7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(htmlTreeBuilderState10);
    }

    @Test
    public void test0470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0470");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.state();
        org.jsoup.nodes.FormElement formElement2 = null;
        htmlTreeBuilder0.setFormElement(formElement2);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder4 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document7 = xmlTreeBuilder4.parse("<![CDATA[hi!]]>", " ");
        htmlTreeBuilder0.setHeadElement((org.jsoup.nodes.Element) document7);
        boolean boolean9 = htmlTreeBuilder0.isFragmentParsing();
        boolean boolean10 = htmlTreeBuilder0.framesetOk();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = htmlTreeBuilder0.inSelectScope("starttag");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(htmlTreeBuilderState1);
        org.junit.Assert.assertNotNull(document7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0471");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.state();
        org.jsoup.nodes.FormElement formElement2 = null;
        htmlTreeBuilder0.setFormElement(formElement2);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder4 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document7 = xmlTreeBuilder4.parse("<![CDATA[hi!]]>", " ");
        htmlTreeBuilder0.setHeadElement((org.jsoup.nodes.Element) document7);
        boolean boolean9 = htmlTreeBuilder0.isFragmentParsing();
        htmlTreeBuilder0.setFosterInserts(false);
        org.jsoup.nodes.Document document12 = htmlTreeBuilder0.getDocument();
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.clearStackToTableContext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(htmlTreeBuilderState1);
        org.junit.Assert.assertNotNull(document7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(document12);
    }

    @Test
    public void test0472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0472");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.state();
        htmlTreeBuilder0.setFosterInserts(true);
        boolean boolean4 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder5 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState6 = htmlTreeBuilder5.state();
        org.jsoup.nodes.FormElement formElement7 = null;
        htmlTreeBuilder5.setFormElement(formElement7);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder9 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document12 = xmlTreeBuilder9.parse("<![CDATA[hi!]]>", " ");
        htmlTreeBuilder5.setHeadElement((org.jsoup.nodes.Element) document12);
        org.jsoup.nodes.Element element14 = htmlTreeBuilder5.getHeadElement();
        htmlTreeBuilder0.setHeadElement(element14);
        htmlTreeBuilder0.framesetOk(false);
        org.jsoup.nodes.FormElement formElement18 = null;
        htmlTreeBuilder0.setFormElement(formElement18);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element21 = htmlTreeBuilder0.insertStartTag("CData");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(htmlTreeBuilderState1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(htmlTreeBuilderState6);
        org.junit.Assert.assertNotNull(document12);
        org.junit.Assert.assertNotNull(element14);
    }

    @Test
    public void test0473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0473");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList1 = htmlTreeBuilder0.getStack();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState2 = null;
        htmlTreeBuilder0.transition(htmlTreeBuilderState2);
        org.jsoup.parser.ParseSettings parseSettings4 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder5 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document8 = xmlTreeBuilder5.parse("", "hi!");
        org.jsoup.nodes.Document document11 = xmlTreeBuilder5.parse("<![CDATA[hi!]]>", "<!---->");
        org.jsoup.parser.Token.CData cData13 = new org.jsoup.parser.Token.CData("hi!");
        java.lang.String str14 = cData13.getData();
        boolean boolean15 = cData13.isCharacter();
        xmlTreeBuilder5.insert((org.jsoup.parser.Token.Character) cData13);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder17 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document20 = xmlTreeBuilder17.parse("", "hi!");
        org.jsoup.nodes.Document document23 = xmlTreeBuilder17.parse("<![CDATA[hi!]]>", "<!---->");
        org.jsoup.parser.Token.StartTag startTag24 = new org.jsoup.parser.Token.StartTag();
        startTag24.appendAttributeName(' ');
        boolean boolean27 = startTag24.selfClosing;
        startTag24.newAttribute();
        org.jsoup.parser.Token.Tag tag30 = startTag24.name("<![CDATA[null]]>");
        org.jsoup.parser.Token.StartTag startTag31 = new org.jsoup.parser.Token.StartTag();
        startTag31.appendAttributeValue("");
        org.jsoup.parser.Token.TokenType tokenType34 = org.jsoup.parser.Token.TokenType.Doctype;
        startTag31.type = tokenType34;
        startTag24.type = tokenType34;
        startTag24.newAttribute();
        startTag24.appendAttributeName("</<![CDATA[null]]>>");
        org.jsoup.nodes.Element element40 = xmlTreeBuilder17.insert(startTag24);
        startTag24.appendAttributeValue("</<![CDATA[null]]>>");
        boolean boolean43 = startTag24.isEOF();
        boolean boolean44 = startTag24.isSelfClosing();
        org.jsoup.nodes.Element element45 = xmlTreeBuilder5.insert(startTag24);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element46 = htmlTreeBuilder0.insert(startTag24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(elementList1);
        org.junit.Assert.assertNotNull(parseSettings4);
        org.junit.Assert.assertNotNull(document8);
        org.junit.Assert.assertNotNull(document11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(document20);
        org.junit.Assert.assertNotNull(document23);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(tag30);
        org.junit.Assert.assertTrue("'" + tokenType34 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType34.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertNotNull(element40);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(element45);
    }

    @Test
    public void test0474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0474");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document3 = xmlTreeBuilder0.parse("", "hi!");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder4 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document7 = xmlTreeBuilder4.parse("<![CDATA[hi!]]>", " ");
        org.jsoup.parser.Token.Comment comment8 = new org.jsoup.parser.Token.Comment();
        org.jsoup.parser.Token token9 = comment8.reset();
        boolean boolean10 = comment8.bogus;
        xmlTreeBuilder4.insert(comment8);
        org.jsoup.nodes.Document document14 = xmlTreeBuilder4.parse("StartTag", "< >");
        org.jsoup.nodes.Attributes attributes16 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor17 = attributes16.iterator();
        attributes16.normalize();
        org.jsoup.nodes.Attributes attributes21 = attributes16.put("", true);
        boolean boolean22 = xmlTreeBuilder4.processStartTag("<starttag>", attributes16);
        org.jsoup.parser.Token.Comment comment23 = new org.jsoup.parser.Token.Comment();
        org.jsoup.parser.Token token24 = comment23.reset();
        boolean boolean25 = comment23.bogus;
        comment23.bogus = true;
        boolean boolean28 = comment23.bogus;
        xmlTreeBuilder4.insert(comment23);
        xmlTreeBuilder0.insert(comment23);
        java.io.Reader reader31 = null;
        org.jsoup.parser.Parser parser33 = null;
        // The following exception was thrown during execution in test generation
        try {
            xmlTreeBuilder0.initialiseParse(reader31, "< >", parser33);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String input must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(document7);
        org.junit.Assert.assertNotNull(token9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(document14);
        org.junit.Assert.assertNotNull(attributeItor17);
        org.junit.Assert.assertNotNull(attributes21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(token24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }

    @Test
    public void test0475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0475");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document3 = xmlTreeBuilder0.parse("<![CDATA[hi!]]>", " ");
        org.jsoup.parser.Token.CData cData5 = new org.jsoup.parser.Token.CData("hi!");
        xmlTreeBuilder0.insert((org.jsoup.parser.Token.Character) cData5);
        org.jsoup.parser.Token.Doctype doctype7 = new org.jsoup.parser.Token.Doctype();
        boolean boolean8 = doctype7.isEOF();
        boolean boolean9 = doctype7.isCharacter();
        boolean boolean10 = doctype7.isComment();
        xmlTreeBuilder0.insert(doctype7);
        java.lang.StringBuilder stringBuilder12 = doctype7.name;
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(stringBuilder12);
        org.junit.Assert.assertEquals(stringBuilder12.toString(), "");
    }

    @Test
    public void test0476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0476");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.state();
        org.jsoup.nodes.FormElement formElement2 = null;
        htmlTreeBuilder0.setFormElement(formElement2);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder4 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document7 = xmlTreeBuilder4.parse("<![CDATA[hi!]]>", " ");
        htmlTreeBuilder0.setHeadElement((org.jsoup.nodes.Element) document7);
        boolean boolean9 = htmlTreeBuilder0.isFragmentParsing();
        boolean boolean10 = htmlTreeBuilder0.framesetOk();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState11 = null;
        htmlTreeBuilder0.transition(htmlTreeBuilderState11);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState13 = htmlTreeBuilder0.originalState();
        org.jsoup.parser.Token.StartTag startTag14 = new org.jsoup.parser.Token.StartTag();
        startTag14.appendAttributeName(' ');
        startTag14.appendTagName(' ');
        startTag14.newAttribute();
        boolean boolean20 = startTag14.selfClosing;
        startTag14.newAttribute();
        org.jsoup.nodes.Attributes attributes22 = startTag14.getAttributes();
        java.lang.String str23 = startTag14.tagName;
        org.jsoup.parser.Token.StartTag startTag24 = new org.jsoup.parser.Token.StartTag();
        startTag24.finaliseTag();
        startTag24.appendAttributeValue(' ');
        org.jsoup.nodes.Attributes attributes29 = null;
        org.jsoup.parser.Token.StartTag startTag30 = startTag24.nameAttr("hi!", attributes29);
        boolean boolean31 = startTag24.isComment();
        char[] charArray38 = new char[] { 'a', '4', 'a', '#', '#', '4' };
        startTag24.appendAttributeValue(charArray38);
        startTag14.appendAttributeValue(charArray38);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element41 = htmlTreeBuilder0.insertEmpty(startTag14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(htmlTreeBuilderState1);
        org.junit.Assert.assertNotNull(document7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(htmlTreeBuilderState13);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(attributes22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + " " + "'", str23, " ");
        org.junit.Assert.assertNotNull(startTag30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(charArray38);
        org.junit.Assert.assertArrayEquals(charArray38, new char[] { 'a', '4', 'a', '#', '#', '4' });
    }

    @Test
    public void test0477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0477");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.state();
        htmlTreeBuilder0.setFosterInserts(true);
        boolean boolean4 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder5 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState6 = htmlTreeBuilder5.state();
        org.jsoup.nodes.FormElement formElement7 = null;
        htmlTreeBuilder5.setFormElement(formElement7);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder9 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document12 = xmlTreeBuilder9.parse("<![CDATA[hi!]]>", " ");
        htmlTreeBuilder5.setHeadElement((org.jsoup.nodes.Element) document12);
        org.jsoup.nodes.Element element14 = htmlTreeBuilder5.getHeadElement();
        htmlTreeBuilder0.setHeadElement(element14);
        htmlTreeBuilder0.framesetOk(false);
        org.jsoup.nodes.FormElement formElement18 = null;
        htmlTreeBuilder0.setFormElement(formElement18);
        htmlTreeBuilder0.framesetOk(true);
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder22 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState23 = htmlTreeBuilder22.state();
        org.jsoup.nodes.FormElement formElement24 = null;
        htmlTreeBuilder22.setFormElement(formElement24);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder26 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document29 = xmlTreeBuilder26.parse("<![CDATA[hi!]]>", " ");
        htmlTreeBuilder22.setHeadElement((org.jsoup.nodes.Element) document29);
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder31 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState32 = htmlTreeBuilder31.state();
        org.jsoup.nodes.FormElement formElement33 = null;
        htmlTreeBuilder31.setFormElement(formElement33);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState35 = null;
        htmlTreeBuilder31.transition(htmlTreeBuilderState35);
        boolean boolean37 = htmlTreeBuilder31.isFosterInserts();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState38 = htmlTreeBuilder31.state();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder39 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document42 = xmlTreeBuilder39.parse("", "hi!");
        org.jsoup.nodes.Document document45 = xmlTreeBuilder39.parse("<![CDATA[hi!]]>", "<!---->");
        htmlTreeBuilder31.setHeadElement((org.jsoup.nodes.Element) document45);
        boolean boolean47 = htmlTreeBuilder22.isSpecial((org.jsoup.nodes.Element) document45);
        java.util.ArrayList<org.jsoup.nodes.Element> elementList48 = htmlTreeBuilder22.getStack();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder49 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState50 = htmlTreeBuilder49.state();
        org.jsoup.nodes.FormElement formElement51 = null;
        htmlTreeBuilder49.setFormElement(formElement51);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder53 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document56 = xmlTreeBuilder53.parse("<![CDATA[hi!]]>", " ");
        htmlTreeBuilder49.maybeSetBaseUri((org.jsoup.nodes.Element) document56);
        htmlTreeBuilder22.maybeSetBaseUri((org.jsoup.nodes.Element) document56);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder59 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document62 = xmlTreeBuilder59.parse("<![CDATA[null]]>", "StartTag");
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.replaceActiveFormattingElement((org.jsoup.nodes.Element) document56, (org.jsoup.nodes.Element) document62);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(htmlTreeBuilderState1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(htmlTreeBuilderState6);
        org.junit.Assert.assertNotNull(document12);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNull(htmlTreeBuilderState23);
        org.junit.Assert.assertNotNull(document29);
        org.junit.Assert.assertNull(htmlTreeBuilderState32);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNull(htmlTreeBuilderState38);
        org.junit.Assert.assertNotNull(document42);
        org.junit.Assert.assertNotNull(document45);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNull(elementList48);
        org.junit.Assert.assertNull(htmlTreeBuilderState50);
        org.junit.Assert.assertNotNull(document56);
        org.junit.Assert.assertNotNull(document62);
    }

    @Test
    public void test0478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0478");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.appendAttributeName(' ');
        startTag0.normalName = "<![CDATA[null]]>";
        org.jsoup.parser.Token.Tag tag6 = startTag0.name("");
        org.jsoup.nodes.Attributes attributes7 = startTag0.attributes;
        java.lang.String str8 = attributes7.html();
        org.junit.Assert.assertNotNull(tag6);
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0479");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document3 = xmlTreeBuilder0.parse("<![CDATA[hi!]]>", " ");
        org.jsoup.parser.Token.CData cData5 = new org.jsoup.parser.Token.CData("hi!");
        xmlTreeBuilder0.insert((org.jsoup.parser.Token.Character) cData5);
        org.jsoup.parser.Token.Doctype doctype7 = new org.jsoup.parser.Token.Doctype();
        boolean boolean8 = doctype7.isEOF();
        boolean boolean9 = doctype7.isCharacter();
        boolean boolean10 = doctype7.isComment();
        xmlTreeBuilder0.insert(doctype7);
        org.jsoup.parser.Token.Comment comment12 = new org.jsoup.parser.Token.Comment();
        java.lang.String str13 = comment12.getData();
        xmlTreeBuilder0.insert(comment12);
        org.jsoup.parser.Token.Doctype doctype15 = new org.jsoup.parser.Token.Doctype();
        boolean boolean16 = doctype15.isStartTag();
        java.lang.StringBuilder stringBuilder17 = doctype15.name;
        java.lang.StringBuilder stringBuilder18 = doctype15.publicIdentifier;
        xmlTreeBuilder0.insert(doctype15);
        org.jsoup.parser.ParseSettings parseSettings20 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder21 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document24 = xmlTreeBuilder21.parse("<![CDATA[hi!]]>", " ");
        org.jsoup.parser.Token.CData cData26 = new org.jsoup.parser.Token.CData("hi!");
        xmlTreeBuilder21.insert((org.jsoup.parser.Token.Character) cData26);
        xmlTreeBuilder0.insert((org.jsoup.parser.Token.Character) cData26);
        java.lang.String str29 = cData26.getData();
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(stringBuilder17);
        org.junit.Assert.assertEquals(stringBuilder17.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder18);
        org.junit.Assert.assertEquals(stringBuilder18.toString(), "");
        org.junit.Assert.assertNotNull(parseSettings20);
        org.junit.Assert.assertNotNull(document24);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
    }

    @Test
    public void test0480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0480");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document3 = xmlTreeBuilder0.parse("<![CDATA[hi!]]>", " ");
        org.jsoup.parser.Token.Comment comment4 = new org.jsoup.parser.Token.Comment();
        org.jsoup.parser.Token token5 = comment4.reset();
        boolean boolean6 = comment4.bogus;
        xmlTreeBuilder0.insert(comment4);
        org.jsoup.nodes.Document document10 = xmlTreeBuilder0.parse("StartTag", "< >");
        org.jsoup.nodes.Attributes attributes12 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor13 = attributes12.iterator();
        attributes12.normalize();
        org.jsoup.nodes.Attributes attributes17 = attributes12.put("", true);
        boolean boolean18 = xmlTreeBuilder0.processStartTag("<starttag>", attributes12);
        org.jsoup.parser.Token.StartTag startTag19 = new org.jsoup.parser.Token.StartTag();
        startTag19.finaliseTag();
        startTag19.normalName = "";
        boolean boolean23 = startTag19.isDoctype();
        org.jsoup.parser.Token.StartTag startTag24 = new org.jsoup.parser.Token.StartTag();
        startTag24.appendAttributeValue("");
        org.jsoup.parser.Token.TokenType tokenType27 = org.jsoup.parser.Token.TokenType.Doctype;
        startTag24.type = tokenType27;
        startTag19.type = tokenType27;
        boolean boolean30 = startTag19.isStartTag();
        boolean boolean31 = startTag19.isEOF();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element32 = xmlTreeBuilder0.insert(startTag19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must be false");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(token5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(document10);
        org.junit.Assert.assertNotNull(attributeItor13);
        org.junit.Assert.assertNotNull(attributes17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + tokenType27 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType27.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test0481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0481");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.state();
        htmlTreeBuilder0.setFosterInserts(true);
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder4 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState5 = htmlTreeBuilder4.state();
        org.jsoup.nodes.FormElement formElement6 = null;
        htmlTreeBuilder4.setFormElement(formElement6);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder8 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document11 = xmlTreeBuilder8.parse("<![CDATA[hi!]]>", " ");
        htmlTreeBuilder4.setHeadElement((org.jsoup.nodes.Element) document11);
        htmlTreeBuilder0.setHeadElement((org.jsoup.nodes.Element) document11);
        htmlTreeBuilder0.newPendingTableCharacters();
        java.util.List<java.lang.String> strList15 = htmlTreeBuilder0.getPendingTableCharacters();
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.resetInsertionMode();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(htmlTreeBuilderState1);
        org.junit.Assert.assertNull(htmlTreeBuilderState5);
        org.junit.Assert.assertNotNull(document11);
        org.junit.Assert.assertNotNull(strList15);
    }

    @Test
    public void test0482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0482");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.state();
        org.jsoup.nodes.FormElement formElement2 = null;
        htmlTreeBuilder0.setFormElement(formElement2);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder4 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document7 = xmlTreeBuilder4.parse("<![CDATA[hi!]]>", " ");
        htmlTreeBuilder0.setHeadElement((org.jsoup.nodes.Element) document7);
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder9 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState10 = htmlTreeBuilder9.state();
        org.jsoup.nodes.FormElement formElement11 = null;
        htmlTreeBuilder9.setFormElement(formElement11);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder13 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document16 = xmlTreeBuilder13.parse("<![CDATA[hi!]]>", " ");
        htmlTreeBuilder9.maybeSetBaseUri((org.jsoup.nodes.Element) document16);
        htmlTreeBuilder0.maybeSetBaseUri((org.jsoup.nodes.Element) document16);
        org.jsoup.nodes.Element element19 = htmlTreeBuilder0.getHeadElement();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean21 = htmlTreeBuilder0.inButtonScope("cdata");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(htmlTreeBuilderState1);
        org.junit.Assert.assertNotNull(document7);
        org.junit.Assert.assertNull(htmlTreeBuilderState10);
        org.junit.Assert.assertNotNull(document16);
        org.junit.Assert.assertNotNull(element19);
    }

    @Test
    public void test0483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0483");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.state();
        org.jsoup.nodes.FormElement formElement2 = null;
        htmlTreeBuilder0.setFormElement(formElement2);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.state();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState5 = htmlTreeBuilder0.state();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState6 = null;
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.error(htmlTreeBuilderState6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(htmlTreeBuilderState1);
        org.junit.Assert.assertNull(htmlTreeBuilderState4);
        org.junit.Assert.assertNull(htmlTreeBuilderState5);
    }

    @Test
    public void test0484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0484");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.state();
        org.jsoup.nodes.FormElement formElement2 = null;
        htmlTreeBuilder0.setFormElement(formElement2);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder4 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document7 = xmlTreeBuilder4.parse("<![CDATA[hi!]]>", " ");
        htmlTreeBuilder0.setHeadElement((org.jsoup.nodes.Element) document7);
        boolean boolean9 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.nodes.FormElement formElement10 = htmlTreeBuilder0.getFormElement();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element12 = htmlTreeBuilder0.insertStartTag("starttag");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(htmlTreeBuilderState1);
        org.junit.Assert.assertNotNull(document7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(formElement10);
    }

    @Test
    public void test0485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0485");
        org.jsoup.parser.Token.CData cData1 = new org.jsoup.parser.Token.CData("hi!");
        java.lang.String str2 = cData1.getData();
        java.lang.String str3 = cData1.toString();
        org.jsoup.parser.Token.Character character5 = cData1.data("StartTag");
        org.jsoup.parser.Token token6 = cData1.reset();
        java.lang.String str7 = cData1.toString();
        java.lang.String str8 = cData1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<![CDATA[hi!]]>" + "'", str3, "<![CDATA[hi!]]>");
        org.junit.Assert.assertNotNull(character5);
        org.junit.Assert.assertNotNull(token6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<![CDATA[null]]>" + "'", str7, "<![CDATA[null]]>");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "<![CDATA[null]]>" + "'", str8, "<![CDATA[null]]>");
    }

    @Test
    public void test0486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0486");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.state();
        org.jsoup.nodes.FormElement formElement2 = null;
        htmlTreeBuilder0.setFormElement(formElement2);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder4 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document7 = xmlTreeBuilder4.parse("<![CDATA[hi!]]>", " ");
        htmlTreeBuilder0.setHeadElement((org.jsoup.nodes.Element) document7);
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder9 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState10 = htmlTreeBuilder9.state();
        org.jsoup.nodes.FormElement formElement11 = null;
        htmlTreeBuilder9.setFormElement(formElement11);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder13 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document16 = xmlTreeBuilder13.parse("<![CDATA[hi!]]>", " ");
        htmlTreeBuilder9.maybeSetBaseUri((org.jsoup.nodes.Element) document16);
        htmlTreeBuilder0.maybeSetBaseUri((org.jsoup.nodes.Element) document16);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element20 = htmlTreeBuilder0.insertStartTag("</<![CDATA[null]]>>");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(htmlTreeBuilderState1);
        org.junit.Assert.assertNotNull(document7);
        org.junit.Assert.assertNull(htmlTreeBuilderState10);
        org.junit.Assert.assertNotNull(document16);
    }

    @Test
    public void test0487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0487");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.state();
        org.jsoup.nodes.FormElement formElement2 = null;
        htmlTreeBuilder0.setFormElement(formElement2);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder4 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document7 = xmlTreeBuilder4.parse("<![CDATA[hi!]]>", " ");
        htmlTreeBuilder0.setHeadElement((org.jsoup.nodes.Element) document7);
        org.jsoup.nodes.Element element9 = htmlTreeBuilder0.getHeadElement();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState10 = htmlTreeBuilder0.state();
        org.jsoup.parser.Token.StartTag startTag11 = new org.jsoup.parser.Token.StartTag();
        startTag11.appendTagName("<![CDATA[null]]>");
        startTag11.newAttribute();
        java.lang.String str15 = startTag11.tokenType();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element16 = htmlTreeBuilder0.insert(startTag11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(htmlTreeBuilderState1);
        org.junit.Assert.assertNotNull(document7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNull(htmlTreeBuilderState10);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "StartTag" + "'", str15, "StartTag");
    }

    @Test
    public void test0488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0488");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.state();
        org.jsoup.nodes.FormElement formElement2 = null;
        htmlTreeBuilder0.setFormElement(formElement2);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder4 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document7 = xmlTreeBuilder4.parse("<![CDATA[hi!]]>", " ");
        htmlTreeBuilder0.setHeadElement((org.jsoup.nodes.Element) document7);
        boolean boolean9 = htmlTreeBuilder0.isFragmentParsing();
        boolean boolean10 = htmlTreeBuilder0.framesetOk();
        htmlTreeBuilder0.setFosterInserts(false);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element13 = htmlTreeBuilder0.removeLastFormattingElement();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(htmlTreeBuilderState1);
        org.junit.Assert.assertNotNull(document7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0489");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        boolean boolean1 = doctype0.isStartTag();
        java.lang.String str2 = doctype0.pubSysKey;
        java.lang.String str3 = doctype0.getPubSysKey();
        doctype0.forceQuirks = false;
        org.jsoup.parser.Token token6 = doctype0.reset();
        boolean boolean7 = token6.isEOF();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Character character8 = token6.asCharacter();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$Doctype cannot be cast to class org.jsoup.parser.Token$Character (org.jsoup.parser.Token$Doctype and org.jsoup.parser.Token$Character are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(token6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0490");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.state();
        org.jsoup.nodes.FormElement formElement2 = null;
        htmlTreeBuilder0.setFormElement(formElement2);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder4 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document7 = xmlTreeBuilder4.parse("", "hi!");
        org.jsoup.nodes.Document document10 = xmlTreeBuilder4.parse("<![CDATA[hi!]]>", "<!---->");
        boolean boolean11 = htmlTreeBuilder0.isSpecial((org.jsoup.nodes.Element) document10);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState12 = null;
        htmlTreeBuilder0.transition(htmlTreeBuilderState12);
        org.jsoup.parser.Token.StartTag startTag15 = new org.jsoup.parser.Token.StartTag();
        startTag15.finaliseTag();
        startTag15.tagName = "";
        int[] intArray23 = new int[] { 0, (byte) 10, (short) 10, (short) 1 };
        startTag15.appendAttributeValue(intArray23);
        startTag15.finaliseTag();
        startTag15.appendAttributeName('#');
        org.jsoup.nodes.Attributes attributes28 = startTag15.attributes;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean29 = htmlTreeBuilder0.processStartTag("<![CDATA[</<![CDATA[null]]>>]]>", attributes28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(htmlTreeBuilderState1);
        org.junit.Assert.assertNotNull(document7);
        org.junit.Assert.assertNotNull(document10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertArrayEquals(intArray23, new int[] { 0, 10, 10, 1 });
        org.junit.Assert.assertNotNull(attributes28);
    }

    @Test
    public void test0491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0491");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.state();
        org.jsoup.nodes.FormElement formElement2 = null;
        htmlTreeBuilder0.setFormElement(formElement2);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = null;
        htmlTreeBuilder0.transition(htmlTreeBuilderState4);
        boolean boolean6 = htmlTreeBuilder0.isFosterInserts();
        org.jsoup.parser.Token.Comment comment7 = new org.jsoup.parser.Token.Comment();
        org.jsoup.parser.Token token8 = comment7.reset();
        java.lang.String str9 = comment7.tokenType();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState10 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = htmlTreeBuilder0.process((org.jsoup.parser.Token) comment7, htmlTreeBuilderState10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(htmlTreeBuilderState1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(token8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Comment" + "'", str9, "Comment");
    }

    @Test
    public void test0492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0492");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        boolean boolean1 = doctype0.isStartTag();
        java.lang.String str2 = doctype0.pubSysKey;
        java.lang.String str3 = doctype0.getPubSysKey();
        java.lang.String str4 = doctype0.getPublicIdentifier();
        java.lang.StringBuilder stringBuilder5 = doctype0.publicIdentifier;
        java.lang.String str6 = doctype0.getName();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test0493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0493");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document3 = xmlTreeBuilder0.parse("", "hi!");
        org.jsoup.nodes.Document document6 = xmlTreeBuilder0.parse("<![CDATA[hi!]]>", "<!---->");
        org.jsoup.parser.Parser parser9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.jsoup.nodes.Node> nodeList10 = xmlTreeBuilder0.parseFragment("< >", "StartTag", parser9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(document6);
    }

    @Test
    public void test0494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0494");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = null;
        htmlTreeBuilder0.transition(htmlTreeBuilderState1);
        boolean boolean3 = htmlTreeBuilder0.framesetOk();
        java.lang.String str4 = htmlTreeBuilder0.getBaseUri();
        org.jsoup.nodes.Document document5 = htmlTreeBuilder0.getDocument();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder6 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState7 = htmlTreeBuilder6.state();
        org.jsoup.nodes.FormElement formElement8 = null;
        htmlTreeBuilder6.setFormElement(formElement8);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder10 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document13 = xmlTreeBuilder10.parse("<![CDATA[hi!]]>", " ");
        htmlTreeBuilder6.setHeadElement((org.jsoup.nodes.Element) document13);
        boolean boolean15 = htmlTreeBuilder6.isFragmentParsing();
        htmlTreeBuilder6.setFosterInserts(false);
        org.jsoup.nodes.Element element18 = htmlTreeBuilder6.getHeadElement();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder19 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState20 = htmlTreeBuilder19.state();
        org.jsoup.nodes.FormElement formElement21 = null;
        htmlTreeBuilder19.setFormElement(formElement21);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder23 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document26 = xmlTreeBuilder23.parse("<![CDATA[hi!]]>", " ");
        htmlTreeBuilder19.setHeadElement((org.jsoup.nodes.Element) document26);
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder28 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState29 = htmlTreeBuilder28.state();
        org.jsoup.nodes.FormElement formElement30 = null;
        htmlTreeBuilder28.setFormElement(formElement30);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState32 = null;
        htmlTreeBuilder28.transition(htmlTreeBuilderState32);
        boolean boolean34 = htmlTreeBuilder28.isFosterInserts();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState35 = htmlTreeBuilder28.state();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder36 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document39 = xmlTreeBuilder36.parse("", "hi!");
        org.jsoup.nodes.Document document42 = xmlTreeBuilder36.parse("<![CDATA[hi!]]>", "<!---->");
        htmlTreeBuilder28.setHeadElement((org.jsoup.nodes.Element) document42);
        boolean boolean44 = htmlTreeBuilder19.isSpecial((org.jsoup.nodes.Element) document42);
        java.util.ArrayList<org.jsoup.nodes.Element> elementList45 = htmlTreeBuilder19.getStack();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder46 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState47 = htmlTreeBuilder46.state();
        org.jsoup.nodes.FormElement formElement48 = null;
        htmlTreeBuilder46.setFormElement(formElement48);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder50 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document53 = xmlTreeBuilder50.parse("<![CDATA[hi!]]>", " ");
        htmlTreeBuilder46.maybeSetBaseUri((org.jsoup.nodes.Element) document53);
        htmlTreeBuilder19.maybeSetBaseUri((org.jsoup.nodes.Element) document53);
        boolean boolean56 = htmlTreeBuilder6.isSpecial((org.jsoup.nodes.Element) document53);
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.insertInFosterParent((org.jsoup.nodes.Node) document53);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(document5);
        org.junit.Assert.assertNull(htmlTreeBuilderState7);
        org.junit.Assert.assertNotNull(document13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNull(htmlTreeBuilderState20);
        org.junit.Assert.assertNotNull(document26);
        org.junit.Assert.assertNull(htmlTreeBuilderState29);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNull(htmlTreeBuilderState35);
        org.junit.Assert.assertNotNull(document39);
        org.junit.Assert.assertNotNull(document42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNull(elementList45);
        org.junit.Assert.assertNull(htmlTreeBuilderState47);
        org.junit.Assert.assertNotNull(document53);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
    }

    @Test
    public void test0495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0495");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.state();
        org.jsoup.nodes.FormElement formElement2 = null;
        htmlTreeBuilder0.setFormElement(formElement2);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder4 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document7 = xmlTreeBuilder4.parse("<![CDATA[hi!]]>", " ");
        htmlTreeBuilder0.setHeadElement((org.jsoup.nodes.Element) document7);
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder9 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState10 = htmlTreeBuilder9.state();
        org.jsoup.nodes.FormElement formElement11 = null;
        htmlTreeBuilder9.setFormElement(formElement11);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState13 = null;
        htmlTreeBuilder9.transition(htmlTreeBuilderState13);
        boolean boolean15 = htmlTreeBuilder9.isFosterInserts();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState16 = htmlTreeBuilder9.state();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder17 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document20 = xmlTreeBuilder17.parse("", "hi!");
        org.jsoup.nodes.Document document23 = xmlTreeBuilder17.parse("<![CDATA[hi!]]>", "<!---->");
        htmlTreeBuilder9.setHeadElement((org.jsoup.nodes.Element) document23);
        boolean boolean25 = htmlTreeBuilder0.isSpecial((org.jsoup.nodes.Element) document23);
        java.lang.String str26 = htmlTreeBuilder0.getBaseUri();
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.popStackToBefore("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(htmlTreeBuilderState1);
        org.junit.Assert.assertNotNull(document7);
        org.junit.Assert.assertNull(htmlTreeBuilderState10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(htmlTreeBuilderState16);
        org.junit.Assert.assertNotNull(document20);
        org.junit.Assert.assertNotNull(document23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNull(str26);
    }

    @Test
    public void test0496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0496");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor1 = attributes0.iterator();
        org.jsoup.nodes.Attributes attributes4 = attributes0.put("", false);
        org.jsoup.nodes.Attributes attributes7 = attributes4.put("", true);
        attributes4.remove("</<![cdata[null]]>>");
        boolean boolean11 = attributes4.hasKey("Comment");
        org.junit.Assert.assertNotNull(attributeItor1);
        org.junit.Assert.assertNotNull(attributes4);
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0497");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.TokenType tokenType1 = org.jsoup.parser.Token.TokenType.StartTag;
        startTag0.type = tokenType1;
        org.jsoup.parser.Token.Tag tag3 = startTag0.reset();
        tag3.finaliseTag();
        org.junit.Assert.assertTrue("'" + tokenType1 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType1.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertNotNull(tag3);
    }

    @Test
    public void test0498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0498");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = htmlTreeBuilder0.state();
        org.jsoup.nodes.FormElement formElement2 = null;
        htmlTreeBuilder0.setFormElement(formElement2);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder4 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document7 = xmlTreeBuilder4.parse("<![CDATA[hi!]]>", " ");
        htmlTreeBuilder0.setHeadElement((org.jsoup.nodes.Element) document7);
        boolean boolean9 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.nodes.FormElement formElement10 = htmlTreeBuilder0.getFormElement();
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.generateImpliedEndTags("<![CDATA[hi!]]>");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(htmlTreeBuilderState1);
        org.junit.Assert.assertNotNull(document7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(formElement10);
    }

    @Test
    public void test0499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0499");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.finaliseTag();
        startTag0.normalName = "";
        boolean boolean4 = startTag0.isDoctype();
        org.jsoup.parser.Token.StartTag startTag5 = new org.jsoup.parser.Token.StartTag();
        startTag5.appendAttributeValue("");
        org.jsoup.parser.Token.TokenType tokenType8 = org.jsoup.parser.Token.TokenType.Doctype;
        startTag5.type = tokenType8;
        startTag0.type = tokenType8;
        boolean boolean11 = startTag0.isStartTag();
        boolean boolean12 = startTag0.isEOF();
        startTag0.appendTagName('4');
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + tokenType8 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType8.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0500");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList1 = htmlTreeBuilder0.getStack();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState2 = htmlTreeBuilder0.state();
        org.junit.Assert.assertNull(elementList1);
        org.junit.Assert.assertNull(htmlTreeBuilderState2);
    }
}

