package org.jsoup.parser;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest6 {

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
    public void test3001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3001");
        org.jsoup.parser.Token.Character character1 = new org.jsoup.parser.Token.Character("Comment");
        java.lang.String str2 = character1.getData();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Comment" + "'", str2, "Comment");
    }

    @Test
    public void test3002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3002");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("hi!");
        java.lang.String str2 = endTag1.toString();
        java.lang.String str3 = endTag1.toString();
        boolean boolean4 = endTag1.isDoctype();
        java.lang.String str5 = endTag1.tagName;
        endTag1.appendAttributeName("<!---->");
        org.jsoup.parser.Token.EndTag endTag8 = endTag1.asEndTag();
        java.lang.String str9 = endTag1.tokenType();
        org.jsoup.nodes.Attributes attributes10 = endTag1.getAttributes();
        boolean boolean11 = endTag1.selfClosing;
        endTag1.appendAttributeName('4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "</hi!>" + "'", str2, "</hi!>");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "</hi!>" + "'", str3, "</hi!>");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(endTag8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "EndTag" + "'", str9, "EndTag");
        org.junit.Assert.assertNull(attributes10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test3003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3003");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.tokenType();
        boolean boolean2 = doctype0.isForceQuirks();
        java.lang.String str3 = doctype0.getPublicIdentifier();
        java.lang.String str4 = doctype0.getSystemIdentifier();
        java.lang.String str5 = doctype0.tokenType();
        org.jsoup.parser.Token.EndTag endTag7 = new org.jsoup.parser.Token.EndTag("hi!");
        boolean boolean8 = endTag7.selfClosing;
        org.jsoup.parser.Token.Tag tag10 = endTag7.name("");
        boolean boolean11 = endTag7.isEndTag();
        org.jsoup.parser.Token.Tag tag13 = endTag7.name("<4>");
        org.jsoup.parser.Token.TokenType tokenType14 = tag13.type;
        doctype0.type = tokenType14;
        boolean boolean16 = doctype0.forceQuirks;
        doctype0.forceQuirks = true;
        java.lang.StringBuilder stringBuilder19 = doctype0.systemIdentifier;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Doctype" + "'", str1, "Doctype");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Doctype" + "'", str5, "Doctype");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(tag10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(tag13);
        org.junit.Assert.assertTrue("'" + tokenType14 + "' != '" + org.jsoup.parser.Token.TokenType.EndTag + "'", tokenType14.equals(org.jsoup.parser.Token.TokenType.EndTag));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(stringBuilder19);
        org.junit.Assert.assertEquals(stringBuilder19.toString(), "");
    }

    @Test
    public void test3004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3004");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("hi!");
        boolean boolean2 = endTag1.selfClosing;
        endTag1.finaliseTag();
        java.lang.String str4 = endTag1.toString();
        java.lang.String str5 = endTag1.tokenType();
        endTag1.appendTagName('4');
        endTag1.appendAttributeName('4');
        org.jsoup.parser.Token.TokenType tokenType10 = endTag1.type;
        endTag1.appendAttributeValue('4');
        endTag1.appendAttributeValue('a');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "</hi!>" + "'", str4, "</hi!>");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "EndTag" + "'", str5, "EndTag");
        org.junit.Assert.assertTrue("'" + tokenType10 + "' != '" + org.jsoup.parser.Token.TokenType.EndTag + "'", tokenType10.equals(org.jsoup.parser.Token.TokenType.EndTag));
    }

    @Test
    public void test3005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3005");
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
        org.jsoup.parser.Token.EndTag endTag25 = new org.jsoup.parser.Token.EndTag("<4</hi!>4>");
        endTag25.finaliseTag();
        boolean boolean27 = xmlTreeBuilder0.process((org.jsoup.parser.Token) endTag25);
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(tag11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertTrue("'" + tokenType21 + "' != '" + org.jsoup.parser.Token.TokenType.EOF + "'", tokenType21.equals(org.jsoup.parser.Token.TokenType.EOF));
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "EOF" + "'", str22, "EOF");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
    }

    @Test
    public void test3006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3006");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        java.lang.StringBuilder stringBuilder1 = comment0.data;
        java.lang.String str2 = comment0.getData();
        java.lang.StringBuilder stringBuilder3 = comment0.data;
        java.lang.String str4 = comment0.toString();
        java.lang.String str5 = comment0.getData();
        java.lang.String str6 = comment0.toString();
        org.junit.Assert.assertNotNull(stringBuilder1);
        org.junit.Assert.assertEquals(stringBuilder1.toString(), "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<!---->" + "'", str4, "<!---->");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!---->" + "'", str6, "<!---->");
    }

    @Test
    public void test3007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3007");
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
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder31 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList34 = null;
        xmlTreeBuilder31.initialiseParse("Character", "hi!", parseErrorList34);
        org.jsoup.parser.Token.Comment comment36 = new org.jsoup.parser.Token.Comment();
        java.lang.StringBuilder stringBuilder37 = comment36.data;
        java.lang.String str38 = comment36.getData();
        xmlTreeBuilder31.insert(comment36);
        org.jsoup.parser.Token.StartTag startTag40 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag42 = startTag40.name("hi!");
        startTag40.appendAttributeName(' ');
        boolean boolean45 = startTag40.isComment();
        org.jsoup.nodes.Element element46 = xmlTreeBuilder31.insert(startTag40);
        org.jsoup.parser.Token.StartTag startTag48 = new org.jsoup.parser.Token.StartTag("Doctype");
        java.lang.String str49 = startTag48.name();
        boolean boolean50 = xmlTreeBuilder31.process((org.jsoup.parser.Token) startTag48);
        org.jsoup.parser.Token.Comment comment51 = new org.jsoup.parser.Token.Comment();
        java.lang.StringBuilder stringBuilder52 = comment51.data;
        java.lang.String str53 = comment51.getData();
        java.lang.StringBuilder stringBuilder54 = comment51.data;
        xmlTreeBuilder31.insert(comment51);
        xmlTreeBuilder0.insert(comment51);
        java.lang.String str57 = comment51.toString();
        java.lang.String str58 = comment51.getData();
        boolean boolean59 = comment51.isComment();
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
        org.junit.Assert.assertNotNull(stringBuilder37);
        org.junit.Assert.assertEquals(stringBuilder37.toString(), "");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertNotNull(tag42);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(element46);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "Doctype" + "'", str49, "Doctype");
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNotNull(stringBuilder52);
        org.junit.Assert.assertEquals(stringBuilder52.toString(), "");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
        org.junit.Assert.assertNotNull(stringBuilder54);
        org.junit.Assert.assertEquals(stringBuilder54.toString(), "");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "<!---->" + "'", str57, "<!---->");
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "" + "'", str58, "");
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
    }

    @Test
    public void test3008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3008");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.appendAttributeName('a');
        java.lang.String str3 = startTag0.tagName;
        org.jsoup.parser.Token.StartTag startTag4 = startTag0.asStartTag();
        startTag0.appendTagName('a');
        startTag0.tagName = "";
        startTag0.tagName = "</Character>";
        startTag0.selfClosing = false;
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(startTag4);
    }

    @Test
    public void test3009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3009");
        org.jsoup.nodes.Attributes attributes1 = null;
        org.jsoup.parser.Token.StartTag startTag2 = new org.jsoup.parser.Token.StartTag("", attributes1);
        boolean boolean3 = startTag2.isDoctype();
        java.lang.String str4 = startTag2.tagName;
        startTag2.newAttribute();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = startTag2.name();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must be false");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test3010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3010");
        org.jsoup.parser.Token.Character character1 = new org.jsoup.parser.Token.Character("StartTag");
        java.lang.String str2 = character1.getData();
        java.lang.String str3 = character1.toString();
        java.lang.String str4 = character1.tokenType();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "StartTag" + "'", str2, "StartTag");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "StartTag" + "'", str3, "StartTag");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Character" + "'", str4, "Character");
    }

    @Test
    public void test3011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3011");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.parser.Token.StartTag startTag3 = new org.jsoup.parser.Token.StartTag("", attributes2);
        startTag3.selfClosing = false;
        startTag3.newAttribute();
        org.jsoup.parser.Token.StartTag startTag8 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag10 = startTag8.name("hi!");
        org.jsoup.nodes.Attributes attributes11 = tag10.attributes;
        org.jsoup.parser.Token.StartTag startTag12 = new org.jsoup.parser.Token.StartTag("", attributes11);
        startTag3.attributes = attributes11;
        org.jsoup.parser.Token.StartTag startTag14 = new org.jsoup.parser.Token.StartTag("<Doctype>", attributes11);
        startTag14.tagName = "EOF";
        startTag14.appendAttributeValue('#');
        boolean boolean19 = startTag14.isEndTag();
        org.junit.Assert.assertNotNull(tag10);
        org.junit.Assert.assertNotNull(attributes11);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test3012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3012");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag2 = startTag0.name("hi!");
        startTag0.appendAttributeName(' ');
        startTag0.appendAttributeName("hi!");
        boolean boolean7 = startTag0.isSelfClosing();
        boolean boolean8 = startTag0.isComment();
        startTag0.appendAttributeValue('#');
        startTag0.newAttribute();
        org.junit.Assert.assertNotNull(tag2);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test3013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3013");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.Token.EOF eOF1 = new org.jsoup.parser.Token.EOF();
        java.lang.String str2 = eOF1.tokenType();
        boolean boolean3 = xmlTreeBuilder0.process((org.jsoup.parser.Token) eOF1);
        org.jsoup.parser.ParseErrorList parseErrorList6 = null;
        xmlTreeBuilder0.initialiseParse("", "EndTag", parseErrorList6);
        org.jsoup.parser.Token.Character character9 = new org.jsoup.parser.Token.Character("</hi!>");
        java.lang.String str10 = character9.getData();
        java.lang.String str11 = character9.toString();
        xmlTreeBuilder0.insert(character9);
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
        org.jsoup.parser.ParseErrorList parseErrorList26 = null;
        xmlTreeBuilder0.initialiseParse("< >", "<!---->", parseErrorList26);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder28 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList31 = null;
        xmlTreeBuilder28.initialiseParse("</hi!>", "EOF", parseErrorList31);
        org.jsoup.parser.Token.StartTag startTag33 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag35 = startTag33.name("hi!");
        boolean boolean36 = xmlTreeBuilder28.process((org.jsoup.parser.Token) startTag33);
        org.jsoup.parser.Token.StartTag startTag37 = new org.jsoup.parser.Token.StartTag();
        startTag37.appendTagName('4');
        org.jsoup.nodes.Element element40 = xmlTreeBuilder28.insert(startTag37);
        startTag37.newAttribute();
        org.jsoup.parser.Token.StartTag startTag43 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag45 = startTag43.name("hi!");
        org.jsoup.nodes.Attributes attributes46 = tag45.attributes;
        org.jsoup.parser.Token.StartTag startTag47 = new org.jsoup.parser.Token.StartTag("", attributes46);
        startTag37.attributes = attributes46;
        startTag37.appendAttributeName(' ');
        org.jsoup.nodes.Element element51 = xmlTreeBuilder0.insert(startTag37);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "EOF" + "'", str2, "EOF");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "</hi!>" + "'", str10, "</hi!>");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "</hi!>" + "'", str11, "</hi!>");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "EOF" + "'", str15, "EOF");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "EOF" + "'", str16, "EOF");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "EOF" + "'", str18, "EOF");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "EOF" + "'", str19, "EOF");
        org.junit.Assert.assertNotNull(character20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "EOF" + "'", str21, "EOF");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "EOF" + "'", str22, "EOF");
        org.junit.Assert.assertNotNull(tag35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(element40);
        org.junit.Assert.assertNotNull(tag45);
        org.junit.Assert.assertNotNull(attributes46);
        org.junit.Assert.assertNotNull(element51);
    }

    @Test
    public void test3014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3014");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("hi!");
        java.lang.String str2 = endTag1.toString();
        endTag1.appendTagName('#');
        endTag1.appendAttributeValue('#');
        boolean boolean7 = endTag1.isSelfClosing();
        boolean boolean8 = endTag1.isDoctype();
        org.jsoup.nodes.Attributes attributes9 = endTag1.getAttributes();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "</hi!>" + "'", str2, "</hi!>");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(attributes9);
    }

    @Test
    public void test3015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3015");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        boolean boolean1 = doctype0.forceQuirks;
        java.lang.StringBuilder stringBuilder2 = doctype0.systemIdentifier;
        boolean boolean3 = doctype0.forceQuirks;
        boolean boolean4 = doctype0.isForceQuirks();
        java.lang.StringBuilder stringBuilder5 = doctype0.publicIdentifier;
        java.lang.String str6 = doctype0.getSystemIdentifier();
        org.jsoup.parser.Token.TokenType tokenType7 = doctype0.type;
        doctype0.forceQuirks = false;
        boolean boolean10 = doctype0.isForceQuirks();
        java.lang.String str11 = doctype0.getName();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + tokenType7 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType7.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test3016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3016");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag2 = startTag0.name("hi!");
        tag2.finaliseTag();
        tag2.newAttribute();
        org.jsoup.nodes.Attributes attributes5 = tag2.attributes;
        tag2.appendAttributeValue("");
        boolean boolean8 = tag2.isComment();
        java.lang.String str9 = tag2.tagName;
        org.junit.Assert.assertNotNull(tag2);
        org.junit.Assert.assertNotNull(attributes5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test3017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3017");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("hi!");
        java.lang.String str2 = endTag1.toString();
        java.lang.String str3 = endTag1.toString();
        boolean boolean4 = endTag1.isDoctype();
        endTag1.appendAttributeValue('a');
        endTag1.selfClosing = true;
        endTag1.appendAttributeValue('#');
        endTag1.newAttribute();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "</hi!>" + "'", str2, "</hi!>");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "</hi!>" + "'", str3, "</hi!>");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test3018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3018");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag2 = startTag0.name("hi!");
        org.jsoup.nodes.Attributes attributes3 = tag2.attributes;
        boolean boolean4 = tag2.isEndTag();
        org.jsoup.nodes.Attributes attributes5 = tag2.getAttributes();
        org.jsoup.parser.Token.Tag tag7 = tag2.name("hi!a");
        boolean boolean8 = tag2.isDoctype();
        tag2.selfClosing = false;
        org.junit.Assert.assertNotNull(tag2);
        org.junit.Assert.assertNotNull(attributes3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(attributes5);
        org.junit.Assert.assertNotNull(tag7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test3019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3019");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.appendAttributeName('a');
        startTag0.newAttribute();
        boolean boolean4 = startTag0.isDoctype();
        startTag0.finaliseTag();
        org.jsoup.parser.Token.Doctype doctype6 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str7 = doctype6.tokenType();
        boolean boolean8 = doctype6.isForceQuirks();
        java.lang.String str9 = doctype6.getPublicIdentifier();
        boolean boolean10 = doctype6.isForceQuirks();
        java.lang.String str11 = doctype6.getName();
        java.lang.String str12 = doctype6.getSystemIdentifier();
        org.jsoup.parser.Token.EndTag endTag14 = new org.jsoup.parser.Token.EndTag("hi!");
        boolean boolean15 = endTag14.selfClosing;
        endTag14.finaliseTag();
        org.jsoup.parser.Token.TokenType tokenType17 = endTag14.type;
        org.jsoup.nodes.Attributes attributes18 = endTag14.getAttributes();
        java.lang.String str19 = endTag14.toString();
        endTag14.appendAttributeName("<4>");
        org.jsoup.parser.Token.TokenType tokenType22 = endTag14.type;
        doctype6.type = tokenType22;
        startTag0.type = tokenType22;
        boolean boolean25 = startTag0.isComment();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Doctype" + "'", str7, "Doctype");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + tokenType17 + "' != '" + org.jsoup.parser.Token.TokenType.EndTag + "'", tokenType17.equals(org.jsoup.parser.Token.TokenType.EndTag));
        org.junit.Assert.assertNull(attributes18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "</hi!>" + "'", str19, "</hi!>");
        org.junit.Assert.assertTrue("'" + tokenType22 + "' != '" + org.jsoup.parser.Token.TokenType.EndTag + "'", tokenType22.equals(org.jsoup.parser.Token.TokenType.EndTag));
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test3020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3020");
        org.jsoup.parser.Token.StartTag startTag1 = new org.jsoup.parser.Token.StartTag("</hi!>");
        org.jsoup.parser.Token.Tag tag3 = startTag1.name("hi!");
        boolean boolean4 = tag3.selfClosing;
        org.junit.Assert.assertNotNull(tag3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test3021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3021");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.appendTagName('a');
        startTag0.newAttribute();
        org.jsoup.parser.Token.StartTag startTag4 = startTag0.asStartTag();
        java.lang.String str5 = startTag4.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Doctype doctype6 = startTag4.asDoctype();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$Doctype (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$Doctype are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(startTag4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<a>" + "'", str5, "<a>");
    }

    @Test
    public void test3022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3022");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("hi!");
        java.lang.String str2 = endTag1.toString();
        java.lang.String str3 = endTag1.toString();
        boolean boolean4 = endTag1.isDoctype();
        java.lang.String str5 = endTag1.tagName;
        org.jsoup.nodes.Attributes attributes6 = endTag1.getAttributes();
        org.jsoup.parser.Token.EndTag endTag7 = endTag1.asEndTag();
        java.lang.String str8 = endTag7.name();
        org.jsoup.parser.Token.Tag tag10 = endTag7.name("EndTag");
        tag10.appendAttributeName('a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "</hi!>" + "'", str2, "</hi!>");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "</hi!>" + "'", str3, "</hi!>");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNull(attributes6);
        org.junit.Assert.assertNotNull(endTag7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(tag10);
    }

    @Test
    public void test3023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3023");
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
        org.jsoup.nodes.Attributes attributes22 = endTag1.getAttributes();
        endTag1.appendAttributeValue('4');
        org.jsoup.nodes.Attributes attributes26 = null;
        org.jsoup.parser.Token.StartTag startTag27 = new org.jsoup.parser.Token.StartTag("", attributes26);
        startTag27.selfClosing = false;
        startTag27.newAttribute();
        startTag27.finaliseTag();
        org.jsoup.parser.Token.EndTag endTag33 = new org.jsoup.parser.Token.EndTag("hi!");
        boolean boolean34 = endTag33.selfClosing;
        org.jsoup.parser.Token.Tag tag36 = endTag33.name("");
        boolean boolean37 = endTag33.isEndTag();
        org.jsoup.parser.Token.Tag tag39 = endTag33.name("<4>");
        org.jsoup.parser.Token.TokenType tokenType40 = tag39.type;
        startTag27.type = tokenType40;
        startTag27.appendAttributeName("EOF");
        startTag27.appendTagName('a');
        org.jsoup.nodes.Attributes attributes46 = startTag27.attributes;
        endTag1.attributes = attributes46;
        org.junit.Assert.assertNotNull(tag10);
        org.junit.Assert.assertNotNull(attributes13);
        org.junit.Assert.assertNotNull(attributes22);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(tag36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(tag39);
        org.junit.Assert.assertTrue("'" + tokenType40 + "' != '" + org.jsoup.parser.Token.TokenType.EndTag + "'", tokenType40.equals(org.jsoup.parser.Token.TokenType.EndTag));
        org.junit.Assert.assertNotNull(attributes46);
    }

    @Test
    public void test3024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3024");
        org.jsoup.parser.Token.StartTag startTag5 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag7 = startTag5.name("hi!");
        org.jsoup.nodes.Attributes attributes8 = tag7.attributes;
        org.jsoup.parser.Token.StartTag startTag9 = new org.jsoup.parser.Token.StartTag("</hi!>", attributes8);
        org.jsoup.parser.Token.StartTag startTag10 = new org.jsoup.parser.Token.StartTag("", attributes8);
        org.jsoup.parser.Token.StartTag startTag11 = new org.jsoup.parser.Token.StartTag("<hi!>", attributes8);
        java.lang.String str12 = startTag11.name();
        org.jsoup.parser.Token.StartTag startTag13 = startTag11.asStartTag();
        java.lang.String str14 = startTag11.name();
        org.jsoup.nodes.Attributes attributes15 = startTag11.getAttributes();
        org.jsoup.nodes.Attributes attributes16 = startTag11.getAttributes();
        org.jsoup.parser.Token.StartTag startTag17 = new org.jsoup.parser.Token.StartTag("hi!<4>", attributes16);
        org.jsoup.parser.Token.StartTag startTag18 = new org.jsoup.parser.Token.StartTag("<</<4>Doctype>>", attributes16);
        org.junit.Assert.assertNotNull(tag7);
        org.junit.Assert.assertNotNull(attributes8);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "<hi!>" + "'", str12, "<hi!>");
        org.junit.Assert.assertNotNull(startTag13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "<hi!>" + "'", str14, "<hi!>");
        org.junit.Assert.assertNotNull(attributes15);
        org.junit.Assert.assertNotNull(attributes16);
    }

    @Test
    public void test3025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3025");
        org.jsoup.parser.Token.StartTag startTag1 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag3 = startTag1.name("hi!");
        startTag1.finaliseTag();
        startTag1.appendAttributeValue("</hi!>");
        org.jsoup.nodes.Attributes attributes7 = startTag1.attributes;
        org.jsoup.parser.Token.StartTag startTag8 = new org.jsoup.parser.Token.StartTag("<hi!a>", attributes7);
        java.lang.Class<?> wildcardClass9 = startTag8.getClass();
        org.junit.Assert.assertNotNull(tag3);
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test3026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3026");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag2 = startTag0.name("hi!");
        startTag0.finaliseTag();
        startTag0.appendAttributeValue("</hi!>");
        boolean boolean6 = startTag0.isDoctype();
        java.lang.String str7 = startTag0.toString();
        org.jsoup.parser.Token.Tag tag9 = startTag0.name("#");
        org.junit.Assert.assertNotNull(tag2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<hi!>" + "'", str7, "<hi!>");
        org.junit.Assert.assertNotNull(tag9);
    }

    @Test
    public void test3027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3027");
        org.jsoup.nodes.Attributes attributes1 = null;
        org.jsoup.parser.Token.StartTag startTag2 = new org.jsoup.parser.Token.StartTag("</<4>Doctype>", attributes1);
    }

    @Test
    public void test3028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3028");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        java.lang.StringBuilder stringBuilder1 = comment0.data;
        java.lang.String str2 = comment0.getData();
        java.lang.StringBuilder stringBuilder3 = comment0.data;
        java.lang.String str4 = comment0.toString();
        java.lang.StringBuilder stringBuilder5 = comment0.data;
        java.lang.String str6 = comment0.toString();
        java.lang.String str7 = comment0.getData();
        java.lang.StringBuilder stringBuilder8 = comment0.data;
        org.junit.Assert.assertNotNull(stringBuilder1);
        org.junit.Assert.assertEquals(stringBuilder1.toString(), "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<!---->" + "'", str4, "<!---->");
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!---->" + "'", str6, "<!---->");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(stringBuilder8);
        org.junit.Assert.assertEquals(stringBuilder8.toString(), "");
    }

    @Test
    public void test3029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3029");
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
        boolean boolean25 = comment20.isStartTag();
        java.lang.String str26 = comment20.getData();
        java.lang.StringBuilder stringBuilder27 = comment20.data;
        java.lang.String str28 = comment20.toString();
        java.lang.String str29 = comment20.getData();
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
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(stringBuilder27);
        org.junit.Assert.assertEquals(stringBuilder27.toString(), "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "<!---->" + "'", str28, "<!---->");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
    }

    @Test
    public void test3030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3030");
        org.jsoup.parser.Token.StartTag startTag1 = new org.jsoup.parser.Token.StartTag("</hi!>");
        startTag1.newAttribute();
        startTag1.appendAttributeValue("</<!---->>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.EndTag endTag5 = startTag1.asEndTag();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$EndTag (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$EndTag are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3031");
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
        xmlTreeBuilder0.initialiseParse("hi!", "</hi!>4", parseErrorList31);
        org.jsoup.parser.Token.StartTag startTag33 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag35 = startTag33.name("hi!");
        startTag33.appendAttributeName(' ');
        startTag33.appendAttributeValue('#');
        startTag33.newAttribute();
        startTag33.appendAttributeName('a');
        org.jsoup.parser.Token.Tag tag44 = startTag33.name("</hi!>4");
        boolean boolean45 = xmlTreeBuilder0.process((org.jsoup.parser.Token) startTag33);
        startTag33.newAttribute();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Doctype doctype47 = startTag33.asDoctype();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$Doctype (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$Doctype are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertNotNull(tag35);
        org.junit.Assert.assertNotNull(tag44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
    }

    @Test
    public void test3032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3032");
        org.jsoup.parser.Token.StartTag startTag1 = new org.jsoup.parser.Token.StartTag("<Doctype>");
        startTag1.appendAttributeName('4');
        java.lang.String str4 = startTag1.name();
        org.jsoup.nodes.Attributes attributes5 = startTag1.getAttributes();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<Doctype>" + "'", str4, "<Doctype>");
        org.junit.Assert.assertNotNull(attributes5);
    }

    @Test
    public void test3033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3033");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("hi!");
        java.lang.String str2 = endTag1.toString();
        java.lang.String str3 = endTag1.toString();
        boolean boolean4 = endTag1.isDoctype();
        java.lang.String str5 = endTag1.tagName;
        org.jsoup.parser.Token.StartTag startTag7 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag9 = startTag7.name("hi!");
        org.jsoup.nodes.Attributes attributes10 = tag9.attributes;
        org.jsoup.parser.Token.StartTag startTag11 = new org.jsoup.parser.Token.StartTag("</hi!>", attributes10);
        endTag1.attributes = attributes10;
        endTag1.appendAttributeValue("StartTag");
        boolean boolean15 = endTag1.selfClosing;
        endTag1.appendTagName("<4>");
        org.jsoup.parser.Token.Tag tag19 = endTag1.name("<hi!a>");
        tag19.appendAttributeValue('#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "</hi!>" + "'", str2, "</hi!>");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "</hi!>" + "'", str3, "</hi!>");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(tag9);
        org.junit.Assert.assertNotNull(attributes10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(tag19);
    }

    @Test
    public void test3034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3034");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        boolean boolean1 = doctype0.forceQuirks;
        java.lang.StringBuilder stringBuilder2 = doctype0.systemIdentifier;
        boolean boolean3 = doctype0.isCharacter();
        doctype0.forceQuirks = false;
        java.lang.StringBuilder stringBuilder6 = doctype0.publicIdentifier;
        boolean boolean7 = doctype0.isForceQuirks();
        java.lang.StringBuilder stringBuilder8 = doctype0.systemIdentifier;
        java.lang.StringBuilder stringBuilder9 = doctype0.name;
        java.lang.StringBuilder stringBuilder10 = doctype0.name;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(stringBuilder8);
        org.junit.Assert.assertEquals(stringBuilder8.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder9);
        org.junit.Assert.assertEquals(stringBuilder9.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder10);
        org.junit.Assert.assertEquals(stringBuilder10.toString(), "");
    }

    @Test
    public void test3035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3035");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("hi!");
        boolean boolean2 = endTag1.selfClosing;
        java.lang.String str3 = endTag1.toString();
        java.lang.String str4 = endTag1.toString();
        endTag1.appendAttributeValue("<4>");
        endTag1.appendAttributeValue("Character");
        org.jsoup.parser.Token.Tag tag10 = endTag1.name("Comment");
        tag10.appendAttributeName("<EndTag>");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "</hi!>" + "'", str3, "</hi!>");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "</hi!>" + "'", str4, "</hi!>");
        org.junit.Assert.assertNotNull(tag10);
    }

    @Test
    public void test3036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3036");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        xmlTreeBuilder0.initialiseParse("</hi!>", "EOF", parseErrorList3);
        org.jsoup.parser.Token.StartTag startTag5 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag7 = startTag5.name("hi!");
        boolean boolean8 = xmlTreeBuilder0.process((org.jsoup.parser.Token) startTag5);
        org.jsoup.parser.Token.StartTag startTag9 = new org.jsoup.parser.Token.StartTag();
        startTag9.appendTagName('4');
        org.jsoup.nodes.Element element12 = xmlTreeBuilder0.insert(startTag9);
        boolean boolean13 = startTag9.selfClosing;
        boolean boolean14 = startTag9.isDoctype();
        startTag9.appendTagName("<<</hi! >>>");
        org.junit.Assert.assertNotNull(tag7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test3037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3037");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("hi!");
        java.lang.String str2 = endTag1.toString();
        java.lang.String str3 = endTag1.toString();
        boolean boolean4 = endTag1.isDoctype();
        endTag1.appendAttributeName("EOF");
        org.jsoup.nodes.Attributes attributes7 = endTag1.attributes;
        boolean boolean8 = endTag1.isComment();
        endTag1.appendAttributeName('a');
        endTag1.finaliseTag();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "</hi!>" + "'", str2, "</hi!>");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "</hi!>" + "'", str3, "</hi!>");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(attributes7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test3038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3038");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.tokenType();
        doctype0.forceQuirks = true;
        java.lang.String str4 = doctype0.getPublicIdentifier();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Comment comment5 = doctype0.asComment();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$Doctype cannot be cast to class org.jsoup.parser.Token$Comment (org.jsoup.parser.Token$Doctype and org.jsoup.parser.Token$Comment are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Doctype" + "'", str1, "Doctype");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test3039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3039");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        boolean boolean1 = doctype0.forceQuirks;
        java.lang.StringBuilder stringBuilder2 = doctype0.systemIdentifier;
        boolean boolean3 = doctype0.isCharacter();
        boolean boolean4 = doctype0.isComment();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test3040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3040");
        org.jsoup.nodes.Attributes attributes1 = null;
        org.jsoup.parser.Token.StartTag startTag2 = new org.jsoup.parser.Token.StartTag("", attributes1);
        startTag2.selfClosing = false;
        startTag2.newAttribute();
        org.jsoup.parser.Token.Tag tag7 = startTag2.name("</hi!>");
        tag7.appendAttributeValue("");
        org.junit.Assert.assertNotNull(tag7);
    }

    @Test
    public void test3041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3041");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("hi!");
        boolean boolean2 = endTag1.selfClosing;
        endTag1.finaliseTag();
        java.lang.String str4 = endTag1.toString();
        java.lang.String str5 = endTag1.tokenType();
        org.jsoup.nodes.Attributes attributes6 = endTag1.attributes;
        boolean boolean7 = endTag1.isSelfClosing();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "</hi!>" + "'", str4, "</hi!>");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "EndTag" + "'", str5, "EndTag");
        org.junit.Assert.assertNull(attributes6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test3042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3042");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.tokenType();
        boolean boolean2 = doctype0.isForceQuirks();
        java.lang.String str3 = doctype0.getPublicIdentifier();
        boolean boolean4 = doctype0.isForceQuirks();
        doctype0.forceQuirks = true;
        boolean boolean7 = doctype0.forceQuirks;
        boolean boolean8 = doctype0.forceQuirks;
        java.lang.String str9 = doctype0.getSystemIdentifier();
        java.lang.String str10 = doctype0.getPublicIdentifier();
        java.lang.StringBuilder stringBuilder11 = doctype0.publicIdentifier;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Doctype" + "'", str1, "Doctype");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(stringBuilder11);
        org.junit.Assert.assertEquals(stringBuilder11.toString(), "");
    }

    @Test
    public void test3043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3043");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.tokenType();
        doctype0.forceQuirks = true;
        java.lang.StringBuilder stringBuilder4 = doctype0.name;
        java.lang.String str5 = doctype0.getPublicIdentifier();
        boolean boolean6 = doctype0.isForceQuirks();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Doctype" + "'", str1, "Doctype");
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test3044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3044");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.tokenType();
        java.lang.String str2 = doctype0.getSystemIdentifier();
        java.lang.String str3 = doctype0.tokenType();
        boolean boolean4 = doctype0.forceQuirks;
        java.lang.String str5 = doctype0.getName();
        boolean boolean6 = doctype0.isComment();
        boolean boolean7 = doctype0.isForceQuirks();
        java.lang.String str8 = doctype0.getName();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Doctype" + "'", str1, "Doctype");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Doctype" + "'", str3, "Doctype");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test3045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3045");
        org.jsoup.parser.Token.Character character1 = new org.jsoup.parser.Token.Character("Character");
        java.lang.String str2 = character1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Character" + "'", str2, "Character");
    }

    @Test
    public void test3046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3046");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.appendAttributeName('a');
        startTag0.appendAttributeName("");
        startTag0.finaliseTag();
        org.jsoup.nodes.Attributes attributes6 = startTag0.attributes;
        org.junit.Assert.assertNotNull(attributes6);
    }

    @Test
    public void test3047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3047");
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
        startTag9.appendAttributeName('#');
        startTag9.tagName = "";
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(tag11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(element15);
    }

    @Test
    public void test3048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3048");
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
        org.jsoup.parser.Token.Character character25 = new org.jsoup.parser.Token.Character("EOF");
        java.lang.String str26 = character25.getData();
        java.lang.String str27 = character25.toString();
        boolean boolean28 = character25.isStartTag();
        java.lang.String str29 = character25.getData();
        xmlTreeBuilder0.insert(character25);
        org.jsoup.parser.Token.EndTag endTag32 = new org.jsoup.parser.Token.EndTag("hi!");
        boolean boolean33 = endTag32.selfClosing;
        endTag32.finaliseTag();
        org.jsoup.parser.Token.TokenType tokenType35 = endTag32.type;
        org.jsoup.nodes.Attributes attributes36 = endTag32.getAttributes();
        java.lang.String str37 = endTag32.toString();
        endTag32.appendAttributeName("<4>");
        org.jsoup.parser.Token.TokenType tokenType40 = endTag32.type;
        character25.type = tokenType40;
        boolean boolean42 = character25.isStartTag();
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(tag11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "EOF" + "'", str26, "EOF");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "EOF" + "'", str27, "EOF");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "EOF" + "'", str29, "EOF");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + tokenType35 + "' != '" + org.jsoup.parser.Token.TokenType.EndTag + "'", tokenType35.equals(org.jsoup.parser.Token.TokenType.EndTag));
        org.junit.Assert.assertNull(attributes36);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "</hi!>" + "'", str37, "</hi!>");
        org.junit.Assert.assertTrue("'" + tokenType40 + "' != '" + org.jsoup.parser.Token.TokenType.EndTag + "'", tokenType40.equals(org.jsoup.parser.Token.TokenType.EndTag));
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
    }

    @Test
    public void test3049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3049");
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
        startTag2.appendAttributeName("<</hi!>>");
        boolean boolean20 = startTag2.isStartTag();
        boolean boolean21 = startTag2.selfClosing;
        java.lang.String str22 = startTag2.tagName;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + tokenType5 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType5.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(tag12);
        org.junit.Assert.assertNotNull(attributes13);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + " " + "'", str22, " ");
    }

    @Test
    public void test3050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3050");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        boolean boolean1 = doctype0.forceQuirks;
        java.lang.StringBuilder stringBuilder2 = doctype0.systemIdentifier;
        boolean boolean3 = doctype0.forceQuirks;
        boolean boolean4 = doctype0.isStartTag();
        java.lang.StringBuilder stringBuilder5 = doctype0.systemIdentifier;
        java.lang.String str6 = doctype0.getSystemIdentifier();
        java.lang.StringBuilder stringBuilder7 = doctype0.name;
        java.lang.String str8 = doctype0.getPublicIdentifier();
        java.lang.String str9 = doctype0.getPublicIdentifier();
        java.lang.StringBuilder stringBuilder10 = doctype0.publicIdentifier;
        java.lang.StringBuilder stringBuilder11 = doctype0.systemIdentifier;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Comment comment12 = doctype0.asComment();
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
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(stringBuilder7);
        org.junit.Assert.assertEquals(stringBuilder7.toString(), "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(stringBuilder10);
        org.junit.Assert.assertEquals(stringBuilder10.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder11);
        org.junit.Assert.assertEquals(stringBuilder11.toString(), "");
    }

    @Test
    public void test3051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3051");
        org.jsoup.nodes.Attributes attributes1 = null;
        org.jsoup.parser.Token.StartTag startTag2 = new org.jsoup.parser.Token.StartTag("", attributes1);
        boolean boolean3 = startTag2.isDoctype();
        java.lang.String str4 = startTag2.tagName;
        startTag2.selfClosing = false;
        org.jsoup.parser.Token.Tag tag8 = startTag2.name("</hi!>");
        startTag2.appendAttributeName("Doctype");
        startTag2.appendAttributeName("StartTag");
        java.lang.String str13 = startTag2.toString();
        boolean boolean14 = startTag2.selfClosing;
        boolean boolean15 = startTag2.isDoctype();
        boolean boolean16 = startTag2.isDoctype();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(tag8);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "<</hi!>>" + "'", str13, "<</hi!>>");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test3052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3052");
        org.jsoup.parser.Token.EndTag endTag2 = new org.jsoup.parser.Token.EndTag("hi!");
        boolean boolean3 = endTag2.selfClosing;
        endTag2.finaliseTag();
        java.lang.String str5 = endTag2.toString();
        java.lang.String str6 = endTag2.tokenType();
        org.jsoup.nodes.Attributes attributes7 = endTag2.attributes;
        org.jsoup.parser.Token.StartTag startTag8 = new org.jsoup.parser.Token.StartTag();
        startTag8.appendAttributeName('a');
        startTag8.newAttribute();
        boolean boolean12 = startTag8.selfClosing;
        org.jsoup.nodes.Attributes attributes13 = startTag8.getAttributes();
        endTag2.attributes = attributes13;
        org.jsoup.parser.Token.StartTag startTag15 = new org.jsoup.parser.Token.StartTag("</<4>Doctype>", attributes13);
        startTag15.appendTagName("<hi!>");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "</hi!>" + "'", str5, "</hi!>");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "EndTag" + "'", str6, "EndTag");
        org.junit.Assert.assertNull(attributes7);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(attributes13);
    }

    @Test
    public void test3053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3053");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag2 = startTag0.name("hi!");
        org.jsoup.parser.Token.Tag tag4 = startTag0.name("<<hi!>>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.EndTag endTag5 = tag4.asEndTag();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$EndTag (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$EndTag are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tag2);
        org.junit.Assert.assertNotNull(tag4);
    }

    @Test
    public void test3054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3054");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        xmlTreeBuilder0.initialiseParse("</hi!>", "EOF", parseErrorList3);
        org.jsoup.parser.ParseErrorList parseErrorList7 = null;
        xmlTreeBuilder0.initialiseParse("hi!a", "</hi!>", parseErrorList7);
        org.jsoup.parser.Token.StartTag startTag9 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag11 = startTag9.name("hi!");
        startTag9.finaliseTag();
        org.jsoup.nodes.Element element13 = xmlTreeBuilder0.insert(startTag9);
        org.jsoup.nodes.Attributes attributes14 = startTag9.attributes;
        org.junit.Assert.assertNotNull(tag11);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(attributes14);
    }

    @Test
    public void test3055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3055");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.tokenType();
        java.lang.StringBuilder stringBuilder2 = doctype0.systemIdentifier;
        doctype0.forceQuirks = true;
        doctype0.forceQuirks = false;
        java.lang.String str7 = doctype0.getPublicIdentifier();
        boolean boolean8 = doctype0.isForceQuirks();
        java.lang.String str9 = doctype0.getSystemIdentifier();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Doctype" + "'", str1, "Doctype");
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test3056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3056");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        boolean boolean1 = doctype0.forceQuirks;
        java.lang.StringBuilder stringBuilder2 = doctype0.systemIdentifier;
        boolean boolean3 = doctype0.isEndTag();
        doctype0.forceQuirks = false;
        boolean boolean6 = doctype0.forceQuirks;
        java.lang.StringBuilder stringBuilder7 = doctype0.publicIdentifier;
        java.lang.StringBuilder stringBuilder8 = doctype0.systemIdentifier;
        boolean boolean9 = doctype0.isForceQuirks();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(stringBuilder7);
        org.junit.Assert.assertEquals(stringBuilder7.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder8);
        org.junit.Assert.assertEquals(stringBuilder8.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test3057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3057");
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
        xmlTreeBuilder0.initialiseParse("", "</<4>>", parseErrorList52);
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
    }

    @Test
    public void test3058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3058");
        org.jsoup.parser.Token.StartTag startTag1 = new org.jsoup.parser.Token.StartTag("Doctype");
        java.lang.String str2 = startTag1.name();
        org.jsoup.parser.Token.Tag tag4 = startTag1.name("hi!a");
        startTag1.selfClosing = true;
        java.lang.String str7 = startTag1.toString();
        startTag1.appendTagName('4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Doctype" + "'", str2, "Doctype");
        org.junit.Assert.assertNotNull(tag4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<hi!a>" + "'", str7, "<hi!a>");
    }

    @Test
    public void test3059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3059");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        xmlTreeBuilder0.initialiseParse("</hi!>", "EOF", parseErrorList3);
        org.jsoup.parser.ParseErrorList parseErrorList7 = null;
        xmlTreeBuilder0.initialiseParse("hi!a", "</hi!>", parseErrorList7);
        org.jsoup.parser.Token.StartTag startTag9 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag11 = startTag9.name("hi!");
        startTag9.finaliseTag();
        org.jsoup.nodes.Element element13 = xmlTreeBuilder0.insert(startTag9);
        org.jsoup.parser.Token.StartTag startTag15 = new org.jsoup.parser.Token.StartTag("hi!");
        org.jsoup.parser.Token.TokenType tokenType16 = startTag15.type;
        org.jsoup.nodes.Element element17 = xmlTreeBuilder0.insert(startTag15);
        org.jsoup.nodes.Attributes attributes18 = startTag15.getAttributes();
        org.junit.Assert.assertNotNull(tag11);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertTrue("'" + tokenType16 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType16.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(attributes18);
    }

    @Test
    public void test3060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3060");
        org.jsoup.parser.Token.Character character1 = new org.jsoup.parser.Token.Character("<Doctype>");
        java.lang.String str2 = character1.getData();
        java.lang.String str3 = character1.getData();
        java.lang.String str4 = character1.toString();
        java.lang.String str5 = character1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "<Doctype>" + "'", str2, "<Doctype>");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<Doctype>" + "'", str3, "<Doctype>");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<Doctype>" + "'", str4, "<Doctype>");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<Doctype>" + "'", str5, "<Doctype>");
    }

    @Test
    public void test3061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3061");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag2 = startTag0.name("hi!");
        startTag0.appendAttributeName(' ');
        startTag0.appendAttributeValue('#');
        startTag0.newAttribute();
        startTag0.finaliseTag();
        org.jsoup.parser.Token.StartTag startTag9 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag11 = startTag9.name("hi!");
        boolean boolean12 = tag11.isComment();
        org.jsoup.parser.Token.TokenType tokenType13 = tag11.type;
        startTag0.type = tokenType13;
        java.lang.String str15 = startTag0.name();
        startTag0.finaliseTag();
        startTag0.appendTagName("<4>");
        org.junit.Assert.assertNotNull(tag2);
        org.junit.Assert.assertNotNull(tag11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + tokenType13 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType13.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test3062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3062");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.parser.Token.StartTag startTag3 = new org.jsoup.parser.Token.StartTag("", attributes2);
        boolean boolean4 = startTag3.isDoctype();
        java.lang.String str5 = startTag3.tagName;
        org.jsoup.parser.Token.TokenType tokenType6 = startTag3.type;
        startTag3.appendTagName(' ');
        boolean boolean9 = startTag3.isDoctype();
        org.jsoup.parser.Token.StartTag startTag11 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag13 = startTag11.name("hi!");
        org.jsoup.nodes.Attributes attributes14 = tag13.attributes;
        org.jsoup.parser.Token.StartTag startTag15 = new org.jsoup.parser.Token.StartTag("", attributes14);
        startTag3.attributes = attributes14;
        org.jsoup.nodes.Attributes attributes18 = null;
        org.jsoup.parser.Token.StartTag startTag19 = new org.jsoup.parser.Token.StartTag("", attributes18);
        org.jsoup.parser.Token.StartTag startTag20 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag22 = startTag20.name("hi!");
        org.jsoup.nodes.Attributes attributes23 = tag22.attributes;
        startTag19.attributes = attributes23;
        startTag3.attributes = attributes23;
        org.jsoup.parser.Token.StartTag startTag26 = new org.jsoup.parser.Token.StartTag("<hi!>", attributes23);
        org.jsoup.parser.Token.Tag tag28 = startTag26.name("hi!#");
        org.jsoup.parser.Token.Tag tag30 = tag28.name("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + tokenType6 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType6.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(tag13);
        org.junit.Assert.assertNotNull(attributes14);
        org.junit.Assert.assertNotNull(tag22);
        org.junit.Assert.assertNotNull(attributes23);
        org.junit.Assert.assertNotNull(tag28);
        org.junit.Assert.assertNotNull(tag30);
    }

    @Test
    public void test3063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3063");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("hi!");
        java.lang.String str2 = endTag1.toString();
        java.lang.String str3 = endTag1.toString();
        boolean boolean4 = endTag1.isDoctype();
        endTag1.appendAttributeName("EOF");
        boolean boolean7 = endTag1.isCharacter();
        boolean boolean8 = endTag1.isComment();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Character character9 = endTag1.asCharacter();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$EndTag cannot be cast to class org.jsoup.parser.Token$Character (org.jsoup.parser.Token$EndTag and org.jsoup.parser.Token$Character are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "</hi!>" + "'", str2, "</hi!>");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "</hi!>" + "'", str3, "</hi!>");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test3064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3064");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.tokenType();
        boolean boolean2 = doctype0.isForceQuirks();
        java.lang.String str3 = doctype0.getPublicIdentifier();
        boolean boolean4 = doctype0.isForceQuirks();
        java.lang.String str5 = doctype0.getName();
        java.lang.String str6 = doctype0.getSystemIdentifier();
        org.jsoup.parser.Token.EndTag endTag8 = new org.jsoup.parser.Token.EndTag("hi!");
        boolean boolean9 = endTag8.selfClosing;
        endTag8.finaliseTag();
        org.jsoup.parser.Token.TokenType tokenType11 = endTag8.type;
        org.jsoup.nodes.Attributes attributes12 = endTag8.getAttributes();
        java.lang.String str13 = endTag8.toString();
        endTag8.appendAttributeName("<4>");
        org.jsoup.parser.Token.TokenType tokenType16 = endTag8.type;
        doctype0.type = tokenType16;
        java.lang.String str18 = doctype0.getSystemIdentifier();
        java.lang.String str19 = doctype0.getName();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Doctype" + "'", str1, "Doctype");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + tokenType11 + "' != '" + org.jsoup.parser.Token.TokenType.EndTag + "'", tokenType11.equals(org.jsoup.parser.Token.TokenType.EndTag));
        org.junit.Assert.assertNull(attributes12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "</hi!>" + "'", str13, "</hi!>");
        org.junit.Assert.assertTrue("'" + tokenType16 + "' != '" + org.jsoup.parser.Token.TokenType.EndTag + "'", tokenType16.equals(org.jsoup.parser.Token.TokenType.EndTag));
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test3065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3065");
        org.jsoup.parser.Token.Character character1 = new org.jsoup.parser.Token.Character("EOF");
        java.lang.String str2 = character1.getData();
        java.lang.String str3 = character1.toString();
        boolean boolean4 = character1.isStartTag();
        java.lang.String str5 = character1.toString();
        java.lang.String str6 = character1.toString();
        boolean boolean7 = character1.isCharacter();
        org.jsoup.parser.Token.Character character8 = character1.asCharacter();
        boolean boolean9 = character1.isCharacter();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "EOF" + "'", str2, "EOF");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "EOF" + "'", str3, "EOF");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "EOF" + "'", str5, "EOF");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "EOF" + "'", str6, "EOF");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(character8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test3066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3066");
        org.jsoup.parser.Token.StartTag startTag1 = new org.jsoup.parser.Token.StartTag("hi!");
        startTag1.appendTagName('a');
        java.lang.String str4 = startTag1.tagName;
        java.lang.String str5 = startTag1.toString();
        startTag1.appendTagName('a');
        boolean boolean8 = startTag1.isStartTag();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!a" + "'", str4, "hi!a");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<hi!a>" + "'", str5, "<hi!a>");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test3067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3067");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.appendTagName('4');
        java.lang.String str3 = startTag0.name();
        org.jsoup.nodes.Attributes attributes4 = startTag0.attributes;
        startTag0.tagName = "<hi!  =\"#\">";
        startTag0.finaliseTag();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4" + "'", str3, "4");
        org.junit.Assert.assertNotNull(attributes4);
    }

    @Test
    public void test3068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3068");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.tokenType();
        org.jsoup.parser.Token.Doctype doctype2 = doctype0.asDoctype();
        java.lang.StringBuilder stringBuilder3 = doctype2.name;
        boolean boolean4 = doctype2.isForceQuirks();
        java.lang.String str5 = doctype2.getPublicIdentifier();
        org.jsoup.parser.Token.TokenType tokenType6 = doctype2.type;
        org.jsoup.parser.Token.TokenType tokenType7 = org.jsoup.parser.Token.TokenType.EOF;
        doctype2.type = tokenType7;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Doctype" + "'", str1, "Doctype");
        org.junit.Assert.assertNotNull(doctype2);
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + tokenType6 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType6.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertTrue("'" + tokenType7 + "' != '" + org.jsoup.parser.Token.TokenType.EOF + "'", tokenType7.equals(org.jsoup.parser.Token.TokenType.EOF));
    }

    @Test
    public void test3069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3069");
        org.jsoup.nodes.Attributes attributes1 = null;
        org.jsoup.parser.Token.StartTag startTag2 = new org.jsoup.parser.Token.StartTag("", attributes1);
        boolean boolean3 = startTag2.isDoctype();
        java.lang.String str4 = startTag2.tagName;
        startTag2.selfClosing = false;
        org.jsoup.parser.Token.Tag tag8 = startTag2.name("</hi!>");
        java.lang.String str9 = tag8.name();
        tag8.selfClosing = false;
        org.jsoup.nodes.Attributes attributes12 = tag8.getAttributes();
        java.lang.String str13 = tag8.name();
        org.jsoup.parser.Token.StartTag startTag14 = tag8.asStartTag();
        org.jsoup.parser.Token.TokenType tokenType15 = startTag14.type;
        startTag14.appendAttributeName('a');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(tag8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "</hi!>" + "'", str9, "</hi!>");
        org.junit.Assert.assertNull(attributes12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "</hi!>" + "'", str13, "</hi!>");
        org.junit.Assert.assertNotNull(startTag14);
        org.junit.Assert.assertTrue("'" + tokenType15 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType15.equals(org.jsoup.parser.Token.TokenType.StartTag));
    }

    @Test
    public void test3070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3070");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.appendAttributeName('a');
        java.lang.String str3 = startTag0.tagName;
        startTag0.finaliseTag();
        startTag0.selfClosing = false;
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test3071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3071");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.parser.Token.StartTag startTag3 = new org.jsoup.parser.Token.StartTag("", attributes2);
        startTag3.selfClosing = false;
        startTag3.appendTagName("</hi!>");
        startTag3.newAttribute();
        org.jsoup.nodes.Attributes attributes9 = startTag3.getAttributes();
        org.jsoup.parser.Token.StartTag startTag10 = new org.jsoup.parser.Token.StartTag("hi!", attributes9);
        startTag10.selfClosing = false;
        startTag10.appendAttributeValue("EndTag");
        startTag10.appendAttributeName('#');
        boolean boolean17 = startTag10.isComment();
        java.lang.String str18 = startTag10.toString();
        boolean boolean19 = startTag10.isStartTag();
        org.junit.Assert.assertNotNull(attributes9);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "<hi!>" + "'", str18, "<hi!>");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test3072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3072");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("hi!");
        java.lang.String str2 = endTag1.toString();
        java.lang.String str3 = endTag1.toString();
        boolean boolean4 = endTag1.isDoctype();
        java.lang.String str5 = endTag1.toString();
        endTag1.appendTagName("");
        org.jsoup.parser.Token.Tag tag9 = endTag1.name("</hi!>4");
        java.lang.String str10 = endTag1.tagName;
        boolean boolean11 = endTag1.isStartTag();
        java.lang.String str12 = endTag1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "</hi!>" + "'", str2, "</hi!>");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "</hi!>" + "'", str3, "</hi!>");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "</hi!>" + "'", str5, "</hi!>");
        org.junit.Assert.assertNotNull(tag9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "</hi!>4" + "'", str10, "</hi!>4");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "</</hi!>4>" + "'", str12, "</</hi!>4>");
    }

    @Test
    public void test3073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3073");
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
        boolean boolean13 = endTag1.isEOF();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "</hi!>" + "'", str3, "</hi!>");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "</hi!>" + "'", str4, "</hi!>");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "</hi!>" + "'", str7, "</hi!>");
        org.junit.Assert.assertTrue("'" + tokenType8 + "' != '" + org.jsoup.parser.Token.TokenType.EndTag + "'", tokenType8.equals(org.jsoup.parser.Token.TokenType.EndTag));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "</hi!>" + "'", str10, "</hi!>");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test3074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3074");
        org.jsoup.parser.Token.StartTag startTag1 = new org.jsoup.parser.Token.StartTag("<!---->");
        org.jsoup.nodes.Attributes attributes3 = null;
        org.jsoup.parser.Token.StartTag startTag4 = new org.jsoup.parser.Token.StartTag("", attributes3);
        startTag4.selfClosing = false;
        startTag4.appendTagName("</hi!>");
        startTag4.newAttribute();
        org.jsoup.nodes.Attributes attributes10 = startTag4.getAttributes();
        startTag1.attributes = attributes10;
        boolean boolean12 = startTag1.isEOF();
        org.junit.Assert.assertNotNull(attributes10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test3075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3075");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag2 = startTag0.name("hi!");
        startTag0.appendAttributeValue("<</hi!>>");
        boolean boolean5 = startTag0.isSelfClosing();
        org.jsoup.parser.Token.Tag tag7 = startTag0.name("</<!---->>");
        startTag0.finaliseTag();
        boolean boolean9 = startTag0.selfClosing;
        boolean boolean10 = startTag0.isSelfClosing();
        org.junit.Assert.assertNotNull(tag2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(tag7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test3076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3076");
        org.jsoup.parser.Token.StartTag startTag3 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag5 = startTag3.name("hi!");
        org.jsoup.nodes.Attributes attributes6 = tag5.attributes;
        org.jsoup.parser.Token.StartTag startTag7 = new org.jsoup.parser.Token.StartTag("</hi!>", attributes6);
        org.jsoup.parser.Token.StartTag startTag8 = new org.jsoup.parser.Token.StartTag("", attributes6);
        org.jsoup.parser.Token.StartTag startTag9 = new org.jsoup.parser.Token.StartTag("hi!", attributes6);
        org.jsoup.parser.Token.TokenType tokenType10 = startTag9.type;
        org.jsoup.parser.Token.TokenType tokenType11 = startTag9.type;
        startTag9.newAttribute();
        startTag9.newAttribute();
        org.junit.Assert.assertNotNull(tag5);
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertTrue("'" + tokenType10 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType10.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertTrue("'" + tokenType11 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType11.equals(org.jsoup.parser.Token.TokenType.StartTag));
    }

    @Test
    public void test3077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3077");
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
        java.lang.String str62 = comment54.toString();
        java.lang.String str63 = comment54.toString();
        java.lang.String str64 = comment54.getData();
        java.lang.String str65 = comment54.getData();
        java.lang.String str66 = comment54.toString();
        java.lang.Class<?> wildcardClass67 = comment54.getClass();
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
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "<!---->" + "'", str62, "<!---->");
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "<!---->" + "'", str63, "<!---->");
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "" + "'", str64, "");
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "" + "'", str65, "");
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "<!---->" + "'", str66, "<!---->");
        org.junit.Assert.assertNotNull(wildcardClass67);
    }

    @Test
    public void test3078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3078");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("<<</hi!>>  a=\"\">");
    }

    @Test
    public void test3079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3079");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.tokenType();
        boolean boolean2 = doctype0.isForceQuirks();
        java.lang.String str3 = doctype0.getPublicIdentifier();
        boolean boolean4 = doctype0.isForceQuirks();
        doctype0.forceQuirks = true;
        org.jsoup.parser.Token.Doctype doctype7 = doctype0.asDoctype();
        java.lang.String str8 = doctype0.getPublicIdentifier();
        java.lang.StringBuilder stringBuilder9 = doctype0.systemIdentifier;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Doctype" + "'", str1, "Doctype");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(doctype7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(stringBuilder9);
        org.junit.Assert.assertEquals(stringBuilder9.toString(), "");
    }

    @Test
    public void test3080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3080");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("hi!");
        java.lang.String str2 = endTag1.toString();
        java.lang.String str3 = endTag1.toString();
        boolean boolean4 = endTag1.isDoctype();
        java.lang.String str5 = endTag1.tagName;
        endTag1.selfClosing = false;
        endTag1.newAttribute();
        boolean boolean9 = endTag1.isStartTag();
        endTag1.tagName = "hi!a";
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "</hi!>" + "'", str2, "</hi!>");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "</hi!>" + "'", str3, "</hi!>");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test3081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3081");
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
        org.jsoup.parser.Token.StartTag startTag21 = new org.jsoup.parser.Token.StartTag("</hi!>");
        org.jsoup.nodes.Element element22 = xmlTreeBuilder0.insert(startTag21);
        org.jsoup.parser.Token.Comment comment23 = new org.jsoup.parser.Token.Comment();
        java.lang.StringBuilder stringBuilder24 = comment23.data;
        java.lang.StringBuilder stringBuilder25 = comment23.data;
        xmlTreeBuilder0.insert(comment23);
        org.jsoup.nodes.Attributes attributes30 = null;
        org.jsoup.parser.Token.StartTag startTag31 = new org.jsoup.parser.Token.StartTag("", attributes30);
        org.jsoup.parser.Token.StartTag startTag32 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag34 = startTag32.name("hi!");
        org.jsoup.nodes.Attributes attributes35 = tag34.attributes;
        startTag31.attributes = attributes35;
        org.jsoup.parser.Token.StartTag startTag37 = new org.jsoup.parser.Token.StartTag("Doctype", attributes35);
        org.jsoup.parser.Token.StartTag startTag38 = new org.jsoup.parser.Token.StartTag("", attributes35);
        startTag38.appendAttributeValue("</hi!>");
        java.lang.String str41 = startTag38.tagName;
        startTag38.tagName = "</<4>Doctype>";
        org.jsoup.nodes.Element element44 = xmlTreeBuilder0.insert(startTag38);
        org.jsoup.nodes.Attributes attributes46 = null;
        org.jsoup.parser.Token.StartTag startTag47 = new org.jsoup.parser.Token.StartTag("", attributes46);
        startTag47.selfClosing = false;
        startTag47.appendTagName("</hi!>");
        startTag47.newAttribute();
        startTag47.appendTagName('4');
        java.lang.String str55 = startTag47.name();
        org.jsoup.nodes.Element element56 = xmlTreeBuilder0.insert(startTag47);
        boolean boolean57 = startTag47.isCharacter();
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(tag11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertNotNull(stringBuilder24);
        org.junit.Assert.assertEquals(stringBuilder24.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder25);
        org.junit.Assert.assertEquals(stringBuilder25.toString(), "");
        org.junit.Assert.assertNotNull(tag34);
        org.junit.Assert.assertNotNull(attributes35);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertNotNull(element44);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "</hi!>4" + "'", str55, "</hi!>4");
        org.junit.Assert.assertNotNull(element56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
    }

    @Test
    public void test3082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3082");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.parser.Token.StartTag startTag3 = new org.jsoup.parser.Token.StartTag("", attributes2);
        startTag3.selfClosing = false;
        startTag3.appendTagName("</hi!>");
        startTag3.newAttribute();
        org.jsoup.nodes.Attributes attributes9 = startTag3.getAttributes();
        org.jsoup.parser.Token.StartTag startTag10 = new org.jsoup.parser.Token.StartTag("hi!", attributes9);
        boolean boolean11 = startTag10.isComment();
        startTag10.appendTagName(' ');
        startTag10.selfClosing = true;
        org.junit.Assert.assertNotNull(attributes9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test3083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3083");
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
        boolean boolean19 = comment14.isEndTag();
        java.lang.String str20 = comment14.getData();
        org.junit.Assert.assertNotNull(tag7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(stringBuilder15);
        org.junit.Assert.assertEquals(stringBuilder15.toString(), "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test3084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3084");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        boolean boolean1 = doctype0.forceQuirks;
        java.lang.String str2 = doctype0.getName();
        boolean boolean3 = doctype0.isEndTag();
        boolean boolean4 = doctype0.isForceQuirks();
        org.jsoup.parser.Token.Doctype doctype5 = doctype0.asDoctype();
        java.lang.StringBuilder stringBuilder6 = doctype0.publicIdentifier;
        doctype0.forceQuirks = true;
        boolean boolean9 = doctype0.forceQuirks;
        doctype0.forceQuirks = true;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(doctype5);
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test3085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3085");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.tokenType();
        java.lang.StringBuilder stringBuilder2 = doctype0.systemIdentifier;
        doctype0.forceQuirks = true;
        doctype0.forceQuirks = false;
        java.lang.String str7 = doctype0.getPublicIdentifier();
        boolean boolean8 = doctype0.forceQuirks;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Doctype" + "'", str1, "Doctype");
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test3086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3086");
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
        tag8.appendAttributeValue('a');
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
    public void test3087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3087");
        org.jsoup.nodes.Attributes attributes1 = null;
        org.jsoup.parser.Token.StartTag startTag2 = new org.jsoup.parser.Token.StartTag("", attributes1);
        startTag2.selfClosing = false;
        startTag2.newAttribute();
        startTag2.finaliseTag();
        startTag2.newAttribute();
        startTag2.appendAttributeValue("<EndTag>");
        boolean boolean10 = startTag2.isSelfClosing();
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test3088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3088");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("hi!");
        boolean boolean2 = endTag1.selfClosing;
        endTag1.finaliseTag();
        java.lang.String str4 = endTag1.toString();
        java.lang.String str5 = endTag1.tokenType();
        endTag1.tagName = "";
        org.jsoup.nodes.Attributes attributes8 = endTag1.getAttributes();
        boolean boolean9 = endTag1.isEndTag();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = endTag1.name();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must be false");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "</hi!>" + "'", str4, "</hi!>");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "EndTag" + "'", str5, "EndTag");
        org.junit.Assert.assertNull(attributes8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test3089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3089");
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
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder31 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList34 = null;
        xmlTreeBuilder31.initialiseParse("Character", "hi!", parseErrorList34);
        org.jsoup.parser.Token.Comment comment36 = new org.jsoup.parser.Token.Comment();
        java.lang.StringBuilder stringBuilder37 = comment36.data;
        java.lang.String str38 = comment36.getData();
        xmlTreeBuilder31.insert(comment36);
        org.jsoup.parser.Token.StartTag startTag40 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag42 = startTag40.name("hi!");
        startTag40.appendAttributeName(' ');
        boolean boolean45 = startTag40.isComment();
        org.jsoup.nodes.Element element46 = xmlTreeBuilder31.insert(startTag40);
        org.jsoup.parser.ParseErrorList parseErrorList49 = null;
        xmlTreeBuilder31.initialiseParse("", "StartTag", parseErrorList49);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder51 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList54 = null;
        xmlTreeBuilder51.initialiseParse("</hi!>", "EOF", parseErrorList54);
        org.jsoup.parser.Token.StartTag startTag56 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag58 = startTag56.name("hi!");
        boolean boolean59 = xmlTreeBuilder51.process((org.jsoup.parser.Token) startTag56);
        org.jsoup.parser.Token.Comment comment60 = new org.jsoup.parser.Token.Comment();
        java.lang.StringBuilder stringBuilder61 = comment60.data;
        java.lang.String str62 = comment60.toString();
        xmlTreeBuilder51.insert(comment60);
        java.lang.String str64 = comment60.toString();
        java.lang.String str65 = comment60.getData();
        org.jsoup.parser.Token.Comment comment66 = comment60.asComment();
        xmlTreeBuilder31.insert(comment66);
        xmlTreeBuilder0.insert(comment66);
        java.lang.Class<?> wildcardClass69 = comment66.getClass();
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
        org.junit.Assert.assertNotNull(stringBuilder37);
        org.junit.Assert.assertEquals(stringBuilder37.toString(), "");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertNotNull(tag42);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(element46);
        org.junit.Assert.assertNotNull(tag58);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertNotNull(stringBuilder61);
        org.junit.Assert.assertEquals(stringBuilder61.toString(), "");
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "<!---->" + "'", str62, "<!---->");
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "<!---->" + "'", str64, "<!---->");
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "" + "'", str65, "");
        org.junit.Assert.assertNotNull(comment66);
        org.junit.Assert.assertNotNull(wildcardClass69);
    }

    @Test
    public void test3090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3090");
        org.jsoup.parser.Token.Character character1 = new org.jsoup.parser.Token.Character("EOF");
        java.lang.String str2 = character1.getData();
        boolean boolean3 = character1.isComment();
        java.lang.String str4 = character1.toString();
        java.lang.String str5 = character1.getData();
        java.lang.String str6 = character1.getData();
        java.lang.String str7 = character1.getData();
        java.lang.String str8 = character1.getData();
        boolean boolean9 = character1.isDoctype();
        java.lang.String str10 = character1.getData();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "EOF" + "'", str2, "EOF");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "EOF" + "'", str4, "EOF");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "EOF" + "'", str5, "EOF");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "EOF" + "'", str6, "EOF");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "EOF" + "'", str7, "EOF");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "EOF" + "'", str8, "EOF");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "EOF" + "'", str10, "EOF");
    }

    @Test
    public void test3091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3091");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("hi!");
        boolean boolean2 = endTag1.selfClosing;
        endTag1.finaliseTag();
        endTag1.appendAttributeName(' ');
        boolean boolean6 = endTag1.isStartTag();
        endTag1.appendAttributeName('a');
        endTag1.newAttribute();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test3092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3092");
        org.jsoup.parser.Token.StartTag startTag1 = new org.jsoup.parser.Token.StartTag("</hi!>");
        java.lang.String str2 = startTag1.toString();
        org.jsoup.parser.Token.TokenType tokenType3 = startTag1.type;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Doctype doctype4 = startTag1.asDoctype();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$Doctype (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$Doctype are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "<</hi!>>" + "'", str2, "<</hi!>>");
        org.junit.Assert.assertTrue("'" + tokenType3 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType3.equals(org.jsoup.parser.Token.TokenType.StartTag));
    }

    @Test
    public void test3093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3093");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("hi!");
        boolean boolean2 = endTag1.selfClosing;
        endTag1.finaliseTag();
        endTag1.appendAttributeName(' ');
        endTag1.tagName = "Doctype";
        endTag1.appendTagName('4');
        boolean boolean10 = endTag1.isStartTag();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test3094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3094");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        boolean boolean1 = doctype0.forceQuirks;
        java.lang.String str2 = doctype0.getName();
        boolean boolean3 = doctype0.isEndTag();
        java.lang.String str4 = doctype0.getName();
        java.lang.StringBuilder stringBuilder5 = doctype0.name;
        java.lang.StringBuilder stringBuilder6 = doctype0.name;
        boolean boolean7 = doctype0.forceQuirks;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test3095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3095");
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
        org.jsoup.parser.Token.Comment comment17 = new org.jsoup.parser.Token.Comment();
        java.lang.StringBuilder stringBuilder18 = comment17.data;
        xmlTreeBuilder0.insert(comment17);
        org.jsoup.parser.Token.Comment comment20 = new org.jsoup.parser.Token.Comment();
        java.lang.StringBuilder stringBuilder21 = comment20.data;
        org.jsoup.parser.Token.TokenType tokenType22 = org.jsoup.parser.Token.TokenType.Comment;
        comment20.type = tokenType22;
        xmlTreeBuilder0.insert(comment20);
        org.jsoup.parser.Token.StartTag startTag26 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag28 = startTag26.name("hi!");
        org.jsoup.nodes.Attributes attributes29 = tag28.attributes;
        org.jsoup.parser.Token.StartTag startTag30 = new org.jsoup.parser.Token.StartTag("</hi!>", attributes29);
        org.jsoup.nodes.Element element31 = xmlTreeBuilder0.insert(startTag30);
        org.jsoup.parser.Token.Doctype doctype32 = new org.jsoup.parser.Token.Doctype();
        boolean boolean33 = doctype32.forceQuirks;
        java.lang.StringBuilder stringBuilder34 = doctype32.systemIdentifier;
        boolean boolean35 = doctype32.isCharacter();
        java.lang.String str36 = doctype32.getName();
        java.lang.String str37 = doctype32.getSystemIdentifier();
        boolean boolean38 = doctype32.forceQuirks;
        // The following exception was thrown during execution in test generation
        try {
            xmlTreeBuilder0.insert(doctype32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tag7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(stringBuilder18);
        org.junit.Assert.assertEquals(stringBuilder18.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder21);
        org.junit.Assert.assertEquals(stringBuilder21.toString(), "");
        org.junit.Assert.assertTrue("'" + tokenType22 + "' != '" + org.jsoup.parser.Token.TokenType.Comment + "'", tokenType22.equals(org.jsoup.parser.Token.TokenType.Comment));
        org.junit.Assert.assertNotNull(tag28);
        org.junit.Assert.assertNotNull(attributes29);
        org.junit.Assert.assertNotNull(element31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(stringBuilder34);
        org.junit.Assert.assertEquals(stringBuilder34.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test3096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3096");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.appendAttributeName('a');
        startTag0.newAttribute();
        boolean boolean4 = startTag0.isDoctype();
        org.jsoup.parser.Token.StartTag startTag6 = new org.jsoup.parser.Token.StartTag();
        startTag6.appendTagName('4');
        java.lang.String str9 = startTag6.name();
        org.jsoup.nodes.Attributes attributes10 = startTag6.attributes;
        org.jsoup.parser.Token.StartTag startTag11 = new org.jsoup.parser.Token.StartTag("hi!", attributes10);
        startTag0.attributes = attributes10;
        org.jsoup.parser.Token.Tag tag14 = startTag0.name("</<!---->>");
        org.jsoup.parser.Token.StartTag startTag15 = new org.jsoup.parser.Token.StartTag();
        startTag15.appendAttributeName('a');
        startTag15.newAttribute();
        boolean boolean19 = startTag15.selfClosing;
        startTag15.finaliseTag();
        org.jsoup.parser.Token.StartTag startTag22 = new org.jsoup.parser.Token.StartTag("StartTag");
        org.jsoup.nodes.Attributes attributes23 = startTag22.getAttributes();
        startTag15.attributes = attributes23;
        startTag0.attributes = attributes23;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.EndTag endTag26 = startTag0.asEndTag();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$EndTag (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$EndTag are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "4" + "'", str9, "4");
        org.junit.Assert.assertNotNull(attributes10);
        org.junit.Assert.assertNotNull(tag14);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(attributes23);
    }

    @Test
    public void test3097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3097");
        org.jsoup.parser.Token.StartTag startTag1 = new org.jsoup.parser.Token.StartTag("Doctype");
        java.lang.String str2 = startTag1.name();
        org.jsoup.parser.Token.Tag tag4 = startTag1.name("hi!a");
        startTag1.selfClosing = true;
        java.lang.String str7 = startTag1.name();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Doctype" + "'", str2, "Doctype");
        org.junit.Assert.assertNotNull(tag4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!a" + "'", str7, "hi!a");
    }

    @Test
    public void test3098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3098");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.parser.Token.StartTag startTag3 = new org.jsoup.parser.Token.StartTag("", attributes2);
        boolean boolean4 = startTag3.isDoctype();
        java.lang.String str5 = startTag3.tagName;
        startTag3.selfClosing = false;
        org.jsoup.parser.Token.Tag tag9 = startTag3.name("</hi!>");
        java.lang.String str10 = tag9.name();
        tag9.selfClosing = false;
        org.jsoup.nodes.Attributes attributes13 = tag9.getAttributes();
        java.lang.String str14 = tag9.name();
        org.jsoup.nodes.Attributes attributes17 = null;
        org.jsoup.parser.Token.StartTag startTag18 = new org.jsoup.parser.Token.StartTag("", attributes17);
        org.jsoup.parser.Token.StartTag startTag19 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag21 = startTag19.name("hi!");
        org.jsoup.nodes.Attributes attributes22 = tag21.attributes;
        startTag18.attributes = attributes22;
        org.jsoup.parser.Token.StartTag startTag24 = new org.jsoup.parser.Token.StartTag("Doctype", attributes22);
        tag9.attributes = attributes22;
        org.jsoup.parser.Token.StartTag startTag26 = new org.jsoup.parser.Token.StartTag("</Character>", attributes22);
        startTag26.appendAttributeValue("<Doctype>");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(tag9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "</hi!>" + "'", str10, "</hi!>");
        org.junit.Assert.assertNull(attributes13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "</hi!>" + "'", str14, "</hi!>");
        org.junit.Assert.assertNotNull(tag21);
        org.junit.Assert.assertNotNull(attributes22);
    }

    @Test
    public void test3099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3099");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("hi!");
        java.lang.String str2 = endTag1.toString();
        java.lang.String str3 = endTag1.toString();
        boolean boolean4 = endTag1.isDoctype();
        java.lang.String str5 = endTag1.toString();
        endTag1.appendTagName("");
        boolean boolean8 = endTag1.isEOF();
        org.jsoup.parser.Token.Tag tag10 = endTag1.name("</</<!---->>>");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "</hi!>" + "'", str2, "</hi!>");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "</hi!>" + "'", str3, "</hi!>");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "</hi!>" + "'", str5, "</hi!>");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(tag10);
    }

    @Test
    public void test3100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3100");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("hi!");
        boolean boolean2 = endTag1.selfClosing;
        endTag1.finaliseTag();
        endTag1.appendAttributeName('4');
        boolean boolean6 = endTag1.isDoctype();
        org.jsoup.parser.Token.TokenType tokenType7 = endTag1.type;
        org.jsoup.nodes.Attributes attributes8 = endTag1.getAttributes();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + tokenType7 + "' != '" + org.jsoup.parser.Token.TokenType.EndTag + "'", tokenType7.equals(org.jsoup.parser.Token.TokenType.EndTag));
        org.junit.Assert.assertNull(attributes8);
    }

    @Test
    public void test3101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3101");
        org.jsoup.parser.Token.StartTag startTag1 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag3 = startTag1.name("hi!");
        org.jsoup.nodes.Attributes attributes4 = tag3.attributes;
        org.jsoup.parser.Token.StartTag startTag5 = new org.jsoup.parser.Token.StartTag("</hi!>", attributes4);
        java.lang.String str6 = startTag5.toString();
        boolean boolean7 = startTag5.isStartTag();
        startTag5.finaliseTag();
        org.jsoup.nodes.Attributes attributes12 = null;
        org.jsoup.parser.Token.StartTag startTag13 = new org.jsoup.parser.Token.StartTag("", attributes12);
        org.jsoup.parser.Token.StartTag startTag14 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag16 = startTag14.name("hi!");
        org.jsoup.nodes.Attributes attributes17 = tag16.attributes;
        startTag13.attributes = attributes17;
        org.jsoup.parser.Token.StartTag startTag19 = new org.jsoup.parser.Token.StartTag("Doctype", attributes17);
        org.jsoup.parser.Token.StartTag startTag20 = new org.jsoup.parser.Token.StartTag("", attributes17);
        startTag20.appendAttributeValue("</hi!>");
        org.jsoup.parser.Token.TokenType tokenType23 = startTag20.type;
        startTag5.type = tokenType23;
        org.junit.Assert.assertNotNull(tag3);
        org.junit.Assert.assertNotNull(attributes4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<</hi!>>" + "'", str6, "<</hi!>>");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(tag16);
        org.junit.Assert.assertNotNull(attributes17);
        org.junit.Assert.assertTrue("'" + tokenType23 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType23.equals(org.jsoup.parser.Token.TokenType.StartTag));
    }

    @Test
    public void test3102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3102");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        boolean boolean1 = doctype0.forceQuirks;
        java.lang.StringBuilder stringBuilder2 = doctype0.systemIdentifier;
        boolean boolean3 = doctype0.forceQuirks;
        boolean boolean4 = doctype0.isStartTag();
        boolean boolean5 = doctype0.isForceQuirks();
        java.lang.String str6 = doctype0.getName();
        java.lang.String str7 = doctype0.getName();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test3103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3103");
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
        boolean boolean62 = comment54.isComment();
        java.lang.String str63 = comment54.getData();
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
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "" + "'", str63, "");
    }

    @Test
    public void test3104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3104");
        org.jsoup.parser.Token.StartTag startTag1 = new org.jsoup.parser.Token.StartTag(" ");
    }

    @Test
    public void test3105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3105");
        org.jsoup.parser.Token.StartTag startTag3 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag5 = startTag3.name("hi!");
        org.jsoup.nodes.Attributes attributes6 = tag5.attributes;
        org.jsoup.parser.Token.StartTag startTag7 = new org.jsoup.parser.Token.StartTag("</hi!>", attributes6);
        org.jsoup.parser.Token.StartTag startTag8 = new org.jsoup.parser.Token.StartTag("", attributes6);
        org.jsoup.parser.Token.StartTag startTag9 = new org.jsoup.parser.Token.StartTag("<hi!>", attributes6);
        java.lang.String str10 = startTag9.name();
        org.jsoup.parser.Token.StartTag startTag11 = startTag9.asStartTag();
        java.lang.String str12 = startTag9.name();
        org.jsoup.nodes.Attributes attributes13 = startTag9.getAttributes();
        org.jsoup.nodes.Attributes attributes14 = startTag9.getAttributes();
        boolean boolean15 = startTag9.isDoctype();
        java.lang.Class<?> wildcardClass16 = startTag9.getClass();
        org.junit.Assert.assertNotNull(tag5);
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "<hi!>" + "'", str10, "<hi!>");
        org.junit.Assert.assertNotNull(startTag11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "<hi!>" + "'", str12, "<hi!>");
        org.junit.Assert.assertNotNull(attributes13);
        org.junit.Assert.assertNotNull(attributes14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test3106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3106");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        boolean boolean1 = doctype0.forceQuirks;
        java.lang.StringBuilder stringBuilder2 = doctype0.systemIdentifier;
        boolean boolean3 = doctype0.isCharacter();
        doctype0.forceQuirks = false;
        java.lang.String str6 = doctype0.getName();
        java.lang.String str7 = doctype0.getName();
        boolean boolean8 = doctype0.isForceQuirks();
        boolean boolean9 = doctype0.isEOF();
        java.lang.String str10 = doctype0.getPublicIdentifier();
        doctype0.forceQuirks = false;
        java.lang.StringBuilder stringBuilder13 = doctype0.name;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(stringBuilder13);
        org.junit.Assert.assertEquals(stringBuilder13.toString(), "");
    }

    @Test
    public void test3107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3107");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.tokenType();
        java.lang.String str2 = doctype0.getSystemIdentifier();
        java.lang.String str3 = doctype0.tokenType();
        boolean boolean4 = doctype0.forceQuirks;
        doctype0.forceQuirks = false;
        java.lang.StringBuilder stringBuilder7 = doctype0.publicIdentifier;
        boolean boolean8 = doctype0.forceQuirks;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Doctype" + "'", str1, "Doctype");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Doctype" + "'", str3, "Doctype");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(stringBuilder7);
        org.junit.Assert.assertEquals(stringBuilder7.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test3108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3108");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag2 = startTag0.name("hi!");
        startTag0.appendAttributeName(' ');
        boolean boolean5 = startTag0.isComment();
        boolean boolean6 = startTag0.selfClosing;
        boolean boolean7 = startTag0.isComment();
        startTag0.appendAttributeValue('a');
        org.junit.Assert.assertNotNull(tag2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test3109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3109");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        boolean boolean1 = doctype0.forceQuirks;
        java.lang.StringBuilder stringBuilder2 = doctype0.systemIdentifier;
        boolean boolean3 = doctype0.isCharacter();
        doctype0.forceQuirks = false;
        java.lang.String str6 = doctype0.getName();
        doctype0.forceQuirks = true;
        boolean boolean9 = doctype0.isForceQuirks();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Comment comment10 = doctype0.asComment();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$Doctype cannot be cast to class org.jsoup.parser.Token$Comment (org.jsoup.parser.Token$Doctype and org.jsoup.parser.Token$Comment are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test3110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3110");
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
        startTag9.appendAttributeName("StartTag");
        org.jsoup.parser.Token.Tag tag19 = startTag9.name("<!---->");
        startTag9.appendTagName('a');
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(tag11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(tag19);
    }

    @Test
    public void test3111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3111");
        org.jsoup.nodes.Attributes attributes3 = null;
        org.jsoup.parser.Token.StartTag startTag4 = new org.jsoup.parser.Token.StartTag("", attributes3);
        org.jsoup.parser.Token.StartTag startTag5 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag7 = startTag5.name("hi!");
        org.jsoup.nodes.Attributes attributes8 = tag7.attributes;
        startTag4.attributes = attributes8;
        org.jsoup.parser.Token.StartTag startTag10 = new org.jsoup.parser.Token.StartTag("Doctype", attributes8);
        org.jsoup.parser.Token.StartTag startTag11 = new org.jsoup.parser.Token.StartTag("", attributes8);
        startTag11.appendAttributeValue("</hi!>");
        java.lang.String str14 = startTag11.tokenType();
        org.jsoup.parser.Token.Tag tag16 = startTag11.name("<4>");
        tag16.tagName = "Comment";
        java.lang.String str19 = tag16.tagName;
        org.junit.Assert.assertNotNull(tag7);
        org.junit.Assert.assertNotNull(attributes8);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "StartTag" + "'", str14, "StartTag");
        org.junit.Assert.assertNotNull(tag16);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Comment" + "'", str19, "Comment");
    }

    @Test
    public void test3112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3112");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag2 = startTag0.name("hi!");
        startTag0.appendAttributeName(' ');
        boolean boolean5 = startTag0.isComment();
        java.lang.String str6 = startTag0.tagName;
        boolean boolean7 = startTag0.isStartTag();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.EndTag endTag8 = startTag0.asEndTag();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$EndTag (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$EndTag are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tag2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test3113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3113");
        org.jsoup.nodes.Attributes attributes1 = null;
        org.jsoup.parser.Token.StartTag startTag2 = new org.jsoup.parser.Token.StartTag("", attributes1);
        boolean boolean3 = startTag2.isDoctype();
        boolean boolean4 = startTag2.isEOF();
        startTag2.appendTagName('a');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test3114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3114");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("</</hi!>>");
    }

    @Test
    public void test3115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3115");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag2 = startTag0.name("hi!");
        org.jsoup.parser.Token.TokenType tokenType3 = startTag0.type;
        startTag0.appendAttributeValue("EndTag");
        startTag0.appendAttributeValue("<<</hi! >>>");
        org.junit.Assert.assertNotNull(tag2);
        org.junit.Assert.assertTrue("'" + tokenType3 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType3.equals(org.jsoup.parser.Token.TokenType.StartTag));
    }

    @Test
    public void test3116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3116");
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
        boolean boolean15 = startTag11.isSelfClosing();
        boolean boolean16 = startTag11.isEndTag();
        startTag11.appendAttributeName("<4> ");
        boolean boolean19 = startTag11.isComment();
        org.junit.Assert.assertNotNull(tag7);
        org.junit.Assert.assertNotNull(attributes8);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test3117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3117");
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
        org.jsoup.parser.Token.StartTag startTag17 = new org.jsoup.parser.Token.StartTag("hi!");
        startTag17.appendAttributeValue("</hi!>");
        org.jsoup.nodes.Attributes attributes20 = startTag17.attributes;
        org.jsoup.nodes.Element element21 = xmlTreeBuilder0.insert(startTag17);
        org.jsoup.parser.Token.Character character23 = new org.jsoup.parser.Token.Character("EOF");
        java.lang.String str24 = character23.getData();
        java.lang.String str25 = character23.toString();
        java.lang.String str26 = character23.getData();
        xmlTreeBuilder0.insert(character23);
        java.lang.String str28 = character23.toString();
        java.lang.String str29 = character23.getData();
        java.lang.String str30 = character23.getData();
        java.lang.String str31 = character23.getData();
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(tag11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(attributes20);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "EOF" + "'", str24, "EOF");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "EOF" + "'", str25, "EOF");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "EOF" + "'", str26, "EOF");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "EOF" + "'", str28, "EOF");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "EOF" + "'", str29, "EOF");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "EOF" + "'", str30, "EOF");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "EOF" + "'", str31, "EOF");
    }

    @Test
    public void test3118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3118");
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
        xmlTreeBuilder0.initialiseParse("</Doctype>", "Character", parseErrorList18);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder20 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList23 = null;
        xmlTreeBuilder20.initialiseParse("Character", "hi!", parseErrorList23);
        org.jsoup.parser.Token.Comment comment25 = new org.jsoup.parser.Token.Comment();
        java.lang.StringBuilder stringBuilder26 = comment25.data;
        java.lang.String str27 = comment25.getData();
        xmlTreeBuilder20.insert(comment25);
        org.jsoup.parser.Token.StartTag startTag29 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag31 = startTag29.name("hi!");
        startTag29.appendAttributeName(' ');
        boolean boolean34 = startTag29.isComment();
        org.jsoup.nodes.Element element35 = xmlTreeBuilder20.insert(startTag29);
        startTag29.appendAttributeName("StartTag");
        org.jsoup.nodes.Attributes attributes38 = startTag29.attributes;
        boolean boolean39 = xmlTreeBuilder0.process((org.jsoup.parser.Token) startTag29);
        org.jsoup.parser.ParseErrorList parseErrorList42 = null;
        xmlTreeBuilder0.initialiseParse("<hi!  =\"#\">", "< >", parseErrorList42);
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(tag11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(stringBuilder26);
        org.junit.Assert.assertEquals(stringBuilder26.toString(), "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(tag31);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(element35);
        org.junit.Assert.assertNotNull(attributes38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
    }

    @Test
    public void test3119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3119");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        boolean boolean1 = doctype0.forceQuirks;
        java.lang.StringBuilder stringBuilder2 = doctype0.systemIdentifier;
        boolean boolean3 = doctype0.isCharacter();
        doctype0.forceQuirks = false;
        java.lang.String str6 = doctype0.getName();
        java.lang.String str7 = doctype0.getName();
        boolean boolean8 = doctype0.isForceQuirks();
        boolean boolean9 = doctype0.isForceQuirks();
        boolean boolean10 = doctype0.isForceQuirks();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test3120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3120");
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
        endTag1.appendAttributeName('4');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "</hi!>" + "'", str3, "</hi!>");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "</hi!>" + "'", str4, "</hi!>");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "</hi!>" + "'", str7, "</hi!>");
        org.junit.Assert.assertTrue("'" + tokenType8 + "' != '" + org.jsoup.parser.Token.TokenType.EndTag + "'", tokenType8.equals(org.jsoup.parser.Token.TokenType.EndTag));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "</hi!>" + "'", str10, "</hi!>");
        org.junit.Assert.assertNull(attributes13);
    }

    @Test
    public void test3121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3121");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("hi!");
        java.lang.String str2 = endTag1.toString();
        java.lang.String str3 = endTag1.toString();
        org.jsoup.parser.Token.TokenType tokenType4 = org.jsoup.parser.Token.TokenType.EndTag;
        endTag1.type = tokenType4;
        boolean boolean6 = endTag1.isStartTag();
        boolean boolean7 = endTag1.isCharacter();
        boolean boolean8 = endTag1.selfClosing;
        endTag1.appendAttributeName('a');
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.StartTag startTag11 = endTag1.asStartTag();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$EndTag cannot be cast to class org.jsoup.parser.Token$StartTag (org.jsoup.parser.Token$EndTag and org.jsoup.parser.Token$StartTag are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "</hi!>" + "'", str2, "</hi!>");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "</hi!>" + "'", str3, "</hi!>");
        org.junit.Assert.assertTrue("'" + tokenType4 + "' != '" + org.jsoup.parser.Token.TokenType.EndTag + "'", tokenType4.equals(org.jsoup.parser.Token.TokenType.EndTag));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test3122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3122");
        org.jsoup.parser.Token.Character character1 = new org.jsoup.parser.Token.Character("EOF");
        java.lang.String str2 = character1.getData();
        boolean boolean3 = character1.isComment();
        org.jsoup.parser.Token.Comment comment4 = new org.jsoup.parser.Token.Comment();
        java.lang.StringBuilder stringBuilder5 = comment4.data;
        org.jsoup.parser.Token.TokenType tokenType6 = org.jsoup.parser.Token.TokenType.Comment;
        comment4.type = tokenType6;
        character1.type = tokenType6;
        org.jsoup.parser.Token.TokenType tokenType9 = character1.type;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Comment comment10 = character1.asComment();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$Character cannot be cast to class org.jsoup.parser.Token$Comment (org.jsoup.parser.Token$Character and org.jsoup.parser.Token$Comment are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "EOF" + "'", str2, "EOF");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "");
        org.junit.Assert.assertTrue("'" + tokenType6 + "' != '" + org.jsoup.parser.Token.TokenType.Comment + "'", tokenType6.equals(org.jsoup.parser.Token.TokenType.Comment));
        org.junit.Assert.assertTrue("'" + tokenType9 + "' != '" + org.jsoup.parser.Token.TokenType.Comment + "'", tokenType9.equals(org.jsoup.parser.Token.TokenType.Comment));
    }

    @Test
    public void test3123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3123");
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
        org.jsoup.parser.Token.StartTag startTag26 = new org.jsoup.parser.Token.StartTag("4");
        java.lang.String str27 = startTag26.name();
        boolean boolean28 = xmlTreeBuilder0.process((org.jsoup.parser.Token) startTag26);
        org.jsoup.parser.Token.Comment comment29 = null;
        // The following exception was thrown during execution in test generation
        try {
            xmlTreeBuilder0.insert(comment29);
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
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Doctype" + "'", str18, "Doctype");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(stringBuilder21);
        org.junit.Assert.assertEquals(stringBuilder21.toString(), "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(stringBuilder23);
        org.junit.Assert.assertEquals(stringBuilder23.toString(), "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "4" + "'", str27, "4");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }

    @Test
    public void test3124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3124");
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
        org.jsoup.parser.Token.StartTag startTag14 = new org.jsoup.parser.Token.StartTag("EndTag", attributes11);
        boolean boolean15 = startTag14.selfClosing;
        startTag14.appendTagName("<<</hi!>>>");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "</hi!>" + "'", str3, "</hi!>");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "</hi!>" + "'", str4, "</hi!>");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(tag10);
        org.junit.Assert.assertNotNull(attributes11);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test3125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3125");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("hi!");
        java.lang.String str2 = endTag1.toString();
        java.lang.String str3 = endTag1.toString();
        boolean boolean4 = endTag1.isDoctype();
        endTag1.appendAttributeName("EOF");
        boolean boolean7 = endTag1.isStartTag();
        endTag1.tagName = "Character";
        java.lang.String str10 = endTag1.tagName;
        endTag1.appendTagName('4');
        endTag1.newAttribute();
        org.jsoup.nodes.Attributes attributes14 = endTag1.getAttributes();
        boolean boolean15 = endTag1.isSelfClosing();
        org.jsoup.parser.Token.Tag tag17 = endTag1.name("4");
        boolean boolean18 = tag17.isEndTag();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "</hi!>" + "'", str2, "</hi!>");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "</hi!>" + "'", str3, "</hi!>");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Character" + "'", str10, "Character");
        org.junit.Assert.assertNotNull(attributes14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(tag17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test3126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3126");
        org.jsoup.parser.Token.Character character1 = new org.jsoup.parser.Token.Character("</4>");
    }

    @Test
    public void test3127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3127");
        org.jsoup.nodes.Attributes attributes1 = null;
        org.jsoup.parser.Token.StartTag startTag2 = new org.jsoup.parser.Token.StartTag("", attributes1);
        startTag2.selfClosing = false;
        startTag2.newAttribute();
        startTag2.finaliseTag();
        org.jsoup.parser.Token.EndTag endTag8 = new org.jsoup.parser.Token.EndTag("hi!");
        boolean boolean9 = endTag8.selfClosing;
        org.jsoup.parser.Token.Tag tag11 = endTag8.name("");
        boolean boolean12 = endTag8.isEndTag();
        org.jsoup.parser.Token.Tag tag14 = endTag8.name("<4>");
        org.jsoup.parser.Token.TokenType tokenType15 = tag14.type;
        startTag2.type = tokenType15;
        boolean boolean17 = startTag2.isDoctype();
        org.jsoup.nodes.Attributes attributes18 = startTag2.getAttributes();
        startTag2.newAttribute();
        startTag2.appendAttributeValue('#');
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(tag11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(tag14);
        org.junit.Assert.assertTrue("'" + tokenType15 + "' != '" + org.jsoup.parser.Token.TokenType.EndTag + "'", tokenType15.equals(org.jsoup.parser.Token.TokenType.EndTag));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(attributes18);
    }

    @Test
    public void test3128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3128");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        xmlTreeBuilder0.initialiseParse("</hi!>", "EOF", parseErrorList3);
        org.jsoup.parser.Token.Comment comment5 = new org.jsoup.parser.Token.Comment();
        java.lang.StringBuilder stringBuilder6 = comment5.data;
        org.jsoup.parser.Token.TokenType tokenType7 = org.jsoup.parser.Token.TokenType.Comment;
        comment5.type = tokenType7;
        java.lang.StringBuilder stringBuilder9 = comment5.data;
        boolean boolean10 = xmlTreeBuilder0.process((org.jsoup.parser.Token) comment5);
        org.jsoup.parser.Token.Character character12 = new org.jsoup.parser.Token.Character("EOF");
        java.lang.String str13 = character12.getData();
        java.lang.String str14 = character12.toString();
        boolean boolean15 = character12.isStartTag();
        java.lang.String str16 = character12.toString();
        java.lang.String str17 = character12.toString();
        boolean boolean18 = xmlTreeBuilder0.process((org.jsoup.parser.Token) character12);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder19 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList22 = null;
        xmlTreeBuilder19.initialiseParse("</hi!>", "EOF", parseErrorList22);
        org.jsoup.parser.Token.StartTag startTag24 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag26 = startTag24.name("hi!");
        boolean boolean27 = xmlTreeBuilder19.process((org.jsoup.parser.Token) startTag24);
        org.jsoup.parser.Token.StartTag startTag28 = new org.jsoup.parser.Token.StartTag();
        startTag28.appendTagName('4');
        org.jsoup.nodes.Element element31 = xmlTreeBuilder19.insert(startTag28);
        org.jsoup.parser.ParseErrorList parseErrorList34 = null;
        xmlTreeBuilder19.initialiseParse("Character", "Doctype", parseErrorList34);
        org.jsoup.parser.Token.Comment comment36 = new org.jsoup.parser.Token.Comment();
        java.lang.StringBuilder stringBuilder37 = comment36.data;
        xmlTreeBuilder19.insert(comment36);
        java.lang.String str39 = comment36.toString();
        java.lang.String str40 = comment36.toString();
        xmlTreeBuilder0.insert(comment36);
        java.lang.String str42 = comment36.toString();
        java.lang.String str43 = comment36.getData();
        java.lang.String str44 = comment36.getData();
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "");
        org.junit.Assert.assertTrue("'" + tokenType7 + "' != '" + org.jsoup.parser.Token.TokenType.Comment + "'", tokenType7.equals(org.jsoup.parser.Token.TokenType.Comment));
        org.junit.Assert.assertNotNull(stringBuilder9);
        org.junit.Assert.assertEquals(stringBuilder9.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "EOF" + "'", str13, "EOF");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "EOF" + "'", str14, "EOF");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "EOF" + "'", str16, "EOF");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "EOF" + "'", str17, "EOF");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(tag26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(element31);
        org.junit.Assert.assertNotNull(stringBuilder37);
        org.junit.Assert.assertEquals(stringBuilder37.toString(), "");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "<!---->" + "'", str39, "<!---->");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "<!---->" + "'", str40, "<!---->");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "<!---->" + "'", str42, "<!---->");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
    }

    @Test
    public void test3129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3129");
        org.jsoup.parser.Token.StartTag startTag1 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes2 = startTag1.attributes;
        org.jsoup.parser.Token.StartTag startTag3 = new org.jsoup.parser.Token.StartTag("<Doctype>", attributes2);
        startTag3.appendAttributeValue("</hi!>");
        startTag3.selfClosing = false;
        org.jsoup.nodes.Attributes attributes8 = startTag3.attributes;
        org.jsoup.parser.Token.StartTag startTag9 = startTag3.asStartTag();
        org.jsoup.nodes.Attributes attributes10 = startTag3.getAttributes();
        org.junit.Assert.assertNotNull(attributes2);
        org.junit.Assert.assertNotNull(attributes8);
        org.junit.Assert.assertNotNull(startTag9);
        org.junit.Assert.assertNotNull(attributes10);
    }

    @Test
    public void test3130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3130");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("hi!");
        boolean boolean2 = endTag1.selfClosing;
        endTag1.finaliseTag();
        endTag1.appendAttributeName(' ');
        endTag1.tagName = "Doctype";
        boolean boolean8 = endTag1.selfClosing;
        java.lang.String str9 = endTag1.toString();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "</Doctype>" + "'", str9, "</Doctype>");
    }

    @Test
    public void test3131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3131");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("hi!");
        boolean boolean2 = endTag1.selfClosing;
        endTag1.finaliseTag();
        endTag1.appendAttributeName(' ');
        boolean boolean6 = endTag1.isStartTag();
        endTag1.appendAttributeName('a');
        java.lang.String str9 = endTag1.tokenType();
        org.jsoup.nodes.Attributes attributes10 = endTag1.getAttributes();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "EndTag" + "'", str9, "EndTag");
        org.junit.Assert.assertNull(attributes10);
    }

    @Test
    public void test3132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3132");
        org.jsoup.nodes.Attributes attributes4 = null;
        org.jsoup.parser.Token.StartTag startTag5 = new org.jsoup.parser.Token.StartTag("", attributes4);
        org.jsoup.parser.Token.StartTag startTag6 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag8 = startTag6.name("hi!");
        org.jsoup.nodes.Attributes attributes9 = tag8.attributes;
        startTag5.attributes = attributes9;
        org.jsoup.parser.Token.StartTag startTag11 = new org.jsoup.parser.Token.StartTag("Doctype", attributes9);
        org.jsoup.parser.Token.StartTag startTag12 = new org.jsoup.parser.Token.StartTag("", attributes9);
        org.jsoup.parser.Token.StartTag startTag13 = new org.jsoup.parser.Token.StartTag("EOF", attributes9);
        startTag13.selfClosing = false;
        org.junit.Assert.assertNotNull(tag8);
        org.junit.Assert.assertNotNull(attributes9);
    }

    @Test
    public void test3133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3133");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        boolean boolean1 = doctype0.forceQuirks;
        java.lang.String str2 = doctype0.getName();
        boolean boolean3 = doctype0.forceQuirks;
        boolean boolean4 = doctype0.isStartTag();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test3134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3134");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.parser.Token.StartTag startTag3 = new org.jsoup.parser.Token.StartTag("", attributes2);
        boolean boolean4 = startTag3.isDoctype();
        java.lang.String str5 = startTag3.tagName;
        startTag3.selfClosing = false;
        org.jsoup.parser.Token.Tag tag9 = startTag3.name("</hi!>");
        java.lang.String str10 = tag9.name();
        tag9.selfClosing = false;
        org.jsoup.nodes.Attributes attributes13 = tag9.getAttributes();
        boolean boolean14 = tag9.isCharacter();
        org.jsoup.nodes.Attributes attributes19 = null;
        org.jsoup.parser.Token.StartTag startTag20 = new org.jsoup.parser.Token.StartTag("", attributes19);
        startTag20.selfClosing = false;
        startTag20.appendTagName("</hi!>");
        startTag20.newAttribute();
        org.jsoup.nodes.Attributes attributes26 = startTag20.getAttributes();
        org.jsoup.parser.Token.StartTag startTag27 = new org.jsoup.parser.Token.StartTag("Doctype", attributes26);
        org.jsoup.parser.Token.StartTag startTag28 = new org.jsoup.parser.Token.StartTag("hi!", attributes26);
        org.jsoup.parser.Token.StartTag startTag29 = new org.jsoup.parser.Token.StartTag("</hi!>4", attributes26);
        tag9.attributes = attributes26;
        org.jsoup.parser.Token.StartTag startTag31 = new org.jsoup.parser.Token.StartTag("< a>", attributes26);
        boolean boolean32 = startTag31.isSelfClosing();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(tag9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "</hi!>" + "'", str10, "</hi!>");
        org.junit.Assert.assertNull(attributes13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(attributes26);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test3135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3135");
        org.jsoup.nodes.Attributes attributes1 = null;
        org.jsoup.parser.Token.StartTag startTag2 = new org.jsoup.parser.Token.StartTag("", attributes1);
        boolean boolean3 = startTag2.isEOF();
        startTag2.appendTagName('a');
        org.jsoup.parser.Token.Tag tag7 = startTag2.name("EOF");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(tag7);
    }

    @Test
    public void test3136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3136");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("<4</hi!>4>");
        endTag1.finaliseTag();
        endTag1.appendAttributeName("</Comment>");
        boolean boolean5 = endTag1.isComment();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test3137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3137");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.tokenType();
        boolean boolean2 = doctype0.isForceQuirks();
        java.lang.String str3 = doctype0.getPublicIdentifier();
        boolean boolean4 = doctype0.isForceQuirks();
        boolean boolean5 = doctype0.isForceQuirks();
        boolean boolean6 = doctype0.isComment();
        java.lang.String str7 = doctype0.tokenType();
        java.lang.StringBuilder stringBuilder8 = doctype0.publicIdentifier;
        java.lang.StringBuilder stringBuilder9 = doctype0.name;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Doctype" + "'", str1, "Doctype");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Doctype" + "'", str7, "Doctype");
        org.junit.Assert.assertNotNull(stringBuilder8);
        org.junit.Assert.assertEquals(stringBuilder8.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder9);
        org.junit.Assert.assertEquals(stringBuilder9.toString(), "");
    }

    @Test
    public void test3138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3138");
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
        org.jsoup.parser.Token.Character character28 = new org.jsoup.parser.Token.Character("EOF");
        java.lang.String str29 = character28.getData();
        boolean boolean30 = character28.isComment();
        org.jsoup.parser.Token.Comment comment31 = new org.jsoup.parser.Token.Comment();
        java.lang.StringBuilder stringBuilder32 = comment31.data;
        org.jsoup.parser.Token.TokenType tokenType33 = org.jsoup.parser.Token.TokenType.Comment;
        comment31.type = tokenType33;
        character28.type = tokenType33;
        xmlTreeBuilder0.insert(character28);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Doctype doctype37 = character28.asDoctype();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$Character cannot be cast to class org.jsoup.parser.Token$Doctype (org.jsoup.parser.Token$Character and org.jsoup.parser.Token$Doctype are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
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
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "EOF" + "'", str29, "EOF");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(stringBuilder32);
        org.junit.Assert.assertEquals(stringBuilder32.toString(), "");
        org.junit.Assert.assertTrue("'" + tokenType33 + "' != '" + org.jsoup.parser.Token.TokenType.Comment + "'", tokenType33.equals(org.jsoup.parser.Token.TokenType.Comment));
    }

    @Test
    public void test3139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3139");
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
        startTag14.appendAttributeName("hi!<4>");
        startTag14.selfClosing = false;
        org.junit.Assert.assertNotNull(attributes11);
    }

    @Test
    public void test3140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3140");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        boolean boolean1 = doctype0.forceQuirks;
        java.lang.StringBuilder stringBuilder2 = doctype0.systemIdentifier;
        boolean boolean3 = doctype0.forceQuirks;
        java.lang.StringBuilder stringBuilder4 = doctype0.publicIdentifier;
        boolean boolean5 = doctype0.isForceQuirks();
        java.lang.String str6 = doctype0.getPublicIdentifier();
        java.lang.String str7 = doctype0.tokenType();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Doctype" + "'", str7, "Doctype");
    }

    @Test
    public void test3141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3141");
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
        java.lang.String str18 = comment11.getData();
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
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test3142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3142");
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
        org.jsoup.parser.ParseErrorList parseErrorList64 = null;
        xmlTreeBuilder0.initialiseParse("#", "<!---->", parseErrorList64);
        org.jsoup.parser.Token.Character character67 = new org.jsoup.parser.Token.Character("Character");
        boolean boolean68 = character67.isStartTag();
        boolean boolean69 = character67.isEndTag();
        xmlTreeBuilder0.insert(character67);
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
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
    }

    @Test
    public void test3143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3143");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag2 = startTag0.name("hi!");
        startTag0.appendAttributeName(' ');
        boolean boolean5 = startTag0.isComment();
        java.lang.String str6 = startTag0.tagName;
        boolean boolean7 = startTag0.isSelfClosing();
        org.jsoup.parser.Token.StartTag startTag8 = startTag0.asStartTag();
        startTag8.appendAttributeName('a');
        boolean boolean11 = startTag8.isEndTag();
        org.junit.Assert.assertNotNull(tag2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(startTag8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test3144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3144");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        boolean boolean1 = doctype0.forceQuirks;
        java.lang.StringBuilder stringBuilder2 = doctype0.systemIdentifier;
        boolean boolean3 = doctype0.isEndTag();
        doctype0.forceQuirks = false;
        boolean boolean6 = doctype0.forceQuirks;
        java.lang.StringBuilder stringBuilder7 = doctype0.publicIdentifier;
        java.lang.StringBuilder stringBuilder8 = doctype0.systemIdentifier;
        boolean boolean9 = doctype0.isEndTag();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(stringBuilder7);
        org.junit.Assert.assertEquals(stringBuilder7.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder8);
        org.junit.Assert.assertEquals(stringBuilder8.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test3145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3145");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        boolean boolean1 = doctype0.forceQuirks;
        java.lang.StringBuilder stringBuilder2 = doctype0.systemIdentifier;
        boolean boolean3 = doctype0.isCharacter();
        doctype0.forceQuirks = false;
        java.lang.String str6 = doctype0.getName();
        doctype0.forceQuirks = true;
        boolean boolean9 = doctype0.isForceQuirks();
        java.lang.StringBuilder stringBuilder10 = doctype0.systemIdentifier;
        boolean boolean11 = doctype0.isStartTag();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(stringBuilder10);
        org.junit.Assert.assertEquals(stringBuilder10.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test3146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3146");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        boolean boolean1 = doctype0.forceQuirks;
        java.lang.StringBuilder stringBuilder2 = doctype0.systemIdentifier;
        boolean boolean3 = doctype0.forceQuirks;
        boolean boolean4 = doctype0.isForceQuirks();
        boolean boolean5 = doctype0.isForceQuirks();
        java.lang.String str6 = doctype0.getSystemIdentifier();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test3147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3147");
        org.jsoup.parser.Token.StartTag startTag1 = new org.jsoup.parser.Token.StartTag("</hi!>4");
        boolean boolean2 = startTag1.isComment();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3148");
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
        xmlTreeBuilder35.initialiseParse("</hi!>", "EOF", parseErrorList38);
        org.jsoup.parser.Token.StartTag startTag40 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag42 = startTag40.name("hi!");
        boolean boolean43 = xmlTreeBuilder35.process((org.jsoup.parser.Token) startTag40);
        org.jsoup.parser.Token.Comment comment44 = new org.jsoup.parser.Token.Comment();
        java.lang.StringBuilder stringBuilder45 = comment44.data;
        java.lang.String str46 = comment44.toString();
        xmlTreeBuilder35.insert(comment44);
        xmlTreeBuilder0.insert(comment44);
        org.jsoup.parser.Token.Character character50 = new org.jsoup.parser.Token.Character("<hi!>");
        xmlTreeBuilder0.insert(character50);
        org.jsoup.parser.Token.Character character53 = new org.jsoup.parser.Token.Character("EOF");
        java.lang.String str54 = character53.getData();
        java.lang.String str55 = character53.toString();
        boolean boolean56 = character53.isStartTag();
        java.lang.String str57 = character53.toString();
        java.lang.String str58 = character53.toString();
        java.lang.String str59 = character53.getData();
        java.lang.String str60 = character53.getData();
        java.lang.String str61 = character53.getData();
        java.lang.String str62 = character53.toString();
        org.jsoup.parser.Token.Doctype doctype63 = new org.jsoup.parser.Token.Doctype();
        boolean boolean64 = doctype63.forceQuirks;
        java.lang.String str65 = doctype63.getName();
        boolean boolean66 = doctype63.forceQuirks;
        boolean boolean67 = doctype63.forceQuirks;
        org.jsoup.parser.Token.TokenType tokenType68 = org.jsoup.parser.Token.TokenType.Character;
        doctype63.type = tokenType68;
        character53.type = tokenType68;
        character50.type = tokenType68;
        boolean boolean72 = character50.isEndTag();
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
        org.junit.Assert.assertNotNull(tag42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(stringBuilder45);
        org.junit.Assert.assertEquals(stringBuilder45.toString(), "");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "<!---->" + "'", str46, "<!---->");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "EOF" + "'", str54, "EOF");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "EOF" + "'", str55, "EOF");
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "EOF" + "'", str57, "EOF");
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "EOF" + "'", str58, "EOF");
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "EOF" + "'", str59, "EOF");
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "EOF" + "'", str60, "EOF");
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "EOF" + "'", str61, "EOF");
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "EOF" + "'", str62, "EOF");
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "" + "'", str65, "");
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + tokenType68 + "' != '" + org.jsoup.parser.Token.TokenType.Character + "'", tokenType68.equals(org.jsoup.parser.Token.TokenType.Character));
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
    }

    @Test
    public void test3149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3149");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.tokenType();
        java.lang.StringBuilder stringBuilder2 = doctype0.systemIdentifier;
        doctype0.forceQuirks = true;
        doctype0.forceQuirks = false;
        java.lang.String str7 = doctype0.getPublicIdentifier();
        boolean boolean8 = doctype0.isEndTag();
        boolean boolean9 = doctype0.forceQuirks;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Doctype" + "'", str1, "Doctype");
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test3150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3150");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        boolean boolean1 = doctype0.forceQuirks;
        java.lang.String str2 = doctype0.getName();
        boolean boolean3 = doctype0.isEndTag();
        java.lang.String str4 = doctype0.getName();
        java.lang.StringBuilder stringBuilder5 = doctype0.name;
        java.lang.StringBuilder stringBuilder6 = doctype0.name;
        java.lang.String str7 = doctype0.getSystemIdentifier();
        doctype0.forceQuirks = true;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test3151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3151");
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
        org.jsoup.parser.Token.Comment comment34 = new org.jsoup.parser.Token.Comment();
        boolean boolean35 = comment34.isEndTag();
        xmlTreeBuilder0.insert(comment34);
        org.jsoup.parser.Token.TokenType tokenType37 = comment34.type;
        java.lang.StringBuilder stringBuilder38 = comment34.data;
        java.lang.String str39 = comment34.tokenType();
        java.lang.String str40 = comment34.toString();
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
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + tokenType37 + "' != '" + org.jsoup.parser.Token.TokenType.Comment + "'", tokenType37.equals(org.jsoup.parser.Token.TokenType.Comment));
        org.junit.Assert.assertNotNull(stringBuilder38);
        org.junit.Assert.assertEquals(stringBuilder38.toString(), "");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "Comment" + "'", str39, "Comment");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "<!---->" + "'", str40, "<!---->");
    }

    @Test
    public void test3152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3152");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.appendAttributeName('a');
        boolean boolean3 = endTag0.isCharacter();
        java.lang.String str4 = endTag0.tokenType();
        org.jsoup.parser.Token.EndTag endTag5 = endTag0.asEndTag();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "EndTag" + "'", str4, "EndTag");
        org.junit.Assert.assertNotNull(endTag5);
    }

    @Test
    public void test3153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3153");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag2 = startTag0.name("hi!");
        org.jsoup.parser.Token.TokenType tokenType3 = startTag0.type;
        startTag0.finaliseTag();
        org.junit.Assert.assertNotNull(tag2);
        org.junit.Assert.assertTrue("'" + tokenType3 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType3.equals(org.jsoup.parser.Token.TokenType.StartTag));
    }

    @Test
    public void test3154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3154");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.parser.Token.StartTag startTag3 = new org.jsoup.parser.Token.StartTag("", attributes2);
        boolean boolean4 = startTag3.isDoctype();
        java.lang.String str5 = startTag3.tagName;
        org.jsoup.parser.Token.TokenType tokenType6 = startTag3.type;
        startTag3.appendTagName(' ');
        boolean boolean9 = startTag3.isDoctype();
        org.jsoup.parser.Token.StartTag startTag11 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag13 = startTag11.name("hi!");
        org.jsoup.nodes.Attributes attributes14 = tag13.attributes;
        org.jsoup.parser.Token.StartTag startTag15 = new org.jsoup.parser.Token.StartTag("", attributes14);
        startTag3.attributes = attributes14;
        org.jsoup.nodes.Attributes attributes18 = null;
        org.jsoup.parser.Token.StartTag startTag19 = new org.jsoup.parser.Token.StartTag("", attributes18);
        org.jsoup.parser.Token.StartTag startTag20 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag22 = startTag20.name("hi!");
        org.jsoup.nodes.Attributes attributes23 = tag22.attributes;
        startTag19.attributes = attributes23;
        startTag3.attributes = attributes23;
        org.jsoup.parser.Token.StartTag startTag26 = new org.jsoup.parser.Token.StartTag("<hi!>", attributes23);
        org.jsoup.parser.Token.Tag tag28 = startTag26.name("hi!#");
        startTag26.tagName = "hi! ";
        org.jsoup.parser.Token.Tag tag32 = startTag26.name("<<</hi!>>>");
        boolean boolean33 = startTag26.isCharacter();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + tokenType6 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType6.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(tag13);
        org.junit.Assert.assertNotNull(attributes14);
        org.junit.Assert.assertNotNull(tag22);
        org.junit.Assert.assertNotNull(attributes23);
        org.junit.Assert.assertNotNull(tag28);
        org.junit.Assert.assertNotNull(tag32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test3155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3155");
        org.jsoup.parser.Token.StartTag startTag1 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag3 = startTag1.name("hi!");
        org.jsoup.nodes.Attributes attributes4 = tag3.attributes;
        org.jsoup.parser.Token.Tag tag6 = tag3.name("<</hi!>>");
        tag3.appendTagName("hi!");
        java.lang.String str9 = tag3.tagName;
        org.jsoup.nodes.Attributes attributes10 = tag3.getAttributes();
        org.jsoup.nodes.Attributes attributes11 = tag3.getAttributes();
        org.jsoup.parser.Token.StartTag startTag12 = new org.jsoup.parser.Token.StartTag("< a>", attributes11);
        org.junit.Assert.assertNotNull(tag3);
        org.junit.Assert.assertNotNull(attributes4);
        org.junit.Assert.assertNotNull(tag6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<</hi!>>hi!" + "'", str9, "<</hi!>>hi!");
        org.junit.Assert.assertNotNull(attributes10);
        org.junit.Assert.assertNotNull(attributes11);
    }

    @Test
    public void test3156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3156");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.tokenType();
        boolean boolean2 = doctype0.isComment();
        boolean boolean3 = doctype0.forceQuirks;
        java.lang.StringBuilder stringBuilder4 = doctype0.name;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Doctype" + "'", str1, "Doctype");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "");
    }

    @Test
    public void test3157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3157");
        org.jsoup.nodes.Attributes attributes1 = null;
        org.jsoup.parser.Token.StartTag startTag2 = new org.jsoup.parser.Token.StartTag("", attributes1);
        startTag2.selfClosing = false;
        startTag2.newAttribute();
        org.jsoup.nodes.Attributes attributes6 = startTag2.getAttributes();
        startTag2.appendAttributeValue('a');
        startTag2.appendTagName("EOF");
        startTag2.appendTagName('a');
        startTag2.appendAttributeValue('4');
        org.junit.Assert.assertNotNull(attributes6);
    }

    @Test
    public void test3158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3158");
        org.jsoup.parser.Token.Character character1 = new org.jsoup.parser.Token.Character("</hi!#>");
    }

    @Test
    public void test3159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3159");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag2 = startTag0.name("hi!");
        startTag0.appendAttributeName(' ');
        startTag0.appendAttributeName("hi!");
        boolean boolean7 = startTag0.isSelfClosing();
        boolean boolean8 = startTag0.isComment();
        boolean boolean9 = startTag0.isCharacter();
        startTag0.appendAttributeValue("#");
        boolean boolean12 = startTag0.isStartTag();
        org.junit.Assert.assertNotNull(tag2);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test3160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3160");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("hi!");
        java.lang.String str2 = endTag1.toString();
        java.lang.String str3 = endTag1.toString();
        boolean boolean4 = endTag1.isDoctype();
        java.lang.String str5 = endTag1.tagName;
        org.jsoup.nodes.Attributes attributes6 = endTag1.getAttributes();
        org.jsoup.parser.Token.EndTag endTag7 = endTag1.asEndTag();
        java.lang.String str8 = endTag7.name();
        org.jsoup.parser.Token.Tag tag10 = endTag7.name("EndTag");
        java.lang.String str11 = endTag7.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "</hi!>" + "'", str2, "</hi!>");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "</hi!>" + "'", str3, "</hi!>");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNull(attributes6);
        org.junit.Assert.assertNotNull(endTag7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(tag10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "</EndTag>" + "'", str11, "</EndTag>");
    }

    @Test
    public void test3161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3161");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        boolean boolean1 = doctype0.forceQuirks;
        java.lang.StringBuilder stringBuilder2 = doctype0.systemIdentifier;
        boolean boolean3 = doctype0.isCharacter();
        doctype0.forceQuirks = false;
        java.lang.StringBuilder stringBuilder6 = doctype0.publicIdentifier;
        boolean boolean7 = doctype0.isForceQuirks();
        boolean boolean8 = doctype0.forceQuirks;
        boolean boolean9 = doctype0.isEOF();
        java.lang.StringBuilder stringBuilder10 = doctype0.systemIdentifier;
        doctype0.forceQuirks = true;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(stringBuilder10);
        org.junit.Assert.assertEquals(stringBuilder10.toString(), "");
    }

    @Test
    public void test3162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3162");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        java.lang.StringBuilder stringBuilder1 = comment0.data;
        java.lang.StringBuilder stringBuilder2 = comment0.data;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.EndTag endTag3 = comment0.asEndTag();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$Comment cannot be cast to class org.jsoup.parser.Token$EndTag (org.jsoup.parser.Token$Comment and org.jsoup.parser.Token$EndTag are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stringBuilder1);
        org.junit.Assert.assertEquals(stringBuilder1.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
    }

    @Test
    public void test3163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3163");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        xmlTreeBuilder0.initialiseParse("</hi!>", "EOF", parseErrorList3);
        org.jsoup.parser.ParseErrorList parseErrorList7 = null;
        xmlTreeBuilder0.initialiseParse("<!---->", "</Doctype4>", parseErrorList7);
        org.jsoup.parser.Token.Comment comment9 = null;
        // The following exception was thrown during execution in test generation
        try {
            xmlTreeBuilder0.insert(comment9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3164");
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
        java.lang.String str21 = character10.tokenType();
        java.lang.Class<?> wildcardClass22 = character10.getClass();
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "EOF" + "'", str11, "EOF");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "EOF" + "'", str12, "EOF");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "EOF" + "'", str14, "EOF");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "EOF" + "'", str15, "EOF");
        org.junit.Assert.assertTrue("'" + tokenType16 + "' != '" + org.jsoup.parser.Token.TokenType.Comment + "'", tokenType16.equals(org.jsoup.parser.Token.TokenType.Comment));
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "EOF" + "'", str18, "EOF");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Character" + "'", str21, "Character");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test3165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3165");
        org.jsoup.nodes.Attributes attributes1 = null;
        org.jsoup.parser.Token.StartTag startTag2 = new org.jsoup.parser.Token.StartTag("", attributes1);
        startTag2.selfClosing = false;
        startTag2.appendTagName("</hi!>");
        startTag2.newAttribute();
        startTag2.appendTagName('4');
        java.lang.String str10 = startTag2.name();
        startTag2.appendTagName(' ');
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "</hi!>4" + "'", str10, "</hi!>4");
    }

    @Test
    public void test3166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3166");
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
        org.jsoup.parser.Token.Tag tag16 = startTag11.name("<!---->");
        tag16.newAttribute();
        boolean boolean18 = tag16.isStartTag();
        org.junit.Assert.assertNotNull(tag7);
        org.junit.Assert.assertNotNull(attributes8);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(tag16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test3167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3167");
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
        boolean boolean45 = character40.isComment();
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
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
    }

    @Test
    public void test3168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3168");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.appendAttributeName('a');
        startTag0.appendAttributeName("");
        boolean boolean5 = startTag0.isDoctype();
        startTag0.appendAttributeName('a');
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test3169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3169");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("hi!");
        boolean boolean2 = endTag1.selfClosing;
        java.lang.String str3 = endTag1.toString();
        java.lang.String str4 = endTag1.toString();
        org.jsoup.parser.Token.EndTag endTag5 = endTag1.asEndTag();
        endTag5.newAttribute();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "</hi!>" + "'", str3, "</hi!>");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "</hi!>" + "'", str4, "</hi!>");
        org.junit.Assert.assertNotNull(endTag5);
    }

    @Test
    public void test3170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3170");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.tokenType();
        boolean boolean2 = doctype0.isForceQuirks();
        java.lang.String str3 = doctype0.getPublicIdentifier();
        boolean boolean4 = doctype0.isForceQuirks();
        doctype0.forceQuirks = true;
        org.jsoup.parser.Token.Doctype doctype7 = doctype0.asDoctype();
        java.lang.StringBuilder stringBuilder8 = doctype7.systemIdentifier;
        java.lang.String str9 = doctype7.tokenType();
        java.lang.StringBuilder stringBuilder10 = doctype7.systemIdentifier;
        boolean boolean11 = doctype7.isForceQuirks();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Doctype" + "'", str1, "Doctype");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(doctype7);
        org.junit.Assert.assertNotNull(stringBuilder8);
        org.junit.Assert.assertEquals(stringBuilder8.toString(), "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Doctype" + "'", str9, "Doctype");
        org.junit.Assert.assertNotNull(stringBuilder10);
        org.junit.Assert.assertEquals(stringBuilder10.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test3171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3171");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("hi!");
        boolean boolean2 = endTag1.selfClosing;
        org.jsoup.parser.Token.Tag tag4 = endTag1.name("");
        endTag1.tagName = "hi!";
        java.lang.String str7 = endTag1.name();
        java.lang.String str8 = endTag1.toString();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(tag4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "</hi!>" + "'", str8, "</hi!>");
    }

    @Test
    public void test3172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3172");
        org.jsoup.parser.Token.StartTag startTag1 = new org.jsoup.parser.Token.StartTag("<hi!>");
        org.jsoup.nodes.Attributes attributes2 = null;
        startTag1.attributes = attributes2;
        boolean boolean4 = startTag1.isCharacter();
        startTag1.tagName = "<Doctype>";
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test3173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3173");
        org.jsoup.parser.Token.StartTag startTag1 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes2 = startTag1.attributes;
        org.jsoup.parser.Token.StartTag startTag3 = new org.jsoup.parser.Token.StartTag("<Doctype>", attributes2);
        startTag3.appendAttributeValue("</hi!>");
        startTag3.selfClosing = false;
        org.jsoup.nodes.Attributes attributes8 = startTag3.attributes;
        startTag3.appendTagName("<<Doctype>>");
        org.junit.Assert.assertNotNull(attributes2);
        org.junit.Assert.assertNotNull(attributes8);
    }

    @Test
    public void test3174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3174");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        boolean boolean1 = doctype0.forceQuirks;
        java.lang.String str2 = doctype0.getName();
        boolean boolean3 = doctype0.isEndTag();
        boolean boolean4 = doctype0.isForceQuirks();
        org.jsoup.parser.Token.Doctype doctype5 = doctype0.asDoctype();
        java.lang.String str6 = doctype5.getName();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(doctype5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test3175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3175");
        org.jsoup.parser.Token.StartTag startTag1 = new org.jsoup.parser.Token.StartTag();
        startTag1.appendAttributeName('a');
        startTag1.newAttribute();
        org.jsoup.parser.Token.TokenType tokenType5 = startTag1.type;
        org.jsoup.parser.Token.EOF eOF6 = new org.jsoup.parser.Token.EOF();
        org.jsoup.parser.Token.TokenType tokenType7 = eOF6.type;
        org.jsoup.parser.Token.TokenType tokenType8 = eOF6.type;
        startTag1.type = tokenType8;
        org.jsoup.nodes.Attributes attributes10 = startTag1.attributes;
        org.jsoup.parser.Token.StartTag startTag11 = new org.jsoup.parser.Token.StartTag("", attributes10);
        startTag11.finaliseTag();
        org.junit.Assert.assertTrue("'" + tokenType5 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType5.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertTrue("'" + tokenType7 + "' != '" + org.jsoup.parser.Token.TokenType.EOF + "'", tokenType7.equals(org.jsoup.parser.Token.TokenType.EOF));
        org.junit.Assert.assertTrue("'" + tokenType8 + "' != '" + org.jsoup.parser.Token.TokenType.EOF + "'", tokenType8.equals(org.jsoup.parser.Token.TokenType.EOF));
        org.junit.Assert.assertNotNull(attributes10);
    }

    @Test
    public void test3176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3176");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("hi!");
        boolean boolean2 = endTag1.selfClosing;
        endTag1.finaliseTag();
        java.lang.String str4 = endTag1.toString();
        java.lang.String str5 = endTag1.tokenType();
        java.lang.String str6 = endTag1.toString();
        endTag1.appendAttributeName("Comment");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "</hi!>" + "'", str4, "</hi!>");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "EndTag" + "'", str5, "EndTag");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "</hi!>" + "'", str6, "</hi!>");
    }

    @Test
    public void test3177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3177");
        org.jsoup.nodes.Attributes attributes3 = null;
        org.jsoup.parser.Token.StartTag startTag4 = new org.jsoup.parser.Token.StartTag("", attributes3);
        startTag4.selfClosing = false;
        startTag4.appendTagName("</hi!>");
        startTag4.newAttribute();
        org.jsoup.nodes.Attributes attributes10 = startTag4.getAttributes();
        org.jsoup.parser.Token.StartTag startTag11 = new org.jsoup.parser.Token.StartTag("Doctype", attributes10);
        org.jsoup.parser.Token.StartTag startTag12 = new org.jsoup.parser.Token.StartTag("hi!", attributes10);
        org.jsoup.parser.Token.StartTag startTag13 = startTag12.asStartTag();
        java.lang.String str14 = startTag12.tagName;
        org.junit.Assert.assertNotNull(attributes10);
        org.junit.Assert.assertNotNull(startTag13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test3178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3178");
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
        org.jsoup.parser.Token.Doctype doctype41 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str42 = doctype41.tokenType();
        boolean boolean43 = doctype41.isForceQuirks();
        java.lang.String str44 = doctype41.getPublicIdentifier();
        java.lang.String str45 = doctype41.getSystemIdentifier();
        java.lang.String str46 = doctype41.tokenType();
        org.jsoup.parser.Token.EndTag endTag48 = new org.jsoup.parser.Token.EndTag("hi!");
        boolean boolean49 = endTag48.selfClosing;
        java.lang.String str50 = endTag48.toString();
        java.lang.String str51 = endTag48.toString();
        boolean boolean52 = endTag48.isEOF();
        org.jsoup.parser.Token.Doctype doctype53 = new org.jsoup.parser.Token.Doctype();
        java.lang.StringBuilder stringBuilder54 = doctype53.name;
        org.jsoup.parser.Token.TokenType tokenType55 = org.jsoup.parser.Token.TokenType.StartTag;
        doctype53.type = tokenType55;
        endTag48.type = tokenType55;
        doctype41.type = tokenType55;
        boolean boolean59 = doctype41.forceQuirks;
        boolean boolean60 = doctype41.isComment();
        boolean boolean61 = doctype41.isStartTag();
        java.lang.String str62 = doctype41.getSystemIdentifier();
        java.lang.StringBuilder stringBuilder63 = doctype41.publicIdentifier;
        java.lang.StringBuilder stringBuilder64 = doctype41.name;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean65 = xmlTreeBuilder0.process((org.jsoup.parser.Token) doctype41);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$Doctype cannot be cast to class org.jsoup.parser.Token$StartTag (org.jsoup.parser.Token$Doctype and org.jsoup.parser.Token$StartTag are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "Doctype" + "'", str42, "Doctype");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "Doctype" + "'", str46, "Doctype");
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "</hi!>" + "'", str50, "</hi!>");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "</hi!>" + "'", str51, "</hi!>");
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(stringBuilder54);
        org.junit.Assert.assertEquals(stringBuilder54.toString(), "");
        org.junit.Assert.assertTrue("'" + tokenType55 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType55.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "" + "'", str62, "");
        org.junit.Assert.assertNotNull(stringBuilder63);
        org.junit.Assert.assertEquals(stringBuilder63.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder64);
        org.junit.Assert.assertEquals(stringBuilder64.toString(), "");
    }

    @Test
    public void test3179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3179");
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
        java.lang.StringBuilder stringBuilder19 = doctype0.systemIdentifier;
        org.jsoup.parser.Token.EndTag endTag21 = new org.jsoup.parser.Token.EndTag("<hi!>");
        endTag21.selfClosing = false;
        endTag21.appendAttributeValue("EOF");
        endTag21.appendAttributeName('#');
        org.jsoup.parser.Token.TokenType tokenType28 = endTag21.type;
        doctype0.type = tokenType28;
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
        org.junit.Assert.assertTrue("'" + tokenType28 + "' != '" + org.jsoup.parser.Token.TokenType.EndTag + "'", tokenType28.equals(org.jsoup.parser.Token.TokenType.EndTag));
    }

    @Test
    public void test3180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3180");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.tokenType();
        boolean boolean2 = doctype0.isForceQuirks();
        java.lang.String str3 = doctype0.getPublicIdentifier();
        boolean boolean4 = doctype0.isForceQuirks();
        boolean boolean5 = doctype0.isForceQuirks();
        boolean boolean6 = doctype0.isComment();
        doctype0.forceQuirks = false;
        boolean boolean9 = doctype0.isStartTag();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Doctype" + "'", str1, "Doctype");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test3181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3181");
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
        boolean boolean11 = doctype0.forceQuirks;
        java.lang.StringBuilder stringBuilder12 = doctype0.systemIdentifier;
        boolean boolean13 = doctype0.isStartTag();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.EndTag endTag14 = doctype0.asEndTag();
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
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(stringBuilder8);
        org.junit.Assert.assertEquals(stringBuilder8.toString(), "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(stringBuilder12);
        org.junit.Assert.assertEquals(stringBuilder12.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test3182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3182");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        boolean boolean1 = doctype0.forceQuirks;
        java.lang.StringBuilder stringBuilder2 = doctype0.systemIdentifier;
        boolean boolean3 = doctype0.isCharacter();
        java.lang.StringBuilder stringBuilder4 = doctype0.systemIdentifier;
        boolean boolean5 = doctype0.isForceQuirks();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test3183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3183");
        org.jsoup.parser.Token.StartTag startTag1 = new org.jsoup.parser.Token.StartTag("<hi!>");
        org.jsoup.parser.Token.StartTag startTag2 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag4 = startTag2.name("hi!");
        org.jsoup.nodes.Attributes attributes5 = tag4.attributes;
        startTag1.attributes = attributes5;
        org.jsoup.parser.Token.Tag tag8 = startTag1.name("");
        org.jsoup.parser.Token.TokenType tokenType9 = tag8.type;
        org.junit.Assert.assertNotNull(tag4);
        org.junit.Assert.assertNotNull(attributes5);
        org.junit.Assert.assertNotNull(tag8);
        org.junit.Assert.assertTrue("'" + tokenType9 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType9.equals(org.jsoup.parser.Token.TokenType.StartTag));
    }

    @Test
    public void test3184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3184");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("hi!");
        java.lang.String str2 = endTag1.toString();
        java.lang.String str3 = endTag1.toString();
        boolean boolean4 = endTag1.isDoctype();
        java.lang.String str5 = endTag1.tagName;
        endTag1.appendAttributeName("<!---->");
        org.jsoup.parser.Token.EndTag endTag8 = endTag1.asEndTag();
        endTag8.newAttribute();
        boolean boolean10 = endTag8.isCharacter();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "</hi!>" + "'", str2, "</hi!>");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "</hi!>" + "'", str3, "</hi!>");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(endTag8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test3185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3185");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        boolean boolean1 = doctype0.forceQuirks;
        java.lang.String str2 = doctype0.getName();
        boolean boolean3 = doctype0.isEndTag();
        java.lang.String str4 = doctype0.getName();
        boolean boolean5 = doctype0.isForceQuirks();
        doctype0.forceQuirks = false;
        org.jsoup.parser.Token.Doctype doctype8 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str9 = doctype8.tokenType();
        doctype8.forceQuirks = true;
        java.lang.String str12 = doctype8.getSystemIdentifier();
        boolean boolean13 = doctype8.forceQuirks;
        java.lang.String str14 = doctype8.tokenType();
        java.lang.StringBuilder stringBuilder15 = doctype8.publicIdentifier;
        org.jsoup.parser.Token.TokenType tokenType16 = doctype8.type;
        doctype0.type = tokenType16;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Doctype" + "'", str9, "Doctype");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Doctype" + "'", str14, "Doctype");
        org.junit.Assert.assertNotNull(stringBuilder15);
        org.junit.Assert.assertEquals(stringBuilder15.toString(), "");
        org.junit.Assert.assertTrue("'" + tokenType16 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType16.equals(org.jsoup.parser.Token.TokenType.Doctype));
    }

    @Test
    public void test3186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3186");
        org.jsoup.parser.Token.Character character1 = new org.jsoup.parser.Token.Character("</hi!>");
        java.lang.String str2 = character1.toString();
        boolean boolean3 = character1.isCharacter();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "</hi!>" + "'", str2, "</hi!>");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test3187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3187");
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
        org.jsoup.parser.Token.Comment comment17 = new org.jsoup.parser.Token.Comment();
        java.lang.StringBuilder stringBuilder18 = comment17.data;
        xmlTreeBuilder0.insert(comment17);
        org.jsoup.parser.Token.Comment comment20 = new org.jsoup.parser.Token.Comment();
        java.lang.StringBuilder stringBuilder21 = comment20.data;
        org.jsoup.parser.Token.TokenType tokenType22 = org.jsoup.parser.Token.TokenType.Comment;
        comment20.type = tokenType22;
        xmlTreeBuilder0.insert(comment20);
        java.lang.String str25 = comment20.toString();
        java.lang.String str26 = comment20.getData();
        java.lang.String str27 = comment20.toString();
        org.junit.Assert.assertNotNull(tag7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(stringBuilder18);
        org.junit.Assert.assertEquals(stringBuilder18.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder21);
        org.junit.Assert.assertEquals(stringBuilder21.toString(), "");
        org.junit.Assert.assertTrue("'" + tokenType22 + "' != '" + org.jsoup.parser.Token.TokenType.Comment + "'", tokenType22.equals(org.jsoup.parser.Token.TokenType.Comment));
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "<!---->" + "'", str25, "<!---->");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "<!---->" + "'", str27, "<!---->");
    }

    @Test
    public void test3188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3188");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        boolean boolean1 = doctype0.forceQuirks;
        java.lang.StringBuilder stringBuilder2 = doctype0.systemIdentifier;
        boolean boolean3 = doctype0.isCharacter();
        doctype0.forceQuirks = false;
        java.lang.StringBuilder stringBuilder6 = doctype0.publicIdentifier;
        java.lang.StringBuilder stringBuilder7 = doctype0.systemIdentifier;
        java.lang.String str8 = doctype0.getPublicIdentifier();
        boolean boolean9 = doctype0.isEndTag();
        java.lang.StringBuilder stringBuilder10 = doctype0.systemIdentifier;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder7);
        org.junit.Assert.assertEquals(stringBuilder7.toString(), "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(stringBuilder10);
        org.junit.Assert.assertEquals(stringBuilder10.toString(), "");
    }

    @Test
    public void test3189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3189");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        xmlTreeBuilder0.initialiseParse("</hi!>", "EOF", parseErrorList3);
        org.jsoup.parser.Token.StartTag startTag5 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag7 = startTag5.name("hi!");
        boolean boolean8 = xmlTreeBuilder0.process((org.jsoup.parser.Token) startTag5);
        org.jsoup.parser.Token.EndTag endTag10 = new org.jsoup.parser.Token.EndTag("hi!");
        java.lang.String str11 = endTag10.toString();
        java.lang.String str12 = endTag10.toString();
        boolean boolean13 = endTag10.isDoctype();
        endTag10.appendAttributeName("EOF");
        boolean boolean16 = endTag10.isStartTag();
        endTag10.appendAttributeName('#');
        boolean boolean19 = endTag10.isEOF();
        java.lang.String str20 = endTag10.toString();
        boolean boolean21 = xmlTreeBuilder0.process((org.jsoup.parser.Token) endTag10);
        java.lang.String str22 = endTag10.name();
        org.jsoup.parser.Token.StartTag startTag25 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag27 = startTag25.name("hi!");
        org.jsoup.nodes.Attributes attributes28 = tag27.attributes;
        org.jsoup.parser.Token.StartTag startTag29 = new org.jsoup.parser.Token.StartTag("</hi!>", attributes28);
        org.jsoup.parser.Token.StartTag startTag30 = new org.jsoup.parser.Token.StartTag("", attributes28);
        startTag30.appendAttributeName('a');
        java.lang.String str33 = startTag30.tokenType();
        org.jsoup.parser.Token.StartTag startTag34 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag36 = startTag34.name("hi!");
        org.jsoup.nodes.Attributes attributes37 = tag36.attributes;
        org.jsoup.parser.Token.Tag tag39 = tag36.name("<</hi!>>");
        org.jsoup.nodes.Attributes attributes40 = tag36.attributes;
        org.jsoup.nodes.Attributes attributes41 = tag36.attributes;
        startTag30.attributes = attributes41;
        endTag10.attributes = attributes41;
        org.junit.Assert.assertNotNull(tag7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "</hi!>" + "'", str11, "</hi!>");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "</hi!>" + "'", str12, "</hi!>");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "</hi!>" + "'", str20, "</hi!>");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertNotNull(tag27);
        org.junit.Assert.assertNotNull(attributes28);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "StartTag" + "'", str33, "StartTag");
        org.junit.Assert.assertNotNull(tag36);
        org.junit.Assert.assertNotNull(attributes37);
        org.junit.Assert.assertNotNull(tag39);
        org.junit.Assert.assertNotNull(attributes40);
        org.junit.Assert.assertNotNull(attributes41);
    }

    @Test
    public void test3190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3190");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        boolean boolean1 = doctype0.forceQuirks;
        java.lang.StringBuilder stringBuilder2 = doctype0.systemIdentifier;
        boolean boolean3 = doctype0.isCharacter();
        doctype0.forceQuirks = false;
        java.lang.String str6 = doctype0.getPublicIdentifier();
        java.lang.String str7 = doctype0.getName();
        boolean boolean8 = doctype0.isForceQuirks();
        boolean boolean9 = doctype0.forceQuirks;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test3191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3191");
        org.jsoup.parser.Token.StartTag startTag2 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag4 = startTag2.name("hi!");
        org.jsoup.nodes.Attributes attributes5 = tag4.attributes;
        org.jsoup.parser.Token.StartTag startTag6 = new org.jsoup.parser.Token.StartTag("</hi!>", attributes5);
        org.jsoup.parser.Token.StartTag startTag7 = new org.jsoup.parser.Token.StartTag("", attributes5);
        startTag7.appendAttributeName('a');
        startTag7.appendAttributeName(' ');
        startTag7.appendTagName("<</hi! >>");
        java.lang.String str14 = startTag7.toString();
        startTag7.appendAttributeName('a');
        org.junit.Assert.assertNotNull(tag4);
        org.junit.Assert.assertNotNull(attributes5);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "<<</hi! >>>" + "'", str14, "<<</hi! >>>");
    }

    @Test
    public void test3192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3192");
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
        java.lang.String str16 = startTag10.toString();
        org.junit.Assert.assertNotNull(attributes9);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "<Doctype>" + "'", str16, "<Doctype>");
    }

    @Test
    public void test3193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3193");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("hi!");
        java.lang.String str2 = endTag1.toString();
        endTag1.appendTagName('#');
        endTag1.appendAttributeValue('#');
        boolean boolean7 = endTag1.isSelfClosing();
        boolean boolean8 = endTag1.isDoctype();
        java.lang.String str9 = endTag1.toString();
        endTag1.tagName = "</hi!<4>>";
        boolean boolean12 = endTag1.isCharacter();
        org.jsoup.parser.Token.StartTag startTag14 = new org.jsoup.parser.Token.StartTag("StartTag");
        org.jsoup.nodes.Attributes attributes15 = startTag14.getAttributes();
        java.lang.String str16 = startTag14.tagName;
        java.lang.String str17 = startTag14.toString();
        org.jsoup.parser.Token.TokenType tokenType18 = startTag14.type;
        endTag1.type = tokenType18;
        java.lang.String str20 = endTag1.toString();
        java.lang.String str21 = endTag1.tagName;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "</hi!>" + "'", str2, "</hi!>");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "</hi!#>" + "'", str9, "</hi!#>");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(attributes15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "StartTag" + "'", str16, "StartTag");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "<StartTag>" + "'", str17, "<StartTag>");
        org.junit.Assert.assertTrue("'" + tokenType18 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType18.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "</</hi!<4>>>" + "'", str20, "</</hi!<4>>>");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "</hi!<4>>" + "'", str21, "</hi!<4>>");
    }

    @Test
    public void test3194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3194");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("hi!");
        boolean boolean2 = endTag1.selfClosing;
        org.jsoup.parser.Token.Tag tag4 = endTag1.name("");
        boolean boolean5 = endTag1.isEndTag();
        org.jsoup.parser.Token.Tag tag7 = endTag1.name("<4>");
        org.jsoup.nodes.Attributes attributes8 = endTag1.getAttributes();
        java.lang.String str9 = endTag1.tagName;
        endTag1.appendAttributeName("</hi!>4");
        org.jsoup.parser.Token.EndTag endTag12 = endTag1.asEndTag();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(tag4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(tag7);
        org.junit.Assert.assertNull(attributes8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<4>" + "'", str9, "<4>");
        org.junit.Assert.assertNotNull(endTag12);
    }

    @Test
    public void test3195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3195");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        xmlTreeBuilder0.initialiseParse("</hi!>", "EOF", parseErrorList3);
        org.jsoup.parser.ParseErrorList parseErrorList7 = null;
        xmlTreeBuilder0.initialiseParse("hi!a", "</hi!>", parseErrorList7);
        org.jsoup.parser.Token.StartTag startTag9 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag11 = startTag9.name("hi!");
        startTag9.finaliseTag();
        org.jsoup.nodes.Element element13 = xmlTreeBuilder0.insert(startTag9);
        org.jsoup.parser.Token.Character character15 = new org.jsoup.parser.Token.Character("EOF");
        java.lang.String str16 = character15.toString();
        java.lang.String str17 = character15.toString();
        java.lang.String str18 = character15.toString();
        xmlTreeBuilder0.insert(character15);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder20 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList23 = null;
        xmlTreeBuilder20.initialiseParse("</hi!>", "EOF", parseErrorList23);
        org.jsoup.parser.Token.StartTag startTag25 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag27 = startTag25.name("hi!");
        boolean boolean28 = xmlTreeBuilder20.process((org.jsoup.parser.Token) startTag25);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder29 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList32 = null;
        xmlTreeBuilder29.initialiseParse("Character", "hi!", parseErrorList32);
        org.jsoup.parser.Token.Comment comment34 = new org.jsoup.parser.Token.Comment();
        java.lang.StringBuilder stringBuilder35 = comment34.data;
        java.lang.String str36 = comment34.getData();
        xmlTreeBuilder29.insert(comment34);
        org.jsoup.parser.Token.StartTag startTag38 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag40 = startTag38.name("hi!");
        startTag38.appendAttributeName(' ');
        boolean boolean43 = startTag38.isComment();
        org.jsoup.nodes.Element element44 = xmlTreeBuilder29.insert(startTag38);
        org.jsoup.parser.Token.StartTag startTag46 = new org.jsoup.parser.Token.StartTag("Doctype");
        java.lang.String str47 = startTag46.name();
        boolean boolean48 = xmlTreeBuilder29.process((org.jsoup.parser.Token) startTag46);
        org.jsoup.parser.Token.Comment comment49 = new org.jsoup.parser.Token.Comment();
        java.lang.StringBuilder stringBuilder50 = comment49.data;
        java.lang.String str51 = comment49.getData();
        java.lang.StringBuilder stringBuilder52 = comment49.data;
        xmlTreeBuilder29.insert(comment49);
        java.lang.String str54 = comment49.getData();
        xmlTreeBuilder20.insert(comment49);
        xmlTreeBuilder0.insert(comment49);
        org.jsoup.nodes.Attributes attributes58 = null;
        org.jsoup.parser.Token.StartTag startTag59 = new org.jsoup.parser.Token.StartTag("", attributes58);
        startTag59.selfClosing = false;
        startTag59.appendTagName("</hi!>");
        startTag59.newAttribute();
        startTag59.appendTagName('4');
        boolean boolean67 = startTag59.isStartTag();
        org.jsoup.nodes.Element element68 = xmlTreeBuilder0.insert(startTag59);
        boolean boolean69 = startTag59.isCharacter();
        org.junit.Assert.assertNotNull(tag11);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "EOF" + "'", str16, "EOF");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "EOF" + "'", str17, "EOF");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "EOF" + "'", str18, "EOF");
        org.junit.Assert.assertNotNull(tag27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(stringBuilder35);
        org.junit.Assert.assertEquals(stringBuilder35.toString(), "");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertNotNull(tag40);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(element44);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "Doctype" + "'", str47, "Doctype");
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNotNull(stringBuilder50);
        org.junit.Assert.assertEquals(stringBuilder50.toString(), "");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
        org.junit.Assert.assertNotNull(stringBuilder52);
        org.junit.Assert.assertEquals(stringBuilder52.toString(), "");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "" + "'", str54, "");
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertNotNull(element68);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
    }

    @Test
    public void test3196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3196");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.Token.EOF eOF1 = new org.jsoup.parser.Token.EOF();
        java.lang.String str2 = eOF1.tokenType();
        boolean boolean3 = xmlTreeBuilder0.process((org.jsoup.parser.Token) eOF1);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder4 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList7 = null;
        xmlTreeBuilder4.initialiseParse("</hi!>", "EOF", parseErrorList7);
        org.jsoup.parser.Token.StartTag startTag9 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag11 = startTag9.name("hi!");
        boolean boolean12 = xmlTreeBuilder4.process((org.jsoup.parser.Token) startTag9);
        org.jsoup.parser.Token.StartTag startTag13 = new org.jsoup.parser.Token.StartTag();
        startTag13.appendTagName('4');
        org.jsoup.nodes.Element element16 = xmlTreeBuilder4.insert(startTag13);
        org.jsoup.parser.Token.Character character18 = new org.jsoup.parser.Token.Character("EOF");
        java.lang.String str19 = character18.getData();
        java.lang.String str20 = character18.toString();
        boolean boolean21 = character18.isStartTag();
        java.lang.String str22 = character18.getData();
        java.lang.String str23 = character18.toString();
        org.jsoup.parser.Token.Character character24 = character18.asCharacter();
        java.lang.String str25 = character18.toString();
        java.lang.String str26 = character18.toString();
        xmlTreeBuilder4.insert(character18);
        org.jsoup.parser.Token.Character character29 = new org.jsoup.parser.Token.Character("EOF");
        java.lang.String str30 = character29.getData();
        java.lang.String str31 = character29.toString();
        boolean boolean32 = character29.isStartTag();
        java.lang.String str33 = character29.getData();
        java.lang.String str34 = character29.toString();
        xmlTreeBuilder4.insert(character29);
        org.jsoup.parser.Token.Comment comment36 = new org.jsoup.parser.Token.Comment();
        xmlTreeBuilder4.insert(comment36);
        java.lang.String str38 = comment36.toString();
        // The following exception was thrown during execution in test generation
        try {
            xmlTreeBuilder0.insert(comment36);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "EOF" + "'", str2, "EOF");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(tag11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "EOF" + "'", str19, "EOF");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "EOF" + "'", str20, "EOF");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "EOF" + "'", str22, "EOF");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "EOF" + "'", str23, "EOF");
        org.junit.Assert.assertNotNull(character24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "EOF" + "'", str25, "EOF");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "EOF" + "'", str26, "EOF");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "EOF" + "'", str30, "EOF");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "EOF" + "'", str31, "EOF");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "EOF" + "'", str33, "EOF");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "EOF" + "'", str34, "EOF");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "<!---->" + "'", str38, "<!---->");
    }

    @Test
    public void test3197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3197");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.parser.Token.StartTag startTag3 = new org.jsoup.parser.Token.StartTag("", attributes2);
        boolean boolean4 = startTag3.isDoctype();
        java.lang.String str5 = startTag3.tagName;
        org.jsoup.parser.Token.TokenType tokenType6 = startTag3.type;
        startTag3.appendTagName(' ');
        boolean boolean9 = startTag3.isDoctype();
        org.jsoup.parser.Token.StartTag startTag11 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag13 = startTag11.name("hi!");
        org.jsoup.nodes.Attributes attributes14 = tag13.attributes;
        org.jsoup.parser.Token.StartTag startTag15 = new org.jsoup.parser.Token.StartTag("", attributes14);
        startTag3.attributes = attributes14;
        org.jsoup.parser.Token.StartTag startTag17 = new org.jsoup.parser.Token.StartTag("<4> ", attributes14);
        startTag17.appendAttributeValue('a');
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Doctype doctype20 = startTag17.asDoctype();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$Doctype (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$Doctype are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + tokenType6 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType6.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(tag13);
        org.junit.Assert.assertNotNull(attributes14);
    }

    @Test
    public void test3198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3198");
        org.jsoup.parser.Token.StartTag startTag1 = new org.jsoup.parser.Token.StartTag("Doctype");
        java.lang.String str2 = startTag1.toString();
        boolean boolean3 = startTag1.isEndTag();
        org.jsoup.nodes.Attributes attributes4 = startTag1.getAttributes();
        startTag1.appendAttributeName('a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "<Doctype>" + "'", str2, "<Doctype>");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(attributes4);
    }

    @Test
    public void test3199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3199");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.Token.EOF eOF1 = new org.jsoup.parser.Token.EOF();
        java.lang.String str2 = eOF1.tokenType();
        boolean boolean3 = xmlTreeBuilder0.process((org.jsoup.parser.Token) eOF1);
        org.jsoup.parser.Token.StartTag startTag5 = new org.jsoup.parser.Token.StartTag("</hi!#>");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = xmlTreeBuilder0.process((org.jsoup.parser.Token) startTag5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "EOF" + "'", str2, "EOF");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test3200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3200");
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
        org.jsoup.parser.Token.Comment comment31 = new org.jsoup.parser.Token.Comment();
        java.lang.StringBuilder stringBuilder32 = comment31.data;
        java.lang.String str33 = comment31.getData();
        java.lang.StringBuilder stringBuilder34 = comment31.data;
        java.lang.String str35 = comment31.toString();
        xmlTreeBuilder0.insert(comment31);
        java.lang.String str37 = comment31.toString();
        java.lang.String str38 = comment31.getData();
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(tag11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(tag24);
        org.junit.Assert.assertNotNull(attributes25);
        org.junit.Assert.assertNotNull(element30);
        org.junit.Assert.assertNotNull(stringBuilder32);
        org.junit.Assert.assertEquals(stringBuilder32.toString(), "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertNotNull(stringBuilder34);
        org.junit.Assert.assertEquals(stringBuilder34.toString(), "");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "<!---->" + "'", str35, "<!---->");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "<!---->" + "'", str37, "<!---->");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
    }

    @Test
    public void test3201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3201");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("hi!");
        boolean boolean2 = endTag1.selfClosing;
        endTag1.finaliseTag();
        endTag1.appendAttributeName(' ');
        endTag1.tagName = "Doctype";
        endTag1.appendTagName('4');
        java.lang.String str10 = endTag1.toString();
        boolean boolean11 = endTag1.isDoctype();
        endTag1.tagName = "Character";
        org.jsoup.parser.Token.StartTag startTag14 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag16 = startTag14.name("hi!");
        tag16.finaliseTag();
        tag16.newAttribute();
        org.jsoup.nodes.Attributes attributes19 = tag16.attributes;
        tag16.appendAttributeValue("");
        boolean boolean22 = tag16.isEOF();
        org.jsoup.nodes.Attributes attributes24 = null;
        org.jsoup.parser.Token.StartTag startTag25 = new org.jsoup.parser.Token.StartTag("", attributes24);
        boolean boolean26 = startTag25.isDoctype();
        java.lang.String str27 = startTag25.tagName;
        startTag25.selfClosing = false;
        org.jsoup.parser.Token.Doctype doctype30 = new org.jsoup.parser.Token.Doctype();
        java.lang.StringBuilder stringBuilder31 = doctype30.name;
        org.jsoup.parser.Token.TokenType tokenType32 = org.jsoup.parser.Token.TokenType.StartTag;
        doctype30.type = tokenType32;
        startTag25.type = tokenType32;
        tag16.type = tokenType32;
        endTag1.type = tokenType32;
        org.jsoup.parser.Token.StartTag startTag38 = new org.jsoup.parser.Token.StartTag("StartTag");
        org.jsoup.parser.Token.TokenType tokenType39 = startTag38.type;
        endTag1.type = tokenType39;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "</Doctype4>" + "'", str10, "</Doctype4>");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(tag16);
        org.junit.Assert.assertNotNull(attributes19);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(stringBuilder31);
        org.junit.Assert.assertEquals(stringBuilder31.toString(), "");
        org.junit.Assert.assertTrue("'" + tokenType32 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType32.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertTrue("'" + tokenType39 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType39.equals(org.jsoup.parser.Token.TokenType.StartTag));
    }

    @Test
    public void test3202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3202");
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
        org.jsoup.parser.ParseErrorList parseErrorList59 = null;
        xmlTreeBuilder0.initialiseParse("</hi!4#>", "</</hi!>>", parseErrorList59);
        org.jsoup.parser.ParseErrorList parseErrorList63 = null;
        xmlTreeBuilder0.initialiseParse("<<</hi!>>>", "<<</hi!>>>", parseErrorList63);
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
    }

    @Test
    public void test3203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3203");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.tokenType();
        boolean boolean2 = doctype0.isForceQuirks();
        java.lang.String str3 = doctype0.getPublicIdentifier();
        boolean boolean4 = doctype0.isForceQuirks();
        doctype0.forceQuirks = true;
        org.jsoup.parser.Token.Doctype doctype7 = doctype0.asDoctype();
        java.lang.StringBuilder stringBuilder8 = doctype7.systemIdentifier;
        java.lang.String str9 = doctype7.tokenType();
        boolean boolean10 = doctype7.forceQuirks;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Doctype" + "'", str1, "Doctype");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(doctype7);
        org.junit.Assert.assertNotNull(stringBuilder8);
        org.junit.Assert.assertEquals(stringBuilder8.toString(), "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Doctype" + "'", str9, "Doctype");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test3204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3204");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.tokenType();
        boolean boolean2 = doctype0.isForceQuirks();
        java.lang.String str3 = doctype0.getPublicIdentifier();
        java.lang.String str4 = doctype0.getSystemIdentifier();
        java.lang.String str5 = doctype0.getPublicIdentifier();
        java.lang.String str6 = doctype0.getName();
        java.lang.StringBuilder stringBuilder7 = doctype0.name;
        java.lang.String str8 = doctype0.getPublicIdentifier();
        doctype0.forceQuirks = false;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Comment comment11 = doctype0.asComment();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$Doctype cannot be cast to class org.jsoup.parser.Token$Comment (org.jsoup.parser.Token$Doctype and org.jsoup.parser.Token$Comment are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Doctype" + "'", str1, "Doctype");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(stringBuilder7);
        org.junit.Assert.assertEquals(stringBuilder7.toString(), "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test3205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3205");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("hi!");
        java.lang.String str2 = endTag1.toString();
        java.lang.String str3 = endTag1.toString();
        boolean boolean4 = endTag1.isDoctype();
        endTag1.appendAttributeName("EOF");
        boolean boolean7 = endTag1.isStartTag();
        boolean boolean8 = endTag1.isCharacter();
        java.lang.String str9 = endTag1.name();
        java.lang.String str10 = endTag1.tagName;
        java.lang.String str11 = endTag1.tagName;
        endTag1.appendTagName("</Character4>");
        org.jsoup.parser.Token.Character character15 = new org.jsoup.parser.Token.Character("EOF");
        java.lang.String str16 = character15.toString();
        java.lang.String str17 = character15.toString();
        java.lang.String str18 = character15.toString();
        boolean boolean19 = character15.isEOF();
        boolean boolean20 = character15.isEOF();
        org.jsoup.parser.Token.StartTag startTag24 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag26 = startTag24.name("hi!");
        org.jsoup.nodes.Attributes attributes27 = tag26.attributes;
        org.jsoup.parser.Token.StartTag startTag28 = new org.jsoup.parser.Token.StartTag("</hi!>", attributes27);
        org.jsoup.parser.Token.StartTag startTag29 = new org.jsoup.parser.Token.StartTag("", attributes27);
        org.jsoup.parser.Token.StartTag startTag30 = new org.jsoup.parser.Token.StartTag("hi!", attributes27);
        org.jsoup.parser.Token.TokenType tokenType31 = startTag30.type;
        org.jsoup.parser.Token.TokenType tokenType32 = startTag30.type;
        character15.type = tokenType32;
        endTag1.type = tokenType32;
        endTag1.appendAttributeValue('a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "</hi!>" + "'", str2, "</hi!>");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "</hi!>" + "'", str3, "</hi!>");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "EOF" + "'", str16, "EOF");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "EOF" + "'", str17, "EOF");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "EOF" + "'", str18, "EOF");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(tag26);
        org.junit.Assert.assertNotNull(attributes27);
        org.junit.Assert.assertTrue("'" + tokenType31 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType31.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertTrue("'" + tokenType32 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType32.equals(org.jsoup.parser.Token.TokenType.StartTag));
    }

    @Test
    public void test3206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3206");
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
        org.jsoup.parser.Token.StartTag startTag14 = new org.jsoup.parser.Token.StartTag("EndTag", attributes11);
        java.lang.String str15 = startTag14.tokenType();
        org.jsoup.nodes.Attributes attributes16 = startTag14.getAttributes();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "</hi!>" + "'", str3, "</hi!>");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "</hi!>" + "'", str4, "</hi!>");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(tag10);
        org.junit.Assert.assertNotNull(attributes11);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "StartTag" + "'", str15, "StartTag");
        org.junit.Assert.assertNotNull(attributes16);
    }

    @Test
    public void test3207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3207");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        boolean boolean1 = doctype0.forceQuirks;
        java.lang.StringBuilder stringBuilder2 = doctype0.systemIdentifier;
        boolean boolean3 = doctype0.isCharacter();
        doctype0.forceQuirks = false;
        java.lang.StringBuilder stringBuilder6 = doctype0.publicIdentifier;
        boolean boolean7 = doctype0.forceQuirks;
        org.jsoup.parser.Token.Doctype doctype8 = doctype0.asDoctype();
        java.lang.StringBuilder stringBuilder9 = doctype0.publicIdentifier;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(doctype8);
        org.junit.Assert.assertNotNull(stringBuilder9);
        org.junit.Assert.assertEquals(stringBuilder9.toString(), "");
    }

    @Test
    public void test3208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3208");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.appendAttributeName('a');
        java.lang.String str3 = startTag0.tagName;
        org.jsoup.parser.Token.Tag tag5 = startTag0.name("EndTag");
        java.lang.String str6 = startTag0.tagName;
        java.lang.String str7 = startTag0.toString();
        startTag0.appendAttributeValue("</Doctype4Character>");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(tag5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "EndTag" + "'", str6, "EndTag");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<EndTag>" + "'", str7, "<EndTag>");
    }

    @Test
    public void test3209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3209");
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
        org.jsoup.parser.Token.Comment comment17 = new org.jsoup.parser.Token.Comment();
        java.lang.StringBuilder stringBuilder18 = comment17.data;
        xmlTreeBuilder0.insert(comment17);
        org.jsoup.parser.Token.Comment comment20 = new org.jsoup.parser.Token.Comment();
        java.lang.StringBuilder stringBuilder21 = comment20.data;
        org.jsoup.parser.Token.TokenType tokenType22 = org.jsoup.parser.Token.TokenType.Comment;
        comment20.type = tokenType22;
        xmlTreeBuilder0.insert(comment20);
        java.lang.String str25 = comment20.getData();
        java.lang.String str26 = comment20.getData();
        java.lang.StringBuilder stringBuilder27 = comment20.data;
        java.lang.StringBuilder stringBuilder28 = comment20.data;
        boolean boolean29 = comment20.isCharacter();
        java.lang.String str30 = comment20.toString();
        java.lang.String str31 = comment20.toString();
        org.junit.Assert.assertNotNull(tag7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(stringBuilder18);
        org.junit.Assert.assertEquals(stringBuilder18.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder21);
        org.junit.Assert.assertEquals(stringBuilder21.toString(), "");
        org.junit.Assert.assertTrue("'" + tokenType22 + "' != '" + org.jsoup.parser.Token.TokenType.Comment + "'", tokenType22.equals(org.jsoup.parser.Token.TokenType.Comment));
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(stringBuilder27);
        org.junit.Assert.assertEquals(stringBuilder27.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder28);
        org.junit.Assert.assertEquals(stringBuilder28.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "<!---->" + "'", str30, "<!---->");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "<!---->" + "'", str31, "<!---->");
    }

    @Test
    public void test3210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3210");
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
        startTag11.newAttribute();
        boolean boolean20 = startTag11.isComment();
        startTag11.appendAttributeName('#');
        java.lang.String str23 = startTag11.tagName;
        org.junit.Assert.assertNotNull(tag7);
        org.junit.Assert.assertNotNull(attributes8);
        org.junit.Assert.assertTrue("'" + tokenType14 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType14.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + " a" + "'", str23, " a");
    }

    @Test
    public void test3211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3211");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        boolean boolean1 = doctype0.forceQuirks;
        java.lang.StringBuilder stringBuilder2 = doctype0.systemIdentifier;
        boolean boolean3 = doctype0.forceQuirks;
        boolean boolean4 = doctype0.isStartTag();
        java.lang.StringBuilder stringBuilder5 = doctype0.systemIdentifier;
        java.lang.String str6 = doctype0.getSystemIdentifier();
        java.lang.String str7 = doctype0.getPublicIdentifier();
        java.lang.String str8 = doctype0.getPublicIdentifier();
        boolean boolean9 = doctype0.isForceQuirks();
        java.lang.String str10 = doctype0.getPublicIdentifier();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test3212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3212");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        boolean boolean1 = doctype0.forceQuirks;
        java.lang.StringBuilder stringBuilder2 = doctype0.systemIdentifier;
        boolean boolean3 = doctype0.isCharacter();
        doctype0.forceQuirks = false;
        java.lang.String str6 = doctype0.getName();
        boolean boolean7 = doctype0.isForceQuirks();
        java.lang.String str8 = doctype0.getPublicIdentifier();
        doctype0.forceQuirks = false;
        boolean boolean11 = doctype0.isCharacter();
        java.lang.StringBuilder stringBuilder12 = doctype0.publicIdentifier;
        java.lang.StringBuilder stringBuilder13 = doctype0.publicIdentifier;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(stringBuilder12);
        org.junit.Assert.assertEquals(stringBuilder12.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder13);
        org.junit.Assert.assertEquals(stringBuilder13.toString(), "");
    }

    @Test
    public void test3213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3213");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag2 = startTag0.name("hi!");
        tag2.finaliseTag();
        tag2.appendAttributeName('a');
        tag2.appendTagName("");
        org.junit.Assert.assertNotNull(tag2);
    }

    @Test
    public void test3214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3214");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.tokenType();
        java.lang.StringBuilder stringBuilder2 = doctype0.publicIdentifier;
        boolean boolean3 = doctype0.isForceQuirks();
        java.lang.StringBuilder stringBuilder4 = doctype0.name;
        doctype0.forceQuirks = false;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Doctype" + "'", str1, "Doctype");
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "");
    }

    @Test
    public void test3215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3215");
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
        startTag14.appendAttributeValue("EndTag");
        boolean boolean17 = startTag14.isEndTag();
        org.jsoup.parser.Token.StartTag startTag18 = startTag14.asStartTag();
        org.junit.Assert.assertNotNull(tag10);
        org.junit.Assert.assertNotNull(attributes11);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(startTag18);
    }

    @Test
    public void test3216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3216");
        org.jsoup.nodes.Attributes attributes1 = null;
        org.jsoup.parser.Token.StartTag startTag2 = new org.jsoup.parser.Token.StartTag("", attributes1);
        boolean boolean3 = startTag2.isDoctype();
        java.lang.String str4 = startTag2.tagName;
        startTag2.selfClosing = false;
        startTag2.appendAttributeValue('a');
        org.jsoup.nodes.Attributes attributes9 = startTag2.getAttributes();
        boolean boolean10 = startTag2.selfClosing;
        boolean boolean11 = startTag2.isComment();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(attributes9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test3217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3217");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.tokenType();
        java.lang.StringBuilder stringBuilder2 = doctype0.publicIdentifier;
        java.lang.String str3 = doctype0.getName();
        java.lang.String str4 = doctype0.getSystemIdentifier();
        doctype0.forceQuirks = true;
        java.lang.String str7 = doctype0.getSystemIdentifier();
        java.lang.StringBuilder stringBuilder8 = doctype0.publicIdentifier;
        java.lang.StringBuilder stringBuilder9 = doctype0.publicIdentifier;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Doctype" + "'", str1, "Doctype");
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(stringBuilder8);
        org.junit.Assert.assertEquals(stringBuilder8.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder9);
        org.junit.Assert.assertEquals(stringBuilder9.toString(), "");
    }

    @Test
    public void test3218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3218");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.Token.EOF eOF1 = new org.jsoup.parser.Token.EOF();
        java.lang.String str2 = eOF1.tokenType();
        boolean boolean3 = xmlTreeBuilder0.process((org.jsoup.parser.Token) eOF1);
        org.jsoup.parser.ParseErrorList parseErrorList6 = null;
        xmlTreeBuilder0.initialiseParse("", "EndTag", parseErrorList6);
        org.jsoup.parser.Token.Character character9 = new org.jsoup.parser.Token.Character("</hi!>");
        java.lang.String str10 = character9.getData();
        java.lang.String str11 = character9.toString();
        xmlTreeBuilder0.insert(character9);
        org.jsoup.parser.ParseErrorList parseErrorList15 = null;
        xmlTreeBuilder0.initialiseParse("Doctype</<4>>", "Doctype</<4>>", parseErrorList15);
        org.jsoup.parser.Token.Doctype doctype17 = new org.jsoup.parser.Token.Doctype();
        boolean boolean18 = doctype17.forceQuirks;
        java.lang.StringBuilder stringBuilder19 = doctype17.systemIdentifier;
        boolean boolean20 = doctype17.isEndTag();
        doctype17.forceQuirks = false;
        java.lang.StringBuilder stringBuilder23 = doctype17.publicIdentifier;
        boolean boolean24 = doctype17.isForceQuirks();
        // The following exception was thrown during execution in test generation
        try {
            xmlTreeBuilder0.insert(doctype17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "EOF" + "'", str2, "EOF");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "</hi!>" + "'", str10, "</hi!>");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "</hi!>" + "'", str11, "</hi!>");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(stringBuilder19);
        org.junit.Assert.assertEquals(stringBuilder19.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(stringBuilder23);
        org.junit.Assert.assertEquals(stringBuilder23.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test3219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3219");
        org.jsoup.parser.Token.Character character1 = new org.jsoup.parser.Token.Character("EOF");
        java.lang.String str2 = character1.getData();
        java.lang.String str3 = character1.toString();
        boolean boolean4 = character1.isStartTag();
        java.lang.String str5 = character1.toString();
        java.lang.String str6 = character1.toString();
        org.jsoup.parser.Token.TokenType tokenType7 = org.jsoup.parser.Token.TokenType.Comment;
        character1.type = tokenType7;
        java.lang.String str9 = character1.getData();
        java.lang.String str10 = character1.getData();
        org.jsoup.parser.Token.Character character11 = character1.asCharacter();
        java.lang.String str12 = character1.getData();
        java.lang.String str13 = character1.toString();
        java.lang.String str14 = character1.getData();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "EOF" + "'", str2, "EOF");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "EOF" + "'", str3, "EOF");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "EOF" + "'", str5, "EOF");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "EOF" + "'", str6, "EOF");
        org.junit.Assert.assertTrue("'" + tokenType7 + "' != '" + org.jsoup.parser.Token.TokenType.Comment + "'", tokenType7.equals(org.jsoup.parser.Token.TokenType.Comment));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "EOF" + "'", str9, "EOF");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "EOF" + "'", str10, "EOF");
        org.junit.Assert.assertNotNull(character11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "EOF" + "'", str12, "EOF");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "EOF" + "'", str13, "EOF");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "EOF" + "'", str14, "EOF");
    }

    @Test
    public void test3220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3220");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        boolean boolean1 = doctype0.forceQuirks;
        java.lang.StringBuilder stringBuilder2 = doctype0.systemIdentifier;
        java.lang.String str3 = doctype0.getName();
        java.lang.StringBuilder stringBuilder4 = doctype0.name;
        java.lang.StringBuilder stringBuilder5 = doctype0.name;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "");
    }

    @Test
    public void test3221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3221");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        boolean boolean1 = doctype0.forceQuirks;
        java.lang.String str2 = doctype0.getName();
        boolean boolean3 = doctype0.isEndTag();
        boolean boolean4 = doctype0.isForceQuirks();
        doctype0.forceQuirks = true;
        java.lang.String str7 = doctype0.getPublicIdentifier();
        java.lang.StringBuilder stringBuilder8 = doctype0.name;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(stringBuilder8);
        org.junit.Assert.assertEquals(stringBuilder8.toString(), "");
    }

    @Test
    public void test3222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3222");
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
        java.lang.StringBuilder stringBuilder17 = comment9.data;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Doctype doctype18 = comment9.asDoctype();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$Comment cannot be cast to class org.jsoup.parser.Token$Doctype (org.jsoup.parser.Token$Comment and org.jsoup.parser.Token$Doctype are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stringBuilder10);
        org.junit.Assert.assertEquals(stringBuilder10.toString(), "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(stringBuilder12);
        org.junit.Assert.assertEquals(stringBuilder12.toString(), "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "<!---->" + "'", str13, "<!---->");
        org.junit.Assert.assertNotNull(stringBuilder14);
        org.junit.Assert.assertEquals(stringBuilder14.toString(), "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "<!---->" + "'", str15, "<!---->");
        org.junit.Assert.assertNotNull(stringBuilder17);
        org.junit.Assert.assertEquals(stringBuilder17.toString(), "");
    }

    @Test
    public void test3223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3223");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        boolean boolean1 = doctype0.forceQuirks;
        java.lang.StringBuilder stringBuilder2 = doctype0.systemIdentifier;
        boolean boolean3 = doctype0.isCharacter();
        doctype0.forceQuirks = false;
        boolean boolean6 = doctype0.isEOF();
        java.lang.String str7 = doctype0.tokenType();
        boolean boolean8 = doctype0.isForceQuirks();
        boolean boolean9 = doctype0.isForceQuirks();
        java.lang.StringBuilder stringBuilder10 = doctype0.publicIdentifier;
        org.jsoup.parser.Token.Doctype doctype11 = doctype0.asDoctype();
        boolean boolean12 = doctype0.isForceQuirks();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Doctype" + "'", str7, "Doctype");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(stringBuilder10);
        org.junit.Assert.assertEquals(stringBuilder10.toString(), "");
        org.junit.Assert.assertNotNull(doctype11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test3224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3224");
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
        java.lang.StringBuilder stringBuilder12 = doctype0.systemIdentifier;
        java.lang.String str13 = doctype0.getPublicIdentifier();
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
        org.junit.Assert.assertNotNull(stringBuilder12);
        org.junit.Assert.assertEquals(stringBuilder12.toString(), "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test3225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3225");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("hi!");
        java.lang.String str2 = endTag1.toString();
        java.lang.String str3 = endTag1.toString();
        boolean boolean4 = endTag1.isDoctype();
        java.lang.String str5 = endTag1.tagName;
        endTag1.selfClosing = false;
        org.jsoup.parser.Token.EndTag endTag8 = endTag1.asEndTag();
        java.lang.String str9 = endTag8.toString();
        boolean boolean10 = endTag8.selfClosing;
        org.jsoup.parser.Token.TokenType tokenType11 = endTag8.type;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "</hi!>" + "'", str2, "</hi!>");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "</hi!>" + "'", str3, "</hi!>");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(endTag8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "</hi!>" + "'", str9, "</hi!>");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + tokenType11 + "' != '" + org.jsoup.parser.Token.TokenType.EndTag + "'", tokenType11.equals(org.jsoup.parser.Token.TokenType.EndTag));
    }

    @Test
    public void test3226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3226");
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
        java.lang.Class<?> wildcardClass17 = endTag1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(tag11);
        org.junit.Assert.assertTrue("'" + tokenType12 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType12.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertTrue("'" + tokenType13 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType13.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "</hi!>" + "'", str15, "</hi!>");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test3227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3227");
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
        java.lang.String str32 = character25.toString();
        java.lang.String str33 = character25.getData();
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
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "EOF" + "'", str33, "EOF");
    }

    @Test
    public void test3228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3228");
        org.jsoup.parser.Token.StartTag startTag1 = new org.jsoup.parser.Token.StartTag("</hi!>");
        java.lang.String str2 = startTag1.toString();
        java.lang.String str3 = startTag1.tokenType();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "<</hi!>>" + "'", str2, "<</hi!>>");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "StartTag" + "'", str3, "StartTag");
    }

    @Test
    public void test3229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3229");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("<!---->");
        boolean boolean2 = endTag1.selfClosing;
        endTag1.newAttribute();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3230");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.tokenType();
        boolean boolean2 = doctype0.isForceQuirks();
        java.lang.String str3 = doctype0.getPublicIdentifier();
        boolean boolean4 = doctype0.isForceQuirks();
        doctype0.forceQuirks = true;
        doctype0.forceQuirks = false;
        org.jsoup.parser.Token.TokenType tokenType9 = doctype0.type;
        doctype0.forceQuirks = true;
        doctype0.forceQuirks = true;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Doctype" + "'", str1, "Doctype");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + tokenType9 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType9.equals(org.jsoup.parser.Token.TokenType.Doctype));
    }

    @Test
    public void test3231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3231");
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
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder19 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList22 = null;
        xmlTreeBuilder19.initialiseParse("</hi!>", "EOF", parseErrorList22);
        org.jsoup.parser.Token.StartTag startTag24 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag26 = startTag24.name("hi!");
        boolean boolean27 = xmlTreeBuilder19.process((org.jsoup.parser.Token) startTag24);
        org.jsoup.parser.Token.StartTag startTag28 = new org.jsoup.parser.Token.StartTag();
        startTag28.appendTagName('4');
        org.jsoup.nodes.Element element31 = xmlTreeBuilder19.insert(startTag28);
        org.jsoup.parser.ParseErrorList parseErrorList34 = null;
        xmlTreeBuilder19.initialiseParse("Character", "Doctype", parseErrorList34);
        org.jsoup.parser.Token.Comment comment36 = new org.jsoup.parser.Token.Comment();
        java.lang.StringBuilder stringBuilder37 = comment36.data;
        xmlTreeBuilder19.insert(comment36);
        java.lang.String str39 = comment36.toString();
        java.lang.String str40 = comment36.toString();
        org.jsoup.parser.Token.TokenType tokenType41 = comment36.type;
        doctype0.type = tokenType41;
        java.lang.StringBuilder stringBuilder43 = doctype0.systemIdentifier;
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
        org.junit.Assert.assertNotNull(tag26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(element31);
        org.junit.Assert.assertNotNull(stringBuilder37);
        org.junit.Assert.assertEquals(stringBuilder37.toString(), "");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "<!---->" + "'", str39, "<!---->");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "<!---->" + "'", str40, "<!---->");
        org.junit.Assert.assertTrue("'" + tokenType41 + "' != '" + org.jsoup.parser.Token.TokenType.Comment + "'", tokenType41.equals(org.jsoup.parser.Token.TokenType.Comment));
        org.junit.Assert.assertNotNull(stringBuilder43);
        org.junit.Assert.assertEquals(stringBuilder43.toString(), "");
    }

    @Test
    public void test3232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3232");
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
        org.jsoup.parser.ParseErrorList parseErrorList27 = null;
        xmlTreeBuilder0.initialiseParse("", "</hi!>", parseErrorList27);
        org.jsoup.parser.Token.EndTag endTag30 = new org.jsoup.parser.Token.EndTag("4");
        boolean boolean31 = endTag30.selfClosing;
        boolean boolean32 = xmlTreeBuilder0.process((org.jsoup.parser.Token) endTag30);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder33 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList36 = null;
        xmlTreeBuilder33.initialiseParse("Character", "hi!", parseErrorList36);
        org.jsoup.parser.Token.Comment comment38 = new org.jsoup.parser.Token.Comment();
        java.lang.StringBuilder stringBuilder39 = comment38.data;
        java.lang.String str40 = comment38.getData();
        xmlTreeBuilder33.insert(comment38);
        org.jsoup.parser.Token.Character character43 = new org.jsoup.parser.Token.Character("<4>");
        java.lang.String str44 = character43.toString();
        boolean boolean45 = character43.isEndTag();
        xmlTreeBuilder33.insert(character43);
        xmlTreeBuilder0.insert(character43);
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
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(stringBuilder39);
        org.junit.Assert.assertEquals(stringBuilder39.toString(), "");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "<4>" + "'", str44, "<4>");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
    }

    @Test
    public void test3233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3233");
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
        java.lang.StringBuilder stringBuilder22 = doctype0.name;
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
        org.junit.Assert.assertNotNull(stringBuilder22);
        org.junit.Assert.assertEquals(stringBuilder22.toString(), "");
    }

    @Test
    public void test3234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3234");
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
        doctype0.forceQuirks = true;
        java.lang.String str14 = doctype0.getSystemIdentifier();
        java.lang.String str15 = doctype0.getSystemIdentifier();
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
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test3235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3235");
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
        org.jsoup.parser.Token.Character character25 = new org.jsoup.parser.Token.Character("EOF");
        java.lang.String str26 = character25.getData();
        boolean boolean27 = character25.isComment();
        java.lang.String str28 = character25.toString();
        java.lang.String str29 = character25.getData();
        java.lang.String str30 = character25.getData();
        java.lang.String str31 = character25.getData();
        xmlTreeBuilder0.insert(character25);
        java.lang.String str33 = character25.getData();
        java.lang.String str34 = character25.getData();
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
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "EOF" + "'", str26, "EOF");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "EOF" + "'", str28, "EOF");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "EOF" + "'", str29, "EOF");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "EOF" + "'", str30, "EOF");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "EOF" + "'", str31, "EOF");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "EOF" + "'", str33, "EOF");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "EOF" + "'", str34, "EOF");
    }

    @Test
    public void test3236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3236");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("hi!");
        java.lang.String str2 = endTag1.toString();
        java.lang.String str3 = endTag1.toString();
        boolean boolean4 = endTag1.isDoctype();
        endTag1.appendAttributeName("EOF");
        boolean boolean7 = endTag1.isStartTag();
        endTag1.appendAttributeName('#');
        boolean boolean10 = endTag1.isEOF();
        org.jsoup.parser.Token.EndTag endTag12 = new org.jsoup.parser.Token.EndTag("hi!");
        boolean boolean13 = endTag12.selfClosing;
        endTag12.finaliseTag();
        java.lang.String str15 = endTag12.toString();
        java.lang.String str16 = endTag12.tokenType();
        org.jsoup.nodes.Attributes attributes17 = endTag12.attributes;
        org.jsoup.parser.Token.StartTag startTag18 = new org.jsoup.parser.Token.StartTag();
        startTag18.appendAttributeName('a');
        startTag18.newAttribute();
        boolean boolean22 = startTag18.selfClosing;
        org.jsoup.nodes.Attributes attributes23 = startTag18.getAttributes();
        endTag12.attributes = attributes23;
        endTag1.attributes = attributes23;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "</hi!>" + "'", str2, "</hi!>");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "</hi!>" + "'", str3, "</hi!>");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "</hi!>" + "'", str15, "</hi!>");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "EndTag" + "'", str16, "EndTag");
        org.junit.Assert.assertNull(attributes17);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(attributes23);
    }

    @Test
    public void test3237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3237");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.tokenType();
        boolean boolean2 = doctype0.isForceQuirks();
        java.lang.String str3 = doctype0.getPublicIdentifier();
        boolean boolean4 = doctype0.isForceQuirks();
        doctype0.forceQuirks = true;
        boolean boolean7 = doctype0.forceQuirks;
        doctype0.forceQuirks = false;
        boolean boolean10 = doctype0.forceQuirks;
        java.lang.StringBuilder stringBuilder11 = doctype0.name;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Doctype" + "'", str1, "Doctype");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(stringBuilder11);
        org.junit.Assert.assertEquals(stringBuilder11.toString(), "");
    }

    @Test
    public void test3238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3238");
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
        java.lang.String str24 = character18.getData();
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
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "EOF" + "'", str24, "EOF");
    }

    @Test
    public void test3239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3239");
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
        java.lang.String str35 = comment29.tokenType();
        xmlTreeBuilder0.insert(comment29);
        org.jsoup.parser.Token.StartTag startTag37 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag39 = startTag37.name("hi!");
        startTag37.appendAttributeValue("<</hi!>>");
        boolean boolean42 = startTag37.isSelfClosing();
        startTag37.selfClosing = false;
        org.jsoup.nodes.Element element45 = xmlTreeBuilder0.insert(startTag37);
        org.jsoup.parser.Token.EndTag endTag47 = new org.jsoup.parser.Token.EndTag("<Doctype>");
        endTag47.appendAttributeName("hi!");
        org.jsoup.parser.Token.Tag tag51 = endTag47.name("");
        boolean boolean52 = tag51.isSelfClosing();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean53 = xmlTreeBuilder0.process((org.jsoup.parser.Token) tag51);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must be false");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(tag11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Doctype" + "'", str18, "Doctype");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(tag27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(stringBuilder30);
        org.junit.Assert.assertEquals(stringBuilder30.toString(), "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "<!---->" + "'", str31, "<!---->");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "<!---->" + "'", str33, "<!---->");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "Comment" + "'", str35, "Comment");
        org.junit.Assert.assertNotNull(tag39);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(element45);
        org.junit.Assert.assertNotNull(tag51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
    }

    @Test
    public void test3240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3240");
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
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder33 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList36 = null;
        xmlTreeBuilder33.initialiseParse("Character", "hi!", parseErrorList36);
        org.jsoup.parser.Token.Comment comment38 = new org.jsoup.parser.Token.Comment();
        java.lang.StringBuilder stringBuilder39 = comment38.data;
        java.lang.String str40 = comment38.getData();
        xmlTreeBuilder33.insert(comment38);
        org.jsoup.parser.Token.Character character43 = new org.jsoup.parser.Token.Character("EOF");
        java.lang.String str44 = character43.getData();
        java.lang.String str45 = character43.toString();
        boolean boolean46 = character43.isStartTag();
        java.lang.String str47 = character43.getData();
        java.lang.String str48 = character43.toString();
        org.jsoup.parser.Token.Character character49 = character43.asCharacter();
        xmlTreeBuilder33.insert(character49);
        java.lang.String str51 = character49.getData();
        java.lang.String str52 = character49.getData();
        java.lang.String str53 = character49.getData();
        java.lang.String str54 = character49.toString();
        xmlTreeBuilder0.insert(character49);
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
        org.junit.Assert.assertNotNull(stringBuilder39);
        org.junit.Assert.assertEquals(stringBuilder39.toString(), "");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "EOF" + "'", str44, "EOF");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "EOF" + "'", str45, "EOF");
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "EOF" + "'", str47, "EOF");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "EOF" + "'", str48, "EOF");
        org.junit.Assert.assertNotNull(character49);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "EOF" + "'", str51, "EOF");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "EOF" + "'", str52, "EOF");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "EOF" + "'", str53, "EOF");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "EOF" + "'", str54, "EOF");
    }

    @Test
    public void test3241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3241");
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
        java.lang.String str20 = character18.getData();
        org.junit.Assert.assertNotNull(tag7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "<!---->" + "'", str20, "<!---->");
    }

    @Test
    public void test3242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3242");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        boolean boolean1 = doctype0.forceQuirks;
        java.lang.StringBuilder stringBuilder2 = doctype0.systemIdentifier;
        boolean boolean3 = doctype0.isCharacter();
        doctype0.forceQuirks = false;
        java.lang.String str6 = doctype0.getName();
        java.lang.String str7 = doctype0.getName();
        boolean boolean8 = doctype0.isForceQuirks();
        java.lang.StringBuilder stringBuilder9 = doctype0.name;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(stringBuilder9);
        org.junit.Assert.assertEquals(stringBuilder9.toString(), "");
    }

    @Test
    public void test3243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3243");
        org.jsoup.parser.Token.StartTag startTag1 = new org.jsoup.parser.Token.StartTag("</hi!>");
        org.jsoup.parser.Token.Tag tag3 = startTag1.name("hi!");
        boolean boolean4 = startTag1.isComment();
        startTag1.appendAttributeValue('#');
        startTag1.tagName = "<<hi!>>";
        org.junit.Assert.assertNotNull(tag3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test3244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3244");
        org.jsoup.nodes.Attributes attributes1 = null;
        org.jsoup.parser.Token.StartTag startTag2 = new org.jsoup.parser.Token.StartTag("", attributes1);
        startTag2.appendAttributeValue('4');
    }

    @Test
    public void test3245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3245");
        org.jsoup.parser.Token.StartTag startTag1 = new org.jsoup.parser.Token.StartTag("<!---->");
        startTag1.appendAttributeName('#');
        startTag1.finaliseTag();
        org.jsoup.nodes.Attributes attributes5 = startTag1.attributes;
        org.junit.Assert.assertNotNull(attributes5);
    }

    @Test
    public void test3246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3246");
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
        org.jsoup.parser.Token.StartTag startTag26 = new org.jsoup.parser.Token.StartTag("4");
        java.lang.String str27 = startTag26.name();
        boolean boolean28 = xmlTreeBuilder0.process((org.jsoup.parser.Token) startTag26);
        java.lang.String str29 = startTag26.tagName;
        java.lang.String str30 = startTag26.name();
        boolean boolean31 = startTag26.isDoctype();
        boolean boolean32 = startTag26.isDoctype();
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
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "4" + "'", str27, "4");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "4" + "'", str29, "4");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "4" + "'", str30, "4");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test3247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3247");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        boolean boolean1 = doctype0.forceQuirks;
        java.lang.StringBuilder stringBuilder2 = doctype0.systemIdentifier;
        boolean boolean3 = doctype0.isCharacter();
        doctype0.forceQuirks = false;
        java.lang.StringBuilder stringBuilder6 = doctype0.publicIdentifier;
        boolean boolean7 = doctype0.forceQuirks;
        java.lang.StringBuilder stringBuilder8 = doctype0.name;
        org.jsoup.parser.Token.Doctype doctype9 = doctype0.asDoctype();
        java.lang.String str10 = doctype9.getPublicIdentifier();
        boolean boolean11 = doctype9.forceQuirks;
        boolean boolean12 = doctype9.isDoctype();
        java.lang.String str13 = doctype9.getPublicIdentifier();
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
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test3248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3248");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag2 = startTag0.name("hi!");
        startTag0.appendAttributeName(' ');
        startTag0.appendAttributeValue('#');
        startTag0.newAttribute();
        startTag0.finaliseTag();
        startTag0.appendAttributeValue("Comment");
        boolean boolean11 = startTag0.selfClosing;
        org.jsoup.nodes.Attributes attributes13 = null;
        org.jsoup.parser.Token.StartTag startTag14 = new org.jsoup.parser.Token.StartTag("", attributes13);
        startTag14.selfClosing = false;
        startTag14.newAttribute();
        org.jsoup.nodes.Attributes attributes18 = startTag14.getAttributes();
        startTag14.appendAttributeValue('a');
        startTag14.appendTagName("EOF");
        startTag14.appendTagName('a');
        org.jsoup.parser.Token.Tag tag26 = startTag14.name("</<4>>");
        org.jsoup.nodes.Attributes attributes28 = null;
        org.jsoup.parser.Token.StartTag startTag29 = new org.jsoup.parser.Token.StartTag("", attributes28);
        startTag29.selfClosing = false;
        startTag29.newAttribute();
        org.jsoup.nodes.Attributes attributes33 = startTag29.getAttributes();
        tag26.attributes = attributes33;
        startTag0.attributes = attributes33;
        org.junit.Assert.assertNotNull(tag2);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(attributes18);
        org.junit.Assert.assertNotNull(tag26);
        org.junit.Assert.assertNotNull(attributes33);
    }

    @Test
    public void test3249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3249");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag2 = startTag0.name("hi!");
        org.jsoup.nodes.Attributes attributes3 = tag2.attributes;
        tag2.selfClosing = false;
        org.junit.Assert.assertNotNull(tag2);
        org.junit.Assert.assertNotNull(attributes3);
    }

    @Test
    public void test3250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3250");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag2 = startTag0.name("hi!");
        startTag0.appendAttributeName(' ');
        startTag0.appendAttributeName("hi!");
        org.jsoup.parser.Token.StartTag startTag8 = new org.jsoup.parser.Token.StartTag("Doctype");
        java.lang.String str9 = startTag8.toString();
        boolean boolean10 = startTag8.isEndTag();
        boolean boolean11 = startTag8.isSelfClosing();
        org.jsoup.nodes.Attributes attributes12 = startTag8.getAttributes();
        startTag0.attributes = attributes12;
        boolean boolean14 = startTag0.isDoctype();
        org.junit.Assert.assertNotNull(tag2);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<Doctype>" + "'", str9, "<Doctype>");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(attributes12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test3251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3251");
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
        boolean boolean11 = doctype0.forceQuirks;
        doctype0.forceQuirks = true;
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
    }

    @Test
    public void test3252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3252");
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
        startTag11.newAttribute();
        org.junit.Assert.assertNotNull(tag7);
        org.junit.Assert.assertNotNull(attributes8);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test3253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3253");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        org.jsoup.parser.Token.Doctype doctype1 = doctype0.asDoctype();
        java.lang.String str2 = doctype0.getSystemIdentifier();
        boolean boolean3 = doctype0.forceQuirks;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Comment comment4 = doctype0.asComment();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$Doctype cannot be cast to class org.jsoup.parser.Token$Comment (org.jsoup.parser.Token$Doctype and org.jsoup.parser.Token$Comment are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doctype1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test3254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3254");
        org.jsoup.parser.Token.StartTag startTag2 = new org.jsoup.parser.Token.StartTag();
        startTag2.appendAttributeName('a');
        startTag2.newAttribute();
        boolean boolean6 = startTag2.isDoctype();
        org.jsoup.parser.Token.StartTag startTag8 = new org.jsoup.parser.Token.StartTag();
        startTag8.appendTagName('4');
        java.lang.String str11 = startTag8.name();
        org.jsoup.nodes.Attributes attributes12 = startTag8.attributes;
        org.jsoup.parser.Token.StartTag startTag13 = new org.jsoup.parser.Token.StartTag("hi!", attributes12);
        startTag2.attributes = attributes12;
        org.jsoup.parser.Token.StartTag startTag16 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag18 = startTag16.name("hi!");
        org.jsoup.nodes.Attributes attributes19 = tag18.attributes;
        org.jsoup.parser.Token.StartTag startTag20 = new org.jsoup.parser.Token.StartTag("", attributes19);
        startTag2.attributes = attributes19;
        org.jsoup.parser.Token.StartTag startTag22 = new org.jsoup.parser.Token.StartTag("<hi!  =\"#\">", attributes19);
        org.jsoup.parser.Token.StartTag startTag23 = new org.jsoup.parser.Token.StartTag("<hi!4>", attributes19);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "4" + "'", str11, "4");
        org.junit.Assert.assertNotNull(attributes12);
        org.junit.Assert.assertNotNull(tag18);
        org.junit.Assert.assertNotNull(attributes19);
    }

    @Test
    public void test3255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3255");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        java.lang.StringBuilder stringBuilder1 = comment0.data;
        java.lang.String str2 = comment0.toString();
        java.lang.String str3 = comment0.toString();
        org.jsoup.parser.Token.Comment comment4 = comment0.asComment();
        java.lang.String str5 = comment0.getData();
        org.junit.Assert.assertNotNull(stringBuilder1);
        org.junit.Assert.assertEquals(stringBuilder1.toString(), "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "<!---->" + "'", str2, "<!---->");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<!---->" + "'", str3, "<!---->");
        org.junit.Assert.assertNotNull(comment4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test3256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3256");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        xmlTreeBuilder0.initialiseParse("Character", "hi!", parseErrorList3);
        org.jsoup.parser.ParseErrorList parseErrorList7 = null;
        xmlTreeBuilder0.initialiseParse("</hi!>", "Doctype", parseErrorList7);
        org.jsoup.parser.Token.EndTag endTag10 = new org.jsoup.parser.Token.EndTag("hi!");
        java.lang.String str11 = endTag10.toString();
        java.lang.String str12 = endTag10.toString();
        org.jsoup.parser.Token.EndTag endTag13 = endTag10.asEndTag();
        boolean boolean14 = xmlTreeBuilder0.process((org.jsoup.parser.Token) endTag13);
        org.jsoup.parser.Token.Doctype doctype15 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str16 = doctype15.tokenType();
        java.lang.StringBuilder stringBuilder17 = doctype15.systemIdentifier;
        java.lang.String str18 = doctype15.getPublicIdentifier();
        org.jsoup.parser.Token.Character character20 = new org.jsoup.parser.Token.Character("EOF");
        java.lang.String str21 = character20.getData();
        java.lang.String str22 = character20.toString();
        boolean boolean23 = character20.isStartTag();
        java.lang.String str24 = character20.toString();
        java.lang.String str25 = character20.toString();
        java.lang.String str26 = character20.getData();
        java.lang.String str27 = character20.getData();
        java.lang.String str28 = character20.getData();
        java.lang.String str29 = character20.toString();
        org.jsoup.parser.Token.Doctype doctype30 = new org.jsoup.parser.Token.Doctype();
        boolean boolean31 = doctype30.forceQuirks;
        java.lang.String str32 = doctype30.getName();
        boolean boolean33 = doctype30.forceQuirks;
        boolean boolean34 = doctype30.forceQuirks;
        org.jsoup.parser.Token.TokenType tokenType35 = org.jsoup.parser.Token.TokenType.Character;
        doctype30.type = tokenType35;
        character20.type = tokenType35;
        doctype15.type = tokenType35;
        boolean boolean39 = doctype15.isComment();
        // The following exception was thrown during execution in test generation
        try {
            xmlTreeBuilder0.insert(doctype15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "</hi!>" + "'", str11, "</hi!>");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "</hi!>" + "'", str12, "</hi!>");
        org.junit.Assert.assertNotNull(endTag13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Doctype" + "'", str16, "Doctype");
        org.junit.Assert.assertNotNull(stringBuilder17);
        org.junit.Assert.assertEquals(stringBuilder17.toString(), "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "EOF" + "'", str21, "EOF");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "EOF" + "'", str22, "EOF");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "EOF" + "'", str24, "EOF");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "EOF" + "'", str25, "EOF");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "EOF" + "'", str26, "EOF");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "EOF" + "'", str27, "EOF");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "EOF" + "'", str28, "EOF");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "EOF" + "'", str29, "EOF");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + tokenType35 + "' != '" + org.jsoup.parser.Token.TokenType.Character + "'", tokenType35.equals(org.jsoup.parser.Token.TokenType.Character));
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test3257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3257");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        boolean boolean1 = doctype0.forceQuirks;
        java.lang.StringBuilder stringBuilder2 = doctype0.systemIdentifier;
        boolean boolean3 = doctype0.isCharacter();
        doctype0.forceQuirks = false;
        java.lang.String str6 = doctype0.getName();
        boolean boolean7 = doctype0.isForceQuirks();
        boolean boolean8 = doctype0.isComment();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Character character9 = doctype0.asCharacter();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$Doctype cannot be cast to class org.jsoup.parser.Token$Character (org.jsoup.parser.Token$Doctype and org.jsoup.parser.Token$Character are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test3258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3258");
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
        org.jsoup.parser.Token.EndTag endTag14 = new org.jsoup.parser.Token.EndTag("hi!");
        java.lang.String str15 = endTag14.toString();
        java.lang.String str16 = endTag14.toString();
        boolean boolean17 = endTag14.isDoctype();
        java.lang.String str18 = endTag14.tagName;
        endTag14.appendAttributeName("<!---->");
        org.jsoup.parser.Token.TokenType tokenType21 = endTag14.type;
        boolean boolean22 = xmlTreeBuilder0.process((org.jsoup.parser.Token) endTag14);
        org.jsoup.parser.ParseErrorList parseErrorList25 = null;
        xmlTreeBuilder0.initialiseParse("", "hi!", parseErrorList25);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder27 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList30 = null;
        xmlTreeBuilder27.initialiseParse("Character", "hi!", parseErrorList30);
        org.jsoup.parser.ParseErrorList parseErrorList34 = null;
        xmlTreeBuilder27.initialiseParse("</hi!>", "Doctype", parseErrorList34);
        org.jsoup.parser.Token.EndTag endTag37 = new org.jsoup.parser.Token.EndTag("hi!");
        java.lang.String str38 = endTag37.toString();
        java.lang.String str39 = endTag37.toString();
        boolean boolean40 = endTag37.isDoctype();
        java.lang.String str41 = endTag37.tagName;
        java.lang.String str42 = endTag37.name();
        boolean boolean43 = xmlTreeBuilder27.process((org.jsoup.parser.Token) endTag37);
        org.jsoup.parser.Token.Character character45 = new org.jsoup.parser.Token.Character("EOF");
        java.lang.String str46 = character45.getData();
        java.lang.String str47 = character45.toString();
        java.lang.String str48 = character45.getData();
        java.lang.String str49 = character45.getData();
        xmlTreeBuilder27.insert(character45);
        java.lang.String str51 = character45.toString();
        xmlTreeBuilder0.insert(character45);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder53 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList56 = null;
        xmlTreeBuilder53.initialiseParse("</hi!>", "EOF", parseErrorList56);
        org.jsoup.parser.Token.StartTag startTag58 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag60 = startTag58.name("hi!");
        boolean boolean61 = xmlTreeBuilder53.process((org.jsoup.parser.Token) startTag58);
        org.jsoup.parser.Token.StartTag startTag62 = new org.jsoup.parser.Token.StartTag();
        startTag62.appendTagName('4');
        org.jsoup.nodes.Element element65 = xmlTreeBuilder53.insert(startTag62);
        org.jsoup.parser.ParseErrorList parseErrorList68 = null;
        xmlTreeBuilder53.initialiseParse("Character", "Doctype", parseErrorList68);
        org.jsoup.parser.Token.Character character71 = new org.jsoup.parser.Token.Character("EOF");
        java.lang.String str72 = character71.getData();
        boolean boolean73 = character71.isComment();
        org.jsoup.parser.Token.Comment comment74 = new org.jsoup.parser.Token.Comment();
        java.lang.StringBuilder stringBuilder75 = comment74.data;
        org.jsoup.parser.Token.TokenType tokenType76 = org.jsoup.parser.Token.TokenType.Comment;
        comment74.type = tokenType76;
        character71.type = tokenType76;
        java.lang.String str79 = character71.toString();
        java.lang.String str80 = character71.toString();
        xmlTreeBuilder53.insert(character71);
        org.jsoup.parser.Token.Character character83 = new org.jsoup.parser.Token.Character("EOF");
        java.lang.String str84 = character83.getData();
        java.lang.String str85 = character83.toString();
        boolean boolean86 = character83.isStartTag();
        java.lang.String str87 = character83.toString();
        java.lang.String str88 = character83.toString();
        java.lang.String str89 = character83.getData();
        java.lang.String str90 = character83.getData();
        java.lang.String str91 = character83.getData();
        java.lang.String str92 = character83.toString();
        xmlTreeBuilder53.insert(character83);
        xmlTreeBuilder0.insert(character83);
        java.lang.String str95 = character83.toString();
        org.junit.Assert.assertNotNull(tag7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(stringBuilder10);
        org.junit.Assert.assertEquals(stringBuilder10.toString(), "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "<!---->" + "'", str11, "<!---->");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "</hi!>" + "'", str15, "</hi!>");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "</hi!>" + "'", str16, "</hi!>");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertTrue("'" + tokenType21 + "' != '" + org.jsoup.parser.Token.TokenType.EndTag + "'", tokenType21.equals(org.jsoup.parser.Token.TokenType.EndTag));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "</hi!>" + "'", str38, "</hi!>");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "</hi!>" + "'", str39, "</hi!>");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "hi!" + "'", str41, "hi!");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "hi!" + "'", str42, "hi!");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "EOF" + "'", str46, "EOF");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "EOF" + "'", str47, "EOF");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "EOF" + "'", str48, "EOF");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "EOF" + "'", str49, "EOF");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "EOF" + "'", str51, "EOF");
        org.junit.Assert.assertNotNull(tag60);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertNotNull(element65);
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "EOF" + "'", str72, "EOF");
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertNotNull(stringBuilder75);
        org.junit.Assert.assertEquals(stringBuilder75.toString(), "");
        org.junit.Assert.assertTrue("'" + tokenType76 + "' != '" + org.jsoup.parser.Token.TokenType.Comment + "'", tokenType76.equals(org.jsoup.parser.Token.TokenType.Comment));
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "EOF" + "'", str79, "EOF");
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "EOF" + "'", str80, "EOF");
        org.junit.Assert.assertEquals("'" + str84 + "' != '" + "EOF" + "'", str84, "EOF");
        org.junit.Assert.assertEquals("'" + str85 + "' != '" + "EOF" + "'", str85, "EOF");
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertEquals("'" + str87 + "' != '" + "EOF" + "'", str87, "EOF");
        org.junit.Assert.assertEquals("'" + str88 + "' != '" + "EOF" + "'", str88, "EOF");
        org.junit.Assert.assertEquals("'" + str89 + "' != '" + "EOF" + "'", str89, "EOF");
        org.junit.Assert.assertEquals("'" + str90 + "' != '" + "EOF" + "'", str90, "EOF");
        org.junit.Assert.assertEquals("'" + str91 + "' != '" + "EOF" + "'", str91, "EOF");
        org.junit.Assert.assertEquals("'" + str92 + "' != '" + "EOF" + "'", str92, "EOF");
        org.junit.Assert.assertEquals("'" + str95 + "' != '" + "EOF" + "'", str95, "EOF");
    }

    @Test
    public void test3259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3259");
        org.jsoup.parser.Token.StartTag startTag2 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag4 = startTag2.name("hi!");
        org.jsoup.nodes.Attributes attributes5 = tag4.attributes;
        org.jsoup.parser.Token.StartTag startTag6 = new org.jsoup.parser.Token.StartTag("</hi!>", attributes5);
        org.jsoup.parser.Token.StartTag startTag7 = new org.jsoup.parser.Token.StartTag("", attributes5);
        startTag7.appendAttributeName('a');
        org.jsoup.nodes.Attributes attributes10 = startTag7.getAttributes();
        org.junit.Assert.assertNotNull(tag4);
        org.junit.Assert.assertNotNull(attributes5);
        org.junit.Assert.assertNotNull(attributes10);
    }

    @Test
    public void test3260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3260");
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
        org.jsoup.parser.Token.EndTag endTag14 = new org.jsoup.parser.Token.EndTag("hi!");
        java.lang.String str15 = endTag14.toString();
        java.lang.String str16 = endTag14.toString();
        boolean boolean17 = endTag14.isDoctype();
        java.lang.String str18 = endTag14.tagName;
        endTag14.appendAttributeName("<!---->");
        org.jsoup.parser.Token.TokenType tokenType21 = endTag14.type;
        boolean boolean22 = xmlTreeBuilder0.process((org.jsoup.parser.Token) endTag14);
        org.jsoup.parser.ParseErrorList parseErrorList25 = null;
        xmlTreeBuilder0.initialiseParse("", "hi!", parseErrorList25);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder27 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList30 = null;
        xmlTreeBuilder27.initialiseParse("Character", "hi!", parseErrorList30);
        org.jsoup.parser.ParseErrorList parseErrorList34 = null;
        xmlTreeBuilder27.initialiseParse("</hi!>", "Doctype", parseErrorList34);
        org.jsoup.parser.Token.EndTag endTag37 = new org.jsoup.parser.Token.EndTag("hi!");
        java.lang.String str38 = endTag37.toString();
        java.lang.String str39 = endTag37.toString();
        boolean boolean40 = endTag37.isDoctype();
        java.lang.String str41 = endTag37.tagName;
        java.lang.String str42 = endTag37.name();
        boolean boolean43 = xmlTreeBuilder27.process((org.jsoup.parser.Token) endTag37);
        org.jsoup.parser.Token.Character character45 = new org.jsoup.parser.Token.Character("EOF");
        java.lang.String str46 = character45.getData();
        java.lang.String str47 = character45.toString();
        java.lang.String str48 = character45.getData();
        java.lang.String str49 = character45.getData();
        xmlTreeBuilder27.insert(character45);
        java.lang.String str51 = character45.toString();
        xmlTreeBuilder0.insert(character45);
        org.jsoup.parser.Token.StartTag startTag53 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag55 = startTag53.name("hi!");
        startTag53.appendAttributeName(' ');
        boolean boolean58 = startTag53.isComment();
        java.lang.String str59 = startTag53.tagName;
        boolean boolean60 = startTag53.isSelfClosing();
        org.jsoup.parser.Token.StartTag startTag61 = startTag53.asStartTag();
        org.jsoup.nodes.Element element62 = xmlTreeBuilder0.insert(startTag61);
        org.jsoup.parser.Token.Doctype doctype63 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str64 = doctype63.tokenType();
        boolean boolean65 = doctype63.isForceQuirks();
        java.lang.String str66 = doctype63.getPublicIdentifier();
        boolean boolean67 = doctype63.isForceQuirks();
        doctype63.forceQuirks = true;
        org.jsoup.parser.Token.Doctype doctype70 = doctype63.asDoctype();
        java.lang.StringBuilder stringBuilder71 = doctype70.systemIdentifier;
        java.lang.String str72 = doctype70.tokenType();
        // The following exception was thrown during execution in test generation
        try {
            xmlTreeBuilder0.insert(doctype70);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tag7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(stringBuilder10);
        org.junit.Assert.assertEquals(stringBuilder10.toString(), "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "<!---->" + "'", str11, "<!---->");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "</hi!>" + "'", str15, "</hi!>");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "</hi!>" + "'", str16, "</hi!>");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertTrue("'" + tokenType21 + "' != '" + org.jsoup.parser.Token.TokenType.EndTag + "'", tokenType21.equals(org.jsoup.parser.Token.TokenType.EndTag));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "</hi!>" + "'", str38, "</hi!>");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "</hi!>" + "'", str39, "</hi!>");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "hi!" + "'", str41, "hi!");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "hi!" + "'", str42, "hi!");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "EOF" + "'", str46, "EOF");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "EOF" + "'", str47, "EOF");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "EOF" + "'", str48, "EOF");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "EOF" + "'", str49, "EOF");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "EOF" + "'", str51, "EOF");
        org.junit.Assert.assertNotNull(tag55);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "hi!" + "'", str59, "hi!");
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(startTag61);
        org.junit.Assert.assertNotNull(element62);
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "Doctype" + "'", str64, "Doctype");
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "" + "'", str66, "");
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNotNull(doctype70);
        org.junit.Assert.assertNotNull(stringBuilder71);
        org.junit.Assert.assertEquals(stringBuilder71.toString(), "");
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "Doctype" + "'", str72, "Doctype");
    }

    @Test
    public void test3261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3261");
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
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder27 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList30 = null;
        xmlTreeBuilder27.initialiseParse("</hi!>", "EOF", parseErrorList30);
        org.jsoup.parser.Token.StartTag startTag32 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag34 = startTag32.name("hi!");
        boolean boolean35 = xmlTreeBuilder27.process((org.jsoup.parser.Token) startTag32);
        org.jsoup.parser.Token.StartTag startTag36 = new org.jsoup.parser.Token.StartTag();
        startTag36.appendTagName('4');
        org.jsoup.nodes.Element element39 = xmlTreeBuilder27.insert(startTag36);
        startTag36.newAttribute();
        boolean boolean41 = startTag36.isEndTag();
        startTag36.finaliseTag();
        startTag36.appendAttributeName("");
        org.jsoup.nodes.Element element45 = xmlTreeBuilder0.insert(startTag36);
        startTag36.appendTagName("<</Doctype>>");
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
        org.junit.Assert.assertNotNull(tag34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(element39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(element45);
    }

    @Test
    public void test3262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3262");
        org.jsoup.parser.Token.EndTag endTag4 = new org.jsoup.parser.Token.EndTag("hi!");
        java.lang.String str5 = endTag4.toString();
        java.lang.String str6 = endTag4.toString();
        boolean boolean7 = endTag4.isDoctype();
        java.lang.String str8 = endTag4.tagName;
        org.jsoup.parser.Token.StartTag startTag10 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag12 = startTag10.name("hi!");
        org.jsoup.nodes.Attributes attributes13 = tag12.attributes;
        org.jsoup.parser.Token.StartTag startTag14 = new org.jsoup.parser.Token.StartTag("</hi!>", attributes13);
        endTag4.attributes = attributes13;
        org.jsoup.parser.Token.StartTag startTag16 = new org.jsoup.parser.Token.StartTag("EndTag", attributes13);
        org.jsoup.parser.Token.StartTag startTag17 = new org.jsoup.parser.Token.StartTag("<hi!  =\"#\">", attributes13);
        org.jsoup.parser.Token.StartTag startTag18 = new org.jsoup.parser.Token.StartTag("<4</hi!>4>", attributes13);
        boolean boolean19 = startTag18.isCharacter();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "</hi!>" + "'", str5, "</hi!>");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "</hi!>" + "'", str6, "</hi!>");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(tag12);
        org.junit.Assert.assertNotNull(attributes13);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test3263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3263");
        org.jsoup.parser.Token.EndTag endTag2 = new org.jsoup.parser.Token.EndTag("<4>");
        org.jsoup.nodes.Attributes attributes4 = null;
        org.jsoup.parser.Token.StartTag startTag5 = new org.jsoup.parser.Token.StartTag("", attributes4);
        boolean boolean6 = startTag5.isDoctype();
        java.lang.String str7 = startTag5.tagName;
        org.jsoup.parser.Token.TokenType tokenType8 = startTag5.type;
        startTag5.appendTagName(' ');
        boolean boolean11 = startTag5.isDoctype();
        org.jsoup.parser.Token.StartTag startTag13 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag15 = startTag13.name("hi!");
        org.jsoup.nodes.Attributes attributes16 = tag15.attributes;
        org.jsoup.parser.Token.StartTag startTag17 = new org.jsoup.parser.Token.StartTag("", attributes16);
        startTag5.attributes = attributes16;
        endTag2.attributes = attributes16;
        boolean boolean20 = endTag2.isEndTag();
        org.jsoup.nodes.Attributes attributes21 = endTag2.attributes;
        org.jsoup.parser.Token.StartTag startTag22 = new org.jsoup.parser.Token.StartTag("<<!---->>", attributes21);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + tokenType8 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType8.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(tag15);
        org.junit.Assert.assertNotNull(attributes16);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(attributes21);
    }

    @Test
    public void test3264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3264");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        boolean boolean1 = doctype0.forceQuirks;
        java.lang.StringBuilder stringBuilder2 = doctype0.systemIdentifier;
        boolean boolean3 = doctype0.forceQuirks;
        boolean boolean4 = doctype0.isStartTag();
        java.lang.StringBuilder stringBuilder5 = doctype0.systemIdentifier;
        java.lang.String str6 = doctype0.getSystemIdentifier();
        java.lang.StringBuilder stringBuilder7 = doctype0.name;
        java.lang.String str8 = doctype0.getPublicIdentifier();
        java.lang.String str9 = doctype0.getPublicIdentifier();
        java.lang.StringBuilder stringBuilder10 = doctype0.publicIdentifier;
        doctype0.forceQuirks = true;
        boolean boolean13 = doctype0.isForceQuirks();
        boolean boolean14 = doctype0.forceQuirks;
        java.lang.StringBuilder stringBuilder15 = doctype0.systemIdentifier;
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
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(stringBuilder10);
        org.junit.Assert.assertEquals(stringBuilder10.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(stringBuilder15);
        org.junit.Assert.assertEquals(stringBuilder15.toString(), "");
    }

    @Test
    public void test3265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3265");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag2 = startTag0.name("hi!");
        startTag0.appendAttributeName(' ');
        startTag0.appendAttributeValue('#');
        startTag0.newAttribute();
        startTag0.finaliseTag();
        startTag0.appendAttributeValue("Comment");
        startTag0.appendAttributeValue("hi!a");
        org.junit.Assert.assertNotNull(tag2);
    }

    @Test
    public void test3266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3266");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        boolean boolean1 = doctype0.forceQuirks;
        java.lang.StringBuilder stringBuilder2 = doctype0.systemIdentifier;
        boolean boolean3 = doctype0.isCharacter();
        doctype0.forceQuirks = false;
        java.lang.StringBuilder stringBuilder6 = doctype0.publicIdentifier;
        boolean boolean7 = doctype0.forceQuirks;
        java.lang.StringBuilder stringBuilder8 = doctype0.publicIdentifier;
        org.jsoup.parser.Token.Doctype doctype9 = doctype0.asDoctype();
        java.lang.StringBuilder stringBuilder10 = doctype0.publicIdentifier;
        boolean boolean11 = doctype0.isEndTag();
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
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test3267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3267");
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
        org.jsoup.parser.Token.StartTag startTag17 = new org.jsoup.parser.Token.StartTag();
        startTag17.appendTagName('4');
        java.lang.String str20 = startTag17.name();
        org.jsoup.nodes.Attributes attributes21 = startTag17.attributes;
        startTag17.appendAttributeValue('#');
        org.jsoup.nodes.Element element24 = xmlTreeBuilder0.insert(startTag17);
        org.jsoup.parser.Token.Doctype doctype25 = new org.jsoup.parser.Token.Doctype();
        boolean boolean26 = doctype25.forceQuirks;
        java.lang.StringBuilder stringBuilder27 = doctype25.systemIdentifier;
        boolean boolean28 = doctype25.isCharacter();
        doctype25.forceQuirks = false;
        java.lang.StringBuilder stringBuilder31 = doctype25.publicIdentifier;
        boolean boolean32 = doctype25.forceQuirks;
        java.lang.StringBuilder stringBuilder33 = doctype25.publicIdentifier;
        org.jsoup.parser.Token.Doctype doctype34 = doctype25.asDoctype();
        java.lang.StringBuilder stringBuilder35 = doctype25.publicIdentifier;
        java.lang.String str36 = doctype25.getName();
        // The following exception was thrown during execution in test generation
        try {
            xmlTreeBuilder0.insert(doctype25);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "</hi!>" + "'", str11, "</hi!>");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "</hi!>" + "'", str12, "</hi!>");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "4" + "'", str20, "4");
        org.junit.Assert.assertNotNull(attributes21);
        org.junit.Assert.assertNotNull(element24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(stringBuilder27);
        org.junit.Assert.assertEquals(stringBuilder27.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(stringBuilder31);
        org.junit.Assert.assertEquals(stringBuilder31.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(stringBuilder33);
        org.junit.Assert.assertEquals(stringBuilder33.toString(), "");
        org.junit.Assert.assertNotNull(doctype34);
        org.junit.Assert.assertNotNull(stringBuilder35);
        org.junit.Assert.assertEquals(stringBuilder35.toString(), "");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
    }

    @Test
    public void test3268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3268");
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
        java.lang.String str45 = character40.getData();
        java.lang.String str46 = character40.getData();
        boolean boolean47 = character40.isEOF();
        java.lang.String str48 = character40.getData();
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
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "</hi!>" + "'", str45, "</hi!>");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "</hi!>" + "'", str46, "</hi!>");
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "</hi!>" + "'", str48, "</hi!>");
    }

    @Test
    public void test3269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3269");
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
        java.lang.String str10 = doctype0.getPublicIdentifier();
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
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test3270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3270");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        boolean boolean1 = doctype0.forceQuirks;
        java.lang.StringBuilder stringBuilder2 = doctype0.systemIdentifier;
        boolean boolean3 = doctype0.isCharacter();
        doctype0.forceQuirks = false;
        java.lang.StringBuilder stringBuilder6 = doctype0.publicIdentifier;
        boolean boolean7 = doctype0.isStartTag();
        java.lang.StringBuilder stringBuilder8 = doctype0.publicIdentifier;
        boolean boolean9 = doctype0.isForceQuirks();
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
    }

    @Test
    public void test3271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3271");
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
        java.lang.String str29 = comment25.getData();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.EndTag endTag30 = comment25.asEndTag();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$Comment cannot be cast to class org.jsoup.parser.Token$EndTag (org.jsoup.parser.Token$Comment and org.jsoup.parser.Token$EndTag are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
    }

    @Test
    public void test3272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3272");
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
        boolean boolean16 = endTag1.selfClosing;
        endTag1.appendAttributeValue('#');
        org.junit.Assert.assertNotNull(tag10);
        org.junit.Assert.assertNotNull(attributes13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test3273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3273");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.parser.Token.StartTag startTag3 = new org.jsoup.parser.Token.StartTag("", attributes2);
        startTag3.selfClosing = false;
        startTag3.appendTagName("</hi!>");
        startTag3.newAttribute();
        org.jsoup.nodes.Attributes attributes9 = startTag3.getAttributes();
        org.jsoup.parser.Token.StartTag startTag10 = new org.jsoup.parser.Token.StartTag("hi!", attributes9);
        startTag10.selfClosing = false;
        startTag10.appendAttributeValue("EndTag");
        org.jsoup.parser.Token.EndTag endTag16 = new org.jsoup.parser.Token.EndTag("hi!");
        boolean boolean17 = endTag16.selfClosing;
        endTag16.finaliseTag();
        endTag16.appendAttributeName(' ');
        endTag16.tagName = "Doctype";
        org.jsoup.parser.Token.TokenType tokenType23 = endTag16.type;
        org.jsoup.parser.Token.StartTag startTag25 = new org.jsoup.parser.Token.StartTag("EOF");
        org.jsoup.parser.Token.Tag tag27 = startTag25.name("hi!a");
        org.jsoup.nodes.Attributes attributes31 = null;
        org.jsoup.parser.Token.StartTag startTag32 = new org.jsoup.parser.Token.StartTag("", attributes31);
        startTag32.selfClosing = false;
        startTag32.appendTagName("</hi!>");
        startTag32.newAttribute();
        org.jsoup.nodes.Attributes attributes38 = startTag32.getAttributes();
        org.jsoup.parser.Token.StartTag startTag39 = new org.jsoup.parser.Token.StartTag("Doctype", attributes38);
        org.jsoup.parser.Token.StartTag startTag40 = new org.jsoup.parser.Token.StartTag("hi!", attributes38);
        startTag25.attributes = attributes38;
        endTag16.attributes = attributes38;
        startTag10.attributes = attributes38;
        org.junit.Assert.assertNotNull(attributes9);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + tokenType23 + "' != '" + org.jsoup.parser.Token.TokenType.EndTag + "'", tokenType23.equals(org.jsoup.parser.Token.TokenType.EndTag));
        org.junit.Assert.assertNotNull(tag27);
        org.junit.Assert.assertNotNull(attributes38);
    }

    @Test
    public void test3274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3274");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.tokenType();
        java.lang.StringBuilder stringBuilder2 = doctype0.systemIdentifier;
        doctype0.forceQuirks = true;
        doctype0.forceQuirks = false;
        boolean boolean7 = doctype0.isForceQuirks();
        boolean boolean8 = doctype0.forceQuirks;
        java.lang.String str9 = doctype0.getName();
        boolean boolean10 = doctype0.forceQuirks;
        boolean boolean11 = doctype0.isForceQuirks();
        java.lang.String str12 = doctype0.getSystemIdentifier();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Doctype" + "'", str1, "Doctype");
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test3275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3275");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.tokenType();
        java.lang.String str2 = doctype0.getSystemIdentifier();
        java.lang.String str3 = doctype0.tokenType();
        java.lang.StringBuilder stringBuilder4 = doctype0.name;
        java.lang.StringBuilder stringBuilder5 = doctype0.publicIdentifier;
        java.lang.String str6 = doctype0.getPublicIdentifier();
        java.lang.String str7 = doctype0.getPublicIdentifier();
        java.lang.StringBuilder stringBuilder8 = doctype0.publicIdentifier;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Doctype" + "'", str1, "Doctype");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Doctype" + "'", str3, "Doctype");
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(stringBuilder8);
        org.junit.Assert.assertEquals(stringBuilder8.toString(), "");
    }

    @Test
    public void test3276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3276");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.tokenType();
        boolean boolean2 = doctype0.isForceQuirks();
        java.lang.String str3 = doctype0.getPublicIdentifier();
        java.lang.String str4 = doctype0.getSystemIdentifier();
        java.lang.String str5 = doctype0.tokenType();
        org.jsoup.parser.Token.EndTag endTag7 = new org.jsoup.parser.Token.EndTag("hi!");
        boolean boolean8 = endTag7.selfClosing;
        org.jsoup.parser.Token.Tag tag10 = endTag7.name("");
        boolean boolean11 = endTag7.isEndTag();
        org.jsoup.parser.Token.Tag tag13 = endTag7.name("<4>");
        org.jsoup.parser.Token.TokenType tokenType14 = tag13.type;
        doctype0.type = tokenType14;
        boolean boolean16 = doctype0.forceQuirks;
        doctype0.forceQuirks = true;
        java.lang.String str19 = doctype0.getSystemIdentifier();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Doctype" + "'", str1, "Doctype");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Doctype" + "'", str5, "Doctype");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(tag10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(tag13);
        org.junit.Assert.assertTrue("'" + tokenType14 + "' != '" + org.jsoup.parser.Token.TokenType.EndTag + "'", tokenType14.equals(org.jsoup.parser.Token.TokenType.EndTag));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test3277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3277");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("4");
        java.lang.String str2 = endTag1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "</4>" + "'", str2, "</4>");
    }

    @Test
    public void test3278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3278");
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
        org.jsoup.parser.ParseErrorList parseErrorList67 = null;
        xmlTreeBuilder0.initialiseParse("<hi!4>", "hi! ", parseErrorList67);
        org.jsoup.parser.Token.StartTag startTag70 = new org.jsoup.parser.Token.StartTag("</Comment>");
        org.jsoup.nodes.Element element71 = xmlTreeBuilder0.insert(startTag70);
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
        org.junit.Assert.assertNotNull(element71);
    }

    @Test
    public void test3279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3279");
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
        org.jsoup.parser.Token.StartTag startTag17 = new org.jsoup.parser.Token.StartTag();
        startTag17.appendTagName('4');
        java.lang.String str20 = startTag17.name();
        org.jsoup.nodes.Attributes attributes21 = startTag17.attributes;
        startTag17.appendAttributeValue('#');
        org.jsoup.nodes.Element element24 = xmlTreeBuilder0.insert(startTag17);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder25 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList28 = null;
        xmlTreeBuilder25.initialiseParse("Character", "hi!", parseErrorList28);
        org.jsoup.parser.ParseErrorList parseErrorList32 = null;
        xmlTreeBuilder25.initialiseParse("</hi!>", "Doctype", parseErrorList32);
        org.jsoup.parser.Token.EndTag endTag35 = new org.jsoup.parser.Token.EndTag("hi!");
        java.lang.String str36 = endTag35.toString();
        java.lang.String str37 = endTag35.toString();
        boolean boolean38 = endTag35.isDoctype();
        java.lang.String str39 = endTag35.tagName;
        java.lang.String str40 = endTag35.name();
        boolean boolean41 = xmlTreeBuilder25.process((org.jsoup.parser.Token) endTag35);
        org.jsoup.parser.Token.Character character43 = new org.jsoup.parser.Token.Character("EOF");
        java.lang.String str44 = character43.getData();
        java.lang.String str45 = character43.toString();
        java.lang.String str46 = character43.getData();
        java.lang.String str47 = character43.getData();
        xmlTreeBuilder25.insert(character43);
        java.lang.String str49 = character43.toString();
        xmlTreeBuilder0.insert(character43);
        org.jsoup.parser.Token.Doctype doctype51 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str52 = doctype51.tokenType();
        java.lang.StringBuilder stringBuilder53 = doctype51.publicIdentifier;
        doctype51.forceQuirks = false;
        // The following exception was thrown during execution in test generation
        try {
            xmlTreeBuilder0.insert(doctype51);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "</hi!>" + "'", str11, "</hi!>");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "</hi!>" + "'", str12, "</hi!>");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "4" + "'", str20, "4");
        org.junit.Assert.assertNotNull(attributes21);
        org.junit.Assert.assertNotNull(element24);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "</hi!>" + "'", str36, "</hi!>");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "</hi!>" + "'", str37, "</hi!>");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "hi!" + "'", str39, "hi!");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "hi!" + "'", str40, "hi!");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "EOF" + "'", str44, "EOF");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "EOF" + "'", str45, "EOF");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "EOF" + "'", str46, "EOF");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "EOF" + "'", str47, "EOF");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "EOF" + "'", str49, "EOF");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "Doctype" + "'", str52, "Doctype");
        org.junit.Assert.assertNotNull(stringBuilder53);
        org.junit.Assert.assertEquals(stringBuilder53.toString(), "");
    }

    @Test
    public void test3280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3280");
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
        org.jsoup.parser.Token.StartTag startTag17 = new org.jsoup.parser.Token.StartTag();
        startTag17.appendTagName('4');
        java.lang.String str20 = startTag17.name();
        org.jsoup.nodes.Attributes attributes21 = startTag17.attributes;
        startTag17.appendAttributeValue('#');
        org.jsoup.nodes.Element element24 = xmlTreeBuilder0.insert(startTag17);
        org.jsoup.nodes.Attributes attributes27 = null;
        org.jsoup.parser.Token.StartTag startTag28 = new org.jsoup.parser.Token.StartTag("", attributes27);
        startTag28.selfClosing = false;
        startTag28.newAttribute();
        org.jsoup.parser.Token.StartTag startTag33 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag35 = startTag33.name("hi!");
        org.jsoup.nodes.Attributes attributes36 = tag35.attributes;
        org.jsoup.parser.Token.StartTag startTag37 = new org.jsoup.parser.Token.StartTag("", attributes36);
        startTag28.attributes = attributes36;
        org.jsoup.parser.Token.StartTag startTag39 = new org.jsoup.parser.Token.StartTag("EndTag", attributes36);
        java.lang.String str40 = startTag39.tagName;
        org.jsoup.nodes.Element element41 = xmlTreeBuilder0.insert(startTag39);
        org.jsoup.parser.ParseErrorList parseErrorList44 = null;
        xmlTreeBuilder0.initialiseParse("</Character>", "</<!---->>", parseErrorList44);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "</hi!>" + "'", str11, "</hi!>");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "</hi!>" + "'", str12, "</hi!>");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "4" + "'", str20, "4");
        org.junit.Assert.assertNotNull(attributes21);
        org.junit.Assert.assertNotNull(element24);
        org.junit.Assert.assertNotNull(tag35);
        org.junit.Assert.assertNotNull(attributes36);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "EndTag" + "'", str40, "EndTag");
        org.junit.Assert.assertNotNull(element41);
    }

    @Test
    public void test3281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3281");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.tokenType();
        doctype0.forceQuirks = true;
        java.lang.String str4 = doctype0.getSystemIdentifier();
        java.lang.StringBuilder stringBuilder5 = doctype0.name;
        boolean boolean6 = doctype0.isCharacter();
        java.lang.StringBuilder stringBuilder7 = doctype0.systemIdentifier;
        doctype0.forceQuirks = true;
        java.lang.String str10 = doctype0.getPublicIdentifier();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Doctype" + "'", str1, "Doctype");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(stringBuilder7);
        org.junit.Assert.assertEquals(stringBuilder7.toString(), "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test3282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3282");
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
        boolean boolean34 = startTag33.isStartTag();
        boolean boolean35 = startTag33.selfClosing;
        startTag33.appendAttributeName('a');
        org.junit.Assert.assertNotNull(tag8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(tag18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertNotNull(tag28);
        org.junit.Assert.assertNotNull(attributes29);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test3283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3283");
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
        org.jsoup.parser.ParseErrorList parseErrorList22 = null;
        xmlTreeBuilder0.initialiseParse("<<</hi!>>>", "hi!a", parseErrorList22);
        org.jsoup.parser.Token.Doctype doctype24 = new org.jsoup.parser.Token.Doctype();
        boolean boolean25 = doctype24.forceQuirks;
        java.lang.StringBuilder stringBuilder26 = doctype24.systemIdentifier;
        boolean boolean27 = doctype24.forceQuirks;
        boolean boolean28 = doctype24.isStartTag();
        java.lang.StringBuilder stringBuilder29 = doctype24.systemIdentifier;
        java.lang.String str30 = doctype24.getSystemIdentifier();
        java.lang.String str31 = doctype24.tokenType();
        boolean boolean32 = doctype24.isEOF();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean33 = xmlTreeBuilder0.process((org.jsoup.parser.Token) doctype24);
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
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Doctype" + "'", str18, "Doctype");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(stringBuilder26);
        org.junit.Assert.assertEquals(stringBuilder26.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(stringBuilder29);
        org.junit.Assert.assertEquals(stringBuilder29.toString(), "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "Doctype" + "'", str31, "Doctype");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test3284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3284");
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
        boolean boolean20 = startTag17.isCharacter();
        startTag17.appendAttributeName("</</hi!>4>");
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(tag11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Doctype" + "'", str18, "Doctype");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test3285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3285");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        xmlTreeBuilder0.initialiseParse("</hi!>", "EOF", parseErrorList3);
        org.jsoup.parser.Token.StartTag startTag5 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag7 = startTag5.name("hi!");
        boolean boolean8 = xmlTreeBuilder0.process((org.jsoup.parser.Token) startTag5);
        startTag5.appendAttributeValue("StartTag");
        org.junit.Assert.assertNotNull(tag7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test3286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3286");
        org.jsoup.parser.Token.Character character1 = new org.jsoup.parser.Token.Character("<<</hi! >>>");
    }

    @Test
    public void test3287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3287");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        boolean boolean1 = doctype0.forceQuirks;
        java.lang.StringBuilder stringBuilder2 = doctype0.systemIdentifier;
        boolean boolean3 = doctype0.forceQuirks;
        boolean boolean4 = doctype0.isStartTag();
        java.lang.StringBuilder stringBuilder5 = doctype0.systemIdentifier;
        java.lang.String str6 = doctype0.getSystemIdentifier();
        java.lang.StringBuilder stringBuilder7 = doctype0.name;
        java.lang.String str8 = doctype0.getPublicIdentifier();
        java.lang.String str9 = doctype0.getPublicIdentifier();
        java.lang.StringBuilder stringBuilder10 = doctype0.publicIdentifier;
        org.jsoup.parser.Token.TokenType tokenType11 = doctype0.type;
        java.lang.String str12 = doctype0.getSystemIdentifier();
        java.lang.StringBuilder stringBuilder13 = doctype0.publicIdentifier;
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
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(stringBuilder10);
        org.junit.Assert.assertEquals(stringBuilder10.toString(), "");
        org.junit.Assert.assertTrue("'" + tokenType11 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType11.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(stringBuilder13);
        org.junit.Assert.assertEquals(stringBuilder13.toString(), "");
    }

    @Test
    public void test3288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3288");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("hi!");
        java.lang.String str2 = endTag1.toString();
        boolean boolean3 = endTag1.isEOF();
        endTag1.appendAttributeName("<Doctype>");
        java.lang.String str6 = endTag1.tagName;
        org.jsoup.parser.Token.Tag tag8 = endTag1.name("<Doctype>");
        endTag1.appendTagName('a');
        org.jsoup.parser.Token.Tag tag12 = endTag1.name("</hi!#>");
        boolean boolean13 = endTag1.selfClosing;
        endTag1.appendTagName('#');
        endTag1.newAttribute();
        endTag1.selfClosing = false;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "</hi!>" + "'", str2, "</hi!>");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(tag8);
        org.junit.Assert.assertNotNull(tag12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test3289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3289");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("hi!");
        boolean boolean2 = endTag1.selfClosing;
        java.lang.String str3 = endTag1.toString();
        java.lang.String str4 = endTag1.toString();
        endTag1.appendAttributeValue("<4>");
        java.lang.String str7 = endTag1.toString();
        org.jsoup.parser.Token.TokenType tokenType8 = endTag1.type;
        boolean boolean9 = endTag1.selfClosing;
        endTag1.tagName = "</hi!>4";
        boolean boolean12 = endTag1.isDoctype();
        java.lang.String str13 = endTag1.toString();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "</hi!>" + "'", str3, "</hi!>");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "</hi!>" + "'", str4, "</hi!>");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "</hi!>" + "'", str7, "</hi!>");
        org.junit.Assert.assertTrue("'" + tokenType8 + "' != '" + org.jsoup.parser.Token.TokenType.EndTag + "'", tokenType8.equals(org.jsoup.parser.Token.TokenType.EndTag));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "</</hi!>4>" + "'", str13, "</</hi!>4>");
    }

    @Test
    public void test3290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3290");
        org.jsoup.parser.Token.Character character1 = new org.jsoup.parser.Token.Character("EOF");
        java.lang.String str2 = character1.getData();
        java.lang.String str3 = character1.toString();
        boolean boolean4 = character1.isStartTag();
        java.lang.String str5 = character1.toString();
        java.lang.String str6 = character1.toString();
        org.jsoup.parser.Token.TokenType tokenType7 = org.jsoup.parser.Token.TokenType.Comment;
        character1.type = tokenType7;
        org.jsoup.parser.Token.Character character9 = character1.asCharacter();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "EOF" + "'", str2, "EOF");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "EOF" + "'", str3, "EOF");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "EOF" + "'", str5, "EOF");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "EOF" + "'", str6, "EOF");
        org.junit.Assert.assertTrue("'" + tokenType7 + "' != '" + org.jsoup.parser.Token.TokenType.Comment + "'", tokenType7.equals(org.jsoup.parser.Token.TokenType.Comment));
        org.junit.Assert.assertNotNull(character9);
    }

    @Test
    public void test3291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3291");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        boolean boolean1 = doctype0.forceQuirks;
        java.lang.StringBuilder stringBuilder2 = doctype0.systemIdentifier;
        boolean boolean3 = doctype0.isCharacter();
        doctype0.forceQuirks = false;
        java.lang.StringBuilder stringBuilder6 = doctype0.publicIdentifier;
        boolean boolean7 = doctype0.isStartTag();
        java.lang.StringBuilder stringBuilder8 = doctype0.publicIdentifier;
        java.lang.String str9 = doctype0.getPublicIdentifier();
        boolean boolean10 = doctype0.isEndTag();
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
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test3292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3292");
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
        org.jsoup.parser.Token.EndTag endTag25 = new org.jsoup.parser.Token.EndTag("hi!");
        boolean boolean26 = endTag25.selfClosing;
        endTag25.finaliseTag();
        java.lang.String str28 = endTag25.toString();
        java.lang.String str29 = endTag25.tokenType();
        org.jsoup.nodes.Attributes attributes30 = endTag25.attributes;
        java.lang.String str31 = endTag25.name();
        java.lang.String str32 = endTag25.tokenType();
        boolean boolean33 = endTag25.isCharacter();
        boolean boolean34 = xmlTreeBuilder0.process((org.jsoup.parser.Token) endTag25);
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
        org.jsoup.parser.Token.StartTag startTag52 = new org.jsoup.parser.Token.StartTag("Doctype");
        java.lang.String str53 = startTag52.name();
        boolean boolean54 = xmlTreeBuilder35.process((org.jsoup.parser.Token) startTag52);
        org.jsoup.parser.Token.Comment comment55 = new org.jsoup.parser.Token.Comment();
        java.lang.StringBuilder stringBuilder56 = comment55.data;
        java.lang.String str57 = comment55.getData();
        java.lang.StringBuilder stringBuilder58 = comment55.data;
        xmlTreeBuilder35.insert(comment55);
        java.lang.StringBuilder stringBuilder60 = comment55.data;
        java.lang.String str61 = comment55.getData();
        java.lang.String str62 = comment55.getData();
        xmlTreeBuilder0.insert(comment55);
        org.jsoup.parser.ParseErrorList parseErrorList66 = null;
        xmlTreeBuilder0.initialiseParse("<<hi!>>", "<a>", parseErrorList66);
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
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "</hi!>" + "'", str28, "</hi!>");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "EndTag" + "'", str29, "EndTag");
        org.junit.Assert.assertNull(attributes30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "EndTag" + "'", str32, "EndTag");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(stringBuilder41);
        org.junit.Assert.assertEquals(stringBuilder41.toString(), "");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertNotNull(tag46);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(element50);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "Doctype" + "'", str53, "Doctype");
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertNotNull(stringBuilder56);
        org.junit.Assert.assertEquals(stringBuilder56.toString(), "");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "" + "'", str57, "");
        org.junit.Assert.assertNotNull(stringBuilder58);
        org.junit.Assert.assertEquals(stringBuilder58.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder60);
        org.junit.Assert.assertEquals(stringBuilder60.toString(), "");
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "" + "'", str61, "");
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "" + "'", str62, "");
    }

    @Test
    public void test3293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3293");
        org.jsoup.parser.Token.StartTag startTag1 = new org.jsoup.parser.Token.StartTag("</Doctype4>");
        boolean boolean2 = startTag1.isStartTag();
        startTag1.selfClosing = true;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test3294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3294");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        boolean boolean1 = doctype0.forceQuirks;
        java.lang.StringBuilder stringBuilder2 = doctype0.systemIdentifier;
        boolean boolean3 = doctype0.isCharacter();
        doctype0.forceQuirks = false;
        java.lang.String str6 = doctype0.getSystemIdentifier();
        java.lang.StringBuilder stringBuilder7 = doctype0.publicIdentifier;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(stringBuilder7);
        org.junit.Assert.assertEquals(stringBuilder7.toString(), "");
    }

    @Test
    public void test3295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3295");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.tokenType();
        doctype0.forceQuirks = true;
        java.lang.String str4 = doctype0.getSystemIdentifier();
        java.lang.StringBuilder stringBuilder5 = doctype0.name;
        boolean boolean6 = doctype0.isDoctype();
        java.lang.StringBuilder stringBuilder7 = doctype0.publicIdentifier;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Doctype" + "'", str1, "Doctype");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(stringBuilder7);
        org.junit.Assert.assertEquals(stringBuilder7.toString(), "");
    }

    @Test
    public void test3296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3296");
        org.jsoup.nodes.Attributes attributes1 = null;
        org.jsoup.parser.Token.StartTag startTag2 = new org.jsoup.parser.Token.StartTag("", attributes1);
        org.jsoup.parser.Token.StartTag startTag3 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag5 = startTag3.name("hi!");
        org.jsoup.nodes.Attributes attributes6 = tag5.attributes;
        startTag2.attributes = attributes6;
        org.jsoup.parser.Token.TokenType tokenType8 = startTag2.type;
        java.lang.String str9 = startTag2.tokenType();
        java.lang.String str10 = startTag2.tokenType();
        org.junit.Assert.assertNotNull(tag5);
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertTrue("'" + tokenType8 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType8.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "StartTag" + "'", str9, "StartTag");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "StartTag" + "'", str10, "StartTag");
    }

    @Test
    public void test3297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3297");
        org.jsoup.nodes.Attributes attributes1 = null;
        org.jsoup.parser.Token.StartTag startTag2 = new org.jsoup.parser.Token.StartTag("", attributes1);
        boolean boolean3 = startTag2.isDoctype();
        java.lang.String str4 = startTag2.tagName;
        startTag2.newAttribute();
        startTag2.appendTagName("</hi!>");
        startTag2.appendAttributeName("EOF");
        org.jsoup.parser.Token.StartTag startTag10 = startTag2.asStartTag();
        java.lang.String str11 = startTag2.toString();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(startTag10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "<</hi!>>" + "'", str11, "<</hi!>>");
    }

    @Test
    public void test3298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3298");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.appendAttributeName('a');
        startTag0.newAttribute();
        boolean boolean4 = startTag0.isDoctype();
        startTag0.finaliseTag();
        boolean boolean6 = startTag0.isDoctype();
        org.jsoup.parser.Token.EndTag endTag8 = new org.jsoup.parser.Token.EndTag("hi!");
        boolean boolean9 = endTag8.selfClosing;
        java.lang.String str10 = endTag8.toString();
        java.lang.String str11 = endTag8.toString();
        boolean boolean12 = endTag8.isComment();
        org.jsoup.nodes.Attributes attributes16 = null;
        org.jsoup.parser.Token.StartTag startTag17 = new org.jsoup.parser.Token.StartTag("", attributes16);
        org.jsoup.parser.Token.StartTag startTag18 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag20 = startTag18.name("hi!");
        org.jsoup.nodes.Attributes attributes21 = tag20.attributes;
        startTag17.attributes = attributes21;
        org.jsoup.parser.Token.StartTag startTag23 = new org.jsoup.parser.Token.StartTag("Doctype", attributes21);
        org.jsoup.parser.Token.StartTag startTag24 = new org.jsoup.parser.Token.StartTag("", attributes21);
        endTag8.attributes = attributes21;
        startTag0.attributes = attributes21;
        startTag0.tagName = "<4</hi!>4>";
        boolean boolean29 = startTag0.isStartTag();
        startTag0.selfClosing = true;
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "</hi!>" + "'", str10, "</hi!>");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "</hi!>" + "'", str11, "</hi!>");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(tag20);
        org.junit.Assert.assertNotNull(attributes21);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
    }

    @Test
    public void test3299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3299");
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
        java.lang.String str35 = comment29.tokenType();
        xmlTreeBuilder0.insert(comment29);
        org.jsoup.parser.Token.StartTag startTag37 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag39 = startTag37.name("hi!");
        startTag37.appendAttributeValue("<</hi!>>");
        boolean boolean42 = startTag37.isSelfClosing();
        startTag37.selfClosing = false;
        org.jsoup.nodes.Element element45 = xmlTreeBuilder0.insert(startTag37);
        boolean boolean46 = startTag37.isEOF();
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(tag11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Doctype" + "'", str18, "Doctype");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(tag27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(stringBuilder30);
        org.junit.Assert.assertEquals(stringBuilder30.toString(), "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "<!---->" + "'", str31, "<!---->");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "<!---->" + "'", str33, "<!---->");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "Comment" + "'", str35, "Comment");
        org.junit.Assert.assertNotNull(tag39);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(element45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
    }

    @Test
    public void test3300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3300");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.appendAttributeName('a');
        java.lang.String str3 = startTag0.tagName;
        org.jsoup.parser.Token.StartTag startTag4 = startTag0.asStartTag();
        startTag0.appendTagName('a');
        startTag0.appendTagName('#');
        startTag0.appendAttributeName('#');
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(startTag4);
    }

    @Test
    public void test3301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3301");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.tokenType();
        doctype0.forceQuirks = true;
        java.lang.String str4 = doctype0.getName();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Doctype" + "'", str1, "Doctype");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test3302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3302");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        boolean boolean1 = doctype0.forceQuirks;
        java.lang.StringBuilder stringBuilder2 = doctype0.systemIdentifier;
        boolean boolean3 = doctype0.isCharacter();
        doctype0.forceQuirks = false;
        java.lang.String str6 = doctype0.getName();
        java.lang.String str7 = doctype0.getName();
        boolean boolean8 = doctype0.isForceQuirks();
        boolean boolean9 = doctype0.isEOF();
        java.lang.String str10 = doctype0.getPublicIdentifier();
        doctype0.forceQuirks = false;
        boolean boolean13 = doctype0.forceQuirks;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.StartTag startTag14 = doctype0.asStartTag();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$Doctype cannot be cast to class org.jsoup.parser.Token$StartTag (org.jsoup.parser.Token$Doctype and org.jsoup.parser.Token$StartTag are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test3303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3303");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("<4</hi!>4>");
        boolean boolean2 = endTag1.selfClosing;
        org.jsoup.parser.Token.TokenType tokenType3 = endTag1.type;
        java.lang.String str4 = endTag1.toString();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + tokenType3 + "' != '" + org.jsoup.parser.Token.TokenType.EndTag + "'", tokenType3.equals(org.jsoup.parser.Token.TokenType.EndTag));
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "</<4</hi!>4>>" + "'", str4, "</<4</hi!>4>>");
    }

    @Test
    public void test3304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3304");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.tokenType();
        boolean boolean2 = doctype0.isForceQuirks();
        java.lang.String str3 = doctype0.getPublicIdentifier();
        boolean boolean4 = doctype0.isForceQuirks();
        boolean boolean5 = doctype0.forceQuirks;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Doctype" + "'", str1, "Doctype");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test3305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3305");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.tokenType();
        boolean boolean2 = doctype0.isForceQuirks();
        java.lang.String str3 = doctype0.getPublicIdentifier();
        boolean boolean4 = doctype0.isForceQuirks();
        boolean boolean5 = doctype0.isForceQuirks();
        boolean boolean6 = doctype0.isComment();
        boolean boolean7 = doctype0.forceQuirks;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Doctype" + "'", str1, "Doctype");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test3306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3306");
        org.jsoup.nodes.Attributes attributes1 = null;
        org.jsoup.parser.Token.StartTag startTag2 = new org.jsoup.parser.Token.StartTag("", attributes1);
        boolean boolean3 = startTag2.isDoctype();
        java.lang.String str4 = startTag2.tagName;
        startTag2.newAttribute();
        startTag2.appendTagName("</hi!>");
        java.lang.String str8 = startTag2.name();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "</hi!>" + "'", str8, "</hi!>");
    }

    @Test
    public void test3307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3307");
        org.jsoup.parser.Token.Character character1 = new org.jsoup.parser.Token.Character("EOF");
        java.lang.String str2 = character1.toString();
        java.lang.String str3 = character1.toString();
        java.lang.String str4 = character1.toString();
        boolean boolean5 = character1.isEOF();
        java.lang.String str6 = character1.toString();
        org.jsoup.parser.Token.TokenType tokenType7 = character1.type;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "EOF" + "'", str2, "EOF");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "EOF" + "'", str3, "EOF");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "EOF" + "'", str4, "EOF");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "EOF" + "'", str6, "EOF");
        org.junit.Assert.assertTrue("'" + tokenType7 + "' != '" + org.jsoup.parser.Token.TokenType.Character + "'", tokenType7.equals(org.jsoup.parser.Token.TokenType.Character));
    }

    @Test
    public void test3308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3308");
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
        org.jsoup.nodes.Attributes attributes17 = null;
        org.jsoup.parser.Token.StartTag startTag18 = new org.jsoup.parser.Token.StartTag("", attributes17);
        org.jsoup.parser.Token.StartTag startTag19 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag21 = startTag19.name("hi!");
        org.jsoup.nodes.Attributes attributes22 = tag21.attributes;
        startTag18.attributes = attributes22;
        startTag2.attributes = attributes22;
        startTag2.newAttribute();
        org.jsoup.nodes.Attributes attributes26 = startTag2.attributes;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + tokenType5 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType5.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(tag12);
        org.junit.Assert.assertNotNull(attributes13);
        org.junit.Assert.assertNotNull(tag21);
        org.junit.Assert.assertNotNull(attributes22);
        org.junit.Assert.assertNotNull(attributes26);
    }

    @Test
    public void test3309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3309");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag2 = startTag0.name("hi!");
        startTag0.finaliseTag();
        startTag0.appendAttributeValue("</hi!>");
        boolean boolean6 = startTag0.isDoctype();
        startTag0.appendAttributeName('a');
        org.jsoup.parser.Token.StartTag startTag9 = startTag0.asStartTag();
        org.junit.Assert.assertNotNull(tag2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(startTag9);
    }

    @Test
    public void test3310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3310");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("hi!");
        boolean boolean2 = endTag1.selfClosing;
        org.jsoup.parser.Token.Tag tag4 = endTag1.name("");
        boolean boolean5 = endTag1.isEndTag();
        org.jsoup.parser.Token.Tag tag7 = endTag1.name("<4>");
        org.jsoup.nodes.Attributes attributes8 = endTag1.getAttributes();
        java.lang.String str9 = endTag1.tagName;
        boolean boolean10 = endTag1.isDoctype();
        boolean boolean11 = endTag1.selfClosing;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(tag4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(tag7);
        org.junit.Assert.assertNull(attributes8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<4>" + "'", str9, "<4>");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test3311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3311");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        boolean boolean1 = doctype0.forceQuirks;
        java.lang.StringBuilder stringBuilder2 = doctype0.systemIdentifier;
        boolean boolean3 = doctype0.isCharacter();
        doctype0.forceQuirks = false;
        boolean boolean6 = doctype0.isEOF();
        doctype0.forceQuirks = true;
        java.lang.StringBuilder stringBuilder9 = doctype0.publicIdentifier;
        java.lang.StringBuilder stringBuilder10 = doctype0.publicIdentifier;
        doctype0.forceQuirks = false;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.EndTag endTag13 = doctype0.asEndTag();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$Doctype cannot be cast to class org.jsoup.parser.Token$EndTag (org.jsoup.parser.Token$Doctype and org.jsoup.parser.Token$EndTag are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(stringBuilder9);
        org.junit.Assert.assertEquals(stringBuilder9.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder10);
        org.junit.Assert.assertEquals(stringBuilder10.toString(), "");
    }

    @Test
    public void test3312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3312");
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
        startTag10.appendTagName("<<</hi! >>>");
        org.junit.Assert.assertNotNull(attributes9);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "<Doctype>" + "'", str20, "<Doctype>");
    }

    @Test
    public void test3313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3313");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag2 = startTag0.name("hi!");
        startTag0.finaliseTag();
        org.jsoup.parser.Token.EndTag endTag5 = new org.jsoup.parser.Token.EndTag("hi!");
        java.lang.String str6 = endTag5.toString();
        java.lang.String str7 = endTag5.toString();
        boolean boolean8 = endTag5.isDoctype();
        endTag5.appendAttributeName("EOF");
        boolean boolean11 = endTag5.isStartTag();
        endTag5.tagName = "Character";
        java.lang.String str14 = endTag5.tagName;
        org.jsoup.parser.Token.TokenType tokenType15 = endTag5.type;
        startTag0.type = tokenType15;
        startTag0.appendAttributeName('a');
        java.lang.String str19 = startTag0.toString();
        org.junit.Assert.assertNotNull(tag2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "</hi!>" + "'", str6, "</hi!>");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "</hi!>" + "'", str7, "</hi!>");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Character" + "'", str14, "Character");
        org.junit.Assert.assertTrue("'" + tokenType15 + "' != '" + org.jsoup.parser.Token.TokenType.EndTag + "'", tokenType15.equals(org.jsoup.parser.Token.TokenType.EndTag));
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "<hi!>" + "'", str19, "<hi!>");
    }

    @Test
    public void test3314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3314");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("hi!");
        java.lang.String str2 = endTag1.toString();
        java.lang.String str3 = endTag1.toString();
        boolean boolean4 = endTag1.isDoctype();
        endTag1.appendAttributeName("EOF");
        boolean boolean7 = endTag1.isEOF();
        org.jsoup.parser.Token.Tag tag9 = endTag1.name("4");
        java.lang.String str10 = tag9.name();
        tag9.appendAttributeValue('#');
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.StartTag startTag13 = tag9.asStartTag();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$EndTag cannot be cast to class org.jsoup.parser.Token$StartTag (org.jsoup.parser.Token$EndTag and org.jsoup.parser.Token$StartTag are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "</hi!>" + "'", str2, "</hi!>");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "</hi!>" + "'", str3, "</hi!>");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(tag9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "4" + "'", str10, "4");
    }

    @Test
    public void test3315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3315");
        org.jsoup.parser.Token.StartTag startTag1 = new org.jsoup.parser.Token.StartTag("<Doctype>");
        boolean boolean2 = startTag1.isComment();
        boolean boolean3 = startTag1.isComment();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test3316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3316");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        boolean boolean1 = doctype0.forceQuirks;
        java.lang.StringBuilder stringBuilder2 = doctype0.systemIdentifier;
        boolean boolean3 = doctype0.isCharacter();
        doctype0.forceQuirks = false;
        java.lang.String str6 = doctype0.getName();
        doctype0.forceQuirks = true;
        boolean boolean9 = doctype0.isForceQuirks();
        boolean boolean10 = doctype0.isForceQuirks();
        java.lang.StringBuilder stringBuilder11 = doctype0.publicIdentifier;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Character character12 = doctype0.asCharacter();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$Doctype cannot be cast to class org.jsoup.parser.Token$Character (org.jsoup.parser.Token$Doctype and org.jsoup.parser.Token$Character are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(stringBuilder11);
        org.junit.Assert.assertEquals(stringBuilder11.toString(), "");
    }

    @Test
    public void test3317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3317");
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
        org.jsoup.nodes.Attributes attributes17 = null;
        org.jsoup.parser.Token.StartTag startTag18 = new org.jsoup.parser.Token.StartTag("", attributes17);
        startTag18.selfClosing = false;
        startTag18.newAttribute();
        org.jsoup.nodes.Attributes attributes22 = startTag18.getAttributes();
        tag15.attributes = attributes22;
        tag15.appendAttributeName("<<</hi!>>  a=\"\">");
        org.junit.Assert.assertNotNull(tag7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "<4>" + "'", str13, "<4>");
        org.junit.Assert.assertNotNull(tag15);
        org.junit.Assert.assertNotNull(attributes22);
    }

    @Test
    public void test3318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3318");
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
        java.lang.StringBuilder stringBuilder11 = doctype0.name;
        java.lang.StringBuilder stringBuilder12 = doctype0.name;
        java.lang.StringBuilder stringBuilder13 = doctype0.name;
        boolean boolean14 = doctype0.forceQuirks;
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
        org.junit.Assert.assertNotNull(stringBuilder11);
        org.junit.Assert.assertEquals(stringBuilder11.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder12);
        org.junit.Assert.assertEquals(stringBuilder12.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder13);
        org.junit.Assert.assertEquals(stringBuilder13.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test3319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3319");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("Doctype");
        boolean boolean2 = endTag1.isStartTag();
        endTag1.appendAttributeValue(' ');
        org.jsoup.parser.Token.Tag tag6 = endTag1.name("<<</hi!>>>");
        endTag1.appendTagName("<hi!4>");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(tag6);
    }

    @Test
    public void test3320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3320");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("hi!");
        boolean boolean2 = endTag1.selfClosing;
        endTag1.finaliseTag();
        endTag1.appendAttributeName(' ');
        endTag1.tagName = "Doctype";
        endTag1.appendTagName('4');
        java.lang.String str10 = endTag1.toString();
        org.jsoup.nodes.Attributes attributes12 = null;
        org.jsoup.parser.Token.StartTag startTag13 = new org.jsoup.parser.Token.StartTag("", attributes12);
        boolean boolean14 = startTag13.isDoctype();
        java.lang.String str15 = startTag13.tagName;
        org.jsoup.parser.Token.TokenType tokenType16 = startTag13.type;
        startTag13.appendTagName(' ');
        boolean boolean19 = startTag13.isDoctype();
        org.jsoup.parser.Token.StartTag startTag21 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag23 = startTag21.name("hi!");
        org.jsoup.nodes.Attributes attributes24 = tag23.attributes;
        org.jsoup.parser.Token.StartTag startTag25 = new org.jsoup.parser.Token.StartTag("", attributes24);
        startTag13.attributes = attributes24;
        org.jsoup.nodes.Attributes attributes28 = null;
        org.jsoup.parser.Token.StartTag startTag29 = new org.jsoup.parser.Token.StartTag("", attributes28);
        org.jsoup.parser.Token.StartTag startTag30 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag32 = startTag30.name("hi!");
        org.jsoup.nodes.Attributes attributes33 = tag32.attributes;
        startTag29.attributes = attributes33;
        startTag13.attributes = attributes33;
        org.jsoup.nodes.Attributes attributes36 = startTag13.getAttributes();
        endTag1.attributes = attributes36;
        endTag1.appendTagName("</hi!>");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "</Doctype4>" + "'", str10, "</Doctype4>");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + tokenType16 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType16.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(tag23);
        org.junit.Assert.assertNotNull(attributes24);
        org.junit.Assert.assertNotNull(tag32);
        org.junit.Assert.assertNotNull(attributes33);
        org.junit.Assert.assertNotNull(attributes36);
    }

    @Test
    public void test3321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3321");
        org.jsoup.nodes.Attributes attributes1 = null;
        org.jsoup.parser.Token.StartTag startTag2 = new org.jsoup.parser.Token.StartTag("", attributes1);
        startTag2.selfClosing = false;
        startTag2.appendAttributeValue('a');
        boolean boolean7 = startTag2.isCharacter();
        java.lang.Class<?> wildcardClass8 = startTag2.getClass();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test3322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3322");
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
        startTag10.appendTagName("</hi! >");
        org.junit.Assert.assertNotNull(attributes9);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "<Doctype>" + "'", str13, "<Doctype>");
        org.junit.Assert.assertNotNull(startTag14);
    }

    @Test
    public void test3323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3323");
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
        org.jsoup.parser.Token.Character character86 = new org.jsoup.parser.Token.Character("EOF");
        java.lang.String str87 = character86.getData();
        java.lang.String str88 = character86.toString();
        boolean boolean89 = character86.isStartTag();
        xmlTreeBuilder0.insert(character86);
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
        org.junit.Assert.assertEquals("'" + str87 + "' != '" + "EOF" + "'", str87, "EOF");
        org.junit.Assert.assertEquals("'" + str88 + "' != '" + "EOF" + "'", str88, "EOF");
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
    }

    @Test
    public void test3324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3324");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.tokenType();
        org.jsoup.parser.Token.Doctype doctype2 = doctype0.asDoctype();
        boolean boolean3 = doctype2.isForceQuirks();
        java.lang.StringBuilder stringBuilder4 = doctype2.name;
        doctype2.forceQuirks = false;
        boolean boolean7 = doctype2.isForceQuirks();
        org.jsoup.parser.Token.Doctype doctype8 = doctype2.asDoctype();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Doctype" + "'", str1, "Doctype");
        org.junit.Assert.assertNotNull(doctype2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(doctype8);
    }

    @Test
    public void test3325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3325");
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
        org.jsoup.parser.Token.EndTag endTag74 = new org.jsoup.parser.Token.EndTag("hi!");
        boolean boolean75 = endTag74.selfClosing;
        endTag74.finaliseTag();
        endTag74.appendAttributeName(' ');
        boolean boolean79 = endTag74.isStartTag();
        endTag74.appendAttributeName('a');
        org.jsoup.parser.Token.EOF eOF82 = new org.jsoup.parser.Token.EOF();
        org.jsoup.parser.Token.TokenType tokenType83 = eOF82.type;
        endTag74.type = tokenType83;
        java.lang.String str85 = endTag74.toString();
        endTag74.finaliseTag();
        boolean boolean87 = xmlTreeBuilder0.process((org.jsoup.parser.Token) endTag74);
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
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertTrue("'" + tokenType83 + "' != '" + org.jsoup.parser.Token.TokenType.EOF + "'", tokenType83.equals(org.jsoup.parser.Token.TokenType.EOF));
        org.junit.Assert.assertEquals("'" + str85 + "' != '" + "</hi!>" + "'", str85, "</hi!>");
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + true + "'", boolean87 == true);
    }

    @Test
    public void test3326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3326");
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
        org.jsoup.parser.Token.Character character54 = new org.jsoup.parser.Token.Character("EOF");
        java.lang.String str55 = character54.getData();
        java.lang.String str56 = character54.toString();
        boolean boolean57 = character54.isStartTag();
        java.lang.String str58 = character54.toString();
        java.lang.String str59 = character54.toString();
        java.lang.String str60 = character54.getData();
        java.lang.String str61 = character54.getData();
        java.lang.String str62 = character54.toString();
        xmlTreeBuilder0.insert(character54);
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
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "EOF" + "'", str55, "EOF");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "EOF" + "'", str56, "EOF");
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "EOF" + "'", str58, "EOF");
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "EOF" + "'", str59, "EOF");
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "EOF" + "'", str60, "EOF");
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "EOF" + "'", str61, "EOF");
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "EOF" + "'", str62, "EOF");
    }

    @Test
    public void test3327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3327");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("hi!");
        java.lang.String str2 = endTag1.toString();
        java.lang.String str3 = endTag1.toString();
        boolean boolean4 = endTag1.isDoctype();
        java.lang.String str5 = endTag1.tagName;
        org.jsoup.parser.Token.StartTag startTag7 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag9 = startTag7.name("hi!");
        org.jsoup.nodes.Attributes attributes10 = tag9.attributes;
        org.jsoup.parser.Token.StartTag startTag11 = new org.jsoup.parser.Token.StartTag("</hi!>", attributes10);
        endTag1.attributes = attributes10;
        endTag1.appendAttributeValue("StartTag");
        boolean boolean15 = endTag1.isStartTag();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "</hi!>" + "'", str2, "</hi!>");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "</hi!>" + "'", str3, "</hi!>");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(tag9);
        org.junit.Assert.assertNotNull(attributes10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test3328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3328");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        xmlTreeBuilder0.initialiseParse("Character", "hi!", parseErrorList3);
        org.jsoup.parser.ParseErrorList parseErrorList7 = null;
        xmlTreeBuilder0.initialiseParse("</hi!>", "Doctype", parseErrorList7);
        org.jsoup.parser.Token.Character character10 = new org.jsoup.parser.Token.Character("EOF");
        java.lang.String str11 = character10.toString();
        java.lang.String str12 = character10.toString();
        xmlTreeBuilder0.insert(character10);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder14 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList17 = null;
        xmlTreeBuilder14.initialiseParse("Character", "hi!", parseErrorList17);
        org.jsoup.parser.Token.Comment comment19 = new org.jsoup.parser.Token.Comment();
        java.lang.StringBuilder stringBuilder20 = comment19.data;
        java.lang.String str21 = comment19.getData();
        xmlTreeBuilder14.insert(comment19);
        org.jsoup.parser.Token.StartTag startTag23 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag25 = startTag23.name("hi!");
        startTag23.appendAttributeName(' ');
        boolean boolean28 = startTag23.isComment();
        org.jsoup.nodes.Element element29 = xmlTreeBuilder14.insert(startTag23);
        org.jsoup.nodes.Attributes attributes34 = null;
        org.jsoup.parser.Token.StartTag startTag35 = new org.jsoup.parser.Token.StartTag("", attributes34);
        org.jsoup.parser.Token.StartTag startTag36 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag38 = startTag36.name("hi!");
        org.jsoup.nodes.Attributes attributes39 = tag38.attributes;
        startTag35.attributes = attributes39;
        org.jsoup.parser.Token.StartTag startTag41 = new org.jsoup.parser.Token.StartTag("Doctype", attributes39);
        org.jsoup.parser.Token.StartTag startTag42 = new org.jsoup.parser.Token.StartTag("", attributes39);
        org.jsoup.parser.Token.StartTag startTag43 = new org.jsoup.parser.Token.StartTag("EOF", attributes39);
        org.jsoup.nodes.Element element44 = xmlTreeBuilder14.insert(startTag43);
        startTag43.newAttribute();
        org.jsoup.nodes.Element element46 = xmlTreeBuilder0.insert(startTag43);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "EOF" + "'", str11, "EOF");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "EOF" + "'", str12, "EOF");
        org.junit.Assert.assertNotNull(stringBuilder20);
        org.junit.Assert.assertEquals(stringBuilder20.toString(), "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(tag25);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(element29);
        org.junit.Assert.assertNotNull(tag38);
        org.junit.Assert.assertNotNull(attributes39);
        org.junit.Assert.assertNotNull(element44);
        org.junit.Assert.assertNotNull(element46);
    }

    @Test
    public void test3329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3329");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("</hi!hi!a>");
    }

    @Test
    public void test3330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3330");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        boolean boolean1 = doctype0.forceQuirks;
        java.lang.StringBuilder stringBuilder2 = doctype0.systemIdentifier;
        boolean boolean3 = doctype0.isCharacter();
        java.lang.String str4 = doctype0.getName();
        boolean boolean5 = doctype0.isForceQuirks();
        java.lang.StringBuilder stringBuilder6 = doctype0.name;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "");
    }

    @Test
    public void test3331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3331");
        org.jsoup.nodes.Attributes attributes3 = null;
        org.jsoup.parser.Token.StartTag startTag4 = new org.jsoup.parser.Token.StartTag("", attributes3);
        org.jsoup.parser.Token.StartTag startTag5 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag7 = startTag5.name("hi!");
        org.jsoup.nodes.Attributes attributes8 = tag7.attributes;
        startTag4.attributes = attributes8;
        org.jsoup.parser.Token.StartTag startTag10 = new org.jsoup.parser.Token.StartTag("Doctype", attributes8);
        org.jsoup.parser.Token.StartTag startTag11 = new org.jsoup.parser.Token.StartTag("", attributes8);
        startTag11.appendAttributeValue("</hi!>");
        java.lang.String str14 = startTag11.tokenType();
        org.jsoup.parser.Token.Tag tag16 = startTag11.name("<4>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Character character17 = startTag11.asCharacter();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$Character (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$Character are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tag7);
        org.junit.Assert.assertNotNull(attributes8);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "StartTag" + "'", str14, "StartTag");
        org.junit.Assert.assertNotNull(tag16);
    }

    @Test
    public void test3332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3332");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.tokenType();
        org.jsoup.parser.Token.Doctype doctype2 = doctype0.asDoctype();
        java.lang.StringBuilder stringBuilder3 = doctype2.name;
        boolean boolean4 = doctype2.isForceQuirks();
        java.lang.String str5 = doctype2.getPublicIdentifier();
        java.lang.String str6 = doctype2.getSystemIdentifier();
        java.lang.String str7 = doctype2.getPublicIdentifier();
        doctype2.forceQuirks = false;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Doctype" + "'", str1, "Doctype");
        org.junit.Assert.assertNotNull(doctype2);
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test3333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3333");
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
        org.jsoup.parser.Token.Character character35 = new org.jsoup.parser.Token.Character("<4>");
        java.lang.String str36 = character35.toString();
        boolean boolean37 = character35.isEndTag();
        java.lang.String str38 = character35.toString();
        java.lang.String str39 = character35.getData();
        xmlTreeBuilder0.insert(character35);
        org.jsoup.parser.Token.StartTag startTag44 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag46 = startTag44.name("hi!");
        org.jsoup.nodes.Attributes attributes47 = tag46.attributes;
        org.jsoup.parser.Token.StartTag startTag48 = new org.jsoup.parser.Token.StartTag("</hi!>", attributes47);
        org.jsoup.parser.Token.StartTag startTag49 = new org.jsoup.parser.Token.StartTag("", attributes47);
        org.jsoup.parser.Token.StartTag startTag50 = new org.jsoup.parser.Token.StartTag("<hi!>", attributes47);
        java.lang.String str51 = startTag50.name();
        startTag50.appendTagName("<4>");
        startTag50.appendAttributeValue("</4>");
        org.jsoup.nodes.Element element56 = xmlTreeBuilder0.insert(startTag50);
        org.junit.Assert.assertNotNull(tag7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(stringBuilder15);
        org.junit.Assert.assertEquals(stringBuilder15.toString(), "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(attributes29);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(element33);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "<4>" + "'", str36, "<4>");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "<4>" + "'", str38, "<4>");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "<4>" + "'", str39, "<4>");
        org.junit.Assert.assertNotNull(tag46);
        org.junit.Assert.assertNotNull(attributes47);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "<hi!>" + "'", str51, "<hi!>");
        org.junit.Assert.assertNotNull(element56);
    }

    @Test
    public void test3334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3334");
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
        startTag9.appendAttributeName('4');
        org.junit.Assert.assertNotNull(tag5);
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "<hi!>" + "'", str10, "<hi!>");
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(attributes15);
    }

    @Test
    public void test3335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3335");
        org.jsoup.parser.Token.Character character1 = new org.jsoup.parser.Token.Character("<Doctype>");
        java.lang.String str2 = character1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "<Doctype>" + "'", str2, "<Doctype>");
    }

    @Test
    public void test3336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3336");
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
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder58 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.Token.EOF eOF59 = new org.jsoup.parser.Token.EOF();
        java.lang.String str60 = eOF59.tokenType();
        boolean boolean61 = xmlTreeBuilder58.process((org.jsoup.parser.Token) eOF59);
        org.jsoup.parser.ParseErrorList parseErrorList64 = null;
        xmlTreeBuilder58.initialiseParse("", "EndTag", parseErrorList64);
        org.jsoup.parser.Token.Character character67 = new org.jsoup.parser.Token.Character("</hi!>");
        java.lang.String str68 = character67.getData();
        java.lang.String str69 = character67.toString();
        xmlTreeBuilder58.insert(character67);
        org.jsoup.parser.Token.Character character72 = new org.jsoup.parser.Token.Character("EOF");
        java.lang.String str73 = character72.getData();
        java.lang.String str74 = character72.toString();
        boolean boolean75 = character72.isStartTag();
        java.lang.String str76 = character72.getData();
        java.lang.String str77 = character72.toString();
        org.jsoup.parser.Token.Character character78 = character72.asCharacter();
        java.lang.String str79 = character72.toString();
        java.lang.String str80 = character72.toString();
        xmlTreeBuilder58.insert(character72);
        xmlTreeBuilder0.insert(character72);
        java.lang.String str83 = character72.toString();
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
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "EOF" + "'", str60, "EOF");
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "</hi!>" + "'", str68, "</hi!>");
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "</hi!>" + "'", str69, "</hi!>");
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "EOF" + "'", str73, "EOF");
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "EOF" + "'", str74, "EOF");
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "EOF" + "'", str76, "EOF");
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "EOF" + "'", str77, "EOF");
        org.junit.Assert.assertNotNull(character78);
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "EOF" + "'", str79, "EOF");
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "EOF" + "'", str80, "EOF");
        org.junit.Assert.assertEquals("'" + str83 + "' != '" + "EOF" + "'", str83, "EOF");
    }

    @Test
    public void test3337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3337");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("hi!");
        boolean boolean2 = endTag1.selfClosing;
        endTag1.finaliseTag();
        java.lang.String str4 = endTag1.tagName;
        endTag1.appendTagName("</<!---->>");
        org.jsoup.nodes.Attributes attributes7 = endTag1.attributes;
        endTag1.appendAttributeValue(' ');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(attributes7);
    }

    @Test
    public void test3338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3338");
        org.jsoup.nodes.Attributes attributes1 = null;
        org.jsoup.parser.Token.StartTag startTag2 = new org.jsoup.parser.Token.StartTag("", attributes1);
        boolean boolean3 = startTag2.isDoctype();
        java.lang.String str4 = startTag2.tagName;
        startTag2.selfClosing = false;
        org.jsoup.parser.Token.Tag tag8 = startTag2.name("</hi!>");
        startTag2.finaliseTag();
        startTag2.finaliseTag();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(tag8);
    }

    @Test
    public void test3339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3339");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("hi!");
        java.lang.String str2 = endTag1.toString();
        java.lang.String str3 = endTag1.toString();
        boolean boolean4 = endTag1.isDoctype();
        endTag1.appendAttributeName("EOF");
        boolean boolean7 = endTag1.isStartTag();
        boolean boolean8 = endTag1.isCharacter();
        java.lang.String str9 = endTag1.name();
        java.lang.String str10 = endTag1.toString();
        endTag1.appendTagName("<</hi!>>hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "</hi!>" + "'", str2, "</hi!>");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "</hi!>" + "'", str3, "</hi!>");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "</hi!>" + "'", str10, "</hi!>");
    }

    @Test
    public void test3340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3340");
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
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder64 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList67 = null;
        xmlTreeBuilder64.initialiseParse("Character", "hi!", parseErrorList67);
        org.jsoup.parser.ParseErrorList parseErrorList71 = null;
        xmlTreeBuilder64.initialiseParse("</hi!>", "Doctype", parseErrorList71);
        org.jsoup.parser.ParseErrorList parseErrorList75 = null;
        xmlTreeBuilder64.initialiseParse("", "<4>", parseErrorList75);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder77 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList80 = null;
        xmlTreeBuilder77.initialiseParse("</hi!>", "EOF", parseErrorList80);
        org.jsoup.parser.Token.StartTag startTag82 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag84 = startTag82.name("hi!");
        boolean boolean85 = xmlTreeBuilder77.process((org.jsoup.parser.Token) startTag82);
        org.jsoup.parser.Token.Comment comment86 = new org.jsoup.parser.Token.Comment();
        java.lang.StringBuilder stringBuilder87 = comment86.data;
        java.lang.String str88 = comment86.toString();
        xmlTreeBuilder77.insert(comment86);
        java.lang.String str90 = comment86.toString();
        java.lang.String str91 = comment86.getData();
        xmlTreeBuilder64.insert(comment86);
        org.jsoup.parser.Token.TokenType tokenType93 = comment86.type;
        java.lang.StringBuilder stringBuilder94 = comment86.data;
        xmlTreeBuilder0.insert(comment86);
        java.lang.String str96 = comment86.getData();
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
        org.junit.Assert.assertNotNull(tag84);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + true + "'", boolean85 == true);
        org.junit.Assert.assertNotNull(stringBuilder87);
        org.junit.Assert.assertEquals(stringBuilder87.toString(), "");
        org.junit.Assert.assertEquals("'" + str88 + "' != '" + "<!---->" + "'", str88, "<!---->");
        org.junit.Assert.assertEquals("'" + str90 + "' != '" + "<!---->" + "'", str90, "<!---->");
        org.junit.Assert.assertEquals("'" + str91 + "' != '" + "" + "'", str91, "");
        org.junit.Assert.assertTrue("'" + tokenType93 + "' != '" + org.jsoup.parser.Token.TokenType.Comment + "'", tokenType93.equals(org.jsoup.parser.Token.TokenType.Comment));
        org.junit.Assert.assertNotNull(stringBuilder94);
        org.junit.Assert.assertEquals(stringBuilder94.toString(), "");
        org.junit.Assert.assertEquals("'" + str96 + "' != '" + "" + "'", str96, "");
    }

    @Test
    public void test3341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3341");
        org.jsoup.parser.Token.StartTag startTag2 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag4 = startTag2.name("hi!");
        org.jsoup.nodes.Attributes attributes5 = tag4.attributes;
        org.jsoup.parser.Token.StartTag startTag6 = new org.jsoup.parser.Token.StartTag("</hi!>", attributes5);
        org.jsoup.parser.Token.StartTag startTag7 = new org.jsoup.parser.Token.StartTag("", attributes5);
        java.lang.String str8 = startTag7.tokenType();
        org.jsoup.parser.Token.TokenType tokenType9 = startTag7.type;
        org.jsoup.nodes.Attributes attributes10 = startTag7.attributes;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = startTag7.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must be false");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tag4);
        org.junit.Assert.assertNotNull(attributes5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "StartTag" + "'", str8, "StartTag");
        org.junit.Assert.assertTrue("'" + tokenType9 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType9.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertNotNull(attributes10);
    }

    @Test
    public void test3342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3342");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("hi!");
        boolean boolean2 = endTag1.selfClosing;
        java.lang.String str3 = endTag1.toString();
        java.lang.String str4 = endTag1.toString();
        boolean boolean5 = endTag1.isEOF();
        org.jsoup.parser.Token.EndTag endTag7 = new org.jsoup.parser.Token.EndTag("hi!");
        java.lang.String str8 = endTag7.toString();
        java.lang.String str9 = endTag7.toString();
        boolean boolean10 = endTag7.isDoctype();
        java.lang.String str11 = endTag7.tagName;
        org.jsoup.parser.Token.StartTag startTag13 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag15 = startTag13.name("hi!");
        org.jsoup.nodes.Attributes attributes16 = tag15.attributes;
        org.jsoup.parser.Token.StartTag startTag17 = new org.jsoup.parser.Token.StartTag("</hi!>", attributes16);
        endTag7.attributes = attributes16;
        endTag1.attributes = attributes16;
        endTag1.appendTagName('a');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "</hi!>" + "'", str3, "</hi!>");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "</hi!>" + "'", str4, "</hi!>");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "</hi!>" + "'", str8, "</hi!>");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "</hi!>" + "'", str9, "</hi!>");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(tag15);
        org.junit.Assert.assertNotNull(attributes16);
    }

    @Test
    public void test3343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3343");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("</<!---->>");
        org.jsoup.parser.Token.Tag tag3 = endTag1.name("<<hi!>>");
        endTag1.finaliseTag();
        endTag1.finaliseTag();
        org.junit.Assert.assertNotNull(tag3);
    }

    @Test
    public void test3344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3344");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("hi!");
        java.lang.String str2 = endTag1.toString();
        java.lang.String str3 = endTag1.toString();
        org.jsoup.parser.Token.TokenType tokenType4 = org.jsoup.parser.Token.TokenType.EndTag;
        endTag1.type = tokenType4;
        boolean boolean6 = endTag1.isComment();
        org.jsoup.parser.Token.EndTag endTag8 = new org.jsoup.parser.Token.EndTag("hi!");
        boolean boolean9 = endTag8.selfClosing;
        endTag8.finaliseTag();
        endTag8.appendAttributeName(' ');
        boolean boolean13 = endTag8.isStartTag();
        endTag8.appendAttributeName('a');
        org.jsoup.parser.Token.EOF eOF16 = new org.jsoup.parser.Token.EOF();
        org.jsoup.parser.Token.TokenType tokenType17 = eOF16.type;
        endTag8.type = tokenType17;
        endTag1.type = tokenType17;
        endTag1.finaliseTag();
        endTag1.finaliseTag();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "</hi!>" + "'", str2, "</hi!>");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "</hi!>" + "'", str3, "</hi!>");
        org.junit.Assert.assertTrue("'" + tokenType4 + "' != '" + org.jsoup.parser.Token.TokenType.EndTag + "'", tokenType4.equals(org.jsoup.parser.Token.TokenType.EndTag));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + tokenType17 + "' != '" + org.jsoup.parser.Token.TokenType.EOF + "'", tokenType17.equals(org.jsoup.parser.Token.TokenType.EOF));
    }

    @Test
    public void test3345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3345");
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
        org.jsoup.nodes.Attributes attributes44 = null;
        startTag39.attributes = attributes44;
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
    }

    @Test
    public void test3346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3346");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        boolean boolean1 = doctype0.forceQuirks;
        java.lang.StringBuilder stringBuilder2 = doctype0.systemIdentifier;
        boolean boolean3 = doctype0.isCharacter();
        doctype0.forceQuirks = false;
        java.lang.StringBuilder stringBuilder6 = doctype0.publicIdentifier;
        boolean boolean7 = doctype0.isForceQuirks();
        boolean boolean8 = doctype0.forceQuirks;
        java.lang.StringBuilder stringBuilder9 = doctype0.systemIdentifier;
        org.jsoup.parser.Token.TokenType tokenType10 = doctype0.type;
        java.lang.String str11 = doctype0.getSystemIdentifier();
        boolean boolean12 = doctype0.forceQuirks;
        java.lang.String str13 = doctype0.getSystemIdentifier();
        java.lang.StringBuilder stringBuilder14 = doctype0.name;
        org.jsoup.parser.Token.StartTag startTag15 = new org.jsoup.parser.Token.StartTag();
        startTag15.appendAttributeName('a');
        startTag15.newAttribute();
        boolean boolean19 = startTag15.selfClosing;
        org.jsoup.parser.Token.TokenType tokenType20 = startTag15.type;
        doctype0.type = tokenType20;
        java.lang.StringBuilder stringBuilder22 = doctype0.systemIdentifier;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(stringBuilder9);
        org.junit.Assert.assertEquals(stringBuilder9.toString(), "");
        org.junit.Assert.assertTrue("'" + tokenType10 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType10.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(stringBuilder14);
        org.junit.Assert.assertEquals(stringBuilder14.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + tokenType20 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType20.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertNotNull(stringBuilder22);
        org.junit.Assert.assertEquals(stringBuilder22.toString(), "");
    }

    @Test
    public void test3347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3347");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("hi!");
        boolean boolean2 = endTag1.selfClosing;
        org.jsoup.parser.Token.Tag tag4 = endTag1.name("");
        tag4.appendAttributeValue("");
        org.jsoup.parser.Token.Character character8 = new org.jsoup.parser.Token.Character("EOF");
        java.lang.String str9 = character8.getData();
        boolean boolean10 = character8.isComment();
        org.jsoup.parser.Token.Comment comment11 = new org.jsoup.parser.Token.Comment();
        java.lang.StringBuilder stringBuilder12 = comment11.data;
        org.jsoup.parser.Token.TokenType tokenType13 = org.jsoup.parser.Token.TokenType.Comment;
        comment11.type = tokenType13;
        character8.type = tokenType13;
        tag4.type = tokenType13;
        boolean boolean17 = tag4.isDoctype();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(tag4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "EOF" + "'", str9, "EOF");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(stringBuilder12);
        org.junit.Assert.assertEquals(stringBuilder12.toString(), "");
        org.junit.Assert.assertTrue("'" + tokenType13 + "' != '" + org.jsoup.parser.Token.TokenType.Comment + "'", tokenType13.equals(org.jsoup.parser.Token.TokenType.Comment));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test3348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3348");
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
        java.lang.String str86 = comment79.getData();
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
        org.junit.Assert.assertEquals("'" + str86 + "' != '" + "" + "'", str86, "");
    }

    @Test
    public void test3349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3349");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        xmlTreeBuilder0.initialiseParse("Character", "<</hi!>>", parseErrorList3);
        org.jsoup.parser.Token.StartTag startTag6 = new org.jsoup.parser.Token.StartTag("<<Doctype>>");
        java.lang.String str7 = startTag6.name();
        boolean boolean8 = xmlTreeBuilder0.process((org.jsoup.parser.Token) startTag6);
        org.jsoup.nodes.Attributes attributes9 = startTag6.getAttributes();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<<Doctype>>" + "'", str7, "<<Doctype>>");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(attributes9);
    }

    @Test
    public void test3350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3350");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        xmlTreeBuilder0.initialiseParse("</hi!>", "EOF", parseErrorList3);
        org.jsoup.parser.Token.Comment comment5 = new org.jsoup.parser.Token.Comment();
        java.lang.StringBuilder stringBuilder6 = comment5.data;
        org.jsoup.parser.Token.TokenType tokenType7 = org.jsoup.parser.Token.TokenType.Comment;
        comment5.type = tokenType7;
        java.lang.StringBuilder stringBuilder9 = comment5.data;
        boolean boolean10 = xmlTreeBuilder0.process((org.jsoup.parser.Token) comment5);
        org.jsoup.parser.Token.Character character12 = new org.jsoup.parser.Token.Character("EOF");
        java.lang.String str13 = character12.getData();
        java.lang.String str14 = character12.toString();
        boolean boolean15 = character12.isStartTag();
        java.lang.String str16 = character12.toString();
        java.lang.String str17 = character12.toString();
        boolean boolean18 = xmlTreeBuilder0.process((org.jsoup.parser.Token) character12);
        org.jsoup.parser.Token.Character character20 = new org.jsoup.parser.Token.Character("EOF");
        java.lang.String str21 = character20.getData();
        java.lang.String str22 = character20.toString();
        boolean boolean23 = character20.isStartTag();
        java.lang.String str24 = character20.toString();
        java.lang.String str25 = character20.toString();
        java.lang.String str26 = character20.getData();
        java.lang.String str27 = character20.getData();
        java.lang.String str28 = character20.toString();
        xmlTreeBuilder0.insert(character20);
        org.jsoup.parser.Token.Character character31 = new org.jsoup.parser.Token.Character("EOF");
        java.lang.String str32 = character31.toString();
        java.lang.String str33 = character31.toString();
        java.lang.String str34 = character31.toString();
        boolean boolean35 = character31.isEOF();
        boolean boolean36 = character31.isEOF();
        org.jsoup.parser.Token.StartTag startTag40 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag42 = startTag40.name("hi!");
        org.jsoup.nodes.Attributes attributes43 = tag42.attributes;
        org.jsoup.parser.Token.StartTag startTag44 = new org.jsoup.parser.Token.StartTag("</hi!>", attributes43);
        org.jsoup.parser.Token.StartTag startTag45 = new org.jsoup.parser.Token.StartTag("", attributes43);
        org.jsoup.parser.Token.StartTag startTag46 = new org.jsoup.parser.Token.StartTag("hi!", attributes43);
        org.jsoup.parser.Token.TokenType tokenType47 = startTag46.type;
        org.jsoup.parser.Token.TokenType tokenType48 = startTag46.type;
        character31.type = tokenType48;
        xmlTreeBuilder0.insert(character31);
        org.jsoup.parser.Token.EndTag endTag52 = new org.jsoup.parser.Token.EndTag("hi!");
        java.lang.String str53 = endTag52.toString();
        java.lang.String str54 = endTag52.toString();
        boolean boolean55 = endTag52.isEndTag();
        org.jsoup.nodes.Attributes attributes58 = null;
        org.jsoup.parser.Token.StartTag startTag59 = new org.jsoup.parser.Token.StartTag("", attributes58);
        startTag59.selfClosing = false;
        startTag59.newAttribute();
        org.jsoup.parser.Token.StartTag startTag64 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag66 = startTag64.name("hi!");
        org.jsoup.nodes.Attributes attributes67 = tag66.attributes;
        org.jsoup.parser.Token.StartTag startTag68 = new org.jsoup.parser.Token.StartTag("", attributes67);
        startTag59.attributes = attributes67;
        org.jsoup.parser.Token.StartTag startTag70 = new org.jsoup.parser.Token.StartTag("<!---->", attributes67);
        endTag52.attributes = attributes67;
        boolean boolean72 = xmlTreeBuilder0.process((org.jsoup.parser.Token) endTag52);
        org.jsoup.parser.ParseErrorList parseErrorList75 = null;
        xmlTreeBuilder0.initialiseParse("<</Doctype>>", "", parseErrorList75);
        org.jsoup.parser.Token.StartTag startTag77 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag79 = startTag77.name("hi!");
        startTag77.finaliseTag();
        startTag77.appendAttributeValue("</hi!>");
        boolean boolean83 = startTag77.isDoctype();
        startTag77.appendAttributeName('a');
        boolean boolean86 = xmlTreeBuilder0.process((org.jsoup.parser.Token) startTag77);
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "");
        org.junit.Assert.assertTrue("'" + tokenType7 + "' != '" + org.jsoup.parser.Token.TokenType.Comment + "'", tokenType7.equals(org.jsoup.parser.Token.TokenType.Comment));
        org.junit.Assert.assertNotNull(stringBuilder9);
        org.junit.Assert.assertEquals(stringBuilder9.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "EOF" + "'", str13, "EOF");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "EOF" + "'", str14, "EOF");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "EOF" + "'", str16, "EOF");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "EOF" + "'", str17, "EOF");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "EOF" + "'", str21, "EOF");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "EOF" + "'", str22, "EOF");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "EOF" + "'", str24, "EOF");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "EOF" + "'", str25, "EOF");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "EOF" + "'", str26, "EOF");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "EOF" + "'", str27, "EOF");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "EOF" + "'", str28, "EOF");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "EOF" + "'", str32, "EOF");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "EOF" + "'", str33, "EOF");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "EOF" + "'", str34, "EOF");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(tag42);
        org.junit.Assert.assertNotNull(attributes43);
        org.junit.Assert.assertTrue("'" + tokenType47 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType47.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertTrue("'" + tokenType48 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType48.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "</hi!>" + "'", str53, "</hi!>");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "</hi!>" + "'", str54, "</hi!>");
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertNotNull(tag66);
        org.junit.Assert.assertNotNull(attributes67);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertNotNull(tag79);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + true + "'", boolean86 == true);
    }

    @Test
    public void test3351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3351");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag2 = startTag0.name("hi!");
        startTag0.appendAttributeName(' ');
        startTag0.appendAttributeName("hi!");
        boolean boolean7 = startTag0.isSelfClosing();
        boolean boolean8 = startTag0.isComment();
        startTag0.appendAttributeName("EndTag");
        boolean boolean11 = startTag0.isEOF();
        org.jsoup.parser.Token.StartTag startTag12 = startTag0.asStartTag();
        org.jsoup.parser.Token.Tag tag14 = startTag12.name("a");
        org.junit.Assert.assertNotNull(tag2);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(startTag12);
        org.junit.Assert.assertNotNull(tag14);
    }

    @Test
    public void test3352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3352");
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
        org.jsoup.parser.Token.EndTag endTag14 = new org.jsoup.parser.Token.EndTag("hi!");
        java.lang.String str15 = endTag14.toString();
        java.lang.String str16 = endTag14.toString();
        boolean boolean17 = endTag14.isDoctype();
        java.lang.String str18 = endTag14.tagName;
        endTag14.appendAttributeName("<!---->");
        org.jsoup.parser.Token.TokenType tokenType21 = endTag14.type;
        boolean boolean22 = xmlTreeBuilder0.process((org.jsoup.parser.Token) endTag14);
        org.jsoup.parser.ParseErrorList parseErrorList25 = null;
        xmlTreeBuilder0.initialiseParse("", "hi!", parseErrorList25);
        org.jsoup.parser.Token.StartTag startTag27 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag29 = startTag27.name("hi!");
        startTag27.appendAttributeName(' ');
        startTag27.appendAttributeName("hi!");
        boolean boolean34 = startTag27.selfClosing;
        org.jsoup.nodes.Element element35 = xmlTreeBuilder0.insert(startTag27);
        org.junit.Assert.assertNotNull(tag7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(stringBuilder10);
        org.junit.Assert.assertEquals(stringBuilder10.toString(), "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "<!---->" + "'", str11, "<!---->");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "</hi!>" + "'", str15, "</hi!>");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "</hi!>" + "'", str16, "</hi!>");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertTrue("'" + tokenType21 + "' != '" + org.jsoup.parser.Token.TokenType.EndTag + "'", tokenType21.equals(org.jsoup.parser.Token.TokenType.EndTag));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(tag29);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(element35);
    }

    @Test
    public void test3353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3353");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("hi!");
        java.lang.String str2 = endTag1.toString();
        java.lang.String str3 = endTag1.toString();
        boolean boolean4 = endTag1.isDoctype();
        endTag1.appendAttributeName("EOF");
        boolean boolean7 = endTag1.isEOF();
        org.jsoup.parser.Token.Tag tag9 = endTag1.name("4");
        java.lang.String str10 = tag9.name();
        boolean boolean11 = tag9.selfClosing;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "</hi!>" + "'", str2, "</hi!>");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "</hi!>" + "'", str3, "</hi!>");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(tag9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "4" + "'", str10, "4");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test3354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3354");
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
        org.jsoup.parser.Token.TokenType tokenType15 = startTag9.type;
        startTag9.appendAttributeName("EndTag");
        startTag9.finaliseTag();
        startTag9.appendAttributeValue(' ');
        org.junit.Assert.assertNotNull(tag7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + tokenType15 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType15.equals(org.jsoup.parser.Token.TokenType.StartTag));
    }

    @Test
    public void test3355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3355");
        org.jsoup.nodes.Attributes attributes1 = null;
        org.jsoup.parser.Token.StartTag startTag2 = new org.jsoup.parser.Token.StartTag("", attributes1);
        boolean boolean3 = startTag2.isDoctype();
        java.lang.String str4 = startTag2.tagName;
        startTag2.selfClosing = false;
        org.jsoup.parser.Token.Tag tag8 = startTag2.name("</hi!>");
        startTag2.appendAttributeName("Doctype");
        startTag2.appendAttributeName("StartTag");
        org.jsoup.parser.Token.StartTag startTag13 = startTag2.asStartTag();
        org.jsoup.nodes.Attributes attributes14 = startTag13.attributes;
        startTag13.appendAttributeValue('a');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(tag8);
        org.junit.Assert.assertNotNull(startTag13);
        org.junit.Assert.assertNull(attributes14);
    }

    @Test
    public void test3356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3356");
        org.jsoup.parser.Token.StartTag startTag2 = new org.jsoup.parser.Token.StartTag();
        startTag2.appendTagName('4');
        java.lang.String str5 = startTag2.name();
        org.jsoup.nodes.Attributes attributes6 = startTag2.attributes;
        org.jsoup.parser.Token.StartTag startTag7 = new org.jsoup.parser.Token.StartTag("hi!", attributes6);
        org.jsoup.parser.Token.StartTag startTag8 = new org.jsoup.parser.Token.StartTag("Comment", attributes6);
        startTag8.appendTagName('a');
        java.lang.String str11 = startTag8.tagName;
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "4" + "'", str5, "4");
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Commenta" + "'", str11, "Commenta");
    }

    @Test
    public void test3357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3357");
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
        boolean boolean32 = endTag22.isCharacter();
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
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test3358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3358");
        org.jsoup.parser.Token.StartTag startTag1 = new org.jsoup.parser.Token.StartTag("hi!");
        startTag1.appendAttributeValue("</hi!>");
        java.lang.String str4 = startTag1.tokenType();
        startTag1.appendTagName(' ');
        java.lang.String str7 = startTag1.tagName;
        startTag1.selfClosing = true;
        org.jsoup.parser.Token.StartTag startTag10 = startTag1.asStartTag();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "StartTag" + "'", str4, "StartTag");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi! " + "'", str7, "hi! ");
        org.junit.Assert.assertNotNull(startTag10);
    }

    @Test
    public void test3359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3359");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("hi!");
        boolean boolean2 = endTag1.selfClosing;
        endTag1.finaliseTag();
        org.jsoup.parser.Token.TokenType tokenType4 = endTag1.type;
        org.jsoup.nodes.Attributes attributes5 = endTag1.getAttributes();
        java.lang.String str6 = endTag1.toString();
        endTag1.appendAttributeName("<4>");
        org.jsoup.parser.Token.TokenType tokenType9 = endTag1.type;
        java.lang.String str10 = endTag1.tagName;
        java.lang.String str11 = endTag1.toString();
        endTag1.appendAttributeValue('a');
        java.lang.String str14 = endTag1.toString();
        java.lang.String str15 = endTag1.toString();
        java.lang.Class<?> wildcardClass16 = endTag1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + tokenType4 + "' != '" + org.jsoup.parser.Token.TokenType.EndTag + "'", tokenType4.equals(org.jsoup.parser.Token.TokenType.EndTag));
        org.junit.Assert.assertNull(attributes5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "</hi!>" + "'", str6, "</hi!>");
        org.junit.Assert.assertTrue("'" + tokenType9 + "' != '" + org.jsoup.parser.Token.TokenType.EndTag + "'", tokenType9.equals(org.jsoup.parser.Token.TokenType.EndTag));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "</hi!>" + "'", str11, "</hi!>");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "</hi!>" + "'", str14, "</hi!>");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "</hi!>" + "'", str15, "</hi!>");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test3360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3360");
        org.jsoup.parser.Token.StartTag startTag2 = new org.jsoup.parser.Token.StartTag("hi!");
        startTag2.tagName = "EndTag";
        org.jsoup.nodes.Attributes attributes5 = startTag2.getAttributes();
        org.jsoup.parser.Token.StartTag startTag6 = new org.jsoup.parser.Token.StartTag("<EndTag>", attributes5);
        startTag6.appendTagName("<Comment>");
        org.junit.Assert.assertNotNull(attributes5);
    }

    @Test
    public void test3361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3361");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.appendAttributeName('a');
        startTag0.newAttribute();
        boolean boolean4 = startTag0.isDoctype();
        startTag0.finaliseTag();
        boolean boolean6 = startTag0.isDoctype();
        org.jsoup.parser.Token.Tag tag8 = startTag0.name("<hi!  =\"#\">");
        startTag0.tagName = "<EndTag>";
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(tag8);
    }

    @Test
    public void test3362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3362");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        boolean boolean1 = doctype0.forceQuirks;
        java.lang.StringBuilder stringBuilder2 = doctype0.systemIdentifier;
        boolean boolean3 = doctype0.forceQuirks;
        boolean boolean4 = doctype0.isStartTag();
        java.lang.StringBuilder stringBuilder5 = doctype0.systemIdentifier;
        java.lang.String str6 = doctype0.getSystemIdentifier();
        java.lang.StringBuilder stringBuilder7 = doctype0.name;
        java.lang.String str8 = doctype0.getPublicIdentifier();
        java.lang.String str9 = doctype0.getPublicIdentifier();
        java.lang.StringBuilder stringBuilder10 = doctype0.publicIdentifier;
        doctype0.forceQuirks = true;
        boolean boolean13 = doctype0.isForceQuirks();
        boolean boolean14 = doctype0.forceQuirks;
        java.lang.StringBuilder stringBuilder15 = doctype0.name;
        boolean boolean16 = doctype0.isForceQuirks();
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
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(stringBuilder10);
        org.junit.Assert.assertEquals(stringBuilder10.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(stringBuilder15);
        org.junit.Assert.assertEquals(stringBuilder15.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test3363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3363");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.Token.EOF eOF1 = new org.jsoup.parser.Token.EOF();
        boolean boolean2 = eOF1.isStartTag();
        boolean boolean3 = eOF1.isDoctype();
        boolean boolean4 = xmlTreeBuilder0.process((org.jsoup.parser.Token) eOF1);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder5 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList8 = null;
        xmlTreeBuilder5.initialiseParse("Character", "hi!", parseErrorList8);
        org.jsoup.parser.Token.Comment comment10 = new org.jsoup.parser.Token.Comment();
        java.lang.StringBuilder stringBuilder11 = comment10.data;
        java.lang.String str12 = comment10.getData();
        xmlTreeBuilder5.insert(comment10);
        org.jsoup.parser.Token.StartTag startTag14 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag16 = startTag14.name("hi!");
        startTag14.appendAttributeName(' ');
        boolean boolean19 = startTag14.isComment();
        org.jsoup.nodes.Element element20 = xmlTreeBuilder5.insert(startTag14);
        org.jsoup.parser.ParseErrorList parseErrorList23 = null;
        xmlTreeBuilder5.initialiseParse("Character", "<Doctype>", parseErrorList23);
        org.jsoup.parser.Token.EOF eOF25 = new org.jsoup.parser.Token.EOF();
        org.jsoup.parser.Token.TokenType tokenType26 = eOF25.type;
        java.lang.String str27 = eOF25.tokenType();
        boolean boolean28 = xmlTreeBuilder5.process((org.jsoup.parser.Token) eOF25);
        org.jsoup.parser.Token.Comment comment29 = new org.jsoup.parser.Token.Comment();
        java.lang.StringBuilder stringBuilder30 = comment29.data;
        java.lang.String str31 = comment29.getData();
        java.lang.StringBuilder stringBuilder32 = comment29.data;
        java.lang.String str33 = comment29.toString();
        java.lang.String str34 = comment29.getData();
        xmlTreeBuilder5.insert(comment29);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder36 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.Token.EOF eOF37 = new org.jsoup.parser.Token.EOF();
        java.lang.String str38 = eOF37.tokenType();
        boolean boolean39 = xmlTreeBuilder36.process((org.jsoup.parser.Token) eOF37);
        org.jsoup.parser.ParseErrorList parseErrorList42 = null;
        xmlTreeBuilder36.initialiseParse("", "EndTag", parseErrorList42);
        org.jsoup.parser.Token.Character character45 = new org.jsoup.parser.Token.Character("</hi!>");
        java.lang.String str46 = character45.getData();
        java.lang.String str47 = character45.toString();
        xmlTreeBuilder36.insert(character45);
        xmlTreeBuilder5.insert(character45);
        org.jsoup.parser.Token.Comment comment50 = new org.jsoup.parser.Token.Comment();
        java.lang.StringBuilder stringBuilder51 = comment50.data;
        org.jsoup.parser.Token.TokenType tokenType52 = org.jsoup.parser.Token.TokenType.Comment;
        comment50.type = tokenType52;
        java.lang.StringBuilder stringBuilder54 = comment50.data;
        org.jsoup.parser.Token.Comment comment55 = comment50.asComment();
        xmlTreeBuilder5.insert(comment50);
        java.lang.String str57 = comment50.getData();
        // The following exception was thrown during execution in test generation
        try {
            xmlTreeBuilder0.insert(comment50);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(stringBuilder11);
        org.junit.Assert.assertEquals(stringBuilder11.toString(), "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(tag16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertTrue("'" + tokenType26 + "' != '" + org.jsoup.parser.Token.TokenType.EOF + "'", tokenType26.equals(org.jsoup.parser.Token.TokenType.EOF));
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "EOF" + "'", str27, "EOF");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(stringBuilder30);
        org.junit.Assert.assertEquals(stringBuilder30.toString(), "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertNotNull(stringBuilder32);
        org.junit.Assert.assertEquals(stringBuilder32.toString(), "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "<!---->" + "'", str33, "<!---->");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "EOF" + "'", str38, "EOF");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "</hi!>" + "'", str46, "</hi!>");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "</hi!>" + "'", str47, "</hi!>");
        org.junit.Assert.assertNotNull(stringBuilder51);
        org.junit.Assert.assertEquals(stringBuilder51.toString(), "");
        org.junit.Assert.assertTrue("'" + tokenType52 + "' != '" + org.jsoup.parser.Token.TokenType.Comment + "'", tokenType52.equals(org.jsoup.parser.Token.TokenType.Comment));
        org.junit.Assert.assertNotNull(stringBuilder54);
        org.junit.Assert.assertEquals(stringBuilder54.toString(), "");
        org.junit.Assert.assertNotNull(comment55);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "" + "'", str57, "");
    }

    @Test
    public void test3364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3364");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("hi!");
        boolean boolean2 = endTag1.selfClosing;
        org.jsoup.parser.Token.Tag tag4 = endTag1.name("");
        endTag1.tagName = "hi!";
        endTag1.finaliseTag();
        org.jsoup.parser.Token.StartTag startTag8 = new org.jsoup.parser.Token.StartTag();
        startTag8.appendAttributeName('a');
        java.lang.String str11 = startTag8.tagName;
        org.jsoup.parser.Token.StartTag startTag12 = startTag8.asStartTag();
        startTag8.tagName = "hi!";
        org.jsoup.nodes.Attributes attributes18 = null;
        org.jsoup.parser.Token.StartTag startTag19 = new org.jsoup.parser.Token.StartTag("", attributes18);
        startTag19.selfClosing = false;
        startTag19.appendTagName("</hi!>");
        startTag19.newAttribute();
        org.jsoup.nodes.Attributes attributes25 = startTag19.getAttributes();
        org.jsoup.parser.Token.StartTag startTag26 = new org.jsoup.parser.Token.StartTag("hi!", attributes25);
        startTag26.selfClosing = false;
        org.jsoup.nodes.Attributes attributes29 = startTag26.attributes;
        org.jsoup.parser.Token.StartTag startTag30 = new org.jsoup.parser.Token.StartTag("<</hi!>>", attributes29);
        startTag8.attributes = attributes29;
        endTag1.attributes = attributes29;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(tag4);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(startTag12);
        org.junit.Assert.assertNotNull(attributes25);
        org.junit.Assert.assertNotNull(attributes29);
    }

    @Test
    public void test3365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3365");
        org.jsoup.parser.Token.StartTag startTag1 = new org.jsoup.parser.Token.StartTag("Doctype");
        java.lang.String str2 = startTag1.name();
        org.jsoup.parser.Token.Tag tag4 = startTag1.name("hi!a");
        startTag1.appendAttributeName('4');
        startTag1.appendAttributeName("EOF");
        startTag1.appendTagName('a');
        startTag1.appendTagName("<!---->");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Doctype" + "'", str2, "Doctype");
        org.junit.Assert.assertNotNull(tag4);
    }

    @Test
    public void test3366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3366");
        org.jsoup.parser.Token.StartTag startTag2 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag4 = startTag2.name("hi!");
        org.jsoup.nodes.Attributes attributes5 = tag4.attributes;
        org.jsoup.parser.Token.StartTag startTag6 = new org.jsoup.parser.Token.StartTag("</hi!>", attributes5);
        org.jsoup.parser.Token.StartTag startTag7 = new org.jsoup.parser.Token.StartTag("", attributes5);
        startTag7.appendAttributeName('a');
        startTag7.appendAttributeName(' ');
        startTag7.appendTagName("<</hi! >>");
        startTag7.finaliseTag();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Doctype doctype15 = startTag7.asDoctype();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$Doctype (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$Doctype are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tag4);
        org.junit.Assert.assertNotNull(attributes5);
    }

    @Test
    public void test3367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3367");
        org.jsoup.parser.Token.Character character1 = new org.jsoup.parser.Token.Character("EOF");
        java.lang.String str2 = character1.getData();
        java.lang.String str3 = character1.toString();
        boolean boolean4 = character1.isStartTag();
        java.lang.String str5 = character1.toString();
        java.lang.String str6 = character1.toString();
        org.jsoup.parser.Token.TokenType tokenType7 = org.jsoup.parser.Token.TokenType.Comment;
        character1.type = tokenType7;
        boolean boolean9 = character1.isEOF();
        java.lang.String str10 = character1.toString();
        java.lang.String str11 = character1.getData();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "EOF" + "'", str2, "EOF");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "EOF" + "'", str3, "EOF");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "EOF" + "'", str5, "EOF");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "EOF" + "'", str6, "EOF");
        org.junit.Assert.assertTrue("'" + tokenType7 + "' != '" + org.jsoup.parser.Token.TokenType.Comment + "'", tokenType7.equals(org.jsoup.parser.Token.TokenType.Comment));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "EOF" + "'", str10, "EOF");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "EOF" + "'", str11, "EOF");
    }

    @Test
    public void test3368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3368");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("hi!");
        boolean boolean2 = endTag1.selfClosing;
        java.lang.String str3 = endTag1.toString();
        java.lang.String str4 = endTag1.toString();
        endTag1.appendAttributeValue("<4>");
        java.lang.String str7 = endTag1.toString();
        java.lang.String str8 = endTag1.toString();
        java.lang.String str9 = endTag1.name();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "</hi!>" + "'", str3, "</hi!>");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "</hi!>" + "'", str4, "</hi!>");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "</hi!>" + "'", str7, "</hi!>");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "</hi!>" + "'", str8, "</hi!>");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test3369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3369");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("hi!");
        boolean boolean2 = endTag1.selfClosing;
        endTag1.finaliseTag();
        java.lang.String str4 = endTag1.toString();
        java.lang.String str5 = endTag1.tokenType();
        endTag1.appendTagName('4');
        endTag1.appendTagName('#');
        java.lang.String str10 = endTag1.name();
        org.jsoup.nodes.Attributes attributes11 = endTag1.attributes;
        java.lang.String str12 = endTag1.toString();
        endTag1.appendTagName("<hi!a>");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "</hi!>" + "'", str4, "</hi!>");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "EndTag" + "'", str5, "EndTag");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!4#" + "'", str10, "hi!4#");
        org.junit.Assert.assertNull(attributes11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "</hi!4#>" + "'", str12, "</hi!4#>");
    }

    @Test
    public void test3370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3370");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("hi!");
        boolean boolean2 = endTag1.selfClosing;
        java.lang.String str3 = endTag1.toString();
        java.lang.String str4 = endTag1.toString();
        endTag1.appendAttributeValue("<4>");
        java.lang.String str7 = endTag1.toString();
        org.jsoup.parser.Token.TokenType tokenType8 = endTag1.type;
        java.lang.String str9 = endTag1.toString();
        java.lang.String str10 = endTag1.name();
        boolean boolean11 = endTag1.isSelfClosing();
        java.lang.String str12 = endTag1.toString();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "</hi!>" + "'", str3, "</hi!>");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "</hi!>" + "'", str4, "</hi!>");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "</hi!>" + "'", str7, "</hi!>");
        org.junit.Assert.assertTrue("'" + tokenType8 + "' != '" + org.jsoup.parser.Token.TokenType.EndTag + "'", tokenType8.equals(org.jsoup.parser.Token.TokenType.EndTag));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "</hi!>" + "'", str9, "</hi!>");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "</hi!>" + "'", str12, "</hi!>");
    }

    @Test
    public void test3371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3371");
        org.jsoup.parser.Token.StartTag startTag1 = new org.jsoup.parser.Token.StartTag("hi!");
        org.jsoup.parser.Token.Doctype doctype2 = new org.jsoup.parser.Token.Doctype();
        boolean boolean3 = doctype2.forceQuirks;
        java.lang.String str4 = doctype2.getName();
        boolean boolean5 = doctype2.isEndTag();
        boolean boolean6 = doctype2.isForceQuirks();
        org.jsoup.parser.Token.Doctype doctype7 = new org.jsoup.parser.Token.Doctype();
        java.lang.StringBuilder stringBuilder8 = doctype7.name;
        org.jsoup.parser.Token.TokenType tokenType9 = org.jsoup.parser.Token.TokenType.StartTag;
        doctype7.type = tokenType9;
        doctype2.type = tokenType9;
        startTag1.type = tokenType9;
        org.jsoup.nodes.Attributes attributes13 = startTag1.getAttributes();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(stringBuilder8);
        org.junit.Assert.assertEquals(stringBuilder8.toString(), "");
        org.junit.Assert.assertTrue("'" + tokenType9 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType9.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertNotNull(attributes13);
    }

    @Test
    public void test3372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3372");
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
        org.jsoup.nodes.Attributes attributes33 = null;
        org.jsoup.parser.Token.StartTag startTag34 = new org.jsoup.parser.Token.StartTag("", attributes33);
        boolean boolean35 = startTag34.isDoctype();
        java.lang.String str36 = startTag34.tagName;
        startTag34.selfClosing = false;
        org.jsoup.parser.Token.Tag tag40 = startTag34.name("</hi!>");
        java.lang.String str41 = tag40.name();
        tag40.selfClosing = false;
        org.jsoup.nodes.Attributes attributes44 = tag40.getAttributes();
        org.jsoup.parser.Token.StartTag startTag45 = tag40.asStartTag();
        startTag45.selfClosing = false;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element48 = xmlTreeBuilder0.insert(startTag45);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
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
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertNotNull(tag40);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "</hi!>" + "'", str41, "</hi!>");
        org.junit.Assert.assertNull(attributes44);
        org.junit.Assert.assertNotNull(startTag45);
    }

    @Test
    public void test3373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3373");
        org.jsoup.nodes.Attributes attributes1 = null;
        org.jsoup.parser.Token.StartTag startTag2 = new org.jsoup.parser.Token.StartTag("", attributes1);
        startTag2.selfClosing = false;
        startTag2.newAttribute();
        boolean boolean6 = startTag2.isComment();
        boolean boolean7 = startTag2.isCharacter();
        org.jsoup.parser.Token.StartTag startTag8 = startTag2.asStartTag();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(startTag8);
    }

    @Test
    public void test3374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3374");
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
        startTag14.selfClosing = true;
        boolean boolean19 = startTag14.isComment();
        startTag14.appendAttributeValue('a');
        org.junit.Assert.assertNotNull(tag10);
        org.junit.Assert.assertNotNull(attributes11);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test3375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3375");
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
        startTag17.appendAttributeName("a");
        startTag17.selfClosing = true;
        org.junit.Assert.assertNotNull(tag10);
        org.junit.Assert.assertNotNull(attributes11);
    }

    @Test
    public void test3376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3376");
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
        startTag13.finaliseTag();
        startTag13.tagName = "EndTag";
        boolean boolean17 = startTag13.isCharacter();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(tag8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "</hi!>" + "'", str9, "</hi!>");
        org.junit.Assert.assertNull(attributes12);
        org.junit.Assert.assertNotNull(startTag13);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test3377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3377");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        java.lang.StringBuilder stringBuilder1 = comment0.data;
        java.lang.StringBuilder stringBuilder2 = comment0.data;
        java.lang.String str3 = comment0.toString();
        org.junit.Assert.assertNotNull(stringBuilder1);
        org.junit.Assert.assertEquals(stringBuilder1.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<!---->" + "'", str3, "<!---->");
    }

    @Test
    public void test3378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3378");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("hi!");
        java.lang.String str2 = endTag1.toString();
        java.lang.String str3 = endTag1.toString();
        boolean boolean4 = endTag1.isDoctype();
        endTag1.appendAttributeName("EOF");
        boolean boolean7 = endTag1.isCharacter();
        boolean boolean8 = endTag1.isComment();
        endTag1.tagName = "<4</hi!>4>";
        org.jsoup.parser.Token.EndTag endTag11 = endTag1.asEndTag();
        endTag1.tagName = "<4> ";
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "</hi!>" + "'", str2, "</hi!>");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "</hi!>" + "'", str3, "</hi!>");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(endTag11);
    }

    @Test
    public void test3379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3379");
        org.jsoup.nodes.Attributes attributes1 = null;
        org.jsoup.parser.Token.StartTag startTag2 = new org.jsoup.parser.Token.StartTag("", attributes1);
        startTag2.selfClosing = false;
        startTag2.newAttribute();
        startTag2.finaliseTag();
        org.jsoup.parser.Token.EndTag endTag8 = new org.jsoup.parser.Token.EndTag("hi!");
        boolean boolean9 = endTag8.selfClosing;
        org.jsoup.parser.Token.Tag tag11 = endTag8.name("");
        boolean boolean12 = endTag8.isEndTag();
        org.jsoup.parser.Token.Tag tag14 = endTag8.name("<4>");
        org.jsoup.parser.Token.TokenType tokenType15 = tag14.type;
        startTag2.type = tokenType15;
        startTag2.appendAttributeName("EOF");
        startTag2.newAttribute();
        org.jsoup.parser.Token.EndTag endTag21 = new org.jsoup.parser.Token.EndTag("hi!");
        java.lang.String str22 = endTag21.toString();
        java.lang.String str23 = endTag21.toString();
        boolean boolean24 = endTag21.isDoctype();
        endTag21.appendAttributeName("EOF");
        boolean boolean27 = endTag21.isStartTag();
        endTag21.tagName = "Character";
        java.lang.String str30 = endTag21.tagName;
        org.jsoup.parser.Token.TokenType tokenType31 = endTag21.type;
        org.jsoup.nodes.Attributes attributes33 = null;
        org.jsoup.parser.Token.StartTag startTag34 = new org.jsoup.parser.Token.StartTag("", attributes33);
        org.jsoup.parser.Token.StartTag startTag35 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag37 = startTag35.name("hi!");
        org.jsoup.nodes.Attributes attributes38 = tag37.attributes;
        startTag34.attributes = attributes38;
        org.jsoup.parser.Token.TokenType tokenType40 = startTag34.type;
        endTag21.type = tokenType40;
        startTag2.type = tokenType40;
        java.lang.Class<?> wildcardClass43 = tokenType40.getClass();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(tag11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(tag14);
        org.junit.Assert.assertTrue("'" + tokenType15 + "' != '" + org.jsoup.parser.Token.TokenType.EndTag + "'", tokenType15.equals(org.jsoup.parser.Token.TokenType.EndTag));
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "</hi!>" + "'", str22, "</hi!>");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "</hi!>" + "'", str23, "</hi!>");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Character" + "'", str30, "Character");
        org.junit.Assert.assertTrue("'" + tokenType31 + "' != '" + org.jsoup.parser.Token.TokenType.EndTag + "'", tokenType31.equals(org.jsoup.parser.Token.TokenType.EndTag));
        org.junit.Assert.assertNotNull(tag37);
        org.junit.Assert.assertNotNull(attributes38);
        org.junit.Assert.assertTrue("'" + tokenType40 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType40.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test3380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3380");
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
        org.jsoup.parser.Token.Comment comment17 = new org.jsoup.parser.Token.Comment();
        java.lang.StringBuilder stringBuilder18 = comment17.data;
        xmlTreeBuilder0.insert(comment17);
        org.jsoup.parser.Token.Comment comment20 = new org.jsoup.parser.Token.Comment();
        java.lang.StringBuilder stringBuilder21 = comment20.data;
        org.jsoup.parser.Token.TokenType tokenType22 = org.jsoup.parser.Token.TokenType.Comment;
        comment20.type = tokenType22;
        xmlTreeBuilder0.insert(comment20);
        java.lang.String str25 = comment20.getData();
        java.lang.String str26 = comment20.getData();
        java.lang.StringBuilder stringBuilder27 = comment20.data;
        java.lang.String str28 = comment20.toString();
        java.lang.String str29 = comment20.toString();
        java.lang.StringBuilder stringBuilder30 = comment20.data;
        java.lang.String str31 = comment20.tokenType();
        org.junit.Assert.assertNotNull(tag7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(stringBuilder18);
        org.junit.Assert.assertEquals(stringBuilder18.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder21);
        org.junit.Assert.assertEquals(stringBuilder21.toString(), "");
        org.junit.Assert.assertTrue("'" + tokenType22 + "' != '" + org.jsoup.parser.Token.TokenType.Comment + "'", tokenType22.equals(org.jsoup.parser.Token.TokenType.Comment));
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(stringBuilder27);
        org.junit.Assert.assertEquals(stringBuilder27.toString(), "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "<!---->" + "'", str28, "<!---->");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "<!---->" + "'", str29, "<!---->");
        org.junit.Assert.assertNotNull(stringBuilder30);
        org.junit.Assert.assertEquals(stringBuilder30.toString(), "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "Comment" + "'", str31, "Comment");
    }

    @Test
    public void test3381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3381");
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
        org.jsoup.parser.ParseErrorList parseErrorList26 = null;
        xmlTreeBuilder0.initialiseParse("Comment", "<</<4>Doctype>>", parseErrorList26);
        org.jsoup.parser.Token.Character character29 = new org.jsoup.parser.Token.Character("EOF");
        java.lang.String str30 = character29.getData();
        boolean boolean31 = character29.isComment();
        org.jsoup.parser.Token.Comment comment32 = new org.jsoup.parser.Token.Comment();
        java.lang.StringBuilder stringBuilder33 = comment32.data;
        org.jsoup.parser.Token.TokenType tokenType34 = org.jsoup.parser.Token.TokenType.Comment;
        comment32.type = tokenType34;
        character29.type = tokenType34;
        org.jsoup.parser.Token.Character character37 = character29.asCharacter();
        xmlTreeBuilder0.insert(character37);
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
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "EOF" + "'", str30, "EOF");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(stringBuilder33);
        org.junit.Assert.assertEquals(stringBuilder33.toString(), "");
        org.junit.Assert.assertTrue("'" + tokenType34 + "' != '" + org.jsoup.parser.Token.TokenType.Comment + "'", tokenType34.equals(org.jsoup.parser.Token.TokenType.Comment));
        org.junit.Assert.assertNotNull(character37);
    }

    @Test
    public void test3382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3382");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.tokenType();
        java.lang.StringBuilder stringBuilder2 = doctype0.publicIdentifier;
        boolean boolean3 = doctype0.isForceQuirks();
        java.lang.StringBuilder stringBuilder4 = doctype0.name;
        doctype0.forceQuirks = true;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Doctype" + "'", str1, "Doctype");
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "");
    }

    @Test
    public void test3383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3383");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.tokenType();
        boolean boolean2 = doctype0.isForceQuirks();
        java.lang.String str3 = doctype0.getPublicIdentifier();
        java.lang.String str4 = doctype0.getSystemIdentifier();
        java.lang.String str5 = doctype0.tokenType();
        boolean boolean6 = doctype0.forceQuirks;
        java.lang.String str7 = doctype0.getSystemIdentifier();
        doctype0.forceQuirks = true;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Doctype" + "'", str1, "Doctype");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Doctype" + "'", str5, "Doctype");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test3384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3384");
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
        org.jsoup.parser.ParseErrorList parseErrorList21 = null;
        xmlTreeBuilder0.initialiseParse("StartTag", "<!---->", parseErrorList21);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "EOF" + "'", str2, "EOF");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "EOF" + "'", str13, "EOF");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "EOF" + "'", str14, "EOF");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "EOF" + "'", str16, "EOF");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "EOF" + "'", str17, "EOF");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test3385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3385");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        boolean boolean1 = doctype0.forceQuirks;
        java.lang.StringBuilder stringBuilder2 = doctype0.systemIdentifier;
        boolean boolean3 = doctype0.forceQuirks;
        java.lang.StringBuilder stringBuilder4 = doctype0.publicIdentifier;
        boolean boolean5 = doctype0.isForceQuirks();
        java.lang.String str6 = doctype0.getPublicIdentifier();
        java.lang.String str7 = doctype0.getPublicIdentifier();
        java.lang.StringBuilder stringBuilder8 = doctype0.systemIdentifier;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(stringBuilder8);
        org.junit.Assert.assertEquals(stringBuilder8.toString(), "");
    }

    @Test
    public void test3386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3386");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        boolean boolean1 = doctype0.forceQuirks;
        java.lang.StringBuilder stringBuilder2 = doctype0.systemIdentifier;
        boolean boolean3 = doctype0.isEndTag();
        boolean boolean4 = doctype0.isForceQuirks();
        org.jsoup.parser.Token.Doctype doctype5 = doctype0.asDoctype();
        java.lang.StringBuilder stringBuilder6 = doctype0.publicIdentifier;
        boolean boolean7 = doctype0.isForceQuirks();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(doctype5);
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test3387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3387");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        xmlTreeBuilder0.initialiseParse("</hi!>", "EOF", parseErrorList3);
        org.jsoup.parser.Token.Comment comment5 = new org.jsoup.parser.Token.Comment();
        java.lang.StringBuilder stringBuilder6 = comment5.data;
        org.jsoup.parser.Token.TokenType tokenType7 = org.jsoup.parser.Token.TokenType.Comment;
        comment5.type = tokenType7;
        java.lang.StringBuilder stringBuilder9 = comment5.data;
        boolean boolean10 = xmlTreeBuilder0.process((org.jsoup.parser.Token) comment5);
        org.jsoup.parser.Token.Character character12 = new org.jsoup.parser.Token.Character("EOF");
        java.lang.String str13 = character12.getData();
        java.lang.String str14 = character12.toString();
        boolean boolean15 = character12.isStartTag();
        java.lang.String str16 = character12.toString();
        java.lang.String str17 = character12.toString();
        boolean boolean18 = xmlTreeBuilder0.process((org.jsoup.parser.Token) character12);
        org.jsoup.parser.Token.Character character20 = new org.jsoup.parser.Token.Character("EOF");
        java.lang.String str21 = character20.getData();
        java.lang.String str22 = character20.toString();
        boolean boolean23 = character20.isStartTag();
        java.lang.String str24 = character20.toString();
        java.lang.String str25 = character20.toString();
        java.lang.String str26 = character20.getData();
        java.lang.String str27 = character20.getData();
        java.lang.String str28 = character20.toString();
        xmlTreeBuilder0.insert(character20);
        org.jsoup.parser.Token.Character character31 = new org.jsoup.parser.Token.Character("EOF");
        java.lang.String str32 = character31.toString();
        java.lang.String str33 = character31.toString();
        java.lang.String str34 = character31.toString();
        boolean boolean35 = character31.isEOF();
        boolean boolean36 = character31.isEOF();
        org.jsoup.parser.Token.StartTag startTag40 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag42 = startTag40.name("hi!");
        org.jsoup.nodes.Attributes attributes43 = tag42.attributes;
        org.jsoup.parser.Token.StartTag startTag44 = new org.jsoup.parser.Token.StartTag("</hi!>", attributes43);
        org.jsoup.parser.Token.StartTag startTag45 = new org.jsoup.parser.Token.StartTag("", attributes43);
        org.jsoup.parser.Token.StartTag startTag46 = new org.jsoup.parser.Token.StartTag("hi!", attributes43);
        org.jsoup.parser.Token.TokenType tokenType47 = startTag46.type;
        org.jsoup.parser.Token.TokenType tokenType48 = startTag46.type;
        character31.type = tokenType48;
        xmlTreeBuilder0.insert(character31);
        org.jsoup.parser.ParseErrorList parseErrorList53 = null;
        xmlTreeBuilder0.initialiseParse("EndTag", "</EndTag>", parseErrorList53);
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "");
        org.junit.Assert.assertTrue("'" + tokenType7 + "' != '" + org.jsoup.parser.Token.TokenType.Comment + "'", tokenType7.equals(org.jsoup.parser.Token.TokenType.Comment));
        org.junit.Assert.assertNotNull(stringBuilder9);
        org.junit.Assert.assertEquals(stringBuilder9.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "EOF" + "'", str13, "EOF");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "EOF" + "'", str14, "EOF");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "EOF" + "'", str16, "EOF");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "EOF" + "'", str17, "EOF");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "EOF" + "'", str21, "EOF");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "EOF" + "'", str22, "EOF");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "EOF" + "'", str24, "EOF");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "EOF" + "'", str25, "EOF");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "EOF" + "'", str26, "EOF");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "EOF" + "'", str27, "EOF");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "EOF" + "'", str28, "EOF");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "EOF" + "'", str32, "EOF");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "EOF" + "'", str33, "EOF");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "EOF" + "'", str34, "EOF");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(tag42);
        org.junit.Assert.assertNotNull(attributes43);
        org.junit.Assert.assertTrue("'" + tokenType47 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType47.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertTrue("'" + tokenType48 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType48.equals(org.jsoup.parser.Token.TokenType.StartTag));
    }

    @Test
    public void test3388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3388");
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
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder31 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList34 = null;
        xmlTreeBuilder31.initialiseParse("Character", "hi!", parseErrorList34);
        org.jsoup.parser.Token.Comment comment36 = new org.jsoup.parser.Token.Comment();
        java.lang.StringBuilder stringBuilder37 = comment36.data;
        java.lang.String str38 = comment36.getData();
        xmlTreeBuilder31.insert(comment36);
        org.jsoup.parser.Token.StartTag startTag40 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag42 = startTag40.name("hi!");
        startTag40.appendAttributeName(' ');
        boolean boolean45 = startTag40.isComment();
        org.jsoup.nodes.Element element46 = xmlTreeBuilder31.insert(startTag40);
        org.jsoup.parser.ParseErrorList parseErrorList49 = null;
        xmlTreeBuilder31.initialiseParse("", "StartTag", parseErrorList49);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder51 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList54 = null;
        xmlTreeBuilder51.initialiseParse("</hi!>", "EOF", parseErrorList54);
        org.jsoup.parser.Token.StartTag startTag56 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag58 = startTag56.name("hi!");
        boolean boolean59 = xmlTreeBuilder51.process((org.jsoup.parser.Token) startTag56);
        org.jsoup.parser.Token.Comment comment60 = new org.jsoup.parser.Token.Comment();
        java.lang.StringBuilder stringBuilder61 = comment60.data;
        java.lang.String str62 = comment60.toString();
        xmlTreeBuilder51.insert(comment60);
        java.lang.String str64 = comment60.toString();
        java.lang.String str65 = comment60.getData();
        org.jsoup.parser.Token.Comment comment66 = comment60.asComment();
        xmlTreeBuilder31.insert(comment66);
        xmlTreeBuilder0.insert(comment66);
        org.jsoup.parser.ParseErrorList parseErrorList71 = null;
        xmlTreeBuilder0.initialiseParse("#", "StartTag", parseErrorList71);
        org.jsoup.parser.Token.Character character74 = new org.jsoup.parser.Token.Character("EOF");
        java.lang.String str75 = character74.getData();
        java.lang.String str76 = character74.toString();
        boolean boolean77 = character74.isStartTag();
        java.lang.String str78 = character74.getData();
        java.lang.String str79 = character74.toString();
        org.jsoup.parser.Token.Character character80 = character74.asCharacter();
        java.lang.String str81 = character74.getData();
        org.jsoup.parser.Token.Character character82 = character74.asCharacter();
        xmlTreeBuilder0.insert(character74);
        org.jsoup.parser.Token.StartTag startTag85 = new org.jsoup.parser.Token.StartTag("hi!");
        boolean boolean86 = startTag85.selfClosing;
        org.jsoup.nodes.Element element87 = xmlTreeBuilder0.insert(startTag85);
        org.jsoup.parser.Token.StartTag startTag90 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag92 = startTag90.name("hi!");
        org.jsoup.nodes.Attributes attributes93 = tag92.attributes;
        org.jsoup.parser.Token.StartTag startTag94 = new org.jsoup.parser.Token.StartTag("</hi!>", attributes93);
        org.jsoup.parser.Token.StartTag startTag95 = new org.jsoup.parser.Token.StartTag("", attributes93);
        startTag95.appendAttributeName('a');
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element98 = xmlTreeBuilder0.insert(startTag95);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must be false");
        } catch (java.lang.IllegalArgumentException e) {
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
        org.junit.Assert.assertNotNull(stringBuilder37);
        org.junit.Assert.assertEquals(stringBuilder37.toString(), "");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertNotNull(tag42);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(element46);
        org.junit.Assert.assertNotNull(tag58);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertNotNull(stringBuilder61);
        org.junit.Assert.assertEquals(stringBuilder61.toString(), "");
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "<!---->" + "'", str62, "<!---->");
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "<!---->" + "'", str64, "<!---->");
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "" + "'", str65, "");
        org.junit.Assert.assertNotNull(comment66);
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "EOF" + "'", str75, "EOF");
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "EOF" + "'", str76, "EOF");
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "EOF" + "'", str78, "EOF");
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "EOF" + "'", str79, "EOF");
        org.junit.Assert.assertNotNull(character80);
        org.junit.Assert.assertEquals("'" + str81 + "' != '" + "EOF" + "'", str81, "EOF");
        org.junit.Assert.assertNotNull(character82);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertNotNull(element87);
        org.junit.Assert.assertNotNull(tag92);
        org.junit.Assert.assertNotNull(attributes93);
    }

    @Test
    public void test3389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3389");
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
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder31 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList34 = null;
        xmlTreeBuilder31.initialiseParse("Character", "hi!", parseErrorList34);
        org.jsoup.parser.Token.Comment comment36 = new org.jsoup.parser.Token.Comment();
        java.lang.StringBuilder stringBuilder37 = comment36.data;
        java.lang.String str38 = comment36.getData();
        xmlTreeBuilder31.insert(comment36);
        org.jsoup.parser.Token.StartTag startTag40 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag42 = startTag40.name("hi!");
        startTag40.appendAttributeName(' ');
        boolean boolean45 = startTag40.isComment();
        org.jsoup.nodes.Element element46 = xmlTreeBuilder31.insert(startTag40);
        org.jsoup.parser.ParseErrorList parseErrorList49 = null;
        xmlTreeBuilder31.initialiseParse("", "StartTag", parseErrorList49);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder51 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList54 = null;
        xmlTreeBuilder51.initialiseParse("</hi!>", "EOF", parseErrorList54);
        org.jsoup.parser.Token.StartTag startTag56 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag58 = startTag56.name("hi!");
        boolean boolean59 = xmlTreeBuilder51.process((org.jsoup.parser.Token) startTag56);
        org.jsoup.parser.Token.Comment comment60 = new org.jsoup.parser.Token.Comment();
        java.lang.StringBuilder stringBuilder61 = comment60.data;
        java.lang.String str62 = comment60.toString();
        xmlTreeBuilder51.insert(comment60);
        java.lang.String str64 = comment60.toString();
        java.lang.String str65 = comment60.getData();
        org.jsoup.parser.Token.Comment comment66 = comment60.asComment();
        xmlTreeBuilder31.insert(comment66);
        xmlTreeBuilder0.insert(comment66);
        org.jsoup.parser.ParseErrorList parseErrorList71 = null;
        xmlTreeBuilder0.initialiseParse("#", "StartTag", parseErrorList71);
        org.jsoup.parser.ParseErrorList parseErrorList75 = null;
        xmlTreeBuilder0.initialiseParse("<4> ", "<<Doctype>>", parseErrorList75);
        org.jsoup.parser.ParseErrorList parseErrorList79 = null;
        xmlTreeBuilder0.initialiseParse("", "</<Doctype>>", parseErrorList79);
        org.jsoup.parser.ParseErrorList parseErrorList83 = null;
        xmlTreeBuilder0.initialiseParse("EOF", "<</<4>Doctype>>", parseErrorList83);
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
        org.junit.Assert.assertNotNull(stringBuilder37);
        org.junit.Assert.assertEquals(stringBuilder37.toString(), "");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertNotNull(tag42);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(element46);
        org.junit.Assert.assertNotNull(tag58);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertNotNull(stringBuilder61);
        org.junit.Assert.assertEquals(stringBuilder61.toString(), "");
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "<!---->" + "'", str62, "<!---->");
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "<!---->" + "'", str64, "<!---->");
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "" + "'", str65, "");
        org.junit.Assert.assertNotNull(comment66);
    }

    @Test
    public void test3390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3390");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.tokenType();
        boolean boolean2 = doctype0.isForceQuirks();
        java.lang.String str3 = doctype0.getPublicIdentifier();
        java.lang.String str4 = doctype0.getSystemIdentifier();
        boolean boolean5 = doctype0.isForceQuirks();
        java.lang.StringBuilder stringBuilder6 = doctype0.name;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Doctype" + "'", str1, "Doctype");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "");
    }

    @Test
    public void test3391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3391");
        org.jsoup.nodes.Attributes attributes1 = null;
        org.jsoup.parser.Token.StartTag startTag2 = new org.jsoup.parser.Token.StartTag("", attributes1);
        startTag2.selfClosing = false;
        startTag2.appendAttributeValue('a');
        startTag2.appendAttributeName("</Doctype>");
        startTag2.finaliseTag();
    }

    @Test
    public void test3392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3392");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("hi!");
        boolean boolean2 = endTag1.selfClosing;
        endTag1.finaliseTag();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Comment comment4 = endTag1.asComment();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$EndTag cannot be cast to class org.jsoup.parser.Token$Comment (org.jsoup.parser.Token$EndTag and org.jsoup.parser.Token$Comment are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3393");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("hi!");
        java.lang.String str2 = endTag1.toString();
        java.lang.String str3 = endTag1.toString();
        boolean boolean4 = endTag1.isDoctype();
        java.lang.String str5 = endTag1.tagName;
        endTag1.appendAttributeName("<!---->");
        org.jsoup.parser.Token.TokenType tokenType8 = endTag1.type;
        boolean boolean9 = endTag1.isCharacter();
        boolean boolean10 = endTag1.isCharacter();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Doctype doctype11 = endTag1.asDoctype();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$EndTag cannot be cast to class org.jsoup.parser.Token$Doctype (org.jsoup.parser.Token$EndTag and org.jsoup.parser.Token$Doctype are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "</hi!>" + "'", str2, "</hi!>");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "</hi!>" + "'", str3, "</hi!>");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + tokenType8 + "' != '" + org.jsoup.parser.Token.TokenType.EndTag + "'", tokenType8.equals(org.jsoup.parser.Token.TokenType.EndTag));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test3394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3394");
        org.jsoup.nodes.Attributes attributes1 = null;
        org.jsoup.parser.Token.StartTag startTag2 = new org.jsoup.parser.Token.StartTag("", attributes1);
        boolean boolean3 = startTag2.isDoctype();
        java.lang.String str4 = startTag2.tagName;
        startTag2.newAttribute();
        startTag2.appendTagName("</hi!>");
        startTag2.appendAttributeName("EOF");
        boolean boolean10 = startTag2.isSelfClosing();
        org.jsoup.nodes.Attributes attributes11 = startTag2.getAttributes();
        boolean boolean12 = startTag2.isEOF();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(attributes11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test3395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3395");
        org.jsoup.parser.Token.StartTag startTag1 = new org.jsoup.parser.Token.StartTag("< a>");
    }

    @Test
    public void test3396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3396");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag2 = startTag0.name("hi!");
        startTag0.finaliseTag();
        startTag0.finaliseTag();
        startTag0.appendTagName(' ');
        java.lang.String str7 = startTag0.tokenType();
        org.junit.Assert.assertNotNull(tag2);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "StartTag" + "'", str7, "StartTag");
    }

    @Test
    public void test3397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3397");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.tokenType();
        boolean boolean2 = doctype0.isForceQuirks();
        java.lang.String str3 = doctype0.getPublicIdentifier();
        boolean boolean4 = doctype0.isForceQuirks();
        doctype0.forceQuirks = true;
        org.jsoup.parser.Token.Doctype doctype7 = doctype0.asDoctype();
        java.lang.String str8 = doctype0.tokenType();
        java.lang.String str9 = doctype0.getName();
        java.lang.StringBuilder stringBuilder10 = doctype0.name;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Doctype" + "'", str1, "Doctype");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(doctype7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Doctype" + "'", str8, "Doctype");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(stringBuilder10);
        org.junit.Assert.assertEquals(stringBuilder10.toString(), "");
    }

    @Test
    public void test3398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3398");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("< a>");
    }

    @Test
    public void test3399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3399");
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
        startTag45.newAttribute();
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
    }

    @Test
    public void test3400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3400");
        org.jsoup.nodes.Attributes attributes1 = null;
        org.jsoup.parser.Token.StartTag startTag2 = new org.jsoup.parser.Token.StartTag("", attributes1);
        startTag2.selfClosing = false;
        startTag2.appendAttributeValue('a');
        boolean boolean7 = startTag2.isSelfClosing();
        startTag2.appendTagName('#');
        org.jsoup.parser.Token.Tag tag11 = startTag2.name("StartTag");
        org.jsoup.parser.Token.Tag tag13 = tag11.name("<hi!>");
        tag11.appendAttributeValue("<4> ");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(tag11);
        org.junit.Assert.assertNotNull(tag13);
    }

    @Test
    public void test3401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3401");
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
        org.jsoup.parser.Token.StartTag startTag18 = new org.jsoup.parser.Token.StartTag("Doctype");
        java.lang.String str19 = startTag18.name();
        boolean boolean20 = xmlTreeBuilder1.process((org.jsoup.parser.Token) startTag18);
        org.jsoup.parser.Token.Comment comment21 = new org.jsoup.parser.Token.Comment();
        java.lang.StringBuilder stringBuilder22 = comment21.data;
        java.lang.String str23 = comment21.getData();
        java.lang.StringBuilder stringBuilder24 = comment21.data;
        xmlTreeBuilder1.insert(comment21);
        org.jsoup.parser.Token.StartTag startTag27 = new org.jsoup.parser.Token.StartTag("4");
        java.lang.String str28 = startTag27.name();
        boolean boolean29 = xmlTreeBuilder1.process((org.jsoup.parser.Token) startTag27);
        java.lang.String str30 = startTag27.tagName;
        java.lang.String str31 = startTag27.name();
        org.jsoup.nodes.Attributes attributes32 = startTag27.getAttributes();
        org.jsoup.parser.Token.StartTag startTag33 = new org.jsoup.parser.Token.StartTag("<hi!4>", attributes32);
        org.junit.Assert.assertNotNull(stringBuilder7);
        org.junit.Assert.assertEquals(stringBuilder7.toString(), "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(tag12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Doctype" + "'", str19, "Doctype");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(stringBuilder22);
        org.junit.Assert.assertEquals(stringBuilder22.toString(), "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(stringBuilder24);
        org.junit.Assert.assertEquals(stringBuilder24.toString(), "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "4" + "'", str28, "4");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "4" + "'", str30, "4");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "4" + "'", str31, "4");
        org.junit.Assert.assertNotNull(attributes32);
    }

    @Test
    public void test3402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3402");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        boolean boolean1 = doctype0.forceQuirks;
        java.lang.StringBuilder stringBuilder2 = doctype0.systemIdentifier;
        boolean boolean3 = doctype0.isCharacter();
        doctype0.forceQuirks = false;
        java.lang.String str6 = doctype0.getName();
        boolean boolean7 = doctype0.isForceQuirks();
        java.lang.String str8 = doctype0.getName();
        org.jsoup.parser.Token.Doctype doctype9 = doctype0.asDoctype();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(doctype9);
    }

    @Test
    public void test3403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3403");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        boolean boolean1 = doctype0.forceQuirks;
        java.lang.StringBuilder stringBuilder2 = doctype0.systemIdentifier;
        boolean boolean3 = doctype0.forceQuirks;
        boolean boolean4 = doctype0.isForceQuirks();
        java.lang.StringBuilder stringBuilder5 = doctype0.publicIdentifier;
        java.lang.String str6 = doctype0.getSystemIdentifier();
        org.jsoup.parser.Token.TokenType tokenType7 = doctype0.type;
        java.lang.Class<?> wildcardClass8 = doctype0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + tokenType7 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType7.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test3404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3404");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag2 = startTag0.name("hi!");
        startTag0.appendAttributeName(' ');
        java.lang.String str5 = startTag0.tokenType();
        org.jsoup.nodes.Attributes attributes8 = null;
        org.jsoup.parser.Token.StartTag startTag9 = new org.jsoup.parser.Token.StartTag("", attributes8);
        startTag9.selfClosing = false;
        startTag9.newAttribute();
        org.jsoup.parser.Token.StartTag startTag14 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag16 = startTag14.name("hi!");
        org.jsoup.nodes.Attributes attributes17 = tag16.attributes;
        org.jsoup.parser.Token.StartTag startTag18 = new org.jsoup.parser.Token.StartTag("", attributes17);
        startTag9.attributes = attributes17;
        org.jsoup.parser.Token.StartTag startTag20 = new org.jsoup.parser.Token.StartTag("<!---->", attributes17);
        startTag0.attributes = attributes17;
        boolean boolean22 = startTag0.isEndTag();
        boolean boolean23 = startTag0.selfClosing;
        startTag0.tagName = "Comment";
        org.junit.Assert.assertNotNull(tag2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "StartTag" + "'", str5, "StartTag");
        org.junit.Assert.assertNotNull(tag16);
        org.junit.Assert.assertNotNull(attributes17);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test3405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3405");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.tokenType();
        doctype0.forceQuirks = true;
        java.lang.String str4 = doctype0.getSystemIdentifier();
        boolean boolean5 = doctype0.forceQuirks;
        org.jsoup.parser.Token.TokenType tokenType6 = doctype0.type;
        java.lang.String str7 = doctype0.getSystemIdentifier();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Doctype" + "'", str1, "Doctype");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + tokenType6 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType6.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test3406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3406");
        org.jsoup.parser.Token.StartTag startTag1 = new org.jsoup.parser.Token.StartTag("Doctype");
        java.lang.String str2 = startTag1.name();
        org.jsoup.parser.Token.Tag tag4 = startTag1.name("hi!a");
        boolean boolean5 = tag4.isSelfClosing();
        tag4.newAttribute();
        org.jsoup.nodes.Attributes attributes7 = tag4.getAttributes();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Doctype" + "'", str2, "Doctype");
        org.junit.Assert.assertNotNull(tag4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(attributes7);
    }

    @Test
    public void test3407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3407");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        boolean boolean1 = doctype0.forceQuirks;
        java.lang.StringBuilder stringBuilder2 = doctype0.systemIdentifier;
        boolean boolean3 = doctype0.isCharacter();
        doctype0.forceQuirks = false;
        java.lang.String str6 = doctype0.getName();
        doctype0.forceQuirks = true;
        boolean boolean9 = doctype0.isForceQuirks();
        boolean boolean10 = doctype0.isForceQuirks();
        java.lang.StringBuilder stringBuilder11 = doctype0.publicIdentifier;
        java.lang.Class<?> wildcardClass12 = stringBuilder11.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(stringBuilder11);
        org.junit.Assert.assertEquals(stringBuilder11.toString(), "");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test3408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3408");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.tokenType();
        boolean boolean2 = doctype0.isForceQuirks();
        java.lang.String str3 = doctype0.getPublicIdentifier();
        boolean boolean4 = doctype0.isForceQuirks();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Character character5 = doctype0.asCharacter();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$Doctype cannot be cast to class org.jsoup.parser.Token$Character (org.jsoup.parser.Token$Doctype and org.jsoup.parser.Token$Character are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Doctype" + "'", str1, "Doctype");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test3409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3409");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        xmlTreeBuilder0.initialiseParse("</hi!>", "EOF", parseErrorList3);
        org.jsoup.parser.Token.Comment comment5 = new org.jsoup.parser.Token.Comment();
        java.lang.StringBuilder stringBuilder6 = comment5.data;
        org.jsoup.parser.Token.TokenType tokenType7 = org.jsoup.parser.Token.TokenType.Comment;
        comment5.type = tokenType7;
        java.lang.StringBuilder stringBuilder9 = comment5.data;
        boolean boolean10 = xmlTreeBuilder0.process((org.jsoup.parser.Token) comment5);
        org.jsoup.parser.Token.Character character12 = new org.jsoup.parser.Token.Character("EOF");
        java.lang.String str13 = character12.getData();
        java.lang.String str14 = character12.toString();
        boolean boolean15 = character12.isStartTag();
        java.lang.String str16 = character12.toString();
        java.lang.String str17 = character12.toString();
        boolean boolean18 = xmlTreeBuilder0.process((org.jsoup.parser.Token) character12);
        java.lang.String str19 = character12.getData();
        java.lang.String str20 = character12.getData();
        org.jsoup.parser.Token.TokenType tokenType21 = null;
        character12.type = tokenType21;
        java.lang.String str23 = character12.toString();
        java.lang.String str24 = character12.toString();
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "");
        org.junit.Assert.assertTrue("'" + tokenType7 + "' != '" + org.jsoup.parser.Token.TokenType.Comment + "'", tokenType7.equals(org.jsoup.parser.Token.TokenType.Comment));
        org.junit.Assert.assertNotNull(stringBuilder9);
        org.junit.Assert.assertEquals(stringBuilder9.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "EOF" + "'", str13, "EOF");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "EOF" + "'", str14, "EOF");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "EOF" + "'", str16, "EOF");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "EOF" + "'", str17, "EOF");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "EOF" + "'", str19, "EOF");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "EOF" + "'", str20, "EOF");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "EOF" + "'", str23, "EOF");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "EOF" + "'", str24, "EOF");
    }

    @Test
    public void test3410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3410");
        org.jsoup.nodes.Attributes attributes1 = null;
        org.jsoup.parser.Token.StartTag startTag2 = new org.jsoup.parser.Token.StartTag("", attributes1);
        boolean boolean3 = startTag2.isDoctype();
        java.lang.String str4 = startTag2.tagName;
        startTag2.newAttribute();
        startTag2.appendTagName("</hi!>");
        startTag2.selfClosing = false;
        boolean boolean10 = startTag2.isDoctype();
        java.lang.String str11 = startTag2.toString();
        org.jsoup.parser.Token.StartTag startTag12 = startTag2.asStartTag();
        org.jsoup.nodes.Attributes attributes13 = startTag2.attributes;
        startTag2.selfClosing = true;
        startTag2.tagName = "</hi!a>";
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "<</hi!>>" + "'", str11, "<</hi!>>");
        org.junit.Assert.assertNotNull(startTag12);
        org.junit.Assert.assertNotNull(attributes13);
    }

    @Test
    public void test3411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3411");
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
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder31 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList34 = null;
        xmlTreeBuilder31.initialiseParse("Character", "hi!", parseErrorList34);
        org.jsoup.parser.Token.Comment comment36 = new org.jsoup.parser.Token.Comment();
        java.lang.StringBuilder stringBuilder37 = comment36.data;
        java.lang.String str38 = comment36.getData();
        xmlTreeBuilder31.insert(comment36);
        org.jsoup.parser.Token.StartTag startTag40 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag42 = startTag40.name("hi!");
        startTag40.appendAttributeName(' ');
        boolean boolean45 = startTag40.isComment();
        org.jsoup.nodes.Element element46 = xmlTreeBuilder31.insert(startTag40);
        org.jsoup.parser.Token.StartTag startTag48 = new org.jsoup.parser.Token.StartTag("Doctype");
        java.lang.String str49 = startTag48.name();
        boolean boolean50 = xmlTreeBuilder31.process((org.jsoup.parser.Token) startTag48);
        org.jsoup.parser.Token.Comment comment51 = new org.jsoup.parser.Token.Comment();
        java.lang.StringBuilder stringBuilder52 = comment51.data;
        java.lang.String str53 = comment51.getData();
        java.lang.StringBuilder stringBuilder54 = comment51.data;
        xmlTreeBuilder31.insert(comment51);
        xmlTreeBuilder0.insert(comment51);
        org.jsoup.nodes.Attributes attributes58 = null;
        org.jsoup.parser.Token.StartTag startTag59 = new org.jsoup.parser.Token.StartTag("", attributes58);
        startTag59.selfClosing = false;
        startTag59.appendTagName("</hi!>");
        startTag59.newAttribute();
        startTag59.appendTagName('4');
        java.lang.String str67 = startTag59.name();
        org.jsoup.nodes.Element element68 = xmlTreeBuilder0.insert(startTag59);
        org.jsoup.parser.Token.StartTag startTag69 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag71 = startTag69.name("hi!");
        org.jsoup.parser.Token.TokenType tokenType72 = startTag69.type;
        org.jsoup.parser.Token.TokenType tokenType73 = startTag69.type;
        boolean boolean74 = startTag69.isStartTag();
        startTag69.finaliseTag();
        org.jsoup.parser.Token.Tag tag77 = startTag69.name("<Doctype>");
        startTag69.newAttribute();
        org.jsoup.nodes.Element element79 = xmlTreeBuilder0.insert(startTag69);
        org.jsoup.parser.Token.Doctype doctype80 = null;
        // The following exception was thrown during execution in test generation
        try {
            xmlTreeBuilder0.insert(doctype80);
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
        org.junit.Assert.assertNotNull(stringBuilder37);
        org.junit.Assert.assertEquals(stringBuilder37.toString(), "");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertNotNull(tag42);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(element46);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "Doctype" + "'", str49, "Doctype");
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNotNull(stringBuilder52);
        org.junit.Assert.assertEquals(stringBuilder52.toString(), "");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
        org.junit.Assert.assertNotNull(stringBuilder54);
        org.junit.Assert.assertEquals(stringBuilder54.toString(), "");
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "</hi!>4" + "'", str67, "</hi!>4");
        org.junit.Assert.assertNotNull(element68);
        org.junit.Assert.assertNotNull(tag71);
        org.junit.Assert.assertTrue("'" + tokenType72 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType72.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertTrue("'" + tokenType73 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType73.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
        org.junit.Assert.assertNotNull(tag77);
        org.junit.Assert.assertNotNull(element79);
    }

    @Test
    public void test3412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3412");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        boolean boolean1 = doctype0.forceQuirks;
        java.lang.StringBuilder stringBuilder2 = doctype0.systemIdentifier;
        org.jsoup.parser.Token.Doctype doctype3 = doctype0.asDoctype();
        boolean boolean4 = doctype0.forceQuirks;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertNotNull(doctype3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test3413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3413");
        org.jsoup.parser.Token.StartTag startTag1 = new org.jsoup.parser.Token.StartTag("</hi!>");
        org.jsoup.parser.Token.Tag tag3 = startTag1.name("hi!");
        startTag1.appendAttributeName('4');
        startTag1.appendAttributeName('a');
        java.lang.String str8 = startTag1.toString();
        org.junit.Assert.assertNotNull(tag3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "<hi!>" + "'", str8, "<hi!>");
    }

    @Test
    public void test3414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3414");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.tokenType();
        boolean boolean2 = doctype0.isForceQuirks();
        java.lang.String str3 = doctype0.getPublicIdentifier();
        java.lang.String str4 = doctype0.getSystemIdentifier();
        java.lang.String str5 = doctype0.tokenType();
        java.lang.String str6 = doctype0.getSystemIdentifier();
        org.jsoup.parser.Token.TokenType tokenType7 = doctype0.type;
        java.lang.StringBuilder stringBuilder8 = doctype0.publicIdentifier;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Doctype" + "'", str1, "Doctype");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Doctype" + "'", str5, "Doctype");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + tokenType7 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType7.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertNotNull(stringBuilder8);
        org.junit.Assert.assertEquals(stringBuilder8.toString(), "");
    }

    @Test
    public void test3415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3415");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("</<4>Doctype>");
        org.jsoup.nodes.Attributes attributes2 = endTag1.attributes;
        endTag1.appendAttributeName(" ");
        org.junit.Assert.assertNull(attributes2);
    }

    @Test
    public void test3416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3416");
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
        org.jsoup.parser.ParseErrorList parseErrorList37 = null;
        xmlTreeBuilder0.initialiseParse("hi!4#", "", parseErrorList37);
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
    }

    @Test
    public void test3417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3417");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("hi!");
        java.lang.String str2 = endTag1.toString();
        java.lang.String str3 = endTag1.toString();
        org.jsoup.parser.Token.TokenType tokenType4 = org.jsoup.parser.Token.TokenType.EndTag;
        endTag1.type = tokenType4;
        boolean boolean6 = endTag1.isStartTag();
        boolean boolean7 = endTag1.isComment();
        org.jsoup.parser.Token.Tag tag9 = endTag1.name("<Doctype>");
        endTag1.appendAttributeName('#');
        endTag1.appendTagName('4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "</hi!>" + "'", str2, "</hi!>");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "</hi!>" + "'", str3, "</hi!>");
        org.junit.Assert.assertTrue("'" + tokenType4 + "' != '" + org.jsoup.parser.Token.TokenType.EndTag + "'", tokenType4.equals(org.jsoup.parser.Token.TokenType.EndTag));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(tag9);
    }

    @Test
    public void test3418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3418");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag2 = startTag0.name("hi!");
        org.jsoup.nodes.Attributes attributes3 = tag2.attributes;
        boolean boolean4 = tag2.isEndTag();
        org.jsoup.parser.Token.Tag tag6 = tag2.name("");
        tag2.appendTagName("Character");
        boolean boolean9 = tag2.isSelfClosing();
        org.junit.Assert.assertNotNull(tag2);
        org.junit.Assert.assertNotNull(attributes3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(tag6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test3419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3419");
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
        org.jsoup.parser.Token.StartTag startTag18 = new org.jsoup.parser.Token.StartTag("StartTag");
        org.jsoup.parser.Token.TokenType tokenType19 = startTag18.type;
        startTag11.type = tokenType19;
        org.junit.Assert.assertNotNull(tag7);
        org.junit.Assert.assertNotNull(attributes8);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + tokenType19 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType19.equals(org.jsoup.parser.Token.TokenType.StartTag));
    }

    @Test
    public void test3420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3420");
        org.jsoup.parser.Token.StartTag startTag1 = new org.jsoup.parser.Token.StartTag("hi!");
        startTag1.appendAttributeValue("</hi!>");
        startTag1.selfClosing = true;
        java.lang.String str6 = startTag1.tokenType();
        boolean boolean7 = startTag1.isCharacter();
        startTag1.appendAttributeValue("</Doctype>");
        java.lang.String str10 = startTag1.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "StartTag" + "'", str6, "StartTag");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "<hi!>" + "'", str10, "<hi!>");
    }

    @Test
    public void test3421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3421");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag2 = startTag0.name("hi!");
        tag2.finaliseTag();
        tag2.newAttribute();
        java.lang.String str5 = tag2.tagName;
        org.jsoup.parser.Token.EndTag endTag7 = new org.jsoup.parser.Token.EndTag("hi!");
        java.lang.String str8 = endTag7.toString();
        java.lang.String str9 = endTag7.toString();
        boolean boolean10 = endTag7.isDoctype();
        java.lang.String str11 = endTag7.tagName;
        org.jsoup.parser.Token.StartTag startTag13 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag15 = startTag13.name("hi!");
        org.jsoup.nodes.Attributes attributes16 = tag15.attributes;
        org.jsoup.parser.Token.StartTag startTag17 = new org.jsoup.parser.Token.StartTag("</hi!>", attributes16);
        endTag7.attributes = attributes16;
        tag2.attributes = attributes16;
        tag2.appendAttributeName("</hi!>4");
        boolean boolean22 = tag2.isSelfClosing();
        org.junit.Assert.assertNotNull(tag2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "</hi!>" + "'", str8, "</hi!>");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "</hi!>" + "'", str9, "</hi!>");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(tag15);
        org.junit.Assert.assertNotNull(attributes16);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test3422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3422");
        org.jsoup.parser.Token.StartTag startTag2 = new org.jsoup.parser.Token.StartTag();
        startTag2.appendTagName('4');
        java.lang.String str5 = startTag2.name();
        org.jsoup.nodes.Attributes attributes6 = startTag2.attributes;
        org.jsoup.parser.Token.StartTag startTag7 = new org.jsoup.parser.Token.StartTag("hi!", attributes6);
        org.jsoup.parser.Token.StartTag startTag8 = new org.jsoup.parser.Token.StartTag("Comment", attributes6);
        org.jsoup.parser.Token.StartTag startTag9 = startTag8.asStartTag();
        java.lang.String str10 = startTag8.toString();
        startTag8.tagName = "EOF";
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "4" + "'", str5, "4");
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertNotNull(startTag9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "<Comment>" + "'", str10, "<Comment>");
    }

    @Test
    public void test3423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3423");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag2 = startTag0.name("hi!");
        startTag0.appendAttributeName(' ');
        startTag0.appendAttributeName("hi!");
        boolean boolean7 = startTag0.isSelfClosing();
        org.jsoup.parser.Token.Tag tag9 = startTag0.name("</Doctype>");
        boolean boolean10 = tag9.isCharacter();
        boolean boolean11 = tag9.isSelfClosing();
        boolean boolean12 = tag9.isCharacter();
        tag9.appendTagName("<<</hi! >>>");
        org.junit.Assert.assertNotNull(tag2);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(tag9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test3424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3424");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("hi!");
        java.lang.String str2 = endTag1.toString();
        java.lang.String str3 = endTag1.toString();
        boolean boolean4 = endTag1.isDoctype();
        endTag1.appendAttributeName("EOF");
        boolean boolean7 = endTag1.isStartTag();
        boolean boolean8 = endTag1.isCharacter();
        boolean boolean9 = endTag1.selfClosing;
        boolean boolean10 = endTag1.isComment();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "</hi!>" + "'", str2, "</hi!>");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "</hi!>" + "'", str3, "</hi!>");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test3425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3425");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("hi!");
        boolean boolean2 = endTag1.selfClosing;
        endTag1.finaliseTag();
        java.lang.String str4 = endTag1.toString();
        java.lang.String str5 = endTag1.tokenType();
        endTag1.appendTagName('4');
        endTag1.selfClosing = false;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "</hi!>" + "'", str4, "</hi!>");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "EndTag" + "'", str5, "EndTag");
    }

    @Test
    public void test3426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3426");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.tokenType();
        boolean boolean2 = doctype0.isForceQuirks();
        java.lang.String str3 = doctype0.getPublicIdentifier();
        java.lang.String str4 = doctype0.getSystemIdentifier();
        boolean boolean5 = doctype0.isForceQuirks();
        boolean boolean6 = doctype0.isStartTag();
        doctype0.forceQuirks = false;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Doctype" + "'", str1, "Doctype");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test3427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3427");
        org.jsoup.nodes.Attributes attributes1 = null;
        org.jsoup.parser.Token.StartTag startTag2 = new org.jsoup.parser.Token.StartTag("", attributes1);
        startTag2.selfClosing = false;
        startTag2.newAttribute();
        org.jsoup.parser.Token.Tag tag7 = startTag2.name("</hi!>");
        startTag2.appendAttributeValue('#');
        org.jsoup.parser.Token.Tag tag11 = startTag2.name("<Doctype>");
        java.lang.String str12 = tag11.name();
        tag11.selfClosing = false;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Comment comment15 = tag11.asComment();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$Comment (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$Comment are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tag7);
        org.junit.Assert.assertNotNull(tag11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "<Doctype>" + "'", str12, "<Doctype>");
    }

    @Test
    public void test3428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3428");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("hi!");
        java.lang.String str2 = endTag1.toString();
        java.lang.String str3 = endTag1.toString();
        boolean boolean4 = endTag1.isDoctype();
        endTag1.appendAttributeValue('a');
        endTag1.selfClosing = true;
        endTag1.tagName = "</Doctype>";
        boolean boolean11 = endTag1.isDoctype();
        endTag1.appendAttributeName("<hi!a  a=\"\">");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "</hi!>" + "'", str2, "</hi!>");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "</hi!>" + "'", str3, "</hi!>");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test3429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3429");
        org.jsoup.parser.Token.Character character1 = new org.jsoup.parser.Token.Character("EOF");
        java.lang.String str2 = character1.getData();
        boolean boolean3 = character1.isComment();
        java.lang.String str4 = character1.toString();
        java.lang.String str5 = character1.getData();
        java.lang.String str6 = character1.getData();
        java.lang.String str7 = character1.getData();
        java.lang.String str8 = character1.getData();
        boolean boolean9 = character1.isDoctype();
        boolean boolean10 = character1.isDoctype();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "EOF" + "'", str2, "EOF");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "EOF" + "'", str4, "EOF");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "EOF" + "'", str5, "EOF");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "EOF" + "'", str6, "EOF");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "EOF" + "'", str7, "EOF");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "EOF" + "'", str8, "EOF");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test3430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3430");
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
        org.jsoup.parser.Token.StartTag startTag47 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag49 = startTag47.name("hi!");
        org.jsoup.nodes.Attributes attributes50 = tag49.attributes;
        org.jsoup.parser.Token.StartTag startTag51 = new org.jsoup.parser.Token.StartTag("</hi!>", attributes50);
        org.jsoup.parser.Token.StartTag startTag52 = new org.jsoup.parser.Token.StartTag("", attributes50);
        org.jsoup.parser.Token.StartTag startTag53 = new org.jsoup.parser.Token.StartTag("<hi!>", attributes50);
        boolean boolean54 = startTag53.isComment();
        boolean boolean55 = startTag53.isEOF();
        startTag53.appendAttributeName("</<4>>");
        org.jsoup.nodes.Element element58 = xmlTreeBuilder0.insert(startTag53);
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
        org.junit.Assert.assertNotNull(tag49);
        org.junit.Assert.assertNotNull(attributes50);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(element58);
    }

    @Test
    public void test3431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3431");
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
        org.jsoup.parser.Token.StartTag startTag41 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag43 = startTag41.name("hi!");
        startTag41.appendAttributeName(' ');
        startTag41.appendAttributeValue('#');
        org.jsoup.parser.Token.Tag tag49 = startTag41.name("hi!a");
        boolean boolean50 = xmlTreeBuilder0.process((org.jsoup.parser.Token) tag49);
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
        org.junit.Assert.assertNotNull(tag43);
        org.junit.Assert.assertNotNull(tag49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
    }

    @Test
    public void test3432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3432");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("<<</hi!>>>");
        boolean boolean2 = endTag1.isEOF();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Comment comment3 = endTag1.asComment();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$EndTag cannot be cast to class org.jsoup.parser.Token$Comment (org.jsoup.parser.Token$EndTag and org.jsoup.parser.Token$Comment are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3433");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.appendAttributeName('a');
        boolean boolean3 = endTag0.isCharacter();
        java.lang.String str4 = endTag0.tokenType();
        boolean boolean5 = endTag0.selfClosing;
        endTag0.selfClosing = false;
        endTag0.appendAttributeName('#');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "EndTag" + "'", str4, "EndTag");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test3434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3434");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.tokenType();
        boolean boolean2 = doctype0.isForceQuirks();
        java.lang.String str3 = doctype0.getPublicIdentifier();
        boolean boolean4 = doctype0.isForceQuirks();
        java.lang.String str5 = doctype0.getName();
        java.lang.String str6 = doctype0.getPublicIdentifier();
        java.lang.String str7 = doctype0.getPublicIdentifier();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Doctype" + "'", str1, "Doctype");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test3435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3435");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag2 = startTag0.name("hi!");
        org.jsoup.nodes.Attributes attributes3 = tag2.attributes;
        boolean boolean4 = tag2.isEndTag();
        org.jsoup.parser.Token.Tag tag6 = tag2.name("");
        org.jsoup.nodes.Attributes attributes7 = tag6.attributes;
        tag6.appendTagName("</Doctype>");
        boolean boolean10 = tag6.isSelfClosing();
        tag6.finaliseTag();
        org.junit.Assert.assertNotNull(tag2);
        org.junit.Assert.assertNotNull(attributes3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(tag6);
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test3436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3436");
        org.jsoup.parser.Token.StartTag startTag1 = new org.jsoup.parser.Token.StartTag();
        startTag1.appendTagName('4');
        java.lang.String str4 = startTag1.name();
        org.jsoup.nodes.Attributes attributes5 = startTag1.attributes;
        org.jsoup.parser.Token.StartTag startTag6 = new org.jsoup.parser.Token.StartTag("hi!", attributes5);
        org.jsoup.nodes.Attributes attributes7 = startTag6.getAttributes();
        boolean boolean8 = startTag6.isSelfClosing();
        org.jsoup.nodes.Attributes attributes9 = startTag6.getAttributes();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "4" + "'", str4, "4");
        org.junit.Assert.assertNotNull(attributes5);
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(attributes9);
    }

    @Test
    public void test3437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3437");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("hi!");
        boolean boolean2 = endTag1.selfClosing;
        endTag1.finaliseTag();
        java.lang.String str4 = endTag1.toString();
        java.lang.String str5 = endTag1.tokenType();
        org.jsoup.nodes.Attributes attributes6 = endTag1.attributes;
        boolean boolean7 = endTag1.isDoctype();
        org.jsoup.nodes.Attributes attributes8 = endTag1.attributes;
        endTag1.appendTagName("<<</hi!>>>");
        boolean boolean11 = endTag1.isComment();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "</hi!>" + "'", str4, "</hi!>");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "EndTag" + "'", str5, "EndTag");
        org.junit.Assert.assertNull(attributes6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(attributes8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test3438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3438");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.tokenType();
        java.lang.StringBuilder stringBuilder2 = doctype0.publicIdentifier;
        boolean boolean3 = doctype0.isForceQuirks();
        java.lang.String str4 = doctype0.getName();
        java.lang.String str5 = doctype0.getPublicIdentifier();
        boolean boolean6 = doctype0.forceQuirks;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Doctype" + "'", str1, "Doctype");
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test3439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3439");
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
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder25 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList28 = null;
        xmlTreeBuilder25.initialiseParse("Character", "hi!", parseErrorList28);
        org.jsoup.parser.Token.Comment comment30 = new org.jsoup.parser.Token.Comment();
        java.lang.StringBuilder stringBuilder31 = comment30.data;
        java.lang.String str32 = comment30.getData();
        xmlTreeBuilder25.insert(comment30);
        org.jsoup.parser.Token.StartTag startTag34 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag36 = startTag34.name("hi!");
        startTag34.appendAttributeName(' ');
        boolean boolean39 = startTag34.isComment();
        org.jsoup.nodes.Element element40 = xmlTreeBuilder25.insert(startTag34);
        org.jsoup.parser.ParseErrorList parseErrorList43 = null;
        xmlTreeBuilder25.initialiseParse("Character", "<Doctype>", parseErrorList43);
        org.jsoup.parser.Token.EOF eOF45 = new org.jsoup.parser.Token.EOF();
        org.jsoup.parser.Token.TokenType tokenType46 = eOF45.type;
        java.lang.String str47 = eOF45.tokenType();
        boolean boolean48 = xmlTreeBuilder25.process((org.jsoup.parser.Token) eOF45);
        org.jsoup.parser.Token.Comment comment49 = new org.jsoup.parser.Token.Comment();
        java.lang.StringBuilder stringBuilder50 = comment49.data;
        java.lang.String str51 = comment49.getData();
        java.lang.StringBuilder stringBuilder52 = comment49.data;
        java.lang.String str53 = comment49.toString();
        java.lang.String str54 = comment49.getData();
        xmlTreeBuilder25.insert(comment49);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder56 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.Token.EOF eOF57 = new org.jsoup.parser.Token.EOF();
        java.lang.String str58 = eOF57.tokenType();
        boolean boolean59 = xmlTreeBuilder56.process((org.jsoup.parser.Token) eOF57);
        org.jsoup.parser.ParseErrorList parseErrorList62 = null;
        xmlTreeBuilder56.initialiseParse("", "EndTag", parseErrorList62);
        org.jsoup.parser.Token.Character character65 = new org.jsoup.parser.Token.Character("</hi!>");
        java.lang.String str66 = character65.getData();
        java.lang.String str67 = character65.toString();
        xmlTreeBuilder56.insert(character65);
        xmlTreeBuilder25.insert(character65);
        org.jsoup.parser.Token.Comment comment70 = new org.jsoup.parser.Token.Comment();
        java.lang.StringBuilder stringBuilder71 = comment70.data;
        org.jsoup.parser.Token.TokenType tokenType72 = org.jsoup.parser.Token.TokenType.Comment;
        comment70.type = tokenType72;
        java.lang.StringBuilder stringBuilder74 = comment70.data;
        org.jsoup.parser.Token.Comment comment75 = comment70.asComment();
        xmlTreeBuilder25.insert(comment70);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder77 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList80 = null;
        xmlTreeBuilder77.initialiseParse("</hi!>", "EOF", parseErrorList80);
        org.jsoup.parser.Token.StartTag startTag82 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag84 = startTag82.name("hi!");
        boolean boolean85 = xmlTreeBuilder77.process((org.jsoup.parser.Token) startTag82);
        org.jsoup.parser.Token.Comment comment86 = new org.jsoup.parser.Token.Comment();
        java.lang.StringBuilder stringBuilder87 = comment86.data;
        java.lang.String str88 = comment86.toString();
        xmlTreeBuilder77.insert(comment86);
        boolean boolean90 = comment86.isEndTag();
        boolean boolean91 = comment86.isStartTag();
        xmlTreeBuilder25.insert(comment86);
        org.jsoup.parser.Token.StartTag startTag93 = new org.jsoup.parser.Token.StartTag();
        startTag93.appendTagName('a');
        startTag93.newAttribute();
        org.jsoup.parser.Token.StartTag startTag97 = startTag93.asStartTag();
        org.jsoup.nodes.Element element98 = xmlTreeBuilder25.insert(startTag93);
        org.jsoup.nodes.Element element99 = xmlTreeBuilder0.insert(startTag93);
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
        org.junit.Assert.assertNotNull(stringBuilder31);
        org.junit.Assert.assertEquals(stringBuilder31.toString(), "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertNotNull(tag36);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(element40);
        org.junit.Assert.assertTrue("'" + tokenType46 + "' != '" + org.jsoup.parser.Token.TokenType.EOF + "'", tokenType46.equals(org.jsoup.parser.Token.TokenType.EOF));
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "EOF" + "'", str47, "EOF");
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNotNull(stringBuilder50);
        org.junit.Assert.assertEquals(stringBuilder50.toString(), "");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
        org.junit.Assert.assertNotNull(stringBuilder52);
        org.junit.Assert.assertEquals(stringBuilder52.toString(), "");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "<!---->" + "'", str53, "<!---->");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "" + "'", str54, "");
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "EOF" + "'", str58, "EOF");
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "</hi!>" + "'", str66, "</hi!>");
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "</hi!>" + "'", str67, "</hi!>");
        org.junit.Assert.assertNotNull(stringBuilder71);
        org.junit.Assert.assertEquals(stringBuilder71.toString(), "");
        org.junit.Assert.assertTrue("'" + tokenType72 + "' != '" + org.jsoup.parser.Token.TokenType.Comment + "'", tokenType72.equals(org.jsoup.parser.Token.TokenType.Comment));
        org.junit.Assert.assertNotNull(stringBuilder74);
        org.junit.Assert.assertEquals(stringBuilder74.toString(), "");
        org.junit.Assert.assertNotNull(comment75);
        org.junit.Assert.assertNotNull(tag84);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + true + "'", boolean85 == true);
        org.junit.Assert.assertNotNull(stringBuilder87);
        org.junit.Assert.assertEquals(stringBuilder87.toString(), "");
        org.junit.Assert.assertEquals("'" + str88 + "' != '" + "<!---->" + "'", str88, "<!---->");
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
        org.junit.Assert.assertNotNull(startTag97);
        org.junit.Assert.assertNotNull(element98);
        org.junit.Assert.assertNotNull(element99);
    }

    @Test
    public void test3440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3440");
        org.jsoup.nodes.Attributes attributes1 = null;
        org.jsoup.parser.Token.StartTag startTag2 = new org.jsoup.parser.Token.StartTag("", attributes1);
        boolean boolean3 = startTag2.isDoctype();
        java.lang.String str4 = startTag2.tagName;
        startTag2.newAttribute();
        startTag2.appendTagName("</hi!>");
        org.jsoup.parser.Token.TokenType tokenType8 = startTag2.type;
        startTag2.appendAttributeName("hi!");
        org.jsoup.parser.Token.TokenType tokenType11 = startTag2.type;
        java.lang.Class<?> wildcardClass12 = startTag2.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + tokenType8 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType8.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertTrue("'" + tokenType11 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType11.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test3441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3441");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("hi!");
        boolean boolean2 = endTag1.selfClosing;
        org.jsoup.parser.Token.Tag tag4 = endTag1.name("");
        boolean boolean5 = endTag1.isEndTag();
        org.jsoup.parser.Token.Tag tag7 = endTag1.name("<4>");
        java.lang.String str8 = endTag1.tokenType();
        org.jsoup.parser.Token.EndTag endTag9 = endTag1.asEndTag();
        boolean boolean10 = endTag1.isEOF();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(tag4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(tag7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "EndTag" + "'", str8, "EndTag");
        org.junit.Assert.assertNotNull(endTag9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test3442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3442");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("hi!");
        java.lang.String str2 = endTag1.toString();
        java.lang.String str3 = endTag1.toString();
        boolean boolean4 = endTag1.isDoctype();
        java.lang.String str5 = endTag1.tagName;
        java.lang.String str6 = endTag1.name();
        endTag1.appendAttributeValue("Character");
        boolean boolean9 = endTag1.isSelfClosing();
        endTag1.tagName = "<hi!  =\"#\">";
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "</hi!>" + "'", str2, "</hi!>");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "</hi!>" + "'", str3, "</hi!>");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test3443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3443");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("hi!");
        java.lang.String str2 = endTag1.toString();
        java.lang.String str3 = endTag1.toString();
        boolean boolean4 = endTag1.isDoctype();
        java.lang.String str5 = endTag1.tagName;
        org.jsoup.parser.Token.StartTag startTag7 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag9 = startTag7.name("hi!");
        org.jsoup.nodes.Attributes attributes10 = tag9.attributes;
        org.jsoup.parser.Token.StartTag startTag11 = new org.jsoup.parser.Token.StartTag("</hi!>", attributes10);
        endTag1.attributes = attributes10;
        java.lang.Class<?> wildcardClass13 = attributes10.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "</hi!>" + "'", str2, "</hi!>");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "</hi!>" + "'", str3, "</hi!>");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(tag9);
        org.junit.Assert.assertNotNull(attributes10);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3444");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.tokenType();
        org.jsoup.parser.Token.Doctype doctype2 = doctype0.asDoctype();
        java.lang.StringBuilder stringBuilder3 = doctype2.name;
        java.lang.StringBuilder stringBuilder4 = doctype2.systemIdentifier;
        java.lang.StringBuilder stringBuilder5 = doctype2.publicIdentifier;
        java.lang.StringBuilder stringBuilder6 = doctype2.publicIdentifier;
        boolean boolean7 = doctype2.forceQuirks;
        boolean boolean8 = doctype2.forceQuirks;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Doctype" + "'", str1, "Doctype");
        org.junit.Assert.assertNotNull(doctype2);
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test3445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3445");
        org.jsoup.nodes.Attributes attributes3 = null;
        org.jsoup.parser.Token.StartTag startTag4 = new org.jsoup.parser.Token.StartTag("", attributes3);
        startTag4.selfClosing = false;
        startTag4.newAttribute();
        org.jsoup.nodes.Attributes attributes8 = startTag4.getAttributes();
        org.jsoup.parser.Token.StartTag startTag9 = new org.jsoup.parser.Token.StartTag("</<4>>", attributes8);
        org.jsoup.parser.Token.StartTag startTag10 = new org.jsoup.parser.Token.StartTag("</<!---->>", attributes8);
        org.junit.Assert.assertNotNull(attributes8);
    }

    @Test
    public void test3446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3446");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        xmlTreeBuilder0.initialiseParse("</hi!>", "EOF", parseErrorList3);
        org.jsoup.parser.Token.Comment comment5 = new org.jsoup.parser.Token.Comment();
        java.lang.StringBuilder stringBuilder6 = comment5.data;
        org.jsoup.parser.Token.TokenType tokenType7 = org.jsoup.parser.Token.TokenType.Comment;
        comment5.type = tokenType7;
        java.lang.StringBuilder stringBuilder9 = comment5.data;
        boolean boolean10 = xmlTreeBuilder0.process((org.jsoup.parser.Token) comment5);
        org.jsoup.parser.Token.Character character12 = new org.jsoup.parser.Token.Character("EOF");
        java.lang.String str13 = character12.getData();
        java.lang.String str14 = character12.toString();
        boolean boolean15 = character12.isStartTag();
        java.lang.String str16 = character12.toString();
        java.lang.String str17 = character12.toString();
        boolean boolean18 = xmlTreeBuilder0.process((org.jsoup.parser.Token) character12);
        org.jsoup.parser.Token.Character character20 = new org.jsoup.parser.Token.Character("EOF");
        java.lang.String str21 = character20.getData();
        java.lang.String str22 = character20.toString();
        boolean boolean23 = character20.isStartTag();
        java.lang.String str24 = character20.toString();
        java.lang.String str25 = character20.toString();
        java.lang.String str26 = character20.getData();
        java.lang.String str27 = character20.getData();
        java.lang.String str28 = character20.toString();
        xmlTreeBuilder0.insert(character20);
        org.jsoup.parser.Token.Character character31 = new org.jsoup.parser.Token.Character("EOF");
        java.lang.String str32 = character31.getData();
        boolean boolean33 = character31.isComment();
        org.jsoup.parser.Token.Comment comment34 = new org.jsoup.parser.Token.Comment();
        java.lang.StringBuilder stringBuilder35 = comment34.data;
        org.jsoup.parser.Token.TokenType tokenType36 = org.jsoup.parser.Token.TokenType.Comment;
        comment34.type = tokenType36;
        character31.type = tokenType36;
        java.lang.String str39 = character31.toString();
        java.lang.String str40 = character31.toString();
        xmlTreeBuilder0.insert(character31);
        java.lang.String str42 = character31.getData();
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "");
        org.junit.Assert.assertTrue("'" + tokenType7 + "' != '" + org.jsoup.parser.Token.TokenType.Comment + "'", tokenType7.equals(org.jsoup.parser.Token.TokenType.Comment));
        org.junit.Assert.assertNotNull(stringBuilder9);
        org.junit.Assert.assertEquals(stringBuilder9.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "EOF" + "'", str13, "EOF");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "EOF" + "'", str14, "EOF");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "EOF" + "'", str16, "EOF");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "EOF" + "'", str17, "EOF");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "EOF" + "'", str21, "EOF");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "EOF" + "'", str22, "EOF");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "EOF" + "'", str24, "EOF");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "EOF" + "'", str25, "EOF");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "EOF" + "'", str26, "EOF");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "EOF" + "'", str27, "EOF");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "EOF" + "'", str28, "EOF");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "EOF" + "'", str32, "EOF");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(stringBuilder35);
        org.junit.Assert.assertEquals(stringBuilder35.toString(), "");
        org.junit.Assert.assertTrue("'" + tokenType36 + "' != '" + org.jsoup.parser.Token.TokenType.Comment + "'", tokenType36.equals(org.jsoup.parser.Token.TokenType.Comment));
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "EOF" + "'", str39, "EOF");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "EOF" + "'", str40, "EOF");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "EOF" + "'", str42, "EOF");
    }

    @Test
    public void test3447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3447");
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
        boolean boolean14 = startTag9.isStartTag();
        org.junit.Assert.assertNotNull(tag7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test3448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3448");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("hi!");
        boolean boolean2 = endTag1.selfClosing;
        java.lang.String str3 = endTag1.toString();
        java.lang.String str4 = endTag1.toString();
        endTag1.appendAttributeValue("<4>");
        java.lang.String str7 = endTag1.toString();
        org.jsoup.parser.Token.TokenType tokenType8 = endTag1.type;
        boolean boolean9 = endTag1.selfClosing;
        endTag1.tagName = "</hi!>4";
        endTag1.selfClosing = false;
        boolean boolean14 = endTag1.isSelfClosing();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "</hi!>" + "'", str3, "</hi!>");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "</hi!>" + "'", str4, "</hi!>");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "</hi!>" + "'", str7, "</hi!>");
        org.junit.Assert.assertTrue("'" + tokenType8 + "' != '" + org.jsoup.parser.Token.TokenType.EndTag + "'", tokenType8.equals(org.jsoup.parser.Token.TokenType.EndTag));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test3449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3449");
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
        org.jsoup.parser.Token.Doctype doctype49 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str50 = doctype49.tokenType();
        org.jsoup.parser.Token.Doctype doctype51 = doctype49.asDoctype();
        boolean boolean52 = doctype49.isForceQuirks();
        java.lang.StringBuilder stringBuilder53 = doctype49.publicIdentifier;
        boolean boolean54 = doctype49.forceQuirks;
        java.lang.StringBuilder stringBuilder55 = doctype49.systemIdentifier;
        // The following exception was thrown during execution in test generation
        try {
            xmlTreeBuilder0.insert(doctype49);
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
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "Doctype" + "'", str50, "Doctype");
        org.junit.Assert.assertNotNull(doctype51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(stringBuilder53);
        org.junit.Assert.assertEquals(stringBuilder53.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(stringBuilder55);
        org.junit.Assert.assertEquals(stringBuilder55.toString(), "");
    }

    @Test
    public void test3450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3450");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag2 = startTag0.name("hi!");
        startTag0.finaliseTag();
        boolean boolean4 = startTag0.selfClosing;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Comment comment5 = startTag0.asComment();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$Comment (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$Comment are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tag2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test3451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3451");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("hi!");
        java.lang.String str2 = endTag1.toString();
        java.lang.String str3 = endTag1.toString();
        boolean boolean4 = endTag1.isDoctype();
        endTag1.appendAttributeName("EOF");
        boolean boolean7 = endTag1.isStartTag();
        endTag1.tagName = "Character";
        java.lang.String str10 = endTag1.tagName;
        endTag1.appendTagName('4');
        endTag1.newAttribute();
        org.jsoup.nodes.Attributes attributes14 = endTag1.getAttributes();
        boolean boolean15 = endTag1.isSelfClosing();
        boolean boolean16 = endTag1.selfClosing;
        endTag1.appendTagName("<</hi!>>");
        endTag1.selfClosing = false;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "</hi!>" + "'", str2, "</hi!>");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "</hi!>" + "'", str3, "</hi!>");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Character" + "'", str10, "Character");
        org.junit.Assert.assertNotNull(attributes14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test3452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3452");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.Token.EOF eOF1 = new org.jsoup.parser.Token.EOF();
        java.lang.String str2 = eOF1.tokenType();
        boolean boolean3 = xmlTreeBuilder0.process((org.jsoup.parser.Token) eOF1);
        org.jsoup.parser.ParseErrorList parseErrorList6 = null;
        xmlTreeBuilder0.initialiseParse("", "EndTag", parseErrorList6);
        org.jsoup.parser.Token.Character character9 = new org.jsoup.parser.Token.Character("<</hi!>>");
        boolean boolean10 = xmlTreeBuilder0.process((org.jsoup.parser.Token) character9);
        org.jsoup.parser.ParseErrorList parseErrorList13 = null;
        xmlTreeBuilder0.initialiseParse("<hi!>", "StartTag", parseErrorList13);
        org.jsoup.parser.Token.StartTag startTag15 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag17 = startTag15.name("hi!");
        org.jsoup.nodes.Attributes attributes18 = tag17.attributes;
        java.lang.String str19 = tag17.tagName;
        boolean boolean20 = xmlTreeBuilder0.process((org.jsoup.parser.Token) tag17);
        org.jsoup.nodes.Attributes attributes21 = tag17.attributes;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "EOF" + "'", str2, "EOF");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(tag17);
        org.junit.Assert.assertNotNull(attributes18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(attributes21);
    }

    @Test
    public void test3453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3453");
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
        startTag33.appendTagName("EOF");
        org.jsoup.nodes.Attributes attributes36 = startTag33.getAttributes();
        startTag33.appendTagName("</Character>");
        org.jsoup.parser.Token.Tag tag40 = startTag33.name("<<Doctype>>");
        startTag33.appendTagName('4');
        org.junit.Assert.assertNotNull(tag8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(tag18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertNotNull(tag28);
        org.junit.Assert.assertNotNull(attributes29);
        org.junit.Assert.assertNotNull(attributes36);
        org.junit.Assert.assertNotNull(tag40);
    }

    @Test
    public void test3454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3454");
        org.jsoup.nodes.Attributes attributes1 = null;
        org.jsoup.parser.Token.StartTag startTag2 = new org.jsoup.parser.Token.StartTag("", attributes1);
        boolean boolean3 = startTag2.isDoctype();
        java.lang.String str4 = startTag2.tagName;
        startTag2.selfClosing = false;
        org.jsoup.parser.Token.Tag tag8 = startTag2.name("</hi!>");
        startTag2.appendAttributeName("Doctype");
        startTag2.appendAttributeName("StartTag");
        org.jsoup.parser.Token.Tag tag14 = startTag2.name("Character");
        startTag2.selfClosing = true;
        startTag2.selfClosing = true;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(tag8);
        org.junit.Assert.assertNotNull(tag14);
    }

    @Test
    public void test3455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3455");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        boolean boolean1 = doctype0.forceQuirks;
        java.lang.StringBuilder stringBuilder2 = doctype0.systemIdentifier;
        boolean boolean3 = doctype0.isCharacter();
        doctype0.forceQuirks = false;
        java.lang.String str6 = doctype0.getName();
        boolean boolean7 = doctype0.isForceQuirks();
        boolean boolean8 = doctype0.isComment();
        java.lang.StringBuilder stringBuilder9 = doctype0.systemIdentifier;
        doctype0.forceQuirks = false;
        java.lang.String str12 = doctype0.getSystemIdentifier();
        java.lang.String str13 = doctype0.getSystemIdentifier();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(stringBuilder9);
        org.junit.Assert.assertEquals(stringBuilder9.toString(), "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test3456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3456");
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
        doctype0.forceQuirks = true;
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
    }

    @Test
    public void test3457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3457");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.tokenType();
        java.lang.String str2 = doctype0.getSystemIdentifier();
        java.lang.String str3 = doctype0.tokenType();
        boolean boolean4 = doctype0.forceQuirks;
        doctype0.forceQuirks = false;
        java.lang.StringBuilder stringBuilder7 = doctype0.publicIdentifier;
        java.lang.String str8 = doctype0.getPublicIdentifier();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Doctype" + "'", str1, "Doctype");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Doctype" + "'", str3, "Doctype");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(stringBuilder7);
        org.junit.Assert.assertEquals(stringBuilder7.toString(), "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test3458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3458");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("hi!");
        boolean boolean2 = endTag1.selfClosing;
        endTag1.finaliseTag();
        endTag1.appendAttributeName('4');
        boolean boolean6 = endTag1.isDoctype();
        java.lang.Class<?> wildcardClass7 = endTag1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test3459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3459");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.tokenType();
        java.lang.StringBuilder stringBuilder2 = doctype0.systemIdentifier;
        doctype0.forceQuirks = false;
        java.lang.String str5 = doctype0.getPublicIdentifier();
        java.lang.StringBuilder stringBuilder6 = doctype0.name;
        java.lang.String str7 = doctype0.getName();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Doctype" + "'", str1, "Doctype");
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test3460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3460");
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
        org.jsoup.parser.Token.StartTag startTag15 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag17 = startTag15.name("hi!");
        org.jsoup.nodes.Attributes attributes18 = tag17.attributes;
        org.jsoup.parser.Token.StartTag startTag19 = new org.jsoup.parser.Token.StartTag("", attributes18);
        startTag9.attributes = attributes18;
        org.jsoup.parser.Token.StartTag startTag21 = startTag9.asStartTag();
        org.jsoup.nodes.Attributes attributes22 = startTag21.getAttributes();
        org.junit.Assert.assertNotNull(tag7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(tag17);
        org.junit.Assert.assertNotNull(attributes18);
        org.junit.Assert.assertNotNull(startTag21);
        org.junit.Assert.assertNotNull(attributes22);
    }

    @Test
    public void test3461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3461");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        boolean boolean1 = doctype0.forceQuirks;
        java.lang.StringBuilder stringBuilder2 = doctype0.systemIdentifier;
        boolean boolean3 = doctype0.isEndTag();
        boolean boolean4 = doctype0.isForceQuirks();
        doctype0.forceQuirks = false;
        java.lang.String str7 = doctype0.tokenType();
        java.lang.StringBuilder stringBuilder8 = doctype0.systemIdentifier;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Doctype" + "'", str7, "Doctype");
        org.junit.Assert.assertNotNull(stringBuilder8);
        org.junit.Assert.assertEquals(stringBuilder8.toString(), "");
    }

    @Test
    public void test3462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3462");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("hi!");
        java.lang.String str2 = endTag1.toString();
        java.lang.String str3 = endTag1.toString();
        boolean boolean4 = endTag1.isDoctype();
        java.lang.String str5 = endTag1.tagName;
        org.jsoup.parser.Token.StartTag startTag7 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag9 = startTag7.name("hi!");
        org.jsoup.nodes.Attributes attributes10 = tag9.attributes;
        org.jsoup.parser.Token.StartTag startTag11 = new org.jsoup.parser.Token.StartTag("</hi!>", attributes10);
        endTag1.attributes = attributes10;
        endTag1.appendAttributeValue("StartTag");
        boolean boolean15 = endTag1.selfClosing;
        endTag1.appendTagName("<4>");
        boolean boolean18 = endTag1.isSelfClosing();
        org.jsoup.nodes.Attributes attributes19 = endTag1.attributes;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "</hi!>" + "'", str2, "</hi!>");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "</hi!>" + "'", str3, "</hi!>");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(tag9);
        org.junit.Assert.assertNotNull(attributes10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(attributes19);
    }

    @Test
    public void test3463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3463");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.tokenType();
        java.lang.StringBuilder stringBuilder2 = doctype0.systemIdentifier;
        doctype0.forceQuirks = true;
        doctype0.forceQuirks = false;
        boolean boolean7 = doctype0.isForceQuirks();
        java.lang.StringBuilder stringBuilder8 = doctype0.name;
        org.jsoup.parser.Token.TokenType tokenType9 = org.jsoup.parser.Token.TokenType.EOF;
        doctype0.type = tokenType9;
        boolean boolean11 = doctype0.isEndTag();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Doctype" + "'", str1, "Doctype");
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(stringBuilder8);
        org.junit.Assert.assertEquals(stringBuilder8.toString(), "");
        org.junit.Assert.assertTrue("'" + tokenType9 + "' != '" + org.jsoup.parser.Token.TokenType.EOF + "'", tokenType9.equals(org.jsoup.parser.Token.TokenType.EOF));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test3464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3464");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("hi!");
        boolean boolean2 = endTag1.selfClosing;
        org.jsoup.parser.Token.Tag tag4 = endTag1.name("");
        java.lang.Class<?> wildcardClass5 = tag4.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(tag4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test3465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3465");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        xmlTreeBuilder0.initialiseParse("</hi!>", "EOF", parseErrorList3);
        org.jsoup.parser.ParseErrorList parseErrorList7 = null;
        xmlTreeBuilder0.initialiseParse("hi!a", "</hi!>", parseErrorList7);
        org.jsoup.parser.Token.StartTag startTag9 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag11 = startTag9.name("hi!");
        startTag9.finaliseTag();
        org.jsoup.nodes.Element element13 = xmlTreeBuilder0.insert(startTag9);
        org.jsoup.parser.Token.Character character15 = new org.jsoup.parser.Token.Character("EOF");
        java.lang.String str16 = character15.toString();
        java.lang.String str17 = character15.toString();
        java.lang.String str18 = character15.toString();
        xmlTreeBuilder0.insert(character15);
        org.jsoup.parser.Token.EndTag endTag24 = new org.jsoup.parser.Token.EndTag("hi!");
        java.lang.String str25 = endTag24.toString();
        java.lang.String str26 = endTag24.toString();
        boolean boolean27 = endTag24.isDoctype();
        java.lang.String str28 = endTag24.tagName;
        org.jsoup.parser.Token.StartTag startTag30 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag32 = startTag30.name("hi!");
        org.jsoup.nodes.Attributes attributes33 = tag32.attributes;
        org.jsoup.parser.Token.StartTag startTag34 = new org.jsoup.parser.Token.StartTag("</hi!>", attributes33);
        endTag24.attributes = attributes33;
        org.jsoup.parser.Token.StartTag startTag36 = new org.jsoup.parser.Token.StartTag("EndTag", attributes33);
        org.jsoup.parser.Token.StartTag startTag37 = new org.jsoup.parser.Token.StartTag("<hi!  =\"#\">", attributes33);
        org.jsoup.parser.Token.StartTag startTag38 = new org.jsoup.parser.Token.StartTag("<4</hi!>4>", attributes33);
        org.jsoup.nodes.Element element39 = xmlTreeBuilder0.insert(startTag38);
        startTag38.appendTagName(' ');
        org.jsoup.nodes.Attributes attributes42 = startTag38.getAttributes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.EndTag endTag43 = startTag38.asEndTag();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$EndTag (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$EndTag are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tag11);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "EOF" + "'", str16, "EOF");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "EOF" + "'", str17, "EOF");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "EOF" + "'", str18, "EOF");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "</hi!>" + "'", str25, "</hi!>");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "</hi!>" + "'", str26, "</hi!>");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertNotNull(tag32);
        org.junit.Assert.assertNotNull(attributes33);
        org.junit.Assert.assertNotNull(element39);
        org.junit.Assert.assertNotNull(attributes42);
    }

    @Test
    public void test3466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3466");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        boolean boolean1 = doctype0.forceQuirks;
        java.lang.String str2 = doctype0.getName();
        boolean boolean3 = doctype0.forceQuirks;
        boolean boolean4 = doctype0.forceQuirks;
        java.lang.StringBuilder stringBuilder5 = doctype0.systemIdentifier;
        org.jsoup.parser.Token.TokenType tokenType6 = doctype0.type;
        boolean boolean7 = doctype0.isCharacter();
        java.lang.StringBuilder stringBuilder8 = doctype0.name;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "");
        org.junit.Assert.assertTrue("'" + tokenType6 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType6.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(stringBuilder8);
        org.junit.Assert.assertEquals(stringBuilder8.toString(), "");
    }

    @Test
    public void test3467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3467");
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
        boolean boolean16 = endTag1.selfClosing;
        java.lang.String str17 = endTag1.toString();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "</<!---->>" + "'", str4, "</<!---->>");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "</hi!>" + "'", str7, "</hi!>");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "</hi!>" + "'", str8, "</hi!>");
        org.junit.Assert.assertTrue("'" + tokenType9 + "' != '" + org.jsoup.parser.Token.TokenType.EndTag + "'", tokenType9.equals(org.jsoup.parser.Token.TokenType.EndTag));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + tokenType12 + "' != '" + org.jsoup.parser.Token.TokenType.EndTag + "'", tokenType12.equals(org.jsoup.parser.Token.TokenType.EndTag));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "</<!---->>" + "'", str17, "</<!---->>");
    }

    @Test
    public void test3468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3468");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("hi!");
        java.lang.String str2 = endTag1.toString();
        java.lang.String str3 = endTag1.toString();
        org.jsoup.parser.Token.TokenType tokenType4 = org.jsoup.parser.Token.TokenType.EndTag;
        endTag1.type = tokenType4;
        boolean boolean6 = endTag1.isStartTag();
        boolean boolean7 = endTag1.isSelfClosing();
        org.jsoup.parser.Token.StartTag startTag9 = new org.jsoup.parser.Token.StartTag("hi!");
        startTag9.appendAttributeValue("</hi!>");
        org.jsoup.nodes.Attributes attributes12 = startTag9.attributes;
        endTag1.attributes = attributes12;
        org.jsoup.nodes.Attributes attributes14 = endTag1.attributes;
        boolean boolean15 = endTag1.isEndTag();
        endTag1.finaliseTag();
        endTag1.appendTagName("hi! ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "</hi!>" + "'", str2, "</hi!>");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "</hi!>" + "'", str3, "</hi!>");
        org.junit.Assert.assertTrue("'" + tokenType4 + "' != '" + org.jsoup.parser.Token.TokenType.EndTag + "'", tokenType4.equals(org.jsoup.parser.Token.TokenType.EndTag));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(attributes12);
        org.junit.Assert.assertNotNull(attributes14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test3469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3469");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("hi!");
        java.lang.String str2 = endTag1.toString();
        java.lang.String str3 = endTag1.toString();
        boolean boolean4 = endTag1.isDoctype();
        endTag1.appendAttributeName("EOF");
        boolean boolean7 = endTag1.isStartTag();
        endTag1.tagName = "Character";
        java.lang.String str10 = endTag1.tagName;
        boolean boolean11 = endTag1.selfClosing;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "</hi!>" + "'", str2, "</hi!>");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "</hi!>" + "'", str3, "</hi!>");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Character" + "'", str10, "Character");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test3470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3470");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.tokenType();
        boolean boolean2 = doctype0.isForceQuirks();
        java.lang.String str3 = doctype0.getPublicIdentifier();
        boolean boolean4 = doctype0.isForceQuirks();
        doctype0.forceQuirks = true;
        java.lang.StringBuilder stringBuilder7 = doctype0.systemIdentifier;
        java.lang.String str8 = doctype0.getSystemIdentifier();
        org.jsoup.parser.Token.Doctype doctype9 = doctype0.asDoctype();
        java.lang.StringBuilder stringBuilder10 = doctype0.systemIdentifier;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Doctype" + "'", str1, "Doctype");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(stringBuilder7);
        org.junit.Assert.assertEquals(stringBuilder7.toString(), "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(doctype9);
        org.junit.Assert.assertNotNull(stringBuilder10);
        org.junit.Assert.assertEquals(stringBuilder10.toString(), "");
    }

    @Test
    public void test3471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3471");
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
        org.jsoup.parser.Token.StartTag startTag18 = new org.jsoup.parser.Token.StartTag("hi! ", attributes17);
        startTag18.tagName = "<</hi!>>hi!";
        java.lang.String str21 = startTag18.toString();
        org.junit.Assert.assertNotNull(stringBuilder7);
        org.junit.Assert.assertEquals(stringBuilder7.toString(), "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(tag12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(attributes17);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "<<</hi!>>hi!>" + "'", str21, "<<</hi!>>hi!>");
    }

    @Test
    public void test3472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3472");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        boolean boolean1 = doctype0.forceQuirks;
        java.lang.String str2 = doctype0.getName();
        java.lang.String str3 = doctype0.getSystemIdentifier();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test3473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3473");
        org.jsoup.parser.Token.Character character1 = new org.jsoup.parser.Token.Character("EOF");
        java.lang.String str2 = character1.getData();
        java.lang.String str3 = character1.toString();
        boolean boolean4 = character1.isStartTag();
        java.lang.String str5 = character1.getData();
        java.lang.String str6 = character1.toString();
        org.jsoup.parser.Token.Character character7 = character1.asCharacter();
        java.lang.String str8 = character1.getData();
        org.jsoup.parser.Token.Character character9 = character1.asCharacter();
        java.lang.String str10 = character9.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "EOF" + "'", str2, "EOF");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "EOF" + "'", str3, "EOF");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "EOF" + "'", str5, "EOF");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "EOF" + "'", str6, "EOF");
        org.junit.Assert.assertNotNull(character7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "EOF" + "'", str8, "EOF");
        org.junit.Assert.assertNotNull(character9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "EOF" + "'", str10, "EOF");
    }

    @Test
    public void test3474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3474");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.Token.EOF eOF1 = new org.jsoup.parser.Token.EOF();
        boolean boolean2 = eOF1.isStartTag();
        boolean boolean3 = eOF1.isDoctype();
        boolean boolean4 = xmlTreeBuilder0.process((org.jsoup.parser.Token) eOF1);
        org.jsoup.parser.ParseErrorList parseErrorList7 = null;
        xmlTreeBuilder0.initialiseParse("</Doctype4>", "<<hi!>>", parseErrorList7);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test3475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3475");
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
        org.jsoup.parser.ParseErrorList parseErrorList64 = null;
        xmlTreeBuilder0.initialiseParse("<EndTag>", "</hi! >", parseErrorList64);
        org.jsoup.parser.Token.Doctype doctype66 = new org.jsoup.parser.Token.Doctype();
        boolean boolean67 = doctype66.forceQuirks;
        java.lang.StringBuilder stringBuilder68 = doctype66.systemIdentifier;
        boolean boolean69 = doctype66.isCharacter();
        doctype66.forceQuirks = false;
        java.lang.StringBuilder stringBuilder72 = doctype66.publicIdentifier;
        boolean boolean73 = doctype66.forceQuirks;
        doctype66.forceQuirks = true;
        java.lang.StringBuilder stringBuilder76 = doctype66.publicIdentifier;
        java.lang.String str77 = doctype66.getName();
        doctype66.forceQuirks = false;
        java.lang.StringBuilder stringBuilder80 = doctype66.publicIdentifier;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean81 = xmlTreeBuilder0.process((org.jsoup.parser.Token) doctype66);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
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
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNotNull(stringBuilder68);
        org.junit.Assert.assertEquals(stringBuilder68.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNotNull(stringBuilder72);
        org.junit.Assert.assertEquals(stringBuilder72.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertNotNull(stringBuilder76);
        org.junit.Assert.assertEquals(stringBuilder76.toString(), "");
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "" + "'", str77, "");
        org.junit.Assert.assertNotNull(stringBuilder80);
        org.junit.Assert.assertEquals(stringBuilder80.toString(), "");
    }

    @Test
    public void test3476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3476");
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
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder49 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList52 = null;
        xmlTreeBuilder49.initialiseParse("Character", "hi!", parseErrorList52);
        org.jsoup.parser.Token.Comment comment54 = new org.jsoup.parser.Token.Comment();
        java.lang.StringBuilder stringBuilder55 = comment54.data;
        java.lang.String str56 = comment54.getData();
        xmlTreeBuilder49.insert(comment54);
        org.jsoup.parser.Token.StartTag startTag58 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag60 = startTag58.name("hi!");
        startTag58.appendAttributeName(' ');
        boolean boolean63 = startTag58.isComment();
        org.jsoup.nodes.Element element64 = xmlTreeBuilder49.insert(startTag58);
        org.jsoup.parser.Token.StartTag startTag66 = new org.jsoup.parser.Token.StartTag("Doctype");
        java.lang.String str67 = startTag66.name();
        boolean boolean68 = xmlTreeBuilder49.process((org.jsoup.parser.Token) startTag66);
        org.jsoup.parser.Token.Comment comment69 = new org.jsoup.parser.Token.Comment();
        java.lang.StringBuilder stringBuilder70 = comment69.data;
        java.lang.String str71 = comment69.getData();
        java.lang.StringBuilder stringBuilder72 = comment69.data;
        xmlTreeBuilder49.insert(comment69);
        java.lang.StringBuilder stringBuilder74 = comment69.data;
        xmlTreeBuilder0.insert(comment69);
        org.jsoup.parser.Token.Character character77 = new org.jsoup.parser.Token.Character("</hi!>");
        java.lang.String str78 = character77.getData();
        boolean boolean79 = character77.isEOF();
        xmlTreeBuilder0.insert(character77);
        org.jsoup.nodes.Attributes attributes83 = null;
        org.jsoup.parser.Token.StartTag startTag84 = new org.jsoup.parser.Token.StartTag("", attributes83);
        startTag84.selfClosing = false;
        startTag84.newAttribute();
        org.jsoup.parser.Token.StartTag startTag89 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag91 = startTag89.name("hi!");
        org.jsoup.nodes.Attributes attributes92 = tag91.attributes;
        org.jsoup.parser.Token.StartTag startTag93 = new org.jsoup.parser.Token.StartTag("", attributes92);
        startTag84.attributes = attributes92;
        org.jsoup.parser.Token.StartTag startTag95 = new org.jsoup.parser.Token.StartTag("EndTag", attributes92);
        boolean boolean96 = startTag95.isCharacter();
        boolean boolean97 = startTag95.isDoctype();
        java.lang.String str98 = startTag95.tokenType();
        boolean boolean99 = xmlTreeBuilder0.process((org.jsoup.parser.Token) startTag95);
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
        org.junit.Assert.assertNotNull(stringBuilder55);
        org.junit.Assert.assertEquals(stringBuilder55.toString(), "");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "" + "'", str56, "");
        org.junit.Assert.assertNotNull(tag60);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(element64);
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "Doctype" + "'", str67, "Doctype");
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertNotNull(stringBuilder70);
        org.junit.Assert.assertEquals(stringBuilder70.toString(), "");
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "" + "'", str71, "");
        org.junit.Assert.assertNotNull(stringBuilder72);
        org.junit.Assert.assertEquals(stringBuilder72.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder74);
        org.junit.Assert.assertEquals(stringBuilder74.toString(), "");
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "</hi!>" + "'", str78, "</hi!>");
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertNotNull(tag91);
        org.junit.Assert.assertNotNull(attributes92);
        org.junit.Assert.assertTrue("'" + boolean96 + "' != '" + false + "'", boolean96 == false);
        org.junit.Assert.assertTrue("'" + boolean97 + "' != '" + false + "'", boolean97 == false);
        org.junit.Assert.assertEquals("'" + str98 + "' != '" + "StartTag" + "'", str98, "StartTag");
        org.junit.Assert.assertTrue("'" + boolean99 + "' != '" + true + "'", boolean99 == true);
    }

    @Test
    public void test3477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3477");
        org.jsoup.parser.Token.StartTag startTag1 = new org.jsoup.parser.Token.StartTag("<EndTag>");
        java.lang.String str2 = startTag1.name();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "<EndTag>" + "'", str2, "<EndTag>");
    }

    @Test
    public void test3478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3478");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("hi!");
        boolean boolean2 = endTag1.selfClosing;
        endTag1.finaliseTag();
        endTag1.appendTagName('a');
        endTag1.appendAttributeName("hi!");
        boolean boolean8 = endTag1.isEOF();
        endTag1.appendAttributeName("</Doctype4Character>");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test3479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3479");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("hi!");
        boolean boolean2 = endTag1.selfClosing;
        endTag1.finaliseTag();
        java.lang.String str4 = endTag1.toString();
        java.lang.String str5 = endTag1.tokenType();
        endTag1.appendTagName('4');
        endTag1.tagName = "Doctype";
        endTag1.tagName = "";
        endTag1.appendTagName("</4>");
        java.lang.String str14 = endTag1.tagName;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "</hi!>" + "'", str4, "</hi!>");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "EndTag" + "'", str5, "EndTag");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "</4>" + "'", str14, "</4>");
    }

    @Test
    public void test3480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3480");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        boolean boolean1 = doctype0.forceQuirks;
        java.lang.StringBuilder stringBuilder2 = doctype0.systemIdentifier;
        boolean boolean3 = doctype0.isEndTag();
        java.lang.StringBuilder stringBuilder4 = doctype0.systemIdentifier;
        org.jsoup.parser.Token.Doctype doctype5 = doctype0.asDoctype();
        java.lang.StringBuilder stringBuilder6 = doctype5.systemIdentifier;
        boolean boolean7 = doctype5.forceQuirks;
        java.lang.StringBuilder stringBuilder8 = doctype5.systemIdentifier;
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
        org.junit.Assert.assertNotNull(stringBuilder8);
        org.junit.Assert.assertEquals(stringBuilder8.toString(), "");
    }

    @Test
    public void test3481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3481");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        boolean boolean1 = doctype0.forceQuirks;
        java.lang.StringBuilder stringBuilder2 = doctype0.systemIdentifier;
        boolean boolean3 = doctype0.isCharacter();
        doctype0.forceQuirks = false;
        boolean boolean6 = doctype0.isEOF();
        doctype0.forceQuirks = true;
        java.lang.StringBuilder stringBuilder9 = doctype0.publicIdentifier;
        java.lang.StringBuilder stringBuilder10 = doctype0.systemIdentifier;
        java.lang.String str11 = doctype0.getName();
        java.lang.StringBuilder stringBuilder12 = doctype0.publicIdentifier;
        java.lang.String str13 = doctype0.getSystemIdentifier();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(stringBuilder9);
        org.junit.Assert.assertEquals(stringBuilder9.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder10);
        org.junit.Assert.assertEquals(stringBuilder10.toString(), "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(stringBuilder12);
        org.junit.Assert.assertEquals(stringBuilder12.toString(), "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test3482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3482");
        org.jsoup.nodes.Attributes attributes4 = null;
        org.jsoup.parser.Token.StartTag startTag5 = new org.jsoup.parser.Token.StartTag("", attributes4);
        startTag5.selfClosing = false;
        startTag5.appendTagName("</hi!>");
        startTag5.newAttribute();
        org.jsoup.nodes.Attributes attributes11 = startTag5.getAttributes();
        org.jsoup.parser.Token.StartTag startTag12 = new org.jsoup.parser.Token.StartTag("Doctype", attributes11);
        startTag12.selfClosing = true;
        startTag12.appendAttributeName('4');
        org.jsoup.parser.Token.Tag tag18 = startTag12.name("StartTag");
        boolean boolean19 = startTag12.selfClosing;
        startTag12.appendAttributeName("< >");
        org.jsoup.nodes.Attributes attributes22 = startTag12.getAttributes();
        org.jsoup.parser.Token.StartTag startTag23 = new org.jsoup.parser.Token.StartTag("hi!<4>", attributes22);
        org.jsoup.parser.Token.StartTag startTag24 = new org.jsoup.parser.Token.StartTag("</<Doctype>>", attributes22);
        org.jsoup.parser.Token.StartTag startTag25 = new org.jsoup.parser.Token.StartTag();
        startTag25.appendAttributeName('a');
        startTag25.newAttribute();
        boolean boolean29 = startTag25.selfClosing;
        org.jsoup.nodes.Attributes attributes30 = startTag25.getAttributes();
        startTag24.attributes = attributes30;
        org.junit.Assert.assertNotNull(attributes11);
        org.junit.Assert.assertNotNull(tag18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(attributes22);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(attributes30);
    }

    @Test
    public void test3483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3483");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        boolean boolean1 = doctype0.forceQuirks;
        java.lang.StringBuilder stringBuilder2 = doctype0.systemIdentifier;
        boolean boolean3 = doctype0.isCharacter();
        doctype0.forceQuirks = false;
        java.lang.StringBuilder stringBuilder6 = doctype0.publicIdentifier;
        boolean boolean7 = doctype0.isForceQuirks();
        java.lang.StringBuilder stringBuilder8 = doctype0.publicIdentifier;
        org.jsoup.parser.Token.TokenType tokenType9 = doctype0.type;
        boolean boolean10 = doctype0.forceQuirks;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.StartTag startTag11 = doctype0.asStartTag();
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
        org.junit.Assert.assertTrue("'" + tokenType9 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType9.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test3484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3484");
        org.jsoup.parser.Token.StartTag startTag1 = new org.jsoup.parser.Token.StartTag("<EndTag>");
        startTag1.tagName = "</<!---->>";
        startTag1.newAttribute();
        startTag1.finaliseTag();
    }

    @Test
    public void test3485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3485");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        boolean boolean1 = doctype0.forceQuirks;
        java.lang.StringBuilder stringBuilder2 = doctype0.systemIdentifier;
        boolean boolean3 = doctype0.isEndTag();
        boolean boolean4 = doctype0.isForceQuirks();
        java.lang.StringBuilder stringBuilder5 = doctype0.name;
        boolean boolean6 = doctype0.isForceQuirks();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Character character7 = doctype0.asCharacter();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$Doctype cannot be cast to class org.jsoup.parser.Token$Character (org.jsoup.parser.Token$Doctype and org.jsoup.parser.Token$Character are in unnamed module of loader 'app')");
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
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test3486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3486");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("hi!");
        java.lang.String str2 = endTag1.toString();
        java.lang.String str3 = endTag1.toString();
        boolean boolean4 = endTag1.isDoctype();
        java.lang.String str5 = endTag1.tagName;
        org.jsoup.parser.Token.StartTag startTag7 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag9 = startTag7.name("hi!");
        org.jsoup.nodes.Attributes attributes10 = tag9.attributes;
        org.jsoup.parser.Token.StartTag startTag11 = new org.jsoup.parser.Token.StartTag("</hi!>", attributes10);
        endTag1.attributes = attributes10;
        endTag1.appendAttributeValue("StartTag");
        boolean boolean15 = endTag1.selfClosing;
        org.jsoup.parser.Token.Tag tag17 = endTag1.name("<</hi!>>hi!");
        org.jsoup.parser.Token.Tag tag19 = tag17.name("<!---->");
        boolean boolean20 = tag17.isEOF();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "</hi!>" + "'", str2, "</hi!>");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "</hi!>" + "'", str3, "</hi!>");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(tag9);
        org.junit.Assert.assertNotNull(attributes10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(tag17);
        org.junit.Assert.assertNotNull(tag19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test3487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3487");
        org.jsoup.parser.Token.StartTag startTag1 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag3 = startTag1.name("hi!");
        org.jsoup.nodes.Attributes attributes4 = tag3.attributes;
        org.jsoup.parser.Token.StartTag startTag5 = new org.jsoup.parser.Token.StartTag("</hi!>", attributes4);
        java.lang.String str6 = startTag5.toString();
        startTag5.appendAttributeName('#');
        boolean boolean9 = startTag5.isStartTag();
        org.jsoup.nodes.Attributes attributes10 = startTag5.attributes;
        boolean boolean11 = startTag5.isComment();
        org.junit.Assert.assertNotNull(tag3);
        org.junit.Assert.assertNotNull(attributes4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<</hi!>>" + "'", str6, "<</hi!>>");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(attributes10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test3488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3488");
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
        org.jsoup.nodes.Attributes attributes20 = endTag1.attributes;
        java.lang.Class<?> wildcardClass21 = attributes20.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + tokenType7 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType7.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(tag14);
        org.junit.Assert.assertNotNull(attributes15);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(attributes20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test3489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3489");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.tokenType();
        org.jsoup.parser.Token.Doctype doctype2 = doctype0.asDoctype();
        boolean boolean3 = doctype2.isForceQuirks();
        java.lang.StringBuilder stringBuilder4 = doctype2.name;
        doctype2.forceQuirks = false;
        java.lang.StringBuilder stringBuilder7 = doctype2.publicIdentifier;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Doctype" + "'", str1, "Doctype");
        org.junit.Assert.assertNotNull(doctype2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder7);
        org.junit.Assert.assertEquals(stringBuilder7.toString(), "");
    }

    @Test
    public void test3490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3490");
        org.jsoup.parser.Token.StartTag startTag1 = new org.jsoup.parser.Token.StartTag();
        startTag1.appendAttributeName('a');
        startTag1.newAttribute();
        boolean boolean5 = startTag1.isDoctype();
        org.jsoup.parser.Token.StartTag startTag7 = new org.jsoup.parser.Token.StartTag();
        startTag7.appendTagName('4');
        java.lang.String str10 = startTag7.name();
        org.jsoup.nodes.Attributes attributes11 = startTag7.attributes;
        org.jsoup.parser.Token.StartTag startTag12 = new org.jsoup.parser.Token.StartTag("hi!", attributes11);
        startTag1.attributes = attributes11;
        org.jsoup.parser.Token.StartTag startTag15 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag17 = startTag15.name("hi!");
        org.jsoup.nodes.Attributes attributes18 = tag17.attributes;
        org.jsoup.parser.Token.StartTag startTag19 = new org.jsoup.parser.Token.StartTag("", attributes18);
        startTag1.attributes = attributes18;
        org.jsoup.parser.Token.StartTag startTag21 = new org.jsoup.parser.Token.StartTag("<hi!  =\"#\">", attributes18);
        org.jsoup.parser.Token.TokenType tokenType22 = startTag21.type;
        startTag21.appendAttributeValue("hi!");
        boolean boolean25 = startTag21.selfClosing;
        java.lang.Class<?> wildcardClass26 = startTag21.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "4" + "'", str10, "4");
        org.junit.Assert.assertNotNull(attributes11);
        org.junit.Assert.assertNotNull(tag17);
        org.junit.Assert.assertNotNull(attributes18);
        org.junit.Assert.assertTrue("'" + tokenType22 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType22.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test3491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3491");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.tokenType();
        boolean boolean2 = doctype0.isForceQuirks();
        java.lang.String str3 = doctype0.getPublicIdentifier();
        java.lang.String str4 = doctype0.getSystemIdentifier();
        java.lang.String str5 = doctype0.tokenType();
        java.lang.String str6 = doctype0.getSystemIdentifier();
        org.jsoup.parser.Token.TokenType tokenType7 = doctype0.type;
        boolean boolean8 = doctype0.forceQuirks;
        java.lang.StringBuilder stringBuilder9 = doctype0.name;
        boolean boolean10 = doctype0.isForceQuirks();
        boolean boolean11 = doctype0.forceQuirks;
        boolean boolean12 = doctype0.isForceQuirks();
        java.lang.String str13 = doctype0.getPublicIdentifier();
        java.lang.String str14 = doctype0.getName();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Doctype" + "'", str1, "Doctype");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Doctype" + "'", str5, "Doctype");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + tokenType7 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType7.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(stringBuilder9);
        org.junit.Assert.assertEquals(stringBuilder9.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test3492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3492");
        org.jsoup.parser.Token.StartTag startTag1 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag3 = startTag1.name("hi!");
        org.jsoup.nodes.Attributes attributes4 = tag3.attributes;
        org.jsoup.parser.Token.StartTag startTag5 = new org.jsoup.parser.Token.StartTag("", attributes4);
        boolean boolean6 = startTag5.selfClosing;
        startTag5.appendAttributeName('#');
        startTag5.appendAttributeName("</hi!hi!a>");
        org.junit.Assert.assertNotNull(tag3);
        org.junit.Assert.assertNotNull(attributes4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test3493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3493");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        boolean boolean1 = doctype0.forceQuirks;
        java.lang.StringBuilder stringBuilder2 = doctype0.systemIdentifier;
        boolean boolean3 = doctype0.isCharacter();
        doctype0.forceQuirks = false;
        java.lang.StringBuilder stringBuilder6 = doctype0.publicIdentifier;
        boolean boolean7 = doctype0.isForceQuirks();
        java.lang.StringBuilder stringBuilder8 = doctype0.publicIdentifier;
        org.jsoup.parser.Token.TokenType tokenType9 = doctype0.type;
        boolean boolean10 = doctype0.forceQuirks;
        org.jsoup.parser.Token.Doctype doctype11 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str12 = doctype11.tokenType();
        boolean boolean13 = doctype11.isForceQuirks();
        java.lang.String str14 = doctype11.getPublicIdentifier();
        boolean boolean15 = doctype11.isForceQuirks();
        doctype11.forceQuirks = true;
        boolean boolean18 = doctype11.forceQuirks;
        doctype11.forceQuirks = false;
        org.jsoup.parser.Token.TokenType tokenType21 = doctype11.type;
        doctype0.type = tokenType21;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(stringBuilder8);
        org.junit.Assert.assertEquals(stringBuilder8.toString(), "");
        org.junit.Assert.assertTrue("'" + tokenType9 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType9.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Doctype" + "'", str12, "Doctype");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + tokenType21 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType21.equals(org.jsoup.parser.Token.TokenType.Doctype));
    }

    @Test
    public void test3494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3494");
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
        org.jsoup.parser.Token.Comment comment31 = new org.jsoup.parser.Token.Comment();
        java.lang.StringBuilder stringBuilder32 = comment31.data;
        java.lang.String str33 = comment31.getData();
        java.lang.StringBuilder stringBuilder34 = comment31.data;
        java.lang.String str35 = comment31.toString();
        xmlTreeBuilder0.insert(comment31);
        org.jsoup.parser.Token.Character character38 = new org.jsoup.parser.Token.Character("EOF");
        java.lang.String str39 = character38.getData();
        java.lang.String str40 = character38.tokenType();
        boolean boolean41 = character38.isEOF();
        xmlTreeBuilder0.insert(character38);
        org.jsoup.parser.Token.Doctype doctype43 = new org.jsoup.parser.Token.Doctype();
        boolean boolean44 = doctype43.forceQuirks;
        java.lang.StringBuilder stringBuilder45 = doctype43.systemIdentifier;
        boolean boolean46 = doctype43.forceQuirks;
        boolean boolean47 = doctype43.isStartTag();
        boolean boolean48 = doctype43.isForceQuirks();
        java.lang.String str49 = doctype43.getName();
        java.lang.String str50 = doctype43.getPublicIdentifier();
        boolean boolean51 = doctype43.forceQuirks;
        // The following exception was thrown during execution in test generation
        try {
            xmlTreeBuilder0.insert(doctype43);
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
        org.junit.Assert.assertNotNull(stringBuilder32);
        org.junit.Assert.assertEquals(stringBuilder32.toString(), "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertNotNull(stringBuilder34);
        org.junit.Assert.assertEquals(stringBuilder34.toString(), "");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "<!---->" + "'", str35, "<!---->");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "EOF" + "'", str39, "EOF");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "Character" + "'", str40, "Character");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(stringBuilder45);
        org.junit.Assert.assertEquals(stringBuilder45.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
    }

    @Test
    public void test3495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3495");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        xmlTreeBuilder0.initialiseParse("Character", "hi!", parseErrorList3);
        org.jsoup.parser.ParseErrorList parseErrorList7 = null;
        xmlTreeBuilder0.initialiseParse("</hi!>", "Doctype", parseErrorList7);
        org.jsoup.parser.ParseErrorList parseErrorList11 = null;
        xmlTreeBuilder0.initialiseParse("", "<4>", parseErrorList11);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder13 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList16 = null;
        xmlTreeBuilder13.initialiseParse("</hi!>", "EOF", parseErrorList16);
        org.jsoup.parser.Token.StartTag startTag18 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag20 = startTag18.name("hi!");
        boolean boolean21 = xmlTreeBuilder13.process((org.jsoup.parser.Token) startTag18);
        org.jsoup.parser.Token.Comment comment22 = new org.jsoup.parser.Token.Comment();
        java.lang.StringBuilder stringBuilder23 = comment22.data;
        java.lang.String str24 = comment22.toString();
        xmlTreeBuilder13.insert(comment22);
        java.lang.String str26 = comment22.toString();
        java.lang.String str27 = comment22.getData();
        xmlTreeBuilder0.insert(comment22);
        java.lang.String str29 = comment22.getData();
        java.lang.String str30 = comment22.getData();
        boolean boolean31 = comment22.isEOF();
        org.junit.Assert.assertNotNull(tag20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(stringBuilder23);
        org.junit.Assert.assertEquals(stringBuilder23.toString(), "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "<!---->" + "'", str24, "<!---->");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "<!---->" + "'", str26, "<!---->");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test3496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3496");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("hi!");
        boolean boolean2 = endTag1.selfClosing;
        endTag1.finaliseTag();
        endTag1.appendAttributeName('4');
        boolean boolean6 = endTag1.isDoctype();
        java.lang.String str7 = endTag1.tagName;
        endTag1.appendAttributeValue('4');
        org.jsoup.nodes.Attributes attributes10 = endTag1.getAttributes();
        java.lang.String str11 = endTag1.tagName;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(attributes10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test3497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3497");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        xmlTreeBuilder0.initialiseParse("</hi!>", "EOF", parseErrorList3);
        org.jsoup.parser.ParseErrorList parseErrorList7 = null;
        xmlTreeBuilder0.initialiseParse("hi!a", "</hi!>", parseErrorList7);
        org.jsoup.parser.Token.StartTag startTag9 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag11 = startTag9.name("hi!");
        startTag9.finaliseTag();
        org.jsoup.nodes.Element element13 = xmlTreeBuilder0.insert(startTag9);
        org.jsoup.parser.Token.Character character15 = new org.jsoup.parser.Token.Character("EOF");
        java.lang.String str16 = character15.toString();
        java.lang.String str17 = character15.toString();
        java.lang.String str18 = character15.toString();
        xmlTreeBuilder0.insert(character15);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder20 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList23 = null;
        xmlTreeBuilder20.initialiseParse("</hi!>", "EOF", parseErrorList23);
        org.jsoup.parser.Token.StartTag startTag25 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag27 = startTag25.name("hi!");
        boolean boolean28 = xmlTreeBuilder20.process((org.jsoup.parser.Token) startTag25);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder29 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList32 = null;
        xmlTreeBuilder29.initialiseParse("Character", "hi!", parseErrorList32);
        org.jsoup.parser.Token.Comment comment34 = new org.jsoup.parser.Token.Comment();
        java.lang.StringBuilder stringBuilder35 = comment34.data;
        java.lang.String str36 = comment34.getData();
        xmlTreeBuilder29.insert(comment34);
        org.jsoup.parser.Token.StartTag startTag38 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag40 = startTag38.name("hi!");
        startTag38.appendAttributeName(' ');
        boolean boolean43 = startTag38.isComment();
        org.jsoup.nodes.Element element44 = xmlTreeBuilder29.insert(startTag38);
        org.jsoup.parser.Token.StartTag startTag46 = new org.jsoup.parser.Token.StartTag("Doctype");
        java.lang.String str47 = startTag46.name();
        boolean boolean48 = xmlTreeBuilder29.process((org.jsoup.parser.Token) startTag46);
        org.jsoup.parser.Token.Comment comment49 = new org.jsoup.parser.Token.Comment();
        java.lang.StringBuilder stringBuilder50 = comment49.data;
        java.lang.String str51 = comment49.getData();
        java.lang.StringBuilder stringBuilder52 = comment49.data;
        xmlTreeBuilder29.insert(comment49);
        java.lang.String str54 = comment49.getData();
        xmlTreeBuilder20.insert(comment49);
        xmlTreeBuilder0.insert(comment49);
        org.jsoup.parser.Token.StartTag startTag58 = new org.jsoup.parser.Token.StartTag("<hi!4>");
        org.jsoup.nodes.Element element59 = xmlTreeBuilder0.insert(startTag58);
        org.junit.Assert.assertNotNull(tag11);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "EOF" + "'", str16, "EOF");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "EOF" + "'", str17, "EOF");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "EOF" + "'", str18, "EOF");
        org.junit.Assert.assertNotNull(tag27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(stringBuilder35);
        org.junit.Assert.assertEquals(stringBuilder35.toString(), "");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertNotNull(tag40);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(element44);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "Doctype" + "'", str47, "Doctype");
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNotNull(stringBuilder50);
        org.junit.Assert.assertEquals(stringBuilder50.toString(), "");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
        org.junit.Assert.assertNotNull(stringBuilder52);
        org.junit.Assert.assertEquals(stringBuilder52.toString(), "");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "" + "'", str54, "");
        org.junit.Assert.assertNotNull(element59);
    }

    @Test
    public void test3498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3498");
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
        org.jsoup.parser.Token.StartTag startTag26 = new org.jsoup.parser.Token.StartTag("4");
        java.lang.String str27 = startTag26.name();
        boolean boolean28 = xmlTreeBuilder0.process((org.jsoup.parser.Token) startTag26);
        org.jsoup.nodes.Attributes attributes29 = startTag26.getAttributes();
        java.lang.String str30 = startTag26.toString();
        org.jsoup.nodes.Attributes attributes32 = null;
        org.jsoup.parser.Token.StartTag startTag33 = new org.jsoup.parser.Token.StartTag("", attributes32);
        startTag33.selfClosing = false;
        startTag33.newAttribute();
        org.jsoup.nodes.Attributes attributes37 = startTag33.getAttributes();
        startTag33.appendAttributeValue('a');
        startTag33.appendTagName("EOF");
        startTag33.appendTagName('a');
        org.jsoup.parser.Token.Tag tag45 = startTag33.name("</<4>>");
        org.jsoup.nodes.Attributes attributes47 = null;
        org.jsoup.parser.Token.StartTag startTag48 = new org.jsoup.parser.Token.StartTag("", attributes47);
        startTag48.selfClosing = false;
        startTag48.newAttribute();
        org.jsoup.nodes.Attributes attributes52 = startTag48.getAttributes();
        tag45.attributes = attributes52;
        startTag26.attributes = attributes52;
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
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "4" + "'", str27, "4");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(attributes29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "<4>" + "'", str30, "<4>");
        org.junit.Assert.assertNotNull(attributes37);
        org.junit.Assert.assertNotNull(tag45);
        org.junit.Assert.assertNotNull(attributes52);
    }

    @Test
    public void test3499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3499");
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
        org.jsoup.parser.Token.EndTag endTag58 = new org.jsoup.parser.Token.EndTag("hi!");
        java.lang.String str59 = endTag58.toString();
        java.lang.String str60 = endTag58.toString();
        boolean boolean61 = endTag58.isDoctype();
        endTag58.appendAttributeName("EOF");
        boolean boolean64 = endTag58.isStartTag();
        endTag58.tagName = "Character";
        java.lang.String str67 = endTag58.tagName;
        endTag58.appendTagName('4');
        endTag58.newAttribute();
        org.jsoup.nodes.Attributes attributes71 = endTag58.getAttributes();
        org.jsoup.parser.Token.Tag tag73 = endTag58.name("< >");
        boolean boolean74 = xmlTreeBuilder0.process((org.jsoup.parser.Token) tag73);
        tag73.appendTagName('4');
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
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "</hi!>" + "'", str59, "</hi!>");
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "</hi!>" + "'", str60, "</hi!>");
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "Character" + "'", str67, "Character");
        org.junit.Assert.assertNotNull(attributes71);
        org.junit.Assert.assertNotNull(tag73);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
    }

    @Test
    public void test3500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3500");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("hi!");
        java.lang.String str2 = endTag1.toString();
        java.lang.String str3 = endTag1.toString();
        org.jsoup.parser.Token.TokenType tokenType4 = org.jsoup.parser.Token.TokenType.EndTag;
        endTag1.type = tokenType4;
        boolean boolean6 = endTag1.isStartTag();
        org.jsoup.parser.Token.TokenType tokenType7 = endTag1.type;
        boolean boolean8 = endTag1.isEndTag();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "</hi!>" + "'", str2, "</hi!>");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "</hi!>" + "'", str3, "</hi!>");
        org.junit.Assert.assertTrue("'" + tokenType4 + "' != '" + org.jsoup.parser.Token.TokenType.EndTag + "'", tokenType4.equals(org.jsoup.parser.Token.TokenType.EndTag));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + tokenType7 + "' != '" + org.jsoup.parser.Token.TokenType.EndTag + "'", tokenType7.equals(org.jsoup.parser.Token.TokenType.EndTag));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }
}

