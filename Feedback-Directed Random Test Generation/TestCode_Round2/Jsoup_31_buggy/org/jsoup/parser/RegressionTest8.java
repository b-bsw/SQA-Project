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
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("hi!");
        java.lang.String str2 = endTag1.toString();
        java.lang.String str3 = endTag1.toString();
        boolean boolean4 = endTag1.isDoctype();
        endTag1.appendAttributeName("EOF");
        boolean boolean7 = endTag1.isStartTag();
        boolean boolean8 = endTag1.isCharacter();
        boolean boolean9 = endTag1.isEOF();
        boolean boolean10 = endTag1.isEndTag();
        org.jsoup.parser.Token.EndTag endTag11 = endTag1.asEndTag();
        org.jsoup.parser.Token.StartTag startTag12 = new org.jsoup.parser.Token.StartTag();
        startTag12.appendAttributeName('a');
        startTag12.newAttribute();
        boolean boolean16 = startTag12.isDoctype();
        org.jsoup.parser.Token.StartTag startTag18 = new org.jsoup.parser.Token.StartTag();
        startTag18.appendTagName('4');
        java.lang.String str21 = startTag18.name();
        org.jsoup.nodes.Attributes attributes22 = startTag18.attributes;
        org.jsoup.parser.Token.StartTag startTag23 = new org.jsoup.parser.Token.StartTag("hi!", attributes22);
        startTag12.attributes = attributes22;
        org.jsoup.parser.Token.StartTag startTag26 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag28 = startTag26.name("hi!");
        org.jsoup.nodes.Attributes attributes29 = tag28.attributes;
        org.jsoup.parser.Token.StartTag startTag30 = new org.jsoup.parser.Token.StartTag("", attributes29);
        startTag12.attributes = attributes29;
        endTag11.attributes = attributes29;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "</hi!>" + "'", str2, "</hi!>");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "</hi!>" + "'", str3, "</hi!>");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(endTag11);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "4" + "'", str21, "4");
        org.junit.Assert.assertNotNull(attributes22);
        org.junit.Assert.assertNotNull(tag28);
        org.junit.Assert.assertNotNull(attributes29);
    }

    @Test
    public void test4002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4002");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("hi!");
        java.lang.String str2 = endTag1.toString();
        endTag1.appendTagName(' ');
        java.lang.String str5 = endTag1.tokenType();
        endTag1.appendAttributeName('a');
        java.lang.String str8 = endTag1.toString();
        org.jsoup.parser.Token.Tag tag10 = endTag1.name("hi!4#");
        org.jsoup.parser.Token.TokenType tokenType11 = endTag1.type;
        endTag1.appendAttributeName('a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "</hi!>" + "'", str2, "</hi!>");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "EndTag" + "'", str5, "EndTag");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "</hi! >" + "'", str8, "</hi! >");
        org.junit.Assert.assertNotNull(tag10);
        org.junit.Assert.assertTrue("'" + tokenType11 + "' != '" + org.jsoup.parser.Token.TokenType.EndTag + "'", tokenType11.equals(org.jsoup.parser.Token.TokenType.EndTag));
    }

    @Test
    public void test4003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4003");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        xmlTreeBuilder0.initialiseParse("</hi!>", "EOF", parseErrorList3);
        org.jsoup.parser.Token.StartTag startTag5 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag7 = startTag5.name("hi!");
        boolean boolean8 = xmlTreeBuilder0.process((org.jsoup.parser.Token) startTag5);
        org.jsoup.parser.Token.StartTag startTag9 = new org.jsoup.parser.Token.StartTag();
        startTag9.appendTagName('4');
        org.jsoup.nodes.Element element12 = xmlTreeBuilder0.insert(startTag9);
        org.jsoup.parser.Token.Character character14 = new org.jsoup.parser.Token.Character("EOF");
        java.lang.String str15 = character14.getData();
        java.lang.String str16 = character14.toString();
        boolean boolean17 = character14.isStartTag();
        java.lang.String str18 = character14.getData();
        java.lang.String str19 = character14.toString();
        org.jsoup.parser.Token.Character character20 = character14.asCharacter();
        java.lang.String str21 = character14.toString();
        java.lang.String str22 = character14.toString();
        xmlTreeBuilder0.insert(character14);
        org.jsoup.parser.Token.Character character25 = new org.jsoup.parser.Token.Character("EOF");
        java.lang.String str26 = character25.getData();
        java.lang.String str27 = character25.toString();
        boolean boolean28 = character25.isStartTag();
        java.lang.String str29 = character25.getData();
        java.lang.String str30 = character25.toString();
        xmlTreeBuilder0.insert(character25);
        org.jsoup.parser.Token.Comment comment32 = new org.jsoup.parser.Token.Comment();
        xmlTreeBuilder0.insert(comment32);
        org.jsoup.parser.Token.Character character35 = new org.jsoup.parser.Token.Character("EOF");
        java.lang.String str36 = character35.getData();
        java.lang.String str37 = character35.toString();
        boolean boolean38 = character35.isStartTag();
        java.lang.String str39 = character35.getData();
        xmlTreeBuilder0.insert(character35);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder41 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList44 = null;
        xmlTreeBuilder41.initialiseParse("</hi!>", "EOF", parseErrorList44);
        org.jsoup.parser.Token.StartTag startTag46 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag48 = startTag46.name("hi!");
        boolean boolean49 = xmlTreeBuilder41.process((org.jsoup.parser.Token) startTag46);
        org.jsoup.parser.Token.StartTag startTag50 = new org.jsoup.parser.Token.StartTag();
        startTag50.appendTagName('4');
        org.jsoup.nodes.Element element53 = xmlTreeBuilder41.insert(startTag50);
        org.jsoup.parser.ParseErrorList parseErrorList56 = null;
        xmlTreeBuilder41.initialiseParse("Character", "Doctype", parseErrorList56);
        org.jsoup.parser.Token.Comment comment58 = new org.jsoup.parser.Token.Comment();
        java.lang.StringBuilder stringBuilder59 = comment58.data;
        xmlTreeBuilder41.insert(comment58);
        java.lang.String str61 = comment58.toString();
        java.lang.StringBuilder stringBuilder62 = comment58.data;
        boolean boolean63 = comment58.isCharacter();
        java.lang.String str64 = comment58.toString();
        xmlTreeBuilder0.insert(comment58);
        java.lang.StringBuilder stringBuilder66 = comment58.data;
        org.junit.Assert.assertNotNull(tag7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "EOF" + "'", str15, "EOF");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "EOF" + "'", str16, "EOF");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "EOF" + "'", str18, "EOF");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "EOF" + "'", str19, "EOF");
        org.junit.Assert.assertNotNull(character20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "EOF" + "'", str21, "EOF");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "EOF" + "'", str22, "EOF");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "EOF" + "'", str26, "EOF");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "EOF" + "'", str27, "EOF");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "EOF" + "'", str29, "EOF");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "EOF" + "'", str30, "EOF");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "EOF" + "'", str36, "EOF");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "EOF" + "'", str37, "EOF");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "EOF" + "'", str39, "EOF");
        org.junit.Assert.assertNotNull(tag48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNotNull(element53);
        org.junit.Assert.assertNotNull(stringBuilder59);
        org.junit.Assert.assertEquals(stringBuilder59.toString(), "");
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "<!---->" + "'", str61, "<!---->");
        org.junit.Assert.assertNotNull(stringBuilder62);
        org.junit.Assert.assertEquals(stringBuilder62.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "<!---->" + "'", str64, "<!---->");
        org.junit.Assert.assertNotNull(stringBuilder66);
        org.junit.Assert.assertEquals(stringBuilder66.toString(), "");
    }

    @Test
    public void test4004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4004");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        boolean boolean1 = doctype0.forceQuirks;
        java.lang.StringBuilder stringBuilder2 = doctype0.systemIdentifier;
        org.jsoup.parser.Token.Doctype doctype3 = doctype0.asDoctype();
        java.lang.StringBuilder stringBuilder4 = doctype3.systemIdentifier;
        java.lang.String str5 = doctype3.getSystemIdentifier();
        java.lang.String str6 = doctype3.getSystemIdentifier();
        boolean boolean7 = doctype3.forceQuirks;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertNotNull(doctype3);
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test4005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4005");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        xmlTreeBuilder0.initialiseParse("</hi!>", "EOF", parseErrorList3);
        org.jsoup.parser.Token.StartTag startTag5 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag7 = startTag5.name("hi!");
        boolean boolean8 = xmlTreeBuilder0.process((org.jsoup.parser.Token) startTag5);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder9 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList12 = null;
        xmlTreeBuilder9.initialiseParse("Character", "hi!", parseErrorList12);
        org.jsoup.parser.Token.Comment comment14 = new org.jsoup.parser.Token.Comment();
        java.lang.StringBuilder stringBuilder15 = comment14.data;
        java.lang.String str16 = comment14.getData();
        xmlTreeBuilder9.insert(comment14);
        xmlTreeBuilder0.insert(comment14);
        org.jsoup.nodes.Attributes attributes22 = null;
        org.jsoup.parser.Token.StartTag startTag23 = new org.jsoup.parser.Token.StartTag("", attributes22);
        startTag23.selfClosing = false;
        startTag23.appendTagName("</hi!>");
        startTag23.newAttribute();
        org.jsoup.nodes.Attributes attributes29 = startTag23.getAttributes();
        org.jsoup.parser.Token.StartTag startTag30 = new org.jsoup.parser.Token.StartTag("Doctype", attributes29);
        org.jsoup.parser.Token.StartTag startTag31 = new org.jsoup.parser.Token.StartTag("hi!", attributes29);
        boolean boolean32 = startTag31.isEndTag();
        org.jsoup.nodes.Element element33 = xmlTreeBuilder0.insert(startTag31);
        org.jsoup.parser.Token.Character character35 = new org.jsoup.parser.Token.Character("EOF");
        java.lang.String str36 = character35.getData();
        java.lang.String str37 = character35.toString();
        boolean boolean38 = character35.isStartTag();
        java.lang.String str39 = character35.toString();
        java.lang.String str40 = character35.toString();
        boolean boolean41 = character35.isCharacter();
        java.lang.String str42 = character35.getData();
        xmlTreeBuilder0.insert(character35);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Doctype doctype44 = character35.asDoctype();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$Character cannot be cast to class org.jsoup.parser.Token$Doctype (org.jsoup.parser.Token$Character and org.jsoup.parser.Token$Doctype are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tag7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(stringBuilder15);
        org.junit.Assert.assertEquals(stringBuilder15.toString(), "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(attributes29);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(element33);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "EOF" + "'", str36, "EOF");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "EOF" + "'", str37, "EOF");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "EOF" + "'", str39, "EOF");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "EOF" + "'", str40, "EOF");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "EOF" + "'", str42, "EOF");
    }

    @Test
    public void test4006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4006");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.parser.Token.StartTag startTag3 = new org.jsoup.parser.Token.StartTag("", attributes2);
        startTag3.selfClosing = false;
        startTag3.appendTagName("</hi!>");
        startTag3.newAttribute();
        org.jsoup.nodes.Attributes attributes9 = startTag3.getAttributes();
        org.jsoup.parser.Token.StartTag startTag10 = new org.jsoup.parser.Token.StartTag("Doctype", attributes9);
        startTag10.selfClosing = true;
        java.lang.String str13 = startTag10.toString();
        org.jsoup.nodes.Attributes attributes14 = startTag10.getAttributes();
        boolean boolean15 = startTag10.isEOF();
        java.lang.String str16 = startTag10.toString();
        org.jsoup.parser.Token.Tag tag18 = startTag10.name("Comment");
        org.jsoup.parser.Token.StartTag startTag19 = tag18.asStartTag();
        org.junit.Assert.assertNotNull(attributes9);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "<Doctype>" + "'", str13, "<Doctype>");
        org.junit.Assert.assertNotNull(attributes14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "<Doctype>" + "'", str16, "<Doctype>");
        org.junit.Assert.assertNotNull(tag18);
        org.junit.Assert.assertNotNull(startTag19);
    }

    @Test
    public void test4007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4007");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.appendAttributeName('a');
        java.lang.String str3 = startTag0.tagName;
        boolean boolean4 = startTag0.isEndTag();
        startTag0.appendAttributeName("<</hi!>4>");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test4008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4008");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        boolean boolean1 = doctype0.forceQuirks;
        java.lang.StringBuilder stringBuilder2 = doctype0.systemIdentifier;
        boolean boolean3 = doctype0.forceQuirks;
        boolean boolean4 = doctype0.isForceQuirks();
        java.lang.StringBuilder stringBuilder5 = doctype0.publicIdentifier;
        java.lang.String str6 = doctype0.getSystemIdentifier();
        java.lang.StringBuilder stringBuilder7 = doctype0.systemIdentifier;
        boolean boolean8 = doctype0.isEndTag();
        boolean boolean9 = doctype0.forceQuirks;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.StartTag startTag10 = doctype0.asStartTag();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$Doctype cannot be cast to class org.jsoup.parser.Token$StartTag (org.jsoup.parser.Token$Doctype and org.jsoup.parser.Token$StartTag are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(stringBuilder7);
        org.junit.Assert.assertEquals(stringBuilder7.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test4009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4009");
        org.jsoup.nodes.Attributes attributes1 = null;
        org.jsoup.parser.Token.StartTag startTag2 = new org.jsoup.parser.Token.StartTag("", attributes1);
        boolean boolean3 = startTag2.isDoctype();
        java.lang.String str4 = startTag2.tagName;
        org.jsoup.parser.Token.TokenType tokenType5 = startTag2.type;
        startTag2.appendTagName(' ');
        boolean boolean8 = startTag2.isDoctype();
        startTag2.tagName = "Character";
        startTag2.newAttribute();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + tokenType5 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType5.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test4010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4010");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        xmlTreeBuilder0.initialiseParse("Character", "hi!", parseErrorList3);
        org.jsoup.parser.Token.Comment comment5 = new org.jsoup.parser.Token.Comment();
        java.lang.StringBuilder stringBuilder6 = comment5.data;
        java.lang.String str7 = comment5.getData();
        xmlTreeBuilder0.insert(comment5);
        org.jsoup.parser.Token.StartTag startTag9 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag11 = startTag9.name("hi!");
        startTag9.appendAttributeName(' ');
        boolean boolean14 = startTag9.isComment();
        org.jsoup.nodes.Element element15 = xmlTreeBuilder0.insert(startTag9);
        startTag9.finaliseTag();
        startTag9.tagName = "";
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(tag11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(element15);
    }

    @Test
    public void test4011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4011");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("hi!a");
        endTag1.tagName = "</hi!hi!a>";
        java.lang.String str4 = endTag1.name();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "</hi!hi!a>" + "'", str4, "</hi!hi!a>");
    }

    @Test
    public void test4012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4012");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("<4>");
        org.jsoup.nodes.Attributes attributes3 = null;
        org.jsoup.parser.Token.StartTag startTag4 = new org.jsoup.parser.Token.StartTag("", attributes3);
        boolean boolean5 = startTag4.isDoctype();
        java.lang.String str6 = startTag4.tagName;
        org.jsoup.parser.Token.TokenType tokenType7 = startTag4.type;
        startTag4.appendTagName(' ');
        boolean boolean10 = startTag4.isDoctype();
        org.jsoup.parser.Token.StartTag startTag12 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag14 = startTag12.name("hi!");
        org.jsoup.nodes.Attributes attributes15 = tag14.attributes;
        org.jsoup.parser.Token.StartTag startTag16 = new org.jsoup.parser.Token.StartTag("", attributes15);
        startTag4.attributes = attributes15;
        endTag1.attributes = attributes15;
        org.jsoup.nodes.Attributes attributes19 = endTag1.attributes;
        endTag1.selfClosing = true;
        java.lang.String str22 = endTag1.toString();
        boolean boolean23 = endTag1.selfClosing;
        org.jsoup.nodes.Attributes attributes24 = null;
        endTag1.attributes = attributes24;
        org.jsoup.parser.Token.EndTag endTag27 = new org.jsoup.parser.Token.EndTag("hi!");
        boolean boolean28 = endTag27.selfClosing;
        org.jsoup.parser.Token.Tag tag30 = endTag27.name("");
        boolean boolean31 = endTag27.isEndTag();
        org.jsoup.parser.Token.Tag tag33 = endTag27.name("<4>");
        java.lang.String str34 = endTag27.tokenType();
        endTag27.selfClosing = false;
        org.jsoup.nodes.Attributes attributes38 = null;
        org.jsoup.parser.Token.StartTag startTag39 = new org.jsoup.parser.Token.StartTag("", attributes38);
        startTag39.selfClosing = false;
        startTag39.newAttribute();
        org.jsoup.parser.Token.StartTag startTag44 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag46 = startTag44.name("hi!");
        org.jsoup.nodes.Attributes attributes47 = tag46.attributes;
        org.jsoup.parser.Token.StartTag startTag48 = new org.jsoup.parser.Token.StartTag("", attributes47);
        startTag39.attributes = attributes47;
        org.jsoup.nodes.Attributes attributes50 = startTag39.getAttributes();
        endTag27.attributes = attributes50;
        endTag1.attributes = attributes50;
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + tokenType7 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType7.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(tag14);
        org.junit.Assert.assertNotNull(attributes15);
        org.junit.Assert.assertNotNull(attributes19);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "</<4>>" + "'", str22, "</<4>>");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(tag30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(tag33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "EndTag" + "'", str34, "EndTag");
        org.junit.Assert.assertNotNull(tag46);
        org.junit.Assert.assertNotNull(attributes47);
        org.junit.Assert.assertNotNull(attributes50);
    }

    @Test
    public void test4013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4013");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.tokenType();
        boolean boolean2 = doctype0.isForceQuirks();
        java.lang.String str3 = doctype0.getPublicIdentifier();
        java.lang.String str4 = doctype0.getSystemIdentifier();
        java.lang.String str5 = doctype0.tokenType();
        org.jsoup.parser.Token.EndTag endTag7 = new org.jsoup.parser.Token.EndTag("hi!");
        boolean boolean8 = endTag7.selfClosing;
        java.lang.String str9 = endTag7.toString();
        java.lang.String str10 = endTag7.toString();
        boolean boolean11 = endTag7.isEOF();
        org.jsoup.parser.Token.Doctype doctype12 = new org.jsoup.parser.Token.Doctype();
        java.lang.StringBuilder stringBuilder13 = doctype12.name;
        org.jsoup.parser.Token.TokenType tokenType14 = org.jsoup.parser.Token.TokenType.StartTag;
        doctype12.type = tokenType14;
        endTag7.type = tokenType14;
        doctype0.type = tokenType14;
        boolean boolean18 = doctype0.forceQuirks;
        boolean boolean19 = doctype0.isComment();
        boolean boolean20 = doctype0.isStartTag();
        boolean boolean21 = doctype0.isEndTag();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.EndTag endTag22 = doctype0.asEndTag();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$Doctype cannot be cast to class org.jsoup.parser.Token$EndTag (org.jsoup.parser.Token$Doctype and org.jsoup.parser.Token$EndTag are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Doctype" + "'", str1, "Doctype");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Doctype" + "'", str5, "Doctype");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "</hi!>" + "'", str9, "</hi!>");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "</hi!>" + "'", str10, "</hi!>");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(stringBuilder13);
        org.junit.Assert.assertEquals(stringBuilder13.toString(), "");
        org.junit.Assert.assertTrue("'" + tokenType14 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType14.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test4014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4014");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        boolean boolean1 = doctype0.forceQuirks;
        java.lang.StringBuilder stringBuilder2 = doctype0.systemIdentifier;
        boolean boolean3 = doctype0.isCharacter();
        doctype0.forceQuirks = false;
        boolean boolean6 = doctype0.isEOF();
        java.lang.String str7 = doctype0.tokenType();
        java.lang.StringBuilder stringBuilder8 = doctype0.systemIdentifier;
        boolean boolean9 = doctype0.isEOF();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Doctype" + "'", str7, "Doctype");
        org.junit.Assert.assertNotNull(stringBuilder8);
        org.junit.Assert.assertEquals(stringBuilder8.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test4015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4015");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag2 = startTag0.name("hi!");
        org.jsoup.parser.Token.Tag tag4 = startTag0.name("<<hi!>>");
        org.jsoup.parser.Token.Tag tag6 = tag4.name("<!---->");
        boolean boolean7 = tag6.isDoctype();
        org.junit.Assert.assertNotNull(tag2);
        org.junit.Assert.assertNotNull(tag4);
        org.junit.Assert.assertNotNull(tag6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test4016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4016");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("hi!");
        boolean boolean2 = endTag1.selfClosing;
        java.lang.String str3 = endTag1.toString();
        java.lang.String str4 = endTag1.toString();
        endTag1.appendAttributeValue("<4>");
        java.lang.String str7 = endTag1.toString();
        org.jsoup.parser.Token.TokenType tokenType8 = endTag1.type;
        boolean boolean9 = endTag1.isSelfClosing();
        java.lang.String str10 = endTag1.toString();
        endTag1.appendAttributeName('a');
        org.jsoup.nodes.Attributes attributes13 = endTag1.attributes;
        boolean boolean14 = endTag1.selfClosing;
        boolean boolean15 = endTag1.selfClosing;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "</hi!>" + "'", str3, "</hi!>");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "</hi!>" + "'", str4, "</hi!>");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "</hi!>" + "'", str7, "</hi!>");
        org.junit.Assert.assertTrue("'" + tokenType8 + "' != '" + org.jsoup.parser.Token.TokenType.EndTag + "'", tokenType8.equals(org.jsoup.parser.Token.TokenType.EndTag));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "</hi!>" + "'", str10, "</hi!>");
        org.junit.Assert.assertNull(attributes13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test4017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4017");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.parser.Token.StartTag startTag3 = new org.jsoup.parser.Token.StartTag("", attributes2);
        startTag3.selfClosing = false;
        startTag3.appendTagName("</hi!>");
        startTag3.newAttribute();
        org.jsoup.nodes.Attributes attributes9 = startTag3.getAttributes();
        org.jsoup.parser.Token.StartTag startTag10 = new org.jsoup.parser.Token.StartTag("Doctype", attributes9);
        startTag10.selfClosing = true;
        java.lang.String str13 = startTag10.toString();
        org.jsoup.parser.Token.StartTag startTag14 = startTag10.asStartTag();
        startTag10.appendAttributeValue("<hi!4>");
        org.junit.Assert.assertNotNull(attributes9);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "<Doctype>" + "'", str13, "<Doctype>");
        org.junit.Assert.assertNotNull(startTag14);
    }

    @Test
    public void test4018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4018");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        boolean boolean1 = doctype0.forceQuirks;
        java.lang.StringBuilder stringBuilder2 = doctype0.systemIdentifier;
        boolean boolean3 = doctype0.forceQuirks;
        boolean boolean4 = doctype0.isForceQuirks();
        java.lang.StringBuilder stringBuilder5 = doctype0.publicIdentifier;
        java.lang.String str6 = doctype0.getSystemIdentifier();
        org.jsoup.parser.Token.TokenType tokenType7 = doctype0.type;
        org.jsoup.parser.Token.Doctype doctype8 = doctype0.asDoctype();
        boolean boolean9 = doctype8.isComment();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + tokenType7 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType7.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertNotNull(doctype8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test4019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4019");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("</</4>>");
    }

    @Test
    public void test4020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4020");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag(" ");
    }

    @Test
    public void test4021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4021");
        org.jsoup.nodes.Attributes attributes4 = null;
        org.jsoup.parser.Token.StartTag startTag5 = new org.jsoup.parser.Token.StartTag("", attributes4);
        startTag5.selfClosing = false;
        startTag5.appendTagName("</hi!>");
        startTag5.newAttribute();
        org.jsoup.nodes.Attributes attributes11 = startTag5.getAttributes();
        org.jsoup.parser.Token.StartTag startTag12 = new org.jsoup.parser.Token.StartTag("Doctype", attributes11);
        org.jsoup.parser.Token.StartTag startTag13 = new org.jsoup.parser.Token.StartTag("hi!", attributes11);
        org.jsoup.parser.Token.StartTag startTag14 = new org.jsoup.parser.Token.StartTag("</hi!>4", attributes11);
        org.jsoup.parser.Token.Tag tag16 = startTag14.name("<!---->");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Character character17 = tag16.asCharacter();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$Character (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$Character are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(attributes11);
        org.junit.Assert.assertNotNull(tag16);
    }

    @Test
    public void test4022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4022");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag2 = startTag0.name("hi!");
        startTag0.appendAttributeName(' ');
        startTag0.appendAttributeValue('#');
        startTag0.appendAttributeName('#');
        org.jsoup.nodes.Attributes attributes9 = startTag0.attributes;
        org.jsoup.parser.Token.StartTag startTag10 = startTag0.asStartTag();
        boolean boolean11 = startTag0.selfClosing;
        org.jsoup.nodes.Attributes attributes13 = null;
        org.jsoup.parser.Token.StartTag startTag14 = new org.jsoup.parser.Token.StartTag("", attributes13);
        org.jsoup.parser.Token.StartTag startTag15 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag17 = startTag15.name("hi!");
        org.jsoup.nodes.Attributes attributes18 = tag17.attributes;
        startTag14.attributes = attributes18;
        org.jsoup.parser.Token.TokenType tokenType20 = startTag14.type;
        startTag0.type = tokenType20;
        org.junit.Assert.assertNotNull(tag2);
        org.junit.Assert.assertNotNull(attributes9);
        org.junit.Assert.assertNotNull(startTag10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(tag17);
        org.junit.Assert.assertNotNull(attributes18);
        org.junit.Assert.assertTrue("'" + tokenType20 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType20.equals(org.jsoup.parser.Token.TokenType.StartTag));
    }

    @Test
    public void test4023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4023");
        org.jsoup.parser.Token.StartTag startTag1 = new org.jsoup.parser.Token.StartTag("<<</hi! >>>");
    }

    @Test
    public void test4024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4024");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("<4>");
        org.jsoup.nodes.Attributes attributes3 = null;
        org.jsoup.parser.Token.StartTag startTag4 = new org.jsoup.parser.Token.StartTag("", attributes3);
        boolean boolean5 = startTag4.isDoctype();
        java.lang.String str6 = startTag4.tagName;
        org.jsoup.parser.Token.TokenType tokenType7 = startTag4.type;
        startTag4.appendTagName(' ');
        boolean boolean10 = startTag4.isDoctype();
        org.jsoup.parser.Token.StartTag startTag12 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag14 = startTag12.name("hi!");
        org.jsoup.nodes.Attributes attributes15 = tag14.attributes;
        org.jsoup.parser.Token.StartTag startTag16 = new org.jsoup.parser.Token.StartTag("", attributes15);
        startTag4.attributes = attributes15;
        endTag1.attributes = attributes15;
        org.jsoup.nodes.Attributes attributes19 = endTag1.attributes;
        endTag1.selfClosing = true;
        java.lang.String str22 = endTag1.toString();
        boolean boolean23 = endTag1.isComment();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + tokenType7 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType7.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(tag14);
        org.junit.Assert.assertNotNull(attributes15);
        org.junit.Assert.assertNotNull(attributes19);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "</<4>>" + "'", str22, "</<4>>");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test4025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4025");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.tokenType();
        org.jsoup.parser.Token.Doctype doctype2 = doctype0.asDoctype();
        boolean boolean3 = doctype2.isForceQuirks();
        java.lang.StringBuilder stringBuilder4 = doctype2.name;
        doctype2.forceQuirks = false;
        boolean boolean7 = doctype2.isEOF();
        boolean boolean8 = doctype2.isCharacter();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Doctype" + "'", str1, "Doctype");
        org.junit.Assert.assertNotNull(doctype2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test4026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4026");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.tokenType();
        boolean boolean2 = doctype0.isForceQuirks();
        java.lang.String str3 = doctype0.getPublicIdentifier();
        boolean boolean4 = doctype0.isForceQuirks();
        doctype0.forceQuirks = true;
        org.jsoup.parser.Token.Doctype doctype7 = doctype0.asDoctype();
        boolean boolean8 = doctype7.isForceQuirks();
        java.lang.String str9 = doctype7.getName();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Doctype" + "'", str1, "Doctype");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(doctype7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test4027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4027");
        org.jsoup.parser.Token.StartTag startTag2 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag4 = startTag2.name("hi!");
        org.jsoup.nodes.Attributes attributes5 = tag4.attributes;
        org.jsoup.parser.Token.StartTag startTag6 = new org.jsoup.parser.Token.StartTag("</hi!>", attributes5);
        org.jsoup.parser.Token.StartTag startTag7 = new org.jsoup.parser.Token.StartTag("", attributes5);
        java.lang.String str8 = startTag7.tokenType();
        org.jsoup.parser.Token.TokenType tokenType9 = startTag7.type;
        java.lang.String str10 = startTag7.tagName;
        java.lang.String str11 = startTag7.tagName;
        org.jsoup.nodes.Attributes attributes12 = startTag7.getAttributes();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = startTag7.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must be false");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tag4);
        org.junit.Assert.assertNotNull(attributes5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "StartTag" + "'", str8, "StartTag");
        org.junit.Assert.assertTrue("'" + tokenType9 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType9.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(attributes12);
    }

    @Test
    public void test4028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4028");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        boolean boolean1 = doctype0.forceQuirks;
        java.lang.StringBuilder stringBuilder2 = doctype0.systemIdentifier;
        boolean boolean3 = doctype0.isCharacter();
        doctype0.forceQuirks = false;
        java.lang.StringBuilder stringBuilder6 = doctype0.publicIdentifier;
        boolean boolean7 = doctype0.isStartTag();
        java.lang.StringBuilder stringBuilder8 = doctype0.publicIdentifier;
        java.lang.String str9 = doctype0.getSystemIdentifier();
        java.lang.String str10 = doctype0.getPublicIdentifier();
        java.lang.String str11 = doctype0.getSystemIdentifier();
        doctype0.forceQuirks = true;
        java.lang.StringBuilder stringBuilder14 = doctype0.systemIdentifier;
        java.lang.String str15 = doctype0.getName();
        boolean boolean16 = doctype0.isStartTag();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(stringBuilder8);
        org.junit.Assert.assertEquals(stringBuilder8.toString(), "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(stringBuilder14);
        org.junit.Assert.assertEquals(stringBuilder14.toString(), "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test4029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4029");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.tokenType();
        java.lang.StringBuilder stringBuilder2 = doctype0.publicIdentifier;
        java.lang.String str3 = doctype0.getName();
        java.lang.String str4 = doctype0.getSystemIdentifier();
        doctype0.forceQuirks = true;
        java.lang.String str7 = doctype0.getSystemIdentifier();
        java.lang.StringBuilder stringBuilder8 = doctype0.publicIdentifier;
        boolean boolean9 = doctype0.isEOF();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Doctype" + "'", str1, "Doctype");
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(stringBuilder8);
        org.junit.Assert.assertEquals(stringBuilder8.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test4030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4030");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder1 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList4 = null;
        xmlTreeBuilder1.initialiseParse("</hi!>", "EOF", parseErrorList4);
        org.jsoup.parser.Token.StartTag startTag6 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag8 = startTag6.name("hi!");
        boolean boolean9 = xmlTreeBuilder1.process((org.jsoup.parser.Token) startTag6);
        boolean boolean10 = startTag6.isDoctype();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder11 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList14 = null;
        xmlTreeBuilder11.initialiseParse("</hi!>", "EOF", parseErrorList14);
        org.jsoup.parser.Token.StartTag startTag16 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag18 = startTag16.name("hi!");
        boolean boolean19 = xmlTreeBuilder11.process((org.jsoup.parser.Token) startTag16);
        org.jsoup.parser.Token.StartTag startTag20 = new org.jsoup.parser.Token.StartTag();
        startTag20.appendTagName('4');
        org.jsoup.nodes.Element element23 = xmlTreeBuilder11.insert(startTag20);
        startTag20.newAttribute();
        org.jsoup.parser.Token.StartTag startTag26 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag28 = startTag26.name("hi!");
        org.jsoup.nodes.Attributes attributes29 = tag28.attributes;
        org.jsoup.parser.Token.StartTag startTag30 = new org.jsoup.parser.Token.StartTag("", attributes29);
        startTag20.attributes = attributes29;
        startTag6.attributes = attributes29;
        org.jsoup.parser.Token.StartTag startTag33 = new org.jsoup.parser.Token.StartTag("4", attributes29);
        boolean boolean34 = startTag33.isSelfClosing();
        org.jsoup.nodes.Attributes attributes35 = startTag33.attributes;
        startTag33.appendTagName("EOF");
        org.junit.Assert.assertNotNull(tag8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(tag18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertNotNull(tag28);
        org.junit.Assert.assertNotNull(attributes29);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(attributes35);
    }

    @Test
    public void test4031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4031");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder1 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList4 = null;
        xmlTreeBuilder1.initialiseParse("</hi!>", "EOF", parseErrorList4);
        org.jsoup.parser.Token.StartTag startTag6 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag8 = startTag6.name("hi!");
        boolean boolean9 = xmlTreeBuilder1.process((org.jsoup.parser.Token) startTag6);
        org.jsoup.parser.Token.StartTag startTag10 = new org.jsoup.parser.Token.StartTag();
        startTag10.appendTagName('4');
        org.jsoup.nodes.Element element13 = xmlTreeBuilder1.insert(startTag10);
        org.jsoup.nodes.Attributes attributes14 = startTag10.getAttributes();
        org.jsoup.parser.Token.StartTag startTag15 = new org.jsoup.parser.Token.StartTag("</hi!4#>", attributes14);
        org.junit.Assert.assertNotNull(tag8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(attributes14);
    }

    @Test
    public void test4032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4032");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        boolean boolean1 = endTag0.isDoctype();
        endTag0.selfClosing = false;
        endTag0.appendAttributeName('4');
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4033");
        org.jsoup.nodes.Attributes attributes1 = null;
        org.jsoup.parser.Token.StartTag startTag2 = new org.jsoup.parser.Token.StartTag("", attributes1);
        org.jsoup.parser.Token.Tag tag4 = startTag2.name("hi!");
        tag4.tagName = "</hi!>";
        tag4.newAttribute();
        boolean boolean8 = tag4.selfClosing;
        org.junit.Assert.assertNotNull(tag4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test4034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4034");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("hi!");
        java.lang.String str2 = endTag1.toString();
        boolean boolean3 = endTag1.isEOF();
        endTag1.appendAttributeName("<Doctype>");
        boolean boolean6 = endTag1.isCharacter();
        endTag1.finaliseTag();
        endTag1.selfClosing = true;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "</hi!>" + "'", str2, "</hi!>");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test4035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4035");
        org.jsoup.parser.Token.StartTag startTag3 = new org.jsoup.parser.Token.StartTag("</Doctype>");
        startTag3.selfClosing = true;
        org.jsoup.nodes.Attributes attributes6 = startTag3.getAttributes();
        org.jsoup.parser.Token.StartTag startTag7 = new org.jsoup.parser.Token.StartTag("<hi!  =\"#\">", attributes6);
        org.jsoup.parser.Token.StartTag startTag8 = new org.jsoup.parser.Token.StartTag("Commenta", attributes6);
        org.junit.Assert.assertNotNull(attributes6);
    }

    @Test
    public void test4036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4036");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("4");
        boolean boolean2 = endTag1.selfClosing;
        endTag1.newAttribute();
        org.jsoup.parser.Token.EndTag endTag5 = new org.jsoup.parser.Token.EndTag("hi!");
        boolean boolean6 = endTag5.selfClosing;
        java.lang.String str7 = endTag5.toString();
        org.jsoup.parser.Token.StartTag startTag8 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag10 = startTag8.name("hi!");
        tag10.finaliseTag();
        tag10.newAttribute();
        org.jsoup.nodes.Attributes attributes13 = tag10.attributes;
        endTag5.attributes = attributes13;
        endTag1.attributes = attributes13;
        endTag1.selfClosing = false;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "</hi!>" + "'", str7, "</hi!>");
        org.junit.Assert.assertNotNull(tag10);
        org.junit.Assert.assertNotNull(attributes13);
    }

    @Test
    public void test4037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4037");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.tokenType();
        java.lang.StringBuilder stringBuilder2 = doctype0.publicIdentifier;
        java.lang.String str3 = doctype0.getName();
        java.lang.String str4 = doctype0.getSystemIdentifier();
        doctype0.forceQuirks = true;
        java.lang.String str7 = doctype0.getSystemIdentifier();
        java.lang.StringBuilder stringBuilder8 = doctype0.publicIdentifier;
        boolean boolean9 = doctype0.isEndTag();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Doctype" + "'", str1, "Doctype");
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(stringBuilder8);
        org.junit.Assert.assertEquals(stringBuilder8.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test4038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4038");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.tokenType();
        boolean boolean2 = doctype0.isForceQuirks();
        java.lang.String str3 = doctype0.getPublicIdentifier();
        java.lang.String str4 = doctype0.getSystemIdentifier();
        java.lang.String str5 = doctype0.tokenType();
        org.jsoup.parser.Token.EndTag endTag7 = new org.jsoup.parser.Token.EndTag("hi!");
        boolean boolean8 = endTag7.selfClosing;
        java.lang.String str9 = endTag7.toString();
        java.lang.String str10 = endTag7.toString();
        boolean boolean11 = endTag7.isEOF();
        org.jsoup.parser.Token.Doctype doctype12 = new org.jsoup.parser.Token.Doctype();
        java.lang.StringBuilder stringBuilder13 = doctype12.name;
        org.jsoup.parser.Token.TokenType tokenType14 = org.jsoup.parser.Token.TokenType.StartTag;
        doctype12.type = tokenType14;
        endTag7.type = tokenType14;
        doctype0.type = tokenType14;
        boolean boolean18 = doctype0.forceQuirks;
        java.lang.StringBuilder stringBuilder19 = doctype0.name;
        boolean boolean20 = doctype0.isComment();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Doctype" + "'", str1, "Doctype");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Doctype" + "'", str5, "Doctype");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "</hi!>" + "'", str9, "</hi!>");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "</hi!>" + "'", str10, "</hi!>");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(stringBuilder13);
        org.junit.Assert.assertEquals(stringBuilder13.toString(), "");
        org.junit.Assert.assertTrue("'" + tokenType14 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType14.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(stringBuilder19);
        org.junit.Assert.assertEquals(stringBuilder19.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test4039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4039");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("hi!");
        boolean boolean2 = endTag1.selfClosing;
        java.lang.String str3 = endTag1.toString();
        java.lang.String str4 = endTag1.toString();
        endTag1.appendAttributeValue("<4>");
        endTag1.appendAttributeValue("Character");
        org.jsoup.parser.Token.Tag tag10 = endTag1.name("Comment");
        tag10.appendAttributeValue('a');
        org.jsoup.parser.Token.StartTag startTag13 = new org.jsoup.parser.Token.StartTag();
        startTag13.appendAttributeName('a');
        startTag13.newAttribute();
        org.jsoup.parser.Token.TokenType tokenType17 = startTag13.type;
        org.jsoup.parser.Token.EOF eOF18 = new org.jsoup.parser.Token.EOF();
        org.jsoup.parser.Token.TokenType tokenType19 = eOF18.type;
        org.jsoup.parser.Token.TokenType tokenType20 = eOF18.type;
        startTag13.type = tokenType20;
        org.jsoup.nodes.Attributes attributes22 = startTag13.attributes;
        tag10.attributes = attributes22;
        boolean boolean24 = tag10.selfClosing;
        java.lang.String str25 = tag10.tagName;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "</hi!>" + "'", str3, "</hi!>");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "</hi!>" + "'", str4, "</hi!>");
        org.junit.Assert.assertNotNull(tag10);
        org.junit.Assert.assertTrue("'" + tokenType17 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType17.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertTrue("'" + tokenType19 + "' != '" + org.jsoup.parser.Token.TokenType.EOF + "'", tokenType19.equals(org.jsoup.parser.Token.TokenType.EOF));
        org.junit.Assert.assertTrue("'" + tokenType20 + "' != '" + org.jsoup.parser.Token.TokenType.EOF + "'", tokenType20.equals(org.jsoup.parser.Token.TokenType.EOF));
        org.junit.Assert.assertNotNull(attributes22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Comment" + "'", str25, "Comment");
    }

    @Test
    public void test4040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4040");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.parser.Token.StartTag startTag3 = new org.jsoup.parser.Token.StartTag("", attributes2);
        startTag3.selfClosing = false;
        startTag3.appendTagName("</hi!>");
        startTag3.newAttribute();
        org.jsoup.nodes.Attributes attributes9 = startTag3.getAttributes();
        org.jsoup.parser.Token.StartTag startTag10 = new org.jsoup.parser.Token.StartTag("4", attributes9);
        org.jsoup.parser.Token.Tag tag12 = startTag10.name("<Doctype>");
        tag12.tagName = "<</Doctype>>";
        boolean boolean15 = tag12.isSelfClosing();
        org.junit.Assert.assertNotNull(attributes9);
        org.junit.Assert.assertNotNull(tag12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test4041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4041");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        boolean boolean1 = doctype0.forceQuirks;
        java.lang.StringBuilder stringBuilder2 = doctype0.systemIdentifier;
        boolean boolean3 = doctype0.isCharacter();
        doctype0.forceQuirks = false;
        java.lang.StringBuilder stringBuilder6 = doctype0.publicIdentifier;
        boolean boolean7 = doctype0.isStartTag();
        java.lang.StringBuilder stringBuilder8 = doctype0.publicIdentifier;
        java.lang.String str9 = doctype0.getSystemIdentifier();
        java.lang.String str10 = doctype0.getPublicIdentifier();
        java.lang.String str11 = doctype0.getSystemIdentifier();
        java.lang.String str12 = doctype0.getName();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.StartTag startTag13 = doctype0.asStartTag();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$Doctype cannot be cast to class org.jsoup.parser.Token$StartTag (org.jsoup.parser.Token$Doctype and org.jsoup.parser.Token$StartTag are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(stringBuilder8);
        org.junit.Assert.assertEquals(stringBuilder8.toString(), "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test4042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4042");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder2 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList5 = null;
        xmlTreeBuilder2.initialiseParse("</hi!>", "EOF", parseErrorList5);
        org.jsoup.parser.Token.StartTag startTag7 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag9 = startTag7.name("hi!");
        boolean boolean10 = xmlTreeBuilder2.process((org.jsoup.parser.Token) startTag7);
        org.jsoup.parser.Token.StartTag startTag11 = new org.jsoup.parser.Token.StartTag();
        startTag11.appendTagName('4');
        org.jsoup.nodes.Element element14 = xmlTreeBuilder2.insert(startTag11);
        org.jsoup.parser.ParseErrorList parseErrorList17 = null;
        xmlTreeBuilder2.initialiseParse("Character", "Doctype", parseErrorList17);
        org.jsoup.parser.Token.Comment comment19 = new org.jsoup.parser.Token.Comment();
        java.lang.StringBuilder stringBuilder20 = comment19.data;
        xmlTreeBuilder2.insert(comment19);
        org.jsoup.parser.Token.Comment comment22 = new org.jsoup.parser.Token.Comment();
        java.lang.StringBuilder stringBuilder23 = comment22.data;
        org.jsoup.parser.Token.TokenType tokenType24 = org.jsoup.parser.Token.TokenType.Comment;
        comment22.type = tokenType24;
        xmlTreeBuilder2.insert(comment22);
        org.jsoup.parser.Token.StartTag startTag28 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag30 = startTag28.name("hi!");
        org.jsoup.nodes.Attributes attributes31 = tag30.attributes;
        org.jsoup.parser.Token.StartTag startTag32 = new org.jsoup.parser.Token.StartTag("</hi!>", attributes31);
        org.jsoup.nodes.Element element33 = xmlTreeBuilder2.insert(startTag32);
        org.jsoup.parser.Token.Tag tag35 = startTag32.name("");
        boolean boolean36 = startTag32.isSelfClosing();
        boolean boolean37 = startTag32.isStartTag();
        org.jsoup.nodes.Attributes attributes38 = startTag32.attributes;
        org.jsoup.parser.Token.StartTag startTag39 = new org.jsoup.parser.Token.StartTag("</<4>>", attributes38);
        org.jsoup.parser.Token.StartTag startTag40 = new org.jsoup.parser.Token.StartTag("</</4>>", attributes38);
        org.junit.Assert.assertNotNull(tag9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(stringBuilder20);
        org.junit.Assert.assertEquals(stringBuilder20.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder23);
        org.junit.Assert.assertEquals(stringBuilder23.toString(), "");
        org.junit.Assert.assertTrue("'" + tokenType24 + "' != '" + org.jsoup.parser.Token.TokenType.Comment + "'", tokenType24.equals(org.jsoup.parser.Token.TokenType.Comment));
        org.junit.Assert.assertNotNull(tag30);
        org.junit.Assert.assertNotNull(attributes31);
        org.junit.Assert.assertNotNull(element33);
        org.junit.Assert.assertNotNull(tag35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(attributes38);
    }

    @Test
    public void test4043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4043");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        xmlTreeBuilder0.initialiseParse("</hi!>", "EOF", parseErrorList3);
        org.jsoup.parser.Token.StartTag startTag5 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag7 = startTag5.name("hi!");
        boolean boolean8 = xmlTreeBuilder0.process((org.jsoup.parser.Token) startTag5);
        org.jsoup.parser.Token.StartTag startTag9 = new org.jsoup.parser.Token.StartTag();
        startTag9.appendTagName('4');
        org.jsoup.nodes.Element element12 = xmlTreeBuilder0.insert(startTag9);
        org.jsoup.parser.Token.Character character14 = new org.jsoup.parser.Token.Character("EOF");
        java.lang.String str15 = character14.getData();
        java.lang.String str16 = character14.toString();
        boolean boolean17 = character14.isStartTag();
        java.lang.String str18 = character14.getData();
        java.lang.String str19 = character14.toString();
        org.jsoup.parser.Token.Character character20 = character14.asCharacter();
        java.lang.String str21 = character14.toString();
        java.lang.String str22 = character14.toString();
        xmlTreeBuilder0.insert(character14);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder24 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList27 = null;
        xmlTreeBuilder24.initialiseParse("Character", "hi!", parseErrorList27);
        org.jsoup.parser.Token.Comment comment29 = new org.jsoup.parser.Token.Comment();
        java.lang.StringBuilder stringBuilder30 = comment29.data;
        java.lang.String str31 = comment29.getData();
        xmlTreeBuilder24.insert(comment29);
        org.jsoup.parser.Token.StartTag startTag33 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag35 = startTag33.name("hi!");
        startTag33.appendAttributeName(' ');
        boolean boolean38 = startTag33.isComment();
        org.jsoup.nodes.Element element39 = xmlTreeBuilder24.insert(startTag33);
        org.jsoup.parser.Token.StartTag startTag41 = new org.jsoup.parser.Token.StartTag("Doctype");
        java.lang.String str42 = startTag41.name();
        boolean boolean43 = xmlTreeBuilder24.process((org.jsoup.parser.Token) startTag41);
        org.jsoup.parser.Token.Comment comment44 = new org.jsoup.parser.Token.Comment();
        java.lang.StringBuilder stringBuilder45 = comment44.data;
        java.lang.String str46 = comment44.getData();
        java.lang.StringBuilder stringBuilder47 = comment44.data;
        xmlTreeBuilder24.insert(comment44);
        org.jsoup.parser.Token.Comment comment49 = new org.jsoup.parser.Token.Comment();
        java.lang.StringBuilder stringBuilder50 = comment49.data;
        java.lang.String str51 = comment49.toString();
        xmlTreeBuilder24.insert(comment49);
        xmlTreeBuilder0.insert(comment49);
        org.jsoup.parser.Token.StartTag startTag55 = new org.jsoup.parser.Token.StartTag("</hi!>");
        java.lang.String str56 = startTag55.toString();
        startTag55.selfClosing = false;
        org.jsoup.parser.Token.EndTag endTag60 = new org.jsoup.parser.Token.EndTag("hi!");
        org.jsoup.nodes.Attributes attributes62 = null;
        org.jsoup.parser.Token.StartTag startTag63 = new org.jsoup.parser.Token.StartTag("", attributes62);
        startTag63.selfClosing = false;
        startTag63.newAttribute();
        org.jsoup.parser.Token.StartTag startTag67 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag69 = startTag67.name("hi!");
        tag69.finaliseTag();
        tag69.newAttribute();
        org.jsoup.nodes.Attributes attributes72 = tag69.attributes;
        startTag63.attributes = attributes72;
        endTag60.attributes = attributes72;
        endTag60.appendAttributeName("<!---->");
        endTag60.appendAttributeValue('4');
        endTag60.appendAttributeValue('#');
        org.jsoup.nodes.Attributes attributes81 = endTag60.getAttributes();
        startTag55.attributes = attributes81;
        boolean boolean83 = xmlTreeBuilder0.process((org.jsoup.parser.Token) startTag55);
        boolean boolean84 = startTag55.selfClosing;
        org.junit.Assert.assertNotNull(tag7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "EOF" + "'", str15, "EOF");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "EOF" + "'", str16, "EOF");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "EOF" + "'", str18, "EOF");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "EOF" + "'", str19, "EOF");
        org.junit.Assert.assertNotNull(character20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "EOF" + "'", str21, "EOF");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "EOF" + "'", str22, "EOF");
        org.junit.Assert.assertNotNull(stringBuilder30);
        org.junit.Assert.assertEquals(stringBuilder30.toString(), "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertNotNull(tag35);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(element39);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "Doctype" + "'", str42, "Doctype");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(stringBuilder45);
        org.junit.Assert.assertEquals(stringBuilder45.toString(), "");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertNotNull(stringBuilder47);
        org.junit.Assert.assertEquals(stringBuilder47.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder50);
        org.junit.Assert.assertEquals(stringBuilder50.toString(), "");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "<!---->" + "'", str51, "<!---->");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "<</hi!>>" + "'", str56, "<</hi!>>");
        org.junit.Assert.assertNotNull(tag69);
        org.junit.Assert.assertNotNull(attributes72);
        org.junit.Assert.assertNotNull(attributes81);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + true + "'", boolean83 == true);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
    }

    @Test
    public void test4044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4044");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        boolean boolean1 = doctype0.forceQuirks;
        java.lang.StringBuilder stringBuilder2 = doctype0.systemIdentifier;
        boolean boolean3 = doctype0.isEndTag();
        doctype0.forceQuirks = false;
        java.lang.StringBuilder stringBuilder6 = doctype0.systemIdentifier;
        doctype0.forceQuirks = false;
        java.lang.StringBuilder stringBuilder9 = doctype0.systemIdentifier;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder9);
        org.junit.Assert.assertEquals(stringBuilder9.toString(), "");
    }

    @Test
    public void test4045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4045");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        boolean boolean1 = doctype0.forceQuirks;
        java.lang.StringBuilder stringBuilder2 = doctype0.systemIdentifier;
        boolean boolean3 = doctype0.isCharacter();
        doctype0.forceQuirks = false;
        java.lang.StringBuilder stringBuilder6 = doctype0.publicIdentifier;
        boolean boolean7 = doctype0.forceQuirks;
        java.lang.StringBuilder stringBuilder8 = doctype0.publicIdentifier;
        java.lang.String str9 = doctype0.getSystemIdentifier();
        java.lang.String str10 = doctype0.getPublicIdentifier();
        boolean boolean11 = doctype0.isForceQuirks();
        boolean boolean12 = doctype0.forceQuirks;
        boolean boolean13 = doctype0.isForceQuirks();
        boolean boolean14 = doctype0.isEndTag();
        java.lang.StringBuilder stringBuilder15 = doctype0.publicIdentifier;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(stringBuilder8);
        org.junit.Assert.assertEquals(stringBuilder8.toString(), "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(stringBuilder15);
        org.junit.Assert.assertEquals(stringBuilder15.toString(), "");
    }

    @Test
    public void test4046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4046");
        org.jsoup.nodes.Attributes attributes3 = null;
        org.jsoup.parser.Token.StartTag startTag4 = new org.jsoup.parser.Token.StartTag("", attributes3);
        startTag4.selfClosing = false;
        startTag4.newAttribute();
        startTag4.finaliseTag();
        org.jsoup.parser.Token.EndTag endTag10 = new org.jsoup.parser.Token.EndTag("hi!");
        boolean boolean11 = endTag10.selfClosing;
        org.jsoup.parser.Token.Tag tag13 = endTag10.name("");
        boolean boolean14 = endTag10.isEndTag();
        org.jsoup.parser.Token.Tag tag16 = endTag10.name("<4>");
        org.jsoup.parser.Token.TokenType tokenType17 = tag16.type;
        startTag4.type = tokenType17;
        boolean boolean19 = startTag4.isDoctype();
        org.jsoup.nodes.Attributes attributes20 = startTag4.getAttributes();
        org.jsoup.parser.Token.StartTag startTag21 = new org.jsoup.parser.Token.StartTag("Comment", attributes20);
        org.jsoup.parser.Token.StartTag startTag22 = new org.jsoup.parser.Token.StartTag("Character", attributes20);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(tag13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(tag16);
        org.junit.Assert.assertTrue("'" + tokenType17 + "' != '" + org.jsoup.parser.Token.TokenType.EndTag + "'", tokenType17.equals(org.jsoup.parser.Token.TokenType.EndTag));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(attributes20);
    }

    @Test
    public void test4047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4047");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        boolean boolean1 = doctype0.forceQuirks;
        java.lang.String str2 = doctype0.getName();
        boolean boolean3 = doctype0.isEndTag();
        boolean boolean4 = doctype0.isForceQuirks();
        org.jsoup.parser.Token.Doctype doctype5 = doctype0.asDoctype();
        java.lang.StringBuilder stringBuilder6 = doctype0.name;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(doctype5);
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "");
    }

    @Test
    public void test4048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4048");
        org.jsoup.parser.Token.StartTag startTag1 = new org.jsoup.parser.Token.StartTag("</Doctype>");
        boolean boolean2 = startTag1.isComment();
        boolean boolean3 = startTag1.selfClosing;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test4049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4049");
        org.jsoup.parser.Token.StartTag startTag2 = new org.jsoup.parser.Token.StartTag();
        startTag2.appendTagName('4');
        java.lang.String str5 = startTag2.name();
        org.jsoup.nodes.Attributes attributes6 = startTag2.attributes;
        org.jsoup.parser.Token.StartTag startTag7 = new org.jsoup.parser.Token.StartTag("hi!", attributes6);
        org.jsoup.parser.Token.StartTag startTag8 = new org.jsoup.parser.Token.StartTag("Comment", attributes6);
        startTag8.appendTagName('a');
        startTag8.appendAttributeValue("4");
        startTag8.appendAttributeValue("<4> ");
        org.jsoup.parser.Token.Tag tag16 = startTag8.name("<4>");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "4" + "'", str5, "4");
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertNotNull(tag16);
    }

    @Test
    public void test4050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4050");
        org.jsoup.parser.Token.EndTag endTag2 = new org.jsoup.parser.Token.EndTag("hi!");
        java.lang.String str3 = endTag2.toString();
        java.lang.String str4 = endTag2.toString();
        org.jsoup.parser.Token.TokenType tokenType5 = org.jsoup.parser.Token.TokenType.EndTag;
        endTag2.type = tokenType5;
        boolean boolean7 = endTag2.isStartTag();
        boolean boolean8 = endTag2.isSelfClosing();
        org.jsoup.parser.Token.StartTag startTag10 = new org.jsoup.parser.Token.StartTag("hi!");
        startTag10.appendAttributeValue("</hi!>");
        org.jsoup.nodes.Attributes attributes13 = startTag10.attributes;
        endTag2.attributes = attributes13;
        org.jsoup.nodes.Attributes attributes15 = endTag2.attributes;
        org.jsoup.parser.Token.StartTag startTag16 = new org.jsoup.parser.Token.StartTag("a", attributes15);
        org.jsoup.nodes.Attributes attributes17 = startTag16.getAttributes();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "</hi!>" + "'", str3, "</hi!>");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "</hi!>" + "'", str4, "</hi!>");
        org.junit.Assert.assertTrue("'" + tokenType5 + "' != '" + org.jsoup.parser.Token.TokenType.EndTag + "'", tokenType5.equals(org.jsoup.parser.Token.TokenType.EndTag));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(attributes13);
        org.junit.Assert.assertNotNull(attributes15);
        org.junit.Assert.assertNotNull(attributes17);
    }

    @Test
    public void test4051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4051");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("hi!");
        boolean boolean2 = endTag1.selfClosing;
        endTag1.finaliseTag();
        endTag1.appendAttributeName(' ');
        endTag1.tagName = "Doctype";
        boolean boolean8 = endTag1.isSelfClosing();
        java.lang.String str9 = endTag1.toString();
        java.lang.String str10 = endTag1.tokenType();
        endTag1.appendAttributeName("Character");
        org.jsoup.parser.Token.TokenType tokenType13 = endTag1.type;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "</Doctype>" + "'", str9, "</Doctype>");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "EndTag" + "'", str10, "EndTag");
        org.junit.Assert.assertTrue("'" + tokenType13 + "' != '" + org.jsoup.parser.Token.TokenType.EndTag + "'", tokenType13.equals(org.jsoup.parser.Token.TokenType.EndTag));
    }

    @Test
    public void test4052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4052");
        org.jsoup.parser.Token.Character character1 = new org.jsoup.parser.Token.Character("</hi!>");
        java.lang.String str2 = character1.getData();
        java.lang.String str3 = character1.toString();
        boolean boolean4 = character1.isEndTag();
        org.jsoup.parser.Token.TokenType tokenType5 = character1.type;
        java.lang.String str6 = character1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "</hi!>" + "'", str2, "</hi!>");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "</hi!>" + "'", str3, "</hi!>");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + tokenType5 + "' != '" + org.jsoup.parser.Token.TokenType.Character + "'", tokenType5.equals(org.jsoup.parser.Token.TokenType.Character));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "</hi!>" + "'", str6, "</hi!>");
    }

    @Test
    public void test4053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4053");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag2 = startTag0.name("hi!");
        tag2.finaliseTag();
        tag2.newAttribute();
        org.jsoup.nodes.Attributes attributes5 = tag2.attributes;
        boolean boolean6 = tag2.isEOF();
        org.jsoup.parser.Token.Tag tag8 = tag2.name("4");
        org.jsoup.parser.Token.Tag tag10 = tag2.name("</Comment>");
        org.junit.Assert.assertNotNull(tag2);
        org.junit.Assert.assertNotNull(attributes5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(tag8);
        org.junit.Assert.assertNotNull(tag10);
    }

    @Test
    public void test4054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4054");
        org.jsoup.parser.Token.EndTag endTag2 = new org.jsoup.parser.Token.EndTag("hi!");
        java.lang.String str3 = endTag2.toString();
        java.lang.String str4 = endTag2.toString();
        boolean boolean5 = endTag2.isDoctype();
        java.lang.String str6 = endTag2.tagName;
        org.jsoup.parser.Token.StartTag startTag8 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag10 = startTag8.name("hi!");
        org.jsoup.nodes.Attributes attributes11 = tag10.attributes;
        org.jsoup.parser.Token.StartTag startTag12 = new org.jsoup.parser.Token.StartTag("</hi!>", attributes11);
        endTag2.attributes = attributes11;
        org.jsoup.parser.Token.StartTag startTag15 = new org.jsoup.parser.Token.StartTag();
        startTag15.appendTagName('4');
        java.lang.String str18 = startTag15.name();
        org.jsoup.nodes.Attributes attributes19 = startTag15.attributes;
        org.jsoup.parser.Token.StartTag startTag20 = new org.jsoup.parser.Token.StartTag("hi!", attributes19);
        endTag2.attributes = attributes19;
        org.jsoup.parser.Token.StartTag startTag22 = new org.jsoup.parser.Token.StartTag("</hi!#>", attributes19);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "</hi!>" + "'", str3, "</hi!>");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "</hi!>" + "'", str4, "</hi!>");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(tag10);
        org.junit.Assert.assertNotNull(attributes11);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "4" + "'", str18, "4");
        org.junit.Assert.assertNotNull(attributes19);
    }

    @Test
    public void test4055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4055");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        boolean boolean1 = doctype0.forceQuirks;
        java.lang.String str2 = doctype0.getName();
        boolean boolean3 = doctype0.forceQuirks;
        boolean boolean4 = doctype0.isForceQuirks();
        org.jsoup.parser.Token.Doctype doctype5 = doctype0.asDoctype();
        org.jsoup.nodes.Attributes attributes7 = null;
        org.jsoup.parser.Token.StartTag startTag8 = new org.jsoup.parser.Token.StartTag("", attributes7);
        boolean boolean9 = startTag8.isDoctype();
        java.lang.String str10 = startTag8.tagName;
        startTag8.selfClosing = false;
        org.jsoup.parser.Token.Tag tag14 = startTag8.name("</hi!>");
        java.lang.String str15 = tag14.name();
        tag14.selfClosing = false;
        boolean boolean18 = tag14.selfClosing;
        tag14.appendAttributeValue('#');
        org.jsoup.parser.Token.EndTag endTag22 = new org.jsoup.parser.Token.EndTag("hi!");
        boolean boolean23 = endTag22.selfClosing;
        java.lang.String str24 = endTag22.toString();
        java.lang.String str25 = endTag22.toString();
        boolean boolean26 = endTag22.isEOF();
        org.jsoup.parser.Token.Doctype doctype27 = new org.jsoup.parser.Token.Doctype();
        java.lang.StringBuilder stringBuilder28 = doctype27.name;
        org.jsoup.parser.Token.TokenType tokenType29 = org.jsoup.parser.Token.TokenType.StartTag;
        doctype27.type = tokenType29;
        endTag22.type = tokenType29;
        endTag22.appendAttributeValue(' ');
        org.jsoup.parser.Token.TokenType tokenType34 = endTag22.type;
        tag14.type = tokenType34;
        doctype5.type = tokenType34;
        java.lang.String str37 = doctype5.getPublicIdentifier();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.EndTag endTag38 = doctype5.asEndTag();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$Doctype cannot be cast to class org.jsoup.parser.Token$EndTag (org.jsoup.parser.Token$Doctype and org.jsoup.parser.Token$EndTag are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(doctype5);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(tag14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "</hi!>" + "'", str15, "</hi!>");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "</hi!>" + "'", str24, "</hi!>");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "</hi!>" + "'", str25, "</hi!>");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(stringBuilder28);
        org.junit.Assert.assertEquals(stringBuilder28.toString(), "");
        org.junit.Assert.assertTrue("'" + tokenType29 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType29.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertTrue("'" + tokenType34 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType34.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
    }

    @Test
    public void test4056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4056");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag2 = startTag0.name("hi!");
        startTag0.appendAttributeName(' ');
        startTag0.appendAttributeName("hi!");
        boolean boolean7 = startTag0.isSelfClosing();
        boolean boolean8 = startTag0.isComment();
        boolean boolean9 = startTag0.isCharacter();
        startTag0.appendAttributeValue("#");
        org.jsoup.parser.Token.Tag tag13 = startTag0.name("<<</hi!>>  a=\"\">");
        org.junit.Assert.assertNotNull(tag2);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(tag13);
    }

    @Test
    public void test4057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4057");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("hi!");
        boolean boolean2 = endTag1.selfClosing;
        endTag1.finaliseTag();
        endTag1.appendAttributeName(' ');
        boolean boolean6 = endTag1.isStartTag();
        endTag1.appendAttributeName('a');
        org.jsoup.parser.Token.EOF eOF9 = new org.jsoup.parser.Token.EOF();
        org.jsoup.parser.Token.TokenType tokenType10 = eOF9.type;
        endTag1.type = tokenType10;
        java.lang.String str12 = endTag1.toString();
        org.jsoup.nodes.Attributes attributes14 = null;
        org.jsoup.parser.Token.StartTag startTag15 = new org.jsoup.parser.Token.StartTag("", attributes14);
        boolean boolean16 = startTag15.isDoctype();
        java.lang.String str17 = startTag15.tagName;
        startTag15.selfClosing = false;
        org.jsoup.parser.Token.Tag tag21 = startTag15.name("</hi!>");
        java.lang.String str22 = tag21.name();
        tag21.selfClosing = false;
        org.jsoup.nodes.Attributes attributes25 = tag21.getAttributes();
        java.lang.String str26 = tag21.name();
        org.jsoup.nodes.Attributes attributes29 = null;
        org.jsoup.parser.Token.StartTag startTag30 = new org.jsoup.parser.Token.StartTag("", attributes29);
        org.jsoup.parser.Token.StartTag startTag31 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag33 = startTag31.name("hi!");
        org.jsoup.nodes.Attributes attributes34 = tag33.attributes;
        startTag30.attributes = attributes34;
        org.jsoup.parser.Token.StartTag startTag36 = new org.jsoup.parser.Token.StartTag("Doctype", attributes34);
        tag21.attributes = attributes34;
        endTag1.attributes = attributes34;
        endTag1.appendAttributeName('a');
        boolean boolean41 = endTag1.selfClosing;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + tokenType10 + "' != '" + org.jsoup.parser.Token.TokenType.EOF + "'", tokenType10.equals(org.jsoup.parser.Token.TokenType.EOF));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "</hi!>" + "'", str12, "</hi!>");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(tag21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "</hi!>" + "'", str22, "</hi!>");
        org.junit.Assert.assertNull(attributes25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "</hi!>" + "'", str26, "</hi!>");
        org.junit.Assert.assertNotNull(tag33);
        org.junit.Assert.assertNotNull(attributes34);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
    }

    @Test
    public void test4058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4058");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        boolean boolean1 = doctype0.forceQuirks;
        java.lang.StringBuilder stringBuilder2 = doctype0.systemIdentifier;
        boolean boolean3 = doctype0.isEndTag();
        boolean boolean4 = doctype0.isForceQuirks();
        java.lang.StringBuilder stringBuilder5 = doctype0.name;
        boolean boolean6 = doctype0.isComment();
        java.lang.StringBuilder stringBuilder7 = doctype0.publicIdentifier;
        java.lang.StringBuilder stringBuilder8 = doctype0.publicIdentifier;
        java.lang.StringBuilder stringBuilder9 = doctype0.publicIdentifier;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(stringBuilder7);
        org.junit.Assert.assertEquals(stringBuilder7.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder8);
        org.junit.Assert.assertEquals(stringBuilder8.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder9);
        org.junit.Assert.assertEquals(stringBuilder9.toString(), "");
    }

    @Test
    public void test4059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4059");
        org.jsoup.nodes.Attributes attributes1 = null;
        org.jsoup.parser.Token.StartTag startTag2 = new org.jsoup.parser.Token.StartTag("", attributes1);
        startTag2.selfClosing = false;
        startTag2.newAttribute();
        org.jsoup.nodes.Attributes attributes6 = startTag2.getAttributes();
        startTag2.appendAttributeValue('a');
        startTag2.appendTagName("EOF");
        startTag2.appendTagName('a');
        java.lang.String str13 = startTag2.tokenType();
        startTag2.appendAttributeName("</Doctype4>");
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "StartTag" + "'", str13, "StartTag");
    }

    @Test
    public void test4060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4060");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.parser.Token.StartTag startTag3 = new org.jsoup.parser.Token.StartTag("", attributes2);
        startTag3.selfClosing = false;
        startTag3.appendTagName("</hi!>");
        startTag3.newAttribute();
        org.jsoup.nodes.Attributes attributes9 = startTag3.getAttributes();
        org.jsoup.parser.Token.StartTag startTag10 = new org.jsoup.parser.Token.StartTag("hi!", attributes9);
        startTag10.selfClosing = false;
        startTag10.appendAttributeValue("Character");
        java.lang.String str15 = startTag10.toString();
        java.lang.String str16 = startTag10.name();
        org.junit.Assert.assertNotNull(attributes9);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "<hi!>" + "'", str15, "<hi!>");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test4061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4061");
        org.jsoup.parser.Token.StartTag startTag3 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag5 = startTag3.name("hi!");
        org.jsoup.nodes.Attributes attributes6 = tag5.attributes;
        org.jsoup.parser.Token.StartTag startTag7 = new org.jsoup.parser.Token.StartTag("</hi!>", attributes6);
        org.jsoup.parser.Token.StartTag startTag8 = new org.jsoup.parser.Token.StartTag("", attributes6);
        org.jsoup.parser.Token.StartTag startTag9 = new org.jsoup.parser.Token.StartTag("<hi!>", attributes6);
        java.lang.String str10 = startTag9.name();
        org.jsoup.parser.Token.StartTag startTag11 = new org.jsoup.parser.Token.StartTag();
        startTag11.appendAttributeName('a');
        java.lang.String str14 = startTag11.tagName;
        org.jsoup.nodes.Attributes attributes15 = startTag11.getAttributes();
        startTag9.attributes = attributes15;
        startTag9.appendAttributeName("</Doctype>");
        java.lang.String str19 = startTag9.toString();
        org.junit.Assert.assertNotNull(tag5);
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "<hi!>" + "'", str10, "<hi!>");
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(attributes15);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "<<hi!>>" + "'", str19, "<<hi!>>");
    }

    @Test
    public void test4062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4062");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("hi!");
        boolean boolean2 = endTag1.selfClosing;
        endTag1.finaliseTag();
        java.lang.String str4 = endTag1.toString();
        java.lang.String str5 = endTag1.tokenType();
        org.jsoup.nodes.Attributes attributes6 = endTag1.attributes;
        java.lang.String str7 = endTag1.name();
        java.lang.String str8 = endTag1.tokenType();
        java.lang.String str9 = endTag1.tagName;
        boolean boolean10 = endTag1.selfClosing;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "</hi!>" + "'", str4, "</hi!>");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "EndTag" + "'", str5, "EndTag");
        org.junit.Assert.assertNull(attributes6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "EndTag" + "'", str8, "EndTag");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test4063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4063");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("hi!");
        boolean boolean2 = endTag1.selfClosing;
        java.lang.String str3 = endTag1.toString();
        java.lang.String str4 = endTag1.toString();
        endTag1.appendAttributeValue("<4>");
        java.lang.String str7 = endTag1.toString();
        org.jsoup.parser.Token.TokenType tokenType8 = endTag1.type;
        boolean boolean9 = endTag1.isSelfClosing();
        java.lang.String str10 = endTag1.toString();
        endTag1.appendAttributeName('a');
        org.jsoup.nodes.Attributes attributes13 = endTag1.attributes;
        boolean boolean14 = endTag1.selfClosing;
        org.jsoup.nodes.Attributes attributes15 = endTag1.attributes;
        java.lang.String str16 = endTag1.tagName;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "</hi!>" + "'", str3, "</hi!>");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "</hi!>" + "'", str4, "</hi!>");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "</hi!>" + "'", str7, "</hi!>");
        org.junit.Assert.assertTrue("'" + tokenType8 + "' != '" + org.jsoup.parser.Token.TokenType.EndTag + "'", tokenType8.equals(org.jsoup.parser.Token.TokenType.EndTag));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "</hi!>" + "'", str10, "</hi!>");
        org.junit.Assert.assertNull(attributes13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(attributes15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test4064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4064");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        boolean boolean1 = doctype0.forceQuirks;
        java.lang.StringBuilder stringBuilder2 = doctype0.systemIdentifier;
        boolean boolean3 = doctype0.isCharacter();
        doctype0.forceQuirks = false;
        java.lang.StringBuilder stringBuilder6 = doctype0.publicIdentifier;
        boolean boolean7 = doctype0.isStartTag();
        java.lang.StringBuilder stringBuilder8 = doctype0.publicIdentifier;
        java.lang.String str9 = doctype0.getSystemIdentifier();
        java.lang.String str10 = doctype0.getPublicIdentifier();
        java.lang.String str11 = doctype0.getSystemIdentifier();
        boolean boolean12 = doctype0.isCharacter();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(stringBuilder8);
        org.junit.Assert.assertEquals(stringBuilder8.toString(), "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test4065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4065");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.appendAttributeName('a');
        startTag0.newAttribute();
        boolean boolean4 = startTag0.isDoctype();
        startTag0.finaliseTag();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder7 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList10 = null;
        xmlTreeBuilder7.initialiseParse("</hi!>", "EOF", parseErrorList10);
        org.jsoup.parser.Token.StartTag startTag12 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag14 = startTag12.name("hi!");
        boolean boolean15 = xmlTreeBuilder7.process((org.jsoup.parser.Token) startTag12);
        boolean boolean16 = startTag12.isDoctype();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder17 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList20 = null;
        xmlTreeBuilder17.initialiseParse("</hi!>", "EOF", parseErrorList20);
        org.jsoup.parser.Token.StartTag startTag22 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag24 = startTag22.name("hi!");
        boolean boolean25 = xmlTreeBuilder17.process((org.jsoup.parser.Token) startTag22);
        org.jsoup.parser.Token.StartTag startTag26 = new org.jsoup.parser.Token.StartTag();
        startTag26.appendTagName('4');
        org.jsoup.nodes.Element element29 = xmlTreeBuilder17.insert(startTag26);
        startTag26.newAttribute();
        org.jsoup.parser.Token.StartTag startTag32 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag34 = startTag32.name("hi!");
        org.jsoup.nodes.Attributes attributes35 = tag34.attributes;
        org.jsoup.parser.Token.StartTag startTag36 = new org.jsoup.parser.Token.StartTag("", attributes35);
        startTag26.attributes = attributes35;
        startTag12.attributes = attributes35;
        org.jsoup.parser.Token.StartTag startTag39 = new org.jsoup.parser.Token.StartTag("4", attributes35);
        startTag0.attributes = attributes35;
        org.jsoup.parser.Token.Tag tag42 = startTag0.name("<Doctype>");
        java.lang.String str43 = tag42.tagName;
        org.jsoup.parser.Token.Character character45 = new org.jsoup.parser.Token.Character("EOF");
        java.lang.String str46 = character45.toString();
        java.lang.String str47 = character45.toString();
        java.lang.String str48 = character45.toString();
        boolean boolean49 = character45.isEOF();
        boolean boolean50 = character45.isEOF();
        org.jsoup.parser.Token.StartTag startTag54 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag56 = startTag54.name("hi!");
        org.jsoup.nodes.Attributes attributes57 = tag56.attributes;
        org.jsoup.parser.Token.StartTag startTag58 = new org.jsoup.parser.Token.StartTag("</hi!>", attributes57);
        org.jsoup.parser.Token.StartTag startTag59 = new org.jsoup.parser.Token.StartTag("", attributes57);
        org.jsoup.parser.Token.StartTag startTag60 = new org.jsoup.parser.Token.StartTag("hi!", attributes57);
        org.jsoup.parser.Token.TokenType tokenType61 = startTag60.type;
        org.jsoup.parser.Token.TokenType tokenType62 = startTag60.type;
        character45.type = tokenType62;
        tag42.type = tokenType62;
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(tag14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(tag24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(element29);
        org.junit.Assert.assertNotNull(tag34);
        org.junit.Assert.assertNotNull(attributes35);
        org.junit.Assert.assertNotNull(tag42);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "<Doctype>" + "'", str43, "<Doctype>");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "EOF" + "'", str46, "EOF");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "EOF" + "'", str47, "EOF");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "EOF" + "'", str48, "EOF");
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(tag56);
        org.junit.Assert.assertNotNull(attributes57);
        org.junit.Assert.assertTrue("'" + tokenType61 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType61.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertTrue("'" + tokenType62 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType62.equals(org.jsoup.parser.Token.TokenType.StartTag));
    }

    @Test
    public void test4066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4066");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        xmlTreeBuilder0.initialiseParse("Character", "hi!", parseErrorList3);
        org.jsoup.parser.Token.Comment comment5 = new org.jsoup.parser.Token.Comment();
        java.lang.StringBuilder stringBuilder6 = comment5.data;
        java.lang.String str7 = comment5.getData();
        xmlTreeBuilder0.insert(comment5);
        org.jsoup.parser.ParseErrorList parseErrorList11 = null;
        xmlTreeBuilder0.initialiseParse("<EndTag>", "</Doctype4>", parseErrorList11);
        org.jsoup.parser.Token.Character character14 = new org.jsoup.parser.Token.Character("Doctype");
        boolean boolean15 = xmlTreeBuilder0.process((org.jsoup.parser.Token) character14);
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test4067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4067");
        org.jsoup.nodes.Attributes attributes1 = null;
        org.jsoup.parser.Token.StartTag startTag2 = new org.jsoup.parser.Token.StartTag("", attributes1);
        boolean boolean3 = startTag2.isDoctype();
        java.lang.String str4 = startTag2.tagName;
        org.jsoup.parser.Token.TokenType tokenType5 = startTag2.type;
        startTag2.appendTagName(' ');
        boolean boolean8 = startTag2.isDoctype();
        org.jsoup.parser.Token.StartTag startTag10 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag12 = startTag10.name("hi!");
        org.jsoup.nodes.Attributes attributes13 = tag12.attributes;
        org.jsoup.parser.Token.StartTag startTag14 = new org.jsoup.parser.Token.StartTag("", attributes13);
        startTag2.attributes = attributes13;
        startTag2.appendAttributeValue('#');
        org.jsoup.parser.Token.StartTag startTag19 = new org.jsoup.parser.Token.StartTag("<hi!a>");
        org.jsoup.nodes.Attributes attributes20 = startTag19.attributes;
        startTag2.attributes = attributes20;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.EndTag endTag22 = startTag2.asEndTag();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$EndTag (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$EndTag are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + tokenType5 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType5.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(tag12);
        org.junit.Assert.assertNotNull(attributes13);
        org.junit.Assert.assertNotNull(attributes20);
    }

    @Test
    public void test4068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4068");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("<!---->");
        boolean boolean2 = endTag1.selfClosing;
        boolean boolean3 = endTag1.isCharacter();
        java.lang.String str4 = endTag1.toString();
        java.lang.String str5 = endTag1.toString();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "</<!---->>" + "'", str4, "</<!---->>");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "</<!---->>" + "'", str5, "</<!---->>");
    }

    @Test
    public void test4069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4069");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        xmlTreeBuilder0.initialiseParse("Character", "hi!", parseErrorList3);
        org.jsoup.parser.Token.Comment comment5 = new org.jsoup.parser.Token.Comment();
        java.lang.StringBuilder stringBuilder6 = comment5.data;
        java.lang.String str7 = comment5.getData();
        xmlTreeBuilder0.insert(comment5);
        org.jsoup.parser.Token.StartTag startTag9 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag11 = startTag9.name("hi!");
        startTag9.appendAttributeName(' ');
        boolean boolean14 = startTag9.isComment();
        org.jsoup.nodes.Element element15 = xmlTreeBuilder0.insert(startTag9);
        org.jsoup.parser.ParseErrorList parseErrorList18 = null;
        xmlTreeBuilder0.initialiseParse("Character", "<Doctype>", parseErrorList18);
        org.jsoup.parser.Token.Character character21 = new org.jsoup.parser.Token.Character("EOF");
        java.lang.String str22 = character21.getData();
        java.lang.String str23 = character21.toString();
        boolean boolean24 = character21.isStartTag();
        java.lang.String str25 = character21.toString();
        xmlTreeBuilder0.insert(character21);
        org.jsoup.parser.ParseErrorList parseErrorList29 = null;
        xmlTreeBuilder0.initialiseParse("Doctype", "Doctype", parseErrorList29);
        org.jsoup.parser.Token.Comment comment31 = new org.jsoup.parser.Token.Comment();
        java.lang.StringBuilder stringBuilder32 = comment31.data;
        java.lang.String str33 = comment31.getData();
        java.lang.StringBuilder stringBuilder34 = comment31.data;
        java.lang.String str35 = comment31.toString();
        xmlTreeBuilder0.insert(comment31);
        java.lang.String str37 = comment31.getData();
        boolean boolean38 = comment31.isCharacter();
        boolean boolean39 = comment31.isDoctype();
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(tag11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "EOF" + "'", str22, "EOF");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "EOF" + "'", str23, "EOF");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "EOF" + "'", str25, "EOF");
        org.junit.Assert.assertNotNull(stringBuilder32);
        org.junit.Assert.assertEquals(stringBuilder32.toString(), "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertNotNull(stringBuilder34);
        org.junit.Assert.assertEquals(stringBuilder34.toString(), "");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "<!---->" + "'", str35, "<!---->");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test4070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4070");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.parser.Token.StartTag startTag3 = new org.jsoup.parser.Token.StartTag("", attributes2);
        startTag3.selfClosing = false;
        startTag3.appendTagName("</hi!>");
        startTag3.newAttribute();
        org.jsoup.nodes.Attributes attributes9 = startTag3.getAttributes();
        org.jsoup.parser.Token.StartTag startTag10 = new org.jsoup.parser.Token.StartTag("Doctype", attributes9);
        startTag10.selfClosing = true;
        startTag10.newAttribute();
        org.jsoup.nodes.Attributes attributes14 = startTag10.attributes;
        org.jsoup.nodes.Attributes attributes15 = startTag10.getAttributes();
        org.junit.Assert.assertNotNull(attributes9);
        org.junit.Assert.assertNotNull(attributes14);
        org.junit.Assert.assertNotNull(attributes15);
    }

    @Test
    public void test4071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4071");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.appendTagName('a');
        startTag0.newAttribute();
        java.lang.String str4 = startTag0.toString();
        java.lang.String str5 = startTag0.toString();
        org.jsoup.parser.Token.TokenType tokenType6 = startTag0.type;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<a>" + "'", str4, "<a>");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<a>" + "'", str5, "<a>");
        org.junit.Assert.assertTrue("'" + tokenType6 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType6.equals(org.jsoup.parser.Token.TokenType.StartTag));
    }

    @Test
    public void test4072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4072");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.parser.Token.StartTag startTag3 = new org.jsoup.parser.Token.StartTag("", attributes2);
        startTag3.selfClosing = false;
        startTag3.appendTagName("</hi!>");
        startTag3.newAttribute();
        org.jsoup.nodes.Attributes attributes9 = startTag3.getAttributes();
        org.jsoup.parser.Token.StartTag startTag10 = new org.jsoup.parser.Token.StartTag("Doctype", attributes9);
        startTag10.selfClosing = true;
        startTag10.newAttribute();
        startTag10.newAttribute();
        boolean boolean15 = startTag10.selfClosing;
        startTag10.selfClosing = false;
        startTag10.appendAttributeName(' ');
        java.lang.String str20 = startTag10.toString();
        startTag10.appendAttributeValue("</Doctype4Character>");
        startTag10.newAttribute();
        org.junit.Assert.assertNotNull(attributes9);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "<Doctype>" + "'", str20, "<Doctype>");
    }

    @Test
    public void test4073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4073");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag2 = startTag0.name("hi!");
        startTag0.appendAttributeName(' ');
        startTag0.appendAttributeName("hi!");
        boolean boolean7 = startTag0.isSelfClosing();
        boolean boolean8 = startTag0.isComment();
        startTag0.appendAttributeName("EndTag");
        boolean boolean11 = startTag0.isEOF();
        org.jsoup.parser.Token.StartTag startTag12 = startTag0.asStartTag();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.EndTag endTag13 = startTag0.asEndTag();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$EndTag (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$EndTag are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tag2);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(startTag12);
    }

    @Test
    public void test4074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4074");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        xmlTreeBuilder0.initialiseParse("Character", "hi!", parseErrorList3);
        org.jsoup.parser.Token.Comment comment5 = new org.jsoup.parser.Token.Comment();
        java.lang.StringBuilder stringBuilder6 = comment5.data;
        java.lang.String str7 = comment5.getData();
        xmlTreeBuilder0.insert(comment5);
        org.jsoup.parser.Token.StartTag startTag9 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag11 = startTag9.name("hi!");
        startTag9.appendAttributeName(' ');
        boolean boolean14 = startTag9.isComment();
        org.jsoup.nodes.Element element15 = xmlTreeBuilder0.insert(startTag9);
        org.jsoup.parser.Token.StartTag startTag17 = new org.jsoup.parser.Token.StartTag("Doctype");
        java.lang.String str18 = startTag17.name();
        boolean boolean19 = xmlTreeBuilder0.process((org.jsoup.parser.Token) startTag17);
        org.jsoup.parser.Token.Comment comment20 = new org.jsoup.parser.Token.Comment();
        java.lang.StringBuilder stringBuilder21 = comment20.data;
        java.lang.String str22 = comment20.getData();
        java.lang.StringBuilder stringBuilder23 = comment20.data;
        xmlTreeBuilder0.insert(comment20);
        org.jsoup.parser.Token.Comment comment25 = new org.jsoup.parser.Token.Comment();
        java.lang.StringBuilder stringBuilder26 = comment25.data;
        java.lang.String str27 = comment25.toString();
        xmlTreeBuilder0.insert(comment25);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder29 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList32 = null;
        xmlTreeBuilder29.initialiseParse("Character", "hi!", parseErrorList32);
        org.jsoup.parser.ParseErrorList parseErrorList36 = null;
        xmlTreeBuilder29.initialiseParse("</hi!>", "Doctype", parseErrorList36);
        org.jsoup.parser.ParseErrorList parseErrorList40 = null;
        xmlTreeBuilder29.initialiseParse("", "<4>", parseErrorList40);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder42 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList45 = null;
        xmlTreeBuilder42.initialiseParse("Character", "hi!", parseErrorList45);
        org.jsoup.parser.Token.Comment comment47 = new org.jsoup.parser.Token.Comment();
        java.lang.StringBuilder stringBuilder48 = comment47.data;
        java.lang.String str49 = comment47.getData();
        xmlTreeBuilder42.insert(comment47);
        org.jsoup.parser.Token.StartTag startTag51 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag53 = startTag51.name("hi!");
        startTag51.appendAttributeName(' ');
        boolean boolean56 = startTag51.isComment();
        org.jsoup.nodes.Element element57 = xmlTreeBuilder42.insert(startTag51);
        org.jsoup.parser.ParseErrorList parseErrorList60 = null;
        xmlTreeBuilder42.initialiseParse("Character", "<Doctype>", parseErrorList60);
        org.jsoup.parser.Token.Character character63 = new org.jsoup.parser.Token.Character("EOF");
        java.lang.String str64 = character63.getData();
        java.lang.String str65 = character63.toString();
        boolean boolean66 = character63.isStartTag();
        java.lang.String str67 = character63.toString();
        xmlTreeBuilder42.insert(character63);
        xmlTreeBuilder29.insert(character63);
        java.lang.String str70 = character63.toString();
        xmlTreeBuilder0.insert(character63);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder72 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList75 = null;
        xmlTreeBuilder72.initialiseParse("</hi!>", "EOF", parseErrorList75);
        org.jsoup.parser.Token.StartTag startTag77 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag79 = startTag77.name("hi!");
        boolean boolean80 = xmlTreeBuilder72.process((org.jsoup.parser.Token) startTag77);
        org.jsoup.parser.Token.Comment comment81 = new org.jsoup.parser.Token.Comment();
        java.lang.StringBuilder stringBuilder82 = comment81.data;
        java.lang.String str83 = comment81.toString();
        xmlTreeBuilder72.insert(comment81);
        java.lang.String str85 = comment81.toString();
        boolean boolean86 = comment81.isDoctype();
        java.lang.String str87 = comment81.getData();
        java.lang.String str88 = comment81.toString();
        xmlTreeBuilder0.insert(comment81);
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(tag11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Doctype" + "'", str18, "Doctype");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(stringBuilder21);
        org.junit.Assert.assertEquals(stringBuilder21.toString(), "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(stringBuilder23);
        org.junit.Assert.assertEquals(stringBuilder23.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder26);
        org.junit.Assert.assertEquals(stringBuilder26.toString(), "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "<!---->" + "'", str27, "<!---->");
        org.junit.Assert.assertNotNull(stringBuilder48);
        org.junit.Assert.assertEquals(stringBuilder48.toString(), "");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertNotNull(tag53);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(element57);
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "EOF" + "'", str64, "EOF");
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "EOF" + "'", str65, "EOF");
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "EOF" + "'", str67, "EOF");
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "EOF" + "'", str70, "EOF");
        org.junit.Assert.assertNotNull(tag79);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + true + "'", boolean80 == true);
        org.junit.Assert.assertNotNull(stringBuilder82);
        org.junit.Assert.assertEquals(stringBuilder82.toString(), "");
        org.junit.Assert.assertEquals("'" + str83 + "' != '" + "<!---->" + "'", str83, "<!---->");
        org.junit.Assert.assertEquals("'" + str85 + "' != '" + "<!---->" + "'", str85, "<!---->");
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertEquals("'" + str87 + "' != '" + "" + "'", str87, "");
        org.junit.Assert.assertEquals("'" + str88 + "' != '" + "<!---->" + "'", str88, "<!---->");
    }

    @Test
    public void test4075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4075");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.tokenType();
        boolean boolean2 = doctype0.isForceQuirks();
        java.lang.String str3 = doctype0.getPublicIdentifier();
        boolean boolean4 = doctype0.isForceQuirks();
        doctype0.forceQuirks = true;
        doctype0.forceQuirks = false;
        boolean boolean9 = doctype0.isForceQuirks();
        boolean boolean10 = doctype0.forceQuirks;
        boolean boolean11 = doctype0.isForceQuirks();
        boolean boolean12 = doctype0.forceQuirks;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Doctype" + "'", str1, "Doctype");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test4076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4076");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        boolean boolean1 = doctype0.forceQuirks;
        java.lang.String str2 = doctype0.getName();
        boolean boolean3 = doctype0.forceQuirks;
        doctype0.forceQuirks = false;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.StartTag startTag6 = doctype0.asStartTag();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$Doctype cannot be cast to class org.jsoup.parser.Token$StartTag (org.jsoup.parser.Token$Doctype and org.jsoup.parser.Token$StartTag are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test4077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4077");
        org.jsoup.parser.Token.StartTag startTag2 = new org.jsoup.parser.Token.StartTag();
        startTag2.appendAttributeName('a');
        startTag2.newAttribute();
        boolean boolean6 = startTag2.isDoctype();
        startTag2.finaliseTag();
        boolean boolean8 = startTag2.isDoctype();
        org.jsoup.nodes.Attributes attributes9 = startTag2.getAttributes();
        org.jsoup.parser.Token.StartTag startTag10 = new org.jsoup.parser.Token.StartTag("EOF", attributes9);
        org.jsoup.parser.Token.StartTag startTag11 = new org.jsoup.parser.Token.StartTag("<hi!4>", attributes9);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(attributes9);
    }

    @Test
    public void test4078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4078");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.tokenType();
        org.jsoup.parser.Token.Doctype doctype2 = doctype0.asDoctype();
        java.lang.StringBuilder stringBuilder3 = doctype2.name;
        boolean boolean4 = doctype2.isForceQuirks();
        java.lang.String str5 = doctype2.getPublicIdentifier();
        org.jsoup.parser.Token.TokenType tokenType6 = doctype2.type;
        java.lang.String str7 = doctype2.getPublicIdentifier();
        org.jsoup.parser.Token.TokenType tokenType8 = doctype2.type;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Doctype" + "'", str1, "Doctype");
        org.junit.Assert.assertNotNull(doctype2);
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + tokenType6 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType6.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + tokenType8 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType8.equals(org.jsoup.parser.Token.TokenType.Doctype));
    }

    @Test
    public void test4079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4079");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.Token.EOF eOF1 = new org.jsoup.parser.Token.EOF();
        java.lang.String str2 = eOF1.tokenType();
        boolean boolean3 = xmlTreeBuilder0.process((org.jsoup.parser.Token) eOF1);
        org.jsoup.parser.ParseErrorList parseErrorList6 = null;
        xmlTreeBuilder0.initialiseParse("", "EndTag", parseErrorList6);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder8 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList11 = null;
        xmlTreeBuilder8.initialiseParse("</hi!>", "EOF", parseErrorList11);
        org.jsoup.parser.Token.StartTag startTag13 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag15 = startTag13.name("hi!");
        boolean boolean16 = xmlTreeBuilder8.process((org.jsoup.parser.Token) startTag13);
        org.jsoup.parser.Token.StartTag startTag17 = new org.jsoup.parser.Token.StartTag();
        startTag17.appendTagName('4');
        org.jsoup.nodes.Element element20 = xmlTreeBuilder8.insert(startTag17);
        startTag17.newAttribute();
        boolean boolean22 = startTag17.isEndTag();
        java.lang.String str23 = startTag17.name();
        org.jsoup.nodes.Element element24 = xmlTreeBuilder0.insert(startTag17);
        org.jsoup.parser.Token.Character character26 = new org.jsoup.parser.Token.Character("</<4>Doctype>");
        boolean boolean27 = xmlTreeBuilder0.process((org.jsoup.parser.Token) character26);
        java.lang.String str28 = character26.getData();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Comment comment29 = character26.asComment();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$Character cannot be cast to class org.jsoup.parser.Token$Comment (org.jsoup.parser.Token$Character and org.jsoup.parser.Token$Comment are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "EOF" + "'", str2, "EOF");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(tag15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "4" + "'", str23, "4");
        org.junit.Assert.assertNotNull(element24);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "</<4>Doctype>" + "'", str28, "</<4>Doctype>");
    }

    @Test
    public void test4080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4080");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.parser.Token.StartTag startTag3 = new org.jsoup.parser.Token.StartTag("", attributes2);
        startTag3.selfClosing = false;
        startTag3.appendTagName("</hi!>");
        startTag3.newAttribute();
        org.jsoup.nodes.Attributes attributes9 = startTag3.getAttributes();
        org.jsoup.parser.Token.StartTag startTag10 = new org.jsoup.parser.Token.StartTag("hi!", attributes9);
        startTag10.selfClosing = false;
        startTag10.appendAttributeValue("EndTag");
        boolean boolean15 = startTag10.isDoctype();
        java.lang.String str16 = startTag10.name();
        java.lang.String str17 = startTag10.name();
        java.lang.String str18 = startTag10.tagName;
        org.junit.Assert.assertNotNull(attributes9);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test4081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4081");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.StringBuilder stringBuilder1 = doctype0.name;
        org.jsoup.parser.Token.TokenType tokenType2 = org.jsoup.parser.Token.TokenType.StartTag;
        doctype0.type = tokenType2;
        java.lang.String str4 = doctype0.getSystemIdentifier();
        java.lang.String str5 = doctype0.getPublicIdentifier();
        java.lang.String str6 = doctype0.getSystemIdentifier();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Character character7 = doctype0.asCharacter();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$Doctype cannot be cast to class org.jsoup.parser.Token$Character (org.jsoup.parser.Token$Doctype and org.jsoup.parser.Token$Character are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stringBuilder1);
        org.junit.Assert.assertEquals(stringBuilder1.toString(), "");
        org.junit.Assert.assertTrue("'" + tokenType2 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType2.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test4082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4082");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        xmlTreeBuilder0.initialiseParse("</hi!>", "EOF", parseErrorList3);
        org.jsoup.parser.Token.StartTag startTag5 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag7 = startTag5.name("hi!");
        boolean boolean8 = xmlTreeBuilder0.process((org.jsoup.parser.Token) startTag5);
        org.jsoup.parser.Token.StartTag startTag9 = new org.jsoup.parser.Token.StartTag();
        startTag9.appendTagName('4');
        org.jsoup.nodes.Element element12 = xmlTreeBuilder0.insert(startTag9);
        org.jsoup.parser.Token.Character character14 = new org.jsoup.parser.Token.Character("EOF");
        java.lang.String str15 = character14.getData();
        java.lang.String str16 = character14.toString();
        boolean boolean17 = character14.isStartTag();
        java.lang.String str18 = character14.getData();
        java.lang.String str19 = character14.toString();
        org.jsoup.parser.Token.Character character20 = character14.asCharacter();
        java.lang.String str21 = character14.toString();
        java.lang.String str22 = character14.toString();
        xmlTreeBuilder0.insert(character14);
        org.jsoup.parser.Token.Character character25 = new org.jsoup.parser.Token.Character("EOF");
        java.lang.String str26 = character25.getData();
        java.lang.String str27 = character25.toString();
        boolean boolean28 = character25.isStartTag();
        java.lang.String str29 = character25.getData();
        java.lang.String str30 = character25.toString();
        xmlTreeBuilder0.insert(character25);
        org.jsoup.parser.Token.Comment comment32 = new org.jsoup.parser.Token.Comment();
        xmlTreeBuilder0.insert(comment32);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder34 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList37 = null;
        xmlTreeBuilder34.initialiseParse("</hi!>", "EOF", parseErrorList37);
        org.jsoup.parser.Token.StartTag startTag39 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag41 = startTag39.name("hi!");
        boolean boolean42 = xmlTreeBuilder34.process((org.jsoup.parser.Token) startTag39);
        org.jsoup.parser.Token.StartTag startTag43 = new org.jsoup.parser.Token.StartTag();
        startTag43.appendTagName('4');
        org.jsoup.nodes.Element element46 = xmlTreeBuilder34.insert(startTag43);
        org.jsoup.parser.ParseErrorList parseErrorList49 = null;
        xmlTreeBuilder34.initialiseParse("Character", "Doctype", parseErrorList49);
        org.jsoup.parser.Token.Comment comment51 = new org.jsoup.parser.Token.Comment();
        java.lang.StringBuilder stringBuilder52 = comment51.data;
        xmlTreeBuilder34.insert(comment51);
        org.jsoup.parser.Token.Comment comment54 = new org.jsoup.parser.Token.Comment();
        java.lang.StringBuilder stringBuilder55 = comment54.data;
        org.jsoup.parser.Token.TokenType tokenType56 = org.jsoup.parser.Token.TokenType.Comment;
        comment54.type = tokenType56;
        xmlTreeBuilder34.insert(comment54);
        java.lang.String str59 = comment54.getData();
        java.lang.String str60 = comment54.toString();
        xmlTreeBuilder0.insert(comment54);
        org.jsoup.parser.Token.StartTag startTag62 = new org.jsoup.parser.Token.StartTag();
        startTag62.appendTagName('4');
        java.lang.String str65 = startTag62.name();
        org.jsoup.nodes.Attributes attributes66 = startTag62.attributes;
        boolean boolean67 = xmlTreeBuilder0.process((org.jsoup.parser.Token) startTag62);
        org.jsoup.parser.Token.Character character69 = new org.jsoup.parser.Token.Character("");
        java.lang.String str70 = character69.toString();
        boolean boolean71 = character69.isCharacter();
        boolean boolean72 = xmlTreeBuilder0.process((org.jsoup.parser.Token) character69);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder73 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList76 = null;
        xmlTreeBuilder73.initialiseParse("</hi!>", "EOF", parseErrorList76);
        org.jsoup.parser.Token.StartTag startTag78 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag80 = startTag78.name("hi!");
        boolean boolean81 = xmlTreeBuilder73.process((org.jsoup.parser.Token) startTag78);
        org.jsoup.parser.Token.StartTag startTag82 = new org.jsoup.parser.Token.StartTag();
        startTag82.appendTagName('4');
        org.jsoup.nodes.Element element85 = xmlTreeBuilder73.insert(startTag82);
        org.jsoup.parser.ParseErrorList parseErrorList88 = null;
        xmlTreeBuilder73.initialiseParse("<4>", "</hi!>", parseErrorList88);
        org.jsoup.parser.Token.Character character91 = new org.jsoup.parser.Token.Character("<!---->");
        xmlTreeBuilder73.insert(character91);
        boolean boolean93 = character91.isDoctype();
        xmlTreeBuilder0.insert(character91);
        java.lang.String str95 = character91.getData();
        org.junit.Assert.assertNotNull(tag7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "EOF" + "'", str15, "EOF");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "EOF" + "'", str16, "EOF");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "EOF" + "'", str18, "EOF");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "EOF" + "'", str19, "EOF");
        org.junit.Assert.assertNotNull(character20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "EOF" + "'", str21, "EOF");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "EOF" + "'", str22, "EOF");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "EOF" + "'", str26, "EOF");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "EOF" + "'", str27, "EOF");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "EOF" + "'", str29, "EOF");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "EOF" + "'", str30, "EOF");
        org.junit.Assert.assertNotNull(tag41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(element46);
        org.junit.Assert.assertNotNull(stringBuilder52);
        org.junit.Assert.assertEquals(stringBuilder52.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder55);
        org.junit.Assert.assertEquals(stringBuilder55.toString(), "");
        org.junit.Assert.assertTrue("'" + tokenType56 + "' != '" + org.jsoup.parser.Token.TokenType.Comment + "'", tokenType56.equals(org.jsoup.parser.Token.TokenType.Comment));
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "" + "'", str59, "");
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "<!---->" + "'", str60, "<!---->");
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "4" + "'", str65, "4");
        org.junit.Assert.assertNotNull(attributes66);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "" + "'", str70, "");
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertNotNull(tag80);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + true + "'", boolean81 == true);
        org.junit.Assert.assertNotNull(element85);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + false + "'", boolean93 == false);
        org.junit.Assert.assertEquals("'" + str95 + "' != '" + "<!---->" + "'", str95, "<!---->");
    }

    @Test
    public void test4083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4083");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("hi!");
        boolean boolean2 = endTag1.isStartTag();
        org.jsoup.nodes.Attributes attributes3 = endTag1.getAttributes();
        endTag1.finaliseTag();
        org.jsoup.nodes.Attributes attributes5 = endTag1.attributes;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(attributes3);
        org.junit.Assert.assertNull(attributes5);
    }

    @Test
    public void test4084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4084");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        boolean boolean1 = doctype0.forceQuirks;
        java.lang.String str2 = doctype0.getName();
        boolean boolean3 = doctype0.isEndTag();
        boolean boolean4 = doctype0.isForceQuirks();
        org.jsoup.parser.Token.Doctype doctype5 = doctype0.asDoctype();
        doctype5.forceQuirks = true;
        java.lang.String str8 = doctype5.getName();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(doctype5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test4085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4085");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        boolean boolean1 = doctype0.forceQuirks;
        java.lang.StringBuilder stringBuilder2 = doctype0.systemIdentifier;
        boolean boolean3 = doctype0.forceQuirks;
        boolean boolean4 = doctype0.isForceQuirks();
        java.lang.StringBuilder stringBuilder5 = doctype0.publicIdentifier;
        java.lang.String str6 = doctype0.getSystemIdentifier();
        org.jsoup.parser.Token.TokenType tokenType7 = doctype0.type;
        org.jsoup.parser.Token.Doctype doctype8 = doctype0.asDoctype();
        boolean boolean9 = doctype0.isEOF();
        doctype0.forceQuirks = false;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + tokenType7 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType7.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertNotNull(doctype8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test4086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4086");
        org.jsoup.parser.Token.Character character1 = new org.jsoup.parser.Token.Character("EOF");
        java.lang.String str2 = character1.getData();
        java.lang.String str3 = character1.toString();
        boolean boolean4 = character1.isStartTag();
        java.lang.String str5 = character1.getData();
        java.lang.String str6 = character1.toString();
        boolean boolean7 = character1.isDoctype();
        org.jsoup.parser.Token.Character character8 = character1.asCharacter();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "EOF" + "'", str2, "EOF");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "EOF" + "'", str3, "EOF");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "EOF" + "'", str5, "EOF");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "EOF" + "'", str6, "EOF");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(character8);
    }

    @Test
    public void test4087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4087");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        xmlTreeBuilder0.initialiseParse("Character", "hi!", parseErrorList3);
        org.jsoup.parser.Token.Comment comment5 = new org.jsoup.parser.Token.Comment();
        java.lang.StringBuilder stringBuilder6 = comment5.data;
        java.lang.String str7 = comment5.getData();
        xmlTreeBuilder0.insert(comment5);
        org.jsoup.parser.Token.StartTag startTag9 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag11 = startTag9.name("hi!");
        startTag9.appendAttributeName(' ');
        boolean boolean14 = startTag9.isComment();
        org.jsoup.nodes.Element element15 = xmlTreeBuilder0.insert(startTag9);
        org.jsoup.parser.Token.EndTag endTag17 = new org.jsoup.parser.Token.EndTag("hi!");
        java.lang.String str18 = endTag17.toString();
        java.lang.String str19 = endTag17.toString();
        org.jsoup.parser.Token.TokenType tokenType20 = org.jsoup.parser.Token.TokenType.EndTag;
        endTag17.type = tokenType20;
        boolean boolean22 = xmlTreeBuilder0.process((org.jsoup.parser.Token) endTag17);
        org.jsoup.nodes.Attributes attributes23 = endTag17.attributes;
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(tag11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "</hi!>" + "'", str18, "</hi!>");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "</hi!>" + "'", str19, "</hi!>");
        org.junit.Assert.assertTrue("'" + tokenType20 + "' != '" + org.jsoup.parser.Token.TokenType.EndTag + "'", tokenType20.equals(org.jsoup.parser.Token.TokenType.EndTag));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNull(attributes23);
    }

    @Test
    public void test4088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4088");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        boolean boolean1 = doctype0.forceQuirks;
        java.lang.StringBuilder stringBuilder2 = doctype0.systemIdentifier;
        boolean boolean3 = doctype0.isCharacter();
        doctype0.forceQuirks = false;
        java.lang.StringBuilder stringBuilder6 = doctype0.publicIdentifier;
        boolean boolean7 = doctype0.isStartTag();
        java.lang.StringBuilder stringBuilder8 = doctype0.publicIdentifier;
        boolean boolean9 = doctype0.forceQuirks;
        org.jsoup.parser.Token.Doctype doctype10 = doctype0.asDoctype();
        java.lang.String str11 = doctype10.getPublicIdentifier();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(stringBuilder8);
        org.junit.Assert.assertEquals(stringBuilder8.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(doctype10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test4089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4089");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        boolean boolean1 = doctype0.forceQuirks;
        java.lang.StringBuilder stringBuilder2 = doctype0.systemIdentifier;
        boolean boolean3 = doctype0.isEndTag();
        java.lang.StringBuilder stringBuilder4 = doctype0.systemIdentifier;
        org.jsoup.parser.Token.Doctype doctype5 = doctype0.asDoctype();
        java.lang.StringBuilder stringBuilder6 = doctype5.systemIdentifier;
        boolean boolean7 = doctype5.forceQuirks;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.EndTag endTag8 = doctype5.asEndTag();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$Doctype cannot be cast to class org.jsoup.parser.Token$EndTag (org.jsoup.parser.Token$Doctype and org.jsoup.parser.Token$EndTag are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "");
        org.junit.Assert.assertNotNull(doctype5);
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test4090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4090");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.tokenType();
        java.lang.String str2 = doctype0.getSystemIdentifier();
        java.lang.String str3 = doctype0.tokenType();
        java.lang.StringBuilder stringBuilder4 = doctype0.name;
        doctype0.forceQuirks = true;
        java.lang.Class<?> wildcardClass7 = doctype0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Doctype" + "'", str1, "Doctype");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Doctype" + "'", str3, "Doctype");
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test4091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4091");
        org.jsoup.nodes.Attributes attributes3 = null;
        org.jsoup.parser.Token.StartTag startTag4 = new org.jsoup.parser.Token.StartTag("", attributes3);
        org.jsoup.parser.Token.StartTag startTag5 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag7 = startTag5.name("hi!");
        org.jsoup.nodes.Attributes attributes8 = tag7.attributes;
        startTag4.attributes = attributes8;
        org.jsoup.parser.Token.StartTag startTag10 = new org.jsoup.parser.Token.StartTag("Doctype", attributes8);
        org.jsoup.parser.Token.StartTag startTag11 = new org.jsoup.parser.Token.StartTag("", attributes8);
        startTag11.appendAttributeValue("</hi!>");
        org.jsoup.parser.Token.TokenType tokenType14 = startTag11.type;
        startTag11.appendTagName(' ');
        startTag11.appendTagName('a');
        org.jsoup.parser.Token.Tag tag20 = startTag11.name("hi! ");
        org.junit.Assert.assertNotNull(tag7);
        org.junit.Assert.assertNotNull(attributes8);
        org.junit.Assert.assertTrue("'" + tokenType14 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType14.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertNotNull(tag20);
    }

    @Test
    public void test4092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4092");
        org.jsoup.nodes.Attributes attributes3 = null;
        org.jsoup.parser.Token.StartTag startTag4 = new org.jsoup.parser.Token.StartTag("", attributes3);
        startTag4.selfClosing = false;
        startTag4.appendTagName("</hi!>");
        startTag4.newAttribute();
        org.jsoup.nodes.Attributes attributes10 = startTag4.getAttributes();
        org.jsoup.parser.Token.StartTag startTag11 = new org.jsoup.parser.Token.StartTag("4", attributes10);
        org.jsoup.parser.Token.StartTag startTag12 = new org.jsoup.parser.Token.StartTag("StartTag", attributes10);
        org.jsoup.nodes.Attributes attributes13 = startTag12.getAttributes();
        org.junit.Assert.assertNotNull(attributes10);
        org.junit.Assert.assertNotNull(attributes13);
    }

    @Test
    public void test4093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4093");
        org.jsoup.parser.Token.StartTag startTag1 = new org.jsoup.parser.Token.StartTag("Doctype");
        java.lang.String str2 = startTag1.name();
        org.jsoup.parser.Token.Tag tag4 = startTag1.name("hi!a");
        tag4.selfClosing = true;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Doctype" + "'", str2, "Doctype");
        org.junit.Assert.assertNotNull(tag4);
    }

    @Test
    public void test4094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4094");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        boolean boolean1 = doctype0.forceQuirks;
        java.lang.StringBuilder stringBuilder2 = doctype0.systemIdentifier;
        boolean boolean3 = doctype0.isEndTag();
        java.lang.StringBuilder stringBuilder4 = doctype0.systemIdentifier;
        org.jsoup.parser.Token.Doctype doctype5 = doctype0.asDoctype();
        java.lang.StringBuilder stringBuilder6 = doctype5.systemIdentifier;
        boolean boolean7 = doctype5.forceQuirks;
        boolean boolean8 = doctype5.isForceQuirks();
        doctype5.forceQuirks = false;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.StartTag startTag11 = doctype5.asStartTag();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$Doctype cannot be cast to class org.jsoup.parser.Token$StartTag (org.jsoup.parser.Token$Doctype and org.jsoup.parser.Token$StartTag are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "");
        org.junit.Assert.assertNotNull(doctype5);
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test4095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4095");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.tokenType();
        boolean boolean2 = doctype0.isForceQuirks();
        java.lang.String str3 = doctype0.getPublicIdentifier();
        boolean boolean4 = doctype0.isForceQuirks();
        doctype0.forceQuirks = true;
        org.jsoup.parser.Token.Doctype doctype7 = doctype0.asDoctype();
        java.lang.StringBuilder stringBuilder8 = doctype7.systemIdentifier;
        boolean boolean9 = doctype7.isCharacter();
        java.lang.String str10 = doctype7.getName();
        java.lang.StringBuilder stringBuilder11 = doctype7.name;
        java.lang.StringBuilder stringBuilder12 = doctype7.publicIdentifier;
        boolean boolean13 = doctype7.isCharacter();
        java.lang.StringBuilder stringBuilder14 = doctype7.systemIdentifier;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Doctype" + "'", str1, "Doctype");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(doctype7);
        org.junit.Assert.assertNotNull(stringBuilder8);
        org.junit.Assert.assertEquals(stringBuilder8.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(stringBuilder11);
        org.junit.Assert.assertEquals(stringBuilder11.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder12);
        org.junit.Assert.assertEquals(stringBuilder12.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(stringBuilder14);
        org.junit.Assert.assertEquals(stringBuilder14.toString(), "");
    }

    @Test
    public void test4096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4096");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.tokenType();
        doctype0.forceQuirks = true;
        java.lang.String str4 = doctype0.getSystemIdentifier();
        boolean boolean5 = doctype0.forceQuirks;
        doctype0.forceQuirks = true;
        boolean boolean8 = doctype0.isEndTag();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Doctype" + "'", str1, "Doctype");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test4097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4097");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        boolean boolean1 = doctype0.forceQuirks;
        java.lang.StringBuilder stringBuilder2 = doctype0.systemIdentifier;
        boolean boolean3 = doctype0.forceQuirks;
        boolean boolean4 = doctype0.isStartTag();
        java.lang.StringBuilder stringBuilder5 = doctype0.systemIdentifier;
        java.lang.String str6 = doctype0.getSystemIdentifier();
        java.lang.StringBuilder stringBuilder7 = doctype0.name;
        java.lang.String str8 = doctype0.getPublicIdentifier();
        java.lang.StringBuilder stringBuilder9 = doctype0.publicIdentifier;
        java.lang.String str10 = doctype0.getSystemIdentifier();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.EndTag endTag11 = doctype0.asEndTag();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$Doctype cannot be cast to class org.jsoup.parser.Token$EndTag (org.jsoup.parser.Token$Doctype and org.jsoup.parser.Token$EndTag are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(stringBuilder7);
        org.junit.Assert.assertEquals(stringBuilder7.toString(), "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(stringBuilder9);
        org.junit.Assert.assertEquals(stringBuilder9.toString(), "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test4098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4098");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        boolean boolean1 = doctype0.forceQuirks;
        java.lang.StringBuilder stringBuilder2 = doctype0.systemIdentifier;
        boolean boolean3 = doctype0.forceQuirks;
        boolean boolean4 = doctype0.isStartTag();
        java.lang.StringBuilder stringBuilder5 = doctype0.systemIdentifier;
        java.lang.String str6 = doctype0.getSystemIdentifier();
        boolean boolean7 = doctype0.isDoctype();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test4099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4099");
        org.jsoup.parser.Token.StartTag startTag1 = new org.jsoup.parser.Token.StartTag(" a");
        boolean boolean2 = startTag1.isDoctype();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4100");
        org.jsoup.parser.Token.StartTag startTag3 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag5 = startTag3.name("hi!");
        org.jsoup.nodes.Attributes attributes6 = tag5.attributes;
        org.jsoup.parser.Token.StartTag startTag7 = new org.jsoup.parser.Token.StartTag("</hi!>", attributes6);
        org.jsoup.parser.Token.StartTag startTag8 = new org.jsoup.parser.Token.StartTag("", attributes6);
        org.jsoup.parser.Token.StartTag startTag9 = new org.jsoup.parser.Token.StartTag("<hi!>", attributes6);
        java.lang.String str10 = startTag9.name();
        startTag9.appendAttributeName("<</hi!>>");
        startTag9.appendAttributeName("</hi!a>");
        boolean boolean15 = startTag9.isDoctype();
        org.junit.Assert.assertNotNull(tag5);
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "<hi!>" + "'", str10, "<hi!>");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test4101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4101");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("hi!");
        boolean boolean2 = endTag1.selfClosing;
        org.jsoup.parser.Token.Tag tag4 = endTag1.name("");
        endTag1.tagName = "hi!";
        endTag1.appendTagName("hi!#");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(tag4);
    }

    @Test
    public void test4102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4102");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("hi!");
        java.lang.String str2 = endTag1.toString();
        endTag1.appendTagName(' ');
        endTag1.selfClosing = true;
        endTag1.appendAttributeValue("<</hi!>>hi!");
        endTag1.finaliseTag();
        java.lang.String str10 = endTag1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "</hi!>" + "'", str2, "</hi!>");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "</hi! >" + "'", str10, "</hi! >");
    }

    @Test
    public void test4103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4103");
        org.jsoup.parser.Token.Character character1 = new org.jsoup.parser.Token.Character("</<4</hi!>4>>");
    }

    @Test
    public void test4104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4104");
        org.jsoup.nodes.Attributes attributes1 = null;
        org.jsoup.parser.Token.StartTag startTag2 = new org.jsoup.parser.Token.StartTag("", attributes1);
        startTag2.selfClosing = false;
        startTag2.newAttribute();
        org.jsoup.parser.Token.Tag tag7 = startTag2.name("</hi!>");
        boolean boolean8 = tag7.isCharacter();
        boolean boolean9 = tag7.isComment();
        java.lang.String str10 = tag7.tokenType();
        java.lang.String str11 = tag7.tokenType();
        boolean boolean12 = tag7.selfClosing;
        org.junit.Assert.assertNotNull(tag7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "StartTag" + "'", str10, "StartTag");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "StartTag" + "'", str11, "StartTag");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test4105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4105");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("hi!");
        boolean boolean2 = endTag1.selfClosing;
        org.jsoup.parser.Token.Tag tag4 = endTag1.name("");
        boolean boolean5 = endTag1.isEndTag();
        endTag1.appendAttributeValue("</hi!>");
        endTag1.selfClosing = false;
        endTag1.finaliseTag();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(tag4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test4106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4106");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        boolean boolean1 = doctype0.forceQuirks;
        java.lang.StringBuilder stringBuilder2 = doctype0.systemIdentifier;
        boolean boolean3 = doctype0.isCharacter();
        doctype0.forceQuirks = false;
        boolean boolean6 = doctype0.isEOF();
        java.lang.String str7 = doctype0.tokenType();
        doctype0.forceQuirks = true;
        java.lang.String str10 = doctype0.getPublicIdentifier();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Doctype" + "'", str7, "Doctype");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test4107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4107");
        org.jsoup.parser.Token.EndTag endTag2 = new org.jsoup.parser.Token.EndTag("hi!");
        boolean boolean3 = endTag2.selfClosing;
        endTag2.finaliseTag();
        endTag2.appendAttributeName(' ');
        endTag2.tagName = "Doctype";
        endTag2.appendAttributeName('4');
        endTag2.appendAttributeName("");
        org.jsoup.parser.Token.StartTag startTag14 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag16 = startTag14.name("hi!");
        org.jsoup.parser.Token.TokenType tokenType17 = startTag14.type;
        org.jsoup.parser.Token.TokenType tokenType18 = startTag14.type;
        startTag14.appendAttributeValue('4');
        org.jsoup.nodes.Attributes attributes21 = startTag14.getAttributes();
        org.jsoup.parser.Token.StartTag startTag22 = new org.jsoup.parser.Token.StartTag("EndTag", attributes21);
        endTag2.attributes = attributes21;
        org.jsoup.parser.Token.StartTag startTag24 = new org.jsoup.parser.Token.StartTag("<<</hi! >>>", attributes21);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(tag16);
        org.junit.Assert.assertTrue("'" + tokenType17 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType17.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertTrue("'" + tokenType18 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType18.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertNotNull(attributes21);
    }

    @Test
    public void test4108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4108");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.StringBuilder stringBuilder1 = doctype0.name;
        java.lang.String str2 = doctype0.getPublicIdentifier();
        java.lang.String str3 = doctype0.tokenType();
        org.junit.Assert.assertNotNull(stringBuilder1);
        org.junit.Assert.assertEquals(stringBuilder1.toString(), "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Doctype" + "'", str3, "Doctype");
    }

    @Test
    public void test4109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4109");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("hi!");
        java.lang.String str2 = endTag1.toString();
        java.lang.String str3 = endTag1.toString();
        boolean boolean4 = endTag1.isDoctype();
        endTag1.appendAttributeValue('a');
        endTag1.appendAttributeName("<4>");
        endTag1.appendTagName("<4>");
        boolean boolean11 = endTag1.isDoctype();
        java.lang.String str12 = endTag1.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Doctype doctype13 = endTag1.asDoctype();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$EndTag cannot be cast to class org.jsoup.parser.Token$Doctype (org.jsoup.parser.Token$EndTag and org.jsoup.parser.Token$Doctype are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "</hi!>" + "'", str2, "</hi!>");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "</hi!>" + "'", str3, "</hi!>");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "</hi!<4>>" + "'", str12, "</hi!<4>>");
    }

    @Test
    public void test4110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4110");
        org.jsoup.nodes.Attributes attributes1 = null;
        org.jsoup.parser.Token.StartTag startTag2 = new org.jsoup.parser.Token.StartTag("", attributes1);
        boolean boolean3 = startTag2.isDoctype();
        java.lang.String str4 = startTag2.tagName;
        startTag2.newAttribute();
        startTag2.appendTagName("</hi!>");
        org.jsoup.parser.Token.TokenType tokenType8 = startTag2.type;
        boolean boolean9 = startTag2.isEndTag();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + tokenType8 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType8.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test4111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4111");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        xmlTreeBuilder0.initialiseParse("Character", "hi!", parseErrorList3);
        org.jsoup.parser.Token.Comment comment5 = new org.jsoup.parser.Token.Comment();
        java.lang.StringBuilder stringBuilder6 = comment5.data;
        java.lang.String str7 = comment5.getData();
        xmlTreeBuilder0.insert(comment5);
        org.jsoup.parser.Token.StartTag startTag9 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag11 = startTag9.name("hi!");
        startTag9.appendAttributeName(' ');
        boolean boolean14 = startTag9.isComment();
        org.jsoup.nodes.Element element15 = xmlTreeBuilder0.insert(startTag9);
        org.jsoup.nodes.Attributes attributes20 = null;
        org.jsoup.parser.Token.StartTag startTag21 = new org.jsoup.parser.Token.StartTag("", attributes20);
        org.jsoup.parser.Token.StartTag startTag22 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag24 = startTag22.name("hi!");
        org.jsoup.nodes.Attributes attributes25 = tag24.attributes;
        startTag21.attributes = attributes25;
        org.jsoup.parser.Token.StartTag startTag27 = new org.jsoup.parser.Token.StartTag("Doctype", attributes25);
        org.jsoup.parser.Token.StartTag startTag28 = new org.jsoup.parser.Token.StartTag("", attributes25);
        org.jsoup.parser.Token.StartTag startTag29 = new org.jsoup.parser.Token.StartTag("EOF", attributes25);
        org.jsoup.nodes.Element element30 = xmlTreeBuilder0.insert(startTag29);
        org.jsoup.parser.ParseErrorList parseErrorList33 = null;
        xmlTreeBuilder0.initialiseParse("</<4>>", "</Doctype>", parseErrorList33);
        org.jsoup.parser.Token.Doctype doctype35 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str36 = doctype35.tokenType();
        org.jsoup.parser.Token.Doctype doctype37 = doctype35.asDoctype();
        java.lang.StringBuilder stringBuilder38 = doctype37.name;
        boolean boolean39 = doctype37.isForceQuirks();
        java.lang.String str40 = doctype37.getPublicIdentifier();
        java.lang.String str41 = doctype37.getSystemIdentifier();
        boolean boolean42 = doctype37.isStartTag();
        java.lang.StringBuilder stringBuilder43 = doctype37.publicIdentifier;
        // The following exception was thrown during execution in test generation
        try {
            xmlTreeBuilder0.insert(doctype37);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(tag11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(tag24);
        org.junit.Assert.assertNotNull(attributes25);
        org.junit.Assert.assertNotNull(element30);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "Doctype" + "'", str36, "Doctype");
        org.junit.Assert.assertNotNull(doctype37);
        org.junit.Assert.assertNotNull(stringBuilder38);
        org.junit.Assert.assertEquals(stringBuilder38.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(stringBuilder43);
        org.junit.Assert.assertEquals(stringBuilder43.toString(), "");
    }

    @Test
    public void test4112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4112");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        java.lang.StringBuilder stringBuilder1 = comment0.data;
        java.lang.String str2 = comment0.getData();
        java.lang.StringBuilder stringBuilder3 = comment0.data;
        java.lang.String str4 = comment0.toString();
        java.lang.StringBuilder stringBuilder5 = comment0.data;
        java.lang.String str6 = comment0.toString();
        java.lang.StringBuilder stringBuilder7 = comment0.data;
        java.lang.String str8 = comment0.getData();
        boolean boolean9 = comment0.isComment();
        org.junit.Assert.assertNotNull(stringBuilder1);
        org.junit.Assert.assertEquals(stringBuilder1.toString(), "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<!---->" + "'", str4, "<!---->");
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!---->" + "'", str6, "<!---->");
        org.junit.Assert.assertNotNull(stringBuilder7);
        org.junit.Assert.assertEquals(stringBuilder7.toString(), "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test4113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4113");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        boolean boolean1 = doctype0.forceQuirks;
        java.lang.StringBuilder stringBuilder2 = doctype0.systemIdentifier;
        boolean boolean3 = doctype0.isCharacter();
        java.lang.String str4 = doctype0.getName();
        java.lang.String str5 = doctype0.getSystemIdentifier();
        boolean boolean6 = doctype0.forceQuirks;
        boolean boolean7 = doctype0.isEOF();
        boolean boolean8 = doctype0.forceQuirks;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test4114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4114");
        org.jsoup.parser.Token.StartTag startTag1 = new org.jsoup.parser.Token.StartTag("</hi!>");
        org.jsoup.parser.Token.Tag tag3 = startTag1.name("hi!");
        startTag1.appendAttributeName('4');
        boolean boolean6 = startTag1.isStartTag();
        startTag1.finaliseTag();
        org.junit.Assert.assertNotNull(tag3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test4115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4115");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.tokenType();
        boolean boolean2 = doctype0.isForceQuirks();
        java.lang.String str3 = doctype0.getPublicIdentifier();
        java.lang.String str4 = doctype0.getSystemIdentifier();
        java.lang.String str5 = doctype0.tokenType();
        java.lang.String str6 = doctype0.getSystemIdentifier();
        org.jsoup.parser.Token.TokenType tokenType7 = doctype0.type;
        boolean boolean8 = doctype0.forceQuirks;
        java.lang.String str9 = doctype0.getName();
        java.lang.StringBuilder stringBuilder10 = doctype0.publicIdentifier;
        boolean boolean11 = doctype0.isForceQuirks();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Doctype" + "'", str1, "Doctype");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Doctype" + "'", str5, "Doctype");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + tokenType7 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType7.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(stringBuilder10);
        org.junit.Assert.assertEquals(stringBuilder10.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test4116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4116");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("hi!");
        boolean boolean2 = endTag1.selfClosing;
        endTag1.finaliseTag();
        org.jsoup.parser.Token.TokenType tokenType4 = endTag1.type;
        org.jsoup.nodes.Attributes attributes5 = endTag1.getAttributes();
        org.jsoup.nodes.Attributes attributes8 = null;
        org.jsoup.parser.Token.StartTag startTag9 = new org.jsoup.parser.Token.StartTag("", attributes8);
        startTag9.selfClosing = false;
        startTag9.appendTagName("</hi!>");
        startTag9.newAttribute();
        org.jsoup.nodes.Attributes attributes15 = startTag9.getAttributes();
        org.jsoup.parser.Token.StartTag startTag16 = new org.jsoup.parser.Token.StartTag("hi!", attributes15);
        startTag16.selfClosing = false;
        startTag16.appendAttributeValue("EndTag");
        startTag16.appendAttributeName('#');
        java.lang.String str23 = startTag16.tokenType();
        org.jsoup.nodes.Attributes attributes27 = null;
        org.jsoup.parser.Token.StartTag startTag28 = new org.jsoup.parser.Token.StartTag("", attributes27);
        org.jsoup.parser.Token.StartTag startTag29 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag31 = startTag29.name("hi!");
        org.jsoup.nodes.Attributes attributes32 = tag31.attributes;
        startTag28.attributes = attributes32;
        org.jsoup.parser.Token.StartTag startTag34 = new org.jsoup.parser.Token.StartTag("Doctype", attributes32);
        org.jsoup.parser.Token.StartTag startTag35 = new org.jsoup.parser.Token.StartTag("", attributes32);
        startTag35.appendAttributeValue("</hi!>");
        org.jsoup.parser.Token.TokenType tokenType38 = startTag35.type;
        startTag35.appendTagName(' ');
        startTag35.appendTagName('a');
        org.jsoup.nodes.Attributes attributes43 = startTag35.attributes;
        startTag16.attributes = attributes43;
        endTag1.attributes = attributes43;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + tokenType4 + "' != '" + org.jsoup.parser.Token.TokenType.EndTag + "'", tokenType4.equals(org.jsoup.parser.Token.TokenType.EndTag));
        org.junit.Assert.assertNull(attributes5);
        org.junit.Assert.assertNotNull(attributes15);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "StartTag" + "'", str23, "StartTag");
        org.junit.Assert.assertNotNull(tag31);
        org.junit.Assert.assertNotNull(attributes32);
        org.junit.Assert.assertTrue("'" + tokenType38 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType38.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertNotNull(attributes43);
    }

    @Test
    public void test4117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4117");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        xmlTreeBuilder0.initialiseParse("Character", "hi!", parseErrorList3);
        org.jsoup.parser.ParseErrorList parseErrorList7 = null;
        xmlTreeBuilder0.initialiseParse("</hi!>", "Doctype", parseErrorList7);
        org.jsoup.parser.Token.Comment comment9 = new org.jsoup.parser.Token.Comment();
        java.lang.StringBuilder stringBuilder10 = comment9.data;
        java.lang.String str11 = comment9.getData();
        java.lang.StringBuilder stringBuilder12 = comment9.data;
        java.lang.String str13 = comment9.toString();
        java.lang.StringBuilder stringBuilder14 = comment9.data;
        java.lang.String str15 = comment9.toString();
        xmlTreeBuilder0.insert(comment9);
        org.jsoup.parser.ParseErrorList parseErrorList19 = null;
        xmlTreeBuilder0.initialiseParse("</<4>Doctype>", "</hi! >", parseErrorList19);
        org.jsoup.parser.Token.EndTag endTag22 = new org.jsoup.parser.Token.EndTag("hi!");
        java.lang.String str23 = endTag22.toString();
        java.lang.String str24 = endTag22.toString();
        org.jsoup.parser.Token.TokenType tokenType25 = org.jsoup.parser.Token.TokenType.EndTag;
        endTag22.type = tokenType25;
        boolean boolean27 = endTag22.isStartTag();
        boolean boolean28 = endTag22.isComment();
        org.jsoup.parser.Token.Tag tag30 = endTag22.name("<Doctype>");
        boolean boolean31 = xmlTreeBuilder0.process((org.jsoup.parser.Token) endTag22);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder32 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.Token.EOF eOF33 = new org.jsoup.parser.Token.EOF();
        java.lang.String str34 = eOF33.tokenType();
        boolean boolean35 = xmlTreeBuilder32.process((org.jsoup.parser.Token) eOF33);
        org.jsoup.parser.ParseErrorList parseErrorList38 = null;
        xmlTreeBuilder32.initialiseParse("", "EndTag", parseErrorList38);
        org.jsoup.parser.Token.Character character41 = new org.jsoup.parser.Token.Character("</hi!>");
        java.lang.String str42 = character41.getData();
        java.lang.String str43 = character41.toString();
        xmlTreeBuilder32.insert(character41);
        org.jsoup.parser.Token.Character character46 = new org.jsoup.parser.Token.Character("EOF");
        java.lang.String str47 = character46.getData();
        java.lang.String str48 = character46.toString();
        boolean boolean49 = character46.isStartTag();
        java.lang.String str50 = character46.getData();
        java.lang.String str51 = character46.toString();
        org.jsoup.parser.Token.Character character52 = character46.asCharacter();
        java.lang.String str53 = character46.toString();
        java.lang.String str54 = character46.toString();
        xmlTreeBuilder32.insert(character46);
        xmlTreeBuilder0.insert(character46);
        org.jsoup.parser.Token.Comment comment57 = new org.jsoup.parser.Token.Comment();
        java.lang.StringBuilder stringBuilder58 = comment57.data;
        java.lang.String str59 = comment57.getData();
        java.lang.StringBuilder stringBuilder60 = comment57.data;
        xmlTreeBuilder0.insert(comment57);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder62 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList65 = null;
        xmlTreeBuilder62.initialiseParse("</hi!>", "EOF", parseErrorList65);
        org.jsoup.parser.Token.StartTag startTag67 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag69 = startTag67.name("hi!");
        boolean boolean70 = xmlTreeBuilder62.process((org.jsoup.parser.Token) startTag67);
        org.jsoup.parser.Token.StartTag startTag71 = new org.jsoup.parser.Token.StartTag();
        startTag71.appendTagName('4');
        org.jsoup.nodes.Element element74 = xmlTreeBuilder62.insert(startTag71);
        org.jsoup.parser.ParseErrorList parseErrorList77 = null;
        xmlTreeBuilder62.initialiseParse("Character", "Doctype", parseErrorList77);
        org.jsoup.parser.Token.Comment comment79 = new org.jsoup.parser.Token.Comment();
        java.lang.StringBuilder stringBuilder80 = comment79.data;
        xmlTreeBuilder62.insert(comment79);
        java.lang.String str82 = comment79.toString();
        java.lang.String str83 = comment79.toString();
        java.lang.String str84 = comment79.toString();
        boolean boolean85 = comment79.isEndTag();
        xmlTreeBuilder0.insert(comment79);
        java.lang.StringBuilder stringBuilder87 = comment79.data;
        boolean boolean88 = comment79.isEOF();
        org.junit.Assert.assertNotNull(stringBuilder10);
        org.junit.Assert.assertEquals(stringBuilder10.toString(), "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(stringBuilder12);
        org.junit.Assert.assertEquals(stringBuilder12.toString(), "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "<!---->" + "'", str13, "<!---->");
        org.junit.Assert.assertNotNull(stringBuilder14);
        org.junit.Assert.assertEquals(stringBuilder14.toString(), "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "<!---->" + "'", str15, "<!---->");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "</hi!>" + "'", str23, "</hi!>");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "</hi!>" + "'", str24, "</hi!>");
        org.junit.Assert.assertTrue("'" + tokenType25 + "' != '" + org.jsoup.parser.Token.TokenType.EndTag + "'", tokenType25.equals(org.jsoup.parser.Token.TokenType.EndTag));
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(tag30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "EOF" + "'", str34, "EOF");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "</hi!>" + "'", str42, "</hi!>");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "</hi!>" + "'", str43, "</hi!>");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "EOF" + "'", str47, "EOF");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "EOF" + "'", str48, "EOF");
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "EOF" + "'", str50, "EOF");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "EOF" + "'", str51, "EOF");
        org.junit.Assert.assertNotNull(character52);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "EOF" + "'", str53, "EOF");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "EOF" + "'", str54, "EOF");
        org.junit.Assert.assertNotNull(stringBuilder58);
        org.junit.Assert.assertEquals(stringBuilder58.toString(), "");
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "" + "'", str59, "");
        org.junit.Assert.assertNotNull(stringBuilder60);
        org.junit.Assert.assertEquals(stringBuilder60.toString(), "");
        org.junit.Assert.assertNotNull(tag69);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertNotNull(element74);
        org.junit.Assert.assertNotNull(stringBuilder80);
        org.junit.Assert.assertEquals(stringBuilder80.toString(), "");
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "<!---->" + "'", str82, "<!---->");
        org.junit.Assert.assertEquals("'" + str83 + "' != '" + "<!---->" + "'", str83, "<!---->");
        org.junit.Assert.assertEquals("'" + str84 + "' != '" + "<!---->" + "'", str84, "<!---->");
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertNotNull(stringBuilder87);
        org.junit.Assert.assertEquals(stringBuilder87.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
    }

    @Test
    public void test4118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4118");
        org.jsoup.parser.Token.Character character1 = new org.jsoup.parser.Token.Character("Character");
        java.lang.String str2 = character1.getData();
        java.lang.String str3 = character1.toString();
        java.lang.String str4 = character1.getData();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Character" + "'", str2, "Character");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Character" + "'", str3, "Character");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Character" + "'", str4, "Character");
    }

    @Test
    public void test4119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4119");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.parser.Token.StartTag startTag3 = new org.jsoup.parser.Token.StartTag("", attributes2);
        org.jsoup.parser.Token.StartTag startTag4 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag6 = startTag4.name("hi!");
        org.jsoup.nodes.Attributes attributes7 = tag6.attributes;
        startTag3.attributes = attributes7;
        org.jsoup.parser.Token.StartTag startTag9 = new org.jsoup.parser.Token.StartTag("Doctype", attributes7);
        startTag9.appendAttributeName("</Doctype4>");
        org.junit.Assert.assertNotNull(tag6);
        org.junit.Assert.assertNotNull(attributes7);
    }

    @Test
    public void test4120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4120");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.parser.Token.StartTag startTag3 = new org.jsoup.parser.Token.StartTag("", attributes2);
        startTag3.selfClosing = false;
        startTag3.newAttribute();
        org.jsoup.parser.Token.StartTag startTag8 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag10 = startTag8.name("hi!");
        org.jsoup.nodes.Attributes attributes11 = tag10.attributes;
        org.jsoup.parser.Token.StartTag startTag12 = new org.jsoup.parser.Token.StartTag("", attributes11);
        startTag3.attributes = attributes11;
        org.jsoup.parser.Token.StartTag startTag14 = new org.jsoup.parser.Token.StartTag("EndTag", attributes11);
        boolean boolean15 = startTag14.isCharacter();
        boolean boolean16 = startTag14.isDoctype();
        java.lang.String str17 = startTag14.tokenType();
        startTag14.appendAttributeValue('4');
        org.junit.Assert.assertNotNull(tag10);
        org.junit.Assert.assertNotNull(attributes11);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "StartTag" + "'", str17, "StartTag");
    }

    @Test
    public void test4121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4121");
        org.jsoup.parser.Token.StartTag startTag3 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag5 = startTag3.name("hi!");
        org.jsoup.nodes.Attributes attributes6 = tag5.attributes;
        org.jsoup.parser.Token.StartTag startTag7 = new org.jsoup.parser.Token.StartTag("</hi!>", attributes6);
        org.jsoup.parser.Token.StartTag startTag8 = new org.jsoup.parser.Token.StartTag("", attributes6);
        org.jsoup.parser.Token.StartTag startTag9 = new org.jsoup.parser.Token.StartTag("<hi!>", attributes6);
        java.lang.String str10 = startTag9.name();
        startTag9.appendAttributeName("<</hi!>>");
        startTag9.appendAttributeName("</hi!a>");
        startTag9.tagName = "</Doctype4Character>";
        org.junit.Assert.assertNotNull(tag5);
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "<hi!>" + "'", str10, "<hi!>");
    }

    @Test
    public void test4122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4122");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        xmlTreeBuilder0.initialiseParse("Character", "hi!", parseErrorList3);
        org.jsoup.parser.Token.Comment comment5 = new org.jsoup.parser.Token.Comment();
        java.lang.StringBuilder stringBuilder6 = comment5.data;
        java.lang.String str7 = comment5.getData();
        xmlTreeBuilder0.insert(comment5);
        org.jsoup.parser.Token.StartTag startTag9 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag11 = startTag9.name("hi!");
        startTag9.appendAttributeName(' ');
        boolean boolean14 = startTag9.isComment();
        org.jsoup.nodes.Element element15 = xmlTreeBuilder0.insert(startTag9);
        org.jsoup.nodes.Attributes attributes20 = null;
        org.jsoup.parser.Token.StartTag startTag21 = new org.jsoup.parser.Token.StartTag("", attributes20);
        org.jsoup.parser.Token.StartTag startTag22 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag24 = startTag22.name("hi!");
        org.jsoup.nodes.Attributes attributes25 = tag24.attributes;
        startTag21.attributes = attributes25;
        org.jsoup.parser.Token.StartTag startTag27 = new org.jsoup.parser.Token.StartTag("Doctype", attributes25);
        org.jsoup.parser.Token.StartTag startTag28 = new org.jsoup.parser.Token.StartTag("", attributes25);
        org.jsoup.parser.Token.StartTag startTag29 = new org.jsoup.parser.Token.StartTag("EOF", attributes25);
        org.jsoup.nodes.Element element30 = xmlTreeBuilder0.insert(startTag29);
        startTag29.newAttribute();
        boolean boolean32 = startTag29.isSelfClosing();
        startTag29.appendTagName("4");
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(tag11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(tag24);
        org.junit.Assert.assertNotNull(attributes25);
        org.junit.Assert.assertNotNull(element30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test4123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4123");
        org.jsoup.parser.Token.Character character1 = new org.jsoup.parser.Token.Character("EOF");
        java.lang.String str2 = character1.getData();
        java.lang.String str3 = character1.toString();
        java.lang.String str4 = character1.getData();
        java.lang.String str5 = character1.getData();
        java.lang.String str6 = character1.toString();
        boolean boolean7 = character1.isComment();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "EOF" + "'", str2, "EOF");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "EOF" + "'", str3, "EOF");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "EOF" + "'", str4, "EOF");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "EOF" + "'", str5, "EOF");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "EOF" + "'", str6, "EOF");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test4124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4124");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("<4>");
        org.jsoup.nodes.Attributes attributes3 = null;
        org.jsoup.parser.Token.StartTag startTag4 = new org.jsoup.parser.Token.StartTag("", attributes3);
        boolean boolean5 = startTag4.isDoctype();
        java.lang.String str6 = startTag4.tagName;
        org.jsoup.parser.Token.TokenType tokenType7 = startTag4.type;
        startTag4.appendTagName(' ');
        boolean boolean10 = startTag4.isDoctype();
        org.jsoup.parser.Token.StartTag startTag12 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag14 = startTag12.name("hi!");
        org.jsoup.nodes.Attributes attributes15 = tag14.attributes;
        org.jsoup.parser.Token.StartTag startTag16 = new org.jsoup.parser.Token.StartTag("", attributes15);
        startTag4.attributes = attributes15;
        endTag1.attributes = attributes15;
        org.jsoup.nodes.Attributes attributes19 = endTag1.attributes;
        endTag1.selfClosing = true;
        java.lang.String str22 = endTag1.toString();
        java.lang.String str23 = endTag1.toString();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + tokenType7 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType7.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(tag14);
        org.junit.Assert.assertNotNull(attributes15);
        org.junit.Assert.assertNotNull(attributes19);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "</<4>>" + "'", str22, "</<4>>");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "</<4>>" + "'", str23, "</<4>>");
    }

    @Test
    public void test4125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4125");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        boolean boolean1 = doctype0.forceQuirks;
        java.lang.StringBuilder stringBuilder2 = doctype0.systemIdentifier;
        boolean boolean3 = doctype0.isEndTag();
        boolean boolean4 = doctype0.isForceQuirks();
        java.lang.StringBuilder stringBuilder5 = doctype0.name;
        java.lang.StringBuilder stringBuilder6 = doctype0.systemIdentifier;
        java.lang.String str7 = doctype0.getPublicIdentifier();
        boolean boolean8 = doctype0.forceQuirks;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Comment comment9 = doctype0.asComment();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$Doctype cannot be cast to class org.jsoup.parser.Token$Comment (org.jsoup.parser.Token$Doctype and org.jsoup.parser.Token$Comment are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test4126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4126");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        xmlTreeBuilder0.initialiseParse("</hi!>", "EOF", parseErrorList3);
        org.jsoup.parser.ParseErrorList parseErrorList7 = null;
        xmlTreeBuilder0.initialiseParse("<!---->", "</Doctype4>", parseErrorList7);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder9 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList12 = null;
        xmlTreeBuilder9.initialiseParse("</hi!>", "EOF", parseErrorList12);
        org.jsoup.parser.Token.StartTag startTag14 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag16 = startTag14.name("hi!");
        boolean boolean17 = xmlTreeBuilder9.process((org.jsoup.parser.Token) startTag14);
        boolean boolean18 = xmlTreeBuilder0.process((org.jsoup.parser.Token) startTag14);
        org.jsoup.parser.Token.Character character20 = new org.jsoup.parser.Token.Character("EOF");
        java.lang.String str21 = character20.toString();
        java.lang.String str22 = character20.toString();
        java.lang.String str23 = character20.toString();
        boolean boolean24 = character20.isEOF();
        boolean boolean25 = character20.isDoctype();
        xmlTreeBuilder0.insert(character20);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Doctype doctype27 = character20.asDoctype();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$Character cannot be cast to class org.jsoup.parser.Token$Doctype (org.jsoup.parser.Token$Character and org.jsoup.parser.Token$Doctype are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tag16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "EOF" + "'", str21, "EOF");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "EOF" + "'", str22, "EOF");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "EOF" + "'", str23, "EOF");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test4127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4127");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        xmlTreeBuilder0.initialiseParse("Character", "hi!", parseErrorList3);
        org.jsoup.parser.Token.Comment comment5 = new org.jsoup.parser.Token.Comment();
        java.lang.StringBuilder stringBuilder6 = comment5.data;
        java.lang.String str7 = comment5.getData();
        xmlTreeBuilder0.insert(comment5);
        org.jsoup.parser.Token.StartTag startTag9 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag11 = startTag9.name("hi!");
        startTag9.appendAttributeName(' ');
        boolean boolean14 = startTag9.isComment();
        org.jsoup.nodes.Element element15 = xmlTreeBuilder0.insert(startTag9);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder16 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList19 = null;
        xmlTreeBuilder16.initialiseParse("Character", "hi!", parseErrorList19);
        org.jsoup.parser.Token.Comment comment21 = new org.jsoup.parser.Token.Comment();
        java.lang.StringBuilder stringBuilder22 = comment21.data;
        java.lang.String str23 = comment21.getData();
        xmlTreeBuilder16.insert(comment21);
        org.jsoup.parser.Token.StartTag startTag25 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag27 = startTag25.name("hi!");
        startTag25.appendAttributeName(' ');
        boolean boolean30 = startTag25.isComment();
        org.jsoup.nodes.Element element31 = xmlTreeBuilder16.insert(startTag25);
        org.jsoup.parser.ParseErrorList parseErrorList34 = null;
        xmlTreeBuilder16.initialiseParse("Character", "<Doctype>", parseErrorList34);
        org.jsoup.parser.Token.Character character37 = new org.jsoup.parser.Token.Character("EOF");
        java.lang.String str38 = character37.getData();
        java.lang.String str39 = character37.toString();
        boolean boolean40 = character37.isStartTag();
        java.lang.String str41 = character37.toString();
        xmlTreeBuilder16.insert(character37);
        xmlTreeBuilder0.insert(character37);
        org.jsoup.parser.Token.StartTag startTag44 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag46 = startTag44.name("hi!");
        startTag44.appendAttributeName(' ');
        startTag44.appendAttributeName("hi!");
        boolean boolean51 = startTag44.isSelfClosing();
        org.jsoup.nodes.Element element52 = xmlTreeBuilder0.insert(startTag44);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder53 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList56 = null;
        xmlTreeBuilder53.initialiseParse("Character", "hi!", parseErrorList56);
        org.jsoup.parser.Token.Comment comment58 = new org.jsoup.parser.Token.Comment();
        java.lang.StringBuilder stringBuilder59 = comment58.data;
        java.lang.String str60 = comment58.getData();
        xmlTreeBuilder53.insert(comment58);
        org.jsoup.parser.Token.Character character63 = new org.jsoup.parser.Token.Character("EOF");
        java.lang.String str64 = character63.getData();
        java.lang.String str65 = character63.toString();
        boolean boolean66 = character63.isStartTag();
        java.lang.String str67 = character63.getData();
        java.lang.String str68 = character63.toString();
        org.jsoup.parser.Token.Character character69 = character63.asCharacter();
        xmlTreeBuilder53.insert(character69);
        org.jsoup.parser.Token.StartTag startTag71 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag73 = startTag71.name("hi!");
        startTag71.finaliseTag();
        startTag71.finaliseTag();
        startTag71.appendTagName(' ');
        org.jsoup.nodes.Element element78 = xmlTreeBuilder53.insert(startTag71);
        org.jsoup.parser.Token.Character character80 = new org.jsoup.parser.Token.Character("EOF");
        java.lang.String str81 = character80.getData();
        java.lang.String str82 = character80.toString();
        boolean boolean83 = character80.isStartTag();
        java.lang.String str84 = character80.getData();
        java.lang.String str85 = character80.toString();
        xmlTreeBuilder53.insert(character80);
        org.jsoup.parser.Token.Comment comment87 = new org.jsoup.parser.Token.Comment();
        boolean boolean88 = comment87.isEndTag();
        xmlTreeBuilder53.insert(comment87);
        xmlTreeBuilder0.insert(comment87);
        org.jsoup.parser.ParseErrorList parseErrorList93 = null;
        xmlTreeBuilder0.initialiseParse("", "<<!---->>", parseErrorList93);
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(tag11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(stringBuilder22);
        org.junit.Assert.assertEquals(stringBuilder22.toString(), "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(tag27);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(element31);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "EOF" + "'", str38, "EOF");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "EOF" + "'", str39, "EOF");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "EOF" + "'", str41, "EOF");
        org.junit.Assert.assertNotNull(tag46);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(element52);
        org.junit.Assert.assertNotNull(stringBuilder59);
        org.junit.Assert.assertEquals(stringBuilder59.toString(), "");
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "" + "'", str60, "");
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "EOF" + "'", str64, "EOF");
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "EOF" + "'", str65, "EOF");
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "EOF" + "'", str67, "EOF");
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "EOF" + "'", str68, "EOF");
        org.junit.Assert.assertNotNull(character69);
        org.junit.Assert.assertNotNull(tag73);
        org.junit.Assert.assertNotNull(element78);
        org.junit.Assert.assertEquals("'" + str81 + "' != '" + "EOF" + "'", str81, "EOF");
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "EOF" + "'", str82, "EOF");
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertEquals("'" + str84 + "' != '" + "EOF" + "'", str84, "EOF");
        org.junit.Assert.assertEquals("'" + str85 + "' != '" + "EOF" + "'", str85, "EOF");
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
    }

    @Test
    public void test4128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4128");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("hi!");
        boolean boolean2 = endTag1.selfClosing;
        endTag1.finaliseTag();
        endTag1.appendAttributeName(' ');
        boolean boolean6 = endTag1.isSelfClosing();
        org.jsoup.parser.Token.TokenType tokenType7 = null;
        endTag1.type = tokenType7;
        org.jsoup.parser.Token.StartTag startTag9 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag11 = startTag9.name("hi!");
        org.jsoup.parser.Token.TokenType tokenType12 = startTag9.type;
        org.jsoup.parser.Token.TokenType tokenType13 = startTag9.type;
        endTag1.type = tokenType13;
        endTag1.appendTagName("<</<4>Doctype>>");
        java.lang.String str17 = endTag1.toString();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(tag11);
        org.junit.Assert.assertTrue("'" + tokenType12 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType12.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertTrue("'" + tokenType13 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType13.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "</hi!<</<4>Doctype>>>" + "'", str17, "</hi!<</<4>Doctype>>>");
    }

    @Test
    public void test4129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4129");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag2 = startTag0.name("hi!");
        startTag0.appendAttributeName(' ');
        boolean boolean5 = startTag0.isComment();
        startTag0.tagName = "<Doctype>";
        boolean boolean8 = startTag0.isComment();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Comment comment9 = startTag0.asComment();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$Comment (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$Comment are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tag2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test4130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4130");
        org.jsoup.parser.Token.StartTag startTag1 = new org.jsoup.parser.Token.StartTag("<!---->");
        startTag1.appendAttributeValue('a');
    }

    @Test
    public void test4131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4131");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        boolean boolean1 = endTag0.isDoctype();
        endTag0.appendAttributeValue("< >");
        endTag0.finaliseTag();
        endTag0.tagName = "<StartTag>";
        org.jsoup.parser.Token.Tag tag8 = endTag0.name("</StartTaga>");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(tag8);
    }

    @Test
    public void test4132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4132");
        org.jsoup.nodes.Attributes attributes1 = null;
        org.jsoup.parser.Token.StartTag startTag2 = new org.jsoup.parser.Token.StartTag("</<4>>", attributes1);
    }

    @Test
    public void test4133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4133");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        boolean boolean1 = doctype0.forceQuirks;
        java.lang.StringBuilder stringBuilder2 = doctype0.systemIdentifier;
        boolean boolean3 = doctype0.isCharacter();
        doctype0.forceQuirks = false;
        boolean boolean6 = doctype0.isEOF();
        java.lang.String str7 = doctype0.tokenType();
        java.lang.StringBuilder stringBuilder8 = doctype0.systemIdentifier;
        java.lang.StringBuilder stringBuilder9 = doctype0.publicIdentifier;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Doctype" + "'", str7, "Doctype");
        org.junit.Assert.assertNotNull(stringBuilder8);
        org.junit.Assert.assertEquals(stringBuilder8.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder9);
        org.junit.Assert.assertEquals(stringBuilder9.toString(), "");
    }

    @Test
    public void test4134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4134");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag2 = startTag0.name("hi!");
        startTag0.finaliseTag();
        startTag0.finaliseTag();
        startTag0.appendTagName(' ');
        startTag0.appendAttributeName("</<4>>");
        startTag0.appendTagName("<</<4>Doctype>>");
        org.jsoup.nodes.Attributes attributes11 = startTag0.attributes;
        boolean boolean12 = startTag0.isEOF();
        org.junit.Assert.assertNotNull(tag2);
        org.junit.Assert.assertNotNull(attributes11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test4135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4135");
        org.jsoup.parser.Token.StartTag startTag1 = new org.jsoup.parser.Token.StartTag("<<hi!>>");
        boolean boolean2 = startTag1.isStartTag();
        startTag1.tagName = "<4>";
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test4136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4136");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        xmlTreeBuilder0.initialiseParse("</hi!>", "EOF", parseErrorList3);
        org.jsoup.parser.Token.Comment comment5 = new org.jsoup.parser.Token.Comment();
        java.lang.StringBuilder stringBuilder6 = comment5.data;
        org.jsoup.parser.Token.TokenType tokenType7 = org.jsoup.parser.Token.TokenType.Comment;
        comment5.type = tokenType7;
        java.lang.StringBuilder stringBuilder9 = comment5.data;
        boolean boolean10 = xmlTreeBuilder0.process((org.jsoup.parser.Token) comment5);
        org.jsoup.parser.Token.Comment comment11 = new org.jsoup.parser.Token.Comment();
        java.lang.StringBuilder stringBuilder12 = comment11.data;
        org.jsoup.parser.Token.TokenType tokenType13 = org.jsoup.parser.Token.TokenType.Comment;
        comment11.type = tokenType13;
        java.lang.StringBuilder stringBuilder15 = comment11.data;
        java.lang.String str16 = comment11.getData();
        xmlTreeBuilder0.insert(comment11);
        org.jsoup.parser.ParseErrorList parseErrorList20 = null;
        xmlTreeBuilder0.initialiseParse("</<4>>", "<<hi!>>", parseErrorList20);
        org.jsoup.parser.Token.StartTag startTag23 = new org.jsoup.parser.Token.StartTag("4");
        java.lang.String str24 = startTag23.name();
        boolean boolean25 = startTag23.selfClosing;
        org.jsoup.nodes.Element element26 = xmlTreeBuilder0.insert(startTag23);
        org.jsoup.parser.Token.Doctype doctype27 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str28 = doctype27.tokenType();
        boolean boolean29 = doctype27.isForceQuirks();
        java.lang.String str30 = doctype27.getPublicIdentifier();
        boolean boolean31 = doctype27.isForceQuirks();
        java.lang.String str32 = doctype27.getSystemIdentifier();
        // The following exception was thrown during execution in test generation
        try {
            xmlTreeBuilder0.insert(doctype27);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "");
        org.junit.Assert.assertTrue("'" + tokenType7 + "' != '" + org.jsoup.parser.Token.TokenType.Comment + "'", tokenType7.equals(org.jsoup.parser.Token.TokenType.Comment));
        org.junit.Assert.assertNotNull(stringBuilder9);
        org.junit.Assert.assertEquals(stringBuilder9.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(stringBuilder12);
        org.junit.Assert.assertEquals(stringBuilder12.toString(), "");
        org.junit.Assert.assertTrue("'" + tokenType13 + "' != '" + org.jsoup.parser.Token.TokenType.Comment + "'", tokenType13.equals(org.jsoup.parser.Token.TokenType.Comment));
        org.junit.Assert.assertNotNull(stringBuilder15);
        org.junit.Assert.assertEquals(stringBuilder15.toString(), "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "4" + "'", str24, "4");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(element26);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Doctype" + "'", str28, "Doctype");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
    }

    @Test
    public void test4137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4137");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        xmlTreeBuilder0.initialiseParse("</hi!>", "EOF", parseErrorList3);
        org.jsoup.parser.Token.StartTag startTag5 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag7 = startTag5.name("hi!");
        boolean boolean8 = xmlTreeBuilder0.process((org.jsoup.parser.Token) startTag5);
        org.jsoup.parser.Token.StartTag startTag9 = new org.jsoup.parser.Token.StartTag();
        startTag9.appendTagName('4');
        org.jsoup.nodes.Element element12 = xmlTreeBuilder0.insert(startTag9);
        org.jsoup.parser.ParseErrorList parseErrorList15 = null;
        xmlTreeBuilder0.initialiseParse("<4>", "</hi!>", parseErrorList15);
        org.jsoup.parser.Token.Character character18 = new org.jsoup.parser.Token.Character("<!---->");
        xmlTreeBuilder0.insert(character18);
        org.jsoup.parser.Token.Comment comment20 = new org.jsoup.parser.Token.Comment();
        java.lang.StringBuilder stringBuilder21 = comment20.data;
        java.lang.String str22 = comment20.getData();
        java.lang.StringBuilder stringBuilder23 = comment20.data;
        java.lang.String str24 = comment20.toString();
        java.lang.String str25 = comment20.tokenType();
        java.lang.StringBuilder stringBuilder26 = comment20.data;
        xmlTreeBuilder0.insert(comment20);
        org.jsoup.parser.Token.EndTag endTag29 = new org.jsoup.parser.Token.EndTag("hi!");
        boolean boolean30 = endTag29.selfClosing;
        java.lang.String str31 = endTag29.toString();
        org.jsoup.parser.Token.StartTag startTag32 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag34 = startTag32.name("hi!");
        tag34.finaliseTag();
        tag34.newAttribute();
        org.jsoup.nodes.Attributes attributes37 = tag34.attributes;
        endTag29.attributes = attributes37;
        boolean boolean39 = xmlTreeBuilder0.process((org.jsoup.parser.Token) endTag29);
        boolean boolean40 = endTag29.isEndTag();
        endTag29.appendTagName('#');
        org.junit.Assert.assertNotNull(tag7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(stringBuilder21);
        org.junit.Assert.assertEquals(stringBuilder21.toString(), "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(stringBuilder23);
        org.junit.Assert.assertEquals(stringBuilder23.toString(), "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "<!---->" + "'", str24, "<!---->");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Comment" + "'", str25, "Comment");
        org.junit.Assert.assertNotNull(stringBuilder26);
        org.junit.Assert.assertEquals(stringBuilder26.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "</hi!>" + "'", str31, "</hi!>");
        org.junit.Assert.assertNotNull(tag34);
        org.junit.Assert.assertNotNull(attributes37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
    }

    @Test
    public void test4138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4138");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.tokenType();
        boolean boolean2 = doctype0.isForceQuirks();
        java.lang.String str3 = doctype0.getPublicIdentifier();
        boolean boolean4 = doctype0.isForceQuirks();
        doctype0.forceQuirks = true;
        boolean boolean7 = doctype0.forceQuirks;
        java.lang.String str8 = doctype0.getPublicIdentifier();
        doctype0.forceQuirks = true;
        doctype0.forceQuirks = true;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Doctype" + "'", str1, "Doctype");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test4139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4139");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.tokenType();
        boolean boolean2 = doctype0.isForceQuirks();
        java.lang.String str3 = doctype0.getPublicIdentifier();
        boolean boolean4 = doctype0.isForceQuirks();
        doctype0.forceQuirks = true;
        boolean boolean7 = doctype0.forceQuirks;
        doctype0.forceQuirks = false;
        boolean boolean10 = doctype0.forceQuirks;
        boolean boolean11 = doctype0.isForceQuirks();
        java.lang.StringBuilder stringBuilder12 = doctype0.systemIdentifier;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Doctype" + "'", str1, "Doctype");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(stringBuilder12);
        org.junit.Assert.assertEquals(stringBuilder12.toString(), "");
    }

    @Test
    public void test4140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4140");
        org.jsoup.parser.Token.StartTag startTag1 = new org.jsoup.parser.Token.StartTag("Doctype</<4>>");
        boolean boolean2 = startTag1.isCharacter();
        startTag1.appendAttributeName('#');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4141");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("<4>");
        org.jsoup.nodes.Attributes attributes3 = null;
        org.jsoup.parser.Token.StartTag startTag4 = new org.jsoup.parser.Token.StartTag("", attributes3);
        boolean boolean5 = startTag4.isDoctype();
        java.lang.String str6 = startTag4.tagName;
        org.jsoup.parser.Token.TokenType tokenType7 = startTag4.type;
        startTag4.appendTagName(' ');
        boolean boolean10 = startTag4.isDoctype();
        org.jsoup.parser.Token.StartTag startTag12 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag14 = startTag12.name("hi!");
        org.jsoup.nodes.Attributes attributes15 = tag14.attributes;
        org.jsoup.parser.Token.StartTag startTag16 = new org.jsoup.parser.Token.StartTag("", attributes15);
        startTag4.attributes = attributes15;
        endTag1.attributes = attributes15;
        org.jsoup.nodes.Attributes attributes19 = endTag1.attributes;
        endTag1.selfClosing = true;
        java.lang.String str22 = endTag1.toString();
        boolean boolean23 = endTag1.selfClosing;
        boolean boolean24 = endTag1.isEOF();
        boolean boolean25 = endTag1.isSelfClosing();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Doctype doctype26 = endTag1.asDoctype();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$EndTag cannot be cast to class org.jsoup.parser.Token$Doctype (org.jsoup.parser.Token$EndTag and org.jsoup.parser.Token$Doctype are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + tokenType7 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType7.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(tag14);
        org.junit.Assert.assertNotNull(attributes15);
        org.junit.Assert.assertNotNull(attributes19);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "</<4>>" + "'", str22, "</<4>>");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test4142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4142");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        xmlTreeBuilder0.initialiseParse("</hi!>", "EOF", parseErrorList3);
        org.jsoup.parser.Token.StartTag startTag5 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag7 = startTag5.name("hi!");
        boolean boolean8 = xmlTreeBuilder0.process((org.jsoup.parser.Token) startTag5);
        org.jsoup.parser.Token.StartTag startTag9 = new org.jsoup.parser.Token.StartTag();
        startTag9.appendTagName('4');
        org.jsoup.nodes.Element element12 = xmlTreeBuilder0.insert(startTag9);
        org.jsoup.parser.ParseErrorList parseErrorList15 = null;
        xmlTreeBuilder0.initialiseParse("Character", "Doctype", parseErrorList15);
        org.jsoup.parser.Token.Character character18 = new org.jsoup.parser.Token.Character("EOF");
        java.lang.String str19 = character18.getData();
        boolean boolean20 = character18.isComment();
        org.jsoup.parser.Token.Comment comment21 = new org.jsoup.parser.Token.Comment();
        java.lang.StringBuilder stringBuilder22 = comment21.data;
        org.jsoup.parser.Token.TokenType tokenType23 = org.jsoup.parser.Token.TokenType.Comment;
        comment21.type = tokenType23;
        character18.type = tokenType23;
        java.lang.String str26 = character18.toString();
        java.lang.String str27 = character18.toString();
        xmlTreeBuilder0.insert(character18);
        org.jsoup.parser.ParseErrorList parseErrorList31 = null;
        xmlTreeBuilder0.initialiseParse("Doctype", "4", parseErrorList31);
        org.jsoup.parser.Token.StartTag startTag34 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag36 = startTag34.name("hi!");
        startTag34.appendAttributeName(' ');
        boolean boolean39 = startTag34.isComment();
        java.lang.String str40 = startTag34.tagName;
        startTag34.newAttribute();
        org.jsoup.nodes.Attributes attributes42 = startTag34.attributes;
        org.jsoup.parser.Token.StartTag startTag43 = new org.jsoup.parser.Token.StartTag("hi!<4>", attributes42);
        org.jsoup.nodes.Element element44 = xmlTreeBuilder0.insert(startTag43);
        org.junit.Assert.assertNotNull(tag7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "EOF" + "'", str19, "EOF");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(stringBuilder22);
        org.junit.Assert.assertEquals(stringBuilder22.toString(), "");
        org.junit.Assert.assertTrue("'" + tokenType23 + "' != '" + org.jsoup.parser.Token.TokenType.Comment + "'", tokenType23.equals(org.jsoup.parser.Token.TokenType.Comment));
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "EOF" + "'", str26, "EOF");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "EOF" + "'", str27, "EOF");
        org.junit.Assert.assertNotNull(tag36);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "hi!" + "'", str40, "hi!");
        org.junit.Assert.assertNotNull(attributes42);
        org.junit.Assert.assertNotNull(element44);
    }

    @Test
    public void test4143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4143");
        org.jsoup.nodes.Attributes attributes4 = null;
        org.jsoup.parser.Token.StartTag startTag5 = new org.jsoup.parser.Token.StartTag("", attributes4);
        startTag5.selfClosing = false;
        startTag5.appendTagName("</hi!>");
        startTag5.newAttribute();
        org.jsoup.nodes.Attributes attributes11 = startTag5.getAttributes();
        org.jsoup.parser.Token.StartTag startTag12 = new org.jsoup.parser.Token.StartTag("Doctype", attributes11);
        org.jsoup.parser.Token.StartTag startTag13 = new org.jsoup.parser.Token.StartTag("hi!", attributes11);
        org.jsoup.parser.Token.StartTag startTag14 = new org.jsoup.parser.Token.StartTag("</hi!>4", attributes11);
        startTag14.selfClosing = false;
        boolean boolean17 = startTag14.selfClosing;
        org.jsoup.parser.Token.StartTag startTag18 = startTag14.asStartTag();
        java.lang.String str19 = startTag14.name();
        org.junit.Assert.assertNotNull(attributes11);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(startTag18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "</hi!>4" + "'", str19, "</hi!>4");
    }

    @Test
    public void test4144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4144");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.tokenType();
        boolean boolean2 = doctype0.isForceQuirks();
        java.lang.String str3 = doctype0.getPublicIdentifier();
        java.lang.String str4 = doctype0.getSystemIdentifier();
        java.lang.String str5 = doctype0.getPublicIdentifier();
        java.lang.String str6 = doctype0.getName();
        java.lang.StringBuilder stringBuilder7 = doctype0.name;
        java.lang.String str8 = doctype0.getPublicIdentifier();
        java.lang.StringBuilder stringBuilder9 = doctype0.name;
        java.lang.StringBuilder stringBuilder10 = doctype0.name;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Doctype" + "'", str1, "Doctype");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(stringBuilder7);
        org.junit.Assert.assertEquals(stringBuilder7.toString(), "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(stringBuilder9);
        org.junit.Assert.assertEquals(stringBuilder9.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder10);
        org.junit.Assert.assertEquals(stringBuilder10.toString(), "");
    }

    @Test
    public void test4145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4145");
        org.jsoup.parser.Token.StartTag startTag1 = new org.jsoup.parser.Token.StartTag("Comment");
        boolean boolean2 = startTag1.isEndTag();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4146");
        org.jsoup.parser.Token.StartTag startTag2 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag4 = startTag2.name("hi!");
        org.jsoup.nodes.Attributes attributes5 = tag4.attributes;
        org.jsoup.parser.Token.StartTag startTag6 = new org.jsoup.parser.Token.StartTag("</hi!>", attributes5);
        org.jsoup.parser.Token.StartTag startTag7 = new org.jsoup.parser.Token.StartTag("", attributes5);
        java.lang.String str8 = startTag7.tokenType();
        startTag7.finaliseTag();
        startTag7.tagName = "<Doctype>";
        java.lang.String str12 = startTag7.name();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder13 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList16 = null;
        xmlTreeBuilder13.initialiseParse("</hi!>", "EOF", parseErrorList16);
        org.jsoup.parser.Token.StartTag startTag18 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag20 = startTag18.name("hi!");
        boolean boolean21 = xmlTreeBuilder13.process((org.jsoup.parser.Token) startTag18);
        org.jsoup.parser.Token.StartTag startTag22 = new org.jsoup.parser.Token.StartTag();
        startTag22.appendTagName('4');
        org.jsoup.nodes.Element element25 = xmlTreeBuilder13.insert(startTag22);
        java.lang.String str26 = startTag22.toString();
        startTag22.appendAttributeValue("<hi!>");
        org.jsoup.nodes.Attributes attributes29 = startTag22.attributes;
        startTag7.attributes = attributes29;
        org.junit.Assert.assertNotNull(tag4);
        org.junit.Assert.assertNotNull(attributes5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "StartTag" + "'", str8, "StartTag");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "<Doctype>" + "'", str12, "<Doctype>");
        org.junit.Assert.assertNotNull(tag20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(element25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "<4>" + "'", str26, "<4>");
        org.junit.Assert.assertNotNull(attributes29);
    }

    @Test
    public void test4147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4147");
        org.jsoup.nodes.Attributes attributes1 = null;
        org.jsoup.parser.Token.StartTag startTag2 = new org.jsoup.parser.Token.StartTag("", attributes1);
        boolean boolean3 = startTag2.isDoctype();
        java.lang.String str4 = startTag2.tagName;
        startTag2.selfClosing = false;
        org.jsoup.parser.Token.Tag tag8 = startTag2.name("</hi!>");
        java.lang.String str9 = tag8.name();
        tag8.selfClosing = false;
        org.jsoup.nodes.Attributes attributes12 = tag8.getAttributes();
        java.lang.String str13 = tag8.tagName;
        org.jsoup.parser.Token.StartTag startTag14 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag16 = startTag14.name("hi!");
        org.jsoup.nodes.Attributes attributes17 = tag16.attributes;
        org.jsoup.parser.Token.Tag tag19 = tag16.name("<</hi!>>");
        org.jsoup.parser.Token.EOF eOF20 = new org.jsoup.parser.Token.EOF();
        org.jsoup.parser.Token.TokenType tokenType21 = eOF20.type;
        tag16.type = tokenType21;
        tag8.type = tokenType21;
        tag8.newAttribute();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(tag8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "</hi!>" + "'", str9, "</hi!>");
        org.junit.Assert.assertNull(attributes12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "</hi!>" + "'", str13, "</hi!>");
        org.junit.Assert.assertNotNull(tag16);
        org.junit.Assert.assertNotNull(attributes17);
        org.junit.Assert.assertNotNull(tag19);
        org.junit.Assert.assertTrue("'" + tokenType21 + "' != '" + org.jsoup.parser.Token.TokenType.EOF + "'", tokenType21.equals(org.jsoup.parser.Token.TokenType.EOF));
    }

    @Test
    public void test4148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4148");
        org.jsoup.parser.Token.StartTag startTag3 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag5 = startTag3.name("hi!");
        org.jsoup.nodes.Attributes attributes6 = tag5.attributes;
        org.jsoup.parser.Token.StartTag startTag7 = new org.jsoup.parser.Token.StartTag("</hi!>", attributes6);
        org.jsoup.parser.Token.StartTag startTag8 = new org.jsoup.parser.Token.StartTag("", attributes6);
        org.jsoup.parser.Token.StartTag startTag9 = new org.jsoup.parser.Token.StartTag("<hi!>", attributes6);
        boolean boolean10 = startTag9.isComment();
        startTag9.appendAttributeValue("</<4>>");
        org.jsoup.parser.Token.Tag tag14 = startTag9.name("</hi!4#>");
        org.junit.Assert.assertNotNull(tag5);
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(tag14);
    }

    @Test
    public void test4149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4149");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        boolean boolean1 = endTag0.isDoctype();
        endTag0.appendAttributeValue("< >");
        endTag0.finaliseTag();
        boolean boolean5 = endTag0.isSelfClosing();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test4150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4150");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag2 = startTag0.name("hi!");
        startTag0.appendAttributeName(' ');
        boolean boolean5 = startTag0.isComment();
        java.lang.String str6 = startTag0.tagName;
        boolean boolean7 = startTag0.isStartTag();
        startTag0.appendAttributeValue('4');
        org.junit.Assert.assertNotNull(tag2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test4151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4151");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        boolean boolean1 = doctype0.forceQuirks;
        java.lang.StringBuilder stringBuilder2 = doctype0.systemIdentifier;
        boolean boolean3 = doctype0.isCharacter();
        doctype0.forceQuirks = false;
        java.lang.String str6 = doctype0.getSystemIdentifier();
        org.jsoup.parser.Token.Doctype doctype7 = new org.jsoup.parser.Token.Doctype();
        boolean boolean8 = doctype7.forceQuirks;
        java.lang.StringBuilder stringBuilder9 = doctype7.systemIdentifier;
        boolean boolean10 = doctype7.isCharacter();
        doctype7.forceQuirks = false;
        java.lang.StringBuilder stringBuilder13 = doctype7.publicIdentifier;
        boolean boolean14 = doctype7.isForceQuirks();
        boolean boolean15 = doctype7.forceQuirks;
        boolean boolean16 = doctype7.forceQuirks;
        org.jsoup.nodes.Attributes attributes19 = null;
        org.jsoup.parser.Token.StartTag startTag20 = new org.jsoup.parser.Token.StartTag("", attributes19);
        startTag20.selfClosing = false;
        startTag20.appendTagName("</hi!>");
        startTag20.newAttribute();
        org.jsoup.nodes.Attributes attributes26 = startTag20.getAttributes();
        org.jsoup.parser.Token.StartTag startTag27 = new org.jsoup.parser.Token.StartTag("hi!", attributes26);
        org.jsoup.parser.Token.TokenType tokenType28 = startTag27.type;
        doctype7.type = tokenType28;
        org.jsoup.parser.Token.EndTag endTag31 = new org.jsoup.parser.Token.EndTag("hi!");
        java.lang.String str32 = endTag31.toString();
        java.lang.String str33 = endTag31.toString();
        boolean boolean34 = endTag31.isDoctype();
        java.lang.String str35 = endTag31.tagName;
        endTag31.appendAttributeName("<!---->");
        org.jsoup.parser.Token.TokenType tokenType38 = endTag31.type;
        doctype7.type = tokenType38;
        doctype0.type = tokenType38;
        java.lang.String str41 = doctype0.getPublicIdentifier();
        java.lang.String str42 = doctype0.tokenType();
        boolean boolean43 = doctype0.isForceQuirks();
        java.lang.StringBuilder stringBuilder44 = doctype0.publicIdentifier;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(stringBuilder9);
        org.junit.Assert.assertEquals(stringBuilder9.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(stringBuilder13);
        org.junit.Assert.assertEquals(stringBuilder13.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(attributes26);
        org.junit.Assert.assertTrue("'" + tokenType28 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType28.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "</hi!>" + "'", str32, "</hi!>");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "</hi!>" + "'", str33, "</hi!>");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
        org.junit.Assert.assertTrue("'" + tokenType38 + "' != '" + org.jsoup.parser.Token.TokenType.EndTag + "'", tokenType38.equals(org.jsoup.parser.Token.TokenType.EndTag));
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "Doctype" + "'", str42, "Doctype");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(stringBuilder44);
        org.junit.Assert.assertEquals(stringBuilder44.toString(), "");
    }

    @Test
    public void test4152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4152");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.tokenType();
        doctype0.forceQuirks = true;
        boolean boolean4 = doctype0.forceQuirks;
        boolean boolean5 = doctype0.isCharacter();
        java.lang.String str6 = doctype0.getName();
        java.lang.String str7 = doctype0.getSystemIdentifier();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Doctype" + "'", str1, "Doctype");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test4153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4153");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        boolean boolean1 = doctype0.forceQuirks;
        java.lang.StringBuilder stringBuilder2 = doctype0.systemIdentifier;
        boolean boolean3 = doctype0.isEndTag();
        boolean boolean4 = doctype0.isForceQuirks();
        doctype0.forceQuirks = false;
        java.lang.String str7 = doctype0.getName();
        java.lang.String str8 = doctype0.getPublicIdentifier();
        java.lang.String str9 = doctype0.getName();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test4154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4154");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        xmlTreeBuilder0.initialiseParse("</hi!>", "EOF", parseErrorList3);
        org.jsoup.parser.Token.StartTag startTag5 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag7 = startTag5.name("hi!");
        boolean boolean8 = xmlTreeBuilder0.process((org.jsoup.parser.Token) startTag5);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder9 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList12 = null;
        xmlTreeBuilder9.initialiseParse("Character", "hi!", parseErrorList12);
        org.jsoup.parser.Token.Comment comment14 = new org.jsoup.parser.Token.Comment();
        java.lang.StringBuilder stringBuilder15 = comment14.data;
        java.lang.String str16 = comment14.getData();
        xmlTreeBuilder9.insert(comment14);
        xmlTreeBuilder0.insert(comment14);
        org.jsoup.parser.Token.StartTag startTag20 = new org.jsoup.parser.Token.StartTag("4");
        startTag20.appendAttributeValue('a');
        startTag20.appendTagName("</hi!>4");
        org.jsoup.nodes.Element element25 = xmlTreeBuilder0.insert(startTag20);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder26 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList29 = null;
        xmlTreeBuilder26.initialiseParse("Character", "hi!", parseErrorList29);
        org.jsoup.parser.Token.StartTag startTag31 = new org.jsoup.parser.Token.StartTag();
        startTag31.appendTagName('a');
        startTag31.newAttribute();
        org.jsoup.nodes.Element element35 = xmlTreeBuilder26.insert(startTag31);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder36 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList39 = null;
        xmlTreeBuilder36.initialiseParse("Character", "hi!", parseErrorList39);
        org.jsoup.parser.Token.Comment comment41 = new org.jsoup.parser.Token.Comment();
        java.lang.StringBuilder stringBuilder42 = comment41.data;
        java.lang.String str43 = comment41.getData();
        xmlTreeBuilder36.insert(comment41);
        org.jsoup.parser.Token.StartTag startTag45 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag47 = startTag45.name("hi!");
        startTag45.appendAttributeName(' ');
        boolean boolean50 = startTag45.isComment();
        org.jsoup.nodes.Element element51 = xmlTreeBuilder36.insert(startTag45);
        org.jsoup.parser.Token.StartTag startTag53 = new org.jsoup.parser.Token.StartTag("Doctype");
        java.lang.String str54 = startTag53.name();
        boolean boolean55 = xmlTreeBuilder36.process((org.jsoup.parser.Token) startTag53);
        org.jsoup.parser.Token.Comment comment56 = new org.jsoup.parser.Token.Comment();
        java.lang.StringBuilder stringBuilder57 = comment56.data;
        java.lang.String str58 = comment56.getData();
        java.lang.StringBuilder stringBuilder59 = comment56.data;
        xmlTreeBuilder36.insert(comment56);
        xmlTreeBuilder26.insert(comment56);
        org.jsoup.parser.Token.TokenType tokenType62 = comment56.type;
        java.lang.String str63 = comment56.toString();
        xmlTreeBuilder0.insert(comment56);
        java.lang.String str65 = comment56.tokenType();
        java.lang.String str66 = comment56.toString();
        org.junit.Assert.assertNotNull(tag7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(stringBuilder15);
        org.junit.Assert.assertEquals(stringBuilder15.toString(), "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(element25);
        org.junit.Assert.assertNotNull(element35);
        org.junit.Assert.assertNotNull(stringBuilder42);
        org.junit.Assert.assertEquals(stringBuilder42.toString(), "");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertNotNull(tag47);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(element51);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "Doctype" + "'", str54, "Doctype");
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertNotNull(stringBuilder57);
        org.junit.Assert.assertEquals(stringBuilder57.toString(), "");
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "" + "'", str58, "");
        org.junit.Assert.assertNotNull(stringBuilder59);
        org.junit.Assert.assertEquals(stringBuilder59.toString(), "");
        org.junit.Assert.assertTrue("'" + tokenType62 + "' != '" + org.jsoup.parser.Token.TokenType.Comment + "'", tokenType62.equals(org.jsoup.parser.Token.TokenType.Comment));
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "<!---->" + "'", str63, "<!---->");
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "Comment" + "'", str65, "Comment");
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "<!---->" + "'", str66, "<!---->");
    }

    @Test
    public void test4155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4155");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        xmlTreeBuilder0.initialiseParse("</hi!>", "EOF", parseErrorList3);
        org.jsoup.parser.Token.StartTag startTag5 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag7 = startTag5.name("hi!");
        boolean boolean8 = xmlTreeBuilder0.process((org.jsoup.parser.Token) startTag5);
        org.jsoup.parser.Token.StartTag startTag9 = new org.jsoup.parser.Token.StartTag();
        startTag9.appendTagName('4');
        org.jsoup.nodes.Element element12 = xmlTreeBuilder0.insert(startTag9);
        org.jsoup.parser.ParseErrorList parseErrorList15 = null;
        xmlTreeBuilder0.initialiseParse("Character", "Doctype", parseErrorList15);
        org.jsoup.parser.Token.Character character18 = new org.jsoup.parser.Token.Character("EOF");
        java.lang.String str19 = character18.getData();
        boolean boolean20 = character18.isComment();
        org.jsoup.parser.Token.Comment comment21 = new org.jsoup.parser.Token.Comment();
        java.lang.StringBuilder stringBuilder22 = comment21.data;
        org.jsoup.parser.Token.TokenType tokenType23 = org.jsoup.parser.Token.TokenType.Comment;
        comment21.type = tokenType23;
        character18.type = tokenType23;
        java.lang.String str26 = character18.toString();
        java.lang.String str27 = character18.toString();
        xmlTreeBuilder0.insert(character18);
        org.jsoup.parser.Token.Character character30 = new org.jsoup.parser.Token.Character("EOF");
        java.lang.String str31 = character30.getData();
        java.lang.String str32 = character30.toString();
        boolean boolean33 = character30.isStartTag();
        java.lang.String str34 = character30.toString();
        java.lang.String str35 = character30.toString();
        java.lang.String str36 = character30.getData();
        java.lang.String str37 = character30.getData();
        java.lang.String str38 = character30.getData();
        java.lang.String str39 = character30.toString();
        xmlTreeBuilder0.insert(character30);
        java.lang.String str41 = character30.getData();
        boolean boolean42 = character30.isCharacter();
        java.lang.String str43 = character30.toString();
        org.jsoup.parser.Token.TokenType tokenType44 = null;
        character30.type = tokenType44;
        org.junit.Assert.assertNotNull(tag7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "EOF" + "'", str19, "EOF");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(stringBuilder22);
        org.junit.Assert.assertEquals(stringBuilder22.toString(), "");
        org.junit.Assert.assertTrue("'" + tokenType23 + "' != '" + org.jsoup.parser.Token.TokenType.Comment + "'", tokenType23.equals(org.jsoup.parser.Token.TokenType.Comment));
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "EOF" + "'", str26, "EOF");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "EOF" + "'", str27, "EOF");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "EOF" + "'", str31, "EOF");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "EOF" + "'", str32, "EOF");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "EOF" + "'", str34, "EOF");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "EOF" + "'", str35, "EOF");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "EOF" + "'", str36, "EOF");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "EOF" + "'", str37, "EOF");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "EOF" + "'", str38, "EOF");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "EOF" + "'", str39, "EOF");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "EOF" + "'", str41, "EOF");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "EOF" + "'", str43, "EOF");
    }

    @Test
    public void test4156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4156");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("hi!");
        boolean boolean2 = endTag1.selfClosing;
        org.jsoup.parser.Token.Tag tag4 = endTag1.name("");
        tag4.selfClosing = false;
        tag4.selfClosing = true;
        tag4.appendAttributeName('4');
        boolean boolean11 = tag4.isCharacter();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(tag4);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test4157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4157");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        boolean boolean1 = doctype0.forceQuirks;
        java.lang.StringBuilder stringBuilder2 = doctype0.systemIdentifier;
        boolean boolean3 = doctype0.isCharacter();
        doctype0.forceQuirks = false;
        java.lang.StringBuilder stringBuilder6 = doctype0.publicIdentifier;
        boolean boolean7 = doctype0.forceQuirks;
        doctype0.forceQuirks = true;
        java.lang.StringBuilder stringBuilder10 = doctype0.publicIdentifier;
        java.lang.String str11 = doctype0.getName();
        java.lang.String str12 = doctype0.getSystemIdentifier();
        boolean boolean13 = doctype0.isEOF();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(stringBuilder10);
        org.junit.Assert.assertEquals(stringBuilder10.toString(), "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test4158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4158");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        boolean boolean1 = doctype0.forceQuirks;
        java.lang.StringBuilder stringBuilder2 = doctype0.systemIdentifier;
        boolean boolean3 = doctype0.isCharacter();
        doctype0.forceQuirks = false;
        java.lang.String str6 = doctype0.getName();
        boolean boolean7 = doctype0.isForceQuirks();
        boolean boolean8 = doctype0.isComment();
        java.lang.StringBuilder stringBuilder9 = doctype0.systemIdentifier;
        java.lang.String str10 = doctype0.getSystemIdentifier();
        boolean boolean11 = doctype0.isEOF();
        java.lang.String str12 = doctype0.getName();
        boolean boolean13 = doctype0.isForceQuirks();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(stringBuilder9);
        org.junit.Assert.assertEquals(stringBuilder9.toString(), "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test4159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4159");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("hi!");
        boolean boolean2 = endTag1.selfClosing;
        endTag1.finaliseTag();
        endTag1.appendAttributeName(' ');
        boolean boolean6 = endTag1.isSelfClosing();
        org.jsoup.parser.Token.TokenType tokenType7 = null;
        endTag1.type = tokenType7;
        org.jsoup.parser.Token.StartTag startTag9 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag11 = startTag9.name("hi!");
        org.jsoup.parser.Token.TokenType tokenType12 = startTag9.type;
        org.jsoup.parser.Token.TokenType tokenType13 = startTag9.type;
        endTag1.type = tokenType13;
        java.lang.String str15 = endTag1.toString();
        boolean boolean16 = endTag1.isComment();
        java.lang.String str17 = endTag1.name();
        boolean boolean18 = endTag1.isStartTag();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(tag11);
        org.junit.Assert.assertTrue("'" + tokenType12 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType12.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertTrue("'" + tokenType13 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType13.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "</hi!>" + "'", str15, "</hi!>");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test4160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4160");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("hi!");
        java.lang.String str2 = endTag1.toString();
        java.lang.String str3 = endTag1.toString();
        boolean boolean4 = endTag1.isDoctype();
        endTag1.appendAttributeValue('a');
        endTag1.appendAttributeValue("");
        boolean boolean9 = endTag1.isStartTag();
        endTag1.selfClosing = true;
        boolean boolean12 = endTag1.isComment();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "</hi!>" + "'", str2, "</hi!>");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "</hi!>" + "'", str3, "</hi!>");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test4161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4161");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.parser.Token.StartTag startTag3 = new org.jsoup.parser.Token.StartTag("", attributes2);
        org.jsoup.parser.Token.StartTag startTag4 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag6 = startTag4.name("hi!");
        org.jsoup.nodes.Attributes attributes7 = tag6.attributes;
        startTag3.attributes = attributes7;
        org.jsoup.parser.Token.StartTag startTag9 = new org.jsoup.parser.Token.StartTag("Doctype", attributes7);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Comment comment10 = startTag9.asComment();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$Comment (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$Comment are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tag6);
        org.junit.Assert.assertNotNull(attributes7);
    }

    @Test
    public void test4162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4162");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.tokenType();
        java.lang.StringBuilder stringBuilder2 = doctype0.publicIdentifier;
        java.lang.StringBuilder stringBuilder3 = doctype0.name;
        java.lang.StringBuilder stringBuilder4 = doctype0.publicIdentifier;
        boolean boolean5 = doctype0.isComment();
        java.lang.String str6 = doctype0.getSystemIdentifier();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Doctype" + "'", str1, "Doctype");
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test4163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4163");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.tokenType();
        org.jsoup.parser.Token.Doctype doctype2 = doctype0.asDoctype();
        boolean boolean3 = doctype0.isForceQuirks();
        java.lang.StringBuilder stringBuilder4 = doctype0.publicIdentifier;
        boolean boolean5 = doctype0.forceQuirks;
        java.lang.String str6 = doctype0.getPublicIdentifier();
        java.lang.StringBuilder stringBuilder7 = doctype0.systemIdentifier;
        doctype0.forceQuirks = false;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Doctype" + "'", str1, "Doctype");
        org.junit.Assert.assertNotNull(doctype2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(stringBuilder7);
        org.junit.Assert.assertEquals(stringBuilder7.toString(), "");
    }

    @Test
    public void test4164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4164");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.appendAttributeName('a');
        startTag0.appendAttributeName("");
        startTag0.finaliseTag();
        boolean boolean6 = startTag0.isEOF();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test4165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4165");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        java.lang.StringBuilder stringBuilder1 = comment0.data;
        org.jsoup.parser.Token.TokenType tokenType2 = org.jsoup.parser.Token.TokenType.Comment;
        comment0.type = tokenType2;
        java.lang.StringBuilder stringBuilder4 = comment0.data;
        java.lang.StringBuilder stringBuilder5 = comment0.data;
        java.lang.StringBuilder stringBuilder6 = comment0.data;
        java.lang.StringBuilder stringBuilder7 = comment0.data;
        boolean boolean8 = comment0.isEOF();
        org.junit.Assert.assertNotNull(stringBuilder1);
        org.junit.Assert.assertEquals(stringBuilder1.toString(), "");
        org.junit.Assert.assertTrue("'" + tokenType2 + "' != '" + org.jsoup.parser.Token.TokenType.Comment + "'", tokenType2.equals(org.jsoup.parser.Token.TokenType.Comment));
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder7);
        org.junit.Assert.assertEquals(stringBuilder7.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test4166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4166");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        xmlTreeBuilder0.initialiseParse("</hi!>", "EOF", parseErrorList3);
        org.jsoup.parser.Token.StartTag startTag5 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag7 = startTag5.name("hi!");
        boolean boolean8 = xmlTreeBuilder0.process((org.jsoup.parser.Token) startTag5);
        org.jsoup.parser.Token.StartTag startTag9 = new org.jsoup.parser.Token.StartTag();
        startTag9.appendTagName('4');
        org.jsoup.nodes.Element element12 = xmlTreeBuilder0.insert(startTag9);
        java.lang.String str13 = startTag9.toString();
        org.jsoup.parser.Token.Tag tag15 = startTag9.name("<hi!>");
        tag15.appendTagName("StartTag");
        tag15.tagName = "</</hi!<4>>>";
        java.lang.String str20 = tag15.tagName;
        org.junit.Assert.assertNotNull(tag7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "<4>" + "'", str13, "<4>");
        org.junit.Assert.assertNotNull(tag15);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "</</hi!<4>>>" + "'", str20, "</</hi!<4>>>");
    }

    @Test
    public void test4167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4167");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        xmlTreeBuilder0.initialiseParse("Character", "hi!", parseErrorList3);
        org.jsoup.parser.Token.Comment comment5 = new org.jsoup.parser.Token.Comment();
        java.lang.StringBuilder stringBuilder6 = comment5.data;
        java.lang.String str7 = comment5.getData();
        xmlTreeBuilder0.insert(comment5);
        org.jsoup.parser.Token.Character character10 = new org.jsoup.parser.Token.Character("EOF");
        java.lang.String str11 = character10.getData();
        java.lang.String str12 = character10.toString();
        boolean boolean13 = character10.isStartTag();
        java.lang.String str14 = character10.getData();
        java.lang.String str15 = character10.toString();
        org.jsoup.parser.Token.Character character16 = character10.asCharacter();
        xmlTreeBuilder0.insert(character16);
        java.lang.String str18 = character16.getData();
        java.lang.String str19 = character16.getData();
        boolean boolean20 = character16.isCharacter();
        java.lang.String str21 = character16.toString();
        java.lang.String str22 = character16.toString();
        java.lang.String str23 = character16.getData();
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "EOF" + "'", str11, "EOF");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "EOF" + "'", str12, "EOF");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "EOF" + "'", str14, "EOF");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "EOF" + "'", str15, "EOF");
        org.junit.Assert.assertNotNull(character16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "EOF" + "'", str18, "EOF");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "EOF" + "'", str19, "EOF");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "EOF" + "'", str21, "EOF");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "EOF" + "'", str22, "EOF");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "EOF" + "'", str23, "EOF");
    }

    @Test
    public void test4168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4168");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("hi!");
        org.jsoup.nodes.Attributes attributes3 = null;
        org.jsoup.parser.Token.StartTag startTag4 = new org.jsoup.parser.Token.StartTag("", attributes3);
        startTag4.selfClosing = false;
        startTag4.newAttribute();
        org.jsoup.parser.Token.StartTag startTag8 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag10 = startTag8.name("hi!");
        tag10.finaliseTag();
        tag10.newAttribute();
        org.jsoup.nodes.Attributes attributes13 = tag10.attributes;
        startTag4.attributes = attributes13;
        endTag1.attributes = attributes13;
        endTag1.appendAttributeName("<!---->");
        endTag1.appendAttributeValue('4');
        endTag1.appendAttributeValue('#');
        boolean boolean22 = endTag1.isCharacter();
        boolean boolean23 = endTag1.selfClosing;
        org.junit.Assert.assertNotNull(tag10);
        org.junit.Assert.assertNotNull(attributes13);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test4169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4169");
        org.jsoup.parser.Token.StartTag startTag1 = new org.jsoup.parser.Token.StartTag("</Doctype>");
        startTag1.selfClosing = true;
        startTag1.tagName = "</a>";
    }

    @Test
    public void test4170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4170");
        org.jsoup.parser.Token.StartTag startTag3 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag5 = startTag3.name("hi!");
        org.jsoup.nodes.Attributes attributes6 = tag5.attributes;
        org.jsoup.parser.Token.StartTag startTag7 = new org.jsoup.parser.Token.StartTag("</hi!>", attributes6);
        org.jsoup.parser.Token.StartTag startTag8 = new org.jsoup.parser.Token.StartTag("", attributes6);
        org.jsoup.parser.Token.StartTag startTag9 = new org.jsoup.parser.Token.StartTag("hi!", attributes6);
        org.jsoup.parser.Token.EndTag endTag11 = new org.jsoup.parser.Token.EndTag("hi!");
        java.lang.String str12 = endTag11.toString();
        java.lang.String str13 = endTag11.toString();
        boolean boolean14 = endTag11.isDoctype();
        endTag11.appendAttributeName("EOF");
        boolean boolean17 = endTag11.isStartTag();
        boolean boolean18 = endTag11.isCharacter();
        boolean boolean19 = endTag11.isEOF();
        org.jsoup.nodes.Attributes attributes21 = null;
        org.jsoup.parser.Token.StartTag startTag22 = new org.jsoup.parser.Token.StartTag("", attributes21);
        startTag22.selfClosing = false;
        startTag22.appendTagName("</hi!>");
        startTag22.newAttribute();
        org.jsoup.nodes.Attributes attributes28 = startTag22.getAttributes();
        endTag11.attributes = attributes28;
        startTag9.attributes = attributes28;
        java.lang.String str31 = startTag9.toString();
        org.junit.Assert.assertNotNull(tag5);
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "</hi!>" + "'", str12, "</hi!>");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "</hi!>" + "'", str13, "</hi!>");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(attributes28);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "<hi!>" + "'", str31, "<hi!>");
    }

    @Test
    public void test4171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4171");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        boolean boolean1 = endTag0.isDoctype();
        endTag0.finaliseTag();
        boolean boolean3 = endTag0.isStartTag();
        endTag0.appendAttributeName('a');
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test4172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4172");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("hi!");
        java.lang.String str2 = endTag1.toString();
        java.lang.String str3 = endTag1.toString();
        boolean boolean4 = endTag1.isDoctype();
        endTag1.appendAttributeValue('a');
        endTag1.selfClosing = true;
        endTag1.appendAttributeName('4');
        org.jsoup.parser.Token.Tag tag12 = endTag1.name("hi!a");
        java.lang.String str13 = endTag1.tagName;
        java.lang.String str14 = endTag1.toString();
        endTag1.appendAttributeName("<4> ");
        org.jsoup.parser.Token.Tag tag18 = endTag1.name("</Doctype>");
        tag18.appendAttributeValue("</<4>>");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "</hi!>" + "'", str2, "</hi!>");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "</hi!>" + "'", str3, "</hi!>");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(tag12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!a" + "'", str13, "hi!a");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "</hi!a>" + "'", str14, "</hi!a>");
        org.junit.Assert.assertNotNull(tag18);
    }

    @Test
    public void test4173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4173");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        xmlTreeBuilder0.initialiseParse("</hi!>", "EOF", parseErrorList3);
        org.jsoup.parser.Token.StartTag startTag5 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag7 = startTag5.name("hi!");
        boolean boolean8 = xmlTreeBuilder0.process((org.jsoup.parser.Token) startTag5);
        org.jsoup.parser.Token.Comment comment9 = new org.jsoup.parser.Token.Comment();
        java.lang.StringBuilder stringBuilder10 = comment9.data;
        java.lang.String str11 = comment9.toString();
        xmlTreeBuilder0.insert(comment9);
        boolean boolean13 = comment9.isEndTag();
        boolean boolean14 = comment9.isStartTag();
        java.lang.StringBuilder stringBuilder15 = comment9.data;
        java.lang.String str16 = comment9.toString();
        java.lang.StringBuilder stringBuilder17 = comment9.data;
        org.junit.Assert.assertNotNull(tag7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(stringBuilder10);
        org.junit.Assert.assertEquals(stringBuilder10.toString(), "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "<!---->" + "'", str11, "<!---->");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(stringBuilder15);
        org.junit.Assert.assertEquals(stringBuilder15.toString(), "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "<!---->" + "'", str16, "<!---->");
        org.junit.Assert.assertNotNull(stringBuilder17);
        org.junit.Assert.assertEquals(stringBuilder17.toString(), "");
    }

    @Test
    public void test4174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4174");
        org.jsoup.nodes.Attributes attributes3 = null;
        org.jsoup.parser.Token.StartTag startTag4 = new org.jsoup.parser.Token.StartTag("", attributes3);
        startTag4.selfClosing = false;
        startTag4.appendTagName("</hi!>");
        startTag4.newAttribute();
        org.jsoup.nodes.Attributes attributes10 = startTag4.getAttributes();
        org.jsoup.parser.Token.StartTag startTag11 = new org.jsoup.parser.Token.StartTag("Doctype", attributes10);
        startTag11.selfClosing = true;
        startTag11.appendAttributeName('4');
        org.jsoup.parser.Token.Tag tag17 = startTag11.name("StartTag");
        boolean boolean18 = startTag11.selfClosing;
        startTag11.appendAttributeName("< >");
        org.jsoup.nodes.Attributes attributes21 = startTag11.getAttributes();
        org.jsoup.parser.Token.StartTag startTag22 = new org.jsoup.parser.Token.StartTag("hi!<4>", attributes21);
        startTag22.appendAttributeValue("Doctype");
        boolean boolean25 = startTag22.isSelfClosing();
        org.junit.Assert.assertNotNull(attributes10);
        org.junit.Assert.assertNotNull(tag17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(attributes21);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test4175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4175");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("4");
        org.jsoup.parser.Token.Tag tag3 = endTag1.name("4");
        endTag1.newAttribute();
        org.jsoup.nodes.Attributes attributes5 = endTag1.attributes;
        org.junit.Assert.assertNotNull(tag3);
        org.junit.Assert.assertNotNull(attributes5);
    }

    @Test
    public void test4176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4176");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        xmlTreeBuilder0.initialiseParse("Character", "hi!", parseErrorList3);
        org.jsoup.parser.Token.Comment comment5 = new org.jsoup.parser.Token.Comment();
        java.lang.StringBuilder stringBuilder6 = comment5.data;
        java.lang.String str7 = comment5.getData();
        xmlTreeBuilder0.insert(comment5);
        org.jsoup.parser.Token.Character character10 = new org.jsoup.parser.Token.Character("EOF");
        java.lang.String str11 = character10.getData();
        java.lang.String str12 = character10.toString();
        boolean boolean13 = character10.isStartTag();
        java.lang.String str14 = character10.getData();
        java.lang.String str15 = character10.toString();
        org.jsoup.parser.Token.Character character16 = character10.asCharacter();
        xmlTreeBuilder0.insert(character16);
        org.jsoup.parser.Token.StartTag startTag18 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag20 = startTag18.name("hi!");
        startTag18.finaliseTag();
        startTag18.finaliseTag();
        startTag18.appendTagName(' ');
        org.jsoup.nodes.Element element25 = xmlTreeBuilder0.insert(startTag18);
        org.jsoup.parser.Token.Character character27 = new org.jsoup.parser.Token.Character("EOF");
        java.lang.String str28 = character27.getData();
        java.lang.String str29 = character27.toString();
        boolean boolean30 = character27.isStartTag();
        java.lang.String str31 = character27.getData();
        java.lang.String str32 = character27.toString();
        xmlTreeBuilder0.insert(character27);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder34 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList37 = null;
        xmlTreeBuilder34.initialiseParse("</hi!>", "EOF", parseErrorList37);
        org.jsoup.parser.Token.StartTag startTag39 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag41 = startTag39.name("hi!");
        boolean boolean42 = xmlTreeBuilder34.process((org.jsoup.parser.Token) startTag39);
        org.jsoup.parser.Token.StartTag startTag43 = new org.jsoup.parser.Token.StartTag();
        startTag43.appendTagName('4');
        org.jsoup.nodes.Element element46 = xmlTreeBuilder34.insert(startTag43);
        org.jsoup.parser.Token.Character character48 = new org.jsoup.parser.Token.Character("EOF");
        java.lang.String str49 = character48.getData();
        java.lang.String str50 = character48.toString();
        boolean boolean51 = character48.isStartTag();
        java.lang.String str52 = character48.getData();
        java.lang.String str53 = character48.toString();
        org.jsoup.parser.Token.Character character54 = character48.asCharacter();
        java.lang.String str55 = character48.toString();
        java.lang.String str56 = character48.toString();
        xmlTreeBuilder34.insert(character48);
        org.jsoup.parser.Token.Character character59 = new org.jsoup.parser.Token.Character("EOF");
        java.lang.String str60 = character59.getData();
        java.lang.String str61 = character59.toString();
        boolean boolean62 = character59.isStartTag();
        java.lang.String str63 = character59.getData();
        java.lang.String str64 = character59.toString();
        xmlTreeBuilder34.insert(character59);
        org.jsoup.parser.Token.Comment comment66 = new org.jsoup.parser.Token.Comment();
        xmlTreeBuilder34.insert(comment66);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder68 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList71 = null;
        xmlTreeBuilder68.initialiseParse("</hi!>", "EOF", parseErrorList71);
        org.jsoup.parser.Token.StartTag startTag73 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag75 = startTag73.name("hi!");
        boolean boolean76 = xmlTreeBuilder68.process((org.jsoup.parser.Token) startTag73);
        org.jsoup.parser.Token.StartTag startTag77 = new org.jsoup.parser.Token.StartTag();
        startTag77.appendTagName('4');
        org.jsoup.nodes.Element element80 = xmlTreeBuilder68.insert(startTag77);
        org.jsoup.parser.ParseErrorList parseErrorList83 = null;
        xmlTreeBuilder68.initialiseParse("Character", "Doctype", parseErrorList83);
        org.jsoup.parser.Token.Comment comment85 = new org.jsoup.parser.Token.Comment();
        java.lang.StringBuilder stringBuilder86 = comment85.data;
        xmlTreeBuilder68.insert(comment85);
        org.jsoup.parser.Token.Comment comment88 = new org.jsoup.parser.Token.Comment();
        java.lang.StringBuilder stringBuilder89 = comment88.data;
        org.jsoup.parser.Token.TokenType tokenType90 = org.jsoup.parser.Token.TokenType.Comment;
        comment88.type = tokenType90;
        xmlTreeBuilder68.insert(comment88);
        java.lang.String str93 = comment88.getData();
        java.lang.String str94 = comment88.toString();
        xmlTreeBuilder34.insert(comment88);
        xmlTreeBuilder0.insert(comment88);
        java.lang.String str97 = comment88.getData();
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "EOF" + "'", str11, "EOF");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "EOF" + "'", str12, "EOF");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "EOF" + "'", str14, "EOF");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "EOF" + "'", str15, "EOF");
        org.junit.Assert.assertNotNull(character16);
        org.junit.Assert.assertNotNull(tag20);
        org.junit.Assert.assertNotNull(element25);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "EOF" + "'", str28, "EOF");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "EOF" + "'", str29, "EOF");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "EOF" + "'", str31, "EOF");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "EOF" + "'", str32, "EOF");
        org.junit.Assert.assertNotNull(tag41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(element46);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "EOF" + "'", str49, "EOF");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "EOF" + "'", str50, "EOF");
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "EOF" + "'", str52, "EOF");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "EOF" + "'", str53, "EOF");
        org.junit.Assert.assertNotNull(character54);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "EOF" + "'", str55, "EOF");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "EOF" + "'", str56, "EOF");
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "EOF" + "'", str60, "EOF");
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "EOF" + "'", str61, "EOF");
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "EOF" + "'", str63, "EOF");
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "EOF" + "'", str64, "EOF");
        org.junit.Assert.assertNotNull(tag75);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
        org.junit.Assert.assertNotNull(element80);
        org.junit.Assert.assertNotNull(stringBuilder86);
        org.junit.Assert.assertEquals(stringBuilder86.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder89);
        org.junit.Assert.assertEquals(stringBuilder89.toString(), "");
        org.junit.Assert.assertTrue("'" + tokenType90 + "' != '" + org.jsoup.parser.Token.TokenType.Comment + "'", tokenType90.equals(org.jsoup.parser.Token.TokenType.Comment));
        org.junit.Assert.assertEquals("'" + str93 + "' != '" + "" + "'", str93, "");
        org.junit.Assert.assertEquals("'" + str94 + "' != '" + "<!---->" + "'", str94, "<!---->");
        org.junit.Assert.assertEquals("'" + str97 + "' != '" + "" + "'", str97, "");
    }

    @Test
    public void test4177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4177");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        xmlTreeBuilder0.initialiseParse("</hi!>", "EOF", parseErrorList3);
        org.jsoup.parser.Token.StartTag startTag5 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag7 = startTag5.name("hi!");
        boolean boolean8 = xmlTreeBuilder0.process((org.jsoup.parser.Token) startTag5);
        org.jsoup.parser.Token.StartTag startTag9 = new org.jsoup.parser.Token.StartTag();
        startTag9.appendTagName('4');
        org.jsoup.nodes.Element element12 = xmlTreeBuilder0.insert(startTag9);
        startTag9.newAttribute();
        boolean boolean14 = startTag9.isSelfClosing();
        boolean boolean15 = startTag9.isSelfClosing();
        org.junit.Assert.assertNotNull(tag7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test4178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4178");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("hi!");
        boolean boolean2 = endTag1.selfClosing;
        org.jsoup.parser.Token.Tag tag4 = endTag1.name("");
        boolean boolean5 = endTag1.isEndTag();
        org.jsoup.parser.Token.Tag tag7 = endTag1.name("<4>");
        org.jsoup.nodes.Attributes attributes8 = endTag1.getAttributes();
        java.lang.String str9 = endTag1.tagName;
        endTag1.appendAttributeName("<hi!>");
        boolean boolean12 = endTag1.selfClosing;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(tag4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(tag7);
        org.junit.Assert.assertNull(attributes8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<4>" + "'", str9, "<4>");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test4179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4179");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        xmlTreeBuilder0.initialiseParse("</hi!>", "EOF", parseErrorList3);
        org.jsoup.parser.Token.StartTag startTag5 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag7 = startTag5.name("hi!");
        boolean boolean8 = xmlTreeBuilder0.process((org.jsoup.parser.Token) startTag5);
        org.jsoup.parser.Token.StartTag startTag9 = new org.jsoup.parser.Token.StartTag();
        startTag9.appendTagName('4');
        org.jsoup.nodes.Element element12 = xmlTreeBuilder0.insert(startTag9);
        org.jsoup.parser.Token.Character character14 = new org.jsoup.parser.Token.Character("EOF");
        java.lang.String str15 = character14.getData();
        java.lang.String str16 = character14.toString();
        boolean boolean17 = character14.isStartTag();
        java.lang.String str18 = character14.getData();
        java.lang.String str19 = character14.toString();
        org.jsoup.parser.Token.Character character20 = character14.asCharacter();
        java.lang.String str21 = character14.toString();
        java.lang.String str22 = character14.toString();
        xmlTreeBuilder0.insert(character14);
        org.jsoup.parser.Token.Character character25 = new org.jsoup.parser.Token.Character("EOF");
        java.lang.String str26 = character25.getData();
        java.lang.String str27 = character25.toString();
        boolean boolean28 = character25.isStartTag();
        java.lang.String str29 = character25.getData();
        java.lang.String str30 = character25.toString();
        xmlTreeBuilder0.insert(character25);
        org.jsoup.parser.Token.StartTag startTag33 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag35 = startTag33.name("hi!");
        org.jsoup.nodes.Attributes attributes36 = tag35.attributes;
        boolean boolean37 = tag35.isEndTag();
        org.jsoup.nodes.Attributes attributes38 = tag35.getAttributes();
        org.jsoup.parser.Token.StartTag startTag39 = new org.jsoup.parser.Token.StartTag("</hi! >", attributes38);
        boolean boolean40 = startTag39.isSelfClosing();
        startTag39.appendAttributeName("EOF");
        boolean boolean43 = xmlTreeBuilder0.process((org.jsoup.parser.Token) startTag39);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder44 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList47 = null;
        xmlTreeBuilder44.initialiseParse("Character", "hi!", parseErrorList47);
        org.jsoup.parser.Token.Comment comment49 = new org.jsoup.parser.Token.Comment();
        java.lang.StringBuilder stringBuilder50 = comment49.data;
        java.lang.String str51 = comment49.getData();
        xmlTreeBuilder44.insert(comment49);
        org.jsoup.parser.Token.StartTag startTag53 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag55 = startTag53.name("hi!");
        startTag53.appendAttributeName(' ');
        boolean boolean58 = startTag53.isComment();
        org.jsoup.nodes.Element element59 = xmlTreeBuilder44.insert(startTag53);
        org.jsoup.parser.Token.StartTag startTag61 = new org.jsoup.parser.Token.StartTag("Doctype");
        java.lang.String str62 = startTag61.name();
        boolean boolean63 = xmlTreeBuilder44.process((org.jsoup.parser.Token) startTag61);
        org.jsoup.parser.Token.Comment comment64 = new org.jsoup.parser.Token.Comment();
        java.lang.StringBuilder stringBuilder65 = comment64.data;
        java.lang.String str66 = comment64.getData();
        java.lang.StringBuilder stringBuilder67 = comment64.data;
        xmlTreeBuilder44.insert(comment64);
        java.lang.StringBuilder stringBuilder69 = comment64.data;
        java.lang.String str70 = comment64.getData();
        java.lang.String str71 = comment64.getData();
        java.lang.StringBuilder stringBuilder72 = comment64.data;
        java.lang.String str73 = comment64.toString();
        xmlTreeBuilder0.insert(comment64);
        org.jsoup.parser.Token.Character character75 = null;
        // The following exception was thrown during execution in test generation
        try {
            xmlTreeBuilder0.insert(character75);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tag7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "EOF" + "'", str15, "EOF");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "EOF" + "'", str16, "EOF");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "EOF" + "'", str18, "EOF");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "EOF" + "'", str19, "EOF");
        org.junit.Assert.assertNotNull(character20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "EOF" + "'", str21, "EOF");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "EOF" + "'", str22, "EOF");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "EOF" + "'", str26, "EOF");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "EOF" + "'", str27, "EOF");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "EOF" + "'", str29, "EOF");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "EOF" + "'", str30, "EOF");
        org.junit.Assert.assertNotNull(tag35);
        org.junit.Assert.assertNotNull(attributes36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(attributes38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(stringBuilder50);
        org.junit.Assert.assertEquals(stringBuilder50.toString(), "");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
        org.junit.Assert.assertNotNull(tag55);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(element59);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "Doctype" + "'", str62, "Doctype");
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertNotNull(stringBuilder65);
        org.junit.Assert.assertEquals(stringBuilder65.toString(), "");
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "" + "'", str66, "");
        org.junit.Assert.assertNotNull(stringBuilder67);
        org.junit.Assert.assertEquals(stringBuilder67.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder69);
        org.junit.Assert.assertEquals(stringBuilder69.toString(), "");
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "" + "'", str70, "");
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "" + "'", str71, "");
        org.junit.Assert.assertNotNull(stringBuilder72);
        org.junit.Assert.assertEquals(stringBuilder72.toString(), "");
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "<!---->" + "'", str73, "<!---->");
    }

    @Test
    public void test4180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4180");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        xmlTreeBuilder0.initialiseParse("Character", "hi!", parseErrorList3);
        org.jsoup.parser.ParseErrorList parseErrorList7 = null;
        xmlTreeBuilder0.initialiseParse("</hi!>", "Doctype", parseErrorList7);
        org.jsoup.parser.Token.EndTag endTag10 = new org.jsoup.parser.Token.EndTag("hi!");
        java.lang.String str11 = endTag10.toString();
        java.lang.String str12 = endTag10.toString();
        boolean boolean13 = endTag10.isDoctype();
        java.lang.String str14 = endTag10.tagName;
        java.lang.String str15 = endTag10.name();
        boolean boolean16 = xmlTreeBuilder0.process((org.jsoup.parser.Token) endTag10);
        org.jsoup.parser.Token.Character character18 = new org.jsoup.parser.Token.Character("EOF");
        java.lang.String str19 = character18.getData();
        java.lang.String str20 = character18.toString();
        java.lang.String str21 = character18.getData();
        java.lang.String str22 = character18.getData();
        xmlTreeBuilder0.insert(character18);
        org.jsoup.nodes.Attributes attributes26 = null;
        org.jsoup.parser.Token.StartTag startTag27 = new org.jsoup.parser.Token.StartTag("", attributes26);
        startTag27.selfClosing = false;
        startTag27.newAttribute();
        org.jsoup.parser.Token.StartTag startTag32 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag34 = startTag32.name("hi!");
        org.jsoup.nodes.Attributes attributes35 = tag34.attributes;
        org.jsoup.parser.Token.StartTag startTag36 = new org.jsoup.parser.Token.StartTag("", attributes35);
        startTag27.attributes = attributes35;
        org.jsoup.parser.Token.StartTag startTag38 = new org.jsoup.parser.Token.StartTag("EndTag", attributes35);
        java.lang.String str39 = startTag38.tagName;
        org.jsoup.nodes.Element element40 = xmlTreeBuilder0.insert(startTag38);
        boolean boolean41 = startTag38.isCharacter();
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "</hi!>" + "'", str11, "</hi!>");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "</hi!>" + "'", str12, "</hi!>");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "EOF" + "'", str19, "EOF");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "EOF" + "'", str20, "EOF");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "EOF" + "'", str21, "EOF");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "EOF" + "'", str22, "EOF");
        org.junit.Assert.assertNotNull(tag34);
        org.junit.Assert.assertNotNull(attributes35);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "EndTag" + "'", str39, "EndTag");
        org.junit.Assert.assertNotNull(element40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
    }

    @Test
    public void test4181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4181");
        org.jsoup.nodes.Attributes attributes6 = null;
        org.jsoup.parser.Token.StartTag startTag7 = new org.jsoup.parser.Token.StartTag("", attributes6);
        org.jsoup.parser.Token.StartTag startTag8 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag10 = startTag8.name("hi!");
        org.jsoup.nodes.Attributes attributes11 = tag10.attributes;
        startTag7.attributes = attributes11;
        org.jsoup.parser.Token.StartTag startTag13 = new org.jsoup.parser.Token.StartTag("Doctype", attributes11);
        org.jsoup.parser.Token.StartTag startTag14 = new org.jsoup.parser.Token.StartTag("", attributes11);
        org.jsoup.parser.Token.StartTag startTag15 = new org.jsoup.parser.Token.StartTag("EOF", attributes11);
        org.jsoup.parser.Token.StartTag startTag16 = new org.jsoup.parser.Token.StartTag("</Doctype>", attributes11);
        org.jsoup.parser.Token.StartTag startTag17 = new org.jsoup.parser.Token.StartTag("</<!---->>", attributes11);
        boolean boolean18 = startTag17.isSelfClosing();
        org.junit.Assert.assertNotNull(tag10);
        org.junit.Assert.assertNotNull(attributes11);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test4182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4182");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        xmlTreeBuilder0.initialiseParse("</hi!>", "EOF", parseErrorList3);
        org.jsoup.parser.Token.StartTag startTag5 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag7 = startTag5.name("hi!");
        boolean boolean8 = xmlTreeBuilder0.process((org.jsoup.parser.Token) startTag5);
        org.jsoup.parser.Token.StartTag startTag9 = new org.jsoup.parser.Token.StartTag();
        startTag9.appendTagName('4');
        org.jsoup.nodes.Element element12 = xmlTreeBuilder0.insert(startTag9);
        org.jsoup.parser.Token.Character character14 = new org.jsoup.parser.Token.Character("EOF");
        java.lang.String str15 = character14.getData();
        java.lang.String str16 = character14.toString();
        boolean boolean17 = character14.isStartTag();
        java.lang.String str18 = character14.getData();
        java.lang.String str19 = character14.toString();
        org.jsoup.parser.Token.Character character20 = character14.asCharacter();
        java.lang.String str21 = character14.toString();
        java.lang.String str22 = character14.toString();
        xmlTreeBuilder0.insert(character14);
        org.jsoup.parser.Token.Character character25 = new org.jsoup.parser.Token.Character("EOF");
        java.lang.String str26 = character25.getData();
        java.lang.String str27 = character25.toString();
        boolean boolean28 = character25.isStartTag();
        java.lang.String str29 = character25.getData();
        java.lang.String str30 = character25.toString();
        xmlTreeBuilder0.insert(character25);
        java.lang.String str32 = character25.getData();
        org.junit.Assert.assertNotNull(tag7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "EOF" + "'", str15, "EOF");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "EOF" + "'", str16, "EOF");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "EOF" + "'", str18, "EOF");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "EOF" + "'", str19, "EOF");
        org.junit.Assert.assertNotNull(character20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "EOF" + "'", str21, "EOF");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "EOF" + "'", str22, "EOF");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "EOF" + "'", str26, "EOF");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "EOF" + "'", str27, "EOF");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "EOF" + "'", str29, "EOF");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "EOF" + "'", str30, "EOF");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "EOF" + "'", str32, "EOF");
    }

    @Test
    public void test4183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4183");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("hi!");
        org.jsoup.nodes.Attributes attributes3 = null;
        org.jsoup.parser.Token.StartTag startTag4 = new org.jsoup.parser.Token.StartTag("", attributes3);
        startTag4.selfClosing = false;
        startTag4.newAttribute();
        org.jsoup.parser.Token.StartTag startTag8 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag10 = startTag8.name("hi!");
        tag10.finaliseTag();
        tag10.newAttribute();
        org.jsoup.nodes.Attributes attributes13 = tag10.attributes;
        startTag4.attributes = attributes13;
        endTag1.attributes = attributes13;
        endTag1.appendAttributeName("<!---->");
        endTag1.appendAttributeValue('4');
        boolean boolean20 = endTag1.isSelfClosing();
        java.lang.String str21 = endTag1.toString();
        boolean boolean22 = endTag1.isCharacter();
        org.jsoup.parser.Token.EndTag endTag23 = endTag1.asEndTag();
        endTag23.finaliseTag();
        org.junit.Assert.assertNotNull(tag10);
        org.junit.Assert.assertNotNull(attributes13);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "</hi!>" + "'", str21, "</hi!>");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(endTag23);
    }

    @Test
    public void test4184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4184");
        org.jsoup.nodes.Attributes attributes3 = null;
        org.jsoup.parser.Token.StartTag startTag4 = new org.jsoup.parser.Token.StartTag("", attributes3);
        org.jsoup.parser.Token.StartTag startTag5 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag7 = startTag5.name("hi!");
        org.jsoup.nodes.Attributes attributes8 = tag7.attributes;
        startTag4.attributes = attributes8;
        org.jsoup.parser.Token.StartTag startTag10 = new org.jsoup.parser.Token.StartTag("Doctype", attributes8);
        org.jsoup.parser.Token.StartTag startTag11 = new org.jsoup.parser.Token.StartTag("", attributes8);
        startTag11.appendAttributeValue("</hi!>");
        java.lang.String str14 = startTag11.tagName;
        startTag11.tagName = "</<4>Doctype>";
        java.lang.String str17 = startTag11.name();
        boolean boolean18 = startTag11.isEndTag();
        startTag11.appendAttributeName('#');
        org.junit.Assert.assertNotNull(tag7);
        org.junit.Assert.assertNotNull(attributes8);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "</<4>Doctype>" + "'", str17, "</<4>Doctype>");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test4185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4185");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("<4>");
        org.jsoup.nodes.Attributes attributes3 = null;
        org.jsoup.parser.Token.StartTag startTag4 = new org.jsoup.parser.Token.StartTag("", attributes3);
        boolean boolean5 = startTag4.isDoctype();
        java.lang.String str6 = startTag4.tagName;
        org.jsoup.parser.Token.TokenType tokenType7 = startTag4.type;
        startTag4.appendTagName(' ');
        boolean boolean10 = startTag4.isDoctype();
        org.jsoup.parser.Token.StartTag startTag12 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag14 = startTag12.name("hi!");
        org.jsoup.nodes.Attributes attributes15 = tag14.attributes;
        org.jsoup.parser.Token.StartTag startTag16 = new org.jsoup.parser.Token.StartTag("", attributes15);
        startTag4.attributes = attributes15;
        endTag1.attributes = attributes15;
        boolean boolean19 = endTag1.isEndTag();
        boolean boolean20 = endTag1.isDoctype();
        endTag1.appendAttributeName('a');
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + tokenType7 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType7.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(tag14);
        org.junit.Assert.assertNotNull(attributes15);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test4186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4186");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.tokenType();
        boolean boolean2 = doctype0.isForceQuirks();
        java.lang.String str3 = doctype0.getPublicIdentifier();
        boolean boolean4 = doctype0.isForceQuirks();
        boolean boolean5 = doctype0.isForceQuirks();
        boolean boolean6 = doctype0.isComment();
        doctype0.forceQuirks = false;
        doctype0.forceQuirks = true;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Doctype" + "'", str1, "Doctype");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test4187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4187");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        boolean boolean1 = doctype0.forceQuirks;
        java.lang.StringBuilder stringBuilder2 = doctype0.systemIdentifier;
        boolean boolean3 = doctype0.isCharacter();
        doctype0.forceQuirks = false;
        java.lang.StringBuilder stringBuilder6 = doctype0.publicIdentifier;
        boolean boolean7 = doctype0.forceQuirks;
        java.lang.StringBuilder stringBuilder8 = doctype0.publicIdentifier;
        org.jsoup.parser.Token.Doctype doctype9 = doctype0.asDoctype();
        java.lang.StringBuilder stringBuilder10 = doctype9.name;
        org.jsoup.parser.Token.Doctype doctype11 = doctype9.asDoctype();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(stringBuilder8);
        org.junit.Assert.assertEquals(stringBuilder8.toString(), "");
        org.junit.Assert.assertNotNull(doctype9);
        org.junit.Assert.assertNotNull(stringBuilder10);
        org.junit.Assert.assertEquals(stringBuilder10.toString(), "");
        org.junit.Assert.assertNotNull(doctype11);
    }

    @Test
    public void test4188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4188");
        org.jsoup.parser.Token.Character character1 = new org.jsoup.parser.Token.Character("<hi!  =\"#\">");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.StartTag startTag2 = character1.asStartTag();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$Character cannot be cast to class org.jsoup.parser.Token$StartTag (org.jsoup.parser.Token$Character and org.jsoup.parser.Token$StartTag are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4189");
        org.jsoup.parser.Token.StartTag startTag2 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag4 = startTag2.name("hi!");
        tag4.finaliseTag();
        tag4.newAttribute();
        org.jsoup.nodes.Attributes attributes7 = tag4.attributes;
        org.jsoup.parser.Token.StartTag startTag8 = new org.jsoup.parser.Token.StartTag("</Character>", attributes7);
        org.jsoup.parser.Token.StartTag startTag9 = new org.jsoup.parser.Token.StartTag("<<hi!>>", attributes7);
        org.junit.Assert.assertNotNull(tag4);
        org.junit.Assert.assertNotNull(attributes7);
    }

    @Test
    public void test4190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4190");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag2 = startTag0.name("hi!");
        startTag0.appendAttributeName(' ');
        startTag0.appendAttributeValue('#');
        boolean boolean7 = startTag0.isDoctype();
        org.jsoup.parser.Token.Tag tag9 = startTag0.name("<</hi! >>");
        boolean boolean10 = startTag0.isEndTag();
        org.junit.Assert.assertNotNull(tag2);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(tag9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test4191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4191");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("hi!");
        java.lang.String str2 = endTag1.toString();
        endTag1.appendTagName(' ');
        java.lang.String str5 = endTag1.toString();
        org.jsoup.nodes.Attributes attributes7 = null;
        org.jsoup.parser.Token.StartTag startTag8 = new org.jsoup.parser.Token.StartTag("", attributes7);
        startTag8.selfClosing = false;
        startTag8.newAttribute();
        org.jsoup.parser.Token.StartTag startTag12 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag14 = startTag12.name("hi!");
        tag14.finaliseTag();
        tag14.newAttribute();
        org.jsoup.nodes.Attributes attributes17 = tag14.attributes;
        startTag8.attributes = attributes17;
        endTag1.attributes = attributes17;
        java.lang.String str20 = endTag1.tagName;
        endTag1.appendTagName("<<hi!>>");
        boolean boolean23 = endTag1.isStartTag();
        org.jsoup.parser.Token.Tag tag25 = endTag1.name("<4>");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "</hi!>" + "'", str2, "</hi!>");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "</hi! >" + "'", str5, "</hi! >");
        org.junit.Assert.assertNotNull(tag14);
        org.junit.Assert.assertNotNull(attributes17);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi! " + "'", str20, "hi! ");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(tag25);
    }

    @Test
    public void test4192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4192");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        xmlTreeBuilder0.initialiseParse("Character", "hi!", parseErrorList3);
        org.jsoup.parser.Token.Comment comment5 = new org.jsoup.parser.Token.Comment();
        java.lang.StringBuilder stringBuilder6 = comment5.data;
        java.lang.String str7 = comment5.getData();
        xmlTreeBuilder0.insert(comment5);
        org.jsoup.parser.Token.StartTag startTag9 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag11 = startTag9.name("hi!");
        startTag9.appendAttributeName(' ');
        boolean boolean14 = startTag9.isComment();
        org.jsoup.nodes.Element element15 = xmlTreeBuilder0.insert(startTag9);
        org.jsoup.parser.Token.StartTag startTag17 = new org.jsoup.parser.Token.StartTag("Doctype");
        java.lang.String str18 = startTag17.name();
        boolean boolean19 = xmlTreeBuilder0.process((org.jsoup.parser.Token) startTag17);
        org.jsoup.parser.Token.Comment comment20 = new org.jsoup.parser.Token.Comment();
        java.lang.StringBuilder stringBuilder21 = comment20.data;
        java.lang.String str22 = comment20.getData();
        java.lang.StringBuilder stringBuilder23 = comment20.data;
        xmlTreeBuilder0.insert(comment20);
        org.jsoup.parser.Token.Comment comment25 = new org.jsoup.parser.Token.Comment();
        java.lang.StringBuilder stringBuilder26 = comment25.data;
        java.lang.String str27 = comment25.toString();
        xmlTreeBuilder0.insert(comment25);
        org.jsoup.nodes.Attributes attributes31 = null;
        org.jsoup.parser.Token.StartTag startTag32 = new org.jsoup.parser.Token.StartTag("", attributes31);
        startTag32.selfClosing = false;
        startTag32.newAttribute();
        org.jsoup.parser.Token.StartTag startTag37 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag39 = startTag37.name("hi!");
        org.jsoup.nodes.Attributes attributes40 = tag39.attributes;
        org.jsoup.parser.Token.StartTag startTag41 = new org.jsoup.parser.Token.StartTag("", attributes40);
        startTag32.attributes = attributes40;
        org.jsoup.parser.Token.StartTag startTag43 = new org.jsoup.parser.Token.StartTag("EndTag", attributes40);
        boolean boolean44 = startTag43.isCharacter();
        boolean boolean45 = startTag43.isDoctype();
        org.jsoup.nodes.Element element46 = xmlTreeBuilder0.insert(startTag43);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder47 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList50 = null;
        xmlTreeBuilder47.initialiseParse("</hi!>", "EOF", parseErrorList50);
        org.jsoup.parser.Token.StartTag startTag52 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag54 = startTag52.name("hi!");
        boolean boolean55 = xmlTreeBuilder47.process((org.jsoup.parser.Token) startTag52);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder56 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList59 = null;
        xmlTreeBuilder56.initialiseParse("Character", "hi!", parseErrorList59);
        org.jsoup.parser.Token.Comment comment61 = new org.jsoup.parser.Token.Comment();
        java.lang.StringBuilder stringBuilder62 = comment61.data;
        java.lang.String str63 = comment61.getData();
        xmlTreeBuilder56.insert(comment61);
        xmlTreeBuilder47.insert(comment61);
        xmlTreeBuilder0.insert(comment61);
        java.lang.String str67 = comment61.getData();
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(tag11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Doctype" + "'", str18, "Doctype");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(stringBuilder21);
        org.junit.Assert.assertEquals(stringBuilder21.toString(), "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(stringBuilder23);
        org.junit.Assert.assertEquals(stringBuilder23.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder26);
        org.junit.Assert.assertEquals(stringBuilder26.toString(), "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "<!---->" + "'", str27, "<!---->");
        org.junit.Assert.assertNotNull(tag39);
        org.junit.Assert.assertNotNull(attributes40);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(element46);
        org.junit.Assert.assertNotNull(tag54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertNotNull(stringBuilder62);
        org.junit.Assert.assertEquals(stringBuilder62.toString(), "");
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "" + "'", str63, "");
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "" + "'", str67, "");
    }

    @Test
    public void test4193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4193");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("hi!");
        boolean boolean2 = endTag1.selfClosing;
        endTag1.finaliseTag();
        java.lang.String str4 = endTag1.toString();
        java.lang.String str5 = endTag1.tokenType();
        endTag1.appendTagName('4');
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.StartTag startTag8 = endTag1.asStartTag();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$EndTag cannot be cast to class org.jsoup.parser.Token$StartTag (org.jsoup.parser.Token$EndTag and org.jsoup.parser.Token$StartTag are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "</hi!>" + "'", str4, "</hi!>");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "EndTag" + "'", str5, "EndTag");
    }

    @Test
    public void test4194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4194");
        org.jsoup.parser.Token.Character character1 = new org.jsoup.parser.Token.Character("<EndTag>");
    }

    @Test
    public void test4195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4195");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        boolean boolean1 = doctype0.forceQuirks;
        java.lang.StringBuilder stringBuilder2 = doctype0.systemIdentifier;
        boolean boolean3 = doctype0.isCharacter();
        doctype0.forceQuirks = false;
        java.lang.StringBuilder stringBuilder6 = doctype0.publicIdentifier;
        boolean boolean7 = doctype0.forceQuirks;
        doctype0.forceQuirks = true;
        java.lang.StringBuilder stringBuilder10 = doctype0.publicIdentifier;
        org.jsoup.parser.Token.TokenType tokenType11 = doctype0.type;
        java.lang.String str12 = doctype0.getPublicIdentifier();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(stringBuilder10);
        org.junit.Assert.assertEquals(stringBuilder10.toString(), "");
        org.junit.Assert.assertTrue("'" + tokenType11 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType11.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test4196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4196");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("hi!");
        java.lang.String str2 = endTag1.toString();
        java.lang.String str3 = endTag1.toString();
        boolean boolean4 = endTag1.isDoctype();
        endTag1.appendAttributeName("EOF");
        boolean boolean7 = endTag1.isStartTag();
        boolean boolean8 = endTag1.isCharacter();
        org.jsoup.parser.Token.TokenType tokenType9 = endTag1.type;
        boolean boolean10 = endTag1.isEndTag();
        endTag1.appendAttributeValue("<<</hi!>>  a=\"\">");
        java.lang.String str13 = endTag1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "</hi!>" + "'", str2, "</hi!>");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "</hi!>" + "'", str3, "</hi!>");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + tokenType9 + "' != '" + org.jsoup.parser.Token.TokenType.EndTag + "'", tokenType9.equals(org.jsoup.parser.Token.TokenType.EndTag));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "</hi!>" + "'", str13, "</hi!>");
    }

    @Test
    public void test4197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4197");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("#");
        boolean boolean2 = endTag1.isCharacter();
        org.jsoup.parser.Token.TokenType tokenType3 = null;
        endTag1.type = tokenType3;
        endTag1.appendTagName('4');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4198");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        xmlTreeBuilder0.initialiseParse("Character", "hi!", parseErrorList3);
        org.jsoup.parser.Token.Comment comment5 = new org.jsoup.parser.Token.Comment();
        java.lang.StringBuilder stringBuilder6 = comment5.data;
        java.lang.String str7 = comment5.getData();
        xmlTreeBuilder0.insert(comment5);
        org.jsoup.parser.Token.StartTag startTag9 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag11 = startTag9.name("hi!");
        startTag9.appendAttributeName(' ');
        boolean boolean14 = startTag9.isComment();
        org.jsoup.nodes.Element element15 = xmlTreeBuilder0.insert(startTag9);
        org.jsoup.parser.ParseErrorList parseErrorList18 = null;
        xmlTreeBuilder0.initialiseParse("Character", "<Doctype>", parseErrorList18);
        org.jsoup.parser.Token.EOF eOF20 = new org.jsoup.parser.Token.EOF();
        org.jsoup.parser.Token.TokenType tokenType21 = eOF20.type;
        java.lang.String str22 = eOF20.tokenType();
        boolean boolean23 = xmlTreeBuilder0.process((org.jsoup.parser.Token) eOF20);
        org.jsoup.parser.Token.Comment comment24 = new org.jsoup.parser.Token.Comment();
        java.lang.StringBuilder stringBuilder25 = comment24.data;
        java.lang.String str26 = comment24.getData();
        java.lang.StringBuilder stringBuilder27 = comment24.data;
        java.lang.String str28 = comment24.toString();
        java.lang.String str29 = comment24.getData();
        xmlTreeBuilder0.insert(comment24);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder31 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.Token.EOF eOF32 = new org.jsoup.parser.Token.EOF();
        java.lang.String str33 = eOF32.tokenType();
        boolean boolean34 = xmlTreeBuilder31.process((org.jsoup.parser.Token) eOF32);
        org.jsoup.parser.ParseErrorList parseErrorList37 = null;
        xmlTreeBuilder31.initialiseParse("", "EndTag", parseErrorList37);
        org.jsoup.parser.Token.Character character40 = new org.jsoup.parser.Token.Character("</hi!>");
        java.lang.String str41 = character40.getData();
        java.lang.String str42 = character40.toString();
        xmlTreeBuilder31.insert(character40);
        xmlTreeBuilder0.insert(character40);
        org.jsoup.parser.Token.StartTag startTag45 = new org.jsoup.parser.Token.StartTag();
        startTag45.appendTagName('a');
        boolean boolean48 = xmlTreeBuilder0.process((org.jsoup.parser.Token) startTag45);
        org.jsoup.parser.Token.StartTag startTag50 = new org.jsoup.parser.Token.StartTag("Comment");
        org.jsoup.parser.Token.StartTag startTag54 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag56 = startTag54.name("hi!");
        org.jsoup.nodes.Attributes attributes57 = tag56.attributes;
        org.jsoup.parser.Token.StartTag startTag58 = new org.jsoup.parser.Token.StartTag("</hi!>", attributes57);
        org.jsoup.parser.Token.StartTag startTag59 = new org.jsoup.parser.Token.StartTag("", attributes57);
        java.lang.String str60 = startTag59.tokenType();
        startTag59.finaliseTag();
        org.jsoup.nodes.Attributes attributes62 = startTag59.getAttributes();
        org.jsoup.parser.Token.StartTag startTag63 = new org.jsoup.parser.Token.StartTag("a", attributes62);
        startTag50.attributes = attributes62;
        org.jsoup.nodes.Element element65 = xmlTreeBuilder0.insert(startTag50);
        org.jsoup.nodes.Attributes attributes67 = null;
        org.jsoup.parser.Token.StartTag startTag68 = new org.jsoup.parser.Token.StartTag("", attributes67);
        boolean boolean69 = startTag68.isDoctype();
        java.lang.String str70 = startTag68.tagName;
        org.jsoup.parser.Token.TokenType tokenType71 = startTag68.type;
        startTag68.appendTagName(' ');
        boolean boolean74 = startTag68.isDoctype();
        org.jsoup.parser.Token.StartTag startTag76 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag78 = startTag76.name("hi!");
        org.jsoup.nodes.Attributes attributes79 = tag78.attributes;
        org.jsoup.parser.Token.StartTag startTag80 = new org.jsoup.parser.Token.StartTag("", attributes79);
        startTag68.attributes = attributes79;
        startTag68.selfClosing = true;
        java.lang.String str84 = startTag68.toString();
        startTag68.appendAttributeName("<<</hi!>>>");
        java.lang.String str87 = startTag68.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element88 = xmlTreeBuilder0.insert(startTag68);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(tag11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertTrue("'" + tokenType21 + "' != '" + org.jsoup.parser.Token.TokenType.EOF + "'", tokenType21.equals(org.jsoup.parser.Token.TokenType.EOF));
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "EOF" + "'", str22, "EOF");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(stringBuilder25);
        org.junit.Assert.assertEquals(stringBuilder25.toString(), "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(stringBuilder27);
        org.junit.Assert.assertEquals(stringBuilder27.toString(), "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "<!---->" + "'", str28, "<!---->");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "EOF" + "'", str33, "EOF");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "</hi!>" + "'", str41, "</hi!>");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "</hi!>" + "'", str42, "</hi!>");
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNotNull(tag56);
        org.junit.Assert.assertNotNull(attributes57);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "StartTag" + "'", str60, "StartTag");
        org.junit.Assert.assertNotNull(attributes62);
        org.junit.Assert.assertNotNull(element65);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "" + "'", str70, "");
        org.junit.Assert.assertTrue("'" + tokenType71 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType71.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertNotNull(tag78);
        org.junit.Assert.assertNotNull(attributes79);
        org.junit.Assert.assertEquals("'" + str84 + "' != '" + "< >" + "'", str84, "< >");
        org.junit.Assert.assertEquals("'" + str87 + "' != '" + "< >" + "'", str87, "< >");
    }

    @Test
    public void test4199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4199");
        org.jsoup.nodes.Attributes attributes1 = null;
        org.jsoup.parser.Token.StartTag startTag2 = new org.jsoup.parser.Token.StartTag("", attributes1);
        boolean boolean3 = startTag2.isDoctype();
        java.lang.String str4 = startTag2.tagName;
        org.jsoup.parser.Token.TokenType tokenType5 = startTag2.type;
        startTag2.appendTagName(' ');
        boolean boolean8 = startTag2.isDoctype();
        org.jsoup.parser.Token.StartTag startTag10 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag12 = startTag10.name("hi!");
        org.jsoup.nodes.Attributes attributes13 = tag12.attributes;
        org.jsoup.parser.Token.StartTag startTag14 = new org.jsoup.parser.Token.StartTag("", attributes13);
        startTag2.attributes = attributes13;
        startTag2.selfClosing = true;
        startTag2.appendTagName('#');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + tokenType5 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType5.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(tag12);
        org.junit.Assert.assertNotNull(attributes13);
    }

    @Test
    public void test4200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4200");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        xmlTreeBuilder0.initialiseParse("Character", "hi!", parseErrorList3);
        org.jsoup.parser.Token.Comment comment5 = new org.jsoup.parser.Token.Comment();
        java.lang.StringBuilder stringBuilder6 = comment5.data;
        java.lang.String str7 = comment5.getData();
        xmlTreeBuilder0.insert(comment5);
        org.jsoup.parser.Token.StartTag startTag9 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag11 = startTag9.name("hi!");
        startTag9.appendAttributeName(' ');
        boolean boolean14 = startTag9.isComment();
        org.jsoup.nodes.Element element15 = xmlTreeBuilder0.insert(startTag9);
        org.jsoup.parser.Token.StartTag startTag17 = new org.jsoup.parser.Token.StartTag("Doctype");
        java.lang.String str18 = startTag17.name();
        boolean boolean19 = xmlTreeBuilder0.process((org.jsoup.parser.Token) startTag17);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder20 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList23 = null;
        xmlTreeBuilder20.initialiseParse("Character", "hi!", parseErrorList23);
        org.jsoup.parser.Token.Comment comment25 = new org.jsoup.parser.Token.Comment();
        java.lang.StringBuilder stringBuilder26 = comment25.data;
        java.lang.String str27 = comment25.getData();
        xmlTreeBuilder20.insert(comment25);
        org.jsoup.parser.Token.Character character30 = new org.jsoup.parser.Token.Character("<4>");
        java.lang.String str31 = character30.toString();
        boolean boolean32 = character30.isEndTag();
        xmlTreeBuilder20.insert(character30);
        xmlTreeBuilder0.insert(character30);
        org.jsoup.parser.Token.StartTag startTag36 = new org.jsoup.parser.Token.StartTag("StartTag");
        org.jsoup.nodes.Attributes attributes37 = startTag36.getAttributes();
        org.jsoup.parser.Token.TokenType tokenType38 = org.jsoup.parser.Token.TokenType.Doctype;
        startTag36.type = tokenType38;
        org.jsoup.nodes.Element element40 = xmlTreeBuilder0.insert(startTag36);
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(tag11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Doctype" + "'", str18, "Doctype");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(stringBuilder26);
        org.junit.Assert.assertEquals(stringBuilder26.toString(), "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "<4>" + "'", str31, "<4>");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(attributes37);
        org.junit.Assert.assertTrue("'" + tokenType38 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType38.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertNotNull(element40);
    }

    @Test
    public void test4201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4201");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("hi!");
        java.lang.String str2 = endTag1.toString();
        java.lang.String str3 = endTag1.toString();
        boolean boolean4 = endTag1.isDoctype();
        endTag1.appendAttributeValue('a');
        endTag1.appendAttributeName("<4>");
        org.jsoup.nodes.Attributes attributes9 = endTag1.getAttributes();
        org.jsoup.parser.Token.Tag tag11 = endTag1.name("<</Doctype>>");
        boolean boolean12 = endTag1.isStartTag();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "</hi!>" + "'", str2, "</hi!>");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "</hi!>" + "'", str3, "</hi!>");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(attributes9);
        org.junit.Assert.assertNotNull(tag11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test4202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4202");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("hi!");
        boolean boolean2 = endTag1.selfClosing;
        java.lang.String str3 = endTag1.toString();
        java.lang.String str4 = endTag1.toString();
        endTag1.appendAttributeValue("<4>");
        java.lang.String str7 = endTag1.toString();
        org.jsoup.parser.Token.TokenType tokenType8 = endTag1.type;
        boolean boolean9 = endTag1.isSelfClosing();
        endTag1.appendTagName('a');
        java.lang.String str12 = endTag1.tagName;
        java.lang.String str13 = endTag1.tagName;
        boolean boolean14 = endTag1.isSelfClosing();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "</hi!>" + "'", str3, "</hi!>");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "</hi!>" + "'", str4, "</hi!>");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "</hi!>" + "'", str7, "</hi!>");
        org.junit.Assert.assertTrue("'" + tokenType8 + "' != '" + org.jsoup.parser.Token.TokenType.EndTag + "'", tokenType8.equals(org.jsoup.parser.Token.TokenType.EndTag));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!a" + "'", str12, "hi!a");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!a" + "'", str13, "hi!a");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test4203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4203");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag2 = startTag0.name("hi!");
        tag2.finaliseTag();
        tag2.newAttribute();
        org.jsoup.nodes.Attributes attributes5 = tag2.attributes;
        tag2.tagName = "<Doctype>";
        org.jsoup.parser.Token.StartTag startTag8 = tag2.asStartTag();
        boolean boolean9 = tag2.isComment();
        tag2.appendAttributeValue(' ');
        tag2.appendAttributeValue("</<4</hi!>4>>");
        org.junit.Assert.assertNotNull(tag2);
        org.junit.Assert.assertNotNull(attributes5);
        org.junit.Assert.assertNotNull(startTag8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test4204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4204");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.tokenType();
        boolean boolean2 = doctype0.isForceQuirks();
        java.lang.String str3 = doctype0.getPublicIdentifier();
        java.lang.String str4 = doctype0.getSystemIdentifier();
        java.lang.String str5 = doctype0.tokenType();
        org.jsoup.parser.Token.EndTag endTag7 = new org.jsoup.parser.Token.EndTag("hi!");
        boolean boolean8 = endTag7.selfClosing;
        java.lang.String str9 = endTag7.toString();
        java.lang.String str10 = endTag7.toString();
        boolean boolean11 = endTag7.isEOF();
        org.jsoup.parser.Token.Doctype doctype12 = new org.jsoup.parser.Token.Doctype();
        java.lang.StringBuilder stringBuilder13 = doctype12.name;
        org.jsoup.parser.Token.TokenType tokenType14 = org.jsoup.parser.Token.TokenType.StartTag;
        doctype12.type = tokenType14;
        endTag7.type = tokenType14;
        doctype0.type = tokenType14;
        boolean boolean18 = doctype0.forceQuirks;
        boolean boolean19 = doctype0.isComment();
        doctype0.forceQuirks = true;
        boolean boolean22 = doctype0.isEndTag();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Doctype" + "'", str1, "Doctype");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Doctype" + "'", str5, "Doctype");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "</hi!>" + "'", str9, "</hi!>");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "</hi!>" + "'", str10, "</hi!>");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(stringBuilder13);
        org.junit.Assert.assertEquals(stringBuilder13.toString(), "");
        org.junit.Assert.assertTrue("'" + tokenType14 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType14.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test4205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4205");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag2 = startTag0.name("hi!");
        org.jsoup.parser.Token.TokenType tokenType3 = startTag0.type;
        org.jsoup.parser.Token.TokenType tokenType4 = startTag0.type;
        boolean boolean5 = startTag0.isStartTag();
        startTag0.finaliseTag();
        java.lang.String str7 = startTag0.toString();
        boolean boolean8 = startTag0.isCharacter();
        boolean boolean9 = startTag0.isDoctype();
        startTag0.finaliseTag();
        org.junit.Assert.assertNotNull(tag2);
        org.junit.Assert.assertTrue("'" + tokenType3 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType3.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertTrue("'" + tokenType4 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType4.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<hi!>" + "'", str7, "<hi!>");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test4206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4206");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        boolean boolean1 = doctype0.forceQuirks;
        java.lang.StringBuilder stringBuilder2 = doctype0.systemIdentifier;
        boolean boolean3 = doctype0.isCharacter();
        doctype0.forceQuirks = false;
        boolean boolean6 = doctype0.isEOF();
        java.lang.String str7 = doctype0.tokenType();
        org.jsoup.nodes.Attributes attributes9 = null;
        org.jsoup.parser.Token.StartTag startTag10 = new org.jsoup.parser.Token.StartTag("", attributes9);
        startTag10.selfClosing = false;
        startTag10.newAttribute();
        org.jsoup.parser.Token.Tag tag15 = startTag10.name("</hi!>");
        org.jsoup.parser.Token.TokenType tokenType16 = tag15.type;
        doctype0.type = tokenType16;
        java.lang.StringBuilder stringBuilder18 = doctype0.publicIdentifier;
        java.lang.StringBuilder stringBuilder19 = doctype0.systemIdentifier;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Doctype" + "'", str7, "Doctype");
        org.junit.Assert.assertNotNull(tag15);
        org.junit.Assert.assertTrue("'" + tokenType16 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType16.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertNotNull(stringBuilder18);
        org.junit.Assert.assertEquals(stringBuilder18.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder19);
        org.junit.Assert.assertEquals(stringBuilder19.toString(), "");
    }

    @Test
    public void test4207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4207");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        boolean boolean1 = doctype0.forceQuirks;
        java.lang.StringBuilder stringBuilder2 = doctype0.systemIdentifier;
        boolean boolean3 = doctype0.forceQuirks;
        boolean boolean4 = doctype0.isForceQuirks();
        java.lang.StringBuilder stringBuilder5 = doctype0.publicIdentifier;
        java.lang.String str6 = doctype0.getSystemIdentifier();
        org.jsoup.parser.Token.TokenType tokenType7 = doctype0.type;
        java.lang.StringBuilder stringBuilder8 = doctype0.systemIdentifier;
        org.jsoup.parser.Token.TokenType tokenType9 = doctype0.type;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + tokenType7 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType7.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertNotNull(stringBuilder8);
        org.junit.Assert.assertEquals(stringBuilder8.toString(), "");
        org.junit.Assert.assertTrue("'" + tokenType9 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType9.equals(org.jsoup.parser.Token.TokenType.Doctype));
    }

    @Test
    public void test4208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4208");
        org.jsoup.parser.Token.StartTag startTag1 = new org.jsoup.parser.Token.StartTag("4");
        java.lang.String str2 = startTag1.name();
        org.jsoup.parser.Token.StartTag startTag4 = new org.jsoup.parser.Token.StartTag();
        startTag4.appendTagName('4');
        java.lang.String str7 = startTag4.name();
        org.jsoup.nodes.Attributes attributes8 = startTag4.attributes;
        org.jsoup.parser.Token.StartTag startTag9 = new org.jsoup.parser.Token.StartTag("hi!", attributes8);
        startTag1.attributes = attributes8;
        org.jsoup.parser.Token.StartTag startTag11 = startTag1.asStartTag();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4" + "'", str2, "4");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "4" + "'", str7, "4");
        org.junit.Assert.assertNotNull(attributes8);
        org.junit.Assert.assertNotNull(startTag11);
    }

    @Test
    public void test4209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4209");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        boolean boolean1 = doctype0.forceQuirks;
        java.lang.StringBuilder stringBuilder2 = doctype0.systemIdentifier;
        boolean boolean3 = doctype0.isEndTag();
        doctype0.forceQuirks = false;
        java.lang.StringBuilder stringBuilder6 = doctype0.systemIdentifier;
        boolean boolean7 = doctype0.isForceQuirks();
        doctype0.forceQuirks = false;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test4210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4210");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("<!---->");
        boolean boolean2 = endTag1.selfClosing;
        boolean boolean3 = endTag1.isCharacter();
        java.lang.String str4 = endTag1.toString();
        org.jsoup.parser.Token.EndTag endTag6 = new org.jsoup.parser.Token.EndTag("hi!");
        java.lang.String str7 = endTag6.toString();
        java.lang.String str8 = endTag6.toString();
        org.jsoup.parser.Token.TokenType tokenType9 = org.jsoup.parser.Token.TokenType.EndTag;
        endTag6.type = tokenType9;
        boolean boolean11 = endTag6.isStartTag();
        org.jsoup.parser.Token.TokenType tokenType12 = endTag6.type;
        endTag1.type = tokenType12;
        endTag1.appendAttributeValue("</<4>>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Comment comment16 = endTag1.asComment();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$EndTag cannot be cast to class org.jsoup.parser.Token$Comment (org.jsoup.parser.Token$EndTag and org.jsoup.parser.Token$Comment are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "</<!---->>" + "'", str4, "</<!---->>");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "</hi!>" + "'", str7, "</hi!>");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "</hi!>" + "'", str8, "</hi!>");
        org.junit.Assert.assertTrue("'" + tokenType9 + "' != '" + org.jsoup.parser.Token.TokenType.EndTag + "'", tokenType9.equals(org.jsoup.parser.Token.TokenType.EndTag));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + tokenType12 + "' != '" + org.jsoup.parser.Token.TokenType.EndTag + "'", tokenType12.equals(org.jsoup.parser.Token.TokenType.EndTag));
    }

    @Test
    public void test4211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4211");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("<!---->");
        endTag1.selfClosing = false;
    }

    @Test
    public void test4212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4212");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.parser.Token.StartTag startTag3 = new org.jsoup.parser.Token.StartTag("", attributes2);
        startTag3.selfClosing = false;
        startTag3.appendTagName("</hi!>");
        startTag3.newAttribute();
        org.jsoup.nodes.Attributes attributes9 = startTag3.getAttributes();
        org.jsoup.parser.Token.StartTag startTag10 = new org.jsoup.parser.Token.StartTag("Doctype", attributes9);
        startTag10.selfClosing = true;
        java.lang.String str13 = startTag10.toString();
        org.jsoup.nodes.Attributes attributes14 = startTag10.getAttributes();
        org.jsoup.parser.Token.StartTag startTag15 = new org.jsoup.parser.Token.StartTag();
        startTag15.appendAttributeName('a');
        java.lang.String str18 = startTag15.tagName;
        org.jsoup.parser.Token.StartTag startTag19 = startTag15.asStartTag();
        startTag19.appendTagName('4');
        org.jsoup.nodes.Attributes attributes22 = startTag19.getAttributes();
        startTag10.attributes = attributes22;
        org.junit.Assert.assertNotNull(attributes9);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "<Doctype>" + "'", str13, "<Doctype>");
        org.junit.Assert.assertNotNull(attributes14);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(startTag19);
        org.junit.Assert.assertNotNull(attributes22);
    }

    @Test
    public void test4213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4213");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("hi!");
        java.lang.String str2 = endTag1.toString();
        java.lang.String str3 = endTag1.toString();
        org.jsoup.parser.Token.TokenType tokenType4 = org.jsoup.parser.Token.TokenType.EndTag;
        endTag1.type = tokenType4;
        boolean boolean6 = endTag1.isStartTag();
        boolean boolean7 = endTag1.isCharacter();
        endTag1.finaliseTag();
        endTag1.appendTagName('#');
        endTag1.newAttribute();
        java.lang.String str12 = endTag1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "</hi!>" + "'", str2, "</hi!>");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "</hi!>" + "'", str3, "</hi!>");
        org.junit.Assert.assertTrue("'" + tokenType4 + "' != '" + org.jsoup.parser.Token.TokenType.EndTag + "'", tokenType4.equals(org.jsoup.parser.Token.TokenType.EndTag));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "</hi!#>" + "'", str12, "</hi!#>");
    }

    @Test
    public void test4214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4214");
        org.jsoup.parser.Token.StartTag startTag2 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag4 = startTag2.name("hi!");
        org.jsoup.nodes.Attributes attributes5 = tag4.attributes;
        org.jsoup.parser.Token.StartTag startTag6 = new org.jsoup.parser.Token.StartTag("", attributes5);
        org.jsoup.nodes.Attributes attributes7 = startTag6.attributes;
        org.jsoup.parser.Token.StartTag startTag8 = new org.jsoup.parser.Token.StartTag("<hi!a  a=\"\">", attributes7);
        org.junit.Assert.assertNotNull(tag4);
        org.junit.Assert.assertNotNull(attributes5);
        org.junit.Assert.assertNotNull(attributes7);
    }

    @Test
    public void test4215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4215");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("StartTag");
        boolean boolean2 = endTag1.isEOF();
        boolean boolean3 = endTag1.selfClosing;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test4216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4216");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("Comment");
        boolean boolean2 = endTag1.selfClosing;
        endTag1.appendAttributeValue('#');
        java.lang.Class<?> wildcardClass5 = endTag1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test4217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4217");
        org.jsoup.nodes.Attributes attributes1 = null;
        org.jsoup.parser.Token.StartTag startTag2 = new org.jsoup.parser.Token.StartTag("", attributes1);
        boolean boolean3 = startTag2.isDoctype();
        java.lang.String str4 = startTag2.tagName;
        startTag2.newAttribute();
        startTag2.appendTagName("</hi!>");
        startTag2.appendAttributeName("EOF");
        startTag2.appendAttributeName('4');
        java.lang.String str12 = startTag2.toString();
        boolean boolean13 = startTag2.selfClosing;
        boolean boolean14 = startTag2.isStartTag();
        org.jsoup.nodes.Attributes attributes15 = startTag2.attributes;
        startTag2.finaliseTag();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "<</hi!>>" + "'", str12, "<</hi!>>");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(attributes15);
    }

    @Test
    public void test4218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4218");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.tokenType();
        doctype0.forceQuirks = true;
        java.lang.String str4 = doctype0.getSystemIdentifier();
        boolean boolean5 = doctype0.forceQuirks;
        org.jsoup.parser.Token.TokenType tokenType6 = doctype0.type;
        boolean boolean7 = doctype0.forceQuirks;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Doctype" + "'", str1, "Doctype");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + tokenType6 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType6.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test4219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4219");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.tokenType();
        boolean boolean2 = doctype0.isForceQuirks();
        java.lang.String str3 = doctype0.getPublicIdentifier();
        boolean boolean4 = doctype0.isForceQuirks();
        doctype0.forceQuirks = true;
        org.jsoup.parser.Token.Doctype doctype7 = doctype0.asDoctype();
        java.lang.StringBuilder stringBuilder8 = doctype7.systemIdentifier;
        boolean boolean9 = doctype7.isCharacter();
        java.lang.String str10 = doctype7.getName();
        java.lang.StringBuilder stringBuilder11 = doctype7.name;
        java.lang.StringBuilder stringBuilder12 = doctype7.publicIdentifier;
        boolean boolean13 = doctype7.isDoctype();
        java.lang.String str14 = doctype7.getSystemIdentifier();
        boolean boolean15 = doctype7.forceQuirks;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Doctype" + "'", str1, "Doctype");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(doctype7);
        org.junit.Assert.assertNotNull(stringBuilder8);
        org.junit.Assert.assertEquals(stringBuilder8.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(stringBuilder11);
        org.junit.Assert.assertEquals(stringBuilder11.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder12);
        org.junit.Assert.assertEquals(stringBuilder12.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test4220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4220");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.tokenType();
        boolean boolean2 = doctype0.isForceQuirks();
        boolean boolean3 = doctype0.isDoctype();
        java.lang.String str4 = doctype0.getPublicIdentifier();
        java.lang.String str5 = doctype0.getSystemIdentifier();
        org.jsoup.parser.Token.TokenType tokenType6 = doctype0.type;
        java.lang.StringBuilder stringBuilder7 = doctype0.systemIdentifier;
        java.lang.String str8 = doctype0.tokenType();
        boolean boolean9 = doctype0.forceQuirks;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Doctype" + "'", str1, "Doctype");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + tokenType6 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType6.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertNotNull(stringBuilder7);
        org.junit.Assert.assertEquals(stringBuilder7.toString(), "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Doctype" + "'", str8, "Doctype");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test4221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4221");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        xmlTreeBuilder0.initialiseParse("Character", "hi!", parseErrorList3);
        org.jsoup.parser.Token.Comment comment5 = new org.jsoup.parser.Token.Comment();
        java.lang.StringBuilder stringBuilder6 = comment5.data;
        java.lang.String str7 = comment5.getData();
        xmlTreeBuilder0.insert(comment5);
        org.jsoup.parser.Token.StartTag startTag9 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag11 = startTag9.name("hi!");
        startTag9.appendAttributeName(' ');
        boolean boolean14 = startTag9.isComment();
        org.jsoup.nodes.Element element15 = xmlTreeBuilder0.insert(startTag9);
        org.jsoup.parser.Token.StartTag startTag17 = new org.jsoup.parser.Token.StartTag("Doctype");
        java.lang.String str18 = startTag17.name();
        boolean boolean19 = xmlTreeBuilder0.process((org.jsoup.parser.Token) startTag17);
        org.jsoup.parser.Token.Comment comment20 = new org.jsoup.parser.Token.Comment();
        java.lang.StringBuilder stringBuilder21 = comment20.data;
        java.lang.String str22 = comment20.getData();
        java.lang.StringBuilder stringBuilder23 = comment20.data;
        xmlTreeBuilder0.insert(comment20);
        org.jsoup.parser.Token.Character character26 = new org.jsoup.parser.Token.Character("EOF");
        java.lang.String str27 = character26.getData();
        boolean boolean28 = character26.isComment();
        java.lang.String str29 = character26.toString();
        xmlTreeBuilder0.insert(character26);
        org.jsoup.parser.ParseErrorList parseErrorList33 = null;
        xmlTreeBuilder0.initialiseParse("StartTag", "Character", parseErrorList33);
        org.jsoup.parser.Token.Comment comment35 = new org.jsoup.parser.Token.Comment();
        java.lang.StringBuilder stringBuilder36 = comment35.data;
        xmlTreeBuilder0.insert(comment35);
        java.lang.String str38 = comment35.tokenType();
        java.lang.StringBuilder stringBuilder39 = comment35.data;
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(tag11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Doctype" + "'", str18, "Doctype");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(stringBuilder21);
        org.junit.Assert.assertEquals(stringBuilder21.toString(), "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(stringBuilder23);
        org.junit.Assert.assertEquals(stringBuilder23.toString(), "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "EOF" + "'", str27, "EOF");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "EOF" + "'", str29, "EOF");
        org.junit.Assert.assertNotNull(stringBuilder36);
        org.junit.Assert.assertEquals(stringBuilder36.toString(), "");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "Comment" + "'", str38, "Comment");
        org.junit.Assert.assertNotNull(stringBuilder39);
        org.junit.Assert.assertEquals(stringBuilder39.toString(), "");
    }

    @Test
    public void test4222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4222");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag2 = startTag0.name("hi!");
        startTag0.appendAttributeName(' ');
        startTag0.appendAttributeValue('#');
        startTag0.newAttribute();
        startTag0.appendAttributeName('a');
        java.lang.String str10 = startTag0.toString();
        boolean boolean11 = startTag0.isCharacter();
        java.lang.String str12 = startTag0.name();
        boolean boolean13 = startTag0.isEOF();
        org.junit.Assert.assertNotNull(tag2);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "<hi!  =\"#\">" + "'", str10, "<hi!  =\"#\">");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test4223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4223");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        xmlTreeBuilder0.initialiseParse("Character", "hi!", parseErrorList3);
        org.jsoup.parser.Token.Comment comment5 = new org.jsoup.parser.Token.Comment();
        java.lang.StringBuilder stringBuilder6 = comment5.data;
        java.lang.String str7 = comment5.getData();
        xmlTreeBuilder0.insert(comment5);
        org.jsoup.parser.Token.Character character10 = new org.jsoup.parser.Token.Character("EOF");
        java.lang.String str11 = character10.getData();
        java.lang.String str12 = character10.toString();
        boolean boolean13 = character10.isStartTag();
        java.lang.String str14 = character10.getData();
        java.lang.String str15 = character10.toString();
        org.jsoup.parser.Token.Character character16 = character10.asCharacter();
        xmlTreeBuilder0.insert(character16);
        java.lang.String str18 = character16.getData();
        boolean boolean19 = character16.isDoctype();
        java.lang.String str20 = character16.getData();
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "EOF" + "'", str11, "EOF");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "EOF" + "'", str12, "EOF");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "EOF" + "'", str14, "EOF");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "EOF" + "'", str15, "EOF");
        org.junit.Assert.assertNotNull(character16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "EOF" + "'", str18, "EOF");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "EOF" + "'", str20, "EOF");
    }

    @Test
    public void test4224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4224");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.appendAttributeName('a');
        java.lang.String str3 = startTag0.tagName;
        org.jsoup.parser.Token.Tag tag5 = startTag0.name("EndTag");
        java.lang.String str6 = startTag0.tagName;
        startTag0.appendAttributeValue(' ');
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(tag5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "EndTag" + "'", str6, "EndTag");
    }

    @Test
    public void test4225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4225");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        xmlTreeBuilder0.initialiseParse("Character", "hi!", parseErrorList3);
        org.jsoup.parser.Token.Comment comment5 = new org.jsoup.parser.Token.Comment();
        java.lang.StringBuilder stringBuilder6 = comment5.data;
        java.lang.String str7 = comment5.getData();
        xmlTreeBuilder0.insert(comment5);
        org.jsoup.parser.Token.StartTag startTag9 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag11 = startTag9.name("hi!");
        startTag9.appendAttributeName(' ');
        boolean boolean14 = startTag9.isComment();
        org.jsoup.nodes.Element element15 = xmlTreeBuilder0.insert(startTag9);
        org.jsoup.parser.ParseErrorList parseErrorList18 = null;
        xmlTreeBuilder0.initialiseParse("Character", "<Doctype>", parseErrorList18);
        org.jsoup.parser.Token.Character character21 = new org.jsoup.parser.Token.Character("EOF");
        java.lang.String str22 = character21.getData();
        java.lang.String str23 = character21.toString();
        boolean boolean24 = character21.isStartTag();
        java.lang.String str25 = character21.toString();
        xmlTreeBuilder0.insert(character21);
        org.jsoup.parser.Token.StartTag startTag28 = new org.jsoup.parser.Token.StartTag("Doctype");
        boolean boolean29 = xmlTreeBuilder0.process((org.jsoup.parser.Token) startTag28);
        org.jsoup.parser.Token.Character character30 = null;
        // The following exception was thrown during execution in test generation
        try {
            xmlTreeBuilder0.insert(character30);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(tag11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "EOF" + "'", str22, "EOF");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "EOF" + "'", str23, "EOF");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "EOF" + "'", str25, "EOF");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
    }

    @Test
    public void test4226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4226");
        org.jsoup.nodes.Attributes attributes1 = null;
        org.jsoup.parser.Token.StartTag startTag2 = new org.jsoup.parser.Token.StartTag("", attributes1);
        startTag2.selfClosing = false;
        startTag2.selfClosing = true;
        startTag2.selfClosing = false;
        java.lang.String str9 = startTag2.tagName;
        boolean boolean10 = startTag2.selfClosing;
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test4227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4227");
        org.jsoup.parser.Token.StartTag startTag1 = new org.jsoup.parser.Token.StartTag("hi!");
        startTag1.appendTagName('a');
        java.lang.String str4 = startTag1.tagName;
        startTag1.tagName = "";
        startTag1.appendTagName("<<!---->>");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!a" + "'", str4, "hi!a");
    }

    @Test
    public void test4228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4228");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.tokenType();
        boolean boolean2 = doctype0.isForceQuirks();
        java.lang.String str3 = doctype0.getPublicIdentifier();
        boolean boolean4 = doctype0.isForceQuirks();
        doctype0.forceQuirks = true;
        doctype0.forceQuirks = false;
        doctype0.forceQuirks = false;
        java.lang.String str11 = doctype0.getPublicIdentifier();
        boolean boolean12 = doctype0.forceQuirks;
        org.jsoup.parser.Token.Doctype doctype13 = doctype0.asDoctype();
        java.lang.String str14 = doctype0.tokenType();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Comment comment15 = doctype0.asComment();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$Doctype cannot be cast to class org.jsoup.parser.Token$Comment (org.jsoup.parser.Token$Doctype and org.jsoup.parser.Token$Comment are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Doctype" + "'", str1, "Doctype");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(doctype13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Doctype" + "'", str14, "Doctype");
    }

    @Test
    public void test4229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4229");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag2 = startTag0.name("hi!");
        startTag0.appendAttributeName(' ');
        startTag0.appendAttributeName("hi!");
        boolean boolean7 = startTag0.isSelfClosing();
        org.jsoup.parser.Token.Tag tag9 = startTag0.name("</Doctype>");
        boolean boolean10 = tag9.isCharacter();
        tag9.finaliseTag();
        tag9.tagName = "</EndTag>";
        tag9.appendAttributeName('#');
        org.junit.Assert.assertNotNull(tag2);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(tag9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test4230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4230");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        xmlTreeBuilder0.initialiseParse("Character", "hi!", parseErrorList3);
        org.jsoup.parser.Token.Comment comment5 = new org.jsoup.parser.Token.Comment();
        java.lang.StringBuilder stringBuilder6 = comment5.data;
        java.lang.String str7 = comment5.getData();
        xmlTreeBuilder0.insert(comment5);
        org.jsoup.parser.Token.StartTag startTag9 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag11 = startTag9.name("hi!");
        startTag9.appendAttributeName(' ');
        boolean boolean14 = startTag9.isComment();
        org.jsoup.nodes.Element element15 = xmlTreeBuilder0.insert(startTag9);
        org.jsoup.parser.ParseErrorList parseErrorList18 = null;
        xmlTreeBuilder0.initialiseParse("", "StartTag", parseErrorList18);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder20 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList23 = null;
        xmlTreeBuilder20.initialiseParse("</hi!>", "EOF", parseErrorList23);
        org.jsoup.parser.Token.StartTag startTag25 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag27 = startTag25.name("hi!");
        boolean boolean28 = xmlTreeBuilder20.process((org.jsoup.parser.Token) startTag25);
        org.jsoup.parser.Token.Comment comment29 = new org.jsoup.parser.Token.Comment();
        java.lang.StringBuilder stringBuilder30 = comment29.data;
        java.lang.String str31 = comment29.toString();
        xmlTreeBuilder20.insert(comment29);
        java.lang.String str33 = comment29.toString();
        java.lang.String str34 = comment29.getData();
        org.jsoup.parser.Token.Comment comment35 = comment29.asComment();
        xmlTreeBuilder0.insert(comment35);
        boolean boolean37 = comment35.isStartTag();
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(tag11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(tag27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(stringBuilder30);
        org.junit.Assert.assertEquals(stringBuilder30.toString(), "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "<!---->" + "'", str31, "<!---->");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "<!---->" + "'", str33, "<!---->");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertNotNull(comment35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
    }

    @Test
    public void test4231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4231");
        org.jsoup.parser.Token.StartTag startTag1 = new org.jsoup.parser.Token.StartTag("Doctype");
        startTag1.tagName = "";
        java.lang.String str4 = startTag1.tagName;
        startTag1.newAttribute();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test4232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4232");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        xmlTreeBuilder0.initialiseParse("</hi!>", "EOF", parseErrorList3);
        org.jsoup.parser.Token.StartTag startTag5 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag7 = startTag5.name("hi!");
        boolean boolean8 = xmlTreeBuilder0.process((org.jsoup.parser.Token) startTag5);
        org.jsoup.parser.Token.StartTag startTag9 = new org.jsoup.parser.Token.StartTag();
        startTag9.appendTagName('4');
        org.jsoup.nodes.Element element12 = xmlTreeBuilder0.insert(startTag9);
        org.jsoup.parser.ParseErrorList parseErrorList15 = null;
        xmlTreeBuilder0.initialiseParse("Character", "Doctype", parseErrorList15);
        org.jsoup.parser.Token.Character character18 = new org.jsoup.parser.Token.Character("EOF");
        java.lang.String str19 = character18.getData();
        boolean boolean20 = character18.isComment();
        org.jsoup.parser.Token.Comment comment21 = new org.jsoup.parser.Token.Comment();
        java.lang.StringBuilder stringBuilder22 = comment21.data;
        org.jsoup.parser.Token.TokenType tokenType23 = org.jsoup.parser.Token.TokenType.Comment;
        comment21.type = tokenType23;
        character18.type = tokenType23;
        java.lang.String str26 = character18.toString();
        java.lang.String str27 = character18.toString();
        xmlTreeBuilder0.insert(character18);
        org.jsoup.parser.ParseErrorList parseErrorList31 = null;
        xmlTreeBuilder0.initialiseParse("hi!", "</<4>Doctype>", parseErrorList31);
        org.jsoup.nodes.Attributes attributes35 = null;
        org.jsoup.parser.Token.StartTag startTag36 = new org.jsoup.parser.Token.StartTag("", attributes35);
        startTag36.selfClosing = false;
        startTag36.appendTagName("</hi!>");
        startTag36.newAttribute();
        org.jsoup.nodes.Attributes attributes42 = startTag36.getAttributes();
        org.jsoup.parser.Token.StartTag startTag43 = new org.jsoup.parser.Token.StartTag("Doctype", attributes42);
        startTag43.selfClosing = true;
        org.jsoup.parser.Token.Tag tag47 = startTag43.name("Character");
        boolean boolean48 = tag47.isStartTag();
        boolean boolean49 = xmlTreeBuilder0.process((org.jsoup.parser.Token) tag47);
        org.jsoup.parser.ParseErrorList parseErrorList52 = null;
        xmlTreeBuilder0.initialiseParse("StartTag", "<</hi!>>", parseErrorList52);
        org.jsoup.parser.ParseErrorList parseErrorList56 = null;
        xmlTreeBuilder0.initialiseParse("</Comment>", "", parseErrorList56);
        org.jsoup.parser.Token.StartTag startTag58 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag60 = startTag58.name("hi!");
        startTag58.appendAttributeName(' ');
        java.lang.String str63 = startTag58.tokenType();
        org.jsoup.nodes.Attributes attributes66 = null;
        org.jsoup.parser.Token.StartTag startTag67 = new org.jsoup.parser.Token.StartTag("", attributes66);
        startTag67.selfClosing = false;
        startTag67.newAttribute();
        org.jsoup.parser.Token.StartTag startTag72 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag74 = startTag72.name("hi!");
        org.jsoup.nodes.Attributes attributes75 = tag74.attributes;
        org.jsoup.parser.Token.StartTag startTag76 = new org.jsoup.parser.Token.StartTag("", attributes75);
        startTag67.attributes = attributes75;
        org.jsoup.parser.Token.StartTag startTag78 = new org.jsoup.parser.Token.StartTag("<!---->", attributes75);
        startTag58.attributes = attributes75;
        boolean boolean80 = startTag58.isEndTag();
        org.jsoup.nodes.Element element81 = xmlTreeBuilder0.insert(startTag58);
        startTag58.selfClosing = true;
        org.junit.Assert.assertNotNull(tag7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "EOF" + "'", str19, "EOF");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(stringBuilder22);
        org.junit.Assert.assertEquals(stringBuilder22.toString(), "");
        org.junit.Assert.assertTrue("'" + tokenType23 + "' != '" + org.jsoup.parser.Token.TokenType.Comment + "'", tokenType23.equals(org.jsoup.parser.Token.TokenType.Comment));
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "EOF" + "'", str26, "EOF");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "EOF" + "'", str27, "EOF");
        org.junit.Assert.assertNotNull(attributes42);
        org.junit.Assert.assertNotNull(tag47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNotNull(tag60);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "StartTag" + "'", str63, "StartTag");
        org.junit.Assert.assertNotNull(tag74);
        org.junit.Assert.assertNotNull(attributes75);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertNotNull(element81);
    }

    @Test
    public void test4233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4233");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        xmlTreeBuilder0.initialiseParse("</hi!>", "EOF", parseErrorList3);
        org.jsoup.parser.Token.StartTag startTag5 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag7 = startTag5.name("hi!");
        boolean boolean8 = xmlTreeBuilder0.process((org.jsoup.parser.Token) startTag5);
        org.jsoup.parser.Token.StartTag startTag9 = new org.jsoup.parser.Token.StartTag();
        startTag9.appendTagName('4');
        org.jsoup.nodes.Element element12 = xmlTreeBuilder0.insert(startTag9);
        startTag9.newAttribute();
        boolean boolean14 = startTag9.isEndTag();
        startTag9.appendAttributeName("<Doctype>");
        startTag9.appendAttributeValue("</Doctype</<4>>>");
        org.junit.Assert.assertNotNull(tag7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test4234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4234");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("hi!");
        java.lang.String str2 = endTag1.toString();
        boolean boolean3 = endTag1.isEOF();
        endTag1.appendAttributeName("<Doctype>");
        endTag1.appendAttributeValue("<!---->");
        endTag1.appendAttributeName("</hi!>4");
        boolean boolean10 = endTag1.isStartTag();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "</hi!>" + "'", str2, "</hi!>");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test4235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4235");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag2 = startTag0.name("hi!");
        startTag0.appendAttributeName(' ');
        startTag0.appendAttributeName("hi!");
        boolean boolean7 = startTag0.isSelfClosing();
        org.jsoup.parser.Token.StartTag startTag8 = new org.jsoup.parser.Token.StartTag();
        startTag8.appendTagName('4');
        java.lang.String str11 = startTag8.name();
        org.jsoup.nodes.Attributes attributes12 = startTag8.attributes;
        startTag0.attributes = attributes12;
        java.lang.String str14 = startTag0.toString();
        startTag0.appendAttributeName('#');
        startTag0.appendAttributeValue('a');
        startTag0.appendAttributeValue("<</Doctype>>");
        org.junit.Assert.assertNotNull(tag2);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "4" + "'", str11, "4");
        org.junit.Assert.assertNotNull(attributes12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "<hi!>" + "'", str14, "<hi!>");
    }

    @Test
    public void test4236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4236");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.tokenType();
        boolean boolean2 = doctype0.isForceQuirks();
        java.lang.String str3 = doctype0.getPublicIdentifier();
        boolean boolean4 = doctype0.isForceQuirks();
        doctype0.forceQuirks = true;
        org.jsoup.parser.Token.Doctype doctype7 = doctype0.asDoctype();
        java.lang.StringBuilder stringBuilder8 = doctype7.systemIdentifier;
        java.lang.String str9 = doctype7.tokenType();
        doctype7.forceQuirks = false;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Doctype" + "'", str1, "Doctype");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(doctype7);
        org.junit.Assert.assertNotNull(stringBuilder8);
        org.junit.Assert.assertEquals(stringBuilder8.toString(), "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Doctype" + "'", str9, "Doctype");
    }

    @Test
    public void test4237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4237");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        xmlTreeBuilder0.initialiseParse("Character", "hi!", parseErrorList3);
        org.jsoup.parser.Token.Comment comment5 = new org.jsoup.parser.Token.Comment();
        java.lang.StringBuilder stringBuilder6 = comment5.data;
        java.lang.String str7 = comment5.getData();
        xmlTreeBuilder0.insert(comment5);
        org.jsoup.parser.Token.StartTag startTag9 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag11 = startTag9.name("hi!");
        startTag9.appendAttributeName(' ');
        boolean boolean14 = startTag9.isComment();
        org.jsoup.nodes.Element element15 = xmlTreeBuilder0.insert(startTag9);
        org.jsoup.parser.ParseErrorList parseErrorList18 = null;
        xmlTreeBuilder0.initialiseParse("Character", "<Doctype>", parseErrorList18);
        org.jsoup.parser.Token.EOF eOF20 = new org.jsoup.parser.Token.EOF();
        org.jsoup.parser.Token.TokenType tokenType21 = eOF20.type;
        java.lang.String str22 = eOF20.tokenType();
        boolean boolean23 = xmlTreeBuilder0.process((org.jsoup.parser.Token) eOF20);
        org.jsoup.parser.Token.Comment comment24 = new org.jsoup.parser.Token.Comment();
        java.lang.StringBuilder stringBuilder25 = comment24.data;
        java.lang.String str26 = comment24.getData();
        java.lang.StringBuilder stringBuilder27 = comment24.data;
        java.lang.String str28 = comment24.toString();
        java.lang.String str29 = comment24.getData();
        xmlTreeBuilder0.insert(comment24);
        org.jsoup.parser.ParseErrorList parseErrorList33 = null;
        xmlTreeBuilder0.initialiseParse("4", "Doctype", parseErrorList33);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder35 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList38 = null;
        xmlTreeBuilder35.initialiseParse("Character", "hi!", parseErrorList38);
        org.jsoup.parser.Token.Comment comment40 = new org.jsoup.parser.Token.Comment();
        java.lang.StringBuilder stringBuilder41 = comment40.data;
        java.lang.String str42 = comment40.getData();
        xmlTreeBuilder35.insert(comment40);
        org.jsoup.parser.Token.StartTag startTag44 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag46 = startTag44.name("hi!");
        startTag44.appendAttributeName(' ');
        boolean boolean49 = startTag44.isComment();
        org.jsoup.nodes.Element element50 = xmlTreeBuilder35.insert(startTag44);
        org.jsoup.parser.ParseErrorList parseErrorList53 = null;
        xmlTreeBuilder35.initialiseParse("Character", "<Doctype>", parseErrorList53);
        org.jsoup.parser.Token.EOF eOF55 = new org.jsoup.parser.Token.EOF();
        org.jsoup.parser.Token.TokenType tokenType56 = eOF55.type;
        java.lang.String str57 = eOF55.tokenType();
        boolean boolean58 = xmlTreeBuilder35.process((org.jsoup.parser.Token) eOF55);
        org.jsoup.parser.Token.Comment comment59 = new org.jsoup.parser.Token.Comment();
        java.lang.StringBuilder stringBuilder60 = comment59.data;
        java.lang.String str61 = comment59.getData();
        java.lang.StringBuilder stringBuilder62 = comment59.data;
        java.lang.String str63 = comment59.toString();
        java.lang.String str64 = comment59.getData();
        xmlTreeBuilder35.insert(comment59);
        org.jsoup.parser.ParseErrorList parseErrorList68 = null;
        xmlTreeBuilder35.initialiseParse("4", "Doctype", parseErrorList68);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder70 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList73 = null;
        xmlTreeBuilder70.initialiseParse("</hi!>", "EOF", parseErrorList73);
        org.jsoup.parser.Token.StartTag startTag75 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag77 = startTag75.name("hi!");
        boolean boolean78 = xmlTreeBuilder70.process((org.jsoup.parser.Token) startTag75);
        org.jsoup.parser.Token.Comment comment79 = new org.jsoup.parser.Token.Comment();
        java.lang.StringBuilder stringBuilder80 = comment79.data;
        java.lang.String str81 = comment79.toString();
        xmlTreeBuilder70.insert(comment79);
        xmlTreeBuilder35.insert(comment79);
        xmlTreeBuilder0.insert(comment79);
        boolean boolean85 = comment79.isComment();
        java.lang.StringBuilder stringBuilder86 = comment79.data;
        java.lang.String str87 = comment79.getData();
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(tag11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertTrue("'" + tokenType21 + "' != '" + org.jsoup.parser.Token.TokenType.EOF + "'", tokenType21.equals(org.jsoup.parser.Token.TokenType.EOF));
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "EOF" + "'", str22, "EOF");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(stringBuilder25);
        org.junit.Assert.assertEquals(stringBuilder25.toString(), "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(stringBuilder27);
        org.junit.Assert.assertEquals(stringBuilder27.toString(), "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "<!---->" + "'", str28, "<!---->");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNotNull(stringBuilder41);
        org.junit.Assert.assertEquals(stringBuilder41.toString(), "");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertNotNull(tag46);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(element50);
        org.junit.Assert.assertTrue("'" + tokenType56 + "' != '" + org.jsoup.parser.Token.TokenType.EOF + "'", tokenType56.equals(org.jsoup.parser.Token.TokenType.EOF));
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "EOF" + "'", str57, "EOF");
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertNotNull(stringBuilder60);
        org.junit.Assert.assertEquals(stringBuilder60.toString(), "");
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "" + "'", str61, "");
        org.junit.Assert.assertNotNull(stringBuilder62);
        org.junit.Assert.assertEquals(stringBuilder62.toString(), "");
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "<!---->" + "'", str63, "<!---->");
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "" + "'", str64, "");
        org.junit.Assert.assertNotNull(tag77);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + true + "'", boolean78 == true);
        org.junit.Assert.assertNotNull(stringBuilder80);
        org.junit.Assert.assertEquals(stringBuilder80.toString(), "");
        org.junit.Assert.assertEquals("'" + str81 + "' != '" + "<!---->" + "'", str81, "<!---->");
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + true + "'", boolean85 == true);
        org.junit.Assert.assertNotNull(stringBuilder86);
        org.junit.Assert.assertEquals(stringBuilder86.toString(), "");
        org.junit.Assert.assertEquals("'" + str87 + "' != '" + "" + "'", str87, "");
    }

    @Test
    public void test4238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4238");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        boolean boolean1 = doctype0.forceQuirks;
        java.lang.StringBuilder stringBuilder2 = doctype0.systemIdentifier;
        boolean boolean3 = doctype0.isCharacter();
        doctype0.forceQuirks = false;
        java.lang.StringBuilder stringBuilder6 = doctype0.publicIdentifier;
        boolean boolean7 = doctype0.forceQuirks;
        java.lang.StringBuilder stringBuilder8 = doctype0.publicIdentifier;
        doctype0.forceQuirks = true;
        java.lang.StringBuilder stringBuilder11 = doctype0.systemIdentifier;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(stringBuilder8);
        org.junit.Assert.assertEquals(stringBuilder8.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder11);
        org.junit.Assert.assertEquals(stringBuilder11.toString(), "");
    }

    @Test
    public void test4239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4239");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder1 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList4 = null;
        xmlTreeBuilder1.initialiseParse("Character", "hi!", parseErrorList4);
        org.jsoup.parser.Token.Comment comment6 = new org.jsoup.parser.Token.Comment();
        java.lang.StringBuilder stringBuilder7 = comment6.data;
        java.lang.String str8 = comment6.getData();
        xmlTreeBuilder1.insert(comment6);
        org.jsoup.parser.Token.StartTag startTag10 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag12 = startTag10.name("hi!");
        startTag10.appendAttributeName(' ');
        boolean boolean15 = startTag10.isComment();
        org.jsoup.nodes.Element element16 = xmlTreeBuilder1.insert(startTag10);
        org.jsoup.nodes.Attributes attributes17 = startTag10.getAttributes();
        org.jsoup.parser.Token.StartTag startTag18 = new org.jsoup.parser.Token.StartTag("hi!<4>", attributes17);
        org.junit.Assert.assertNotNull(stringBuilder7);
        org.junit.Assert.assertEquals(stringBuilder7.toString(), "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(tag12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(attributes17);
    }

    @Test
    public void test4240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4240");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        java.lang.StringBuilder stringBuilder1 = comment0.data;
        java.lang.String str2 = comment0.getData();
        java.lang.StringBuilder stringBuilder3 = comment0.data;
        java.lang.String str4 = comment0.toString();
        java.lang.String str5 = comment0.tokenType();
        java.lang.StringBuilder stringBuilder6 = comment0.data;
        java.lang.StringBuilder stringBuilder7 = comment0.data;
        java.lang.String str8 = comment0.toString();
        java.lang.StringBuilder stringBuilder9 = comment0.data;
        org.junit.Assert.assertNotNull(stringBuilder1);
        org.junit.Assert.assertEquals(stringBuilder1.toString(), "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<!---->" + "'", str4, "<!---->");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Comment" + "'", str5, "Comment");
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder7);
        org.junit.Assert.assertEquals(stringBuilder7.toString(), "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "<!---->" + "'", str8, "<!---->");
        org.junit.Assert.assertNotNull(stringBuilder9);
        org.junit.Assert.assertEquals(stringBuilder9.toString(), "");
    }

    @Test
    public void test4241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4241");
        org.jsoup.nodes.Attributes attributes3 = null;
        org.jsoup.parser.Token.StartTag startTag4 = new org.jsoup.parser.Token.StartTag("", attributes3);
        startTag4.selfClosing = false;
        startTag4.appendTagName("</hi!>");
        startTag4.newAttribute();
        org.jsoup.nodes.Attributes attributes10 = startTag4.getAttributes();
        org.jsoup.parser.Token.StartTag startTag11 = new org.jsoup.parser.Token.StartTag("hi!", attributes10);
        org.jsoup.parser.Token.StartTag startTag12 = new org.jsoup.parser.Token.StartTag("</Character>", attributes10);
        org.jsoup.parser.Token.StartTag startTag14 = new org.jsoup.parser.Token.StartTag("Doctype");
        startTag14.tagName = "";
        org.jsoup.parser.Token.TokenType tokenType17 = startTag14.type;
        startTag12.type = tokenType17;
        boolean boolean19 = startTag12.isEndTag();
        org.junit.Assert.assertNotNull(attributes10);
        org.junit.Assert.assertTrue("'" + tokenType17 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType17.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test4242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4242");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        boolean boolean1 = doctype0.forceQuirks;
        java.lang.StringBuilder stringBuilder2 = doctype0.systemIdentifier;
        boolean boolean3 = doctype0.isCharacter();
        doctype0.forceQuirks = false;
        java.lang.StringBuilder stringBuilder6 = doctype0.publicIdentifier;
        boolean boolean7 = doctype0.forceQuirks;
        doctype0.forceQuirks = true;
        org.jsoup.parser.Token.Doctype doctype10 = doctype0.asDoctype();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(doctype10);
    }

    @Test
    public void test4243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4243");
        org.jsoup.parser.Token.Character character1 = new org.jsoup.parser.Token.Character("EOF");
        java.lang.String str2 = character1.getData();
        java.lang.String str3 = character1.toString();
        boolean boolean4 = character1.isStartTag();
        java.lang.String str5 = character1.toString();
        java.lang.String str6 = character1.toString();
        org.jsoup.parser.Token.TokenType tokenType7 = org.jsoup.parser.Token.TokenType.Comment;
        character1.type = tokenType7;
        java.lang.String str9 = character1.getData();
        boolean boolean10 = character1.isCharacter();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "EOF" + "'", str2, "EOF");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "EOF" + "'", str3, "EOF");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "EOF" + "'", str5, "EOF");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "EOF" + "'", str6, "EOF");
        org.junit.Assert.assertTrue("'" + tokenType7 + "' != '" + org.jsoup.parser.Token.TokenType.Comment + "'", tokenType7.equals(org.jsoup.parser.Token.TokenType.Comment));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "EOF" + "'", str9, "EOF");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test4244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4244");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        xmlTreeBuilder0.initialiseParse("</hi!>", "EOF", parseErrorList3);
        org.jsoup.parser.Token.StartTag startTag5 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag7 = startTag5.name("hi!");
        boolean boolean8 = xmlTreeBuilder0.process((org.jsoup.parser.Token) startTag5);
        org.jsoup.parser.Token.StartTag startTag9 = new org.jsoup.parser.Token.StartTag();
        startTag9.appendTagName('4');
        org.jsoup.nodes.Element element12 = xmlTreeBuilder0.insert(startTag9);
        org.jsoup.parser.ParseErrorList parseErrorList15 = null;
        xmlTreeBuilder0.initialiseParse("", "< a>", parseErrorList15);
        org.junit.Assert.assertNotNull(tag7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(element12);
    }

    @Test
    public void test4245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4245");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.Token.EOF eOF1 = new org.jsoup.parser.Token.EOF();
        java.lang.String str2 = eOF1.tokenType();
        boolean boolean3 = xmlTreeBuilder0.process((org.jsoup.parser.Token) eOF1);
        org.jsoup.parser.ParseErrorList parseErrorList6 = null;
        xmlTreeBuilder0.initialiseParse("", "EndTag", parseErrorList6);
        org.jsoup.parser.Token.Character character9 = new org.jsoup.parser.Token.Character("<</hi!>>");
        boolean boolean10 = xmlTreeBuilder0.process((org.jsoup.parser.Token) character9);
        org.jsoup.parser.Token.Character character12 = new org.jsoup.parser.Token.Character("EOF");
        java.lang.String str13 = character12.getData();
        java.lang.String str14 = character12.toString();
        boolean boolean15 = character12.isStartTag();
        java.lang.String str16 = character12.toString();
        java.lang.String str17 = character12.toString();
        boolean boolean18 = xmlTreeBuilder0.process((org.jsoup.parser.Token) character12);
        java.lang.String str19 = character12.getData();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "EOF" + "'", str2, "EOF");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "EOF" + "'", str13, "EOF");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "EOF" + "'", str14, "EOF");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "EOF" + "'", str16, "EOF");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "EOF" + "'", str17, "EOF");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "EOF" + "'", str19, "EOF");
    }

    @Test
    public void test4246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4246");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.tokenType();
        java.lang.StringBuilder stringBuilder2 = doctype0.publicIdentifier;
        java.lang.StringBuilder stringBuilder3 = doctype0.name;
        java.lang.StringBuilder stringBuilder4 = doctype0.publicIdentifier;
        java.lang.StringBuilder stringBuilder5 = doctype0.publicIdentifier;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Doctype" + "'", str1, "Doctype");
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "");
    }

    @Test
    public void test4247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4247");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        xmlTreeBuilder0.initialiseParse("</hi!>", "EOF", parseErrorList3);
        org.jsoup.parser.Token.StartTag startTag5 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag7 = startTag5.name("hi!");
        boolean boolean8 = xmlTreeBuilder0.process((org.jsoup.parser.Token) startTag5);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder9 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList12 = null;
        xmlTreeBuilder9.initialiseParse("Character", "hi!", parseErrorList12);
        org.jsoup.parser.Token.Comment comment14 = new org.jsoup.parser.Token.Comment();
        java.lang.StringBuilder stringBuilder15 = comment14.data;
        java.lang.String str16 = comment14.getData();
        xmlTreeBuilder9.insert(comment14);
        xmlTreeBuilder0.insert(comment14);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder19 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList22 = null;
        xmlTreeBuilder19.initialiseParse("Character", "hi!", parseErrorList22);
        org.jsoup.parser.ParseErrorList parseErrorList26 = null;
        xmlTreeBuilder19.initialiseParse("</hi!>", "Doctype", parseErrorList26);
        org.jsoup.parser.ParseErrorList parseErrorList30 = null;
        xmlTreeBuilder19.initialiseParse("", "<4>", parseErrorList30);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder32 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList35 = null;
        xmlTreeBuilder32.initialiseParse("</hi!>", "EOF", parseErrorList35);
        org.jsoup.parser.Token.StartTag startTag37 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag39 = startTag37.name("hi!");
        boolean boolean40 = xmlTreeBuilder32.process((org.jsoup.parser.Token) startTag37);
        org.jsoup.parser.Token.Comment comment41 = new org.jsoup.parser.Token.Comment();
        java.lang.StringBuilder stringBuilder42 = comment41.data;
        java.lang.String str43 = comment41.toString();
        xmlTreeBuilder32.insert(comment41);
        java.lang.String str45 = comment41.toString();
        java.lang.String str46 = comment41.getData();
        xmlTreeBuilder19.insert(comment41);
        org.jsoup.parser.Token.TokenType tokenType48 = comment41.type;
        xmlTreeBuilder0.insert(comment41);
        org.jsoup.parser.Token.StartTag startTag50 = new org.jsoup.parser.Token.StartTag();
        startTag50.appendTagName('a');
        boolean boolean53 = xmlTreeBuilder0.process((org.jsoup.parser.Token) startTag50);
        org.jsoup.parser.Token.StartTag startTag54 = new org.jsoup.parser.Token.StartTag();
        startTag54.appendTagName('4');
        java.lang.String str57 = startTag54.name();
        org.jsoup.nodes.Element element58 = xmlTreeBuilder0.insert(startTag54);
        boolean boolean59 = startTag54.isCharacter();
        org.junit.Assert.assertNotNull(tag7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(stringBuilder15);
        org.junit.Assert.assertEquals(stringBuilder15.toString(), "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(tag39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(stringBuilder42);
        org.junit.Assert.assertEquals(stringBuilder42.toString(), "");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "<!---->" + "'", str43, "<!---->");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "<!---->" + "'", str45, "<!---->");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertTrue("'" + tokenType48 + "' != '" + org.jsoup.parser.Token.TokenType.Comment + "'", tokenType48.equals(org.jsoup.parser.Token.TokenType.Comment));
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "4" + "'", str57, "4");
        org.junit.Assert.assertNotNull(element58);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
    }

    @Test
    public void test4248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4248");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        xmlTreeBuilder0.initialiseParse("</hi!>", "EOF", parseErrorList3);
        org.jsoup.parser.Token.StartTag startTag5 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag7 = startTag5.name("hi!");
        boolean boolean8 = xmlTreeBuilder0.process((org.jsoup.parser.Token) startTag5);
        org.jsoup.parser.Token.StartTag startTag9 = new org.jsoup.parser.Token.StartTag();
        startTag9.appendTagName('4');
        org.jsoup.nodes.Element element12 = xmlTreeBuilder0.insert(startTag9);
        org.jsoup.parser.ParseErrorList parseErrorList15 = null;
        xmlTreeBuilder0.initialiseParse("<4>", "</hi!>", parseErrorList15);
        org.jsoup.parser.Token.Character character18 = new org.jsoup.parser.Token.Character("<!---->");
        xmlTreeBuilder0.insert(character18);
        org.jsoup.parser.Token.Comment comment20 = new org.jsoup.parser.Token.Comment();
        java.lang.StringBuilder stringBuilder21 = comment20.data;
        java.lang.String str22 = comment20.getData();
        java.lang.StringBuilder stringBuilder23 = comment20.data;
        java.lang.String str24 = comment20.toString();
        java.lang.String str25 = comment20.tokenType();
        java.lang.StringBuilder stringBuilder26 = comment20.data;
        xmlTreeBuilder0.insert(comment20);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder28 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList31 = null;
        xmlTreeBuilder28.initialiseParse("</hi!>", "EOF", parseErrorList31);
        org.jsoup.parser.Token.StartTag startTag33 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag35 = startTag33.name("hi!");
        boolean boolean36 = xmlTreeBuilder28.process((org.jsoup.parser.Token) startTag33);
        org.jsoup.parser.Token.Comment comment37 = new org.jsoup.parser.Token.Comment();
        java.lang.StringBuilder stringBuilder38 = comment37.data;
        java.lang.String str39 = comment37.toString();
        xmlTreeBuilder28.insert(comment37);
        java.lang.String str41 = comment37.toString();
        java.lang.String str42 = comment37.toString();
        java.lang.String str43 = comment37.getData();
        xmlTreeBuilder0.insert(comment37);
        org.jsoup.nodes.Attributes attributes47 = null;
        org.jsoup.parser.Token.StartTag startTag48 = new org.jsoup.parser.Token.StartTag("", attributes47);
        startTag48.selfClosing = false;
        startTag48.appendTagName("</hi!>");
        startTag48.newAttribute();
        org.jsoup.nodes.Attributes attributes54 = startTag48.getAttributes();
        org.jsoup.parser.Token.StartTag startTag55 = new org.jsoup.parser.Token.StartTag("hi!", attributes54);
        startTag55.appendAttributeName('4');
        org.jsoup.nodes.Element element58 = xmlTreeBuilder0.insert(startTag55);
        org.junit.Assert.assertNotNull(tag7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(stringBuilder21);
        org.junit.Assert.assertEquals(stringBuilder21.toString(), "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(stringBuilder23);
        org.junit.Assert.assertEquals(stringBuilder23.toString(), "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "<!---->" + "'", str24, "<!---->");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Comment" + "'", str25, "Comment");
        org.junit.Assert.assertNotNull(stringBuilder26);
        org.junit.Assert.assertEquals(stringBuilder26.toString(), "");
        org.junit.Assert.assertNotNull(tag35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(stringBuilder38);
        org.junit.Assert.assertEquals(stringBuilder38.toString(), "");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "<!---->" + "'", str39, "<!---->");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "<!---->" + "'", str41, "<!---->");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "<!---->" + "'", str42, "<!---->");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertNotNull(attributes54);
        org.junit.Assert.assertNotNull(element58);
    }

    @Test
    public void test4249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4249");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        xmlTreeBuilder0.initialiseParse("Character", "hi!", parseErrorList3);
        org.jsoup.parser.Token.Comment comment5 = new org.jsoup.parser.Token.Comment();
        java.lang.StringBuilder stringBuilder6 = comment5.data;
        java.lang.String str7 = comment5.getData();
        xmlTreeBuilder0.insert(comment5);
        org.jsoup.parser.Token.Character character10 = new org.jsoup.parser.Token.Character("EOF");
        java.lang.String str11 = character10.getData();
        java.lang.String str12 = character10.toString();
        boolean boolean13 = character10.isStartTag();
        java.lang.String str14 = character10.getData();
        java.lang.String str15 = character10.toString();
        org.jsoup.parser.Token.Character character16 = character10.asCharacter();
        xmlTreeBuilder0.insert(character16);
        org.jsoup.parser.Token.StartTag startTag18 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag20 = startTag18.name("hi!");
        startTag18.finaliseTag();
        startTag18.finaliseTag();
        startTag18.appendTagName(' ');
        org.jsoup.nodes.Element element25 = xmlTreeBuilder0.insert(startTag18);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder26 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList29 = null;
        xmlTreeBuilder26.initialiseParse("Character", "hi!", parseErrorList29);
        org.jsoup.parser.ParseErrorList parseErrorList33 = null;
        xmlTreeBuilder26.initialiseParse("</hi!>", "Doctype", parseErrorList33);
        org.jsoup.parser.ParseErrorList parseErrorList37 = null;
        xmlTreeBuilder26.initialiseParse("", "<4>", parseErrorList37);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder39 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList42 = null;
        xmlTreeBuilder39.initialiseParse("</hi!>", "EOF", parseErrorList42);
        org.jsoup.parser.Token.StartTag startTag44 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag46 = startTag44.name("hi!");
        boolean boolean47 = xmlTreeBuilder39.process((org.jsoup.parser.Token) startTag44);
        org.jsoup.parser.Token.Comment comment48 = new org.jsoup.parser.Token.Comment();
        java.lang.StringBuilder stringBuilder49 = comment48.data;
        java.lang.String str50 = comment48.toString();
        xmlTreeBuilder39.insert(comment48);
        java.lang.String str52 = comment48.toString();
        java.lang.String str53 = comment48.getData();
        xmlTreeBuilder26.insert(comment48);
        java.lang.String str55 = comment48.getData();
        java.lang.String str56 = comment48.toString();
        xmlTreeBuilder0.insert(comment48);
        org.jsoup.parser.Token.EndTag endTag59 = new org.jsoup.parser.Token.EndTag("<!---->");
        boolean boolean60 = endTag59.selfClosing;
        boolean boolean61 = endTag59.isCharacter();
        java.lang.String str62 = endTag59.toString();
        boolean boolean63 = xmlTreeBuilder0.process((org.jsoup.parser.Token) endTag59);
        org.jsoup.parser.Token.Character character65 = new org.jsoup.parser.Token.Character("EOF");
        java.lang.String str66 = character65.toString();
        java.lang.String str67 = character65.toString();
        java.lang.String str68 = character65.toString();
        boolean boolean69 = character65.isEOF();
        boolean boolean70 = character65.isDoctype();
        xmlTreeBuilder0.insert(character65);
        org.jsoup.parser.Token.StartTag startTag74 = new org.jsoup.parser.Token.StartTag();
        startTag74.appendTagName('4');
        java.lang.String str77 = startTag74.name();
        org.jsoup.nodes.Attributes attributes78 = startTag74.attributes;
        org.jsoup.parser.Token.StartTag startTag79 = new org.jsoup.parser.Token.StartTag("hi!", attributes78);
        org.jsoup.parser.Token.StartTag startTag80 = new org.jsoup.parser.Token.StartTag("Comment", attributes78);
        org.jsoup.parser.Token.StartTag startTag81 = startTag80.asStartTag();
        startTag81.tagName = "Doctype";
        boolean boolean84 = startTag81.isEndTag();
        startTag81.newAttribute();
        org.jsoup.nodes.Element element86 = xmlTreeBuilder0.insert(startTag81);
        org.jsoup.parser.ParseErrorList parseErrorList89 = null;
        xmlTreeBuilder0.initialiseParse("<</Doctype>>", "</hi! >", parseErrorList89);
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "EOF" + "'", str11, "EOF");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "EOF" + "'", str12, "EOF");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "EOF" + "'", str14, "EOF");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "EOF" + "'", str15, "EOF");
        org.junit.Assert.assertNotNull(character16);
        org.junit.Assert.assertNotNull(tag20);
        org.junit.Assert.assertNotNull(element25);
        org.junit.Assert.assertNotNull(tag46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(stringBuilder49);
        org.junit.Assert.assertEquals(stringBuilder49.toString(), "");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "<!---->" + "'", str50, "<!---->");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "<!---->" + "'", str52, "<!---->");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "" + "'", str55, "");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "<!---->" + "'", str56, "<!---->");
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "</<!---->>" + "'", str62, "</<!---->>");
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "EOF" + "'", str66, "EOF");
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "EOF" + "'", str67, "EOF");
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "EOF" + "'", str68, "EOF");
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "4" + "'", str77, "4");
        org.junit.Assert.assertNotNull(attributes78);
        org.junit.Assert.assertNotNull(startTag81);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertNotNull(element86);
    }

    @Test
    public void test4250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4250");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.tokenType();
        org.jsoup.parser.Token.Doctype doctype2 = doctype0.asDoctype();
        java.lang.StringBuilder stringBuilder3 = doctype2.name;
        boolean boolean4 = doctype2.isForceQuirks();
        java.lang.String str5 = doctype2.getPublicIdentifier();
        java.lang.String str6 = doctype2.getSystemIdentifier();
        boolean boolean7 = doctype2.isStartTag();
        java.lang.StringBuilder stringBuilder8 = doctype2.publicIdentifier;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.EndTag endTag9 = doctype2.asEndTag();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$Doctype cannot be cast to class org.jsoup.parser.Token$EndTag (org.jsoup.parser.Token$Doctype and org.jsoup.parser.Token$EndTag are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Doctype" + "'", str1, "Doctype");
        org.junit.Assert.assertNotNull(doctype2);
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(stringBuilder8);
        org.junit.Assert.assertEquals(stringBuilder8.toString(), "");
    }

    @Test
    public void test4251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4251");
        org.jsoup.nodes.Attributes attributes1 = null;
        org.jsoup.parser.Token.StartTag startTag2 = new org.jsoup.parser.Token.StartTag("", attributes1);
        startTag2.selfClosing = false;
        startTag2.appendAttributeValue('a');
        boolean boolean7 = startTag2.isSelfClosing();
        startTag2.appendTagName('#');
        org.jsoup.nodes.Attributes attributes10 = startTag2.getAttributes();
        org.jsoup.nodes.Attributes attributes11 = startTag2.attributes;
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(attributes10);
        org.junit.Assert.assertNull(attributes11);
    }

    @Test
    public void test4252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4252");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        boolean boolean1 = doctype0.forceQuirks;
        java.lang.StringBuilder stringBuilder2 = doctype0.systemIdentifier;
        boolean boolean3 = doctype0.isEndTag();
        doctype0.forceQuirks = false;
        java.lang.StringBuilder stringBuilder6 = doctype0.systemIdentifier;
        java.lang.String str7 = doctype0.getName();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.EndTag endTag8 = doctype0.asEndTag();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$Doctype cannot be cast to class org.jsoup.parser.Token$EndTag (org.jsoup.parser.Token$Doctype and org.jsoup.parser.Token$EndTag are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test4253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4253");
        org.jsoup.nodes.Attributes attributes1 = null;
        org.jsoup.parser.Token.StartTag startTag2 = new org.jsoup.parser.Token.StartTag("", attributes1);
        boolean boolean3 = startTag2.isDoctype();
        java.lang.String str4 = startTag2.tagName;
        startTag2.selfClosing = false;
        org.jsoup.parser.Token.Tag tag8 = startTag2.name("</hi!>");
        java.lang.String str9 = tag8.name();
        tag8.selfClosing = false;
        org.jsoup.nodes.Attributes attributes12 = tag8.getAttributes();
        org.jsoup.parser.Token.StartTag startTag13 = tag8.asStartTag();
        boolean boolean14 = tag8.isSelfClosing();
        tag8.appendAttributeValue('#');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(tag8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "</hi!>" + "'", str9, "</hi!>");
        org.junit.Assert.assertNull(attributes12);
        org.junit.Assert.assertNotNull(startTag13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test4254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4254");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.tokenType();
        boolean boolean2 = doctype0.isForceQuirks();
        java.lang.String str3 = doctype0.getPublicIdentifier();
        java.lang.String str4 = doctype0.getSystemIdentifier();
        boolean boolean5 = doctype0.isForceQuirks();
        boolean boolean6 = doctype0.forceQuirks;
        boolean boolean7 = doctype0.isForceQuirks();
        java.lang.StringBuilder stringBuilder8 = doctype0.systemIdentifier;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Doctype" + "'", str1, "Doctype");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(stringBuilder8);
        org.junit.Assert.assertEquals(stringBuilder8.toString(), "");
    }

    @Test
    public void test4255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4255");
        org.jsoup.parser.Token.StartTag startTag1 = new org.jsoup.parser.Token.StartTag("Doctype");
        java.lang.String str2 = startTag1.name();
        org.jsoup.parser.Token.Tag tag4 = startTag1.name("hi!a");
        tag4.appendAttributeName("EOF");
        tag4.appendAttributeName("EndTag");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Doctype doctype9 = tag4.asDoctype();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$Doctype (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$Doctype are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Doctype" + "'", str2, "Doctype");
        org.junit.Assert.assertNotNull(tag4);
    }

    @Test
    public void test4256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4256");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.tokenType();
        boolean boolean2 = doctype0.isForceQuirks();
        java.lang.String str3 = doctype0.getPublicIdentifier();
        boolean boolean4 = doctype0.isForceQuirks();
        doctype0.forceQuirks = true;
        java.lang.StringBuilder stringBuilder7 = doctype0.systemIdentifier;
        boolean boolean8 = doctype0.forceQuirks;
        boolean boolean9 = doctype0.forceQuirks;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Doctype" + "'", str1, "Doctype");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(stringBuilder7);
        org.junit.Assert.assertEquals(stringBuilder7.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test4257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4257");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.tokenType();
        java.lang.StringBuilder stringBuilder2 = doctype0.systemIdentifier;
        doctype0.forceQuirks = false;
        java.lang.StringBuilder stringBuilder5 = doctype0.systemIdentifier;
        java.lang.StringBuilder stringBuilder6 = doctype0.name;
        java.lang.StringBuilder stringBuilder7 = doctype0.systemIdentifier;
        java.lang.String str8 = doctype0.getPublicIdentifier();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Doctype" + "'", str1, "Doctype");
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder7);
        org.junit.Assert.assertEquals(stringBuilder7.toString(), "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test4258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4258");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        xmlTreeBuilder0.initialiseParse("Character", "hi!", parseErrorList3);
        org.jsoup.parser.ParseErrorList parseErrorList7 = null;
        xmlTreeBuilder0.initialiseParse("</hi!>4", "StartTag", parseErrorList7);
        org.jsoup.parser.Token.Character character10 = new org.jsoup.parser.Token.Character("EOF");
        java.lang.String str11 = character10.getData();
        java.lang.String str12 = character10.toString();
        boolean boolean13 = character10.isStartTag();
        java.lang.String str14 = character10.toString();
        java.lang.String str15 = character10.toString();
        org.jsoup.parser.Token.TokenType tokenType16 = org.jsoup.parser.Token.TokenType.Comment;
        character10.type = tokenType16;
        java.lang.String str18 = character10.getData();
        boolean boolean19 = character10.isStartTag();
        xmlTreeBuilder0.insert(character10);
        org.jsoup.parser.ParseErrorList parseErrorList23 = null;
        xmlTreeBuilder0.initialiseParse("<Doctype>", "</Character>", parseErrorList23);
        org.jsoup.parser.Token.Doctype doctype25 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str26 = doctype25.tokenType();
        boolean boolean27 = doctype25.isForceQuirks();
        java.lang.String str28 = doctype25.getPublicIdentifier();
        java.lang.String str29 = doctype25.getSystemIdentifier();
        boolean boolean30 = doctype25.isForceQuirks();
        boolean boolean31 = doctype25.isStartTag();
        java.lang.String str32 = doctype25.tokenType();
        // The following exception was thrown during execution in test generation
        try {
            xmlTreeBuilder0.insert(doctype25);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "EOF" + "'", str11, "EOF");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "EOF" + "'", str12, "EOF");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "EOF" + "'", str14, "EOF");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "EOF" + "'", str15, "EOF");
        org.junit.Assert.assertTrue("'" + tokenType16 + "' != '" + org.jsoup.parser.Token.TokenType.Comment + "'", tokenType16.equals(org.jsoup.parser.Token.TokenType.Comment));
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "EOF" + "'", str18, "EOF");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Doctype" + "'", str26, "Doctype");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "Doctype" + "'", str32, "Doctype");
    }

    @Test
    public void test4259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4259");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        xmlTreeBuilder0.initialiseParse("Character", "hi!", parseErrorList3);
        org.jsoup.parser.Token.Comment comment5 = new org.jsoup.parser.Token.Comment();
        java.lang.StringBuilder stringBuilder6 = comment5.data;
        java.lang.String str7 = comment5.getData();
        xmlTreeBuilder0.insert(comment5);
        org.jsoup.parser.Token.StartTag startTag9 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag11 = startTag9.name("hi!");
        startTag9.appendAttributeName(' ');
        boolean boolean14 = startTag9.isComment();
        org.jsoup.nodes.Element element15 = xmlTreeBuilder0.insert(startTag9);
        org.jsoup.parser.ParseErrorList parseErrorList18 = null;
        xmlTreeBuilder0.initialiseParse("Character", "<Doctype>", parseErrorList18);
        org.jsoup.parser.ParseErrorList parseErrorList22 = null;
        xmlTreeBuilder0.initialiseParse("<hi!>", "</hi!>", parseErrorList22);
        org.jsoup.parser.Token.Comment comment24 = new org.jsoup.parser.Token.Comment();
        java.lang.StringBuilder stringBuilder25 = comment24.data;
        java.lang.String str26 = comment24.getData();
        java.lang.StringBuilder stringBuilder27 = comment24.data;
        java.lang.String str28 = comment24.toString();
        java.lang.String str29 = comment24.tokenType();
        xmlTreeBuilder0.insert(comment24);
        org.jsoup.parser.Token.Character character32 = new org.jsoup.parser.Token.Character("</hi!>");
        java.lang.String str33 = character32.toString();
        boolean boolean34 = xmlTreeBuilder0.process((org.jsoup.parser.Token) character32);
        org.jsoup.parser.ParseErrorList parseErrorList37 = null;
        xmlTreeBuilder0.initialiseParse("EOF", "<!---->", parseErrorList37);
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(tag11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(stringBuilder25);
        org.junit.Assert.assertEquals(stringBuilder25.toString(), "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(stringBuilder27);
        org.junit.Assert.assertEquals(stringBuilder27.toString(), "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "<!---->" + "'", str28, "<!---->");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Comment" + "'", str29, "Comment");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "</hi!>" + "'", str33, "</hi!>");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
    }
}

