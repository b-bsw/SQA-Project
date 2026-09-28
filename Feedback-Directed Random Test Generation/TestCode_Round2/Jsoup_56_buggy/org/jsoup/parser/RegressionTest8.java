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
        org.jsoup.parser.Token.Character character0 = new org.jsoup.parser.Token.Character();
        org.jsoup.parser.Token.Character character2 = character0.data("hi!");
        java.lang.String str3 = character2.toString();
        java.lang.String str4 = character2.getData();
        java.lang.String str5 = character2.getData();
        org.junit.Assert.assertNotNull(character2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test4002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4002");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE hi! PUBLIC \"hi!\">", "StartTag", "4<PUBLIC>", "<<!DOCTYPE hi! PUBLIC \"hi!\">  name=\"hi!\" publicId=\"hi!\" systemId=\"\">");
        org.jsoup.parser.Token.EndTag endTag5 = new org.jsoup.parser.Token.EndTag();
        endTag5.appendAttributeValue("EndTag");
        org.jsoup.nodes.Attributes attributes8 = endTag5.attributes;
        boolean boolean9 = documentType4.equals((java.lang.Object) endTag5);
        org.junit.Assert.assertNull(attributes8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test4003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4003");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "<!---->");
        java.lang.String str6 = documentType4.absUrl("#EndTag");
        org.jsoup.nodes.Node node9 = documentType4.attr("Doctype", "");
        java.util.List<org.jsoup.nodes.Node> nodeList10 = documentType4.childNodes();
        java.lang.String str11 = documentType4.baseUri();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "<!---->" + "'", str11, "<!---->");
    }

    @Test
    public void test4004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4004");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "<!---->");
        org.jsoup.nodes.Node node5 = documentType4.parent();
        org.jsoup.parser.Token.Doctype doctype6 = new org.jsoup.parser.Token.Doctype();
        boolean boolean7 = doctype6.forceQuirks;
        java.lang.String str8 = doctype6.tokenType();
        java.lang.StringBuilder stringBuilder9 = doctype6.systemIdentifier;
        boolean boolean10 = documentType4.equals((java.lang.Object) stringBuilder9);
        java.lang.String str11 = documentType4.toString();
        org.jsoup.nodes.Node node12 = documentType4.clone();
        org.jsoup.nodes.Node node13 = documentType4.clone();
        org.jsoup.parser.Token.Comment comment14 = new org.jsoup.parser.Token.Comment();
        org.jsoup.parser.Token.Comment comment15 = comment14.asComment();
        java.lang.String str16 = comment14.getData();
        java.lang.StringBuilder stringBuilder17 = comment14.data;
        java.lang.StringBuilder stringBuilder18 = comment14.data;
        org.jsoup.parser.Token token19 = comment14.reset();
        org.jsoup.parser.Token.Comment comment20 = comment14.asComment();
        java.lang.String str21 = comment20.getData();
        boolean boolean22 = node13.hasSameValue((java.lang.Object) str21);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Doctype" + "'", str8, "Doctype");
        org.junit.Assert.assertNotNull(stringBuilder9);
        org.junit.Assert.assertEquals(stringBuilder9.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str11, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(comment15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(stringBuilder17);
        org.junit.Assert.assertEquals(stringBuilder17.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder18);
        org.junit.Assert.assertEquals(stringBuilder18.toString(), "");
        org.junit.Assert.assertNotNull(token19);
        org.junit.Assert.assertNotNull(comment20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test4005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4005");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        java.lang.String str1 = startTag0.normalName;
        startTag0.normalName = "<!DOCTYPE hi! PUBLIC \"hi!\">";
        org.jsoup.parser.Token.Tag tag4 = startTag0.reset();
        startTag0.finaliseTag();
        startTag0.tagName = "<hi!  name=\"hi!\" publicId=\"hi!\" systemId=\"\">";
        org.jsoup.parser.Token.StartTag startTag8 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes10 = null;
        org.jsoup.parser.Token.StartTag startTag11 = startTag8.nameAttr("PUBLIC", attributes10);
        startTag8.appendAttributeValue(' ');
        char[] charArray17 = new char[] { ' ', '4', '#' };
        startTag8.appendAttributeValue(charArray17);
        org.jsoup.parser.Token.Tag tag20 = startTag8.name("<!---->");
        boolean boolean21 = startTag8.isStartTag();
        startTag8.appendTagName('4');
        org.jsoup.parser.Token.TokenType tokenType24 = startTag8.type;
        startTag0.type = tokenType24;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(tag4);
        org.junit.Assert.assertNotNull(startTag11);
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertArrayEquals(charArray17, new char[] { ' ', '4', '#' });
        org.junit.Assert.assertNotNull(tag20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + tokenType24 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType24.equals(org.jsoup.parser.Token.TokenType.StartTag));
    }

    @Test
    public void test4006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4006");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.parser.Token.StartTag startTag3 = startTag0.nameAttr("PUBLIC", attributes2);
        boolean boolean4 = startTag3.isComment();
        startTag3.selfClosing = true;
        org.jsoup.parser.Token.TokenType tokenType7 = startTag3.type;
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + tokenType7 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType7.equals(org.jsoup.parser.Token.TokenType.StartTag));
    }

    @Test
    public void test4007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4007");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "<!---->");
        java.lang.String str5 = documentType4.outerHtml();
        org.jsoup.nodes.Attributes attributes6 = documentType4.attributes();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = documentType4.childNodes();
        boolean boolean9 = documentType4.hasAttr("SYSTEM");
        org.jsoup.parser.Token.Comment comment10 = new org.jsoup.parser.Token.Comment();
        org.jsoup.parser.Token.Comment comment11 = comment10.asComment();
        org.jsoup.parser.Token token12 = comment11.reset();
        org.jsoup.parser.Token token13 = comment11.reset();
        boolean boolean14 = documentType4.hasSameValue((java.lang.Object) comment11);
        java.lang.String str15 = documentType4.nodeName();
        documentType4.setBaseUri("</SYSTEM>");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str5, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(comment11);
        org.junit.Assert.assertNotNull(token12);
        org.junit.Assert.assertNotNull(token13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "#doctype" + "'", str15, "#doctype");
    }

    @Test
    public void test4008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4008");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        org.jsoup.parser.ParseSettings parseSettings4 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList5 = xmlTreeBuilder0.parseFragment("", "", parseErrorList3, parseSettings4);
        org.jsoup.parser.ParseErrorList parseErrorList8 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder9 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings10 = xmlTreeBuilder9.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings11 = xmlTreeBuilder9.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList14 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder15 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings16 = xmlTreeBuilder15.defaultSettings();
        xmlTreeBuilder9.initialiseParse("", "SYSTEM", parseErrorList14, parseSettings16);
        xmlTreeBuilder0.initialiseParse("Doctype", "PUBLIC", parseErrorList8, parseSettings16);
        org.jsoup.parser.ParseErrorList parseErrorList21 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder22 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList25 = null;
        org.jsoup.parser.ParseSettings parseSettings26 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList27 = xmlTreeBuilder22.parseFragment("", "", parseErrorList25, parseSettings26);
        org.jsoup.parser.ParseErrorList parseErrorList30 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder31 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings32 = xmlTreeBuilder31.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings33 = xmlTreeBuilder31.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList36 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder37 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings38 = xmlTreeBuilder37.defaultSettings();
        xmlTreeBuilder31.initialiseParse("", "SYSTEM", parseErrorList36, parseSettings38);
        xmlTreeBuilder22.initialiseParse("Doctype", "PUBLIC", parseErrorList30, parseSettings38);
        xmlTreeBuilder0.initialiseParse("EndTag", "<!---->", parseErrorList21, parseSettings38);
        org.jsoup.nodes.Document document44 = xmlTreeBuilder0.parse("<!---->", "SYSTEM");
        java.util.List<org.jsoup.nodes.Node> nodeList45 = document44.childNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList46 = document44.siblingNodes();
        org.jsoup.nodes.Node node49 = document44.attr("</<!---->>", "</PUBLIC>");
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertNotNull(parseSettings10);
        org.junit.Assert.assertNotNull(parseSettings11);
        org.junit.Assert.assertNotNull(parseSettings16);
        org.junit.Assert.assertNotNull(nodeList27);
        org.junit.Assert.assertNotNull(parseSettings32);
        org.junit.Assert.assertNotNull(parseSettings33);
        org.junit.Assert.assertNotNull(parseSettings38);
        org.junit.Assert.assertNotNull(document44);
        org.junit.Assert.assertNotNull(nodeList45);
        org.junit.Assert.assertNotNull(nodeList46);
        org.junit.Assert.assertNotNull(node49);
    }

    @Test
    public void test4009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4009");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag1 = startTag0.reset();
        java.lang.String str2 = tag1.tagName;
        org.jsoup.parser.Token.Tag tag4 = tag1.name("</SYSTEM>");
        org.jsoup.parser.Token.Tag tag6 = tag4.name("<<PUBLIC>>");
        org.jsoup.parser.Token.StartTag startTag7 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag8 = startTag7.reset();
        boolean boolean9 = startTag7.isSelfClosing();
        org.jsoup.parser.Token.Tag tag11 = startTag7.name("a");
        org.jsoup.parser.Token.EndTag endTag12 = new org.jsoup.parser.Token.EndTag();
        endTag12.finaliseTag();
        org.jsoup.parser.Token.EndTag endTag14 = endTag12.asEndTag();
        char[] charArray18 = new char[] { 'a', '#', ' ' };
        endTag12.appendAttributeValue(charArray18);
        startTag7.appendAttributeValue(charArray18);
        tag4.appendAttributeValue(charArray18);
        org.jsoup.parser.Token.Tag tag23 = tag4.name("<SYSTEM>");
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(tag4);
        org.junit.Assert.assertNotNull(tag6);
        org.junit.Assert.assertNotNull(tag8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(tag11);
        org.junit.Assert.assertNotNull(endTag14);
        org.junit.Assert.assertNotNull(charArray18);
        org.junit.Assert.assertArrayEquals(charArray18, new char[] { 'a', '#', ' ' });
        org.junit.Assert.assertNotNull(tag23);
    }

    @Test
    public void test4010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4010");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.parser.Token.StartTag startTag3 = startTag0.nameAttr("PUBLIC", attributes2);
        org.jsoup.nodes.DocumentType documentType9 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "<!---->");
        java.lang.String str10 = documentType9.outerHtml();
        org.jsoup.nodes.Attributes attributes11 = documentType9.attributes();
        org.jsoup.parser.Token.StartTag startTag12 = startTag0.nameAttr("Comment", attributes11);
        startTag12.finaliseTag();
        startTag12.appendTagName(' ');
        boolean boolean16 = startTag12.isSelfClosing();
        java.lang.String str17 = startTag12.normalName();
        org.jsoup.nodes.Attributes attributes18 = startTag12.getAttributes();
        java.lang.Class<?> wildcardClass19 = startTag12.getClass();
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str10, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNotNull(attributes11);
        org.junit.Assert.assertNotNull(startTag12);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "comment " + "'", str17, "comment ");
        org.junit.Assert.assertNotNull(attributes18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test4011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4011");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes1 = null;
        startTag0.attributes = attributes1;
        org.jsoup.parser.Token.Tag tag3 = startTag0.reset();
        org.jsoup.nodes.Attributes attributes5 = null;
        org.jsoup.parser.Token.StartTag startTag6 = startTag0.nameAttr("SYSTEM", attributes5);
        startTag6.newAttribute();
        org.jsoup.parser.Token.Tag tag9 = startTag6.name("<<PUBLIC>4>");
        org.junit.Assert.assertNotNull(tag3);
        org.junit.Assert.assertNotNull(startTag6);
        org.junit.Assert.assertNotNull(tag9);
    }

    @Test
    public void test4012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4012");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        org.jsoup.parser.Token.Comment comment1 = comment0.asComment();
        java.lang.String str2 = comment0.getData();
        java.lang.StringBuilder stringBuilder3 = comment0.data;
        java.lang.StringBuilder stringBuilder4 = comment0.data;
        boolean boolean5 = comment0.bogus;
        org.jsoup.parser.Token token6 = comment0.reset();
        org.jsoup.parser.Token token7 = comment0.reset();
        java.lang.String str8 = comment0.tokenType();
        comment0.bogus = false;
        boolean boolean11 = comment0.isEndTag();
        org.junit.Assert.assertNotNull(comment1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(token6);
        org.junit.Assert.assertNotNull(token7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Comment" + "'", str8, "Comment");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test4013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4013");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.getSystemIdentifier();
        boolean boolean2 = doctype0.forceQuirks;
        java.lang.String str3 = doctype0.getSystemIdentifier();
        java.lang.String str4 = doctype0.getName();
        doctype0.forceQuirks = false;
        org.jsoup.parser.Token.Doctype doctype7 = doctype0.asDoctype();
        java.lang.StringBuilder stringBuilder8 = doctype0.publicIdentifier;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(doctype7);
        org.junit.Assert.assertNotNull(stringBuilder8);
        org.junit.Assert.assertEquals(stringBuilder8.toString(), "");
    }

    @Test
    public void test4014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4014");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        org.jsoup.parser.Token token1 = comment0.reset();
        java.lang.String str2 = comment0.toString();
        java.lang.String str3 = comment0.toString();
        boolean boolean4 = comment0.bogus;
        org.junit.Assert.assertNotNull(token1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "<!---->" + "'", str2, "<!---->");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<!---->" + "'", str3, "<!---->");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test4015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4015");
        org.jsoup.parser.Token.Character character0 = new org.jsoup.parser.Token.Character();
        org.jsoup.parser.Token token1 = character0.reset();
        org.jsoup.parser.Token.TokenType tokenType2 = character0.type;
        org.junit.Assert.assertNotNull(token1);
        org.junit.Assert.assertTrue("'" + tokenType2 + "' != '" + org.jsoup.parser.Token.TokenType.Character + "'", tokenType2.equals(org.jsoup.parser.Token.TokenType.Character));
    }

    @Test
    public void test4016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4016");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        org.jsoup.parser.ParseSettings parseSettings4 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList5 = xmlTreeBuilder0.parseFragment("", "", parseErrorList3, parseSettings4);
        org.jsoup.parser.ParseErrorList parseErrorList8 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder9 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings10 = xmlTreeBuilder9.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings11 = xmlTreeBuilder9.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList14 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder15 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings16 = xmlTreeBuilder15.defaultSettings();
        xmlTreeBuilder9.initialiseParse("", "SYSTEM", parseErrorList14, parseSettings16);
        xmlTreeBuilder0.initialiseParse("Doctype", "PUBLIC", parseErrorList8, parseSettings16);
        org.jsoup.parser.ParseErrorList parseErrorList21 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder22 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList25 = null;
        org.jsoup.parser.ParseSettings parseSettings26 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList27 = xmlTreeBuilder22.parseFragment("", "", parseErrorList25, parseSettings26);
        org.jsoup.parser.ParseErrorList parseErrorList30 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder31 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings32 = xmlTreeBuilder31.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings33 = xmlTreeBuilder31.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList36 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder37 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings38 = xmlTreeBuilder37.defaultSettings();
        xmlTreeBuilder31.initialiseParse("", "SYSTEM", parseErrorList36, parseSettings38);
        xmlTreeBuilder22.initialiseParse("Doctype", "PUBLIC", parseErrorList30, parseSettings38);
        xmlTreeBuilder0.initialiseParse("EndTag", "<!---->", parseErrorList21, parseSettings38);
        org.jsoup.parser.Token.Doctype doctype42 = new org.jsoup.parser.Token.Doctype();
        xmlTreeBuilder0.insert(doctype42);
        boolean boolean44 = doctype42.isStartTag();
        boolean boolean45 = doctype42.isComment();
        boolean boolean46 = doctype42.forceQuirks;
        java.lang.StringBuilder stringBuilder47 = doctype42.name;
        java.lang.StringBuilder stringBuilder48 = doctype42.publicIdentifier;
        boolean boolean49 = doctype42.forceQuirks;
        boolean boolean50 = doctype42.forceQuirks;
        doctype42.forceQuirks = false;
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertNotNull(parseSettings10);
        org.junit.Assert.assertNotNull(parseSettings11);
        org.junit.Assert.assertNotNull(parseSettings16);
        org.junit.Assert.assertNotNull(nodeList27);
        org.junit.Assert.assertNotNull(parseSettings32);
        org.junit.Assert.assertNotNull(parseSettings33);
        org.junit.Assert.assertNotNull(parseSettings38);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(stringBuilder47);
        org.junit.Assert.assertEquals(stringBuilder47.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder48);
        org.junit.Assert.assertEquals(stringBuilder48.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
    }

    @Test
    public void test4017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4017");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag1 = startTag0.reset();
        boolean boolean2 = startTag0.isSelfClosing();
        org.jsoup.parser.Token.Tag tag4 = startTag0.name("a");
        tag4.appendAttributeValue("StartTag");
        tag4.newAttribute();
        tag4.appendTagName('a');
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(tag4);
    }

    @Test
    public void test4018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4018");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "<!---->");
        java.lang.String str6 = documentType4.absUrl("#EndTag");
        org.jsoup.parser.Token.StartTag startTag7 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.StartTag startTag8 = startTag7.asStartTag();
        boolean boolean9 = startTag7.selfClosing;
        java.lang.String str10 = startTag7.normalName();
        boolean boolean11 = documentType4.hasSameValue((java.lang.Object) startTag7);
        org.jsoup.parser.Token.Doctype doctype12 = new org.jsoup.parser.Token.Doctype();
        boolean boolean13 = doctype12.forceQuirks;
        doctype12.forceQuirks = false;
        boolean boolean16 = doctype12.isForceQuirks();
        java.lang.String str17 = doctype12.getPublicIdentifier();
        java.lang.String str18 = doctype12.getName();
        boolean boolean19 = doctype12.forceQuirks;
        boolean boolean20 = documentType4.hasSameValue((java.lang.Object) doctype12);
        java.lang.StringBuilder stringBuilder21 = doctype12.name;
        org.jsoup.parser.Token.reset(stringBuilder21);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(startTag8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(stringBuilder21);
        org.junit.Assert.assertEquals(stringBuilder21.toString(), "");
    }

    @Test
    public void test4019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4019");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "<!---->");
        java.lang.String str6 = documentType4.absUrl("#EndTag");
        org.jsoup.nodes.Node node9 = documentType4.attr("Doctype", "");
        java.util.List<org.jsoup.nodes.Node> nodeList10 = documentType4.childNodes();
        int int11 = documentType4.childNodeSize();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test4020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4020");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.parser.Token.StartTag startTag3 = startTag0.nameAttr("PUBLIC", attributes2);
        startTag0.selfClosing = true;
        java.lang.String str6 = startTag0.name();
        startTag0.appendAttributeValue("</EndTag>");
        startTag0.appendAttributeValue("Character");
        org.jsoup.nodes.Attributes attributes11 = startTag0.attributes;
        startTag0.newAttribute();
        org.jsoup.parser.Token.Tag tag14 = startTag0.name("public");
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "PUBLIC" + "'", str6, "PUBLIC");
        org.junit.Assert.assertNull(attributes11);
        org.junit.Assert.assertNotNull(tag14);
    }

    @Test
    public void test4021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4021");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "<!---->");
        int int5 = documentType4.childNodeSize();
        java.lang.String str6 = documentType4.outerHtml();
        org.jsoup.parser.Token.Doctype doctype7 = new org.jsoup.parser.Token.Doctype();
        boolean boolean8 = doctype7.forceQuirks;
        doctype7.forceQuirks = false;
        java.lang.String str11 = doctype7.getName();
        java.lang.StringBuilder stringBuilder12 = doctype7.name;
        java.lang.StringBuilder stringBuilder13 = documentType4.html(stringBuilder12);
        java.lang.String str15 = documentType4.absUrl("PUBLIC");
        java.util.List<org.jsoup.nodes.Node> nodeList16 = documentType4.siblingNodes();
        org.jsoup.nodes.Attributes attributes17 = documentType4.attributes();
        int int18 = documentType4.siblingIndex();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder19 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList22 = null;
        org.jsoup.parser.ParseSettings parseSettings23 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList24 = xmlTreeBuilder19.parseFragment("", "", parseErrorList22, parseSettings23);
        org.jsoup.parser.ParseErrorList parseErrorList27 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder28 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings29 = xmlTreeBuilder28.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings30 = xmlTreeBuilder28.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList33 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder34 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings35 = xmlTreeBuilder34.defaultSettings();
        xmlTreeBuilder28.initialiseParse("", "SYSTEM", parseErrorList33, parseSettings35);
        xmlTreeBuilder19.initialiseParse("Doctype", "PUBLIC", parseErrorList27, parseSettings35);
        org.jsoup.parser.ParseErrorList parseErrorList40 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder41 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList44 = null;
        org.jsoup.parser.ParseSettings parseSettings45 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList46 = xmlTreeBuilder41.parseFragment("", "", parseErrorList44, parseSettings45);
        org.jsoup.parser.ParseErrorList parseErrorList49 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder50 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings51 = xmlTreeBuilder50.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings52 = xmlTreeBuilder50.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList55 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder56 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings57 = xmlTreeBuilder56.defaultSettings();
        xmlTreeBuilder50.initialiseParse("", "SYSTEM", parseErrorList55, parseSettings57);
        xmlTreeBuilder41.initialiseParse("Doctype", "PUBLIC", parseErrorList49, parseSettings57);
        xmlTreeBuilder19.initialiseParse("EndTag", "<!---->", parseErrorList40, parseSettings57);
        org.jsoup.nodes.Document document63 = xmlTreeBuilder19.parse("<!---->", "SYSTEM");
        org.jsoup.nodes.Document document64 = document63.ownerDocument();
        java.util.List<org.jsoup.nodes.Node> nodeList65 = document63.childNodes();
        org.jsoup.nodes.Node node66 = document63.clone();
        org.jsoup.nodes.Node node69 = node66.attr("StartTag", "Doctype");
        java.lang.String str70 = node66.outerHtml();
        boolean boolean71 = documentType4.hasSameValue((java.lang.Object) node66);
        org.jsoup.nodes.Node node72 = documentType4.nextSibling();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.jsoup.nodes.Node> nodeList73 = node72.childNodes();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str6, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(stringBuilder12);
        org.junit.Assert.assertEquals(stringBuilder12.toString(), "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNotNull(stringBuilder13);
        org.junit.Assert.assertEquals(stringBuilder13.toString(), "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(nodeList16);
        org.junit.Assert.assertNotNull(attributes17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(nodeList24);
        org.junit.Assert.assertNotNull(parseSettings29);
        org.junit.Assert.assertNotNull(parseSettings30);
        org.junit.Assert.assertNotNull(parseSettings35);
        org.junit.Assert.assertNotNull(nodeList46);
        org.junit.Assert.assertNotNull(parseSettings51);
        org.junit.Assert.assertNotNull(parseSettings52);
        org.junit.Assert.assertNotNull(parseSettings57);
        org.junit.Assert.assertNotNull(document63);
        org.junit.Assert.assertNotNull(document64);
        org.junit.Assert.assertNotNull(nodeList65);
        org.junit.Assert.assertNotNull(node66);
        org.junit.Assert.assertNotNull(node69);
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "<!---->" + "'", str70, "<!---->");
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertNull(node72);
    }

    @Test
    public void test4022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4022");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        org.jsoup.parser.Token.TokenType tokenType1 = endTag0.type;
        java.lang.String str2 = endTag0.tokenType();
        endTag0.appendTagName("<!doctype hi! public \"hi!\">");
        endTag0.appendAttributeName('#');
        endTag0.finaliseTag();
        java.lang.String str8 = endTag0.name();
        org.junit.Assert.assertTrue("'" + tokenType1 + "' != '" + org.jsoup.parser.Token.TokenType.EndTag + "'", tokenType1.equals(org.jsoup.parser.Token.TokenType.EndTag));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "EndTag" + "'", str2, "EndTag");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "<!doctype hi! public \"hi!\">" + "'", str8, "<!doctype hi! public \"hi!\">");
    }

    @Test
    public void test4023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4023");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("comment ", "SYSTEM", "comment", "<!doctype hi! public \"hi!\">");
        java.lang.String str6 = documentType4.absUrl("<!doctype hi! public \"hi!\">");
        java.lang.String str7 = documentType4.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<!DOCTYPE comment  PUBLIC \"SYSTEM\" \"comment\">" + "'", str7, "<!DOCTYPE comment  PUBLIC \"SYSTEM\" \"comment\">");
    }

    @Test
    public void test4024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4024");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "<!---->");
        int int5 = documentType4.childNodeSize();
        java.lang.String str6 = documentType4.outerHtml();
        java.lang.Object obj7 = null;
        boolean boolean8 = documentType4.hasSameValue(obj7);
        org.jsoup.nodes.Node node9 = documentType4.nextSibling();
        org.jsoup.parser.Token.StartTag startTag10 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag11 = startTag10.reset();
        boolean boolean12 = startTag10.isSelfClosing();
        org.jsoup.parser.Token.Tag tag14 = startTag10.name("a");
        java.lang.String str15 = tag14.tagName;
        boolean boolean16 = documentType4.hasSameValue((java.lang.Object) tag14);
        tag14.appendAttributeName("#doctype");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str6, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(tag11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(tag14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "a" + "'", str15, "a");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test4025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4025");
        org.jsoup.parser.Token.Character character0 = new org.jsoup.parser.Token.Character();
        org.jsoup.parser.Token.Character character2 = character0.data("hi!");
        java.lang.String str3 = character2.toString();
        java.lang.String str4 = character2.getData();
        org.jsoup.parser.Token.Character character6 = character2.data("");
        java.lang.String str7 = character6.getData();
        java.lang.String str8 = character6.getData();
        org.jsoup.parser.Token.Character character10 = character6.data("<SYSTEM  name=\"hi!\" publicId=\"hi!\" systemId=\"\">");
        boolean boolean11 = character6.isStartTag();
        org.junit.Assert.assertNotNull(character2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(character6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(character10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test4026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4026");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        org.jsoup.parser.Token.Comment comment1 = comment0.asComment();
        java.lang.String str2 = comment1.toString();
        java.lang.StringBuilder stringBuilder3 = comment1.data;
        comment1.bogus = false;
        java.lang.StringBuilder stringBuilder6 = comment1.data;
        java.lang.StringBuilder stringBuilder7 = comment1.data;
        comment1.bogus = false;
        org.junit.Assert.assertNotNull(comment1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "<!---->" + "'", str2, "<!---->");
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder7);
        org.junit.Assert.assertEquals(stringBuilder7.toString(), "");
    }

    @Test
    public void test4027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4027");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        boolean boolean1 = doctype0.forceQuirks;
        java.lang.StringBuilder stringBuilder2 = doctype0.systemIdentifier;
        boolean boolean3 = doctype0.forceQuirks;
        java.lang.StringBuilder stringBuilder4 = doctype0.publicIdentifier;
        org.jsoup.nodes.DocumentType documentType9 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "<!---->");
        java.lang.String str10 = documentType9.outerHtml();
        java.lang.String str11 = documentType9.toString();
        java.lang.String str12 = documentType9.toString();
        org.jsoup.parser.Token.StartTag startTag13 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes15 = null;
        org.jsoup.parser.Token.StartTag startTag16 = startTag13.nameAttr("PUBLIC", attributes15);
        startTag13.appendAttributeValue(' ');
        char[] charArray22 = new char[] { ' ', '4', '#' };
        startTag13.appendAttributeValue(charArray22);
        org.jsoup.parser.Token.StartTag startTag24 = startTag13.asStartTag();
        org.jsoup.parser.Token.EndTag endTag26 = new org.jsoup.parser.Token.EndTag();
        org.jsoup.parser.Token.TokenType tokenType27 = endTag26.type;
        org.jsoup.parser.Token.EndTag endTag28 = endTag26.asEndTag();
        org.jsoup.nodes.DocumentType documentType33 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "<!---->");
        java.lang.String str34 = documentType33.outerHtml();
        org.jsoup.nodes.Attributes attributes35 = documentType33.attributes();
        endTag28.attributes = attributes35;
        org.jsoup.nodes.Attributes attributes37 = endTag28.getAttributes();
        org.jsoup.parser.Token.StartTag startTag38 = startTag13.nameAttr("hi!", attributes37);
        boolean boolean39 = documentType9.hasSameValue((java.lang.Object) startTag13);
        org.jsoup.parser.Token.Doctype doctype40 = new org.jsoup.parser.Token.Doctype();
        boolean boolean41 = doctype40.forceQuirks;
        java.lang.String str42 = doctype40.tokenType();
        java.lang.StringBuilder stringBuilder43 = doctype40.name;
        java.lang.StringBuilder stringBuilder44 = doctype40.name;
        java.lang.StringBuilder stringBuilder45 = doctype40.systemIdentifier;
        org.jsoup.parser.Token.TokenType tokenType46 = org.jsoup.parser.Token.TokenType.Comment;
        doctype40.type = tokenType46;
        startTag13.type = tokenType46;
        doctype0.type = tokenType46;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str10, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str11, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str12, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNotNull(startTag16);
        org.junit.Assert.assertNotNull(charArray22);
        org.junit.Assert.assertArrayEquals(charArray22, new char[] { ' ', '4', '#' });
        org.junit.Assert.assertNotNull(startTag24);
        org.junit.Assert.assertTrue("'" + tokenType27 + "' != '" + org.jsoup.parser.Token.TokenType.EndTag + "'", tokenType27.equals(org.jsoup.parser.Token.TokenType.EndTag));
        org.junit.Assert.assertNotNull(endTag28);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str34, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNotNull(attributes35);
        org.junit.Assert.assertNotNull(attributes37);
        org.junit.Assert.assertNotNull(startTag38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "Doctype" + "'", str42, "Doctype");
        org.junit.Assert.assertNotNull(stringBuilder43);
        org.junit.Assert.assertEquals(stringBuilder43.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder44);
        org.junit.Assert.assertEquals(stringBuilder44.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder45);
        org.junit.Assert.assertEquals(stringBuilder45.toString(), "");
        org.junit.Assert.assertTrue("'" + tokenType46 + "' != '" + org.jsoup.parser.Token.TokenType.Comment + "'", tokenType46.equals(org.jsoup.parser.Token.TokenType.Comment));
    }

    @Test
    public void test4028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4028");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "<!---->");
        java.lang.String str5 = documentType4.outerHtml();
        org.jsoup.nodes.Attributes attributes6 = documentType4.attributes();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = documentType4.childNodes();
        boolean boolean9 = documentType4.hasAttr("SYSTEM");
        java.lang.String str10 = documentType4.outerHtml();
        java.lang.String str11 = documentType4.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList12 = documentType4.siblingNodes();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str5, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str10, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str11, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNotNull(nodeList12);
    }

    @Test
    public void test4029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4029");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings2 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList5 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder6 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings7 = xmlTreeBuilder6.defaultSettings();
        xmlTreeBuilder0.initialiseParse("", "SYSTEM", parseErrorList5, parseSettings7);
        org.jsoup.parser.Token.Comment comment9 = new org.jsoup.parser.Token.Comment();
        org.jsoup.parser.Token.Comment comment10 = comment9.asComment();
        xmlTreeBuilder0.insert(comment9);
        org.jsoup.parser.ParseSettings parseSettings12 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.Document document15 = xmlTreeBuilder0.parse("EndTag", "</SYSTEM>");
        org.jsoup.nodes.Document document18 = xmlTreeBuilder0.parse("Character", "StartTag");
        org.jsoup.parser.ParseSettings parseSettings19 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.Token.Comment comment20 = new org.jsoup.parser.Token.Comment();
        org.jsoup.parser.Token token21 = comment20.reset();
        java.lang.String str22 = comment20.getData();
        boolean boolean23 = comment20.isEOF();
        org.jsoup.parser.Token.Comment comment24 = comment20.asComment();
        org.jsoup.parser.Token token25 = comment20.reset();
        java.lang.String str26 = comment20.getData();
        org.jsoup.parser.Token token27 = comment20.reset();
        boolean boolean28 = xmlTreeBuilder0.process((org.jsoup.parser.Token) comment20);
        org.jsoup.parser.Token.Doctype doctype29 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str30 = doctype29.getSystemIdentifier();
        boolean boolean31 = doctype29.forceQuirks;
        java.lang.StringBuilder stringBuilder32 = doctype29.name;
        java.lang.StringBuilder stringBuilder33 = doctype29.publicIdentifier;
        boolean boolean34 = xmlTreeBuilder0.process((org.jsoup.parser.Token) doctype29);
        org.junit.Assert.assertNotNull(parseSettings1);
        org.junit.Assert.assertNotNull(parseSettings2);
        org.junit.Assert.assertNotNull(parseSettings7);
        org.junit.Assert.assertNotNull(comment10);
        org.junit.Assert.assertNotNull(parseSettings12);
        org.junit.Assert.assertNotNull(document15);
        org.junit.Assert.assertNotNull(document18);
        org.junit.Assert.assertNotNull(parseSettings19);
        org.junit.Assert.assertNotNull(token21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(comment24);
        org.junit.Assert.assertNotNull(token25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(token27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(stringBuilder32);
        org.junit.Assert.assertEquals(stringBuilder32.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder33);
        org.junit.Assert.assertEquals(stringBuilder33.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
    }

    @Test
    public void test4030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4030");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList4 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder5 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings6 = xmlTreeBuilder5.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings7 = xmlTreeBuilder5.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList10 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder11 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings12 = xmlTreeBuilder11.defaultSettings();
        xmlTreeBuilder5.initialiseParse("", "SYSTEM", parseErrorList10, parseSettings12);
        xmlTreeBuilder0.initialiseParse("Comment", "Doctype", parseErrorList4, parseSettings12);
        org.jsoup.parser.Token.StartTag startTag16 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes18 = null;
        org.jsoup.parser.Token.StartTag startTag19 = startTag16.nameAttr("PUBLIC", attributes18);
        org.jsoup.nodes.DocumentType documentType25 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "<!---->");
        java.lang.String str26 = documentType25.outerHtml();
        org.jsoup.nodes.Attributes attributes27 = documentType25.attributes();
        org.jsoup.parser.Token.StartTag startTag28 = startTag16.nameAttr("Comment", attributes27);
        boolean boolean29 = xmlTreeBuilder0.processStartTag("<hi!>", attributes27);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder30 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings31 = xmlTreeBuilder30.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList34 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder35 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings36 = xmlTreeBuilder35.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings37 = xmlTreeBuilder35.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList40 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder41 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings42 = xmlTreeBuilder41.defaultSettings();
        xmlTreeBuilder35.initialiseParse("", "SYSTEM", parseErrorList40, parseSettings42);
        xmlTreeBuilder30.initialiseParse("Comment", "Doctype", parseErrorList34, parseSettings42);
        org.jsoup.parser.Token.Character character45 = new org.jsoup.parser.Token.Character();
        org.jsoup.parser.Token.Character character47 = character45.data("hi!");
        java.lang.String str48 = character47.toString();
        java.lang.String str49 = character47.getData();
        xmlTreeBuilder30.insert(character47);
        org.jsoup.parser.ParseErrorList parseErrorList53 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder54 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings55 = xmlTreeBuilder54.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList58 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder59 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings60 = xmlTreeBuilder59.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings61 = xmlTreeBuilder59.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList64 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder65 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings66 = xmlTreeBuilder65.defaultSettings();
        xmlTreeBuilder59.initialiseParse("", "SYSTEM", parseErrorList64, parseSettings66);
        xmlTreeBuilder54.initialiseParse("Comment", "Doctype", parseErrorList58, parseSettings66);
        xmlTreeBuilder30.initialiseParse("Doctype", "<!---->", parseErrorList53, parseSettings66);
        org.jsoup.parser.Token.Comment comment70 = new org.jsoup.parser.Token.Comment();
        org.jsoup.parser.Token.Comment comment71 = comment70.asComment();
        java.lang.String str72 = comment70.getData();
        java.lang.StringBuilder stringBuilder73 = comment70.data;
        xmlTreeBuilder30.insert(comment70);
        boolean boolean75 = comment70.bogus;
        java.lang.StringBuilder stringBuilder76 = comment70.data;
        boolean boolean77 = comment70.bogus;
        xmlTreeBuilder0.insert(comment70);
        java.lang.String str79 = comment70.getData();
        org.junit.Assert.assertNotNull(parseSettings1);
        org.junit.Assert.assertNotNull(parseSettings6);
        org.junit.Assert.assertNotNull(parseSettings7);
        org.junit.Assert.assertNotNull(parseSettings12);
        org.junit.Assert.assertNotNull(startTag19);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str26, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNotNull(attributes27);
        org.junit.Assert.assertNotNull(startTag28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(parseSettings31);
        org.junit.Assert.assertNotNull(parseSettings36);
        org.junit.Assert.assertNotNull(parseSettings37);
        org.junit.Assert.assertNotNull(parseSettings42);
        org.junit.Assert.assertNotNull(character47);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "hi!" + "'", str48, "hi!");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "hi!" + "'", str49, "hi!");
        org.junit.Assert.assertNotNull(parseSettings55);
        org.junit.Assert.assertNotNull(parseSettings60);
        org.junit.Assert.assertNotNull(parseSettings61);
        org.junit.Assert.assertNotNull(parseSettings66);
        org.junit.Assert.assertNotNull(comment71);
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "" + "'", str72, "");
        org.junit.Assert.assertNotNull(stringBuilder73);
        org.junit.Assert.assertEquals(stringBuilder73.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertNotNull(stringBuilder76);
        org.junit.Assert.assertEquals(stringBuilder76.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "" + "'", str79, "");
    }

    @Test
    public void test4031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4031");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.parser.Token.StartTag startTag3 = startTag0.nameAttr("PUBLIC", attributes2);
        boolean boolean4 = startTag3.isComment();
        org.jsoup.parser.Token.Tag tag6 = startTag3.name("<PUBLIC>");
        startTag3.newAttribute();
        org.jsoup.parser.Token.StartTag startTag8 = startTag3.asStartTag();
        java.lang.String str9 = startTag3.toString();
        org.jsoup.parser.Token.Tag tag10 = startTag3.reset();
        org.jsoup.parser.Token.StartTag startTag11 = startTag3.asStartTag();
        boolean boolean12 = startTag3.isDoctype();
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(tag6);
        org.junit.Assert.assertNotNull(startTag8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<<PUBLIC>>" + "'", str9, "<<PUBLIC>>");
        org.junit.Assert.assertNotNull(tag10);
        org.junit.Assert.assertNotNull(startTag11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test4032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4032");
        org.jsoup.parser.Token.Character character0 = new org.jsoup.parser.Token.Character();
        java.lang.String str1 = character0.getData();
        org.jsoup.parser.Token.Character character3 = character0.data("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(character3);
    }

    @Test
    public void test4033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4033");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "<!---->");
        int int5 = documentType4.childNodeSize();
        java.lang.String str7 = documentType4.absUrl("a");
        int int8 = documentType4.siblingIndex();
        java.lang.String str9 = documentType4.toString();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str9, "<!DOCTYPE hi! PUBLIC \"hi!\">");
    }

    @Test
    public void test4034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4034");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.parser.Token.StartTag startTag3 = startTag0.nameAttr("PUBLIC", attributes2);
        boolean boolean4 = startTag3.isComment();
        org.jsoup.parser.Token.Tag tag6 = startTag3.name("<PUBLIC>");
        startTag3.newAttribute();
        org.jsoup.parser.Token.StartTag startTag8 = startTag3.asStartTag();
        boolean boolean9 = startTag8.isSelfClosing();
        boolean boolean10 = startTag8.isCharacter();
        org.jsoup.parser.Token.Tag tag11 = startTag8.reset();
        org.jsoup.parser.Token.TokenType tokenType12 = tag11.type;
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(tag6);
        org.junit.Assert.assertNotNull(startTag8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(tag11);
        org.junit.Assert.assertTrue("'" + tokenType12 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType12.equals(org.jsoup.parser.Token.TokenType.StartTag));
    }

    @Test
    public void test4035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4035");
        org.jsoup.parser.Token.Character character0 = new org.jsoup.parser.Token.Character();
        org.jsoup.parser.Token.Character character2 = character0.data("hi!");
        java.lang.String str3 = character0.getData();
        org.jsoup.parser.Token token4 = character0.reset();
        java.lang.String str5 = character0.getData();
        org.junit.Assert.assertNotNull(character2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNotNull(token4);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test4036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4036");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        org.jsoup.parser.ParseSettings parseSettings4 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList5 = xmlTreeBuilder0.parseFragment("", "", parseErrorList3, parseSettings4);
        org.jsoup.parser.ParseErrorList parseErrorList8 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder9 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings10 = xmlTreeBuilder9.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings11 = xmlTreeBuilder9.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList14 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder15 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings16 = xmlTreeBuilder15.defaultSettings();
        xmlTreeBuilder9.initialiseParse("", "SYSTEM", parseErrorList14, parseSettings16);
        xmlTreeBuilder0.initialiseParse("Doctype", "PUBLIC", parseErrorList8, parseSettings16);
        org.jsoup.parser.ParseErrorList parseErrorList21 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder22 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList25 = null;
        org.jsoup.parser.ParseSettings parseSettings26 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList27 = xmlTreeBuilder22.parseFragment("", "", parseErrorList25, parseSettings26);
        org.jsoup.parser.ParseErrorList parseErrorList30 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder31 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings32 = xmlTreeBuilder31.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings33 = xmlTreeBuilder31.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList36 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder37 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings38 = xmlTreeBuilder37.defaultSettings();
        xmlTreeBuilder31.initialiseParse("", "SYSTEM", parseErrorList36, parseSettings38);
        xmlTreeBuilder22.initialiseParse("Doctype", "PUBLIC", parseErrorList30, parseSettings38);
        xmlTreeBuilder0.initialiseParse("EndTag", "<!---->", parseErrorList21, parseSettings38);
        org.jsoup.parser.Token.Doctype doctype42 = new org.jsoup.parser.Token.Doctype();
        xmlTreeBuilder0.insert(doctype42);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder44 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList47 = null;
        org.jsoup.parser.ParseSettings parseSettings48 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList49 = xmlTreeBuilder44.parseFragment("", "", parseErrorList47, parseSettings48);
        org.jsoup.parser.ParseErrorList parseErrorList52 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder53 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings54 = xmlTreeBuilder53.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings55 = xmlTreeBuilder53.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList58 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder59 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings60 = xmlTreeBuilder59.defaultSettings();
        xmlTreeBuilder53.initialiseParse("", "SYSTEM", parseErrorList58, parseSettings60);
        xmlTreeBuilder44.initialiseParse("Doctype", "PUBLIC", parseErrorList52, parseSettings60);
        org.jsoup.parser.ParseErrorList parseErrorList65 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder66 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList69 = null;
        org.jsoup.parser.ParseSettings parseSettings70 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList71 = xmlTreeBuilder66.parseFragment("", "", parseErrorList69, parseSettings70);
        org.jsoup.parser.ParseErrorList parseErrorList74 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder75 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings76 = xmlTreeBuilder75.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings77 = xmlTreeBuilder75.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList80 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder81 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings82 = xmlTreeBuilder81.defaultSettings();
        xmlTreeBuilder75.initialiseParse("", "SYSTEM", parseErrorList80, parseSettings82);
        xmlTreeBuilder66.initialiseParse("Doctype", "PUBLIC", parseErrorList74, parseSettings82);
        xmlTreeBuilder44.initialiseParse("EndTag", "<!---->", parseErrorList65, parseSettings82);
        org.jsoup.parser.Token.Doctype doctype86 = new org.jsoup.parser.Token.Doctype();
        xmlTreeBuilder44.insert(doctype86);
        xmlTreeBuilder0.insert(doctype86);
        org.jsoup.nodes.Document document91 = xmlTreeBuilder0.parse("<!DOCTYPE #EndTag PUBLIC \"<!DOCTYPE <!DOCTYPE hi! PUBLIC \"hi!\"> PUBLIC \"PUBLIC\" \"#doctype\">\" \"Doctype\">", "<!DOCTYPE Character PUBLIC \"#endtag\" \"PUBLIC\">");
        java.lang.Class<?> wildcardClass92 = document91.getClass();
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertNotNull(parseSettings10);
        org.junit.Assert.assertNotNull(parseSettings11);
        org.junit.Assert.assertNotNull(parseSettings16);
        org.junit.Assert.assertNotNull(nodeList27);
        org.junit.Assert.assertNotNull(parseSettings32);
        org.junit.Assert.assertNotNull(parseSettings33);
        org.junit.Assert.assertNotNull(parseSettings38);
        org.junit.Assert.assertNotNull(nodeList49);
        org.junit.Assert.assertNotNull(parseSettings54);
        org.junit.Assert.assertNotNull(parseSettings55);
        org.junit.Assert.assertNotNull(parseSettings60);
        org.junit.Assert.assertNotNull(nodeList71);
        org.junit.Assert.assertNotNull(parseSettings76);
        org.junit.Assert.assertNotNull(parseSettings77);
        org.junit.Assert.assertNotNull(parseSettings82);
        org.junit.Assert.assertNotNull(document91);
        org.junit.Assert.assertNotNull(wildcardClass92);
    }

    @Test
    public void test4037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4037");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        org.jsoup.parser.ParseSettings parseSettings4 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList5 = xmlTreeBuilder0.parseFragment("", "", parseErrorList3, parseSettings4);
        org.jsoup.parser.ParseErrorList parseErrorList8 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder9 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings10 = xmlTreeBuilder9.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings11 = xmlTreeBuilder9.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList14 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder15 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings16 = xmlTreeBuilder15.defaultSettings();
        xmlTreeBuilder9.initialiseParse("", "SYSTEM", parseErrorList14, parseSettings16);
        xmlTreeBuilder0.initialiseParse("Doctype", "PUBLIC", parseErrorList8, parseSettings16);
        org.jsoup.parser.ParseErrorList parseErrorList21 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder22 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList25 = null;
        org.jsoup.parser.ParseSettings parseSettings26 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList27 = xmlTreeBuilder22.parseFragment("", "", parseErrorList25, parseSettings26);
        org.jsoup.parser.ParseErrorList parseErrorList30 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder31 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings32 = xmlTreeBuilder31.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings33 = xmlTreeBuilder31.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList36 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder37 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings38 = xmlTreeBuilder37.defaultSettings();
        xmlTreeBuilder31.initialiseParse("", "SYSTEM", parseErrorList36, parseSettings38);
        xmlTreeBuilder22.initialiseParse("Doctype", "PUBLIC", parseErrorList30, parseSettings38);
        xmlTreeBuilder0.initialiseParse("EndTag", "<!---->", parseErrorList21, parseSettings38);
        org.jsoup.nodes.Document document44 = xmlTreeBuilder0.parse("<!---->", "SYSTEM");
        org.jsoup.nodes.Document document45 = document44.ownerDocument();
        java.util.List<org.jsoup.nodes.Node> nodeList46 = document44.childNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList47 = document44.siblingNodes();
        java.lang.String str48 = document44.baseUri();
        int int49 = document44.childNodeSize();
        org.jsoup.nodes.Node node51 = document44.removeAttr("<<!doctype hi! public \"hi!\">>");
        org.jsoup.parser.Token.Doctype doctype52 = new org.jsoup.parser.Token.Doctype();
        boolean boolean53 = doctype52.forceQuirks;
        java.lang.StringBuilder stringBuilder54 = doctype52.systemIdentifier;
        java.lang.String str55 = doctype52.getSystemIdentifier();
        java.lang.String str56 = doctype52.getName();
        java.lang.String str57 = doctype52.tokenType();
        java.lang.StringBuilder stringBuilder58 = doctype52.systemIdentifier;
        java.lang.StringBuilder stringBuilder59 = node51.html(stringBuilder58);
        org.jsoup.parser.Token.Doctype doctype60 = new org.jsoup.parser.Token.Doctype();
        boolean boolean61 = doctype60.forceQuirks;
        doctype60.forceQuirks = false;
        java.lang.String str64 = doctype60.getName();
        java.lang.String str65 = doctype60.getName();
        java.lang.StringBuilder stringBuilder66 = doctype60.name;
        java.lang.StringBuilder stringBuilder67 = doctype60.name;
        java.lang.StringBuilder stringBuilder68 = doctype60.name;
        java.lang.StringBuilder stringBuilder69 = node51.html(stringBuilder68);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node72 = node51.attr("", "<<Comment   name=\"hi!\" publicId=\"hi!\" systemId=\"\">>");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertNotNull(parseSettings10);
        org.junit.Assert.assertNotNull(parseSettings11);
        org.junit.Assert.assertNotNull(parseSettings16);
        org.junit.Assert.assertNotNull(nodeList27);
        org.junit.Assert.assertNotNull(parseSettings32);
        org.junit.Assert.assertNotNull(parseSettings33);
        org.junit.Assert.assertNotNull(parseSettings38);
        org.junit.Assert.assertNotNull(document44);
        org.junit.Assert.assertNotNull(document45);
        org.junit.Assert.assertNotNull(nodeList46);
        org.junit.Assert.assertNotNull(nodeList47);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "SYSTEM" + "'", str48, "SYSTEM");
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 1 + "'", int49 == 1);
        org.junit.Assert.assertNotNull(node51);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(stringBuilder54);
        org.junit.Assert.assertEquals(stringBuilder54.toString(), "\n<!---->");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "" + "'", str55, "");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "" + "'", str56, "");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "Doctype" + "'", str57, "Doctype");
        org.junit.Assert.assertNotNull(stringBuilder58);
        org.junit.Assert.assertEquals(stringBuilder58.toString(), "\n<!---->");
        org.junit.Assert.assertNotNull(stringBuilder59);
        org.junit.Assert.assertEquals(stringBuilder59.toString(), "\n<!---->");
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "" + "'", str64, "");
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "" + "'", str65, "");
        org.junit.Assert.assertNotNull(stringBuilder66);
        org.junit.Assert.assertEquals(stringBuilder66.toString(), "\n<!---->");
        org.junit.Assert.assertNotNull(stringBuilder67);
        org.junit.Assert.assertEquals(stringBuilder67.toString(), "\n<!---->");
        org.junit.Assert.assertNotNull(stringBuilder68);
        org.junit.Assert.assertEquals(stringBuilder68.toString(), "\n<!---->");
        org.junit.Assert.assertNotNull(stringBuilder69);
        org.junit.Assert.assertEquals(stringBuilder69.toString(), "\n<!---->");
    }

    @Test
    public void test4038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4038");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes1 = null;
        startTag0.attributes = attributes1;
        org.jsoup.parser.Token.Tag tag3 = startTag0.reset();
        tag3.normalName = "<!---->";
        org.jsoup.parser.Token.EndTag endTag6 = new org.jsoup.parser.Token.EndTag();
        endTag6.finaliseTag();
        org.jsoup.parser.Token.EndTag endTag8 = endTag6.asEndTag();
        endTag6.tagName = "";
        endTag6.tagName = "<!---->";
        org.jsoup.parser.Token.TokenType tokenType13 = endTag6.type;
        tag3.type = tokenType13;
        tag3.appendTagName(' ');
        org.junit.Assert.assertNotNull(tag3);
        org.junit.Assert.assertNotNull(endTag8);
        org.junit.Assert.assertTrue("'" + tokenType13 + "' != '" + org.jsoup.parser.Token.TokenType.EndTag + "'", tokenType13.equals(org.jsoup.parser.Token.TokenType.EndTag));
    }

    @Test
    public void test4039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4039");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "<!---->");
        java.lang.String str6 = documentType4.absUrl("EndTag");
        java.lang.String str7 = documentType4.nodeName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#doctype" + "'", str7, "#doctype");
    }

    @Test
    public void test4040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4040");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<Comment>", "character", " ", "PUBLIC");
    }

    @Test
    public void test4041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4041");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "<!---->");
        java.lang.String str6 = documentType4.absUrl("#EndTag");
        org.jsoup.nodes.Node node9 = documentType4.attr("Doctype", "");
        boolean boolean11 = documentType4.hasAttr(" ");
        int int12 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList13 = documentType4.childNodes();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(nodeList13);
    }

    @Test
    public void test4042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4042");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.finaliseTag();
        org.jsoup.parser.Token.EndTag endTag2 = endTag0.asEndTag();
        org.jsoup.nodes.Attributes attributes3 = endTag0.getAttributes();
        boolean boolean4 = endTag0.isComment();
        endTag0.selfClosing = true;
        endTag0.selfClosing = true;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Character character9 = endTag0.asCharacter();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$EndTag cannot be cast to class org.jsoup.parser.Token$Character (org.jsoup.parser.Token$EndTag and org.jsoup.parser.Token$Character are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(endTag2);
        org.junit.Assert.assertNull(attributes3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test4043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4043");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.parser.Token.StartTag startTag3 = startTag0.nameAttr("PUBLIC", attributes2);
        org.jsoup.nodes.DocumentType documentType9 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "<!---->");
        java.lang.String str10 = documentType9.outerHtml();
        org.jsoup.nodes.Attributes attributes11 = documentType9.attributes();
        org.jsoup.parser.Token.StartTag startTag12 = startTag0.nameAttr("Comment", attributes11);
        startTag12.appendTagName(' ');
        boolean boolean15 = startTag12.isCharacter();
        org.jsoup.parser.Token.EndTag endTag16 = new org.jsoup.parser.Token.EndTag();
        endTag16.finaliseTag();
        org.jsoup.parser.Token.EndTag endTag18 = endTag16.asEndTag();
        org.jsoup.parser.Token.Tag tag19 = endTag16.reset();
        endTag16.selfClosing = true;
        boolean boolean22 = endTag16.isComment();
        org.jsoup.parser.Token.StartTag startTag23 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes25 = null;
        org.jsoup.parser.Token.StartTag startTag26 = startTag23.nameAttr("PUBLIC", attributes25);
        boolean boolean27 = startTag26.isComment();
        org.jsoup.parser.Token.Tag tag29 = startTag26.name("<PUBLIC>");
        startTag26.newAttribute();
        org.jsoup.parser.Token.StartTag startTag31 = startTag26.asStartTag();
        java.lang.String str32 = startTag26.toString();
        org.jsoup.parser.Token.Tag tag33 = startTag26.reset();
        org.jsoup.parser.Token.StartTag startTag34 = startTag26.asStartTag();
        org.jsoup.parser.Token.EndTag endTag35 = new org.jsoup.parser.Token.EndTag();
        org.jsoup.parser.Token.TokenType tokenType36 = endTag35.type;
        org.jsoup.parser.Token.StartTag startTag37 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag38 = startTag37.reset();
        boolean boolean39 = startTag37.isSelfClosing();
        org.jsoup.parser.Token.Tag tag41 = startTag37.name("a");
        org.jsoup.parser.Token.EndTag endTag42 = new org.jsoup.parser.Token.EndTag();
        endTag42.finaliseTag();
        org.jsoup.parser.Token.EndTag endTag44 = endTag42.asEndTag();
        char[] charArray48 = new char[] { 'a', '#', ' ' };
        endTag42.appendAttributeValue(charArray48);
        startTag37.appendAttributeValue(charArray48);
        endTag35.appendAttributeValue(charArray48);
        org.jsoup.parser.Token.EndTag endTag52 = new org.jsoup.parser.Token.EndTag();
        boolean boolean53 = endTag52.isEndTag();
        java.lang.String str54 = endTag52.tagName;
        endTag52.appendAttributeValue("PUBLIC");
        endTag52.normalName = "";
        org.jsoup.parser.Token.Tag tag59 = endTag52.reset();
        tag59.finaliseTag();
        org.jsoup.nodes.DocumentType documentType65 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "<!---->");
        org.jsoup.nodes.Node node66 = documentType65.parentNode();
        org.jsoup.parser.Token.StartTag startTag67 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes68 = null;
        startTag67.attributes = attributes68;
        org.jsoup.parser.Token.Tag tag70 = startTag67.reset();
        org.jsoup.nodes.Attributes attributes72 = null;
        org.jsoup.parser.Token.StartTag startTag73 = startTag67.nameAttr("SYSTEM", attributes72);
        org.jsoup.parser.Token.Tag tag75 = startTag67.name("");
        org.jsoup.parser.Token.StartTag startTag76 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag77 = startTag76.reset();
        boolean boolean78 = startTag76.isSelfClosing();
        org.jsoup.parser.Token.Tag tag80 = startTag76.name("a");
        org.jsoup.parser.Token.EndTag endTag81 = new org.jsoup.parser.Token.EndTag();
        endTag81.finaliseTag();
        org.jsoup.parser.Token.EndTag endTag83 = endTag81.asEndTag();
        char[] charArray87 = new char[] { 'a', '#', ' ' };
        endTag81.appendAttributeValue(charArray87);
        startTag76.appendAttributeValue(charArray87);
        startTag67.appendAttributeValue(charArray87);
        boolean boolean91 = documentType65.hasSameValue((java.lang.Object) charArray87);
        tag59.appendAttributeValue(charArray87);
        endTag35.appendAttributeValue(charArray87);
        startTag26.appendAttributeValue(charArray87);
        endTag16.appendAttributeValue(charArray87);
        startTag12.appendAttributeValue(charArray87);
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str10, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNotNull(attributes11);
        org.junit.Assert.assertNotNull(startTag12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(endTag18);
        org.junit.Assert.assertNotNull(tag19);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(startTag26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(tag29);
        org.junit.Assert.assertNotNull(startTag31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "<<PUBLIC>>" + "'", str32, "<<PUBLIC>>");
        org.junit.Assert.assertNotNull(tag33);
        org.junit.Assert.assertNotNull(startTag34);
        org.junit.Assert.assertTrue("'" + tokenType36 + "' != '" + org.jsoup.parser.Token.TokenType.EndTag + "'", tokenType36.equals(org.jsoup.parser.Token.TokenType.EndTag));
        org.junit.Assert.assertNotNull(tag38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(tag41);
        org.junit.Assert.assertNotNull(endTag44);
        org.junit.Assert.assertNotNull(charArray48);
        org.junit.Assert.assertArrayEquals(charArray48, new char[] { 'a', '#', ' ' });
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNull(str54);
        org.junit.Assert.assertNotNull(tag59);
        org.junit.Assert.assertNull(node66);
        org.junit.Assert.assertNotNull(tag70);
        org.junit.Assert.assertNotNull(startTag73);
        org.junit.Assert.assertNotNull(tag75);
        org.junit.Assert.assertNotNull(tag77);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertNotNull(tag80);
        org.junit.Assert.assertNotNull(endTag83);
        org.junit.Assert.assertNotNull(charArray87);
        org.junit.Assert.assertArrayEquals(charArray87, new char[] { 'a', '#', ' ' });
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
    }

    @Test
    public void test4044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4044");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings2 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings3 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.Document document6 = xmlTreeBuilder0.parse("PUBLIC", "hi!");
        org.jsoup.parser.ParseErrorList parseErrorList9 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder10 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList13 = null;
        org.jsoup.parser.ParseSettings parseSettings14 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList15 = xmlTreeBuilder10.parseFragment("", "", parseErrorList13, parseSettings14);
        org.jsoup.parser.ParseErrorList parseErrorList18 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder19 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings20 = xmlTreeBuilder19.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings21 = xmlTreeBuilder19.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList24 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder25 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings26 = xmlTreeBuilder25.defaultSettings();
        xmlTreeBuilder19.initialiseParse("", "SYSTEM", parseErrorList24, parseSettings26);
        xmlTreeBuilder10.initialiseParse("Doctype", "PUBLIC", parseErrorList18, parseSettings26);
        org.jsoup.parser.ParseErrorList parseErrorList31 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder32 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList35 = null;
        org.jsoup.parser.ParseSettings parseSettings36 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList37 = xmlTreeBuilder32.parseFragment("", "", parseErrorList35, parseSettings36);
        org.jsoup.parser.ParseErrorList parseErrorList40 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder41 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings42 = xmlTreeBuilder41.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings43 = xmlTreeBuilder41.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList46 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder47 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings48 = xmlTreeBuilder47.defaultSettings();
        xmlTreeBuilder41.initialiseParse("", "SYSTEM", parseErrorList46, parseSettings48);
        xmlTreeBuilder32.initialiseParse("Doctype", "PUBLIC", parseErrorList40, parseSettings48);
        xmlTreeBuilder10.initialiseParse("EndTag", "<!---->", parseErrorList31, parseSettings48);
        org.jsoup.parser.Token.Doctype doctype52 = new org.jsoup.parser.Token.Doctype();
        xmlTreeBuilder10.insert(doctype52);
        org.jsoup.parser.ParseErrorList parseErrorList56 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder57 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings58 = xmlTreeBuilder57.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings59 = xmlTreeBuilder57.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList62 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder63 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings64 = xmlTreeBuilder63.defaultSettings();
        xmlTreeBuilder57.initialiseParse("", "SYSTEM", parseErrorList62, parseSettings64);
        java.util.List<org.jsoup.nodes.Node> nodeList66 = xmlTreeBuilder10.parseFragment("<!DOCTYPE hi! PUBLIC \"hi!\">", "<!DOCTYPE hi! PUBLIC \"hi!\">", parseErrorList56, parseSettings64);
        xmlTreeBuilder0.initialiseParse("SYSTEM", "Comment", parseErrorList9, parseSettings64);
        org.jsoup.parser.Token.Doctype doctype68 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str69 = doctype68.getSystemIdentifier();
        boolean boolean70 = doctype68.forceQuirks;
        java.lang.StringBuilder stringBuilder71 = doctype68.publicIdentifier;
        java.lang.StringBuilder stringBuilder72 = doctype68.name;
        java.lang.StringBuilder stringBuilder73 = doctype68.name;
        xmlTreeBuilder0.insert(doctype68);
        java.lang.String str75 = doctype68.getSystemIdentifier();
        org.junit.Assert.assertNotNull(parseSettings1);
        org.junit.Assert.assertNotNull(parseSettings2);
        org.junit.Assert.assertNotNull(parseSettings3);
        org.junit.Assert.assertNotNull(document6);
        org.junit.Assert.assertNotNull(nodeList15);
        org.junit.Assert.assertNotNull(parseSettings20);
        org.junit.Assert.assertNotNull(parseSettings21);
        org.junit.Assert.assertNotNull(parseSettings26);
        org.junit.Assert.assertNotNull(nodeList37);
        org.junit.Assert.assertNotNull(parseSettings42);
        org.junit.Assert.assertNotNull(parseSettings43);
        org.junit.Assert.assertNotNull(parseSettings48);
        org.junit.Assert.assertNotNull(parseSettings58);
        org.junit.Assert.assertNotNull(parseSettings59);
        org.junit.Assert.assertNotNull(parseSettings64);
        org.junit.Assert.assertNotNull(nodeList66);
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "" + "'", str69, "");
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertNotNull(stringBuilder71);
        org.junit.Assert.assertEquals(stringBuilder71.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder72);
        org.junit.Assert.assertEquals(stringBuilder72.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder73);
        org.junit.Assert.assertEquals(stringBuilder73.toString(), "");
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "" + "'", str75, "");
    }

    @Test
    public void test4045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4045");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings2 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings3 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.Document document6 = xmlTreeBuilder0.parse("PUBLIC", "hi!");
        org.jsoup.nodes.Node node8 = document6.removeAttr("PUBLIC");
        java.util.List<org.jsoup.nodes.Node> nodeList9 = document6.siblingNodes();
        java.lang.String str11 = document6.attr("a");
        java.lang.String str12 = document6.baseUri();
        java.util.List<org.jsoup.nodes.Node> nodeList13 = document6.siblingNodes();
        java.lang.String str14 = document6.baseUri();
        // The following exception was thrown during execution in test generation
        try {
            document6.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings1);
        org.junit.Assert.assertNotNull(parseSettings2);
        org.junit.Assert.assertNotNull(parseSettings3);
        org.junit.Assert.assertNotNull(document6);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(nodeList13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test4046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4046");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.finaliseTag();
        org.jsoup.parser.Token.EndTag endTag2 = endTag0.asEndTag();
        org.jsoup.parser.Token.Tag tag3 = endTag0.reset();
        org.jsoup.nodes.Attributes attributes4 = tag3.getAttributes();
        org.jsoup.parser.Token.Tag tag5 = tag3.reset();
        java.lang.String str6 = tag3.normalName;
        java.lang.String str7 = tag3.normalName();
        org.junit.Assert.assertNotNull(endTag2);
        org.junit.Assert.assertNotNull(tag3);
        org.junit.Assert.assertNull(attributes4);
        org.junit.Assert.assertNotNull(tag5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test4047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4047");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes1 = null;
        startTag0.attributes = attributes1;
        org.jsoup.parser.Token.Tag tag3 = startTag0.reset();
        startTag0.appendTagName("hi!");
        org.jsoup.parser.Token.Tag tag7 = startTag0.name("hi!");
        startTag0.appendTagName("<!DOCTYPE Character PUBLIC \"#endtag\" \"PUBLIC\">");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Comment comment10 = startTag0.asComment();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$Comment (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$Comment are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tag3);
        org.junit.Assert.assertNotNull(tag7);
    }

    @Test
    public void test4048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4048");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "<!---->");
        org.jsoup.nodes.Node node5 = documentType4.parent();
        java.lang.String str6 = documentType4.baseUri();
        int int7 = documentType4.siblingIndex();
        int int8 = documentType4.childNodeSize();
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!---->" + "'", str6, "<!---->");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test4049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4049");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        boolean boolean1 = doctype0.forceQuirks;
        doctype0.forceQuirks = false;
        java.lang.String str4 = doctype0.getName();
        java.lang.StringBuilder stringBuilder5 = doctype0.name;
        java.lang.StringBuilder stringBuilder6 = doctype0.publicIdentifier;
        java.lang.StringBuilder stringBuilder7 = doctype0.systemIdentifier;
        java.lang.String str8 = doctype0.getPublicIdentifier();
        java.lang.String str9 = doctype0.getName();
        java.lang.String str10 = doctype0.getSystemIdentifier();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder7);
        org.junit.Assert.assertEquals(stringBuilder7.toString(), "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test4050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4050");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList4 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder5 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings6 = xmlTreeBuilder5.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings7 = xmlTreeBuilder5.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList10 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder11 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings12 = xmlTreeBuilder11.defaultSettings();
        xmlTreeBuilder5.initialiseParse("", "SYSTEM", parseErrorList10, parseSettings12);
        xmlTreeBuilder0.initialiseParse("Comment", "Doctype", parseErrorList4, parseSettings12);
        org.jsoup.nodes.DocumentType documentType20 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "<!---->");
        java.lang.String str21 = documentType20.outerHtml();
        org.jsoup.nodes.Attributes attributes22 = documentType20.attributes();
        org.jsoup.nodes.Attributes attributes23 = documentType20.attributes();
        boolean boolean24 = xmlTreeBuilder0.processStartTag("EndTag", attributes23);
        org.jsoup.parser.ParseErrorList parseErrorList27 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder28 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings29 = xmlTreeBuilder28.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList30 = xmlTreeBuilder0.parseFragment("</SYSTEM>", "<PUBLIC>", parseErrorList27, parseSettings29);
        org.jsoup.nodes.Document document33 = xmlTreeBuilder0.parse("Comment", "a");
        org.jsoup.parser.Token.StartTag startTag34 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.StartTag startTag35 = startTag34.asStartTag();
        boolean boolean36 = startTag34.selfClosing;
        org.jsoup.nodes.Attributes attributes37 = startTag34.attributes;
        startTag34.appendAttributeValue("");
        startTag34.newAttribute();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element41 = xmlTreeBuilder0.insert(startTag34);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must be false");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings1);
        org.junit.Assert.assertNotNull(parseSettings6);
        org.junit.Assert.assertNotNull(parseSettings7);
        org.junit.Assert.assertNotNull(parseSettings12);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str21, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNotNull(attributes22);
        org.junit.Assert.assertNotNull(attributes23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(parseSettings29);
        org.junit.Assert.assertNotNull(nodeList30);
        org.junit.Assert.assertNotNull(document33);
        org.junit.Assert.assertNotNull(startTag35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(attributes37);
    }

    @Test
    public void test4051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4051");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "<!---->");
        int int5 = documentType4.childNodeSize();
        org.jsoup.nodes.Attributes attributes6 = documentType4.attributes();
        int int7 = documentType4.childNodeSize();
        documentType4.setBaseUri("");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test4052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4052");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "<!---->");
        java.lang.String str5 = documentType4.outerHtml();
        org.jsoup.nodes.Attributes attributes6 = documentType4.attributes();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = documentType4.childNodes();
        java.lang.String str8 = documentType4.outerHtml();
        java.lang.String str10 = documentType4.absUrl("<<!DOCTYPE hi! PUBLIC \"hi!\">  name=\"hi!\" publicId=\"hi!\" systemId=\"\">");
        org.jsoup.nodes.Node node11 = documentType4.nextSibling();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str5, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str8, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(node11);
    }

    @Test
    public void test4053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4053");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "<!---->");
        int int5 = documentType4.childNodeSize();
        org.jsoup.nodes.Attributes attributes6 = documentType4.attributes();
        org.jsoup.nodes.Node node7 = documentType4.clone();
        org.jsoup.nodes.Node node8 = node7.clone();
        org.jsoup.nodes.Node node11 = node8.attr("4", "<!doctype hi! public \"hi!\">");
        int int12 = node8.childNodeSize();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test4054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4054");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        org.jsoup.parser.ParseSettings parseSettings4 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList5 = xmlTreeBuilder0.parseFragment("", "", parseErrorList3, parseSettings4);
        org.jsoup.parser.ParseErrorList parseErrorList8 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder9 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings10 = xmlTreeBuilder9.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings11 = xmlTreeBuilder9.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList14 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder15 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings16 = xmlTreeBuilder15.defaultSettings();
        xmlTreeBuilder9.initialiseParse("", "SYSTEM", parseErrorList14, parseSettings16);
        xmlTreeBuilder0.initialiseParse("Doctype", "PUBLIC", parseErrorList8, parseSettings16);
        org.jsoup.parser.ParseErrorList parseErrorList21 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder22 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList25 = null;
        org.jsoup.parser.ParseSettings parseSettings26 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList27 = xmlTreeBuilder22.parseFragment("", "", parseErrorList25, parseSettings26);
        org.jsoup.parser.ParseErrorList parseErrorList30 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder31 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings32 = xmlTreeBuilder31.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings33 = xmlTreeBuilder31.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList36 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder37 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings38 = xmlTreeBuilder37.defaultSettings();
        xmlTreeBuilder31.initialiseParse("", "SYSTEM", parseErrorList36, parseSettings38);
        xmlTreeBuilder22.initialiseParse("Doctype", "PUBLIC", parseErrorList30, parseSettings38);
        xmlTreeBuilder0.initialiseParse("EndTag", "<!---->", parseErrorList21, parseSettings38);
        org.jsoup.nodes.Document document44 = xmlTreeBuilder0.parse("<!---->", "SYSTEM");
        org.jsoup.nodes.Document document45 = document44.ownerDocument();
        java.util.List<org.jsoup.nodes.Node> nodeList46 = document44.childNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList47 = document44.siblingNodes();
        java.lang.String str48 = document44.baseUri();
        org.jsoup.nodes.Node node49 = document44.nextSibling();
        org.jsoup.nodes.Node node51 = document44.removeAttr("<a>");
        org.jsoup.nodes.Document document52 = node51.ownerDocument();
        org.jsoup.nodes.Node node54 = document52.removeAttr("comment ");
        java.lang.String str55 = node54.outerHtml();
        java.lang.String str56 = node54.outerHtml();
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertNotNull(parseSettings10);
        org.junit.Assert.assertNotNull(parseSettings11);
        org.junit.Assert.assertNotNull(parseSettings16);
        org.junit.Assert.assertNotNull(nodeList27);
        org.junit.Assert.assertNotNull(parseSettings32);
        org.junit.Assert.assertNotNull(parseSettings33);
        org.junit.Assert.assertNotNull(parseSettings38);
        org.junit.Assert.assertNotNull(document44);
        org.junit.Assert.assertNotNull(document45);
        org.junit.Assert.assertNotNull(nodeList46);
        org.junit.Assert.assertNotNull(nodeList47);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "SYSTEM" + "'", str48, "SYSTEM");
        org.junit.Assert.assertNull(node49);
        org.junit.Assert.assertNotNull(node51);
        org.junit.Assert.assertNotNull(document52);
        org.junit.Assert.assertNotNull(node54);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "<!---->" + "'", str55, "<!---->");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "<!---->" + "'", str56, "<!---->");
    }

    @Test
    public void test4055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4055");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.parser.Token.StartTag startTag3 = startTag0.nameAttr("PUBLIC", attributes2);
        startTag0.appendAttributeValue(' ');
        char[] charArray9 = new char[] { ' ', '4', '#' };
        startTag0.appendAttributeValue(charArray9);
        org.jsoup.parser.Token.StartTag startTag11 = startTag0.asStartTag();
        startTag0.tagName = "<!doctype hi! public \"hi!\">";
        java.lang.String str14 = startTag0.tokenType();
        org.jsoup.parser.Token.Tag tag15 = startTag0.reset();
        org.jsoup.nodes.DocumentType documentType20 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "<!---->");
        int int21 = documentType20.childNodeSize();
        org.jsoup.parser.Token.StartTag startTag22 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes24 = null;
        org.jsoup.parser.Token.StartTag startTag25 = startTag22.nameAttr("PUBLIC", attributes24);
        boolean boolean26 = documentType20.hasSameValue((java.lang.Object) startTag22);
        org.jsoup.nodes.Node node27 = documentType20.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList28 = documentType20.childNodesCopy();
        org.jsoup.parser.Token.EndTag endTag29 = new org.jsoup.parser.Token.EndTag();
        endTag29.finaliseTag();
        org.jsoup.parser.Token.EndTag endTag31 = endTag29.asEndTag();
        org.jsoup.parser.Token.Tag tag32 = endTag29.reset();
        org.jsoup.nodes.Attributes attributes33 = tag32.getAttributes();
        tag32.newAttribute();
        boolean boolean35 = documentType20.hasSameValue((java.lang.Object) tag32);
        org.jsoup.parser.Token.TokenType tokenType36 = tag32.type;
        startTag0.type = tokenType36;
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] { ' ', '4', '#' });
        org.junit.Assert.assertNotNull(startTag11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "StartTag" + "'", str14, "StartTag");
        org.junit.Assert.assertNotNull(tag15);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(startTag25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertNotNull(nodeList28);
        org.junit.Assert.assertNotNull(endTag31);
        org.junit.Assert.assertNotNull(tag32);
        org.junit.Assert.assertNull(attributes33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + tokenType36 + "' != '" + org.jsoup.parser.Token.TokenType.EndTag + "'", tokenType36.equals(org.jsoup.parser.Token.TokenType.EndTag));
    }

    @Test
    public void test4056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4056");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.parser.Token.StartTag startTag3 = startTag0.nameAttr("PUBLIC", attributes2);
        org.jsoup.nodes.DocumentType documentType9 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "<!---->");
        java.lang.String str10 = documentType9.outerHtml();
        org.jsoup.nodes.Attributes attributes11 = documentType9.attributes();
        org.jsoup.parser.Token.StartTag startTag12 = startTag0.nameAttr("Comment", attributes11);
        startTag12.finaliseTag();
        startTag12.appendTagName(' ');
        boolean boolean16 = startTag12.isSelfClosing();
        org.jsoup.parser.Token.Tag tag18 = startTag12.name("");
        java.lang.String str19 = startTag12.normalName;
        org.jsoup.nodes.Attributes attributes20 = startTag12.attributes;
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str10, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNotNull(attributes11);
        org.junit.Assert.assertNotNull(startTag12);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(tag18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(attributes20);
    }

    @Test
    public void test4057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4057");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag1 = startTag0.reset();
        java.lang.String str2 = tag1.tagName;
        org.jsoup.parser.Token.Tag tag4 = tag1.name("</SYSTEM>");
        org.jsoup.parser.Token.Tag tag6 = tag4.name("<<PUBLIC>>");
        java.lang.String str7 = tag6.normalName;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Character character8 = tag6.asCharacter();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$Character (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$Character are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(tag4);
        org.junit.Assert.assertNotNull(tag6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<<public>>" + "'", str7, "<<public>>");
    }

    @Test
    public void test4058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4058");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        org.jsoup.parser.ParseSettings parseSettings4 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList5 = xmlTreeBuilder0.parseFragment("", "", parseErrorList3, parseSettings4);
        org.jsoup.parser.ParseErrorList parseErrorList8 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder9 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings10 = xmlTreeBuilder9.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings11 = xmlTreeBuilder9.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList14 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder15 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings16 = xmlTreeBuilder15.defaultSettings();
        xmlTreeBuilder9.initialiseParse("", "SYSTEM", parseErrorList14, parseSettings16);
        xmlTreeBuilder0.initialiseParse("Doctype", "PUBLIC", parseErrorList8, parseSettings16);
        org.jsoup.parser.ParseErrorList parseErrorList21 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder22 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList25 = null;
        org.jsoup.parser.ParseSettings parseSettings26 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList27 = xmlTreeBuilder22.parseFragment("", "", parseErrorList25, parseSettings26);
        org.jsoup.parser.ParseErrorList parseErrorList30 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder31 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings32 = xmlTreeBuilder31.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings33 = xmlTreeBuilder31.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList36 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder37 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings38 = xmlTreeBuilder37.defaultSettings();
        xmlTreeBuilder31.initialiseParse("", "SYSTEM", parseErrorList36, parseSettings38);
        xmlTreeBuilder22.initialiseParse("Doctype", "PUBLIC", parseErrorList30, parseSettings38);
        xmlTreeBuilder0.initialiseParse("EndTag", "<!---->", parseErrorList21, parseSettings38);
        org.jsoup.parser.Token.Doctype doctype42 = new org.jsoup.parser.Token.Doctype();
        xmlTreeBuilder0.insert(doctype42);
        org.jsoup.parser.ParseErrorList parseErrorList46 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder47 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings48 = xmlTreeBuilder47.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings49 = xmlTreeBuilder47.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList52 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder53 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings54 = xmlTreeBuilder53.defaultSettings();
        xmlTreeBuilder47.initialiseParse("", "SYSTEM", parseErrorList52, parseSettings54);
        java.util.List<org.jsoup.nodes.Node> nodeList56 = xmlTreeBuilder0.parseFragment("<!DOCTYPE hi! PUBLIC \"hi!\">", "<!DOCTYPE hi! PUBLIC \"hi!\">", parseErrorList46, parseSettings54);
        org.jsoup.nodes.Document document59 = xmlTreeBuilder0.parse("#doctype", "EndTag");
        int int60 = document59.childNodeSize();
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertNotNull(parseSettings10);
        org.junit.Assert.assertNotNull(parseSettings11);
        org.junit.Assert.assertNotNull(parseSettings16);
        org.junit.Assert.assertNotNull(nodeList27);
        org.junit.Assert.assertNotNull(parseSettings32);
        org.junit.Assert.assertNotNull(parseSettings33);
        org.junit.Assert.assertNotNull(parseSettings38);
        org.junit.Assert.assertNotNull(parseSettings48);
        org.junit.Assert.assertNotNull(parseSettings49);
        org.junit.Assert.assertNotNull(parseSettings54);
        org.junit.Assert.assertNotNull(nodeList56);
        org.junit.Assert.assertNotNull(document59);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 1 + "'", int60 == 1);
    }

    @Test
    public void test4059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4059");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.parser.Token.StartTag startTag3 = startTag0.nameAttr("PUBLIC", attributes2);
        startTag0.appendAttributeValue(' ');
        char[] charArray9 = new char[] { ' ', '4', '#' };
        startTag0.appendAttributeValue(charArray9);
        org.jsoup.parser.Token.StartTag startTag11 = startTag0.asStartTag();
        org.jsoup.parser.Token.EndTag endTag13 = new org.jsoup.parser.Token.EndTag();
        org.jsoup.parser.Token.TokenType tokenType14 = endTag13.type;
        org.jsoup.parser.Token.EndTag endTag15 = endTag13.asEndTag();
        org.jsoup.nodes.DocumentType documentType20 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "<!---->");
        java.lang.String str21 = documentType20.outerHtml();
        org.jsoup.nodes.Attributes attributes22 = documentType20.attributes();
        endTag15.attributes = attributes22;
        org.jsoup.nodes.Attributes attributes24 = endTag15.getAttributes();
        org.jsoup.parser.Token.StartTag startTag25 = startTag0.nameAttr("hi!", attributes24);
        java.lang.String str26 = startTag0.normalName;
        org.jsoup.nodes.Attributes attributes27 = startTag0.getAttributes();
        org.jsoup.parser.Token token28 = startTag0.reset();
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] { ' ', '4', '#' });
        org.junit.Assert.assertNotNull(startTag11);
        org.junit.Assert.assertTrue("'" + tokenType14 + "' != '" + org.jsoup.parser.Token.TokenType.EndTag + "'", tokenType14.equals(org.jsoup.parser.Token.TokenType.EndTag));
        org.junit.Assert.assertNotNull(endTag15);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str21, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNotNull(attributes22);
        org.junit.Assert.assertNotNull(attributes24);
        org.junit.Assert.assertNotNull(startTag25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertNotNull(attributes27);
        org.junit.Assert.assertNotNull(token28);
    }

    @Test
    public void test4060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4060");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes1 = null;
        startTag0.attributes = attributes1;
        org.jsoup.parser.Token.Tag tag3 = startTag0.reset();
        startTag0.setEmptyAttributeValue();
        org.jsoup.parser.Token.StartTag startTag6 = new org.jsoup.parser.Token.StartTag();
        java.lang.String str7 = startTag6.normalName;
        startTag6.normalName = "<!DOCTYPE hi! PUBLIC \"hi!\">";
        org.jsoup.nodes.DocumentType documentType15 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "<!---->");
        java.lang.String str16 = documentType15.outerHtml();
        org.jsoup.nodes.Attributes attributes17 = documentType15.attributes();
        org.jsoup.parser.Token.StartTag startTag18 = startTag6.nameAttr("<!DOCTYPE hi! PUBLIC \"hi!\">", attributes17);
        org.jsoup.parser.Token.StartTag startTag19 = startTag0.nameAttr("#doctype", attributes17);
        java.lang.String str20 = startTag0.name();
        org.jsoup.parser.Token.Tag tag21 = startTag0.reset();
        tag21.appendAttributeName("<!DOCTYPE </#EndTag> PUBLIC \"public\" \"<<!DOCTYPE hi! PUBLIC \"hi!\">  name=\"hi!\" publicId=\"hi!\" systemId=\"\">\">");
        org.junit.Assert.assertNotNull(tag3);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str16, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNotNull(attributes17);
        org.junit.Assert.assertNotNull(startTag18);
        org.junit.Assert.assertNotNull(startTag19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "#doctype" + "'", str20, "#doctype");
        org.junit.Assert.assertNotNull(tag21);
    }

    @Test
    public void test4061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4061");
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState0 = org.jsoup.parser.HtmlTreeBuilderState.ForeignContent;
        org.jsoup.parser.Token.Comment comment1 = new org.jsoup.parser.Token.Comment();
        org.jsoup.parser.Token.Comment comment2 = comment1.asComment();
        java.lang.StringBuilder stringBuilder3 = comment2.data;
        comment2.bogus = true;
        boolean boolean6 = comment2.bogus;
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder7 = null;
        boolean boolean8 = htmlTreeBuilderState0.process((org.jsoup.parser.Token) comment2, htmlTreeBuilder7);
        comment2.bogus = true;
        org.jsoup.parser.Token token11 = comment2.reset();
        org.junit.Assert.assertNotNull(htmlTreeBuilderState0);
        org.junit.Assert.assertNotNull(comment2);
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(token11);
    }

    @Test
    public void test4062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4062");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.finaliseTag();
        org.jsoup.parser.Token.EndTag endTag2 = endTag0.asEndTag();
        java.lang.String str3 = endTag0.normalName;
        endTag0.appendTagName("EndTag");
        boolean boolean6 = endTag0.isDoctype();
        org.jsoup.nodes.Attributes attributes7 = endTag0.getAttributes();
        org.jsoup.parser.Token.StartTag startTag8 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes10 = null;
        org.jsoup.parser.Token.StartTag startTag11 = startTag8.nameAttr("PUBLIC", attributes10);
        org.jsoup.nodes.DocumentType documentType17 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "<!---->");
        java.lang.String str18 = documentType17.outerHtml();
        org.jsoup.nodes.Attributes attributes19 = documentType17.attributes();
        org.jsoup.parser.Token.StartTag startTag20 = startTag8.nameAttr("Comment", attributes19);
        endTag0.attributes = attributes19;
        java.lang.String str22 = endTag0.name();
        java.lang.String str23 = endTag0.normalName;
        boolean boolean24 = endTag0.isEOF();
        org.jsoup.nodes.Attributes attributes25 = endTag0.attributes;
        org.jsoup.parser.Token.Tag tag26 = endTag0.reset();
        org.junit.Assert.assertNotNull(endTag2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(attributes7);
        org.junit.Assert.assertNotNull(startTag11);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str18, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNotNull(attributes19);
        org.junit.Assert.assertNotNull(startTag20);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "EndTag" + "'", str22, "EndTag");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "endtag" + "'", str23, "endtag");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(attributes25);
        org.junit.Assert.assertNotNull(tag26);
    }

    @Test
    public void test4063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4063");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes1 = null;
        startTag0.attributes = attributes1;
        org.jsoup.parser.Token.Tag tag3 = startTag0.reset();
        java.lang.String str4 = tag3.tagName;
        java.lang.String str5 = tag3.normalName;
        tag3.appendTagName(' ');
        org.jsoup.nodes.DocumentType documentType12 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "<!---->");
        java.lang.String str13 = documentType12.outerHtml();
        org.jsoup.nodes.Attributes attributes14 = documentType12.attributes();
        tag3.attributes = attributes14;
        java.lang.String str16 = tag3.tagName;
        org.jsoup.parser.Token.StartTag startTag17 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes18 = null;
        startTag17.attributes = attributes18;
        org.jsoup.parser.Token.Tag tag20 = startTag17.reset();
        java.lang.String str21 = startTag17.normalName;
        org.jsoup.parser.Token.TokenType tokenType22 = startTag17.type;
        tag3.type = tokenType22;
        tag3.appendAttributeName("<!DOCTYPE </#EndTag> PUBLIC \"#EndTag\" \"hi!\">");
        org.junit.Assert.assertNotNull(tag3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str13, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNotNull(attributes14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + " " + "'", str16, " ");
        org.junit.Assert.assertNotNull(tag20);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertTrue("'" + tokenType22 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType22.equals(org.jsoup.parser.Token.TokenType.StartTag));
    }

    @Test
    public void test4064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4064");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList4 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder5 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList8 = null;
        org.jsoup.parser.ParseSettings parseSettings9 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList10 = xmlTreeBuilder5.parseFragment("", "", parseErrorList8, parseSettings9);
        org.jsoup.parser.ParseErrorList parseErrorList13 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder14 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings15 = xmlTreeBuilder14.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings16 = xmlTreeBuilder14.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList19 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder20 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings21 = xmlTreeBuilder20.defaultSettings();
        xmlTreeBuilder14.initialiseParse("", "SYSTEM", parseErrorList19, parseSettings21);
        xmlTreeBuilder5.initialiseParse("Doctype", "PUBLIC", parseErrorList13, parseSettings21);
        org.jsoup.parser.ParseErrorList parseErrorList26 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder27 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList30 = null;
        org.jsoup.parser.ParseSettings parseSettings31 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList32 = xmlTreeBuilder27.parseFragment("", "", parseErrorList30, parseSettings31);
        org.jsoup.parser.ParseErrorList parseErrorList35 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder36 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings37 = xmlTreeBuilder36.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings38 = xmlTreeBuilder36.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList41 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder42 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings43 = xmlTreeBuilder42.defaultSettings();
        xmlTreeBuilder36.initialiseParse("", "SYSTEM", parseErrorList41, parseSettings43);
        xmlTreeBuilder27.initialiseParse("Doctype", "PUBLIC", parseErrorList35, parseSettings43);
        xmlTreeBuilder5.initialiseParse("EndTag", "<!---->", parseErrorList26, parseSettings43);
        java.util.List<org.jsoup.nodes.Node> nodeList47 = xmlTreeBuilder0.parseFragment("aa", "</#>", parseErrorList4, parseSettings43);
        org.jsoup.parser.Token.Comment comment48 = new org.jsoup.parser.Token.Comment();
        java.lang.String str49 = comment48.toString();
        xmlTreeBuilder0.insert(comment48);
        org.jsoup.parser.Token.Comment comment51 = new org.jsoup.parser.Token.Comment();
        org.jsoup.parser.Token token52 = comment51.reset();
        comment51.bogus = true;
        xmlTreeBuilder0.insert(comment51);
        org.jsoup.parser.Token.StartTag startTag56 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes58 = null;
        org.jsoup.parser.Token.StartTag startTag59 = startTag56.nameAttr("PUBLIC", attributes58);
        org.jsoup.nodes.DocumentType documentType65 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "<!---->");
        java.lang.String str66 = documentType65.outerHtml();
        org.jsoup.nodes.Attributes attributes67 = documentType65.attributes();
        org.jsoup.parser.Token.StartTag startTag68 = startTag56.nameAttr("Comment", attributes67);
        startTag68.appendTagName(' ');
        startTag68.appendAttributeName("</#EndTag>");
        org.jsoup.nodes.Element element73 = xmlTreeBuilder0.insert(startTag68);
        org.jsoup.parser.Token.Doctype doctype74 = new org.jsoup.parser.Token.Doctype();
        boolean boolean75 = doctype74.forceQuirks;
        java.lang.StringBuilder stringBuilder76 = doctype74.systemIdentifier;
        boolean boolean77 = doctype74.forceQuirks;
        java.lang.StringBuilder stringBuilder78 = doctype74.name;
        boolean boolean79 = doctype74.isDoctype();
        java.lang.String str80 = doctype74.getSystemIdentifier();
        xmlTreeBuilder0.insert(doctype74);
        org.junit.Assert.assertNotNull(parseSettings1);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertNotNull(parseSettings15);
        org.junit.Assert.assertNotNull(parseSettings16);
        org.junit.Assert.assertNotNull(parseSettings21);
        org.junit.Assert.assertNotNull(nodeList32);
        org.junit.Assert.assertNotNull(parseSettings37);
        org.junit.Assert.assertNotNull(parseSettings38);
        org.junit.Assert.assertNotNull(parseSettings43);
        org.junit.Assert.assertNotNull(nodeList47);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "<!---->" + "'", str49, "<!---->");
        org.junit.Assert.assertNotNull(token52);
        org.junit.Assert.assertNotNull(startTag59);
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str66, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNotNull(attributes67);
        org.junit.Assert.assertNotNull(startTag68);
        org.junit.Assert.assertNotNull(element73);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertNotNull(stringBuilder76);
        org.junit.Assert.assertEquals(stringBuilder76.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertNotNull(stringBuilder78);
        org.junit.Assert.assertEquals(stringBuilder78.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + true + "'", boolean79 == true);
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "" + "'", str80, "");
    }

    @Test
    public void test4065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4065");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "<!---->");
        org.jsoup.nodes.Node node5 = documentType4.parent();
        org.jsoup.nodes.Node node6 = documentType4.nextSibling();
        java.lang.String str7 = documentType4.nodeName();
        org.jsoup.nodes.Node node9 = documentType4.wrap("<!---->");
        boolean boolean11 = documentType4.hasAttr("<!DOCTYPE <!DOCTYPE hi! PUBLIC \"hi!\"> PUBLIC \"PUBLIC\" \"#doctype\">");
        int int12 = documentType4.childNodeSize();
        java.lang.String str13 = documentType4.nodeName();
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#doctype" + "'", str7, "#doctype");
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "#doctype" + "'", str13, "#doctype");
    }

    @Test
    public void test4066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4066");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.finaliseTag();
        org.jsoup.parser.Token.EndTag endTag2 = endTag0.asEndTag();
        org.jsoup.nodes.Attributes attributes3 = endTag0.getAttributes();
        boolean boolean4 = endTag0.isComment();
        boolean boolean5 = endTag0.selfClosing;
        org.jsoup.parser.Token.StartTag startTag6 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.StartTag startTag7 = startTag6.asStartTag();
        org.jsoup.parser.Token.Tag tag8 = startTag7.reset();
        org.jsoup.parser.Token.TokenType tokenType9 = startTag7.type;
        startTag7.tagName = "PUBLIC";
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder13 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList16 = null;
        org.jsoup.parser.ParseSettings parseSettings17 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList18 = xmlTreeBuilder13.parseFragment("", "", parseErrorList16, parseSettings17);
        org.jsoup.parser.ParseErrorList parseErrorList21 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder22 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings23 = xmlTreeBuilder22.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings24 = xmlTreeBuilder22.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList27 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder28 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings29 = xmlTreeBuilder28.defaultSettings();
        xmlTreeBuilder22.initialiseParse("", "SYSTEM", parseErrorList27, parseSettings29);
        xmlTreeBuilder13.initialiseParse("Doctype", "PUBLIC", parseErrorList21, parseSettings29);
        org.jsoup.parser.Token.Doctype doctype32 = new org.jsoup.parser.Token.Doctype();
        boolean boolean33 = doctype32.forceQuirks;
        doctype32.forceQuirks = false;
        java.lang.String str36 = doctype32.getName();
        java.lang.String str37 = doctype32.getName();
        boolean boolean38 = xmlTreeBuilder13.process((org.jsoup.parser.Token) doctype32);
        org.jsoup.parser.Token.StartTag startTag40 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes42 = null;
        org.jsoup.parser.Token.StartTag startTag43 = startTag40.nameAttr("PUBLIC", attributes42);
        startTag40.appendAttributeValue(' ');
        char[] charArray49 = new char[] { ' ', '4', '#' };
        startTag40.appendAttributeValue(charArray49);
        org.jsoup.parser.Token.StartTag startTag51 = startTag40.asStartTag();
        org.jsoup.parser.Token.EndTag endTag53 = new org.jsoup.parser.Token.EndTag();
        org.jsoup.parser.Token.TokenType tokenType54 = endTag53.type;
        org.jsoup.parser.Token.EndTag endTag55 = endTag53.asEndTag();
        org.jsoup.nodes.DocumentType documentType60 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "<!---->");
        java.lang.String str61 = documentType60.outerHtml();
        org.jsoup.nodes.Attributes attributes62 = documentType60.attributes();
        endTag55.attributes = attributes62;
        org.jsoup.nodes.Attributes attributes64 = endTag55.getAttributes();
        org.jsoup.parser.Token.StartTag startTag65 = startTag40.nameAttr("hi!", attributes64);
        boolean boolean66 = xmlTreeBuilder13.processStartTag("</SYSTEM>", attributes64);
        org.jsoup.parser.Token.StartTag startTag67 = startTag7.nameAttr("Character", attributes64);
        endTag0.attributes = attributes64;
        boolean boolean69 = endTag0.isSelfClosing();
        org.junit.Assert.assertNotNull(endTag2);
        org.junit.Assert.assertNull(attributes3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(startTag7);
        org.junit.Assert.assertNotNull(tag8);
        org.junit.Assert.assertTrue("'" + tokenType9 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType9.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertNotNull(nodeList18);
        org.junit.Assert.assertNotNull(parseSettings23);
        org.junit.Assert.assertNotNull(parseSettings24);
        org.junit.Assert.assertNotNull(parseSettings29);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(startTag43);
        org.junit.Assert.assertNotNull(charArray49);
        org.junit.Assert.assertArrayEquals(charArray49, new char[] { ' ', '4', '#' });
        org.junit.Assert.assertNotNull(startTag51);
        org.junit.Assert.assertTrue("'" + tokenType54 + "' != '" + org.jsoup.parser.Token.TokenType.EndTag + "'", tokenType54.equals(org.jsoup.parser.Token.TokenType.EndTag));
        org.junit.Assert.assertNotNull(endTag55);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str61, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNotNull(attributes62);
        org.junit.Assert.assertNotNull(attributes64);
        org.junit.Assert.assertNotNull(startTag65);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertNotNull(startTag67);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
    }

    @Test
    public void test4067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4067");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.parser.Token.StartTag startTag3 = startTag0.nameAttr("PUBLIC", attributes2);
        startTag0.appendAttributeValue(' ');
        char[] charArray9 = new char[] { ' ', '4', '#' };
        startTag0.appendAttributeValue(charArray9);
        org.jsoup.parser.Token.StartTag startTag11 = startTag0.asStartTag();
        org.jsoup.parser.Token.Tag tag12 = startTag0.reset();
        startTag0.newAttribute();
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] { ' ', '4', '#' });
        org.junit.Assert.assertNotNull(startTag11);
        org.junit.Assert.assertNotNull(tag12);
    }

    @Test
    public void test4068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4068");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "<!---->");
        int int5 = documentType4.childNodeSize();
        java.lang.String str6 = documentType4.outerHtml();
        org.jsoup.parser.Token.Doctype doctype7 = new org.jsoup.parser.Token.Doctype();
        boolean boolean8 = doctype7.forceQuirks;
        doctype7.forceQuirks = false;
        java.lang.String str11 = doctype7.getName();
        java.lang.StringBuilder stringBuilder12 = doctype7.name;
        java.lang.StringBuilder stringBuilder13 = documentType4.html(stringBuilder12);
        java.lang.String str15 = documentType4.absUrl("PUBLIC");
        java.util.List<org.jsoup.nodes.Node> nodeList16 = documentType4.siblingNodes();
        org.jsoup.parser.Token.Comment comment17 = new org.jsoup.parser.Token.Comment();
        org.jsoup.parser.Token.Comment comment18 = comment17.asComment();
        org.jsoup.parser.Token token19 = comment18.reset();
        org.jsoup.parser.Token token20 = comment18.reset();
        java.lang.StringBuilder stringBuilder21 = comment18.data;
        java.lang.StringBuilder stringBuilder22 = comment18.data;
        java.lang.StringBuilder stringBuilder23 = documentType4.html(stringBuilder22);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str6, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(stringBuilder12);
        org.junit.Assert.assertEquals(stringBuilder12.toString(), "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNotNull(stringBuilder13);
        org.junit.Assert.assertEquals(stringBuilder13.toString(), "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(nodeList16);
        org.junit.Assert.assertNotNull(comment18);
        org.junit.Assert.assertNotNull(token19);
        org.junit.Assert.assertNotNull(token20);
        org.junit.Assert.assertNotNull(stringBuilder21);
        org.junit.Assert.assertEquals(stringBuilder21.toString(), "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNotNull(stringBuilder22);
        org.junit.Assert.assertEquals(stringBuilder22.toString(), "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNotNull(stringBuilder23);
        org.junit.Assert.assertEquals(stringBuilder23.toString(), "<!DOCTYPE hi! PUBLIC \"hi!\">");
    }

    @Test
    public void test4069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4069");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList4 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder5 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings6 = xmlTreeBuilder5.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings7 = xmlTreeBuilder5.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList10 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder11 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings12 = xmlTreeBuilder11.defaultSettings();
        xmlTreeBuilder5.initialiseParse("", "SYSTEM", parseErrorList10, parseSettings12);
        xmlTreeBuilder0.initialiseParse("Comment", "Doctype", parseErrorList4, parseSettings12);
        org.jsoup.nodes.DocumentType documentType20 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "<!---->");
        java.lang.String str21 = documentType20.outerHtml();
        org.jsoup.nodes.Attributes attributes22 = documentType20.attributes();
        org.jsoup.nodes.Attributes attributes23 = documentType20.attributes();
        boolean boolean24 = xmlTreeBuilder0.processStartTag("EndTag", attributes23);
        org.jsoup.parser.ParseErrorList parseErrorList27 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder28 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings29 = xmlTreeBuilder28.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList30 = xmlTreeBuilder0.parseFragment("</SYSTEM>", "<PUBLIC>", parseErrorList27, parseSettings29);
        org.jsoup.parser.ParseErrorList parseErrorList33 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder34 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings35 = xmlTreeBuilder34.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList38 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder39 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings40 = xmlTreeBuilder39.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings41 = xmlTreeBuilder39.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList44 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder45 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings46 = xmlTreeBuilder45.defaultSettings();
        xmlTreeBuilder39.initialiseParse("", "SYSTEM", parseErrorList44, parseSettings46);
        xmlTreeBuilder34.initialiseParse("Comment", "Doctype", parseErrorList38, parseSettings46);
        java.util.List<org.jsoup.nodes.Node> nodeList49 = xmlTreeBuilder0.parseFragment("<!doctype hi! public \"hi!\">", "Character", parseErrorList33, parseSettings46);
        org.jsoup.parser.ParseErrorList parseErrorList52 = null;
        org.jsoup.parser.ParseSettings parseSettings53 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList54 = xmlTreeBuilder0.parseFragment("#endtag", "aa", parseErrorList52, parseSettings53);
        org.jsoup.parser.Token.Comment comment55 = new org.jsoup.parser.Token.Comment();
        org.jsoup.parser.Token.Comment comment56 = comment55.asComment();
        java.lang.String str57 = comment55.getData();
        java.lang.StringBuilder stringBuilder58 = comment55.data;
        java.lang.StringBuilder stringBuilder59 = comment55.data;
        boolean boolean60 = comment55.bogus;
        org.jsoup.parser.Token token61 = comment55.reset();
        boolean boolean62 = comment55.bogus;
        comment55.bogus = true;
        org.jsoup.parser.Token token65 = comment55.reset();
        xmlTreeBuilder0.insert(comment55);
        boolean boolean67 = comment55.bogus;
        java.lang.String str68 = comment55.getData();
        org.junit.Assert.assertNotNull(parseSettings1);
        org.junit.Assert.assertNotNull(parseSettings6);
        org.junit.Assert.assertNotNull(parseSettings7);
        org.junit.Assert.assertNotNull(parseSettings12);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str21, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNotNull(attributes22);
        org.junit.Assert.assertNotNull(attributes23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(parseSettings29);
        org.junit.Assert.assertNotNull(nodeList30);
        org.junit.Assert.assertNotNull(parseSettings35);
        org.junit.Assert.assertNotNull(parseSettings40);
        org.junit.Assert.assertNotNull(parseSettings41);
        org.junit.Assert.assertNotNull(parseSettings46);
        org.junit.Assert.assertNotNull(nodeList49);
        org.junit.Assert.assertNotNull(nodeList54);
        org.junit.Assert.assertNotNull(comment56);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "" + "'", str57, "");
        org.junit.Assert.assertNotNull(stringBuilder58);
        org.junit.Assert.assertEquals(stringBuilder58.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder59);
        org.junit.Assert.assertEquals(stringBuilder59.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(token61);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(token65);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "" + "'", str68, "");
    }

    @Test
    public void test4070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4070");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE a PUBLIC \"#doctype\" \"Comment\">", "SYSTEM", "<SYSTEM>", "<!DOCTYPE <!DOCTYPE hi! PUBLIC \"hi!\"> PUBLIC \"PUBLIC\" \"#doctype\">");
        int int5 = documentType4.childNodeSize();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test4071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4071");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        org.jsoup.parser.Token.Comment comment1 = comment0.asComment();
        java.lang.String str2 = comment1.toString();
        java.lang.StringBuilder stringBuilder3 = comment1.data;
        comment1.bogus = false;
        java.lang.StringBuilder stringBuilder6 = comment1.data;
        org.jsoup.parser.Token token7 = comment1.reset();
        java.lang.String str8 = comment1.getData();
        org.jsoup.parser.Token token9 = comment1.reset();
        java.lang.String str10 = comment1.toString();
        org.jsoup.parser.Token token11 = comment1.reset();
        comment1.bogus = true;
        boolean boolean14 = comment1.isStartTag();
        org.junit.Assert.assertNotNull(comment1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "<!---->" + "'", str2, "<!---->");
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "");
        org.junit.Assert.assertNotNull(token7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(token9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "<!---->" + "'", str10, "<!---->");
        org.junit.Assert.assertNotNull(token11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test4072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4072");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.StartTag startTag1 = startTag0.asStartTag();
        org.jsoup.nodes.Attributes attributes2 = startTag0.getAttributes();
        startTag0.appendAttributeValue("<!DOCTYPE <!DOCTYPE Character PUBLIC \"#endtag\" \"PUBLIC\"> PUBLIC \"Comment \" \"<!DOCTYPE <!DOCTYPE hi! PUBLIC \"hi!\"> PUBLIC \"PUBLIC\" \"#doctype\">\">");
        org.junit.Assert.assertNotNull(startTag1);
        org.junit.Assert.assertNotNull(attributes2);
    }

    @Test
    public void test4073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4073");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes1 = null;
        startTag0.attributes = attributes1;
        org.jsoup.parser.Token.Tag tag3 = startTag0.reset();
        org.jsoup.nodes.Attributes attributes5 = null;
        org.jsoup.parser.Token.StartTag startTag6 = startTag0.nameAttr("SYSTEM", attributes5);
        startTag6.newAttribute();
        java.lang.String str8 = startTag6.tokenType();
        startTag6.appendAttributeName("#EndTag");
        org.jsoup.parser.Token.Tag tag11 = startTag6.reset();
        java.lang.String str12 = tag11.normalName;
        tag11.selfClosing = true;
        org.junit.Assert.assertNotNull(tag3);
        org.junit.Assert.assertNotNull(startTag6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "StartTag" + "'", str8, "StartTag");
        org.junit.Assert.assertNotNull(tag11);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test4074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4074");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings2 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList5 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder6 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings7 = xmlTreeBuilder6.defaultSettings();
        xmlTreeBuilder0.initialiseParse("", "SYSTEM", parseErrorList5, parseSettings7);
        org.jsoup.parser.ParseSettings parseSettings9 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.Token.Character character10 = new org.jsoup.parser.Token.Character();
        org.jsoup.parser.Token.Character character12 = character10.data("hi!");
        java.lang.String str13 = character10.toString();
        org.jsoup.parser.Token.Character character15 = character10.data("");
        xmlTreeBuilder0.insert(character15);
        org.jsoup.parser.Token.Comment comment17 = new org.jsoup.parser.Token.Comment();
        org.jsoup.parser.Token.Comment comment18 = comment17.asComment();
        java.lang.String str19 = comment18.toString();
        java.lang.StringBuilder stringBuilder20 = comment18.data;
        xmlTreeBuilder0.insert(comment18);
        org.jsoup.nodes.Document document24 = xmlTreeBuilder0.parse("SYSTEM", "");
        org.jsoup.parser.Token.StartTag startTag25 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.StartTag startTag26 = startTag25.asStartTag();
        org.jsoup.parser.Token.Tag tag27 = startTag25.reset();
        startTag25.appendTagName("hi!");
        org.jsoup.parser.Token.EndTag endTag30 = new org.jsoup.parser.Token.EndTag();
        boolean boolean31 = endTag30.isEndTag();
        boolean boolean32 = endTag30.isComment();
        org.jsoup.parser.Token.EndTag endTag33 = new org.jsoup.parser.Token.EndTag();
        org.jsoup.parser.Token.TokenType tokenType34 = endTag33.type;
        org.jsoup.parser.Token.EndTag endTag35 = endTag33.asEndTag();
        org.jsoup.nodes.DocumentType documentType40 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "<!---->");
        java.lang.String str41 = documentType40.outerHtml();
        org.jsoup.nodes.Attributes attributes42 = documentType40.attributes();
        endTag35.attributes = attributes42;
        org.jsoup.nodes.Attributes attributes44 = endTag35.getAttributes();
        endTag30.attributes = attributes44;
        startTag25.attributes = attributes44;
        org.jsoup.nodes.Element element47 = xmlTreeBuilder0.insert(startTag25);
        org.jsoup.parser.Token.Doctype doctype48 = new org.jsoup.parser.Token.Doctype();
        boolean boolean49 = doctype48.forceQuirks;
        java.lang.StringBuilder stringBuilder50 = doctype48.systemIdentifier;
        boolean boolean51 = doctype48.forceQuirks;
        doctype48.forceQuirks = false;
        org.jsoup.parser.Token token54 = doctype48.reset();
        boolean boolean55 = element47.equals((java.lang.Object) token54);
        org.jsoup.nodes.Node node56 = element47.clone();
        org.junit.Assert.assertNotNull(parseSettings1);
        org.junit.Assert.assertNotNull(parseSettings2);
        org.junit.Assert.assertNotNull(parseSettings7);
        org.junit.Assert.assertNotNull(parseSettings9);
        org.junit.Assert.assertNotNull(character12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(character15);
        org.junit.Assert.assertNotNull(comment18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "<!---->" + "'", str19, "<!---->");
        org.junit.Assert.assertNotNull(stringBuilder20);
        org.junit.Assert.assertEquals(stringBuilder20.toString(), "");
        org.junit.Assert.assertNotNull(document24);
        org.junit.Assert.assertNotNull(startTag26);
        org.junit.Assert.assertNotNull(tag27);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + tokenType34 + "' != '" + org.jsoup.parser.Token.TokenType.EndTag + "'", tokenType34.equals(org.jsoup.parser.Token.TokenType.EndTag));
        org.junit.Assert.assertNotNull(endTag35);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str41, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNotNull(attributes42);
        org.junit.Assert.assertNotNull(attributes44);
        org.junit.Assert.assertNotNull(element47);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(stringBuilder50);
        org.junit.Assert.assertEquals(stringBuilder50.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(token54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(node56);
    }

    @Test
    public void test4075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4075");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("</</SYSTEM>>", "<Comment   name=\"hi!\" publicId=\"hi!\" systemId=\"\">", "</<!DOCTYPE hi! PUBLIC \"hi!\">>", "comment ");
        org.jsoup.nodes.Node node5 = documentType4.parent();
        org.junit.Assert.assertNull(node5);
    }

    @Test
    public void test4076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4076");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.finaliseTag();
        org.jsoup.parser.Token.EndTag endTag2 = endTag0.asEndTag();
        org.jsoup.parser.Token.Tag tag3 = endTag0.reset();
        tag3.finaliseTag();
        boolean boolean5 = tag3.isCharacter();
        tag3.appendAttributeName("comment ");
        org.jsoup.parser.Token.Tag tag8 = tag3.reset();
        boolean boolean9 = tag3.isSelfClosing();
        org.junit.Assert.assertNotNull(endTag2);
        org.junit.Assert.assertNotNull(tag3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(tag8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test4077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4077");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "<!---->");
        java.lang.String str5 = documentType4.outerHtml();
        org.jsoup.nodes.Attributes attributes6 = documentType4.attributes();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = documentType4.childNodes();
        java.lang.String str8 = documentType4.outerHtml();
        java.lang.String str10 = documentType4.absUrl("<<!DOCTYPE hi! PUBLIC \"hi!\">  name=\"hi!\" publicId=\"hi!\" systemId=\"\">");
        org.jsoup.nodes.Node node11 = documentType4.parentNode();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node13 = documentType4.before("PUBLIC#endtag");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str5, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str8, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(node11);
    }

    @Test
    public void test4078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4078");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "<!---->");
        int int5 = documentType4.childNodeSize();
        java.lang.String str6 = documentType4.outerHtml();
        org.jsoup.parser.Token.Doctype doctype7 = new org.jsoup.parser.Token.Doctype();
        boolean boolean8 = doctype7.forceQuirks;
        doctype7.forceQuirks = false;
        java.lang.String str11 = doctype7.getName();
        java.lang.StringBuilder stringBuilder12 = doctype7.name;
        java.lang.StringBuilder stringBuilder13 = documentType4.html(stringBuilder12);
        java.lang.String str15 = documentType4.absUrl("PUBLIC");
        org.jsoup.select.NodeVisitor nodeVisitor16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node17 = documentType4.traverse(nodeVisitor16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str6, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(stringBuilder12);
        org.junit.Assert.assertEquals(stringBuilder12.toString(), "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNotNull(stringBuilder13);
        org.junit.Assert.assertEquals(stringBuilder13.toString(), "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test4079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4079");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        org.jsoup.parser.Token.Comment comment1 = comment0.asComment();
        java.lang.String str2 = comment1.toString();
        java.lang.StringBuilder stringBuilder3 = comment1.data;
        java.lang.String str4 = comment1.getData();
        org.jsoup.parser.Token token5 = comment1.reset();
        org.junit.Assert.assertNotNull(comment1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "<!---->" + "'", str2, "<!---->");
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(token5);
    }

    @Test
    public void test4080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4080");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes1 = null;
        startTag0.attributes = attributes1;
        org.jsoup.parser.Token.Tag tag3 = startTag0.reset();
        org.jsoup.nodes.Attributes attributes5 = null;
        org.jsoup.parser.Token.StartTag startTag6 = startTag0.nameAttr("SYSTEM", attributes5);
        java.lang.String str7 = startTag6.name();
        java.lang.String str8 = startTag6.toString();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder10 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings11 = xmlTreeBuilder10.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings12 = xmlTreeBuilder10.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings13 = xmlTreeBuilder10.defaultSettings();
        org.jsoup.nodes.Document document16 = xmlTreeBuilder10.parse("PUBLIC", "hi!");
        org.jsoup.nodes.Node node18 = document16.removeAttr("PUBLIC");
        java.util.List<org.jsoup.nodes.Node> nodeList19 = document16.siblingNodes();
        org.jsoup.nodes.Attributes attributes20 = document16.attributes();
        org.jsoup.parser.Token.StartTag startTag21 = startTag6.nameAttr("Comment", attributes20);
        java.lang.String str22 = startTag6.toString();
        startTag6.newAttribute();
        java.lang.String str24 = startTag6.toString();
        startTag6.selfClosing = false;
        org.junit.Assert.assertNotNull(tag3);
        org.junit.Assert.assertNotNull(startTag6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "SYSTEM" + "'", str7, "SYSTEM");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "<SYSTEM>" + "'", str8, "<SYSTEM>");
        org.junit.Assert.assertNotNull(parseSettings11);
        org.junit.Assert.assertNotNull(parseSettings12);
        org.junit.Assert.assertNotNull(parseSettings13);
        org.junit.Assert.assertNotNull(document16);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertNotNull(nodeList19);
        org.junit.Assert.assertNotNull(attributes20);
        org.junit.Assert.assertNotNull(startTag21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "<Comment>" + "'", str22, "<Comment>");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "<Comment>" + "'", str24, "<Comment>");
    }

    @Test
    public void test4081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4081");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList4 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder5 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings6 = xmlTreeBuilder5.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings7 = xmlTreeBuilder5.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList10 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder11 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings12 = xmlTreeBuilder11.defaultSettings();
        xmlTreeBuilder5.initialiseParse("", "SYSTEM", parseErrorList10, parseSettings12);
        xmlTreeBuilder0.initialiseParse("Comment", "Doctype", parseErrorList4, parseSettings12);
        org.jsoup.nodes.DocumentType documentType20 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "<!---->");
        java.lang.String str21 = documentType20.outerHtml();
        org.jsoup.nodes.Attributes attributes22 = documentType20.attributes();
        org.jsoup.nodes.Attributes attributes23 = documentType20.attributes();
        boolean boolean24 = xmlTreeBuilder0.processStartTag("EndTag", attributes23);
        org.jsoup.parser.ParseErrorList parseErrorList27 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder28 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings29 = xmlTreeBuilder28.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings30 = xmlTreeBuilder28.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList31 = xmlTreeBuilder0.parseFragment("Comment", "#doctype", parseErrorList27, parseSettings30);
        org.jsoup.parser.Token.Comment comment32 = new org.jsoup.parser.Token.Comment();
        org.jsoup.parser.Token.Comment comment33 = comment32.asComment();
        org.jsoup.parser.Token token34 = comment33.reset();
        comment33.bogus = false;
        org.jsoup.parser.Token token37 = comment33.reset();
        xmlTreeBuilder0.insert(comment33);
        org.jsoup.parser.Token.Doctype doctype39 = new org.jsoup.parser.Token.Doctype();
        boolean boolean40 = doctype39.forceQuirks;
        doctype39.forceQuirks = false;
        java.lang.String str43 = doctype39.getName();
        java.lang.StringBuilder stringBuilder44 = doctype39.name;
        java.lang.String str45 = doctype39.getName();
        xmlTreeBuilder0.insert(doctype39);
        org.jsoup.nodes.Document document49 = xmlTreeBuilder0.parse("<PUBLIC>", "<!DOCTYPE Character PUBLIC \"#endtag\" \"PUBLIC\">");
        org.jsoup.parser.ParseErrorList parseErrorList52 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder53 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings54 = xmlTreeBuilder53.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings55 = xmlTreeBuilder53.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList58 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder59 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings60 = xmlTreeBuilder59.defaultSettings();
        xmlTreeBuilder53.initialiseParse("", "SYSTEM", parseErrorList58, parseSettings60);
        xmlTreeBuilder0.initialiseParse("<<PUBLIC>4>", "PUBLIC#endtag", parseErrorList52, parseSettings60);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder63 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList66 = null;
        org.jsoup.parser.ParseSettings parseSettings67 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList68 = xmlTreeBuilder63.parseFragment("", "", parseErrorList66, parseSettings67);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder69 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings70 = xmlTreeBuilder69.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings71 = xmlTreeBuilder69.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList74 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder75 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings76 = xmlTreeBuilder75.defaultSettings();
        xmlTreeBuilder69.initialiseParse("", "SYSTEM", parseErrorList74, parseSettings76);
        org.jsoup.parser.Token.Comment comment78 = new org.jsoup.parser.Token.Comment();
        org.jsoup.parser.Token.Comment comment79 = comment78.asComment();
        xmlTreeBuilder69.insert(comment78);
        xmlTreeBuilder63.insert(comment78);
        boolean boolean82 = comment78.bogus;
        xmlTreeBuilder0.insert(comment78);
        boolean boolean84 = comment78.bogus;
        org.junit.Assert.assertNotNull(parseSettings1);
        org.junit.Assert.assertNotNull(parseSettings6);
        org.junit.Assert.assertNotNull(parseSettings7);
        org.junit.Assert.assertNotNull(parseSettings12);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str21, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNotNull(attributes22);
        org.junit.Assert.assertNotNull(attributes23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(parseSettings29);
        org.junit.Assert.assertNotNull(parseSettings30);
        org.junit.Assert.assertNotNull(nodeList31);
        org.junit.Assert.assertNotNull(comment33);
        org.junit.Assert.assertNotNull(token34);
        org.junit.Assert.assertNotNull(token37);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertNotNull(stringBuilder44);
        org.junit.Assert.assertEquals(stringBuilder44.toString(), "");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertNotNull(document49);
        org.junit.Assert.assertNotNull(parseSettings54);
        org.junit.Assert.assertNotNull(parseSettings55);
        org.junit.Assert.assertNotNull(parseSettings60);
        org.junit.Assert.assertNotNull(nodeList68);
        org.junit.Assert.assertNotNull(parseSettings70);
        org.junit.Assert.assertNotNull(parseSettings71);
        org.junit.Assert.assertNotNull(parseSettings76);
        org.junit.Assert.assertNotNull(comment79);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
    }

    @Test
    public void test4082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4082");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag1 = startTag0.reset();
        java.lang.String str2 = tag1.tagName;
        org.jsoup.parser.Token.Tag tag4 = tag1.name("</SYSTEM>");
        boolean boolean5 = tag1.selfClosing;
        tag1.appendAttributeName("</SYSTEM>");
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(tag4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test4083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4083");
        org.jsoup.parser.TokeniserState tokeniserState0 = org.jsoup.parser.TokeniserState.RawtextEndTagName;
        org.jsoup.parser.Tokeniser tokeniser1 = null;
        org.jsoup.parser.CharacterReader characterReader2 = null;
        // The following exception was thrown during execution in test generation
        try {
            tokeniserState0.read(tokeniser1, characterReader2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState0);
    }

    @Test
    public void test4084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4084");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        org.jsoup.parser.ParseSettings parseSettings4 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList5 = xmlTreeBuilder0.parseFragment("", "", parseErrorList3, parseSettings4);
        org.jsoup.parser.ParseErrorList parseErrorList8 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder9 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings10 = xmlTreeBuilder9.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings11 = xmlTreeBuilder9.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList14 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder15 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings16 = xmlTreeBuilder15.defaultSettings();
        xmlTreeBuilder9.initialiseParse("", "SYSTEM", parseErrorList14, parseSettings16);
        xmlTreeBuilder0.initialiseParse("Doctype", "PUBLIC", parseErrorList8, parseSettings16);
        org.jsoup.parser.ParseErrorList parseErrorList21 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder22 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList25 = null;
        org.jsoup.parser.ParseSettings parseSettings26 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList27 = xmlTreeBuilder22.parseFragment("", "", parseErrorList25, parseSettings26);
        org.jsoup.parser.ParseErrorList parseErrorList30 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder31 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings32 = xmlTreeBuilder31.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings33 = xmlTreeBuilder31.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList36 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder37 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings38 = xmlTreeBuilder37.defaultSettings();
        xmlTreeBuilder31.initialiseParse("", "SYSTEM", parseErrorList36, parseSettings38);
        xmlTreeBuilder22.initialiseParse("Doctype", "PUBLIC", parseErrorList30, parseSettings38);
        xmlTreeBuilder0.initialiseParse("EndTag", "<!---->", parseErrorList21, parseSettings38);
        org.jsoup.nodes.Document document44 = xmlTreeBuilder0.parse("<!---->", "SYSTEM");
        org.jsoup.parser.Token.Doctype doctype45 = new org.jsoup.parser.Token.Doctype();
        boolean boolean46 = doctype45.forceQuirks;
        java.lang.StringBuilder stringBuilder47 = doctype45.systemIdentifier;
        boolean boolean48 = doctype45.forceQuirks;
        org.jsoup.parser.Token token49 = doctype45.reset();
        xmlTreeBuilder0.insert(doctype45);
        java.lang.StringBuilder stringBuilder51 = doctype45.name;
        boolean boolean52 = doctype45.isComment();
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertNotNull(parseSettings10);
        org.junit.Assert.assertNotNull(parseSettings11);
        org.junit.Assert.assertNotNull(parseSettings16);
        org.junit.Assert.assertNotNull(nodeList27);
        org.junit.Assert.assertNotNull(parseSettings32);
        org.junit.Assert.assertNotNull(parseSettings33);
        org.junit.Assert.assertNotNull(parseSettings38);
        org.junit.Assert.assertNotNull(document44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(stringBuilder47);
        org.junit.Assert.assertEquals(stringBuilder47.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(token49);
        org.junit.Assert.assertNotNull(stringBuilder51);
        org.junit.Assert.assertEquals(stringBuilder51.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
    }

    @Test
    public void test4085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4085");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings2 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList5 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder6 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings7 = xmlTreeBuilder6.defaultSettings();
        xmlTreeBuilder0.initialiseParse("", "SYSTEM", parseErrorList5, parseSettings7);
        org.jsoup.parser.Token.Character character9 = new org.jsoup.parser.Token.Character();
        org.jsoup.parser.Token.Character character11 = character9.data("hi!");
        java.lang.String str12 = character9.getData();
        xmlTreeBuilder0.insert(character9);
        org.jsoup.parser.Token.Comment comment14 = new org.jsoup.parser.Token.Comment();
        org.jsoup.parser.Token.Comment comment15 = comment14.asComment();
        java.lang.String str16 = comment15.toString();
        java.lang.StringBuilder stringBuilder17 = comment15.data;
        comment15.bogus = false;
        java.lang.StringBuilder stringBuilder20 = comment15.data;
        org.jsoup.parser.Token token21 = comment15.reset();
        java.lang.String str22 = comment15.getData();
        org.jsoup.parser.Token token23 = comment15.reset();
        boolean boolean24 = comment15.isCharacter();
        xmlTreeBuilder0.insert(comment15);
        org.jsoup.parser.Token.StartTag startTag26 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag27 = startTag26.reset();
        boolean boolean28 = startTag26.isSelfClosing();
        org.jsoup.parser.Token.Tag tag30 = startTag26.name("a");
        org.jsoup.parser.Token.EndTag endTag31 = new org.jsoup.parser.Token.EndTag();
        endTag31.finaliseTag();
        org.jsoup.parser.Token.EndTag endTag33 = endTag31.asEndTag();
        char[] charArray37 = new char[] { 'a', '#', ' ' };
        endTag31.appendAttributeValue(charArray37);
        startTag26.appendAttributeValue(charArray37);
        startTag26.newAttribute();
        startTag26.setEmptyAttributeValue();
        java.lang.String str42 = startTag26.tagName;
        boolean boolean43 = startTag26.isStartTag();
        org.jsoup.nodes.Attributes attributes44 = startTag26.attributes;
        java.lang.String str45 = startTag26.toString();
        org.jsoup.nodes.Element element46 = xmlTreeBuilder0.insert(startTag26);
        org.jsoup.nodes.Node node47 = element46.previousSibling();
        org.jsoup.select.NodeVisitor nodeVisitor48 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node49 = node47.traverse(nodeVisitor48);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings1);
        org.junit.Assert.assertNotNull(parseSettings2);
        org.junit.Assert.assertNotNull(parseSettings7);
        org.junit.Assert.assertNotNull(character11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(comment15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "<!---->" + "'", str16, "<!---->");
        org.junit.Assert.assertNotNull(stringBuilder17);
        org.junit.Assert.assertEquals(stringBuilder17.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder20);
        org.junit.Assert.assertEquals(stringBuilder20.toString(), "");
        org.junit.Assert.assertNotNull(token21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(token23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(tag27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(tag30);
        org.junit.Assert.assertNotNull(endTag33);
        org.junit.Assert.assertNotNull(charArray37);
        org.junit.Assert.assertArrayEquals(charArray37, new char[] { 'a', '#', ' ' });
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "a" + "'", str42, "a");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(attributes44);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "<a>" + "'", str45, "<a>");
        org.junit.Assert.assertNotNull(element46);
        org.junit.Assert.assertNotNull(node47);
    }

    @Test
    public void test4086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4086");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("</<!DOCTYPE a PUBLIC \"#doctype\" \"Comment\">>", "<PUBLIC>", "<system>", "<hi!  name=\"hi!\" publicId=\"hi!\" systemId=\"\">");
    }

    @Test
    public void test4087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4087");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.getSystemIdentifier();
        boolean boolean2 = doctype0.forceQuirks;
        java.lang.String str3 = doctype0.getSystemIdentifier();
        java.lang.String str4 = doctype0.getName();
        doctype0.forceQuirks = false;
        org.jsoup.parser.Token token7 = doctype0.reset();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(token7);
    }

    @Test
    public void test4088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4088");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes1 = null;
        startTag0.attributes = attributes1;
        org.jsoup.parser.Token.Tag tag3 = startTag0.reset();
        startTag0.setEmptyAttributeValue();
        startTag0.tagName = "<PUBLIC>";
        org.jsoup.parser.Token.TokenType tokenType7 = startTag0.type;
        java.lang.String str8 = startTag0.normalName;
        java.lang.String str9 = startTag0.toString();
        boolean boolean10 = startTag0.isSelfClosing();
        org.junit.Assert.assertNotNull(tag3);
        org.junit.Assert.assertTrue("'" + tokenType7 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType7.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<<PUBLIC>>" + "'", str9, "<<PUBLIC>>");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test4089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4089");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings2 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings3 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.Token.EndTag endTag5 = new org.jsoup.parser.Token.EndTag();
        endTag5.appendTagName('4');
        org.jsoup.parser.Token.Character character8 = new org.jsoup.parser.Token.Character();
        org.jsoup.parser.Token.Character character10 = character8.data("hi!");
        java.lang.String str11 = character10.getData();
        org.jsoup.parser.Token.Doctype doctype12 = new org.jsoup.parser.Token.Doctype();
        boolean boolean13 = doctype12.forceQuirks;
        org.jsoup.parser.Token.TokenType tokenType14 = doctype12.type;
        character10.type = tokenType14;
        endTag5.type = tokenType14;
        org.jsoup.parser.Token.EndTag endTag17 = new org.jsoup.parser.Token.EndTag();
        endTag17.finaliseTag();
        org.jsoup.parser.Token.EndTag endTag19 = endTag17.asEndTag();
        java.lang.String str20 = endTag17.normalName;
        endTag17.appendTagName("EndTag");
        boolean boolean23 = endTag17.isDoctype();
        org.jsoup.nodes.Attributes attributes24 = endTag17.getAttributes();
        org.jsoup.parser.Token.StartTag startTag25 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes27 = null;
        org.jsoup.parser.Token.StartTag startTag28 = startTag25.nameAttr("PUBLIC", attributes27);
        org.jsoup.nodes.DocumentType documentType34 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "<!---->");
        java.lang.String str35 = documentType34.outerHtml();
        org.jsoup.nodes.Attributes attributes36 = documentType34.attributes();
        org.jsoup.parser.Token.StartTag startTag37 = startTag25.nameAttr("Comment", attributes36);
        endTag17.attributes = attributes36;
        endTag5.attributes = attributes36;
        endTag5.appendTagName('a');
        org.jsoup.nodes.Attributes attributes42 = endTag5.getAttributes();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean43 = xmlTreeBuilder0.processStartTag("</system>", attributes42);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings1);
        org.junit.Assert.assertNotNull(parseSettings2);
        org.junit.Assert.assertNotNull(parseSettings3);
        org.junit.Assert.assertNotNull(character10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + tokenType14 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType14.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertNotNull(endTag19);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(attributes24);
        org.junit.Assert.assertNotNull(startTag28);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str35, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNotNull(attributes36);
        org.junit.Assert.assertNotNull(startTag37);
        org.junit.Assert.assertNotNull(attributes42);
    }

    @Test
    public void test4090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4090");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList4 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder5 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList8 = null;
        org.jsoup.parser.ParseSettings parseSettings9 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList10 = xmlTreeBuilder5.parseFragment("", "", parseErrorList8, parseSettings9);
        org.jsoup.parser.ParseErrorList parseErrorList13 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder14 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings15 = xmlTreeBuilder14.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings16 = xmlTreeBuilder14.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList19 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder20 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings21 = xmlTreeBuilder20.defaultSettings();
        xmlTreeBuilder14.initialiseParse("", "SYSTEM", parseErrorList19, parseSettings21);
        xmlTreeBuilder5.initialiseParse("Doctype", "PUBLIC", parseErrorList13, parseSettings21);
        org.jsoup.parser.ParseErrorList parseErrorList26 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder27 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList30 = null;
        org.jsoup.parser.ParseSettings parseSettings31 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList32 = xmlTreeBuilder27.parseFragment("", "", parseErrorList30, parseSettings31);
        org.jsoup.parser.ParseErrorList parseErrorList35 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder36 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings37 = xmlTreeBuilder36.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings38 = xmlTreeBuilder36.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList41 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder42 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings43 = xmlTreeBuilder42.defaultSettings();
        xmlTreeBuilder36.initialiseParse("", "SYSTEM", parseErrorList41, parseSettings43);
        xmlTreeBuilder27.initialiseParse("Doctype", "PUBLIC", parseErrorList35, parseSettings43);
        xmlTreeBuilder5.initialiseParse("EndTag", "<!---->", parseErrorList26, parseSettings43);
        java.util.List<org.jsoup.nodes.Node> nodeList47 = xmlTreeBuilder0.parseFragment("aa", "</#>", parseErrorList4, parseSettings43);
        org.jsoup.parser.Token.Comment comment48 = new org.jsoup.parser.Token.Comment();
        java.lang.String str49 = comment48.toString();
        xmlTreeBuilder0.insert(comment48);
        org.jsoup.parser.Token.StartTag startTag52 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes53 = null;
        startTag52.attributes = attributes53;
        org.jsoup.parser.Token.Tag tag55 = startTag52.reset();
        tag55.normalName = "<!---->";
        tag55.appendAttributeValue(' ');
        java.lang.String str60 = tag55.normalName;
        org.jsoup.parser.Token.EndTag endTag61 = new org.jsoup.parser.Token.EndTag();
        endTag61.finaliseTag();
        org.jsoup.parser.Token.EndTag endTag63 = endTag61.asEndTag();
        org.jsoup.parser.Token.Tag tag64 = endTag61.reset();
        tag64.finaliseTag();
        org.jsoup.parser.Token.EndTag endTag66 = new org.jsoup.parser.Token.EndTag();
        org.jsoup.parser.Token.TokenType tokenType67 = endTag66.type;
        org.jsoup.parser.Token.EndTag endTag68 = endTag66.asEndTag();
        org.jsoup.nodes.DocumentType documentType73 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "<!---->");
        java.lang.String str74 = documentType73.outerHtml();
        org.jsoup.nodes.Attributes attributes75 = documentType73.attributes();
        endTag68.attributes = attributes75;
        tag64.attributes = attributes75;
        org.jsoup.nodes.Attributes attributes78 = tag64.attributes;
        tag55.attributes = attributes78;
        boolean boolean80 = xmlTreeBuilder0.processStartTag("<!---->", attributes78);
        org.jsoup.parser.Token.Comment comment81 = new org.jsoup.parser.Token.Comment();
        org.jsoup.parser.Token.Comment comment82 = comment81.asComment();
        java.lang.String str83 = comment82.toString();
        java.lang.StringBuilder stringBuilder84 = comment82.data;
        java.lang.String str85 = comment82.toString();
        boolean boolean86 = comment82.isCharacter();
        xmlTreeBuilder0.insert(comment82);
        java.lang.String str88 = comment82.getData();
        java.lang.StringBuilder stringBuilder89 = comment82.data;
        org.junit.Assert.assertNotNull(parseSettings1);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertNotNull(parseSettings15);
        org.junit.Assert.assertNotNull(parseSettings16);
        org.junit.Assert.assertNotNull(parseSettings21);
        org.junit.Assert.assertNotNull(nodeList32);
        org.junit.Assert.assertNotNull(parseSettings37);
        org.junit.Assert.assertNotNull(parseSettings38);
        org.junit.Assert.assertNotNull(parseSettings43);
        org.junit.Assert.assertNotNull(nodeList47);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "<!---->" + "'", str49, "<!---->");
        org.junit.Assert.assertNotNull(tag55);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "<!---->" + "'", str60, "<!---->");
        org.junit.Assert.assertNotNull(endTag63);
        org.junit.Assert.assertNotNull(tag64);
        org.junit.Assert.assertTrue("'" + tokenType67 + "' != '" + org.jsoup.parser.Token.TokenType.EndTag + "'", tokenType67.equals(org.jsoup.parser.Token.TokenType.EndTag));
        org.junit.Assert.assertNotNull(endTag68);
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str74, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNotNull(attributes75);
        org.junit.Assert.assertNotNull(attributes78);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + true + "'", boolean80 == true);
        org.junit.Assert.assertNotNull(comment82);
        org.junit.Assert.assertEquals("'" + str83 + "' != '" + "<!---->" + "'", str83, "<!---->");
        org.junit.Assert.assertNotNull(stringBuilder84);
        org.junit.Assert.assertEquals(stringBuilder84.toString(), "");
        org.junit.Assert.assertEquals("'" + str85 + "' != '" + "<!---->" + "'", str85, "<!---->");
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertEquals("'" + str88 + "' != '" + "" + "'", str88, "");
        org.junit.Assert.assertNotNull(stringBuilder89);
        org.junit.Assert.assertEquals(stringBuilder89.toString(), "");
    }

    @Test
    public void test4091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4091");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag1 = startTag0.reset();
        boolean boolean2 = startTag0.isSelfClosing();
        org.jsoup.parser.Token.Tag tag4 = startTag0.name("a");
        org.jsoup.parser.Token.EndTag endTag5 = new org.jsoup.parser.Token.EndTag();
        endTag5.finaliseTag();
        org.jsoup.parser.Token.EndTag endTag7 = endTag5.asEndTag();
        char[] charArray11 = new char[] { 'a', '#', ' ' };
        endTag5.appendAttributeValue(charArray11);
        startTag0.appendAttributeValue(charArray11);
        org.jsoup.parser.Token.StartTag startTag15 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag16 = startTag15.reset();
        boolean boolean17 = startTag15.isSelfClosing();
        org.jsoup.parser.Token.Tag tag19 = startTag15.name("a");
        org.jsoup.nodes.Attributes attributes20 = tag19.attributes;
        org.jsoup.parser.Token.StartTag startTag21 = startTag0.nameAttr("", attributes20);
        org.jsoup.nodes.Attributes attributes22 = startTag0.attributes;
        org.jsoup.parser.Token.StartTag startTag24 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag25 = startTag24.reset();
        boolean boolean26 = startTag24.isSelfClosing();
        org.jsoup.parser.Token.Tag tag28 = startTag24.name("a");
        org.jsoup.parser.Token.EndTag endTag29 = new org.jsoup.parser.Token.EndTag();
        endTag29.finaliseTag();
        org.jsoup.parser.Token.EndTag endTag31 = endTag29.asEndTag();
        char[] charArray35 = new char[] { 'a', '#', ' ' };
        endTag29.appendAttributeValue(charArray35);
        startTag24.appendAttributeValue(charArray35);
        startTag24.newAttribute();
        java.lang.String str39 = startTag24.tagName;
        org.jsoup.parser.Token.StartTag startTag41 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.StartTag startTag42 = startTag41.asStartTag();
        boolean boolean43 = startTag41.isEndTag();
        org.jsoup.parser.Token.Character character44 = new org.jsoup.parser.Token.Character();
        org.jsoup.parser.Token.Character character46 = character44.data("hi!");
        java.lang.String str47 = character46.getData();
        org.jsoup.parser.Token.Doctype doctype48 = new org.jsoup.parser.Token.Doctype();
        boolean boolean49 = doctype48.forceQuirks;
        org.jsoup.parser.Token.TokenType tokenType50 = doctype48.type;
        character46.type = tokenType50;
        startTag41.type = tokenType50;
        org.jsoup.parser.Token.EndTag endTag54 = new org.jsoup.parser.Token.EndTag();
        org.jsoup.parser.Token.TokenType tokenType55 = endTag54.type;
        org.jsoup.parser.Token.EndTag endTag56 = endTag54.asEndTag();
        org.jsoup.nodes.DocumentType documentType61 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "<!---->");
        java.lang.String str62 = documentType61.outerHtml();
        org.jsoup.nodes.Attributes attributes63 = documentType61.attributes();
        endTag56.attributes = attributes63;
        org.jsoup.nodes.Attributes attributes65 = endTag56.getAttributes();
        org.jsoup.parser.Token.StartTag startTag66 = startTag41.nameAttr("</SYSTEM>", attributes65);
        org.jsoup.nodes.Attributes attributes67 = startTag41.getAttributes();
        org.jsoup.parser.Token.StartTag startTag68 = startTag24.nameAttr("a", attributes67);
        org.jsoup.parser.Token.StartTag startTag69 = startTag0.nameAttr("<PUBLIC>", attributes67);
        org.jsoup.parser.Token token70 = startTag0.reset();
        boolean boolean71 = token70.isStartTag();
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(tag4);
        org.junit.Assert.assertNotNull(endTag7);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertArrayEquals(charArray11, new char[] { 'a', '#', ' ' });
        org.junit.Assert.assertNotNull(tag16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(tag19);
        org.junit.Assert.assertNotNull(attributes20);
        org.junit.Assert.assertNotNull(startTag21);
        org.junit.Assert.assertNotNull(attributes22);
        org.junit.Assert.assertNotNull(tag25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(tag28);
        org.junit.Assert.assertNotNull(endTag31);
        org.junit.Assert.assertNotNull(charArray35);
        org.junit.Assert.assertArrayEquals(charArray35, new char[] { 'a', '#', ' ' });
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "a" + "'", str39, "a");
        org.junit.Assert.assertNotNull(startTag42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(character46);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "hi!" + "'", str47, "hi!");
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + tokenType50 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType50.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertTrue("'" + tokenType55 + "' != '" + org.jsoup.parser.Token.TokenType.EndTag + "'", tokenType55.equals(org.jsoup.parser.Token.TokenType.EndTag));
        org.junit.Assert.assertNotNull(endTag56);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str62, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNotNull(attributes63);
        org.junit.Assert.assertNotNull(attributes65);
        org.junit.Assert.assertNotNull(startTag66);
        org.junit.Assert.assertNotNull(attributes67);
        org.junit.Assert.assertNotNull(startTag68);
        org.junit.Assert.assertNotNull(startTag69);
        org.junit.Assert.assertNotNull(token70);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
    }

    @Test
    public void test4092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4092");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        org.jsoup.parser.ParseSettings parseSettings4 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList5 = xmlTreeBuilder0.parseFragment("", "", parseErrorList3, parseSettings4);
        org.jsoup.parser.ParseErrorList parseErrorList8 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder9 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings10 = xmlTreeBuilder9.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings11 = xmlTreeBuilder9.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList14 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder15 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings16 = xmlTreeBuilder15.defaultSettings();
        xmlTreeBuilder9.initialiseParse("", "SYSTEM", parseErrorList14, parseSettings16);
        xmlTreeBuilder0.initialiseParse("Doctype", "PUBLIC", parseErrorList8, parseSettings16);
        org.jsoup.parser.ParseErrorList parseErrorList21 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder22 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList25 = null;
        org.jsoup.parser.ParseSettings parseSettings26 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList27 = xmlTreeBuilder22.parseFragment("", "", parseErrorList25, parseSettings26);
        org.jsoup.parser.ParseErrorList parseErrorList30 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder31 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings32 = xmlTreeBuilder31.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings33 = xmlTreeBuilder31.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList36 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder37 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings38 = xmlTreeBuilder37.defaultSettings();
        xmlTreeBuilder31.initialiseParse("", "SYSTEM", parseErrorList36, parseSettings38);
        xmlTreeBuilder22.initialiseParse("Doctype", "PUBLIC", parseErrorList30, parseSettings38);
        xmlTreeBuilder0.initialiseParse("EndTag", "<!---->", parseErrorList21, parseSettings38);
        org.jsoup.nodes.Document document44 = xmlTreeBuilder0.parse("<!---->", "SYSTEM");
        org.jsoup.parser.Token.Comment comment45 = new org.jsoup.parser.Token.Comment();
        org.jsoup.parser.Token token46 = comment45.reset();
        boolean boolean47 = token46.isCharacter();
        boolean boolean48 = xmlTreeBuilder0.process(token46);
        boolean boolean49 = token46.isEOF();
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertNotNull(parseSettings10);
        org.junit.Assert.assertNotNull(parseSettings11);
        org.junit.Assert.assertNotNull(parseSettings16);
        org.junit.Assert.assertNotNull(nodeList27);
        org.junit.Assert.assertNotNull(parseSettings32);
        org.junit.Assert.assertNotNull(parseSettings33);
        org.junit.Assert.assertNotNull(parseSettings38);
        org.junit.Assert.assertNotNull(document44);
        org.junit.Assert.assertNotNull(token46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
    }

    @Test
    public void test4093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4093");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag1 = startTag0.reset();
        boolean boolean2 = startTag0.isSelfClosing();
        org.jsoup.parser.Token.Tag tag4 = startTag0.name("a");
        tag4.appendAttributeName(' ');
        org.jsoup.parser.Token.Tag tag8 = tag4.name("<<PUBLIC>>");
        boolean boolean9 = tag4.selfClosing;
        org.jsoup.parser.Token.Tag tag11 = tag4.name("<EndTag  name=\"hi!\" publicId=\"hi!\" systemId=\"\">");
        org.jsoup.parser.Token.StartTag startTag12 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes13 = null;
        startTag12.attributes = attributes13;
        org.jsoup.parser.Token.Tag tag15 = startTag12.reset();
        org.jsoup.nodes.Attributes attributes17 = null;
        org.jsoup.parser.Token.StartTag startTag18 = startTag12.nameAttr("SYSTEM", attributes17);
        java.lang.String str19 = startTag18.name();
        java.lang.String str20 = startTag18.toString();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder22 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings23 = xmlTreeBuilder22.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings24 = xmlTreeBuilder22.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings25 = xmlTreeBuilder22.defaultSettings();
        org.jsoup.nodes.Document document28 = xmlTreeBuilder22.parse("PUBLIC", "hi!");
        org.jsoup.nodes.Node node30 = document28.removeAttr("PUBLIC");
        java.util.List<org.jsoup.nodes.Node> nodeList31 = document28.siblingNodes();
        org.jsoup.nodes.Attributes attributes32 = document28.attributes();
        org.jsoup.parser.Token.StartTag startTag33 = startTag18.nameAttr("Comment", attributes32);
        java.lang.String str34 = startTag18.toString();
        startTag18.newAttribute();
        org.jsoup.nodes.Attributes attributes36 = startTag18.getAttributes();
        tag11.attributes = attributes36;
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(tag4);
        org.junit.Assert.assertNotNull(tag8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(tag11);
        org.junit.Assert.assertNotNull(tag15);
        org.junit.Assert.assertNotNull(startTag18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "SYSTEM" + "'", str19, "SYSTEM");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "<SYSTEM>" + "'", str20, "<SYSTEM>");
        org.junit.Assert.assertNotNull(parseSettings23);
        org.junit.Assert.assertNotNull(parseSettings24);
        org.junit.Assert.assertNotNull(parseSettings25);
        org.junit.Assert.assertNotNull(document28);
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertNotNull(nodeList31);
        org.junit.Assert.assertNotNull(attributes32);
        org.junit.Assert.assertNotNull(startTag33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "<Comment>" + "'", str34, "<Comment>");
        org.junit.Assert.assertNotNull(attributes36);
    }

    @Test
    public void test4094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4094");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.finaliseTag();
        endTag0.appendAttributeName("SYSTEM");
        boolean boolean4 = endTag0.isStartTag();
        java.lang.String str5 = endTag0.tagName;
        endTag0.appendTagName("<!DOCTYPE a PUBLIC \"#doctype\" \"Comment\">");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test4095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4095");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        org.jsoup.parser.Token.Comment comment1 = comment0.asComment();
        java.lang.String str2 = comment1.toString();
        java.lang.StringBuilder stringBuilder3 = comment1.data;
        java.lang.String str4 = comment1.toString();
        comment1.bogus = false;
        org.junit.Assert.assertNotNull(comment1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "<!---->" + "'", str2, "<!---->");
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<!---->" + "'", str4, "<!---->");
    }

    @Test
    public void test4096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4096");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes1 = null;
        startTag0.attributes = attributes1;
        org.jsoup.parser.Token.Tag tag3 = startTag0.reset();
        java.lang.String str4 = tag3.tagName;
        boolean boolean5 = tag3.isComment();
        tag3.appendTagName('a');
        java.lang.String str8 = tag3.normalName();
        org.junit.Assert.assertNotNull(tag3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "a" + "'", str8, "a");
    }

    @Test
    public void test4097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4097");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.finaliseTag();
        org.jsoup.parser.Token.EndTag endTag2 = endTag0.asEndTag();
        endTag0.tagName = "";
        org.jsoup.parser.Token token5 = endTag0.reset();
        endTag0.finaliseTag();
        java.lang.String str7 = endTag0.normalName;
        endTag0.newAttribute();
        org.jsoup.parser.Token.StartTag startTag9 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes10 = null;
        startTag9.attributes = attributes10;
        org.jsoup.parser.Token.Tag tag12 = startTag9.reset();
        tag12.normalName = "<!---->";
        tag12.appendAttributeValue(' ');
        java.lang.String str17 = tag12.normalName;
        org.jsoup.parser.Token.EndTag endTag18 = new org.jsoup.parser.Token.EndTag();
        endTag18.finaliseTag();
        org.jsoup.parser.Token.EndTag endTag20 = endTag18.asEndTag();
        org.jsoup.parser.Token.Tag tag21 = endTag18.reset();
        tag21.finaliseTag();
        org.jsoup.parser.Token.EndTag endTag23 = new org.jsoup.parser.Token.EndTag();
        org.jsoup.parser.Token.TokenType tokenType24 = endTag23.type;
        org.jsoup.parser.Token.EndTag endTag25 = endTag23.asEndTag();
        org.jsoup.nodes.DocumentType documentType30 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "<!---->");
        java.lang.String str31 = documentType30.outerHtml();
        org.jsoup.nodes.Attributes attributes32 = documentType30.attributes();
        endTag25.attributes = attributes32;
        tag21.attributes = attributes32;
        org.jsoup.nodes.Attributes attributes35 = tag21.attributes;
        tag12.attributes = attributes35;
        endTag0.attributes = attributes35;
        endTag0.appendTagName('a');
        org.jsoup.parser.Token token40 = endTag0.reset();
        org.junit.Assert.assertNotNull(endTag2);
        org.junit.Assert.assertNotNull(token5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(tag12);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "<!---->" + "'", str17, "<!---->");
        org.junit.Assert.assertNotNull(endTag20);
        org.junit.Assert.assertNotNull(tag21);
        org.junit.Assert.assertTrue("'" + tokenType24 + "' != '" + org.jsoup.parser.Token.TokenType.EndTag + "'", tokenType24.equals(org.jsoup.parser.Token.TokenType.EndTag));
        org.junit.Assert.assertNotNull(endTag25);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str31, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNotNull(attributes32);
        org.junit.Assert.assertNotNull(attributes35);
        org.junit.Assert.assertNotNull(token40);
    }

    @Test
    public void test4098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4098");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "<!---->");
        java.lang.String str5 = documentType4.outerHtml();
        org.jsoup.nodes.Attributes attributes6 = documentType4.attributes();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = documentType4.childNodes();
        boolean boolean9 = documentType4.hasAttr("SYSTEM");
        org.jsoup.parser.Token.Comment comment10 = new org.jsoup.parser.Token.Comment();
        org.jsoup.parser.Token.Comment comment11 = comment10.asComment();
        org.jsoup.parser.Token token12 = comment11.reset();
        org.jsoup.parser.Token token13 = comment11.reset();
        boolean boolean14 = documentType4.hasSameValue((java.lang.Object) comment11);
        org.jsoup.nodes.Node node17 = documentType4.attr("<!doctype hi! public \"hi!\">", "<!DOCTYPE EndTag PUBLIC \"<!DOCTYPE hi! PUBLIC \"hi!\">\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
        node17.setBaseUri("#EndTag");
        int int20 = node17.childNodeSize();
        java.lang.String str21 = node17.baseUri();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str5, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(comment11);
        org.junit.Assert.assertNotNull(token12);
        org.junit.Assert.assertNotNull(token13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "#EndTag" + "'", str21, "#EndTag");
    }

    @Test
    public void test4099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4099");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "<<PUBLIC>4>", "a", "<!DOCTYPE a PUBLIC \"#doctype\" \"Comment\">");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder5 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList8 = null;
        org.jsoup.parser.ParseSettings parseSettings9 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList10 = xmlTreeBuilder5.parseFragment("", "", parseErrorList8, parseSettings9);
        org.jsoup.parser.ParseErrorList parseErrorList13 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder14 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings15 = xmlTreeBuilder14.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings16 = xmlTreeBuilder14.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList19 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder20 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings21 = xmlTreeBuilder20.defaultSettings();
        xmlTreeBuilder14.initialiseParse("", "SYSTEM", parseErrorList19, parseSettings21);
        xmlTreeBuilder5.initialiseParse("Doctype", "PUBLIC", parseErrorList13, parseSettings21);
        org.jsoup.parser.ParseErrorList parseErrorList26 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder27 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList30 = null;
        org.jsoup.parser.ParseSettings parseSettings31 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList32 = xmlTreeBuilder27.parseFragment("", "", parseErrorList30, parseSettings31);
        org.jsoup.parser.ParseErrorList parseErrorList35 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder36 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings37 = xmlTreeBuilder36.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings38 = xmlTreeBuilder36.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList41 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder42 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings43 = xmlTreeBuilder42.defaultSettings();
        xmlTreeBuilder36.initialiseParse("", "SYSTEM", parseErrorList41, parseSettings43);
        xmlTreeBuilder27.initialiseParse("Doctype", "PUBLIC", parseErrorList35, parseSettings43);
        xmlTreeBuilder5.initialiseParse("EndTag", "<!---->", parseErrorList26, parseSettings43);
        org.jsoup.nodes.Document document49 = xmlTreeBuilder5.parse("<!---->", "SYSTEM");
        org.jsoup.nodes.Document document50 = document49.ownerDocument();
        java.util.List<org.jsoup.nodes.Node> nodeList51 = document49.childNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList52 = document49.siblingNodes();
        org.jsoup.nodes.Node node53 = document49.clone();
        org.jsoup.nodes.Node node54 = node53.clone();
        java.lang.String str55 = node53.baseUri();
        org.jsoup.nodes.Document document56 = node53.ownerDocument();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node57 = documentType4.after((org.jsoup.nodes.Node) document56);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertNotNull(parseSettings15);
        org.junit.Assert.assertNotNull(parseSettings16);
        org.junit.Assert.assertNotNull(parseSettings21);
        org.junit.Assert.assertNotNull(nodeList32);
        org.junit.Assert.assertNotNull(parseSettings37);
        org.junit.Assert.assertNotNull(parseSettings38);
        org.junit.Assert.assertNotNull(parseSettings43);
        org.junit.Assert.assertNotNull(document49);
        org.junit.Assert.assertNotNull(document50);
        org.junit.Assert.assertNotNull(nodeList51);
        org.junit.Assert.assertNotNull(nodeList52);
        org.junit.Assert.assertNotNull(node53);
        org.junit.Assert.assertNotNull(node54);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "SYSTEM" + "'", str55, "SYSTEM");
        org.junit.Assert.assertNotNull(document56);
    }

    @Test
    public void test4100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4100");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag1 = startTag0.reset();
        java.lang.String str2 = tag1.tagName;
        org.jsoup.parser.Token.Tag tag4 = tag1.name("</SYSTEM>");
        boolean boolean5 = tag1.selfClosing;
        tag1.appendAttributeValue("4");
        org.jsoup.parser.Token.Tag tag9 = tag1.name("public#endtag");
        boolean boolean10 = tag9.isCharacter();
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(tag4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(tag9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test4101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4101");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes1 = null;
        startTag0.attributes = attributes1;
        org.jsoup.parser.Token.Tag tag3 = startTag0.reset();
        startTag0.setEmptyAttributeValue();
        startTag0.tagName = "<PUBLIC>";
        java.lang.String str7 = startTag0.toString();
        org.jsoup.parser.Token token8 = startTag0.reset();
        org.jsoup.nodes.Attributes attributes9 = startTag0.getAttributes();
        java.lang.String str10 = startTag0.normalName();
        boolean boolean11 = startTag0.selfClosing;
        boolean boolean12 = startTag0.isSelfClosing();
        boolean boolean13 = startTag0.selfClosing;
        org.junit.Assert.assertNotNull(tag3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<<PUBLIC>>" + "'", str7, "<<PUBLIC>>");
        org.junit.Assert.assertNotNull(token8);
        org.junit.Assert.assertNotNull(attributes9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test4102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4102");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE hi! PUBLIC \"hi!\">", "PUBLIC", "#doctype", "");
        org.jsoup.nodes.Node node6 = documentType4.removeAttr("SYSTEM");
        java.lang.String str7 = documentType4.outerHtml();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder8 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList11 = null;
        org.jsoup.parser.ParseSettings parseSettings12 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList13 = xmlTreeBuilder8.parseFragment("", "", parseErrorList11, parseSettings12);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder14 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings15 = xmlTreeBuilder14.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings16 = xmlTreeBuilder14.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList19 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder20 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings21 = xmlTreeBuilder20.defaultSettings();
        xmlTreeBuilder14.initialiseParse("", "SYSTEM", parseErrorList19, parseSettings21);
        org.jsoup.parser.Token.Comment comment23 = new org.jsoup.parser.Token.Comment();
        org.jsoup.parser.Token.Comment comment24 = comment23.asComment();
        xmlTreeBuilder14.insert(comment23);
        xmlTreeBuilder8.insert(comment23);
        boolean boolean27 = documentType4.equals((java.lang.Object) xmlTreeBuilder8);
        org.jsoup.parser.TokeniserState tokeniserState28 = org.jsoup.parser.TokeniserState.ScriptDataDoubleEscapeEnd;
        boolean boolean29 = documentType4.hasSameValue((java.lang.Object) tokeniserState28);
        org.jsoup.nodes.Node node30 = documentType4.parentNode();
        org.jsoup.nodes.Attributes attributes31 = documentType4.attributes();
        java.lang.String str32 = documentType4.nodeName();
        int int33 = documentType4.childNodeSize();
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<!DOCTYPE <!DOCTYPE hi! PUBLIC \"hi!\"> PUBLIC \"PUBLIC\" \"#doctype\">" + "'", str7, "<!DOCTYPE <!DOCTYPE hi! PUBLIC \"hi!\"> PUBLIC \"PUBLIC\" \"#doctype\">");
        org.junit.Assert.assertNotNull(nodeList13);
        org.junit.Assert.assertNotNull(parseSettings15);
        org.junit.Assert.assertNotNull(parseSettings16);
        org.junit.Assert.assertNotNull(parseSettings21);
        org.junit.Assert.assertNotNull(comment24);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(tokeniserState28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNull(node30);
        org.junit.Assert.assertNotNull(attributes31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "#doctype" + "'", str32, "#doctype");
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
    }

    @Test
    public void test4103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4103");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings2 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList5 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder6 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings7 = xmlTreeBuilder6.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings8 = xmlTreeBuilder6.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = xmlTreeBuilder0.parseFragment("</SYSTEM>", "<a>", parseErrorList5, parseSettings8);
        org.jsoup.parser.Token.Character character10 = new org.jsoup.parser.Token.Character();
        java.lang.String str11 = character10.toString();
        org.jsoup.parser.Token token12 = character10.reset();
        org.jsoup.parser.Token.Character character14 = character10.data("#endtag");
        boolean boolean15 = xmlTreeBuilder0.process((org.jsoup.parser.Token) character10);
        org.jsoup.parser.Token token16 = character10.reset();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Doctype doctype17 = character10.asDoctype();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$Character cannot be cast to class org.jsoup.parser.Token$Doctype (org.jsoup.parser.Token$Character and org.jsoup.parser.Token$Doctype are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings1);
        org.junit.Assert.assertNotNull(parseSettings2);
        org.junit.Assert.assertNotNull(parseSettings7);
        org.junit.Assert.assertNotNull(parseSettings8);
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(token12);
        org.junit.Assert.assertNotNull(character14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(token16);
    }

    @Test
    public void test4104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4104");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings2 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings3 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.Document document6 = xmlTreeBuilder0.parse("PUBLIC", "hi!");
        org.jsoup.nodes.Document document9 = xmlTreeBuilder0.parse("</SYSTEM>", "<Comment   name=\"hi!\" publicId=\"hi!\" systemId=\"\">");
        org.jsoup.nodes.Document document12 = xmlTreeBuilder0.parse("4<PUBLIC>", "</#EndTag>");
        org.jsoup.parser.Token.StartTag startTag13 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag14 = startTag13.reset();
        boolean boolean15 = startTag13.isSelfClosing();
        org.jsoup.parser.Token.Tag tag17 = startTag13.name("a");
        org.jsoup.parser.Token.EndTag endTag18 = new org.jsoup.parser.Token.EndTag();
        endTag18.finaliseTag();
        org.jsoup.parser.Token.EndTag endTag20 = endTag18.asEndTag();
        char[] charArray24 = new char[] { 'a', '#', ' ' };
        endTag18.appendAttributeValue(charArray24);
        startTag13.appendAttributeValue(charArray24);
        startTag13.newAttribute();
        startTag13.appendAttributeValue("Comment");
        org.jsoup.parser.Token.Tag tag31 = startTag13.name("4");
        org.jsoup.parser.Token.StartTag startTag33 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes35 = null;
        org.jsoup.parser.Token.StartTag startTag36 = startTag33.nameAttr("PUBLIC", attributes35);
        org.jsoup.nodes.DocumentType documentType42 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "<!---->");
        java.lang.String str43 = documentType42.outerHtml();
        org.jsoup.nodes.Attributes attributes44 = documentType42.attributes();
        org.jsoup.parser.Token.StartTag startTag45 = startTag33.nameAttr("Comment", attributes44);
        org.jsoup.parser.Token.StartTag startTag46 = startTag13.nameAttr("<Comment>", attributes44);
        java.lang.String str47 = startTag13.toString();
        org.jsoup.nodes.Element element48 = xmlTreeBuilder0.insert(startTag13);
        java.lang.String str49 = startTag13.toString();
        org.junit.Assert.assertNotNull(parseSettings1);
        org.junit.Assert.assertNotNull(parseSettings2);
        org.junit.Assert.assertNotNull(parseSettings3);
        org.junit.Assert.assertNotNull(document6);
        org.junit.Assert.assertNotNull(document9);
        org.junit.Assert.assertNotNull(document12);
        org.junit.Assert.assertNotNull(tag14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(tag17);
        org.junit.Assert.assertNotNull(endTag20);
        org.junit.Assert.assertNotNull(charArray24);
        org.junit.Assert.assertArrayEquals(charArray24, new char[] { 'a', '#', ' ' });
        org.junit.Assert.assertNotNull(tag31);
        org.junit.Assert.assertNotNull(startTag36);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str43, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNotNull(attributes44);
        org.junit.Assert.assertNotNull(startTag45);
        org.junit.Assert.assertNotNull(startTag46);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "<<Comment>  name=\"hi!\" publicId=\"hi!\" systemId=\"\">" + "'", str47, "<<Comment>  name=\"hi!\" publicId=\"hi!\" systemId=\"\">");
        org.junit.Assert.assertNotNull(element48);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "<<Comment>  name=\"hi!\" publicId=\"hi!\" systemId=\"\">" + "'", str49, "<<Comment>  name=\"hi!\" publicId=\"hi!\" systemId=\"\">");
    }

    @Test
    public void test4105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4105");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        boolean boolean1 = doctype0.forceQuirks;
        doctype0.forceQuirks = false;
        java.lang.String str4 = doctype0.getName();
        java.lang.StringBuilder stringBuilder5 = doctype0.name;
        doctype0.forceQuirks = true;
        java.lang.StringBuilder stringBuilder8 = doctype0.name;
        java.lang.String str9 = doctype0.getSystemIdentifier();
        boolean boolean10 = doctype0.isStartTag();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder8);
        org.junit.Assert.assertEquals(stringBuilder8.toString(), "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test4106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4106");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "<!---->");
        int int5 = documentType4.childNodeSize();
        java.lang.String str7 = documentType4.absUrl("PUBLIC");
        documentType4.setBaseUri("hi!");
        org.jsoup.nodes.Node node12 = documentType4.attr("system", "<<public>>");
        java.util.List<org.jsoup.nodes.Node> nodeList13 = documentType4.childNodes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node15 = documentType4.before("<a></a>");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(nodeList13);
    }

    @Test
    public void test4107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4107");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag1 = startTag0.reset();
        boolean boolean2 = startTag0.isSelfClosing();
        org.jsoup.parser.Token.Tag tag4 = startTag0.name("a");
        org.jsoup.parser.Token.EndTag endTag5 = new org.jsoup.parser.Token.EndTag();
        endTag5.finaliseTag();
        org.jsoup.parser.Token.EndTag endTag7 = endTag5.asEndTag();
        char[] charArray11 = new char[] { 'a', '#', ' ' };
        endTag5.appendAttributeValue(charArray11);
        startTag0.appendAttributeValue(charArray11);
        startTag0.newAttribute();
        startTag0.setEmptyAttributeValue();
        startTag0.appendAttributeValue('4');
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(tag4);
        org.junit.Assert.assertNotNull(endTag7);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertArrayEquals(charArray11, new char[] { 'a', '#', ' ' });
    }

    @Test
    public void test4108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4108");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "<!---->");
        int int5 = documentType4.childNodeSize();
        java.lang.String str6 = documentType4.outerHtml();
        org.jsoup.parser.Token.Doctype doctype7 = new org.jsoup.parser.Token.Doctype();
        boolean boolean8 = doctype7.forceQuirks;
        doctype7.forceQuirks = false;
        java.lang.String str11 = doctype7.getName();
        java.lang.StringBuilder stringBuilder12 = doctype7.name;
        java.lang.StringBuilder stringBuilder13 = documentType4.html(stringBuilder12);
        org.jsoup.parser.Token.Doctype doctype14 = new org.jsoup.parser.Token.Doctype();
        boolean boolean15 = doctype14.forceQuirks;
        doctype14.forceQuirks = false;
        java.lang.String str18 = doctype14.getName();
        java.lang.StringBuilder stringBuilder19 = doctype14.name;
        boolean boolean20 = doctype14.isForceQuirks();
        boolean boolean21 = documentType4.equals((java.lang.Object) doctype14);
        documentType4.setBaseUri("a");
        org.jsoup.nodes.Document document24 = documentType4.ownerDocument();
        org.jsoup.nodes.Node node25 = documentType4.parent();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.jsoup.nodes.Node> nodeList26 = node25.siblingNodes();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str6, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(stringBuilder12);
        org.junit.Assert.assertEquals(stringBuilder12.toString(), "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNotNull(stringBuilder13);
        org.junit.Assert.assertEquals(stringBuilder13.toString(), "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(stringBuilder19);
        org.junit.Assert.assertEquals(stringBuilder19.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(document24);
        org.junit.Assert.assertNull(node25);
    }

    @Test
    public void test4109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4109");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "<!---->");
        int int5 = documentType4.childNodeSize();
        org.jsoup.nodes.Attributes attributes6 = documentType4.attributes();
        org.jsoup.nodes.Node node7 = documentType4.clone();
        org.jsoup.nodes.Node node8 = node7.clone();
        org.jsoup.nodes.Node node11 = node8.attr("4", "<!doctype hi! public \"hi!\">");
        java.lang.String str12 = node11.outerHtml();
        int int13 = node11.childNodeSize();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str12, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test4110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4110");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        org.jsoup.parser.Token.TokenType tokenType1 = endTag0.type;
        endTag0.appendAttributeName("hi!");
        endTag0.newAttribute();
        endTag0.appendAttributeName(' ');
        org.junit.Assert.assertTrue("'" + tokenType1 + "' != '" + org.jsoup.parser.Token.TokenType.EndTag + "'", tokenType1.equals(org.jsoup.parser.Token.TokenType.EndTag));
    }

    @Test
    public void test4111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4111");
        org.jsoup.parser.Token.Character character0 = new org.jsoup.parser.Token.Character();
        org.jsoup.parser.Token.Character character2 = character0.data("hi!");
        java.lang.String str3 = character2.toString();
        java.lang.String str4 = character2.getData();
        org.jsoup.parser.Token.Character character6 = character2.data("");
        java.lang.String str7 = character6.getData();
        org.jsoup.parser.Token token8 = character6.reset();
        java.lang.String str9 = character6.toString();
        org.jsoup.parser.Token.Character character11 = character6.data("");
        org.junit.Assert.assertNotNull(character2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(character6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(token8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(character11);
    }

    @Test
    public void test4112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4112");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.parser.Token.StartTag startTag3 = startTag0.nameAttr("PUBLIC", attributes2);
        startTag0.appendAttributeValue(' ');
        org.jsoup.parser.Token.Tag tag6 = startTag0.reset();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Doctype doctype7 = startTag0.asDoctype();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$Doctype (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$Doctype are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertNotNull(tag6);
    }

    @Test
    public void test4113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4113");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.finaliseTag();
        org.jsoup.parser.Token.EndTag endTag2 = endTag0.asEndTag();
        org.jsoup.parser.Token.Tag tag3 = endTag0.reset();
        tag3.finaliseTag();
        org.jsoup.parser.Token.EndTag endTag5 = new org.jsoup.parser.Token.EndTag();
        org.jsoup.parser.Token.TokenType tokenType6 = endTag5.type;
        org.jsoup.parser.Token.EndTag endTag7 = endTag5.asEndTag();
        org.jsoup.nodes.DocumentType documentType12 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "<!---->");
        java.lang.String str13 = documentType12.outerHtml();
        org.jsoup.nodes.Attributes attributes14 = documentType12.attributes();
        endTag7.attributes = attributes14;
        tag3.attributes = attributes14;
        org.jsoup.nodes.Attributes attributes17 = tag3.attributes;
        tag3.appendAttributeName('#');
        tag3.appendAttributeValue('a');
        tag3.normalName = "Comment ";
        org.jsoup.parser.Token token24 = tag3.reset();
        org.junit.Assert.assertNotNull(endTag2);
        org.junit.Assert.assertNotNull(tag3);
        org.junit.Assert.assertTrue("'" + tokenType6 + "' != '" + org.jsoup.parser.Token.TokenType.EndTag + "'", tokenType6.equals(org.jsoup.parser.Token.TokenType.EndTag));
        org.junit.Assert.assertNotNull(endTag7);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str13, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNotNull(attributes14);
        org.junit.Assert.assertNotNull(attributes17);
        org.junit.Assert.assertNotNull(token24);
    }

    @Test
    public void test4114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4114");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings2 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList5 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder6 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings7 = xmlTreeBuilder6.defaultSettings();
        xmlTreeBuilder0.initialiseParse("", "SYSTEM", parseErrorList5, parseSettings7);
        org.jsoup.parser.Token.Comment comment9 = new org.jsoup.parser.Token.Comment();
        org.jsoup.parser.Token.Comment comment10 = comment9.asComment();
        xmlTreeBuilder0.insert(comment9);
        org.jsoup.parser.ParseSettings parseSettings12 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.Document document15 = xmlTreeBuilder0.parse("EndTag", "</SYSTEM>");
        org.jsoup.nodes.Document document18 = xmlTreeBuilder0.parse("Character", "StartTag");
        org.jsoup.parser.ParseSettings parseSettings19 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.Token.Comment comment20 = new org.jsoup.parser.Token.Comment();
        org.jsoup.parser.Token token21 = comment20.reset();
        java.lang.String str22 = comment20.getData();
        boolean boolean23 = comment20.isEOF();
        org.jsoup.parser.Token.Comment comment24 = comment20.asComment();
        org.jsoup.parser.Token token25 = comment20.reset();
        java.lang.String str26 = comment20.getData();
        org.jsoup.parser.Token token27 = comment20.reset();
        boolean boolean28 = xmlTreeBuilder0.process((org.jsoup.parser.Token) comment20);
        org.jsoup.parser.Token.Character character29 = new org.jsoup.parser.Token.Character();
        org.jsoup.parser.Token.Character character31 = character29.data("hi!");
        org.jsoup.parser.Token.Character character33 = character29.data("");
        xmlTreeBuilder0.insert(character33);
        org.junit.Assert.assertNotNull(parseSettings1);
        org.junit.Assert.assertNotNull(parseSettings2);
        org.junit.Assert.assertNotNull(parseSettings7);
        org.junit.Assert.assertNotNull(comment10);
        org.junit.Assert.assertNotNull(parseSettings12);
        org.junit.Assert.assertNotNull(document15);
        org.junit.Assert.assertNotNull(document18);
        org.junit.Assert.assertNotNull(parseSettings19);
        org.junit.Assert.assertNotNull(token21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(comment24);
        org.junit.Assert.assertNotNull(token25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(token27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(character31);
        org.junit.Assert.assertNotNull(character33);
    }

    @Test
    public void test4115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4115");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "<!---->");
        org.jsoup.nodes.Node node5 = documentType4.parent();
        org.jsoup.parser.Token.Doctype doctype6 = new org.jsoup.parser.Token.Doctype();
        boolean boolean7 = doctype6.forceQuirks;
        java.lang.String str8 = doctype6.tokenType();
        java.lang.StringBuilder stringBuilder9 = doctype6.systemIdentifier;
        boolean boolean10 = documentType4.equals((java.lang.Object) stringBuilder9);
        int int11 = documentType4.siblingIndex();
        org.jsoup.nodes.Node node13 = documentType4.removeAttr("SYSTEM");
        org.jsoup.nodes.Node node15 = node13.removeAttr("a");
        java.lang.Object obj16 = null;
        boolean boolean17 = node15.equals(obj16);
        org.jsoup.nodes.Attributes attributes18 = node15.attributes();
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Doctype" + "'", str8, "Doctype");
        org.junit.Assert.assertNotNull(stringBuilder9);
        org.junit.Assert.assertEquals(stringBuilder9.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(attributes18);
    }

    @Test
    public void test4116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4116");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList4 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder5 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings6 = xmlTreeBuilder5.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings7 = xmlTreeBuilder5.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList10 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder11 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings12 = xmlTreeBuilder11.defaultSettings();
        xmlTreeBuilder5.initialiseParse("", "SYSTEM", parseErrorList10, parseSettings12);
        xmlTreeBuilder0.initialiseParse("Comment", "Doctype", parseErrorList4, parseSettings12);
        org.jsoup.nodes.DocumentType documentType20 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "<!---->");
        java.lang.String str21 = documentType20.outerHtml();
        org.jsoup.nodes.Attributes attributes22 = documentType20.attributes();
        org.jsoup.nodes.Attributes attributes23 = documentType20.attributes();
        boolean boolean24 = xmlTreeBuilder0.processStartTag("EndTag", attributes23);
        org.jsoup.parser.ParseErrorList parseErrorList27 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder28 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings29 = xmlTreeBuilder28.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList30 = xmlTreeBuilder0.parseFragment("</SYSTEM>", "<PUBLIC>", parseErrorList27, parseSettings29);
        org.jsoup.parser.ParseErrorList parseErrorList33 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder34 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings35 = xmlTreeBuilder34.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList38 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder39 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings40 = xmlTreeBuilder39.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings41 = xmlTreeBuilder39.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList44 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder45 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings46 = xmlTreeBuilder45.defaultSettings();
        xmlTreeBuilder39.initialiseParse("", "SYSTEM", parseErrorList44, parseSettings46);
        xmlTreeBuilder34.initialiseParse("Comment", "Doctype", parseErrorList38, parseSettings46);
        org.jsoup.nodes.DocumentType documentType54 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "<!---->");
        java.lang.String str55 = documentType54.outerHtml();
        org.jsoup.nodes.Attributes attributes56 = documentType54.attributes();
        org.jsoup.nodes.Attributes attributes57 = documentType54.attributes();
        boolean boolean58 = xmlTreeBuilder34.processStartTag("EndTag", attributes57);
        org.jsoup.parser.ParseErrorList parseErrorList61 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder62 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings63 = xmlTreeBuilder62.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings64 = xmlTreeBuilder62.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList65 = xmlTreeBuilder34.parseFragment("Comment", "#doctype", parseErrorList61, parseSettings64);
        java.util.List<org.jsoup.nodes.Node> nodeList66 = xmlTreeBuilder0.parseFragment("<a>", "<<!DOCTYPE hi! PUBLIC \"hi!\">  name=\"hi!\" publicId=\"hi!\" systemId=\"\">", parseErrorList33, parseSettings64);
        org.jsoup.parser.Token.Doctype doctype67 = new org.jsoup.parser.Token.Doctype();
        boolean boolean68 = doctype67.forceQuirks;
        org.jsoup.parser.Token.TokenType tokenType69 = org.jsoup.parser.Token.TokenType.EOF;
        doctype67.type = tokenType69;
        org.jsoup.parser.Token token71 = doctype67.reset();
        boolean boolean72 = doctype67.isEndTag();
        doctype67.forceQuirks = true;
        java.lang.StringBuilder stringBuilder75 = doctype67.name;
        boolean boolean76 = doctype67.isStartTag();
        boolean boolean77 = xmlTreeBuilder0.process((org.jsoup.parser.Token) doctype67);
        org.junit.Assert.assertNotNull(parseSettings1);
        org.junit.Assert.assertNotNull(parseSettings6);
        org.junit.Assert.assertNotNull(parseSettings7);
        org.junit.Assert.assertNotNull(parseSettings12);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str21, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNotNull(attributes22);
        org.junit.Assert.assertNotNull(attributes23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(parseSettings29);
        org.junit.Assert.assertNotNull(nodeList30);
        org.junit.Assert.assertNotNull(parseSettings35);
        org.junit.Assert.assertNotNull(parseSettings40);
        org.junit.Assert.assertNotNull(parseSettings41);
        org.junit.Assert.assertNotNull(parseSettings46);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str55, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNotNull(attributes56);
        org.junit.Assert.assertNotNull(attributes57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertNotNull(parseSettings63);
        org.junit.Assert.assertNotNull(parseSettings64);
        org.junit.Assert.assertNotNull(nodeList65);
        org.junit.Assert.assertNotNull(nodeList66);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + tokenType69 + "' != '" + org.jsoup.parser.Token.TokenType.EOF + "'", tokenType69.equals(org.jsoup.parser.Token.TokenType.EOF));
        org.junit.Assert.assertNotNull(token71);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertNotNull(stringBuilder75);
        org.junit.Assert.assertEquals(stringBuilder75.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
    }

    @Test
    public void test4117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4117");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        org.jsoup.parser.ParseSettings parseSettings4 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList5 = xmlTreeBuilder0.parseFragment("", "", parseErrorList3, parseSettings4);
        org.jsoup.parser.ParseErrorList parseErrorList8 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder9 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings10 = xmlTreeBuilder9.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings11 = xmlTreeBuilder9.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList14 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder15 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings16 = xmlTreeBuilder15.defaultSettings();
        xmlTreeBuilder9.initialiseParse("", "SYSTEM", parseErrorList14, parseSettings16);
        xmlTreeBuilder0.initialiseParse("Doctype", "PUBLIC", parseErrorList8, parseSettings16);
        org.jsoup.parser.ParseErrorList parseErrorList21 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder22 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList25 = null;
        org.jsoup.parser.ParseSettings parseSettings26 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList27 = xmlTreeBuilder22.parseFragment("", "", parseErrorList25, parseSettings26);
        org.jsoup.parser.ParseErrorList parseErrorList30 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder31 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings32 = xmlTreeBuilder31.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings33 = xmlTreeBuilder31.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList36 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder37 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings38 = xmlTreeBuilder37.defaultSettings();
        xmlTreeBuilder31.initialiseParse("", "SYSTEM", parseErrorList36, parseSettings38);
        xmlTreeBuilder22.initialiseParse("Doctype", "PUBLIC", parseErrorList30, parseSettings38);
        xmlTreeBuilder0.initialiseParse("EndTag", "<!---->", parseErrorList21, parseSettings38);
        org.jsoup.parser.Token.Doctype doctype42 = new org.jsoup.parser.Token.Doctype();
        xmlTreeBuilder0.insert(doctype42);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder44 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList47 = null;
        org.jsoup.parser.ParseSettings parseSettings48 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList49 = xmlTreeBuilder44.parseFragment("", "", parseErrorList47, parseSettings48);
        org.jsoup.parser.ParseErrorList parseErrorList52 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder53 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings54 = xmlTreeBuilder53.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings55 = xmlTreeBuilder53.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList58 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder59 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings60 = xmlTreeBuilder59.defaultSettings();
        xmlTreeBuilder53.initialiseParse("", "SYSTEM", parseErrorList58, parseSettings60);
        xmlTreeBuilder44.initialiseParse("Doctype", "PUBLIC", parseErrorList52, parseSettings60);
        org.jsoup.parser.ParseErrorList parseErrorList65 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder66 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList69 = null;
        org.jsoup.parser.ParseSettings parseSettings70 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList71 = xmlTreeBuilder66.parseFragment("", "", parseErrorList69, parseSettings70);
        org.jsoup.parser.ParseErrorList parseErrorList74 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder75 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings76 = xmlTreeBuilder75.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings77 = xmlTreeBuilder75.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList80 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder81 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings82 = xmlTreeBuilder81.defaultSettings();
        xmlTreeBuilder75.initialiseParse("", "SYSTEM", parseErrorList80, parseSettings82);
        xmlTreeBuilder66.initialiseParse("Doctype", "PUBLIC", parseErrorList74, parseSettings82);
        xmlTreeBuilder44.initialiseParse("EndTag", "<!---->", parseErrorList65, parseSettings82);
        org.jsoup.parser.Token.Doctype doctype86 = new org.jsoup.parser.Token.Doctype();
        xmlTreeBuilder44.insert(doctype86);
        xmlTreeBuilder0.insert(doctype86);
        doctype86.forceQuirks = false;
        boolean boolean91 = doctype86.isCharacter();
        java.lang.StringBuilder stringBuilder92 = doctype86.publicIdentifier;
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertNotNull(parseSettings10);
        org.junit.Assert.assertNotNull(parseSettings11);
        org.junit.Assert.assertNotNull(parseSettings16);
        org.junit.Assert.assertNotNull(nodeList27);
        org.junit.Assert.assertNotNull(parseSettings32);
        org.junit.Assert.assertNotNull(parseSettings33);
        org.junit.Assert.assertNotNull(parseSettings38);
        org.junit.Assert.assertNotNull(nodeList49);
        org.junit.Assert.assertNotNull(parseSettings54);
        org.junit.Assert.assertNotNull(parseSettings55);
        org.junit.Assert.assertNotNull(parseSettings60);
        org.junit.Assert.assertNotNull(nodeList71);
        org.junit.Assert.assertNotNull(parseSettings76);
        org.junit.Assert.assertNotNull(parseSettings77);
        org.junit.Assert.assertNotNull(parseSettings82);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
        org.junit.Assert.assertNotNull(stringBuilder92);
        org.junit.Assert.assertEquals(stringBuilder92.toString(), "");
    }

    @Test
    public void test4118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4118");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings2 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList5 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder6 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings7 = xmlTreeBuilder6.defaultSettings();
        xmlTreeBuilder0.initialiseParse("", "SYSTEM", parseErrorList5, parseSettings7);
        org.jsoup.parser.Token.Character character9 = new org.jsoup.parser.Token.Character();
        org.jsoup.parser.Token.Character character11 = character9.data("hi!");
        java.lang.String str12 = character9.getData();
        xmlTreeBuilder0.insert(character9);
        org.jsoup.parser.Token.Comment comment14 = new org.jsoup.parser.Token.Comment();
        org.jsoup.parser.Token.Comment comment15 = comment14.asComment();
        java.lang.String str16 = comment15.toString();
        java.lang.StringBuilder stringBuilder17 = comment15.data;
        comment15.bogus = false;
        java.lang.StringBuilder stringBuilder20 = comment15.data;
        org.jsoup.parser.Token token21 = comment15.reset();
        java.lang.String str22 = comment15.getData();
        org.jsoup.parser.Token token23 = comment15.reset();
        boolean boolean24 = comment15.isCharacter();
        xmlTreeBuilder0.insert(comment15);
        org.jsoup.nodes.Document document28 = xmlTreeBuilder0.parse("<endtag  name=\"hi!\" publicid=\"hi!\" systemid=\"\">", "a");
        org.junit.Assert.assertNotNull(parseSettings1);
        org.junit.Assert.assertNotNull(parseSettings2);
        org.junit.Assert.assertNotNull(parseSettings7);
        org.junit.Assert.assertNotNull(character11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(comment15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "<!---->" + "'", str16, "<!---->");
        org.junit.Assert.assertNotNull(stringBuilder17);
        org.junit.Assert.assertEquals(stringBuilder17.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder20);
        org.junit.Assert.assertEquals(stringBuilder20.toString(), "");
        org.junit.Assert.assertNotNull(token21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(token23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(document28);
    }

    @Test
    public void test4119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4119");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        boolean boolean1 = doctype0.forceQuirks;
        java.lang.StringBuilder stringBuilder2 = doctype0.systemIdentifier;
        boolean boolean3 = doctype0.forceQuirks;
        java.lang.StringBuilder stringBuilder4 = doctype0.publicIdentifier;
        java.lang.StringBuilder stringBuilder5 = doctype0.systemIdentifier;
        java.lang.String str6 = doctype0.getPublicIdentifier();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test4120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4120");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes1 = null;
        startTag0.attributes = attributes1;
        org.jsoup.parser.Token.Tag tag3 = startTag0.reset();
        org.jsoup.nodes.Attributes attributes5 = null;
        org.jsoup.parser.Token.StartTag startTag6 = startTag0.nameAttr("SYSTEM", attributes5);
        org.jsoup.parser.Token.Tag tag8 = startTag0.name("");
        org.jsoup.parser.Token.StartTag startTag9 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag10 = startTag9.reset();
        boolean boolean11 = startTag9.isSelfClosing();
        org.jsoup.parser.Token.Tag tag13 = startTag9.name("a");
        org.jsoup.parser.Token.EndTag endTag14 = new org.jsoup.parser.Token.EndTag();
        endTag14.finaliseTag();
        org.jsoup.parser.Token.EndTag endTag16 = endTag14.asEndTag();
        char[] charArray20 = new char[] { 'a', '#', ' ' };
        endTag14.appendAttributeValue(charArray20);
        startTag9.appendAttributeValue(charArray20);
        startTag0.appendAttributeValue(charArray20);
        org.jsoup.parser.Token.Tag tag24 = startTag0.reset();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str25 = tag24.name();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must be false");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tag3);
        org.junit.Assert.assertNotNull(startTag6);
        org.junit.Assert.assertNotNull(tag8);
        org.junit.Assert.assertNotNull(tag10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(tag13);
        org.junit.Assert.assertNotNull(endTag16);
        org.junit.Assert.assertNotNull(charArray20);
        org.junit.Assert.assertArrayEquals(charArray20, new char[] { 'a', '#', ' ' });
        org.junit.Assert.assertNotNull(tag24);
    }

    @Test
    public void test4121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4121");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "<!---->");
        org.jsoup.nodes.Node node5 = documentType4.parent();
        org.jsoup.nodes.Node node6 = documentType4.nextSibling();
        java.lang.String str7 = documentType4.nodeName();
        org.jsoup.nodes.Document document8 = documentType4.ownerDocument();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = documentType4.childNodesCopy();
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#doctype" + "'", str7, "#doctype");
        org.junit.Assert.assertNull(document8);
        org.junit.Assert.assertNotNull(nodeList9);
    }

    @Test
    public void test4122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4122");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        org.jsoup.parser.Token.Comment comment1 = comment0.asComment();
        java.lang.String str2 = comment0.getData();
        java.lang.StringBuilder stringBuilder3 = comment0.data;
        java.lang.StringBuilder stringBuilder4 = comment0.data;
        boolean boolean5 = comment0.bogus;
        org.jsoup.parser.Token token6 = comment0.reset();
        boolean boolean7 = comment0.bogus;
        org.jsoup.parser.Token token8 = comment0.reset();
        org.junit.Assert.assertNotNull(comment1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(token6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(token8);
    }

    @Test
    public void test4123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4123");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        org.jsoup.parser.ParseSettings parseSettings4 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList5 = xmlTreeBuilder0.parseFragment("", "", parseErrorList3, parseSettings4);
        org.jsoup.parser.ParseErrorList parseErrorList8 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder9 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings10 = xmlTreeBuilder9.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings11 = xmlTreeBuilder9.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList14 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder15 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings16 = xmlTreeBuilder15.defaultSettings();
        xmlTreeBuilder9.initialiseParse("", "SYSTEM", parseErrorList14, parseSettings16);
        xmlTreeBuilder0.initialiseParse("Doctype", "PUBLIC", parseErrorList8, parseSettings16);
        org.jsoup.parser.ParseErrorList parseErrorList21 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder22 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList25 = null;
        org.jsoup.parser.ParseSettings parseSettings26 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList27 = xmlTreeBuilder22.parseFragment("", "", parseErrorList25, parseSettings26);
        org.jsoup.parser.ParseErrorList parseErrorList30 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder31 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings32 = xmlTreeBuilder31.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings33 = xmlTreeBuilder31.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList36 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder37 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings38 = xmlTreeBuilder37.defaultSettings();
        xmlTreeBuilder31.initialiseParse("", "SYSTEM", parseErrorList36, parseSettings38);
        xmlTreeBuilder22.initialiseParse("Doctype", "PUBLIC", parseErrorList30, parseSettings38);
        xmlTreeBuilder0.initialiseParse("EndTag", "<!---->", parseErrorList21, parseSettings38);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder42 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings43 = xmlTreeBuilder42.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings44 = xmlTreeBuilder42.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList47 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder48 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings49 = xmlTreeBuilder48.defaultSettings();
        xmlTreeBuilder42.initialiseParse("", "SYSTEM", parseErrorList47, parseSettings49);
        org.jsoup.parser.Token.Comment comment51 = new org.jsoup.parser.Token.Comment();
        org.jsoup.parser.Token.Comment comment52 = comment51.asComment();
        xmlTreeBuilder42.insert(comment51);
        boolean boolean54 = comment51.bogus;
        xmlTreeBuilder0.insert(comment51);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder56 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings57 = xmlTreeBuilder56.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings58 = xmlTreeBuilder56.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList61 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder62 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings63 = xmlTreeBuilder62.defaultSettings();
        xmlTreeBuilder56.initialiseParse("", "SYSTEM", parseErrorList61, parseSettings63);
        org.jsoup.parser.Token.Comment comment65 = new org.jsoup.parser.Token.Comment();
        org.jsoup.parser.Token.Comment comment66 = comment65.asComment();
        xmlTreeBuilder56.insert(comment65);
        boolean boolean68 = comment65.bogus;
        java.lang.StringBuilder stringBuilder69 = comment65.data;
        boolean boolean70 = comment65.bogus;
        boolean boolean71 = comment65.bogus;
        java.lang.StringBuilder stringBuilder72 = comment65.data;
        xmlTreeBuilder0.insert(comment65);
        java.lang.StringBuilder stringBuilder74 = comment65.data;
        java.lang.String str75 = comment65.toString();
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertNotNull(parseSettings10);
        org.junit.Assert.assertNotNull(parseSettings11);
        org.junit.Assert.assertNotNull(parseSettings16);
        org.junit.Assert.assertNotNull(nodeList27);
        org.junit.Assert.assertNotNull(parseSettings32);
        org.junit.Assert.assertNotNull(parseSettings33);
        org.junit.Assert.assertNotNull(parseSettings38);
        org.junit.Assert.assertNotNull(parseSettings43);
        org.junit.Assert.assertNotNull(parseSettings44);
        org.junit.Assert.assertNotNull(parseSettings49);
        org.junit.Assert.assertNotNull(comment52);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(parseSettings57);
        org.junit.Assert.assertNotNull(parseSettings58);
        org.junit.Assert.assertNotNull(parseSettings63);
        org.junit.Assert.assertNotNull(comment66);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNotNull(stringBuilder69);
        org.junit.Assert.assertEquals(stringBuilder69.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertNotNull(stringBuilder72);
        org.junit.Assert.assertEquals(stringBuilder72.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder74);
        org.junit.Assert.assertEquals(stringBuilder74.toString(), "");
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "<!---->" + "'", str75, "<!---->");
    }

    @Test
    public void test4124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4124");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.finaliseTag();
        org.jsoup.parser.Token.EndTag endTag2 = endTag0.asEndTag();
        org.jsoup.parser.Token.Tag tag3 = endTag0.reset();
        org.jsoup.nodes.Attributes attributes4 = tag3.getAttributes();
        org.jsoup.nodes.Attributes attributes5 = tag3.attributes;
        org.jsoup.nodes.Attributes attributes6 = tag3.getAttributes();
        org.junit.Assert.assertNotNull(endTag2);
        org.junit.Assert.assertNotNull(tag3);
        org.junit.Assert.assertNull(attributes4);
        org.junit.Assert.assertNull(attributes5);
        org.junit.Assert.assertNull(attributes6);
    }

    @Test
    public void test4125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4125");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings2 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList5 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder6 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings7 = xmlTreeBuilder6.defaultSettings();
        xmlTreeBuilder0.initialiseParse("", "SYSTEM", parseErrorList5, parseSettings7);
        org.jsoup.parser.Token.Comment comment9 = new org.jsoup.parser.Token.Comment();
        org.jsoup.parser.Token.Comment comment10 = comment9.asComment();
        xmlTreeBuilder0.insert(comment9);
        org.jsoup.parser.Token token12 = comment9.reset();
        boolean boolean13 = comment9.isCharacter();
        java.lang.String str14 = comment9.getData();
        java.lang.String str15 = comment9.getData();
        org.junit.Assert.assertNotNull(parseSettings1);
        org.junit.Assert.assertNotNull(parseSettings2);
        org.junit.Assert.assertNotNull(parseSettings7);
        org.junit.Assert.assertNotNull(comment10);
        org.junit.Assert.assertNotNull(token12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test4126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4126");
        org.jsoup.parser.Token.Character character0 = new org.jsoup.parser.Token.Character();
        org.jsoup.parser.Token.Character character2 = character0.data("hi!");
        org.jsoup.parser.Token.Character character4 = character0.data("");
        org.jsoup.parser.Token.Character character6 = character4.data("");
        java.lang.String str7 = character4.getData();
        java.lang.String str8 = character4.getData();
        boolean boolean9 = character4.isDoctype();
        org.junit.Assert.assertNotNull(character2);
        org.junit.Assert.assertNotNull(character4);
        org.junit.Assert.assertNotNull(character6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test4127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4127");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        org.jsoup.parser.Token.StartTag startTag1 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag2 = startTag1.reset();
        boolean boolean3 = startTag1.isSelfClosing();
        org.jsoup.parser.Token.Tag tag5 = startTag1.name("a");
        org.jsoup.parser.Token.EndTag endTag6 = new org.jsoup.parser.Token.EndTag();
        endTag6.finaliseTag();
        org.jsoup.parser.Token.EndTag endTag8 = endTag6.asEndTag();
        char[] charArray12 = new char[] { 'a', '#', ' ' };
        endTag6.appendAttributeValue(charArray12);
        startTag1.appendAttributeValue(charArray12);
        startTag1.newAttribute();
        startTag1.setEmptyAttributeValue();
        java.lang.String str17 = startTag1.tagName;
        org.jsoup.parser.Token.EndTag endTag18 = new org.jsoup.parser.Token.EndTag();
        endTag18.finaliseTag();
        org.jsoup.parser.Token.EndTag endTag20 = endTag18.asEndTag();
        org.jsoup.parser.Token.Tag tag21 = endTag18.reset();
        tag21.finaliseTag();
        tag21.appendTagName('a');
        java.lang.String str25 = tag21.name();
        org.jsoup.parser.Token.EndTag endTag26 = new org.jsoup.parser.Token.EndTag();
        org.jsoup.parser.Token.TokenType tokenType27 = endTag26.type;
        org.jsoup.parser.Token.StartTag startTag28 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag29 = startTag28.reset();
        boolean boolean30 = startTag28.isSelfClosing();
        org.jsoup.parser.Token.Tag tag32 = startTag28.name("a");
        org.jsoup.parser.Token.EndTag endTag33 = new org.jsoup.parser.Token.EndTag();
        endTag33.finaliseTag();
        org.jsoup.parser.Token.EndTag endTag35 = endTag33.asEndTag();
        char[] charArray39 = new char[] { 'a', '#', ' ' };
        endTag33.appendAttributeValue(charArray39);
        startTag28.appendAttributeValue(charArray39);
        endTag26.appendAttributeValue(charArray39);
        tag21.appendAttributeValue(charArray39);
        org.jsoup.parser.Token.EndTag endTag44 = new org.jsoup.parser.Token.EndTag();
        endTag44.appendAttributeValue("EndTag");
        boolean boolean47 = endTag44.isEOF();
        int[] intArray54 = new int[] { 1, (short) 1, 1, (byte) 0, 1, 10 };
        endTag44.appendAttributeValue(intArray54);
        tag21.appendAttributeValue(intArray54);
        startTag1.appendAttributeValue(intArray54);
        endTag0.appendAttributeValue(intArray54);
        boolean boolean59 = endTag0.isDoctype();
        boolean boolean60 = endTag0.isDoctype();
        org.junit.Assert.assertNotNull(tag2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(tag5);
        org.junit.Assert.assertNotNull(endTag8);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertArrayEquals(charArray12, new char[] { 'a', '#', ' ' });
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "a" + "'", str17, "a");
        org.junit.Assert.assertNotNull(endTag20);
        org.junit.Assert.assertNotNull(tag21);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "a" + "'", str25, "a");
        org.junit.Assert.assertTrue("'" + tokenType27 + "' != '" + org.jsoup.parser.Token.TokenType.EndTag + "'", tokenType27.equals(org.jsoup.parser.Token.TokenType.EndTag));
        org.junit.Assert.assertNotNull(tag29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(tag32);
        org.junit.Assert.assertNotNull(endTag35);
        org.junit.Assert.assertNotNull(charArray39);
        org.junit.Assert.assertArrayEquals(charArray39, new char[] { 'a', '#', ' ' });
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(intArray54);
        org.junit.Assert.assertArrayEquals(intArray54, new int[] { 1, 1, 1, 0, 1, 10 });
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
    }

    @Test
    public void test4128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4128");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<<!---->>", "</<!DOCTYPE a PUBLIC \"#doctype\" \"Comment\">>", "#endtag", "</SYSTEM>");
        org.jsoup.nodes.Document document5 = documentType4.ownerDocument();
        org.junit.Assert.assertNull(document5);
    }

    @Test
    public void test4129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4129");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "<!---->");
        int int5 = documentType4.childNodeSize();
        org.jsoup.parser.Token.StartTag startTag6 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes8 = null;
        org.jsoup.parser.Token.StartTag startTag9 = startTag6.nameAttr("PUBLIC", attributes8);
        boolean boolean10 = documentType4.hasSameValue((java.lang.Object) startTag6);
        org.jsoup.nodes.Node node11 = documentType4.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList12 = documentType4.childNodesCopy();
        org.jsoup.parser.Token.EndTag endTag13 = new org.jsoup.parser.Token.EndTag();
        endTag13.finaliseTag();
        org.jsoup.parser.Token.EndTag endTag15 = endTag13.asEndTag();
        org.jsoup.parser.Token.Tag tag16 = endTag13.reset();
        org.jsoup.nodes.Attributes attributes17 = tag16.getAttributes();
        tag16.newAttribute();
        boolean boolean19 = documentType4.hasSameValue((java.lang.Object) tag16);
        boolean boolean20 = tag16.isSelfClosing();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(startTag9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(nodeList12);
        org.junit.Assert.assertNotNull(endTag15);
        org.junit.Assert.assertNotNull(tag16);
        org.junit.Assert.assertNull(attributes17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test4130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4130");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.parser.Token.StartTag startTag3 = startTag0.nameAttr("PUBLIC", attributes2);
        org.jsoup.nodes.DocumentType documentType9 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "<!---->");
        java.lang.String str10 = documentType9.outerHtml();
        org.jsoup.nodes.Attributes attributes11 = documentType9.attributes();
        org.jsoup.parser.Token.StartTag startTag12 = startTag0.nameAttr("Comment", attributes11);
        startTag12.finaliseTag();
        startTag12.appendTagName(' ');
        boolean boolean16 = startTag12.isSelfClosing();
        java.lang.String str17 = startTag12.normalName();
        boolean boolean18 = startTag12.selfClosing;
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str10, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNotNull(attributes11);
        org.junit.Assert.assertNotNull(startTag12);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "comment " + "'", str17, "comment ");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test4131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4131");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE hi! PUBLIC \"hi!\">", "PUBLIC", "#doctype", "");
        org.jsoup.nodes.Node node6 = documentType4.removeAttr("SYSTEM");
        org.jsoup.nodes.DocumentType documentType11 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "<!---->");
        org.jsoup.nodes.Node node12 = documentType11.parent();
        org.jsoup.parser.Token.Doctype doctype13 = new org.jsoup.parser.Token.Doctype();
        boolean boolean14 = doctype13.forceQuirks;
        java.lang.String str15 = doctype13.tokenType();
        java.lang.StringBuilder stringBuilder16 = doctype13.systemIdentifier;
        boolean boolean17 = documentType11.equals((java.lang.Object) stringBuilder16);
        boolean boolean18 = node6.hasSameValue((java.lang.Object) documentType11);
        org.jsoup.nodes.Node node21 = documentType11.attr("a", "");
        org.jsoup.nodes.Document document22 = documentType11.ownerDocument();
        // The following exception was thrown during execution in test generation
        try {
            int int23 = document22.childNodeSize();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Doctype" + "'", str15, "Doctype");
        org.junit.Assert.assertNotNull(stringBuilder16);
        org.junit.Assert.assertEquals(stringBuilder16.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertNull(document22);
    }

    @Test
    public void test4132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4132");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag1 = startTag0.reset();
        java.lang.String str2 = tag1.normalName();
        java.lang.String str3 = tag1.normalName();
        boolean boolean4 = tag1.selfClosing;
        java.lang.String str5 = tag1.tokenType();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Comment comment6 = tag1.asComment();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$Comment (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$Comment are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "StartTag" + "'", str5, "StartTag");
    }

    @Test
    public void test4133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4133");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE hi! PUBLIC \"hi!\">", "PUBLIC", "#doctype", "");
        org.jsoup.nodes.Node node5 = documentType4.parent();
        org.jsoup.nodes.Node node8 = documentType4.attr("EndTag", "<Comment>");
        org.jsoup.nodes.Node node9 = node8.clone();
        org.jsoup.parser.Token.Doctype doctype10 = new org.jsoup.parser.Token.Doctype();
        boolean boolean11 = doctype10.forceQuirks;
        doctype10.forceQuirks = false;
        boolean boolean14 = doctype10.isForceQuirks();
        java.lang.StringBuilder stringBuilder15 = doctype10.systemIdentifier;
        java.lang.String str16 = doctype10.getName();
        java.lang.String str17 = doctype10.getSystemIdentifier();
        java.lang.StringBuilder stringBuilder18 = doctype10.publicIdentifier;
        org.jsoup.parser.Token.reset(stringBuilder18);
        java.lang.StringBuilder stringBuilder20 = node8.html(stringBuilder18);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(stringBuilder15);
        org.junit.Assert.assertEquals(stringBuilder15.toString(), "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(stringBuilder18);
        org.junit.Assert.assertEquals(stringBuilder18.toString(), "<!DOCTYPE <!DOCTYPE hi! PUBLIC \"hi!\"> PUBLIC \"PUBLIC\" \"#doctype\">");
        org.junit.Assert.assertNotNull(stringBuilder20);
        org.junit.Assert.assertEquals(stringBuilder20.toString(), "<!DOCTYPE <!DOCTYPE hi! PUBLIC \"hi!\"> PUBLIC \"PUBLIC\" \"#doctype\">");
    }

    @Test
    public void test4134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4134");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("comment", "EndTag", "#doctype", "SYSTEM");
        org.jsoup.nodes.Node node5 = documentType4.nextSibling();
        org.jsoup.nodes.Node node7 = documentType4.removeAttr("4<PUBLIC>");
        java.util.List<org.jsoup.nodes.Node> nodeList8 = documentType4.childNodesCopy();
        org.jsoup.nodes.Node node9 = documentType4.clone();
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(nodeList8);
        org.junit.Assert.assertNotNull(node9);
    }

    @Test
    public void test4135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4135");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "<!---->");
        java.lang.String str5 = documentType4.outerHtml();
        java.lang.String str6 = documentType4.toString();
        documentType4.setBaseUri("<<!DOCTYPE hi! PUBLIC \"hi!\">  name=\"hi!\" publicId=\"hi!\" systemId=\"\">");
        java.util.List<org.jsoup.nodes.Node> nodeList9 = documentType4.siblingNodes();
        org.jsoup.parser.Token.Doctype doctype10 = new org.jsoup.parser.Token.Doctype();
        boolean boolean11 = doctype10.forceQuirks;
        doctype10.forceQuirks = false;
        boolean boolean14 = doctype10.isForceQuirks();
        java.lang.String str15 = doctype10.getSystemIdentifier();
        java.lang.String str16 = doctype10.getName();
        doctype10.forceQuirks = false;
        java.lang.StringBuilder stringBuilder19 = doctype10.name;
        java.lang.Appendable appendable20 = documentType4.html((java.lang.Appendable) stringBuilder19);
        java.lang.String str21 = documentType4.toString();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str5, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str6, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(stringBuilder19);
        org.junit.Assert.assertEquals(stringBuilder19.toString(), "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNotNull(appendable20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str21, "<!DOCTYPE hi! PUBLIC \"hi!\">");
    }

    @Test
    public void test4136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4136");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("Character", "<!DOCTYPE hi! PUBLIC \"hi!\">", "StartTag", "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.jsoup.nodes.Node node7 = documentType4.attr("PUBLIC", "<PUBLIC>");
        org.jsoup.parser.Token.Doctype doctype8 = new org.jsoup.parser.Token.Doctype();
        boolean boolean9 = doctype8.forceQuirks;
        java.lang.StringBuilder stringBuilder10 = doctype8.systemIdentifier;
        boolean boolean11 = doctype8.forceQuirks;
        boolean boolean12 = doctype8.forceQuirks;
        boolean boolean13 = node7.equals((java.lang.Object) boolean12);
        org.jsoup.nodes.Node node16 = node7.attr("4<PUBLIC>", "<hi!>");
        java.lang.String str17 = node7.outerHtml();
        java.util.List<org.jsoup.nodes.Node> nodeList18 = node7.siblingNodes();
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(stringBuilder10);
        org.junit.Assert.assertEquals(stringBuilder10.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "<!DOCTYPE Character PUBLIC \"<!DOCTYPE hi! PUBLIC \"hi!\">\" \"StartTag\">" + "'", str17, "<!DOCTYPE Character PUBLIC \"<!DOCTYPE hi! PUBLIC \"hi!\">\" \"StartTag\">");
        org.junit.Assert.assertNotNull(nodeList18);
    }

    @Test
    public void test4137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4137");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        org.jsoup.parser.Token.Comment comment1 = comment0.asComment();
        org.jsoup.parser.Token token2 = comment1.reset();
        org.jsoup.parser.Token token3 = comment1.reset();
        java.lang.String str4 = comment1.getData();
        java.lang.StringBuilder stringBuilder5 = comment1.data;
        java.lang.String str6 = comment1.getData();
        org.junit.Assert.assertNotNull(comment1);
        org.junit.Assert.assertNotNull(token2);
        org.junit.Assert.assertNotNull(token3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test4138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4138");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings2 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList5 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder6 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings7 = xmlTreeBuilder6.defaultSettings();
        xmlTreeBuilder0.initialiseParse("", "SYSTEM", parseErrorList5, parseSettings7);
        org.jsoup.parser.ParseSettings parseSettings9 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.Token.Character character10 = new org.jsoup.parser.Token.Character();
        org.jsoup.parser.Token.Character character12 = character10.data("hi!");
        java.lang.String str13 = character10.toString();
        org.jsoup.parser.Token.Character character15 = character10.data("");
        xmlTreeBuilder0.insert(character15);
        org.jsoup.parser.Token.Comment comment17 = new org.jsoup.parser.Token.Comment();
        org.jsoup.parser.Token.Comment comment18 = comment17.asComment();
        java.lang.String str19 = comment18.toString();
        java.lang.StringBuilder stringBuilder20 = comment18.data;
        xmlTreeBuilder0.insert(comment18);
        org.jsoup.parser.Token.Comment comment22 = new org.jsoup.parser.Token.Comment();
        org.jsoup.parser.Token token23 = comment22.reset();
        java.lang.String str24 = comment22.getData();
        boolean boolean25 = comment22.isEOF();
        org.jsoup.parser.Token.Comment comment26 = comment22.asComment();
        xmlTreeBuilder0.insert(comment26);
        org.jsoup.parser.Token.StartTag startTag28 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag29 = startTag28.reset();
        boolean boolean30 = startTag28.isSelfClosing();
        org.jsoup.parser.Token.Tag tag32 = startTag28.name("a");
        org.jsoup.parser.Token.EndTag endTag33 = new org.jsoup.parser.Token.EndTag();
        endTag33.finaliseTag();
        org.jsoup.parser.Token.EndTag endTag35 = endTag33.asEndTag();
        char[] charArray39 = new char[] { 'a', '#', ' ' };
        endTag33.appendAttributeValue(charArray39);
        startTag28.appendAttributeValue(charArray39);
        startTag28.newAttribute();
        startTag28.appendAttributeValue("Comment");
        org.jsoup.parser.Token.Tag tag46 = startTag28.name("4");
        org.jsoup.parser.Token.StartTag startTag48 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes50 = null;
        org.jsoup.parser.Token.StartTag startTag51 = startTag48.nameAttr("PUBLIC", attributes50);
        org.jsoup.nodes.DocumentType documentType57 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "<!---->");
        java.lang.String str58 = documentType57.outerHtml();
        org.jsoup.nodes.Attributes attributes59 = documentType57.attributes();
        org.jsoup.parser.Token.StartTag startTag60 = startTag48.nameAttr("Comment", attributes59);
        org.jsoup.parser.Token.StartTag startTag61 = startTag28.nameAttr("<Comment>", attributes59);
        org.jsoup.parser.Token.Tag tag62 = startTag61.reset();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean63 = xmlTreeBuilder0.process((org.jsoup.parser.Token) tag62);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must be false");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings1);
        org.junit.Assert.assertNotNull(parseSettings2);
        org.junit.Assert.assertNotNull(parseSettings7);
        org.junit.Assert.assertNotNull(parseSettings9);
        org.junit.Assert.assertNotNull(character12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(character15);
        org.junit.Assert.assertNotNull(comment18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "<!---->" + "'", str19, "<!---->");
        org.junit.Assert.assertNotNull(stringBuilder20);
        org.junit.Assert.assertEquals(stringBuilder20.toString(), "");
        org.junit.Assert.assertNotNull(token23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(comment26);
        org.junit.Assert.assertNotNull(tag29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(tag32);
        org.junit.Assert.assertNotNull(endTag35);
        org.junit.Assert.assertNotNull(charArray39);
        org.junit.Assert.assertArrayEquals(charArray39, new char[] { 'a', '#', ' ' });
        org.junit.Assert.assertNotNull(tag46);
        org.junit.Assert.assertNotNull(startTag51);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str58, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNotNull(attributes59);
        org.junit.Assert.assertNotNull(startTag60);
        org.junit.Assert.assertNotNull(startTag61);
        org.junit.Assert.assertNotNull(tag62);
    }

    @Test
    public void test4139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4139");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.getSystemIdentifier();
        boolean boolean2 = doctype0.forceQuirks;
        java.lang.StringBuilder stringBuilder3 = doctype0.publicIdentifier;
        java.lang.String str4 = doctype0.getName();
        doctype0.forceQuirks = true;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test4140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4140");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        org.jsoup.parser.ParseSettings parseSettings4 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList5 = xmlTreeBuilder0.parseFragment("", "", parseErrorList3, parseSettings4);
        org.jsoup.parser.ParseErrorList parseErrorList8 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder9 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings10 = xmlTreeBuilder9.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings11 = xmlTreeBuilder9.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList14 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder15 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings16 = xmlTreeBuilder15.defaultSettings();
        xmlTreeBuilder9.initialiseParse("", "SYSTEM", parseErrorList14, parseSettings16);
        xmlTreeBuilder0.initialiseParse("Doctype", "PUBLIC", parseErrorList8, parseSettings16);
        org.jsoup.parser.ParseErrorList parseErrorList21 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder22 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList25 = null;
        org.jsoup.parser.ParseSettings parseSettings26 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList27 = xmlTreeBuilder22.parseFragment("", "", parseErrorList25, parseSettings26);
        org.jsoup.parser.ParseErrorList parseErrorList30 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder31 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings32 = xmlTreeBuilder31.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings33 = xmlTreeBuilder31.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList36 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder37 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings38 = xmlTreeBuilder37.defaultSettings();
        xmlTreeBuilder31.initialiseParse("", "SYSTEM", parseErrorList36, parseSettings38);
        xmlTreeBuilder22.initialiseParse("Doctype", "PUBLIC", parseErrorList30, parseSettings38);
        xmlTreeBuilder0.initialiseParse("EndTag", "<!---->", parseErrorList21, parseSettings38);
        org.jsoup.nodes.Document document44 = xmlTreeBuilder0.parse("<!---->", "SYSTEM");
        org.jsoup.parser.Token.Doctype doctype45 = new org.jsoup.parser.Token.Doctype();
        boolean boolean46 = doctype45.forceQuirks;
        java.lang.StringBuilder stringBuilder47 = doctype45.systemIdentifier;
        boolean boolean48 = doctype45.forceQuirks;
        org.jsoup.parser.Token token49 = doctype45.reset();
        xmlTreeBuilder0.insert(doctype45);
        org.jsoup.nodes.Document document53 = xmlTreeBuilder0.parse("SYSTEM", "<a>");
        java.lang.String str54 = document53.baseUri();
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertNotNull(parseSettings10);
        org.junit.Assert.assertNotNull(parseSettings11);
        org.junit.Assert.assertNotNull(parseSettings16);
        org.junit.Assert.assertNotNull(nodeList27);
        org.junit.Assert.assertNotNull(parseSettings32);
        org.junit.Assert.assertNotNull(parseSettings33);
        org.junit.Assert.assertNotNull(parseSettings38);
        org.junit.Assert.assertNotNull(document44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(stringBuilder47);
        org.junit.Assert.assertEquals(stringBuilder47.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(token49);
        org.junit.Assert.assertNotNull(document53);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "<a>" + "'", str54, "<a>");
    }

    @Test
    public void test4141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4141");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "<!---->");
        int int5 = documentType4.childNodeSize();
        java.lang.String str6 = documentType4.outerHtml();
        org.jsoup.parser.Token.Doctype doctype7 = new org.jsoup.parser.Token.Doctype();
        boolean boolean8 = doctype7.forceQuirks;
        doctype7.forceQuirks = false;
        java.lang.String str11 = doctype7.getName();
        java.lang.StringBuilder stringBuilder12 = doctype7.name;
        java.lang.StringBuilder stringBuilder13 = documentType4.html(stringBuilder12);
        org.jsoup.nodes.Node node14 = documentType4.nextSibling();
        org.jsoup.nodes.DocumentType documentType19 = new org.jsoup.nodes.DocumentType("EndTag", "<!DOCTYPE hi! PUBLIC \"hi!\">", "<!DOCTYPE hi! PUBLIC \"hi!\">", "SYSTEM");
        java.util.List<org.jsoup.nodes.Node> nodeList20 = documentType19.siblingNodes();
        boolean boolean21 = documentType4.equals((java.lang.Object) documentType19);
        org.jsoup.nodes.Node node23 = documentType4.removeAttr("a");
        org.jsoup.nodes.Attributes attributes24 = documentType4.attributes();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder25 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList28 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder29 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings30 = xmlTreeBuilder29.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings31 = xmlTreeBuilder29.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList34 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder35 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings36 = xmlTreeBuilder35.defaultSettings();
        xmlTreeBuilder29.initialiseParse("", "SYSTEM", parseErrorList34, parseSettings36);
        org.jsoup.parser.Token.Comment comment38 = new org.jsoup.parser.Token.Comment();
        org.jsoup.parser.Token.Comment comment39 = comment38.asComment();
        xmlTreeBuilder29.insert(comment38);
        org.jsoup.parser.ParseSettings parseSettings41 = xmlTreeBuilder29.defaultSettings();
        xmlTreeBuilder25.initialiseParse("<EndTag  name=\"hi!\" publicId=\"hi!\" systemId=\"\">", "", parseErrorList28, parseSettings41);
        org.jsoup.parser.Token.StartTag startTag43 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes44 = null;
        startTag43.attributes = attributes44;
        org.jsoup.parser.Token.Tag tag46 = startTag43.reset();
        org.jsoup.nodes.Attributes attributes48 = null;
        org.jsoup.parser.Token.StartTag startTag49 = startTag43.nameAttr("SYSTEM", attributes48);
        java.lang.String str50 = startTag49.name();
        org.jsoup.parser.Token.StartTag startTag52 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes54 = null;
        org.jsoup.parser.Token.StartTag startTag55 = startTag52.nameAttr("PUBLIC", attributes54);
        startTag52.appendAttributeValue(' ');
        char[] charArray61 = new char[] { ' ', '4', '#' };
        startTag52.appendAttributeValue(charArray61);
        org.jsoup.parser.Token.StartTag startTag63 = startTag52.asStartTag();
        org.jsoup.parser.Token.EndTag endTag65 = new org.jsoup.parser.Token.EndTag();
        org.jsoup.parser.Token.TokenType tokenType66 = endTag65.type;
        org.jsoup.parser.Token.EndTag endTag67 = endTag65.asEndTag();
        org.jsoup.nodes.DocumentType documentType72 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "<!---->");
        java.lang.String str73 = documentType72.outerHtml();
        org.jsoup.nodes.Attributes attributes74 = documentType72.attributes();
        endTag67.attributes = attributes74;
        org.jsoup.nodes.Attributes attributes76 = endTag67.getAttributes();
        org.jsoup.parser.Token.StartTag startTag77 = startTag52.nameAttr("hi!", attributes76);
        org.jsoup.parser.Token.StartTag startTag78 = startTag49.nameAttr("<!DOCTYPE hi! PUBLIC \"hi!\">", attributes76);
        org.jsoup.nodes.Element element79 = xmlTreeBuilder25.insert(startTag78);
        element79.setBaseUri("Doctype");
        boolean boolean82 = documentType4.hasSameValue((java.lang.Object) element79);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str6, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(stringBuilder12);
        org.junit.Assert.assertEquals(stringBuilder12.toString(), "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNotNull(stringBuilder13);
        org.junit.Assert.assertEquals(stringBuilder13.toString(), "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNotNull(nodeList20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertNotNull(attributes24);
        org.junit.Assert.assertNotNull(parseSettings30);
        org.junit.Assert.assertNotNull(parseSettings31);
        org.junit.Assert.assertNotNull(parseSettings36);
        org.junit.Assert.assertNotNull(comment39);
        org.junit.Assert.assertNotNull(parseSettings41);
        org.junit.Assert.assertNotNull(tag46);
        org.junit.Assert.assertNotNull(startTag49);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "SYSTEM" + "'", str50, "SYSTEM");
        org.junit.Assert.assertNotNull(startTag55);
        org.junit.Assert.assertNotNull(charArray61);
        org.junit.Assert.assertArrayEquals(charArray61, new char[] { ' ', '4', '#' });
        org.junit.Assert.assertNotNull(startTag63);
        org.junit.Assert.assertTrue("'" + tokenType66 + "' != '" + org.jsoup.parser.Token.TokenType.EndTag + "'", tokenType66.equals(org.jsoup.parser.Token.TokenType.EndTag));
        org.junit.Assert.assertNotNull(endTag67);
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str73, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNotNull(attributes74);
        org.junit.Assert.assertNotNull(attributes76);
        org.junit.Assert.assertNotNull(startTag77);
        org.junit.Assert.assertNotNull(startTag78);
        org.junit.Assert.assertNotNull(element79);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
    }

    @Test
    public void test4142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4142");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        org.jsoup.parser.ParseSettings parseSettings4 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList5 = xmlTreeBuilder0.parseFragment("", "", parseErrorList3, parseSettings4);
        org.jsoup.parser.ParseErrorList parseErrorList8 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder9 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings10 = xmlTreeBuilder9.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings11 = xmlTreeBuilder9.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList14 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder15 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings16 = xmlTreeBuilder15.defaultSettings();
        xmlTreeBuilder9.initialiseParse("", "SYSTEM", parseErrorList14, parseSettings16);
        xmlTreeBuilder0.initialiseParse("Doctype", "PUBLIC", parseErrorList8, parseSettings16);
        org.jsoup.parser.ParseErrorList parseErrorList21 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder22 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList25 = null;
        org.jsoup.parser.ParseSettings parseSettings26 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList27 = xmlTreeBuilder22.parseFragment("", "", parseErrorList25, parseSettings26);
        org.jsoup.parser.ParseErrorList parseErrorList30 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder31 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings32 = xmlTreeBuilder31.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings33 = xmlTreeBuilder31.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList36 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder37 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings38 = xmlTreeBuilder37.defaultSettings();
        xmlTreeBuilder31.initialiseParse("", "SYSTEM", parseErrorList36, parseSettings38);
        xmlTreeBuilder22.initialiseParse("Doctype", "PUBLIC", parseErrorList30, parseSettings38);
        xmlTreeBuilder0.initialiseParse("EndTag", "<!---->", parseErrorList21, parseSettings38);
        org.jsoup.nodes.Document document44 = xmlTreeBuilder0.parse("<!---->", "SYSTEM");
        org.jsoup.parser.Token.Doctype doctype45 = new org.jsoup.parser.Token.Doctype();
        boolean boolean46 = doctype45.forceQuirks;
        java.lang.StringBuilder stringBuilder47 = doctype45.systemIdentifier;
        boolean boolean48 = doctype45.forceQuirks;
        org.jsoup.parser.Token token49 = doctype45.reset();
        xmlTreeBuilder0.insert(doctype45);
        org.jsoup.nodes.Document document53 = xmlTreeBuilder0.parse("SYSTEM", "<a>");
        int int54 = document53.siblingIndex();
        org.jsoup.nodes.Node node56 = document53.removeAttr("<SYSTEM>");
        boolean boolean58 = document53.hasAttr("#endtag");
        org.jsoup.nodes.Node node59 = document53.clone();
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertNotNull(parseSettings10);
        org.junit.Assert.assertNotNull(parseSettings11);
        org.junit.Assert.assertNotNull(parseSettings16);
        org.junit.Assert.assertNotNull(nodeList27);
        org.junit.Assert.assertNotNull(parseSettings32);
        org.junit.Assert.assertNotNull(parseSettings33);
        org.junit.Assert.assertNotNull(parseSettings38);
        org.junit.Assert.assertNotNull(document44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(stringBuilder47);
        org.junit.Assert.assertEquals(stringBuilder47.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(token49);
        org.junit.Assert.assertNotNull(document53);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertNotNull(node56);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(node59);
    }

    @Test
    public void test4143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4143");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes1 = null;
        startTag0.attributes = attributes1;
        org.jsoup.parser.Token.Tag tag3 = startTag0.reset();
        org.jsoup.nodes.Attributes attributes5 = null;
        org.jsoup.parser.Token.StartTag startTag6 = startTag0.nameAttr("SYSTEM", attributes5);
        java.lang.String str7 = startTag6.name();
        org.jsoup.parser.Token.Tag tag9 = startTag6.name("<<PUBLIC>>");
        boolean boolean10 = startTag6.isEndTag();
        org.jsoup.parser.Token.Doctype doctype11 = new org.jsoup.parser.Token.Doctype();
        boolean boolean12 = doctype11.forceQuirks;
        java.lang.StringBuilder stringBuilder13 = doctype11.systemIdentifier;
        java.lang.StringBuilder stringBuilder14 = doctype11.systemIdentifier;
        boolean boolean15 = doctype11.isDoctype();
        boolean boolean16 = doctype11.isForceQuirks();
        org.jsoup.parser.Token.TokenType tokenType17 = doctype11.type;
        startTag6.type = tokenType17;
        org.junit.Assert.assertNotNull(tag3);
        org.junit.Assert.assertNotNull(startTag6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "SYSTEM" + "'", str7, "SYSTEM");
        org.junit.Assert.assertNotNull(tag9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(stringBuilder13);
        org.junit.Assert.assertEquals(stringBuilder13.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder14);
        org.junit.Assert.assertEquals(stringBuilder14.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + tokenType17 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType17.equals(org.jsoup.parser.Token.TokenType.Doctype));
    }

    @Test
    public void test4144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4144");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.parser.Token.StartTag startTag3 = startTag0.nameAttr("PUBLIC", attributes2);
        boolean boolean4 = startTag3.isComment();
        org.jsoup.parser.Token.Tag tag6 = startTag3.name("<PUBLIC>");
        startTag3.newAttribute();
        startTag3.appendTagName('a');
        startTag3.tagName = "public#endtag";
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(tag6);
    }

    @Test
    public void test4145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4145");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        boolean boolean1 = doctype0.forceQuirks;
        java.lang.StringBuilder stringBuilder2 = doctype0.systemIdentifier;
        java.lang.String str3 = doctype0.getName();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test4146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4146");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        java.lang.String str1 = startTag0.normalName;
        startTag0.normalName = "<!DOCTYPE hi! PUBLIC \"hi!\">";
        org.jsoup.nodes.DocumentType documentType9 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "<!---->");
        java.lang.String str10 = documentType9.outerHtml();
        org.jsoup.nodes.Attributes attributes11 = documentType9.attributes();
        org.jsoup.parser.Token.StartTag startTag12 = startTag0.nameAttr("<!DOCTYPE hi! PUBLIC \"hi!\">", attributes11);
        java.lang.String str13 = startTag12.normalName;
        startTag12.setEmptyAttributeValue();
        boolean boolean15 = startTag12.selfClosing;
        startTag12.appendTagName('a');
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.EndTag endTag18 = startTag12.asEndTag();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$EndTag (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$EndTag are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str10, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNotNull(attributes11);
        org.junit.Assert.assertNotNull(startTag12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "<!doctype hi! public \"hi!\">" + "'", str13, "<!doctype hi! public \"hi!\">");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test4147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4147");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        boolean boolean1 = doctype0.forceQuirks;
        java.lang.String str2 = doctype0.tokenType();
        java.lang.StringBuilder stringBuilder3 = doctype0.name;
        java.lang.StringBuilder stringBuilder4 = doctype0.name;
        boolean boolean5 = doctype0.forceQuirks;
        boolean boolean6 = doctype0.isEOF();
        java.lang.String str7 = doctype0.getPublicIdentifier();
        java.lang.StringBuilder stringBuilder8 = doctype0.systemIdentifier;
        java.lang.String str9 = doctype0.getPublicIdentifier();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Doctype" + "'", str2, "Doctype");
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(stringBuilder8);
        org.junit.Assert.assertEquals(stringBuilder8.toString(), "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test4148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4148");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "<!---->");
        org.jsoup.nodes.Node node5 = documentType4.parent();
        org.jsoup.nodes.Node node6 = documentType4.nextSibling();
        java.lang.String str7 = documentType4.nodeName();
        org.jsoup.nodes.Node node8 = documentType4.nextSibling();
        org.jsoup.nodes.Node node9 = documentType4.clone();
        org.jsoup.nodes.Document document10 = documentType4.ownerDocument();
        java.lang.String str12 = documentType4.absUrl("<!DOCTYPE <a> PUBLIC \"Comment\" \"<!doctype hi! public \"hi!\">\">");
        org.jsoup.nodes.Document document13 = documentType4.ownerDocument();
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#doctype" + "'", str7, "#doctype");
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNull(document10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(document13);
    }

    @Test
    public void test4149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4149");
        org.jsoup.parser.Token.Character character0 = new org.jsoup.parser.Token.Character();
        java.lang.String str1 = character0.toString();
        org.jsoup.parser.Token.TokenType tokenType2 = character0.type;
        java.lang.String str3 = character0.toString();
        org.jsoup.parser.Token.Character character5 = character0.data("public");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + tokenType2 + "' != '" + org.jsoup.parser.Token.TokenType.Character + "'", tokenType2.equals(org.jsoup.parser.Token.TokenType.Character));
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(character5);
    }

    @Test
    public void test4150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4150");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings2 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList5 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder6 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings7 = xmlTreeBuilder6.defaultSettings();
        xmlTreeBuilder0.initialiseParse("", "SYSTEM", parseErrorList5, parseSettings7);
        org.jsoup.parser.Token.Comment comment9 = new org.jsoup.parser.Token.Comment();
        org.jsoup.parser.Token.Comment comment10 = comment9.asComment();
        xmlTreeBuilder0.insert(comment9);
        org.jsoup.parser.ParseSettings parseSettings12 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.Document document15 = xmlTreeBuilder0.parse("EndTag", "</SYSTEM>");
        org.jsoup.nodes.Document document18 = xmlTreeBuilder0.parse("Character", "StartTag");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder19 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings20 = xmlTreeBuilder19.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings21 = xmlTreeBuilder19.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList24 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder25 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings26 = xmlTreeBuilder25.defaultSettings();
        xmlTreeBuilder19.initialiseParse("", "SYSTEM", parseErrorList24, parseSettings26);
        org.jsoup.parser.Token.Comment comment28 = new org.jsoup.parser.Token.Comment();
        org.jsoup.parser.Token.Comment comment29 = comment28.asComment();
        xmlTreeBuilder19.insert(comment28);
        boolean boolean31 = comment28.bogus;
        boolean boolean32 = comment28.bogus;
        java.lang.String str33 = comment28.toString();
        java.lang.String str34 = comment28.toString();
        xmlTreeBuilder0.insert(comment28);
        org.junit.Assert.assertNotNull(parseSettings1);
        org.junit.Assert.assertNotNull(parseSettings2);
        org.junit.Assert.assertNotNull(parseSettings7);
        org.junit.Assert.assertNotNull(comment10);
        org.junit.Assert.assertNotNull(parseSettings12);
        org.junit.Assert.assertNotNull(document15);
        org.junit.Assert.assertNotNull(document18);
        org.junit.Assert.assertNotNull(parseSettings20);
        org.junit.Assert.assertNotNull(parseSettings21);
        org.junit.Assert.assertNotNull(parseSettings26);
        org.junit.Assert.assertNotNull(comment29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "<!---->" + "'", str33, "<!---->");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "<!---->" + "'", str34, "<!---->");
    }

    @Test
    public void test4151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4151");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.getSystemIdentifier();
        boolean boolean2 = doctype0.forceQuirks;
        java.lang.String str3 = doctype0.getSystemIdentifier();
        java.lang.String str4 = doctype0.getName();
        boolean boolean5 = doctype0.isCharacter();
        java.lang.String str6 = doctype0.getSystemIdentifier();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test4152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4152");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "<!---->");
        org.jsoup.nodes.Node node5 = documentType4.parent();
        org.jsoup.parser.Token.Doctype doctype6 = new org.jsoup.parser.Token.Doctype();
        boolean boolean7 = doctype6.forceQuirks;
        java.lang.String str8 = doctype6.tokenType();
        java.lang.StringBuilder stringBuilder9 = doctype6.systemIdentifier;
        boolean boolean10 = documentType4.equals((java.lang.Object) stringBuilder9);
        java.lang.String str11 = documentType4.toString();
        org.jsoup.parser.Token.Doctype doctype12 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str13 = doctype12.getSystemIdentifier();
        boolean boolean14 = doctype12.forceQuirks;
        java.lang.String str15 = doctype12.getPublicIdentifier();
        java.lang.String str16 = doctype12.getSystemIdentifier();
        boolean boolean17 = documentType4.equals((java.lang.Object) doctype12);
        java.lang.String str18 = documentType4.outerHtml();
        org.jsoup.nodes.Node node19 = documentType4.nextSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node22 = node19.attr("</PUBLIC>", "<<PUBLIC>>");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Doctype" + "'", str8, "Doctype");
        org.junit.Assert.assertNotNull(stringBuilder9);
        org.junit.Assert.assertEquals(stringBuilder9.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str11, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str18, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNull(node19);
    }

    @Test
    public void test4153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4153");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.StartTag startTag1 = startTag0.asStartTag();
        boolean boolean2 = startTag0.isEndTag();
        org.jsoup.parser.Token.Character character3 = new org.jsoup.parser.Token.Character();
        org.jsoup.parser.Token.Character character5 = character3.data("hi!");
        java.lang.String str6 = character5.getData();
        org.jsoup.parser.Token.Doctype doctype7 = new org.jsoup.parser.Token.Doctype();
        boolean boolean8 = doctype7.forceQuirks;
        org.jsoup.parser.Token.TokenType tokenType9 = doctype7.type;
        character5.type = tokenType9;
        startTag0.type = tokenType9;
        org.jsoup.parser.Token.EndTag endTag13 = new org.jsoup.parser.Token.EndTag();
        org.jsoup.parser.Token.TokenType tokenType14 = endTag13.type;
        org.jsoup.parser.Token.EndTag endTag15 = endTag13.asEndTag();
        org.jsoup.nodes.DocumentType documentType20 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "<!---->");
        java.lang.String str21 = documentType20.outerHtml();
        org.jsoup.nodes.Attributes attributes22 = documentType20.attributes();
        endTag15.attributes = attributes22;
        org.jsoup.nodes.Attributes attributes24 = endTag15.getAttributes();
        org.jsoup.parser.Token.StartTag startTag25 = startTag0.nameAttr("</SYSTEM>", attributes24);
        org.jsoup.nodes.Attributes attributes26 = startTag0.getAttributes();
        org.jsoup.parser.Token.EndTag endTag27 = new org.jsoup.parser.Token.EndTag();
        endTag27.finaliseTag();
        org.jsoup.parser.Token.EndTag endTag29 = endTag27.asEndTag();
        boolean boolean30 = endTag29.isComment();
        java.lang.String str31 = endTag29.normalName();
        endTag29.appendAttributeValue('4');
        org.jsoup.parser.Token.Tag tag35 = endTag29.name("#endtag");
        org.jsoup.parser.Token.Tag tag37 = endTag29.name("</SYSTEM>");
        java.lang.String str38 = tag37.normalName();
        tag37.appendAttributeName(' ');
        org.jsoup.parser.Token.StartTag startTag41 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes42 = null;
        startTag41.attributes = attributes42;
        org.jsoup.parser.Token.Tag tag44 = startTag41.reset();
        org.jsoup.nodes.Attributes attributes46 = null;
        org.jsoup.parser.Token.StartTag startTag47 = startTag41.nameAttr("SYSTEM", attributes46);
        org.jsoup.parser.Token.Tag tag49 = startTag41.name("");
        tag49.selfClosing = false;
        org.jsoup.parser.Token.StartTag startTag52 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes54 = null;
        org.jsoup.parser.Token.StartTag startTag55 = startTag52.nameAttr("PUBLIC", attributes54);
        startTag52.appendAttributeValue(' ');
        char[] charArray61 = new char[] { ' ', '4', '#' };
        startTag52.appendAttributeValue(charArray61);
        org.jsoup.parser.Token.StartTag startTag63 = startTag52.asStartTag();
        org.jsoup.parser.Token.Tag tag64 = startTag52.reset();
        org.jsoup.parser.Token.EndTag endTag65 = new org.jsoup.parser.Token.EndTag();
        endTag65.finaliseTag();
        org.jsoup.parser.Token.EndTag endTag67 = endTag65.asEndTag();
        boolean boolean68 = endTag65.isComment();
        char[] charArray74 = new char[] { '#', 'a', '4', '#', 'a' };
        endTag65.appendAttributeValue(charArray74);
        tag64.appendAttributeValue(charArray74);
        tag49.appendAttributeValue(charArray74);
        tag37.appendAttributeValue(charArray74);
        startTag0.appendAttributeValue(charArray74);
        org.junit.Assert.assertNotNull(startTag1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(character5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + tokenType9 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType9.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertTrue("'" + tokenType14 + "' != '" + org.jsoup.parser.Token.TokenType.EndTag + "'", tokenType14.equals(org.jsoup.parser.Token.TokenType.EndTag));
        org.junit.Assert.assertNotNull(endTag15);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str21, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNotNull(attributes22);
        org.junit.Assert.assertNotNull(attributes24);
        org.junit.Assert.assertNotNull(startTag25);
        org.junit.Assert.assertNotNull(attributes26);
        org.junit.Assert.assertNotNull(endTag29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNotNull(tag35);
        org.junit.Assert.assertNotNull(tag37);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "</system>" + "'", str38, "</system>");
        org.junit.Assert.assertNotNull(tag44);
        org.junit.Assert.assertNotNull(startTag47);
        org.junit.Assert.assertNotNull(tag49);
        org.junit.Assert.assertNotNull(startTag55);
        org.junit.Assert.assertNotNull(charArray61);
        org.junit.Assert.assertArrayEquals(charArray61, new char[] { ' ', '4', '#' });
        org.junit.Assert.assertNotNull(startTag63);
        org.junit.Assert.assertNotNull(tag64);
        org.junit.Assert.assertNotNull(endTag67);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNotNull(charArray74);
        org.junit.Assert.assertArrayEquals(charArray74, new char[] { '#', 'a', '4', '#', 'a' });
    }

    @Test
    public void test4154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4154");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.parser.Token.StartTag startTag3 = startTag0.nameAttr("PUBLIC", attributes2);
        boolean boolean4 = startTag3.isComment();
        startTag3.selfClosing = true;
        org.jsoup.parser.Token.Tag tag7 = startTag3.reset();
        org.jsoup.parser.Token.Tag tag9 = tag7.name("</SYSTEM>");
        boolean boolean10 = tag7.isEOF();
        tag7.appendAttributeName(' ');
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(tag7);
        org.junit.Assert.assertNotNull(tag9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test4155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4155");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE hi! PUBLIC \"hi!\">", "PUBLIC", "#doctype", "");
        org.jsoup.nodes.Node node5 = documentType4.parent();
        org.jsoup.nodes.Node node8 = documentType4.attr("EndTag", "<Comment>");
        boolean boolean10 = node8.hasAttr("</<!DOCTYPE hi! PUBLIC \"hi!\">>");
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test4156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4156");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "<!---->");
        int int5 = documentType4.childNodeSize();
        java.lang.String str6 = documentType4.outerHtml();
        org.jsoup.parser.Token.Doctype doctype7 = new org.jsoup.parser.Token.Doctype();
        boolean boolean8 = doctype7.forceQuirks;
        doctype7.forceQuirks = false;
        java.lang.String str11 = doctype7.getName();
        java.lang.StringBuilder stringBuilder12 = doctype7.name;
        java.lang.StringBuilder stringBuilder13 = documentType4.html(stringBuilder12);
        java.lang.String str15 = documentType4.absUrl("PUBLIC");
        org.jsoup.nodes.Node node17 = documentType4.removeAttr("<SYSTEM>");
        org.jsoup.nodes.Node node19 = documentType4.removeAttr("#doctype");
        java.util.List<org.jsoup.nodes.Node> nodeList20 = node19.childNodes();
        org.jsoup.nodes.Node node23 = node19.attr("</<!DOCTYPE a PUBLIC \"#doctype\" \"Comment\">>", "4<PUBLIC>");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str6, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(stringBuilder12);
        org.junit.Assert.assertEquals(stringBuilder12.toString(), "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNotNull(stringBuilder13);
        org.junit.Assert.assertEquals(stringBuilder13.toString(), "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNotNull(nodeList20);
        org.junit.Assert.assertNotNull(node23);
    }

    @Test
    public void test4157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4157");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.finaliseTag();
        org.jsoup.parser.Token.EndTag endTag2 = endTag0.asEndTag();
        endTag0.tagName = "";
        endTag0.tagName = "<!---->";
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.StartTag startTag7 = endTag0.asStartTag();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$EndTag cannot be cast to class org.jsoup.parser.Token$StartTag (org.jsoup.parser.Token$EndTag and org.jsoup.parser.Token$StartTag are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(endTag2);
    }

    @Test
    public void test4158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4158");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        org.jsoup.parser.Token token1 = comment0.reset();
        java.lang.String str2 = comment0.getData();
        boolean boolean3 = comment0.isEOF();
        org.jsoup.parser.Token.Comment comment4 = comment0.asComment();
        org.jsoup.parser.Token token5 = comment0.reset();
        comment0.bogus = true;
        boolean boolean8 = comment0.isEndTag();
        boolean boolean9 = comment0.bogus;
        boolean boolean10 = comment0.isEndTag();
        org.junit.Assert.assertNotNull(token1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(comment4);
        org.junit.Assert.assertNotNull(token5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test4159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4159");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        org.jsoup.parser.Token.TokenType tokenType1 = endTag0.type;
        org.jsoup.parser.Token.EndTag endTag2 = endTag0.asEndTag();
        boolean boolean3 = endTag2.isSelfClosing();
        org.jsoup.parser.Token.Tag tag4 = endTag2.reset();
        org.junit.Assert.assertTrue("'" + tokenType1 + "' != '" + org.jsoup.parser.Token.TokenType.EndTag + "'", tokenType1.equals(org.jsoup.parser.Token.TokenType.EndTag));
        org.junit.Assert.assertNotNull(endTag2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(tag4);
    }

    @Test
    public void test4160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4160");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "<!---->");
        int int5 = documentType4.childNodeSize();
        org.jsoup.parser.Token.StartTag startTag6 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes8 = null;
        org.jsoup.parser.Token.StartTag startTag9 = startTag6.nameAttr("PUBLIC", attributes8);
        boolean boolean10 = documentType4.hasSameValue((java.lang.Object) startTag6);
        org.jsoup.nodes.Node node11 = documentType4.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList12 = documentType4.childNodesCopy();
        org.jsoup.parser.Token.EndTag endTag13 = new org.jsoup.parser.Token.EndTag();
        endTag13.finaliseTag();
        org.jsoup.parser.Token.EndTag endTag15 = endTag13.asEndTag();
        org.jsoup.parser.Token.Tag tag16 = endTag13.reset();
        org.jsoup.nodes.Attributes attributes17 = tag16.getAttributes();
        tag16.newAttribute();
        boolean boolean19 = documentType4.hasSameValue((java.lang.Object) tag16);
        java.lang.String str20 = documentType4.baseUri();
        org.jsoup.nodes.Node node21 = documentType4.parent();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(startTag9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(nodeList12);
        org.junit.Assert.assertNotNull(endTag15);
        org.junit.Assert.assertNotNull(tag16);
        org.junit.Assert.assertNull(attributes17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "<!---->" + "'", str20, "<!---->");
        org.junit.Assert.assertNull(node21);
    }

    @Test
    public void test4161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4161");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE hi! PUBLIC \"hi!\">", "PUBLIC", "#doctype", "");
        org.jsoup.nodes.Node node6 = documentType4.removeAttr("SYSTEM");
        java.lang.String str7 = documentType4.outerHtml();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder8 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList11 = null;
        org.jsoup.parser.ParseSettings parseSettings12 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList13 = xmlTreeBuilder8.parseFragment("", "", parseErrorList11, parseSettings12);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder14 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings15 = xmlTreeBuilder14.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings16 = xmlTreeBuilder14.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList19 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder20 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings21 = xmlTreeBuilder20.defaultSettings();
        xmlTreeBuilder14.initialiseParse("", "SYSTEM", parseErrorList19, parseSettings21);
        org.jsoup.parser.Token.Comment comment23 = new org.jsoup.parser.Token.Comment();
        org.jsoup.parser.Token.Comment comment24 = comment23.asComment();
        xmlTreeBuilder14.insert(comment23);
        xmlTreeBuilder8.insert(comment23);
        boolean boolean27 = documentType4.equals((java.lang.Object) xmlTreeBuilder8);
        int int28 = documentType4.siblingIndex();
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<!DOCTYPE <!DOCTYPE hi! PUBLIC \"hi!\"> PUBLIC \"PUBLIC\" \"#doctype\">" + "'", str7, "<!DOCTYPE <!DOCTYPE hi! PUBLIC \"hi!\"> PUBLIC \"PUBLIC\" \"#doctype\">");
        org.junit.Assert.assertNotNull(nodeList13);
        org.junit.Assert.assertNotNull(parseSettings15);
        org.junit.Assert.assertNotNull(parseSettings16);
        org.junit.Assert.assertNotNull(parseSettings21);
        org.junit.Assert.assertNotNull(comment24);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
    }

    @Test
    public void test4162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4162");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        org.jsoup.parser.Token.Comment comment1 = comment0.asComment();
        java.lang.String str2 = comment0.getData();
        java.lang.StringBuilder stringBuilder3 = comment0.data;
        java.lang.StringBuilder stringBuilder4 = comment0.data;
        org.jsoup.parser.Token token5 = comment0.reset();
        org.jsoup.parser.Token.Comment comment6 = comment0.asComment();
        java.lang.String str7 = comment6.getData();
        org.jsoup.parser.Token token8 = comment6.reset();
        org.junit.Assert.assertNotNull(comment1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "");
        org.junit.Assert.assertNotNull(token5);
        org.junit.Assert.assertNotNull(comment6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(token8);
    }

    @Test
    public void test4163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4163");
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState0 = org.jsoup.parser.HtmlTreeBuilderState.ForeignContent;
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag();
        endTag1.finaliseTag();
        org.jsoup.parser.Token.EndTag endTag3 = endTag1.asEndTag();
        boolean boolean4 = endTag3.isComment();
        java.lang.String str5 = endTag3.normalName();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder6 = null;
        boolean boolean7 = htmlTreeBuilderState0.process((org.jsoup.parser.Token) endTag3, htmlTreeBuilder6);
        org.jsoup.parser.Token.StartTag startTag8 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes10 = null;
        org.jsoup.parser.Token.StartTag startTag11 = startTag8.nameAttr("PUBLIC", attributes10);
        startTag8.appendAttributeValue(' ');
        char[] charArray17 = new char[] { ' ', '4', '#' };
        startTag8.appendAttributeValue(charArray17);
        org.jsoup.parser.Token.StartTag startTag19 = startTag8.asStartTag();
        java.lang.String str20 = startTag8.toString();
        java.lang.String str21 = startTag8.tokenType();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder22 = null;
        boolean boolean23 = htmlTreeBuilderState0.process((org.jsoup.parser.Token) startTag8, htmlTreeBuilder22);
        org.jsoup.parser.Token.EndTag endTag24 = new org.jsoup.parser.Token.EndTag();
        endTag24.finaliseTag();
        org.jsoup.parser.Token.EndTag endTag26 = endTag24.asEndTag();
        endTag24.tagName = "";
        endTag24.tagName = "<!---->";
        endTag24.appendAttributeName("<!---->");
        java.lang.String str33 = endTag24.normalName;
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder34 = null;
        boolean boolean35 = htmlTreeBuilderState0.process((org.jsoup.parser.Token) endTag24, htmlTreeBuilder34);
        org.junit.Assert.assertNotNull(htmlTreeBuilderState0);
        org.junit.Assert.assertNotNull(endTag3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(startTag11);
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertArrayEquals(charArray17, new char[] { ' ', '4', '#' });
        org.junit.Assert.assertNotNull(startTag19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "<PUBLIC>" + "'", str20, "<PUBLIC>");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "StartTag" + "'", str21, "StartTag");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(endTag26);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
    }

    @Test
    public void test4164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4164");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "<!---->");
        int int5 = documentType4.childNodeSize();
        java.lang.String str6 = documentType4.outerHtml();
        org.jsoup.parser.Token.Doctype doctype7 = new org.jsoup.parser.Token.Doctype();
        boolean boolean8 = doctype7.forceQuirks;
        doctype7.forceQuirks = false;
        java.lang.String str11 = doctype7.getName();
        java.lang.StringBuilder stringBuilder12 = doctype7.name;
        java.lang.StringBuilder stringBuilder13 = documentType4.html(stringBuilder12);
        java.lang.String str15 = documentType4.absUrl("PUBLIC");
        boolean boolean17 = documentType4.hasAttr("<SYSTEM>");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder18 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList21 = null;
        org.jsoup.parser.ParseSettings parseSettings22 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList23 = xmlTreeBuilder18.parseFragment("", "", parseErrorList21, parseSettings22);
        org.jsoup.parser.ParseErrorList parseErrorList26 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder27 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings28 = xmlTreeBuilder27.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings29 = xmlTreeBuilder27.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList32 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder33 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings34 = xmlTreeBuilder33.defaultSettings();
        xmlTreeBuilder27.initialiseParse("", "SYSTEM", parseErrorList32, parseSettings34);
        xmlTreeBuilder18.initialiseParse("Doctype", "PUBLIC", parseErrorList26, parseSettings34);
        org.jsoup.parser.ParseErrorList parseErrorList39 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder40 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList43 = null;
        org.jsoup.parser.ParseSettings parseSettings44 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList45 = xmlTreeBuilder40.parseFragment("", "", parseErrorList43, parseSettings44);
        org.jsoup.parser.ParseErrorList parseErrorList48 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder49 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings50 = xmlTreeBuilder49.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings51 = xmlTreeBuilder49.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList54 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder55 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings56 = xmlTreeBuilder55.defaultSettings();
        xmlTreeBuilder49.initialiseParse("", "SYSTEM", parseErrorList54, parseSettings56);
        xmlTreeBuilder40.initialiseParse("Doctype", "PUBLIC", parseErrorList48, parseSettings56);
        xmlTreeBuilder18.initialiseParse("EndTag", "<!---->", parseErrorList39, parseSettings56);
        org.jsoup.parser.Token.Doctype doctype60 = new org.jsoup.parser.Token.Doctype();
        xmlTreeBuilder18.insert(doctype60);
        boolean boolean62 = doctype60.isStartTag();
        java.lang.StringBuilder stringBuilder63 = doctype60.publicIdentifier;
        boolean boolean64 = doctype60.forceQuirks;
        java.lang.StringBuilder stringBuilder65 = doctype60.name;
        boolean boolean66 = documentType4.hasSameValue((java.lang.Object) stringBuilder65);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str6, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(stringBuilder12);
        org.junit.Assert.assertEquals(stringBuilder12.toString(), "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNotNull(stringBuilder13);
        org.junit.Assert.assertEquals(stringBuilder13.toString(), "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(nodeList23);
        org.junit.Assert.assertNotNull(parseSettings28);
        org.junit.Assert.assertNotNull(parseSettings29);
        org.junit.Assert.assertNotNull(parseSettings34);
        org.junit.Assert.assertNotNull(nodeList45);
        org.junit.Assert.assertNotNull(parseSettings50);
        org.junit.Assert.assertNotNull(parseSettings51);
        org.junit.Assert.assertNotNull(parseSettings56);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(stringBuilder63);
        org.junit.Assert.assertEquals(stringBuilder63.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(stringBuilder65);
        org.junit.Assert.assertEquals(stringBuilder65.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
    }

    @Test
    public void test4165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4165");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "<!---->");
        int int5 = documentType4.childNodeSize();
        org.jsoup.nodes.Attributes attributes6 = documentType4.attributes();
        org.jsoup.nodes.Node node7 = documentType4.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList8 = documentType4.childNodes();
        documentType4.setBaseUri("<!DOCTYPE EndTag PUBLIC \"<!DOCTYPE hi! PUBLIC \"hi!\">\" \"<!DOCTYPE hi! PUBLIC \"hi!\">\">");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node12 = documentType4.after("4");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(nodeList8);
    }

    @Test
    public void test4166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4166");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.finaliseTag();
        boolean boolean2 = endTag0.selfClosing;
        java.lang.String str3 = endTag0.tagName;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = endTag0.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must be false");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test4167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4167");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.parser.Token.StartTag startTag3 = startTag0.nameAttr("PUBLIC", attributes2);
        startTag0.appendAttributeValue(' ');
        char[] charArray9 = new char[] { ' ', '4', '#' };
        startTag0.appendAttributeValue(charArray9);
        java.lang.String str11 = startTag0.normalName;
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] { ' ', '4', '#' });
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "public" + "'", str11, "public");
    }

    @Test
    public void test4168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4168");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE Character PUBLIC \"#endtag\" \"PUBLIC\">", "Comment ", "<!DOCTYPE <!DOCTYPE hi! PUBLIC \"hi!\"> PUBLIC \"PUBLIC\" \"#doctype\">", "<Comment>");
        org.jsoup.nodes.Document document5 = documentType4.ownerDocument();
        java.lang.String str6 = documentType4.nodeName();
        org.junit.Assert.assertNull(document5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "#doctype" + "'", str6, "#doctype");
    }

    @Test
    public void test4169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4169");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.getSystemIdentifier();
        boolean boolean2 = doctype0.forceQuirks;
        java.lang.String str3 = doctype0.getPublicIdentifier();
        java.lang.String str4 = doctype0.getSystemIdentifier();
        boolean boolean5 = doctype0.forceQuirks;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test4170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4170");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "<!---->");
        int int5 = documentType4.childNodeSize();
        java.lang.String str6 = documentType4.outerHtml();
        org.jsoup.parser.Token.Doctype doctype7 = new org.jsoup.parser.Token.Doctype();
        boolean boolean8 = doctype7.forceQuirks;
        doctype7.forceQuirks = false;
        java.lang.String str11 = doctype7.getName();
        java.lang.StringBuilder stringBuilder12 = doctype7.name;
        java.lang.StringBuilder stringBuilder13 = documentType4.html(stringBuilder12);
        java.lang.String str15 = documentType4.absUrl("PUBLIC");
        java.util.List<org.jsoup.nodes.Node> nodeList16 = documentType4.siblingNodes();
        java.lang.String str17 = documentType4.nodeName();
        org.jsoup.nodes.Attributes attributes18 = documentType4.attributes();
        java.util.List<org.jsoup.nodes.Node> nodeList19 = documentType4.siblingNodes();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str6, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(stringBuilder12);
        org.junit.Assert.assertEquals(stringBuilder12.toString(), "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNotNull(stringBuilder13);
        org.junit.Assert.assertEquals(stringBuilder13.toString(), "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(nodeList16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "#doctype" + "'", str17, "#doctype");
        org.junit.Assert.assertNotNull(attributes18);
        org.junit.Assert.assertNotNull(nodeList19);
    }

    @Test
    public void test4171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4171");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        org.jsoup.parser.Token.Comment comment1 = comment0.asComment();
        java.lang.String str2 = comment0.getData();
        java.lang.StringBuilder stringBuilder3 = comment0.data;
        java.lang.StringBuilder stringBuilder4 = comment0.data;
        org.jsoup.parser.Token token5 = comment0.reset();
        org.jsoup.parser.Token.Comment comment6 = comment0.asComment();
        java.lang.String str7 = comment6.getData();
        java.lang.String str8 = comment6.toString();
        org.junit.Assert.assertNotNull(comment1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "");
        org.junit.Assert.assertNotNull(token5);
        org.junit.Assert.assertNotNull(comment6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "<!---->" + "'", str8, "<!---->");
    }

    @Test
    public void test4172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4172");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        org.jsoup.parser.ParseSettings parseSettings4 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList5 = xmlTreeBuilder0.parseFragment("", "", parseErrorList3, parseSettings4);
        org.jsoup.parser.ParseErrorList parseErrorList8 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder9 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings10 = xmlTreeBuilder9.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings11 = xmlTreeBuilder9.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList14 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder15 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings16 = xmlTreeBuilder15.defaultSettings();
        xmlTreeBuilder9.initialiseParse("", "SYSTEM", parseErrorList14, parseSettings16);
        xmlTreeBuilder0.initialiseParse("Doctype", "PUBLIC", parseErrorList8, parseSettings16);
        org.jsoup.parser.ParseErrorList parseErrorList21 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder22 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList25 = null;
        org.jsoup.parser.ParseSettings parseSettings26 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList27 = xmlTreeBuilder22.parseFragment("", "", parseErrorList25, parseSettings26);
        org.jsoup.parser.ParseErrorList parseErrorList30 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder31 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings32 = xmlTreeBuilder31.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings33 = xmlTreeBuilder31.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList36 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder37 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings38 = xmlTreeBuilder37.defaultSettings();
        xmlTreeBuilder31.initialiseParse("", "SYSTEM", parseErrorList36, parseSettings38);
        xmlTreeBuilder22.initialiseParse("Doctype", "PUBLIC", parseErrorList30, parseSettings38);
        xmlTreeBuilder0.initialiseParse("EndTag", "<!---->", parseErrorList21, parseSettings38);
        org.jsoup.nodes.Document document44 = xmlTreeBuilder0.parse("<!---->", "SYSTEM");
        org.jsoup.nodes.Node node45 = document44.parentNode();
        java.lang.String str46 = document44.toString();
        org.jsoup.nodes.Node node47 = document44.clone();
        org.jsoup.parser.Token.Doctype doctype48 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str49 = doctype48.getSystemIdentifier();
        boolean boolean50 = doctype48.forceQuirks;
        java.lang.StringBuilder stringBuilder51 = doctype48.publicIdentifier;
        java.lang.StringBuilder stringBuilder52 = doctype48.name;
        java.lang.StringBuilder stringBuilder53 = node47.html(stringBuilder52);
        org.jsoup.nodes.Node node56 = node47.attr("comment ", "");
        org.jsoup.nodes.DocumentType documentType61 = new org.jsoup.nodes.DocumentType("4<PUBLIC>", "<<!DOCTYPE a PUBLIC \"#doctype\" \"Comment\">>", "<SYSTEM>", "<!DOCTYPE <!DOCTYPE Character PUBLIC \"#endtag\" \"PUBLIC\"> PUBLIC \"Comment \" \"<!DOCTYPE <!DOCTYPE hi! PUBLIC \"hi!\"> PUBLIC \"PUBLIC\" \"#doctype\">\">");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node62 = node56.after((org.jsoup.nodes.Node) documentType61);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertNotNull(parseSettings10);
        org.junit.Assert.assertNotNull(parseSettings11);
        org.junit.Assert.assertNotNull(parseSettings16);
        org.junit.Assert.assertNotNull(nodeList27);
        org.junit.Assert.assertNotNull(parseSettings32);
        org.junit.Assert.assertNotNull(parseSettings33);
        org.junit.Assert.assertNotNull(parseSettings38);
        org.junit.Assert.assertNotNull(document44);
        org.junit.Assert.assertNull(node45);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "<!---->" + "'", str46, "<!---->");
        org.junit.Assert.assertNotNull(node47);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(stringBuilder51);
        org.junit.Assert.assertEquals(stringBuilder51.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder52);
        org.junit.Assert.assertEquals(stringBuilder52.toString(), "\n<!---->");
        org.junit.Assert.assertNotNull(stringBuilder53);
        org.junit.Assert.assertEquals(stringBuilder53.toString(), "\n<!---->");
        org.junit.Assert.assertNotNull(node56);
    }

    @Test
    public void test4173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4173");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        boolean boolean1 = doctype0.forceQuirks;
        java.lang.StringBuilder stringBuilder2 = doctype0.systemIdentifier;
        java.lang.StringBuilder stringBuilder3 = doctype0.systemIdentifier;
        boolean boolean4 = doctype0.isDoctype();
        boolean boolean5 = doctype0.isForceQuirks();
        org.jsoup.parser.Token.TokenType tokenType6 = doctype0.type;
        boolean boolean7 = doctype0.isStartTag();
        java.lang.StringBuilder stringBuilder8 = doctype0.publicIdentifier;
        org.jsoup.parser.Token.reset(stringBuilder8);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + tokenType6 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType6.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(stringBuilder8);
        org.junit.Assert.assertEquals(stringBuilder8.toString(), "");
    }

    @Test
    public void test4174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4174");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings2 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList5 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder6 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings7 = xmlTreeBuilder6.defaultSettings();
        xmlTreeBuilder0.initialiseParse("", "SYSTEM", parseErrorList5, parseSettings7);
        org.jsoup.parser.ParseSettings parseSettings9 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.Token.Character character10 = new org.jsoup.parser.Token.Character();
        org.jsoup.parser.Token.Character character12 = character10.data("hi!");
        java.lang.String str13 = character10.toString();
        org.jsoup.parser.Token.Character character15 = character10.data("");
        xmlTreeBuilder0.insert(character15);
        org.jsoup.parser.Token.Comment comment17 = new org.jsoup.parser.Token.Comment();
        org.jsoup.parser.Token.Comment comment18 = comment17.asComment();
        java.lang.String str19 = comment18.toString();
        java.lang.StringBuilder stringBuilder20 = comment18.data;
        xmlTreeBuilder0.insert(comment18);
        org.jsoup.nodes.Document document24 = xmlTreeBuilder0.parse("SYSTEM", "");
        org.jsoup.nodes.DocumentType documentType29 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "<!---->");
        org.jsoup.nodes.Node node30 = documentType29.parent();
        org.jsoup.parser.Token.Doctype doctype31 = new org.jsoup.parser.Token.Doctype();
        boolean boolean32 = doctype31.forceQuirks;
        java.lang.String str33 = doctype31.tokenType();
        java.lang.StringBuilder stringBuilder34 = doctype31.systemIdentifier;
        boolean boolean35 = documentType29.equals((java.lang.Object) stringBuilder34);
        java.lang.String str36 = documentType29.toString();
        org.jsoup.parser.Token.Doctype doctype37 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str38 = doctype37.getSystemIdentifier();
        boolean boolean39 = doctype37.forceQuirks;
        java.lang.String str40 = doctype37.getPublicIdentifier();
        java.lang.String str41 = doctype37.getSystemIdentifier();
        boolean boolean42 = documentType29.equals((java.lang.Object) doctype37);
        java.lang.String str43 = documentType29.outerHtml();
        org.jsoup.nodes.Node node44 = documentType29.nextSibling();
        boolean boolean45 = document24.hasSameValue((java.lang.Object) documentType29);
        java.lang.String str46 = document24.baseUri();
        java.lang.Object obj47 = null;
        boolean boolean48 = document24.equals(obj47);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node50 = document24.after("a");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings1);
        org.junit.Assert.assertNotNull(parseSettings2);
        org.junit.Assert.assertNotNull(parseSettings7);
        org.junit.Assert.assertNotNull(parseSettings9);
        org.junit.Assert.assertNotNull(character12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(character15);
        org.junit.Assert.assertNotNull(comment18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "<!---->" + "'", str19, "<!---->");
        org.junit.Assert.assertNotNull(stringBuilder20);
        org.junit.Assert.assertEquals(stringBuilder20.toString(), "");
        org.junit.Assert.assertNotNull(document24);
        org.junit.Assert.assertNull(node30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "Doctype" + "'", str33, "Doctype");
        org.junit.Assert.assertNotNull(stringBuilder34);
        org.junit.Assert.assertEquals(stringBuilder34.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str36, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str43, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNull(node44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
    }

    @Test
    public void test4175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4175");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "<!---->");
        int int5 = documentType4.childNodeSize();
        org.jsoup.parser.Token.StartTag startTag6 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes8 = null;
        org.jsoup.parser.Token.StartTag startTag9 = startTag6.nameAttr("PUBLIC", attributes8);
        boolean boolean10 = documentType4.hasSameValue((java.lang.Object) startTag6);
        org.jsoup.nodes.Node node11 = documentType4.clone();
        int int12 = node11.siblingIndex();
        org.jsoup.nodes.Node node13 = node11.clone();
        org.jsoup.nodes.Attributes attributes14 = node13.attributes();
        node13.setBaseUri("<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(startTag9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(attributes14);
    }

    @Test
    public void test4176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4176");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        org.jsoup.parser.ParseSettings parseSettings4 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList5 = xmlTreeBuilder0.parseFragment("", "", parseErrorList3, parseSettings4);
        org.jsoup.parser.ParseErrorList parseErrorList8 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder9 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings10 = xmlTreeBuilder9.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings11 = xmlTreeBuilder9.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList14 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder15 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings16 = xmlTreeBuilder15.defaultSettings();
        xmlTreeBuilder9.initialiseParse("", "SYSTEM", parseErrorList14, parseSettings16);
        xmlTreeBuilder0.initialiseParse("Doctype", "PUBLIC", parseErrorList8, parseSettings16);
        org.jsoup.parser.ParseErrorList parseErrorList21 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder22 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList25 = null;
        org.jsoup.parser.ParseSettings parseSettings26 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList27 = xmlTreeBuilder22.parseFragment("", "", parseErrorList25, parseSettings26);
        org.jsoup.parser.ParseErrorList parseErrorList30 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder31 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings32 = xmlTreeBuilder31.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings33 = xmlTreeBuilder31.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList36 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder37 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings38 = xmlTreeBuilder37.defaultSettings();
        xmlTreeBuilder31.initialiseParse("", "SYSTEM", parseErrorList36, parseSettings38);
        xmlTreeBuilder22.initialiseParse("Doctype", "PUBLIC", parseErrorList30, parseSettings38);
        xmlTreeBuilder0.initialiseParse("EndTag", "<!---->", parseErrorList21, parseSettings38);
        org.jsoup.nodes.Document document44 = xmlTreeBuilder0.parse("<!---->", "SYSTEM");
        org.jsoup.nodes.Document document45 = document44.ownerDocument();
        java.util.List<org.jsoup.nodes.Node> nodeList46 = document44.childNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList47 = document44.siblingNodes();
        java.lang.String str48 = document44.baseUri();
        org.jsoup.nodes.Node node49 = document44.nextSibling();
        org.jsoup.nodes.Node node51 = document44.removeAttr("<a>");
        org.jsoup.nodes.Document document52 = node51.ownerDocument();
        org.jsoup.nodes.Node node54 = document52.removeAttr("comment ");
        java.lang.String str55 = document52.toString();
        org.jsoup.nodes.Node node56 = document52.nextSibling();
        java.lang.String str57 = document52.outerHtml();
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertNotNull(parseSettings10);
        org.junit.Assert.assertNotNull(parseSettings11);
        org.junit.Assert.assertNotNull(parseSettings16);
        org.junit.Assert.assertNotNull(nodeList27);
        org.junit.Assert.assertNotNull(parseSettings32);
        org.junit.Assert.assertNotNull(parseSettings33);
        org.junit.Assert.assertNotNull(parseSettings38);
        org.junit.Assert.assertNotNull(document44);
        org.junit.Assert.assertNotNull(document45);
        org.junit.Assert.assertNotNull(nodeList46);
        org.junit.Assert.assertNotNull(nodeList47);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "SYSTEM" + "'", str48, "SYSTEM");
        org.junit.Assert.assertNull(node49);
        org.junit.Assert.assertNotNull(node51);
        org.junit.Assert.assertNotNull(document52);
        org.junit.Assert.assertNotNull(node54);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "<!---->" + "'", str55, "<!---->");
        org.junit.Assert.assertNull(node56);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "<!---->" + "'", str57, "<!---->");
    }

    @Test
    public void test4177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4177");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        java.lang.String str1 = startTag0.normalName;
        startTag0.normalName = "<!DOCTYPE hi! PUBLIC \"hi!\">";
        org.jsoup.nodes.DocumentType documentType9 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "<!---->");
        java.lang.String str10 = documentType9.outerHtml();
        org.jsoup.nodes.Attributes attributes11 = documentType9.attributes();
        org.jsoup.parser.Token.StartTag startTag12 = startTag0.nameAttr("<!DOCTYPE hi! PUBLIC \"hi!\">", attributes11);
        java.lang.String str13 = startTag12.normalName;
        java.lang.String str14 = startTag12.tagName;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str10, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNotNull(attributes11);
        org.junit.Assert.assertNotNull(startTag12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "<!doctype hi! public \"hi!\">" + "'", str13, "<!doctype hi! public \"hi!\">");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str14, "<!DOCTYPE hi! PUBLIC \"hi!\">");
    }

    @Test
    public void test4178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4178");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        org.jsoup.parser.ParseSettings parseSettings4 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList5 = xmlTreeBuilder0.parseFragment("", "", parseErrorList3, parseSettings4);
        org.jsoup.parser.ParseErrorList parseErrorList8 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder9 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings10 = xmlTreeBuilder9.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings11 = xmlTreeBuilder9.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList14 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder15 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings16 = xmlTreeBuilder15.defaultSettings();
        xmlTreeBuilder9.initialiseParse("", "SYSTEM", parseErrorList14, parseSettings16);
        xmlTreeBuilder0.initialiseParse("Doctype", "PUBLIC", parseErrorList8, parseSettings16);
        org.jsoup.parser.ParseErrorList parseErrorList21 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder22 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList25 = null;
        org.jsoup.parser.ParseSettings parseSettings26 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList27 = xmlTreeBuilder22.parseFragment("", "", parseErrorList25, parseSettings26);
        org.jsoup.parser.ParseErrorList parseErrorList30 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder31 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings32 = xmlTreeBuilder31.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings33 = xmlTreeBuilder31.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList36 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder37 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings38 = xmlTreeBuilder37.defaultSettings();
        xmlTreeBuilder31.initialiseParse("", "SYSTEM", parseErrorList36, parseSettings38);
        xmlTreeBuilder22.initialiseParse("Doctype", "PUBLIC", parseErrorList30, parseSettings38);
        xmlTreeBuilder0.initialiseParse("EndTag", "<!---->", parseErrorList21, parseSettings38);
        org.jsoup.nodes.Document document44 = xmlTreeBuilder0.parse("<!---->", "SYSTEM");
        org.jsoup.parser.Token.Doctype doctype45 = new org.jsoup.parser.Token.Doctype();
        boolean boolean46 = doctype45.forceQuirks;
        java.lang.StringBuilder stringBuilder47 = doctype45.systemIdentifier;
        boolean boolean48 = doctype45.forceQuirks;
        org.jsoup.parser.Token token49 = doctype45.reset();
        xmlTreeBuilder0.insert(doctype45);
        boolean boolean51 = doctype45.isEOF();
        java.lang.String str52 = doctype45.getName();
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertNotNull(parseSettings10);
        org.junit.Assert.assertNotNull(parseSettings11);
        org.junit.Assert.assertNotNull(parseSettings16);
        org.junit.Assert.assertNotNull(nodeList27);
        org.junit.Assert.assertNotNull(parseSettings32);
        org.junit.Assert.assertNotNull(parseSettings33);
        org.junit.Assert.assertNotNull(parseSettings38);
        org.junit.Assert.assertNotNull(document44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(stringBuilder47);
        org.junit.Assert.assertEquals(stringBuilder47.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(token49);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
    }

    @Test
    public void test4179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4179");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList4 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder5 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings6 = xmlTreeBuilder5.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings7 = xmlTreeBuilder5.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList10 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder11 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings12 = xmlTreeBuilder11.defaultSettings();
        xmlTreeBuilder5.initialiseParse("", "SYSTEM", parseErrorList10, parseSettings12);
        xmlTreeBuilder0.initialiseParse("Comment", "Doctype", parseErrorList4, parseSettings12);
        org.jsoup.nodes.DocumentType documentType20 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "<!---->");
        java.lang.String str21 = documentType20.outerHtml();
        org.jsoup.nodes.Attributes attributes22 = documentType20.attributes();
        org.jsoup.nodes.Attributes attributes23 = documentType20.attributes();
        boolean boolean24 = xmlTreeBuilder0.processStartTag("EndTag", attributes23);
        org.jsoup.parser.ParseErrorList parseErrorList27 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder28 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings29 = xmlTreeBuilder28.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList30 = xmlTreeBuilder0.parseFragment("</SYSTEM>", "<PUBLIC>", parseErrorList27, parseSettings29);
        org.jsoup.nodes.Document document33 = xmlTreeBuilder0.parse("Comment", "a");
        org.jsoup.nodes.DocumentType documentType39 = new org.jsoup.nodes.DocumentType("<!DOCTYPE hi! PUBLIC \"hi!\">", "PUBLIC", "#doctype", "");
        org.jsoup.nodes.Node node41 = documentType39.removeAttr("SYSTEM");
        java.lang.String str42 = documentType39.outerHtml();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder43 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList46 = null;
        org.jsoup.parser.ParseSettings parseSettings47 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList48 = xmlTreeBuilder43.parseFragment("", "", parseErrorList46, parseSettings47);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder49 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings50 = xmlTreeBuilder49.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings51 = xmlTreeBuilder49.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList54 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder55 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings56 = xmlTreeBuilder55.defaultSettings();
        xmlTreeBuilder49.initialiseParse("", "SYSTEM", parseErrorList54, parseSettings56);
        org.jsoup.parser.Token.Comment comment58 = new org.jsoup.parser.Token.Comment();
        org.jsoup.parser.Token.Comment comment59 = comment58.asComment();
        xmlTreeBuilder49.insert(comment58);
        xmlTreeBuilder43.insert(comment58);
        boolean boolean62 = documentType39.equals((java.lang.Object) xmlTreeBuilder43);
        org.jsoup.parser.TokeniserState tokeniserState63 = org.jsoup.parser.TokeniserState.ScriptDataDoubleEscapeEnd;
        boolean boolean64 = documentType39.hasSameValue((java.lang.Object) tokeniserState63);
        org.jsoup.nodes.Node node65 = documentType39.parentNode();
        org.jsoup.nodes.Attributes attributes66 = documentType39.attributes();
        boolean boolean67 = xmlTreeBuilder0.processStartTag("<PUBLIC>", attributes66);
        org.jsoup.parser.Token.Character character68 = new org.jsoup.parser.Token.Character();
        org.jsoup.parser.Token.Character character70 = character68.data("SYSTEM");
        org.jsoup.parser.Token.Character character72 = character70.data("EndTag");
        org.jsoup.parser.Token.Character character73 = new org.jsoup.parser.Token.Character();
        org.jsoup.parser.Token token74 = character73.reset();
        org.jsoup.parser.Token.StartTag startTag75 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes76 = null;
        startTag75.attributes = attributes76;
        org.jsoup.parser.Token.Tag tag78 = startTag75.reset();
        org.jsoup.parser.Token.TokenType tokenType79 = tag78.type;
        token74.type = tokenType79;
        character72.type = tokenType79;
        org.jsoup.parser.Token.Character character83 = character72.data("</4<PUBLIC>>");
        xmlTreeBuilder0.insert(character72);
        java.lang.String str85 = character72.toString();
        org.junit.Assert.assertNotNull(parseSettings1);
        org.junit.Assert.assertNotNull(parseSettings6);
        org.junit.Assert.assertNotNull(parseSettings7);
        org.junit.Assert.assertNotNull(parseSettings12);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str21, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNotNull(attributes22);
        org.junit.Assert.assertNotNull(attributes23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(parseSettings29);
        org.junit.Assert.assertNotNull(nodeList30);
        org.junit.Assert.assertNotNull(document33);
        org.junit.Assert.assertNotNull(node41);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "<!DOCTYPE <!DOCTYPE hi! PUBLIC \"hi!\"> PUBLIC \"PUBLIC\" \"#doctype\">" + "'", str42, "<!DOCTYPE <!DOCTYPE hi! PUBLIC \"hi!\"> PUBLIC \"PUBLIC\" \"#doctype\">");
        org.junit.Assert.assertNotNull(nodeList48);
        org.junit.Assert.assertNotNull(parseSettings50);
        org.junit.Assert.assertNotNull(parseSettings51);
        org.junit.Assert.assertNotNull(parseSettings56);
        org.junit.Assert.assertNotNull(comment59);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(tokeniserState63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNull(node65);
        org.junit.Assert.assertNotNull(attributes66);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertNotNull(character70);
        org.junit.Assert.assertNotNull(character72);
        org.junit.Assert.assertNotNull(token74);
        org.junit.Assert.assertNotNull(tag78);
        org.junit.Assert.assertTrue("'" + tokenType79 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType79.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertNotNull(character83);
        org.junit.Assert.assertEquals("'" + str85 + "' != '" + "</4<PUBLIC>>" + "'", str85, "</4<PUBLIC>>");
    }

    @Test
    public void test4180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4180");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "<!---->");
        org.jsoup.nodes.Node node5 = documentType4.parent();
        org.jsoup.parser.Token.Doctype doctype6 = new org.jsoup.parser.Token.Doctype();
        boolean boolean7 = doctype6.forceQuirks;
        java.lang.String str8 = doctype6.tokenType();
        java.lang.StringBuilder stringBuilder9 = doctype6.systemIdentifier;
        boolean boolean10 = documentType4.equals((java.lang.Object) stringBuilder9);
        org.jsoup.nodes.Node node12 = documentType4.removeAttr("PUBLIC");
        org.jsoup.nodes.Node node14 = documentType4.removeAttr("Comment");
        java.lang.String str15 = node14.toString();
        java.lang.String str16 = node14.baseUri();
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Doctype" + "'", str8, "Doctype");
        org.junit.Assert.assertNotNull(stringBuilder9);
        org.junit.Assert.assertEquals(stringBuilder9.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str15, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "<!---->" + "'", str16, "<!---->");
    }

    @Test
    public void test4181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4181");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings2 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings3 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.Document document6 = xmlTreeBuilder0.parse("PUBLIC", "hi!");
        org.jsoup.parser.Token.StartTag startTag7 = new org.jsoup.parser.Token.StartTag();
        java.lang.String str8 = startTag7.normalName;
        startTag7.normalName = "<!DOCTYPE hi! PUBLIC \"hi!\">";
        org.jsoup.nodes.DocumentType documentType16 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "<!---->");
        java.lang.String str17 = documentType16.outerHtml();
        org.jsoup.nodes.Attributes attributes18 = documentType16.attributes();
        org.jsoup.parser.Token.StartTag startTag19 = startTag7.nameAttr("<!DOCTYPE hi! PUBLIC \"hi!\">", attributes18);
        java.lang.String str20 = startTag19.normalName;
        startTag19.setEmptyAttributeValue();
        startTag19.finaliseTag();
        org.jsoup.nodes.Element element23 = xmlTreeBuilder0.insert(startTag19);
        org.jsoup.parser.Token.Doctype doctype24 = new org.jsoup.parser.Token.Doctype();
        boolean boolean25 = doctype24.forceQuirks;
        org.jsoup.parser.Token.TokenType tokenType26 = org.jsoup.parser.Token.TokenType.EOF;
        doctype24.type = tokenType26;
        org.jsoup.parser.Token token28 = doctype24.reset();
        java.lang.String str29 = doctype24.getSystemIdentifier();
        doctype24.forceQuirks = true;
        java.lang.String str32 = doctype24.getName();
        xmlTreeBuilder0.insert(doctype24);
        org.jsoup.parser.Token.StartTag startTag34 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes36 = null;
        org.jsoup.parser.Token.StartTag startTag37 = startTag34.nameAttr("PUBLIC", attributes36);
        org.jsoup.nodes.DocumentType documentType43 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "<!---->");
        java.lang.String str44 = documentType43.outerHtml();
        org.jsoup.nodes.Attributes attributes45 = documentType43.attributes();
        org.jsoup.parser.Token.StartTag startTag46 = startTag34.nameAttr("Comment", attributes45);
        startTag46.finaliseTag();
        org.jsoup.nodes.Element element48 = xmlTreeBuilder0.insert(startTag46);
        org.jsoup.parser.Token.Tag tag49 = startTag46.reset();
        startTag46.appendTagName('a');
        org.jsoup.nodes.DocumentType documentType56 = new org.jsoup.nodes.DocumentType("hi!", "hi!", "", "<!---->");
        int int57 = documentType56.childNodeSize();
        java.lang.String str58 = documentType56.outerHtml();
        org.jsoup.parser.Token.Doctype doctype59 = new org.jsoup.parser.Token.Doctype();
        boolean boolean60 = doctype59.forceQuirks;
        doctype59.forceQuirks = false;
        java.lang.String str63 = doctype59.getName();
        java.lang.StringBuilder stringBuilder64 = doctype59.name;
        java.lang.StringBuilder stringBuilder65 = documentType56.html(stringBuilder64);
        java.lang.String str67 = documentType56.absUrl("PUBLIC");
        java.util.List<org.jsoup.nodes.Node> nodeList68 = documentType56.siblingNodes();
        java.lang.String str69 = documentType56.nodeName();
        org.jsoup.nodes.Attributes attributes70 = documentType56.attributes();
        startTag46.attributes = attributes70;
        java.lang.String str72 = startTag46.toString();
        org.junit.Assert.assertNotNull(parseSettings1);
        org.junit.Assert.assertNotNull(parseSettings2);
        org.junit.Assert.assertNotNull(parseSettings3);
        org.junit.Assert.assertNotNull(document6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str17, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNotNull(attributes18);
        org.junit.Assert.assertNotNull(startTag19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "<!doctype hi! public \"hi!\">" + "'", str20, "<!doctype hi! public \"hi!\">");
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + tokenType26 + "' != '" + org.jsoup.parser.Token.TokenType.EOF + "'", tokenType26.equals(org.jsoup.parser.Token.TokenType.EOF));
        org.junit.Assert.assertNotNull(token28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertNotNull(startTag37);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str44, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNotNull(attributes45);
        org.junit.Assert.assertNotNull(startTag46);
        org.junit.Assert.assertNotNull(element48);
        org.junit.Assert.assertNotNull(tag49);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "<!DOCTYPE hi! PUBLIC \"hi!\">" + "'", str58, "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "" + "'", str63, "");
        org.junit.Assert.assertNotNull(stringBuilder64);
        org.junit.Assert.assertEquals(stringBuilder64.toString(), "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertNotNull(stringBuilder65);
        org.junit.Assert.assertEquals(stringBuilder65.toString(), "<!DOCTYPE hi! PUBLIC \"hi!\">");
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "" + "'", str67, "");
        org.junit.Assert.assertNotNull(nodeList68);
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "#doctype" + "'", str69, "#doctype");
        org.junit.Assert.assertNotNull(attributes70);
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "<a  name=\"hi!\" publicId=\"hi!\" systemId=\"\">" + "'", str72, "<a  name=\"hi!\" publicId=\"hi!\" systemId=\"\">");
    }
}

